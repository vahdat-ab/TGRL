/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicator Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl#getIsRedesignCategory <em>Is Redesign Category</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl#getIndicators <em>Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicatorGroupImpl extends GRLModelElementImpl implements IndicatorGroup
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
   * The default value of the '{@link #getIsRedesignCategory() <em>Is Redesign Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsRedesignCategory()
   * @generated
   * @ordered
   */
  protected static final String IS_REDESIGN_CATEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsRedesignCategory() <em>Is Redesign Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsRedesignCategory()
   * @generated
   * @ordered
   */
  protected String isRedesignCategory = IS_REDESIGN_CATEGORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndicators()
   * @generated
   * @ordered
   */
  protected EList<Indicator> indicators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndicatorGroupImpl()
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
    return TGRLPackage.Literals.INDICATOR_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INDICATOR_GROUP__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INDICATOR_GROUP__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INDICATOR_GROUP__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsRedesignCategory()
  {
    return isRedesignCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRedesignCategory(String newIsRedesignCategory)
  {
    String oldIsRedesignCategory = isRedesignCategory;
    isRedesignCategory = newIsRedesignCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INDICATOR_GROUP__IS_REDESIGN_CATEGORY, oldIsRedesignCategory, isRedesignCategory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Indicator> getIndicators()
  {
    if (indicators == null)
    {
      indicators = new EObjectResolvingEList<Indicator>(Indicator.class, this, TGRLPackage.INDICATOR_GROUP__INDICATORS);
    }
    return indicators;
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
      case TGRLPackage.INDICATOR_GROUP__NAME:
        return getName();
      case TGRLPackage.INDICATOR_GROUP__LABEL:
        return getLabel();
      case TGRLPackage.INDICATOR_GROUP__DESCRIPTION:
        return getDescription();
      case TGRLPackage.INDICATOR_GROUP__IS_REDESIGN_CATEGORY:
        return getIsRedesignCategory();
      case TGRLPackage.INDICATOR_GROUP__INDICATORS:
        return getIndicators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TGRLPackage.INDICATOR_GROUP__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.INDICATOR_GROUP__LABEL:
        setLabel((String)newValue);
        return;
      case TGRLPackage.INDICATOR_GROUP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TGRLPackage.INDICATOR_GROUP__IS_REDESIGN_CATEGORY:
        setIsRedesignCategory((String)newValue);
        return;
      case TGRLPackage.INDICATOR_GROUP__INDICATORS:
        getIndicators().clear();
        getIndicators().addAll((Collection<? extends Indicator>)newValue);
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
      case TGRLPackage.INDICATOR_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.INDICATOR_GROUP__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TGRLPackage.INDICATOR_GROUP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TGRLPackage.INDICATOR_GROUP__IS_REDESIGN_CATEGORY:
        setIsRedesignCategory(IS_REDESIGN_CATEGORY_EDEFAULT);
        return;
      case TGRLPackage.INDICATOR_GROUP__INDICATORS:
        getIndicators().clear();
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
      case TGRLPackage.INDICATOR_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.INDICATOR_GROUP__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TGRLPackage.INDICATOR_GROUP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TGRLPackage.INDICATOR_GROUP__IS_REDESIGN_CATEGORY:
        return IS_REDESIGN_CATEGORY_EDEFAULT == null ? isRedesignCategory != null : !IS_REDESIGN_CATEGORY_EDEFAULT.equals(isRedesignCategory);
      case TGRLPackage.INDICATOR_GROUP__INDICATORS:
        return indicators != null && !indicators.isEmpty();
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
    result.append(", isRedesignCategory: ");
    result.append(isRedesignCategory);
    result.append(')');
    return result.toString();
  }

} //IndicatorGroupImpl
