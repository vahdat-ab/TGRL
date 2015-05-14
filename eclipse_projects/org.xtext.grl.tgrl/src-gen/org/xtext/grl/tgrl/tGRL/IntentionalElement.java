/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getElementLinks <em>Element Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends SuperIntentionalElement
{
  /**
   * Returns the value of the '<em><b>Decomposition Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.DecompositionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposition Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Type</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @see #setDecompositionType(DecompositionType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement_DecompositionType()
   * @model
   * @generated
   */
  DecompositionType getDecompositionType();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decomposition Type</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @see #getDecompositionType()
   * @generated
   */
  void setDecompositionType(DecompositionType value);

  /**
   * Returns the value of the '<em><b>Importance</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.ImportanceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see #setImportance(ImportanceType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement_Importance()
   * @model
   * @generated
   */
  ImportanceType getImportance();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportance <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see #getImportance()
   * @generated
   */
  void setImportance(ImportanceType value);

  /**
   * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance Quantitative</em>' attribute.
   * @see #setImportanceQuantitative(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement_ImportanceQuantitative()
   * @model
   * @generated
   */
  String getImportanceQuantitative();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
   * @see #getImportanceQuantitative()
   * @generated
   */
  void setImportanceQuantitative(String value);

  /**
   * Returns the value of the '<em><b>Element Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.InLineElementLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Links</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement_ElementLinks()
   * @model containment="true"
   * @generated
   */
  EList<InLineElementLink> getElementLinks();

} // IntentionalElement
