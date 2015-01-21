/**
 */
package core.impl;

import core.COREConfiguration;
import core.COREFeature;
import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.COREConfigurationImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link core.impl.COREConfigurationImpl#getReexposed <em>Reexposed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COREConfigurationImpl extends CORENamedElementImpl implements COREConfiguration {
	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected EList<COREFeature> selected;

	/**
	 * The cached value of the '{@link #getReexposed() <em>Reexposed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReexposed()
	 * @generated
	 * @ordered
	 */
	protected EList<COREFeature> reexposed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COREConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREFeature> getSelected() {
		if (selected == null) {
			selected = new EObjectResolvingEList<COREFeature>(COREFeature.class, this, CorePackage.CORE_CONFIGURATION__SELECTED);
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREFeature> getReexposed() {
		if (reexposed == null) {
			reexposed = new EObjectResolvingEList<COREFeature>(COREFeature.class, this, CorePackage.CORE_CONFIGURATION__REEXPOSED);
		}
		return reexposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_CONFIGURATION__SELECTED:
				return getSelected();
			case CorePackage.CORE_CONFIGURATION__REEXPOSED:
				return getReexposed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CORE_CONFIGURATION__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends COREFeature>)newValue);
				return;
			case CorePackage.CORE_CONFIGURATION__REEXPOSED:
				getReexposed().clear();
				getReexposed().addAll((Collection<? extends COREFeature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.CORE_CONFIGURATION__SELECTED:
				getSelected().clear();
				return;
			case CorePackage.CORE_CONFIGURATION__REEXPOSED:
				getReexposed().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.CORE_CONFIGURATION__SELECTED:
				return selected != null && !selected.isEmpty();
			case CorePackage.CORE_CONFIGURATION__REEXPOSED:
				return reexposed != null && !reexposed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COREConfigurationImpl
