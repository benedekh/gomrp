/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getModifieredElement()
 * @model abstract="true"
 * @generated
 */
public interface ModifieredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier
	 * @see #setModifier(Modifier)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getModifieredElement_Modifier()
	 * @model default="NONE" required="true"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.Modifier
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

} // ModifieredElement
