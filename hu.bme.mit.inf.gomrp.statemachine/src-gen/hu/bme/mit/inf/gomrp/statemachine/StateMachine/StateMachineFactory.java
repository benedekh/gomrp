/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage
 * @generated
 */
public interface StateMachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineFactory eINSTANCE = hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavioral Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioral Model</em>'.
	 * @generated
	 */
	StateMachineBehavioralModel createStateMachineBehavioralModel();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite State</em>'.
	 * @generated
	 */
	CompositeState createCompositeState();

	/**
	 * Returns a new object of class '<em>Change Train Heading Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Train Heading Speed</em>'.
	 * @generated
	 */
	ChangeTrainHeadingSpeed createChangeTrainHeadingSpeed();

	/**
	 * Returns a new object of class '<em>Change Signal Allowed Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Signal Allowed Speed</em>'.
	 * @generated
	 */
	ChangeSignalAllowedSpeed createChangeSignalAllowedSpeed();

	/**
	 * Returns a new object of class '<em>Change Turnout Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Turnout Direction</em>'.
	 * @generated
	 */
	ChangeTurnoutDirection createChangeTurnoutDirection();

	/**
	 * Returns a new object of class '<em>Change Train Current Track Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Train Current Track Element</em>'.
	 * @generated
	 */
	ChangeTrainCurrentTrackElement createChangeTrainCurrentTrackElement();

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
	 * Returns a new object of class '<em>Train Heading Speed Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Heading Speed Changed</em>'.
	 * @generated
	 */
	TrainHeadingSpeedChanged createTrainHeadingSpeedChanged();

	/**
	 * Returns a new object of class '<em>Train Track Element Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Track Element Changed</em>'.
	 * @generated
	 */
	TrainTrackElementChanged createTrainTrackElementChanged();

	/**
	 * Returns a new object of class '<em>Signal Allowed Speed Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Allowed Speed Changed</em>'.
	 * @generated
	 */
	SignalAllowedSpeedChanged createSignalAllowedSpeedChanged();

	/**
	 * Returns a new object of class '<em>Turnout Direction Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turnout Direction Changed</em>'.
	 * @generated
	 */
	TurnoutDirectionChanged createTurnoutDirectionChanged();

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
	 * Returns a new object of class '<em>Action Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Expression</em>'.
	 * @generated
	 */
	ActionExpression createActionExpression();

	/**
	 * Returns a new object of class '<em>Guard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Expression</em>'.
	 * @generated
	 */
	GuardExpression createGuardExpression();

	/**
	 * Returns a new object of class '<em>Trigger Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Expression</em>'.
	 * @generated
	 */
	TriggerExpression createTriggerExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateMachinePackage getStateMachinePackage();

} //StateMachineFactory
