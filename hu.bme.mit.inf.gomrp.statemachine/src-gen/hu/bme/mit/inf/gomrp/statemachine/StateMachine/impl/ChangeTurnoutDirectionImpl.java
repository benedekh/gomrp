/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTurnoutDirection;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Turnout Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl#getNewTurnoutDirection <em>New Turnout Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTurnoutDirectionImpl#getTurnout <em>Turnout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTurnoutDirectionImpl extends ActionExpressionImpl implements ChangeTurnoutDirection {
	/**
	 * The default value of the '{@link #getNewTurnoutDirection() <em>New Turnout Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTurnoutDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TurnoutDirection NEW_TURNOUT_DIRECTION_EDEFAULT = TurnoutDirection.LEFT;

	/**
	 * The cached value of the '{@link #getNewTurnoutDirection() <em>New Turnout Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTurnoutDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDirection newTurnoutDirection = NEW_TURNOUT_DIRECTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTurnoutDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.CHANGE_TURNOUT_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDirection getNewTurnoutDirection() {
		return newTurnoutDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTurnoutDirection(TurnoutDirection newNewTurnoutDirection) {
		TurnoutDirection oldNewTurnoutDirection = newTurnoutDirection;
		newTurnoutDirection = newNewTurnoutDirection == null ? NEW_TURNOUT_DIRECTION_EDEFAULT : newNewTurnoutDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION, oldNewTurnoutDirection, newTurnoutDirection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT, oldTurnout, turnout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT, oldTurnout, turnout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION:
				return getNewTurnoutDirection();
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT:
				if (resolve) return getTurnout();
				return basicGetTurnout();
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
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION:
				setNewTurnoutDirection((TurnoutDirection)newValue);
				return;
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT:
				setTurnout((Turnout)newValue);
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
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION:
				setNewTurnoutDirection(NEW_TURNOUT_DIRECTION_EDEFAULT);
				return;
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT:
				setTurnout((Turnout)null);
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
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__NEW_TURNOUT_DIRECTION:
				return newTurnoutDirection != NEW_TURNOUT_DIRECTION_EDEFAULT;
			case StateMachinePackage.CHANGE_TURNOUT_DIRECTION__TURNOUT:
				return turnout != null;
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
		result.append(" (newTurnoutDirection: ");
		result.append(newTurnoutDirection);
		result.append(')');
		return result.toString();
	}

} //ChangeTurnoutDirectionImpl
