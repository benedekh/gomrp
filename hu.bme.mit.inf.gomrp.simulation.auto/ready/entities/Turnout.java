package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import desmoj.core.simulator.Model;

public class Turnout extends TrackElement {
	private hu.bme.mit.inf.gomrp.railway.RDM.Turnout _turnout;

	public Turnout(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement obj) {
		super(owner, name, showInTrace, obj);
		this._turnout = (hu.bme.mit.inf.gomrp.railway.RDM.Turnout) obj;
	}

	public java.lang.String getName() {
		return _turnout.getName();
	}

	public void setName(java.lang.String value) {
		_turnout.setName(value);
	}

	public void setLength(int value) {
		_turnout.setLength(value);
	}

	public hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection getCurrentDirection() {
		return _turnout.getCurrentDirection();
	}

	public void setCurrentDirection(
			hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection value) {
		_turnout.setCurrentDirection(value);
	}

	public hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection getSwitchingDirection() {
		return _turnout.getSwitchingDirection();
	}

	public void setSwitchingDirection(
			hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection value) {
		_turnout.setSwitchingDirection(value);
	}

	public String getActiveStateName() {
		return (getSwitchingDirection() == getCurrentDirection()) ? "DIVERGENT"
				: "STRAIGHT";
	}

	public void changeTurnoutDirection() {
		if (getSwitchingDirection() == getCurrentDirection()) {
			setCurrentDirection(hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection.STRAIGHT);
		} else {
			setCurrentDirection(getSwitchingDirection());
		}
	}
}
