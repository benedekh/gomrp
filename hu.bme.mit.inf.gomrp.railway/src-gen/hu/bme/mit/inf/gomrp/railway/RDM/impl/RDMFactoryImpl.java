/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RDMFactoryImpl extends EFactoryImpl implements RDMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RDMFactory init() {
		try {
			RDMFactory theRDMFactory = (RDMFactory)EPackage.Registry.INSTANCE.getEFactory(RDMPackage.eNS_URI);
			if (theRDMFactory != null) {
				return theRDMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RDMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RDMPackage.RAILWAY_DOMAIN_MODEL: return createRailwayDomainModel();
			case RDMPackage.TRAIN: return createTrain();
			case RDMPackage.SIGNAL: return createSignal();
			case RDMPackage.ROUTE: return createRoute();
			case RDMPackage.SECTION: return createSection();
			case RDMPackage.TURNOUT: return createTurnout();
			case RDMPackage.TURNOUT_DESIRED_DIRECTION: return createTurnoutDesiredDirection();
			case RDMPackage.STATION: return createStation();
			case RDMPackage.CONNECTION_POINT: return createConnectionPoint();
			case RDMPackage.ROUTE_ELEMENT: return createRouteElement();
			case RDMPackage.TURNOUT_SIGNAL: return createTurnoutSignal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RDMPackage.SPEED:
				return createSpeedFromString(eDataType, initialValue);
			case RDMPackage.TURNOUT_DIRECTION:
				return createTurnoutDirectionFromString(eDataType, initialValue);
			case RDMPackage.CONNECTION_DIRECTION:
				return createConnectionDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RDMPackage.SPEED:
				return convertSpeedToString(eDataType, instanceValue);
			case RDMPackage.TURNOUT_DIRECTION:
				return convertTurnoutDirectionToString(eDataType, instanceValue);
			case RDMPackage.CONNECTION_DIRECTION:
				return convertConnectionDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayDomainModel createRailwayDomainModel() {
		RailwayDomainModelImpl railwayDomainModel = new RailwayDomainModelImpl();
		return railwayDomainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train createTrain() {
		TrainImpl train = new TrainImpl();
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout createTurnout() {
		TurnoutImpl turnout = new TurnoutImpl();
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDesiredDirection createTurnoutDesiredDirection() {
		TurnoutDesiredDirectionImpl turnoutDesiredDirection = new TurnoutDesiredDirectionImpl();
		return turnoutDesiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint createConnectionPoint() {
		ConnectionPointImpl connectionPoint = new ConnectionPointImpl();
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement createRouteElement() {
		RouteElementImpl routeElement = new RouteElementImpl();
		return routeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutSignal createTurnoutSignal() {
		TurnoutSignalImpl turnoutSignal = new TurnoutSignalImpl();
		return turnoutSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed createSpeedFromString(EDataType eDataType, String initialValue) {
		Speed result = Speed.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection createTurnoutDirectionFromString(EDataType eDataType, String initialValue) {
		TurnoutDirection result = TurnoutDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTurnoutDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDirection createConnectionDirectionFromString(EDataType eDataType, String initialValue) {
		ConnectionDirection result = ConnectionDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDMPackage getRDMPackage() {
		return (RDMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RDMPackage getPackage() {
		return RDMPackage.eINSTANCE;
	}

} //RDMFactoryImpl
