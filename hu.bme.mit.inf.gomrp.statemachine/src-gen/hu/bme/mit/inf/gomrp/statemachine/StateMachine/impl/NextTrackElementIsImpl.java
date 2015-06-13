/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Track Element Is</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl#getRouteElement <em>Route Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.NextTrackElementIsImpl#getTrackElement <em>Track Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NextTrackElementIsImpl extends GuardExpressionImpl implements NextTrackElementIs {
	/**
	 * The cached value of the '{@link #getRouteElement() <em>Route Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteElement()
	 * @generated
	 * @ordered
	 */
	protected RouteElement routeElement;

	/**
	 * The cached value of the '{@link #getTrackElement() <em>Track Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackElement()
	 * @generated
	 * @ordered
	 */
	protected TrackElement trackElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextTrackElementIsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.NEXT_TRACK_ELEMENT_IS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getRouteElement() {
		if (routeElement != null && routeElement.eIsProxy()) {
			InternalEObject oldRouteElement = (InternalEObject)routeElement;
			routeElement = (RouteElement)eResolveProxy(oldRouteElement);
			if (routeElement != oldRouteElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT, oldRouteElement, routeElement));
			}
		}
		return routeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement basicGetRouteElement() {
		return routeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteElement(RouteElement newRouteElement) {
		RouteElement oldRouteElement = routeElement;
		routeElement = newRouteElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT, oldRouteElement, routeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getTrackElement() {
		if (trackElement != null && trackElement.eIsProxy()) {
			InternalEObject oldTrackElement = (InternalEObject)trackElement;
			trackElement = (TrackElement)eResolveProxy(oldTrackElement);
			if (trackElement != oldTrackElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT, oldTrackElement, trackElement));
			}
		}
		return trackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetTrackElement() {
		return trackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackElement(TrackElement newTrackElement) {
		TrackElement oldTrackElement = trackElement;
		trackElement = newTrackElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT, oldTrackElement, trackElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT:
				if (resolve) return getRouteElement();
				return basicGetRouteElement();
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT:
				if (resolve) return getTrackElement();
				return basicGetTrackElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT:
				setRouteElement((RouteElement)newValue);
				return;
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT:
				setTrackElement((TrackElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT:
				setRouteElement((RouteElement)null);
				return;
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT:
				setTrackElement((TrackElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__ROUTE_ELEMENT:
				return routeElement != null;
			case StateMachinePackage.NEXT_TRACK_ELEMENT_IS__TRACK_ELEMENT:
				return trackElement != null;
		}
		return super.eIsSet(featureID);
	}

} //NextTrackElementIsImpl
