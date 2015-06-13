/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetMember()
 * @model abstract="true"
 * @generated
 */
public interface TargetMember extends TypedElement, ModifieredElement, TargetElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"PUBLIC"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility
	 * @see #setVisibility(Visibility)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetMember_Visibility()
	 * @model default="PUBLIC" required="true"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // TargetMember
