/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel;
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
 * An implementation of the model object '<em><b>Traceability Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TraceabilityModelImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceabilityModelImpl extends MinimalEObjectImpl.Container implements TraceabilityModel {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> targets;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> sources;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferredTypedElement> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.TRACEABILITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<TargetElement>(TargetElement.class, this, MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<SourceElement>(SourceElement.class, this, MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferredTypedElement> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ReferredTypedElement>(ReferredTypedElement.class, this, MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS:
				return getTargets();
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES:
				return getSources();
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES:
				return getTypes();
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
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends TargetElement>)newValue);
				return;
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ReferredTypedElement>)newValue);
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
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS:
				getTargets().clear();
				return;
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES:
				getSources().clear();
				return;
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES:
				getTypes().clear();
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
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TARGETS:
				return targets != null && !targets.isEmpty();
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__SOURCES:
				return sources != null && !sources.isEmpty();
			case MRPTraceabilityPackage.TRACEABILITY_MODEL__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceabilityModelImpl
