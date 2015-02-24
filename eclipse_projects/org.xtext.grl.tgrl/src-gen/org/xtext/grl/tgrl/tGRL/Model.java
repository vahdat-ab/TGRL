/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Model#getGRLspecifications <em>GR Lspecifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>GR Lspecifications</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.GRLSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GR Lspecifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GR Lspecifications</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getModel_GRLspecifications()
   * @model containment="true"
   * @generated
   */
  EList<GRLSpecification> getGRLspecifications();

} // Model
