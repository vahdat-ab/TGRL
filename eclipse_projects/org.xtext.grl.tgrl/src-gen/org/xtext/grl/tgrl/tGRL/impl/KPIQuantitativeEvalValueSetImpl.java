/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Quantitative Eval Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl#getWorstValue <em>Worst Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl#getEvaluationValue <em>Evaluation Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPIQuantitativeEvalValueSetImpl extends KPIEvalValueSetImpl implements KPIQuantitativeEvalValueSet
{
  /**
   * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected static final double TARGET_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected double targetValue = TARGET_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThresholdValue()
   * @generated
   * @ordered
   */
  protected static final double THRESHOLD_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThresholdValue()
   * @generated
   * @ordered
   */
  protected double thresholdValue = THRESHOLD_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getWorstValue() <em>Worst Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorstValue()
   * @generated
   * @ordered
   */
  protected static final double WORST_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWorstValue() <em>Worst Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorstValue()
   * @generated
   * @ordered
   */
  protected double worstValue = WORST_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getEvaluationValue() <em>Evaluation Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluationValue()
   * @generated
   * @ordered
   */
  protected static final double EVALUATION_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getEvaluationValue() <em>Evaluation Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluationValue()
   * @generated
   * @ordered
   */
  protected double evaluationValue = EVALUATION_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final String UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected String unit = UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KPIQuantitativeEvalValueSetImpl()
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
    return TGRLPackage.Literals.KPI_QUANTITATIVE_EVAL_VALUE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getTargetValue()
  {
    return targetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetValue(double newTargetValue)
  {
    double oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE, oldTargetValue, targetValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getThresholdValue()
  {
    return thresholdValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThresholdValue(double newThresholdValue)
  {
    double oldThresholdValue = thresholdValue;
    thresholdValue = newThresholdValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE, oldThresholdValue, thresholdValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWorstValue()
  {
    return worstValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorstValue(double newWorstValue)
  {
    double oldWorstValue = worstValue;
    worstValue = newWorstValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE, oldWorstValue, worstValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getEvaluationValue()
  {
    return evaluationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluationValue(double newEvaluationValue)
  {
    double oldEvaluationValue = evaluationValue;
    evaluationValue = newEvaluationValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE, oldEvaluationValue, evaluationValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(String newUnit)
  {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT, oldUnit, unit));
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
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE:
        return getTargetValue();
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE:
        return getThresholdValue();
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE:
        return getWorstValue();
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE:
        return getEvaluationValue();
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT:
        return getUnit();
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
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE:
        setTargetValue((Double)newValue);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE:
        setThresholdValue((Double)newValue);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE:
        setWorstValue((Double)newValue);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE:
        setEvaluationValue((Double)newValue);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT:
        setUnit((String)newValue);
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
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE:
        setTargetValue(TARGET_VALUE_EDEFAULT);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE:
        setThresholdValue(THRESHOLD_VALUE_EDEFAULT);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE:
        setWorstValue(WORST_VALUE_EDEFAULT);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE:
        setEvaluationValue(EVALUATION_VALUE_EDEFAULT);
        return;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT:
        setUnit(UNIT_EDEFAULT);
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
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE:
        return targetValue != TARGET_VALUE_EDEFAULT;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE:
        return thresholdValue != THRESHOLD_VALUE_EDEFAULT;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE:
        return worstValue != WORST_VALUE_EDEFAULT;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE:
        return evaluationValue != EVALUATION_VALUE_EDEFAULT;
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
    result.append(" (targetValue: ");
    result.append(targetValue);
    result.append(", thresholdValue: ");
    result.append(thresholdValue);
    result.append(", worstValue: ");
    result.append(worstValue);
    result.append(", evaluationValue: ");
    result.append(evaluationValue);
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //KPIQuantitativeEvalValueSetImpl
