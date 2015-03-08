/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_expression#getPrefixOperators <em>Prefix Operators</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_expression#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_expression#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_expression()
 * @model
 * @generated
 */
public interface simple_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefix Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Operators</em>' attribute list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_expression_PrefixOperators()
   * @model unique="false"
   * @generated
   */
  EList<String> getPrefixOperators();

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_expression_Terms()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTerms();

  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_expression_Operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperators();

} // simple_expression
