/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_type#getSubrange <em>Subrange</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_type#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.simple_type#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_type()
 * @model
 * @generated
 */
public interface simple_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Subrange</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subrange</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subrange</em>' containment reference.
   * @see #setSubrange(subrange_type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_type_Subrange()
   * @model containment="true"
   * @generated
   */
  subrange_type getSubrange();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_type#getSubrange <em>Subrange</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subrange</em>' containment reference.
   * @see #getSubrange()
   * @generated
   */
  void setSubrange(subrange_type value);

  /**
   * Returns the value of the '<em><b>Enumerated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated</em>' containment reference.
   * @see #setEnumerated(enumerated_type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_type_Enumerated()
   * @model containment="true"
   * @generated
   */
  enumerated_type getEnumerated();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_type#getEnumerated <em>Enumerated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated</em>' containment reference.
   * @see #getEnumerated()
   * @generated
   */
  void setEnumerated(enumerated_type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsimple_type_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.simple_type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // simple_type
