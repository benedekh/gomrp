/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal#getTurnout <em>Turnout</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutSignal()
 * @model
 * @generated
 */
public interface TurnoutSignal extends Signal {
	/**
	 * Returns the value of the '<em><b>Turnout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turnout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turnout</em>' reference.
	 * @see #setTurnout(Turnout)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTurnoutSignal_Turnout()
	 * @model required="true"
	 * @generated
	 */
	Turnout getTurnout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal#getTurnout <em>Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turnout</em>' reference.
	 * @see #getTurnout()
	 * @generated
	 */
	void setTurnout(Turnout value);

} // TurnoutSignal
