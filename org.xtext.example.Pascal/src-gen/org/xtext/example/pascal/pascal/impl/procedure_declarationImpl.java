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
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.procedure_declaration;
import org.xtext.example.pascal.pascal.procedure_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_declarationImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_declarationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_declarationImpl#isForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class procedure_declarationImpl extends MinimalEObjectImpl.Container implements procedure_declaration
{
  /**
   * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected procedure_heading heading;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected block block;

  /**
   * The default value of the '{@link #isForward() <em>Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForward()
   * @generated
   * @ordered
   */
  protected static final boolean FORWARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForward() <em>Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForward()
   * @generated
   * @ordered
   */
  protected boolean forward = FORWARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_declarationImpl()
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
    return PascalPackage.Literals.PROCEDURE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading getHeading()
  {
    return heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeading(procedure_heading newHeading, NotificationChain msgs)
  {
    procedure_heading oldHeading = heading;
    heading = newHeading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_DECLARATION__HEADING, oldHeading, newHeading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeading(procedure_heading newHeading)
  {
    if (newHeading != heading)
    {
      NotificationChain msgs = null;
      if (heading != null)
        msgs = ((InternalEObject)heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_DECLARATION__HEADING, null, msgs);
      if (newHeading != null)
        msgs = ((InternalEObject)newHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_DECLARATION__HEADING, null, msgs);
      msgs = basicSetHeading(newHeading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_DECLARATION__HEADING, newHeading, newHeading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(block newBlock, NotificationChain msgs)
  {
    block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_DECLARATION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_DECLARATION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_DECLARATION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_DECLARATION__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForward()
  {
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForward(boolean newForward)
  {
    boolean oldForward = forward;
    forward = newForward;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_DECLARATION__FORWARD, oldForward, forward));
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
      case PascalPackage.PROCEDURE_DECLARATION__HEADING:
        return basicSetHeading(null, msgs);
      case PascalPackage.PROCEDURE_DECLARATION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case PascalPackage.PROCEDURE_DECLARATION__HEADING:
        return getHeading();
      case PascalPackage.PROCEDURE_DECLARATION__BLOCK:
        return getBlock();
      case PascalPackage.PROCEDURE_DECLARATION__FORWARD:
        return isForward();
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
      case PascalPackage.PROCEDURE_DECLARATION__HEADING:
        setHeading((procedure_heading)newValue);
        return;
      case PascalPackage.PROCEDURE_DECLARATION__BLOCK:
        setBlock((block)newValue);
        return;
      case PascalPackage.PROCEDURE_DECLARATION__FORWARD:
        setForward((Boolean)newValue);
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
      case PascalPackage.PROCEDURE_DECLARATION__HEADING:
        setHeading((procedure_heading)null);
        return;
      case PascalPackage.PROCEDURE_DECLARATION__BLOCK:
        setBlock((block)null);
        return;
      case PascalPackage.PROCEDURE_DECLARATION__FORWARD:
        setForward(FORWARD_EDEFAULT);
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
      case PascalPackage.PROCEDURE_DECLARATION__HEADING:
        return heading != null;
      case PascalPackage.PROCEDURE_DECLARATION__BLOCK:
        return block != null;
      case PascalPackage.PROCEDURE_DECLARATION__FORWARD:
        return forward != FORWARD_EDEFAULT;
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
    result.append(" (forward: ");
    result.append(forward);
    result.append(')');
    return result.toString();
  }

} //procedure_declarationImpl
