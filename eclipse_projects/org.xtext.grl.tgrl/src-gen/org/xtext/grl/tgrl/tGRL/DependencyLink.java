/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.DependencyLink#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getDependencyLink()
 * @model
 * @generated
 */
public interface DependencyLink extends ElementLink
{
  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.DependencyEnds}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getDependencyLink_Connections()
   * @model containment="true"
   * @generated
   */
  EList<DependencyEnds> getConnections();

} // DependencyLink
