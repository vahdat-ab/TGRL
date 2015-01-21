/**
 */
package ucm.map.util;

import core.COREModel;
import core.CORENamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucm.map.*;

import urncore.IURNConnection;
import urncore.IURNContainerRef;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.UCMmodelElement;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucm.map.MapPackage
 * @generated
 */
public class MapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapSwitch<Adapter> modelSwitch =
		new MapSwitch<Adapter>() {
			@Override
			public Adapter caseAndJoin(AndJoin object) {
				return createAndJoinAdapter();
			}
			@Override
			public Adapter caseOutBinding(OutBinding object) {
				return createOutBindingAdapter();
			}
			@Override
			public Adapter caseInBinding(InBinding object) {
				return createInBindingAdapter();
			}
			@Override
			public Adapter caseRespRef(RespRef object) {
				return createRespRefAdapter();
			}
			@Override
			public Adapter caseOrJoin(OrJoin object) {
				return createOrJoinAdapter();
			}
			@Override
			public Adapter caseOrFork(OrFork object) {
				return createOrForkAdapter();
			}
			@Override
			public Adapter caseConnect(Connect object) {
				return createConnectAdapter();
			}
			@Override
			public Adapter caseNodeConnection(NodeConnection object) {
				return createNodeConnectionAdapter();
			}
			@Override
			public Adapter caseWaitingPlace(WaitingPlace object) {
				return createWaitingPlaceAdapter();
			}
			@Override
			public Adapter caseStub(Stub object) {
				return createStubAdapter();
			}
			@Override
			public Adapter casePathNode(PathNode object) {
				return createPathNodeAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseStartPoint(StartPoint object) {
				return createStartPointAdapter();
			}
			@Override
			public Adapter caseUCMmap(UCMmap object) {
				return createUCMmapAdapter();
			}
			@Override
			public Adapter casePluginBinding(PluginBinding object) {
				return createPluginBindingAdapter();
			}
			@Override
			public Adapter caseComponentRef(ComponentRef object) {
				return createComponentRefAdapter();
			}
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseAndFork(AndFork object) {
				return createAndForkAdapter();
			}
			@Override
			public Adapter caseEmptyPoint(EmptyPoint object) {
				return createEmptyPointAdapter();
			}
			@Override
			public Adapter caseDirectionArrow(DirectionArrow object) {
				return createDirectionArrowAdapter();
			}
			@Override
			public Adapter caseComponentBinding(ComponentBinding object) {
				return createComponentBindingAdapter();
			}
			@Override
			public Adapter caseAnything(Anything object) {
				return createAnythingAdapter();
			}
			@Override
			public Adapter caseFailurePoint(FailurePoint object) {
				return createFailurePointAdapter();
			}
			@Override
			public Adapter caseResponsibilityBinding(ResponsibilityBinding object) {
				return createResponsibilityBindingAdapter();
			}
			@Override
			public Adapter caseCORENamedElement(CORENamedElement object) {
				return createCORENamedElementAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseUCMmodelElement(UCMmodelElement object) {
				return createUCMmodelElementAdapter();
			}
			@Override
			public Adapter caseIURNNode(IURNNode object) {
				return createIURNNodeAdapter();
			}
			@Override
			public Adapter caseIURNConnection(IURNConnection object) {
				return createIURNConnectionAdapter();
			}
			@Override
			public Adapter caseIURNDiagram(IURNDiagram object) {
				return createIURNDiagramAdapter();
			}
			@Override
			public Adapter caseCOREModel(COREModel object) {
				return createCOREModelAdapter();
			}
			@Override
			public Adapter caseIURNContainerRef(IURNContainerRef object) {
				return createIURNContainerRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.AndJoin
	 * @generated
	 */
	public Adapter createAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.OutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.OutBinding
	 * @generated
	 */
	public Adapter createOutBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.InBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.InBinding
	 * @generated
	 */
	public Adapter createInBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.RespRef <em>Resp Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.RespRef
	 * @generated
	 */
	public Adapter createRespRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.OrJoin
	 * @generated
	 */
	public Adapter createOrJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.OrFork
	 * @generated
	 */
	public Adapter createOrForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.Connect
	 * @generated
	 */
	public Adapter createConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.NodeConnection <em>Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.NodeConnection
	 * @generated
	 */
	public Adapter createNodeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.WaitingPlace <em>Waiting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.WaitingPlace
	 * @generated
	 */
	public Adapter createWaitingPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.Stub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.Stub
	 * @generated
	 */
	public Adapter createStubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.StartPoint
	 * @generated
	 */
	public Adapter createStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.UCMmap <em>UC Mmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.UCMmap
	 * @generated
	 */
	public Adapter createUCMmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.PluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.PluginBinding
	 * @generated
	 */
	public Adapter createPluginBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.ComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.ComponentRef
	 * @generated
	 */
	public Adapter createComponentRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.AndFork
	 * @generated
	 */
	public Adapter createAndForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.EmptyPoint <em>Empty Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.EmptyPoint
	 * @generated
	 */
	public Adapter createEmptyPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.DirectionArrow <em>Direction Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.DirectionArrow
	 * @generated
	 */
	public Adapter createDirectionArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.ComponentBinding <em>Component Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.ComponentBinding
	 * @generated
	 */
	public Adapter createComponentBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.Anything <em>Anything</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.Anything
	 * @generated
	 */
	public Adapter createAnythingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.FailurePoint <em>Failure Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.FailurePoint
	 * @generated
	 */
	public Adapter createFailurePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.map.ResponsibilityBinding <em>Responsibility Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.map.ResponsibilityBinding
	 * @generated
	 */
	public Adapter createResponsibilityBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CORENamedElement <em>CORE Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CORENamedElement
	 * @generated
	 */
	public Adapter createCORENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.UCMmodelElement
	 * @generated
	 */
	public Adapter createUCMmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNNode <em>IURN Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNNode
	 * @generated
	 */
	public Adapter createIURNNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNConnection <em>IURN Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNConnection
	 * @generated
	 */
	public Adapter createIURNConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNDiagram <em>IURN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNDiagram
	 * @generated
	 */
	public Adapter createIURNDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREModel <em>CORE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREModel
	 * @generated
	 */
	public Adapter createCOREModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNContainerRef <em>IURN Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNContainerRef
	 * @generated
	 */
	public Adapter createIURNContainerRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MapAdapterFactory
