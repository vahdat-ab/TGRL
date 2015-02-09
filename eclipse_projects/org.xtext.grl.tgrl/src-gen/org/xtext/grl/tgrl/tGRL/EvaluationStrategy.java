/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getIncludedStrategies <em>Included Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy()
 * @model
 * @generated
 */
public interface EvaluationStrategy extends GRLModelElement
{
  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Evaluation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy_Evaluations()
   * @model containment="true"
   * @generated
   */
  EList<Evaluation> getEvaluations();

  /**
   * Returns the value of the '<em><b>Included Strategies</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Strategies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Strategies</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy_IncludedStrategies()
   * @model
   * @generated
   */
  EList<EvaluationStrategy> getIncludedStrategies();

} // EvaluationStrategy
