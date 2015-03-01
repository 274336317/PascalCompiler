/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>abstraction declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.abstraction_declaration#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.abstraction_declaration#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.abstraction_declaration#isForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getabstraction_declaration()
 * @model
 * @generated
 */
public interface abstraction_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(abstraction_heading)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getabstraction_declaration_Heading()
   * @model containment="true"
   * @generated
   */
  abstraction_heading getHeading();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.abstraction_declaration#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(abstraction_heading value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getabstraction_declaration_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.abstraction_declaration#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

  /**
   * Returns the value of the '<em><b>Forward</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forward</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward</em>' attribute.
   * @see #setForward(boolean)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getabstraction_declaration_Forward()
   * @model
   * @generated
   */
  boolean isForward();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.abstraction_declaration#isForward <em>Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward</em>' attribute.
   * @see #isForward()
   * @generated
   */
  void setForward(boolean value);

} // abstraction_declaration
