/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl;

import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.*;

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
public class StateMachineDSLFactoryImpl extends EFactoryImpl implements StateMachineDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateMachineDSLFactory init()
  {
    try
    {
      StateMachineDSLFactory theStateMachineDSLFactory = (StateMachineDSLFactory)EPackage.Registry.INSTANCE.getEFactory(StateMachineDSLPackage.eNS_URI);
      if (theStateMachineDSLFactory != null)
      {
        return theStateMachineDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StateMachineDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StateMachineDSLPackage.INCLUDE: return createInclude();
      case StateMachineDSLPackage.TRAIN_CURRENT_HEADING_SPEED: return createTrainCurrentHeadingSpeed();
      case StateMachineDSLPackage.TRAIN_CURRENTLY_STANDS_ON: return createTrainCurrentlyStandsOn();
      case StateMachineDSLPackage.TURNOUT_CURRENT_DIRECTION: return createTurnoutCurrentDirection();
      case StateMachineDSLPackage.SIGNAL_CURRENT_ALLOWED_SPEED: return createSignalCurrentAllowedSpeed();
      case StateMachineDSLPackage.NEXT_TRACK_ELEMENT_IS: return createNextTrackElementIs();
      case StateMachineDSLPackage.TURNOUT_HAS_DESIRED_DIRECTION: return createTurnoutHasDesiredDirection();
      case StateMachineDSLPackage.STATE_MACHINE_BEHAVIORAL_MODEL: return createStateMachineBehavioralModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrainCurrentHeadingSpeed createTrainCurrentHeadingSpeed()
  {
    TrainCurrentHeadingSpeedImpl trainCurrentHeadingSpeed = new TrainCurrentHeadingSpeedImpl();
    return trainCurrentHeadingSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrainCurrentlyStandsOn createTrainCurrentlyStandsOn()
  {
    TrainCurrentlyStandsOnImpl trainCurrentlyStandsOn = new TrainCurrentlyStandsOnImpl();
    return trainCurrentlyStandsOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnoutCurrentDirection createTurnoutCurrentDirection()
  {
    TurnoutCurrentDirectionImpl turnoutCurrentDirection = new TurnoutCurrentDirectionImpl();
    return turnoutCurrentDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalCurrentAllowedSpeed createSignalCurrentAllowedSpeed()
  {
    SignalCurrentAllowedSpeedImpl signalCurrentAllowedSpeed = new SignalCurrentAllowedSpeedImpl();
    return signalCurrentAllowedSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NextTrackElementIs createNextTrackElementIs()
  {
    NextTrackElementIsImpl nextTrackElementIs = new NextTrackElementIsImpl();
    return nextTrackElementIs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnoutHasDesiredDirection createTurnoutHasDesiredDirection()
  {
    TurnoutHasDesiredDirectionImpl turnoutHasDesiredDirection = new TurnoutHasDesiredDirectionImpl();
    return turnoutHasDesiredDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineBehavioralModel createStateMachineBehavioralModel()
  {
    StateMachineBehavioralModelImpl stateMachineBehavioralModel = new StateMachineBehavioralModelImpl();
    return stateMachineBehavioralModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineDSLPackage getStateMachineDSLPackage()
  {
    return (StateMachineDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StateMachineDSLPackage getPackage()
  {
    return StateMachineDSLPackage.eINSTANCE;
  }

} //StateMachineDSLFactoryImpl
