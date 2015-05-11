/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.LinkEnd#getDestName <em>Dest Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getLinkEnd()
 * @model
 * @generated
 */
public interface LinkEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Dest Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest Name</em>' reference.
   * @see #setDestName(SuperIntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getLinkEnd_DestName()
   * @model
   * @generated
   */
  SuperIntentionalElement getDestName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.LinkEnd#getDestName <em>Dest Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest Name</em>' reference.
   * @see #getDestName()
   * @generated
   */
  void setDestName(SuperIntentionalElement value);

} // LinkEnd
