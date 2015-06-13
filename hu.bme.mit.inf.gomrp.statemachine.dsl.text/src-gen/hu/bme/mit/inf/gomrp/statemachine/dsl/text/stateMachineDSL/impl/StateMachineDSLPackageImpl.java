/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.NextTrackElementIs;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.SignalCurrentAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLFactory;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentHeadingSpeed;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TrainCurrentlyStandsOn;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutCurrentDirection;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.TurnoutHasDesiredDirection;

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
public class StateMachineDSLPackageImpl extends EPackageImpl implements StateMachineDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

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
  private EClass stateMachineBehavioralModelEClass = null;

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
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StateMachineDSLPackageImpl()
  {
    super(eNS_URI, StateMachineDSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link StateMachineDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StateMachineDSLPackage init()
  {
    if (isInited) return (StateMachineDSLPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachineDSLPackage.eNS_URI);

    // Obtain or create and register package
    StateMachineDSLPackageImpl theStateMachineDSLPackage = (StateMachineDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateMachineDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateMachineDSLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StateMachinePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theStateMachineDSLPackage.createPackageContents();

    // Initialize created meta-data
    theStateMachineDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStateMachineDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StateMachineDSLPackage.eNS_URI, theStateMachineDSLPackage);
    return theStateMachineDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInclude()
  {
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInclude_Filename()
  {
    return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrainCurrentHeadingSpeed()
  {
    return trainCurrentHeadingSpeedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrainCurrentlyStandsOn()
  {
    return trainCurrentlyStandsOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTurnoutCurrentDirection()
  {
    return turnoutCurrentDirectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalCurrentAllowedSpeed()
  {
    return signalCurrentAllowedSpeedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNextTrackElementIs()
  {
    return nextTrackElementIsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTurnoutHasDesiredDirection()
  {
    return turnoutHasDesiredDirectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateMachineBehavioralModel()
  {
    return stateMachineBehavioralModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachineBehavioralModel_Includes()
  {
    return (EReference)stateMachineBehavioralModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineDSLFactory getStateMachineDSLFactory()
  {
    return (StateMachineDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    includeEClass = createEClass(INCLUDE);
    createEAttribute(includeEClass, INCLUDE__FILENAME);

    trainCurrentHeadingSpeedEClass = createEClass(TRAIN_CURRENT_HEADING_SPEED);

    trainCurrentlyStandsOnEClass = createEClass(TRAIN_CURRENTLY_STANDS_ON);

    turnoutCurrentDirectionEClass = createEClass(TURNOUT_CURRENT_DIRECTION);

    signalCurrentAllowedSpeedEClass = createEClass(SIGNAL_CURRENT_ALLOWED_SPEED);

    nextTrackElementIsEClass = createEClass(NEXT_TRACK_ELEMENT_IS);

    turnoutHasDesiredDirectionEClass = createEClass(TURNOUT_HAS_DESIRED_DIRECTION);

    stateMachineBehavioralModelEClass = createEClass(STATE_MACHINE_BEHAVIORAL_MODEL);
    createEReference(stateMachineBehavioralModelEClass, STATE_MACHINE_BEHAVIORAL_MODEL__INCLUDES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    StateMachinePackage theStateMachinePackage = (StateMachinePackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    trainCurrentHeadingSpeedEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    trainCurrentlyStandsOnEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    turnoutCurrentDirectionEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    signalCurrentAllowedSpeedEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    nextTrackElementIsEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    turnoutHasDesiredDirectionEClass.getESuperTypes().add(theStateMachinePackage.getGuard());
    stateMachineBehavioralModelEClass.getESuperTypes().add(theStateMachinePackage.getStateMachineBehavioralModel());

    // Initialize classes and features; add operations and parameters
    initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInclude_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trainCurrentHeadingSpeedEClass, TrainCurrentHeadingSpeed.class, "TrainCurrentHeadingSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trainCurrentlyStandsOnEClass, TrainCurrentlyStandsOn.class, "TrainCurrentlyStandsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(turnoutCurrentDirectionEClass, TurnoutCurrentDirection.class, "TurnoutCurrentDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalCurrentAllowedSpeedEClass, SignalCurrentAllowedSpeed.class, "SignalCurrentAllowedSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nextTrackElementIsEClass, NextTrackElementIs.class, "NextTrackElementIs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(turnoutHasDesiredDirectionEClass, TurnoutHasDesiredDirection.class, "TurnoutHasDesiredDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateMachineBehavioralModelEClass, StateMachineBehavioralModel.class, "StateMachineBehavioralModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateMachineBehavioralModel_Includes(), this.getInclude(), null, "includes", null, 0, -1, StateMachineBehavioralModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //StateMachineDSLPackageImpl
