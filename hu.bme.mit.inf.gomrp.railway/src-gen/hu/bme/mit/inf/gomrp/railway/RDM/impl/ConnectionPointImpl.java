/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl#getHolds <em>Holds</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.ConnectionPointImpl#getNextElement <em>Next Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointImpl extends RDMElementImpl implements ConnectionPoint {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionDirection DIRECTION_EDEFAULT = ConnectionDirection.LEFT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ConnectionDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected Signal holds;

	/**
	 * The cached value of the '{@link #getNextElement() <em>Next Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextElement()
	 * @generated
	 * @ordered
	 */
	protected TrackElement nextElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.CONNECTION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ConnectionDirection newDirection) {
		ConnectionDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.CONNECTION_POINT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getHolds() {
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolds(Signal newHolds, NotificationChain msgs) {
		Signal oldHolds = holds;
		holds = newHolds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.CONNECTION_POINT__HOLDS, oldHolds, newHolds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolds(Signal newHolds) {
		if (newHolds != holds) {
			NotificationChain msgs = null;
			if (holds != null)
				msgs = ((InternalEObject)holds).eInverseRemove(this, RDMPackage.SIGNAL__STANDS_ON, Signal.class, msgs);
			if (newHolds != null)
				msgs = ((InternalEObject)newHolds).eInverseAdd(this, RDMPackage.SIGNAL__STANDS_ON, Signal.class, msgs);
			msgs = basicSetHolds(newHolds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.CONNECTION_POINT__HOLDS, newHolds, newHolds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getNextElement() {
		if (nextElement != null && nextElement.eIsProxy()) {
			InternalEObject oldNextElement = (InternalEObject)nextElement;
			nextElement = (TrackElement)eResolveProxy(oldNextElement);
			if (nextElement != oldNextElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.CONNECTION_POINT__NEXT_ELEMENT, oldNextElement, nextElement));
			}
		}
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetNextElement() {
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextElement(TrackElement newNextElement) {
		TrackElement oldNextElement = nextElement;
		nextElement = newNextElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.CONNECTION_POINT__NEXT_ELEMENT, oldNextElement, nextElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.CONNECTION_POINT__HOLDS:
				if (holds != null)
					msgs = ((InternalEObject)holds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDMPackage.CONNECTION_POINT__HOLDS, null, msgs);
				return basicSetHolds((Signal)otherEnd, msgs);
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
			case RDMPackage.CONNECTION_POINT__HOLDS:
				return basicSetHolds(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDMPackage.CONNECTION_POINT__DIRECTION:
				return getDirection();
			case RDMPackage.CONNECTION_POINT__HOLDS:
				return getHolds();
			case RDMPackage.CONNECTION_POINT__NEXT_ELEMENT:
				if (resolve) return getNextElement();
				return basicGetNextElement();
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
			case RDMPackage.CONNECTION_POINT__DIRECTION:
				setDirection((ConnectionDirection)newValue);
				return;
			case RDMPackage.CONNECTION_POINT__HOLDS:
				setHolds((Signal)newValue);
				return;
			case RDMPackage.CONNECTION_POINT__NEXT_ELEMENT:
				setNextElement((TrackElement)newValue);
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
			case RDMPackage.CONNECTION_POINT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case RDMPackage.CONNECTION_POINT__HOLDS:
				setHolds((Signal)null);
				return;
			case RDMPackage.CONNECTION_POINT__NEXT_ELEMENT:
				setNextElement((TrackElement)null);
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
			case RDMPackage.CONNECTION_POINT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case RDMPackage.CONNECTION_POINT__HOLDS:
				return holds != null;
			case RDMPackage.CONNECTION_POINT__NEXT_ELEMENT:
				return nextElement != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointImpl
