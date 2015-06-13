/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM.provider;


import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RailwayDomainModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayDomainModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__TRAINS);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__SECTIONS);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__TURNOUTS);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_CP);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_TDD);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE);
			childrenFeatures.add(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RailwayDomainModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RailwayDomainModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RailwayDomainModel_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RailwayDomainModel.class)) {
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TRAINS:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__SECTIONS:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__TURNOUTS:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_CP:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_TDD:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE:
			case RDMPackage.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__TRAINS,
				 RDMFactory.eINSTANCE.createTrain()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__SECTIONS,
				 RDMFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__SECTIONS,
				 RDMFactory.eINSTANCE.createStation()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__TURNOUTS,
				 RDMFactory.eINSTANCE.createTurnout()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_CP,
				 RDMFactory.eINSTANCE.createConnectionPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL,
				 RDMFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_SIGNAL,
				 RDMFactory.eINSTANCE.createTurnoutSignal()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_TDD,
				 RDMFactory.eINSTANCE.createTurnoutDesiredDirection()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE,
				 RDMFactory.eINSTANCE.createRoute()));

		newChildDescriptors.add
			(createChildParameter
				(RDMPackage.Literals.RAILWAY_DOMAIN_MODEL__EDITOR_ROUTE_ELEMENT,
				 RDMFactory.eINSTANCE.createRouteElement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RailwayEditPlugin.INSTANCE;
	}

}
