package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) Train.
 */
public class Train extends Entity {

	private hu.bme.mit.inf.gomrp.railway.RDM.Train train;
	private RouteElement lastRouteElement;

	public Train(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.Train train) {
		super(owner, name, showInTrace);
		this.train = train;
	}

	public int getLength() {
		return train.getLength();
	}

	public Speed getHeadingSpeed() {
		return train.getHeadingSpeed();
	}

	public Speed getMaxSpeed() {
		return train.getMaxSpeed();
	}

	public hu.bme.mit.inf.gomrp.railway.RDM.Station getArrivalStation() {
		return train.getArrivesTo();
	}

	public hu.bme.mit.inf.gomrp.railway.RDM.Station getDepartureStation() {
		return train.getDeparturesFrom();
	}

	public EList<TrackElement> getStandsOn() {
		return train.getStandsOn();
	}

	public boolean isStandingOn(TrackElement trackElement) {
		return getStandsOn().contains(trackElement);
	}

	public RouteElement getLastRouteElement() {
		return lastRouteElement;
	}

	public void setLastRouteElement(RouteElement lastRouteElement) {
		this.lastRouteElement = lastRouteElement;
	}

	public void setHeadingSpeed(Speed speed) {
		if (speed.getValue() > train.getMaxSpeed().getValue()) {
			train.setHeadingSpeed(train.getMaxSpeed());
		} else {
			train.setHeadingSpeed(speed);
		}
	}

	public final void addToTraceEntry() {
		TraceBuilderHelper.addRDMElementToLastEntry(train);
	}
}
