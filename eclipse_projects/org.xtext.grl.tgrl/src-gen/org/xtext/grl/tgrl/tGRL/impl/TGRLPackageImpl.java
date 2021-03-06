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
  private EClass superIntentionalElementEClass = null;

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
  private EClass elementLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalElementLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalContributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalDecompositionEClass = null;

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
  private EClass inLineLinkEClass = null;

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
  private EClass inLineContributionEClass = null;

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
  private EClass contributionEndEClass = null;

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
  private EClass linkTypeEClass = null;

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
  private EClass evaluationRangeEClass = null;

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
  private EClass kpiQuantitativeEvalValueSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kpiQualitativeEvalValueSetEClass = null;

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
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributionGroupEClass = null;

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
  private EClass metadataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanEEnum = null;

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
  public EClass getSuperIntentionalElement()
  {
    return superIntentionalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuperIntentionalElement_Name()
  {
    return (EAttribute)superIntentionalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuperIntentionalElement_Label()
  {
    return (EAttribute)superIntentionalElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuperIntentionalElement_Description()
  {
    return (EAttribute)superIntentionalElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuperIntentionalElement_MetaData()
  {
    return (EReference)superIntentionalElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuperIntentionalElement_FillColor()
  {
    return (EAttribute)superIntentionalElementEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getIntentionalElement_DecompositionType()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Importance()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_ImportanceQuantitative()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntentionalElement_ElementLinks()
  {
    return (EReference)intentionalElementEClass.getEStructuralFeatures().get(3);
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
  public EReference getActor_MetaData()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_FillColor()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Elemets()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(7);
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
  public EClass getGoal()
  {
    return goalEClass;
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
  public EClass getResource()
  {
    return resourceEClass;
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
  public EClass getBelief()
  {
    return beliefEClass;
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
  public EClass getEndLink()
  {
    return endLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEndLink_DestName()
  {
    return (EReference)endLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndLink_Id()
  {
    return (EAttribute)endLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalElementLink()
  {
    return normalElementLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalLink()
  {
    return normalLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalLink_Src()
  {
    return (EReference)normalLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalLink_Type()
  {
    return (EReference)normalLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalLink_Dest()
  {
    return (EReference)normalLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalDependency()
  {
    return normalDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalDependency_Src()
  {
    return (EReference)normalDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalDependency_Dest()
  {
    return (EReference)normalDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalContribution()
  {
    return normalContributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalContribution_Src()
  {
    return (EReference)normalContributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalContribution_Dest()
  {
    return (EReference)normalContributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalDecomposition()
  {
    return normalDecompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalDecomposition_Src()
  {
    return (EReference)normalDecompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalDecomposition_Dest()
  {
    return (EReference)normalDecompositionEClass.getEStructuralFeatures().get(1);
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
  public EClass getInLineLink()
  {
    return inLineLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInLineLink_Type()
  {
    return (EReference)inLineLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInLineLink_Dest()
  {
    return (EReference)inLineLinkEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDecompositionEnd_Description()
  {
    return (EAttribute)decompositionEndEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getContributionEnd_Name()
  {
    return (EAttribute)contributionEndEClass.getEStructuralFeatures().get(0);
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
  public EClass getDependencyEnd()
  {
    return dependencyEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyEnd_Description()
  {
    return (EAttribute)dependencyEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkType()
  {
    return linkTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkType_Name()
  {
    return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
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
  public EReference getEvaluationStrategy_MetaData()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_Evaluations()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(3);
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
  public EReference getEvaluation_EvalRange()
  {
    return (EReference)evaluationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluation_KpiEvalValueSet()
  {
    return (EReference)evaluationEClass.getEStructuralFeatures().get(5);
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
  public EClass getKPIEvalValueSet()
  {
    return kpiEvalValueSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIQuantitativeEvalValueSet()
  {
    return kpiQuantitativeEvalValueSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIQuantitativeEvalValueSet_TargetValue()
  {
    return (EAttribute)kpiQuantitativeEvalValueSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIQuantitativeEvalValueSet_ThresholdValue()
  {
    return (EAttribute)kpiQuantitativeEvalValueSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIQuantitativeEvalValueSet_WorstValue()
  {
    return (EAttribute)kpiQuantitativeEvalValueSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIQuantitativeEvalValueSet_EvaluationValue()
  {
    return (EAttribute)kpiQuantitativeEvalValueSetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIQuantitativeEvalValueSet_Unit()
  {
    return (EAttribute)kpiQuantitativeEvalValueSetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKPIQualitativeEvalValueSet()
  {
    return kpiQualitativeEvalValueSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKPIQualitativeEvalValueSet_QualitativeEvaluationValue()
  {
    return (EReference)kpiQualitativeEvalValueSetEClass.getEStructuralFeatures().get(0);
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
  public EReference getQualitativeMapping_MetaData()
  {
    return (EReference)qualitativeMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeMapping_Mappings()
  {
    return (EReference)qualitativeMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Name()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Evaluation()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_QualitativeEvaluation()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Exceeds()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributionGroup()
  {
    return contributionGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributionGroup_Name()
  {
    return (EAttribute)contributionGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionGroup_Contribs()
  {
    return (EReference)contributionGroupEClass.getEStructuralFeatures().get(1);
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
  public EReference getContributionContext_SuperContributionContexts()
  {
    return (EReference)contributionContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionContext_MetaData()
  {
    return (EReference)contributionContextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributionContext_Changes()
  {
    return (EReference)contributionContextEClass.getEStructuralFeatures().get(3);
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
  public EReference getContributionChange_Contribution()
  {
    return (EReference)contributionChangeEClass.getEStructuralFeatures().get(0);
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
  public EClass getMetadata()
  {
    return metadataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadata_Name()
  {
    return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadata_Value()
  {
    return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Content()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
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
  public EReference getIndicatorGroup_Indicators()
  {
    return (EReference)indicatorGroupEClass.getEStructuralFeatures().get(1);
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
  public EEnum getBoolean()
  {
    return booleanEEnum;
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

    superIntentionalElementEClass = createEClass(SUPER_INTENTIONAL_ELEMENT);
    createEAttribute(superIntentionalElementEClass, SUPER_INTENTIONAL_ELEMENT__NAME);
    createEAttribute(superIntentionalElementEClass, SUPER_INTENTIONAL_ELEMENT__LABEL);
    createEAttribute(superIntentionalElementEClass, SUPER_INTENTIONAL_ELEMENT__DESCRIPTION);
    createEReference(superIntentionalElementEClass, SUPER_INTENTIONAL_ELEMENT__META_DATA);
    createEAttribute(superIntentionalElementEClass, SUPER_INTENTIONAL_ELEMENT__FILL_COLOR);

    intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__IMPORTANCE);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE);
    createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__ELEMENT_LINKS);

    grlSpecificationEClass = createEClass(GRL_SPECIFICATION);
    createEAttribute(grlSpecificationEClass, GRL_SPECIFICATION__NAME);
    createEReference(grlSpecificationEClass, GRL_SPECIFICATION__GRL_ELEMENTS);

    actorEClass = createEClass(ACTOR);
    createEAttribute(actorEClass, ACTOR__NAME);
    createEAttribute(actorEClass, ACTOR__LABEL);
    createEAttribute(actorEClass, ACTOR__IMPORTANCE);
    createEAttribute(actorEClass, ACTOR__IMPORTANCE_QUANTITATIVE);
    createEAttribute(actorEClass, ACTOR__DESCRIPTION);
    createEReference(actorEClass, ACTOR__META_DATA);
    createEAttribute(actorEClass, ACTOR__FILL_COLOR);
    createEReference(actorEClass, ACTOR__ELEMETS);

    softgoalEClass = createEClass(SOFTGOAL);

    goalEClass = createEClass(GOAL);

    taskEClass = createEClass(TASK);

    resourceEClass = createEClass(RESOURCE);

    indicatorEClass = createEClass(INDICATOR);

    beliefEClass = createEClass(BELIEF);

    elementLinkEClass = createEClass(ELEMENT_LINK);

    endLinkEClass = createEClass(END_LINK);
    createEReference(endLinkEClass, END_LINK__DEST_NAME);
    createEAttribute(endLinkEClass, END_LINK__ID);

    normalElementLinkEClass = createEClass(NORMAL_ELEMENT_LINK);

    normalLinkEClass = createEClass(NORMAL_LINK);
    createEReference(normalLinkEClass, NORMAL_LINK__SRC);
    createEReference(normalLinkEClass, NORMAL_LINK__TYPE);
    createEReference(normalLinkEClass, NORMAL_LINK__DEST);

    normalDependencyEClass = createEClass(NORMAL_DEPENDENCY);
    createEReference(normalDependencyEClass, NORMAL_DEPENDENCY__SRC);
    createEReference(normalDependencyEClass, NORMAL_DEPENDENCY__DEST);

    normalContributionEClass = createEClass(NORMAL_CONTRIBUTION);
    createEReference(normalContributionEClass, NORMAL_CONTRIBUTION__SRC);
    createEReference(normalContributionEClass, NORMAL_CONTRIBUTION__DEST);

    normalDecompositionEClass = createEClass(NORMAL_DECOMPOSITION);
    createEReference(normalDecompositionEClass, NORMAL_DECOMPOSITION__SRC);
    createEReference(normalDecompositionEClass, NORMAL_DECOMPOSITION__DEST);

    inLineElementLinkEClass = createEClass(IN_LINE_ELEMENT_LINK);

    inLineLinkEClass = createEClass(IN_LINE_LINK);
    createEReference(inLineLinkEClass, IN_LINE_LINK__TYPE);
    createEReference(inLineLinkEClass, IN_LINE_LINK__DEST);

    inLineDependencyEClass = createEClass(IN_LINE_DEPENDENCY);
    createEReference(inLineDependencyEClass, IN_LINE_DEPENDENCY__DEST);

    inLineContributionEClass = createEClass(IN_LINE_CONTRIBUTION);
    createEReference(inLineContributionEClass, IN_LINE_CONTRIBUTION__DEST);

    inLineDecompositionEClass = createEClass(IN_LINE_DECOMPOSITION);
    createEReference(inLineDecompositionEClass, IN_LINE_DECOMPOSITION__DEST);

    decompositionEndEClass = createEClass(DECOMPOSITION_END);
    createEAttribute(decompositionEndEClass, DECOMPOSITION_END__DESCRIPTION);

    contributionEndEClass = createEClass(CONTRIBUTION_END);
    createEAttribute(contributionEndEClass, CONTRIBUTION_END__NAME);
    createEAttribute(contributionEndEClass, CONTRIBUTION_END__CONTRIBUTION);
    createEAttribute(contributionEndEClass, CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION);

    dependencyEndEClass = createEClass(DEPENDENCY_END);
    createEAttribute(dependencyEndEClass, DEPENDENCY_END__DESCRIPTION);

    linkTypeEClass = createEClass(LINK_TYPE);
    createEAttribute(linkTypeEClass, LINK_TYPE__NAME);

    strategyGroupEClass = createEClass(STRATEGY_GROUP);
    createEAttribute(strategyGroupEClass, STRATEGY_GROUP__NAME);
    createEReference(strategyGroupEClass, STRATEGY_GROUP__STRATEGIES);

    evaluationStrategyEClass = createEClass(EVALUATION_STRATEGY);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__NAME);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__SUPER_STRATEGIES);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__META_DATA);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__EVALUATIONS);

    evaluationEClass = createEClass(EVALUATION);
    createEReference(evaluationEClass, EVALUATION__INTENTIONAL_ELEMENT);
    createEAttribute(evaluationEClass, EVALUATION__QUALITATIVE_EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__EXCEEDS);
    createEReference(evaluationEClass, EVALUATION__EVAL_RANGE);
    createEReference(evaluationEClass, EVALUATION__KPI_EVAL_VALUE_SET);

    evaluationRangeEClass = createEClass(EVALUATION_RANGE);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__START);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__END);
    createEAttribute(evaluationRangeEClass, EVALUATION_RANGE__STEP);

    kpiEvalValueSetEClass = createEClass(KPI_EVAL_VALUE_SET);

    kpiQuantitativeEvalValueSetEClass = createEClass(KPI_QUANTITATIVE_EVAL_VALUE_SET);
    createEAttribute(kpiQuantitativeEvalValueSetEClass, KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE);
    createEAttribute(kpiQuantitativeEvalValueSetEClass, KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE);
    createEAttribute(kpiQuantitativeEvalValueSetEClass, KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE);
    createEAttribute(kpiQuantitativeEvalValueSetEClass, KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE);
    createEAttribute(kpiQuantitativeEvalValueSetEClass, KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT);

    kpiQualitativeEvalValueSetEClass = createEClass(KPI_QUALITATIVE_EVAL_VALUE_SET);
    createEReference(kpiQualitativeEvalValueSetEClass, KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE);

    qualitativeMappingEClass = createEClass(QUALITATIVE_MAPPING);
    createEAttribute(qualitativeMappingEClass, QUALITATIVE_MAPPING__NAME);
    createEReference(qualitativeMappingEClass, QUALITATIVE_MAPPING__META_DATA);
    createEReference(qualitativeMappingEClass, QUALITATIVE_MAPPING__MAPPINGS);

    mappingEClass = createEClass(MAPPING);
    createEAttribute(mappingEClass, MAPPING__NAME);
    createEAttribute(mappingEClass, MAPPING__EVALUATION);
    createEAttribute(mappingEClass, MAPPING__QUALITATIVE_EVALUATION);
    createEAttribute(mappingEClass, MAPPING__EXCEEDS);

    contributionGroupEClass = createEClass(CONTRIBUTION_GROUP);
    createEAttribute(contributionGroupEClass, CONTRIBUTION_GROUP__NAME);
    createEReference(contributionGroupEClass, CONTRIBUTION_GROUP__CONTRIBS);

    contributionContextEClass = createEClass(CONTRIBUTION_CONTEXT);
    createEAttribute(contributionContextEClass, CONTRIBUTION_CONTEXT__NAME);
    createEReference(contributionContextEClass, CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS);
    createEReference(contributionContextEClass, CONTRIBUTION_CONTEXT__META_DATA);
    createEReference(contributionContextEClass, CONTRIBUTION_CONTEXT__CHANGES);

    contributionChangeEClass = createEClass(CONTRIBUTION_CHANGE);
    createEReference(contributionChangeEClass, CONTRIBUTION_CHANGE__CONTRIBUTION);
    createEAttribute(contributionChangeEClass, CONTRIBUTION_CHANGE__NEW_CONTRIBUTION);
    createEAttribute(contributionChangeEClass, CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION);
    createEReference(contributionChangeEClass, CONTRIBUTION_CHANGE__CONTRIB_RANGE);

    contributionRangeEClass = createEClass(CONTRIBUTION_RANGE);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__START);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__END);
    createEAttribute(contributionRangeEClass, CONTRIBUTION_RANGE__STEP);

    metadataEClass = createEClass(METADATA);
    createEAttribute(metadataEClass, METADATA__NAME);
    createEAttribute(metadataEClass, METADATA__VALUE);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__CONTENT);

    indicatorGroupEClass = createEClass(INDICATOR_GROUP);
    createEAttribute(indicatorGroupEClass, INDICATOR_GROUP__NAME);
    createEReference(indicatorGroupEClass, INDICATOR_GROUP__INDICATORS);

    // Create enums
    importanceTypeEEnum = createEEnum(IMPORTANCE_TYPE);
    decompositionTypeEEnum = createEEnum(DECOMPOSITION_TYPE);
    contributionTypeEEnum = createEEnum(CONTRIBUTION_TYPE);
    qualitativeLabelEEnum = createEEnum(QUALITATIVE_LABEL);
    colorEEnum = createEEnum(COLOR);
    criticalityEEnum = createEEnum(CRITICALITY);
    priorityEEnum = createEEnum(PRIORITY);
    booleanEEnum = createEEnum(BOOLEAN);
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
    superIntentionalElementEClass.getESuperTypes().add(this.getGRLElement());
    intentionalElementEClass.getESuperTypes().add(this.getSuperIntentionalElement());
    grlSpecificationEClass.getESuperTypes().add(this.getElement());
    actorEClass.getESuperTypes().add(this.getGRLElement());
    softgoalEClass.getESuperTypes().add(this.getIntentionalElement());
    goalEClass.getESuperTypes().add(this.getIntentionalElement());
    taskEClass.getESuperTypes().add(this.getIntentionalElement());
    resourceEClass.getESuperTypes().add(this.getIntentionalElement());
    indicatorEClass.getESuperTypes().add(this.getIntentionalElement());
    beliefEClass.getESuperTypes().add(this.getSuperIntentionalElement());
    normalElementLinkEClass.getESuperTypes().add(this.getGRLElement());
    normalElementLinkEClass.getESuperTypes().add(this.getElementLink());
    normalLinkEClass.getESuperTypes().add(this.getNormalElementLink());
    normalDependencyEClass.getESuperTypes().add(this.getNormalElementLink());
    normalContributionEClass.getESuperTypes().add(this.getNormalElementLink());
    normalDecompositionEClass.getESuperTypes().add(this.getNormalElementLink());
    inLineElementLinkEClass.getESuperTypes().add(this.getGRLBaseElement());
    inLineElementLinkEClass.getESuperTypes().add(this.getElementLink());
    inLineLinkEClass.getESuperTypes().add(this.getInLineElementLink());
    inLineDependencyEClass.getESuperTypes().add(this.getInLineElementLink());
    inLineContributionEClass.getESuperTypes().add(this.getInLineElementLink());
    inLineDecompositionEClass.getESuperTypes().add(this.getInLineElementLink());
    decompositionEndEClass.getESuperTypes().add(this.getEndLink());
    contributionEndEClass.getESuperTypes().add(this.getEndLink());
    dependencyEndEClass.getESuperTypes().add(this.getEndLink());
    linkTypeEClass.getESuperTypes().add(this.getGRLElement());
    strategyGroupEClass.getESuperTypes().add(this.getGRLElement());
    evaluationStrategyEClass.getESuperTypes().add(this.getGRLElement());
    evaluationEClass.getESuperTypes().add(this.getGRLElement());
    kpiQuantitativeEvalValueSetEClass.getESuperTypes().add(this.getKPIEvalValueSet());
    kpiQualitativeEvalValueSetEClass.getESuperTypes().add(this.getKPIEvalValueSet());
    qualitativeMappingEClass.getESuperTypes().add(this.getGRLElement());
    mappingEClass.getESuperTypes().add(this.getGRLBaseElement());
    contributionGroupEClass.getESuperTypes().add(this.getGRLElement());
    contributionContextEClass.getESuperTypes().add(this.getGRLElement());
    metadataEClass.getESuperTypes().add(this.getGRLElement());
    commentEClass.getESuperTypes().add(this.getGRLElement());
    indicatorGroupEClass.getESuperTypes().add(this.getGRLElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_GRLspecifications(), this.getGRLSpecification(), null, "gRLspecifications", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlBaseElementEClass, GRLBaseElement.class, "GRLBaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grlElementEClass, GRLElement.class, "GRLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(superIntentionalElementEClass, SuperIntentionalElement.class, "SuperIntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSuperIntentionalElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SuperIntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSuperIntentionalElement_Label(), theEcorePackage.getEString(), "label", null, 0, 1, SuperIntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSuperIntentionalElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SuperIntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSuperIntentionalElement_MetaData(), this.getMetadata(), null, "metaData", null, 0, -1, SuperIntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSuperIntentionalElement_FillColor(), this.getColor(), "fillColor", null, 0, 1, SuperIntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentionalElement_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Importance(), this.getImportanceType(), "importance", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_ImportanceQuantitative(), theEcorePackage.getEString(), "importanceQuantitative", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntentionalElement_ElementLinks(), this.getInLineElementLink(), null, "elementLinks", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlSpecificationEClass, GRLSpecification.class, "GRLSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGRLSpecification_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GRLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLSpecification_GrlElements(), this.getGRLElement(), null, "grlElements", null, 0, -1, GRLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActor_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Importance(), this.getImportanceType(), "importance", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_ImportanceQuantitative(), theEcorePackage.getEString(), "importanceQuantitative", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_MetaData(), this.getMetadata(), null, "metaData", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_FillColor(), this.getColor(), "fillColor", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_Elemets(), this.getGRLElement(), null, "elemets", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indicatorEClass, Indicator.class, "Indicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementLinkEClass, ElementLink.class, "ElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(endLinkEClass, EndLink.class, "EndLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEndLink_DestName(), this.getSuperIntentionalElement(), null, "destName", null, 0, 1, EndLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEndLink_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, EndLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalElementLinkEClass, NormalElementLink.class, "NormalElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(normalLinkEClass, NormalLink.class, "NormalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNormalLink_Src(), this.getGRLElement(), null, "src", null, 0, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalLink_Type(), this.getLinkType(), null, "type", null, 0, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalLink_Dest(), this.getGRLElement(), null, "dest", null, 0, -1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalDependencyEClass, NormalDependency.class, "NormalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNormalDependency_Src(), this.getSuperIntentionalElement(), null, "src", null, 0, 1, NormalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalDependency_Dest(), this.getDependencyEnd(), null, "dest", null, 0, -1, NormalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalContributionEClass, NormalContribution.class, "NormalContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNormalContribution_Src(), this.getSuperIntentionalElement(), null, "src", null, 0, 1, NormalContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalContribution_Dest(), this.getContributionEnd(), null, "dest", null, 0, -1, NormalContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalDecompositionEClass, NormalDecomposition.class, "NormalDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNormalDecomposition_Src(), this.getSuperIntentionalElement(), null, "src", null, 0, 1, NormalDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalDecomposition_Dest(), this.getDecompositionEnd(), null, "dest", null, 0, -1, NormalDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineElementLinkEClass, InLineElementLink.class, "InLineElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inLineLinkEClass, InLineLink.class, "InLineLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineLink_Type(), this.getLinkType(), null, "type", null, 0, 1, InLineLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInLineLink_Dest(), this.getGRLElement(), null, "dest", null, 0, -1, InLineLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineDependencyEClass, InLineDependency.class, "InLineDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineDependency_Dest(), this.getDependencyEnd(), null, "dest", null, 0, -1, InLineDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineContributionEClass, InLineContribution.class, "InLineContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineContribution_Dest(), this.getContributionEnd(), null, "dest", null, 0, -1, InLineContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inLineDecompositionEClass, InLineDecomposition.class, "InLineDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInLineDecomposition_Dest(), this.getDecompositionEnd(), null, "dest", null, 0, -1, InLineDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decompositionEndEClass, DecompositionEnd.class, "DecompositionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecompositionEnd_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DecompositionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionEndEClass, ContributionEnd.class, "ContributionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionEnd_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionEnd_Contribution(), this.getContributionType(), "contribution", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionEnd_QuantitativeContribution(), theEcorePackage.getEString(), "quantitativeContribution", null, 0, 1, ContributionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEndEClass, DependencyEnd.class, "DependencyEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependencyEnd_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DependencyEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategyGroupEClass, StrategyGroup.class, "StrategyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategyGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StrategyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyGroup_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, StrategyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationStrategyEClass, EvaluationStrategy.class, "EvaluationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationStrategy_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_SuperStrategies(), this.getEvaluationStrategy(), null, "superStrategies", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_MetaData(), this.getMetadata(), null, "metaData", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_Evaluations(), this.getEvaluation(), null, "evaluations", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvaluation_IntentionalElement(), this.getSuperIntentionalElement(), null, "intentionalElement", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Evaluation(), theEcorePackage.getEString(), "evaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Exceeds(), theEcorePackage.getEBoolean(), "exceeds", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_EvalRange(), this.getEvaluationRange(), null, "evalRange", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_KpiEvalValueSet(), this.getKPIEvalValueSet(), null, "kpiEvalValueSet", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationRangeEClass, EvaluationRange.class, "EvaluationRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationRange_Start(), theEcorePackage.getEString(), "start", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationRange_End(), theEcorePackage.getEString(), "end", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationRange_Step(), theEcorePackage.getEString(), "step", null, 0, 1, EvaluationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiEvalValueSetEClass, KPIEvalValueSet.class, "KPIEvalValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kpiQuantitativeEvalValueSetEClass, KPIQuantitativeEvalValueSet.class, "KPIQuantitativeEvalValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKPIQuantitativeEvalValueSet_TargetValue(), theEcorePackage.getEDouble(), "targetValue", null, 0, 1, KPIQuantitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIQuantitativeEvalValueSet_ThresholdValue(), theEcorePackage.getEDouble(), "thresholdValue", null, 0, 1, KPIQuantitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIQuantitativeEvalValueSet_WorstValue(), theEcorePackage.getEDouble(), "worstValue", null, 0, 1, KPIQuantitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIQuantitativeEvalValueSet_EvaluationValue(), theEcorePackage.getEDouble(), "evaluationValue", null, 0, 1, KPIQuantitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKPIQuantitativeEvalValueSet_Unit(), theEcorePackage.getEString(), "unit", null, 0, 1, KPIQuantitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiQualitativeEvalValueSetEClass, KPIQualitativeEvalValueSet.class, "KPIQualitativeEvalValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKPIQualitativeEvalValueSet_QualitativeEvaluationValue(), this.getMapping(), null, "qualitativeEvaluationValue", null, 0, 1, KPIQualitativeEvalValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualitativeMappingEClass, QualitativeMapping.class, "QualitativeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualitativeMapping_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeMapping_MetaData(), this.getMetadata(), null, "metaData", null, 0, -1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeMapping_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, QualitativeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapping_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapping_Evaluation(), theEcorePackage.getEString(), "evaluation", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapping_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapping_Exceeds(), this.getBoolean(), "exceeds", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionGroupEClass, ContributionGroup.class, "ContributionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionGroup_Contribs(), this.getContributionContext(), null, "contribs", null, 0, -1, ContributionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionContextEClass, ContributionContext.class, "ContributionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionContext_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContext_SuperContributionContexts(), this.getContributionContext(), null, "superContributionContexts", null, 0, -1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContext_MetaData(), this.getMetadata(), null, "metaData", null, 0, -1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionContext_Changes(), this.getContributionChange(), null, "changes", null, 0, -1, ContributionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionChangeEClass, ContributionChange.class, "ContributionChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContributionChange_Contribution(), this.getContributionEnd(), null, "contribution", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionChange_NewContribution(), this.getContributionType(), "newContribution", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionChange_NewQuantitativeContribution(), theEcorePackage.getEString(), "newQuantitativeContribution", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributionChange_ContribRange(), this.getContributionRange(), null, "contribRange", null, 0, 1, ContributionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributionRangeEClass, ContributionRange.class, "ContributionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributionRange_Start(), theEcorePackage.getEString(), "start", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionRange_End(), theEcorePackage.getEString(), "end", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributionRange_Step(), theEcorePackage.getEString(), "step", null, 0, 1, ContributionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetadata_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadata_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indicatorGroupEClass, IndicatorGroup.class, "IndicatorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndicatorGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IndicatorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.NONE);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_DENIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_SATISFIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.SATISFIED);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.CONFLICT);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.UNKNOWN);
    addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.DENIED);

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

    initEEnum(booleanEEnum, org.xtext.grl.tgrl.tGRL.Boolean.class, "Boolean");
    addEEnumLiteral(booleanEEnum, org.xtext.grl.tgrl.tGRL.Boolean.FALSE);
    addEEnumLiteral(booleanEEnum, org.xtext.grl.tgrl.tGRL.Boolean.TRUE);

    // Create resource
    createResource(eNS_URI);
  }

} //TGRLPackageImpl
