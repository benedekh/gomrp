/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl#getExtendsCls <em>Extends Cls</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl#getImplInterface <em>Impl Interface</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl#getExtendsSpecial <em>Extends Special</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetClassImpl#getImplementsSpecial <em>Implements Special</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetClassImpl extends TargetClassifierImpl implements TargetClass {
	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final Modifier MODIFIER_EDEFAULT = Modifier.NONE;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected Modifier modifier = MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendsCls() <em>Extends Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsCls()
	 * @generated
	 * @ordered
	 */
	protected TargetClass extendsCls;

	/**
	 * The cached value of the '{@link #getImplInterface() <em>Impl Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetInterface> implInterface;

	/**
	 * The cached value of the '{@link #getExtendsSpecial() <em>Extends Special</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsSpecial()
	 * @generated
	 * @ordered
	 */
	protected ReferredTypedElement extendsSpecial;

	/**
	 * The cached value of the '{@link #getImplementsSpecial() <em>Implements Special</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSpecial()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferredTypedElement> implementsSpecial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.TARGET_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(Modifier newModifier) {
		Modifier oldModifier = modifier;
		modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASS__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetClass getExtendsCls() {
		if (extendsCls != null && extendsCls.eIsProxy()) {
			InternalEObject oldExtendsCls = (InternalEObject)extendsCls;
			extendsCls = (TargetClass)eResolveProxy(oldExtendsCls);
			if (extendsCls != oldExtendsCls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS, oldExtendsCls, extendsCls));
			}
		}
		return extendsCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetClass basicGetExtendsCls() {
		return extendsCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendsCls(TargetClass newExtendsCls) {
		TargetClass oldExtendsCls = extendsCls;
		extendsCls = newExtendsCls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS, oldExtendsCls, extendsCls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetInterface> getImplInterface() {
		if (implInterface == null) {
			implInterface = new EObjectResolvingEList<TargetInterface>(TargetInterface.class, this, MRPTraceabilityPackage.TARGET_CLASS__IMPL_INTERFACE);
		}
		return implInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredTypedElement getExtendsSpecial() {
		if (extendsSpecial != null && extendsSpecial.eIsProxy()) {
			InternalEObject oldExtendsSpecial = (InternalEObject)extendsSpecial;
			extendsSpecial = (ReferredTypedElement)eResolveProxy(oldExtendsSpecial);
			if (extendsSpecial != oldExtendsSpecial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL, oldExtendsSpecial, extendsSpecial));
			}
		}
		return extendsSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredTypedElement basicGetExtendsSpecial() {
		return extendsSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendsSpecial(ReferredTypedElement newExtendsSpecial) {
		ReferredTypedElement oldExtendsSpecial = extendsSpecial;
		extendsSpecial = newExtendsSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL, oldExtendsSpecial, extendsSpecial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferredTypedElement> getImplementsSpecial() {
		if (implementsSpecial == null) {
			implementsSpecial = new EObjectResolvingEList<ReferredTypedElement>(ReferredTypedElement.class, this, MRPTraceabilityPackage.TARGET_CLASS__IMPLEMENTS_SPECIAL);
		}
		return implementsSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRPTraceabilityPackage.TARGET_CLASS__MODIFIER:
				return getModifier();
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS:
				if (resolve) return getExtendsCls();
				return basicGetExtendsCls();
			case MRPTraceabilityPackage.TARGET_CLASS__IMPL_INTERFACE:
				return getImplInterface();
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL:
				if (resolve) return getExtendsSpecial();
				return basicGetExtendsSpecial();
			case MRPTraceabilityPackage.TARGET_CLASS__IMPLEMENTS_SPECIAL:
				return getImplementsSpecial();
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
			case MRPTraceabilityPackage.TARGET_CLASS__MODIFIER:
				setModifier((Modifier)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS:
				setExtendsCls((TargetClass)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPL_INTERFACE:
				getImplInterface().clear();
				getImplInterface().addAll((Collection<? extends TargetInterface>)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL:
				setExtendsSpecial((ReferredTypedElement)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPLEMENTS_SPECIAL:
				getImplementsSpecial().clear();
				getImplementsSpecial().addAll((Collection<? extends ReferredTypedElement>)newValue);
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
			case MRPTraceabilityPackage.TARGET_CLASS__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS:
				setExtendsCls((TargetClass)null);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPL_INTERFACE:
				getImplInterface().clear();
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL:
				setExtendsSpecial((ReferredTypedElement)null);
				return;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPLEMENTS_SPECIAL:
				getImplementsSpecial().clear();
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
			case MRPTraceabilityPackage.TARGET_CLASS__MODIFIER:
				return modifier != MODIFIER_EDEFAULT;
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_CLS:
				return extendsCls != null;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPL_INTERFACE:
				return implInterface != null && !implInterface.isEmpty();
			case MRPTraceabilityPackage.TARGET_CLASS__EXTENDS_SPECIAL:
				return extendsSpecial != null;
			case MRPTraceabilityPackage.TARGET_CLASS__IMPLEMENTS_SPECIAL:
				return implementsSpecial != null && !implementsSpecial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModifieredElement.class) {
			switch (derivedFeatureID) {
				case MRPTraceabilityPackage.TARGET_CLASS__MODIFIER: return MRPTraceabilityPackage.MODIFIERED_ELEMENT__MODIFIER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModifieredElement.class) {
			switch (baseFeatureID) {
				case MRPTraceabilityPackage.MODIFIERED_ELEMENT__MODIFIER: return MRPTraceabilityPackage.TARGET_CLASS__MODIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (modifier: ");
		result.append(modifier);
		result.append(')');
		return result.toString();
	}

} //TargetClassImpl
