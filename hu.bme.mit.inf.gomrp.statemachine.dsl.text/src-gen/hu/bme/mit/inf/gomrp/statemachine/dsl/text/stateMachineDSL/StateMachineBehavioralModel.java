/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Behavioral Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage#getStateMachineBehavioralModel()
 * @model
 * @generated
 */
public interface StateMachineBehavioralModel extends hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineBehavioralModel
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage#getStateMachineBehavioralModel_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Include> getIncludes();

} // StateMachineBehavioralModel
