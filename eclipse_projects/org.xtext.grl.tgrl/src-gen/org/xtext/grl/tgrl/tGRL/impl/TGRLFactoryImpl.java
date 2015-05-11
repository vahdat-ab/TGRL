/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.Belief;
import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.Comment;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionGroup;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.Criticality;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.DecompositionType;
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
import org.xtext.grl.tgrl.tGRL.ImportanceType;
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
import org.xtext.grl.tgrl.tGRL.Priority;
import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.Resource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategyGroup;
import org.xtext.grl.tgrl.tGRL.SuperIntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLFactory;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TGRLFactoryImpl extends EFactoryImpl implements TGRLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TGRLFactory init()
  {
    try
    {
      TGRLFactory theTGRLFactory = (TGRLFactory)EPackage.Registry.INSTANCE.getEFactory(TGRLPackage.eNS_URI);
      if (theTGRLFactory != null)
      {
        return theTGRLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TGRLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TGRLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TGRLPackage.MODEL: return createModel();
      case TGRLPackage.ELEMENT: return createElement();
      case TGRLPackage.GRL_BASE_ELEMENT: return createGRLBaseElement();
      case TGRLPackage.GRL_ELEMENT: return createGRLElement();
      case TGRLPackage.SUPER_INTENTIONAL_ELEMENT: return createSuperIntentionalElement();
      case TGRLPackage.INTENTIONAL_ELEMENT: return createIntentionalElement();
      case TGRLPackage.GRL_SPECIFICATION: return createGRLSpecification();
      case TGRLPackage.ACTOR: return createActor();
      case TGRLPackage.SOFTGOAL: return createSoftgoal();
      case TGRLPackage.GOAL: return createGoal();
      case TGRLPackage.TASK: return createTask();
      case TGRLPackage.RESOURCE: return createResource();
      case TGRLPackage.INDICATOR: return createIndicator();
      case TGRLPackage.BELIEF: return createBelief();
      case TGRLPackage.ELEMENT_LINK: return createElementLink();
      case TGRLPackage.END_LINK: return createEndLink();
      case TGRLPackage.NORMAL_ELEMENT_LINK: return createNormalElementLink();
      case TGRLPackage.NORMAL_LINK: return createNormalLink();
      case TGRLPackage.NORMAL_DEPENDENCY: return createNormalDependency();
      case TGRLPackage.NORMAL_CONTRIBUTION: return createNormalContribution();
      case TGRLPackage.NORMAL_DECOMPOSITION: return createNormalDecomposition();
      case TGRLPackage.IN_LINE_ELEMENT_LINK: return createInLineElementLink();
      case TGRLPackage.IN_LINE_LINK: return createInLineLink();
      case TGRLPackage.IN_LINE_DEPENDENCY: return createInLineDependency();
      case TGRLPackage.IN_LINE_CONTRIBUTION: return createInLineContribution();
      case TGRLPackage.IN_LINE_DECOMPOSITION: return createInLineDecomposition();
      case TGRLPackage.DECOMPOSITION_END: return createDecompositionEnd();
      case TGRLPackage.CONTRIBUTION_END: return createContributionEnd();
      case TGRLPackage.DEPENDENCY_END: return createDependencyEnd();
      case TGRLPackage.LINK_TYPE: return createLinkType();
      case TGRLPackage.STRATEGY_GROUP: return createStrategyGroup();
      case TGRLPackage.EVALUATION_STRATEGY: return createEvaluationStrategy();
      case TGRLPackage.EVALUATION: return createEvaluation();
      case TGRLPackage.EVALUATION_RANGE: return createEvaluationRange();
      case TGRLPackage.KPI_EVAL_VALUE_SET: return createKPIEvalValueSet();
      case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET: return createKPIQuantitativeEvalValueSet();
      case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET: return createKPIQualitativeEvalValueSet();
      case TGRLPackage.QUALITATIVE_MAPPING: return createQualitativeMapping();
      case TGRLPackage.MAPPING: return createMapping();
      case TGRLPackage.CONTRIBUTION_GROUP: return createContributionGroup();
      case TGRLPackage.CONTRIBUTION_CONTEXT: return createContributionContext();
      case TGRLPackage.CONTRIBUTION_CHANGE: return createContributionChange();
      case TGRLPackage.CONTRIBUTION_RANGE: return createContributionRange();
      case TGRLPackage.METADATA: return createMetadata();
      case TGRLPackage.COMMENT: return createComment();
      case TGRLPackage.INDICATOR_GROUP: return createIndicatorGroup();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TGRLPackage.IMPORTANCE_TYPE:
        return createImportanceTypeFromString(eDataType, initialValue);
      case TGRLPackage.DECOMPOSITION_TYPE:
        return createDecompositionTypeFromString(eDataType, initialValue);
      case TGRLPackage.CONTRIBUTION_TYPE:
        return createContributionTypeFromString(eDataType, initialValue);
      case TGRLPackage.QUALITATIVE_LABEL:
        return createQualitativeLabelFromString(eDataType, initialValue);
      case TGRLPackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      case TGRLPackage.CRITICALITY:
        return createCriticalityFromString(eDataType, initialValue);
      case TGRLPackage.PRIORITY:
        return createPriorityFromString(eDataType, initialValue);
      case TGRLPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TGRLPackage.IMPORTANCE_TYPE:
        return convertImportanceTypeToString(eDataType, instanceValue);
      case TGRLPackage.DECOMPOSITION_TYPE:
        return convertDecompositionTypeToString(eDataType, instanceValue);
      case TGRLPackage.CONTRIBUTION_TYPE:
        return convertContributionTypeToString(eDataType, instanceValue);
      case TGRLPackage.QUALITATIVE_LABEL:
        return convertQualitativeLabelToString(eDataType, instanceValue);
      case TGRLPackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      case TGRLPackage.CRITICALITY:
        return convertCriticalityToString(eDataType, instanceValue);
      case TGRLPackage.PRIORITY:
        return convertPriorityToString(eDataType, instanceValue);
      case TGRLPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GRLBaseElement createGRLBaseElement()
  {
    GRLBaseElementImpl grlBaseElement = new GRLBaseElementImpl();
    return grlBaseElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GRLElement createGRLElement()
  {
    GRLElementImpl grlElement = new GRLElementImpl();
    return grlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperIntentionalElement createSuperIntentionalElement()
  {
    SuperIntentionalElementImpl superIntentionalElement = new SuperIntentionalElementImpl();
    return superIntentionalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement createIntentionalElement()
  {
    IntentionalElementImpl intentionalElement = new IntentionalElementImpl();
    return intentionalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GRLSpecification createGRLSpecification()
  {
    GRLSpecificationImpl grlSpecification = new GRLSpecificationImpl();
    return grlSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Softgoal createSoftgoal()
  {
    SoftgoalImpl softgoal = new SoftgoalImpl();
    return softgoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Indicator createIndicator()
  {
    IndicatorImpl indicator = new IndicatorImpl();
    return indicator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Belief createBelief()
  {
    BeliefImpl belief = new BeliefImpl();
    return belief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementLink createElementLink()
  {
    ElementLinkImpl elementLink = new ElementLinkImpl();
    return elementLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndLink createEndLink()
  {
    EndLinkImpl endLink = new EndLinkImpl();
    return endLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalElementLink createNormalElementLink()
  {
    NormalElementLinkImpl normalElementLink = new NormalElementLinkImpl();
    return normalElementLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalLink createNormalLink()
  {
    NormalLinkImpl normalLink = new NormalLinkImpl();
    return normalLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalDependency createNormalDependency()
  {
    NormalDependencyImpl normalDependency = new NormalDependencyImpl();
    return normalDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalContribution createNormalContribution()
  {
    NormalContributionImpl normalContribution = new NormalContributionImpl();
    return normalContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalDecomposition createNormalDecomposition()
  {
    NormalDecompositionImpl normalDecomposition = new NormalDecompositionImpl();
    return normalDecomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InLineElementLink createInLineElementLink()
  {
    InLineElementLinkImpl inLineElementLink = new InLineElementLinkImpl();
    return inLineElementLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InLineLink createInLineLink()
  {
    InLineLinkImpl inLineLink = new InLineLinkImpl();
    return inLineLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InLineDependency createInLineDependency()
  {
    InLineDependencyImpl inLineDependency = new InLineDependencyImpl();
    return inLineDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InLineContribution createInLineContribution()
  {
    InLineContributionImpl inLineContribution = new InLineContributionImpl();
    return inLineContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InLineDecomposition createInLineDecomposition()
  {
    InLineDecompositionImpl inLineDecomposition = new InLineDecompositionImpl();
    return inLineDecomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionEnd createDecompositionEnd()
  {
    DecompositionEndImpl decompositionEnd = new DecompositionEndImpl();
    return decompositionEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionEnd createContributionEnd()
  {
    ContributionEndImpl contributionEnd = new ContributionEndImpl();
    return contributionEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyEnd createDependencyEnd()
  {
    DependencyEndImpl dependencyEnd = new DependencyEndImpl();
    return dependencyEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType createLinkType()
  {
    LinkTypeImpl linkType = new LinkTypeImpl();
    return linkType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrategyGroup createStrategyGroup()
  {
    StrategyGroupImpl strategyGroup = new StrategyGroupImpl();
    return strategyGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy createEvaluationStrategy()
  {
    EvaluationStrategyImpl evaluationStrategy = new EvaluationStrategyImpl();
    return evaluationStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluation createEvaluation()
  {
    EvaluationImpl evaluation = new EvaluationImpl();
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationRange createEvaluationRange()
  {
    EvaluationRangeImpl evaluationRange = new EvaluationRangeImpl();
    return evaluationRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIEvalValueSet createKPIEvalValueSet()
  {
    KPIEvalValueSetImpl kpiEvalValueSet = new KPIEvalValueSetImpl();
    return kpiEvalValueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIQuantitativeEvalValueSet createKPIQuantitativeEvalValueSet()
  {
    KPIQuantitativeEvalValueSetImpl kpiQuantitativeEvalValueSet = new KPIQuantitativeEvalValueSetImpl();
    return kpiQuantitativeEvalValueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIQualitativeEvalValueSet createKPIQualitativeEvalValueSet()
  {
    KPIQualitativeEvalValueSetImpl kpiQualitativeEvalValueSet = new KPIQualitativeEvalValueSetImpl();
    return kpiQualitativeEvalValueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeMapping createQualitativeMapping()
  {
    QualitativeMappingImpl qualitativeMapping = new QualitativeMappingImpl();
    return qualitativeMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionGroup createContributionGroup()
  {
    ContributionGroupImpl contributionGroup = new ContributionGroupImpl();
    return contributionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionContext createContributionContext()
  {
    ContributionContextImpl contributionContext = new ContributionContextImpl();
    return contributionContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionChange createContributionChange()
  {
    ContributionChangeImpl contributionChange = new ContributionChangeImpl();
    return contributionChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionRange createContributionRange()
  {
    ContributionRangeImpl contributionRange = new ContributionRangeImpl();
    return contributionRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata createMetadata()
  {
    MetadataImpl metadata = new MetadataImpl();
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicatorGroup createIndicatorGroup()
  {
    IndicatorGroupImpl indicatorGroup = new IndicatorGroupImpl();
    return indicatorGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportanceType createImportanceTypeFromString(EDataType eDataType, String initialValue)
  {
    ImportanceType result = ImportanceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertImportanceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionType createDecompositionTypeFromString(EDataType eDataType, String initialValue)
  {
    DecompositionType result = DecompositionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDecompositionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionType createContributionTypeFromString(EDataType eDataType, String initialValue)
  {
    ContributionType result = ContributionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertContributionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeLabel createQualitativeLabelFromString(EDataType eDataType, String initialValue)
  {
    QualitativeLabel result = QualitativeLabel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQualitativeLabelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Criticality createCriticalityFromString(EDataType eDataType, String initialValue)
  {
    Criticality result = Criticality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCriticalityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriorityFromString(EDataType eDataType, String initialValue)
  {
    Priority result = Priority.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPriorityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.grl.tgrl.tGRL.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    org.xtext.grl.tgrl.tGRL.Boolean result = org.xtext.grl.tgrl.tGRL.Boolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TGRLPackage getTGRLPackage()
  {
    return (TGRLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TGRLPackage getPackage()
  {
    return TGRLPackage.eINSTANCE;
  }

} //TGRLFactoryImpl
