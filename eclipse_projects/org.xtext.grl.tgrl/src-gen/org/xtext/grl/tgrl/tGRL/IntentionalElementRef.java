/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElementRef()
 * @model
 * @generated
 */
public interface IntentionalElementRef extends GRLNode
{
  /**
   * Returns the value of the '<em><b>Criticality</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.Criticality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criticality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criticality</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @see #setCriticality(Criticality)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElementRef_Criticality()
   * @model
   * @generated
   */
  Criticality getCriticality();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getCriticality <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criticality</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @see #getCriticality()
   * @generated
   */
  void setCriticality(Criticality value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.Priority}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @see #setPriority(Priority)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElementRef_Priority()
   * @model
   * @generated
   */
  Priority getPriority();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @see #getPriority()
   * @generated
   */
  void setPriority(Priority value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' reference.
   * @see #setDef(IntentionalElement)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIntentionalElementRef_Def()
   * @model
   * @generated
   */
  IntentionalElement getDef();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getDef <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' reference.
   * @see #getDef()
   * @generated
   */
  void setDef(IntentionalElement value);

} // IntentionalElementRef
