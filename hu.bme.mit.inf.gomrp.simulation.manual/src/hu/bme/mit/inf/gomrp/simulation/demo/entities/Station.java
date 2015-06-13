package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import org.eclipse.emf.common.util.EList;

import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) Station.
 */
public class Station extends TrackElement {

	private hu.bme.mit.inf.gomrp.railway.RDM.Station station;

	public Station(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.Station station) {
		super(owner, name, showInTrace, station);
		this.station = station;
	}

	public EList<hu.bme.mit.inf.gomrp.railway.RDM.Signal> getControls() {
		return station.getControls();
	}

}
