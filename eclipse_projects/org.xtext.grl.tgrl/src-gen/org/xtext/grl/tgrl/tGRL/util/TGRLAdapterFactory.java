/**
 */
package org.xtext.grl.tgrl.tGRL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.Belief;
import org.xtext.grl.tgrl.tGRL.Comment;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionGroup;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.DependencyEnd;
import org.xtext.grl.tgrl.tGRL.Element;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.EndLink;
import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLBaseElement;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.Goal;
import org.xtext.grl.tgrl.tGRL.InLineContribution;
import org.xtext.grl.tgrl.tGRL.InLineDecomposition;
import org.xtext.grl.tgrl.tGRL.InLineDependency;
import org.xtext.grl.tgrl.tGRL.InLineElementLink;
import org.xtext.grl.tgrl.tGRL.InLineLink;
import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.KPIEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.LinkType;
import org.xtext.grl.tgrl.tGRL.Mapping;
import org.xtext.grl.tgrl.tGRL.Metadata;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.NormalContribution;
import org.xtext.grl.tgrl.tGRL.NormalDecomposition;
import org.xtext.grl.tgrl.tGRL.NormalDependency;
import org.xtext.grl.tgrl.tGRL.NormalElementLink;
import org.xtext.grl.tgrl.tGRL.NormalLink;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.Resource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategyGroup;
import org.xtext.grl.tgrl.tGRL.SuperIntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.Task;

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
      public Adapter caseSuperIntentionalElement(SuperIntentionalElement object)
      {
        return createSuperIntentionalElementAdapter();
      }
      @Override
      public Adapter caseIntentionalElement(IntentionalElement object)
      {
        return createIntentionalElementAdapter();
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
      public Adapter caseBelief(Belief object)
      {
        return createBeliefAdapter();
      }
      @Override
      public Adapter caseElementLink(ElementLink object)
      {
        return createElementLinkAdapter();
      }
      @Override
      public Adapter caseEndLink(EndLink object)
      {
        return createEndLinkAdapter();
      }
      @Override
      public Adapter caseNormalElementLink(NormalElementLink object)
      {
        return createNormalElementLinkAdapter();
      }
      @Override
      public Adapter caseNormalLink(NormalLink object)
      {
        return createNormalLinkAdapter();
      }
      @Override
      public Adapter caseNormalDependency(NormalDependency object)
      {
        return createNormalDependencyAdapter();
      }
      @Override
      public Adapter caseNormalContribution(NormalContribution object)
      {
        return createNormalContributionAdapter();
      }
      @Override
      public Adapter caseNormalDecomposition(NormalDecomposition object)
      {
        return createNormalDecompositionAdapter();
      }
      @Override
      public Adapter caseInLineElementLink(InLineElementLink object)
      {
        return createInLineElementLinkAdapter();
      }
      @Override
      public Adapter caseInLineLink(InLineLink object)
      {
        return createInLineLinkAdapter();
      }
      @Override
      public Adapter caseInLineDependency(InLineDependency object)
      {
        return createInLineDependencyAdapter();
      }
      @Override
      public Adapter caseInLineContribution(InLineContribution object)
      {
        return createInLineContributionAdapter();
      }
      @Override
      public Adapter caseInLineDecomposition(InLineDecomposition object)
      {
        return createInLineDecompositionAdapter();
      }
      @Override
      public Adapter caseDecompositionEnd(DecompositionEnd object)
      {
        return createDecompositionEndAdapter();
      }
      @Override
      public Adapter caseContributionEnd(ContributionEnd object)
      {
        return createContributionEndAdapter();
      }
      @Override
      public Adapter caseDependencyEnd(DependencyEnd object)
      {
        return createDependencyEndAdapter();
      }
      @Override
      public Adapter caseLinkType(LinkType object)
      {
        return createLinkTypeAdapter();
      }
      @Override
      public Adapter caseStrategyGroup(StrategyGroup object)
      {
        return createStrategyGroupAdapter();
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
      public Adapter caseKPIEvalValueSet(KPIEvalValueSet object)
      {
        return createKPIEvalValueSetAdapter();
      }
      @Override
      public Adapter caseKPIQuantitativeEvalValueSet(KPIQuantitativeEvalValueSet object)
      {
        return createKPIQuantitativeEvalValueSetAdapter();
      }
      @Override
      public Adapter caseKPIQualitativeEvalValueSet(KPIQualitativeEvalValueSet object)
      {
        return createKPIQualitativeEvalValueSetAdapter();
      }
      @Override
      public Adapter caseQualitativeMapping(QualitativeMapping object)
      {
        return createQualitativeMappingAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseContributionGroup(ContributionGroup object)
      {
        return createContributionGroupAdapter();
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
      public Adapter caseMetadata(Metadata object)
      {
        return createMetadataAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
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
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement <em>Super Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement
   * @generated
   */
  public Adapter createSuperIntentionalElementAdapter()
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
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.EndLink <em>End Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.EndLink
   * @generated
   */
  public Adapter createEndLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.NormalElementLink <em>Normal Element Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.NormalElementLink
   * @generated
   */
  public Adapter createNormalElementLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.NormalLink <em>Normal Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.NormalLink
   * @generated
   */
  public Adapter createNormalLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.NormalDependency <em>Normal Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.NormalDependency
   * @generated
   */
  public Adapter createNormalDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.NormalContribution <em>Normal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.NormalContribution
   * @generated
   */
  public Adapter createNormalContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.NormalDecomposition <em>Normal Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.NormalDecomposition
   * @generated
   */
  public Adapter createNormalDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.InLineElementLink <em>In Line Element Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.InLineElementLink
   * @generated
   */
  public Adapter createInLineElementLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.InLineLink <em>In Line Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.InLineLink
   * @generated
   */
  public Adapter createInLineLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.InLineDependency <em>In Line Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.InLineDependency
   * @generated
   */
  public Adapter createInLineDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.InLineContribution <em>In Line Contribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.InLineContribution
   * @generated
   */
  public Adapter createInLineContributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.InLineDecomposition <em>In Line Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.InLineDecomposition
   * @generated
   */
  public Adapter createInLineDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DecompositionEnd <em>Decomposition End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionEnd
   * @generated
   */
  public Adapter createDecompositionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd <em>Contribution End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnd
   * @generated
   */
  public Adapter createContributionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.DependencyEnd <em>Dependency End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.DependencyEnd
   * @generated
   */
  public Adapter createDependencyEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.LinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.LinkType
   * @generated
   */
  public Adapter createLinkTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.StrategyGroup <em>Strategy Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.StrategyGroup
   * @generated
   */
  public Adapter createStrategyGroupAdapter()
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
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet <em>KPI Quantitative Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet
   * @generated
   */
  public Adapter createKPIQuantitativeEvalValueSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet <em>KPI Qualitative Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet
   * @generated
   */
  public Adapter createKPIQualitativeEvalValueSetAdapter()
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
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.ContributionGroup <em>Contribution Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.ContributionGroup
   * @generated
   */
  public Adapter createContributionGroupAdapter()
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
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Metadata
   * @generated
   */
  public Adapter createMetadataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.grl.tgrl.tGRL.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.grl.tgrl.tGRL.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
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
