/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout Direction Changed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getTurnout <em>Turnout</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getNewTurnoutDirection <em>New Turnout Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutDirectionChanged()
 * @model
 * @generated
 */
public interface TurnoutDirectionChanged extends TriggerExpression {
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
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutDirectionChanged_Turnout()
	 * @model
	 * @generated
	 */
	Turnout getTurnout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getTurnout <em>Turnout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turnout</em>' reference.
	 * @see #getTurnout()
	 * @generated
	 */
	void setTurnout(Turnout value);

	/**
	 * Returns the value of the '<em><b>New Turnout Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Turnout Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Turnout Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #setNewTurnoutDirection(TurnoutDirection)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTurnoutDirectionChanged_NewTurnoutDirection()
	 * @model
	 * @generated
	 */
	TurnoutDirection getNewTurnoutDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TurnoutDirectionChanged#getNewTurnoutDirection <em>New Turnout Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Turnout Direction</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection
	 * @see #getNewTurnoutDirection()
	 * @generated
	 */
	void setNewTurnoutDirection(TurnoutDirection value);

} // TurnoutDirectionChanged
