/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.StateMachineBehavioralModelImpl#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineBehavioralModelImpl extends MinimalEObjectImpl.Container implements StateMachineBehavioralModel {
	/**
	 * The cached value of the '{@link #getStatemachines() <em>Statemachines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> statemachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineBehavioralModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.STATE_MACHINE_BEHAVIORAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStatemachines() {
		if (statemachines == null) {
			statemachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES);
		}
		return statemachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES:
				return ((InternalEList<?>)getStatemachines()).basicRemove(otherEnd, msgs);
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
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES:
				return getStatemachines();
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
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES:
				getStatemachines().clear();
				getStatemachines().addAll((Collection<? extends StateMachine>)newValue);
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
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES:
				getStatemachines().clear();
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
			case StateMachinePackage.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES:
				return statemachines != null && !statemachines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineBehavioralModelImpl
