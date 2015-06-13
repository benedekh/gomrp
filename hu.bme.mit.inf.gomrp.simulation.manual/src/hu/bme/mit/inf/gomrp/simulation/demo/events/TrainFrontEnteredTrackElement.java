package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.simulation.demo.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;

/**
 * DESMO-J event for a Train's front entering a TrackElement.
 */
public class TrainFrontEnteredTrackElement extends
		EventOf2Entities<Train, TrackElement> {

	public TrainFrontEnteredTrackElement(Model owner, String name,
			boolean showInTrace) {
		super(owner, name, showInTrace);
	}

	@Override
	public void eventRoutine(Train train, TrackElement trackElement) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());
		train.addToTraceEntry();
		trackElement.addToTraceEntry();
	}

}
