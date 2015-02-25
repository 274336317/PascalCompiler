/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.packed_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class packed_conformant_array_schemaImpl extends conformant_array_schemaImpl implements packed_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected bound_specification bound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected packed_conformant_array_schemaImpl()
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
    return PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bound_specification getBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound(bound_specification newBound, NotificationChain msgs)
  {
    bound_specification oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND, oldBound, newBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBound(bound_specification newBound)
  {
    if (newBound != bound)
    {
      NotificationChain msgs = null;
      if (bound != null)
        msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND, null, msgs);
      if (newBound != null)
        msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND, null, msgs);
      msgs = basicSetBound(newBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND, newBound, newBound));
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND:
        return basicSetBound(null, msgs);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND:
        return getBound();
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND:
        setBound((bound_specification)newValue);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND:
        setBound((bound_specification)null);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND:
        return bound != null;
    }
    return super.eIsSet(featureID);
  }

} //packed_conformant_array_schemaImpl
