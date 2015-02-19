/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Connection#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Connection#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends GRLBaseElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getConnection_Src()
   * @model
   * @generated
   */
  IntentionalElement getSrc();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Connection#getSrc <em>Src</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(IntentionalElement value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(IntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getConnection_Dest()
   * @model
   * @generated
   */
  IntentionalElement getDest();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Connection#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(IntentionalElement value);

} // Connection
