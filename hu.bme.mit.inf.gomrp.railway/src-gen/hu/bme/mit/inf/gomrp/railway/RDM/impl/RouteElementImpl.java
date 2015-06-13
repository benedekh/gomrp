/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl#getReferredElement <em>Referred Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl#getDesiredDirection <em>Desired Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteElementImpl#getNextElement <em>Next Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteElementImpl extends RDMElementImpl implements RouteElement {
	/**
	 * The cached value of the '{@link #getReferredElement() <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredElement()
	 * @generated
	 * @ordered
	 */
	protected TrackElement referredElement;

	/**
	 * The cached value of the '{@link #getDesiredDirection() <em>Desired Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDesiredDirection desiredDirection;

	/**
	 * The cached value of the '{@link #getNextElement() <em>Next Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextElement()
	 * @generated
	 * @ordered
	 */
	protected RouteElement nextElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.ROUTE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getReferredElement() {
		if (referredElement != null && referredElement.eIsProxy()) {
			InternalEObject oldReferredElement = (InternalEObject)referredElement;
			referredElement = (TrackElement)eResolveProxy(oldReferredElement);
			if (referredElement != oldReferredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT, oldReferredElement, referredElement));
			}
		}
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetReferredElement() {
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredElement(TrackElement newReferredElement) {
		TrackElement oldReferredElement = referredElement;
		referredElement = newReferredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT, oldReferredElement, referredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDesiredDirection getDesiredDirection() {
		return desiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesiredDirection(TurnoutDesiredDirection newDesiredDirection, NotificationChain msgs) {
		TurnoutDesiredDirection oldDesiredDirection = desiredDirection;
		desiredDirection = newDesiredDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION, oldDesiredDirection, newDesiredDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredDirection(TurnoutDesiredDirection newDesiredDirection) {
		if (newDesiredDirection != desiredDirection) {
			NotificationChain msgs = null;
			if (desiredDirection != null)
				msgs = ((InternalEObject)desiredDirection).eInverseRemove(this, RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT, TurnoutDesiredDirection.class, msgs);
			if (newDesiredDirection != null)
				msgs = ((InternalEObject)newDesiredDirection).eInverseAdd(this, RDMPackage.TURNOUT_DESIRED_DIRECTION__ROUTE_ELEMENT, TurnoutDesiredDirection.class, msgs);
			msgs = basicSetDesiredDirection(newDesiredDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION, newDesiredDirection, newDesiredDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getBelongsTo() {
		if (eContainerFeatureID() != RDMPackage.ROUTE_ELEMENT__BELONGS_TO) return null;
		return (Route)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(Route newBelongsTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsTo, RDMPackage.ROUTE_ELEMENT__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Route newBelongsTo) {
		if (newBelongsTo != eInternalContainer() || (eContainerFeatureID() != RDMPackage.ROUTE_ELEMENT__BELONGS_TO && newBelongsTo != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, RDMPackage.ROUTE__FIRST_ELEMENT, Route.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getNextElement() {
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextElement(RouteElement newNextElement, NotificationChain msgs) {
		RouteElement oldNextElement = nextElement;
		nextElement = newNextElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT, oldNextElement, newNextElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextElement(RouteElement newNextElement) {
		if (newNextElement != nextElement) {
			NotificationChain msgs = null;
			if (nextElement != null)
				msgs = ((InternalEObject)nextElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT, null, msgs);
			if (newNextElement != null)
				msgs = ((InternalEObject)newNextElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT, null, msgs);
			msgs = basicSetNextElement(newNextElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT, newNextElement, newNextElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				if (desiredDirection != null)
					msgs = ((InternalEObject)desiredDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION, null, msgs);
				return basicSetDesiredDirection((TurnoutDesiredDirection)otherEnd, msgs);
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsTo((Route)otherEnd, msgs);
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
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				return basicSetDesiredDirection(null, msgs);
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT:
				return basicSetNextElement(null, msgs);
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
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				return eInternalContainer().eInverseRemove(this, RDMPackage.ROUTE__FIRST_ELEMENT, Route.class, msgs);
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
			case RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT:
				if (resolve) return getReferredElement();
				return basicGetReferredElement();
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				return getDesiredDirection();
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				return getBelongsTo();
			case RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT:
				return getNextElement();
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
			case RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT:
				setReferredElement((TrackElement)newValue);
				return;
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				setDesiredDirection((TurnoutDesiredDirection)newValue);
				return;
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				setBelongsTo((Route)newValue);
				return;
			case RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT:
				setNextElement((RouteElement)newValue);
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
			case RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT:
				setReferredElement((TrackElement)null);
				return;
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				setDesiredDirection((TurnoutDesiredDirection)null);
				return;
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				setBelongsTo((Route)null);
				return;
			case RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT:
				setNextElement((RouteElement)null);
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
			case RDMPackage.ROUTE_ELEMENT__REFERRED_ELEMENT:
				return referredElement != null;
			case RDMPackage.ROUTE_ELEMENT__DESIRED_DIRECTION:
				return desiredDirection != null;
			case RDMPackage.ROUTE_ELEMENT__BELONGS_TO:
				return getBelongsTo() != null;
			case RDMPackage.ROUTE_ELEMENT__NEXT_ELEMENT:
				return nextElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteElementImpl
