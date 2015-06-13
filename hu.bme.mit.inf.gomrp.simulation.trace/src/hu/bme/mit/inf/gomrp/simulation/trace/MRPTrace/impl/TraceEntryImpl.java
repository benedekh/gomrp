/**
 */
package hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Event;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl#getNextEntry <em>Next Entry</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl#getAffectedRDMElements <em>Affected RDM Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceEntryImpl#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceEntryImpl extends MinimalEObjectImpl.Container implements TraceEntry {
	/**
	 * The cached value of the '{@link #getNextEntry() <em>Next Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEntry()
	 * @generated
	 * @ordered
	 */
	protected TraceEntry nextEntry;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffectedRDMElements() <em>Affected RDM Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedRDMElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RDMElement> affectedRDMElements;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Event cause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTracePackage.Literals.TRACE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEntry getNextEntry() {
		if (nextEntry != null && nextEntry.eIsProxy()) {
			InternalEObject oldNextEntry = (InternalEObject)nextEntry;
			nextEntry = (TraceEntry)eResolveProxy(oldNextEntry);
			if (nextEntry != oldNextEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY, oldNextEntry, nextEntry));
			}
		}
		return nextEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEntry basicGetNextEntry() {
		return nextEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEntry(TraceEntry newNextEntry) {
		TraceEntry oldNextEntry = nextEntry;
		nextEntry = newNextEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY, oldNextEntry, nextEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTracePackage.TRACE_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDMElement> getAffectedRDMElements() {
		if (affectedRDMElements == null) {
			affectedRDMElements = new EObjectResolvingEList<RDMElement>(RDMElement.class, this, MRPTracePackage.TRACE_ENTRY__AFFECTED_RDM_ELEMENTS);
		}
		return affectedRDMElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(Event newCause, NotificationChain msgs) {
		Event oldCause = cause;
		cause = newCause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MRPTracePackage.TRACE_ENTRY__CAUSE, oldCause, newCause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(Event newCause) {
		if (newCause != cause) {
			NotificationChain msgs = null;
			if (cause != null)
				msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MRPTracePackage.TRACE_ENTRY__CAUSE, null, msgs);
			if (newCause != null)
				msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MRPTracePackage.TRACE_ENTRY__CAUSE, null, msgs);
			msgs = basicSetCause(newCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTracePackage.TRACE_ENTRY__CAUSE, newCause, newCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTracePackage.TRACE_ENTRY__CAUSE:
				return basicSetCause(null, msgs);
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
			case MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY:
				if (resolve) return getNextEntry();
				return basicGetNextEntry();
			case MRPTracePackage.TRACE_ENTRY__DESCRIPTION:
				return getDescription();
			case MRPTracePackage.TRACE_ENTRY__AFFECTED_RDM_ELEMENTS:
				return getAffectedRDMElements();
			case MRPTracePackage.TRACE_ENTRY__CAUSE:
				return getCause();
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
			case MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY:
				setNextEntry((TraceEntry)newValue);
				return;
			case MRPTracePackage.TRACE_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MRPTracePackage.TRACE_ENTRY__AFFECTED_RDM_ELEMENTS:
				getAffectedRDMElements().clear();
				getAffectedRDMElements().addAll((Collection<? extends RDMElement>)newValue);
				return;
			case MRPTracePackage.TRACE_ENTRY__CAUSE:
				setCause((Event)newValue);
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
			case MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY:
				setNextEntry((TraceEntry)null);
				return;
			case MRPTracePackage.TRACE_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MRPTracePackage.TRACE_ENTRY__AFFECTED_RDM_ELEMENTS:
				getAffectedRDMElements().clear();
				return;
			case MRPTracePackage.TRACE_ENTRY__CAUSE:
				setCause((Event)null);
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
			case MRPTracePackage.TRACE_ENTRY__NEXT_ENTRY:
				return nextEntry != null;
			case MRPTracePackage.TRACE_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MRPTracePackage.TRACE_ENTRY__AFFECTED_RDM_ELEMENTS:
				return affectedRDMElements != null && !affectedRDMElements.isEmpty();
			case MRPTracePackage.TRACE_ENTRY__CAUSE:
				return cause != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TraceEntryImpl
