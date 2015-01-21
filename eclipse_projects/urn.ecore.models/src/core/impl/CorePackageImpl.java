/**
 */
package core.impl;

import asd.AsdPackage;

import asd.impl.AsdPackageImpl;

import core.COREBinding;
import core.CORECompositionSpecification;
import core.COREConcern;
import core.COREConfiguration;
import core.COREFeature;
import core.COREFeatureModel;
import core.COREFeatureRelationshipType;
import core.COREFeatureSelectionStatus;
import core.COREImpactModel;
import core.COREImpactModelElement;
import core.COREInterface;
import core.COREMapping;
import core.COREModel;
import core.COREModelElement;
import core.COREModelReuse;
import core.CORENamedElement;
import core.COREPattern;
import core.COREReuse;
import core.CoreFactory;
import core.CorePackage;

import fm.FmPackage;

import fm.impl.FmPackageImpl;

import grl.GrlPackage;

import grl.impl.GrlPackageImpl;

import grl.kpimodel.KpimodelPackage;

import grl.kpimodel.impl.KpimodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ucm.UcmPackage;

import ucm.impl.UcmPackageImpl;

import ucm.map.MapPackage;

import ucm.map.impl.MapPackageImpl;

import ucm.performance.PerformancePackage;

import ucm.performance.impl.PerformancePackageImpl;

import ucm.scenario.ScenarioPackage;

import ucm.scenario.impl.ScenarioPackageImpl;

import urn.UrnPackage;

import urn.impl.UrnPackageImpl;

import urncore.UrncorePackage;

import urncore.impl.UrncorePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreImpactModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreConcernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreCompositionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreReuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreImpactModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreFeatureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreModelReuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coreFeatureRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coreFeatureSelectionStatusEEnum = null;

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
	 * @see core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GrlPackageImpl theGrlPackage = (GrlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrlPackage.eNS_URI) instanceof GrlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrlPackage.eNS_URI) : GrlPackage.eINSTANCE);
		KpimodelPackageImpl theKpimodelPackage = (KpimodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KpimodelPackage.eNS_URI) instanceof KpimodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KpimodelPackage.eNS_URI) : KpimodelPackage.eINSTANCE);
		UrnPackageImpl theUrnPackage = (UrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UrnPackage.eNS_URI) instanceof UrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UrnPackage.eNS_URI) : UrnPackage.eINSTANCE);
		FmPackageImpl theFmPackage = (FmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FmPackage.eNS_URI) instanceof FmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FmPackage.eNS_URI) : FmPackage.eINSTANCE);
		UrncorePackageImpl theUrncorePackage = (UrncorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UrncorePackage.eNS_URI) instanceof UrncorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UrncorePackage.eNS_URI) : UrncorePackage.eINSTANCE);
		UcmPackageImpl theUcmPackage = (UcmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UcmPackage.eNS_URI) instanceof UcmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UcmPackage.eNS_URI) : UcmPackage.eINSTANCE);
		PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI) instanceof PerformancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI) : PerformancePackage.eINSTANCE);
		MapPackageImpl theMapPackage = (MapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) instanceof MapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) : MapPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		AsdPackageImpl theAsdPackage = (AsdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AsdPackage.eNS_URI) instanceof AsdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AsdPackage.eNS_URI) : AsdPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theGrlPackage.createPackageContents();
		theKpimodelPackage.createPackageContents();
		theUrnPackage.createPackageContents();
		theFmPackage.createPackageContents();
		theUrncorePackage.createPackageContents();
		theUcmPackage.createPackageContents();
		thePerformancePackage.createPackageContents();
		theMapPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theAsdPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theGrlPackage.initializePackageContents();
		theKpimodelPackage.initializePackageContents();
		theUrnPackage.initializePackageContents();
		theFmPackage.initializePackageContents();
		theUrncorePackage.initializePackageContents();
		theUcmPackage.initializePackageContents();
		thePerformancePackage.initializePackageContents();
		theMapPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theAsdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREModel() {
		return coreModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREModel_ModelReuse() {
		return (EReference)coreModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREModel_ModelElements() {
		return (EReference)coreModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREModel_Realizes() {
		return (EReference)coreModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREImpactModel() {
		return coreImpactModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREConcern() {
		return coreConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREConcern_Models() {
		return (EReference)coreConcernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREConcern_Interface() {
		return (EReference)coreConcernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREFeature() {
		return coreFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREFeature_RealizedBy() {
		return (EReference)coreFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREFeature_Reuses() {
		return (EReference)coreFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__AddFeature__int_String_COREFeatureRelationshipType() {
		return coreFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__Delete() {
		return coreFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__Rename__String() {
		return coreFeatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__ChangeLink__COREFeatureRelationshipType() {
		return coreFeatureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__ChangeParent__COREFeature_COREFeatureRelationshipType() {
		return coreFeatureEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__Requires__COREFeature() {
		return coreFeatureEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__Excludes__COREFeature() {
		return coreFeatureEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__RemoveConstraint__COREFeature() {
		return coreFeatureEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__AddRealizedBy__COREModel() {
		return coreFeatureEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeature__AssociateReuse__COREReuse_EList_EList() {
		return coreFeatureEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREBinding() {
		return coreBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREBinding_CoreMappings() {
		return (EReference)coreBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREModelElement() {
		return coreModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCORECompositionSpecification() {
		return coreCompositionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCORECompositionSpecification_Source() {
		return (EReference)coreCompositionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREMapping() {
		return coreMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREMapping_MappedTo() {
		return (EReference)coreMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREMapping_MappedFrom() {
		return (EReference)coreMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCORENamedElement() {
		return coreNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCORENamedElement_Name() {
		return (EAttribute)coreNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREInterface() {
		return coreInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREInterface_Selectable() {
		return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREInterface_Customizable() {
		return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREInterface_Usable() {
		return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREInterface_Impacted() {
		return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREInterface_Defaults() {
		return (EReference)coreInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREReuse() {
		return coreReuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREReuse_ReusedConcern() {
		return (EReference)coreReuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREReuse_Configurations() {
		return (EReference)coreReuseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREReuse_Selected() {
		return (EReference)coreReuseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREPattern() {
		return corePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREImpactModelElement() {
		return coreImpactModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREConfiguration() {
		return coreConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREConfiguration_Selected() {
		return (EReference)coreConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREConfiguration_Reexposed() {
		return (EReference)coreConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREFeatureModel() {
		return coreFeatureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeatureModel__GetGlobalRoot() {
		return coreFeatureModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCOREFeatureModel__GetLocalRoot() {
		return coreFeatureModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOREModelReuse() {
		return coreModelReuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREModelReuse_Compositions() {
		return (EReference)coreModelReuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOREModelReuse_ModelReuse() {
		return (EReference)coreModelReuseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOREFeatureRelationshipType() {
		return coreFeatureRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOREFeatureSelectionStatus() {
		return coreFeatureSelectionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		coreModelEClass = createEClass(CORE_MODEL);
		createEReference(coreModelEClass, CORE_MODEL__MODEL_REUSE);
		createEReference(coreModelEClass, CORE_MODEL__MODEL_ELEMENTS);
		createEReference(coreModelEClass, CORE_MODEL__REALIZES);

		coreImpactModelEClass = createEClass(CORE_IMPACT_MODEL);

		coreConcernEClass = createEClass(CORE_CONCERN);
		createEReference(coreConcernEClass, CORE_CONCERN__MODELS);
		createEReference(coreConcernEClass, CORE_CONCERN__INTERFACE);

		coreFeatureEClass = createEClass(CORE_FEATURE);
		createEReference(coreFeatureEClass, CORE_FEATURE__REALIZED_BY);
		createEReference(coreFeatureEClass, CORE_FEATURE__REUSES);
		createEOperation(coreFeatureEClass, CORE_FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___DELETE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___RENAME__STRING);
		createEOperation(coreFeatureEClass, CORE_FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___REQUIRES__COREFEATURE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___EXCLUDES__COREFEATURE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___REMOVE_CONSTRAINT__COREFEATURE);
		createEOperation(coreFeatureEClass, CORE_FEATURE___ADD_REALIZED_BY__COREMODEL);
		createEOperation(coreFeatureEClass, CORE_FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST);

		coreBindingEClass = createEClass(CORE_BINDING);
		createEReference(coreBindingEClass, CORE_BINDING__CORE_MAPPINGS);

		coreModelElementEClass = createEClass(CORE_MODEL_ELEMENT);

		coreCompositionSpecificationEClass = createEClass(CORE_COMPOSITION_SPECIFICATION);
		createEReference(coreCompositionSpecificationEClass, CORE_COMPOSITION_SPECIFICATION__SOURCE);

		coreMappingEClass = createEClass(CORE_MAPPING);
		createEReference(coreMappingEClass, CORE_MAPPING__MAPPED_TO);
		createEReference(coreMappingEClass, CORE_MAPPING__MAPPED_FROM);

		coreNamedElementEClass = createEClass(CORE_NAMED_ELEMENT);
		createEAttribute(coreNamedElementEClass, CORE_NAMED_ELEMENT__NAME);

		coreInterfaceEClass = createEClass(CORE_INTERFACE);
		createEReference(coreInterfaceEClass, CORE_INTERFACE__SELECTABLE);
		createEReference(coreInterfaceEClass, CORE_INTERFACE__CUSTOMIZABLE);
		createEReference(coreInterfaceEClass, CORE_INTERFACE__USABLE);
		createEReference(coreInterfaceEClass, CORE_INTERFACE__IMPACTED);
		createEReference(coreInterfaceEClass, CORE_INTERFACE__DEFAULTS);

		coreReuseEClass = createEClass(CORE_REUSE);
		createEReference(coreReuseEClass, CORE_REUSE__REUSED_CONCERN);
		createEReference(coreReuseEClass, CORE_REUSE__CONFIGURATIONS);
		createEReference(coreReuseEClass, CORE_REUSE__SELECTED);

		corePatternEClass = createEClass(CORE_PATTERN);

		coreImpactModelElementEClass = createEClass(CORE_IMPACT_MODEL_ELEMENT);

		coreConfigurationEClass = createEClass(CORE_CONFIGURATION);
		createEReference(coreConfigurationEClass, CORE_CONFIGURATION__SELECTED);
		createEReference(coreConfigurationEClass, CORE_CONFIGURATION__REEXPOSED);

		coreFeatureModelEClass = createEClass(CORE_FEATURE_MODEL);
		createEOperation(coreFeatureModelEClass, CORE_FEATURE_MODEL___GET_GLOBAL_ROOT);
		createEOperation(coreFeatureModelEClass, CORE_FEATURE_MODEL___GET_LOCAL_ROOT);

		coreModelReuseEClass = createEClass(CORE_MODEL_REUSE);
		createEReference(coreModelReuseEClass, CORE_MODEL_REUSE__COMPOSITIONS);
		createEReference(coreModelReuseEClass, CORE_MODEL_REUSE__MODEL_REUSE);

		// Create enums
		coreFeatureRelationshipTypeEEnum = createEEnum(CORE_FEATURE_RELATIONSHIP_TYPE);
		coreFeatureSelectionStatusEEnum = createEEnum(CORE_FEATURE_SELECTION_STATUS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coreModelEClass.getESuperTypes().add(this.getCORENamedElement());
		coreImpactModelEClass.getESuperTypes().add(this.getCOREModel());
		coreConcernEClass.getESuperTypes().add(this.getCORENamedElement());
		coreFeatureEClass.getESuperTypes().add(this.getCOREModelElement());
		coreBindingEClass.getESuperTypes().add(this.getCORECompositionSpecification());
		coreModelElementEClass.getESuperTypes().add(this.getCORENamedElement());
		corePatternEClass.getESuperTypes().add(this.getCORECompositionSpecification());
		coreImpactModelElementEClass.getESuperTypes().add(this.getCOREModelElement());
		coreConfigurationEClass.getESuperTypes().add(this.getCORENamedElement());
		coreFeatureModelEClass.getESuperTypes().add(this.getCOREModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(coreModelEClass, COREModel.class, "COREModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREModel_ModelReuse(), this.getCOREModelReuse(), null, "modelReuse", null, 0, -1, COREModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREModel_ModelElements(), this.getCOREModelElement(), null, "modelElements", null, 0, -1, COREModel.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCOREModel_Realizes(), this.getCOREFeature(), this.getCOREFeature_RealizedBy(), "realizes", null, 0, -1, COREModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreImpactModelEClass, COREImpactModel.class, "COREImpactModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coreConcernEClass, COREConcern.class, "COREConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREConcern_Models(), this.getCOREModel(), null, "models", null, 2, -1, COREConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREConcern_Interface(), this.getCOREInterface(), null, "interface", null, 1, 1, COREConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreFeatureEClass, COREFeature.class, "COREFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREFeature_RealizedBy(), this.getCOREModel(), this.getCOREModel_Realizes(), "realizedBy", null, 0, -1, COREFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREFeature_Reuses(), this.getCOREReuse(), null, "reuses", null, 0, -1, COREFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCOREFeature__AddFeature__int_String_COREFeatureRelationshipType(), ecorePackage.getEBoolean(), "addFeature", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "child_name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeatureRelationshipType(), "association", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCOREFeature__Delete(), ecorePackage.getEBoolean(), "delete", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__Rename__String(), null, "rename", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "core_feature_name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__ChangeLink__COREFeatureRelationshipType(), ecorePackage.getEBoolean(), "changeLink", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeatureRelationshipType(), "new_association", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__ChangeParent__COREFeature_COREFeatureRelationshipType(), ecorePackage.getEBoolean(), "changeParent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeatureRelationshipType(), "new_association", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__Requires__COREFeature(), ecorePackage.getEBoolean(), "requires", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__Excludes__COREFeature(), ecorePackage.getEBoolean(), "excludes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__RemoveConstraint__COREFeature(), ecorePackage.getEBoolean(), "removeConstraint", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__AddRealizedBy__COREModel(), ecorePackage.getEBoolean(), "addRealizedBy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREModel(), "model", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCOREFeature__AssociateReuse__COREReuse_EList_EList(), ecorePackage.getEBoolean(), "AssociateReuse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCOREReuse(), "reuse", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "selected", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "reexposed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coreBindingEClass, COREBinding.class, "COREBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREBinding_CoreMappings(), this.getCOREMapping(), null, "coreMappings", null, 0, -1, COREBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreModelElementEClass, COREModelElement.class, "COREModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coreCompositionSpecificationEClass, CORECompositionSpecification.class, "CORECompositionSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCORECompositionSpecification_Source(), this.getCOREModel(), null, "source", null, 1, 1, CORECompositionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreMappingEClass, COREMapping.class, "COREMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREMapping_MappedTo(), this.getCOREModelElement(), null, "mappedTo", null, 1, 1, COREMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREMapping_MappedFrom(), this.getCOREModelElement(), null, "mappedFrom", null, 1, 1, COREMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreNamedElementEClass, CORENamedElement.class, "CORENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCORENamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CORENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreInterfaceEClass, COREInterface.class, "COREInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREInterface_Selectable(), this.getCOREFeature(), null, "selectable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREInterface_Customizable(), this.getCOREModelElement(), null, "customizable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREInterface_Usable(), this.getCOREModelElement(), null, "usable", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREInterface_Impacted(), this.getCOREImpactModelElement(), null, "impacted", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREInterface_Defaults(), this.getCOREConfiguration(), null, "defaults", null, 0, -1, COREInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreReuseEClass, COREReuse.class, "COREReuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREReuse_ReusedConcern(), this.getCOREConcern(), null, "reusedConcern", null, 1, 1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREReuse_Configurations(), this.getCOREConfiguration(), null, "configurations", null, 0, -1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREReuse_Selected(), this.getCOREConfiguration(), null, "selected", null, 0, 1, COREReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corePatternEClass, COREPattern.class, "COREPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coreImpactModelElementEClass, COREImpactModelElement.class, "COREImpactModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coreConfigurationEClass, COREConfiguration.class, "COREConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREConfiguration_Selected(), this.getCOREFeature(), null, "selected", null, 0, -1, COREConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREConfiguration_Reexposed(), this.getCOREFeature(), null, "reexposed", null, 0, -1, COREConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreFeatureModelEClass, COREFeatureModel.class, "COREFeatureModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCOREFeatureModel__GetGlobalRoot(), this.getCOREFeature(), "getGlobalRoot", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCOREFeatureModel__GetLocalRoot(), this.getCOREFeature(), "getLocalRoot", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coreModelReuseEClass, COREModelReuse.class, "COREModelReuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOREModelReuse_Compositions(), this.getCORECompositionSpecification(), null, "compositions", null, 0, -1, COREModelReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOREModelReuse_ModelReuse(), this.getCOREReuse(), null, "modelReuse", null, 0, -1, COREModelReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.class, "COREFeatureRelationshipType");
		addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.OPTIONAL);
		addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.MANDATORY);
		addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.XOR);
		addEEnumLiteral(coreFeatureRelationshipTypeEEnum, COREFeatureRelationshipType.OR);

		initEEnum(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.class, "COREFeatureSelectionStatus");
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.NOT_SELECTED_NO_ACTION);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.USER_SELECTED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.AUTO_SELECTED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.NOT_SELECTED_ACTION_REQUIRED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.WARNING_USER_SELECTED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.WARNING_AUTO_SELECTED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.REEXPOSE_USER_SELECTED);
		addEEnumLiteral(coreFeatureSelectionStatusEEnum, COREFeatureSelectionStatus.REEXPOSE_AUTO_SELECTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (coreModelEClass, 
		   source, 
		   new String[] {
			 "name", "COREFeatureModel"
		   });
	}

} //CorePackageImpl
