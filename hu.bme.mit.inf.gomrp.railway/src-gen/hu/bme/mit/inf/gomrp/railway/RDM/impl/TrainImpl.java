/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.Station;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

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
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getHeadingSpeed <em>Heading Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getArrivesTo <em>Arrives To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getDeparturesFrom <em>Departures From</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getFollows <em>Follows</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.TrainImpl#getStandsOn <em>Stands On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainImpl extends RDMElementImpl implements Train {
	/**
	 * The default value of the '{@link #getHeadingSpeed() <em>Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed HEADING_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getHeadingSpeed() <em>Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadingSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed headingSpeed = HEADING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Speed MAX_SPEED_EDEFAULT = Speed.ZERO;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrivesTo() <em>Arrives To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivesTo()
	 * @generated
	 * @ordered
	 */
	protected Station arrivesTo;

	/**
	 * The cached value of the '{@link #getDeparturesFrom() <em>Departures From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparturesFrom()
	 * @generated
	 * @ordered
	 */
	protected Station departuresFrom;

	/**
	 * The cached value of the '{@link #getFollows() <em>Follows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollows()
	 * @generated
	 * @ordered
	 */
	protected Route follows;

	/**
	 * The cached value of the '{@link #getStandsOn() <em>Stands On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackElement> standsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getHeadingSpeed() {
		return headingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadingSpeed(Speed newHeadingSpeed) {
		Speed oldHeadingSpeed = headingSpeed;
		headingSpeed = newHeadingSpeed == null ? HEADING_SPEED_EDEFAULT : newHeadingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__HEADING_SPEED, oldHeadingSpeed, headingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpeed(Speed newMaxSpeed) {
		Speed oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed == null ? MAX_SPEED_EDEFAULT : newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__MAX_SPEED, oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getArrivesTo() {
		if (arrivesTo != null && arrivesTo.eIsProxy()) {
			InternalEObject oldArrivesTo = (InternalEObject)arrivesTo;
			arrivesTo = (Station)eResolveProxy(oldArrivesTo);
			if (arrivesTo != oldArrivesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.TRAIN__ARRIVES_TO, oldArrivesTo, arrivesTo));
			}
		}
		return arrivesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetArrivesTo() {
		return arrivesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivesTo(Station newArrivesTo) {
		Station oldArrivesTo = arrivesTo;
		arrivesTo = newArrivesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__ARRIVES_TO, oldArrivesTo, arrivesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station getDeparturesFrom() {
		if (departuresFrom != null && departuresFrom.eIsProxy()) {
			InternalEObject oldDeparturesFrom = (InternalEObject)departuresFrom;
			departuresFrom = (Station)eResolveProxy(oldDeparturesFrom);
			if (departuresFrom != oldDeparturesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDMPackage.TRAIN__DEPARTURES_FROM, oldDeparturesFrom, departuresFrom));
			}
		}
		return departuresFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetDeparturesFrom() {
		return departuresFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeparturesFrom(Station newDeparturesFrom) {
		Station oldDeparturesFrom = departuresFrom;
		departuresFrom = newDeparturesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__DEPARTURES_FROM, oldDeparturesFrom, departuresFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getFollows() {
		return follows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollows(Route newFollows, NotificationChain msgs) {
		Route oldFollows = follows;
		follows = newFollows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__FOLLOWS, oldFollows, newFollows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollows(Route newFollows) {
		if (newFollows != follows) {
			NotificationChain msgs = null;
			if (follows != null)
				msgs = ((InternalEObject)follows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDMPackage.TRAIN__FOLLOWS, null, msgs);
			if (newFollows != null)
				msgs = ((InternalEObject)newFollows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDMPackage.TRAIN__FOLLOWS, null, msgs);
			msgs = basicSetFollows(newFollows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.TRAIN__FOLLOWS, newFollows, newFollows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackElement> getStandsOn() {
		if (standsOn == null) {
			standsOn = new EObjectWithInverseResolvingEList<TrackElement>(TrackElement.class, this, RDMPackage.TRAIN__STANDS_ON, RDMPackage.TRACK_ELEMENT__OCCUPIED_BY);
		}
		return standsOn;
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
			case RDMPackage.TRAIN__STANDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStandsOn()).basicAdd(otherEnd, msgs);
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
			case RDMPackage.TRAIN__FOLLOWS:
				return basicSetFollows(null, msgs);
			case RDMPackage.TRAIN__STANDS_ON:
				return ((InternalEList<?>)getStandsOn()).basicRemove(otherEnd, msgs);
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
			case RDMPackage.TRAIN__HEADING_SPEED:
				return getHeadingSpeed();
			case RDMPackage.TRAIN__MAX_SPEED:
				return getMaxSpeed();
			case RDMPackage.TRAIN__ARRIVES_TO:
				if (resolve) return getArrivesTo();
				return basicGetArrivesTo();
			case RDMPackage.TRAIN__DEPARTURES_FROM:
				if (resolve) return getDeparturesFrom();
				return basicGetDeparturesFrom();
			case RDMPackage.TRAIN__FOLLOWS:
				return getFollows();
			case RDMPackage.TRAIN__STANDS_ON:
				return getStandsOn();
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
			case RDMPackage.TRAIN__HEADING_SPEED:
				setHeadingSpeed((Speed)newValue);
				return;
			case RDMPackage.TRAIN__MAX_SPEED:
				setMaxSpeed((Speed)newValue);
				return;
			case RDMPackage.TRAIN__ARRIVES_TO:
				setArrivesTo((Station)newValue);
				return;
			case RDMPackage.TRAIN__DEPARTURES_FROM:
				setDeparturesFrom((Station)newValue);
				return;
			case RDMPackage.TRAIN__FOLLOWS:
				setFollows((Route)newValue);
				return;
			case RDMPackage.TRAIN__STANDS_ON:
				getStandsOn().clear();
				getStandsOn().addAll((Collection<? extends TrackElement>)newValue);
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
			case RDMPackage.TRAIN__HEADING_SPEED:
				setHeadingSpeed(HEADING_SPEED_EDEFAULT);
				return;
			case RDMPackage.TRAIN__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case RDMPackage.TRAIN__ARRIVES_TO:
				setArrivesTo((Station)null);
				return;
			case RDMPackage.TRAIN__DEPARTURES_FROM:
				setDeparturesFrom((Station)null);
				return;
			case RDMPackage.TRAIN__FOLLOWS:
				setFollows((Route)null);
				return;
			case RDMPackage.TRAIN__STANDS_ON:
				getStandsOn().clear();
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
			case RDMPackage.TRAIN__HEADING_SPEED:
				return headingSpeed != HEADING_SPEED_EDEFAULT;
			case RDMPackage.TRAIN__MAX_SPEED:
				return maxSpeed != MAX_SPEED_EDEFAULT;
			case RDMPackage.TRAIN__ARRIVES_TO:
				return arrivesTo != null;
			case RDMPackage.TRAIN__DEPARTURES_FROM:
				return departuresFrom != null;
			case RDMPackage.TRAIN__FOLLOWS:
				return follows != null;
			case RDMPackage.TRAIN__STANDS_ON:
				return standsOn != null && !standsOn.isEmpty();
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
		result.append(" (headingSpeed: ");
		result.append(headingSpeed);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
