/**
 */
package core.impl;

import core.COREFeature;
import core.COREFeatureRelationshipType;
import core.COREModel;
import core.COREReuse;
import core.CorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORE Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.COREFeatureImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link core.impl.COREFeatureImpl#getReuses <em>Reuses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class COREFeatureImpl extends COREModelElementImpl implements COREFeature {
	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<COREModel> realizedBy;

	/**
	 * The cached value of the '{@link #getReuses() <em>Reuses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuses()
	 * @generated
	 * @ordered
	 */
	protected EList<COREReuse> reuses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COREFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREModel> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectWithInverseResolvingEList.ManyInverse<COREModel>(COREModel.class, this, CorePackage.CORE_FEATURE__REALIZED_BY, CorePackage.CORE_MODEL__REALIZES);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREReuse> getReuses() {
		if (reuses == null) {
			reuses = new EObjectContainmentEList<COREReuse>(COREReuse.class, this, CorePackage.CORE_FEATURE__REUSES);
		}
		return reuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addFeature(int position, String child_name, COREFeatureRelationshipType association) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean delete() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rename(String core_feature_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeLink(COREFeatureRelationshipType new_association) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeParent(COREFeature feature, COREFeatureRelationshipType new_association) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean requires(COREFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean excludes(COREFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeConstraint(COREFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRealizedBy(COREModel model) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssociateReuse(COREReuse reuse, EList<?> selected, EList<?> reexposed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				return ((InternalEList<?>)getRealizedBy()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_FEATURE__REUSES:
				return ((InternalEList<?>)getReuses()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				return getRealizedBy();
			case CorePackage.CORE_FEATURE__REUSES:
				return getReuses();
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
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends COREModel>)newValue);
				return;
			case CorePackage.CORE_FEATURE__REUSES:
				getReuses().clear();
				getReuses().addAll((Collection<? extends COREReuse>)newValue);
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
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				getRealizedBy().clear();
				return;
			case CorePackage.CORE_FEATURE__REUSES:
				getReuses().clear();
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
			case CorePackage.CORE_FEATURE__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
			case CorePackage.CORE_FEATURE__REUSES:
				return reuses != null && !reuses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.CORE_FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE:
				return addFeature((Integer)arguments.get(0), (String)arguments.get(1), (COREFeatureRelationshipType)arguments.get(2));
			case CorePackage.CORE_FEATURE___DELETE:
				return delete();
			case CorePackage.CORE_FEATURE___RENAME__STRING:
				rename((String)arguments.get(0));
				return null;
			case CorePackage.CORE_FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE:
				return changeLink((COREFeatureRelationshipType)arguments.get(0));
			case CorePackage.CORE_FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE:
				return changeParent((COREFeature)arguments.get(0), (COREFeatureRelationshipType)arguments.get(1));
			case CorePackage.CORE_FEATURE___REQUIRES__COREFEATURE:
				return requires((COREFeature)arguments.get(0));
			case CorePackage.CORE_FEATURE___EXCLUDES__COREFEATURE:
				return excludes((COREFeature)arguments.get(0));
			case CorePackage.CORE_FEATURE___REMOVE_CONSTRAINT__COREFEATURE:
				return removeConstraint((COREFeature)arguments.get(0));
			case CorePackage.CORE_FEATURE___ADD_REALIZED_BY__COREMODEL:
				return addRealizedBy((COREModel)arguments.get(0));
			case CorePackage.CORE_FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST:
				return AssociateReuse((COREReuse)arguments.get(0), (EList<?>)arguments.get(1), (EList<?>)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //COREFeatureImpl
