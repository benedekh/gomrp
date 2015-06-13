/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getDirection <em>Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds <em>Holds</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getNextElement <em>Next Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection
	 * @see #setDirection(ConnectionDirection)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getConnectionPoint_Direction()
	 * @model required="true"
	 * @generated
	 */
	ConnectionDirection getDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ConnectionDirection value);

	/**
	 * Returns the value of the '<em><b>Holds</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn <em>Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' containment reference.
	 * @see #setHolds(Signal)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getConnectionPoint_Holds()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn
	 * @model opposite="standsOn" containment="true" required="true"
	 * @generated
	 */
	Signal getHolds();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holds</em>' containment reference.
	 * @see #getHolds()
	 * @generated
	 */
	void setHolds(Signal value);

	/**
	 * Returns the value of the '<em><b>Next Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Element</em>' reference.
	 * @see #setNextElement(TrackElement)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getConnectionPoint_NextElement()
	 * @model required="true"
	 * @generated
	 */
	TrackElement getNextElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getNextElement <em>Next Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Element</em>' reference.
	 * @see #getNextElement()
	 * @generated
	 */
	void setNextElement(TrackElement value);

} // ConnectionPoint
