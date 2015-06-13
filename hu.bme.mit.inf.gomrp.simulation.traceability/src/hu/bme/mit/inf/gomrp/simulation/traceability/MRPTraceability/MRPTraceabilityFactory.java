/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage
 * @generated
 */
public interface MRPTraceabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRPTraceabilityFactory eINSTANCE = hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl.MRPTraceabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traceability Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability Model</em>'.
	 * @generated
	 */
	TraceabilityModel createTraceabilityModel();

	/**
	 * Returns a new object of class '<em>Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Element</em>'.
	 * @generated
	 */
	SourceElement createSourceElement();

	/**
	 * Returns a new object of class '<em>Target Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Package</em>'.
	 * @generated
	 */
	TargetPackage createTargetPackage();

	/**
	 * Returns a new object of class '<em>Target Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Class</em>'.
	 * @generated
	 */
	TargetClass createTargetClass();

	/**
	 * Returns a new object of class '<em>Target Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Interface</em>'.
	 * @generated
	 */
	TargetInterface createTargetInterface();

	/**
	 * Returns a new object of class '<em>Referred Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referred Typed Element</em>'.
	 * @generated
	 */
	ReferredTypedElement createReferredTypedElement();

	/**
	 * Returns a new object of class '<em>Target Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Field</em>'.
	 * @generated
	 */
	TargetField createTargetField();

	/**
	 * Returns a new object of class '<em>Target Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Method</em>'.
	 * @generated
	 */
	TargetMethod createTargetMethod();

	/**
	 * Returns a new object of class '<em>Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Parameter</em>'.
	 * @generated
	 */
	TargetParameter createTargetParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MRPTraceabilityPackage getMRPTraceabilityPackage();

} //MRPTraceabilityFactory
