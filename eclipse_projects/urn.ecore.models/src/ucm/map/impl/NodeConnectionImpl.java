/**
 */
package ucm.map.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ucm.map.InBinding;
import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.OutBinding;

import urncore.Condition;
import urncore.ConnectionLabel;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.UrncorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getOutBindings <em>Out Bindings</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getOutBindingsPlugin <em>Out Bindings Plugin</em>}</li>
 *   <li>{@link ucm.map.impl.NodeConnectionImpl#getInBindingsPlugin <em>In Bindings Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeConnectionImpl extends MinimalEObjectImpl.Container implements NodeConnection {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IURNNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IURNNode target;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected ConnectionLabel label;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected String threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInBindings() <em>In Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<InBinding> inBindings;

	/**
	 * The cached value of the '{@link #getOutBindings() <em>Out Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OutBinding> outBindings;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getOutBindingsPlugin() <em>Out Bindings Plugin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBindingsPlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<OutBinding> outBindingsPlugin;

	/**
	 * The cached value of the '{@link #getInBindingsPlugin() <em>In Bindings Plugin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindingsPlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<InBinding> inBindingsPlugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.NODE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IURNNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapPackage.NODE_CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(IURNNode newSource, NotificationChain msgs) {
		IURNNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IURNNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, UrncorePackage.IURN_NODE__SUCC, IURNNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, UrncorePackage.IURN_NODE__SUCC, IURNNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IURNNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapPackage.NODE_CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(IURNNode newTarget, NotificationChain msgs) {
		IURNNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IURNNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, UrncorePackage.IURN_NODE__PRED, IURNNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, UrncorePackage.IURN_NODE__PRED, IURNNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IURNDiagram getDiagram() {
		if (eContainerFeatureID() != MapPackage.NODE_CONNECTION__DIAGRAM) return null;
		return (IURNDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(IURNDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, MapPackage.NODE_CONNECTION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(IURNDiagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != MapPackage.NODE_CONNECTION__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, UrncorePackage.IURN_DIAGRAM__CONNECTIONS, IURNDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(ConnectionLabel newLabel, NotificationChain msgs) {
		ConnectionLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(ConnectionLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, UrncorePackage.CONNECTION_LABEL__CONNECTION, ConnectionLabel.class, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, UrncorePackage.CONNECTION_LABEL__CONNECTION, ConnectionLabel.class, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(String newThreshold) {
		String oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InBinding> getInBindings() {
		if (inBindings == null) {
			inBindings = new EObjectWithInverseResolvingEList<InBinding>(InBinding.class, this, MapPackage.NODE_CONNECTION__IN_BINDINGS, MapPackage.IN_BINDING__STUB_ENTRY);
		}
		return inBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutBinding> getOutBindings() {
		if (outBindings == null) {
			outBindings = new EObjectWithInverseResolvingEList<OutBinding>(OutBinding.class, this, MapPackage.NODE_CONNECTION__OUT_BINDINGS, MapPackage.OUT_BINDING__STUB_EXIT);
		}
		return outBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, UrncorePackage.CONDITION__NODE_CONNECTION, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, UrncorePackage.CONDITION__NODE_CONNECTION, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.NODE_CONNECTION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutBinding> getOutBindingsPlugin() {
		if (outBindingsPlugin == null) {
			outBindingsPlugin = new EObjectWithInverseResolvingEList<OutBinding>(OutBinding.class, this, MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN, MapPackage.OUT_BINDING__POINTCUT_ENTRY);
		}
		return outBindingsPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InBinding> getInBindingsPlugin() {
		if (inBindingsPlugin == null) {
			inBindingsPlugin = new EObjectWithInverseResolvingEList<InBinding>(InBinding.class, this, MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN, MapPackage.IN_BINDING__POINTCUT_EXIT);
		}
		return inBindingsPlugin;
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, UrncorePackage.IURN_NODE__SUCC, IURNNode.class, msgs);
				return basicSetSource((IURNNode)otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, UrncorePackage.IURN_NODE__PRED, IURNNode.class, msgs);
				return basicSetTarget((IURNNode)otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((IURNDiagram)otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__LABEL:
				if (label != null)
					msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapPackage.NODE_CONNECTION__LABEL, null, msgs);
				return basicSetLabel((ConnectionLabel)otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInBindings()).basicAdd(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutBindings()).basicAdd(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapPackage.NODE_CONNECTION__CONDITION, null, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutBindingsPlugin()).basicAdd(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInBindingsPlugin()).basicAdd(otherEnd, msgs);
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				return basicSetSource(null, msgs);
			case MapPackage.NODE_CONNECTION__TARGET:
				return basicSetTarget(null, msgs);
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case MapPackage.NODE_CONNECTION__LABEL:
				return basicSetLabel(null, msgs);
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				return ((InternalEList<?>)getInBindings()).basicRemove(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				return ((InternalEList<?>)getOutBindings()).basicRemove(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__CONDITION:
				return basicSetCondition(null, msgs);
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				return ((InternalEList<?>)getOutBindingsPlugin()).basicRemove(otherEnd, msgs);
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				return ((InternalEList<?>)getInBindingsPlugin()).basicRemove(otherEnd, msgs);
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
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, UrncorePackage.IURN_DIAGRAM__CONNECTIONS, IURNDiagram.class, msgs);
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MapPackage.NODE_CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				return getDiagram();
			case MapPackage.NODE_CONNECTION__LABEL:
				return getLabel();
			case MapPackage.NODE_CONNECTION__PROBABILITY:
				return getProbability();
			case MapPackage.NODE_CONNECTION__THRESHOLD:
				return getThreshold();
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				return getInBindings();
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				return getOutBindings();
			case MapPackage.NODE_CONNECTION__CONDITION:
				return getCondition();
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				return getOutBindingsPlugin();
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				return getInBindingsPlugin();
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				setSource((IURNNode)newValue);
				return;
			case MapPackage.NODE_CONNECTION__TARGET:
				setTarget((IURNNode)newValue);
				return;
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				setDiagram((IURNDiagram)newValue);
				return;
			case MapPackage.NODE_CONNECTION__LABEL:
				setLabel((ConnectionLabel)newValue);
				return;
			case MapPackage.NODE_CONNECTION__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case MapPackage.NODE_CONNECTION__THRESHOLD:
				setThreshold((String)newValue);
				return;
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				getInBindings().clear();
				getInBindings().addAll((Collection<? extends InBinding>)newValue);
				return;
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				getOutBindings().clear();
				getOutBindings().addAll((Collection<? extends OutBinding>)newValue);
				return;
			case MapPackage.NODE_CONNECTION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				getOutBindingsPlugin().clear();
				getOutBindingsPlugin().addAll((Collection<? extends OutBinding>)newValue);
				return;
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				getInBindingsPlugin().clear();
				getInBindingsPlugin().addAll((Collection<? extends InBinding>)newValue);
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				setSource((IURNNode)null);
				return;
			case MapPackage.NODE_CONNECTION__TARGET:
				setTarget((IURNNode)null);
				return;
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				setDiagram((IURNDiagram)null);
				return;
			case MapPackage.NODE_CONNECTION__LABEL:
				setLabel((ConnectionLabel)null);
				return;
			case MapPackage.NODE_CONNECTION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case MapPackage.NODE_CONNECTION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				getInBindings().clear();
				return;
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				getOutBindings().clear();
				return;
			case MapPackage.NODE_CONNECTION__CONDITION:
				setCondition((Condition)null);
				return;
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				getOutBindingsPlugin().clear();
				return;
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				getInBindingsPlugin().clear();
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
			case MapPackage.NODE_CONNECTION__SOURCE:
				return source != null;
			case MapPackage.NODE_CONNECTION__TARGET:
				return target != null;
			case MapPackage.NODE_CONNECTION__DIAGRAM:
				return getDiagram() != null;
			case MapPackage.NODE_CONNECTION__LABEL:
				return label != null;
			case MapPackage.NODE_CONNECTION__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case MapPackage.NODE_CONNECTION__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
			case MapPackage.NODE_CONNECTION__IN_BINDINGS:
				return inBindings != null && !inBindings.isEmpty();
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS:
				return outBindings != null && !outBindings.isEmpty();
			case MapPackage.NODE_CONNECTION__CONDITION:
				return condition != null;
			case MapPackage.NODE_CONNECTION__OUT_BINDINGS_PLUGIN:
				return outBindingsPlugin != null && !outBindingsPlugin.isEmpty();
			case MapPackage.NODE_CONNECTION__IN_BINDINGS_PLUGIN:
				return inBindingsPlugin != null && !inBindingsPlugin.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} //NodeConnectionImpl
