/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.constant_definition_part;
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.label_declaration_part;
import org.xtext.example.pascal.pascal.procedure_and_function_declaration_part;
import org.xtext.example.pascal.pascal.type_definition_part;
import org.xtext.example.pascal.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class declaration_partImpl extends MinimalEObjectImpl.Container implements declaration_part
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected label_declaration_part label;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected constant_definition_part constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type_definition_part type;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable_declaration_part variable;

  /**
   * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure()
   * @generated
   * @ordered
   */
  protected procedure_and_function_declaration_part procedure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_partImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(label_declaration_part newLabel, NotificationChain msgs)
  {
    label_declaration_part oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(label_declaration_part newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(constant_definition_part newConstant, NotificationChain msgs)
  {
    constant_definition_part oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(constant_definition_part newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type_definition_part newType, NotificationChain msgs)
  {
    type_definition_part oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type_definition_part newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable_declaration_part newVariable, NotificationChain msgs)
  {
    variable_declaration_part oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable_declaration_part newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_and_function_declaration_part getProcedure()
  {
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedure(procedure_and_function_declaration_part newProcedure, NotificationChain msgs)
  {
    procedure_and_function_declaration_part oldProcedure = procedure;
    procedure = newProcedure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__PROCEDURE, oldProcedure, newProcedure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure(procedure_and_function_declaration_part newProcedure)
  {
    if (newProcedure != procedure)
    {
      NotificationChain msgs = null;
      if (procedure != null)
        msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__PROCEDURE, null, msgs);
      if (newProcedure != null)
        msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__PROCEDURE, null, msgs);
      msgs = basicSetProcedure(newProcedure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__PROCEDURE, newProcedure, newProcedure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL:
        return basicSetLabel(null, msgs);
      case PascalPackage.DECLARATION_PART__CONSTANT:
        return basicSetConstant(null, msgs);
      case PascalPackage.DECLARATION_PART__TYPE:
        return basicSetType(null, msgs);
      case PascalPackage.DECLARATION_PART__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.DECLARATION_PART__PROCEDURE:
        return basicSetProcedure(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL:
        return getLabel();
      case PascalPackage.DECLARATION_PART__CONSTANT:
        return getConstant();
      case PascalPackage.DECLARATION_PART__TYPE:
        return getType();
      case PascalPackage.DECLARATION_PART__VARIABLE:
        return getVariable();
      case PascalPackage.DECLARATION_PART__PROCEDURE:
        return getProcedure();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL:
        setLabel((label_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT:
        setConstant((constant_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__TYPE:
        setType((type_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE:
        setVariable((variable_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE:
        setProcedure((procedure_and_function_declaration_part)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL:
        setLabel((label_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT:
        setConstant((constant_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__TYPE:
        setType((type_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE:
        setVariable((variable_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE:
        setProcedure((procedure_and_function_declaration_part)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL:
        return label != null;
      case PascalPackage.DECLARATION_PART__CONSTANT:
        return constant != null;
      case PascalPackage.DECLARATION_PART__TYPE:
        return type != null;
      case PascalPackage.DECLARATION_PART__VARIABLE:
        return variable != null;
      case PascalPackage.DECLARATION_PART__PROCEDURE:
        return procedure != null;
    }
    return super.eIsSet(featureID);
  }

} //declaration_partImpl
