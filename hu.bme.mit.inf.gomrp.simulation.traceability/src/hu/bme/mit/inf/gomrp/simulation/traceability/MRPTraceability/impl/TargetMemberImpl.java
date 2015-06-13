/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember;
import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.TargetMemberImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TargetMemberImpl extends TypedElementImpl implements TargetMember {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> source;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTraceabilityPackage.Literals.TARGET_MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList.ManyInverse<SourceElement>(SourceElement.class, this, MRPTraceabilityPackage.TARGET_MEMBER__SOURCE, MRPTraceabilityPackage.SOURCE_ELEMENT__TARGET);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTraceabilityPackage.TARGET_MEMBER__VISIBILITY, oldVisibility, visibility));
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
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
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
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER:
				return getModifier();
			case MRPTraceabilityPackage.TARGET_MEMBER__NAME:
				return getName();
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				return getSource();
			case MRPTraceabilityPackage.TARGET_MEMBER__VISIBILITY:
				return getVisibility();
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
			case MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER:
				setModifier((Modifier)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__NAME:
				setName((String)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__VISIBILITY:
				setVisibility((Visibility)newValue);
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
			case MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				getSource().clear();
				return;
			case MRPTraceabilityPackage.TARGET_MEMBER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER:
				return modifier != MODIFIER_EDEFAULT;
			case MRPTraceabilityPackage.TARGET_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE:
				return source != null && !source.isEmpty();
			case MRPTraceabilityPackage.TARGET_MEMBER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
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
				case MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER: return MRPTraceabilityPackage.MODIFIERED_ELEMENT__MODIFIER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case MRPTraceabilityPackage.TARGET_MEMBER__NAME: return MRPTraceabilityPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TargetElement.class) {
			switch (derivedFeatureID) {
				case MRPTraceabilityPackage.TARGET_MEMBER__SOURCE: return MRPTraceabilityPackage.TARGET_ELEMENT__SOURCE;
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
				case MRPTraceabilityPackage.MODIFIERED_ELEMENT__MODIFIER: return MRPTraceabilityPackage.TARGET_MEMBER__MODIFIER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case MRPTraceabilityPackage.NAMED_ELEMENT__NAME: return MRPTraceabilityPackage.TARGET_MEMBER__NAME;
				default: return -1;
			}
		}
		if (baseClass == TargetElement.class) {
			switch (baseFeatureID) {
				case MRPTraceabilityPackage.TARGET_ELEMENT__SOURCE: return MRPTraceabilityPackage.TARGET_MEMBER__SOURCE;
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
		result.append(", name: ");
		result.append(name);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //TargetMemberImpl
