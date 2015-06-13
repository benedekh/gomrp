/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Currently Stands On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TrainCurrentlyStandsOnImpl#getTrackElements <em>Track Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainCurrentlyStandsOnImpl extends GuardExpressionImpl implements TrainCurrentlyStandsOn {
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
	 * The cached value of the '{@link #getTrackElements() <em>Track Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackElement> trackElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainCurrentlyStandsOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TRAIN_CURRENTLY_STANDS_ON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN, oldTrain, train));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackElement> getTrackElements() {
		if (trackElements == null) {
			trackElements = new EObjectResolvingEList<TrackElement>(TrackElement.class, this, StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS);
		}
		return trackElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS:
				return getTrackElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN:
				setTrain((Train)newValue);
				return;
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS:
				getTrackElements().clear();
				getTrackElements().addAll((Collection<? extends TrackElement>)newValue);
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
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN:
				setTrain((Train)null);
				return;
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS:
				getTrackElements().clear();
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
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRAIN:
				return train != null;
			case StateMachinePackage.TRAIN_CURRENTLY_STANDS_ON__TRACK_ELEMENTS:
				return trackElements != null && !trackElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrainCurrentlyStandsOnImpl
