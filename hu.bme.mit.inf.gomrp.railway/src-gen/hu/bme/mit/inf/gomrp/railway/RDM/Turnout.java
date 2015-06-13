/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getCurrentDirection <em>Current Direction</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getSwitchingDirection <em>Switching Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnout()
 * @model
 * @generated
 */
public interface Turnout extends TrackElement {
	/**
	 * Returns the value of the '<em><b>Current Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #setCurrentDirection(TurnoutDirection)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnout_CurrentDirection()
	 * @model
	 * @generated
	 */
	TurnoutDirection getCurrentDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getCurrentDirection <em>Current Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #getCurrentDirection()
	 * @generated
	 */
	void setCurrentDirection(TurnoutDirection value);

	/**
	 * Returns the value of the '<em><b>Switching Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #setSwitchingDirection(TurnoutDirection)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnout_SwitchingDirection()
	 * @model
	 * @generated
	 */
	TurnoutDirection getSwitchingDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Turnout#getSwitchingDirection <em>Switching Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #getSwitchingDirection()
	 * @generated
	 */
	void setSwitchingDirection(TurnoutDirection value);

} // Turnout
