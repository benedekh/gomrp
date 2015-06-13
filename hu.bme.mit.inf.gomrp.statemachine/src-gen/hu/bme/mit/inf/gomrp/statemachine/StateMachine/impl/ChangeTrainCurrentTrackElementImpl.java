/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.ChangeTrainCurrentTrackElement;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Train Current Track Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.ChangeTrainCurrentTrackElementImpl#getNewTrackElements <em>New Track Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTrainCurrentTrackElementImpl extends ActionExpressionImpl implements ChangeTrainCurrentTrackElement {
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
	 * The cached value of the '{@link #getNewTrackElements() <em>New Track Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTrackElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackElement> newTrackElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTrainCurrentTrackElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN, oldTrain, train));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackElement> getNewTrackElements() {
		if (newTrackElements == null) {
			newTrackElements = new EObjectResolvingEList<TrackElement>(TrackElement.class, this, StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS);
		}
		return newTrackElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS:
				return getNewTrackElements();
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
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN:
				setTrain((Train)newValue);
				return;
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS:
				getNewTrackElements().clear();
				getNewTrackElements().addAll((Collection<? extends TrackElement>)newValue);
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
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN:
				setTrain((Train)null);
				return;
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS:
				getNewTrackElements().clear();
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
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__TRAIN:
				return train != null;
			case StateMachinePackage.CHANGE_TRAIN_CURRENT_TRACK_ELEMENT__NEW_TRACK_ELEMENTS:
				return newTrackElements != null && !newTrackElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeTrainCurrentTrackElementImpl
