/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.conformant_array_schema;
import org.xtext.example.pascal.pascal.packed_conformant_array_schema;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl#getPacked <em>Packed</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.conformant_array_schemaImpl#getUnpacked <em>Unpacked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class conformant_array_schemaImpl extends MinimalEObjectImpl.Container implements conformant_array_schema
{
  /**
   * The cached value of the '{@link #getPacked() <em>Packed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacked()
   * @generated
   * @ordered
   */
  protected packed_conformant_array_schema packed;

  /**
   * The cached value of the '{@link #getUnpacked() <em>Unpacked</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpacked()
   * @generated
   * @ordered
   */
  protected unpacked_conformant_array_schema unpacked;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conformant_array_schemaImpl()
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
    return PascalPackage.Literals.CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packed_conformant_array_schema getPacked()
  {
    return packed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPacked(packed_conformant_array_schema newPacked, NotificationChain msgs)
  {
    packed_conformant_array_schema oldPacked = packed;
    packed = newPacked;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED, oldPacked, newPacked);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPacked(packed_conformant_array_schema newPacked)
  {
    if (newPacked != packed)
    {
      NotificationChain msgs = null;
      if (packed != null)
        msgs = ((InternalEObject)packed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED, null, msgs);
      if (newPacked != null)
        msgs = ((InternalEObject)newPacked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED, null, msgs);
      msgs = basicSetPacked(newPacked, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED, newPacked, newPacked));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_conformant_array_schema getUnpacked()
  {
    return unpacked;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpacked(unpacked_conformant_array_schema newUnpacked, NotificationChain msgs)
  {
    unpacked_conformant_array_schema oldUnpacked = unpacked;
    unpacked = newUnpacked;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED, oldUnpacked, newUnpacked);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpacked(unpacked_conformant_array_schema newUnpacked)
  {
    if (newUnpacked != unpacked)
    {
      NotificationChain msgs = null;
      if (unpacked != null)
        msgs = ((InternalEObject)unpacked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED, null, msgs);
      if (newUnpacked != null)
        msgs = ((InternalEObject)newUnpacked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED, null, msgs);
      msgs = basicSetUnpacked(newUnpacked, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED, newUnpacked, newUnpacked));
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
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED:
        return basicSetPacked(null, msgs);
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED:
        return basicSetUnpacked(null, msgs);
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
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED:
        return getPacked();
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED:
        return getUnpacked();
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
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED:
        setPacked((packed_conformant_array_schema)newValue);
        return;
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED:
        setUnpacked((unpacked_conformant_array_schema)newValue);
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
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED:
        setPacked((packed_conformant_array_schema)null);
        return;
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED:
        setUnpacked((unpacked_conformant_array_schema)null);
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
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__PACKED:
        return packed != null;
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA__UNPACKED:
        return unpacked != null;
    }
    return super.eIsSet(featureID);
  }

} //conformant_array_schemaImpl
