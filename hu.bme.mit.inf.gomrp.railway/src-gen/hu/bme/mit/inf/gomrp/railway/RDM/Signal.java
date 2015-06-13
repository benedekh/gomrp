/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getAllowedSpeed <em>Allowed Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn <em>Stands On</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getObserves <em>Observes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Allowed Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.Speed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #setAllowedSpeed(Speed)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getSignal_AllowedSpeed()
	 * @model required="true"
	 * @generated
	 */
	Speed getAllowedSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getAllowedSpeed <em>Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #getAllowedSpeed()
	 * @generated
	 */
	void setAllowedSpeed(Speed value);

	/**
	 * Returns the value of the '<em><b>Stands On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stands On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stands On</em>' container reference.
	 * @see #setStandsOn(ConnectionPoint)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getSignal_StandsOn()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint#getHolds
	 * @model opposite="holds" transient="false"
	 * @generated
	 */
	ConnectionPoint getStandsOn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Signal#getStandsOn <em>Stands On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stands On</em>' container reference.
	 * @see #getStandsOn()
	 * @generated
	 */
	void setStandsOn(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observes</em>' reference.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getSignal_Observes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.inf.gomrp.railway.incquery.observes'"
	 * @generated
	 */
	TrackElement getObserves();

} // Signal
