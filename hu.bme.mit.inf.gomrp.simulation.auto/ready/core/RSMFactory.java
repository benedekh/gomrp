package hu.bme.mit.inf.gomrp.simulation.auto.core;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.incquery.*;
import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
import java.util.Collection;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jface.dialogs.MessageDialog;

public class RSMFactory {
	private static Collection<TrainMatch> trains;
	private static Collection<StationMatch> stations;
	private static Collection<TurnoutMatch> turnouts;
	private static Collection<SignalMatch> signals;
	private static Collection<TurnoutSignalMatch> turnoutsignals;
	private static Collection<SectionMatch> sections;
	
	public static Collection<TrainMatch> getTrains() {
		return trains;
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
		return turnoutsignals;
	}
	public static Collection<SectionMatch> getSections() {
		return sections;
	}
	
	public static RailwaySimulationModel createRSMFromRDM(RailwayDomainModel rdm) {
		IncQueryEngine engine;
		try {
			engine = IncQueryEngine.on(new EMFScope(rdm));
			Queries.instance().prepare(engine);
	
			RailwaySimulationModel model = new RailwaySimulationModel(null,"RailwaySimulationModel", true, false);
	trains = TrainMatcher.on(engine).getAllMatches();
	stations = StationMatcher.on(engine).getAllMatches();
	turnouts = TurnoutMatcher.on(engine).getAllMatches();
	signals = SignalMatcher.on(engine).getAllMatches();
	turnoutsignals = TurnoutSignalMatcher.on(engine).getAllMatches();
	sections = SectionMatcher.on(engine).getAllMatches();
			
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
