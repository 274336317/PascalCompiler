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
import org.xtext.example.pascal.pascal.enumerated_type;
import org.xtext.example.pascal.pascal.identifier_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enumerated type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.enumerated_typeImpl#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumerated_typeImpl extends MinimalEObjectImpl.Container implements enumerated_type
{
  /**
   * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiers()
   * @generated
   * @ordered
   */
  protected identifier_list identifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected enumerated_typeImpl()
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
    return PascalPackage.Literals.ENUMERATED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list getIdentifiers()
  {
    return identifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifiers(identifier_list newIdentifiers, NotificationChain msgs)
  {
    identifier_list oldIdentifiers = identifiers;
    identifiers = newIdentifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ENUMERATED_TYPE__IDENTIFIERS, oldIdentifiers, newIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifiers(identifier_list newIdentifiers)
  {
    if (newIdentifiers != identifiers)
    {
      NotificationChain msgs = null;
      if (identifiers != null)
        msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ENUMERATED_TYPE__IDENTIFIERS, null, msgs);
      if (newIdentifiers != null)
        msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ENUMERATED_TYPE__IDENTIFIERS, null, msgs);
      msgs = basicSetIdentifiers(newIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ENUMERATED_TYPE__IDENTIFIERS, newIdentifiers, newIdentifiers));
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
      case PascalPackage.ENUMERATED_TYPE__IDENTIFIERS:
        return basicSetIdentifiers(null, msgs);
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
      case PascalPackage.ENUMERATED_TYPE__IDENTIFIERS:
        return getIdentifiers();
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
      case PascalPackage.ENUMERATED_TYPE__IDENTIFIERS:
        setIdentifiers((identifier_list)newValue);
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
      case PascalPackage.ENUMERATED_TYPE__IDENTIFIERS:
        setIdentifiers((identifier_list)null);
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
      case PascalPackage.ENUMERATED_TYPE__IDENTIFIERS:
        return identifiers != null;
    }
    return super.eIsSet(featureID);
  }

} //enumerated_typeImpl
