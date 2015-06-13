/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeSignalAllowedSpeed;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Signal Allowed Speed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeSignalAllowedSpeedImpl#getNewAllowedSpeed <em>New Allowed Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeSignalAllowedSpeedImpl extends ActionExpressionImpl implements ChangeSignalAllowedSpeed {
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
	 * The default value of the '{@link #getNewAllowedSpeed() <em>New Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed NEW_ALLOWED_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getNewAllowedSpeed() <em>New Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed newAllowedSpeed = NEW_ALLOWED_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSignalAllowedSpeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.CHANGE_SIGNAL_ALLOWED_SPEED;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL, oldSignal, signal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getNewAllowedSpeed() {
		return newAllowedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAllowedSpeed(Speed newNewAllowedSpeed) {
		Speed oldNewAllowedSpeed = newAllowedSpeed;
		newAllowedSpeed = newNewAllowedSpeed == null ? NEW_ALLOWED_SPEED_EDEFAULT : newNewAllowedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED, oldNewAllowedSpeed, newAllowedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL:
				if (resolve) return getSignal();
				return basicGetSignal();
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED:
				return getNewAllowedSpeed();
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
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL:
				setSignal((Signal)newValue);
				return;
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED:
				setNewAllowedSpeed((Speed)newValue);
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
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL:
				setSignal((Signal)null);
				return;
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED:
				setNewAllowedSpeed(NEW_ALLOWED_SPEED_EDEFAULT);
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
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__SIGNAL:
				return signal != null;
			case StateMachinePackage.CHANGE_SIGNAL_ALLOWED_SPEED__NEW_ALLOWED_SPEED:
				return newAllowedSpeed != NEW_ALLOWED_SPEED_EDEFAULT;
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
		result.append(" (newAllowedSpeed: ");
		result.append(newAllowedSpeed);
		result.append(')');
		return result.toString();
	}

} //ChangeSignalAllowedSpeedImpl
