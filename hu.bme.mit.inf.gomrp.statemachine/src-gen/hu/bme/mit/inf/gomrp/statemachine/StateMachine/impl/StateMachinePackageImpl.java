/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.State;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineFactory;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachinePackageImpl extends EPackageImpl implements StateMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineBehavioralModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTrainHeadingSpeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeSignalAllowedSpeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTurnoutDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTrainCurrentTrackElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainCurrentHeadingSpeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainCurrentlyStandsOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutCurrentDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalCurrentAllowedSpeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainHeadingSpeedChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainTrackElementChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAllowedSpeedChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutDirectionChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextTrackElementIsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutHasDesiredDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerExpressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachinePackageImpl() {
		super(eNS_URI, StateMachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StateMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachinePackage init() {
		if (isInited) return (StateMachinePackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinePackage.eNS_URI);

		// Obtain or create and register package
		StateMachinePackageImpl theStateMachinePackage = (StateMachinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateMachinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateMachinePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RDMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStateMachinePackage.createPackageContents();

		// Initialize created meta-data
		theStateMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateMachinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachinePackage.eNS_URI, theStateMachinePackage);
		return theStateMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineBehavioralModel() {
		return stateMachineBehavioralModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachineBehavioralModel_Statemachines() {
		return (EReference)stateMachineBehavioralModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_States() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Transitions() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Triggers() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Guards() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Actions() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ActiveState() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ReferredObject() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutgoingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IncomingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsInitial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsActive() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_SourceState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TargetState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Action() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_IsEnabled() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_IsFireable() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeState() {
		return compositeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeState_Statemachine() {
		return (EReference)compositeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeTrainHeadingSpeed() {
		return changeTrainHeadingSpeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeTrainHeadingSpeed_Train() {
		return (EReference)changeTrainHeadingSpeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeTrainHeadingSpeed_NewHeadingSpeed() {
		return (EAttribute)changeTrainHeadingSpeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeSignalAllowedSpeed() {
		return changeSignalAllowedSpeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeSignalAllowedSpeed_Signal() {
		return (EReference)changeSignalAllowedSpeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeSignalAllowedSpeed_NewAllowedSpeed() {
		return (EAttribute)changeSignalAllowedSpeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeTurnoutDirection() {
		return changeTurnoutDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeTurnoutDirection_NewTurnoutDirection() {
		return (EAttribute)changeTurnoutDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeTurnoutDirection_Turnout() {
		return (EReference)changeTurnoutDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeTrainCurrentTrackElement() {
		return changeTrainCurrentTrackElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeTrainCurrentTrackElement_Train() {
		return (EReference)changeTrainCurrentTrackElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeTrainCurrentTrackElement_NewTrackElements() {
		return (EReference)changeTrainCurrentTrackElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainCurrentHeadingSpeed() {
		return trainCurrentHeadingSpeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainCurrentHeadingSpeed_Train() {
		return (EReference)trainCurrentHeadingSpeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainCurrentHeadingSpeed_CurrentHeadingSpeed() {
		return (EAttribute)trainCurrentHeadingSpeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainCurrentlyStandsOn() {
		return trainCurrentlyStandsOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainCurrentlyStandsOn_Train() {
		return (EReference)trainCurrentlyStandsOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainCurrentlyStandsOn_TrackElements() {
		return (EReference)trainCurrentlyStandsOnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnoutCurrentDirection() {
		return turnoutCurrentDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutCurrentDirection_Turnout() {
		return (EReference)turnoutCurrentDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnoutCurrentDirection_CurrentTurnoutDirection() {
		return (EAttribute)turnoutCurrentDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalCurrentAllowedSpeed() {
		return signalCurrentAllowedSpeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalCurrentAllowedSpeed_CurrentAllowedSpeed() {
		return (EAttribute)signalCurrentAllowedSpeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalCurrentAllowedSpeed_Signal() {
		return (EReference)signalCurrentAllowedSpeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainHeadingSpeedChanged() {
		return trainHeadingSpeedChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainHeadingSpeedChanged_Train() {
		return (EReference)trainHeadingSpeedChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainHeadingSpeedChanged_NewHeadingSpeed() {
		return (EAttribute)trainHeadingSpeedChangedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTrackElementChanged() {
		return trainTrackElementChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTrackElementChanged_Train() {
		return (EReference)trainTrackElementChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTrackElementChanged_TrackElements() {
		return (EReference)trainTrackElementChangedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAllowedSpeedChanged() {
		return signalAllowedSpeedChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAllowedSpeedChanged_Signal() {
		return (EReference)signalAllowedSpeedChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalAllowedSpeedChanged_NewAllowedSpeed() {
		return (EAttribute)signalAllowedSpeedChangedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnoutDirectionChanged() {
		return turnoutDirectionChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutDirectionChanged_Turnout() {
		return (EReference)turnoutDirectionChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnoutDirectionChanged_NewTurnoutDirection() {
		return (EAttribute)turnoutDirectionChangedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextTrackElementIs() {
		return nextTrackElementIsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextTrackElementIs_RouteElement() {
		return (EReference)nextTrackElementIsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextTrackElementIs_TrackElement() {
		return (EReference)nextTrackElementIsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnoutHasDesiredDirection() {
		return turnoutHasDesiredDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutHasDesiredDirection_Turnout() {
		return (EReference)turnoutHasDesiredDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutHasDesiredDirection_DesiredDirection() {
		return (EReference)turnoutHasDesiredDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExpression() {
		return actionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionExpression_Expression() {
		return (EAttribute)actionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardExpression() {
		return guardExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardExpression_Expression() {
		return (EAttribute)guardExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerExpression() {
		return triggerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerExpression_Expression() {
		return (EAttribute)triggerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineFactory getStateMachineFactory() {
		return (StateMachineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateMachineBehavioralModelEClass = createEClass(STATE_MACHINE_BEHAVIORAL_MODEL);
		createEReference(stateMachineBehavioralModelEClass, STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATES);
		createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__TRIGGERS);
		createEReference(stateMachineEClass, STATE_MACHINE__GUARDS);
		createEReference(stateMachineEClass, STATE_MACHINE__ACTIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__ACTIVE_STATE);
		createEReference(stateMachineEClass, STATE_MACHINE__REFERRED_OBJECT);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
		createEReference(stateEClass, STATE__INCOMING_TRANSITIONS);
		createEAttribute(stateEClass, STATE__IS_INITIAL);
		createEAttribute(stateEClass, STATE__IS_ACTIVE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE_STATE);
		createEReference(transitionEClass, TRANSITION__TARGET_STATE);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__ACTION);
		createEAttribute(transitionEClass, TRANSITION__IS_ENABLED);
		createEAttribute(transitionEClass, TRANSITION__IS_FIREABLE);

		compositeStateEClass = createEClass(COMPOSITE_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__STATEMACHINE);

		triggerEClass = createEClass(TRIGGER);

		guardEClass = createEClass(GUARD);

		actionEClass = createEClass(ACTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		changeTrainHeadingSpeedEClass = createEClass(CHANGE_TRAIN_HEADING_SPEED);
		createEReference(changeTrainHeadingSpeedEClass, CHANGE_TRAIN_HEADING_SPEED__TRAIN);
		createEAttribute(changeTrainHeadingSpeedEClass, CHANGE_TRAIN_HEADING_SPEED__NEW_HEADING_SPEED);

		changeSignalAllowedSpeedEClass = createEClass(CHANGE_SIGNAL_ALLOWED_SPEED);
		createEReference(changeSignalAllowedSpeedEClass, CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL);
		createEAttribute(changeSignalAllowedSpeedEClass, CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED);

		changeTurnoutDirectionEClass = createEClass(CHANGE_TURNOUT_DIRECTION);
		createEAttribute(changeTurnoutDirectionEClass, CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION);
		createEReference(changeTurnoutDirectionEClass, CHANGE_TURNOUT_DIRECTION__TURNOUT);

		changeTrainCurrentTrackElementEClass = createEClass(CHANGE_TRAIN_CURRENT_TRACK_ELEMENT);
		createEReference(changeTrainCurrentTrackElementEClass, CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN);
		createEReference(changeTrainCurrentTrackElementEClass, CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS);

		trainCurrentHeadingSpeedEClass = createEClass(TRAIN_CURRENT_HEADING_SPEED);
		createEReference(trainCurrentHeadingSpeedEClass, TRAIN_CURRENT_HEADING_SPEED__TRAIN);
		createEAttribute(trainCurrentHeadingSpeedEClass, TRAIN_CURRENT_HEADING_SPEED__CURRENT_HEADING_SPEED);

		trainCurrentlyStandsOnEClass = createEClass(TRAIN_CURRENTLY_STANDS_ON);
		createEReference(trainCurrentlyStandsOnEClass, TRAIN_CURRENTLY_STANDS_ON__TRAIN);
		createEReference(trainCurrentlyStandsOnEClass, TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS);

		turnoutCurrentDirectionEClass = createEClass(TURNOUT_CURRENT_DIRECTION);
		createEReference(turnoutCurrentDirectionEClass, TURNOUT_CURRENT_DIRECTION__TURNOUT);
		createEAttribute(turnoutCurrentDirectionEClass, TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION);

		signalCurrentAllowedSpeedEClass = createEClass(SIGNAL_CURRENT_ALLOWED_SPEED);
		createEAttribute(signalCurrentAllowedSpeedEClass, SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED);
		createEReference(signalCurrentAllowedSpeedEClass, SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL);

		trainHeadingSpeedChangedEClass = createEClass(TRAIN_HEADING_SPEED_CHANGED);
		createEReference(trainHeadingSpeedChangedEClass, TRAIN_HEADING_SPEED_CHANGED__TRAIN);
		createEAttribute(trainHeadingSpeedChangedEClass, TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED);

		trainTrackElementChangedEClass = createEClass(TRAIN_TRACK_ELEMENT_CHANGED);
		createEReference(trainTrackElementChangedEClass, TRAIN_TRACK_ELEMENT_CHANGED__TRAIN);
		createEReference(trainTrackElementChangedEClass, TRAIN_TRACK_ELEMENT_CHANGED__TRACK_ELEMENTS);

		signalAllowedSpeedChangedEClass = createEClass(SIGNAL_ALLOWED_SPEED_CHANGED);
		createEReference(signalAllowedSpeedChangedEClass, SIGNAL_ALLOWED_SPEED_CHANGED__SIGNAL);
		createEAttribute(signalAllowedSpeedChangedEClass, SIGNAL_ALLOWED_SPEED_CHANGED__NEW_ALLOWED_SPEED);

		turnoutDirectionChangedEClass = createEClass(TURNOUT_DIRECTION_CHANGED);
		createEReference(turnoutDirectionChangedEClass, TURNOUT_DIRECTION_CHANGED__TURNOUT);
		createEAttribute(turnoutDirectionChangedEClass, TURNOUT_DIRECTION_CHANGED__NEW_TURNOUT_DIRECTION);

		nextTrackElementIsEClass = createEClass(NEXT_TRACK_ELEMENT_IS);
		createEReference(nextTrackElementIsEClass, NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT);
		createEReference(nextTrackElementIsEClass, NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT);

		turnoutHasDesiredDirectionEClass = createEClass(TURNOUT_HAS_DESIRED_DIRECTION);
		createEReference(turnoutHasDesiredDirectionEClass, TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT);
		createEReference(turnoutHasDesiredDirectionEClass, TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION);

		actionExpressionEClass = createEClass(ACTION_EXPRESSION);
		createEAttribute(actionExpressionEClass, ACTION_EXPRESSION__EXPRESSION);

		guardExpressionEClass = createEClass(GUARD_EXPRESSION);
		createEAttribute(guardExpressionEClass, GUARD_EXPRESSION__EXPRESSION);

		triggerExpressionEClass = createEClass(TRIGGER_EXPRESSION);
		createEAttribute(triggerExpressionEClass, TRIGGER_EXPRESSION__EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RDMPackage theRDMPackage = (RDMPackage)EPackage.Registry.INSTANCE.getEPackage(RDMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateMachineEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		compositeStateEClass.getESuperTypes().add(this.getState());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		guardEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		changeTrainHeadingSpeedEClass.getESuperTypes().add(this.getActionExpression());
		changeSignalAllowedSpeedEClass.getESuperTypes().add(this.getActionExpression());
		changeTurnoutDirectionEClass.getESuperTypes().add(this.getActionExpression());
		changeTrainCurrentTrackElementEClass.getESuperTypes().add(this.getActionExpression());
		trainCurrentHeadingSpeedEClass.getESuperTypes().add(this.getGuardExpression());
		trainCurrentlyStandsOnEClass.getESuperTypes().add(this.getGuardExpression());
		turnoutCurrentDirectionEClass.getESuperTypes().add(this.getGuardExpression());
		signalCurrentAllowedSpeedEClass.getESuperTypes().add(this.getGuardExpression());
		trainHeadingSpeedChangedEClass.getESuperTypes().add(this.getTriggerExpression());
		trainTrackElementChangedEClass.getESuperTypes().add(this.getTriggerExpression());
		signalAllowedSpeedChangedEClass.getESuperTypes().add(this.getTriggerExpression());
		turnoutDirectionChangedEClass.getESuperTypes().add(this.getTriggerExpression());
		nextTrackElementIsEClass.getESuperTypes().add(this.getGuardExpression());
		turnoutHasDesiredDirectionEClass.getESuperTypes().add(this.getGuardExpression());
		actionExpressionEClass.getESuperTypes().add(this.getAction());
		guardExpressionEClass.getESuperTypes().add(this.getGuard());
		triggerExpressionEClass.getESuperTypes().add(this.getTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachineBehavioralModelEClass, StateMachineBehavioralModel.class, "StateMachineBehavioralModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachineBehavioralModel_Statemachines(), this.getStateMachine(), null, "statemachines", null, 0, -1, StateMachineBehavioralModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Guards(), this.getGuard(), null, "guards", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Actions(), this.getAction(), null, "actions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_ActiveState(), this.getState(), null, "activeState", null, 0, 1, StateMachine.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_ReferredObject(), theRDMPackage.getRDMElement(), null, "referredObject", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_OutgoingTransitions(), this.getTransition(), this.getTransition_SourceState(), "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_IncomingTransitions(), this.getTransition(), this.getTransition_TargetState(), "incomingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsActive(), ecorePackage.getEBoolean(), "isActive", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_SourceState(), this.getState(), this.getState_OutgoingTransitions(), "sourceState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TargetState(), this.getState(), this.getState_IncomingTransitions(), "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), this.getGuard(), null, "guard", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Action(), this.getAction(), null, "action", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_IsEnabled(), ecorePackage.getEBoolean(), "isEnabled", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_IsFireable(), ecorePackage.getEBoolean(), "isFireable", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeStateEClass, CompositeState.class, "CompositeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeState_Statemachine(), this.getStateMachine(), null, "statemachine", null, 1, 1, CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guardEClass, Guard.class, "Guard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeTrainHeadingSpeedEClass, ChangeTrainHeadingSpeed.class, "ChangeTrainHeadingSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeTrainHeadingSpeed_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, ChangeTrainHeadingSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeTrainHeadingSpeed_NewHeadingSpeed(), theRDMPackage.getSpeed(), "newHeadingSpeed", "ZERO", 0, 1, ChangeTrainHeadingSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeSignalAllowedSpeedEClass, ChangeSignalAllowedSpeed.class, "ChangeSignalAllowedSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeSignalAllowedSpeed_Signal(), theRDMPackage.getSignal(), null, "signal", null, 0, 1, ChangeSignalAllowedSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeSignalAllowedSpeed_NewAllowedSpeed(), theRDMPackage.getSpeed(), "newAllowedSpeed", null, 0, 1, ChangeSignalAllowedSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeTurnoutDirectionEClass, ChangeTurnoutDirection.class, "ChangeTurnoutDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeTurnoutDirection_NewTurnoutDirection(), theRDMPackage.getTurnoutDirection(), "newTurnoutDirection", null, 0, 1, ChangeTurnoutDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeTurnoutDirection_Turnout(), theRDMPackage.getTurnout(), null, "turnout", null, 0, 1, ChangeTurnoutDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeTrainCurrentTrackElementEClass, ChangeTrainCurrentTrackElement.class, "ChangeTrainCurrentTrackElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeTrainCurrentTrackElement_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, ChangeTrainCurrentTrackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeTrainCurrentTrackElement_NewTrackElements(), theRDMPackage.getTrackElement(), null, "newTrackElements", null, 0, 2, ChangeTrainCurrentTrackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainCurrentHeadingSpeedEClass, TrainCurrentHeadingSpeed.class, "TrainCurrentHeadingSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainCurrentHeadingSpeed_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, TrainCurrentHeadingSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainCurrentHeadingSpeed_CurrentHeadingSpeed(), theRDMPackage.getSpeed(), "currentHeadingSpeed", null, 0, 1, TrainCurrentHeadingSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainCurrentlyStandsOnEClass, TrainCurrentlyStandsOn.class, "TrainCurrentlyStandsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainCurrentlyStandsOn_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, TrainCurrentlyStandsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainCurrentlyStandsOn_TrackElements(), theRDMPackage.getTrackElement(), null, "trackElements", null, 0, 2, TrainCurrentlyStandsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnoutCurrentDirectionEClass, TurnoutCurrentDirection.class, "TurnoutCurrentDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnoutCurrentDirection_Turnout(), theRDMPackage.getTurnout(), null, "turnout", null, 0, 1, TurnoutCurrentDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnoutCurrentDirection_CurrentTurnoutDirection(), theRDMPackage.getTurnoutDirection(), "currentTurnoutDirection", null, 0, 1, TurnoutCurrentDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalCurrentAllowedSpeedEClass, SignalCurrentAllowedSpeed.class, "SignalCurrentAllowedSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalCurrentAllowedSpeed_CurrentAllowedSpeed(), theRDMPackage.getSpeed(), "currentAllowedSpeed", null, 0, 1, SignalCurrentAllowedSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalCurrentAllowedSpeed_Signal(), theRDMPackage.getSignal(), null, "signal", null, 0, 1, SignalCurrentAllowedSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainHeadingSpeedChangedEClass, TrainHeadingSpeedChanged.class, "TrainHeadingSpeedChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainHeadingSpeedChanged_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, TrainHeadingSpeedChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainHeadingSpeedChanged_NewHeadingSpeed(), theRDMPackage.getSpeed(), "newHeadingSpeed", null, 0, 1, TrainHeadingSpeedChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainTrackElementChangedEClass, TrainTrackElementChanged.class, "TrainTrackElementChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainTrackElementChanged_Train(), theRDMPackage.getTrain(), null, "train", null, 0, 1, TrainTrackElementChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainTrackElementChanged_TrackElements(), theRDMPackage.getTrackElement(), null, "trackElements", null, 0, 2, TrainTrackElementChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAllowedSpeedChangedEClass, SignalAllowedSpeedChanged.class, "SignalAllowedSpeedChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAllowedSpeedChanged_Signal(), theRDMPackage.getSignal(), null, "signal", null, 0, 1, SignalAllowedSpeedChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalAllowedSpeedChanged_NewAllowedSpeed(), theRDMPackage.getSpeed(), "newAllowedSpeed", null, 0, 1, SignalAllowedSpeedChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnoutDirectionChangedEClass, TurnoutDirectionChanged.class, "TurnoutDirectionChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnoutDirectionChanged_Turnout(), theRDMPackage.getTurnout(), null, "turnout", null, 0, 1, TurnoutDirectionChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnoutDirectionChanged_NewTurnoutDirection(), theRDMPackage.getTurnoutDirection(), "newTurnoutDirection", null, 0, 1, TurnoutDirectionChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextTrackElementIsEClass, NextTrackElementIs.class, "NextTrackElementIs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNextTrackElementIs_RouteElement(), theRDMPackage.getRouteElement(), null, "routeElement", null, 0, 1, NextTrackElementIs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNextTrackElementIs_TrackElement(), theRDMPackage.getTrackElement(), null, "trackElement", null, 0, 1, NextTrackElementIs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnoutHasDesiredDirectionEClass, TurnoutHasDesiredDirection.class, "TurnoutHasDesiredDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnoutHasDesiredDirection_Turnout(), theRDMPackage.getTurnout(), null, "turnout", null, 0, 1, TurnoutHasDesiredDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurnoutHasDesiredDirection_DesiredDirection(), theRDMPackage.getTurnoutDesiredDirection(), null, "desiredDirection", null, 0, 1, TurnoutHasDesiredDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionExpressionEClass, ActionExpression.class, "ActionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ActionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardExpressionEClass, GuardExpression.class, "GuardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuardExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerExpressionEClass, TriggerExpression.class, "TriggerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, TriggerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// org.eclipse.incquery.querybasedfeature
		createOrgAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "org.eclipse.incquery.querybasedfeature"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.incquery.querybasedfeature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.incquery.querybasedfeature";	
		addAnnotation
		  (getStateMachine_ActiveState(), 
		   source, 
		   new String[] {
			 "patternFQN", "hu.bme.mit.inf.gomrp.statemachine.incquery.activeState"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (compositeStateEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //StateMachinePackageImpl
