package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.simulation.demo.entities.Station;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;

/**
 * DESMO-J event for a Train's waiting at the Station has ended.
 */
public class WaitingAtStationEnded extends EventOf2Entities<Train, Station> {

	public WaitingAtStationEnded(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
	}

	@Override
	public void eventRoutine(Train train, Station station) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());
		train.addToTraceEntry();
		station.addToTraceEntry();

		AdvanceTrackElementHelper.advanceTrackElement(train, station, true);
	}

}
