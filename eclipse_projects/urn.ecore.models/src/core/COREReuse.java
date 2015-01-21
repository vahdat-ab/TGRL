/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREReuse#getReusedConcern <em>Reused Concern</em>}</li>
 *   <li>{@link core.COREReuse#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link core.COREReuse#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREReuse()
 * @model
 * @generated
 */
public interface COREReuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Reused Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Concern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Concern</em>' reference.
	 * @see #setReusedConcern(COREConcern)
	 * @see core.CorePackage#getCOREReuse_ReusedConcern()
	 * @model required="true"
	 * @generated
	 */
	COREConcern getReusedConcern();

	/**
	 * Sets the value of the '{@link core.COREReuse#getReusedConcern <em>Reused Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reused Concern</em>' reference.
	 * @see #getReusedConcern()
	 * @generated
	 */
	void setReusedConcern(COREConcern value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link core.COREConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see core.CorePackage#getCOREReuse_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<COREConfiguration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(COREConfiguration)
	 * @see core.CorePackage#getCOREReuse_Selected()
	 * @model
	 * @generated
	 */
	COREConfiguration getSelected();

	/**
	 * Sets the value of the '{@link core.COREReuse#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(COREConfiguration value);

} // COREReuse
