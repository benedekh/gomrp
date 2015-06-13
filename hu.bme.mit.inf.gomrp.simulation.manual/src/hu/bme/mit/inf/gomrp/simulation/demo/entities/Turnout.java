package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;
import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) Turnout.
 */
public class Turnout extends TrackElement {

	private hu.bme.mit.inf.gomrp.railway.RDM.Turnout turnout;

	public Turnout(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.Turnout turnout) {
		super(owner, name, showInTrace, turnout);
		this.turnout = turnout;
	}

	public TurnoutDirection getCurrentDirection() {
		return turnout.getCurrentDirection();
	}

	public TurnoutDirection getSwitchingDirection() {
		return turnout.getSwitchingDirection();
	}

	public void setCurrentDirection(TurnoutDirection direction) {
		turnout.setCurrentDirection(direction);
	}

	public void setSwitchingDirection(TurnoutDirection direction) {
		turnout.setSwitchingDirection(direction);
	}

}
