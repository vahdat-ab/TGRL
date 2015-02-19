/**
 */
package org.xtext.grl.tgrl.tGRL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRL Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLElement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLElement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.GRLElement#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLElement()
 * @model
 * @generated
 */
public interface GRLElement extends GRLBaseElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLElement_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLElement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fill Color</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @see #setFillColor(Color)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getGRLElement_FillColor()
   * @model
   * @generated
   */
  Color getFillColor();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getFillColor <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fill Color</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @see #getFillColor()
   * @generated
   */
  void setFillColor(Color value);

} // GRLElement
