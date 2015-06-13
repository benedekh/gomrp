/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsCls <em>Extends Cls</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplInterface <em>Impl Interface</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsSpecial <em>Extends Special</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getImplementsSpecial <em>Implements Special</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClass()
 * @model
 * @generated
 */
public interface TargetClass extends TargetClassifier, ModifieredElement {
	/**
	 * Returns the value of the '<em><b>Extends Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Cls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Cls</em>' reference.
	 * @see #setExtendsCls(TargetClass)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClass_ExtendsCls()
	 * @model
	 * @generated
	 */
	TargetClass getExtendsCls();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsCls <em>Extends Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Cls</em>' reference.
	 * @see #getExtendsCls()
	 * @generated
	 */
	void setExtendsCls(TargetClass value);

	/**
	 * Returns the value of the '<em><b>Impl Interface</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Interface</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClass_ImplInterface()
	 * @model
	 * @generated
	 */
	EList<TargetInterface> getImplInterface();

	/**
	 * Returns the value of the '<em><b>Extends Special</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Special</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Special</em>' reference.
	 * @see #setExtendsSpecial(ReferredTypedElement)
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClass_ExtendsSpecial()
	 * @model
	 * @generated
	 */
	ReferredTypedElement getExtendsSpecial();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass#getExtendsSpecial <em>Extends Special</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Special</em>' reference.
	 * @see #getExtendsSpecial()
	 * @generated
	 */
	void setExtendsSpecial(ReferredTypedElement value);

	/**
	 * Returns the value of the '<em><b>Implements Special</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Special</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Special</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage#getTargetClass_ImplementsSpecial()
	 * @model
	 * @generated
	 */
	EList<ReferredTypedElement> getImplementsSpecial();

} // TargetClass
