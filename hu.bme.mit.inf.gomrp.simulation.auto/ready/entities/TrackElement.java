package hu.bme.mit.inf.gomrp.simulation.auto.entities;

import org.eclipse.emf.common.util.EList;
import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;

public abstract class TrackElement extends Entity {
	private hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement;

	public TrackElement(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
		super(owner, name, showInTrace);
		this.trackElement = trackElement;
	}

	public final boolean isOccupied() {
		return getOccupiedBy() != null;
	}

	public final boolean refersToTheSame(
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
		return this.trackElement == trackElement;
	}

	public final hu.bme.mit.inf.gomrp.railway.RDM.Train getOccupiedBy() {
		return trackElement.getOccupiedBy();
	}

	public final int getLength() {
		return trackElement.getLength();
	}

	public final EList<hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint> getConnectsTo() {
		return trackElement.getConnectsTo();
	}

	public final void setOccupiedBy(hu.bme.mit.inf.gomrp.railway.RDM.Train train) {
		trackElement.setOccupiedBy(train);
	}
	
	public final void addToTraceEntry() {
		TraceBuilderHelper.addRDMElementToLastEntry(trackElement);
	}
}
