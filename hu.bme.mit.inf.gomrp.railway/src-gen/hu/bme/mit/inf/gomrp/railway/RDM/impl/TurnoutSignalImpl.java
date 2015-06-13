/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TurnoutSignalImpl#getTurnout <em>Turnout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TurnoutSignalImpl extends SignalImpl implements TurnoutSignal {
	/**
	 * The cached value of the '{@link #getTurnout() <em>Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnout()
	 * @generated
	 * @ordered
	 */
	protected Turnout turnout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.TURNOUT_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout getTurnout() {
		if (turnout != null && turnout.eIsProxy()) {
			InternalEObject oldTurnout = (InternalEObject)turnout;
			turnout = (Turnout)eResolveProxy(oldTurnout);
			if (turnout != oldTurnout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.TURNOUT_SIGNAL__TURNOUT, oldTurnout, turnout));
			}
		}
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout basicGetTurnout() {
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnout(Turnout newTurnout) {
		Turnout oldTurnout = turnout;
		turnout = newTurnout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TURNOUT_SIGNAL__TURNOUT, oldTurnout, turnout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDMPackage.TURNOUT_SIGNAL__TURNOUT:
				if (resolve) return getTurnout();
				return basicGetTurnout();
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
			case RDMPackage.TURNOUT_SIGNAL__TURNOUT:
				setTurnout((Turnout)newValue);
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
			case RDMPackage.TURNOUT_SIGNAL__TURNOUT:
				setTurnout((Turnout)null);
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
			case RDMPackage.TURNOUT_SIGNAL__TURNOUT:
				return turnout != null;
		}
		return super.eIsSet(featureID);
	}

} //TurnoutSignalImpl
