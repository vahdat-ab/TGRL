/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getIncludedActors <em>Included Actors</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getCollapsedRefs <em>Collapsed Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends GRLLinkableElement
{
  /**
   * Returns the value of the '<em><b>Included Actors</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Actors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Actors</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_IncludedActors()
   * @model
   * @generated
   */
  EList<Actor> getIncludedActors();

  /**
   * Returns the value of the '<em><b>Collapsed Refs</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collapsed Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collapsed Refs</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_CollapsedRefs()
   * @model
   * @generated
   */
  EList<CollapsedActorRef> getCollapsedRefs();

} // Actor
