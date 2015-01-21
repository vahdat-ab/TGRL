/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see core.CorePackage#getCOREFeatureModel()
 * @model abstract="true"
 * @generated
 */
public interface COREFeatureModel extends COREModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	COREFeature getGlobalRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	COREFeature getLocalRoot();

} // COREFeatureModel
