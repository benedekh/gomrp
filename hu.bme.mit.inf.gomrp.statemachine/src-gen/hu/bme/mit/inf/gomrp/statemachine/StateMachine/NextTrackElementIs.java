/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Track Element Is</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getRouteElement <em>Route Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getTrackElement <em>Track Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getNextTrackElementIs()
 * @model
 * @generated
 */
public interface NextTrackElementIs extends GuardExpression {
	/**
	 * Returns the value of the '<em><b>Route Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Element</em>' reference.
	 * @see #setRouteElement(RouteElement)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getNextTrackElementIs_RouteElement()
	 * @model
	 * @generated
	 */
	RouteElement getRouteElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getRouteElement <em>Route Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Element</em>' reference.
	 * @see #getRouteElement()
	 * @generated
	 */
	void setRouteElement(RouteElement value);

	/**
	 * Returns the value of the '<em><b>Track Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Element</em>' reference.
	 * @see #setTrackElement(TrackElement)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getNextTrackElementIs_TrackElement()
	 * @model
	 * @generated
	 */
	TrackElement getTrackElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NextTrackElementIs#getTrackElement <em>Track Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Element</em>' reference.
	 * @see #getTrackElement()
	 * @generated
	 */
	void setTrackElement(TrackElement value);

} // NextTrackElementIs
