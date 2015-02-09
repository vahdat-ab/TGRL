/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.grl.tgrl.tGRL.KPIEvalValueSet;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.QualitativeMappings;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl#getMappin <em>Mappin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeMappingsImpl extends KPIConversionImpl implements QualitativeMappings
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
   * The cached value of the '{@link #getKpiEvalValueSet() <em>Kpi Eval Value Set</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiEvalValueSet()
   * @generated
   * @ordered
   */
  protected EList<KPIEvalValueSet> kpiEvalValueSet;

  /**
   * The cached value of the '{@link #getMappin() <em>Mappin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappin()
   * @generated
   * @ordered
   */
  protected EList<QualitativeMapping> mappin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualitativeMappingsImpl()
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
    return TGRLPackage.Literals.QUALITATIVE_MAPPINGS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPINGS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIEvalValueSet> getKpiEvalValueSet()
  {
    if (kpiEvalValueSet == null)
    {
      kpiEvalValueSet = new EObjectResolvingEList<KPIEvalValueSet>(KPIEvalValueSet.class, this, TGRLPackage.QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET);
    }
    return kpiEvalValueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualitativeMapping> getMappin()
  {
    if (mappin == null)
    {
      mappin = new EObjectContainmentEList<QualitativeMapping>(QualitativeMapping.class, this, TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN);
    }
    return mappin;
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
      case TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN:
        return ((InternalEList<?>)getMappin()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.QUALITATIVE_MAPPINGS__NAME:
        return getName();
      case TGRLPackage.QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET:
        return getKpiEvalValueSet();
      case TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN:
        return getMappin();
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
      case TGRLPackage.QUALITATIVE_MAPPINGS__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET:
        getKpiEvalValueSet().clear();
        getKpiEvalValueSet().addAll((Collection<? extends KPIEvalValueSet>)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN:
        getMappin().clear();
        getMappin().addAll((Collection<? extends QualitativeMapping>)newValue);
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
      case TGRLPackage.QUALITATIVE_MAPPINGS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET:
        getKpiEvalValueSet().clear();
        return;
      case TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN:
        getMappin().clear();
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
      case TGRLPackage.QUALITATIVE_MAPPINGS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET:
        return kpiEvalValueSet != null && !kpiEvalValueSet.isEmpty();
      case TGRLPackage.QUALITATIVE_MAPPINGS__MAPPIN:
        return mappin != null && !mappin.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //QualitativeMappingsImpl
