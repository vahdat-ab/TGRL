/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#getIntentionalElement <em>Intentional Element</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#isExceeds <em>Exceeds</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvalRange <em>Eval Range</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Evaluation#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends GRLElement
{
  /**
   * Returns the value of the '<em><b>Intentional Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intentional Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intentional Element</em>' reference.
   * @see #setIntentionalElement(IntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_IntentionalElement()
   * @model
   * @generated
   */
  IntentionalElement getIntentionalElement();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getIntentionalElement <em>Intentional Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intentional Element</em>' reference.
   * @see #getIntentionalElement()
   * @generated
   */
  void setIntentionalElement(IntentionalElement value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_QualitativeEvaluation()
   * @model
   * @generated
   */
  QualitativeLabel getQualitativeEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualitative Evaluation</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see #getQualitativeEvaluation()
   * @generated
   */
  void setQualitativeEvaluation(QualitativeLabel value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_Evaluation()
   * @model
   * @generated
   */
  int getEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvaluation <em>Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation</em>' attribute.
   * @see #getEvaluation()
   * @generated
   */
  void setEvaluation(int value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_Exceeds()
   * @model
   * @generated
   */
  boolean isExceeds();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#isExceeds <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceeds</em>' attribute.
   * @see #isExceeds()
   * @generated
   */
  void setExceeds(boolean value);

  /**
   * Returns the value of the '<em><b>Eval Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eval Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eval Range</em>' containment reference.
   * @see #setEvalRange(EvaluationRange)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_EvalRange()
   * @model containment="true"
   * @generated
   */
  EvaluationRange getEvalRange();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvalRange <em>Eval Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eval Range</em>' containment reference.
   * @see #getEvalRange()
   * @generated
   */
  void setEvalRange(EvaluationRange value);

  /**
   * Returns the value of the '<em><b>Kpi Eval Value Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Eval Value Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Eval Value Set</em>' containment reference.
   * @see #setKpiEvalValueSet(KPIEvalValueSet)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getEvaluation_KpiEvalValueSet()
   * @model containment="true"
   * @generated
   */
  KPIEvalValueSet getKpiEvalValueSet();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kpi Eval Value Set</em>' containment reference.
   * @see #getKpiEvalValueSet()
   * @generated
   */
  void setKpiEvalValueSet(KPIEvalValueSet value);

} // Evaluation
