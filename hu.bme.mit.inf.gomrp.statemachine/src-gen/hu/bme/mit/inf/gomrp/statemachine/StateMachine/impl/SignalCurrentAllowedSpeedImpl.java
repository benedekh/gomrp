/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalCurrentAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Current Allowed Speed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl#getCurrentAllowedSpeed <em>Current Allowed Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.SignalCurrentAllowedSpeedImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalCurrentAllowedSpeedImpl extends GuardExpressionImpl implements SignalCurrentAllowedSpeed {
	/**
	 * The default value of the '{@link #getCurrentAllowedSpeed() <em>Current Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed CURRENT_ALLOWED_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getCurrentAllowedSpeed() <em>Current Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed currentAllowedSpeed = CURRENT_ALLOWED_SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalCurrentAllowedSpeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.SIGNAL_CURRENT_ALLOWED_SPEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getCurrentAllowedSpeed() {
		return currentAllowedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentAllowedSpeed(Speed newCurrentAllowedSpeed) {
		Speed oldCurrentAllowedSpeed = currentAllowedSpeed;
		currentAllowedSpeed = newCurrentAllowedSpeed == null ? CURRENT_ALLOWED_SPEED_EDEFAULT : newCurrentAllowedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED, oldCurrentAllowedSpeed, currentAllowedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		if (signal != null && signal.eIsProxy()) {
			InternalEObject oldSignal = (InternalEObject)signal;
			signal = (Signal)eResolveProxy(oldSignal);
			if (signal != oldSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL, oldSignal, signal));
			}
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED:
				return getCurrentAllowedSpeed();
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
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
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED:
				setCurrentAllowedSpeed((Speed)newValue);
				return;
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL:
				setSignal((Signal)newValue);
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
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED:
				setCurrentAllowedSpeed(CURRENT_ALLOWED_SPEED_EDEFAULT);
				return;
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL:
				setSignal((Signal)null);
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
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__CURRENT_ALLOWED_SPEED:
				return currentAllowedSpeed != CURRENT_ALLOWED_SPEED_EDEFAULT;
			case StateMachinePackage.SIGNAL_CURRENT_ALLOWED_SPEED__SIGNAL:
				return signal != null;
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
		result.append(" (currentAllowedSpeed: ");
		result.append(currentAllowedSpeed);
		result.append(')');
		return result.toString();
	}

} //SignalCurrentAllowedSpeedImpl
