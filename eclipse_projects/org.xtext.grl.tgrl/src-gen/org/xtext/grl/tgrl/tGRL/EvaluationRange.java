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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStart <em>Start</em>}</li>
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
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_End()
   * @model
   * @generated
   */
  int getEnd();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(int value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' attribute.
   * @see #setStep(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationRange_Step()
   * @model
   * @generated
   */
  int getStep();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStep <em>Step</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' attribute.
   * @see #getStep()
   * @generated
   */
  void setStep(int value);

} // EvaluationRange
