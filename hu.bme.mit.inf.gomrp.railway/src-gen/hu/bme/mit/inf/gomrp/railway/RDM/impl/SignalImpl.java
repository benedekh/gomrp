/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl#getAllowedSpeed <em>Allowed Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl#getStandsOn <em>Stands On</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.SignalImpl#getObserves <em>Observes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends RDMElementImpl implements Signal {
	/**
	 * The default value of the '{@link #getAllowedSpeed() <em>Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed ALLOWED_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getAllowedSpeed() <em>Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed allowedSpeed = ALLOWED_SPEED_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getObserves() <em>Observes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserves()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OBSERVES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RDMPackage.Literals.SIGNAL__OBSERVES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getAllowedSpeed() {
		return allowedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedSpeed(Speed newAllowedSpeed) {
		Speed oldAllowedSpeed = allowedSpeed;
		allowedSpeed = newAllowedSpeed == null ? ALLOWED_SPEED_EDEFAULT : newAllowedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.SIGNAL__ALLOWED_SPEED, oldAllowedSpeed, allowedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getStandsOn() {
		if (eContainerFeatureID() != RDMPackage.SIGNAL__STANDS_ON) return null;
		return (ConnectionPoint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandsOn(ConnectionPoint newStandsOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStandsOn, RDMPackage.SIGNAL__STANDS_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandsOn(ConnectionPoint newStandsOn) {
		if (newStandsOn != eInternalContainer() || (eContainerFeatureID() != RDMPackage.SIGNAL__STANDS_ON && newStandsOn != null)) {
			if (EcoreUtil.isAncestor(this, newStandsOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStandsOn != null)
				msgs = ((InternalEObject)newStandsOn).eInverseAdd(this, RDMPackage.CONNECTION_POINT__HOLDS, ConnectionPoint.class, msgs);
			msgs = basicSetStandsOn(newStandsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.SIGNAL__STANDS_ON, newStandsOn, newStandsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getObserves() {
		return (TrackElement)OBSERVES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement basicGetObserves() {
		return (TrackElement)OBSERVES__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.SIGNAL__STANDS_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStandsOn((ConnectionPoint)otherEnd, msgs);
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
			case RDMPackage.SIGNAL__STANDS_ON:
				return basicSetStandsOn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RDMPackage.SIGNAL__STANDS_ON:
				return eInternalContainer().eInverseRemove(this, RDMPackage.CONNECTION_POINT__HOLDS, ConnectionPoint.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDMPackage.SIGNAL__ALLOWED_SPEED:
				return getAllowedSpeed();
			case RDMPackage.SIGNAL__STANDS_ON:
				return getStandsOn();
			case RDMPackage.SIGNAL__OBSERVES:
				if (resolve) return getObserves();
				return basicGetObserves();
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
			case RDMPackage.SIGNAL__ALLOWED_SPEED:
				setAllowedSpeed((Speed)newValue);
				return;
			case RDMPackage.SIGNAL__STANDS_ON:
				setStandsOn((ConnectionPoint)newValue);
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
			case RDMPackage.SIGNAL__ALLOWED_SPEED:
				setAllowedSpeed(ALLOWED_SPEED_EDEFAULT);
				return;
			case RDMPackage.SIGNAL__STANDS_ON:
				setStandsOn((ConnectionPoint)null);
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
			case RDMPackage.SIGNAL__ALLOWED_SPEED:
				return allowedSpeed != ALLOWED_SPEED_EDEFAULT;
			case RDMPackage.SIGNAL__STANDS_ON:
				return getStandsOn() != null;
			case RDMPackage.SIGNAL__OBSERVES:
				return OBSERVES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (allowedSpeed: ");
		result.append(allowedSpeed);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
