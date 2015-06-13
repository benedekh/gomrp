package hu.bme.mit.inf.gomrp.simulation.auto.core;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.Signal;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.Station;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.auto.events.TrainFrontLeftTrackElement;
import hu.bme.mit.inf.gomrp.simulation.auto.events.WaitingAtStationEnded;
import hu.bme.mit.inf.gomrp.simulation.auto.events.WaitingEnded;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.TimeSpan;

public abstract class AdvanceTrackElementHelper{
	
	public static final String ENTER_FRONT_TRACK_ELEMENT = "Train front enters TrackElement";
	public static final String ENTER_REAR_TRACK_ELEMENT = "Train rear enters TrackElement";
	public static final String LEAVE_FRONT_TRACK_ELEMENT = "Train front to leave TrackElement";
	public static final String LEAVE_REAR_TRACK_ELEMENT = "Train rear to leave TrackElement";
	public static final String TRAIN_WAITING = "Train waiting ended";
	public static final String WAIT_AT_STATION = "Train is waiting at Station";
	
	private static RailwaySimulationModel model;
	
	public static void setModel(RailwaySimulationModel _model) {
		model = _model;
	}
	
	public static hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint findNextCP(Train train,
			EList<hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint> connectionPoints) {
		RouteElement nextRouteElement = train.getLastRouteElement()
				.getNextElement();
		if (nextRouteElement != null) {
			for (ConnectionPoint cp : connectionPoints) {
				if (cp.getNextElement() == nextRouteElement
						.getReferredElement()) {
					return cp;
				}
			}
		}
		return RDMFactory.eINSTANCE.createConnectionPoint();
	}

	public static void advanceTrackElement(Train train, TrackElement trackElement, boolean alreadyStopped) {
		ConnectionPoint cp = findNextCP(train, trackElement.getConnectsTo());
		if (cp.getHolds() == null) {
			train.setHeadingSpeed(Speed.ZERO);
			return;
		}

		if ((trackElement.refersToTheSame(train.getArrivesTo()) || trackElement
				.refersToTheSame(train.getDeparturesFrom()))
				&& !alreadyStopped) {
			Signal signal = getSignalFromCP(cp);
			signal.setAllowedSpeed(Speed.ZERO);
			train.setHeadingSpeed(signal.getAllowedSpeed());
			scheduleWaitingStationEnded(train, trackElement);
			return;
		}

		Signal signal = getSignalFromCP(cp);
		if (signal.isHeadingAllowed(train)) {
			train.setHeadingSpeed(signal.getAllowedSpeed());
			scheduleLeave(train, trackElement);
		} else {
			train.setHeadingSpeed(signal.getAllowedSpeed());
			scheduleWaitingEnded(train, trackElement);
		}
		train.setHeadingSpeed(signal.getAllowedSpeed());
	}

	public static Signal getSignalFromCP(hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint cp) {
		Signal signal = model.getSignal(cp);
		if (signal == null) {
			signal = model.getTurnoutSignal(cp);
		}
		return signal;
	}

	public static long getRequiredTime(int length, double trainSpeed) {
	return Math.max(Math.round((length / trainSpeed)), 1);
	}

	public static void scheduleWaitingEnded(Train train,
			TrackElement trackElement) {
		new WaitingEnded(model, TRAIN_WAITING, true).schedule(train,
				trackElement, new TimeSpan(model.drawTrainWaitingTime()));
	}

	private static void scheduleLeave(Train train, TrackElement trackElement) {
		new TrainFrontLeftTrackElement(model, LEAVE_FRONT_TRACK_ELEMENT, true)
				.schedule(
						train,
						trackElement,
						new TimeSpan(getRequiredTime(trackElement.getLength(),
								train.getHeadingSpeed().getValue())));
	}

	private static void scheduleWaitingStationEnded(Train train,
			TrackElement trackElement) {
		new WaitingAtStationEnded(model, WAIT_AT_STATION, true).schedule(train,
				(Station) trackElement,
				new TimeSpan(model.drawStationWaitingTime()));
	}
}
