package hu.bme.mit.inf.gomrp.statemachine.dsl.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.State;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.services.StateMachineDSLGrammarAccess;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StateMachineDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateMachineDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StateMachinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StateMachinePackage.ACTION_EXPRESSION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getActionExpression_ImplRule()) {
					sequence_ActionExpression_Impl(context, (ActionExpression) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getChangeSignalAllowedSpeedRule()) {
					sequence_ChangeSignalAllowedSpeed(context, (ChangeSignalAllowedSpeed) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getChangeTrainCurrentTrackElementRule()) {
					sequence_ChangeTrainCurrentTrackElement(context, (ChangeTrainCurrentTrackElement) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.CHANGE_TRAIN_HEADING_SPEED:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getChangeTrainHeadingSpeedRule()) {
					sequence_ChangeTrainHeadingSpeed(context, (ChangeTrainHeadingSpeed) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getChangeTurnoutDirectionRule()) {
					sequence_ChangeTurnoutDirection(context, (ChangeTurnoutDirection) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.GUARD_EXPRESSION:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getGuardExpression_ImplRule()) {
					sequence_GuardExpression_Impl(context, (GuardExpression) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.SIGNAL_ALLOWED_SPEED_CHANGED:
				if(context == grammarAccess.getSignalAllowedSpeedChangedRule() ||
				   context == grammarAccess.getTriggerRule()) {
					sequence_SignalAllowedSpeedChanged(context, (SignalAllowedSpeedChanged) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.STATE_MACHINE:
				if(context == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (StateMachine) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED:
				if(context == grammarAccess.getTrainHeadingSpeedChangedRule() ||
				   context == grammarAccess.getTriggerRule()) {
					sequence_TrainHeadingSpeedChanged(context, (TrainHeadingSpeedChanged) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.TRAIN_TRACK_ELEMENT_CHANGED:
				if(context == grammarAccess.getTrainTrackElementChangedRule() ||
				   context == grammarAccess.getTriggerRule()) {
					sequence_TrainTrackElementChanged(context, (TrainTrackElementChanged) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.TRIGGER_EXPRESSION:
				if(context == grammarAccess.getTriggerRule() ||
				   context == grammarAccess.getTriggerExpression_ImplRule()) {
					sequence_TriggerExpression_Impl(context, (TriggerExpression) semanticObject); 
					return; 
				}
				else break;
			case StateMachinePackage.TURNOUT_DIRECTION_CHANGED:
				if(context == grammarAccess.getTriggerRule() ||
				   context == grammarAccess.getTurnoutDirectionChangedRule()) {
					sequence_TurnoutDirectionChanged(context, (TurnoutDirectionChanged) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StateMachineDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StateMachineDSLPackage.INCLUDE:
				if(context == grammarAccess.getIncludeRule()) {
					sequence_Include(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.NEXT_TRACK_ELEMENT_IS:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getNextTrackElementIsRule()) {
					sequence_NextTrackElementIs(context, (NextTrackElementIs) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.SIGNAL_CURRENT_ALLOWED_SPEED:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getSignalCurrentAllowedSpeedRule()) {
					sequence_SignalCurrentAllowedSpeed(context, (SignalCurrentAllowedSpeed) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.STATE_MACHINE_BEHAVIORAL_MODEL:
				if(context == grammarAccess.getStateMachineBehavioralModelRule()) {
					sequence_StateMachineBehavioralModel(context, (StateMachineBehavioralModel) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.TRAIN_CURRENT_HEADING_SPEED:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getTrainCurrentHeadingSpeedRule()) {
					sequence_TrainCurrentHeadingSpeed(context, (TrainCurrentHeadingSpeed) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.TRAIN_CURRENTLY_STANDS_ON:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getTrainCurrentlyStandsOnRule()) {
					sequence_TrainCurrentlyStandsOn(context, (TrainCurrentlyStandsOn) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.TURNOUT_CURRENT_DIRECTION:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getTurnoutCurrentDirectionRule()) {
					sequence_TurnoutCurrentDirection(context, (TurnoutCurrentDirection) semanticObject); 
					return; 
				}
				else break;
			case StateMachineDSLPackage.TURNOUT_HAS_DESIRED_DIRECTION:
				if(context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getTurnoutHasDesiredDirectionRule()) {
					sequence_TurnoutHasDesiredDirection(context, (TurnoutHasDesiredDirection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID expression=EString)
	 */
	protected void sequence_ActionExpression_Impl(EObject context, ActionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.ACTION_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.ACTION_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionExpression_ImplAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ChangeSignalAllowedSpeed(EObject context, ChangeSignalAllowedSpeed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ChangeTrainCurrentTrackElement(EObject context, ChangeTrainCurrentTrackElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ChangeTrainHeadingSpeed(EObject context, ChangeTrainHeadingSpeed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ChangeTurnoutDirection(EObject context, ChangeTurnoutDirection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=EString)
	 */
	protected void sequence_GuardExpression_Impl(EObject context, GuardExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.GUARD_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.GUARD_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardExpression_ImplAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGuardExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     filename=STRING
	 */
	protected void sequence_Include(EObject context, Include semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachineDSLPackage.Literals.INCLUDE__FILENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachineDSLPackage.Literals.INCLUDE__FILENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeAccess().getFilenameSTRINGTerminalRuleCall_1_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_NextTrackElementIs(EObject context, NextTrackElementIs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNextTrackElementIsAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_SignalAllowedSpeedChanged(EObject context, SignalAllowedSpeedChanged semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_SignalCurrentAllowedSpeed(EObject context, SignalCurrentAllowedSpeed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (includes+=Include* statemachines+=StateMachine statemachines+=StateMachine*)
	 */
	protected void sequence_StateMachineBehavioralModel(EObject context, StateMachineBehavioralModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referredObject=[RDMElement|ID] 
	 *         actions+=Action* 
	 *         guards+=Guard* 
	 *         triggers+=Trigger* 
	 *         states+=State* 
	 *         transitions+=Transition*
	 *     )
	 */
	protected void sequence_StateMachine(EObject context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isInitial?='is Initial'? isActive?='is Active'?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TrainCurrentHeadingSpeed(EObject context, TrainCurrentHeadingSpeed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TrainCurrentlyStandsOn(EObject context, TrainCurrentlyStandsOn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TrainHeadingSpeedChanged(EObject context, TrainHeadingSpeedChanged semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TrainTrackElementChanged(EObject context, TrainTrackElementChanged semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isEnabled?='is Enabled'? 
	 *         isFireable?='is Fireable'? 
	 *         sourceState=[State|ID] 
	 *         targetState=[State|ID] 
	 *         action+=[Action|ID] 
	 *         action+=[Action|ID]* 
	 *         (guard+=[Guard|ID] guard+=[Guard|ID]*)? 
	 *         trigger=[Trigger|ID]?
	 *     )
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=EString)
	 */
	protected void sequence_TriggerExpression_Impl(EObject context, TriggerExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.TRIGGER_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.TRIGGER_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTriggerExpression_ImplAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTriggerExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TurnoutCurrentDirection(EObject context, TurnoutCurrentDirection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTurnoutCurrentDirectionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TurnoutDirectionChanged(EObject context, TurnoutDirectionChanged semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TurnoutHasDesiredDirection(EObject context, TurnoutHasDesiredDirection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
