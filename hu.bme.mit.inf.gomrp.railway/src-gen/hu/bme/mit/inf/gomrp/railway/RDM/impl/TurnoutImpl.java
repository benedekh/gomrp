/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl#getCurrentDirection <em>Current Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutImpl#getSwitchingDirection <em>Switching Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnoutImpl extends TrackElementImpl implements Turnout {
	/**
	 * The default value of the '{@link #getCurrentDirection() <em>Current Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TurnoutDirection CURRENT_DIRECTION_EDEFAULT = TurnoutDirection.LEFT;

	/**
	 * The cached value of the '{@link #getCurrentDirection() <em>Current Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDirection currentDirection = CURRENT_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchingDirection() <em>Switching Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TurnoutDirection SWITCHING_DIRECTION_EDEFAULT = TurnoutDirection.LEFT;

	/**
	 * The cached value of the '{@link #getSwitchingDirection() <em>Switching Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDirection switchingDirection = SWITCHING_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.TURNOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection getCurrentDirection() {
		return currentDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDirection(TurnoutDirection newCurrentDirection) {
		TurnoutDirection oldCurrentDirection = currentDirection;
		currentDirection = newCurrentDirection == null ? CURRENT_DIRECTION_EDEFAULT : newCurrentDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TURNOUT__CURRENT_DIRECTION, oldCurrentDirection, currentDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection getSwitchingDirection() {
		return switchingDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchingDirection(TurnoutDirection newSwitchingDirection) {
		TurnoutDirection oldSwitchingDirection = switchingDirection;
		switchingDirection = newSwitchingDirection == null ? SWITCHING_DIRECTION_EDEFAULT : newSwitchingDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TURNOUT__SWITCHING_DIRECTION, oldSwitchingDirection, switchingDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDMPackage.TURNOUT__CURRENT_DIRECTION:
				return getCurrentDirection();
			case RDMPackage.TURNOUT__SWITCHING_DIRECTION:
				return getSwitchingDirection();
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
			case RDMPackage.TURNOUT__CURRENT_DIRECTION:
				setCurrentDirection((TurnoutDirection)newValue);
				return;
			case RDMPackage.TURNOUT__SWITCHING_DIRECTION:
				setSwitchingDirection((TurnoutDirection)newValue);
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
			case RDMPackage.TURNOUT__CURRENT_DIRECTION:
				setCurrentDirection(CURRENT_DIRECTION_EDEFAULT);
				return;
			case RDMPackage.TURNOUT__SWITCHING_DIRECTION:
				setSwitchingDirection(SWITCHING_DIRECTION_EDEFAULT);
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
			case RDMPackage.TURNOUT__CURRENT_DIRECTION:
				return currentDirection != CURRENT_DIRECTION_EDEFAULT;
			case RDMPackage.TURNOUT__SWITCHING_DIRECTION:
				return switchingDirection != SWITCHING_DIRECTION_EDEFAULT;
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
		result.append(" (currentDirection: ");
		result.append(currentDirection);
		result.append(", switchingDirection: ");
		result.append(switchingDirection);
		result.append(')');
		return result.toString();
	}

} //TurnoutImpl
