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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getSuperContributionContexts <em>Super Contribution Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext()
 * @model
 * @generated
 */
public interface ContributionContext extends GRLElement
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
   * Returns the value of the '<em><b>Super Contribution Contexts</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Contribution Contexts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Contribution Contexts</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext_SuperContributionContexts()
   * @model
   * @generated
   */
  EList<ContributionContext> getSuperContributionContexts();

  /**
   * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Metadata}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Data</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionContext_MetaData()
   * @model containment="true"
   * @generated
   */
  EList<Metadata> getMetaData();

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
