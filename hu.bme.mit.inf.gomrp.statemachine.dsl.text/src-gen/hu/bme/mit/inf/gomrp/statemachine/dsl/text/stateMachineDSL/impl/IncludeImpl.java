/**
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl;

import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.impl.IncludeImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends MinimalEObjectImpl.Container implements Include
{
  /**
   * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected static final String FILENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected String filename = FILENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateMachineDSLPackage.Literals.INCLUDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilename(String newFilename)
  {
    String oldFilename = filename;
    filename = newFilename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachineDSLPackage.INCLUDE__FILENAME, oldFilename, filename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateMachineDSLPackage.INCLUDE__FILENAME:
        return getFilename();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateMachineDSLPackage.INCLUDE__FILENAME:
        setFilename((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateMachineDSLPackage.INCLUDE__FILENAME:
        setFilename(FILENAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateMachineDSLPackage.INCLUDE__FILENAME:
        return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (filename: ");
    result.append(filename);
    result.append(')');
    return result.toString();
  }

} //IncludeImpl
