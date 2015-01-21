/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREModel#getModelReuse <em>Model Reuse</em>}</li>
 *   <li>{@link core.COREModel#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link core.COREModel#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREModel()
 * @model abstract="true"
 *        extendedMetaData="name='COREFeatureModel'"
 * @generated
 */
public interface COREModel extends CORENamedElement {
	/**
	 * Returns the value of the '<em><b>Model Reuse</b></em>' containment reference list.
	 * The list contents are of type {@link core.COREModelReuse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Reuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Reuse</em>' containment reference list.
	 * @see core.CorePackage#getCOREModel_ModelReuse()
	 * @model containment="true"
	 * @generated
	 */
	EList<COREModelReuse> getModelReuse();

	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' reference list.
	 * The list contents are of type {@link core.COREModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' reference list.
	 * @see core.CorePackage#getCOREModel_ModelElements()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<COREModelElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link core.COREFeature}.
	 * It is bidirectional and its opposite is '{@link core.COREFeature#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see core.CorePackage#getCOREModel_Realizes()
	 * @see core.COREFeature#getRealizedBy
	 * @model opposite="realizedBy"
	 * @generated
	 */
	EList<COREFeature> getRealizes();

} // COREModel
