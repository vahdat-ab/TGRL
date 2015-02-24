/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Line Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.InLineDependency#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getInLineDependency()
 * @model
 * @generated
 */
public interface InLineDependency extends InLineElementLink
{
  /**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.DependencyEnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getInLineDependency_Dest()
   * @model containment="true"
   * @generated
   */
  EList<DependencyEnd> getDest();

} // InLineDependency
