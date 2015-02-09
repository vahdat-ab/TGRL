/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getMappin <em>Mappin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMappings()
 * @model
 * @generated
 */
public interface QualitativeMappings extends KPIConversion
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMappings_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Kpi Eval Value Set</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Eval Value Set</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Eval Value Set</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMappings_KpiEvalValueSet()
   * @model
   * @generated
   */
  EList<KPIEvalValueSet> getKpiEvalValueSet();

  /**
   * Returns the value of the '<em><b>Mappin</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.QualitativeMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappin</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappin</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getQualitativeMappings_Mappin()
   * @model containment="true"
   * @generated
   */
  EList<QualitativeMapping> getMappin();

} // QualitativeMappings
