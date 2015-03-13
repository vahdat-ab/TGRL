/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Quantitative Eval Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getWorstValue <em>Worst Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getEvaluationValue <em>Evaluation Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet()
 * @model
 * @generated
 */
public interface KPIQuantitativeEvalValueSet extends KPIEvalValueSet
{
  /**
   * Returns the value of the '<em><b>Target Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Value</em>' attribute.
   * @see #setTargetValue(double)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet_TargetValue()
   * @model
   * @generated
   */
  double getTargetValue();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getTargetValue <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Value</em>' attribute.
   * @see #getTargetValue()
   * @generated
   */
  void setTargetValue(double value);

  /**
   * Returns the value of the '<em><b>Threshold Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold Value</em>' attribute.
   * @see #setThresholdValue(double)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet_ThresholdValue()
   * @model
   * @generated
   */
  double getThresholdValue();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getThresholdValue <em>Threshold Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold Value</em>' attribute.
   * @see #getThresholdValue()
   * @generated
   */
  void setThresholdValue(double value);

  /**
   * Returns the value of the '<em><b>Worst Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worst Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Worst Value</em>' attribute.
   * @see #setWorstValue(double)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet_WorstValue()
   * @model
   * @generated
   */
  double getWorstValue();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getWorstValue <em>Worst Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Worst Value</em>' attribute.
   * @see #getWorstValue()
   * @generated
   */
  void setWorstValue(double value);

  /**
   * Returns the value of the '<em><b>Evaluation Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation Value</em>' attribute.
   * @see #setEvaluationValue(double)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet_EvaluationValue()
   * @model
   * @generated
   */
  double getEvaluationValue();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getEvaluationValue <em>Evaluation Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation Value</em>' attribute.
   * @see #getEvaluationValue()
   * @generated
   */
  void setEvaluationValue(double value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIQuantitativeEvalValueSet_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

} // KPIQuantitativeEvalValueSet
