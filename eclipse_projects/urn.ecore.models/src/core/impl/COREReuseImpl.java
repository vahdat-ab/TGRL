/**
 */
package core.impl;

import core.COREConcern;
import core.COREConfiguration;
import core.COREReuse;
import core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.COREReuseImpl#getReusedConcern <em>Reused Concern</em>}</li>
 *   <li>{@link core.impl.COREReuseImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link core.impl.COREReuseImpl#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COREReuseImpl extends MinimalEObjectImpl.Container implements COREReuse {
	/**
	 * The cached value of the '{@link #getReusedConcern() <em>Reused Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusedConcern()
	 * @generated
	 * @ordered
	 */
	protected COREConcern reusedConcern;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<COREConfiguration> configurations;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected COREConfiguration selected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COREReuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_REUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREConcern getReusedConcern() {
		if (reusedConcern != null && reusedConcern.eIsProxy()) {
			InternalEObject oldReusedConcern = (InternalEObject)reusedConcern;
			reusedConcern = (COREConcern)eResolveProxy(oldReusedConcern);
			if (reusedConcern != oldReusedConcern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_REUSE__REUSED_CONCERN, oldReusedConcern, reusedConcern));
			}
		}
		return reusedConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREConcern basicGetReusedConcern() {
		return reusedConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReusedConcern(COREConcern newReusedConcern) {
		COREConcern oldReusedConcern = reusedConcern;
		reusedConcern = newReusedConcern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_REUSE__REUSED_CONCERN, oldReusedConcern, reusedConcern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<COREConfiguration>(COREConfiguration.class, this, CorePackage.CORE_REUSE__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREConfiguration getSelected() {
		if (selected != null && selected.eIsProxy()) {
			InternalEObject oldSelected = (InternalEObject)selected;
			selected = (COREConfiguration)eResolveProxy(oldSelected);
			if (selected != oldSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_REUSE__SELECTED, oldSelected, selected));
			}
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREConfiguration basicGetSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(COREConfiguration newSelected) {
		COREConfiguration oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_REUSE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_REUSE__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_REUSE__REUSED_CONCERN:
				if (resolve) return getReusedConcern();
				return basicGetReusedConcern();
			case CorePackage.CORE_REUSE__CONFIGURATIONS:
				return getConfigurations();
			case CorePackage.CORE_REUSE__SELECTED:
				if (resolve) return getSelected();
				return basicGetSelected();
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
			case CorePackage.CORE_REUSE__REUSED_CONCERN:
				setReusedConcern((COREConcern)newValue);
				return;
			case CorePackage.CORE_REUSE__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends COREConfiguration>)newValue);
				return;
			case CorePackage.CORE_REUSE__SELECTED:
				setSelected((COREConfiguration)newValue);
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
			case CorePackage.CORE_REUSE__REUSED_CONCERN:
				setReusedConcern((COREConcern)null);
				return;
			case CorePackage.CORE_REUSE__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case CorePackage.CORE_REUSE__SELECTED:
				setSelected((COREConfiguration)null);
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
			case CorePackage.CORE_REUSE__REUSED_CONCERN:
				return reusedConcern != null;
			case CorePackage.CORE_REUSE__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case CorePackage.CORE_REUSE__SELECTED:
				return selected != null;
		}
		return super.eIsSet(featureID);
	}

} //COREReuseImpl
