/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.util;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage
 * @generated
 */
public class MRPTraceabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MRPTraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = MRPTraceabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MRPTraceabilityPackage.TRACEABILITY_MODEL: {
				TraceabilityModel traceabilityModel = (TraceabilityModel)theEObject;
				T result = caseTraceabilityModel(traceabilityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.SOURCE_ELEMENT: {
				SourceElement sourceElement = (SourceElement)theEObject;
				T result = caseSourceElement(sourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_ELEMENT: {
				TargetElement targetElement = (TargetElement)theEObject;
				T result = caseTargetElement(targetElement);
				if (result == null) result = caseNamedElement(targetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_PACKAGE: {
				TargetPackage targetPackage = (TargetPackage)theEObject;
				T result = caseTargetPackage(targetPackage);
				if (result == null) result = caseTargetElement(targetPackage);
				if (result == null) result = caseNamedElement(targetPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_CLASSIFIER: {
				TargetClassifier targetClassifier = (TargetClassifier)theEObject;
				T result = caseTargetClassifier(targetClassifier);
				if (result == null) result = caseTargetElement(targetClassifier);
				if (result == null) result = caseNamedElement(targetClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_CLASS: {
				TargetClass targetClass = (TargetClass)theEObject;
				T result = caseTargetClass(targetClass);
				if (result == null) result = caseTargetClassifier(targetClass);
				if (result == null) result = caseModifieredElement(targetClass);
				if (result == null) result = caseTargetElement(targetClass);
				if (result == null) result = caseNamedElement(targetClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_INTERFACE: {
				TargetInterface targetInterface = (TargetInterface)theEObject;
				T result = caseTargetInterface(targetInterface);
				if (result == null) result = caseTargetClassifier(targetInterface);
				if (result == null) result = caseTargetElement(targetInterface);
				if (result == null) result = caseNamedElement(targetInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.REFERRED_TYPED_ELEMENT: {
				ReferredTypedElement referredTypedElement = (ReferredTypedElement)theEObject;
				T result = caseReferredTypedElement(referredTypedElement);
				if (result == null) result = caseTypedElement(referredTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_MEMBER: {
				TargetMember targetMember = (TargetMember)theEObject;
				T result = caseTargetMember(targetMember);
				if (result == null) result = caseTypedElement(targetMember);
				if (result == null) result = caseModifieredElement(targetMember);
				if (result == null) result = caseTargetElement(targetMember);
				if (result == null) result = caseNamedElement(targetMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_FIELD: {
				TargetField targetField = (TargetField)theEObject;
				T result = caseTargetField(targetField);
				if (result == null) result = caseTargetMember(targetField);
				if (result == null) result = caseTypedElement(targetField);
				if (result == null) result = caseModifieredElement(targetField);
				if (result == null) result = caseTargetElement(targetField);
				if (result == null) result = caseNamedElement(targetField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_METHOD: {
				TargetMethod targetMethod = (TargetMethod)theEObject;
				T result = caseTargetMethod(targetMethod);
				if (result == null) result = caseTargetMember(targetMethod);
				if (result == null) result = caseTypedElement(targetMethod);
				if (result == null) result = caseModifieredElement(targetMethod);
				if (result == null) result = caseTargetElement(targetMethod);
				if (result == null) result = caseNamedElement(targetMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.TARGET_PARAMETER: {
				TargetParameter targetParameter = (TargetParameter)theEObject;
				T result = caseTargetParameter(targetParameter);
				if (result == null) result = caseTypedElement(targetParameter);
				if (result == null) result = caseTargetElement(targetParameter);
				if (result == null) result = caseNamedElement(targetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRPTraceabilityPackage.MODIFIERED_ELEMENT: {
				ModifieredElement modifieredElement = (ModifieredElement)theEObject;
				T result = caseModifieredElement(modifieredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceabilityModel(TraceabilityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceElement(SourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetElement(TargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPackage(TargetPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetClassifier(TargetClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetClass(TargetClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetInterface(TargetInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referred Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referred Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferredTypedElement(ReferredTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMember(TargetMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetField(TargetField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMethod(TargetMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetParameter(TargetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiered Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiered Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifieredElement(ModifieredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MRPTraceabilitySwitch
