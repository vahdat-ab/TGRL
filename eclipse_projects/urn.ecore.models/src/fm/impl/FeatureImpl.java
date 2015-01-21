/**
 */
package fm.impl;

import core.COREFeature;
import core.COREFeatureRelationshipType;
import core.COREModel;
import core.COREModelElement;
import core.COREReuse;
import core.CorePackage;

import fm.Feature;
import fm.FmPackage;

import grl.impl.IntentionalElementImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fm.impl.FeatureImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link fm.impl.FeatureImpl#getReuses <em>Reuses</em>}</li>
 *   <li>{@link fm.impl.FeatureImpl#isSelectable <em>Selectable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends IntentionalElementImpl implements Feature {
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
	 * The default value of the '{@link #isSelectable() <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelectable() <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectable()
	 * @generated
	 * @ordered
	 */
	protected boolean selectable = SELECTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COREModel> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectWithInverseResolvingEList.ManyInverse<COREModel>(COREModel.class, this, FmPackage.FEATURE__REALIZED_BY, CorePackage.CORE_MODEL__REALIZES);
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
			reuses = new EObjectContainmentEList<COREReuse>(COREReuse.class, this, FmPackage.FEATURE__REUSES);
		}
		return reuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectable() {
		return selectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectable(boolean newSelectable) {
		boolean oldSelectable = selectable;
		selectable = newSelectable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmPackage.FEATURE__SELECTABLE, oldSelectable, selectable));
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
			case FmPackage.FEATURE__REALIZED_BY:
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
			case FmPackage.FEATURE__REALIZED_BY:
				return ((InternalEList<?>)getRealizedBy()).basicRemove(otherEnd, msgs);
			case FmPackage.FEATURE__REUSES:
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
			case FmPackage.FEATURE__REALIZED_BY:
				return getRealizedBy();
			case FmPackage.FEATURE__REUSES:
				return getReuses();
			case FmPackage.FEATURE__SELECTABLE:
				return isSelectable();
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
			case FmPackage.FEATURE__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends COREModel>)newValue);
				return;
			case FmPackage.FEATURE__REUSES:
				getReuses().clear();
				getReuses().addAll((Collection<? extends COREReuse>)newValue);
				return;
			case FmPackage.FEATURE__SELECTABLE:
				setSelectable((Boolean)newValue);
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
			case FmPackage.FEATURE__REALIZED_BY:
				getRealizedBy().clear();
				return;
			case FmPackage.FEATURE__REUSES:
				getReuses().clear();
				return;
			case FmPackage.FEATURE__SELECTABLE:
				setSelectable(SELECTABLE_EDEFAULT);
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
			case FmPackage.FEATURE__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
			case FmPackage.FEATURE__REUSES:
				return reuses != null && !reuses.isEmpty();
			case FmPackage.FEATURE__SELECTABLE:
				return selectable != SELECTABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == COREModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == COREFeature.class) {
			switch (derivedFeatureID) {
				case FmPackage.FEATURE__REALIZED_BY: return CorePackage.CORE_FEATURE__REALIZED_BY;
				case FmPackage.FEATURE__REUSES: return CorePackage.CORE_FEATURE__REUSES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == COREModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == COREFeature.class) {
			switch (baseFeatureID) {
				case CorePackage.CORE_FEATURE__REALIZED_BY: return FmPackage.FEATURE__REALIZED_BY;
				case CorePackage.CORE_FEATURE__REUSES: return FmPackage.FEATURE__REUSES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == COREModelElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == COREFeature.class) {
			switch (baseOperationID) {
				case CorePackage.CORE_FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE: return FmPackage.FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE;
				case CorePackage.CORE_FEATURE___DELETE: return FmPackage.FEATURE___DELETE;
				case CorePackage.CORE_FEATURE___RENAME__STRING: return FmPackage.FEATURE___RENAME__STRING;
				case CorePackage.CORE_FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE: return FmPackage.FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE;
				case CorePackage.CORE_FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE: return FmPackage.FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE;
				case CorePackage.CORE_FEATURE___REQUIRES__COREFEATURE: return FmPackage.FEATURE___REQUIRES__COREFEATURE;
				case CorePackage.CORE_FEATURE___EXCLUDES__COREFEATURE: return FmPackage.FEATURE___EXCLUDES__COREFEATURE;
				case CorePackage.CORE_FEATURE___REMOVE_CONSTRAINT__COREFEATURE: return FmPackage.FEATURE___REMOVE_CONSTRAINT__COREFEATURE;
				case CorePackage.CORE_FEATURE___ADD_REALIZED_BY__COREMODEL: return FmPackage.FEATURE___ADD_REALIZED_BY__COREMODEL;
				case CorePackage.CORE_FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST: return FmPackage.FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FmPackage.FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE:
				return addFeature((Integer)arguments.get(0), (String)arguments.get(1), (COREFeatureRelationshipType)arguments.get(2));
			case FmPackage.FEATURE___DELETE:
				return delete();
			case FmPackage.FEATURE___RENAME__STRING:
				rename((String)arguments.get(0));
				return null;
			case FmPackage.FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE:
				return changeLink((COREFeatureRelationshipType)arguments.get(0));
			case FmPackage.FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE:
				return changeParent((COREFeature)arguments.get(0), (COREFeatureRelationshipType)arguments.get(1));
			case FmPackage.FEATURE___REQUIRES__COREFEATURE:
				return requires((COREFeature)arguments.get(0));
			case FmPackage.FEATURE___EXCLUDES__COREFEATURE:
				return excludes((COREFeature)arguments.get(0));
			case FmPackage.FEATURE___REMOVE_CONSTRAINT__COREFEATURE:
				return removeConstraint((COREFeature)arguments.get(0));
			case FmPackage.FEATURE___ADD_REALIZED_BY__COREMODEL:
				return addRealizedBy((COREModel)arguments.get(0));
			case FmPackage.FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST:
				return AssociateReuse((COREReuse)arguments.get(0), (EList<?>)arguments.get(1), (EList<?>)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selectable: ");
		result.append(selectable);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
