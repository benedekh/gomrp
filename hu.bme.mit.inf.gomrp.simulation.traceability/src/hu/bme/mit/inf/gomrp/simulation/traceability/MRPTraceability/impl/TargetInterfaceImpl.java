/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl#getExtendsInterface <em>Extends Interface</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetInterfaceImpl#getExtendsSpecial <em>Extends Special</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetInterfaceImpl extends TargetClassifierImpl implements TargetInterface {
	/**
	 * The cached value of the '{@link #getExtendsInterface() <em>Extends Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetInterface> extendsInterface;

	/**
	 * The cached value of the '{@link #getExtendsSpecial() <em>Extends Special</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsSpecial()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferredTypedElement> extendsSpecial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.TARGET_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetInterface> getExtendsInterface() {
		if (extendsInterface == null) {
			extendsInterface = new EObjectResolvingEList<TargetInterface>(TargetInterface.class, this, MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_INTERFACE);
		}
		return extendsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferredTypedElement> getExtendsSpecial() {
		if (extendsSpecial == null) {
			extendsSpecial = new EObjectResolvingEList<ReferredTypedElement>(ReferredTypedElement.class, this, MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_SPECIAL);
		}
		return extendsSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_INTERFACE:
				return getExtendsInterface();
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_SPECIAL:
				return getExtendsSpecial();
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
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_INTERFACE:
				getExtendsInterface().clear();
				getExtendsInterface().addAll((Collection<? extends TargetInterface>)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_SPECIAL:
				getExtendsSpecial().clear();
				getExtendsSpecial().addAll((Collection<? extends ReferredTypedElement>)newValue);
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
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_INTERFACE:
				getExtendsInterface().clear();
				return;
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_SPECIAL:
				getExtendsSpecial().clear();
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
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_INTERFACE:
				return extendsInterface != null && !extendsInterface.isEmpty();
			case MRPTraceabilityPackage.TARGET_INTERFACE__EXTENDS_SPECIAL:
				return extendsSpecial != null && !extendsSpecial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetInterfaceImpl
