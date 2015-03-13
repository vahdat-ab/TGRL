/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.Mapping;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Qualitative Eval Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQualitativeEvalValueSetImpl#getQualitativeEvaluationValue <em>Qualitative Evaluation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPIQualitativeEvalValueSetImpl extends KPIEvalValueSetImpl implements KPIQualitativeEvalValueSet
{
  /**
   * The cached value of the '{@link #getQualitativeEvaluationValue() <em>Qualitative Evaluation Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualitativeEvaluationValue()
   * @generated
   * @ordered
   */
  protected Mapping qualitativeEvaluationValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KPIQualitativeEvalValueSetImpl()
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
    return TGRLPackage.Literals.KPI_QUALITATIVE_EVAL_VALUE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getQualitativeEvaluationValue()
  {
    if (qualitativeEvaluationValue != null && qualitativeEvaluationValue.eIsProxy())
    {
      InternalEObject oldQualitativeEvaluationValue = (InternalEObject)qualitativeEvaluationValue;
      qualitativeEvaluationValue = (Mapping)eResolveProxy(oldQualitativeEvaluationValue);
      if (qualitativeEvaluationValue != oldQualitativeEvaluationValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE, oldQualitativeEvaluationValue, qualitativeEvaluationValue));
      }
    }
    return qualitativeEvaluationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping basicGetQualitativeEvaluationValue()
  {
    return qualitativeEvaluationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualitativeEvaluationValue(Mapping newQualitativeEvaluationValue)
  {
    Mapping oldQualitativeEvaluationValue = qualitativeEvaluationValue;
    qualitativeEvaluationValue = newQualitativeEvaluationValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE, oldQualitativeEvaluationValue, qualitativeEvaluationValue));
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
      case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE:
        if (resolve) return getQualitativeEvaluationValue();
        return basicGetQualitativeEvaluationValue();
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
      case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE:
        setQualitativeEvaluationValue((Mapping)newValue);
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
      case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE:
        setQualitativeEvaluationValue((Mapping)null);
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
      case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE:
        return qualitativeEvaluationValue != null;
    }
    return super.eIsSet(featureID);
  }

} //KPIQualitativeEvalValueSetImpl
