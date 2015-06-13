/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainHeadingSpeedChanged;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Heading Speed Changed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainHeadingSpeedChangedImpl#getNewHeadingSpeed <em>New Heading Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainHeadingSpeedChangedImpl extends TriggerExpressionImpl implements TrainHeadingSpeedChanged {
	/**
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected Train train;

	/**
	 * The default value of the '{@link #getNewHeadingSpeed() <em>New Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewHeadingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed NEW_HEADING_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getNewHeadingSpeed() <em>New Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewHeadingSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed newHeadingSpeed = NEW_HEADING_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainHeadingSpeedChangedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TRAIN_HEADING_SPEED_CHANGED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train getTrain() {
		if (train != null && train.eIsProxy()) {
			InternalEObject oldTrain = (InternalEObject)train;
			train = (Train)eResolveProxy(oldTrain);
			if (train != oldTrain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN, oldTrain, train));
			}
		}
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrain(Train newTrain) {
		Train oldTrain = train;
		train = newTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getNewHeadingSpeed() {
		return newHeadingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewHeadingSpeed(Speed newNewHeadingSpeed) {
		Speed oldNewHeadingSpeed = newHeadingSpeed;
		newHeadingSpeed = newNewHeadingSpeed == null ? NEW_HEADING_SPEED_EDEFAULT : newNewHeadingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED, oldNewHeadingSpeed, newHeadingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED:
				return getNewHeadingSpeed();
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
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN:
				setTrain((Train)newValue);
				return;
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED:
				setNewHeadingSpeed((Speed)newValue);
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
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN:
				setTrain((Train)null);
				return;
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED:
				setNewHeadingSpeed(NEW_HEADING_SPEED_EDEFAULT);
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
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__TRAIN:
				return train != null;
			case StateMachinePackage.TRAIN_HEADING_SPEED_CHANGED__NEW_HEADING_SPEED:
				return newHeadingSpeed != NEW_HEADING_SPEED_EDEFAULT;
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
		result.append(" (newHeadingSpeed: ");
		result.append(newHeadingSpeed);
		result.append(')');
		return result.toString();
	}

} //TrainHeadingSpeedChangedImpl
