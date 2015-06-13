package hu.bme.mit.inf.gomrp.simulation.demo;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.incquery.SectionMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.SignalMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.StationMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutSignalMatch;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Section;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Signal;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Station;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.TrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Train;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.Turnout;
import hu.bme.mit.inf.gomrp.simulation.demo.entities.TurnoutSignal;
import hu.bme.mit.inf.gomrp.simulation.demo.events.TrainFrontEnteredTrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.events.TrainRearEnteredTrackElement;
import hu.bme.mit.inf.gomrp.simulation.demo.events.TurnoutDirectionChanged;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.AdvanceTrackElementHelper;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.RSMFactory;
import desmoj.core.dist.ContDist;
import desmoj.core.dist.ContDistNormal;
import desmoj.core.dist.ContDistUniform;
import desmoj.core.dist.DiscreteDist;
import desmoj.core.dist.DiscreteDistPoisson;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import desmoj.core.simulator.TimeSpan;

/**
 * DESMO-J Model, that contains all the simulation Entities, and the frequencies
 * for each event. Initializes the queues and does the initial schedules for the
 * simulation.
 */
public class RailwaySimulationModel extends Model {

	private Queue<Train> trains;
	private Queue<Turnout> turnouts;
	private Queue<Section> sections;
	private Queue<Station> stations;
	private Queue<Signal> signals;
	private Queue<TurnoutSignal> turnoutSignals;

	private ContDist turnoutSwitchingRate;
	private ContDist turnoutSwitchDirection;
	private ContDist signalAllowedSpeed;
	private ContDist trainWaitingTime;

	private DiscreteDist<?> stationWaitingTime;

	public RailwaySimulationModel(Model owner, String name,
			boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
	}

	@Override
	public String description() {
		return "RailwaySimulationModel";
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
		turnoutSwitchingRate = new ContDistNormal(this,
				"Turnout Switching Rate", 10, 5, true, false);
		trainWaitingTime = new ContDistNormal(this, "Train Waiting Time", 5, 1,
				true, false);

		turnoutSwitchDirection = new ContDistUniform(this,
				"Turnout Switch Direction", 1.0, 3.0, true, false);
		signalAllowedSpeed = new ContDistUniform(this, "Signal Allowed Speed",
				1.0, 4.0, true, false);

		stationWaitingTime = new DiscreteDistPoisson(this,
				"Waiting time at the Station", 3.0, true, false);

		initializeSections();
		initializeSignals();
		initializeStations();
		initializeTrains();
		initializeTurnouts();
		initializeTurnoutSignals();

		AdvanceTrackElementHelper.setModel(this);
	}

	public int drawAllowedSpeed() {
		return signalAllowedSpeed.sample().intValue();
	}

	public int drawTurnoutDirection() {
		return turnoutSwitchDirection.sample().intValue();
	}

	public int drawTurnoutSwitchingRate() {
		int value = turnoutSwitchingRate.sample().intValue();
		while (value < 0) {
			value = turnoutSwitchingRate.sample().intValue();
		}
		return value;
	}

	public int drawStationWaitingTime() {
		return stationWaitingTime.sample().intValue();
	}

	public int drawTrainWaitingTime() {
		int value = trainWaitingTime.sample().intValue();
		while (value < 0) {
			value = trainWaitingTime.sample().intValue();
		}
		return value;
	}

	public Queue<Signal> getSignals() {
		if (signals == null) {
			initializeSignals();
		}
		return signals;
	}

	public Queue<TurnoutSignal> getTurnoutSignals() {
		if (turnoutSignals == null) {
			initializeTurnoutSignals();
		}
		return turnoutSignals;
	}

	public Queue<Section> getSections() {
		if (sections == null) {
			initializeSections();
		}
		return sections;
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

	public Queue<Train> getTrains() {
		if (trains == null) {
			initializeTrains();
		}
		return trains;
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
		for (int i = 0; i < turnoutSignals.size(); ++i) {
			TurnoutSignal signal = turnoutSignals.removeFirst();
			if (signal.refersToTheSame(cp.getHolds())) {
				turnoutSignals.insert(signal);
				return signal;
			}
			turnoutSignals.insert(signal);
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

	private void initializeSignals() {
		signals = new Queue<Signal>(this, "Signals Queue", true, false);
		for (SignalMatch match : RSMFactory.getSignals()) {
			signals.insert(new Signal(this, match.getSignal().getName(), false,
					match.getSignal()));
		}
	}

	private void initializeTurnoutSignals() {
		turnoutSignals = new Queue<TurnoutSignal>(this, "TurnoutSignals Queue",
				true, false);
		for (TurnoutSignalMatch match : RSMFactory.getTurnoutSignals()) {
			turnoutSignals.insert(new TurnoutSignal(this, match
					.getTurnoutSignal().getName(), false, match
					.getTurnoutSignal()));
		}
	}

	private void initializeSections() {
		sections = new Queue<Section>(this, "Sections Queue", true, false);
		for (SectionMatch match : RSMFactory.getSections()) {
			sections.insert(new Section(this, match.getSection().getName(),
					false, match.getSection()));
		}
	}

	private void initializeStations() {
		stations = new Queue<Station>(this, "Stations Queue", true, false);
		for (StationMatch match : RSMFactory.getStations()) {
			stations.insert(new Station(this, match.getStation().getName(),
					false, match.getStation()));
		}
	}

	private void initializeTurnouts() {
		turnouts = new Queue<Turnout>(this, "Turnouts Queue", true, false);
		for (TurnoutMatch match : RSMFactory.getTurnouts()) {
			turnouts.insert(new Turnout(this, match.getTurnout().getName(),
					false, match.getTurnout()));
		}
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

}
