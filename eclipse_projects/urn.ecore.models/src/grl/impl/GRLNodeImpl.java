/**
 */
package grl.impl;

import grl.GRLNode;
import grl.GrlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import urncore.IURNConnection;
import urncore.IURNContainerRef;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.NodeLabel;
import urncore.UrncorePackage;

import urncore.impl.GRLmodelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GRL Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grl.impl.GRLNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getContRef <em>Cont Ref</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getSucc <em>Succ</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link grl.impl.GRLNodeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GRLNodeImpl extends GRLmodelElementImpl implements GRLNode {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContRef() <em>Cont Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContRef()
	 * @generated
	 * @ordered
	 */
	protected IURNContainerRef contRef;

	/**
	 * The cached value of the '{@link #getSucc() <em>Succ</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucc()
	 * @generated
	 * @ordered
	 */
	protected EList<IURNConnection> succ;

	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected EList<IURNConnection> pred;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected NodeLabel label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GRLNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrlPackage.Literals.GRL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNDiagram getDiagram() {
		if (eContainerFeatureID() != GrlPackage.GRL_NODE__DIAGRAM) return null;
		return (IURNDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(IURNDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, GrlPackage.GRL_NODE__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(IURNDiagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != GrlPackage.GRL_NODE__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, UrncorePackage.IURN_DIAGRAM__NODES, IURNDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNContainerRef getContRef() {
		if (contRef != null && contRef.eIsProxy()) {
			InternalEObject oldContRef = (InternalEObject)contRef;
			contRef = (IURNContainerRef)eResolveProxy(oldContRef);
			if (contRef != oldContRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrlPackage.GRL_NODE__CONT_REF, oldContRef, contRef));
			}
		}
		return contRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNContainerRef basicGetContRef() {
		return contRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContRef(IURNContainerRef newContRef, NotificationChain msgs) {
		IURNContainerRef oldContRef = contRef;
		contRef = newContRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__CONT_REF, oldContRef, newContRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContRef(IURNContainerRef newContRef) {
		if (newContRef != contRef) {
			NotificationChain msgs = null;
			if (contRef != null)
				msgs = ((InternalEObject)contRef).eInverseRemove(this, UrncorePackage.IURN_CONTAINER_REF__NODES, IURNContainerRef.class, msgs);
			if (newContRef != null)
				msgs = ((InternalEObject)newContRef).eInverseAdd(this, UrncorePackage.IURN_CONTAINER_REF__NODES, IURNContainerRef.class, msgs);
			msgs = basicSetContRef(newContRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__CONT_REF, newContRef, newContRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IURNConnection> getSucc() {
		if (succ == null) {
			succ = new EObjectWithInverseResolvingEList<IURNConnection>(IURNConnection.class, this, GrlPackage.GRL_NODE__SUCC, UrncorePackage.IURN_CONNECTION__SOURCE);
		}
		return succ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IURNConnection> getPred() {
		if (pred == null) {
			pred = new EObjectWithInverseResolvingEList<IURNConnection>(IURNConnection.class, this, GrlPackage.GRL_NODE__PRED, UrncorePackage.IURN_CONNECTION__TARGET);
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(NodeLabel newLabel, NotificationChain msgs) {
		NodeLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(NodeLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, UrncorePackage.NODE_LABEL__NODE, NodeLabel.class, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, UrncorePackage.NODE_LABEL__NODE, NodeLabel.class, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.GRL_NODE__LABEL, newLabel, newLabel));
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
			case GrlPackage.GRL_NODE__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((IURNDiagram)otherEnd, msgs);
			case GrlPackage.GRL_NODE__CONT_REF:
				if (contRef != null)
					msgs = ((InternalEObject)contRef).eInverseRemove(this, UrncorePackage.IURN_CONTAINER_REF__NODES, IURNContainerRef.class, msgs);
				return basicSetContRef((IURNContainerRef)otherEnd, msgs);
			case GrlPackage.GRL_NODE__SUCC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSucc()).basicAdd(otherEnd, msgs);
			case GrlPackage.GRL_NODE__PRED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPred()).basicAdd(otherEnd, msgs);
			case GrlPackage.GRL_NODE__LABEL:
				if (label != null)
					msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrlPackage.GRL_NODE__LABEL, null, msgs);
				return basicSetLabel((NodeLabel)otherEnd, msgs);
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
			case GrlPackage.GRL_NODE__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case GrlPackage.GRL_NODE__CONT_REF:
				return basicSetContRef(null, msgs);
			case GrlPackage.GRL_NODE__SUCC:
				return ((InternalEList<?>)getSucc()).basicRemove(otherEnd, msgs);
			case GrlPackage.GRL_NODE__PRED:
				return ((InternalEList<?>)getPred()).basicRemove(otherEnd, msgs);
			case GrlPackage.GRL_NODE__LABEL:
				return basicSetLabel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GrlPackage.GRL_NODE__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, UrncorePackage.IURN_DIAGRAM__NODES, IURNDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrlPackage.GRL_NODE__X:
				return getX();
			case GrlPackage.GRL_NODE__Y:
				return getY();
			case GrlPackage.GRL_NODE__DIAGRAM:
				return getDiagram();
			case GrlPackage.GRL_NODE__CONT_REF:
				if (resolve) return getContRef();
				return basicGetContRef();
			case GrlPackage.GRL_NODE__SUCC:
				return getSucc();
			case GrlPackage.GRL_NODE__PRED:
				return getPred();
			case GrlPackage.GRL_NODE__LABEL:
				return getLabel();
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
			case GrlPackage.GRL_NODE__X:
				setX((Integer)newValue);
				return;
			case GrlPackage.GRL_NODE__Y:
				setY((Integer)newValue);
				return;
			case GrlPackage.GRL_NODE__DIAGRAM:
				setDiagram((IURNDiagram)newValue);
				return;
			case GrlPackage.GRL_NODE__CONT_REF:
				setContRef((IURNContainerRef)newValue);
				return;
			case GrlPackage.GRL_NODE__SUCC:
				getSucc().clear();
				getSucc().addAll((Collection<? extends IURNConnection>)newValue);
				return;
			case GrlPackage.GRL_NODE__PRED:
				getPred().clear();
				getPred().addAll((Collection<? extends IURNConnection>)newValue);
				return;
			case GrlPackage.GRL_NODE__LABEL:
				setLabel((NodeLabel)newValue);
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
			case GrlPackage.GRL_NODE__X:
				setX(X_EDEFAULT);
				return;
			case GrlPackage.GRL_NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case GrlPackage.GRL_NODE__DIAGRAM:
				setDiagram((IURNDiagram)null);
				return;
			case GrlPackage.GRL_NODE__CONT_REF:
				setContRef((IURNContainerRef)null);
				return;
			case GrlPackage.GRL_NODE__SUCC:
				getSucc().clear();
				return;
			case GrlPackage.GRL_NODE__PRED:
				getPred().clear();
				return;
			case GrlPackage.GRL_NODE__LABEL:
				setLabel((NodeLabel)null);
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
			case GrlPackage.GRL_NODE__X:
				return x != X_EDEFAULT;
			case GrlPackage.GRL_NODE__Y:
				return y != Y_EDEFAULT;
			case GrlPackage.GRL_NODE__DIAGRAM:
				return getDiagram() != null;
			case GrlPackage.GRL_NODE__CONT_REF:
				return contRef != null;
			case GrlPackage.GRL_NODE__SUCC:
				return succ != null && !succ.isEmpty();
			case GrlPackage.GRL_NODE__PRED:
				return pred != null && !pred.isEmpty();
			case GrlPackage.GRL_NODE__LABEL:
				return label != null;
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
		if (baseClass == IURNNode.class) {
			switch (derivedFeatureID) {
				case GrlPackage.GRL_NODE__X: return UrncorePackage.IURN_NODE__X;
				case GrlPackage.GRL_NODE__Y: return UrncorePackage.IURN_NODE__Y;
				case GrlPackage.GRL_NODE__DIAGRAM: return UrncorePackage.IURN_NODE__DIAGRAM;
				case GrlPackage.GRL_NODE__CONT_REF: return UrncorePackage.IURN_NODE__CONT_REF;
				case GrlPackage.GRL_NODE__SUCC: return UrncorePackage.IURN_NODE__SUCC;
				case GrlPackage.GRL_NODE__PRED: return UrncorePackage.IURN_NODE__PRED;
				case GrlPackage.GRL_NODE__LABEL: return UrncorePackage.IURN_NODE__LABEL;
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
		if (baseClass == IURNNode.class) {
			switch (baseFeatureID) {
				case UrncorePackage.IURN_NODE__X: return GrlPackage.GRL_NODE__X;
				case UrncorePackage.IURN_NODE__Y: return GrlPackage.GRL_NODE__Y;
				case UrncorePackage.IURN_NODE__DIAGRAM: return GrlPackage.GRL_NODE__DIAGRAM;
				case UrncorePackage.IURN_NODE__CONT_REF: return GrlPackage.GRL_NODE__CONT_REF;
				case UrncorePackage.IURN_NODE__SUCC: return GrlPackage.GRL_NODE__SUCC;
				case UrncorePackage.IURN_NODE__PRED: return GrlPackage.GRL_NODE__PRED;
				case UrncorePackage.IURN_NODE__LABEL: return GrlPackage.GRL_NODE__LABEL;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //GRLNodeImpl
