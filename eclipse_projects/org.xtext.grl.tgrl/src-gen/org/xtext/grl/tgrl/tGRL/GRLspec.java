/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GR Lspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getImpactModel <em>Impact Model</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getLinks <em>Links</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getActors <em>Actors</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getIntElements <em>Int Elements</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getContributionGroups <em>Contribution Groups</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getContributionContexts <em>Contribution Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiConv <em>Kpi Conv</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiInformationElements <em>Kpi Information Elements</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiModelLinks <em>Kpi Model Links</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLspec#getIndicatorGroup <em>Indicator Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec()
 * @model
 * @generated
 */
public interface GRLspec extends EObject
{
  /**
   * Returns the value of the '<em><b>Impact Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact Model</em>' containment reference.
   * @see #setImpactModel(ImpactModel)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_ImpactModel()
   * @model containment="true"
   * @generated
   */
  ImpactModel getImpactModel();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getImpactModel <em>Impact Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact Model</em>' containment reference.
   * @see #getImpactModel()
   * @generated
   */
  void setImpactModel(ImpactModel value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ElementLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_Links()
   * @model containment="true"
   * @generated
   */
  EList<ElementLink> getLinks();

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Int Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Elements</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_IntElements()
   * @model containment="true"
   * @generated
   */
  EList<IntentionalElement> getIntElements();

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.StrategiesGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_Groups()
   * @model containment="true"
   * @generated
   */
  EList<StrategiesGroup> getGroups();

  /**
   * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategies</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_Strategies()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationStrategy> getStrategies();

  /**
   * Returns the value of the '<em><b>Contribution Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution Groups</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_ContributionGroups()
   * @model containment="true"
   * @generated
   */
  EList<ContributionContextGroup> getContributionGroups();

  /**
   * Returns the value of the '<em><b>Contribution Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.ContributionContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution Contexts</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_ContributionContexts()
   * @model containment="true"
   * @generated
   */
  EList<ContributionContext> getContributionContexts();

  /**
   * Returns the value of the '<em><b>Kpi Conv</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIConversion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Conv</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Conv</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_KpiConv()
   * @model containment="true"
   * @generated
   */
  EList<KPIConversion> getKpiConv();

  /**
   * Returns the value of the '<em><b>Kpi Information Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIInformationElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Information Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Information Elements</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_KpiInformationElements()
   * @model containment="true"
   * @generated
   */
  EList<KPIInformationElement> getKpiInformationElements();

  /**
   * Returns the value of the '<em><b>Kpi Model Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIModelLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Model Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Model Links</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_KpiModelLinks()
   * @model containment="true"
   * @generated
   */
  EList<KPIModelLink> getKpiModelLinks();

  /**
   * Returns the value of the '<em><b>Indicator Group</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.IndicatorGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indicator Group</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indicator Group</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLspec_IndicatorGroup()
   * @model containment="true"
   * @generated
   */
  EList<IndicatorGroup> getIndicatorGroup();

} // GRLspec
