/**
 */
package hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTraceFactory
 * @model kind="package"
 * @generated
 */
public interface MRPTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MRPTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.gomrp.simulation.trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.gomrp.simulation.trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRPTracePackage eINSTANCE = hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceModelImpl <em>Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceModelImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTraceModel()
	 * @generated
	 */
	int TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__TRACE = 0;

	/**
	 * The number of structural features of the '<em>Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__GRANULARITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CONSISTS_OF = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl <em>Trace Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTraceEntry()
	 * @generated
	 */
	int TRACE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Next Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY__NEXT_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Affected RDM Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY__AFFECTED_RDM_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY__CAUSE = 3;

	/**
	 * The number of structural features of the '<em>Trace Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trace Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.EventImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 5;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Model</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceModel
	 * @generated
	 */
	EClass getTraceModel();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceModel#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceModel#getTrace()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_Trace();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getGranularity()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Granularity();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getConsistsOf()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ConsistsOf();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry <em>Trace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Entry</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry
	 * @generated
	 */
	EClass getTraceEntry();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getNextEntry <em>Next Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Entry</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getNextEntry()
	 * @see #getTraceEntry()
	 * @generated
	 */
	EReference getTraceEntry_NextEntry();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getDescription()
	 * @see #getTraceEntry()
	 * @generated
	 */
	EAttribute getTraceEntry_Description();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getAffectedRDMElements <em>Affected RDM Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected RDM Elements</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getAffectedRDMElements()
	 * @see #getTraceEntry()
	 * @generated
	 */
	EReference getTraceEntry_AffectedRDMElements();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cause</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getCause()
	 * @see #getTraceEntry()
	 * @generated
	 */
	EReference getTraceEntry_Cause();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRPTraceFactory getMRPTraceFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceModelImpl <em>Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceModelImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTraceModel()
		 * @generated
		 */
		EClass TRACE_MODEL = eINSTANCE.getTraceModel();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__TRACE = eINSTANCE.getTraceModel_Trace();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__GRANULARITY = eINSTANCE.getTrace_Granularity();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CONSISTS_OF = eINSTANCE.getTrace_ConsistsOf();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl <em>Trace Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTraceEntry()
		 * @generated
		 */
		EClass TRACE_ENTRY = eINSTANCE.getTraceEntry();

		/**
		 * The meta object literal for the '<em><b>Next Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ENTRY__NEXT_ENTRY = eINSTANCE.getTraceEntry_NextEntry();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ENTRY__DESCRIPTION = eINSTANCE.getTraceEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Affected RDM Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ENTRY__AFFECTED_RDM_ELEMENTS = eINSTANCE.getTraceEntry_AffectedRDMElements();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ENTRY__CAUSE = eINSTANCE.getTraceEntry_Cause();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.EventImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit
		 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.MRPTracePackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

	}

} //MRPTracePackage
