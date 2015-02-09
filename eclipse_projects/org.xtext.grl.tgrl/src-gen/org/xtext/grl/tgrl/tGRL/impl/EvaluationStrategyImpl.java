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

import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.KPIInformationConfig;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getIncludedStrategies <em>Included Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getKipInforConfig <em>Kip Infor Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationStrategyImpl extends GRLModelElementImpl implements EvaluationStrategy
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
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<Evaluation> evaluations;

  /**
   * The cached value of the '{@link #getIncludedStrategies() <em>Included Strategies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> includedStrategies;

  /**
   * The cached value of the '{@link #getKipInforConfig() <em>Kip Infor Config</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKipInforConfig()
   * @generated
   * @ordered
   */
  protected EList<KPIInformationConfig> kipInforConfig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationStrategyImpl()
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
    return TGRLPackage.Literals.EVALUATION_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION_STRATEGY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS);
    }
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvaluationStrategy> getIncludedStrategies()
  {
    if (includedStrategies == null)
    {
      includedStrategies = new EObjectResolvingEList<EvaluationStrategy>(EvaluationStrategy.class, this, TGRLPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES);
    }
    return includedStrategies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIInformationConfig> getKipInforConfig()
  {
    if (kipInforConfig == null)
    {
      kipInforConfig = new EObjectContainmentEList<KPIInformationConfig>(KPIInformationConfig.class, this, TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG);
    }
    return kipInforConfig;
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
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
      case TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG:
        return ((InternalEList<?>)getKipInforConfig()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.EVALUATION_STRATEGY__NAME:
        return getName();
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return getEvaluations();
      case TGRLPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        return getIncludedStrategies();
      case TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG:
        return getKipInforConfig();
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
      case TGRLPackage.EVALUATION_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends Evaluation>)newValue);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        getIncludedStrategies().clear();
        getIncludedStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG:
        getKipInforConfig().clear();
        getKipInforConfig().addAll((Collection<? extends KPIInformationConfig>)newValue);
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
      case TGRLPackage.EVALUATION_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
        return;
      case TGRLPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        getIncludedStrategies().clear();
        return;
      case TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG:
        getKipInforConfig().clear();
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
      case TGRLPackage.EVALUATION_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
      case TGRLPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        return includedStrategies != null && !includedStrategies.isEmpty();
      case TGRLPackage.EVALUATION_STRATEGY__KIP_INFOR_CONFIG:
        return kipInforConfig != null && !kipInforConfig.isEmpty();
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

} //EvaluationStrategyImpl
