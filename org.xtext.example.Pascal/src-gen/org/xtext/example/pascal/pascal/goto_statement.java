/**
 */
package org.xtext.example.pascal.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>goto statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.goto_statement#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getgoto_statement()
 * @model
 * @generated
 */
public interface goto_statement extends simple_statement
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
   * @see #setLabel(label)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getgoto_statement_Label()
   * @model containment="true"
   * @generated
   */
  label getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.goto_statement#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(label value);

} // goto_statement
