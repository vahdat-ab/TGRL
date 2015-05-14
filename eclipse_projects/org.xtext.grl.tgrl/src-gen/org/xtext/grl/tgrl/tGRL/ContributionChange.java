/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewContribution <em>New Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewQuantitativeContribution <em>New Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribRange <em>Contrib Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionChange()
 * @model
 * @generated
 */
public interface ContributionChange extends EObject
{
  /**
   * Returns the value of the '<em><b>Contribution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution</em>' reference.
   * @see #setContribution(ContributionEnd)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionChange_Contribution()
   * @model
   * @generated
   */
  ContributionEnd getContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribution <em>Contribution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution</em>' reference.
   * @see #getContribution()
   * @generated
   */
  void setContribution(ContributionEnd value);

  /**
   * Returns the value of the '<em><b>New Contribution</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.ContributionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Contribution</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see #setNewContribution(ContributionType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionChange_NewContribution()
   * @model
   * @generated
   */
  ContributionType getNewContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewContribution <em>New Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Contribution</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see #getNewContribution()
   * @generated
   */
  void setNewContribution(ContributionType value);

  /**
   * Returns the value of the '<em><b>New Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Quantitative Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Quantitative Contribution</em>' attribute.
   * @see #setNewQuantitativeContribution(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionChange_NewQuantitativeContribution()
   * @model
   * @generated
   */
  String getNewQuantitativeContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewQuantitativeContribution <em>New Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Quantitative Contribution</em>' attribute.
   * @see #getNewQuantitativeContribution()
   * @generated
   */
  void setNewQuantitativeContribution(String value);

  /**
   * Returns the value of the '<em><b>Contrib Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contrib Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrib Range</em>' containment reference.
   * @see #setContribRange(ContributionRange)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionChange_ContribRange()
   * @model containment="true"
   * @generated
   */
  ContributionRange getContribRange();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribRange <em>Contrib Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contrib Range</em>' containment reference.
   * @see #getContribRange()
   * @generated
   */
  void setContribRange(ContributionRange value);

} // ContributionChange
