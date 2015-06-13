/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTargets <em>Targets</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getSources <em>Sources</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTraceabilityModel()
 * @model
 * @generated
 */
public interface TraceabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTraceabilityModel_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetElement> getTargets();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTraceabilityModel_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceElement> getSources();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTraceabilityModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferredTypedElement> getTypes();

} // TraceabilityModel
