/**
 */
package core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.mcgill.ca/sel/core/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link core.impl.CORENamedElementImpl <em>CORE Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CORENamedElementImpl
	 * @see core.impl.CorePackageImpl#getCORENamedElement()
	 * @generated
	 */
	int CORE_NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>CORE Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CORE Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.COREModelImpl <em>CORE Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREModelImpl
	 * @see core.impl.CorePackageImpl#getCOREModel()
	 * @generated
	 */
	int CORE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__NAME = CORE_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model Reuse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__MODEL_REUSE = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__MODEL_ELEMENTS = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__REALIZES = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CORE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CORE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_OPERATION_COUNT = CORE_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREImpactModelImpl <em>CORE Impact Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREImpactModelImpl
	 * @see core.impl.CorePackageImpl#getCOREImpactModel()
	 * @generated
	 */
	int CORE_IMPACT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL__NAME = CORE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Model Reuse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL__MODEL_REUSE = CORE_MODEL__MODEL_REUSE;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL__MODEL_ELEMENTS = CORE_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL__REALIZES = CORE_MODEL__REALIZES;

	/**
	 * The number of structural features of the '<em>CORE Impact Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL_FEATURE_COUNT = CORE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CORE Impact Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL_OPERATION_COUNT = CORE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREConcernImpl <em>CORE Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREConcernImpl
	 * @see core.impl.CorePackageImpl#getCOREConcern()
	 * @generated
	 */
	int CORE_CONCERN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONCERN__NAME = CORE_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONCERN__MODELS = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONCERN__INTERFACE = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CORE Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONCERN_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CORE Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONCERN_OPERATION_COUNT = CORE_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREModelElementImpl <em>CORE Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREModelElementImpl
	 * @see core.impl.CorePackageImpl#getCOREModelElement()
	 * @generated
	 */
	int CORE_MODEL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_ELEMENT__NAME = CORE_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>CORE Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_ELEMENT_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CORE Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_ELEMENT_OPERATION_COUNT = CORE_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREFeatureImpl <em>CORE Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREFeatureImpl
	 * @see core.impl.CorePackageImpl#getCOREFeature()
	 * @generated
	 */
	int CORE_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE__NAME = CORE_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE__REALIZED_BY = CORE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE__REUSES = CORE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CORE Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_FEATURE_COUNT = CORE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___DELETE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Rename</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___RENAME__STRING = CORE_MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Requires</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___REQUIRES__COREFEATURE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Excludes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___EXCLUDES__COREFEATURE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___REMOVE_CONSTRAINT__COREFEATURE = CORE_MODEL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Realized By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___ADD_REALIZED_BY__COREMODEL = CORE_MODEL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Associate Reuse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST = CORE_MODEL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>CORE Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_OPERATION_COUNT = CORE_MODEL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link core.impl.CORECompositionSpecificationImpl <em>CORE Composition Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CORECompositionSpecificationImpl
	 * @see core.impl.CorePackageImpl#getCORECompositionSpecification()
	 * @generated
	 */
	int CORE_COMPOSITION_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPOSITION_SPECIFICATION__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>CORE Composition Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CORE Composition Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPOSITION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.COREBindingImpl <em>CORE Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREBindingImpl
	 * @see core.impl.CorePackageImpl#getCOREBinding()
	 * @generated
	 */
	int CORE_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_BINDING__SOURCE = CORE_COMPOSITION_SPECIFICATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Core Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_BINDING__CORE_MAPPINGS = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CORE Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_BINDING_FEATURE_COUNT = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CORE Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_BINDING_OPERATION_COUNT = CORE_COMPOSITION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREMappingImpl <em>CORE Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREMappingImpl
	 * @see core.impl.CorePackageImpl#getCOREMapping()
	 * @generated
	 */
	int CORE_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Mapped To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPING__MAPPED_TO = 0;

	/**
	 * The feature id for the '<em><b>Mapped From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPING__MAPPED_FROM = 1;

	/**
	 * The number of structural features of the '<em>CORE Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CORE Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.COREInterfaceImpl <em>CORE Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREInterfaceImpl
	 * @see core.impl.CorePackageImpl#getCOREInterface()
	 * @generated
	 */
	int CORE_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE__SELECTABLE = 0;

	/**
	 * The feature id for the '<em><b>Customizable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE__CUSTOMIZABLE = 1;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE__USABLE = 2;

	/**
	 * The feature id for the '<em><b>Impacted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE__IMPACTED = 3;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE__DEFAULTS = 4;

	/**
	 * The number of structural features of the '<em>CORE Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>CORE Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.COREReuseImpl <em>CORE Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREReuseImpl
	 * @see core.impl.CorePackageImpl#getCOREReuse()
	 * @generated
	 */
	int CORE_REUSE = 10;

	/**
	 * The feature id for the '<em><b>Reused Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_REUSE__REUSED_CONCERN = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_REUSE__CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_REUSE__SELECTED = 2;

	/**
	 * The number of structural features of the '<em>CORE Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_REUSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CORE Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_REUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.COREPatternImpl <em>CORE Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREPatternImpl
	 * @see core.impl.CorePackageImpl#getCOREPattern()
	 * @generated
	 */
	int CORE_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN__SOURCE = CORE_COMPOSITION_SPECIFICATION__SOURCE;

	/**
	 * The number of structural features of the '<em>CORE Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN_FEATURE_COUNT = CORE_COMPOSITION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CORE Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN_OPERATION_COUNT = CORE_COMPOSITION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREImpactModelElementImpl <em>CORE Impact Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREImpactModelElementImpl
	 * @see core.impl.CorePackageImpl#getCOREImpactModelElement()
	 * @generated
	 */
	int CORE_IMPACT_MODEL_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL_ELEMENT__NAME = CORE_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>CORE Impact Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL_ELEMENT_FEATURE_COUNT = CORE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CORE Impact Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_IMPACT_MODEL_ELEMENT_OPERATION_COUNT = CORE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREConfigurationImpl <em>CORE Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREConfigurationImpl
	 * @see core.impl.CorePackageImpl#getCOREConfiguration()
	 * @generated
	 */
	int CORE_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONFIGURATION__NAME = CORE_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONFIGURATION__SELECTED = CORE_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reexposed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONFIGURATION__REEXPOSED = CORE_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CORE Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONFIGURATION_FEATURE_COUNT = CORE_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CORE Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONFIGURATION_OPERATION_COUNT = CORE_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.COREFeatureModelImpl <em>CORE Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREFeatureModelImpl
	 * @see core.impl.CorePackageImpl#getCOREFeatureModel()
	 * @generated
	 */
	int CORE_FEATURE_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL__NAME = CORE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Model Reuse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL__MODEL_REUSE = CORE_MODEL__MODEL_REUSE;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL__MODEL_ELEMENTS = CORE_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL__REALIZES = CORE_MODEL__REALIZES;

	/**
	 * The number of structural features of the '<em>CORE Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL_FEATURE_COUNT = CORE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Global Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL___GET_GLOBAL_ROOT = CORE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Local Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL___GET_LOCAL_ROOT = CORE_MODEL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>CORE Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_MODEL_OPERATION_COUNT = CORE_MODEL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link core.impl.COREModelReuseImpl <em>CORE Model Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.COREModelReuseImpl
	 * @see core.impl.CorePackageImpl#getCOREModelReuse()
	 * @generated
	 */
	int CORE_MODEL_REUSE = 15;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_REUSE__COMPOSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Model Reuse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_REUSE__MODEL_REUSE = 1;

	/**
	 * The number of structural features of the '<em>CORE Model Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_REUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CORE Model Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_REUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.COREFeatureRelationshipType
	 * @see core.impl.CorePackageImpl#getCOREFeatureRelationshipType()
	 * @generated
	 */
	int CORE_FEATURE_RELATIONSHIP_TYPE = 16;

	/**
	 * The meta object id for the '{@link core.COREFeatureSelectionStatus <em>CORE Feature Selection Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.COREFeatureSelectionStatus
	 * @see core.impl.CorePackageImpl#getCOREFeatureSelectionStatus()
	 * @generated
	 */
	int CORE_FEATURE_SELECTION_STATUS = 17;


	/**
	 * Returns the meta object for class '{@link core.COREModel <em>CORE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Model</em>'.
	 * @see core.COREModel
	 * @generated
	 */
	EClass getCOREModel();

	/**
	 * Returns the meta object for the containment reference list '{@link core.COREModel#getModelReuse <em>Model Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Reuse</em>'.
	 * @see core.COREModel#getModelReuse()
	 * @see #getCOREModel()
	 * @generated
	 */
	EReference getCOREModel_ModelReuse();

	/**
	 * Returns the meta object for the reference list '{@link core.COREModel#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Elements</em>'.
	 * @see core.COREModel#getModelElements()
	 * @see #getCOREModel()
	 * @generated
	 */
	EReference getCOREModel_ModelElements();

	/**
	 * Returns the meta object for the reference list '{@link core.COREModel#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see core.COREModel#getRealizes()
	 * @see #getCOREModel()
	 * @generated
	 */
	EReference getCOREModel_Realizes();

	/**
	 * Returns the meta object for class '{@link core.COREImpactModel <em>CORE Impact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Impact Model</em>'.
	 * @see core.COREImpactModel
	 * @generated
	 */
	EClass getCOREImpactModel();

	/**
	 * Returns the meta object for class '{@link core.COREConcern <em>CORE Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Concern</em>'.
	 * @see core.COREConcern
	 * @generated
	 */
	EClass getCOREConcern();

	/**
	 * Returns the meta object for the reference list '{@link core.COREConcern#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see core.COREConcern#getModels()
	 * @see #getCOREConcern()
	 * @generated
	 */
	EReference getCOREConcern_Models();

	/**
	 * Returns the meta object for the containment reference '{@link core.COREConcern#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see core.COREConcern#getInterface()
	 * @see #getCOREConcern()
	 * @generated
	 */
	EReference getCOREConcern_Interface();

	/**
	 * Returns the meta object for class '{@link core.COREFeature <em>CORE Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Feature</em>'.
	 * @see core.COREFeature
	 * @generated
	 */
	EClass getCOREFeature();

	/**
	 * Returns the meta object for the reference list '{@link core.COREFeature#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized By</em>'.
	 * @see core.COREFeature#getRealizedBy()
	 * @see #getCOREFeature()
	 * @generated
	 */
	EReference getCOREFeature_RealizedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link core.COREFeature#getReuses <em>Reuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reuses</em>'.
	 * @see core.COREFeature#getReuses()
	 * @see #getCOREFeature()
	 * @generated
	 */
	EReference getCOREFeature_Reuses();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#addFeature(int, java.lang.String, core.COREFeatureRelationshipType) <em>Add Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Feature</em>' operation.
	 * @see core.COREFeature#addFeature(int, java.lang.String, core.COREFeatureRelationshipType)
	 * @generated
	 */
	EOperation getCOREFeature__AddFeature__int_String_COREFeatureRelationshipType();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see core.COREFeature#delete()
	 * @generated
	 */
	EOperation getCOREFeature__Delete();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#rename(java.lang.String) <em>Rename</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rename</em>' operation.
	 * @see core.COREFeature#rename(java.lang.String)
	 * @generated
	 */
	EOperation getCOREFeature__Rename__String();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#changeLink(core.COREFeatureRelationshipType) <em>Change Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Link</em>' operation.
	 * @see core.COREFeature#changeLink(core.COREFeatureRelationshipType)
	 * @generated
	 */
	EOperation getCOREFeature__ChangeLink__COREFeatureRelationshipType();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#changeParent(core.COREFeature, core.COREFeatureRelationshipType) <em>Change Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Parent</em>' operation.
	 * @see core.COREFeature#changeParent(core.COREFeature, core.COREFeatureRelationshipType)
	 * @generated
	 */
	EOperation getCOREFeature__ChangeParent__COREFeature_COREFeatureRelationshipType();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#requires(core.COREFeature) <em>Requires</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires</em>' operation.
	 * @see core.COREFeature#requires(core.COREFeature)
	 * @generated
	 */
	EOperation getCOREFeature__Requires__COREFeature();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#excludes(core.COREFeature) <em>Excludes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excludes</em>' operation.
	 * @see core.COREFeature#excludes(core.COREFeature)
	 * @generated
	 */
	EOperation getCOREFeature__Excludes__COREFeature();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#removeConstraint(core.COREFeature) <em>Remove Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Constraint</em>' operation.
	 * @see core.COREFeature#removeConstraint(core.COREFeature)
	 * @generated
	 */
	EOperation getCOREFeature__RemoveConstraint__COREFeature();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#addRealizedBy(core.COREModel) <em>Add Realized By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Realized By</em>' operation.
	 * @see core.COREFeature#addRealizedBy(core.COREModel)
	 * @generated
	 */
	EOperation getCOREFeature__AddRealizedBy__COREModel();

	/**
	 * Returns the meta object for the '{@link core.COREFeature#AssociateReuse(core.COREReuse, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Associate Reuse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associate Reuse</em>' operation.
	 * @see core.COREFeature#AssociateReuse(core.COREReuse, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCOREFeature__AssociateReuse__COREReuse_EList_EList();

	/**
	 * Returns the meta object for class '{@link core.COREBinding <em>CORE Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Binding</em>'.
	 * @see core.COREBinding
	 * @generated
	 */
	EClass getCOREBinding();

	/**
	 * Returns the meta object for the reference list '{@link core.COREBinding#getCoreMappings <em>Core Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Core Mappings</em>'.
	 * @see core.COREBinding#getCoreMappings()
	 * @see #getCOREBinding()
	 * @generated
	 */
	EReference getCOREBinding_CoreMappings();

	/**
	 * Returns the meta object for class '{@link core.COREModelElement <em>CORE Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Model Element</em>'.
	 * @see core.COREModelElement
	 * @generated
	 */
	EClass getCOREModelElement();

	/**
	 * Returns the meta object for class '{@link core.CORECompositionSpecification <em>CORE Composition Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Composition Specification</em>'.
	 * @see core.CORECompositionSpecification
	 * @generated
	 */
	EClass getCORECompositionSpecification();

	/**
	 * Returns the meta object for the reference '{@link core.CORECompositionSpecification#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see core.CORECompositionSpecification#getSource()
	 * @see #getCORECompositionSpecification()
	 * @generated
	 */
	EReference getCORECompositionSpecification_Source();

	/**
	 * Returns the meta object for class '{@link core.COREMapping <em>CORE Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Mapping</em>'.
	 * @see core.COREMapping
	 * @generated
	 */
	EClass getCOREMapping();

	/**
	 * Returns the meta object for the reference '{@link core.COREMapping#getMappedTo <em>Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped To</em>'.
	 * @see core.COREMapping#getMappedTo()
	 * @see #getCOREMapping()
	 * @generated
	 */
	EReference getCOREMapping_MappedTo();

	/**
	 * Returns the meta object for the reference '{@link core.COREMapping#getMappedFrom <em>Mapped From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped From</em>'.
	 * @see core.COREMapping#getMappedFrom()
	 * @see #getCOREMapping()
	 * @generated
	 */
	EReference getCOREMapping_MappedFrom();

	/**
	 * Returns the meta object for class '{@link core.CORENamedElement <em>CORE Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Named Element</em>'.
	 * @see core.CORENamedElement
	 * @generated
	 */
	EClass getCORENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link core.CORENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.CORENamedElement#getName()
	 * @see #getCORENamedElement()
	 * @generated
	 */
	EAttribute getCORENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link core.COREInterface <em>CORE Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Interface</em>'.
	 * @see core.COREInterface
	 * @generated
	 */
	EClass getCOREInterface();

	/**
	 * Returns the meta object for the reference list '{@link core.COREInterface#getSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectable</em>'.
	 * @see core.COREInterface#getSelectable()
	 * @see #getCOREInterface()
	 * @generated
	 */
	EReference getCOREInterface_Selectable();

	/**
	 * Returns the meta object for the reference list '{@link core.COREInterface#getCustomizable <em>Customizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customizable</em>'.
	 * @see core.COREInterface#getCustomizable()
	 * @see #getCOREInterface()
	 * @generated
	 */
	EReference getCOREInterface_Customizable();

	/**
	 * Returns the meta object for the reference list '{@link core.COREInterface#getUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usable</em>'.
	 * @see core.COREInterface#getUsable()
	 * @see #getCOREInterface()
	 * @generated
	 */
	EReference getCOREInterface_Usable();

	/**
	 * Returns the meta object for the reference list '{@link core.COREInterface#getImpacted <em>Impacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacted</em>'.
	 * @see core.COREInterface#getImpacted()
	 * @see #getCOREInterface()
	 * @generated
	 */
	EReference getCOREInterface_Impacted();

	/**
	 * Returns the meta object for the reference list '{@link core.COREInterface#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defaults</em>'.
	 * @see core.COREInterface#getDefaults()
	 * @see #getCOREInterface()
	 * @generated
	 */
	EReference getCOREInterface_Defaults();

	/**
	 * Returns the meta object for class '{@link core.COREReuse <em>CORE Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Reuse</em>'.
	 * @see core.COREReuse
	 * @generated
	 */
	EClass getCOREReuse();

	/**
	 * Returns the meta object for the reference '{@link core.COREReuse#getReusedConcern <em>Reused Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reused Concern</em>'.
	 * @see core.COREReuse#getReusedConcern()
	 * @see #getCOREReuse()
	 * @generated
	 */
	EReference getCOREReuse_ReusedConcern();

	/**
	 * Returns the meta object for the containment reference list '{@link core.COREReuse#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see core.COREReuse#getConfigurations()
	 * @see #getCOREReuse()
	 * @generated
	 */
	EReference getCOREReuse_Configurations();

	/**
	 * Returns the meta object for the reference '{@link core.COREReuse#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see core.COREReuse#getSelected()
	 * @see #getCOREReuse()
	 * @generated
	 */
	EReference getCOREReuse_Selected();

	/**
	 * Returns the meta object for class '{@link core.COREPattern <em>CORE Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Pattern</em>'.
	 * @see core.COREPattern
	 * @generated
	 */
	EClass getCOREPattern();

	/**
	 * Returns the meta object for class '{@link core.COREImpactModelElement <em>CORE Impact Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Impact Model Element</em>'.
	 * @see core.COREImpactModelElement
	 * @generated
	 */
	EClass getCOREImpactModelElement();

	/**
	 * Returns the meta object for class '{@link core.COREConfiguration <em>CORE Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Configuration</em>'.
	 * @see core.COREConfiguration
	 * @generated
	 */
	EClass getCOREConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link core.COREConfiguration#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected</em>'.
	 * @see core.COREConfiguration#getSelected()
	 * @see #getCOREConfiguration()
	 * @generated
	 */
	EReference getCOREConfiguration_Selected();

	/**
	 * Returns the meta object for the reference list '{@link core.COREConfiguration#getReexposed <em>Reexposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reexposed</em>'.
	 * @see core.COREConfiguration#getReexposed()
	 * @see #getCOREConfiguration()
	 * @generated
	 */
	EReference getCOREConfiguration_Reexposed();

	/**
	 * Returns the meta object for class '{@link core.COREFeatureModel <em>CORE Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Feature Model</em>'.
	 * @see core.COREFeatureModel
	 * @generated
	 */
	EClass getCOREFeatureModel();

	/**
	 * Returns the meta object for the '{@link core.COREFeatureModel#getGlobalRoot() <em>Get Global Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Global Root</em>' operation.
	 * @see core.COREFeatureModel#getGlobalRoot()
	 * @generated
	 */
	EOperation getCOREFeatureModel__GetGlobalRoot();

	/**
	 * Returns the meta object for the '{@link core.COREFeatureModel#getLocalRoot() <em>Get Local Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Local Root</em>' operation.
	 * @see core.COREFeatureModel#getLocalRoot()
	 * @generated
	 */
	EOperation getCOREFeatureModel__GetLocalRoot();

	/**
	 * Returns the meta object for class '{@link core.COREModelReuse <em>CORE Model Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORE Model Reuse</em>'.
	 * @see core.COREModelReuse
	 * @generated
	 */
	EClass getCOREModelReuse();

	/**
	 * Returns the meta object for the reference list '{@link core.COREModelReuse#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see core.COREModelReuse#getCompositions()
	 * @see #getCOREModelReuse()
	 * @generated
	 */
	EReference getCOREModelReuse_Compositions();

	/**
	 * Returns the meta object for the reference list '{@link core.COREModelReuse#getModelReuse <em>Model Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Reuse</em>'.
	 * @see core.COREModelReuse#getModelReuse()
	 * @see #getCOREModelReuse()
	 * @generated
	 */
	EReference getCOREModelReuse_ModelReuse();

	/**
	 * Returns the meta object for enum '{@link core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CORE Feature Relationship Type</em>'.
	 * @see core.COREFeatureRelationshipType
	 * @generated
	 */
	EEnum getCOREFeatureRelationshipType();

	/**
	 * Returns the meta object for enum '{@link core.COREFeatureSelectionStatus <em>CORE Feature Selection Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CORE Feature Selection Status</em>'.
	 * @see core.COREFeatureSelectionStatus
	 * @generated
	 */
	EEnum getCOREFeatureSelectionStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link core.impl.COREModelImpl <em>CORE Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREModelImpl
		 * @see core.impl.CorePackageImpl#getCOREModel()
		 * @generated
		 */
		EClass CORE_MODEL = eINSTANCE.getCOREModel();

		/**
		 * The meta object literal for the '<em><b>Model Reuse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__MODEL_REUSE = eINSTANCE.getCOREModel_ModelReuse();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__MODEL_ELEMENTS = eINSTANCE.getCOREModel_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__REALIZES = eINSTANCE.getCOREModel_Realizes();

		/**
		 * The meta object literal for the '{@link core.impl.COREImpactModelImpl <em>CORE Impact Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREImpactModelImpl
		 * @see core.impl.CorePackageImpl#getCOREImpactModel()
		 * @generated
		 */
		EClass CORE_IMPACT_MODEL = eINSTANCE.getCOREImpactModel();

		/**
		 * The meta object literal for the '{@link core.impl.COREConcernImpl <em>CORE Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREConcernImpl
		 * @see core.impl.CorePackageImpl#getCOREConcern()
		 * @generated
		 */
		EClass CORE_CONCERN = eINSTANCE.getCOREConcern();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_CONCERN__MODELS = eINSTANCE.getCOREConcern_Models();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_CONCERN__INTERFACE = eINSTANCE.getCOREConcern_Interface();

		/**
		 * The meta object literal for the '{@link core.impl.COREFeatureImpl <em>CORE Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREFeatureImpl
		 * @see core.impl.CorePackageImpl#getCOREFeature()
		 * @generated
		 */
		EClass CORE_FEATURE = eINSTANCE.getCOREFeature();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_FEATURE__REALIZED_BY = eINSTANCE.getCOREFeature_RealizedBy();

		/**
		 * The meta object literal for the '<em><b>Reuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_FEATURE__REUSES = eINSTANCE.getCOREFeature_Reuses();

		/**
		 * The meta object literal for the '<em><b>Add Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___ADD_FEATURE__INT_STRING_COREFEATURERELATIONSHIPTYPE = eINSTANCE.getCOREFeature__AddFeature__int_String_COREFeatureRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___DELETE = eINSTANCE.getCOREFeature__Delete();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___RENAME__STRING = eINSTANCE.getCOREFeature__Rename__String();

		/**
		 * The meta object literal for the '<em><b>Change Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___CHANGE_LINK__COREFEATURERELATIONSHIPTYPE = eINSTANCE.getCOREFeature__ChangeLink__COREFeatureRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Change Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___CHANGE_PARENT__COREFEATURE_COREFEATURERELATIONSHIPTYPE = eINSTANCE.getCOREFeature__ChangeParent__COREFeature_COREFeatureRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___REQUIRES__COREFEATURE = eINSTANCE.getCOREFeature__Requires__COREFeature();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___EXCLUDES__COREFEATURE = eINSTANCE.getCOREFeature__Excludes__COREFeature();

		/**
		 * The meta object literal for the '<em><b>Remove Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___REMOVE_CONSTRAINT__COREFEATURE = eINSTANCE.getCOREFeature__RemoveConstraint__COREFeature();

		/**
		 * The meta object literal for the '<em><b>Add Realized By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___ADD_REALIZED_BY__COREMODEL = eINSTANCE.getCOREFeature__AddRealizedBy__COREModel();

		/**
		 * The meta object literal for the '<em><b>Associate Reuse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE___ASSOCIATE_REUSE__COREREUSE_ELIST_ELIST = eINSTANCE.getCOREFeature__AssociateReuse__COREReuse_EList_EList();

		/**
		 * The meta object literal for the '{@link core.impl.COREBindingImpl <em>CORE Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREBindingImpl
		 * @see core.impl.CorePackageImpl#getCOREBinding()
		 * @generated
		 */
		EClass CORE_BINDING = eINSTANCE.getCOREBinding();

		/**
		 * The meta object literal for the '<em><b>Core Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_BINDING__CORE_MAPPINGS = eINSTANCE.getCOREBinding_CoreMappings();

		/**
		 * The meta object literal for the '{@link core.impl.COREModelElementImpl <em>CORE Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREModelElementImpl
		 * @see core.impl.CorePackageImpl#getCOREModelElement()
		 * @generated
		 */
		EClass CORE_MODEL_ELEMENT = eINSTANCE.getCOREModelElement();

		/**
		 * The meta object literal for the '{@link core.impl.CORECompositionSpecificationImpl <em>CORE Composition Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CORECompositionSpecificationImpl
		 * @see core.impl.CorePackageImpl#getCORECompositionSpecification()
		 * @generated
		 */
		EClass CORE_COMPOSITION_SPECIFICATION = eINSTANCE.getCORECompositionSpecification();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_COMPOSITION_SPECIFICATION__SOURCE = eINSTANCE.getCORECompositionSpecification_Source();

		/**
		 * The meta object literal for the '{@link core.impl.COREMappingImpl <em>CORE Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREMappingImpl
		 * @see core.impl.CorePackageImpl#getCOREMapping()
		 * @generated
		 */
		EClass CORE_MAPPING = eINSTANCE.getCOREMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MAPPING__MAPPED_TO = eINSTANCE.getCOREMapping_MappedTo();

		/**
		 * The meta object literal for the '<em><b>Mapped From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MAPPING__MAPPED_FROM = eINSTANCE.getCOREMapping_MappedFrom();

		/**
		 * The meta object literal for the '{@link core.impl.CORENamedElementImpl <em>CORE Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CORENamedElementImpl
		 * @see core.impl.CorePackageImpl#getCORENamedElement()
		 * @generated
		 */
		EClass CORE_NAMED_ELEMENT = eINSTANCE.getCORENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_NAMED_ELEMENT__NAME = eINSTANCE.getCORENamedElement_Name();

		/**
		 * The meta object literal for the '{@link core.impl.COREInterfaceImpl <em>CORE Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREInterfaceImpl
		 * @see core.impl.CorePackageImpl#getCOREInterface()
		 * @generated
		 */
		EClass CORE_INTERFACE = eINSTANCE.getCOREInterface();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_INTERFACE__SELECTABLE = eINSTANCE.getCOREInterface_Selectable();

		/**
		 * The meta object literal for the '<em><b>Customizable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_INTERFACE__CUSTOMIZABLE = eINSTANCE.getCOREInterface_Customizable();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_INTERFACE__USABLE = eINSTANCE.getCOREInterface_Usable();

		/**
		 * The meta object literal for the '<em><b>Impacted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_INTERFACE__IMPACTED = eINSTANCE.getCOREInterface_Impacted();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_INTERFACE__DEFAULTS = eINSTANCE.getCOREInterface_Defaults();

		/**
		 * The meta object literal for the '{@link core.impl.COREReuseImpl <em>CORE Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREReuseImpl
		 * @see core.impl.CorePackageImpl#getCOREReuse()
		 * @generated
		 */
		EClass CORE_REUSE = eINSTANCE.getCOREReuse();

		/**
		 * The meta object literal for the '<em><b>Reused Concern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_REUSE__REUSED_CONCERN = eINSTANCE.getCOREReuse_ReusedConcern();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_REUSE__CONFIGURATIONS = eINSTANCE.getCOREReuse_Configurations();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_REUSE__SELECTED = eINSTANCE.getCOREReuse_Selected();

		/**
		 * The meta object literal for the '{@link core.impl.COREPatternImpl <em>CORE Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREPatternImpl
		 * @see core.impl.CorePackageImpl#getCOREPattern()
		 * @generated
		 */
		EClass CORE_PATTERN = eINSTANCE.getCOREPattern();

		/**
		 * The meta object literal for the '{@link core.impl.COREImpactModelElementImpl <em>CORE Impact Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREImpactModelElementImpl
		 * @see core.impl.CorePackageImpl#getCOREImpactModelElement()
		 * @generated
		 */
		EClass CORE_IMPACT_MODEL_ELEMENT = eINSTANCE.getCOREImpactModelElement();

		/**
		 * The meta object literal for the '{@link core.impl.COREConfigurationImpl <em>CORE Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREConfigurationImpl
		 * @see core.impl.CorePackageImpl#getCOREConfiguration()
		 * @generated
		 */
		EClass CORE_CONFIGURATION = eINSTANCE.getCOREConfiguration();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_CONFIGURATION__SELECTED = eINSTANCE.getCOREConfiguration_Selected();

		/**
		 * The meta object literal for the '<em><b>Reexposed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_CONFIGURATION__REEXPOSED = eINSTANCE.getCOREConfiguration_Reexposed();

		/**
		 * The meta object literal for the '{@link core.impl.COREFeatureModelImpl <em>CORE Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREFeatureModelImpl
		 * @see core.impl.CorePackageImpl#getCOREFeatureModel()
		 * @generated
		 */
		EClass CORE_FEATURE_MODEL = eINSTANCE.getCOREFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Get Global Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE_MODEL___GET_GLOBAL_ROOT = eINSTANCE.getCOREFeatureModel__GetGlobalRoot();

		/**
		 * The meta object literal for the '<em><b>Get Local Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORE_FEATURE_MODEL___GET_LOCAL_ROOT = eINSTANCE.getCOREFeatureModel__GetLocalRoot();

		/**
		 * The meta object literal for the '{@link core.impl.COREModelReuseImpl <em>CORE Model Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.COREModelReuseImpl
		 * @see core.impl.CorePackageImpl#getCOREModelReuse()
		 * @generated
		 */
		EClass CORE_MODEL_REUSE = eINSTANCE.getCOREModelReuse();

		/**
		 * The meta object literal for the '<em><b>Compositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL_REUSE__COMPOSITIONS = eINSTANCE.getCOREModelReuse_Compositions();

		/**
		 * The meta object literal for the '<em><b>Model Reuse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL_REUSE__MODEL_REUSE = eINSTANCE.getCOREModelReuse_ModelReuse();

		/**
		 * The meta object literal for the '{@link core.COREFeatureRelationshipType <em>CORE Feature Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.COREFeatureRelationshipType
		 * @see core.impl.CorePackageImpl#getCOREFeatureRelationshipType()
		 * @generated
		 */
		EEnum CORE_FEATURE_RELATIONSHIP_TYPE = eINSTANCE.getCOREFeatureRelationshipType();

		/**
		 * The meta object literal for the '{@link core.COREFeatureSelectionStatus <em>CORE Feature Selection Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.COREFeatureSelectionStatus
		 * @see core.impl.CorePackageImpl#getCOREFeatureSelectionStatus()
		 * @generated
		 */
		EEnum CORE_FEATURE_SELECTION_STATUS = eINSTANCE.getCOREFeatureSelectionStatus();

	}

} //CorePackage
