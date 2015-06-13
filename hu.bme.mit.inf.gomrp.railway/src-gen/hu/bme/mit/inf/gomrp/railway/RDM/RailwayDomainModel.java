/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Railway Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTrains <em>Trains</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getTurnouts <em>Turnouts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorCP <em>Editor CP</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorSignal <em>Editor Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorTDD <em>Editor TDD</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRoute <em>Editor Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel#getEditorRouteElement <em>Editor Route Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel()
 * @model
 * @generated
 */
public interface RailwayDomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Train}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_Trains()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Train> getTrains();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_Sections()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Turnouts</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turnouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turnouts</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_Turnouts()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Turnout> getTurnouts();

	/**
	 * Returns the value of the '<em><b>Editor CP</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor CP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor CP</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_EditorCP()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getEditorCP();

	/**
	 * Returns the value of the '<em><b>Editor Signal</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Signal</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_EditorSignal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getEditorSignal();

	/**
	 * Returns the value of the '<em><b>Editor TDD</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor TDD</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor TDD</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_EditorTDD()
	 * @model containment="true"
	 * @generated
	 */
	EList<TurnoutDesiredDirection> getEditorTDD();

	/**
	 * Returns the value of the '<em><b>Editor Route</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Route</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_EditorRoute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getEditorRoute();

	/**
	 * Returns the value of the '<em><b>Editor Route Element</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Route Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Route Element</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRailwayDomainModel_EditorRouteElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouteElement> getEditorRouteElement();

} // RailwayDomainModel
