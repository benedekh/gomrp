/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetElement()
 * @model abstract="true"
 * @generated
 */
public interface TargetElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetElement_Source()
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	EList<SourceElement> getSource();

} // TargetElement
