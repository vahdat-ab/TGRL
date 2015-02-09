/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Goal#getEvals <em>Evals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends IntentionalElement
{
  /**
   * Returns the value of the '<em><b>Evals</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Evaluation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evals</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evals</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGoal_Evals()
   * @model
   * @generated
   */
  EList<Evaluation> getEvals();

} // Goal