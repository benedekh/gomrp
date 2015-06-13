package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.simulation.demo.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;

/**
 * DESMO-J event for a Train's waiting has ended.
 */
public class WaitingEnded extends EventOf2Entities<Train, TrackElement> {

	public WaitingEnded(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
	}

	@Override
	public void eventRoutine(Train train, TrackElement trackElement) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());
		train.addToTraceEntry();
		trackElement.addToTraceEntry();

		AdvanceTrackElementHelper.advanceTrackElement(train, trackElement,
				false);
	}

}
