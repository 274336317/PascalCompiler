/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subrange type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getInitialConst <em>Initial Const</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getFinalConst <em>Final Const</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getSubrange <em>Subrange</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type()
 * @model
 * @generated
 */
public interface subrange_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Const</em>' containment reference.
   * @see #setInitialConst(constant)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_InitialConst()
   * @model containment="true"
   * @generated
   */
  constant getInitialConst();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getInitialConst <em>Initial Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Const</em>' containment reference.
   * @see #getInitialConst()
   * @generated
   */
  void setInitialConst(constant value);

  /**
   * Returns the value of the '<em><b>Final Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final Const</em>' containment reference.
   * @see #setFinalConst(constant)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_FinalConst()
   * @model containment="true"
   * @generated
   */
  constant getFinalConst();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getFinalConst <em>Final Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final Const</em>' containment reference.
   * @see #getFinalConst()
   * @generated
   */
  void setFinalConst(constant value);

  /**
   * Returns the value of the '<em><b>Subrange</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subrange</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subrange</em>' attribute.
   * @see #setSubrange(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_Subrange()
   * @model
   * @generated
   */
  String getSubrange();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getSubrange <em>Subrange</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subrange</em>' attribute.
   * @see #getSubrange()
   * @generated
   */
  void setSubrange(String value);

  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(constant)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_Const()
   * @model containment="true"
   * @generated
   */
  constant getConst();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(constant value);

} // subrange_type
