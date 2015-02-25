/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.declaration_part#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.declaration_part#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.declaration_part#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.declaration_part#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.declaration_part#getProcedure <em>Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part()
 * @model
 * @generated
 */
public interface declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(label_declaration_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part_Label()
   * @model containment="true"
   * @generated
   */
  label_declaration_part getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.declaration_part#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(label_declaration_part value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(constant_definition_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part_Constant()
   * @model containment="true"
   * @generated
   */
  constant_definition_part getConstant();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.declaration_part#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(constant_definition_part value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type_definition_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part_Type()
   * @model containment="true"
   * @generated
   */
  type_definition_part getType();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.declaration_part#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type_definition_part value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable_declaration_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part_Variable()
   * @model containment="true"
   * @generated
   */
  variable_declaration_part getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.declaration_part#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable_declaration_part value);

  /**
   * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure</em>' containment reference.
   * @see #setProcedure(procedure_and_function_declaration_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdeclaration_part_Procedure()
   * @model containment="true"
   * @generated
   */
  procedure_and_function_declaration_part getProcedure();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.declaration_part#getProcedure <em>Procedure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure</em>' containment reference.
   * @see #getProcedure()
   * @generated
   */
  void setProcedure(procedure_and_function_declaration_part value);

} // declaration_part
