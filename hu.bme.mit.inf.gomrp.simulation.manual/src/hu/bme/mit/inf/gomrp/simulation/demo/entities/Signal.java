package hu.bme.mit.inf.gomrp.simulation.demo.entities;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

/**
 * DESMO-J Entity for (RailwayDomainModel) Signal.
 */
public class Signal extends Entity {

	protected RailwaySimulationModel model;
	private hu.bme.mit.inf.gomrp.railway.RDM.Signal signal;

	public Signal(Model owner, String name, boolean showInTrace,
			hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
		super(owner, name, showInTrace);
		model = (RailwaySimulationModel) owner;
		this.signal = signal;
	}

	public final TrackElement getObserves() {
		return signal.getObserves();
	}

	public final Speed getAllowedSpeed() {
		return signal.getAllowedSpeed();
	}

	public final ConnectionPoint getStandsOn() {
		return signal.getStandsOn();
	}

	public final void setAllowedSpeed(Speed speed) {
		signal.setAllowedSpeed(speed);
	}

	public final boolean refersToTheSame(
			hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
		return this.signal == signal;
	}

	public boolean isHeadingAllowed(Train train) {
		TrackElement trackElement = signal.getObserves();
		return isHeadingAllowed(trackElement != null,
				trackElementFreeOrOccupiedByTrain(trackElement, train), signal);
	}
	
	public final void addToTraceEntry() {
		TraceBuilderHelper.addRDMElementToLastEntry(signal);
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
				switch (model.drawAllowedSpeed()) {
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
