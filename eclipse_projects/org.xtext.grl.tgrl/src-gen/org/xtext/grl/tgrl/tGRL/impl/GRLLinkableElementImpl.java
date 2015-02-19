/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.GRLLinkableElement;
import org.xtext.grl.tgrl.tGRL.ImportanceType;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GRL Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getFillcolor <em>Fillcolor</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GRLLinkableElementImpl extends GRLModelElementImpl implements GRLLinkableElement
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
   * The default value of the '{@link #getFillcolor() <em>Fillcolor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillcolor()
   * @generated
   * @ordered
   */
  protected static final Color FILLCOLOR_EDEFAULT = Color.WHITE;

  /**
   * The cached value of the '{@link #getFillcolor() <em>Fillcolor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillcolor()
   * @generated
   * @ordered
   */
  protected Color fillcolor = FILLCOLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected static final ImportanceType IMPORTANCE_EDEFAULT = ImportanceType.NONE;

  /**
   * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected ImportanceType importance = IMPORTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportanceQuantitative()
   * @generated
   * @ordered
   */
  protected static final int IMPORTANCE_QUANTITATIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportanceQuantitative()
   * @generated
   * @ordered
   */
  protected int importanceQuantitative = IMPORTANCE_QUANTITATIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GRLLinkableElementImpl()
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
    return TGRLPackage.Literals.GRL_LINKABLE_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getFillcolor()
  {
    return fillcolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillcolor(Color newFillcolor)
  {
    Color oldFillcolor = fillcolor;
    fillcolor = newFillcolor == null ? FILLCOLOR_EDEFAULT : newFillcolor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__FILLCOLOR, oldFillcolor, fillcolor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportanceType getImportance()
  {
    return importance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportance(ImportanceType newImportance)
  {
    ImportanceType oldImportance = importance;
    importance = newImportance == null ? IMPORTANCE_EDEFAULT : newImportance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE, oldImportance, importance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getImportanceQuantitative()
  {
    return importanceQuantitative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportanceQuantitative(int newImportanceQuantitative)
  {
    int oldImportanceQuantitative = importanceQuantitative;
    importanceQuantitative = newImportanceQuantitative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE, oldImportanceQuantitative, importanceQuantitative));
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
      case TGRLPackage.GRL_LINKABLE_ELEMENT__NAME:
        return getName();
      case TGRLPackage.GRL_LINKABLE_ELEMENT__LABEL:
        return getLabel();
      case TGRLPackage.GRL_LINKABLE_ELEMENT__DESCRIPTION:
        return getDescription();
      case TGRLPackage.GRL_LINKABLE_ELEMENT__FILLCOLOR:
        return getFillcolor();
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE:
        return getImportance();
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE:
        return getImportanceQuantitative();
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
      case TGRLPackage.GRL_LINKABLE_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__LABEL:
        setLabel((String)newValue);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__FILLCOLOR:
        setFillcolor((Color)newValue);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE:
        setImportance((ImportanceType)newValue);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE:
        setImportanceQuantitative((Integer)newValue);
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
      case TGRLPackage.GRL_LINKABLE_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__FILLCOLOR:
        setFillcolor(FILLCOLOR_EDEFAULT);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE:
        setImportance(IMPORTANCE_EDEFAULT);
        return;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE:
        setImportanceQuantitative(IMPORTANCE_QUANTITATIVE_EDEFAULT);
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
      case TGRLPackage.GRL_LINKABLE_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.GRL_LINKABLE_ELEMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TGRLPackage.GRL_LINKABLE_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TGRLPackage.GRL_LINKABLE_ELEMENT__FILLCOLOR:
        return fillcolor != FILLCOLOR_EDEFAULT;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE:
        return importance != IMPORTANCE_EDEFAULT;
      case TGRLPackage.GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE:
        return importanceQuantitative != IMPORTANCE_QUANTITATIVE_EDEFAULT;
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
    result.append(", fillcolor: ");
    result.append(fillcolor);
    result.append(", importance: ");
    result.append(importance);
    result.append(", importanceQuantitative: ");
    result.append(importanceQuantitative);
    result.append(')');
    return result.toString();
  }

} //GRLLinkableElementImpl
