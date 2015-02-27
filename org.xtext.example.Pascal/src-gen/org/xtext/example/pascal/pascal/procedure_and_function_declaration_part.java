/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure and function declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_and_function_declaration_part#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_and_function_declaration_part()
 * @model
 * @generated
 */
public interface procedure_and_function_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.procedure_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_and_function_declaration_part_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<procedure_declaration> getProcedures();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.function_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_and_function_declaration_part_Functions()
   * @model containment="true"
   * @generated
   */
  EList<function_declaration> getFunctions();

} // procedure_and_function_declaration_part
