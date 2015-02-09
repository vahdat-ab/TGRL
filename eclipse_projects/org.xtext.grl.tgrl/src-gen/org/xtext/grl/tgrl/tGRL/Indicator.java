/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Indicator#getKpiModelLinksDest <em>Kpi Model Links Dest</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Indicator#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicator()
 * @model
 * @generated
 */
public interface Indicator extends IntentionalElement
{
  /**
   * Returns the value of the '<em><b>Kpi Model Links Dest</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.KPIModelLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kpi Model Links Dest</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kpi Model Links Dest</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicator_KpiModelLinksDest()
   * @model
   * @generated
   */
  EList<KPIModelLink> getKpiModelLinksDest();

  /**
   * Returns the value of the '<em><b>Groups</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.IndicatorGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicator_Groups()
   * @model
   * @generated
   */
  EList<IndicatorGroup> getGroups();

} // Indicator
