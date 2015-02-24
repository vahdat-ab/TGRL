/**
 */
package org.xtext.grl.tgrl.tGRL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.grl.tgrl.tGRL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage
 * @generated
 */
public class TGRLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TGRLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TGRLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TGRLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TGRLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GRL_BASE_ELEMENT:
      {
        GRLBaseElement grlBaseElement = (GRLBaseElement)theEObject;
        T result = caseGRLBaseElement(grlBaseElement);
        if (result == null) result = caseElement(grlBaseElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GRL_ELEMENT:
      {
        GRLElement grlElement = (GRLElement)theEObject;
        T result = caseGRLElement(grlElement);
        if (result == null) result = caseGRLBaseElement(grlElement);
        if (result == null) result = caseElement(grlElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INTENTIONAL_ELEMENT:
      {
        IntentionalElement intentionalElement = (IntentionalElement)theEObject;
        T result = caseIntentionalElement(intentionalElement);
        if (result == null) result = caseGRLElement(intentionalElement);
        if (result == null) result = caseGRLBaseElement(intentionalElement);
        if (result == null) result = caseElement(intentionalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.ELEMENT_LINK:
      {
        ElementLink elementLink = (ElementLink)theEObject;
        T result = caseElementLink(elementLink);
        if (result == null) result = caseGRLElement(elementLink);
        if (result == null) result = caseGRLBaseElement(elementLink);
        if (result == null) result = caseElement(elementLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.IN_LINE_ELEMENT_LINK:
      {
        InLineElementLink inLineElementLink = (InLineElementLink)theEObject;
        T result = caseInLineElementLink(inLineElementLink);
        if (result == null) result = caseGRLBaseElement(inLineElementLink);
        if (result == null) result = caseElement(inLineElementLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GRL_SPECIFICATION:
      {
        GRLSpecification grlSpecification = (GRLSpecification)theEObject;
        T result = caseGRLSpecification(grlSpecification);
        if (result == null) result = caseElement(grlSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseGRLElement(actor);
        if (result == null) result = caseGRLBaseElement(actor);
        if (result == null) result = caseElement(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.SOFTGOAL:
      {
        Softgoal softgoal = (Softgoal)theEObject;
        T result = caseSoftgoal(softgoal);
        if (result == null) result = caseIntentionalElement(softgoal);
        if (result == null) result = caseGRLElement(softgoal);
        if (result == null) result = caseGRLBaseElement(softgoal);
        if (result == null) result = caseElement(softgoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseIntentionalElement(goal);
        if (result == null) result = caseGRLElement(goal);
        if (result == null) result = caseGRLBaseElement(goal);
        if (result == null) result = caseElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = caseIntentionalElement(task);
        if (result == null) result = caseGRLElement(task);
        if (result == null) result = caseGRLBaseElement(task);
        if (result == null) result = caseElement(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = caseIntentionalElement(resource);
        if (result == null) result = caseGRLElement(resource);
        if (result == null) result = caseGRLBaseElement(resource);
        if (result == null) result = caseElement(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INDICATOR:
      {
        Indicator indicator = (Indicator)theEObject;
        T result = caseIndicator(indicator);
        if (result == null) result = caseIntentionalElement(indicator);
        if (result == null) result = caseGRLElement(indicator);
        if (result == null) result = caseGRLBaseElement(indicator);
        if (result == null) result = caseElement(indicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DECOMPOSITION:
      {
        Decomposition decomposition = (Decomposition)theEObject;
        T result = caseDecomposition(decomposition);
        if (result == null) result = caseElementLink(decomposition);
        if (result == null) result = caseGRLElement(decomposition);
        if (result == null) result = caseGRLBaseElement(decomposition);
        if (result == null) result = caseElement(decomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.IN_LINE_DECOMPOSITION:
      {
        InLineDecomposition inLineDecomposition = (InLineDecomposition)theEObject;
        T result = caseInLineDecomposition(inLineDecomposition);
        if (result == null) result = caseInLineElementLink(inLineDecomposition);
        if (result == null) result = caseGRLBaseElement(inLineDecomposition);
        if (result == null) result = caseElement(inLineDecomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DECOMPOSITION_END:
      {
        DecompositionEnd decompositionEnd = (DecompositionEnd)theEObject;
        T result = caseDecompositionEnd(decompositionEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION:
      {
        Contribution contribution = (Contribution)theEObject;
        T result = caseContribution(contribution);
        if (result == null) result = caseElementLink(contribution);
        if (result == null) result = caseGRLElement(contribution);
        if (result == null) result = caseGRLBaseElement(contribution);
        if (result == null) result = caseElement(contribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.IN_LINE_CONTRIBUTION:
      {
        InLineContribution inLineContribution = (InLineContribution)theEObject;
        T result = caseInLineContribution(inLineContribution);
        if (result == null) result = caseInLineElementLink(inLineContribution);
        if (result == null) result = caseGRLBaseElement(inLineContribution);
        if (result == null) result = caseElement(inLineContribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_END:
      {
        ContributionEnd contributionEnd = (ContributionEnd)theEObject;
        T result = caseContributionEnd(contributionEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = caseElementLink(dependency);
        if (result == null) result = caseGRLElement(dependency);
        if (result == null) result = caseGRLBaseElement(dependency);
        if (result == null) result = caseElement(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.IN_LINE_DEPENDENCY:
      {
        InLineDependency inLineDependency = (InLineDependency)theEObject;
        T result = caseInLineDependency(inLineDependency);
        if (result == null) result = caseInLineElementLink(inLineDependency);
        if (result == null) result = caseGRLBaseElement(inLineDependency);
        if (result == null) result = caseElement(inLineDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DEPENDENCY_END:
      {
        DependencyEnd dependencyEnd = (DependencyEnd)theEObject;
        T result = caseDependencyEnd(dependencyEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_CONVERSION:
      {
        KPIConversion kpiConversion = (KPIConversion)theEObject;
        T result = caseKPIConversion(kpiConversion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.BELIEF:
      {
        Belief belief = (Belief)theEObject;
        T result = caseBelief(belief);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.COLLAPSED_ACTOR_REF:
      {
        CollapsedActorRef collapsedActorRef = (CollapsedActorRef)theEObject;
        T result = caseCollapsedActorRef(collapsedActorRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INTENTIONAL_ELEMENT_REF:
      {
        IntentionalElementRef intentionalElementRef = (IntentionalElementRef)theEObject;
        T result = caseIntentionalElementRef(intentionalElementRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.IMPACT_MODEL:
      {
        ImpactModel impactModel = (ImpactModel)theEObject;
        T result = caseImpactModel(impactModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.STRATEGIES_GROUP:
      {
        StrategiesGroup strategiesGroup = (StrategiesGroup)theEObject;
        T result = caseStrategiesGroup(strategiesGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.EVALUATION_STRATEGY:
      {
        EvaluationStrategy evaluationStrategy = (EvaluationStrategy)theEObject;
        T result = caseEvaluationStrategy(evaluationStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.EVALUATION:
      {
        Evaluation evaluation = (Evaluation)theEObject;
        T result = caseEvaluation(evaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.EVALUATION_RANGE:
      {
        EvaluationRange evaluationRange = (EvaluationRange)theEObject;
        T result = caseEvaluationRange(evaluationRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_CONTEXT_GROUP:
      {
        ContributionContextGroup contributionContextGroup = (ContributionContextGroup)theEObject;
        T result = caseContributionContextGroup(contributionContextGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_CONTEXT:
      {
        ContributionContext contributionContext = (ContributionContext)theEObject;
        T result = caseContributionContext(contributionContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_CHANGE:
      {
        ContributionChange contributionChange = (ContributionChange)theEObject;
        T result = caseContributionChange(contributionChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_RANGE:
      {
        ContributionRange contributionRange = (ContributionRange)theEObject;
        T result = caseContributionRange(contributionRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.QUALITATIVE_MAPPINGS:
      {
        QualitativeMappings qualitativeMappings = (QualitativeMappings)theEObject;
        T result = caseQualitativeMappings(qualitativeMappings);
        if (result == null) result = caseKPIConversion(qualitativeMappings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_EVAL_VALUE_SET:
      {
        KPIEvalValueSet kpiEvalValueSet = (KPIEvalValueSet)theEObject;
        T result = caseKPIEvalValueSet(kpiEvalValueSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.QUALITATIVE_MAPPING:
      {
        QualitativeMapping qualitativeMapping = (QualitativeMapping)theEObject;
        T result = caseQualitativeMapping(qualitativeMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_NEW_EVAL_VALUE:
      {
        KPINewEvalValue kpiNewEvalValue = (KPINewEvalValue)theEObject;
        T result = caseKPINewEvalValue(kpiNewEvalValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_INFORMATION_CONFIG:
      {
        KPIInformationConfig kpiInformationConfig = (KPIInformationConfig)theEObject;
        T result = caseKPIInformationConfig(kpiInformationConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_INFORMATION_ELEMENT:
      {
        KPIInformationElement kpiInformationElement = (KPIInformationElement)theEObject;
        T result = caseKPIInformationElement(kpiInformationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_INFORMATION_ELEMENT_REF:
      {
        KPIInformationElementRef kpiInformationElementRef = (KPIInformationElementRef)theEObject;
        T result = caseKPIInformationElementRef(kpiInformationElementRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.KPI_MODEL_LINK:
      {
        KPIModelLink kpiModelLink = (KPIModelLink)theEObject;
        T result = caseKPIModelLink(kpiModelLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INDICATOR_GROUP:
      {
        IndicatorGroup indicatorGroup = (IndicatorGroup)theEObject;
        T result = caseIndicatorGroup(indicatorGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GRL Base Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Base Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLBaseElement(GRLBaseElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GRL Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLElement(GRLElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntentionalElement(IntentionalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementLink(ElementLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Line Element Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Line Element Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInLineElementLink(InLineElementLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GRL Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLSpecification(GRLSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftgoal(Softgoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicator(Indicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecomposition(Decomposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Line Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Line Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInLineDecomposition(InLineDecomposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecompositionEnd(DecompositionEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContribution(Contribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Line Contribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Line Contribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInLineContribution(InLineContribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionEnd(ContributionEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Line Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Line Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInLineDependency(InLineDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencyEnd(DependencyEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Conversion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Conversion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIConversion(KPIConversion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belief</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belief</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelief(Belief object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollapsedActorRef(CollapsedActorRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntentionalElementRef(IntentionalElementRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impact Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impact Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImpactModel(ImpactModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategiesGroup(StrategiesGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationStrategy(EvaluationStrategy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluation(Evaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationRange(EvaluationRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Context Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Context Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionContextGroup(ContributionContextGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionContext(ContributionContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionChange(ContributionChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionRange(ContributionRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualitative Mappings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualitative Mappings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualitativeMappings(QualitativeMappings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Eval Value Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Eval Value Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIEvalValueSet(KPIEvalValueSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualitative Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualitative Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualitativeMapping(QualitativeMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI New Eval Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI New Eval Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPINewEvalValue(KPINewEvalValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Information Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Information Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIInformationConfig(KPIInformationConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Information Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Information Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIInformationElement(KPIInformationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Information Element Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Information Element Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIInformationElementRef(KPIInformationElementRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KPI Model Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KPI Model Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKPIModelLink(KPIModelLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indicator Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indicator Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicatorGroup(IndicatorGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TGRLSwitch
