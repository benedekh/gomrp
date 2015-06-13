/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.Station;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal;

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
public class RDMPackageImpl extends EPackageImpl implements RDMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railwayDomainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutDesiredDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnoutSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum turnoutDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionDirectionEEnum = null;

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
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RDMPackageImpl() {
		super(eNS_URI, RDMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RDMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RDMPackage init() {
		if (isInited) return (RDMPackage)EPackage.Registry.INSTANCE.getEPackage(RDMPackage.eNS_URI);

		// Obtain or create and register package
		RDMPackageImpl theRDMPackage = (RDMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RDMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RDMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRDMPackage.createPackageContents();

		// Initialize created meta-data
		theRDMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRDMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RDMPackage.eNS_URI, theRDMPackage);
		return theRDMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailwayDomainModel() {
		return railwayDomainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_Trains() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_Sections() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_Turnouts() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_EditorCP() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_EditorSignal() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_EditorTDD() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_EditorRoute() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayDomainModel_EditorRouteElement() {
		return (EReference)railwayDomainModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_HeadingSpeed() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_MaxSpeed() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_ArrivesTo() {
		return (EReference)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_DeparturesFrom() {
		return (EReference)trainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_Follows() {
		return (EReference)trainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrain_StandsOn() {
		return (EReference)trainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_AllowedSpeed() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_StandsOn() {
		return (EReference)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_Observes() {
		return (EReference)signalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackElement() {
		return trackElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrackElement_ConnectsTo() {
		return (EReference)trackElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrackElement_OccupiedBy() {
		return (EReference)trackElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_FirstElement() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDMElement() {
		return rdmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDMElement_Name() {
		return (EAttribute)rdmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDMElement_Length() {
		return (EAttribute)rdmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnout() {
		return turnoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnout_CurrentDirection() {
		return (EAttribute)turnoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnout_SwitchingDirection() {
		return (EAttribute)turnoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnoutDesiredDirection() {
		return turnoutDesiredDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutDesiredDirection_ReferredTurnout() {
		return (EReference)turnoutDesiredDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnoutDesiredDirection_DesiredDirection() {
		return (EAttribute)turnoutDesiredDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutDesiredDirection_RouteElement() {
		return (EReference)turnoutDesiredDirectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Controls() {
		return (EReference)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint() {
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Direction() {
		return (EAttribute)connectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_Holds() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_NextElement() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteElement() {
		return routeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteElement_ReferredElement() {
		return (EReference)routeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteElement_DesiredDirection() {
		return (EReference)routeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteElement_BelongsTo() {
		return (EReference)routeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteElement_NextElement() {
		return (EReference)routeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnoutSignal() {
		return turnoutSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurnoutSignal_Turnout() {
		return (EReference)turnoutSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpeed() {
		return speedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTurnoutDirection() {
		return turnoutDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionDirection() {
		return connectionDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDMFactory getRDMFactory() {
		return (RDMFactory)getEFactoryInstance();
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
		railwayDomainModelEClass = createEClass(RAILWAY_DOMAIN_MODEL);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__TRAINS);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__SECTIONS);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__TURNOUTS);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__EDITOR_CP);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__EDITOR_TDD);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE);
		createEReference(railwayDomainModelEClass, RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__HEADING_SPEED);
		createEAttribute(trainEClass, TRAIN__MAX_SPEED);
		createEReference(trainEClass, TRAIN__ARRIVES_TO);
		createEReference(trainEClass, TRAIN__DEPARTURES_FROM);
		createEReference(trainEClass, TRAIN__FOLLOWS);
		createEReference(trainEClass, TRAIN__STANDS_ON);

		signalEClass = createEClass(SIGNAL);
		createEAttribute(signalEClass, SIGNAL__ALLOWED_SPEED);
		createEReference(signalEClass, SIGNAL__STANDS_ON);
		createEReference(signalEClass, SIGNAL__OBSERVES);

		trackElementEClass = createEClass(TRACK_ELEMENT);
		createEReference(trackElementEClass, TRACK_ELEMENT__CONNECTS_TO);
		createEReference(trackElementEClass, TRACK_ELEMENT__OCCUPIED_BY);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__FIRST_ELEMENT);

		rdmElementEClass = createEClass(RDM_ELEMENT);
		createEAttribute(rdmElementEClass, RDM_ELEMENT__NAME);
		createEAttribute(rdmElementEClass, RDM_ELEMENT__LENGTH);

		sectionEClass = createEClass(SECTION);

		turnoutEClass = createEClass(TURNOUT);
		createEAttribute(turnoutEClass, TURNOUT__CURRENT_DIRECTION);
		createEAttribute(turnoutEClass, TURNOUT__SWITCHING_DIRECTION);

		turnoutDesiredDirectionEClass = createEClass(TURNOUT_DESIRED_DIRECTION);
		createEReference(turnoutDesiredDirectionEClass, TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT);
		createEAttribute(turnoutDesiredDirectionEClass, TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION);
		createEReference(turnoutDesiredDirectionEClass, TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT);

		stationEClass = createEClass(STATION);
		createEReference(stationEClass, STATION__CONTROLS);

		connectionPointEClass = createEClass(CONNECTION_POINT);
		createEAttribute(connectionPointEClass, CONNECTION_POINT__DIRECTION);
		createEReference(connectionPointEClass, CONNECTION_POINT__HOLDS);
		createEReference(connectionPointEClass, CONNECTION_POINT__NEXT_ELEMENT);

		routeElementEClass = createEClass(ROUTE_ELEMENT);
		createEReference(routeElementEClass, ROUTE_ELEMENT__REFERRED_ELEMENT);
		createEReference(routeElementEClass, ROUTE_ELEMENT__DESIRED_DIRECTION);
		createEReference(routeElementEClass, ROUTE_ELEMENT__BELONGS_TO);
		createEReference(routeElementEClass, ROUTE_ELEMENT__NEXT_ELEMENT);

		turnoutSignalEClass = createEClass(TURNOUT_SIGNAL);
		createEReference(turnoutSignalEClass, TURNOUT_SIGNAL__TURNOUT);

		// Create enums
		speedEEnum = createEEnum(SPEED);
		turnoutDirectionEEnum = createEEnum(TURNOUT_DIRECTION);
		connectionDirectionEEnum = createEEnum(CONNECTION_DIRECTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		trainEClass.getESuperTypes().add(this.getRDMElement());
		signalEClass.getESuperTypes().add(this.getRDMElement());
		trackElementEClass.getESuperTypes().add(this.getRDMElement());
		routeEClass.getESuperTypes().add(this.getRDMElement());
		sectionEClass.getESuperTypes().add(this.getTrackElement());
		turnoutEClass.getESuperTypes().add(this.getTrackElement());
		turnoutDesiredDirectionEClass.getESuperTypes().add(this.getRDMElement());
		stationEClass.getESuperTypes().add(this.getSection());
		connectionPointEClass.getESuperTypes().add(this.getRDMElement());
		routeElementEClass.getESuperTypes().add(this.getRDMElement());
		turnoutSignalEClass.getESuperTypes().add(this.getSignal());

		// Initialize classes, features, and operations; add parameters
		initEClass(railwayDomainModelEClass, RailwayDomainModel.class, "RailwayDomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailwayDomainModel_Trains(), this.getTrain(), null, "trains", null, 2, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_Sections(), this.getSection(), null, "sections", null, 3, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_Turnouts(), this.getTurnout(), null, "turnouts", null, 2, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_EditorCP(), this.getConnectionPoint(), null, "editorCP", null, 0, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_EditorSignal(), this.getSignal(), null, "editorSignal", null, 0, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_EditorTDD(), this.getTurnoutDesiredDirection(), null, "editorTDD", null, 0, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_EditorRoute(), this.getRoute(), null, "editorRoute", null, 0, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayDomainModel_EditorRouteElement(), this.getRouteElement(), null, "editorRouteElement", null, 0, -1, RailwayDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_HeadingSpeed(), this.getSpeed(), "headingSpeed", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_MaxSpeed(), this.getSpeed(), "maxSpeed", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_ArrivesTo(), this.getStation(), null, "arrivesTo", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_DeparturesFrom(), this.getStation(), null, "departuresFrom", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Follows(), this.getRoute(), null, "follows", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_StandsOn(), this.getTrackElement(), this.getTrackElement_OccupiedBy(), "standsOn", null, 1, 2, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_AllowedSpeed(), this.getSpeed(), "allowedSpeed", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_StandsOn(), this.getConnectionPoint(), this.getConnectionPoint_Holds(), "standsOn", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_Observes(), this.getTrackElement(), null, "observes", null, 1, 1, Signal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(trackElementEClass, TrackElement.class, "TrackElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrackElement_ConnectsTo(), this.getConnectionPoint(), null, "connectsTo", null, 1, 3, TrackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrackElement_OccupiedBy(), this.getTrain(), this.getTrain_StandsOn(), "occupiedBy", null, 0, 1, TrackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_FirstElement(), this.getRouteElement(), this.getRouteElement_BelongsTo(), "firstElement", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdmElementEClass, RDMElement.class, "RDMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDMElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, RDMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDMElement_Length(), ecorePackage.getEInt(), "length", null, 0, 1, RDMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnoutEClass, Turnout.class, "Turnout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnout_CurrentDirection(), this.getTurnoutDirection(), "currentDirection", null, 0, 1, Turnout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnout_SwitchingDirection(), this.getTurnoutDirection(), "switchingDirection", null, 0, 1, Turnout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnoutDesiredDirectionEClass, TurnoutDesiredDirection.class, "TurnoutDesiredDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnoutDesiredDirection_ReferredTurnout(), this.getTurnout(), null, "referredTurnout", null, 1, 1, TurnoutDesiredDirection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnoutDesiredDirection_DesiredDirection(), this.getTurnoutDirection(), "desiredDirection", null, 0, 1, TurnoutDesiredDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurnoutDesiredDirection_RouteElement(), this.getRouteElement(), this.getRouteElement_DesiredDirection(), "routeElement", null, 0, 1, TurnoutDesiredDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStation_Controls(), this.getSignal(), null, "controls", null, 1, 2, Station.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(connectionPointEClass, ConnectionPoint.class, "ConnectionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionPoint_Direction(), this.getConnectionDirection(), "direction", null, 1, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_Holds(), this.getSignal(), this.getSignal_StandsOn(), "holds", null, 1, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_NextElement(), this.getTrackElement(), null, "nextElement", null, 1, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeElementEClass, RouteElement.class, "RouteElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteElement_ReferredElement(), this.getTrackElement(), null, "referredElement", null, 1, 1, RouteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteElement_DesiredDirection(), this.getTurnoutDesiredDirection(), this.getTurnoutDesiredDirection_RouteElement(), "desiredDirection", null, 0, 1, RouteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteElement_BelongsTo(), this.getRoute(), this.getRoute_FirstElement(), "belongsTo", null, 0, 1, RouteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteElement_NextElement(), this.getRouteElement(), null, "nextElement", null, 0, 1, RouteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnoutSignalEClass, TurnoutSignal.class, "TurnoutSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnoutSignal_Turnout(), this.getTurnout(), null, "turnout", null, 1, 1, TurnoutSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(speedEEnum, Speed.class, "Speed");
		addEEnumLiteral(speedEEnum, Speed.ZERO);
		addEEnumLiteral(speedEEnum, Speed.TWENTY);
		addEEnumLiteral(speedEEnum, Speed.FOURTY);
		addEEnumLiteral(speedEEnum, Speed.SIXTY);

		initEEnum(turnoutDirectionEEnum, TurnoutDirection.class, "TurnoutDirection");
		addEEnumLiteral(turnoutDirectionEEnum, TurnoutDirection.LEFT);
		addEEnumLiteral(turnoutDirectionEEnum, TurnoutDirection.RIGHT);
		addEEnumLiteral(turnoutDirectionEEnum, TurnoutDirection.STRAIGHT);

		initEEnum(connectionDirectionEEnum, ConnectionDirection.class, "ConnectionDirection");
		addEEnumLiteral(connectionDirectionEEnum, ConnectionDirection.LEFT);
		addEEnumLiteral(connectionDirectionEEnum, ConnectionDirection.RIGHT);
		addEEnumLiteral(connectionDirectionEEnum, ConnectionDirection.STRAIGHT);
		addEEnumLiteral(connectionDirectionEEnum, ConnectionDirection.TOP);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// org.eclipse.incquery.querybasedfeature
		createOrgAnnotations();
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
		  (getSignal_Observes(), 
		   source, 
		   new String[] {
			 "patternFQN", "hu.bme.mit.inf.gomrp.railway.incquery.observes"
		   });	
		addAnnotation
		  (getTurnoutDesiredDirection_ReferredTurnout(), 
		   source, 
		   new String[] {
			 "patternFQN", "hu.bme.mit.inf.gomrp.railway.incquery.referredTurnout"
		   });	
		addAnnotation
		  (getStation_Controls(), 
		   source, 
		   new String[] {
			 "patternFQN", "hu.bme.mit.inf.gomrp.railway.incquery.controls"
		   });
	}

} //RDMPackageImpl
