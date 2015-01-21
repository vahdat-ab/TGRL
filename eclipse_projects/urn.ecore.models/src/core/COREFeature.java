/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREFeature#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link core.COREFeature#getReuses <em>Reuses</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREFeature()
 * @model abstract="true"
 * @generated
 */
public interface COREFeature extends COREModelElement {
	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' reference list.
	 * The list contents are of type {@link core.COREModel}.
	 * It is bidirectional and its opposite is '{@link core.COREModel#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized By</em>' reference list.
	 * @see core.CorePackage#getCOREFeature_RealizedBy()
	 * @see core.COREModel#getRealizes
	 * @model opposite="realizes"
	 * @generated
	 */
	EList<COREModel> getRealizedBy();

	/**
	 * Returns the value of the '<em><b>Reuses</b></em>' containment reference list.
	 * The list contents are of type {@link core.COREReuse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuses</em>' containment reference list.
	 * @see core.CorePackage#getCOREFeature_Reuses()
	 * @model containment="true"
	 * @generated
	 */
	EList<COREReuse> getReuses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" child_nameRequired="true" associationRequired="true"
	 * @generated
	 */
	boolean addFeature(int position, String child_name, COREFeatureRelationshipType association);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void rename(String core_feature_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" new_associationRequired="true"
	 * @generated
	 */
	boolean changeLink(COREFeatureRelationshipType new_association);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureRequired="true" new_associationRequired="true"
	 * @generated
	 */
	boolean changeParent(COREFeature feature, COREFeatureRelationshipType new_association);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureRequired="true"
	 * @generated
	 */
	boolean requires(COREFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureRequired="true"
	 * @generated
	 */
	boolean excludes(COREFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureRequired="true"
	 * @generated
	 */
	boolean removeConstraint(COREFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" modelRequired="true"
	 * @generated
	 */
	boolean addRealizedBy(COREModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model selectedMany="false" reexposedMany="false"
	 * @generated
	 */
	boolean AssociateReuse(COREReuse reuse, EList<?> selected, EList<?> reexposed);

} // COREFeature
