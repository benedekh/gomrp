package hu.bme.mit.inf.gomrp.statemachine.dsl.text.generator

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action
import org.eclipse.emf.ecore.resource.Resource

/**
 * Helper class to generate a Java class for a DESMO-J Event.
 */
class EventGenerator {
	String eventsPackageName;
	String entitiesPackageName;
	String simulationCorePackageName;
	
	new(String events, String entites, String core) {
		eventsPackageName = events
		entitiesPackageName = entites
		simulationCorePackageName = core;
	}
	
	def createStubsForTTEC(Resource resource) {
		#["TrainFrontEnteredTrackElement", "TrainFrontLeftTrackElement",
		"TrainRearEnteredTrackElement", "TrainRearLeftTrackElement"].forEach[ e |
			CodeGeneratorHelper.createJavaFile(resource, eventsPackageName, e,
				generateEventStub(e, "Train", "TrackElement"))
		]
	}
	
	def createStubsForWaiting(Resource resource) {
		CodeGeneratorHelper.createJavaFile(resource, eventsPackageName, "WaitingAtStationEnded",
				generateEventStub("WaitingAtStationEnded", "Train", "Station"))
		CodeGeneratorHelper.createJavaFile(resource, eventsPackageName, "WaitingEnded",
				generateEventStub("WaitingEnded", "Train", "TrackElement"))
	}
	
	def generateSMTurnout(StateMachine mach)'''
	package «eventsPackageName»;
	
	import desmoj.core.simulator.ExternalEvent;
	import desmoj.core.simulator.Model;
	import desmoj.core.simulator.Queue;
	import desmoj.core.simulator.TimeSpan;
	
	import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
	import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
	
	public class TurnoutDirectionChanged extends ExternalEvent {
		RailwaySimulationModel model;

		public TurnoutDirectionChanged(Model owner, String name, boolean showInTrace) {
			super(owner, name, showInTrace);
			this.model = (RailwaySimulationModel)owner;
		}
		
		@Override
		public void eventRoutine() {
			TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
			
			Queue<«entitiesPackageName».Turnout> turnouts = model.getTurnouts();
			for («entitiesPackageName».Turnout self : turnouts) {
	 			switch (self.getActiveStateName()) {
					«FOR state : mach.states»
					case "«state.name»":
						«FOR trans : state.outgoingTransitions»
						if («(trans.guard.get(0) as GuardExpression).expression.subSequence(1, (trans.guard.get(0) as GuardExpression).expression.length-1)») {
							«getAction(trans.action.get(0))»
						}
						«ENDFOR»
					break;
					«ENDFOR»
				}
			}
			new TurnoutDirectionChanged(model, "Turnout Directions Changed", true)
					.schedule(new TimeSpan(model.drawTurnoutSwitchingRate()));
		}
	}
	'''
	
	def getAction(Action action) {
		if (action instanceof ChangeTurnoutDirection) {
			return "self.changeTurnoutDirection((model.drawTurnoutSwitchDirection() % 2 == 0));"
		} else {
			return "";
		}
	}
	
	def generateEventStub(String name, String type1, String type2)'''
	package «eventsPackageName»;
	
	import «entitiesPackageName».*;
	import «simulationCorePackageName».RailwaySimulationModel;
	
	import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
	
	import desmoj.core.simulator.EventOf2Entities;
	import desmoj.core.simulator.Model;
	import desmoj.core.simulator.TimeSpan;
	
	public class «name» extends
		EventOf2Entities<«type1», «type2»> {

		private RailwaySimulationModel model;
	
		public «name»(Model owner, String name, boolean showInTrace) {
			super(owner, name, showInTrace);
			this.model = (RailwaySimulationModel)owner;
		}
	
		@Override
		public void eventRoutine(«type1» entry1, «type2» entry2) {
			TraceBuilderHelper.createNewTraceEntry(getName(), presentTime().getTimeRounded());
			entry1.addToTraceEntry();
			entry2.addToTraceEntry();	
			
			//TODO: Auto-generated method.		
		}
	}
	'''
}