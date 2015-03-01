/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.value_parameter_section#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.value_parameter_section#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvalue_parameter_section()
 * @model
 * @generated
 */
public interface value_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' containment reference.
   * @see #setIdentifiers(identifier_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvalue_parameter_section_Identifiers()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.value_parameter_section#getIdentifiers <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' containment reference.
   * @see #getIdentifiers()
   * @generated
   */
  void setIdentifiers(identifier_list value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(parameter_type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvalue_parameter_section_Type()
   * @model containment="true"
   * @generated
   */
  parameter_type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.value_parameter_section#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(parameter_type value);

} // value_parameter_section
