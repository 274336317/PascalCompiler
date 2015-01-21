/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalPackage
 * @generated
 */
public interface PascalFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalFactory eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalFactoryImpl.init();

  /**
   * Returns a new object of class '<em>pascal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pascal</em>'.
   * @generated
   */
  pascal createpascal();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PascalPackage getPascalPackage();

} //PascalFactory
