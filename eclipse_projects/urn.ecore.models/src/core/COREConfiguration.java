/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREConfiguration#getSelected <em>Selected</em>}</li>
 *   <li>{@link core.COREConfiguration#getReexposed <em>Reexposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREConfiguration()
 * @model
 * @generated
 */
public interface COREConfiguration extends CORENamedElement {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference list.
	 * The list contents are of type {@link core.COREFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference list.
	 * @see core.CorePackage#getCOREConfiguration_Selected()
	 * @model
	 * @generated
	 */
	EList<COREFeature> getSelected();

	/**
	 * Returns the value of the '<em><b>Reexposed</b></em>' reference list.
	 * The list contents are of type {@link core.COREFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reexposed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reexposed</em>' reference list.
	 * @see core.CorePackage#getCOREConfiguration_Reexposed()
	 * @model
	 * @generated
	 */
	EList<COREFeature> getReexposed();

} // COREConfiguration
