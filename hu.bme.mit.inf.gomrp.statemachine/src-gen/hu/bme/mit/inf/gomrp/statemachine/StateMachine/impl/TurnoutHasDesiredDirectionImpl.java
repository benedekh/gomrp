/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout Has Desired Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl#getTurnout <em>Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TurnoutHasDesiredDirectionImpl#getDesiredDirection <em>Desired Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnoutHasDesiredDirectionImpl extends GuardExpressionImpl implements TurnoutHasDesiredDirection {
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
	 * The cached value of the '{@link #getDesiredDirection() <em>Desired Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDirection()
	 * @generated
	 * @ordered
	 */
	protected TurnoutDesiredDirection desiredDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutHasDesiredDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TURNOUT_HAS_DESIRED_DIRECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT, oldTurnout, turnout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT, oldTurnout, turnout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDesiredDirection getDesiredDirection() {
		if (desiredDirection != null && desiredDirection.eIsProxy()) {
			InternalEObject oldDesiredDirection = (InternalEObject)desiredDirection;
			desiredDirection = (TurnoutDesiredDirection)eResolveProxy(oldDesiredDirection);
			if (desiredDirection != oldDesiredDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION, oldDesiredDirection, desiredDirection));
			}
		}
		return desiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnoutDesiredDirection basicGetDesiredDirection() {
		return desiredDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredDirection(TurnoutDesiredDirection newDesiredDirection) {
		TurnoutDesiredDirection oldDesiredDirection = desiredDirection;
		desiredDirection = newDesiredDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION, oldDesiredDirection, desiredDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT:
				if (resolve) return getTurnout();
				return basicGetTurnout();
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION:
				if (resolve) return getDesiredDirection();
				return basicGetDesiredDirection();
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
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT:
				setTurnout((Turnout)newValue);
				return;
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION:
				setDesiredDirection((TurnoutDesiredDirection)newValue);
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
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT:
				setTurnout((Turnout)null);
				return;
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION:
				setDesiredDirection((TurnoutDesiredDirection)null);
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
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__TURNOUT:
				return turnout != null;
			case StateMachinePackage.TURNOUT_HAS_DESIRED_DIRECTION__DESIRED_DIRECTION:
				return desiredDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //TurnoutHasDesiredDirectionImpl
