package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) TurnoutSignal.
 */
public class TurnoutSignal extends Signal {

	private hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal turnoutSignal;

	public TurnoutSignal(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal signal) {
		super(owner, name, showInTrace, signal);
		this.turnoutSignal = signal;
	}

	public boolean isHeadingAllowed(Train train) {

		hu.bme.mit.inf.gomrp.railway.RDM.Turnout turnout = turnoutSignal
				.getTurnout();

		return isHeadingAllowed(
				turnout != null,
				trackElementFreeOrOccupiedByTrain(turnout, train)
						&& (turnout.getCurrentDirection() == train
								.getLastRouteElement().getNextElement()
								.getDesiredDirection().getDesiredDirection()),
				turnoutSignal);
	}

	public hu.bme.mit.inf.gomrp.railway.RDM.Turnout getTurnout() {
		return turnoutSignal.getTurnout();
	}

}
