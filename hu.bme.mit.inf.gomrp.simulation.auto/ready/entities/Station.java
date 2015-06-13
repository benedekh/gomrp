package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Model;

public class Station extends TrackElement{
	private hu.bme.mit.inf.gomrp.railway.RDM.Station _station;
	
	public Station(Model owner, String name, boolean showInTrace, hu.bme.mit.inf.gomrp.railway.RDM.TrackElement obj) {
		super(owner, name, showInTrace, obj);
		this._station = (hu.bme.mit.inf.gomrp.railway.RDM.Station)obj;
	}

	public java.lang.String getName() {
		return _station.getName();
	}
	public void setName(java.lang.String value) {
		_station.setName(value);
	}

	public void setLength(int value) {
		_station.setLength(value);
	}

	public EList<hu.bme.mit.inf.gomrp.railway.RDM.Signal> getControls() {
		return _station.getControls();
	}
	
}
