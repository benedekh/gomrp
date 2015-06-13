/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RouteImpl#getFirstElement <em>First Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends RDMElementImpl implements Route {
	/**
	 * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstElement()
	 * @generated
	 * @ordered
	 */
	protected RouteElement firstElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getFirstElement() {
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstElement(RouteElement newFirstElement, NotificationChain msgs) {
		RouteElement oldFirstElement = firstElement;
		firstElement = newFirstElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE__FIRST_ELEMENT, oldFirstElement, newFirstElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstElement(RouteElement newFirstElement) {
		if (newFirstElement != firstElement) {
			NotificationChain msgs = null;
			if (firstElement != null)
				msgs = ((InternalEObject)firstElement).eInverseRemove(this, RDMPackage.ROUTE_ELEMENT__BELONGS_TO, RouteElement.class, msgs);
			if (newFirstElement != null)
				msgs = ((InternalEObject)newFirstElement).eInverseAdd(this, RDMPackage.ROUTE_ELEMENT__BELONGS_TO, RouteElement.class, msgs);
			msgs = basicSetFirstElement(newFirstElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDMPackage.ROUTE__FIRST_ELEMENT, newFirstElement, newFirstElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				if (firstElement != null)
					msgs = ((InternalEObject)firstElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDMPackage.ROUTE__FIRST_ELEMENT, null, msgs);
				return basicSetFirstElement((RouteElement)otherEnd, msgs);
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
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				return basicSetFirstElement(null, msgs);
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
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				return getFirstElement();
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
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				setFirstElement((RouteElement)newValue);
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
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				setFirstElement((RouteElement)null);
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
			case RDMPackage.ROUTE__FIRST_ELEMENT:
				return firstElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteImpl
