/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineFactoryImpl extends EFactoryImpl implements StateMachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineFactory init() {
		try {
			StateMachineFactory theStateMachineFactory = (StateMachineFactory)EPackage.Registry.INSTANCE.getEFactory(StateMachinePackage.eNS_URI);
			if (theStateMachineFactory != null) {
				return theStateMachineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateMachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL: return createStateMachineBehavioralModel();
			case StateMachinePackage.STATE_MACHINE: return createStateMachine();
			case StateMachinePackage.STATE: return createState();
			case StateMachinePackage.TRANSITION: return createTransition();
			case StateMachinePackage.COMPOSITE_STATE: return createCompositeState();
			case StateMachinePackage.CHANGE_TRAIN_HEADING_SPEED: return createChangeTrainHeadingSpeed();
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED: return createChangeSignalAllowedSpeed();
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION: return createChangeTurnoutDirection();
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT: return createChangeTrainCurrentTrackElement();
			case StateMachinePackage.TRAIN_CURRENT_HEADING_SPEED: return createTrainCurrentHeadingSpeed();
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON: return createTrainCurrentlyStandsOn();
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION: return createTurnoutCurrentDirection();
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED: return createSignalCurrentAllowedSpeed();
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED: return createTrainHeadingSpeedChanged();
			case StateMachinePackage.TRAIN_TRACK_ELEMENT_CHANGED: return createTrainTrackElementChanged();
			case StateMachinePackage.SIGNAL_ALLOWED_SPEED_CHANGED: return createSignalAllowedSpeedChanged();
			case StateMachinePackage.TURNOUT_DIRECTION_CHANGED: return createTurnoutDirectionChanged();
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS: return createNextTrackElementIs();
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION: return createTurnoutHasDesiredDirection();
			case StateMachinePackage.ACTION_EXPRESSION: return createActionExpression();
			case StateMachinePackage.GUARD_EXPRESSION: return createGuardExpression();
			case StateMachinePackage.TRIGGER_EXPRESSION: return createTriggerExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineBehavioralModel createStateMachineBehavioralModel() {
		StateMachineBehavioralModelImpl stateMachineBehavioralModel = new StateMachineBehavioralModelImpl();
		return stateMachineBehavioralModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrainHeadingSpeed createChangeTrainHeadingSpeed() {
		ChangeTrainHeadingSpeedImpl changeTrainHeadingSpeed = new ChangeTrainHeadingSpeedImpl();
		return changeTrainHeadingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSignalAllowedSpeed createChangeSignalAllowedSpeed() {
		ChangeSignalAllowedSpeedImpl changeSignalAllowedSpeed = new ChangeSignalAllowedSpeedImpl();
		return changeSignalAllowedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTurnoutDirection createChangeTurnoutDirection() {
		ChangeTurnoutDirectionImpl changeTurnoutDirection = new ChangeTurnoutDirectionImpl();
		return changeTurnoutDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrainCurrentTrackElement createChangeTrainCurrentTrackElement() {
		ChangeTrainCurrentTrackElementImpl changeTrainCurrentTrackElement = new ChangeTrainCurrentTrackElementImpl();
		return changeTrainCurrentTrackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainCurrentHeadingSpeed createTrainCurrentHeadingSpeed() {
		TrainCurrentHeadingSpeedImpl trainCurrentHeadingSpeed = new TrainCurrentHeadingSpeedImpl();
		return trainCurrentHeadingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainCurrentlyStandsOn createTrainCurrentlyStandsOn() {
		TrainCurrentlyStandsOnImpl trainCurrentlyStandsOn = new TrainCurrentlyStandsOnImpl();
		return trainCurrentlyStandsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutCurrentDirection createTurnoutCurrentDirection() {
		TurnoutCurrentDirectionImpl turnoutCurrentDirection = new TurnoutCurrentDirectionImpl();
		return turnoutCurrentDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalCurrentAllowedSpeed createSignalCurrentAllowedSpeed() {
		SignalCurrentAllowedSpeedImpl signalCurrentAllowedSpeed = new SignalCurrentAllowedSpeedImpl();
		return signalCurrentAllowedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainHeadingSpeedChanged createTrainHeadingSpeedChanged() {
		TrainHeadingSpeedChangedImpl trainHeadingSpeedChanged = new TrainHeadingSpeedChangedImpl();
		return trainHeadingSpeedChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTrackElementChanged createTrainTrackElementChanged() {
		TrainTrackElementChangedImpl trainTrackElementChanged = new TrainTrackElementChangedImpl();
		return trainTrackElementChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalAllowedSpeedChanged createSignalAllowedSpeedChanged() {
		SignalAllowedSpeedChangedImpl signalAllowedSpeedChanged = new SignalAllowedSpeedChangedImpl();
		return signalAllowedSpeedChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirectionChanged createTurnoutDirectionChanged() {
		TurnoutDirectionChangedImpl turnoutDirectionChanged = new TurnoutDirectionChangedImpl();
		return turnoutDirectionChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextTrackElementIs createNextTrackElementIs() {
		NextTrackElementIsImpl nextTrackElementIs = new NextTrackElementIsImpl();
		return nextTrackElementIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutHasDesiredDirection createTurnoutHasDesiredDirection() {
		TurnoutHasDesiredDirectionImpl turnoutHasDesiredDirection = new TurnoutHasDesiredDirectionImpl();
		return turnoutHasDesiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExpression createActionExpression() {
		ActionExpressionImpl actionExpression = new ActionExpressionImpl();
		return actionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardExpression createGuardExpression() {
		GuardExpressionImpl guardExpression = new GuardExpressionImpl();
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerExpression createTriggerExpression() {
		TriggerExpressionImpl triggerExpression = new TriggerExpressionImpl();
		return triggerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachinePackage getStateMachinePackage() {
		return (StateMachinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateMachinePackage getPackage() {
		return StateMachinePackage.eINSTANCE;
	}

} //StateMachineFactoryImpl
