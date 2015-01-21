/**
 */
package grl.util;

import core.COREImpactModel;
import core.COREModel;
import core.CORENamedElement;

import grl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import urncore.GRLmodelElement;
import urncore.IURNConnection;
import urncore.IURNContainer;
import urncore.IURNContainerRef;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see grl.GrlPackage
 * @generated
 */
public class GrlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrlPackage.eINSTANCE;
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
	protected GrlSwitch<Adapter> modelSwitch =
		new GrlSwitch<Adapter>() {
			@Override
			public Adapter caseGRLspec(GRLspec object) {
				return createGRLspecAdapter();
			}
			@Override
			public Adapter caseBelief(Belief object) {
				return createBeliefAdapter();
			}
			@Override
			public Adapter caseIntentionalElement(IntentionalElement object) {
				return createIntentionalElementAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseGRLGraph(GRLGraph object) {
				return createGRLGraphAdapter();
			}
			@Override
			public Adapter caseActorRef(ActorRef object) {
				return createActorRefAdapter();
			}
			@Override
			public Adapter caseIntentionalElementRef(IntentionalElementRef object) {
				return createIntentionalElementRefAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseLinkRef(LinkRef object) {
				return createLinkRefAdapter();
			}
			@Override
			public Adapter caseElementLink(ElementLink object) {
				return createElementLinkAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseEvaluationStrategy(EvaluationStrategy object) {
				return createEvaluationStrategyAdapter();
			}
			@Override
			public Adapter caseGRLNode(GRLNode object) {
				return createGRLNodeAdapter();
			}
			@Override
			public Adapter caseLinkRefBendpoint(LinkRefBendpoint object) {
				return createLinkRefBendpointAdapter();
			}
			@Override
			public Adapter caseBeliefLink(BeliefLink object) {
				return createBeliefLinkAdapter();
			}
			@Override
			public Adapter caseStrategiesGroup(StrategiesGroup object) {
				return createStrategiesGroupAdapter();
			}
			@Override
			public Adapter caseContributionContextGroup(ContributionContextGroup object) {
				return createContributionContextGroupAdapter();
			}
			@Override
			public Adapter caseContributionContext(ContributionContext object) {
				return createContributionContextAdapter();
			}
			@Override
			public Adapter caseContributionChange(ContributionChange object) {
				return createContributionChangeAdapter();
			}
			@Override
			public Adapter caseGRLLinkableElement(GRLLinkableElement object) {
				return createGRLLinkableElementAdapter();
			}
			@Override
			public Adapter caseCollapsedActorRef(CollapsedActorRef object) {
				return createCollapsedActorRefAdapter();
			}
			@Override
			public Adapter caseEvaluationRange(EvaluationRange object) {
				return createEvaluationRangeAdapter();
			}
			@Override
			public Adapter caseContributionRange(ContributionRange object) {
				return createContributionRangeAdapter();
			}
			@Override
			public Adapter caseImpactModel(ImpactModel object) {
				return createImpactModelAdapter();
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
			public Adapter caseGRLmodelElement(GRLmodelElement object) {
				return createGRLmodelElementAdapter();
			}
			@Override
			public Adapter caseIURNNode(IURNNode object) {
				return createIURNNodeAdapter();
			}
			@Override
			public Adapter caseIURNContainer(IURNContainer object) {
				return createIURNContainerAdapter();
			}
			@Override
			public Adapter caseIURNDiagram(IURNDiagram object) {
				return createIURNDiagramAdapter();
			}
			@Override
			public Adapter caseIURNContainerRef(IURNContainerRef object) {
				return createIURNContainerRefAdapter();
			}
			@Override
			public Adapter caseIURNConnection(IURNConnection object) {
				return createIURNConnectionAdapter();
			}
			@Override
			public Adapter caseCOREModel(COREModel object) {
				return createCOREModelAdapter();
			}
			@Override
			public Adapter caseCOREImpactModel(COREImpactModel object) {
				return createCOREImpactModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link grl.GRLspec <em>GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLspec
	 * @generated
	 */
	public Adapter createGRLspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Belief
	 * @generated
	 */
	public Adapter createBeliefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.IntentionalElement
	 * @generated
	 */
	public Adapter createIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.GRLGraph <em>GRL Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLGraph
	 * @generated
	 */
	public Adapter createGRLGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ActorRef <em>Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ActorRef
	 * @generated
	 */
	public Adapter createActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.IntentionalElementRef <em>Intentional Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.IntentionalElementRef
	 * @generated
	 */
	public Adapter createIntentionalElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.LinkRef <em>Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.LinkRef
	 * @generated
	 */
	public Adapter createLinkRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ElementLink <em>Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ElementLink
	 * @generated
	 */
	public Adapter createElementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.EvaluationStrategy <em>Evaluation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.EvaluationStrategy
	 * @generated
	 */
	public Adapter createEvaluationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.GRLNode <em>GRL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLNode
	 * @generated
	 */
	public Adapter createGRLNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.LinkRefBendpoint <em>Link Ref Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.LinkRefBendpoint
	 * @generated
	 */
	public Adapter createLinkRefBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.BeliefLink <em>Belief Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.BeliefLink
	 * @generated
	 */
	public Adapter createBeliefLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.StrategiesGroup <em>Strategies Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.StrategiesGroup
	 * @generated
	 */
	public Adapter createStrategiesGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ContributionContextGroup <em>Contribution Context Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ContributionContextGroup
	 * @generated
	 */
	public Adapter createContributionContextGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ContributionContext <em>Contribution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ContributionContext
	 * @generated
	 */
	public Adapter createContributionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ContributionChange <em>Contribution Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ContributionChange
	 * @generated
	 */
	public Adapter createContributionChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.GRLLinkableElement <em>GRL Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.GRLLinkableElement
	 * @generated
	 */
	public Adapter createGRLLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.CollapsedActorRef
	 * @generated
	 */
	public Adapter createCollapsedActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.EvaluationRange <em>Evaluation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.EvaluationRange
	 * @generated
	 */
	public Adapter createEvaluationRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ContributionRange <em>Contribution Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ContributionRange
	 * @generated
	 */
	public Adapter createContributionRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grl.ImpactModel <em>Impact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grl.ImpactModel
	 * @generated
	 */
	public Adapter createImpactModelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link urncore.GRLmodelElement <em>GR Lmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.GRLmodelElement
	 * @generated
	 */
	public Adapter createGRLmodelElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link urncore.IURNContainer <em>IURN Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNContainer
	 * @generated
	 */
	public Adapter createIURNContainerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link core.COREImpactModel <em>CORE Impact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREImpactModel
	 * @generated
	 */
	public Adapter createCOREImpactModelAdapter() {
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

} //GrlAdapterFactory
