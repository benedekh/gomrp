/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;

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
 * An implementation of the model object '<em><b>Railway Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getTurnouts <em>Turnouts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getEditorCP <em>Editor CP</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getEditorSignal <em>Editor Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getEditorTDD <em>Editor TDD</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getEditorRoute <em>Editor Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.impl.RailwayDomainModelImpl#getEditorRouteElement <em>Editor Route Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailwayDomainModelImpl extends MinimalEObjectImpl.Container implements RailwayDomainModel {
	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Train> trains;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The cached value of the '{@link #getTurnouts() <em>Turnouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Turnout> turnouts;

	/**
	 * The cached value of the '{@link #getEditorCP() <em>Editor CP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorCP()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> editorCP;

	/**
	 * The cached value of the '{@link #getEditorSignal() <em>Editor Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> editorSignal;

	/**
	 * The cached value of the '{@link #getEditorTDD() <em>Editor TDD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorTDD()
	 * @generated
	 * @ordered
	 */
	protected EList<TurnoutDesiredDirection> editorTDD;

	/**
	 * The cached value of the '{@link #getEditorRoute() <em>Editor Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> editorRoute;

	/**
	 * The cached value of the '{@link #getEditorRouteElement() <em>Editor Route Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorRouteElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteElement> editorRouteElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayDomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDMPackage.Literals.RAILWAY_DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Train> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<Train>(Train.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Turnout> getTurnouts() {
		if (turnouts == null) {
			turnouts = new EObjectContainmentEList<Turnout>(Turnout.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS);
		}
		return turnouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getEditorCP() {
		if (editorCP == null) {
			editorCP = new EObjectContainmentEList<ConnectionPoint>(ConnectionPoint.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP);
		}
		return editorCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getEditorSignal() {
		if (editorSignal == null) {
			editorSignal = new EObjectContainmentEList<Signal>(Signal.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL);
		}
		return editorSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TurnoutDesiredDirection> getEditorTDD() {
		if (editorTDD == null) {
			editorTDD = new EObjectContainmentEList<TurnoutDesiredDirection>(TurnoutDesiredDirection.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD);
		}
		return editorTDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getEditorRoute() {
		if (editorRoute == null) {
			editorRoute = new EObjectContainmentEList<Route>(Route.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE);
		}
		return editorRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteElement> getEditorRouteElement() {
		if (editorRouteElement == null) {
			editorRouteElement = new EObjectContainmentEList<RouteElement>(RouteElement.class, this, RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT);
		}
		return editorRouteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
				return ((InternalEList<?>)getTrains()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
				return ((InternalEList<?>)getTurnouts()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
				return ((InternalEList<?>)getEditorCP()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
				return ((InternalEList<?>)getEditorSignal()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
				return ((InternalEList<?>)getEditorTDD()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
				return ((InternalEList<?>)getEditorRoute()).basicRemove(otherEnd, msgs);
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				return ((InternalEList<?>)getEditorRouteElement()).basicRemove(otherEnd, msgs);
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
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
				return getTrains();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
				return getSections();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
				return getTurnouts();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
				return getEditorCP();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
				return getEditorSignal();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
				return getEditorTDD();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
				return getEditorRoute();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				return getEditorRouteElement();
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
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends Train>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
				getTurnouts().clear();
				getTurnouts().addAll((Collection<? extends Turnout>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
				getEditorCP().clear();
				getEditorCP().addAll((Collection<? extends ConnectionPoint>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
				getEditorSignal().clear();
				getEditorSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
				getEditorTDD().clear();
				getEditorTDD().addAll((Collection<? extends TurnoutDesiredDirection>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
				getEditorRoute().clear();
				getEditorRoute().addAll((Collection<? extends Route>)newValue);
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				getEditorRouteElement().clear();
				getEditorRouteElement().addAll((Collection<? extends RouteElement>)newValue);
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
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
				getTrains().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
				getSections().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
				getTurnouts().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
				getEditorCP().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
				getEditorSignal().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
				getEditorTDD().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
				getEditorRoute().clear();
				return;
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				getEditorRouteElement().clear();
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
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
				return trains != null && !trains.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
				return sections != null && !sections.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
				return turnouts != null && !turnouts.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
				return editorCP != null && !editorCP.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
				return editorSignal != null && !editorSignal.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
				return editorTDD != null && !editorTDD.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
				return editorRoute != null && !editorRoute.isEmpty();
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				return editorRouteElement != null && !editorRouteElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RailwayDomainModelImpl
