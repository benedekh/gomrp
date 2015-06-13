package hu.bme.mit.inf.gomrp.simulation.auto.events;

import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
import hu.bme.mit.inf.gomrp.simulation.auto.core.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class WaitingAtStationEnded extends
	EventOf2Entities<Train, Station> {

	private RailwaySimulationModel model;

	public WaitingAtStationEnded(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel)owner;
	}

	@Override
	public void eventRoutine(Train entry1, Station entry2) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
		entry1.addToTraceEntry();
		entry2.addToTraceEntry();	
		
		AdvanceTrackElementHelper.advanceTrackElement(entry1, entry2, true);	
	}
}
