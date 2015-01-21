/**
 */
package core.impl;

import core.CORECompositionSpecification;
import core.COREModelReuse;
import core.COREReuse;
import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Model Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.COREModelReuseImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link core.impl.COREModelReuseImpl#getModelReuse <em>Model Reuse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COREModelReuseImpl extends MinimalEObjectImpl.Container implements COREModelReuse {
	/**
	 * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<CORECompositionSpecification> compositions;

	/**
	 * The cached value of the '{@link #getModelReuse() <em>Model Reuse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelReuse()
	 * @generated
	 * @ordered
	 */
	protected EList<COREReuse> modelReuse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COREModelReuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_MODEL_REUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CORECompositionSpecification> getCompositions() {
		if (compositions == null) {
			compositions = new EObjectResolvingEList<CORECompositionSpecification>(CORECompositionSpecification.class, this, CorePackage.CORE_MODEL_REUSE__COMPOSITIONS);
		}
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREReuse> getModelReuse() {
		if (modelReuse == null) {
			modelReuse = new EObjectResolvingEList<COREReuse>(COREReuse.class, this, CorePackage.CORE_MODEL_REUSE__MODEL_REUSE);
		}
		return modelReuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_MODEL_REUSE__COMPOSITIONS:
				return getCompositions();
			case CorePackage.CORE_MODEL_REUSE__MODEL_REUSE:
				return getModelReuse();
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
			case CorePackage.CORE_MODEL_REUSE__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends CORECompositionSpecification>)newValue);
				return;
			case CorePackage.CORE_MODEL_REUSE__MODEL_REUSE:
				getModelReuse().clear();
				getModelReuse().addAll((Collection<? extends COREReuse>)newValue);
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
			case CorePackage.CORE_MODEL_REUSE__COMPOSITIONS:
				getCompositions().clear();
				return;
			case CorePackage.CORE_MODEL_REUSE__MODEL_REUSE:
				getModelReuse().clear();
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
			case CorePackage.CORE_MODEL_REUSE__COMPOSITIONS:
				return compositions != null && !compositions.isEmpty();
			case CorePackage.CORE_MODEL_REUSE__MODEL_REUSE:
				return modelReuse != null && !modelReuse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COREModelReuseImpl
