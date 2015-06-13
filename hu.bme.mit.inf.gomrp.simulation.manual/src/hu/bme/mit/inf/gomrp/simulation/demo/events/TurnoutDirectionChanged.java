package hu.bme.mit.inf.gomrp.simulation.demo.events;

import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;
import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Turnout;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import desmoj.core.simulator.TimeSpan;

/**
 * DESMO-J event for changing the Turnout's direction.
 */
public class TurnoutDirectionChanged extends ExternalEvent {

	RailwaySimulationModel model;

	public TurnoutDirectionChanged(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.model = (RailwaySimulationModel) owner;
	}

	@Override
	public void eventRoutine() {
		TraceBuilderHelper.createNewTraceEntry(getName(), presentTime()
				.getTimeRounded());

		Queue<Turnout> turnouts = model.getTurnouts();
		if (turnouts != null) {
			for (int i = 0; i < turnouts.size(); ++i) {
				Turnout heap = model.getTurnouts().removeFirst();
				if (!heap.isOccupied()) {

					heap.addToTraceEntry();

					if (model.drawTurnoutDirection() % 2 == 0) {
						switchToDivergent(heap);
					} else {
						switchToStraight(heap);
					}
				}
				turnouts.insert(heap);
			}
		}
		new TurnoutDirectionChanged(model, "Turnout Directions Changed", true)
				.schedule(new TimeSpan(model.drawTurnoutSwitchingRate()));
	}

	private void switchToDivergent(Turnout turnout) {
		turnout.setCurrentDirection(turnout.getSwitchingDirection());
	}

	private void switchToStraight(Turnout turnout) {
		turnout.setCurrentDirection(TurnoutDirection.STRAIGHT);
	}
}
