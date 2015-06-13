/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout Desired Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getReferredTurnout <em>Referred Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getDesiredDirection <em>Desired Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement <em>Route Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutDesiredDirection()
 * @model
 * @generated
 */
public interface TurnoutDesiredDirection extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Referred Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Turnout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Turnout</em>' reference.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutDesiredDirection_ReferredTurnout()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.inf.gomrp.railway.incquery.referredTurnout'"
	 * @generated
	 */
	Turnout getReferredTurnout();

	/**
	 * Returns the value of the '<em><b>Desired Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #setDesiredDirection(TurnoutDirection)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutDesiredDirection_DesiredDirection()
	 * @model
	 * @generated
	 */
	TurnoutDirection getDesiredDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getDesiredDirection <em>Desired Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #getDesiredDirection()
	 * @generated
	 */
	void setDesiredDirection(TurnoutDirection value);

	/**
	 * Returns the value of the '<em><b>Route Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection <em>Desired Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Element</em>' container reference.
	 * @see #setRouteElement(RouteElement)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutDesiredDirection_RouteElement()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection
	 * @model opposite="desiredDirection" transient="false"
	 * @generated
	 */
	RouteElement getRouteElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement <em>Route Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Element</em>' container reference.
	 * @see #getRouteElement()
	 * @generated
	 */
	void setRouteElement(RouteElement value);

} // TurnoutDesiredDirection
