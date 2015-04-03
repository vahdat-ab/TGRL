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
import org.xtext.grl.tgrl.tGRL.Metadata;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getSuperStrategies <em>Super Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationStrategyImpl extends GRLElementImpl implements EvaluationStrategy
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
   * The cached value of the '{@link #getSuperStrategies() <em>Super Strategies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> superStrategies;

  /**
   * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaData()
   * @generated
   * @ordered
   */
  protected EList<Metadata> metaData;

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
  public EList<EvaluationStrategy> getSuperStrategies()
  {
    if (superStrategies == null)
    {
      superStrategies = new EObjectResolvingEList<EvaluationStrategy>(EvaluationStrategy.class, this, TGRLPackage.EVALUATION_STRATEGY__SUPER_STRATEGIES);
    }
    return superStrategies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Metadata> getMetaData()
  {
    if (metaData == null)
    {
      metaData = new EObjectContainmentEList<Metadata>(Metadata.class, this, TGRLPackage.EVALUATION_STRATEGY__META_DATA);
    }
    return metaData;
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TGRLPackage.EVALUATION_STRATEGY__META_DATA:
        return ((InternalEList<?>)getMetaData()).basicRemove(otherEnd, msgs);
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.EVALUATION_STRATEGY__SUPER_STRATEGIES:
        return getSuperStrategies();
      case TGRLPackage.EVALUATION_STRATEGY__META_DATA:
        return getMetaData();
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return getEvaluations();
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
      case TGRLPackage.EVALUATION_STRATEGY__SUPER_STRATEGIES:
        getSuperStrategies().clear();
        getSuperStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__META_DATA:
        getMetaData().clear();
        getMetaData().addAll((Collection<? extends Metadata>)newValue);
        return;
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends Evaluation>)newValue);
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
      case TGRLPackage.EVALUATION_STRATEGY__SUPER_STRATEGIES:
        getSuperStrategies().clear();
        return;
      case TGRLPackage.EVALUATION_STRATEGY__META_DATA:
        getMetaData().clear();
        return;
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
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
      case TGRLPackage.EVALUATION_STRATEGY__SUPER_STRATEGIES:
        return superStrategies != null && !superStrategies.isEmpty();
      case TGRLPackage.EVALUATION_STRATEGY__META_DATA:
        return metaData != null && !metaData.isEmpty();
      case TGRLPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
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
