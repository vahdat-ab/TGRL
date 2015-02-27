/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.Belief;
import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.Contribution;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionContextGroup;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.Criticality;
import org.xtext.grl.tgrl.tGRL.Decomposition;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.DecompositionType;
import org.xtext.grl.tgrl.tGRL.Dependency;
import org.xtext.grl.tgrl.tGRL.DependencyEnd;
import org.xtext.grl.tgrl.tGRL.Element;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLBaseElement;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.Goal;
import org.xtext.grl.tgrl.tGRL.ImpactModel;
import org.xtext.grl.tgrl.tGRL.ImportanceType;
import org.xtext.grl.tgrl.tGRL.InLineContribution;
import org.xtext.grl.tgrl.tGRL.InLineDecomposition;
import org.xtext.grl.tgrl.tGRL.InLineDependency;
import org.xtext.grl.tgrl.tGRL.InLineElementLink;
import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.KPIConversion;
import org.xtext.grl.tgrl.tGRL.KPIEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPIInformationConfig;
import org.xtext.grl.tgrl.tGRL.KPIInformationElement;
import org.xtext.grl.tgrl.tGRL.KPIInformationElementRef;
import org.xtext.grl.tgrl.tGRL.KPIModelLink;
import org.xtext.grl.tgrl.tGRL.KPINewEvalValue;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.Priority;
import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.QualitativeMappings;
import org.xtext.grl.tgrl.tGRL.Resource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategyGroup;
import org.xtext.grl.tgrl.tGRL.TGRLFactory;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TGRLPackageImpl extends EPackageImpl implements TGRLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grlBaseElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grlElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentionalElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inLineElementLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grlSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass softgoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beliefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inLineDecompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inLineContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inLineDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strategyGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationStrategyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiConversionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass impactModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionContextGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualitativeMappingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiEvalValueSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualitativeMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiNewEvalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiInformationConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiInformationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiInformationElementRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiModelLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicatorGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum importanceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum decompositionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum contributionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum qualitativeLabelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum criticalityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum priorityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TGRLPackageImpl()
  {
    super(eNS_URI, TGRLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TGRLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TGRLPackage init()
  {
    if (isInited) return (TGRLPackage)EPackage.Registry.INSTANCE.getEPackage(TGRLPackage.eNS_URI);

    // Obtain or create and register package
    TGRLPackageImpl theTGRLPackage = (TGRLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TGRLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TGRLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTGRLPackage.createPackageContents();

    // Initialize created meta-data
    theTGRLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTGRLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TGRLPackage.eNS_URI, theTGRLPackage);
    return theTGRLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_GRLspecifications()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Id()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLBaseElement()
  {
    return grlBaseElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLElement()
  {
    return grlElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntentionalElement()
  {
    return intentionalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Name()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Label()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Description()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementLink()
  {
    return elementLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementLink_Src()
  {
    return (EReference)elementLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInLineElementLink()
  {
    return inLineElementLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLSpecification()
  {
    return grlSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLSpecification_Name()
  {
    return (EAttribute)grlSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLSpecification_GrlElements()
  {
    return (EReference)grlSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Name()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Label()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Importance()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_ImportanceQuantitative()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Description()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_FillColor()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Elemets()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoftgoal()
  {
    return softgoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftgoal_FillColor()
  {
    return (EAttribute)softgoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftgoal_DecompositionType()
  {
    return (EAttribute)softgoalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftgoal_Importance()
  {
    return (EAttribute)softgoalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftgoal_ImportanceQuantitative()
  {
    return (EAttribute)softgoalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftgoal_ElementLinks()
  {
    return (EReference)softgoalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal()
  {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_FillColor()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_DecompositionType()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Importance()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_ImportanceQuantitative()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_ElementLinks()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_FillColor()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_DecompositionType()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Importance()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_ImportanceQuantitative()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_ElementLinks()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_FillColor()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_DecompositionType()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Importance()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_ImportanceQuantitative()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_ElementLinks()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicator()
  {
    return indicatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicator_FillColor()
  {
    return (EAttribute)indicatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicator_DecompositionType()
  {
    return (EAttribute)indicatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicator_Importance()
  {
    return (EAttribute)indicatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicator_ImportanceQuantitative()
  {
    return (EAttribute)indicatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicator_KpiModelLinksDest()
  {
    return (EReference)indicatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicator_Groups()
  {
    return (EReference)indicatorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicator_ElementLinks()
  {
    return (EReference)indicatorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelief()
  {
    return beliefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecomposition()
  {
    return decompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecomposition_Dest()
  {
    return (EReference)decompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInLineDecomposition()
  {
    return inLineDecompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInLineDecomposition_Dest()
  {
    return (EReference)inLineDecompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecompositionEnd()
  {
    return decompositionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecompositionEnd_Name()
  {
    return (EReference)decompositionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecompositionEnd_Description()
  {
    return (EAttribute)decompositionEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContribution()
  {
    return contributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContribution_Dest()
  {
    return (EReference)contributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInLineContribution()
  {
    return inLineContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInLineContribution_Dest()
  {
    return (EReference)inLineContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionEnd()
  {
    return contributionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionEnd_Name()
  {
    return (EReference)contributionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionEnd_Contribution()
  {
    return (EAttribute)contributionEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionEnd_QuantitativeContribution()
  {
    return (EAttribute)contributionEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Dest()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInLineDependency()
  {
    return inLineDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInLineDependency_Dest()
  {
    return (EReference)inLineDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencyEnd()
  {
    return dependencyEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencyEnd_Name()
  {
    return (EReference)dependencyEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyEnd_Description()
  {
    return (EAttribute)dependencyEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrategyGroup()
  {
    return strategyGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrategyGroup_Name()
  {
    return (EAttribute)strategyGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyGroup_Strategies()
  {
    return (EReference)strategyGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluationStrategy()
  {
    return evaluationStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationStrategy_Name()
  {
    return (EAttribute)evaluationStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_SuperStrategies()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_Evaluations()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluation()
  {
    return evaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluation_IntentionalElement()
  {
    return (EReference)evaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluation_QualitativeEvaluation()
  {
    return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluation_Evaluation()
  {
    return (EAttribute)evaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluation_Exceeds()
  {
    return (EAttribute)evaluationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIConversion()
  {
    return kpiConversionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImpactModel()
  {
    return impactModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImpactModel_Name()
  {
    return (EAttribute)impactModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluationRange()
  {
    return evaluationRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationRange_Start()
  {
    return (EAttribute)evaluationRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationRange_End()
  {
    return (EAttribute)evaluationRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationRange_Step()
  {
    return (EAttribute)evaluationRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionContextGroup()
  {
    return contributionContextGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionContextGroup_Name()
  {
    return (EAttribute)contributionContextGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionContextGroup_Contribs()
  {
    return (EReference)contributionContextGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionContext()
  {
    return contributionContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionContext_Name()
  {
    return (EAttribute)contributionContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionContext_IncludedContexts()
  {
    return (EReference)contributionContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionContext_Changes()
  {
    return (EReference)contributionContextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionChange()
  {
    return contributionChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionChange_Name()
  {
    return (EAttribute)contributionChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionChange_NewContribution()
  {
    return (EAttribute)contributionChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionChange_NewQuantitativeContribution()
  {
    return (EAttribute)contributionChangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionChange_ContribRange()
  {
    return (EReference)contributionChangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionRange()
  {
    return contributionRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionRange_Start()
  {
    return (EAttribute)contributionRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionRange_End()
  {
    return (EAttribute)contributionRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionRange_Step()
  {
    return (EAttribute)contributionRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualitativeMappings()
  {
    return qualitativeMappingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMappings_Name()
  {
    return (EAttribute)qualitativeMappingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeMappings_KpiEvalValueSet()
  {
    return (EReference)qualitativeMappingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeMappings_Mappin()
  {
    return (EReference)qualitativeMappingsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIEvalValueSet()
  {
    return kpiEvalValueSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_Name()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_TargetValue()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_ThresholdValue()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_WorstValue()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_EvaluationValue()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_Unit()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIEvalValueSet_QualitativeEvaluationValue()
  {
    return (EAttribute)kpiEvalValueSetEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualitativeMapping()
  {
    return qualitativeMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMapping_Name()
  {
    return (EAttribute)qualitativeMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMapping_RealWorldLabel()
  {
    return (EAttribute)qualitativeMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMapping_Evaluation()
  {
    return (EAttribute)qualitativeMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMapping_QualitativeEvaluation()
  {
    return (EAttribute)qualitativeMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeMapping_Exceeds()
  {
    return (EAttribute)qualitativeMappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPINewEvalValue()
  {
    return kpiNewEvalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPINewEvalValue_Name()
  {
    return (EAttribute)kpiNewEvalValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPINewEvalValue_EvaluationValue()
  {
    return (EAttribute)kpiNewEvalValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIInformationConfig()
  {
    return kpiInformationConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationConfig_Name()
  {
    return (EAttribute)kpiInformationConfigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationConfig_LevelOfDimension()
  {
    return (EAttribute)kpiInformationConfigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationConfig_ValueOfDimension()
  {
    return (EAttribute)kpiInformationConfigEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKPIInformationConfig_KpiInfoElement()
  {
    return (EReference)kpiInformationConfigEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIInformationElement()
  {
    return kpiInformationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElement_Name()
  {
    return (EAttribute)kpiInformationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElement_Label()
  {
    return (EAttribute)kpiInformationElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElement_Description()
  {
    return (EAttribute)kpiInformationElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKPIInformationElement_KpiModelLinksSrc()
  {
    return (EReference)kpiInformationElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKPIInformationElement_Refs()
  {
    return (EReference)kpiInformationElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIInformationElementRef()
  {
    return kpiInformationElementRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElementRef_Name()
  {
    return (EAttribute)kpiInformationElementRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElementRef_Label()
  {
    return (EAttribute)kpiInformationElementRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElementRef_Description()
  {
    return (EAttribute)kpiInformationElementRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIModelLink()
  {
    return kpiModelLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIModelLink_Name()
  {
    return (EAttribute)kpiModelLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIModelLink_Label()
  {
    return (EAttribute)kpiModelLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIModelLink_Description()
  {
    return (EAttribute)kpiModelLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicatorGroup()
  {
    return indicatorGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicatorGroup_Name()
  {
    return (EAttribute)indicatorGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicatorGroup_Label()
  {
    return (EAttribute)indicatorGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicatorGroup_Description()
  {
    return (EAttribute)indicatorGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndicatorGroup_IsRedesignCategory()
  {
    return (EAttribute)indicatorGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicatorGroup_Indicators()
  {
    return (EReference)indicatorGroupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getImportanceType()
  {
    return importanceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDecompositionType()
  {
    return decompositionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContributionType()
  {
    return contributionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQualitativeLabel()
  {
    return qualitativeLabelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCriticality()
  {
    return criticalityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPriority()
  {
    return priorityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TGRLFactory getTGRLFactory()
  {
    return (TGRLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GR_LSPECIFICATIONS);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__ID);

    grlBaseElementEClass = createEClass(GRL_BASE_ELEMENT);

    grlElementEClass = createEClass(GRL_ELEMENT);

    intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__NAME);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__LABEL);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__DESCRIPTION);

    elementLinkEClass = createEClass(ELEMENT_LINK);
    createEReference(elementLinkEClass, ELEMENT_LINK__SRC);

    inLineElementLinkEClass = createEClass(IN_LINE_ELEMENT_LINK);

    grlSpecificationEClass = createEClass(GRL_SPECIFICATION);
    createEAttribute(grlSpecificationEClass, GRL_SPECIFICATION__NAME);
    createEReference(grlSpecificationEClass, GRL_SPECIFICATION__GRL_ELEMENTS);

    actorEClass = createEClass(ACTOR);
    createEAttribute(actorEClass, ACTOR__NAME);
    createEAttribute(actorEClass, ACTOR__LABEL);
    createEAttribute(actorEClass, ACTOR__IMPORTANCE);
    createEAttribute(actorEClass, ACTOR__IMPORTANCE_QUANTITATIVE);
    createEAttribute(actorEClass, ACTOR__DESCRIPTION);
    createEAttribute(actorEClass, ACTOR__FILL_COLOR);
    createEReference(actorEClass, ACTOR__ELEMETS);

    softgoalEClass = createEClass(SOFTGOAL);
    createEAttribute(softgoalEClass, SOFTGOAL__FILL_COLOR);
    createEAttribute(softgoalEClass, SOFTGOAL__DECOMPOSITION_TYPE);
    createEAttribute(softgoalEClass, SOFTGOAL__IMPORTANCE);
    createEAttribute(softgoalEClass, SOFTGOAL__IMPORTANCE_QUANTITATIVE);
    createEReference(softgoalEClass, SOFTGOAL__ELEMENT_LINKS);

    goalEClass = createEClass(GOAL);
    createEAttribute(goalEClass, GOAL__FILL_COLOR);
    createEAttribute(goalEClass, GOAL__DECOMPOSITION_TYPE);
    createEAttribute(goalEClass, GOAL__IMPORTANCE);
    createEAttribute(goalEClass, GOAL__IMPORTANCE_QUANTITATIVE);
    createEReference(goalEClass, GOAL__ELEMENT_LINKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__FILL_COLOR);
    createEAttribute(taskEClass, TASK__DECOMPOSITION_TYPE);
    createEAttribute(taskEClass, TASK__IMPORTANCE);
    createEAttribute(taskEClass, TASK__IMPORTANCE_QUANTITATIVE);
    createEReference(taskEClass, TASK__ELEMENT_LINKS);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__FILL_COLOR);
    createEAttribute(resourceEClass, RESOURCE__DECOMPOSITION_TYPE);
    createEAttribute(resourceEClass, RESOURCE__IMPORTANCE);
    createEAttribute(resourceEClass, RESOURCE__IMPORTANCE_QUANTITATIVE);
    createEReference(resourceEClass, RESOURCE__ELEMENT_LINKS);

    indicatorEClass = createEClass(INDICATOR);
    createEAttribute(indicatorEClass, INDICATOR__FILL_COLOR);
    createEAttribute(indicatorEClass, INDICATOR__DECOMPOSITION_TYPE);
    createEAttribute(indicatorEClass, INDICATOR__IMPORTANCE);
    createEAttribute(indicatorEClass, INDICATOR__IMPORTANCE_QUANTITATIVE);
    createEReference(indicatorEClass, INDICATOR__KPI_MODEL_LINKS_DEST);
    createEReference(indicatorEClass, INDICATOR__GROUPS);
    createEReference(indicatorEClass, INDICATOR__ELEMENT_LINKS);

    beliefEClass = createEClass(BELIEF);

    decompositionEClass = createEClass(DECOMPOSITION);
    createEReference(decompositionEClass, DECOMPOSITION__DEST);

    inLineDecompositionEClass = createEClass(IN_LINE_DECOMPOSITION);
    createEReference(inLineDecompositionEClass, IN_LINE_DECOMPOSITION__DEST);

    decompositionEndEClass = createEClass(DECOMPOSITION_END);
    createEReference(decompositionEndEClass, DECOMPOSITION_END__NAME);
    createEAttribute(decompositionEndEClass, DECOMPOSITION_END__DESCRIPTION);

    contributionEClass = createEClass(CONTRIBUTION);
    createEReference(contributionEClass, CONTRIBUTION__DEST);

    inLineContributionEClass = createEClass(IN_LINE_CONTRIBUTION);
    createEReference(inLineContributionEClass, IN_LINE_CONTRIBUTION__DEST);

    contributionEndEClass = createEClass(CONTRIBUTION_END);
    createEReference(contributionEndEClass, CONTRIBUTION_END__NAME);
    createEAttribute(contributionEndEClass, CONTRIBUTION_END__CONTRIBUTION);
    createEAttribute(contributionEndEClass, CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION);

    dependencyEClass = createEClass(DEPENDENCY);
    createEReference(dependencyEClass, DEPENDENCY__DEST);

    inLineDependencyEClass = createEClass(IN_LINE_DEPENDENCY);
    createEReference(inLineDependencyEClass, IN_LINE_DEPENDENCY__DEST);

    dependencyEndEClass = createEClass(DEPENDENCY_END);
    createEReference(dependencyEndEClass, DEPENDENCY_END__NAME);
    createEAttribute(dependencyEndEClass, DEPENDENCY_END__DESCRIPTION);

    strategyGroupEClass = createEClass(STRATEGY_GROUP);
    createEAttribute(strategyGroupEClass, STRATEGY_GROUP__NAME);
    createEReference(strategyGroupEClass, STRATEGY_GROUP__STRATEGIES);

    evaluationStrategyEClass = createEClass(EVALUATION_STRATEGY);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__NAME);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__SUPER_STRATEGIES);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__EVALUATIONS);

    evaluationEClass = createEClass(EVALUATION);
    createEReference(evaluationEClass, EVALUATION__INTENTIONAL_ELEMENT);
    createEAttribute(evaluationEClass, EVALUATION__QUALITATIVE_EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__EXCEEDS);

    kpiConversionEClass = createEClass(KPI_CONVERSION);

    impactModelEClass = createEClass(IMPACT_MODEL);
    createEAttribute(impactModelEClass, IMPACT_MODEL__NAME);

    evaluationRangeEClass = createEClass(EVALUATION_RANGE);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__START);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__END);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__STEP);

    contributionContextGroupEClass = createEClass(CONTRIBUTION_CONTEXT_GROUP);
    createEAttribute(contributionContextGroupEClass, CONTRIBUTION_CONTEXT_GROUP__NAME);
    createEReference(contributionContextGroupEClass, CONTRIBUTION_CONTEXT_GROUP__CONTRIBS);

    contributionContextEClass = createEClass(CONTRIBUTION_CONTEXT);
    createEAttribute(contributionContextEClass, CONTRIBUTION_CONTEXT__NAME);
    createEReference(contributionContextEClass, CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS);
    createEReference(contributionContextEClass, CONTRIBUTION_CONTEXT__CHANGES);

    contributionChangeEClass = createEClass(CONTRIBUTION_CHANGE);
    createEAttribute(contributionChangeEClass, CONTRIBUTION_CHANGE__NAME);
    createEAttribute(contributionChangeEClass, CONTRIBUTION_CHANGE__NEW_CONTRIBUTION);
    createEAttribute(contributionChangeEClass, CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION);
    createEReference(contributionChangeEClass, CONTRIBUTION_CHANGE__CONTRIB_RANGE);

    contributionRangeEClass = createEClass(CONTRIBUTION_RANGE);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__START);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__END);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__STEP);

    qualitativeMappingsEClass = createEClass(QUALITATIVE_MAPPINGS);
    createEAttribute(qualitativeMappingsEClass, QUALITATIVE_MAPPINGS__NAME);
    createEReference(qualitativeMappingsEClass, QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET);
    createEReference(qualitativeMappingsEClass, QUALITATIVE_MAPPINGS__MAPPIN);

    kpiEvalValueSetEClass = createEClass(KPI_EVAL_VALUE_SET);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__NAME);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__TARGET_VALUE);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__THRESHOLD_VALUE);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__WORST_VALUE);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__EVALUATION_VALUE);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__UNIT);
    createEAttribute(kpiEvalValueSetEClass, KPI_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE);

    qualitativeMappingEClass = createEClass(QUALITATIVE_MAPPING);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__NAME);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__REAL_WORLD_LABEL);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__EVALUATION);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__EXCEEDS);

    kpiNewEvalValueEClass = createEClass(KPI_NEW_EVAL_VALUE);
    createEAttribute(kpiNewEvalValueEClass, KPI_NEW_EVAL_VALUE__NAME);
    createEAttribute(kpiNewEvalValueEClass, KPI_NEW_EVAL_VALUE__EVALUATION_VALUE);

    kpiInformationConfigEClass = createEClass(KPI_INFORMATION_CONFIG);
    createEAttribute(kpiInformationConfigEClass, KPI_INFORMATION_CONFIG__NAME);
    createEAttribute(kpiInformationConfigEClass, KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION);
    createEAttribute(kpiInformationConfigEClass, KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION);
    createEReference(kpiInformationConfigEClass, KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT);

    kpiInformationElementEClass = createEClass(KPI_INFORMATION_ELEMENT);
    createEAttribute(kpiInformationElementEClass, KPI_INFORMATION_ELEMENT__NAME);
    createEAttribute(kpiInformationElementEClass, KPI_INFORMATION_ELEMENT__LABEL);
    createEAttribute(kpiInformationElementEClass, KPI_INFORMATION_ELEMENT__DESCRIPTION);
    createEReference(kpiInformationElementEClass, KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC);
    createEReference(kpiInformationElementEClass, KPI_INFORMATION_ELEMENT__REFS);

    kpiInformationElementRefEClass = createEClass(KPI_INFORMATION_ELEMENT_REF);
    createEAttribute(kpiInformationElementRefEClass, KPI_INFORMATION_ELEMENT_REF__NAME);
    createEAttribute(kpiInformationElementRefEClass, KPI_INFORMATION_ELEMENT_REF__LABEL);
    createEAttribute(kpiInformationElementRefEClass, KPI_INFORMATION_ELEMENT_REF__DESCRIPTION);

    kpiModelLinkEClass = createEClass(KPI_MODEL_LINK);
    createEAttribute(kpiModelLinkEClass, KPI_MODEL_LINK__NAME);
    createEAttribute(kpiModelLinkEClass, KPI_MODEL_LINK__LABEL);
    createEAttribute(kpiModelLinkEClass, KPI_MODEL_LINK__DESCRIPTION);

    indicatorGroupEClass = createEClass(INDICATOR_GROUP);
    createEAttribute(indicatorGroupEClass, INDICATOR_GROUP__NAME);
    createEAttribute(indicatorGroupEClass, INDICATOR_GROUP__LABEL);
    createEAttribute(indicatorGroupEClass, INDICATOR_GROUP__DESCRIPTION);
    createEAttribute(indicatorGroupEClass, INDICATOR_GROUP__IS_REDESIGN_CATEGORY);
    createEReference(indicatorGroupEClass, INDICATOR_GROUP__INDICATORS);

    // Create enums
    importanceTypeEEnum = createEEnum(IMPORTANCE_TYPE);
    decompositionTypeEEnum = createEEnum(DECOMPOSITION_TYPE);
    contributionTypeEEnum = createEEnum(CONTRIBUTION_TYPE);
    qualitativeLabelEEnum = createEEnum(QUALITATIVE_LABEL);
    colorEEnum = createEEnum(COLOR);
    criticalityEEnum = createEEnum(CRITICALITY);
    priorityEEnum = createEEnum(PRIORITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    grlBaseElementEClass.getESuperTypes().add(this.getElement());
    grlElementEClass.getESuperTypes().add(this.getGRLBaseElement());
    intentionalElementEClass.getESuperTypes().add(this.getGRLElement());
    elementLinkEClass.getESuperTypes().add(this.getGRLElement());
    inLineElementLinkEClass.getESuperTypes().add(this.getGRLBaseElement());
    grlSpecificationEClass.getESuperTypes().add(this.getElement());
    actorEClass.getESuperTypes().add(this.getGRLElement());
    softgoalEClass.getESuperTypes().add(this.getIntentionalElement());
    goalEClass.getESuperTypes().add(this.getIntentionalElement());
    taskEClass.getESuperTypes().add(this.getIntentionalElement());
    resourceEClass.getESuperTypes().add(this.getIntentionalElement());
    indicatorEClass.getESuperTypes().add(this.getIntentionalElement());
    beliefEClass.getESuperTypes().add(this.getIntentionalElement());
    decompositionEClass.getESuperTypes().add(this.getElementLink());
    inLineDecompositionEClass.getESuperTypes().add(this.getInLineElementLink());
    contributionEClass.getESuperTypes().add(this.getElementLink());
    inLineContributionEClass.getESuperTypes().add(this.getInLineElementLink());
    dependencyEClass.getESuperTypes().add(this.getElementLink());
    inLineDependencyEClass.getESuperTypes().add(this.getInLineElementLink());
    strategyGroupEClass.getESuperTypes().add(this.getGRLElement());
    evaluationStrategyEClass.getESuperTypes().add(this.getGRLElement());
    evaluationEClass.getESuperTypes().add(this.getGRLElement());
    qualitativeMappingsEClass.getESuperTypes().add(this.getKPIConversion());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_GRLspecifications(), this.getGRLSpecification(), null, "gRLspecifications", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlBaseElementEClass, GRLBaseElement.class, "GRLBaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grlElementEClass, GRLElement.class, "GRLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentionalElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Label(), theEcorePackage.getEString(), "label", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementLinkEClass, ElementLink.class, "ElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementLink_Src(), this.getIntentionalElement(), null, "src", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineElementLinkEClass, InLineElementLink.class, "InLineElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grlSpecificationEClass, GRLSpecification.class, "GRLSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGRLSpecification_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GRLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLSpecification_GrlElements(), this.getGRLElement(), null, "grlElements", null, 0, -1, GRLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActor_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Importance(), this.getImportanceType(), "importance", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_FillColor(), this.getColor(), "fillColor", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_Elemets(), this.getGRLElement(), null, "elemets", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSoftgoal_FillColor(), this.getColor(), "fillColor", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftgoal_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftgoal_Importance(), this.getImportanceType(), "importance", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftgoal_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSoftgoal_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoal_FillColor(), this.getColor(), "fillColor", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Importance(), this.getImportanceType(), "importance", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_FillColor(), this.getColor(), "fillColor", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Importance(), this.getImportanceType(), "importance", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResource_FillColor(), this.getColor(), "fillColor", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Importance(), this.getImportanceType(), "importance", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResource_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indicatorEClass, Indicator.class, "Indicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndicator_FillColor(), this.getColor(), "fillColor", null, 0, 1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicator_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicator_Importance(), this.getImportanceType(), "importance", null, 0, 1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicator_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndicator_KpiModelLinksDest(), this.getKPIModelLink(), null, "kpiModelLinksDest", null, 0, -1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndicator_Groups(), this.getIndicatorGroup(), null, "groups", null, 0, -1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndicator_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecomposition_Dest(), this.getDecompositionEnd(), null, "dest", null, 0, -1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineDecompositionEClass, InLineDecomposition.class, "InLineDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineDecomposition_Dest(), this.getDecompositionEnd(), null, "dest", null, 0, -1, InLineDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decompositionEndEClass, DecompositionEnd.class, "DecompositionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecompositionEnd_Name(), this.getIntentionalElement(), null, "name", null, 0, 1, DecompositionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecompositionEnd_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DecompositionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContribution_Dest(), this.getContributionEnd(), null, "dest", null, 0, -1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineContributionEClass, InLineContribution.class, "InLineContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineContribution_Dest(), this.getContributionEnd(), null, "dest", null, 0, -1, InLineContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionEndEClass, ContributionEnd.class, "ContributionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContributionEnd_Name(), this.getIntentionalElement(), null, "name", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionEnd_Contribution(), this.getContributionType(), "contribution", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionEnd_QuantitativeContribution(), theEcorePackage.getEInt(), "quantitativeContribution", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependency_Dest(), this.getDependencyEnd(), null, "dest", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineDependencyEClass, InLineDependency.class, "InLineDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineDependency_Dest(), this.getDependencyEnd(), null, "dest", null, 0, -1, InLineDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEndEClass, DependencyEnd.class, "DependencyEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencyEnd_Name(), this.getIntentionalElement(), null, "name", null, 0, 1, DependencyEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependencyEnd_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DependencyEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategyGroupEClass, StrategyGroup.class, "StrategyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategyGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StrategyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyGroup_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, StrategyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationStrategyEClass, EvaluationStrategy.class, "EvaluationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationStrategy_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_SuperStrategies(), this.getEvaluationStrategy(), null, "superStrategies", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_Evaluations(), this.getEvaluation(), null, "evaluations", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvaluation_IntentionalElement(), this.getIntentionalElement(), null, "intentionalElement", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Evaluation(), theEcorePackage.getEInt(), "evaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Exceeds(), theEcorePackage.getEBoolean(), "exceeds", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiConversionEClass, KPIConversion.class, "KPIConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(impactModelEClass, ImpactModel.class, "ImpactModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImpactModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ImpactModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationRangeEClass, EvaluationRange.class, "EvaluationRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationRange_Start(), theEcorePackage.getEInt(), "start", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationRange_End(), theEcorePackage.getEInt(), "end", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationRange_Step(), theEcorePackage.getEInt(), "step", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionContextGroupEClass, ContributionContextGroup.class, "ContributionContextGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionContextGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionContextGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContextGroup_Contribs(), this.getContributionContext(), null, "contribs", null, 0, -1, ContributionContextGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionContextEClass, ContributionContext.class, "ContributionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionContext_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContext_IncludedContexts(), this.getContributionContext(), null, "includedContexts", null, 0, -1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContext_Changes(), this.getContributionChange(), null, "changes", null, 0, -1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionChangeEClass, ContributionChange.class, "ContributionChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionChange_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionChange_NewContribution(), this.getContributionType(), "newContribution", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionChange_NewQuantitativeContribution(), theEcorePackage.getEInt(), "newQuantitativeContribution", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionChange_ContribRange(), this.getContributionRange(), null, "contribRange", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionRangeEClass, ContributionRange.class, "ContributionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionRange_Start(), theEcorePackage.getEInt(), "start", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionRange_End(), theEcorePackage.getEInt(), "end", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionRange_Step(), theEcorePackage.getEInt(), "step", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualitativeMappingsEClass, QualitativeMappings.class, "QualitativeMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualitativeMappings_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QualitativeMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeMappings_KpiEvalValueSet(), this.getKPIEvalValueSet(), null, "kpiEvalValueSet", null, 0, -1, QualitativeMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeMappings_Mappin(), this.getQualitativeMapping(), null, "mappin", null, 0, -1, QualitativeMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiEvalValueSetEClass, KPIEvalValueSet.class, "KPIEvalValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIEvalValueSet_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_TargetValue(), theEcorePackage.getEDouble(), "targetValue", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_ThresholdValue(), theEcorePackage.getEDouble(), "thresholdValue", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_WorstValue(), theEcorePackage.getEDouble(), "worstValue", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_EvaluationValue(), theEcorePackage.getEDouble(), "evaluationValue", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_Unit(), theEcorePackage.getEString(), "unit", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIEvalValueSet_QualitativeEvaluationValue(), theEcorePackage.getEString(), "qualitativeEvaluationValue", null, 0, 1, KPIEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualitativeMappingEClass, QualitativeMapping.class, "QualitativeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualitativeMapping_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualitativeMapping_RealWorldLabel(), theEcorePackage.getEString(), "realWorldLabel", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualitativeMapping_Evaluation(), theEcorePackage.getEInt(), "evaluation", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualitativeMapping_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualitativeMapping_Exceeds(), theEcorePackage.getEString(), "exceeds", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiNewEvalValueEClass, KPINewEvalValue.class, "KPINewEvalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPINewEvalValue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPINewEvalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPINewEvalValue_EvaluationValue(), theEcorePackage.getEDouble(), "evaluationValue", null, 0, 1, KPINewEvalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiInformationConfigEClass, KPIInformationConfig.class, "KPIInformationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIInformationConfig_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPIInformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationConfig_LevelOfDimension(), theEcorePackage.getEString(), "levelOfDimension", null, 0, 1, KPIInformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationConfig_ValueOfDimension(), theEcorePackage.getEString(), "valueOfDimension", null, 0, 1, KPIInformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKPIInformationConfig_KpiInfoElement(), this.getKPIInformationElement(), null, "kpiInfoElement", null, 0, 1, KPIInformationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiInformationElementEClass, KPIInformationElement.class, "KPIInformationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIInformationElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPIInformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationElement_Label(), theEcorePackage.getEString(), "label", null, 0, 1, KPIInformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, KPIInformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKPIInformationElement_KpiModelLinksSrc(), this.getKPIModelLink(), null, "kpiModelLinksSrc", null, 0, -1, KPIInformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKPIInformationElement_Refs(), this.getKPIInformationElementRef(), null, "refs", null, 0, -1, KPIInformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiInformationElementRefEClass, KPIInformationElementRef.class, "KPIInformationElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIInformationElementRef_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPIInformationElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationElementRef_Label(), theEcorePackage.getEString(), "label", null, 0, 1, KPIInformationElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIInformationElementRef_Description(), theEcorePackage.getEString(), "description", null, 0, 1, KPIInformationElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiModelLinkEClass, KPIModelLink.class, "KPIModelLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIModelLink_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KPIModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIModelLink_Label(), theEcorePackage.getEString(), "label", null, 0, 1, KPIModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIModelLink_Description(), theEcorePackage.getEString(), "description", null, 0, 1, KPIModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indicatorGroupEClass, IndicatorGroup.class, "IndicatorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndicatorGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicatorGroup_Label(), theEcorePackage.getEString(), "label", null, 0, 1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicatorGroup_Description(), theEcorePackage.getEString(), "description", null, 0, 1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndicatorGroup_IsRedesignCategory(), theEcorePackage.getEString(), "isRedesignCategory", null, 0, 1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndicatorGroup_Indicators(), this.getIndicator(), null, "indicators", null, 0, -1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(importanceTypeEEnum, ImportanceType.class, "ImportanceType");
    addEEnumLiteral(importanceTypeEEnum, ImportanceType.NONE);
    addEEnumLiteral(importanceTypeEEnum, ImportanceType.HIGH);
    addEEnumLiteral(importanceTypeEEnum, ImportanceType.MEDIUM);
    addEEnumLiteral(importanceTypeEEnum, ImportanceType.LOW);

    initEEnum(decompositionTypeEEnum, DecompositionType.class, "DecompositionType");
    addEEnumLiteral(decompositionTypeEEnum, DecompositionType.AND);
    addEEnumLiteral(decompositionTypeEEnum, DecompositionType.OR);
    addEEnumLiteral(decompositionTypeEEnum, DecompositionType.XOR);

    initEEnum(contributionTypeEEnum, ContributionType.class, "ContributionType");
    addEEnumLiteral(contributionTypeEEnum, ContributionType.HELP);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.MAKE);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_POSITIVE);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.UNKNOWN);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_NEGATIVE);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.HURT);
    addEEnumLiteral(contributionTypeEEnum, ContributionType.BREAK);

    initEEnum(qualitativeLabelEEnum, QualitativeLabel.class, "QualitativeLabel");
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.DENIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_DENIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_SATISFIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.SATISFIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.CONFLICT);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.UNKNOWN);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.NONE);

    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.WHITE);
    addEEnumLiteral(colorEEnum, Color.BLACK);
    addEEnumLiteral(colorEEnum, Color.BLUE);
    addEEnumLiteral(colorEEnum, Color.GREEN);
    addEEnumLiteral(colorEEnum, Color.CYAN);
    addEEnumLiteral(colorEEnum, Color.RED);
    addEEnumLiteral(colorEEnum, Color.PURPLE);
    addEEnumLiteral(colorEEnum, Color.YELLOW);
    addEEnumLiteral(colorEEnum, Color.GRAY);
    addEEnumLiteral(colorEEnum, Color.LIGHT_GRAY);
    addEEnumLiteral(colorEEnum, Color.LIGHT_BLUE);
    addEEnumLiteral(colorEEnum, Color.LIGHT_GREEN);
    addEEnumLiteral(colorEEnum, Color.LIGHT_CRAY);
    addEEnumLiteral(colorEEnum, Color.LIGHT_RED);
    addEEnumLiteral(colorEEnum, Color.LIGHT_PURPLE);
    addEEnumLiteral(colorEEnum, Color.LIGHT_YELLOW);

    initEEnum(criticalityEEnum, Criticality.class, "Criticality");
    addEEnumLiteral(criticalityEEnum, Criticality.NONE);
    addEEnumLiteral(criticalityEEnum, Criticality.HIGH);
    addEEnumLiteral(criticalityEEnum, Criticality.MEDIUM);
    addEEnumLiteral(criticalityEEnum, Criticality.LOW);

    initEEnum(priorityEEnum, Priority.class, "Priority");
    addEEnumLiteral(priorityEEnum, Priority.NONE);
    addEEnumLiteral(priorityEEnum, Priority.HIGH);
    addEEnumLiteral(priorityEEnum, Priority.MEDIUM);
    addEEnumLiteral(priorityEEnum, Priority.LOW);

    // Create resource
    createResource(eNS_URI);
  }

} //TGRLPackageImpl
