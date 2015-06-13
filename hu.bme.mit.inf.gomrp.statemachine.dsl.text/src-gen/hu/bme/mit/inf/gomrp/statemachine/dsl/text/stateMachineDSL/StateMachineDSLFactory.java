/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage
 * @generated
 */
public interface StateMachineDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateMachineDSLFactory eINSTANCE = hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Train Current Heading Speed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Train Current Heading Speed</em>'.
   * @generated
   */
  TrainCurrentHeadingSpeed createTrainCurrentHeadingSpeed();

  /**
   * Returns a new object of class '<em>Train Currently Stands On</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Train Currently Stands On</em>'.
   * @generated
   */
  TrainCurrentlyStandsOn createTrainCurrentlyStandsOn();

  /**
   * Returns a new object of class '<em>Turnout Current Direction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Turnout Current Direction</em>'.
   * @generated
   */
  TurnoutCurrentDirection createTurnoutCurrentDirection();

  /**
   * Returns a new object of class '<em>Signal Current Allowed Speed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Current Allowed Speed</em>'.
   * @generated
   */
  SignalCurrentAllowedSpeed createSignalCurrentAllowedSpeed();

  /**
   * Returns a new object of class '<em>Next Track Element Is</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next Track Element Is</em>'.
   * @generated
   */
  NextTrackElementIs createNextTrackElementIs();

  /**
   * Returns a new object of class '<em>Turnout Has Desired Direction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Turnout Has Desired Direction</em>'.
   * @generated
   */
  TurnoutHasDesiredDirection createTurnoutHasDesiredDirection();

  /**
   * Returns a new object of class '<em>State Machine Behavioral Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Machine Behavioral Model</em>'.
   * @generated
   */
  StateMachineBehavioralModel createStateMachineBehavioralModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StateMachineDSLPackage getStateMachineDSLPackage();

} //StateMachineDSLFactory
