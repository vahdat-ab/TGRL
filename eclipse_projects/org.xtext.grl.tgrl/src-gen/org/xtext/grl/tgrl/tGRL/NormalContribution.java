/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.NormalContribution#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.NormalContribution#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getNormalContribution()
 * @model
 * @generated
 */
public interface NormalContribution extends NormalElementLink
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' reference.
   * @see #setSrc(SuperIntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getNormalContribution_Src()
   * @model
   * @generated
   */
  SuperIntentionalElement getSrc();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.NormalContribution#getSrc <em>Src</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(SuperIntentionalElement value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getNormalContribution_Dest()
   * @model containment="true"
   * @generated
   */
  EList<ContributionEnd> getDest();

} // NormalContribution
