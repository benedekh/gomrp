/**
 */
package hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * The default value is <code>"SECONDS"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Granularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit
	 * @see #setGranularity(TimeUnit)
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTrace_Granularity()
	 * @model default="SECONDS" required="true"
	 * @generated
	 */
	TimeUnit getGranularity();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage#getTrace_ConsistsOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceEntry> getConsistsOf();

} // Trace
