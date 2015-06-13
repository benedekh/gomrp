package hu.bme.mit.inf.gomrp.simulation.auto.core;

import desmoj.core.simulator.*;
import desmoj.core.dist.*;
import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
import hu.bme.mit.inf.gomrp.simulation.auto.events.TrainFrontEnteredTrackElement;
import hu.bme.mit.inf.gomrp.simulation.auto.events.TrainRearEnteredTrackElement;
import hu.bme.mit.inf.gomrp.simulation.auto.events.TurnoutDirectionChanged;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.incquery.*;

/**
  * Generated file by Xtend code generator
  * Last modified: 2015.05.26
  */
public class RailwaySimulationModel extends Model {
	public Queue<Train> trains;
	public Queue<Station> stations;
	public Queue<Turnout> turnouts;
	public Queue<Signal> signals;
	public Queue<TurnoutSignal> turnoutsignals;
	public Queue<Section> sections;
	
	private ContDistUniform signalAllowedSpeed;
	private DiscreteDistPoisson stationWaitingTime;
	private ContDistUniform turnoutSwitchDirection;
	private ContDistNormal turnoutSwitchingRate;
	private ContDistNormal trainWaitingTime;
	
	public RailwaySimulationModel(Model owner, String name, boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
	}
	
	@Override
	public String description() {
		return "RailwaySimulationModelGENERATED";
	}
	
	 
	@Override
	public void doInitialSchedules() {
		for (int i = 0; i < trains.size(); ++i) {
			Train train = trains.removeFirst();
			new TrainFrontEnteredTrackElement(this,
					AdvanceTrackElementHelper.ENTER_FRONT_TRACK_ELEMENT, true)
					.schedule(train, getTrackElement(train
							.getLastRouteElement().getReferredElement()),
							new TimeSpan(i + 1));
			new TrainRearEnteredTrackElement(this,
					AdvanceTrackElementHelper.ENTER_REAR_TRACK_ELEMENT, true)
					.schedule(train, getTrackElement(train
							.getLastRouteElement().getReferredElement()),
							new TimeSpan(i + 1));
			trains.insert(train);
		}

		new TurnoutDirectionChanged(this, "Turnout Directions Changed", true)
				.schedule(new TimeSpan(turnoutSwitchingRate.sample().intValue()));
	
	}
	 
	@Override
	public void init() {
		signalAllowedSpeed = new ContDistUniform(this, "SIGNALALLOWEDSPEED", 1.0,
		4.0,
		true, false);
		stationWaitingTime = new DiscreteDistPoisson(this, "STATIONWAITINGTIME", 3.0,
		true, false);
		turnoutSwitchDirection = new ContDistUniform(this, "TURNOUTSWITCHDIRECTION", 1.0,
		3.0,
		true, false);
		turnoutSwitchingRate = new ContDistNormal(this, "TURNOUTSWITCHINGRATE", 10,
		5,
		true, false);
		trainWaitingTime = new ContDistNormal(this, "TRAINWAITINGTIME", 5,
		1,
		true, false);
		
		initializeTrains();
		initializeStations();
		initializeTurnouts();
		initializeSignals();
		initializeTurnoutSignals();
		initializeSections();
		
		AdvanceTrackElementHelper.setModel(this);
	}
	 
	private void initializeTrains() {
		trains = new Queue<Train>(this, "Trains Queue", true, false);
		for (TrainMatch match : RSMFactory.getTrains()) {
			Train train = new Train(this, match.getTrain().getName(), false,
					match.getTrain());
			trains.insert(train);
			train.setLastRouteElement(match.getTrain().getFollows()
					.getFirstElement());
		}
	}
	
	private void initializeStations() {
		stations = new Queue<Station>(this, "Stations Queue", true, false);
		for (StationMatch match : RSMFactory.getStations()) {
			stations.insert(new Station(this, match.getStation().getName(), false, match.getStation()));
		}
	}
	
	private void initializeTurnouts() {
		turnouts = new Queue<Turnout>(this, "Turnouts Queue", true, false);
		for (TurnoutMatch match : RSMFactory.getTurnouts()) {
			turnouts.insert(new Turnout(this, match.getTurnout().getName(), false, match.getTurnout()));
		}
	}
	
	private void initializeSignals() {
		signals = new Queue<Signal>(this, "Signals Queue", true, false);
		for (SignalMatch match : RSMFactory.getSignals()) {
			signals.insert(new Signal(this, match.getSignal().getName(), false, match.getSignal()));
		}
	}
	
	private void initializeTurnoutSignals() {
		turnoutsignals = new Queue<TurnoutSignal>(this, "TurnoutSignals Queue", true, false);
		for (TurnoutSignalMatch match : RSMFactory.getTurnoutSignals()) {
			turnoutsignals.insert(new TurnoutSignal(this, match.getTurnoutSignal().getName(), false, match.getTurnoutSignal()));
		}
	}
	
	private void initializeSections() {
		sections = new Queue<Section>(this, "Sections Queue", true, false);
		for (SectionMatch match : RSMFactory.getSections()) {
			sections.insert(new Section(this, match.getSection().getName(), false, match.getSection()));
		}
	}
	
	 
	public Queue<Train> getTrains() {
		if (trains == null) {
			initializeTrains();
		}
		return trains;
	}
	public Queue<Station> getStations() {
		if (stations == null) {
			initializeStations();
		}
		return stations;
	}
	public Queue<Turnout> getTurnouts() {
		if (turnouts == null) {
			initializeTurnouts();
		}
		return turnouts;
	}
	public Queue<Signal> getSignals() {
		if (signals == null) {
			initializeSignals();
		}
		return signals;
	}
	public Queue<TurnoutSignal> getTurnoutSignals() {
		if (turnoutsignals == null) {
			initializeTurnoutSignals();
		}
		return turnoutsignals;
	}
	public Queue<Section> getSections() {
		if (sections == null) {
			initializeSections();
		}
		return sections;
	}
	 
	public int drawSignalAllowedSpeed() {
		int value = signalAllowedSpeed.sample().intValue();
		while (value < 0) {
			value = signalAllowedSpeed.sample().intValue();
		}
		return value;
	}
	public int drawStationWaitingTime() {
		int value = stationWaitingTime.sample().intValue();
		while (value < 0) {
			value = stationWaitingTime.sample().intValue();
		}
		return value;
	}
	public int drawTurnoutSwitchDirection() {
		int value = turnoutSwitchDirection.sample().intValue();
		while (value < 0) {
			value = turnoutSwitchDirection.sample().intValue();
		}
		return value;
	}
	public int drawTurnoutSwitchingRate() {
		int value = turnoutSwitchingRate.sample().intValue();
		while (value < 0) {
			value = turnoutSwitchingRate.sample().intValue();
		}
		return value;
	}
	public int drawTrainWaitingTime() {
		int value = trainWaitingTime.sample().intValue();
		while (value < 0) {
			value = trainWaitingTime.sample().intValue();
		}
		return value;
	}
	
	public Signal getSignal(ConnectionPoint cp) {
		for (int i = 0; i < signals.size(); ++i) {
			Signal signal = signals.removeFirst();
			if (signal.refersToTheSame(cp.getHolds())) {
				signals.insert(signal);
				return signal;
			}
			signals.insert(signal);
		}
		return null;
	}

	public TurnoutSignal getTurnoutSignal(ConnectionPoint cp) {
		for (int i = 0; i < turnoutsignals.size(); ++i) {
			TurnoutSignal signal = turnoutsignals.removeFirst();
			if (signal.refersToTheSame(cp.getHolds())) {
				turnoutsignals.insert(signal);
				return signal;
			}
			turnoutsignals.insert(signal);
		}
		return null;
	}

	public TrackElement getTrackElement(
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {

		for (int i = 0; i < sections.size(); ++i) {
			Section section = sections.removeFirst();
			if (section.refersToTheSame(trackElement)) {
				sections.insert(section);
				return section;
			}
			sections.insert(section);
		}

		for (int i = 0; i < stations.size(); ++i) {
			Station station = stations.removeFirst();
			if (station.refersToTheSame(trackElement)) {
				stations.insert(station);
				return station;
			}
			stations.insert(station);
		}

		for (int i = 0; i < turnouts.size(); ++i) {
			Turnout turnout = turnouts.removeFirst();
			if (turnout.refersToTheSame(trackElement)) {
				turnouts.insert(turnout);
				return turnout;
			}
			turnouts.insert(turnout);
		}

		return null;
	}
	
	 }

