package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class TurnoutSignal extends Signal {
	private hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal _turnoutSignal;
	
	public TurnoutSignal(Model owner, String name, boolean showInTrace, hu.bme.mit.inf.gomrp.railway.RDM.Signal obj) {
		super(owner, name, showInTrace, obj);
		this._turnoutSignal = (hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal)obj;
	}

	public java.lang.String getName() {
		return _turnoutSignal.getName();
	}
	public void setName(java.lang.String value) {
		_turnoutSignal.setName(value);
	}
	public int getLength() {
		return _turnoutSignal.getLength();
	}
	public void setLength(int value) {
		_turnoutSignal.setLength(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Speed getAllowedSpeed() {
		return _turnoutSignal.getAllowedSpeed();
	}
	public void setAllowedSpeed(hu.bme.mit.inf.gomrp.railway.RDM.Speed value) {
		_turnoutSignal.setAllowedSpeed(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint getStandsOn() {
		return _turnoutSignal.getStandsOn();
	}
	
	public hu.bme.mit.inf.gomrp.railway.RDM.TrackElement getObserves() {
		return _turnoutSignal.getObserves();
	}
	
	public hu.bme.mit.inf.gomrp.railway.RDM.Turnout getTurnout() {
		return _turnoutSignal.getTurnout();
	}
	
	public void setTurnout(hu.bme.mit.inf.gomrp.railway.RDM.Turnout value) {
		_turnoutSignal.setTurnout(value);
	}
	
	public boolean isHeadingAllowed(Train train) {

		hu.bme.mit.inf.gomrp.railway.RDM.Turnout turnout = _turnoutSignal
				.getTurnout();

		return isHeadingAllowed(
				turnout != null,
				trackElementFreeOrOccupiedByTrain(turnout, train)
						&& (turnout.getCurrentDirection() == train
								.getLastRouteElement().getNextElement()
								.getDesiredDirection().getDesiredDirection()),
				_turnoutSignal);
	}

}
