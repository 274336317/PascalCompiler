/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variable_declaration_part#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_declaration_part()
 * @model
 * @generated
 */
public interface variable_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.variable_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_declaration_part_Sections()
   * @model containment="true"
   * @generated
   */
  EList<variable_section> getSections();

} // variable_declaration_part
