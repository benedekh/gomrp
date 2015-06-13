/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.util;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement;

import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.*;

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
 * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage
 * @generated
 */
public class StateMachineDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateMachineDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StateMachineDSLPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StateMachineDSLPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.TRAIN_CURRENT_HEADING_SPEED:
      {
        TrainCurrentHeadingSpeed trainCurrentHeadingSpeed = (TrainCurrentHeadingSpeed)theEObject;
        T result = caseTrainCurrentHeadingSpeed(trainCurrentHeadingSpeed);
        if (result == null) result = caseGuard(trainCurrentHeadingSpeed);
        if (result == null) result = caseNamedElement(trainCurrentHeadingSpeed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.TRAIN_CURRENTLY_STANDS_ON:
      {
        TrainCurrentlyStandsOn trainCurrentlyStandsOn = (TrainCurrentlyStandsOn)theEObject;
        T result = caseTrainCurrentlyStandsOn(trainCurrentlyStandsOn);
        if (result == null) result = caseGuard(trainCurrentlyStandsOn);
        if (result == null) result = caseNamedElement(trainCurrentlyStandsOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.TURNOUT_CURRENT_DIRECTION:
      {
        TurnoutCurrentDirection turnoutCurrentDirection = (TurnoutCurrentDirection)theEObject;
        T result = caseTurnoutCurrentDirection(turnoutCurrentDirection);
        if (result == null) result = caseGuard(turnoutCurrentDirection);
        if (result == null) result = caseNamedElement(turnoutCurrentDirection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.SIGNAL_CURRENT_ALLOWED_SPEED:
      {
        SignalCurrentAllowedSpeed signalCurrentAllowedSpeed = (SignalCurrentAllowedSpeed)theEObject;
        T result = caseSignalCurrentAllowedSpeed(signalCurrentAllowedSpeed);
        if (result == null) result = caseGuard(signalCurrentAllowedSpeed);
        if (result == null) result = caseNamedElement(signalCurrentAllowedSpeed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.NEXT_TRACK_ELEMENT_IS:
      {
        NextTrackElementIs nextTrackElementIs = (NextTrackElementIs)theEObject;
        T result = caseNextTrackElementIs(nextTrackElementIs);
        if (result == null) result = caseGuard(nextTrackElementIs);
        if (result == null) result = caseNamedElement(nextTrackElementIs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.TURNOUT_HAS_DESIRED_DIRECTION:
      {
        TurnoutHasDesiredDirection turnoutHasDesiredDirection = (TurnoutHasDesiredDirection)theEObject;
        T result = caseTurnoutHasDesiredDirection(turnoutHasDesiredDirection);
        if (result == null) result = caseGuard(turnoutHasDesiredDirection);
        if (result == null) result = caseNamedElement(turnoutHasDesiredDirection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateMachineDSLPackage.STATE_MACHINE_BEHAVIORAL_MODEL:
      {
        StateMachineBehavioralModel stateMachineBehavioralModel = (StateMachineBehavioralModel)theEObject;
        T result = caseStateMachineBehavioralModel(stateMachineBehavioralModel);
        if (result == null) result = caseStateMachine_StateMachineBehavioralModel(stateMachineBehavioralModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
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
  public T caseTrainCurrentHeadingSpeed(TrainCurrentHeadingSpeed object)
  {
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
  public T caseTrainCurrentlyStandsOn(TrainCurrentlyStandsOn object)
  {
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
  public T caseTurnoutCurrentDirection(TurnoutCurrentDirection object)
  {
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
  public T caseSignalCurrentAllowedSpeed(SignalCurrentAllowedSpeed object)
  {
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
  public T caseNextTrackElementIs(NextTrackElementIs object)
  {
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
  public T caseTurnoutHasDesiredDirection(TurnoutHasDesiredDirection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Machine Behavioral Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Machine Behavioral Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateMachineBehavioralModel(StateMachineBehavioralModel object)
  {
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
  public T caseNamedElement(NamedElement object)
  {
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
  public T caseGuard(Guard object)
  {
    return null;
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
  public T caseStateMachine_StateMachineBehavioralModel(hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //StateMachineDSLSwitch
