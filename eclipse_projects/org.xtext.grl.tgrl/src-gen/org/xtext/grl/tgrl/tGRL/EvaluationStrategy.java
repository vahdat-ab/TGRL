/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getIncludedStrategies <em>Included Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getKipInforConfig <em>Kip Infor Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy()
 * @model
 * @generated
 */
public interface EvaluationStrategy extends EObject
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

  /**
   * Returns the value of the '<em><b>Kip Infor Config</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kip Infor Config</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kip Infor Config</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluationStrategy_KipInforConfig()
   * @model containment="true"
   * @generated
   */
  EList<KPIInformationConfig> getKipInforConfig();

} // EvaluationStrategy
