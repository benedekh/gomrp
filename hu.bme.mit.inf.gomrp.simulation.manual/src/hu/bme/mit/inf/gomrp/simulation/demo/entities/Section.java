package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) Section.
 */
public class Section extends TrackElement {

	public Section(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
		super(owner, name, showInTrace, trackElement);
	}

}
