/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsIn <em>Is In</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsInSpecial <em>Is In Special</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClassifier()
 * @model abstract="true"
 * @generated
 */
public interface TargetClassifier extends TargetElement {
	/**
	 * Returns the value of the '<em><b>Is In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In</em>' reference.
	 * @see #setIsIn(TargetPackage)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClassifier_IsIn()
	 * @model
	 * @generated
	 */
	TargetPackage getIsIn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsIn <em>Is In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In</em>' reference.
	 * @see #getIsIn()
	 * @generated
	 */
	void setIsIn(TargetPackage value);

	/**
	 * Returns the value of the '<em><b>Is In Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is In Special</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Special</em>' reference.
	 * @see #setIsInSpecial(ReferredTypedElement)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClassifier_IsInSpecial()
	 * @model
	 * @generated
	 */
	ReferredTypedElement getIsInSpecial();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getIsInSpecial <em>Is In Special</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Special</em>' reference.
	 * @see #getIsInSpecial()
	 * @generated
	 */
	void setIsInSpecial(ReferredTypedElement value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"PUBLIC"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility
	 * @see #setVisibility(ClassifierVisibility)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClassifier_Visibility()
	 * @model default="PUBLIC" required="true"
	 * @generated
	 */
	ClassifierVisibility getVisibility();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ClassifierVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(ClassifierVisibility value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClassifier_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetMember> getMembers();

} // TargetClassifier
