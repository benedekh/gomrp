/**
 */
package hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.provider;

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.util.MRPTraceabilityAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MRPTraceabilityItemProviderAdapterFactory extends MRPTraceabilityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRPTraceabilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityModelItemProvider traceabilityModelItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TraceabilityModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceabilityModelAdapter() {
		if (traceabilityModelItemProvider == null) {
			traceabilityModelItemProvider = new TraceabilityModelItemProvider(this);
		}

		return traceabilityModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementItemProvider sourceElementItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceElementAdapter() {
		if (sourceElementItemProvider == null) {
			sourceElementItemProvider = new SourceElementItemProvider(this);
		}

		return sourceElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPackageItemProvider targetPackageItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetPackageAdapter() {
		if (targetPackageItemProvider == null) {
			targetPackageItemProvider = new TargetPackageItemProvider(this);
		}

		return targetPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetClassItemProvider targetClassItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetClassAdapter() {
		if (targetClassItemProvider == null) {
			targetClassItemProvider = new TargetClassItemProvider(this);
		}

		return targetClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetInterfaceItemProvider targetInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetInterfaceAdapter() {
		if (targetInterfaceItemProvider == null) {
			targetInterfaceItemProvider = new TargetInterfaceItemProvider(this);
		}

		return targetInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferredTypedElementItemProvider referredTypedElementItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.ReferredTypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferredTypedElementAdapter() {
		if (referredTypedElementItemProvider == null) {
			referredTypedElementItemProvider = new ReferredTypedElementItemProvider(this);
		}

		return referredTypedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetFieldItemProvider targetFieldItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetFieldAdapter() {
		if (targetFieldItemProvider == null) {
			targetFieldItemProvider = new TargetFieldItemProvider(this);
		}

		return targetFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMethodItemProvider targetMethodItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetMethodAdapter() {
		if (targetMethodItemProvider == null) {
			targetMethodItemProvider = new TargetMethodItemProvider(this);
		}

		return targetMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetParameterItemProvider targetParameterItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.TargetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetParameterAdapter() {
		if (targetParameterItemProvider == null) {
			targetParameterItemProvider = new TargetParameterItemProvider(this);
		}

		return targetParameterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (traceabilityModelItemProvider != null) traceabilityModelItemProvider.dispose();
		if (sourceElementItemProvider != null) sourceElementItemProvider.dispose();
		if (targetPackageItemProvider != null) targetPackageItemProvider.dispose();
		if (targetClassItemProvider != null) targetClassItemProvider.dispose();
		if (targetInterfaceItemProvider != null) targetInterfaceItemProvider.dispose();
		if (referredTypedElementItemProvider != null) referredTypedElementItemProvider.dispose();
		if (targetFieldItemProvider != null) targetFieldItemProvider.dispose();
		if (targetMethodItemProvider != null) targetMethodItemProvider.dispose();
		if (targetParameterItemProvider != null) targetParameterItemProvider.dispose();
	}

}
