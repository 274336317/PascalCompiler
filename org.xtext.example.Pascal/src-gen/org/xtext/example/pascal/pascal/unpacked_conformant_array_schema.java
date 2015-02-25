/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface unpacked_conformant_array_schema extends conformant_array_schema
{
  /**
   * Returns the value of the '<em><b>Bounds</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.bound_specification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bounds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bounds</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema_Bounds()
   * @model containment="true"
   * @generated
   */
  EList<bound_specification> getBounds();

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(conformant_array_schema)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema_Array()
   * @model containment="true"
   * @generated
   */
  conformant_array_schema getArray();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(conformant_array_schema value);

} // unpacked_conformant_array_schema
