package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import desmoj.core.simulator.Model;

public class Section extends TrackElement{
	private hu.bme.mit.inf.gomrp.railway.RDM.Section _section;
	
	public Section(Model owner, String name, boolean showInTrace, hu.bme.mit.inf.gomrp.railway.RDM.TrackElement obj) {
		super(owner, name, showInTrace, obj);
		this._section = (hu.bme.mit.inf.gomrp.railway.RDM.Section)obj;
	}

	public java.lang.String getName() {
		return _section.getName();
	}
	public void setName(java.lang.String value) {
		_section.setName(value);
	}

	public void setLength(int value) {
		_section.setLength(value);
	}
}
