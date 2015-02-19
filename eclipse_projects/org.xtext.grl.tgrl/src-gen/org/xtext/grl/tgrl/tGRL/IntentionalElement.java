/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends GRLElement
{
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
   * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance Quantitative</em>' attribute.
   * @see #setImportanceQuantitative(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElement_ImportanceQuantitative()
   * @model
   * @generated
   */
  int getImportanceQuantitative();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
   * @see #getImportanceQuantitative()
   * @generated
   */
  void setImportanceQuantitative(int value);

} // IntentionalElement
