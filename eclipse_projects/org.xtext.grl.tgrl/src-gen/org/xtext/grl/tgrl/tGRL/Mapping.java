/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Mapping#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Mapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Mapping#isExceeds <em>Exceeds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends GRLBaseElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Mapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getMapping_Evaluation()
   * @model
   * @generated
   */
  int getEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Mapping#getEvaluation <em>Evaluation</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getMapping_QualitativeEvaluation()
   * @model
   * @generated
   */
  QualitativeLabel getQualitativeEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Mapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
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
   * @see #setExceeds(boolean)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getMapping_Exceeds()
   * @model
   * @generated
   */
  boolean isExceeds();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Mapping#isExceeds <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceeds</em>' attribute.
   * @see #isExceeds()
   * @generated
   */
  void setExceeds(boolean value);

} // Mapping
