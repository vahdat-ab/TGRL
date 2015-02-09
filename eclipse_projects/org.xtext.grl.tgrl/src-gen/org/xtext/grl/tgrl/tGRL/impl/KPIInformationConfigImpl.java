/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.KPIInformationConfig;
import org.xtext.grl.tgrl.tGRL.KPIInformationElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Information Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl#getLevelOfDimension <em>Level Of Dimension</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl#getValueOfDimension <em>Value Of Dimension</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl#getKpiInfoElement <em>Kpi Info Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPIInformationConfigImpl extends MinimalEObjectImpl.Container implements KPIInformationConfig
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
   * The default value of the '{@link #getLevelOfDimension() <em>Level Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfDimension()
   * @generated
   * @ordered
   */
  protected static final String LEVEL_OF_DIMENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLevelOfDimension() <em>Level Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelOfDimension()
   * @generated
   * @ordered
   */
  protected String levelOfDimension = LEVEL_OF_DIMENSION_EDEFAULT;

  /**
   * The default value of the '{@link #getValueOfDimension() <em>Value Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueOfDimension()
   * @generated
   * @ordered
   */
  protected static final String VALUE_OF_DIMENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueOfDimension() <em>Value Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueOfDimension()
   * @generated
   * @ordered
   */
  protected String valueOfDimension = VALUE_OF_DIMENSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getKpiInfoElement() <em>Kpi Info Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiInfoElement()
   * @generated
   * @ordered
   */
  protected KPIInformationElement kpiInfoElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KPIInformationConfigImpl()
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
    return TGRLPackage.Literals.KPI_INFORMATION_CONFIG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_CONFIG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLevelOfDimension()
  {
    return levelOfDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevelOfDimension(String newLevelOfDimension)
  {
    String oldLevelOfDimension = levelOfDimension;
    levelOfDimension = newLevelOfDimension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION, oldLevelOfDimension, levelOfDimension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueOfDimension()
  {
    return valueOfDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueOfDimension(String newValueOfDimension)
  {
    String oldValueOfDimension = valueOfDimension;
    valueOfDimension = newValueOfDimension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION, oldValueOfDimension, valueOfDimension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIInformationElement getKpiInfoElement()
  {
    if (kpiInfoElement != null && kpiInfoElement.eIsProxy())
    {
      InternalEObject oldKpiInfoElement = (InternalEObject)kpiInfoElement;
      kpiInfoElement = (KPIInformationElement)eResolveProxy(oldKpiInfoElement);
      if (kpiInfoElement != oldKpiInfoElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT, oldKpiInfoElement, kpiInfoElement));
      }
    }
    return kpiInfoElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIInformationElement basicGetKpiInfoElement()
  {
    return kpiInfoElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKpiInfoElement(KPIInformationElement newKpiInfoElement)
  {
    KPIInformationElement oldKpiInfoElement = kpiInfoElement;
    kpiInfoElement = newKpiInfoElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT, oldKpiInfoElement, kpiInfoElement));
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
      case TGRLPackage.KPI_INFORMATION_CONFIG__NAME:
        return getName();
      case TGRLPackage.KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION:
        return getLevelOfDimension();
      case TGRLPackage.KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION:
        return getValueOfDimension();
      case TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT:
        if (resolve) return getKpiInfoElement();
        return basicGetKpiInfoElement();
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
      case TGRLPackage.KPI_INFORMATION_CONFIG__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION:
        setLevelOfDimension((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION:
        setValueOfDimension((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT:
        setKpiInfoElement((KPIInformationElement)newValue);
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
      case TGRLPackage.KPI_INFORMATION_CONFIG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION:
        setLevelOfDimension(LEVEL_OF_DIMENSION_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION:
        setValueOfDimension(VALUE_OF_DIMENSION_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT:
        setKpiInfoElement((KPIInformationElement)null);
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
      case TGRLPackage.KPI_INFORMATION_CONFIG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION:
        return LEVEL_OF_DIMENSION_EDEFAULT == null ? levelOfDimension != null : !LEVEL_OF_DIMENSION_EDEFAULT.equals(levelOfDimension);
      case TGRLPackage.KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION:
        return VALUE_OF_DIMENSION_EDEFAULT == null ? valueOfDimension != null : !VALUE_OF_DIMENSION_EDEFAULT.equals(valueOfDimension);
      case TGRLPackage.KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT:
        return kpiInfoElement != null;
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
    result.append(", levelOfDimension: ");
    result.append(levelOfDimension);
    result.append(", valueOfDimension: ");
    result.append(valueOfDimension);
    result.append(')');
    return result.toString();
  }

} //KPIInformationConfigImpl
