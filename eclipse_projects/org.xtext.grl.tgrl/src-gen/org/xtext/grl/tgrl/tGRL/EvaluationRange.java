/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getVahdat <em>Vahdat</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getEnd <em>End</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange()
 * @model
 * @generated
 */
public interface EvaluationRange extends EObject
{
  /**
   * Returns the value of the '<em><b>Vahdat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vahdat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vahdat</em>' attribute.
   * @see #setVahdat(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_Vahdat()
   * @model
   * @generated
   */
  String getVahdat();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getVahdat <em>Vahdat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vahdat</em>' attribute.
   * @see #getVahdat()
   * @generated
   */
  void setVahdat(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' attribute.
   * @see #setStep(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_Step()
   * @model
   * @generated
   */
  String getStep();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStep <em>Step</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' attribute.
   * @see #getStep()
   * @generated
   */
  void setStep(String value);

} // EvaluationRange
