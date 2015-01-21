/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Model Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREModelReuse#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link core.COREModelReuse#getModelReuse <em>Model Reuse</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREModelReuse()
 * @model
 * @generated
 */
public interface COREModelReuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link core.CORECompositionSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see core.CorePackage#getCOREModelReuse_Compositions()
	 * @model
	 * @generated
	 */
	EList<CORECompositionSpecification> getCompositions();

	/**
	 * Returns the value of the '<em><b>Model Reuse</b></em>' reference list.
	 * The list contents are of type {@link core.COREReuse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Reuse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Reuse</em>' reference list.
	 * @see core.CorePackage#getCOREModelReuse_ModelReuse()
	 * @model
	 * @generated
	 */
	EList<COREReuse> getModelReuse();

} // COREModelReuse
