/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

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
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface MRPTraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MRPTraceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.gomrp.simulation.traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.gomrp.simulation.traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRPTraceabilityPackage eINSTANCE = hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl <em>Traceability Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTraceabilityModel()
	 * @generated
	 */
	int TRACEABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__TARGETS = 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__SOURCES = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Traceability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traceability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source RDM Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__SOURCE_RDM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Source SM Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__SOURCE_SM_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetPackageImpl <em>Target Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetPackageImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetPackage()
	 * @generated
	 */
	int TARGET_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PACKAGE__NAME = TARGET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PACKAGE__SOURCE = TARGET_ELEMENT__SOURCE;

	/**
	 * The number of structural features of the '<em>Target Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PACKAGE_FEATURE_COUNT = TARGET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PACKAGE_OPERATION_COUNT = TARGET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl <em>Target Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetClassifier()
	 * @generated
	 */
	int TARGET_CLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__NAME = TARGET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__SOURCE = TARGET_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Is In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__IS_IN = TARGET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is In Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__IS_IN_SPECIAL = TARGET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__VISIBILITY = TARGET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER__MEMBERS = TARGET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Target Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER_FEATURE_COUNT = TARGET_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Target Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASSIFIER_OPERATION_COUNT = TARGET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TypedElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl <em>Target Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetClass()
	 * @generated
	 */
	int TARGET_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__NAME = TARGET_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__SOURCE = TARGET_CLASSIFIER__SOURCE;

	/**
	 * The feature id for the '<em><b>Is In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__IS_IN = TARGET_CLASSIFIER__IS_IN;

	/**
	 * The feature id for the '<em><b>Is In Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__IS_IN_SPECIAL = TARGET_CLASSIFIER__IS_IN_SPECIAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__VISIBILITY = TARGET_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__MEMBERS = TARGET_CLASSIFIER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__MODIFIER = TARGET_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__EXTENDS_CLS = TARGET_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Impl Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__IMPL_INTERFACE = TARGET_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__EXTENDS_SPECIAL = TARGET_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implements Special</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS__IMPLEMENTS_SPECIAL = TARGET_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Target Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS_FEATURE_COUNT = TARGET_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Target Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CLASS_OPERATION_COUNT = TARGET_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl <em>Target Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetInterface()
	 * @generated
	 */
	int TARGET_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__NAME = TARGET_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__SOURCE = TARGET_CLASSIFIER__SOURCE;

	/**
	 * The feature id for the '<em><b>Is In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__IS_IN = TARGET_CLASSIFIER__IS_IN;

	/**
	 * The feature id for the '<em><b>Is In Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__IS_IN_SPECIAL = TARGET_CLASSIFIER__IS_IN_SPECIAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__VISIBILITY = TARGET_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__MEMBERS = TARGET_CLASSIFIER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Extends Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__EXTENDS_INTERFACE = TARGET_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends Special</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE__EXTENDS_SPECIAL = TARGET_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE_FEATURE_COUNT = TARGET_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACE_OPERATION_COUNT = TARGET_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ReferredTypedElementImpl <em>Referred Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ReferredTypedElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getReferredTypedElement()
	 * @generated
	 */
	int REFERRED_TYPED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_TYPED_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Referred Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_TYPED_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Referred Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_TYPED_ELEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl <em>Target Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetMember()
	 * @generated
	 */
	int TARGET_MEMBER = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER__MODIFIER = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER__NAME = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER__SOURCE = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER__VISIBILITY = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Target Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Target Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEMBER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetFieldImpl <em>Target Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetFieldImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetField()
	 * @generated
	 */
	int TARGET_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD__TYPE = TARGET_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD__MODIFIER = TARGET_MEMBER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD__NAME = TARGET_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD__SOURCE = TARGET_MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD__VISIBILITY = TARGET_MEMBER__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Target Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD_FEATURE_COUNT = TARGET_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FIELD_OPERATION_COUNT = TARGET_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMethodImpl <em>Target Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMethodImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetMethod()
	 * @generated
	 */
	int TARGET_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__TYPE = TARGET_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__MODIFIER = TARGET_MEMBER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__NAME = TARGET_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__SOURCE = TARGET_MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__VISIBILITY = TARGET_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD__PARAMETERS = TARGET_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD_FEATURE_COUNT = TARGET_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_METHOD_OPERATION_COUNT = TARGET_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetParameterImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetParameter()
	 * @generated
	 */
	int TARGET_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__SOURCE = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ModifieredElementImpl <em>Modifiered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ModifieredElementImpl
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getModifieredElement()
	 * @generated
	 */
	int MODIFIERED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERED_ELEMENT__MODIFIER = 0;

	/**
	 * The number of structural features of the '<em>Modifiered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modifiered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 15;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility <em>Classifier Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getClassifierVisibility()
	 * @generated
	 */
	int CLASSIFIER_VISIBILITY = 16;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier <em>Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 17;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel <em>Traceability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Model</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel
	 * @generated
	 */
	EClass getTraceabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTargets()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Targets();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getSources()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTypes()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Types();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getTarget()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_Target();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceRDMElement <em>Source RDM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source RDM Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceRDMElement()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_SourceRDMElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceSMElement <em>Source SM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source SM Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceSMElement()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_SourceSMElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement#getSource()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_Source();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage <em>Target Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Package</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage
	 * @generated
	 */
	EClass getTargetPackage();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier <em>Target Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Classifier</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier
	 * @generated
	 */
	EClass getTargetClassifier();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsIn <em>Is In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is In</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsIn()
	 * @see #getTargetClassifier()
	 * @generated
	 */
	EReference getTargetClassifier_IsIn();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsInSpecial <em>Is In Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is In Special</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsInSpecial()
	 * @see #getTargetClassifier()
	 * @generated
	 */
	EReference getTargetClassifier_IsInSpecial();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getVisibility()
	 * @see #getTargetClassifier()
	 * @generated
	 */
	EAttribute getTargetClassifier_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getMembers()
	 * @see #getTargetClassifier()
	 * @generated
	 */
	EReference getTargetClassifier_Members();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Class</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass
	 * @generated
	 */
	EClass getTargetClass();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsCls <em>Extends Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends Cls</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsCls()
	 * @see #getTargetClass()
	 * @generated
	 */
	EReference getTargetClass_ExtendsCls();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplInterface <em>Impl Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impl Interface</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplInterface()
	 * @see #getTargetClass()
	 * @generated
	 */
	EReference getTargetClass_ImplInterface();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsSpecial <em>Extends Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends Special</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsSpecial()
	 * @see #getTargetClass()
	 * @generated
	 */
	EReference getTargetClass_ExtendsSpecial();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplementsSpecial <em>Implements Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements Special</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplementsSpecial()
	 * @see #getTargetClass()
	 * @generated
	 */
	EReference getTargetClass_ImplementsSpecial();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface <em>Target Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Interface</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface
	 * @generated
	 */
	EClass getTargetInterface();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface#getExtendsInterface <em>Extends Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Interface</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface#getExtendsInterface()
	 * @see #getTargetInterface()
	 * @generated
	 */
	EReference getTargetInterface_ExtendsInterface();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface#getExtendsSpecial <em>Extends Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Special</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface#getExtendsSpecial()
	 * @see #getTargetInterface()
	 * @generated
	 */
	EReference getTargetInterface_ExtendsSpecial();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement <em>Referred Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referred Typed Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement
	 * @generated
	 */
	EClass getReferredTypedElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember <em>Target Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Member</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember
	 * @generated
	 */
	EClass getTargetMember();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember#getVisibility()
	 * @see #getTargetMember()
	 * @generated
	 */
	EAttribute getTargetMember_Visibility();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField <em>Target Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Field</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField
	 * @generated
	 */
	EClass getTargetField();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod <em>Target Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Method</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod
	 * @generated
	 */
	EClass getTargetMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod#getParameters()
	 * @see #getTargetMethod()
	 * @generated
	 */
	EReference getTargetMethod_Parameters();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Parameter</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter
	 * @generated
	 */
	EClass getTargetParameter();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement <em>Modifiered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifiered Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement
	 * @generated
	 */
	EClass getModifieredElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement#getModifier()
	 * @see #getModifieredElement()
	 * @generated
	 */
	EAttribute getModifieredElement_Modifier();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility <em>Classifier Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classifier Visibility</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility
	 * @generated
	 */
	EEnum getClassifierVisibility();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier</em>'.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier
	 * @generated
	 */
	EEnum getModifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRPTraceabilityFactory getMRPTraceabilityFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl <em>Traceability Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTraceabilityModel()
		 * @generated
		 */
		EClass TRACEABILITY_MODEL = eINSTANCE.getTraceabilityModel();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__TARGETS = eINSTANCE.getTraceabilityModel_Targets();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__SOURCES = eINSTANCE.getTraceabilityModel_Sources();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__TYPES = eINSTANCE.getTraceabilityModel_Types();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__TARGET = eINSTANCE.getSourceElement_Target();

		/**
		 * The meta object literal for the '<em><b>Source RDM Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__SOURCE_RDM_ELEMENT = eINSTANCE.getSourceElement_SourceRDMElement();

		/**
		 * The meta object literal for the '<em><b>Source SM Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__SOURCE_SM_ELEMENT = eINSTANCE.getSourceElement_SourceSMElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__SOURCE = eINSTANCE.getTargetElement_Source();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetPackageImpl <em>Target Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetPackageImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetPackage()
		 * @generated
		 */
		EClass TARGET_PACKAGE = eINSTANCE.getTargetPackage();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl <em>Target Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetClassifier()
		 * @generated
		 */
		EClass TARGET_CLASSIFIER = eINSTANCE.getTargetClassifier();

		/**
		 * The meta object literal for the '<em><b>Is In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASSIFIER__IS_IN = eINSTANCE.getTargetClassifier_IsIn();

		/**
		 * The meta object literal for the '<em><b>Is In Special</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASSIFIER__IS_IN_SPECIAL = eINSTANCE.getTargetClassifier_IsInSpecial();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_CLASSIFIER__VISIBILITY = eINSTANCE.getTargetClassifier_Visibility();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASSIFIER__MEMBERS = eINSTANCE.getTargetClassifier_Members();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TypedElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl <em>Target Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetClass()
		 * @generated
		 */
		EClass TARGET_CLASS = eINSTANCE.getTargetClass();

		/**
		 * The meta object literal for the '<em><b>Extends Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASS__EXTENDS_CLS = eINSTANCE.getTargetClass_ExtendsCls();

		/**
		 * The meta object literal for the '<em><b>Impl Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASS__IMPL_INTERFACE = eINSTANCE.getTargetClass_ImplInterface();

		/**
		 * The meta object literal for the '<em><b>Extends Special</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASS__EXTENDS_SPECIAL = eINSTANCE.getTargetClass_ExtendsSpecial();

		/**
		 * The meta object literal for the '<em><b>Implements Special</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CLASS__IMPLEMENTS_SPECIAL = eINSTANCE.getTargetClass_ImplementsSpecial();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl <em>Target Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetInterface()
		 * @generated
		 */
		EClass TARGET_INTERFACE = eINSTANCE.getTargetInterface();

		/**
		 * The meta object literal for the '<em><b>Extends Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_INTERFACE__EXTENDS_INTERFACE = eINSTANCE.getTargetInterface_ExtendsInterface();

		/**
		 * The meta object literal for the '<em><b>Extends Special</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_INTERFACE__EXTENDS_SPECIAL = eINSTANCE.getTargetInterface_ExtendsSpecial();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ReferredTypedElementImpl <em>Referred Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ReferredTypedElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getReferredTypedElement()
		 * @generated
		 */
		EClass REFERRED_TYPED_ELEMENT = eINSTANCE.getReferredTypedElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl <em>Target Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetMember()
		 * @generated
		 */
		EClass TARGET_MEMBER = eINSTANCE.getTargetMember();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_MEMBER__VISIBILITY = eINSTANCE.getTargetMember_Visibility();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetFieldImpl <em>Target Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetFieldImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetField()
		 * @generated
		 */
		EClass TARGET_FIELD = eINSTANCE.getTargetField();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMethodImpl <em>Target Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMethodImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetMethod()
		 * @generated
		 */
		EClass TARGET_METHOD = eINSTANCE.getTargetMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_METHOD__PARAMETERS = eINSTANCE.getTargetMethod_Parameters();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetParameterImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getTargetParameter()
		 * @generated
		 */
		EClass TARGET_PARAMETER = eINSTANCE.getTargetParameter();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ModifieredElementImpl <em>Modifiered Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.ModifieredElementImpl
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getModifieredElement()
		 * @generated
		 */
		EClass MODIFIERED_ELEMENT = eINSTANCE.getModifieredElement();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIERED_ELEMENT__MODIFIER = eINSTANCE.getModifieredElement_Modifier();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility <em>Classifier Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getClassifierVisibility()
		 * @generated
		 */
		EEnum CLASSIFIER_VISIBILITY = eINSTANCE.getClassifierVisibility();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier <em>Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier
		 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityPackageImpl#getModifier()
		 * @generated
		 */
		EEnum MODIFIER = eINSTANCE.getModifier();

	}

} //MRPTraceabilityPackage
