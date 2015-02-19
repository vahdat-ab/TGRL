/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRL Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLSpecification#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLSpecification#getGrlElements <em>Grl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLSpecification()
 * @model
 * @generated
 */
public interface GRLSpecification extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLSpecification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLSpecification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Grl Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.GRLElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grl Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grl Elements</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLSpecification_GrlElements()
   * @model containment="true"
   * @generated
   */
  EList<GRLElement> getGrlElements();

} // GRLSpecification
