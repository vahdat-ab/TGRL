/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Information Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getLevelOfDimension <em>Level Of Dimension</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getValueOfDimension <em>Value Of Dimension</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getKpiInfoElement <em>Kpi Info Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIInformationConfig()
 * @model
 * @generated
 */
public interface KPIInformationConfig extends EObject
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIInformationConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Level Of Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level Of Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level Of Dimension</em>' attribute.
   * @see #setLevelOfDimension(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIInformationConfig_LevelOfDimension()
   * @model
   * @generated
   */
  String getLevelOfDimension();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getLevelOfDimension <em>Level Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level Of Dimension</em>' attribute.
   * @see #getLevelOfDimension()
   * @generated
   */
  void setLevelOfDimension(String value);

  /**
   * Returns the value of the '<em><b>Value Of Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Of Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Of Dimension</em>' attribute.
   * @see #setValueOfDimension(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIInformationConfig_ValueOfDimension()
   * @model
   * @generated
   */
  String getValueOfDimension();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getValueOfDimension <em>Value Of Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Of Dimension</em>' attribute.
   * @see #getValueOfDimension()
   * @generated
   */
  void setValueOfDimension(String value);

  /**
   * Returns the value of the '<em><b>Kpi Info Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Info Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Info Element</em>' reference.
   * @see #setKpiInfoElement(KPIInformationElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getKPIInformationConfig_KpiInfoElement()
   * @model
   * @generated
   */
  KPIInformationElement getKpiInfoElement();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getKpiInfoElement <em>Kpi Info Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kpi Info Element</em>' reference.
   * @see #getKpiInfoElement()
   * @generated
   */
  void setKpiInfoElement(KPIInformationElement value);

} // KPIInformationConfig
