/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.provider;


import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachineFactory;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineItemProvider(AdapterFactory adapterFactory) {
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

			addActiveStatePropertyDescriptor(object);
			addReferredObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Active State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StateMachine_activeState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StateMachine_activeState_feature", "_UI_StateMachine_type"),
				 StateMachinePackage.Literals.STATE_MACHINE__ACTIVE_STATE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referred Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferredObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StateMachine_referredObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StateMachine_referredObject_feature", "_UI_StateMachine_type"),
				 StateMachinePackage.Literals.STATE_MACHINE__REFERRED_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(StateMachinePackage.Literals.STATE_MACHINE__STATES);
			childrenFeatures.add(StateMachinePackage.Literals.STATE_MACHINE__TRANSITIONS);
			childrenFeatures.add(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS);
			childrenFeatures.add(StateMachinePackage.Literals.STATE_MACHINE__GUARDS);
			childrenFeatures.add(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS);
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
	 * This returns StateMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StateMachine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StateMachine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StateMachine_type") :
			getString("_UI_StateMachine_type") + " " + label;
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

		switch (notification.getFeatureID(StateMachine.class)) {
			case StateMachinePackage.STATE_MACHINE__STATES:
			case StateMachinePackage.STATE_MACHINE__TRANSITIONS:
			case StateMachinePackage.STATE_MACHINE__TRIGGERS:
			case StateMachinePackage.STATE_MACHINE__GUARDS:
			case StateMachinePackage.STATE_MACHINE__ACTIONS:
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
				(StateMachinePackage.Literals.STATE_MACHINE__STATES,
				 StateMachineFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__STATES,
				 StateMachineFactory.eINSTANCE.createCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRANSITIONS,
				 StateMachineFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS,
				 StateMachineFactory.eINSTANCE.createTriggerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS,
				 StateMachineFactory.eINSTANCE.createTrainHeadingSpeedChanged()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS,
				 StateMachineFactory.eINSTANCE.createTrainTrackElementChanged()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS,
				 StateMachineFactory.eINSTANCE.createSignalAllowedSpeedChanged()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__TRIGGERS,
				 StateMachineFactory.eINSTANCE.createTurnoutDirectionChanged()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createGuardExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createTrainCurrentHeadingSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createTrainCurrentlyStandsOn()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createTurnoutCurrentDirection()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createSignalCurrentAllowedSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createNextTrackElementIs()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__GUARDS,
				 StateMachineFactory.eINSTANCE.createTurnoutHasDesiredDirection()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS,
				 StateMachineFactory.eINSTANCE.createActionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS,
				 StateMachineFactory.eINSTANCE.createChangeTrainHeadingSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS,
				 StateMachineFactory.eINSTANCE.createChangeSignalAllowedSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS,
				 StateMachineFactory.eINSTANCE.createChangeTurnoutDirection()));

		newChildDescriptors.add
			(createChildParameter
				(StateMachinePackage.Literals.STATE_MACHINE__ACTIONS,
				 StateMachineFactory.eINSTANCE.createChangeTrainCurrentTrackElement()));
	}

}
