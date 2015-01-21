/**
 */
package core.impl;

import core.COREConfiguration;
import core.COREFeature;
import core.COREImpactModelElement;
import core.COREInterface;
import core.COREModelElement;
import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.COREInterfaceImpl#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link core.impl.COREInterfaceImpl#getCustomizable <em>Customizable</em>}</li>
 *   <li>{@link core.impl.COREInterfaceImpl#getUsable <em>Usable</em>}</li>
 *   <li>{@link core.impl.COREInterfaceImpl#getImpacted <em>Impacted</em>}</li>
 *   <li>{@link core.impl.COREInterfaceImpl#getDefaults <em>Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COREInterfaceImpl extends MinimalEObjectImpl.Container implements COREInterface {
	/**
	 * The cached value of the '{@link #getSelectable() <em>Selectable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectable()
	 * @generated
	 * @ordered
	 */
	protected EList<COREFeature> selectable;

	/**
	 * The cached value of the '{@link #getCustomizable() <em>Customizable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizable()
	 * @generated
	 * @ordered
	 */
	protected EList<COREModelElement> customizable;

	/**
	 * The cached value of the '{@link #getUsable() <em>Usable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsable()
	 * @generated
	 * @ordered
	 */
	protected EList<COREModelElement> usable;

	/**
	 * The cached value of the '{@link #getImpacted() <em>Impacted</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacted()
	 * @generated
	 * @ordered
	 */
	protected EList<COREImpactModelElement> impacted;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected EList<COREConfiguration> defaults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COREInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREFeature> getSelectable() {
		if (selectable == null) {
			selectable = new EObjectResolvingEList<COREFeature>(COREFeature.class, this, CorePackage.CORE_INTERFACE__SELECTABLE);
		}
		return selectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREModelElement> getCustomizable() {
		if (customizable == null) {
			customizable = new EObjectResolvingEList<COREModelElement>(COREModelElement.class, this, CorePackage.CORE_INTERFACE__CUSTOMIZABLE);
		}
		return customizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREModelElement> getUsable() {
		if (usable == null) {
			usable = new EObjectResolvingEList<COREModelElement>(COREModelElement.class, this, CorePackage.CORE_INTERFACE__USABLE);
		}
		return usable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREImpactModelElement> getImpacted() {
		if (impacted == null) {
			impacted = new EObjectResolvingEList<COREImpactModelElement>(COREImpactModelElement.class, this, CorePackage.CORE_INTERFACE__IMPACTED);
		}
		return impacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREConfiguration> getDefaults() {
		if (defaults == null) {
			defaults = new EObjectResolvingEList<COREConfiguration>(COREConfiguration.class, this, CorePackage.CORE_INTERFACE__DEFAULTS);
		}
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_INTERFACE__SELECTABLE:
				return getSelectable();
			case CorePackage.CORE_INTERFACE__CUSTOMIZABLE:
				return getCustomizable();
			case CorePackage.CORE_INTERFACE__USABLE:
				return getUsable();
			case CorePackage.CORE_INTERFACE__IMPACTED:
				return getImpacted();
			case CorePackage.CORE_INTERFACE__DEFAULTS:
				return getDefaults();
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
			case CorePackage.CORE_INTERFACE__SELECTABLE:
				getSelectable().clear();
				getSelectable().addAll((Collection<? extends COREFeature>)newValue);
				return;
			case CorePackage.CORE_INTERFACE__CUSTOMIZABLE:
				getCustomizable().clear();
				getCustomizable().addAll((Collection<? extends COREModelElement>)newValue);
				return;
			case CorePackage.CORE_INTERFACE__USABLE:
				getUsable().clear();
				getUsable().addAll((Collection<? extends COREModelElement>)newValue);
				return;
			case CorePackage.CORE_INTERFACE__IMPACTED:
				getImpacted().clear();
				getImpacted().addAll((Collection<? extends COREImpactModelElement>)newValue);
				return;
			case CorePackage.CORE_INTERFACE__DEFAULTS:
				getDefaults().clear();
				getDefaults().addAll((Collection<? extends COREConfiguration>)newValue);
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
			case CorePackage.CORE_INTERFACE__SELECTABLE:
				getSelectable().clear();
				return;
			case CorePackage.CORE_INTERFACE__CUSTOMIZABLE:
				getCustomizable().clear();
				return;
			case CorePackage.CORE_INTERFACE__USABLE:
				getUsable().clear();
				return;
			case CorePackage.CORE_INTERFACE__IMPACTED:
				getImpacted().clear();
				return;
			case CorePackage.CORE_INTERFACE__DEFAULTS:
				getDefaults().clear();
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
			case CorePackage.CORE_INTERFACE__SELECTABLE:
				return selectable != null && !selectable.isEmpty();
			case CorePackage.CORE_INTERFACE__CUSTOMIZABLE:
				return customizable != null && !customizable.isEmpty();
			case CorePackage.CORE_INTERFACE__USABLE:
				return usable != null && !usable.isEmpty();
			case CorePackage.CORE_INTERFACE__IMPACTED:
				return impacted != null && !impacted.isEmpty();
			case CorePackage.CORE_INTERFACE__DEFAULTS:
				return defaults != null && !defaults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COREInterfaceImpl
