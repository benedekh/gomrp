package hu.bme.mit.inf.gomrp.simulation.auto.events;

import java.util.ArrayList;
import java.util.List;

import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
import hu.bme.mit.inf.gomrp.simulation.auto.core.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class TrainRearLeftTrackElement extends
	EventOf2Entities<Train, TrackElement> {

	private RailwaySimulationModel model;

	public TrainRearLeftTrackElement(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel)owner;
	}

	@Override
	public void eventRoutine(Train entry1, TrackElement entry2) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
		entry1.addToTraceEntry();
		entry2.addToTraceEntry();	
		
		List<hu.bme.mit.inf.gomrp.railway.RDM.TrackElement> retain = new ArrayList<hu.bme.mit.inf.gomrp.railway.RDM.TrackElement>();
		retain.add(entry1.getLastRouteElement().getReferredElement());
		entry1.getStandsOn().retainAll(retain);

		TrackElement ntrackElement = model.getTrackElement(entry1
				.getLastRouteElement().getReferredElement());

		new TrainRearEnteredTrackElement(model,
				AdvanceTrackElementHelper.ENTER_REAR_TRACK_ELEMENT, true)
				.schedule(entry1, ntrackElement, new TimeSpan(0));	
	}
}
