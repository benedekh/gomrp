/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.util;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement;

import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage
 * @generated
 */
public class StateMachineDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateMachineDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StateMachineDSLPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected StateMachineDSLSwitch<Adapter> modelSwitch =
    new StateMachineDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseTrainCurrentHeadingSpeed(TrainCurrentHeadingSpeed object)
      {
        return createTrainCurrentHeadingSpeedAdapter();
      }
      @Override
      public Adapter caseTrainCurrentlyStandsOn(TrainCurrentlyStandsOn object)
      {
        return createTrainCurrentlyStandsOnAdapter();
      }
      @Override
      public Adapter caseTurnoutCurrentDirection(TurnoutCurrentDirection object)
      {
        return createTurnoutCurrentDirectionAdapter();
      }
      @Override
      public Adapter caseSignalCurrentAllowedSpeed(SignalCurrentAllowedSpeed object)
      {
        return createSignalCurrentAllowedSpeedAdapter();
      }
      @Override
      public Adapter caseNextTrackElementIs(NextTrackElementIs object)
      {
        return createNextTrackElementIsAdapter();
      }
      @Override
      public Adapter caseTurnoutHasDesiredDirection(TurnoutHasDesiredDirection object)
      {
        return createTurnoutHasDesiredDirectionAdapter();
      }
      @Override
      public Adapter caseStateMachineBehavioralModel(StateMachineBehavioralModel object)
      {
        return createStateMachineBehavioralModelAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseStateMachine_StateMachineBehavioralModel(hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel object)
      {
        return createStateMachine_StateMachineBehavioralModelAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed <em>Train Current Heading Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed
   * @generated
   */
  public Adapter createTrainCurrentHeadingSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn <em>Train Currently Stands On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn
   * @generated
   */
  public Adapter createTrainCurrentlyStandsOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection <em>Turnout Current Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection
   * @generated
   */
  public Adapter createTurnoutCurrentDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed <em>Signal Current Allowed Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed
   * @generated
   */
  public Adapter createSignalCurrentAllowedSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs <em>Next Track Element Is</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs
   * @generated
   */
  public Adapter createNextTrackElementIsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection <em>Turnout Has Desired Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection
   * @generated
   */
  public Adapter createTurnoutHasDesiredDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel <em>State Machine Behavioral Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel
   * @generated
   */
  public Adapter createStateMachineBehavioralModelAdapter()
  {
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
  public Adapter createNamedElementAdapter()
  {
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
  public Adapter createGuardAdapter()
  {
    return null;
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
  public Adapter createStateMachine_StateMachineBehavioralModelAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StateMachineDSLAdapterFactory
