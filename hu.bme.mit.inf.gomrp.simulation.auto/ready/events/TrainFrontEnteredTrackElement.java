package hu.bme.mit.inf.gomrp.simulation.auto.events;

import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;

import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TrainFrontEnteredTrackElement extends
	EventOf2Entities<Train, TrackElement> {

	private RailwaySimulationModel model;

	public TrainFrontEnteredTrackElement(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel)owner;
	}

	@Override
	public void eventRoutine(Train entry1, TrackElement entry2) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
		entry1.addToTraceEntry();
		entry2.addToTraceEntry();	
		
		//TODO: Auto-generated method.		
	}
}
