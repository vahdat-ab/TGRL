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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionContextGroup;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLspec;
import org.xtext.grl.tgrl.tGRL.ImpactModel;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.KPIConversion;
import org.xtext.grl.tgrl.tGRL.KPIInformationElement;
import org.xtext.grl.tgrl.tGRL.KPIModelLink;
import org.xtext.grl.tgrl.tGRL.StrategiesGroup;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GR Lspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getImpactModel <em>Impact Model</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getIntElements <em>Int Elements</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getContributionGroups <em>Contribution Groups</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getContributionContexts <em>Contribution Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getKpiConv <em>Kpi Conv</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getKpiInformationElements <em>Kpi Information Elements</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getKpiModelLinks <em>Kpi Model Links</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl#getIndicatorGroup <em>Indicator Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GRLspecImpl extends MinimalEObjectImpl.Container implements GRLspec
{
  /**
   * The cached value of the '{@link #getImpactModel() <em>Impact Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpactModel()
   * @generated
   * @ordered
   */
  protected ImpactModel impactModel;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<ElementLink> links;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actors;

  /**
   * The cached value of the '{@link #getIntElements() <em>Int Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntElements()
   * @generated
   * @ordered
   */
  protected EList<IntentionalElement> intElements;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<StrategiesGroup> groups;

  /**
   * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> strategies;

  /**
   * The cached value of the '{@link #getContributionGroups() <em>Contribution Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributionGroups()
   * @generated
   * @ordered
   */
  protected EList<ContributionContextGroup> contributionGroups;

  /**
   * The cached value of the '{@link #getContributionContexts() <em>Contribution Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributionContexts()
   * @generated
   * @ordered
   */
  protected EList<ContributionContext> contributionContexts;

  /**
   * The cached value of the '{@link #getKpiConv() <em>Kpi Conv</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiConv()
   * @generated
   * @ordered
   */
  protected EList<KPIConversion> kpiConv;

  /**
   * The cached value of the '{@link #getKpiInformationElements() <em>Kpi Information Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiInformationElements()
   * @generated
   * @ordered
   */
  protected EList<KPIInformationElement> kpiInformationElements;

  /**
   * The cached value of the '{@link #getKpiModelLinks() <em>Kpi Model Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiModelLinks()
   * @generated
   * @ordered
   */
  protected EList<KPIModelLink> kpiModelLinks;

  /**
   * The cached value of the '{@link #getIndicatorGroup() <em>Indicator Group</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndicatorGroup()
   * @generated
   * @ordered
   */
  protected EList<IndicatorGroup> indicatorGroup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GRLspecImpl()
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
    return TGRLPackage.Literals.GR_LSPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImpactModel getImpactModel()
  {
    return impactModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImpactModel(ImpactModel newImpactModel, NotificationChain msgs)
  {
    ImpactModel oldImpactModel = impactModel;
    impactModel = newImpactModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TGRLPackage.GR_LSPEC__IMPACT_MODEL, oldImpactModel, newImpactModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpactModel(ImpactModel newImpactModel)
  {
    if (newImpactModel != impactModel)
    {
      NotificationChain msgs = null;
      if (impactModel != null)
        msgs = ((InternalEObject)impactModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.GR_LSPEC__IMPACT_MODEL, null, msgs);
      if (newImpactModel != null)
        msgs = ((InternalEObject)newImpactModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.GR_LSPEC__IMPACT_MODEL, null, msgs);
      msgs = basicSetImpactModel(newImpactModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.GR_LSPEC__IMPACT_MODEL, newImpactModel, newImpactModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<ElementLink>(ElementLink.class, this, TGRLPackage.GR_LSPEC__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, TGRLPackage.GR_LSPEC__ACTORS);
    }
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntentionalElement> getIntElements()
  {
    if (intElements == null)
    {
      intElements = new EObjectContainmentEList<IntentionalElement>(IntentionalElement.class, this, TGRLPackage.GR_LSPEC__INT_ELEMENTS);
    }
    return intElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StrategiesGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<StrategiesGroup>(StrategiesGroup.class, this, TGRLPackage.GR_LSPEC__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvaluationStrategy> getStrategies()
  {
    if (strategies == null)
    {
      strategies = new EObjectContainmentEList<EvaluationStrategy>(EvaluationStrategy.class, this, TGRLPackage.GR_LSPEC__STRATEGIES);
    }
    return strategies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionContextGroup> getContributionGroups()
  {
    if (contributionGroups == null)
    {
      contributionGroups = new EObjectContainmentEList<ContributionContextGroup>(ContributionContextGroup.class, this, TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS);
    }
    return contributionGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionContext> getContributionContexts()
  {
    if (contributionContexts == null)
    {
      contributionContexts = new EObjectContainmentEList<ContributionContext>(ContributionContext.class, this, TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS);
    }
    return contributionContexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIConversion> getKpiConv()
  {
    if (kpiConv == null)
    {
      kpiConv = new EObjectContainmentEList<KPIConversion>(KPIConversion.class, this, TGRLPackage.GR_LSPEC__KPI_CONV);
    }
    return kpiConv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIInformationElement> getKpiInformationElements()
  {
    if (kpiInformationElements == null)
    {
      kpiInformationElements = new EObjectContainmentEList<KPIInformationElement>(KPIInformationElement.class, this, TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS);
    }
    return kpiInformationElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIModelLink> getKpiModelLinks()
  {
    if (kpiModelLinks == null)
    {
      kpiModelLinks = new EObjectContainmentEList<KPIModelLink>(KPIModelLink.class, this, TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS);
    }
    return kpiModelLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IndicatorGroup> getIndicatorGroup()
  {
    if (indicatorGroup == null)
    {
      indicatorGroup = new EObjectContainmentEList<IndicatorGroup>(IndicatorGroup.class, this, TGRLPackage.GR_LSPEC__INDICATOR_GROUP);
    }
    return indicatorGroup;
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
      case TGRLPackage.GR_LSPEC__IMPACT_MODEL:
        return basicSetImpactModel(null, msgs);
      case TGRLPackage.GR_LSPEC__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__INT_ELEMENTS:
        return ((InternalEList<?>)getIntElements()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__STRATEGIES:
        return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS:
        return ((InternalEList<?>)getContributionGroups()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS:
        return ((InternalEList<?>)getContributionContexts()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__KPI_CONV:
        return ((InternalEList<?>)getKpiConv()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS:
        return ((InternalEList<?>)getKpiInformationElements()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS:
        return ((InternalEList<?>)getKpiModelLinks()).basicRemove(otherEnd, msgs);
      case TGRLPackage.GR_LSPEC__INDICATOR_GROUP:
        return ((InternalEList<?>)getIndicatorGroup()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.GR_LSPEC__IMPACT_MODEL:
        return getImpactModel();
      case TGRLPackage.GR_LSPEC__LINKS:
        return getLinks();
      case TGRLPackage.GR_LSPEC__ACTORS:
        return getActors();
      case TGRLPackage.GR_LSPEC__INT_ELEMENTS:
        return getIntElements();
      case TGRLPackage.GR_LSPEC__GROUPS:
        return getGroups();
      case TGRLPackage.GR_LSPEC__STRATEGIES:
        return getStrategies();
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS:
        return getContributionGroups();
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS:
        return getContributionContexts();
      case TGRLPackage.GR_LSPEC__KPI_CONV:
        return getKpiConv();
      case TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS:
        return getKpiInformationElements();
      case TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS:
        return getKpiModelLinks();
      case TGRLPackage.GR_LSPEC__INDICATOR_GROUP:
        return getIndicatorGroup();
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
      case TGRLPackage.GR_LSPEC__IMPACT_MODEL:
        setImpactModel((ImpactModel)newValue);
        return;
      case TGRLPackage.GR_LSPEC__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends ElementLink>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__INT_ELEMENTS:
        getIntElements().clear();
        getIntElements().addAll((Collection<? extends IntentionalElement>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends StrategiesGroup>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__STRATEGIES:
        getStrategies().clear();
        getStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS:
        getContributionGroups().clear();
        getContributionGroups().addAll((Collection<? extends ContributionContextGroup>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS:
        getContributionContexts().clear();
        getContributionContexts().addAll((Collection<? extends ContributionContext>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__KPI_CONV:
        getKpiConv().clear();
        getKpiConv().addAll((Collection<? extends KPIConversion>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS:
        getKpiInformationElements().clear();
        getKpiInformationElements().addAll((Collection<? extends KPIInformationElement>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS:
        getKpiModelLinks().clear();
        getKpiModelLinks().addAll((Collection<? extends KPIModelLink>)newValue);
        return;
      case TGRLPackage.GR_LSPEC__INDICATOR_GROUP:
        getIndicatorGroup().clear();
        getIndicatorGroup().addAll((Collection<? extends IndicatorGroup>)newValue);
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
      case TGRLPackage.GR_LSPEC__IMPACT_MODEL:
        setImpactModel((ImpactModel)null);
        return;
      case TGRLPackage.GR_LSPEC__LINKS:
        getLinks().clear();
        return;
      case TGRLPackage.GR_LSPEC__ACTORS:
        getActors().clear();
        return;
      case TGRLPackage.GR_LSPEC__INT_ELEMENTS:
        getIntElements().clear();
        return;
      case TGRLPackage.GR_LSPEC__GROUPS:
        getGroups().clear();
        return;
      case TGRLPackage.GR_LSPEC__STRATEGIES:
        getStrategies().clear();
        return;
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS:
        getContributionGroups().clear();
        return;
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS:
        getContributionContexts().clear();
        return;
      case TGRLPackage.GR_LSPEC__KPI_CONV:
        getKpiConv().clear();
        return;
      case TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS:
        getKpiInformationElements().clear();
        return;
      case TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS:
        getKpiModelLinks().clear();
        return;
      case TGRLPackage.GR_LSPEC__INDICATOR_GROUP:
        getIndicatorGroup().clear();
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
      case TGRLPackage.GR_LSPEC__IMPACT_MODEL:
        return impactModel != null;
      case TGRLPackage.GR_LSPEC__LINKS:
        return links != null && !links.isEmpty();
      case TGRLPackage.GR_LSPEC__ACTORS:
        return actors != null && !actors.isEmpty();
      case TGRLPackage.GR_LSPEC__INT_ELEMENTS:
        return intElements != null && !intElements.isEmpty();
      case TGRLPackage.GR_LSPEC__GROUPS:
        return groups != null && !groups.isEmpty();
      case TGRLPackage.GR_LSPEC__STRATEGIES:
        return strategies != null && !strategies.isEmpty();
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_GROUPS:
        return contributionGroups != null && !contributionGroups.isEmpty();
      case TGRLPackage.GR_LSPEC__CONTRIBUTION_CONTEXTS:
        return contributionContexts != null && !contributionContexts.isEmpty();
      case TGRLPackage.GR_LSPEC__KPI_CONV:
        return kpiConv != null && !kpiConv.isEmpty();
      case TGRLPackage.GR_LSPEC__KPI_INFORMATION_ELEMENTS:
        return kpiInformationElements != null && !kpiInformationElements.isEmpty();
      case TGRLPackage.GR_LSPEC__KPI_MODEL_LINKS:
        return kpiModelLinks != null && !kpiModelLinks.isEmpty();
      case TGRLPackage.GR_LSPEC__INDICATOR_GROUP:
        return indicatorGroup != null && !indicatorGroup.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GRLspecImpl
