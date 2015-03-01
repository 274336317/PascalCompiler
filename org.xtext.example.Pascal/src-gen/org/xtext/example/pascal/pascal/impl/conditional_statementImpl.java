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
import org.xtext.example.pascal.pascal.case_statement;
import org.xtext.example.pascal.pascal.conditional_statement;
import org.xtext.example.pascal.pascal.if_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conditional statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.conditional_statementImpl#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.conditional_statementImpl#getCaseStmt <em>Case Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class conditional_statementImpl extends MinimalEObjectImpl.Container implements conditional_statement
{
  /**
   * The cached value of the '{@link #getIfStmt() <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStmt()
   * @generated
   * @ordered
   */
  protected if_statement ifStmt;

  /**
   * The cached value of the '{@link #getCaseStmt() <em>Case Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseStmt()
   * @generated
   * @ordered
   */
  protected case_statement caseStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conditional_statementImpl()
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
    return PascalPackage.Literals.CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement getIfStmt()
  {
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStmt(if_statement newIfStmt, NotificationChain msgs)
  {
    if_statement oldIfStmt = ifStmt;
    ifStmt = newIfStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__IF_STMT, oldIfStmt, newIfStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStmt(if_statement newIfStmt)
  {
    if (newIfStmt != ifStmt)
    {
      NotificationChain msgs = null;
      if (ifStmt != null)
        msgs = ((InternalEObject)ifStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__IF_STMT, null, msgs);
      if (newIfStmt != null)
        msgs = ((InternalEObject)newIfStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__IF_STMT, null, msgs);
      msgs = basicSetIfStmt(newIfStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__IF_STMT, newIfStmt, newIfStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_statement getCaseStmt()
  {
    return caseStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseStmt(case_statement newCaseStmt, NotificationChain msgs)
  {
    case_statement oldCaseStmt = caseStmt;
    caseStmt = newCaseStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT, oldCaseStmt, newCaseStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseStmt(case_statement newCaseStmt)
  {
    if (newCaseStmt != caseStmt)
    {
      NotificationChain msgs = null;
      if (caseStmt != null)
        msgs = ((InternalEObject)caseStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT, null, msgs);
      if (newCaseStmt != null)
        msgs = ((InternalEObject)newCaseStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT, null, msgs);
      msgs = basicSetCaseStmt(newCaseStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT, newCaseStmt, newCaseStmt));
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return basicSetIfStmt(null, msgs);
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return basicSetCaseStmt(null, msgs);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return getIfStmt();
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return getCaseStmt();
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STMT:
        setIfStmt((if_statement)newValue);
        return;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        setCaseStmt((case_statement)newValue);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STMT:
        setIfStmt((if_statement)null);
        return;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        setCaseStmt((case_statement)null);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return ifStmt != null;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return caseStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //conditional_statementImpl
