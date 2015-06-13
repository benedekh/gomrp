package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import java.util.ArrayList;
import java.util.List;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

/**
 * DESMO-J event for a Train's rear leaving a TrackElement.
 */
public class TrainRearLeftTrackElement extends
		EventOf2Entities<Train, TrackElement> {

	private RailwaySimulationModel model;

	public TrainRearLeftTrackElement(Model owner, String name,
			boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (RailwaySimulationModel) owner;
	}

	@Override
	public void eventRoutine(Train train, TrackElement trackElement) {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());
		train.addToTraceEntry();
		trackElement.addToTraceEntry();

		List<hu.bme.mit.inf.gomrp.railway.RDM.TrackElement> retain = new ArrayList<hu.bme.mit.inf.gomrp.railway.RDM.TrackElement>();
		retain.add(train.getLastRouteElement().getReferredElement());
		train.getStandsOn().retainAll(retain);

		TrackElement ntrackElement = model.getTrackElement(train
				.getLastRouteElement().getReferredElement());

		new TrainRearEnteredTrackElement(model,
				AdvanceTrackElementHelper.ENTER_REAR_TRACK_ELEMENT, true)
				.schedule(train, ntrackElement, new TimeSpan(0));
	}

}
