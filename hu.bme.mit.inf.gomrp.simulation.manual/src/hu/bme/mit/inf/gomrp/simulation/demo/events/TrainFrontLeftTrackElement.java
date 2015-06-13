package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Signal;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

/**
 * DESMO-J event for a Train's front leaving a TrackElement.
 */
public class TrainFrontLeftTrackElement extends
		EventOf2Entities<Train, TrackElement> {

	private RailwaySimulationModel model;

	public TrainFrontLeftTrackElement(Model owner, String name,
			boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel) owner;
	}

	@Override
	public void eventRoutine(Train train, TrackElement trackElement) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());
		train.addToTraceEntry();
		trackElement.addToTraceEntry();

		ConnectionPoint cp = AdvanceTrackElementHelper.findNextCP(train,
				trackElement.getConnectsTo());
		if (cp.getHolds() == null) {
			train.setHeadingSpeed(Speed.ZERO);
			return;
		}

		Signal signal = AdvanceTrackElementHelper.getSignalFromCP(cp);
		if (signal.isHeadingAllowed(train)) {
			scheduleEnterEvent(train);
		} else {
			AdvanceTrackElementHelper.scheduleWaitingEnded(train, trackElement);
		}
		train.setHeadingSpeed(signal.getAllowedSpeed());
	}

	private void scheduleEnterEvent(Train train) {
		if (train.getLastRouteElement().getNextElement() == null) {
			train.setHeadingSpeed(Speed.ZERO);
		} else {
			train.setLastRouteElement(train.getLastRouteElement()
					.getNextElement());

			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement newTrackElement = train
					.getLastRouteElement().getReferredElement();
			train.getStandsOn().add(newTrackElement);
			TrackElement trackElement = model.getTrackElement(newTrackElement);

			new TrainFrontEnteredTrackElement(model,
					AdvanceTrackElementHelper.ENTER_FRONT_TRACK_ELEMENT, true)
					.schedule(train, trackElement, new TimeSpan(0));

			new TrainRearLeftTrackElement(model,
					AdvanceTrackElementHelper.LEAVE_REAR_TRACK_ELEMENT, true)
					.schedule(
							train,
							trackElement,
							new TimeSpan(AdvanceTrackElementHelper
									.getRequiredTime(train.getLength(), train
											.getHeadingSpeed().getValue())));
		}
	}
}
