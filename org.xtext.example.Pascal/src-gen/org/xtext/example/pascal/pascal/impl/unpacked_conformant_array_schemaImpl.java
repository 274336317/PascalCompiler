/**
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.conformant_array_schema;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unpacked_conformant_array_schemaImpl extends conformant_array_schemaImpl implements unpacked_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBounds()
   * @generated
   * @ordered
   */
  protected EList<bound_specification> bounds;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected conformant_array_schema array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpacked_conformant_array_schemaImpl()
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
    return PascalPackage.Literals.UNPACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<bound_specification> getBounds()
  {
    if (bounds == null)
    {
      bounds = new EObjectContainmentEList<bound_specification>(bound_specification.class, this, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS);
    }
    return bounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conformant_array_schema getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(conformant_array_schema newArray, NotificationChain msgs)
  {
    conformant_array_schema oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(conformant_array_schema newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return ((InternalEList<?>)getBounds()).basicRemove(otherEnd, msgs);
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY:
        return basicSetArray(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return getBounds();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY:
        return getArray();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        getBounds().clear();
        getBounds().addAll((Collection<? extends bound_specification>)newValue);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY:
        setArray((conformant_array_schema)newValue);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        getBounds().clear();
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY:
        setArray((conformant_array_schema)null);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return bounds != null && !bounds.isEmpty();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__ARRAY:
        return array != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_conformant_array_schemaImpl
