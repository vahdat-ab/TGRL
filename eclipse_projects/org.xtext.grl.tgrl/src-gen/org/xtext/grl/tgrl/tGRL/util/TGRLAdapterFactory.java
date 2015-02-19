/**
 */
package org.xtext.grl.tgrl.tGRL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.grl.tgrl.tGRL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage
 * @generated
 */
public class TGRLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TGRLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TGRLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TGRLPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected TGRLSwitch<Adapter> modelSwitch =
    new TGRLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseGRLBaseElement(GRLBaseElement object)
      {
        return createGRLBaseElementAdapter();
      }
      @Override
      public Adapter caseGRLElement(GRLElement object)
      {
        return createGRLElementAdapter();
      }
      @Override
      public Adapter caseIntentionalElement(IntentionalElement object)
      {
        return createIntentionalElementAdapter();
      }
      @Override
      public Adapter caseElementLink(ElementLink object)
      {
        return createElementLinkAdapter();
      }
      @Override
      public Adapter caseGRLSpecification(GRLSpecification object)
      {
        return createGRLSpecificationAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseSoftgoal(Softgoal object)
      {
        return createSoftgoalAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseIndicator(Indicator object)
      {
        return createIndicatorAdapter();
      }
      @Override
      public Adapter caseConnection(Connection object)
      {
        return createConnectionAdapter();
      }
      @Override
      public Adapter caseDecompositionLink(DecompositionLink object)
      {
        return createDecompositionLinkAdapter();
      }
      @Override
      public Adapter caseDecompositionEnds(DecompositionEnds object)
      {
        return createDecompositionEndsAdapter();
      }
      @Override
      public Adapter caseContributionLink(ContributionLink object)
      {
        return createContributionLinkAdapter();
      }
      @Override
      public Adapter caseContributionEnds(ContributionEnds object)
      {
        return createContributionEndsAdapter();
      }
      @Override
      public Adapter caseDependencyLink(DependencyLink object)
      {
        return createDependencyLinkAdapter();
      }
      @Override
      public Adapter caseDependencyEnds(DependencyEnds object)
      {
        return createDependencyEndsAdapter();
      }
      @Override
      public Adapter caseKPIConversion(KPIConversion object)
      {
        return createKPIConversionAdapter();
      }
      @Override
      public Adapter caseBelief(Belief object)
      {
        return createBeliefAdapter();
      }
      @Override
      public Adapter caseCollapsedActorRef(CollapsedActorRef object)
      {
        return createCollapsedActorRefAdapter();
      }
      @Override
      public Adapter caseIntentionalElementRef(IntentionalElementRef object)
      {
        return createIntentionalElementRefAdapter();
      }
      @Override
      public Adapter caseImpactModel(ImpactModel object)
      {
        return createImpactModelAdapter();
      }
      @Override
      public Adapter caseStrategiesGroup(StrategiesGroup object)
      {
        return createStrategiesGroupAdapter();
      }
      @Override
      public Adapter caseEvaluationStrategy(EvaluationStrategy object)
      {
        return createEvaluationStrategyAdapter();
      }
      @Override
      public Adapter caseEvaluation(Evaluation object)
      {
        return createEvaluationAdapter();
      }
      @Override
      public Adapter caseEvaluationRange(EvaluationRange object)
      {
        return createEvaluationRangeAdapter();
      }
      @Override
      public Adapter caseContributionContextGroup(ContributionContextGroup object)
      {
        return createContributionContextGroupAdapter();
      }
      @Override
      public Adapter caseContributionContext(ContributionContext object)
      {
        return createContributionContextAdapter();
      }
      @Override
      public Adapter caseContributionChange(ContributionChange object)
      {
        return createContributionChangeAdapter();
      }
      @Override
      public Adapter caseContributionRange(ContributionRange object)
      {
        return createContributionRangeAdapter();
      }
      @Override
      public Adapter caseQualitativeMappings(QualitativeMappings object)
      {
        return createQualitativeMappingsAdapter();
      }
      @Override
      public Adapter caseKPIEvalValueSet(KPIEvalValueSet object)
      {
        return createKPIEvalValueSetAdapter();
      }
      @Override
      public Adapter caseQualitativeMapping(QualitativeMapping object)
      {
        return createQualitativeMappingAdapter();
      }
      @Override
      public Adapter caseKPINewEvalValue(KPINewEvalValue object)
      {
        return createKPINewEvalValueAdapter();
      }
      @Override
      public Adapter caseKPIInformationConfig(KPIInformationConfig object)
      {
        return createKPIInformationConfigAdapter();
      }
      @Override
      public Adapter caseKPIInformationElement(KPIInformationElement object)
      {
        return createKPIInformationElementAdapter();
      }
      @Override
      public Adapter caseKPIInformationElementRef(KPIInformationElementRef object)
      {
        return createKPIInformationElementRefAdapter();
      }
      @Override
      public Adapter caseKPIModelLink(KPIModelLink object)
      {
        return createKPIModelLinkAdapter();
      }
      @Override
      public Adapter caseIndicatorGroup(IndicatorGroup object)
      {
        return createIndicatorGroupAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.GRLBaseElement <em>GRL Base Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.GRLBaseElement
   * @generated
   */
  public Adapter createGRLBaseElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.GRLElement <em>GRL Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement
   * @generated
   */
  public Adapter createGRLElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement <em>Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement
   * @generated
   */
  public Adapter createIntentionalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ElementLink <em>Element Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink
   * @generated
   */
  public Adapter createElementLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.GRLSpecification <em>GRL Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.GRLSpecification
   * @generated
   */
  public Adapter createGRLSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Softgoal <em>Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Softgoal
   * @generated
   */
  public Adapter createSoftgoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Indicator <em>Indicator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Indicator
   * @generated
   */
  public Adapter createIndicatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Connection
   * @generated
   */
  public Adapter createConnectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DecompositionLink <em>Decomposition Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionLink
   * @generated
   */
  public Adapter createDecompositionLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DecompositionEnds <em>Decomposition Ends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionEnds
   * @generated
   */
  public Adapter createDecompositionEndsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionLink <em>Contribution Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink
   * @generated
   */
  public Adapter createContributionLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionEnds <em>Contribution Ends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnds
   * @generated
   */
  public Adapter createContributionEndsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DependencyLink <em>Dependency Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DependencyLink
   * @generated
   */
  public Adapter createDependencyLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DependencyEnds <em>Dependency Ends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DependencyEnds
   * @generated
   */
  public Adapter createDependencyEndsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIConversion <em>KPI Conversion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIConversion
   * @generated
   */
  public Adapter createKPIConversionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Belief
   * @generated
   */
  public Adapter createBeliefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.CollapsedActorRef
   * @generated
   */
  public Adapter createCollapsedActorRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef <em>Intentional Element Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef
   * @generated
   */
  public Adapter createIntentionalElementRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ImpactModel <em>Impact Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ImpactModel
   * @generated
   */
  public Adapter createImpactModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.StrategiesGroup <em>Strategies Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.StrategiesGroup
   * @generated
   */
  public Adapter createStrategiesGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy <em>Evaluation Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy
   * @generated
   */
  public Adapter createEvaluationStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation
   * @generated
   */
  public Adapter createEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange <em>Evaluation Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationRange
   * @generated
   */
  public Adapter createEvaluationRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup <em>Contribution Context Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContextGroup
   * @generated
   */
  public Adapter createContributionContextGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionContext <em>Contribution Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext
   * @generated
   */
  public Adapter createContributionContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionChange <em>Contribution Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange
   * @generated
   */
  public Adapter createContributionChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionRange <em>Contribution Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionRange
   * @generated
   */
  public Adapter createContributionRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings <em>Qualitative Mappings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMappings
   * @generated
   */
  public Adapter createQualitativeMappingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet <em>KPI Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet
   * @generated
   */
  public Adapter createKPIEvalValueSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping <em>Qualitative Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping
   * @generated
   */
  public Adapter createQualitativeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue <em>KPI New Eval Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPINewEvalValue
   * @generated
   */
  public Adapter createKPINewEvalValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig <em>KPI Information Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig
   * @generated
   */
  public Adapter createKPIInformationConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement <em>KPI Information Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement
   * @generated
   */
  public Adapter createKPIInformationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElementRef <em>KPI Information Element Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElementRef
   * @generated
   */
  public Adapter createKPIInformationElementRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIModelLink <em>KPI Model Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIModelLink
   * @generated
   */
  public Adapter createKPIModelLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup <em>Indicator Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup
   * @generated
   */
  public Adapter createIndicatorGroupAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TGRLAdapterFactory
