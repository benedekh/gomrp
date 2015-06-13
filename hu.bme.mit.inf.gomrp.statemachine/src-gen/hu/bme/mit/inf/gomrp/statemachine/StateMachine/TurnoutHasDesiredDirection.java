/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout Has Desired Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getTurnout <em>Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getDesiredDirection <em>Desired Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutHasDesiredDirection()
 * @model
 * @generated
 */
public interface TurnoutHasDesiredDirection extends GuardExpression {
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
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutHasDesiredDirection_Turnout()
	 * @model
	 * @generated
	 */
	Turnout getTurnout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getTurnout <em>Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turnout</em>' reference.
	 * @see #getTurnout()
	 * @generated
	 */
	void setTurnout(Turnout value);

	/**
	 * Returns the value of the '<em><b>Desired Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Direction</em>' reference.
	 * @see #setDesiredDirection(TurnoutDesiredDirection)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutHasDesiredDirection_DesiredDirection()
	 * @model
	 * @generated
	 */
	TurnoutDesiredDirection getDesiredDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutHasDesiredDirection#getDesiredDirection <em>Desired Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Direction</em>' reference.
	 * @see #getDesiredDirection()
	 * @generated
	 */
	void setDesiredDirection(TurnoutDesiredDirection value);

} // TurnoutHasDesiredDirection
