package hu.bme.mit.inf.gomrp.simulation.demo.helpers;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.incquery.Queries;
import hu.bme.mit.inf.gomrp.railway.incquery.SectionMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.SectionMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.SignalMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.SignalMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.StationMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.StationMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutSignalMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutSignalMatcher;
import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;

import java.util.Collection;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Helper class for the DESMO-J Simulation. It collects each entity from a
 * RailwayDomainModel model to collections, separated by each type (using
 * IncQuery). RailwaySimulationModel initializes itself from these collections.
 */
public class RSMFactory {

	private static Collection<TrainMatch> trains;
	private static Collection<SectionMatch> sections;
	private static Collection<StationMatch> stations;
	private static Collection<TurnoutMatch> turnouts;
	private static Collection<SignalMatch> signals;
	private static Collection<TurnoutSignalMatch> turnoutSignals;

	public static Collection<TrainMatch> getTrains() {
		return trains;
	}

	public static Collection<SectionMatch> getSections() {
		return sections;
	}

	public static Collection<StationMatch> getStations() {
		return stations;
	}

	public static Collection<TurnoutMatch> getTurnouts() {
		return turnouts;
	}

	public static Collection<SignalMatch> getSignals() {
		return signals;
	}

	public static Collection<TurnoutSignalMatch> getTurnoutSignals() {
		return turnoutSignals;
	}

	public static RailwaySimulationModel createRSMFromRDM(RailwayDomainModel rdm) {
		IncQueryEngine engine;
		try {
			engine = IncQueryEngine.on(new EMFScope(rdm));
			Queries.instance().prepare(engine);

			RailwaySimulationModel model = new RailwaySimulationModel(null,
					"Railway Simulation Model", true, false);

			trains = TrainMatcher.on(engine).getAllMatches();
			sections = SectionMatcher.on(engine).getAllMatches();
			stations = StationMatcher.on(engine).getAllMatches();
			turnouts = TurnoutMatcher.on(engine).getAllMatches();
			signals = SignalMatcher.on(engine).getAllMatches();
			turnoutSignals = TurnoutSignalMatcher.on(engine).getAllMatches();

			return model;

		} catch (IncQueryException e) {
			new MessageDialog(null,
					"Error during initializing Railway Simulation Model!",
					null, e.getMessage(), MessageDialog.ERROR,
					new String[] { "Ok" }, 0).open();
			return null;
		}
	}
}
