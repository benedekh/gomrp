package hu.bme.mit.inf.gomrp.simulation.auto.events;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
import hu.bme.mit.inf.gomrp.simulation.auto.core.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TrainFrontLeftTrackElement extends
	EventOf2Entities<Train, TrackElement> {

	private RailwaySimulationModel model;

	public TrainFrontLeftTrackElement(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel)owner;
	}

	@Override
	public void eventRoutine(Train entry1, TrackElement entry2) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
		entry1.addToTraceEntry();
		entry2.addToTraceEntry();	
		
		ConnectionPoint cp = AdvanceTrackElementHelper.findNextCP(entry1,
				entry2.getConnectsTo());
		if (cp.getHolds() == null) {
			entry1.setHeadingSpeed(Speed.ZERO);
			return;
		}

		Signal signal = AdvanceTrackElementHelper.getSignalFromCP(cp);
		if (signal.isHeadingAllowed(entry1)) {
			scheduleEnterEvent(entry1);
		} else {
			AdvanceTrackElementHelper.scheduleWaitingEnded(entry1, entry2);
		}
		entry1.setHeadingSpeed(signal.getAllowedSpeed());
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
