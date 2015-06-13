package hu.bme.mit.inf.gomrp.statemachine.dsl.text.generator

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel
import org.eclipse.emf.ecore.resource.Resource

/**
 * Helper class to generate Java classes as the environment for the DESMO-J 
 * Simulation (e.g. SimulationRunner, DESMO-J Model, helper class for the 
 * DESMO-J Model initialization, AdvanceTrackElement helper).
 */
class EnvironmentGenerator {

	static val runnerClassName = "SimulationRunner"
	static val modelClassName = "RailwaySimulationModel"
	static val factoryClassName = "RSMFactory"
	static val helperClassName = "AdvanceTrackElementHelper"

	static String entitiesPackageName = null;
	static Resource resource = null
	static val distributions = <String, String>newHashMap("turnoutSwitchingRate" -> "ContDistNormal",
		"trainWaitingTime" -> "ContDistNormal", "turnoutSwitchDirection" -> "ContDistUniform",
		"signalAllowedSpeed" -> "ContDistUniform", "stationWaitingTime" -> "DiscreteDistPoisson")
	static val distributionParameters = <String, Pair>newHashMap("turnoutSwitchingRate" -> (Pair.of(10, 5)),
		"trainWaitingTime" -> (Pair.of(5, 1)), "turnoutSwitchDirection" -> (Pair.of(1.0, 3.0)),
		"signalAllowedSpeed" -> (Pair.of(1.0, 4.0)), "stationWaitingTime" -> (Pair.of(3.0, null)))

	static def create(Resource resource, String simulationCorePackageName, String entitiesPackageName) {
		EnvironmentGenerator.resource = resource
		EnvironmentGenerator.entitiesPackageName = entitiesPackageName

		//Generating SimulationRunner class
		CodeGeneratorHelper.createJavaFile(resource, simulationCorePackageName, runnerClassName,
			EnvironmentGenerator.createSimulationRunnerClass(simulationCorePackageName))

		//Generating SimulationModel class
		CodeGeneratorHelper.createJavaFile(resource, simulationCorePackageName, modelClassName,
			EnvironmentGenerator.createSimulationModelClass(simulationCorePackageName))

		//Generating RSMFactory class
		CodeGeneratorHelper.createJavaFile(resource, simulationCorePackageName, factoryClassName,
			EnvironmentGenerator.createFactoryClass(simulationCorePackageName))

		//Generating AdvanceTrackElementHelper class
		CodeGeneratorHelper.createJavaFile(resource, simulationCorePackageName, helperClassName,
			EnvironmentGenerator.createAdvanceTrackElementHelperClass(simulationCorePackageName))

	}

	private static def createSimulationRunnerClass(String simulationCorePackageName) '''
		package «simulationCorePackageName»;
		import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
		import java.util.concurrent.TimeUnit;
		import desmoj.core.simulator.Experiment;
		import desmoj.core.simulator.TimeInstant;
		
		/**
		  * Generated file by Xtend code generator
		  * Last modified: 2015.05.26
		  */
		public class «runnerClassName» {
		
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
	'''

	private static def createSimulationModelClass(String simulationCorePackageName) '''
		package «simulationCorePackageName»;
		
		import desmoj.core.simulator.*;
		import desmoj.core.dist.*;
		import hu.bme.mit.inf.gomrp.simulation.auto.entities.*;
		import hu.bme.mit.inf.gomrp.railway.incquery.*;
		
		/**
		  * Generated file by Xtend code generator
		  * Last modified: 2015.05.26
		  */
		public class «modelClassName» extends Model {
			«queueAndDistributionDeclarations»
			
			«constructorWithDescription»
			 
			«doInitialSchedules»
			 
			«init»
			 
			«queueDefinitions»
			 
			«queueGetters»
			 
			«drawFunctions»
			 }
	'''

	private static def createFactoryClass(String simulationCorePackageName) '''
		package «simulationCorePackageName»;
		
		import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
		import hu.bme.mit.inf.gomrp.railway.incquery.*;
		import hu.bme.mit.inf.gomrp.simulation.auto.core.«modelClassName»;
		import java.util.Collection;
		import org.eclipse.incquery.runtime.api.IncQueryEngine;
		import org.eclipse.incquery.runtime.emf.EMFScope;
		import org.eclipse.incquery.runtime.exception.IncQueryException;
		import org.eclipse.jface.dialogs.MessageDialog;
		
		public class «factoryClassName» {
			«entityDeclarations»
			
			«entityGetters»
			
			«createRSMFromRDM»
		}
	'''

	private static def createAdvanceTrackElementHelperClass(String simulationCorePackageName) '''
		package «simulationCorePackageName»;
		
		import «EnvironmentGenerator.entitiesPackageName».*;
		
		import org.eclipse.emf.common.util.EList;
		
		public abstract class AdvanceTrackElementHelper{
			
			// TODO Auto-generated class
			
			private static «modelClassName» model;
			
			public static void setModel(«modelClassName» _model) {
				model = _model;
			}
			
			public static hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint findNextCP(Train train,
					EList<hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint> connectionPoints) {
				//TODO
				return null;
			}
		
			public static void advanceTrackElement(Train train, TrackElement trackElement, boolean alreadyStopped) {
			//TODO
			}
		
			public static Signal getSignalFromCP(hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint cp) {
			//TODO
			return null;
			}
		
			public static long getRequiredTime(int length, double trainSpeed) {
			return Math.max(Math.round((length / trainSpeed)), 1);
			}
		
			public static void scheduleWaitingEnded(Train train, TrackElement trackElement) {
			//TODO
			}
		}
	'''

	private static def doInitialSchedules() '''
		@Override
		public void doInitialSchedules() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		
		}
	'''

	private static def constructorWithDescription() '''
		public «modelClassName»(Model owner, String name, boolean showInReport, boolean showInTrace) {
			super(owner, name, showInReport, showInTrace);
		}
		
		@Override
		public String description() {
			return "«modelClassName»";
		}
		
	'''

	private static def queueAndDistributionDeclarations() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines»
			«var clazz = entity.referredObject.eClass»
			public Queue<«clazz.name»> «clazz.name.toLowerCase + "s"»;
		«ENDFOR»
		
		«FOR dist : distributions.entrySet»
			private «dist.value» «dist.key»;
		«ENDFOR»
	'''

	private static def init() '''
		@Override
		public void init() {
			«distributionDefinitions»
			
			«initQueues»
			
			«helperClassName».setModel(this);
		}
	'''

	private static def distributionDefinitions() '''
		«FOR dist : distributions.entrySet»
			«dist.key» = new «dist.value»(this, "«dist.key.toUpperCase»", «distributionParameters.get(dist.key).key»,
			«IF distributionParameters.get(dist.key).value != null»«distributionParameters.get(dist.key).value»,
			«ENDIF»true, false);
		«ENDFOR»
	'''

	private static def initQueues() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines»
			«var clazz = entity.referredObject.eClass»
			initialize«clazz.name + "s"»();
		«ENDFOR»
	'''

	private static def queueDefinitions() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines» 
			«var clazz = entity.referredObject.eClass»
			private void initialize«clazz.name + "s"»() {
				«clazz.name.toLowerCase + "s"» = new Queue<«clazz.name»>(this, "«clazz.name.toFirstUpper + "s Queue"»", true, false);
				for («clazz.name»Match match : «factoryClassName».get«clazz.name.toFirstUpper + "s"»()) {
					«clazz.name.toLowerCase + "s"».insert(new «clazz.name.toFirstUpper»(this, match.get«clazz.name.toFirstUpper»().getName(), false, match.get«clazz.
			name.toFirstUpper»()));
				}
			}
			
		«ENDFOR»		
	'''

	private static def queueGetters() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines» 
			«var clazz = entity.referredObject.eClass»
			public Queue<«clazz.name»> get«clazz.name + "s"»() {
				if («clazz.name.toLowerCase + "s"» == null) {
					initialize«clazz.name + "s"»();
				}
				return «clazz.name.toLowerCase + "s"»;
			}
		«ENDFOR»
	'''

	private static def drawFunctions() '''
		«FOR dist : distributionParameters.keySet»
			public int draw«dist.toFirstUpper»() {
				int value = «dist».sample().intValue();
				while (value < 0) {
					value = «dist».sample().intValue();
				}
				return value;
			}
		«ENDFOR»
	'''

	private static def entityDeclarations() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines» 
			«var clazz = entity.referredObject.eClass»
			private static Collection<«clazz.name»Match> «clazz.name.toLowerCase + "s"»;
		«ENDFOR»
	'''

	private static def entityGetters() '''
		«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines» 
			«var clazz = entity.referredObject.eClass»
			public static Collection<«clazz.name»Match> get«clazz.name + "s"»() {
				return «clazz.name.toLowerCase + "s"»;
			}
		«ENDFOR»
	'''

	private static def createRSMFromRDM() '''
		public static «modelClassName» createRSMFromRDM(RailwayDomainModel rdm) {
			IncQueryEngine engine;
			try {
				engine = IncQueryEngine.on(new EMFScope(rdm));
				Queries.instance().prepare(engine);
		
				«modelClassName» model = new «modelClassName»(null,"«modelClassName»", true, false);
				«FOR entity : (resource.contents.get(0) as StateMachineBehavioralModel).statemachines» 
			«var clazz = entity.referredObject.eClass»
			«clazz.name.toLowerCase + "s"» = «clazz.name»Matcher.on(engine).getAllMatches();
				«ENDFOR»
				
				return model;
			} catch (IncQueryException e) {
				new MessageDialog(null,
						"Error during initializing Railway Simulation Model!",
						null, e.getMessage(), MessageDialog.ERROR,
						new String[] { "Ok" }, 0).open();
				return null; 
			}
		}
	'''

}
