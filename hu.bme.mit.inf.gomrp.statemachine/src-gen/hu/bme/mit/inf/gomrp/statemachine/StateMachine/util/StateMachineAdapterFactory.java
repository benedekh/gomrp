/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.util;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage
 * @generated
 */
public class StateMachineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateMachinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StateMachinePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineSwitch<Adapter> modelSwitch =
		new StateMachineSwitch<Adapter>() {
			@Override
			public Adapter caseStateMachineBehavioralModel(StateMachineBehavioralModel object) {
				return createStateMachineBehavioralModelAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseCompositeState(CompositeState object) {
				return createCompositeStateAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseChangeTrainHeadingSpeed(ChangeTrainHeadingSpeed object) {
				return createChangeTrainHeadingSpeedAdapter();
			}
			@Override
			public Adapter caseChangeSignalAllowedSpeed(ChangeSignalAllowedSpeed object) {
				return createChangeSignalAllowedSpeedAdapter();
			}
			@Override
			public Adapter caseChangeTurnoutDirection(ChangeTurnoutDirection object) {
				return createChangeTurnoutDirectionAdapter();
			}
			@Override
			public Adapter caseChangeTrainCurrentTrackElement(ChangeTrainCurrentTrackElement object) {
				return createChangeTrainCurrentTrackElementAdapter();
			}
			@Override
			public Adapter caseTrainCurrentHeadingSpeed(TrainCurrentHeadingSpeed object) {
				return createTrainCurrentHeadingSpeedAdapter();
			}
			@Override
			public Adapter caseTrainCurrentlyStandsOn(TrainCurrentlyStandsOn object) {
				return createTrainCurrentlyStandsOnAdapter();
			}
			@Override
			public Adapter caseTurnoutCurrentDirection(TurnoutCurrentDirection object) {
				return createTurnoutCurrentDirectionAdapter();
			}
			@Override
			public Adapter caseSignalCurrentAllowedSpeed(SignalCurrentAllowedSpeed object) {
				return createSignalCurrentAllowedSpeedAdapter();
			}
			@Override
			public Adapter caseTrainHeadingSpeedChanged(TrainHeadingSpeedChanged object) {
				return createTrainHeadingSpeedChangedAdapter();
			}
			@Override
			public Adapter caseTrainTrackElementChanged(TrainTrackElementChanged object) {
				return createTrainTrackElementChangedAdapter();
			}
			@Override
			public Adapter caseSignalAllowedSpeedChanged(SignalAllowedSpeedChanged object) {
				return createSignalAllowedSpeedChangedAdapter();
			}
			@Override
			public Adapter caseTurnoutDirectionChanged(TurnoutDirectionChanged object) {
				return createTurnoutDirectionChangedAdapter();
			}
			@Override
			public Adapter caseNextTrackElementIs(NextTrackElementIs object) {
				return createNextTrackElementIsAdapter();
			}
			@Override
			public Adapter caseTurnoutHasDesiredDirection(TurnoutHasDesiredDirection object) {
				return createTurnoutHasDesiredDirectionAdapter();
			}
			@Override
			public Adapter caseActionExpression(ActionExpression object) {
				return createActionExpressionAdapter();
			}
			@Override
			public Adapter caseGuardExpression(GuardExpression object) {
				return createGuardExpressionAdapter();
			}
			@Override
			public Adapter caseTriggerExpression(TriggerExpression object) {
				return createTriggerExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel <em>Behavioral Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel
	 * @generated
	 */
	public Adapter createStateMachineBehavioralModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.CompositeState
	 * @generated
	 */
	public Adapter createCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed <em>Change Train Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainHeadingSpeed
	 * @generated
	 */
	public Adapter createChangeTrainHeadingSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed <em>Change Signal Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed
	 * @generated
	 */
	public Adapter createChangeSignalAllowedSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection <em>Change Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection
	 * @generated
	 */
	public Adapter createChangeTurnoutDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement <em>Change Train Current Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement
	 * @generated
	 */
	public Adapter createChangeTrainCurrentTrackElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed <em>Train Current Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed
	 * @generated
	 */
	public Adapter createTrainCurrentHeadingSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn <em>Train Currently Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn
	 * @generated
	 */
	public Adapter createTrainCurrentlyStandsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection <em>Turnout Current Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection
	 * @generated
	 */
	public Adapter createTurnoutCurrentDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed <em>Signal Current Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed
	 * @generated
	 */
	public Adapter createSignalCurrentAllowedSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged <em>Train Heading Speed Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged
	 * @generated
	 */
	public Adapter createTrainHeadingSpeedChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged <em>Train Track Element Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainTrackElementChanged
	 * @generated
	 */
	public Adapter createTrainTrackElementChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged <em>Signal Allowed Speed Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged
	 * @generated
	 */
	public Adapter createSignalAllowedSpeedChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged <em>Turnout Direction Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged
	 * @generated
	 */
	public Adapter createTurnoutDirectionChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs <em>Next Track Element Is</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs
	 * @generated
	 */
	public Adapter createNextTrackElementIsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection <em>Turnout Has Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection
	 * @generated
	 */
	public Adapter createTurnoutHasDesiredDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression <em>Action Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.ActionExpression
	 * @generated
	 */
	public Adapter createActionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.GuardExpression
	 * @generated
	 */
	public Adapter createGuardExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression <em>Trigger Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.TriggerExpression
	 * @generated
	 */
	public Adapter createTriggerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StateMachineAdapterFactory
