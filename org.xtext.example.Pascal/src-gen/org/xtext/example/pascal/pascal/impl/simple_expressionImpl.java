/**
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.simple_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_expressionImpl#getPrefixOperators <em>Prefix Operators</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_expressionImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_expressionImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_expressionImpl extends MinimalEObjectImpl.Container implements simple_expression
{
  /**
   * The cached value of the '{@link #getPrefixOperators() <em>Prefix Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixOperators()
   * @generated
   * @ordered
   */
  protected EList<String> prefixOperators;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<EObject> terms;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<String> operators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_expressionImpl()
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
    return PascalPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPrefixOperators()
  {
    if (prefixOperators == null)
    {
      prefixOperators = new EDataTypeEList<String>(String.class, this, PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATORS);
    }
    return prefixOperators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<EObject>(EObject.class, this, PascalPackage.SIMPLE_EXPRESSION__TERMS);
    }
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperators()
  {
    if (operators == null)
    {
      operators = new EDataTypeEList<String>(String.class, this, PascalPackage.SIMPLE_EXPRESSION__OPERATORS);
    }
    return operators;
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
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATORS:
        return getPrefixOperators();
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return getTerms();
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
        return getOperators();
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATORS:
        getPrefixOperators().clear();
        getPrefixOperators().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends EObject>)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends String>)newValue);
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATORS:
        getPrefixOperators().clear();
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
        getOperators().clear();
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATORS:
        return prefixOperators != null && !prefixOperators.isEmpty();
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return terms != null && !terms.isEmpty();
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
        return operators != null && !operators.isEmpty();
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
    result.append(" (prefixOperators: ");
    result.append(prefixOperators);
    result.append(", operators: ");
    result.append(operators);
    result.append(')');
    return result.toString();
  }

} //simple_expressionImpl
