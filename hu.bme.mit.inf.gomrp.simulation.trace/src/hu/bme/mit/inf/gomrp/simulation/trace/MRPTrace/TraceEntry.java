/**
 */
package hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getNextEntry <em>Next Entry</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getAffectedRDMElements <em>Affected RDM Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTraceEntry()
 * @model
 * @generated
 */
public interface TraceEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Entry</em>' reference.
	 * @see #setNextEntry(TraceEntry)
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTraceEntry_NextEntry()
	 * @model
	 * @generated
	 */
	TraceEntry getNextEntry();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getNextEntry <em>Next Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Entry</em>' reference.
	 * @see #getNextEntry()
	 * @generated
	 */
	void setNextEntry(TraceEntry value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTraceEntry_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Affected RDM Elements</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.RDMElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected RDM Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected RDM Elements</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTraceEntry_AffectedRDMElements()
	 * @model
	 * @generated
	 */
	EList<RDMElement> getAffectedRDMElements();

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #setCause(Event)
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTraceEntry_Cause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getCause();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Event value);

} // TraceEntry
