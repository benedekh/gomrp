/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityFactory;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRPTraceabilityPackageImpl extends EPackageImpl implements MRPTraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceabilityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementEClass = null;

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
	private EClass targetPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referredTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifieredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classifierVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierEEnum = null;

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
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MRPTraceabilityPackageImpl() {
		super(eNS_URI, MRPTraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MRPTraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MRPTraceabilityPackage init() {
		if (isInited) return (MRPTraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(MRPTraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		MRPTraceabilityPackageImpl theMRPTraceabilityPackage = (MRPTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MRPTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MRPTraceabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMRPTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theMRPTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMRPTraceabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MRPTraceabilityPackage.eNS_URI, theMRPTraceabilityPackage);
		return theMRPTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceabilityModel() {
		return traceabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceabilityModel_Targets() {
		return (EReference)traceabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceabilityModel_Sources() {
		return (EReference)traceabilityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceabilityModel_Types() {
		return (EReference)traceabilityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		return sourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_Target() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_SourceRDMElement() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_SourceSMElement() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElement() {
		return targetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_Source() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(0);
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
	public EClass getTargetPackage() {
		return targetPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClassifier() {
		return targetClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClassifier_IsIn() {
		return (EReference)targetClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClassifier_IsInSpecial() {
		return (EReference)targetClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetClassifier_Visibility() {
		return (EAttribute)targetClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClassifier_Members() {
		return (EReference)targetClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_Type() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClass() {
		return targetClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClass_ExtendsCls() {
		return (EReference)targetClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClass_ImplInterface() {
		return (EReference)targetClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClass_ExtendsSpecial() {
		return (EReference)targetClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetClass_ImplementsSpecial() {
		return (EReference)targetClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetInterface() {
		return targetInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetInterface_ExtendsInterface() {
		return (EReference)targetInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetInterface_ExtendsSpecial() {
		return (EReference)targetInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferredTypedElement() {
		return referredTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMember() {
		return targetMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetMember_Visibility() {
		return (EAttribute)targetMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetField() {
		return targetFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMethod() {
		return targetMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMethod_Parameters() {
		return (EReference)targetMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetParameter() {
		return targetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifieredElement() {
		return modifieredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifieredElement_Modifier() {
		return (EAttribute)modifieredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassifierVisibility() {
		return classifierVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModifier() {
		return modifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilityFactory getMRPTraceabilityFactory() {
		return (MRPTraceabilityFactory)getEFactoryInstance();
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
		traceabilityModelEClass = createEClass(TRACEABILITY_MODEL);
		createEReference(traceabilityModelEClass, TRACEABILITY_MODEL__TARGETS);
		createEReference(traceabilityModelEClass, TRACEABILITY_MODEL__SOURCES);
		createEReference(traceabilityModelEClass, TRACEABILITY_MODEL__TYPES);

		sourceElementEClass = createEClass(SOURCE_ELEMENT);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__TARGET);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__SOURCE_RDM_ELEMENT);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__SOURCE_SM_ELEMENT);

		targetElementEClass = createEClass(TARGET_ELEMENT);
		createEReference(targetElementEClass, TARGET_ELEMENT__SOURCE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		targetPackageEClass = createEClass(TARGET_PACKAGE);

		targetClassifierEClass = createEClass(TARGET_CLASSIFIER);
		createEReference(targetClassifierEClass, TARGET_CLASSIFIER__IS_IN);
		createEReference(targetClassifierEClass, TARGET_CLASSIFIER__IS_IN_SPECIAL);
		createEAttribute(targetClassifierEClass, TARGET_CLASSIFIER__VISIBILITY);
		createEReference(targetClassifierEClass, TARGET_CLASSIFIER__MEMBERS);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE);

		targetClassEClass = createEClass(TARGET_CLASS);
		createEReference(targetClassEClass, TARGET_CLASS__EXTENDS_CLS);
		createEReference(targetClassEClass, TARGET_CLASS__IMPL_INTERFACE);
		createEReference(targetClassEClass, TARGET_CLASS__EXTENDS_SPECIAL);
		createEReference(targetClassEClass, TARGET_CLASS__IMPLEMENTS_SPECIAL);

		targetInterfaceEClass = createEClass(TARGET_INTERFACE);
		createEReference(targetInterfaceEClass, TARGET_INTERFACE__EXTENDS_INTERFACE);
		createEReference(targetInterfaceEClass, TARGET_INTERFACE__EXTENDS_SPECIAL);

		referredTypedElementEClass = createEClass(REFERRED_TYPED_ELEMENT);

		targetMemberEClass = createEClass(TARGET_MEMBER);
		createEAttribute(targetMemberEClass, TARGET_MEMBER__VISIBILITY);

		targetFieldEClass = createEClass(TARGET_FIELD);

		targetMethodEClass = createEClass(TARGET_METHOD);
		createEReference(targetMethodEClass, TARGET_METHOD__PARAMETERS);

		targetParameterEClass = createEClass(TARGET_PARAMETER);

		modifieredElementEClass = createEClass(MODIFIERED_ELEMENT);
		createEAttribute(modifieredElementEClass, MODIFIERED_ELEMENT__MODIFIER);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		classifierVisibilityEEnum = createEEnum(CLASSIFIER_VISIBILITY);
		modifierEEnum = createEEnum(MODIFIER);
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
		StateMachinePackage theStateMachinePackage = (StateMachinePackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetElementEClass.getESuperTypes().add(this.getNamedElement());
		targetPackageEClass.getESuperTypes().add(this.getTargetElement());
		targetClassifierEClass.getESuperTypes().add(this.getTargetElement());
		targetClassEClass.getESuperTypes().add(this.getTargetClassifier());
		targetClassEClass.getESuperTypes().add(this.getModifieredElement());
		targetInterfaceEClass.getESuperTypes().add(this.getTargetClassifier());
		referredTypedElementEClass.getESuperTypes().add(this.getTypedElement());
		targetMemberEClass.getESuperTypes().add(this.getTypedElement());
		targetMemberEClass.getESuperTypes().add(this.getModifieredElement());
		targetMemberEClass.getESuperTypes().add(this.getTargetElement());
		targetFieldEClass.getESuperTypes().add(this.getTargetMember());
		targetMethodEClass.getESuperTypes().add(this.getTargetMember());
		targetParameterEClass.getESuperTypes().add(this.getTypedElement());
		targetParameterEClass.getESuperTypes().add(this.getTargetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(traceabilityModelEClass, TraceabilityModel.class, "TraceabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceabilityModel_Targets(), this.getTargetElement(), null, "targets", null, 0, -1, TraceabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceabilityModel_Sources(), this.getSourceElement(), null, "sources", null, 0, -1, TraceabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceabilityModel_Types(), this.getReferredTypedElement(), null, "types", null, 0, -1, TraceabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceElementEClass, SourceElement.class, "SourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceElement_Target(), this.getTargetElement(), this.getTargetElement_Source(), "target", null, 1, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceElement_SourceRDMElement(), theRDMPackage.getRDMElement(), null, "sourceRDMElement", null, 0, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceElement_SourceSMElement(), theStateMachinePackage.getNamedElement(), null, "sourceSMElement", null, 0, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetElementEClass, TargetElement.class, "TargetElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetElement_Source(), this.getSourceElement(), this.getSourceElement_Target(), "source", null, 1, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPackageEClass, TargetPackage.class, "TargetPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetClassifierEClass, TargetClassifier.class, "TargetClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetClassifier_IsIn(), this.getTargetPackage(), null, "isIn", null, 0, 1, TargetClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetClassifier_IsInSpecial(), this.getReferredTypedElement(), null, "isInSpecial", null, 0, 1, TargetClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetClassifier_Visibility(), this.getClassifierVisibility(), "visibility", "PUBLIC", 1, 1, TargetClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetClassifier_Members(), this.getTargetMember(), null, "members", null, 0, -1, TargetClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetClassEClass, TargetClass.class, "TargetClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetClass_ExtendsCls(), this.getTargetClass(), null, "extendsCls", null, 0, 1, TargetClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetClass_ImplInterface(), this.getTargetInterface(), null, "implInterface", null, 0, -1, TargetClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetClass_ExtendsSpecial(), this.getReferredTypedElement(), null, "extendsSpecial", null, 0, 1, TargetClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetClass_ImplementsSpecial(), this.getReferredTypedElement(), null, "implementsSpecial", null, 0, -1, TargetClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetInterfaceEClass, TargetInterface.class, "TargetInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetInterface_ExtendsInterface(), this.getTargetInterface(), null, "extendsInterface", null, 0, -1, TargetInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetInterface_ExtendsSpecial(), this.getReferredTypedElement(), null, "extendsSpecial", null, 0, -1, TargetInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referredTypedElementEClass, ReferredTypedElement.class, "ReferredTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMemberEClass, TargetMember.class, "TargetMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetMember_Visibility(), this.getVisibility(), "visibility", "PUBLIC", 1, 1, TargetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetFieldEClass, TargetField.class, "TargetField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMethodEClass, TargetMethod.class, "TargetMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMethod_Parameters(), this.getTargetParameter(), null, "parameters", null, 0, -1, TargetMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetParameterEClass, TargetParameter.class, "TargetParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifieredElementEClass, ModifieredElement.class, "ModifieredElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifieredElement_Modifier(), this.getModifier(), "modifier", "NONE", 1, 1, ModifieredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
		addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);

		initEEnum(classifierVisibilityEEnum, ClassifierVisibility.class, "ClassifierVisibility");
		addEEnumLiteral(classifierVisibilityEEnum, ClassifierVisibility.PUBLIC);
		addEEnumLiteral(classifierVisibilityEEnum, ClassifierVisibility.PACKAGE);

		initEEnum(modifierEEnum, Modifier.class, "Modifier");
		addEEnumLiteral(modifierEEnum, Modifier.NONE);
		addEEnumLiteral(modifierEEnum, Modifier.FINAL);
		addEEnumLiteral(modifierEEnum, Modifier.ABSTRACT);

		// Create resource
		createResource(eNS_URI);
	}

} //MRPTraceabilityPackageImpl
