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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.Actor#getElemets <em>Elemets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends GRLElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Importance</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.grl.tgrl.tGRL.ImportanceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see #setImportance(ImportanceType)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_Importance()
   * @model
   * @generated
   */
  ImportanceType getImportance();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getImportance <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see #getImportance()
   * @generated
   */
  void setImportance(ImportanceType value);

  /**
   * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance Quantitative</em>' attribute.
   * @see #setImportanceQuantitative(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_ImportanceQuantitative()
   * @model
   * @generated
   */
  String getImportanceQuantitative();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
   * @see #getImportanceQuantitative()
   * @generated
   */
  void setImportanceQuantitative(String value);

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Metadata}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Data</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_MetaData()
   * @model containment="true"
   * @generated
   */
  EList<Metadata> getMetaData();

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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_FillColor()
   * @model
   * @generated
   */
  Color getFillColor();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.Actor#getFillColor <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fill Color</em>' attribute.
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @see #getFillColor()
   * @generated
   */
  void setFillColor(Color value);

  /**
   * Returns the value of the '<em><b>Elemets</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.GRLElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemets</em>' containment reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getActor_Elemets()
   * @model containment="true"
   * @generated
   */
  EList<GRLElement> getElemets();

} // Actor
