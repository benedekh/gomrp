/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout Desired Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl#getReferredTurnout <em>Referred Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl#getDesiredDirection <em>Desired Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutDesiredDirectionImpl#getRouteElement <em>Route Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnoutDesiredDirectionImpl extends RDMElementImpl implements TurnoutDesiredDirection {
	/**
	 * The cached setting delegate for the '{@link #getReferredTurnout() <em>Referred Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredTurnout()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFERRED_TURNOUT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RDMPackage.Literals.TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT).getSettingDelegate();

	/**
	 * The default value of the '{@link #getDesiredDirection() <em>Desired Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TurnoutDirection DESIRED_DIRECTION_EDEFAULT = TurnoutDirection.LEFT;

	/**
	 * The cached value of the '{@link #getDesiredDirection() <em>Desired Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDirection desiredDirection = DESIRED_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutDesiredDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.TURNOUT_DESIRED_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout getReferredTurnout() {
		return (Turnout)REFERRED_TURNOUT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout basicGetReferredTurnout() {
		return (Turnout)REFERRED_TURNOUT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection getDesiredDirection() {
		return desiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredDirection(TurnoutDirection newDesiredDirection) {
		TurnoutDirection oldDesiredDirection = desiredDirection;
		desiredDirection = newDesiredDirection == null ? DESIRED_DIRECTION_EDEFAULT : newDesiredDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION, oldDesiredDirection, desiredDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getRouteElement() {
		if (eContainerFeatureID() != RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT) return null;
		return (RouteElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteElement(RouteElement newRouteElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouteElement, RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteElement(RouteElement newRouteElement) {
		if (newRouteElement != eInternalContainer() || (eContainerFeatureID() != RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT && newRouteElement != null)) {
			if (EcoreUtil.isAncestor(this, newRouteElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouteElement != null)
				msgs = ((InternalEObject)newRouteElement).eInverseAdd(this, RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION, RouteElement.class, msgs);
			msgs = basicSetRouteElement(newRouteElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT, newRouteElement, newRouteElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouteElement((RouteElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				return basicSetRouteElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION, RouteElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT:
				if (resolve) return getReferredTurnout();
				return basicGetReferredTurnout();
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION:
				return getDesiredDirection();
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				return getRouteElement();
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
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION:
				setDesiredDirection((TurnoutDirection)newValue);
				return;
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				setRouteElement((RouteElement)newValue);
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
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION:
				setDesiredDirection(DESIRED_DIRECTION_EDEFAULT);
				return;
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				setRouteElement((RouteElement)null);
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
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__REFERRED_TURNOUT:
				return REFERRED_TURNOUT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__DESIRED_DIRECTION:
				return desiredDirection != DESIRED_DIRECTION_EDEFAULT;
			case RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT:
				return getRouteElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (desiredDirection: ");
		result.append(desiredDirection);
		result.append(')');
		return result.toString();
	}

} //TurnoutDesiredDirectionImpl
