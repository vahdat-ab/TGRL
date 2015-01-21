/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORE Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.COREInterface#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link core.COREInterface#getCustomizable <em>Customizable</em>}</li>
 *   <li>{@link core.COREInterface#getUsable <em>Usable</em>}</li>
 *   <li>{@link core.COREInterface#getImpacted <em>Impacted</em>}</li>
 *   <li>{@link core.COREInterface#getDefaults <em>Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCOREInterface()
 * @model
 * @generated
 */
public interface COREInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Selectable</b></em>' reference list.
	 * The list contents are of type {@link core.COREFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable</em>' reference list.
	 * @see core.CorePackage#getCOREInterface_Selectable()
	 * @model
	 * @generated
	 */
	EList<COREFeature> getSelectable();

	/**
	 * Returns the value of the '<em><b>Customizable</b></em>' reference list.
	 * The list contents are of type {@link core.COREModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customizable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customizable</em>' reference list.
	 * @see core.CorePackage#getCOREInterface_Customizable()
	 * @model
	 * @generated
	 */
	EList<COREModelElement> getCustomizable();

	/**
	 * Returns the value of the '<em><b>Usable</b></em>' reference list.
	 * The list contents are of type {@link core.COREModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable</em>' reference list.
	 * @see core.CorePackage#getCOREInterface_Usable()
	 * @model
	 * @generated
	 */
	EList<COREModelElement> getUsable();

	/**
	 * Returns the value of the '<em><b>Impacted</b></em>' reference list.
	 * The list contents are of type {@link core.COREImpactModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impacted</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacted</em>' reference list.
	 * @see core.CorePackage#getCOREInterface_Impacted()
	 * @model
	 * @generated
	 */
	EList<COREImpactModelElement> getImpacted();

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' reference list.
	 * The list contents are of type {@link core.COREConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaults</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' reference list.
	 * @see core.CorePackage#getCOREInterface_Defaults()
	 * @model
	 * @generated
	 */
	EList<COREConfiguration> getDefaults();

} // COREInterface
