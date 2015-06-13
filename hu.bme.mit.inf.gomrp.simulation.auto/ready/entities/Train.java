package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class Train extends Entity {
	private hu.bme.mit.inf.gomrp.railway.RDM.Train _train;
	
	public Train(Model owner, String name, boolean showInTrace, hu.bme.mit.inf.gomrp.railway.RDM.Train obj) {
		super(owner, name, showInTrace);
		this._train = obj;
	}

	public java.lang.String getName() {
		return _train.getName();
	}
	public void setName(java.lang.String value) {
		_train.setName(value);
	}
	public int getLength() {
		return _train.getLength();
	}
	public void setLength(int value) {
		_train.setLength(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Speed getHeadingSpeed() {
		return _train.getHeadingSpeed();
	}
	public void setHeadingSpeed(hu.bme.mit.inf.gomrp.railway.RDM.Speed value) {
		if (value.getValue() > _train.getMaxSpeed().getValue()) {
			_train.setHeadingSpeed(_train.getMaxSpeed());
		} else {
			_train.setHeadingSpeed(value);
		}
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Speed getMaxSpeed() {
		return _train.getMaxSpeed();
	}
	public void setMaxSpeed(hu.bme.mit.inf.gomrp.railway.RDM.Speed value) {
		_train.setMaxSpeed(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Station getArrivesTo() {
		return _train.getArrivesTo();
	}
	
	public void setArrivesTo(hu.bme.mit.inf.gomrp.railway.RDM.Station value) {
		_train.setArrivesTo(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Station getDeparturesFrom() {
		return _train.getDeparturesFrom();
	}
	
	public void setDeparturesFrom(hu.bme.mit.inf.gomrp.railway.RDM.Station value) {
		_train.setDeparturesFrom(value);
	}
	public hu.bme.mit.inf.gomrp.railway.RDM.Route getFollows() {
		return _train.getFollows();
	}
	
	public EList<hu.bme.mit.inf.gomrp.railway.RDM.TrackElement> getStandsOn() {
		return _train.getStandsOn();
	}
	
    	public boolean isStandingOn(hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
    		return getStandsOn().contains(trackElement);
    	}
    	
    	private hu.bme.mit.inf.gomrp.railway.RDM.RouteElement lastRouteElement;
    	
    	public hu.bme.mit.inf.gomrp.railway.RDM.RouteElement getLastRouteElement() {
    		return lastRouteElement;
    	}
    	
    	public void setLastRouteElement(hu.bme.mit.inf.gomrp.railway.RDM.RouteElement lastRouteElement) {
    		this.lastRouteElement = lastRouteElement;
    	}
    	

	public final void addToTraceEntry() {
		TraceBuilderHelper.addRDMElementToLastEntry(_train);
	}
}
