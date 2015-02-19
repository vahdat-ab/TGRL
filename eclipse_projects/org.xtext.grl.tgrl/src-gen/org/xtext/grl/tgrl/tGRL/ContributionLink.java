/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink()
 * @model
 * @generated
 */
public interface ContributionLink extends ElementLink
{
  /**
   * Returns the value of the '<em><b>Contribution</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.ContributionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see #setContribution(ContributionType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink_Contribution()
   * @model
   * @generated
   */
  ContributionType getContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getContribution <em>Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see #getContribution()
   * @generated
   */
  void setContribution(ContributionType value);

  /**
   * Returns the value of the '<em><b>Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantitative Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantitative Contribution</em>' attribute.
   * @see #setQuantitativeContribution(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink_QuantitativeContribution()
   * @model
   * @generated
   */
  int getQuantitativeContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getQuantitativeContribution <em>Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantitative Contribution</em>' attribute.
   * @see #getQuantitativeContribution()
   * @generated
   */
  void setQuantitativeContribution(int value);

  /**
   * Returns the value of the '<em><b>Correlation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Correlation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Correlation</em>' attribute.
   * @see #setCorrelation(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink_Correlation()
   * @model
   * @generated
   */
  String getCorrelation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getCorrelation <em>Correlation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Correlation</em>' attribute.
   * @see #getCorrelation()
   * @generated
   */
  void setCorrelation(String value);

  /**
   * Returns the value of the '<em><b>Changes</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionChange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Changes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changes</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink_Changes()
   * @model
   * @generated
   */
  EList<ContributionChange> getChanges();

  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionEnds}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionLink_Connections()
   * @model containment="true"
   * @generated
   */
  EList<ContributionEnds> getConnections();

} // ContributionLink
