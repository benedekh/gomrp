/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getReferredElement <em>Referred Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection <em>Desired Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getNextElement <em>Next Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRouteElement()
 * @model
 * @generated
 */
public interface RouteElement extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Element</em>' reference.
	 * @see #setReferredElement(TrackElement)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRouteElement_ReferredElement()
	 * @model required="true"
	 * @generated
	 */
	TrackElement getReferredElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getReferredElement <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Element</em>' reference.
	 * @see #getReferredElement()
	 * @generated
	 */
	void setReferredElement(TrackElement value);

	/**
	 * Returns the value of the '<em><b>Desired Direction</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Direction</em>' containment reference.
	 * @see #setDesiredDirection(TurnoutDesiredDirection)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRouteElement_DesiredDirection()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection#getRouteElement
	 * @model opposite="routeElement" containment="true"
	 * @generated
	 */
	TurnoutDesiredDirection getDesiredDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getDesiredDirection <em>Desired Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Direction</em>' containment reference.
	 * @see #getDesiredDirection()
	 * @generated
	 */
	void setDesiredDirection(TurnoutDesiredDirection value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(Route)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRouteElement_BelongsTo()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement
	 * @model opposite="firstElement" transient="false"
	 * @generated
	 */
	Route getBelongsTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Route value);

	/**
	 * Returns the value of the '<em><b>Next Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Element</em>' containment reference.
	 * @see #setNextElement(RouteElement)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRouteElement_NextElement()
	 * @model containment="true"
	 * @generated
	 */
	RouteElement getNextElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getNextElement <em>Next Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Element</em>' containment reference.
	 * @see #getNextElement()
	 * @generated
	 */
	void setNextElement(RouteElement value);

} // RouteElement
