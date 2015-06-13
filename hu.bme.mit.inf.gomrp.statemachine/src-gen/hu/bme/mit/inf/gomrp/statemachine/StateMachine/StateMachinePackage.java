/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface StateMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.gomrp.statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.gomrp.statemachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinePackage eINSTANCE = hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineBehavioralModelImpl <em>Behavioral Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineBehavioralModelImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getStateMachineBehavioralModel()
	 * @generated
	 */
	int STATE_MACHINE_BEHAVIORAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Statemachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_BEHAVIORAL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioral Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_BEHAVIORAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRIGGERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__GUARDS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ACTIVE_STATE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REFERRED_OBJECT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ACTIVE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_STATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_ENABLED = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Fireable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_FIREABLE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.CompositeStateImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__OUTGOING_TRANSITIONS = STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__INCOMING_TRANSITIONS = STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__IS_INITIAL = STATE__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__STATEMACHINE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionExpressionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getActionExpression()
	 * @generated
	 */
	int ACTION_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXPRESSION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXPRESSION__EXPRESSION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXPRESSION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXPRESSION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainHeadingSpeedImpl <em>Change Train Heading Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainHeadingSpeedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTrainHeadingSpeed()
	 * @generated
	 */
	int CHANGE_TRAIN_HEADING_SPEED = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED__NAME = ACTION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED__EXPRESSION = ACTION_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED__TRAIN = ACTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Heading Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED__NEW_HEADING_SPEED = ACTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Train Heading Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Train Heading Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_HEADING_SPEED_OPERATION_COUNT = ACTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl <em>Change Signal Allowed Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeSignalAllowedSpeed()
	 * @generated
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED__NAME = ACTION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED__EXPRESSION = ACTION_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL = ACTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Allowed Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED = ACTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Signal Allowed Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Signal Allowed Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SIGNAL_ALLOWED_SPEED_OPERATION_COUNT = ACTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl <em>Change Turnout Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTurnoutDirection()
	 * @generated
	 */
	int CHANGE_TURNOUT_DIRECTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION__NAME = ACTION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION__EXPRESSION = ACTION_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>New Turnout Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION = ACTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION__TURNOUT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Turnout Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Turnout Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TURNOUT_DIRECTION_OPERATION_COUNT = ACTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl <em>Change Train Current Track Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTrainCurrentTrackElement()
	 * @generated
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NAME = ACTION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__EXPRESSION = ACTION_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN = ACTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Track Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS = ACTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Train Current Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Train Current Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TRAIN_CURRENT_TRACK_ELEMENT_OPERATION_COUNT = ACTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardExpressionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getGuardExpression()
	 * @generated
	 */
	int GUARD_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__EXPRESSION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION_FEATURE_COUNT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentHeadingSpeedImpl <em>Train Current Heading Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentHeadingSpeedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainCurrentHeadingSpeed()
	 * @generated
	 */
	int TRAIN_CURRENT_HEADING_SPEED = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED__TRAIN = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Heading Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED__CURRENT_HEADING_SPEED = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Current Heading Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train Current Heading Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENT_HEADING_SPEED_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl <em>Train Currently Stands On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainCurrentlyStandsOn()
	 * @generated
	 */
	int TRAIN_CURRENTLY_STANDS_ON = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON__TRAIN = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Currently Stands On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train Currently Stands On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_CURRENTLY_STANDS_ON_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl <em>Turnout Current Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutCurrentDirection()
	 * @generated
	 */
	int TURNOUT_CURRENT_DIRECTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION__TURNOUT = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Turnout Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout Current Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout Current Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_CURRENT_DIRECTION_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl <em>Signal Current Allowed Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getSignalCurrentAllowedSpeed()
	 * @generated
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Current Allowed Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Current Allowed Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Current Allowed Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CURRENT_ALLOWED_SPEED_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerExpressionImpl <em>Trigger Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerExpressionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTriggerExpression()
	 * @generated
	 */
	int TRIGGER_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EXPRESSION__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EXPRESSION__EXPRESSION = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EXPRESSION_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EXPRESSION_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl <em>Train Heading Speed Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainHeadingSpeedChanged()
	 * @generated
	 */
	int TRAIN_HEADING_SPEED_CHANGED = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED__NAME = TRIGGER_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED__EXPRESSION = TRIGGER_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED__TRAIN = TRIGGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Heading Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED = TRIGGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Heading Speed Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED_FEATURE_COUNT = TRIGGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train Heading Speed Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_HEADING_SPEED_CHANGED_OPERATION_COUNT = TRIGGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainTrackElementChangedImpl <em>Train Track Element Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainTrackElementChangedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainTrackElementChanged()
	 * @generated
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED__NAME = TRIGGER_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED__EXPRESSION = TRIGGER_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED__TRAIN = TRIGGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED__TRACK_ELEMENTS = TRIGGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Track Element Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED_FEATURE_COUNT = TRIGGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train Track Element Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TRACK_ELEMENT_CHANGED_OPERATION_COUNT = TRIGGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalAllowedSpeedChangedImpl <em>Signal Allowed Speed Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalAllowedSpeedChangedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getSignalAllowedSpeedChanged()
	 * @generated
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED__NAME = TRIGGER_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED__EXPRESSION = TRIGGER_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED__SIGNAL = TRIGGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Allowed Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED__NEW_ALLOWED_SPEED = TRIGGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Allowed Speed Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED_FEATURE_COUNT = TRIGGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Allowed Speed Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ALLOWED_SPEED_CHANGED_OPERATION_COUNT = TRIGGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutDirectionChangedImpl <em>Turnout Direction Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutDirectionChangedImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutDirectionChanged()
	 * @generated
	 */
	int TURNOUT_DIRECTION_CHANGED = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED__NAME = TRIGGER_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED__EXPRESSION = TRIGGER_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED__TURNOUT = TRIGGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Turnout Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED__NEW_TURNOUT_DIRECTION = TRIGGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout Direction Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED_FEATURE_COUNT = TRIGGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout Direction Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DIRECTION_CHANGED_OPERATION_COUNT = TRIGGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl <em>Next Track Element Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getNextTrackElementIs()
	 * @generated
	 */
	int NEXT_TRACK_ELEMENT_IS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Route Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Next Track Element Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Next Track Element Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TRACK_ELEMENT_IS_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl <em>Turnout Has Desired Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutHasDesiredDirection()
	 * @generated
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION__NAME = GUARD_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION__EXPRESSION = GUARD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT = GUARD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desired Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION = GUARD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout Has Desired Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION_FEATURE_COUNT = GUARD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout Has Desired Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_HAS_DESIRED_DIRECTION_OPERATION_COUNT = GUARD_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel <em>Behavioral Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Model</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel
	 * @generated
	 */
	EClass getStateMachineBehavioralModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel#getStatemachines <em>Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statemachines</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel#getStatemachines()
	 * @see #getStateMachineBehavioralModel()
	 * @generated
	 */
	EReference getStateMachineBehavioralModel_Statemachines();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getTriggers()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getGuards()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getActions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Actions();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active State</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getActiveState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ActiveState();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getReferredObject <em>Referred Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Object</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine#getReferredObject()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ReferredObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#isIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State#isIsActive()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsActive();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getSourceState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SourceState();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TargetState();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guard</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#isIsEnabled <em>Is Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enabled</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#isIsEnabled()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_IsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#isIsFireable <em>Is Fireable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fireable</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition#isIsFireable()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_IsFireable();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statemachine</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState#getStatemachine()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Statemachine();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed <em>Change Train Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Train Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed
	 * @generated
	 */
	EClass getChangeTrainHeadingSpeed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed#getTrain()
	 * @see #getChangeTrainHeadingSpeed()
	 * @generated
	 */
	EReference getChangeTrainHeadingSpeed_Train();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed#getNewHeadingSpeed <em>New Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed#getNewHeadingSpeed()
	 * @see #getChangeTrainHeadingSpeed()
	 * @generated
	 */
	EAttribute getChangeTrainHeadingSpeed_NewHeadingSpeed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed <em>Change Signal Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Signal Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed
	 * @generated
	 */
	EClass getChangeSignalAllowedSpeed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed#getSignal()
	 * @see #getChangeSignalAllowedSpeed()
	 * @generated
	 */
	EReference getChangeSignalAllowedSpeed_Signal();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed#getNewAllowedSpeed <em>New Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed#getNewAllowedSpeed()
	 * @see #getChangeSignalAllowedSpeed()
	 * @generated
	 */
	EAttribute getChangeSignalAllowedSpeed_NewAllowedSpeed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection <em>Change Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Turnout Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection
	 * @generated
	 */
	EClass getChangeTurnoutDirection();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection#getNewTurnoutDirection <em>New Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Turnout Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection#getNewTurnoutDirection()
	 * @see #getChangeTurnoutDirection()
	 * @generated
	 */
	EAttribute getChangeTurnoutDirection_NewTurnoutDirection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection#getTurnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection#getTurnout()
	 * @see #getChangeTurnoutDirection()
	 * @generated
	 */
	EReference getChangeTurnoutDirection_Turnout();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement <em>Change Train Current Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Train Current Track Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement
	 * @generated
	 */
	EClass getChangeTrainCurrentTrackElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement#getTrain()
	 * @see #getChangeTrainCurrentTrackElement()
	 * @generated
	 */
	EReference getChangeTrainCurrentTrackElement_Train();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement#getNewTrackElements <em>New Track Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Track Elements</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement#getNewTrackElements()
	 * @see #getChangeTrainCurrentTrackElement()
	 * @generated
	 */
	EReference getChangeTrainCurrentTrackElement_NewTrackElements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed <em>Train Current Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Current Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed
	 * @generated
	 */
	EClass getTrainCurrentHeadingSpeed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getTrain()
	 * @see #getTrainCurrentHeadingSpeed()
	 * @generated
	 */
	EReference getTrainCurrentHeadingSpeed_Train();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getCurrentHeadingSpeed <em>Current Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getCurrentHeadingSpeed()
	 * @see #getTrainCurrentHeadingSpeed()
	 * @generated
	 */
	EAttribute getTrainCurrentHeadingSpeed_CurrentHeadingSpeed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn <em>Train Currently Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Currently Stands On</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn
	 * @generated
	 */
	EClass getTrainCurrentlyStandsOn();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrain()
	 * @see #getTrainCurrentlyStandsOn()
	 * @generated
	 */
	EReference getTrainCurrentlyStandsOn_Train();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrackElements <em>Track Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Track Elements</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrackElements()
	 * @see #getTrainCurrentlyStandsOn()
	 * @generated
	 */
	EReference getTrainCurrentlyStandsOn_TrackElements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection <em>Turnout Current Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout Current Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection
	 * @generated
	 */
	EClass getTurnoutCurrentDirection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection#getTurnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection#getTurnout()
	 * @see #getTurnoutCurrentDirection()
	 * @generated
	 */
	EReference getTurnoutCurrentDirection_Turnout();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection#getCurrentTurnoutDirection <em>Current Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Turnout Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection#getCurrentTurnoutDirection()
	 * @see #getTurnoutCurrentDirection()
	 * @generated
	 */
	EAttribute getTurnoutCurrentDirection_CurrentTurnoutDirection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed <em>Signal Current Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Current Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed
	 * @generated
	 */
	EClass getSignalCurrentAllowedSpeed();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed#getCurrentAllowedSpeed <em>Current Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed#getCurrentAllowedSpeed()
	 * @see #getSignalCurrentAllowedSpeed()
	 * @generated
	 */
	EAttribute getSignalCurrentAllowedSpeed_CurrentAllowedSpeed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed#getSignal()
	 * @see #getSignalCurrentAllowedSpeed()
	 * @generated
	 */
	EReference getSignalCurrentAllowedSpeed_Signal();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged <em>Train Heading Speed Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Heading Speed Changed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged
	 * @generated
	 */
	EClass getTrainHeadingSpeedChanged();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged#getTrain()
	 * @see #getTrainHeadingSpeedChanged()
	 * @generated
	 */
	EReference getTrainHeadingSpeedChanged_Train();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged#getNewHeadingSpeed <em>New Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged#getNewHeadingSpeed()
	 * @see #getTrainHeadingSpeedChanged()
	 * @generated
	 */
	EAttribute getTrainHeadingSpeedChanged_NewHeadingSpeed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged <em>Train Track Element Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Track Element Changed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged
	 * @generated
	 */
	EClass getTrainTrackElementChanged();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged#getTrain()
	 * @see #getTrainTrackElementChanged()
	 * @generated
	 */
	EReference getTrainTrackElementChanged_Train();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged#getTrackElements <em>Track Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Track Elements</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged#getTrackElements()
	 * @see #getTrainTrackElementChanged()
	 * @generated
	 */
	EReference getTrainTrackElementChanged_TrackElements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged <em>Signal Allowed Speed Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Allowed Speed Changed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged
	 * @generated
	 */
	EClass getSignalAllowedSpeedChanged();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getSignal()
	 * @see #getSignalAllowedSpeedChanged()
	 * @generated
	 */
	EReference getSignalAllowedSpeedChanged_Signal();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getNewAllowedSpeed <em>New Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getNewAllowedSpeed()
	 * @see #getSignalAllowedSpeedChanged()
	 * @generated
	 */
	EAttribute getSignalAllowedSpeedChanged_NewAllowedSpeed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged <em>Turnout Direction Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout Direction Changed</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged
	 * @generated
	 */
	EClass getTurnoutDirectionChanged();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getTurnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getTurnout()
	 * @see #getTurnoutDirectionChanged()
	 * @generated
	 */
	EReference getTurnoutDirectionChanged_Turnout();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getNewTurnoutDirection <em>New Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Turnout Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getNewTurnoutDirection()
	 * @see #getTurnoutDirectionChanged()
	 * @generated
	 */
	EAttribute getTurnoutDirectionChanged_NewTurnoutDirection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs <em>Next Track Element Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Track Element Is</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs
	 * @generated
	 */
	EClass getNextTrackElementIs();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getRouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getRouteElement()
	 * @see #getNextTrackElementIs()
	 * @generated
	 */
	EReference getNextTrackElementIs_RouteElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getTrackElement <em>Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getTrackElement()
	 * @see #getNextTrackElementIs()
	 * @generated
	 */
	EReference getNextTrackElementIs_TrackElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection <em>Turnout Has Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout Has Desired Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection
	 * @generated
	 */
	EClass getTurnoutHasDesiredDirection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getTurnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getTurnout()
	 * @see #getTurnoutHasDesiredDirection()
	 * @generated
	 */
	EReference getTurnoutHasDesiredDirection_Turnout();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getDesiredDirection <em>Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desired Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getDesiredDirection()
	 * @see #getTurnoutHasDesiredDirection()
	 * @generated
	 */
	EReference getTurnoutHasDesiredDirection_DesiredDirection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression <em>Action Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression
	 * @generated
	 */
	EClass getActionExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression#getExpression()
	 * @see #getActionExpression()
	 * @generated
	 */
	EAttribute getActionExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression
	 * @generated
	 */
	EClass getGuardExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression#getExpression()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EAttribute getGuardExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression <em>Trigger Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression
	 * @generated
	 */
	EClass getTriggerExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression#getExpression()
	 * @see #getTriggerExpression()
	 * @generated
	 */
	EAttribute getTriggerExpression_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineFactory getStateMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineBehavioralModelImpl <em>Behavioral Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineBehavioralModelImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getStateMachineBehavioralModel()
		 * @generated
		 */
		EClass STATE_MACHINE_BEHAVIORAL_MODEL = eINSTANCE.getStateMachineBehavioralModel();

		/**
		 * The meta object literal for the '<em><b>Statemachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES = eINSTANCE.getStateMachineBehavioralModel_Statemachines();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRIGGERS = eINSTANCE.getStateMachine_Triggers();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__GUARDS = eINSTANCE.getStateMachine_Guards();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__ACTIONS = eINSTANCE.getStateMachine_Actions();

		/**
		 * The meta object literal for the '<em><b>Active State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__ACTIVE_STATE = eINSTANCE.getStateMachine_ActiveState();

		/**
		 * The meta object literal for the '<em><b>Referred Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REFERRED_OBJECT = eINSTANCE.getStateMachine_ReferredObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_ACTIVE = eINSTANCE.getState_IsActive();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__IS_ENABLED = eINSTANCE.getTransition_IsEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Fireable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__IS_FIREABLE = eINSTANCE.getTransition_IsFireable();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.CompositeStateImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__STATEMACHINE = eINSTANCE.getCompositeState_Statemachine();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainHeadingSpeedImpl <em>Change Train Heading Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainHeadingSpeedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTrainHeadingSpeed()
		 * @generated
		 */
		EClass CHANGE_TRAIN_HEADING_SPEED = eINSTANCE.getChangeTrainHeadingSpeed();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TRAIN_HEADING_SPEED__TRAIN = eINSTANCE.getChangeTrainHeadingSpeed_Train();

		/**
		 * The meta object literal for the '<em><b>New Heading Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TRAIN_HEADING_SPEED__NEW_HEADING_SPEED = eINSTANCE.getChangeTrainHeadingSpeed_NewHeadingSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl <em>Change Signal Allowed Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeSignalAllowedSpeed()
		 * @generated
		 */
		EClass CHANGE_SIGNAL_ALLOWED_SPEED = eINSTANCE.getChangeSignalAllowedSpeed();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL = eINSTANCE.getChangeSignalAllowedSpeed_Signal();

		/**
		 * The meta object literal for the '<em><b>New Allowed Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED = eINSTANCE.getChangeSignalAllowedSpeed_NewAllowedSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl <em>Change Turnout Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTurnoutDirection()
		 * @generated
		 */
		EClass CHANGE_TURNOUT_DIRECTION = eINSTANCE.getChangeTurnoutDirection();

		/**
		 * The meta object literal for the '<em><b>New Turnout Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION = eINSTANCE.getChangeTurnoutDirection_NewTurnoutDirection();

		/**
		 * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TURNOUT_DIRECTION__TURNOUT = eINSTANCE.getChangeTurnoutDirection_Turnout();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl <em>Change Train Current Track Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getChangeTrainCurrentTrackElement()
		 * @generated
		 */
		EClass CHANGE_TRAIN_CURRENT_TRACK_ELEMENT = eINSTANCE.getChangeTrainCurrentTrackElement();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN = eINSTANCE.getChangeTrainCurrentTrackElement_Train();

		/**
		 * The meta object literal for the '<em><b>New Track Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS = eINSTANCE.getChangeTrainCurrentTrackElement_NewTrackElements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentHeadingSpeedImpl <em>Train Current Heading Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentHeadingSpeedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainCurrentHeadingSpeed()
		 * @generated
		 */
		EClass TRAIN_CURRENT_HEADING_SPEED = eINSTANCE.getTrainCurrentHeadingSpeed();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_CURRENT_HEADING_SPEED__TRAIN = eINSTANCE.getTrainCurrentHeadingSpeed_Train();

		/**
		 * The meta object literal for the '<em><b>Current Heading Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_CURRENT_HEADING_SPEED__CURRENT_HEADING_SPEED = eINSTANCE.getTrainCurrentHeadingSpeed_CurrentHeadingSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl <em>Train Currently Stands On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainCurrentlyStandsOn()
		 * @generated
		 */
		EClass TRAIN_CURRENTLY_STANDS_ON = eINSTANCE.getTrainCurrentlyStandsOn();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_CURRENTLY_STANDS_ON__TRAIN = eINSTANCE.getTrainCurrentlyStandsOn_Train();

		/**
		 * The meta object literal for the '<em><b>Track Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS = eINSTANCE.getTrainCurrentlyStandsOn_TrackElements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl <em>Turnout Current Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutCurrentDirection()
		 * @generated
		 */
		EClass TURNOUT_CURRENT_DIRECTION = eINSTANCE.getTurnoutCurrentDirection();

		/**
		 * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_CURRENT_DIRECTION__TURNOUT = eINSTANCE.getTurnoutCurrentDirection_Turnout();

		/**
		 * The meta object literal for the '<em><b>Current Turnout Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION = eINSTANCE.getTurnoutCurrentDirection_CurrentTurnoutDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl <em>Signal Current Allowed Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getSignalCurrentAllowedSpeed()
		 * @generated
		 */
		EClass SIGNAL_CURRENT_ALLOWED_SPEED = eINSTANCE.getSignalCurrentAllowedSpeed();

		/**
		 * The meta object literal for the '<em><b>Current Allowed Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED = eINSTANCE.getSignalCurrentAllowedSpeed_CurrentAllowedSpeed();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL = eINSTANCE.getSignalCurrentAllowedSpeed_Signal();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl <em>Train Heading Speed Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainHeadingSpeedChanged()
		 * @generated
		 */
		EClass TRAIN_HEADING_SPEED_CHANGED = eINSTANCE.getTrainHeadingSpeedChanged();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_HEADING_SPEED_CHANGED__TRAIN = eINSTANCE.getTrainHeadingSpeedChanged_Train();

		/**
		 * The meta object literal for the '<em><b>New Heading Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED = eINSTANCE.getTrainHeadingSpeedChanged_NewHeadingSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainTrackElementChangedImpl <em>Train Track Element Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainTrackElementChangedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTrainTrackElementChanged()
		 * @generated
		 */
		EClass TRAIN_TRACK_ELEMENT_CHANGED = eINSTANCE.getTrainTrackElementChanged();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TRACK_ELEMENT_CHANGED__TRAIN = eINSTANCE.getTrainTrackElementChanged_Train();

		/**
		 * The meta object literal for the '<em><b>Track Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TRACK_ELEMENT_CHANGED__TRACK_ELEMENTS = eINSTANCE.getTrainTrackElementChanged_TrackElements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalAllowedSpeedChangedImpl <em>Signal Allowed Speed Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalAllowedSpeedChangedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getSignalAllowedSpeedChanged()
		 * @generated
		 */
		EClass SIGNAL_ALLOWED_SPEED_CHANGED = eINSTANCE.getSignalAllowedSpeedChanged();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ALLOWED_SPEED_CHANGED__SIGNAL = eINSTANCE.getSignalAllowedSpeedChanged_Signal();

		/**
		 * The meta object literal for the '<em><b>New Allowed Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ALLOWED_SPEED_CHANGED__NEW_ALLOWED_SPEED = eINSTANCE.getSignalAllowedSpeedChanged_NewAllowedSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutDirectionChangedImpl <em>Turnout Direction Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutDirectionChangedImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutDirectionChanged()
		 * @generated
		 */
		EClass TURNOUT_DIRECTION_CHANGED = eINSTANCE.getTurnoutDirectionChanged();

		/**
		 * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_DIRECTION_CHANGED__TURNOUT = eINSTANCE.getTurnoutDirectionChanged_Turnout();

		/**
		 * The meta object literal for the '<em><b>New Turnout Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT_DIRECTION_CHANGED__NEW_TURNOUT_DIRECTION = eINSTANCE.getTurnoutDirectionChanged_NewTurnoutDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl <em>Next Track Element Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getNextTrackElementIs()
		 * @generated
		 */
		EClass NEXT_TRACK_ELEMENT_IS = eINSTANCE.getNextTrackElementIs();

		/**
		 * The meta object literal for the '<em><b>Route Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT = eINSTANCE.getNextTrackElementIs_RouteElement();

		/**
		 * The meta object literal for the '<em><b>Track Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT = eINSTANCE.getNextTrackElementIs_TrackElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl <em>Turnout Has Desired Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTurnoutHasDesiredDirection()
		 * @generated
		 */
		EClass TURNOUT_HAS_DESIRED_DIRECTION = eINSTANCE.getTurnoutHasDesiredDirection();

		/**
		 * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT = eINSTANCE.getTurnoutHasDesiredDirection_Turnout();

		/**
		 * The meta object literal for the '<em><b>Desired Direction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION = eINSTANCE.getTurnoutHasDesiredDirection_DesiredDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ActionExpressionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getActionExpression()
		 * @generated
		 */
		EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_EXPRESSION__EXPRESSION = eINSTANCE.getActionExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.GuardExpressionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getGuardExpression()
		 * @generated
		 */
		EClass GUARD_EXPRESSION = eINSTANCE.getGuardExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_EXPRESSION__EXPRESSION = eINSTANCE.getGuardExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerExpressionImpl <em>Trigger Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TriggerExpressionImpl
		 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachinePackageImpl#getTriggerExpression()
		 * @generated
		 */
		EClass TRIGGER_EXPRESSION = eINSTANCE.getTriggerExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_EXPRESSION__EXPRESSION = eINSTANCE.getTriggerExpression_Expression();

	}

} //StateMachinePackage
