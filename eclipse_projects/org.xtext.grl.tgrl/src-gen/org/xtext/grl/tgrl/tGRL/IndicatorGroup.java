/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIsRedesignCategory <em>Is Redesign Category</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIndicators <em>Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup()
 * @model
 * @generated
 */
public interface IndicatorGroup extends GRLModelElement
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getLabel <em>Label</em>}' attribute.
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
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Is Redesign Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Redesign Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Redesign Category</em>' attribute.
   * @see #setIsRedesignCategory(String)
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup_IsRedesignCategory()
   * @model
   * @generated
   */
  String getIsRedesignCategory();

  /**
   * Sets the value of the '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIsRedesignCategory <em>Is Redesign Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Redesign Category</em>' attribute.
   * @see #getIsRedesignCategory()
   * @generated
   */
  void setIsRedesignCategory(String value);

  /**
   * Returns the value of the '<em><b>Indicators</b></em>' reference list.
   * The list contents are of type {@link org.xtext.grl.tgrl.tGRL.Indicator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indicators</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indicators</em>' reference list.
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getIndicatorGroup_Indicators()
   * @model
   * @generated
   */
  EList<Indicator> getIndicators();

} // IndicatorGroup