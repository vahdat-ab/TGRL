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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Contribution#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Contribution#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Contribution#getChanges <em>Changes</em>}</li>
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution_Contribution()
   * @model
   * @generated
   */
  ContributionType getContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Contribution#getContribution <em>Contribution</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution_QuantitativeContribution()
   * @model
   * @generated
   */
  int getQuantitativeContribution();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution_Correlation()
   * @model
   * @generated
   */
  String getCorrelation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Contribution#getCorrelation <em>Correlation</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getContribution_Changes()
   * @model
   * @generated
   */
  EList<ContributionChange> getChanges();

} // Contribution
