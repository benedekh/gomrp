/**
 */
package hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl;

import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.impl.TraceImpl#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends NamedElementImpl implements Trace {
	/**
	 * The default value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit GRANULARITY_EDEFAULT = TimeUnit.SECONDS;

	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit granularity = GRANULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceEntry> consistsOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRPTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getGranularity() {
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGranularity(TimeUnit newGranularity) {
		TimeUnit oldGranularity = granularity;
		granularity = newGranularity == null ? GRANULARITY_EDEFAULT : newGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRPTracePackage.TRACE__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceEntry> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<TraceEntry>(TraceEntry.class, this, MRPTracePackage.TRACE__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRPTracePackage.TRACE__CONSISTS_OF:
				return ((InternalEList<?>)getConsistsOf()).basicRemove(otherEnd, msgs);
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
			case MRPTracePackage.TRACE__GRANULARITY:
				return getGranularity();
			case MRPTracePackage.TRACE__CONSISTS_OF:
				return getConsistsOf();
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
			case MRPTracePackage.TRACE__GRANULARITY:
				setGranularity((TimeUnit)newValue);
				return;
			case MRPTracePackage.TRACE__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends TraceEntry>)newValue);
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
			case MRPTracePackage.TRACE__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case MRPTracePackage.TRACE__CONSISTS_OF:
				getConsistsOf().clear();
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
			case MRPTracePackage.TRACE__GRANULARITY:
				return granularity != GRANULARITY_EDEFAULT;
			case MRPTracePackage.TRACE__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
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
		result.append(" (granularity: ");
		result.append(granularity);
		result.append(')');
		return result.toString();
	}

} //TraceImpl
