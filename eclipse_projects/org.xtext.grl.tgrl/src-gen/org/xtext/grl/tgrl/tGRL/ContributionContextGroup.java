/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Context Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getContribs <em>Contribs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContextGroup()
 * @model
 * @generated
 */
public interface ContributionContextGroup extends GRLModelElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContextGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contribs</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribs</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContextGroup_Contribs()
   * @model
   * @generated
   */
  EList<ContributionContext> getContribs();

} // ContributionContextGroup
