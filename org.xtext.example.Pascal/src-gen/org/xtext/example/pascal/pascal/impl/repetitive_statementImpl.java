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
import org.xtext.example.pascal.pascal.for_statement;
import org.xtext.example.pascal.pascal.repeat_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repetitive statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getWhileStmt <em>While Stmt</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getRepeatStmt <em>Repeat Stmt</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getForStmt <em>For Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class repetitive_statementImpl extends MinimalEObjectImpl.Container implements repetitive_statement
{
  /**
   * The cached value of the '{@link #getWhileStmt() <em>While Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileStmt()
   * @generated
   * @ordered
   */
  protected while_statement whileStmt;

  /**
   * The cached value of the '{@link #getRepeatStmt() <em>Repeat Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatStmt()
   * @generated
   * @ordered
   */
  protected repeat_statement repeatStmt;

  /**
   * The cached value of the '{@link #getForStmt() <em>For Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStmt()
   * @generated
   * @ordered
   */
  protected for_statement forStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected repetitive_statementImpl()
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
    return PascalPackage.Literals.REPETITIVE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement getWhileStmt()
  {
    return whileStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileStmt(while_statement newWhileStmt, NotificationChain msgs)
  {
    while_statement oldWhileStmt = whileStmt;
    whileStmt = newWhileStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT, oldWhileStmt, newWhileStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileStmt(while_statement newWhileStmt)
  {
    if (newWhileStmt != whileStmt)
    {
      NotificationChain msgs = null;
      if (whileStmt != null)
        msgs = ((InternalEObject)whileStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT, null, msgs);
      if (newWhileStmt != null)
        msgs = ((InternalEObject)newWhileStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT, null, msgs);
      msgs = basicSetWhileStmt(newWhileStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT, newWhileStmt, newWhileStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repeat_statement getRepeatStmt()
  {
    return repeatStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeatStmt(repeat_statement newRepeatStmt, NotificationChain msgs)
  {
    repeat_statement oldRepeatStmt = repeatStmt;
    repeatStmt = newRepeatStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT, oldRepeatStmt, newRepeatStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeatStmt(repeat_statement newRepeatStmt)
  {
    if (newRepeatStmt != repeatStmt)
    {
      NotificationChain msgs = null;
      if (repeatStmt != null)
        msgs = ((InternalEObject)repeatStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT, null, msgs);
      if (newRepeatStmt != null)
        msgs = ((InternalEObject)newRepeatStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT, null, msgs);
      msgs = basicSetRepeatStmt(newRepeatStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT, newRepeatStmt, newRepeatStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement getForStmt()
  {
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStmt(for_statement newForStmt, NotificationChain msgs)
  {
    for_statement oldForStmt = forStmt;
    forStmt = newForStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, oldForStmt, newForStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStmt(for_statement newForStmt)
  {
    if (newForStmt != forStmt)
    {
      NotificationChain msgs = null;
      if (forStmt != null)
        msgs = ((InternalEObject)forStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, null, msgs);
      if (newForStmt != null)
        msgs = ((InternalEObject)newForStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, null, msgs);
      msgs = basicSetForStmt(newForStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, newForStmt, newForStmt));
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT:
        return basicSetWhileStmt(null, msgs);
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT:
        return basicSetRepeatStmt(null, msgs);
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return basicSetForStmt(null, msgs);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT:
        return getWhileStmt();
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT:
        return getRepeatStmt();
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return getForStmt();
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT:
        setWhileStmt((while_statement)newValue);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT:
        setRepeatStmt((repeat_statement)newValue);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        setForStmt((for_statement)newValue);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT:
        setWhileStmt((while_statement)null);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT:
        setRepeatStmt((repeat_statement)null);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        setForStmt((for_statement)null);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STMT:
        return whileStmt != null;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STMT:
        return repeatStmt != null;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return forStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //repetitive_statementImpl
