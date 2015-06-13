/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

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
 * An implementation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrackElementImpl#getOccupiedBy <em>Occupied By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrackElementImpl extends RDMElementImpl implements TrackElement {
	/**
	 * The cached value of the '{@link #getConnectsTo() <em>Connects To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> connectsTo;

	/**
	 * The cached value of the '{@link #getOccupiedBy() <em>Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupiedBy()
	 * @generated
	 * @ordered
	 */
	protected Train occupiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.TRACK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectsTo() {
		if (connectsTo == null) {
			connectsTo = new EObjectContainmentEList<ConnectionPoint>(ConnectionPoint.class, this, RDMPackage.TRACK_ELEMENT__CONNECTS_TO);
		}
		return connectsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train getOccupiedBy() {
		if (occupiedBy != null && occupiedBy.eIsProxy()) {
			InternalEObject oldOccupiedBy = (InternalEObject)occupiedBy;
			occupiedBy = (Train)eResolveProxy(oldOccupiedBy);
			if (occupiedBy != oldOccupiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.TRACK_ELEMENT__OCCUPIED_BY, oldOccupiedBy, occupiedBy));
			}
		}
		return occupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetOccupiedBy() {
		return occupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccupiedBy(Train newOccupiedBy, NotificationChain msgs) {
		Train oldOccupiedBy = occupiedBy;
		occupiedBy = newOccupiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.TRACK_ELEMENT__OCCUPIED_BY, oldOccupiedBy, newOccupiedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupiedBy(Train newOccupiedBy) {
		if (newOccupiedBy != occupiedBy) {
			NotificationChain msgs = null;
			if (occupiedBy != null)
				msgs = ((InternalEObject)occupiedBy).eInverseRemove(this, RDMPackage.TRAIN__STANDS_ON, Train.class, msgs);
			if (newOccupiedBy != null)
				msgs = ((InternalEObject)newOccupiedBy).eInverseAdd(this, RDMPackage.TRAIN__STANDS_ON, Train.class, msgs);
			msgs = basicSetOccupiedBy(newOccupiedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRACK_ELEMENT__OCCUPIED_BY, newOccupiedBy, newOccupiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				if (occupiedBy != null)
					msgs = ((InternalEObject)occupiedBy).eInverseRemove(this, RDMPackage.TRAIN__STANDS_ON, Train.class, msgs);
				return basicSetOccupiedBy((Train)otherEnd, msgs);
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
			case RDMPackage.TRACK_ELEMENT__CONNECTS_TO:
				return ((InternalEList<?>)getConnectsTo()).basicRemove(otherEnd, msgs);
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				return basicSetOccupiedBy(null, msgs);
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
			case RDMPackage.TRACK_ELEMENT__CONNECTS_TO:
				return getConnectsTo();
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				if (resolve) return getOccupiedBy();
				return basicGetOccupiedBy();
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
			case RDMPackage.TRACK_ELEMENT__CONNECTS_TO:
				getConnectsTo().clear();
				getConnectsTo().addAll((Collection<? extends ConnectionPoint>)newValue);
				return;
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				setOccupiedBy((Train)newValue);
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
			case RDMPackage.TRACK_ELEMENT__CONNECTS_TO:
				getConnectsTo().clear();
				return;
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				setOccupiedBy((Train)null);
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
			case RDMPackage.TRACK_ELEMENT__CONNECTS_TO:
				return connectsTo != null && !connectsTo.isEmpty();
			case RDMPackage.TRACK_ELEMENT__OCCUPIED_BY:
				return occupiedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackElementImpl
