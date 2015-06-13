/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;

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
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface RDMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RDM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.gomrp.railway";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.gomrp.railway";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDMPackage eINSTANCE = hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl <em>Railway Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRailwayDomainModel()
	 * @generated
	 */
	int RAILWAY_DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__TRAINS = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__SECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Turnouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__TURNOUTS = 2;

	/**
	 * The feature id for the '<em><b>Editor CP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__EDITOR_CP = 3;

	/**
	 * The feature id for the '<em><b>Editor Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL = 4;

	/**
	 * The feature id for the '<em><b>Editor TDD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__EDITOR_TDD = 5;

	/**
	 * The feature id for the '<em><b>Editor Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE = 6;

	/**
	 * The feature id for the '<em><b>Editor Route Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Railway Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Railway Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMElementImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRDMElement()
	 * @generated
	 */
	int RDM_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDM_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDM_ELEMENT__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Heading Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__HEADING_SPEED = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__MAX_SPEED = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrives To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ARRIVES_TO = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Departures From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__DEPARTURES_FROM = RDM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Follows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__FOLLOWS = RDM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stands On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__STANDS_ON = RDM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Allowed Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ALLOWED_SPEED = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stands On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__STANDS_ON = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OBSERVES = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl <em>Track Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTrackElement()
	 * @generated
	 */
	int TRACK_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__CONNECTS_TO = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__OCCUPIED_BY = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>First Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__FIRST_ELEMENT = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.SectionImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = TRACK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LENGTH = TRACK_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONNECTS_TO = TRACK_ELEMENT__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OCCUPIED_BY = TRACK_ELEMENT__OCCUPIED_BY;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl <em>Turnout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnout()
	 * @generated
	 */
	int TURNOUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__NAME = TRACK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__LENGTH = TRACK_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__CONNECTS_TO = TRACK_ELEMENT__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__OCCUPIED_BY = TRACK_ELEMENT__OCCUPIED_BY;

	/**
	 * The feature id for the '<em><b>Current Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__CURRENT_DIRECTION = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switching Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__SWITCHING_DIRECTION = TRACK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl <em>Turnout Desired Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutDesiredDirection()
	 * @generated
	 */
	int TURNOUT_DESIRED_DIRECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Referred Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desired Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turnout Desired Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Turnout Desired Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_DESIRED_DIRECTION_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.StationImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LENGTH = SECTION__LENGTH;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CONNECTS_TO = SECTION__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__OCCUPIED_BY = SECTION__OCCUPIED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CONTROLS = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DIRECTION = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__HOLDS = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NEXT_ELEMENT = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl <em>Route Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRouteElement()
	 * @generated
	 */
	int ROUTE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__NAME = RDM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__LENGTH = RDM_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__REFERRED_ELEMENT = RDM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desired Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__DESIRED_DIRECTION = RDM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__BELONGS_TO = RDM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__NEXT_ELEMENT = RDM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_FEATURE_COUNT = RDM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_OPERATION_COUNT = RDM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutSignalImpl <em>Turnout Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutSignalImpl
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutSignal()
	 * @generated
	 */
	int TURNOUT_SIGNAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__NAME = SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__LENGTH = SIGNAL__LENGTH;

	/**
	 * The feature id for the '<em><b>Allowed Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__ALLOWED_SPEED = SIGNAL__ALLOWED_SPEED;

	/**
	 * The feature id for the '<em><b>Stands On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__STANDS_ON = SIGNAL__STANDS_ON;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__OBSERVES = SIGNAL__OBSERVES;

	/**
	 * The feature id for the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL__TURNOUT = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turnout Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turnout Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Speed <em>Speed</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 13;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection <em>Turnout Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutDirection()
	 * @generated
	 */
	int TURNOUT_DIRECTION = 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection <em>Connection Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getConnectionDirection()
	 * @generated
	 */
	int CONNECTION_DIRECTION = 15;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel <em>Railway Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Domain Model</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel
	 * @generated
	 */
	EClass getRailwayDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTrains()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_Trains();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getSections()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTurnouts <em>Turnouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Turnouts</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTurnouts()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_Turnouts();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorCP <em>Editor CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor CP</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorCP()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_EditorCP();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorSignal <em>Editor Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorSignal()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_EditorSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorTDD <em>Editor TDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor TDD</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorTDD()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_EditorTDD();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRoute <em>Editor Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor Route</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRoute()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_EditorRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRouteElement <em>Editor Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor Route Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRouteElement()
	 * @see #getRailwayDomainModel()
	 * @generated
	 */
	EReference getRailwayDomainModel_EditorRouteElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getHeadingSpeed <em>Heading Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getHeadingSpeed()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_HeadingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getMaxSpeed()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_MaxSpeed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getArrivesTo <em>Arrives To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arrives To</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getArrivesTo()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_ArrivesTo();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getDeparturesFrom <em>Departures From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departures From</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getDeparturesFrom()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_DeparturesFrom();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getFollows <em>Follows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Follows</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getFollows()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Follows();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getStandsOn <em>Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stands On</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getStandsOn()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_StandsOn();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getAllowedSpeed <em>Allowed Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Signal#getAllowedSpeed()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_AllowedSpeed();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn <em>Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stands On</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_StandsOn();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getObserves <em>Observes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observes</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Signal#getObserves()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Observes();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement <em>Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TrackElement
	 * @generated
	 */
	EClass getTrackElement();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getConnectsTo <em>Connects To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects To</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getConnectsTo()
	 * @see #getTrackElement()
	 * @generated
	 */
	EReference getTrackElement_ConnectsTo();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy <em>Occupied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupied By</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy()
	 * @see #getTrackElement()
	 * @generated
	 */
	EReference getTrackElement_OccupiedBy();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_FirstElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.RDMElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMElement
	 * @generated
	 */
	EClass getRDMElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.RDMElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMElement#getName()
	 * @see #getRDMElement()
	 * @generated
	 */
	EAttribute getRDMElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.RDMElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMElement#getLength()
	 * @see #getRDMElement()
	 * @generated
	 */
	EAttribute getRDMElement_Length();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Turnout
	 * @generated
	 */
	EClass getTurnout();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getCurrentDirection <em>Current Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getCurrentDirection()
	 * @see #getTurnout()
	 * @generated
	 */
	EAttribute getTurnout_CurrentDirection();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getSwitchingDirection <em>Switching Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switching Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getSwitchingDirection()
	 * @see #getTurnout()
	 * @generated
	 */
	EAttribute getTurnout_SwitchingDirection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection <em>Turnout Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout Desired Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection
	 * @generated
	 */
	EClass getTurnoutDesiredDirection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getReferredTurnout <em>Referred Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getReferredTurnout()
	 * @see #getTurnoutDesiredDirection()
	 * @generated
	 */
	EReference getTurnoutDesiredDirection_ReferredTurnout();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getDesiredDirection <em>Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getDesiredDirection()
	 * @see #getTurnoutDesiredDirection()
	 * @generated
	 */
	EAttribute getTurnoutDesiredDirection_DesiredDirection();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Route Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement()
	 * @see #getTurnoutDesiredDirection()
	 * @generated
	 */
	EReference getTurnoutDesiredDirection_RouteElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.gomrp.railway.RDM.Station#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Station#getControls()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Controls();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getDirection()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holds</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_Holds();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getNextElement <em>Next Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getNextElement()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_NextElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement
	 * @generated
	 */
	EClass getRouteElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getReferredElement()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_ReferredElement();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection <em>Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desired Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_DesiredDirection();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_BelongsTo();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getNextElement <em>Next Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Element</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getNextElement()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_NextElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal <em>Turnout Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout Signal</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal
	 * @generated
	 */
	EClass getTurnoutSignal();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal#getTurnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turnout</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal#getTurnout()
	 * @see #getTurnoutSignal()
	 * @generated
	 */
	EReference getTurnoutSignal_Turnout();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.railway.RDM.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @generated
	 */
	EEnum getSpeed();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection <em>Turnout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Turnout Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @generated
	 */
	EEnum getTurnoutDirection();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection <em>Connection Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Direction</em>'.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection
	 * @generated
	 */
	EEnum getConnectionDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDMFactory getRDMFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl <em>Railway Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRailwayDomainModel()
		 * @generated
		 */
		EClass RAILWAY_DOMAIN_MODEL = eINSTANCE.getRailwayDomainModel();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__TRAINS = eINSTANCE.getRailwayDomainModel_Trains();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__SECTIONS = eINSTANCE.getRailwayDomainModel_Sections();

		/**
		 * The meta object literal for the '<em><b>Turnouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__TURNOUTS = eINSTANCE.getRailwayDomainModel_Turnouts();

		/**
		 * The meta object literal for the '<em><b>Editor CP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__EDITOR_CP = eINSTANCE.getRailwayDomainModel_EditorCP();

		/**
		 * The meta object literal for the '<em><b>Editor Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL = eINSTANCE.getRailwayDomainModel_EditorSignal();

		/**
		 * The meta object literal for the '<em><b>Editor TDD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__EDITOR_TDD = eINSTANCE.getRailwayDomainModel_EditorTDD();

		/**
		 * The meta object literal for the '<em><b>Editor Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE = eINSTANCE.getRailwayDomainModel_EditorRoute();

		/**
		 * The meta object literal for the '<em><b>Editor Route Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT = eINSTANCE.getRailwayDomainModel_EditorRouteElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Heading Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__HEADING_SPEED = eINSTANCE.getTrain_HeadingSpeed();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__MAX_SPEED = eINSTANCE.getTrain_MaxSpeed();

		/**
		 * The meta object literal for the '<em><b>Arrives To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__ARRIVES_TO = eINSTANCE.getTrain_ArrivesTo();

		/**
		 * The meta object literal for the '<em><b>Departures From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__DEPARTURES_FROM = eINSTANCE.getTrain_DeparturesFrom();

		/**
		 * The meta object literal for the '<em><b>Follows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__FOLLOWS = eINSTANCE.getTrain_Follows();

		/**
		 * The meta object literal for the '<em><b>Stands On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__STANDS_ON = eINSTANCE.getTrain_StandsOn();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Allowed Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__ALLOWED_SPEED = eINSTANCE.getSignal_AllowedSpeed();

		/**
		 * The meta object literal for the '<em><b>Stands On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__STANDS_ON = eINSTANCE.getSignal_StandsOn();

		/**
		 * The meta object literal for the '<em><b>Observes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__OBSERVES = eINSTANCE.getSignal_Observes();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl <em>Track Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTrackElement()
		 * @generated
		 */
		EClass TRACK_ELEMENT = eINSTANCE.getTrackElement();

		/**
		 * The meta object literal for the '<em><b>Connects To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_ELEMENT__CONNECTS_TO = eINSTANCE.getTrackElement_ConnectsTo();

		/**
		 * The meta object literal for the '<em><b>Occupied By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_ELEMENT__OCCUPIED_BY = eINSTANCE.getTrackElement_OccupiedBy();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>First Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__FIRST_ELEMENT = eINSTANCE.getRoute_FirstElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMElementImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRDMElement()
		 * @generated
		 */
		EClass RDM_ELEMENT = eINSTANCE.getRDMElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDM_ELEMENT__NAME = eINSTANCE.getRDMElement_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDM_ELEMENT__LENGTH = eINSTANCE.getRDMElement_Length();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.SectionImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl <em>Turnout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnout()
		 * @generated
		 */
		EClass TURNOUT = eINSTANCE.getTurnout();

		/**
		 * The meta object literal for the '<em><b>Current Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT__CURRENT_DIRECTION = eINSTANCE.getTurnout_CurrentDirection();

		/**
		 * The meta object literal for the '<em><b>Switching Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT__SWITCHING_DIRECTION = eINSTANCE.getTurnout_SwitchingDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl <em>Turnout Desired Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutDesiredDirection()
		 * @generated
		 */
		EClass TURNOUT_DESIRED_DIRECTION = eINSTANCE.getTurnoutDesiredDirection();

		/**
		 * The meta object literal for the '<em><b>Referred Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT = eINSTANCE.getTurnoutDesiredDirection_ReferredTurnout();

		/**
		 * The meta object literal for the '<em><b>Desired Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION = eINSTANCE.getTurnoutDesiredDirection_DesiredDirection();

		/**
		 * The meta object literal for the '<em><b>Route Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT = eINSTANCE.getTurnoutDesiredDirection_RouteElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.StationImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__CONTROLS = eINSTANCE.getStation_Controls();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DIRECTION = eINSTANCE.getConnectionPoint_Direction();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__HOLDS = eINSTANCE.getConnectionPoint_Holds();

		/**
		 * The meta object literal for the '<em><b>Next Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__NEXT_ELEMENT = eINSTANCE.getConnectionPoint_NextElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl <em>Route Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getRouteElement()
		 * @generated
		 */
		EClass ROUTE_ELEMENT = eINSTANCE.getRouteElement();

		/**
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__REFERRED_ELEMENT = eINSTANCE.getRouteElement_ReferredElement();

		/**
		 * The meta object literal for the '<em><b>Desired Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__DESIRED_DIRECTION = eINSTANCE.getRouteElement_DesiredDirection();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__BELONGS_TO = eINSTANCE.getRouteElement_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Next Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__NEXT_ELEMENT = eINSTANCE.getRouteElement_NextElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutSignalImpl <em>Turnout Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutSignalImpl
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutSignal()
		 * @generated
		 */
		EClass TURNOUT_SIGNAL = eINSTANCE.getTurnoutSignal();

		/**
		 * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT_SIGNAL__TURNOUT = eINSTANCE.getTurnoutSignal_Turnout();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Speed <em>Speed</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getSpeed()
		 * @generated
		 */
		EEnum SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection <em>Turnout Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getTurnoutDirection()
		 * @generated
		 */
		EEnum TURNOUT_DIRECTION = eINSTANCE.getTurnoutDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection <em>Connection Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection
		 * @see hu.bme.mit.inf.gomrp.railway.RDM.impl.RDMPackageImpl#getConnectionDirection()
		 * @generated
		 */
		EEnum CONNECTION_DIRECTION = eINSTANCE.getConnectionDirection();

	}

} //RDMPackage
