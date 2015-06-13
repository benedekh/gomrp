/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement <em>First Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends RDMElement {
	/**
	 * Returns the value of the '<em><b>First Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Element</em>' containment reference.
	 * @see #setFirstElement(RouteElement)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getRoute_FirstElement()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RouteElement#getBelongsTo
	 * @model opposite="belongsTo" containment="true" required="true"
	 * @generated
	 */
	RouteElement getFirstElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Route#getFirstElement <em>First Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Element</em>' containment reference.
	 * @see #getFirstElement()
	 * @generated
	 */
	void setFirstElement(RouteElement value);

} // Route
