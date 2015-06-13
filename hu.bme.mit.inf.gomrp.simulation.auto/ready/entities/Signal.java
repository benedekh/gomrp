package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class Signal extends Entity {
	private hu.bme.mit.inf.gomrp.railway.RDM.Signal _signal;
	protected RailwaySimulationModel model;
	
	public Signal(Model owner, String name, boolean showInTrace, hu.bme.mit.inf.gomrp.railway.RDM.Signal obj) {
		super(owner, name, showInTrace);
		this._signal = obj;
		model = (RailwaySimulationModel) owner;
	}

	public java.lang.String getName() {
		return _signal.getName();
	}
	public void setName(java.lang.String value) {
		_signal.setName(value);
	}
	public int getLength() {
		return _signal.getLength();
	}
	public void setLength(int value) {
		_signal.setLength(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Speed getAllowedSpeed() {
		return _signal.getAllowedSpeed();
	}
	public void setAllowedSpeed(hu.bme.mit.inf.gomrp.railway.RDM.Speed value) {
		_signal.setAllowedSpeed(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint getStandsOn() {
		return _signal.getStandsOn();
	}
	
	public hu.bme.mit.inf.gomrp.railway.RDM.TrackElement getObserves() {
		return _signal.getObserves();
	}
	

	public final void addToTraceEntry() {
		TraceBuilderHelper.addRDMElementToLastEntry(_signal);
	}
	public final boolean refersToTheSame(
			hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
		return this._signal == signal;
	}

	public boolean isHeadingAllowed(Train train) {
		TrackElement trackElement = _signal.getObserves();
		return isHeadingAllowed(trackElement != null,
				trackElementFreeOrOccupiedByTrain(trackElement, train), _signal);
	}
	
	protected final boolean trackElementFreeOrOccupiedByTrain(
			TrackElement trackElement, Train train) {
		return trackElement.getOccupiedBy() == null
				|| train.isStandingOn(trackElement);
	}

	protected final boolean isHeadingAllowed(boolean firstCondition,
			boolean secondCondition,
			hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
		if (firstCondition) {
			if (secondCondition) {
				Speed nextSpeed;
				switch (model.drawSignalAllowedSpeed()) {
				case 1:
					nextSpeed = Speed.TWENTY;
					break;
				case 2:
					nextSpeed = Speed.FOURTY;
					break;
				case 3:
					nextSpeed = Speed.SIXTY;
					break;
				default:
					nextSpeed = Speed.ZERO;
				}
				signal.setAllowedSpeed(nextSpeed);
				return true;
			}
		}
		signal.setAllowedSpeed(Speed.ZERO);
		return false;
	}
}
