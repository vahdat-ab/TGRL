/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Line Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.InLineLink#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.InLineLink#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getInLineLink()
 * @model
 * @generated
 */
public interface InLineLink extends InLineElementLink
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LinkType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getInLineLink_Type()
   * @model
   * @generated
   */
  LinkType getType();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.InLineLink#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LinkType value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.GRLElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getInLineLink_Dest()
   * @model
   * @generated
   */
  EList<GRLElement> getDest();

} // InLineLink
