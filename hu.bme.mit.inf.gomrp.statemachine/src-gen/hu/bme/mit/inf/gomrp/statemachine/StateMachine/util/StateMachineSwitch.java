/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.util;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage
 * @generated
 */
public class StateMachineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateMachinePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineSwitch() {
		if (modelPackage == null) {
			modelPackage = StateMachinePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL: {
				StateMachineBehavioralModel stateMachineBehavioralModel = (StateMachineBehavioralModel)theEObject;
				T result = caseStateMachineBehavioralModel(stateMachineBehavioralModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = caseNamedElement(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.COMPOSITE_STATE: {
				CompositeState compositeState = (CompositeState)theEObject;
				T result = caseCompositeState(compositeState);
				if (result == null) result = caseState(compositeState);
				if (result == null) result = caseNamedElement(compositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseNamedElement(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = caseNamedElement(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.CHANGE_TRAIN_HEADING_SPEED: {
				ChangeTrainHeadingSpeed changeTrainHeadingSpeed = (ChangeTrainHeadingSpeed)theEObject;
				T result = caseChangeTrainHeadingSpeed(changeTrainHeadingSpeed);
				if (result == null) result = caseActionExpression(changeTrainHeadingSpeed);
				if (result == null) result = caseAction(changeTrainHeadingSpeed);
				if (result == null) result = caseNamedElement(changeTrainHeadingSpeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED: {
				ChangeSignalAllowedSpeed changeSignalAllowedSpeed = (ChangeSignalAllowedSpeed)theEObject;
				T result = caseChangeSignalAllowedSpeed(changeSignalAllowedSpeed);
				if (result == null) result = caseActionExpression(changeSignalAllowedSpeed);
				if (result == null) result = caseAction(changeSignalAllowedSpeed);
				if (result == null) result = caseNamedElement(changeSignalAllowedSpeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION: {
				ChangeTurnoutDirection changeTurnoutDirection = (ChangeTurnoutDirection)theEObject;
				T result = caseChangeTurnoutDirection(changeTurnoutDirection);
				if (result == null) result = caseActionExpression(changeTurnoutDirection);
				if (result == null) result = caseAction(changeTurnoutDirection);
				if (result == null) result = caseNamedElement(changeTurnoutDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT: {
				ChangeTrainCurrentTrackElement changeTrainCurrentTrackElement = (ChangeTrainCurrentTrackElement)theEObject;
				T result = caseChangeTrainCurrentTrackElement(changeTrainCurrentTrackElement);
				if (result == null) result = caseActionExpression(changeTrainCurrentTrackElement);
				if (result == null) result = caseAction(changeTrainCurrentTrackElement);
				if (result == null) result = caseNamedElement(changeTrainCurrentTrackElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRAIN_CURRENT_HEADING_SPEED: {
				TrainCurrentHeadingSpeed trainCurrentHeadingSpeed = (TrainCurrentHeadingSpeed)theEObject;
				T result = caseTrainCurrentHeadingSpeed(trainCurrentHeadingSpeed);
				if (result == null) result = caseGuardExpression(trainCurrentHeadingSpeed);
				if (result == null) result = caseGuard(trainCurrentHeadingSpeed);
				if (result == null) result = caseNamedElement(trainCurrentHeadingSpeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON: {
				TrainCurrentlyStandsOn trainCurrentlyStandsOn = (TrainCurrentlyStandsOn)theEObject;
				T result = caseTrainCurrentlyStandsOn(trainCurrentlyStandsOn);
				if (result == null) result = caseGuardExpression(trainCurrentlyStandsOn);
				if (result == null) result = caseGuard(trainCurrentlyStandsOn);
				if (result == null) result = caseNamedElement(trainCurrentlyStandsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION: {
				TurnoutCurrentDirection turnoutCurrentDirection = (TurnoutCurrentDirection)theEObject;
				T result = caseTurnoutCurrentDirection(turnoutCurrentDirection);
				if (result == null) result = caseGuardExpression(turnoutCurrentDirection);
				if (result == null) result = caseGuard(turnoutCurrentDirection);
				if (result == null) result = caseNamedElement(turnoutCurrentDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED: {
				SignalCurrentAllowedSpeed signalCurrentAllowedSpeed = (SignalCurrentAllowedSpeed)theEObject;
				T result = caseSignalCurrentAllowedSpeed(signalCurrentAllowedSpeed);
				if (result == null) result = caseGuardExpression(signalCurrentAllowedSpeed);
				if (result == null) result = caseGuard(signalCurrentAllowedSpeed);
				if (result == null) result = caseNamedElement(signalCurrentAllowedSpeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED: {
				TrainHeadingSpeedChanged trainHeadingSpeedChanged = (TrainHeadingSpeedChanged)theEObject;
				T result = caseTrainHeadingSpeedChanged(trainHeadingSpeedChanged);
				if (result == null) result = caseTriggerExpression(trainHeadingSpeedChanged);
				if (result == null) result = caseTrigger(trainHeadingSpeedChanged);
				if (result == null) result = caseNamedElement(trainHeadingSpeedChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRAIN_TRACK_ELEMENT_CHANGED: {
				TrainTrackElementChanged trainTrackElementChanged = (TrainTrackElementChanged)theEObject;
				T result = caseTrainTrackElementChanged(trainTrackElementChanged);
				if (result == null) result = caseTriggerExpression(trainTrackElementChanged);
				if (result == null) result = caseTrigger(trainTrackElementChanged);
				if (result == null) result = caseNamedElement(trainTrackElementChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.SIGNAL_ALLOWED_SPEED_CHANGED: {
				SignalAllowedSpeedChanged signalAllowedSpeedChanged = (SignalAllowedSpeedChanged)theEObject;
				T result = caseSignalAllowedSpeedChanged(signalAllowedSpeedChanged);
				if (result == null) result = caseTriggerExpression(signalAllowedSpeedChanged);
				if (result == null) result = caseTrigger(signalAllowedSpeedChanged);
				if (result == null) result = caseNamedElement(signalAllowedSpeedChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TURNOUT_DIRECTION_CHANGED: {
				TurnoutDirectionChanged turnoutDirectionChanged = (TurnoutDirectionChanged)theEObject;
				T result = caseTurnoutDirectionChanged(turnoutDirectionChanged);
				if (result == null) result = caseTriggerExpression(turnoutDirectionChanged);
				if (result == null) result = caseTrigger(turnoutDirectionChanged);
				if (result == null) result = caseNamedElement(turnoutDirectionChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS: {
				NextTrackElementIs nextTrackElementIs = (NextTrackElementIs)theEObject;
				T result = caseNextTrackElementIs(nextTrackElementIs);
				if (result == null) result = caseGuardExpression(nextTrackElementIs);
				if (result == null) result = caseGuard(nextTrackElementIs);
				if (result == null) result = caseNamedElement(nextTrackElementIs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION: {
				TurnoutHasDesiredDirection turnoutHasDesiredDirection = (TurnoutHasDesiredDirection)theEObject;
				T result = caseTurnoutHasDesiredDirection(turnoutHasDesiredDirection);
				if (result == null) result = caseGuardExpression(turnoutHasDesiredDirection);
				if (result == null) result = caseGuard(turnoutHasDesiredDirection);
				if (result == null) result = caseNamedElement(turnoutHasDesiredDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.ACTION_EXPRESSION: {
				ActionExpression actionExpression = (ActionExpression)theEObject;
				T result = caseActionExpression(actionExpression);
				if (result == null) result = caseAction(actionExpression);
				if (result == null) result = caseNamedElement(actionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.GUARD_EXPRESSION: {
				GuardExpression guardExpression = (GuardExpression)theEObject;
				T result = caseGuardExpression(guardExpression);
				if (result == null) result = caseGuard(guardExpression);
				if (result == null) result = caseNamedElement(guardExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateMachinePackage.TRIGGER_EXPRESSION: {
				TriggerExpression triggerExpression = (TriggerExpression)theEObject;
				T result = caseTriggerExpression(triggerExpression);
				if (result == null) result = caseTrigger(triggerExpression);
				if (result == null) result = caseNamedElement(triggerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineBehavioralModel(StateMachineBehavioralModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeState(CompositeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Train Heading Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Train Heading Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTrainHeadingSpeed(ChangeTrainHeadingSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Signal Allowed Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Signal Allowed Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSignalAllowedSpeed(ChangeSignalAllowedSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Turnout Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Turnout Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTurnoutDirection(ChangeTurnoutDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Train Current Track Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Train Current Track Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTrainCurrentTrackElement(ChangeTrainCurrentTrackElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Current Heading Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Current Heading Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainCurrentHeadingSpeed(TrainCurrentHeadingSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Currently Stands On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Currently Stands On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainCurrentlyStandsOn(TrainCurrentlyStandsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnout Current Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnout Current Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnoutCurrentDirection(TurnoutCurrentDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Current Allowed Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Current Allowed Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalCurrentAllowedSpeed(SignalCurrentAllowedSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Heading Speed Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Heading Speed Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainHeadingSpeedChanged(TrainHeadingSpeedChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Track Element Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Track Element Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainTrackElementChanged(TrainTrackElementChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Allowed Speed Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Allowed Speed Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAllowedSpeedChanged(SignalAllowedSpeedChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnout Direction Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnout Direction Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnoutDirectionChanged(TurnoutDirectionChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Track Element Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Track Element Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextTrackElementIs(NextTrackElementIs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnout Has Desired Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnout Has Desired Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnoutHasDesiredDirection(TurnoutHasDesiredDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExpression(ActionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardExpression(GuardExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerExpression(TriggerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StateMachineSwitch
