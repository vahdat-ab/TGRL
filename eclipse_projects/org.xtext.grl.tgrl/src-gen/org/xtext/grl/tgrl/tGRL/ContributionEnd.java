/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionEnd()
 * @model
 * @generated
 */
public interface ContributionEnd extends EndLink
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionEnd_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionEnd_Contribution()
   * @model
   * @generated
   */
  ContributionType getContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getContribution <em>Contribution</em>}' attribute.
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
   * @see #setQuantitativeContribution(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContributionEnd_QuantitativeContribution()
   * @model
   * @generated
   */
  String getQuantitativeContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getQuantitativeContribution <em>Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantitative Contribution</em>' attribute.
   * @see #getQuantitativeContribution()
   * @generated
   */
  void setQuantitativeContribution(String value);

} // ContributionEnd
