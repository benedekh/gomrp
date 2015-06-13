/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutCurrentDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout Current Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl#getTurnout <em>Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutCurrentDirectionImpl#getCurrentTurnoutDirection <em>Current Turnout Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnoutCurrentDirectionImpl extends GuardExpressionImpl implements TurnoutCurrentDirection {
	/**
	 * The cached value of the '{@link #getTurnout() <em>Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnout()
	 * @generated
	 * @ordered
	 */
	protected Turnout turnout;

	/**
	 * The default value of the '{@link #getCurrentTurnoutDirection() <em>Current Turnout Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTurnoutDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TurnoutDirection CURRENT_TURNOUT_DIRECTION_EDEFAULT = TurnoutDirection.LEFT;

	/**
	 * The cached value of the '{@link #getCurrentTurnoutDirection() <em>Current Turnout Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTurnoutDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDirection currentTurnoutDirection = CURRENT_TURNOUT_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutCurrentDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TURNOUT_CURRENT_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout getTurnout() {
		if (turnout != null && turnout.eIsProxy()) {
			InternalEObject oldTurnout = (InternalEObject)turnout;
			turnout = (Turnout)eResolveProxy(oldTurnout);
			if (turnout != oldTurnout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT, oldTurnout, turnout));
			}
		}
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout basicGetTurnout() {
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnout(Turnout newTurnout) {
		Turnout oldTurnout = turnout;
		turnout = newTurnout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT, oldTurnout, turnout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection getCurrentTurnoutDirection() {
		return currentTurnoutDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTurnoutDirection(TurnoutDirection newCurrentTurnoutDirection) {
		TurnoutDirection oldCurrentTurnoutDirection = currentTurnoutDirection;
		currentTurnoutDirection = newCurrentTurnoutDirection == null ? CURRENT_TURNOUT_DIRECTION_EDEFAULT : newCurrentTurnoutDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION, oldCurrentTurnoutDirection, currentTurnoutDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT:
				if (resolve) return getTurnout();
				return basicGetTurnout();
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION:
				return getCurrentTurnoutDirection();
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
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT:
				setTurnout((Turnout)newValue);
				return;
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION:
				setCurrentTurnoutDirection((TurnoutDirection)newValue);
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
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT:
				setTurnout((Turnout)null);
				return;
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION:
				setCurrentTurnoutDirection(CURRENT_TURNOUT_DIRECTION_EDEFAULT);
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
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__TURNOUT:
				return turnout != null;
			case StateMachinePackage.TURNOUT_CURRENT_DIRECTION__CURRENT_TURNOUT_DIRECTION:
				return currentTurnoutDirection != CURRENT_TURNOUT_DIRECTION_EDEFAULT;
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
		result.append(" (currentTurnoutDirection: ");
		result.append(currentTurnoutDirection);
		result.append(')');
		return result.toString();
	}

} //TurnoutCurrentDirectionImpl
