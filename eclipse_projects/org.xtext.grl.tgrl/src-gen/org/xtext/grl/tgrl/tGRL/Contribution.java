/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Contribution#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends ElementLink
{
  /**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionEnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution_Dest()
   * @model containment="true"
   * @generated
   */
  EList<ContributionEnd> getDest();

} // Contribution
