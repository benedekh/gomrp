/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachineDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stateMachineDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/inf/gomrp/statemachine/dsl/text/StateMachineDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stateMachineDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateMachineDSLPackage eINSTANCE = hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.IncludeImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 0;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__FILENAME = 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentHeadingSpeedImpl <em>Train Current Heading Speed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentHeadingSpeedImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTrainCurrentHeadingSpeed()
   * @generated
   */
  int TRAIN_CURRENT_HEADING_SPEED = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIN_CURRENT_HEADING_SPEED__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Train Current Heading Speed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIN_CURRENT_HEADING_SPEED_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentlyStandsOnImpl <em>Train Currently Stands On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentlyStandsOnImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTrainCurrentlyStandsOn()
   * @generated
   */
  int TRAIN_CURRENTLY_STANDS_ON = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIN_CURRENTLY_STANDS_ON__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Train Currently Stands On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIN_CURRENTLY_STANDS_ON_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutCurrentDirectionImpl <em>Turnout Current Direction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutCurrentDirectionImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTurnoutCurrentDirection()
   * @generated
   */
  int TURNOUT_CURRENT_DIRECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_CURRENT_DIRECTION__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Turnout Current Direction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_CURRENT_DIRECTION_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.SignalCurrentAllowedSpeedImpl <em>Signal Current Allowed Speed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.SignalCurrentAllowedSpeedImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getSignalCurrentAllowedSpeed()
   * @generated
   */
  int SIGNAL_CURRENT_ALLOWED_SPEED = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_CURRENT_ALLOWED_SPEED__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Signal Current Allowed Speed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_CURRENT_ALLOWED_SPEED_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.NextTrackElementIsImpl <em>Next Track Element Is</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.NextTrackElementIsImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getNextTrackElementIs()
   * @generated
   */
  int NEXT_TRACK_ELEMENT_IS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_TRACK_ELEMENT_IS__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Next Track Element Is</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_TRACK_ELEMENT_IS_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutHasDesiredDirectionImpl <em>Turnout Has Desired Direction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutHasDesiredDirectionImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTurnoutHasDesiredDirection()
   * @generated
   */
  int TURNOUT_HAS_DESIRED_DIRECTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_HAS_DESIRED_DIRECTION__NAME = StateMachinePackage.GUARD__NAME;

  /**
   * The number of structural features of the '<em>Turnout Has Desired Direction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_HAS_DESIRED_DIRECTION_FEATURE_COUNT = StateMachinePackage.GUARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineBehavioralModelImpl <em>State Machine Behavioral Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineBehavioralModelImpl
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getStateMachineBehavioralModel()
   * @generated
   */
  int STATE_MACHINE_BEHAVIORAL_MODEL = 7;

  /**
   * The feature id for the '<em><b>Statemachines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES = StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_BEHAVIORAL_MODEL__INCLUDES = StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Machine Behavioral Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_BEHAVIORAL_MODEL_FEATURE_COUNT = StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include#getFilename()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_Filename();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed <em>Train Current Heading Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Train Current Heading Speed</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed
   * @generated
   */
  EClass getTrainCurrentHeadingSpeed();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn <em>Train Currently Stands On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Train Currently Stands On</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn
   * @generated
   */
  EClass getTrainCurrentlyStandsOn();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection <em>Turnout Current Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turnout Current Direction</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection
   * @generated
   */
  EClass getTurnoutCurrentDirection();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed <em>Signal Current Allowed Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Current Allowed Speed</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed
   * @generated
   */
  EClass getSignalCurrentAllowedSpeed();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs <em>Next Track Element Is</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Next Track Element Is</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs
   * @generated
   */
  EClass getNextTrackElementIs();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection <em>Turnout Has Desired Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turnout Has Desired Direction</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection
   * @generated
   */
  EClass getTurnoutHasDesiredDirection();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel <em>State Machine Behavioral Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine Behavioral Model</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel
   * @generated
   */
  EClass getStateMachineBehavioralModel();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel#getIncludes()
   * @see #getStateMachineBehavioralModel()
   * @generated
   */
  EReference getStateMachineBehavioralModel_Includes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StateMachineDSLFactory getStateMachineDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.IncludeImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__FILENAME = eINSTANCE.getInclude_Filename();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentHeadingSpeedImpl <em>Train Current Heading Speed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentHeadingSpeedImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTrainCurrentHeadingSpeed()
     * @generated
     */
    EClass TRAIN_CURRENT_HEADING_SPEED = eINSTANCE.getTrainCurrentHeadingSpeed();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentlyStandsOnImpl <em>Train Currently Stands On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TrainCurrentlyStandsOnImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTrainCurrentlyStandsOn()
     * @generated
     */
    EClass TRAIN_CURRENTLY_STANDS_ON = eINSTANCE.getTrainCurrentlyStandsOn();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutCurrentDirectionImpl <em>Turnout Current Direction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutCurrentDirectionImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTurnoutCurrentDirection()
     * @generated
     */
    EClass TURNOUT_CURRENT_DIRECTION = eINSTANCE.getTurnoutCurrentDirection();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.SignalCurrentAllowedSpeedImpl <em>Signal Current Allowed Speed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.SignalCurrentAllowedSpeedImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getSignalCurrentAllowedSpeed()
     * @generated
     */
    EClass SIGNAL_CURRENT_ALLOWED_SPEED = eINSTANCE.getSignalCurrentAllowedSpeed();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.NextTrackElementIsImpl <em>Next Track Element Is</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.NextTrackElementIsImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getNextTrackElementIs()
     * @generated
     */
    EClass NEXT_TRACK_ELEMENT_IS = eINSTANCE.getNextTrackElementIs();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutHasDesiredDirectionImpl <em>Turnout Has Desired Direction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.TurnoutHasDesiredDirectionImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getTurnoutHasDesiredDirection()
     * @generated
     */
    EClass TURNOUT_HAS_DESIRED_DIRECTION = eINSTANCE.getTurnoutHasDesiredDirection();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineBehavioralModelImpl <em>State Machine Behavioral Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineBehavioralModelImpl
     * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.StateMachineDSLPackageImpl#getStateMachineBehavioralModel()
     * @generated
     */
    EClass STATE_MACHINE_BEHAVIORAL_MODEL = eINSTANCE.getStateMachineBehavioralModel();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE_BEHAVIORAL_MODEL__INCLUDES = eINSTANCE.getStateMachineBehavioralModel_Includes();

  }

} //StateMachineDSLPackage
