/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getRealWorldLabel <em>Real World Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getExceeds <em>Exceeds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping()
 * @model
 * @generated
 */
public interface QualitativeMapping extends EObject
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Real World Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real World Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real World Label</em>' attribute.
   * @see #setRealWorldLabel(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping_RealWorldLabel()
   * @model
   * @generated
   */
  String getRealWorldLabel();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getRealWorldLabel <em>Real World Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real World Label</em>' attribute.
   * @see #getRealWorldLabel()
   * @generated
   */
  void setRealWorldLabel(String value);

  /**
   * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation</em>' attribute.
   * @see #setEvaluation(int)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping_Evaluation()
   * @model
   * @generated
   */
  int getEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getEvaluation <em>Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation</em>' attribute.
   * @see #getEvaluation()
   * @generated
   */
  void setEvaluation(int value);

  /**
   * Returns the value of the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.QualitativeLabel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualitative Evaluation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualitative Evaluation</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see #setQualitativeEvaluation(QualitativeLabel)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping_QualitativeEvaluation()
   * @model
   * @generated
   */
  QualitativeLabel getQualitativeEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualitative Evaluation</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see #getQualitativeEvaluation()
   * @generated
   */
  void setQualitativeEvaluation(QualitativeLabel value);

  /**
   * Returns the value of the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceeds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceeds</em>' attribute.
   * @see #setExceeds(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMapping_Exceeds()
   * @model
   * @generated
   */
  String getExceeds();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getExceeds <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceeds</em>' attribute.
   * @see #getExceeds()
   * @generated
   */
  void setExceeds(String value);

} // QualitativeMapping
