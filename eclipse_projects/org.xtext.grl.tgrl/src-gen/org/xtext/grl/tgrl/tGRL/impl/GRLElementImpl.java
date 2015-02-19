/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GRL Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GRLElementImpl extends GRLBaseElementImpl implements GRLElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillColor()
   * @generated
   * @ordered
   */
  protected static final Color FILL_COLOR_EDEFAULT = Color.WHITE;

  /**
   * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillColor()
   * @generated
   * @ordered
   */
  protected Color fillColor = FILL_COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GRLElementImpl()
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
    return TGRLPackage.Literals.GRL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_ELEMENT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getFillColor()
  {
    return fillColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillColor(Color newFillColor)
  {
    Color oldFillColor = fillColor;
    fillColor = newFillColor == null ? FILL_COLOR_EDEFAULT : newFillColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_ELEMENT__FILL_COLOR, oldFillColor, fillColor));
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
      case TGRLPackage.GRL_ELEMENT__NAME:
        return getName();
      case TGRLPackage.GRL_ELEMENT__LABEL:
        return getLabel();
      case TGRLPackage.GRL_ELEMENT__DESCRIPTION:
        return getDescription();
      case TGRLPackage.GRL_ELEMENT__FILL_COLOR:
        return getFillColor();
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
      case TGRLPackage.GRL_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.GRL_ELEMENT__LABEL:
        setLabel((String)newValue);
        return;
      case TGRLPackage.GRL_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TGRLPackage.GRL_ELEMENT__FILL_COLOR:
        setFillColor((Color)newValue);
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
      case TGRLPackage.GRL_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.GRL_ELEMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TGRLPackage.GRL_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TGRLPackage.GRL_ELEMENT__FILL_COLOR:
        setFillColor(FILL_COLOR_EDEFAULT);
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
      case TGRLPackage.GRL_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.GRL_ELEMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TGRLPackage.GRL_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TGRLPackage.GRL_ELEMENT__FILL_COLOR:
        return fillColor != FILL_COLOR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", description: ");
    result.append(description);
    result.append(", fillColor: ");
    result.append(fillColor);
    result.append(')');
    return result.toString();
  }

} //GRLElementImpl
