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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getSuperStrategies <em>Super Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy()
 * @model
 * @generated
 */
public interface EvaluationStrategy extends GRLElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Strategies</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Strategies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Strategies</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy_SuperStrategies()
   * @model
   * @generated
   */
  EList<EvaluationStrategy> getSuperStrategies();

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

} // EvaluationStrategy
