/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI New Eval Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getEvaluationValue <em>Evaluation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPINewEvalValue()
 * @model
 * @generated
 */
public interface KPINewEvalValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPINewEvalValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPINewEvalValue_EvaluationValue()
   * @model
   * @generated
   */
  double getEvaluationValue();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getEvaluationValue <em>Evaluation Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation Value</em>' attribute.
   * @see #getEvaluationValue()
   * @generated
   */
  void setEvaluationValue(double value);

} // KPINewEvalValue
