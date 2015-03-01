/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.field_list#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.field_list#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list()
 * @model
 * @generated
 */
public interface field_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Fixed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' containment reference.
   * @see #setFixed(fixed_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list_Fixed()
   * @model containment="true"
   * @generated
   */
  fixed_part getFixed();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.field_list#getFixed <em>Fixed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' containment reference.
   * @see #getFixed()
   * @generated
   */
  void setFixed(fixed_part value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.variant_part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list_Variants()
   * @model containment="true"
   * @generated
   */
  EList<variant_part> getVariants();

} // field_list
