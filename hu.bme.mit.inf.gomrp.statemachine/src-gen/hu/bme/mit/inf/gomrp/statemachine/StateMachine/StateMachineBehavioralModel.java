/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getStateMachineBehavioralModel()
 * @model
 * @generated
 */
public interface StateMachineBehavioralModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachines</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getStateMachineBehavioralModel_Statemachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getStatemachines();

} // StateMachineBehavioralModel
