/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElementRef;
import org.xtext.grl.tgrl.tGRL.KPIModelLink;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl#getKpiModelLinksDest <em>Kpi Model Links Dest</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicatorImpl extends IntentionalElementImpl implements Indicator
{
  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<IntentionalElementRef> refs;

  /**
   * The cached value of the '{@link #getKpiModelLinksDest() <em>Kpi Model Links Dest</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiModelLinksDest()
   * @generated
   * @ordered
   */
  protected EList<KPIModelLink> kpiModelLinksDest;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<IndicatorGroup> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndicatorImpl()
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
    return TGRLPackage.Literals.INDICATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntentionalElementRef> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<IntentionalElementRef>(IntentionalElementRef.class, this, TGRLPackage.INDICATOR__REFS);
    }
    return refs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIModelLink> getKpiModelLinksDest()
  {
    if (kpiModelLinksDest == null)
    {
      kpiModelLinksDest = new EObjectResolvingEList<KPIModelLink>(KPIModelLink.class, this, TGRLPackage.INDICATOR__KPI_MODEL_LINKS_DEST);
    }
    return kpiModelLinksDest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IndicatorGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectResolvingEList<IndicatorGroup>(IndicatorGroup.class, this, TGRLPackage.INDICATOR__GROUPS);
    }
    return groups;
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
      case TGRLPackage.INDICATOR__REFS:
        return getRefs();
      case TGRLPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
        return getKpiModelLinksDest();
      case TGRLPackage.INDICATOR__GROUPS:
        return getGroups();
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
      case TGRLPackage.INDICATOR__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends IntentionalElementRef>)newValue);
        return;
      case TGRLPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
        getKpiModelLinksDest().clear();
        getKpiModelLinksDest().addAll((Collection<? extends KPIModelLink>)newValue);
        return;
      case TGRLPackage.INDICATOR__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends IndicatorGroup>)newValue);
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
      case TGRLPackage.INDICATOR__REFS:
        getRefs().clear();
        return;
      case TGRLPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
        getKpiModelLinksDest().clear();
        return;
      case TGRLPackage.INDICATOR__GROUPS:
        getGroups().clear();
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
      case TGRLPackage.INDICATOR__REFS:
        return refs != null && !refs.isEmpty();
      case TGRLPackage.INDICATOR__KPI_MODEL_LINKS_DEST:
        return kpiModelLinksDest != null && !kpiModelLinksDest.isEmpty();
      case TGRLPackage.INDICATOR__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IndicatorImpl
