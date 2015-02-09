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
      case TGRLPackage.GRL_MODEL_ELEMENT:
      {
        GRLModelElement grlModelElement = (GRLModelElement)theEObject;
        T result = caseGRLModelElement(grlModelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GRL_NODE:
      {
        GRLNode grlNode = (GRLNode)theEObject;
        T result = caseGRLNode(grlNode);
        if (result == null) result = caseGRLModelElement(grlNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GRL_LINKABLE_ELEMENT:
      {
        GRLLinkableElement grlLinkableElement = (GRLLinkableElement)theEObject;
        T result = caseGRLLinkableElement(grlLinkableElement);
        if (result == null) result = caseGRLModelElement(grlLinkableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INTENTIONAL_ELEMENT:
      {
        IntentionalElement intentionalElement = (IntentionalElement)theEObject;
        T result = caseIntentionalElement(intentionalElement);
        if (result == null) result = caseGRLLinkableElement(intentionalElement);
        if (result == null) result = caseGRLModelElement(intentionalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.ELEMENT_LINK:
      {
        ElementLink elementLink = (ElementLink)theEObject;
        T result = caseElementLink(elementLink);
        if (result == null) result = caseGRLModelElement(elementLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GR_LSPEC:
      {
        GRLspec grLspec = (GRLspec)theEObject;
        T result = caseGRLspec(grLspec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseGRLLinkableElement(actor);
        if (result == null) result = caseGRLModelElement(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.SOFTGOAL:
      {
        Softgoal softgoal = (Softgoal)theEObject;
        T result = caseSoftgoal(softgoal);
        if (result == null) result = caseIntentionalElement(softgoal);
        if (result == null) result = caseGRLLinkableElement(softgoal);
        if (result == null) result = caseGRLModelElement(softgoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseIntentionalElement(goal);
        if (result == null) result = caseGRLLinkableElement(goal);
        if (result == null) result = caseGRLModelElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = caseIntentionalElement(task);
        if (result == null) result = caseGRLLinkableElement(task);
        if (result == null) result = caseGRLModelElement(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.RESSOURCE:
      {
        Ressource ressource = (Ressource)theEObject;
        T result = caseRessource(ressource);
        if (result == null) result = caseIntentionalElement(ressource);
        if (result == null) result = caseGRLLinkableElement(ressource);
        if (result == null) result = caseGRLModelElement(ressource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INDICATOR:
      {
        Indicator indicator = (Indicator)theEObject;
        T result = caseIndicator(indicator);
        if (result == null) result = caseIntentionalElement(indicator);
        if (result == null) result = caseGRLLinkableElement(indicator);
        if (result == null) result = caseGRLModelElement(indicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DECOMPOSITION:
      {
        Decomposition decomposition = (Decomposition)theEObject;
        T result = caseDecomposition(decomposition);
        if (result == null) result = caseElementLink(decomposition);
        if (result == null) result = caseGRLModelElement(decomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION:
      {
        Contribution contribution = (Contribution)theEObject;
        T result = caseContribution(contribution);
        if (result == null) result = caseElementLink(contribution);
        if (result == null) result = caseGRLModelElement(contribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = caseElementLink(dependency);
        if (result == null) result = caseGRLModelElement(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.BELIEF:
      {
        Belief belief = (Belief)theEObject;
        T result = caseBelief(belief);
        if (result == null) result = caseGRLNode(belief);
        if (result == null) result = caseGRLModelElement(belief);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.COLLAPSED_ACTOR_REF:
      {
        CollapsedActorRef collapsedActorRef = (CollapsedActorRef)theEObject;
        T result = caseCollapsedActorRef(collapsedActorRef);
        if (result == null) result = caseGRLNode(collapsedActorRef);
        if (result == null) result = caseGRLModelElement(collapsedActorRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.INTENTIONAL_ELEMENT_REF:
      {
        IntentionalElementRef intentionalElementRef = (IntentionalElementRef)theEObject;
        T result = caseIntentionalElementRef(intentionalElementRef);
        if (result == null) result = caseGRLNode(intentionalElementRef);
        if (result == null) result = caseGRLModelElement(intentionalElementRef);
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
        if (result == null) result = caseGRLModelElement(strategiesGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.EVALUATION_STRATEGY:
      {
        EvaluationStrategy evaluationStrategy = (EvaluationStrategy)theEObject;
        T result = caseEvaluationStrategy(evaluationStrategy);
        if (result == null) result = caseGRLModelElement(evaluationStrategy);
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
        if (result == null) result = caseGRLModelElement(contributionContextGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TGRLPackage.CONTRIBUTION_CONTEXT:
      {
        ContributionContext contributionContext = (ContributionContext)theEObject;
        T result = caseContributionContext(contributionContext);
        if (result == null) result = caseGRLModelElement(contributionContext);
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
      case TGRLPackage.CONTRIBUB:
      {
        Contribub contribub = (Contribub)theEObject;
        T result = caseContribub(contribub);
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
   * Returns the result of interpreting the object as an instance of '<em>GRL Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLModelElement(GRLModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GRL Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLNode(GRLNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLLinkableElement(GRLLinkableElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGRLspec(GRLspec object)
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
   * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRessource(Ressource object)
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
   * Returns the result of interpreting the object as an instance of '<em>Contribub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContribub(Contribub object)
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
