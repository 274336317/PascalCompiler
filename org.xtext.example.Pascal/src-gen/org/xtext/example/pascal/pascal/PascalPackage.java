/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalFactory
 * @model kind="package"
 * @generated
 */
public interface PascalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pascal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/pascal/Pascal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pascal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalPackage eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.pascalImpl <em>pascal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.pascalImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpascal()
   * @generated
   */
  int PASCAL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>pascal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.pascal <em>pascal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pascal</em>'.
   * @see org.xtext.example.pascal.pascal.pascal
   * @generated
   */
  EClass getpascal();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.pascal.pascal.pascal#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Program</em>'.
   * @see org.xtext.example.pascal.pascal.pascal#getProgram()
   * @see #getpascal()
   * @generated
   */
  EAttribute getpascal_Program();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PascalFactory getPascalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.pascalImpl <em>pascal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.pascalImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getpascal()
     * @generated
     */
    EClass PASCAL = eINSTANCE.getpascal();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASCAL__PROGRAM = eINSTANCE.getpascal_Program();

  }

} //PascalPackage
