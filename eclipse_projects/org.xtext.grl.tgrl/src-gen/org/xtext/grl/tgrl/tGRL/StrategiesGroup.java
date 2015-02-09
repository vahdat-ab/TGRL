/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategies Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.StrategiesGroup#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getStrategiesGroup()
 * @model
 * @generated
 */
public interface StrategiesGroup extends GRLModelElement
{
  /**
   * Returns the value of the '<em><b>Strategies</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategies</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getStrategiesGroup_Strategies()
   * @model
   * @generated
   */
  EList<EvaluationStrategy> getStrategies();

} // StrategiesGroup
