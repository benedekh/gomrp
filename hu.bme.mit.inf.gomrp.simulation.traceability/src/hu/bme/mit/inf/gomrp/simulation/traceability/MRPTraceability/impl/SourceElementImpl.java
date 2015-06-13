/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl#getSourceRDMElement <em>Source RDM Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.SourceElementImpl#getSourceSMElement <em>Source SM Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends MinimalEObjectImpl.Container implements SourceElement {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> target;

	/**
	 * The cached value of the '{@link #getSourceRDMElement() <em>Source RDM Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRDMElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RDMElement> sourceRDMElement;

	/**
	 * The cached value of the '{@link #getSourceSMElement() <em>Source SM Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSMElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> sourceSMElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getTarget() {
		if (target == null) {
			target = new EObjectWithInverseResolvingEList.ManyInverse<TargetElement>(TargetElement.class, this, MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET, MRPTraceabilityPackage.TARGET_ELEMENT__SOURCE);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDMElement> getSourceRDMElement() {
		if (sourceRDMElement == null) {
			sourceRDMElement = new EObjectResolvingEList<RDMElement>(RDMElement.class, this, MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_RDM_ELEMENT);
		}
		return sourceRDMElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSourceSMElement() {
		if (sourceSMElement == null) {
			sourceSMElement = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_SM_ELEMENT);
		}
		return sourceSMElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTarget()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				return getTarget();
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_RDM_ELEMENT:
				return getSourceRDMElement();
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_SM_ELEMENT:
				return getSourceSMElement();
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
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetElement>)newValue);
				return;
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_RDM_ELEMENT:
				getSourceRDMElement().clear();
				getSourceRDMElement().addAll((Collection<? extends RDMElement>)newValue);
				return;
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_SM_ELEMENT:
				getSourceSMElement().clear();
				getSourceSMElement().addAll((Collection<? extends NamedElement>)newValue);
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
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				getTarget().clear();
				return;
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_RDM_ELEMENT:
				getSourceRDMElement().clear();
				return;
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_SM_ELEMENT:
				getSourceSMElement().clear();
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
			case MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET:
				return target != null && !target.isEmpty();
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_RDM_ELEMENT:
				return sourceRDMElement != null && !sourceRDMElement.isEmpty();
			case MRPTraceabilityPackage.SOURCE_ELEMENT__SOURCE_SM_ELEMENT:
				return sourceSMElement != null && !sourceSMElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceElementImpl
