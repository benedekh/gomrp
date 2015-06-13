/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Speed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Allowed Speed Changed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getSignal <em>Signal</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getNewAllowedSpeed <em>New Allowed Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getSignalAllowedSpeedChanged()
 * @model
 * @generated
 */
public interface SignalAllowedSpeedChanged extends TriggerExpression {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getSignalAllowedSpeedChanged_Signal()
	 * @model
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>New Allowed Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.Speed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Allowed Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Allowed Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #setNewAllowedSpeed(Speed)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getSignalAllowedSpeedChanged_NewAllowedSpeed()
	 * @model
	 * @generated
	 */
	Speed getNewAllowedSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.SignalAllowedSpeedChanged#getNewAllowedSpeed <em>New Allowed Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Allowed Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #getNewAllowedSpeed()
	 * @generated
	 */
	void setNewAllowedSpeed(Speed value);

} // SignalAllowedSpeedChanged
