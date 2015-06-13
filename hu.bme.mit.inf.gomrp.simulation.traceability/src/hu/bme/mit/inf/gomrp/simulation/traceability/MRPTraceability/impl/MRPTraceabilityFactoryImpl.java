/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.impl;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRPTraceabilityFactoryImpl extends EFactoryImpl implements MRPTraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MRPTraceabilityFactory init() {
		try {
			MRPTraceabilityFactory theMRPTraceabilityFactory = (MRPTraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(MRPTraceabilityPackage.eNS_URI);
			if (theMRPTraceabilityFactory != null) {
				return theMRPTraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRPTraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MRPTraceabilityPackage.TRACEABILITY_MODEL: return createTraceabilityModel();
			case MRPTraceabilityPackage.SOURCE_ELEMENT: return createSourceElement();
			case MRPTraceabilityPackage.TARGET_PACKAGE: return createTargetPackage();
			case MRPTraceabilityPackage.TARGET_CLASS: return createTargetClass();
			case MRPTraceabilityPackage.TARGET_INTERFACE: return createTargetInterface();
			case MRPTraceabilityPackage.REFERRED_TYPED_ELEMENT: return createReferredTypedElement();
			case MRPTraceabilityPackage.TARGET_FIELD: return createTargetField();
			case MRPTraceabilityPackage.TARGET_METHOD: return createTargetMethod();
			case MRPTraceabilityPackage.TARGET_PARAMETER: return createTargetParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MRPTraceabilityPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case MRPTraceabilityPackage.CLASSIFIER_VISIBILITY:
				return createClassifierVisibilityFromString(eDataType, initialValue);
			case MRPTraceabilityPackage.MODIFIER:
				return createModifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MRPTraceabilityPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case MRPTraceabilityPackage.CLASSIFIER_VISIBILITY:
				return convertClassifierVisibilityToString(eDataType, instanceValue);
			case MRPTraceabilityPackage.MODIFIER:
				return convertModifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityModel createTraceabilityModel() {
		TraceabilityModelImpl traceabilityModel = new TraceabilityModelImpl();
		return traceabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement createSourceElement() {
		SourceElementImpl sourceElement = new SourceElementImpl();
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPackage createTargetPackage() {
		TargetPackageImpl targetPackage = new TargetPackageImpl();
		return targetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetClass createTargetClass() {
		TargetClassImpl targetClass = new TargetClassImpl();
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInterface createTargetInterface() {
		TargetInterfaceImpl targetInterface = new TargetInterfaceImpl();
		return targetInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredTypedElement createReferredTypedElement() {
		ReferredTypedElementImpl referredTypedElement = new ReferredTypedElementImpl();
		return referredTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetField createTargetField() {
		TargetFieldImpl targetField = new TargetFieldImpl();
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetMethod createTargetMethod() {
		TargetMethodImpl targetMethod = new TargetMethodImpl();
		return targetMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetParameter createTargetParameter() {
		TargetParameterImpl targetParameter = new TargetParameterImpl();
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierVisibility createClassifierVisibilityFromString(EDataType eDataType, String initialValue) {
		ClassifierVisibility result = ClassifierVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassifierVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifierFromString(EDataType eDataType, String initialValue) {
		Modifier result = Modifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilityPackage getMRPTraceabilityPackage() {
		return (MRPTraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MRPTraceabilityPackage getPackage() {
		return MRPTraceabilityPackage.eINSTANCE;
	}

} //MRPTraceabilityFactoryImpl
