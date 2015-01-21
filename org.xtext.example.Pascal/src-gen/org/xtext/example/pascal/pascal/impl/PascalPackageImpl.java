/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.pascal.pascal.PascalFactory;
import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.pascal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalPackageImpl extends EPackageImpl implements PascalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pascalEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.pascal.pascal.PascalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PascalPackageImpl()
  {
    super(eNS_URI, PascalFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PascalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PascalPackage init()
  {
    if (isInited) return (PascalPackage)EPackage.Registry.INSTANCE.getEPackage(PascalPackage.eNS_URI);

    // Obtain or create and register package
    PascalPackageImpl thePascalPackage = (PascalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PascalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PascalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePascalPackage.createPackageContents();

    // Initialize created meta-data
    thePascalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePascalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PascalPackage.eNS_URI, thePascalPackage);
    return thePascalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpascal()
  {
    return pascalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpascal_Program()
  {
    return (EAttribute)pascalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactory getPascalFactory()
  {
    return (PascalFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pascalEClass = createEClass(PASCAL);
    createEAttribute(pascalEClass, PASCAL__PROGRAM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(pascalEClass, pascal.class, "pascal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpascal_Program(), ecorePackage.getEString(), "program", null, 0, -1, pascal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PascalPackageImpl
