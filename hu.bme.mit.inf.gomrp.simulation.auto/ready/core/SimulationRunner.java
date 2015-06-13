package hu.bme.mit.inf.gomrp.simulation.auto.core;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import java.util.concurrent.TimeUnit;
import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.TimeInstant;

/**
  * Generated file by Xtend code generator
  * Last modified: 2015.05.26
  */
public class SimulationRunner {

public static void simulateModel(RailwaySimulationModel model,
		long simulationDuration, TimeUnit durationGranularity) {
	Experiment experiment = new Experiment("simulation", TimeUnit.SECONDS,
			TimeUnit.SECONDS, null);

	TraceBuilderHelper
			.initializeTrace(
					model.description(),
					hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.SECONDS);

	model.connectToExperiment(experiment);
	experiment.setSilent(true);
	experiment.setShowProgressBar(false);
	experiment.setShowProgressBarAutoclose(true);
	experiment.stop(new TimeInstant(simulationDuration, durationGranularity));
	experiment.start();
	experiment.finish();
}
}
