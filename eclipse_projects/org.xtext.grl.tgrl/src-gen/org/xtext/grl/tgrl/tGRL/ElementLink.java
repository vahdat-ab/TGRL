/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.ElementLink#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getElementLink()
 * @model
 * @generated
 */
public interface ElementLink extends GRLElement
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' reference.
   * @see #setSrc(IntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getElementLink_Src()
   * @model
   * @generated
   */
  IntentionalElement getSrc();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getSrc <em>Src</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(IntentionalElement value);

} // ElementLink
