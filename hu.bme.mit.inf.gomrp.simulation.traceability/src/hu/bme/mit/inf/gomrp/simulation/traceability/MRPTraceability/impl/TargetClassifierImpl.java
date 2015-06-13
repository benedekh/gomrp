/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl#getIsIn <em>Is In</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl#getIsInSpecial <em>Is In Special</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassifierImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TargetClassifierImpl extends TargetElementImpl implements TargetClassifier {
	/**
	 * The cached value of the '{@link #getIsIn() <em>Is In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIn()
	 * @generated
	 * @ordered
	 */
	protected TargetPackage isIn;

	/**
	 * The cached value of the '{@link #getIsInSpecial() <em>Is In Special</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInSpecial()
	 * @generated
	 * @ordered
	 */
	protected ReferredTypedElement isInSpecial;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final ClassifierVisibility VISIBILITY_EDEFAULT = ClassifierVisibility.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected ClassifierVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetMember> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.TARGET_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPackage getIsIn() {
		if (isIn != null && isIn.eIsProxy()) {
			InternalEObject oldIsIn = (InternalEObject)isIn;
			isIn = (TargetPackage)eResolveProxy(oldIsIn);
			if (isIn != oldIsIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN, oldIsIn, isIn));
			}
		}
		return isIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPackage basicGetIsIn() {
		return isIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIn(TargetPackage newIsIn) {
		TargetPackage oldIsIn = isIn;
		isIn = newIsIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN, oldIsIn, isIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredTypedElement getIsInSpecial() {
		if (isInSpecial != null && isInSpecial.eIsProxy()) {
			InternalEObject oldIsInSpecial = (InternalEObject)isInSpecial;
			isInSpecial = (ReferredTypedElement)eResolveProxy(oldIsInSpecial);
			if (isInSpecial != oldIsInSpecial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL, oldIsInSpecial, isInSpecial));
			}
		}
		return isInSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredTypedElement basicGetIsInSpecial() {
		return isInSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInSpecial(ReferredTypedElement newIsInSpecial) {
		ReferredTypedElement oldIsInSpecial = isInSpecial;
		isInSpecial = newIsInSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL, oldIsInSpecial, isInSpecial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(ClassifierVisibility newVisibility) {
		ClassifierVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASSIFIER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<TargetMember>(TargetMember.class, this, MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN:
				if (resolve) return getIsIn();
				return basicGetIsIn();
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL:
				if (resolve) return getIsInSpecial();
				return basicGetIsInSpecial();
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__VISIBILITY:
				return getVisibility();
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS:
				return getMembers();
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
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN:
				setIsIn((TargetPackage)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL:
				setIsInSpecial((ReferredTypedElement)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__VISIBILITY:
				setVisibility((ClassifierVisibility)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends TargetMember>)newValue);
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
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN:
				setIsIn((TargetPackage)null);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL:
				setIsInSpecial((ReferredTypedElement)null);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS:
				getMembers().clear();
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
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN:
				return isIn != null;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__IS_IN_SPECIAL:
				return isInSpecial != null;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case MRPTraceabilityPackage.TARGET_CLASSIFIER__MEMBERS:
				return members != null && !members.isEmpty();
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //TargetClassifierImpl
