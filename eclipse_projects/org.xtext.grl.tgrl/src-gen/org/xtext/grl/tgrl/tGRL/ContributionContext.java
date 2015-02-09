/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getIncludedContexts <em>Included Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext()
 * @model
 * @generated
 */
public interface ContributionContext extends GRLModelElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Included Contexts</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Contexts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Contexts</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext_IncludedContexts()
   * @model
   * @generated
   */
  EList<ContributionContext> getIncludedContexts();

  /**
   * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionChange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changes</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext_Changes()
   * @model containment="true"
   * @generated
   */
  EList<ContributionChange> getChanges();

} // ContributionContext
