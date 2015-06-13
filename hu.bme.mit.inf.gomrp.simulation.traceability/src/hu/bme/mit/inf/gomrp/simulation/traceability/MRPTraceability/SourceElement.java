/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceRDMElement <em>Source RDM Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getSourceSMElement <em>Source SM Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getSourceElement_Target()
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	EList<TargetElement> getTarget();

	/**
	 * Returns the value of the '<em><b>Source RDM Element</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.RDMElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source RDM Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source RDM Element</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getSourceElement_SourceRDMElement()
	 * @model
	 * @generated
	 */
	EList<RDMElement> getSourceRDMElement();

	/**
	 * Returns the value of the '<em><b>Source SM Element</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source SM Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source SM Element</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getSourceElement_SourceSMElement()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getSourceSMElement();

} // SourceElement
