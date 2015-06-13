/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.util;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityPackage
 * @generated
 */
public class MRPTraceabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MRPTraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MRPTraceabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRPTraceabilitySwitch<Adapter> modelSwitch =
		new MRPTraceabilitySwitch<Adapter>() {
			@Override
			public Adapter caseTraceabilityModel(TraceabilityModel object) {
				return createTraceabilityModelAdapter();
			}
			@Override
			public Adapter caseSourceElement(SourceElement object) {
				return createSourceElementAdapter();
			}
			@Override
			public Adapter caseTargetElement(TargetElement object) {
				return createTargetElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTargetPackage(TargetPackage object) {
				return createTargetPackageAdapter();
			}
			@Override
			public Adapter caseTargetClassifier(TargetClassifier object) {
				return createTargetClassifierAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseTargetClass(TargetClass object) {
				return createTargetClassAdapter();
			}
			@Override
			public Adapter caseTargetInterface(TargetInterface object) {
				return createTargetInterfaceAdapter();
			}
			@Override
			public Adapter caseReferredTypedElement(ReferredTypedElement object) {
				return createReferredTypedElementAdapter();
			}
			@Override
			public Adapter caseTargetMember(TargetMember object) {
				return createTargetMemberAdapter();
			}
			@Override
			public Adapter caseTargetField(TargetField object) {
				return createTargetFieldAdapter();
			}
			@Override
			public Adapter caseTargetMethod(TargetMethod object) {
				return createTargetMethodAdapter();
			}
			@Override
			public Adapter caseTargetParameter(TargetParameter object) {
				return createTargetParameterAdapter();
			}
			@Override
			public Adapter caseModifieredElement(ModifieredElement object) {
				return createModifieredElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel <em>Traceability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel
	 * @generated
	 */
	public Adapter createTraceabilityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement
	 * @generated
	 */
	public Adapter createSourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetElement
	 * @generated
	 */
	public Adapter createTargetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage <em>Target Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage
	 * @generated
	 */
	public Adapter createTargetPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier <em>Target Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClassifier
	 * @generated
	 */
	public Adapter createTargetClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass
	 * @generated
	 */
	public Adapter createTargetClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface <em>Target Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface
	 * @generated
	 */
	public Adapter createTargetInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement <em>Referred Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement
	 * @generated
	 */
	public Adapter createReferredTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember <em>Target Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMember
	 * @generated
	 */
	public Adapter createTargetMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField <em>Target Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField
	 * @generated
	 */
	public Adapter createTargetFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod <em>Target Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod
	 * @generated
	 */
	public Adapter createTargetMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter
	 * @generated
	 */
	public Adapter createTargetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement <em>Modifiered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ModifieredElement
	 * @generated
	 */
	public Adapter createModifieredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MRPTraceabilityAdapterFactory
