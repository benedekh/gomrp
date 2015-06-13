/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl;

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Action;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Guard;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.State;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Transition;
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#isIsEnabled <em>Is Enabled</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.impl.TransitionImpl#isIsFireable <em>Is Fireable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected State sourceState;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger trigger;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guard;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The default value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnabled = IS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFireable() <em>Is Fireable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFireable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIREABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFireable() <em>Is Fireable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFireable()
	 * @generated
	 * @ordered
	 */
	protected boolean isFireable = IS_FIREABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject)sourceState;
			sourceState = (State)eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceState(State newSourceState, NotificationChain msgs) {
		State oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__SOURCE_STATE, oldSourceState, newSourceState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceState(State newSourceState) {
		if (newSourceState != sourceState) {
			NotificationChain msgs = null;
			if (sourceState != null)
				msgs = ((InternalEObject)sourceState).eInverseRemove(this, StateMachinePackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			if (newSourceState != null)
				msgs = ((InternalEObject)newSourceState).eInverseAdd(this, StateMachinePackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			msgs = basicSetSourceState(newSourceState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__SOURCE_STATE, newSourceState, newSourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (State)eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(State newTargetState, NotificationChain msgs) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TARGET_STATE, oldTargetState, newTargetState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject)targetState).eInverseRemove(this, StateMachinePackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject)newTargetState).eInverseAdd(this, StateMachinePackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TARGET_STATE, newTargetState, newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (Trigger)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		Trigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuard() {
		if (guard == null) {
			guard = new EObjectResolvingEList<Guard>(Guard.class, this, StateMachinePackage.TRANSITION__GUARD);
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectResolvingEList<Action>(Action.class, this, StateMachinePackage.TRANSITION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnabled() {
		return isEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnabled(boolean newIsEnabled) {
		boolean oldIsEnabled = isEnabled;
		isEnabled = newIsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__IS_ENABLED, oldIsEnabled, isEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFireable() {
		return isFireable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFireable(boolean newIsFireable) {
		boolean oldIsFireable = isFireable;
		isFireable = newIsFireable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__IS_FIREABLE, oldIsFireable, isFireable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				if (sourceState != null)
					msgs = ((InternalEObject)sourceState).eInverseRemove(this, StateMachinePackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
				return basicSetSourceState((State)otherEnd, msgs);
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				if (targetState != null)
					msgs = ((InternalEObject)targetState).eInverseRemove(this, StateMachinePackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
				return basicSetTargetState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				return basicSetSourceState(null, msgs);
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				return basicSetTargetState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				if (resolve) return getSourceState();
				return basicGetSourceState();
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				if (resolve) return getTargetState();
				return basicGetTargetState();
			case StateMachinePackage.TRANSITION__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case StateMachinePackage.TRANSITION__GUARD:
				return getGuard();
			case StateMachinePackage.TRANSITION__ACTION:
				return getAction();
			case StateMachinePackage.TRANSITION__IS_ENABLED:
				return isIsEnabled();
			case StateMachinePackage.TRANSITION__IS_FIREABLE:
				return isIsFireable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				setSourceState((State)newValue);
				return;
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				setTargetState((State)newValue);
				return;
			case StateMachinePackage.TRANSITION__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case StateMachinePackage.TRANSITION__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends Guard>)newValue);
				return;
			case StateMachinePackage.TRANSITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case StateMachinePackage.TRANSITION__IS_ENABLED:
				setIsEnabled((Boolean)newValue);
				return;
			case StateMachinePackage.TRANSITION__IS_FIREABLE:
				setIsFireable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				setSourceState((State)null);
				return;
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				setTargetState((State)null);
				return;
			case StateMachinePackage.TRANSITION__TRIGGER:
				setTrigger((Trigger)null);
				return;
			case StateMachinePackage.TRANSITION__GUARD:
				getGuard().clear();
				return;
			case StateMachinePackage.TRANSITION__ACTION:
				getAction().clear();
				return;
			case StateMachinePackage.TRANSITION__IS_ENABLED:
				setIsEnabled(IS_ENABLED_EDEFAULT);
				return;
			case StateMachinePackage.TRANSITION__IS_FIREABLE:
				setIsFireable(IS_FIREABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__SOURCE_STATE:
				return sourceState != null;
			case StateMachinePackage.TRANSITION__TARGET_STATE:
				return targetState != null;
			case StateMachinePackage.TRANSITION__TRIGGER:
				return trigger != null;
			case StateMachinePackage.TRANSITION__GUARD:
				return guard != null && !guard.isEmpty();
			case StateMachinePackage.TRANSITION__ACTION:
				return action != null && !action.isEmpty();
			case StateMachinePackage.TRANSITION__IS_ENABLED:
				return isEnabled != IS_ENABLED_EDEFAULT;
			case StateMachinePackage.TRANSITION__IS_FIREABLE:
				return isFireable != IS_FIREABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isEnabled: ");
		result.append(isEnabled);
		result.append(", isFireable: ");
		result.append(isFireable);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
