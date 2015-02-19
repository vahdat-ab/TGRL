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
import org.xtext.grl.tgrl.tGRL.CollapsedActorRef;
import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.Contribution;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionContextGroup;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.Criticality;
import org.xtext.grl.tgrl.tGRL.Decomposition;
import org.xtext.grl.tgrl.tGRL.DecompositionType;
import org.xtext.grl.tgrl.tGRL.Dependency;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLLinkableElement;
import org.xtext.grl.tgrl.tGRL.GRLModelElement;
import org.xtext.grl.tgrl.tGRL.GRLNode;
import org.xtext.grl.tgrl.tGRL.GRLspec;
import org.xtext.grl.tgrl.tGRL.Goal;
import org.xtext.grl.tgrl.tGRL.ImpactModel;
import org.xtext.grl.tgrl.tGRL.ImportanceType;
import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.IntentionalElementRef;
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
import org.xtext.grl.tgrl.tGRL.Ressource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategiesGroup;
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
  private EClass grlModelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grlNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grlLinkableElementEClass = null;

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
  private EClass kpiConversionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grLspecEClass = null;

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
  private EClass ressourceEClass = null;

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
  private EClass decompositionEClass = null;

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
  private EClass dependencyEClass = null;

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
  private EClass collapsedActorRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentionalElementRefEClass = null;

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
  private EClass strategiesGroupEClass = null;

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
  public EReference getModel_GRLspecs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLModelElement()
  {
    return grlModelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLModelElement_Id()
  {
    return (EAttribute)grlModelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLNode()
  {
    return grlNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLNode_Name()
  {
    return (EAttribute)grlNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGRLLinkableElement()
  {
    return grlLinkableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_Name()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_Label()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_Description()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_Fillcolor()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_Importance()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGRLLinkableElement_ImportanceQuantitative()
  {
    return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(5);
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
  public EReference getIntentionalElement_Refs()
  {
    return (EReference)intentionalElementEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getElementLink_Name()
  {
    return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementLink_Label()
  {
    return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementLink_Description()
  {
    return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementLink_Src()
  {
    return (EReference)elementLinkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementLink_Dest()
  {
    return (EReference)elementLinkEClass.getEStructuralFeatures().get(4);
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
  public EClass getGRLspec()
  {
    return grLspecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_ImpactModel()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_Links()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_Actors()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_IntElements()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_Groups()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_Strategies()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_ContributionGroups()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_ContributionContexts()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_KpiConv()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_KpiInformationElements()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_KpiModelLinks()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGRLspec_IndicatorGroup()
  {
    return (EReference)grLspecEClass.getEStructuralFeatures().get(11);
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
  public EReference getActor_IncludedActors()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_CollapsedRefs()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_IntentionalElements()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_ElementLinks()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(3);
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
  public EReference getGoal_Evals()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(0);
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
  public EReference getTask_Evals()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRessource()
  {
    return ressourceEClass;
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
  public EReference getIndicator_KpiModelLinksDest()
  {
    return (EReference)indicatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicator_Groups()
  {
    return (EReference)indicatorEClass.getEStructuralFeatures().get(1);
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
  public EClass getContribution()
  {
    return contributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_Contribution()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_QuantitativeContribution()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContribution_Correlation()
  {
    return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContribution_Changes()
  {
    return (EReference)contributionEClass.getEStructuralFeatures().get(3);
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
  public EClass getBelief()
  {
    return beliefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBelief_Label()
  {
    return (EAttribute)beliefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBelief_Description()
  {
    return (EAttribute)beliefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollapsedActorRef()
  {
    return collapsedActorRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollapsedActorRef_Label()
  {
    return (EAttribute)collapsedActorRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollapsedActorRef_Description()
  {
    return (EAttribute)collapsedActorRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntentionalElementRef()
  {
    return intentionalElementRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElementRef_Criticality()
  {
    return (EAttribute)intentionalElementRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElementRef_Priority()
  {
    return (EAttribute)intentionalElementRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntentionalElementRef_Def()
  {
    return (EReference)intentionalElementRefEClass.getEStructuralFeatures().get(2);
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
  public EClass getStrategiesGroup()
  {
    return strategiesGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrategiesGroup_Name()
  {
    return (EAttribute)strategiesGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategiesGroup_Strategies()
  {
    return (EReference)strategiesGroupEClass.getEStructuralFeatures().get(1);
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
  public EReference getEvaluationStrategy_Evaluations()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_IncludedStrategies()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_KipInforConfig()
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
  public EAttribute getEvaluation_Name()
  {
    return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluation_Evaluation()
  {
    return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluation_QualitativeEvaluation()
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
  public EReference getEvaluation_KpiNewEvalValue()
  {
    return (EReference)evaluationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluation_InElement()
  {
    return (EReference)evaluationEClass.getEStructuralFeatures().get(7);
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
  public EAttribute getKPIInformationElementRef_Label()
  {
    return (EAttribute)kpiInformationElementRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKPIInformationElementRef_Description()
  {
    return (EAttribute)kpiInformationElementRefEClass.getEStructuralFeatures().get(1);
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
    createEReference(modelEClass, MODEL__GR_LSPECS);

    grlModelElementEClass = createEClass(GRL_MODEL_ELEMENT);
    createEAttribute(grlModelElementEClass, GRL_MODEL_ELEMENT__ID);

    grlNodeEClass = createEClass(GRL_NODE);
    createEAttribute(grlNodeEClass, GRL_NODE__NAME);

    grlLinkableElementEClass = createEClass(GRL_LINKABLE_ELEMENT);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__NAME);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__LABEL);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__DESCRIPTION);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__FILLCOLOR);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__IMPORTANCE);
    createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE);

    intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE);
    createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__REFS);

    elementLinkEClass = createEClass(ELEMENT_LINK);
    createEAttribute(elementLinkEClass, ELEMENT_LINK__NAME);
    createEAttribute(elementLinkEClass, ELEMENT_LINK__LABEL);
    createEAttribute(elementLinkEClass, ELEMENT_LINK__DESCRIPTION);
    createEReference(elementLinkEClass, ELEMENT_LINK__SRC);
    createEReference(elementLinkEClass, ELEMENT_LINK__DEST);

    kpiConversionEClass = createEClass(KPI_CONVERSION);

    grLspecEClass = createEClass(GR_LSPEC);
    createEReference(grLspecEClass, GR_LSPEC__IMPACT_MODEL);
    createEReference(grLspecEClass, GR_LSPEC__LINKS);
    createEReference(grLspecEClass, GR_LSPEC__ACTORS);
    createEReference(grLspecEClass, GR_LSPEC__INT_ELEMENTS);
    createEReference(grLspecEClass, GR_LSPEC__GROUPS);
    createEReference(grLspecEClass, GR_LSPEC__STRATEGIES);
    createEReference(grLspecEClass, GR_LSPEC__CONTRIBUTION_GROUPS);
    createEReference(grLspecEClass, GR_LSPEC__CONTRIBUTION_CONTEXTS);
    createEReference(grLspecEClass, GR_LSPEC__KPI_CONV);
    createEReference(grLspecEClass, GR_LSPEC__KPI_INFORMATION_ELEMENTS);
    createEReference(grLspecEClass, GR_LSPEC__KPI_MODEL_LINKS);
    createEReference(grLspecEClass, GR_LSPEC__INDICATOR_GROUP);

    actorEClass = createEClass(ACTOR);
    createEReference(actorEClass, ACTOR__INCLUDED_ACTORS);
    createEReference(actorEClass, ACTOR__COLLAPSED_REFS);
    createEReference(actorEClass, ACTOR__INTENTIONAL_ELEMENTS);
    createEReference(actorEClass, ACTOR__ELEMENT_LINKS);

    softgoalEClass = createEClass(SOFTGOAL);

    goalEClass = createEClass(GOAL);
    createEReference(goalEClass, GOAL__EVALS);

    taskEClass = createEClass(TASK);
    createEReference(taskEClass, TASK__EVALS);

    ressourceEClass = createEClass(RESSOURCE);

    indicatorEClass = createEClass(INDICATOR);
    createEReference(indicatorEClass, INDICATOR__KPI_MODEL_LINKS_DEST);
    createEReference(indicatorEClass, INDICATOR__GROUPS);

    decompositionEClass = createEClass(DECOMPOSITION);

    contributionEClass = createEClass(CONTRIBUTION);
    createEAttribute(contributionEClass, CONTRIBUTION__CONTRIBUTION);
    createEAttribute(contributionEClass, CONTRIBUTION__QUANTITATIVE_CONTRIBUTION);
    createEAttribute(contributionEClass, CONTRIBUTION__CORRELATION);
    createEReference(contributionEClass, CONTRIBUTION__CHANGES);

    dependencyEClass = createEClass(DEPENDENCY);

    beliefEClass = createEClass(BELIEF);
    createEAttribute(beliefEClass, BELIEF__LABEL);
    createEAttribute(beliefEClass, BELIEF__DESCRIPTION);

    collapsedActorRefEClass = createEClass(COLLAPSED_ACTOR_REF);
    createEAttribute(collapsedActorRefEClass, COLLAPSED_ACTOR_REF__LABEL);
    createEAttribute(collapsedActorRefEClass, COLLAPSED_ACTOR_REF__DESCRIPTION);

    intentionalElementRefEClass = createEClass(INTENTIONAL_ELEMENT_REF);
    createEAttribute(intentionalElementRefEClass, INTENTIONAL_ELEMENT_REF__CRITICALITY);
    createEAttribute(intentionalElementRefEClass, INTENTIONAL_ELEMENT_REF__PRIORITY);
    createEReference(intentionalElementRefEClass, INTENTIONAL_ELEMENT_REF__DEF);

    impactModelEClass = createEClass(IMPACT_MODEL);
    createEAttribute(impactModelEClass, IMPACT_MODEL__NAME);

    strategiesGroupEClass = createEClass(STRATEGIES_GROUP);
    createEAttribute(strategiesGroupEClass, STRATEGIES_GROUP__NAME);
    createEReference(strategiesGroupEClass, STRATEGIES_GROUP__STRATEGIES);

    evaluationStrategyEClass = createEClass(EVALUATION_STRATEGY);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__NAME);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__EVALUATIONS);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__INCLUDED_STRATEGIES);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__KIP_INFOR_CONFIG);

    evaluationEClass = createEClass(EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__NAME);
    createEAttribute(evaluationEClass, EVALUATION__EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__QUALITATIVE_EVALUATION);
    createEAttribute(evaluationEClass, EVALUATION__EXCEEDS);
    createEReference(evaluationEClass, EVALUATION__EVAL_RANGE);
    createEReference(evaluationEClass, EVALUATION__KPI_EVAL_VALUE_SET);
    createEReference(evaluationEClass, EVALUATION__KPI_NEW_EVAL_VALUE);
    createEReference(evaluationEClass, EVALUATION__IN_ELEMENT);

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
    grlNodeEClass.getESuperTypes().add(this.getGRLModelElement());
    grlLinkableElementEClass.getESuperTypes().add(this.getGRLModelElement());
    intentionalElementEClass.getESuperTypes().add(this.getGRLLinkableElement());
    elementLinkEClass.getESuperTypes().add(this.getGRLModelElement());
    kpiConversionEClass.getESuperTypes().add(this.getGRLModelElement());
    actorEClass.getESuperTypes().add(this.getGRLLinkableElement());
    softgoalEClass.getESuperTypes().add(this.getIntentionalElement());
    goalEClass.getESuperTypes().add(this.getIntentionalElement());
    taskEClass.getESuperTypes().add(this.getIntentionalElement());
    ressourceEClass.getESuperTypes().add(this.getIntentionalElement());
    indicatorEClass.getESuperTypes().add(this.getIntentionalElement());
    decompositionEClass.getESuperTypes().add(this.getElementLink());
    contributionEClass.getESuperTypes().add(this.getElementLink());
    dependencyEClass.getESuperTypes().add(this.getElementLink());
    beliefEClass.getESuperTypes().add(this.getGRLNode());
    collapsedActorRefEClass.getESuperTypes().add(this.getGRLNode());
    intentionalElementRefEClass.getESuperTypes().add(this.getGRLNode());
    strategiesGroupEClass.getESuperTypes().add(this.getGRLModelElement());
    evaluationStrategyEClass.getESuperTypes().add(this.getGRLModelElement());
    contributionContextGroupEClass.getESuperTypes().add(this.getGRLModelElement());
    contributionContextEClass.getESuperTypes().add(this.getGRLModelElement());
    qualitativeMappingsEClass.getESuperTypes().add(this.getKPIConversion());
    kpiInformationElementEClass.getESuperTypes().add(this.getGRLModelElement());
    kpiInformationElementRefEClass.getESuperTypes().add(this.getGRLNode());
    kpiModelLinkEClass.getESuperTypes().add(this.getGRLModelElement());
    indicatorGroupEClass.getESuperTypes().add(this.getGRLModelElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_GRLspecs(), this.getGRLspec(), null, "gRLspecs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlModelElementEClass, GRLModelElement.class, "GRLModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGRLModelElement_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, GRLModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlNodeEClass, GRLNode.class, "GRLNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGRLNode_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grlLinkableElementEClass, GRLLinkableElement.class, "GRLLinkableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGRLLinkableElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGRLLinkableElement_Label(), theEcorePackage.getEString(), "label", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGRLLinkableElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGRLLinkableElement_Fillcolor(), this.getColor(), "fillcolor", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGRLLinkableElement_Importance(), this.getImportanceType(), "importance", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGRLLinkableElement_ImportanceQuantitative(), theEcorePackage.getEInt(), "importanceQuantitative", null, 0, 1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentionalElement_DecompositionType(), this.getDecompositionType(), "decompositionType", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntentionalElement_Refs(), this.getIntentionalElementRef(), null, "refs", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementLinkEClass, ElementLink.class, "ElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementLink_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementLink_Label(), theEcorePackage.getEString(), "label", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementLink_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementLink_Src(), this.getGRLLinkableElement(), null, "src", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementLink_Dest(), this.getGRLLinkableElement(), null, "dest", null, 0, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kpiConversionEClass, KPIConversion.class, "KPIConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grLspecEClass, GRLspec.class, "GRLspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGRLspec_ImpactModel(), this.getImpactModel(), null, "impactModel", null, 0, 1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_Links(), this.getElementLink(), null, "links", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_Actors(), this.getActor(), null, "actors", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_IntElements(), this.getIntentionalElement(), null, "intElements", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_Groups(), this.getStrategiesGroup(), null, "groups", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_ContributionGroups(), this.getContributionContextGroup(), null, "contributionGroups", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_ContributionContexts(), this.getContributionContext(), null, "contributionContexts", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_KpiConv(), this.getKPIConversion(), null, "kpiConv", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_KpiInformationElements(), this.getKPIInformationElement(), null, "kpiInformationElements", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_KpiModelLinks(), this.getKPIModelLink(), null, "kpiModelLinks", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGRLspec_IndicatorGroup(), this.getIndicatorGroup(), null, "indicatorGroup", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActor_IncludedActors(), this.getActor(), null, "includedActors", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_CollapsedRefs(), this.getCollapsedActorRef(), null, "collapsedRefs", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_IntentionalElements(), this.getIntentionalElement(), null, "intentionalElements", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_ElementLinks(), this.getElementLink(), null, "elementLinks", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoal_Evals(), this.getEvaluation(), null, "evals", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTask_Evals(), this.getEvaluation(), null, "evals", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indicatorEClass, Indicator.class, "Indicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndicator_KpiModelLinksDest(), this.getKPIModelLink(), null, "kpiModelLinksDest", null, 0, -1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndicator_Groups(), this.getIndicatorGroup(), null, "groups", null, 0, -1, Indicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContribution_Contribution(), this.getContributionType(), "contribution", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContribution_QuantitativeContribution(), theEcorePackage.getEInt(), "quantitativeContribution", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContribution_Correlation(), theEcorePackage.getEString(), "correlation", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContribution_Changes(), this.getContributionChange(), null, "changes", null, 0, -1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBelief_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Belief.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBelief_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Belief.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collapsedActorRefEClass, CollapsedActorRef.class, "CollapsedActorRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollapsedActorRef_Label(), theEcorePackage.getEString(), "label", null, 0, 1, CollapsedActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollapsedActorRef_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CollapsedActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentionalElementRefEClass, IntentionalElementRef.class, "IntentionalElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentionalElementRef_Criticality(), this.getCriticality(), "criticality", null, 0, 1, IntentionalElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElementRef_Priority(), this.getPriority(), "priority", null, 0, 1, IntentionalElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntentionalElementRef_Def(), this.getIntentionalElement(), null, "def", null, 0, 1, IntentionalElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(impactModelEClass, ImpactModel.class, "ImpactModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImpactModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ImpactModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategiesGroupEClass, StrategiesGroup.class, "StrategiesGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategiesGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StrategiesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategiesGroup_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, StrategiesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationStrategyEClass, EvaluationStrategy.class, "EvaluationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationStrategy_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_Evaluations(), this.getEvaluation(), null, "evaluations", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_IncludedStrategies(), this.getEvaluationStrategy(), null, "includedStrategies", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_KipInforConfig(), this.getKPIInformationConfig(), null, "kipInforConfig", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Evaluation(), theEcorePackage.getEInt(), "evaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluation_Exceeds(), theEcorePackage.getEString(), "exceeds", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_EvalRange(), this.getEvaluationRange(), null, "evalRange", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_KpiEvalValueSet(), this.getKPIEvalValueSet(), null, "kpiEvalValueSet", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_KpiNewEvalValue(), this.getKPINewEvalValue(), null, "kpiNewEvalValue", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluation_InElement(), this.getIntentionalElement(), null, "inElement", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
