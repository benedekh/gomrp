package hu.bme.mit.inf.gomrp.simulation.auto.events;

import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import desmoj.core.simulator.TimeSpan;

import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

public class TurnoutDirectionChanged extends ExternalEvent {
	RailwaySimulationModel model;

	public TurnoutDirectionChanged(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel)owner;
	}
	
	@Override
	public void eventRoutine() {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
		
		Queue<hu.bme.mit.inf.gomrp.simulation.auto.entities.Turnout> turnouts = model.getTurnouts();
		for (hu.bme.mit.inf.gomrp.simulation.auto.entities.Turnout self : turnouts) {
 			switch (self.getActiveStateName()) {
				case "STRAIGHT":self.changeTurnoutDirection();
				break;
				case "DIVERGENT":self.changeTurnoutDirection();
				break;
			}
		}
		new TurnoutDirectionChanged(model, "Turnout Directions Changed", true)
				.schedule(new TimeSpan(model.drawTurnoutSwitchingRate()));
	}
}
