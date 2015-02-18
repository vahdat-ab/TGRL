/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.grl.tgrl.tGRL.TGRLFactory
 * @model kind="package"
 * @generated
 */
public interface TGRLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tGRL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/grl/tgrl/TGRL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tGRL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TGRLPackage eINSTANCE = org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ModelImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>GR Lspecs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GR_LSPECS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLModelElementImpl <em>GRL Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLModelElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLModelElement()
   * @generated
   */
  int GRL_MODEL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_MODEL_ELEMENT__ID = 0;

  /**
   * The number of structural features of the '<em>GRL Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLNodeImpl <em>GRL Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLNodeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLNode()
   * @generated
   */
  int GRL_NODE = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_NODE__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_NODE__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GRL Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_NODE_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl <em>GRL Linkable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLLinkableElement()
   * @generated
   */
  int GRL_LINKABLE_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__LABEL = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__DESCRIPTION = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__IMPORTANCE = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE = GRL_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>GRL Linkable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_LINKABLE_ELEMENT_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElement()
   * @generated
   */
  int INTENTIONAL_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__ID = GRL_LINKABLE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__NAME = GRL_LINKABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__LABEL = GRL_LINKABLE_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DESCRIPTION = GRL_LINKABLE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE = GRL_LINKABLE_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__REFS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_FEATURE_COUNT = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl <em>Element Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getElementLink()
   * @generated
   */
  int ELEMENT_LINK = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__LABEL = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__DESCRIPTION = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__SRC = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__DEST = GRL_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Element Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl <em>KPI Conversion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIConversion()
   * @generated
   */
  int KPI_CONVERSION = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_CONVERSION__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The number of structural features of the '<em>KPI Conversion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_CONVERSION_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl <em>GR Lspec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLspec()
   * @generated
   */
  int GR_LSPEC = 7;

  /**
   * The feature id for the '<em><b>Impact Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__IMPACT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__LINKS = 1;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__ACTORS = 2;

  /**
   * The feature id for the '<em><b>Int Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__INT_ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__GROUPS = 4;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__STRATEGIES = 5;

  /**
   * The feature id for the '<em><b>Contribution Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__CONTRIBUTION_GROUPS = 6;

  /**
   * The feature id for the '<em><b>Contribution Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__CONTRIBUTION_CONTEXTS = 7;

  /**
   * The feature id for the '<em><b>Kpi Conv</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__KPI_CONV = 8;

  /**
   * The feature id for the '<em><b>Kpi Information Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__KPI_INFORMATION_ELEMENTS = 9;

  /**
   * The feature id for the '<em><b>Kpi Model Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__KPI_MODEL_LINKS = 10;

  /**
   * The feature id for the '<em><b>Indicator Group</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC__INDICATOR_GROUP = 11;

  /**
   * The number of structural features of the '<em>GR Lspec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GR_LSPEC_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ActorImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ID = GRL_LINKABLE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = GRL_LINKABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__LABEL = GRL_LINKABLE_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = GRL_LINKABLE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE = GRL_LINKABLE_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE_QUANTITATIVE = GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Included Actors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__INCLUDED_ACTORS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Collapsed Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__COLLAPSED_REFS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl <em>Softgoal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getSoftgoal()
   * @generated
   */
  int SOFTGOAL = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__REFS = INTENTIONAL_ELEMENT__REFS;

  /**
   * The number of structural features of the '<em>Softgoal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GoalImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REFS = INTENTIONAL_ELEMENT__REFS;

  /**
   * The feature id for the '<em><b>Evals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__EVALS = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.TaskImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getTask()
   * @generated
   */
  int TASK = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__REFS = INTENTIONAL_ELEMENT__REFS;

  /**
   * The feature id for the '<em><b>Evals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__EVALS = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.RessourceImpl <em>Ressource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.RessourceImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getRessource()
   * @generated
   */
  int RESSOURCE = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__REFS = INTENTIONAL_ELEMENT__REFS;

  /**
   * The number of structural features of the '<em>Ressource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl <em>Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicator()
   * @generated
   */
  int INDICATOR = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__REFS = INTENTIONAL_ELEMENT__REFS;

  /**
   * The feature id for the '<em><b>Kpi Model Links Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__KPI_MODEL_LINKS_DEST = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__GROUPS = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionImpl <em>Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecomposition()
   * @generated
   */
  int DECOMPOSITION = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__SRC = ELEMENT_LINK__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__DEST = ELEMENT_LINK__DEST;

  /**
   * The number of structural features of the '<em>Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl <em>Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContribution()
   * @generated
   */
  int CONTRIBUTION = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__SRC = ELEMENT_LINK__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__DEST = ELEMENT_LINK__DEST;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__QUANTITATIVE_CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Correlation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__CORRELATION = ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Changes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION__CHANGES = ELEMENT_LINK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DependencyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__SRC = ELEMENT_LINK__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__DEST = ELEMENT_LINK__DEST;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
   * @generated
   */
  int BELIEF = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__ID = GRL_NODE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__NAME = GRL_NODE__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__LABEL = GRL_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__DESCRIPTION = GRL_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Belief</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl <em>Collapsed Actor Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCollapsedActorRef()
   * @generated
   */
  int COLLAPSED_ACTOR_REF = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__ID = GRL_NODE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__NAME = GRL_NODE__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__LABEL = GRL_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__DESCRIPTION = GRL_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collapsed Actor Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl <em>Intentional Element Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElementRef()
   * @generated
   */
  int INTENTIONAL_ELEMENT_REF = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__ID = GRL_NODE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__NAME = GRL_NODE__NAME;

  /**
   * The feature id for the '<em><b>Criticality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__CRITICALITY = GRL_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__PRIORITY = GRL_NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__DEF = GRL_NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Intentional Element Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl <em>Impact Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImpactModel()
   * @generated
   */
  int IMPACT_MODEL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT_MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Impact Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl <em>Strategies Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getStrategiesGroup()
   * @generated
   */
  int STRATEGIES_GROUP = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP__STRATEGIES = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strategies Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationStrategy()
   * @generated
   */
  int EVALUATION_STRATEGY = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__EVALUATIONS = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Included Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__INCLUDED_STRATEGIES = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Kip Infor Config</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__KIP_INFOR_CONFIG = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Evaluation Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EVALUATION = 1;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__QUALITATIVE_EVALUATION = 2;

  /**
   * The feature id for the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXCEEDS = 3;

  /**
   * The feature id for the '<em><b>Eval Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EVAL_RANGE = 4;

  /**
   * The feature id for the '<em><b>Kpi Eval Value Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__KPI_EVAL_VALUE_SET = 5;

  /**
   * The feature id for the '<em><b>Kpi New Eval Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__KPI_NEW_EVAL_VALUE = 6;

  /**
   * The feature id for the '<em><b>In Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__IN_ELEMENT = 7;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl <em>Evaluation Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationRange()
   * @generated
   */
  int EVALUATION_RANGE = 24;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_RANGE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_RANGE__END = 1;

  /**
   * The feature id for the '<em><b>Step</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_RANGE__STEP = 2;

  /**
   * The number of structural features of the '<em>Evaluation Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_RANGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextGroupImpl <em>Contribution Context Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContextGroup()
   * @generated
   */
  int CONTRIBUTION_CONTEXT_GROUP = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contribs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP__CONTRIBS = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Contribution Context Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl <em>Contribution Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContext()
   * @generated
   */
  int CONTRIBUTION_CONTEXT = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Included Contexts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Changes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__CHANGES = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Contribution Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl <em>Contribution Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionChange()
   * @generated
   */
  int CONTRIBUTION_CHANGE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE__NAME = 0;

  /**
   * The feature id for the '<em><b>New Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE__NEW_CONTRIBUTION = 1;

  /**
   * The feature id for the '<em><b>New Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION = 2;

  /**
   * The feature id for the '<em><b>Contrib Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE__CONTRIB_RANGE = 3;

  /**
   * The number of structural features of the '<em>Contribution Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionRangeImpl <em>Contribution Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionRangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionRange()
   * @generated
   */
  int CONTRIBUTION_RANGE = 28;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_RANGE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_RANGE__END = 1;

  /**
   * The feature id for the '<em><b>Step</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_RANGE__STEP = 2;

  /**
   * The number of structural features of the '<em>Contribution Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_RANGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl <em>Qualitative Mappings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeMappings()
   * @generated
   */
  int QUALITATIVE_MAPPINGS = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPINGS__ID = KPI_CONVERSION__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPINGS__NAME = KPI_CONVERSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kpi Eval Value Set</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET = KPI_CONVERSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mappin</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPINGS__MAPPIN = KPI_CONVERSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualitative Mappings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPINGS_FEATURE_COUNT = KPI_CONVERSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl <em>KPI Eval Value Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIEvalValueSet()
   * @generated
   */
  int KPI_EVAL_VALUE_SET = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__TARGET_VALUE = 1;

  /**
   * The feature id for the '<em><b>Threshold Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__THRESHOLD_VALUE = 2;

  /**
   * The feature id for the '<em><b>Worst Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__WORST_VALUE = 3;

  /**
   * The feature id for the '<em><b>Evaluation Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__EVALUATION_VALUE = 4;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__UNIT = 5;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE = 6;

  /**
   * The number of structural features of the '<em>KPI Eval Value Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl <em>Qualitative Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeMapping()
   * @generated
   */
  int QUALITATIVE_MAPPING = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Real World Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__REAL_WORLD_LABEL = 1;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__EVALUATION = 2;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION = 3;

  /**
   * The feature id for the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__EXCEEDS = 4;

  /**
   * The number of structural features of the '<em>Qualitative Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPINewEvalValueImpl <em>KPI New Eval Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPINewEvalValueImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPINewEvalValue()
   * @generated
   */
  int KPI_NEW_EVAL_VALUE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_NEW_EVAL_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Evaluation Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_NEW_EVAL_VALUE__EVALUATION_VALUE = 1;

  /**
   * The number of structural features of the '<em>KPI New Eval Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_NEW_EVAL_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl <em>KPI Information Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationConfig()
   * @generated
   */
  int KPI_INFORMATION_CONFIG = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_CONFIG__NAME = 0;

  /**
   * The feature id for the '<em><b>Level Of Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION = 1;

  /**
   * The feature id for the '<em><b>Value Of Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION = 2;

  /**
   * The feature id for the '<em><b>Kpi Info Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>KPI Information Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_CONFIG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl <em>KPI Information Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationElement()
   * @generated
   */
  int KPI_INFORMATION_ELEMENT = 34;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__LABEL = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__DESCRIPTION = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Kpi Model Links Src</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__REFS = GRL_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>KPI Information Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl <em>KPI Information Element Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationElementRef()
   * @generated
   */
  int KPI_INFORMATION_ELEMENT_REF = 35;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__ID = GRL_NODE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__NAME = GRL_NODE__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__LABEL = GRL_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__DESCRIPTION = GRL_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>KPI Information Element Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl <em>KPI Model Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIModelLink()
   * @generated
   */
  int KPI_MODEL_LINK = 36;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__LABEL = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__DESCRIPTION = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>KPI Model Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl <em>Indicator Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicatorGroup()
   * @generated
   */
  int INDICATOR_GROUP = 37;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__ID = GRL_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__NAME = GRL_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__LABEL = GRL_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__DESCRIPTION = GRL_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Redesign Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__IS_REDESIGN_CATEGORY = GRL_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Indicators</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__INDICATORS = GRL_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Indicator Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP_FEATURE_COUNT = GRL_MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ImportanceType <em>Importance Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImportanceType()
   * @generated
   */
  int IMPORTANCE_TYPE = 38;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.DecompositionType <em>Decomposition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionType()
   * @generated
   */
  int DECOMPOSITION_TYPE = 39;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ContributionType <em>Contribution Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionType()
   * @generated
   */
  int CONTRIBUTION_TYPE = 40;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.QualitativeLabel <em>Qualitative Label</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeLabel()
   * @generated
   */
  int QUALITATIVE_LABEL = 41;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Criticality <em>Criticality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCriticality()
   * @generated
   */
  int CRITICALITY = 42;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Priority <em>Priority</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 43;


  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.Model#getGRLspecs <em>GR Lspecs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>GR Lspecs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Model#getGRLspecs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_GRLspecs();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLModelElement <em>GRL Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Model Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLModelElement
   * @generated
   */
  EClass getGRLModelElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLModelElement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLModelElement#getId()
   * @see #getGRLModelElement()
   * @generated
   */
  EAttribute getGRLModelElement_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLNode <em>GRL Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Node</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLNode
   * @generated
   */
  EClass getGRLNode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLNode#getName()
   * @see #getGRLNode()
   * @generated
   */
  EAttribute getGRLNode_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement <em>GRL Linkable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Linkable Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement
   * @generated
   */
  EClass getGRLLinkableElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getName()
   * @see #getGRLLinkableElement()
   * @generated
   */
  EAttribute getGRLLinkableElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getLabel()
   * @see #getGRLLinkableElement()
   * @generated
   */
  EAttribute getGRLLinkableElement_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getDescription()
   * @see #getGRLLinkableElement()
   * @generated
   */
  EAttribute getGRLLinkableElement_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getImportance()
   * @see #getGRLLinkableElement()
   * @generated
   */
  EAttribute getGRLLinkableElement_Importance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getImportanceQuantitative <em>Importance Quantitative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance Quantitative</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLLinkableElement#getImportanceQuantitative()
   * @see #getGRLLinkableElement()
   * @generated
   */
  EAttribute getGRLLinkableElement_ImportanceQuantitative();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement <em>Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intentional Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement
   * @generated
   */
  EClass getIntentionalElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decomposition Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement#getDecompositionType()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_DecompositionType();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement#getRefs()
   * @see #getIntentionalElement()
   * @generated
   */
  EReference getIntentionalElement_Refs();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ElementLink <em>Element Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink
   * @generated
   */
  EClass getElementLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink#getName()
   * @see #getElementLink()
   * @generated
   */
  EAttribute getElementLink_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink#getLabel()
   * @see #getElementLink()
   * @generated
   */
  EAttribute getElementLink_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink#getDescription()
   * @see #getElementLink()
   * @generated
   */
  EAttribute getElementLink_Description();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink#getSrc()
   * @see #getElementLink()
   * @generated
   */
  EReference getElementLink_Src();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.ElementLink#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink#getDest()
   * @see #getElementLink()
   * @generated
   */
  EReference getElementLink_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIConversion <em>KPI Conversion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Conversion</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIConversion
   * @generated
   */
  EClass getKPIConversion();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLspec <em>GR Lspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GR Lspec</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec
   * @generated
   */
  EClass getGRLspec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getImpactModel <em>Impact Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Impact Model</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getImpactModel()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_ImpactModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getLinks()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_Links();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getActors()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_Actors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getIntElements <em>Int Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Elements</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getIntElements()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_IntElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getGroups()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_Groups();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategies</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getStrategies()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_Strategies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getContributionGroups <em>Contribution Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contribution Groups</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getContributionGroups()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_ContributionGroups();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getContributionContexts <em>Contribution Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contribution Contexts</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getContributionContexts()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_ContributionContexts();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiConv <em>Kpi Conv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kpi Conv</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getKpiConv()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_KpiConv();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiInformationElements <em>Kpi Information Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kpi Information Elements</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getKpiInformationElements()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_KpiInformationElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getKpiModelLinks <em>Kpi Model Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kpi Model Links</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getKpiModelLinks()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_KpiModelLinks();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLspec#getIndicatorGroup <em>Indicator Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indicator Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLspec#getIndicatorGroup()
   * @see #getGRLspec()
   * @generated
   */
  EReference getGRLspec_IndicatorGroup();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Actor#getIncludedActors <em>Included Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Actors</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getIncludedActors()
   * @see #getActor()
   * @generated
   */
  EReference getActor_IncludedActors();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Actor#getCollapsedRefs <em>Collapsed Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Collapsed Refs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getCollapsedRefs()
   * @see #getActor()
   * @generated
   */
  EReference getActor_CollapsedRefs();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Softgoal <em>Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Softgoal</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Softgoal
   * @generated
   */
  EClass getSoftgoal();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Goal#getEvals <em>Evals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Evals</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Goal#getEvals()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Evals();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Task#getEvals <em>Evals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Evals</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Task#getEvals()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Evals();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Ressource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ressource</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Ressource
   * @generated
   */
  EClass getRessource();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Indicator <em>Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indicator</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Indicator
   * @generated
   */
  EClass getIndicator();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Indicator#getKpiModelLinksDest <em>Kpi Model Links Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Kpi Model Links Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Indicator#getKpiModelLinksDest()
   * @see #getIndicator()
   * @generated
   */
  EReference getIndicator_KpiModelLinksDest();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Indicator#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Groups</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Indicator#getGroups()
   * @see #getIndicator()
   * @generated
   */
  EReference getIndicator_Groups();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Decomposition <em>Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Decomposition
   * @generated
   */
  EClass getDecomposition();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Contribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Contribution
   * @generated
   */
  EClass getContribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Contribution#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Contribution#getContribution()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_Contribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantitative Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Contribution#getQuantitativeContribution()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_QuantitativeContribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Contribution#getCorrelation <em>Correlation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Correlation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Contribution#getCorrelation()
   * @see #getContribution()
   * @generated
   */
  EAttribute getContribution_Correlation();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Contribution#getChanges <em>Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Changes</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Contribution#getChanges()
   * @see #getContribution()
   * @generated
   */
  EReference getContribution_Changes();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief
   * @generated
   */
  EClass getBelief();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Belief#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief#getLabel()
   * @see #getBelief()
   * @generated
   */
  EAttribute getBelief_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Belief#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief#getDescription()
   * @see #getBelief()
   * @generated
   */
  EAttribute getBelief_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collapsed Actor Ref</em>'.
   * @see org.xtext.grl.tgrl.tGRL.CollapsedActorRef
   * @generated
   */
  EClass getCollapsedActorRef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getLabel()
   * @see #getCollapsedActorRef()
   * @generated
   */
  EAttribute getCollapsedActorRef_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getDescription()
   * @see #getCollapsedActorRef()
   * @generated
   */
  EAttribute getCollapsedActorRef_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef <em>Intentional Element Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intentional Element Ref</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef
   * @generated
   */
  EClass getIntentionalElementRef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getCriticality <em>Criticality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Criticality</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getCriticality()
   * @see #getIntentionalElementRef()
   * @generated
   */
  EAttribute getIntentionalElementRef_Criticality();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getPriority()
   * @see #getIntentionalElementRef()
   * @generated
   */
  EAttribute getIntentionalElementRef_Priority();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getDef()
   * @see #getIntentionalElementRef()
   * @generated
   */
  EReference getIntentionalElementRef_Def();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ImpactModel <em>Impact Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impact Model</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ImpactModel
   * @generated
   */
  EClass getImpactModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ImpactModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ImpactModel#getName()
   * @see #getImpactModel()
   * @generated
   */
  EAttribute getImpactModel_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.StrategiesGroup <em>Strategies Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategies Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategiesGroup
   * @generated
   */
  EClass getStrategiesGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.StrategiesGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategiesGroup#getName()
   * @see #getStrategiesGroup()
   * @generated
   */
  EAttribute getStrategiesGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.StrategiesGroup#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Strategies</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategiesGroup#getStrategies()
   * @see #getStrategiesGroup()
   * @generated
   */
  EReference getStrategiesGroup_Strategies();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy <em>Evaluation Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Strategy</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy
   * @generated
   */
  EClass getEvaluationStrategy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getName()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EAttribute getEvaluationStrategy_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getEvaluations()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_Evaluations();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getIncludedStrategies <em>Included Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Strategies</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getIncludedStrategies()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_IncludedStrategies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getKipInforConfig <em>Kip Infor Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kip Infor Config</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getKipInforConfig()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_KipInforConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getName()
   * @see #getEvaluation()
   * @generated
   */
  EAttribute getEvaluation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getEvaluation()
   * @see #getEvaluation()
   * @generated
   */
  EAttribute getEvaluation_Evaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualitative Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getQualitativeEvaluation()
   * @see #getEvaluation()
   * @generated
   */
  EAttribute getEvaluation_QualitativeEvaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getExceeds <em>Exceeds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exceeds</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getExceeds()
   * @see #getEvaluation()
   * @generated
   */
  EAttribute getEvaluation_Exceeds();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getEvalRange <em>Eval Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eval Range</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getEvalRange()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_EvalRange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kpi Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getKpiEvalValueSet()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_KpiEvalValueSet();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getKpiNewEvalValue <em>Kpi New Eval Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kpi New Eval Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getKpiNewEvalValue()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_KpiNewEvalValue();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getInElement <em>In Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getInElement()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_InElement();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange <em>Evaluation Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Range</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationRange
   * @generated
   */
  EClass getEvaluationRange();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationRange#getStart()
   * @see #getEvaluationRange()
   * @generated
   */
  EAttribute getEvaluationRange_Start();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationRange#getEnd()
   * @see #getEvaluationRange()
   * @generated
   */
  EAttribute getEvaluationRange_End();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.EvaluationRange#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Step</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationRange#getStep()
   * @see #getEvaluationRange()
   * @generated
   */
  EAttribute getEvaluationRange_Step();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup <em>Contribution Context Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Context Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContextGroup
   * @generated
   */
  EClass getContributionContextGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getName()
   * @see #getContributionContextGroup()
   * @generated
   */
  EAttribute getContributionContextGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getContribs <em>Contribs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contribs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContextGroup#getContribs()
   * @see #getContributionContextGroup()
   * @generated
   */
  EReference getContributionContextGroup_Contribs();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionContext <em>Contribution Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Context</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext
   * @generated
   */
  EClass getContributionContext();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext#getName()
   * @see #getContributionContext()
   * @generated
   */
  EAttribute getContributionContext_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getIncludedContexts <em>Included Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Contexts</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext#getIncludedContexts()
   * @see #getContributionContext()
   * @generated
   */
  EReference getContributionContext_IncludedContexts();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getChanges <em>Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Changes</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext#getChanges()
   * @see #getContributionContext()
   * @generated
   */
  EReference getContributionContext_Changes();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionChange <em>Contribution Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Change</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange
   * @generated
   */
  EClass getContributionChange();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange#getName()
   * @see #getContributionChange()
   * @generated
   */
  EAttribute getContributionChange_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewContribution <em>New Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange#getNewContribution()
   * @see #getContributionChange()
   * @generated
   */
  EAttribute getContributionChange_NewContribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getNewQuantitativeContribution <em>New Quantitative Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Quantitative Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange#getNewQuantitativeContribution()
   * @see #getContributionChange()
   * @generated
   */
  EAttribute getContributionChange_NewQuantitativeContribution();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribRange <em>Contrib Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contrib Range</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange#getContribRange()
   * @see #getContributionChange()
   * @generated
   */
  EReference getContributionChange_ContribRange();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionRange <em>Contribution Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Range</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionRange
   * @generated
   */
  EClass getContributionRange();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionRange#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionRange#getStart()
   * @see #getContributionRange()
   * @generated
   */
  EAttribute getContributionRange_Start();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionRange#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionRange#getEnd()
   * @see #getContributionRange()
   * @generated
   */
  EAttribute getContributionRange_End();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionRange#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Step</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionRange#getStep()
   * @see #getContributionRange()
   * @generated
   */
  EAttribute getContributionRange_Step();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings <em>Qualitative Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Mappings</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMappings
   * @generated
   */
  EClass getQualitativeMappings();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMappings#getName()
   * @see #getQualitativeMappings()
   * @generated
   */
  EAttribute getQualitativeMappings_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Kpi Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMappings#getKpiEvalValueSet()
   * @see #getQualitativeMappings()
   * @generated
   */
  EReference getQualitativeMappings_KpiEvalValueSet();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.QualitativeMappings#getMappin <em>Mappin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappin</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMappings#getMappin()
   * @see #getQualitativeMappings()
   * @generated
   */
  EReference getQualitativeMappings_Mappin();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet <em>KPI Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet
   * @generated
   */
  EClass getKPIEvalValueSet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getName()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getTargetValue()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_TargetValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getThresholdValue <em>Threshold Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getThresholdValue()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_ThresholdValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getWorstValue <em>Worst Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Worst Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getWorstValue()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_WorstValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getEvaluationValue <em>Evaluation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getEvaluationValue()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_EvaluationValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getUnit()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getQualitativeEvaluationValue <em>Qualitative Evaluation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualitative Evaluation Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet#getQualitativeEvaluationValue()
   * @see #getKPIEvalValueSet()
   * @generated
   */
  EAttribute getKPIEvalValueSet_QualitativeEvaluationValue();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping <em>Qualitative Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Mapping</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping
   * @generated
   */
  EClass getQualitativeMapping();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getName()
   * @see #getQualitativeMapping()
   * @generated
   */
  EAttribute getQualitativeMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getRealWorldLabel <em>Real World Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real World Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getRealWorldLabel()
   * @see #getQualitativeMapping()
   * @generated
   */
  EAttribute getQualitativeMapping_RealWorldLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getEvaluation()
   * @see #getQualitativeMapping()
   * @generated
   */
  EAttribute getQualitativeMapping_Evaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualitative Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getQualitativeEvaluation()
   * @see #getQualitativeMapping()
   * @generated
   */
  EAttribute getQualitativeMapping_QualitativeEvaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getExceeds <em>Exceeds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exceeds</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getExceeds()
   * @see #getQualitativeMapping()
   * @generated
   */
  EAttribute getQualitativeMapping_Exceeds();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue <em>KPI New Eval Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI New Eval Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPINewEvalValue
   * @generated
   */
  EClass getKPINewEvalValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getName()
   * @see #getKPINewEvalValue()
   * @generated
   */
  EAttribute getKPINewEvalValue_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getEvaluationValue <em>Evaluation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPINewEvalValue#getEvaluationValue()
   * @see #getKPINewEvalValue()
   * @generated
   */
  EAttribute getKPINewEvalValue_EvaluationValue();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig <em>KPI Information Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Information Config</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig
   * @generated
   */
  EClass getKPIInformationConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getName()
   * @see #getKPIInformationConfig()
   * @generated
   */
  EAttribute getKPIInformationConfig_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getLevelOfDimension <em>Level Of Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level Of Dimension</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getLevelOfDimension()
   * @see #getKPIInformationConfig()
   * @generated
   */
  EAttribute getKPIInformationConfig_LevelOfDimension();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getValueOfDimension <em>Value Of Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Of Dimension</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getValueOfDimension()
   * @see #getKPIInformationConfig()
   * @generated
   */
  EAttribute getKPIInformationConfig_ValueOfDimension();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getKpiInfoElement <em>Kpi Info Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Kpi Info Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationConfig#getKpiInfoElement()
   * @see #getKPIInformationConfig()
   * @generated
   */
  EReference getKPIInformationConfig_KpiInfoElement();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement <em>KPI Information Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Information Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement
   * @generated
   */
  EClass getKPIInformationElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement#getName()
   * @see #getKPIInformationElement()
   * @generated
   */
  EAttribute getKPIInformationElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement#getLabel()
   * @see #getKPIInformationElement()
   * @generated
   */
  EAttribute getKPIInformationElement_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement#getDescription()
   * @see #getKPIInformationElement()
   * @generated
   */
  EAttribute getKPIInformationElement_Description();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement#getKpiModelLinksSrc <em>Kpi Model Links Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Kpi Model Links Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement#getKpiModelLinksSrc()
   * @see #getKPIInformationElement()
   * @generated
   */
  EReference getKPIInformationElement_KpiModelLinksSrc();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElement#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElement#getRefs()
   * @see #getKPIInformationElement()
   * @generated
   */
  EReference getKPIInformationElement_Refs();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElementRef <em>KPI Information Element Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Information Element Ref</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElementRef
   * @generated
   */
  EClass getKPIInformationElementRef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getLabel()
   * @see #getKPIInformationElementRef()
   * @generated
   */
  EAttribute getKPIInformationElementRef_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getDescription()
   * @see #getKPIInformationElementRef()
   * @generated
   */
  EAttribute getKPIInformationElementRef_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIModelLink <em>KPI Model Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Model Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIModelLink
   * @generated
   */
  EClass getKPIModelLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIModelLink#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIModelLink#getName()
   * @see #getKPIModelLink()
   * @generated
   */
  EAttribute getKPIModelLink_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIModelLink#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIModelLink#getLabel()
   * @see #getKPIModelLink()
   * @generated
   */
  EAttribute getKPIModelLink_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIModelLink#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIModelLink#getDescription()
   * @see #getKPIModelLink()
   * @generated
   */
  EAttribute getKPIModelLink_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup <em>Indicator Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indicator Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup
   * @generated
   */
  EClass getIndicatorGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup#getName()
   * @see #getIndicatorGroup()
   * @generated
   */
  EAttribute getIndicatorGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup#getLabel()
   * @see #getIndicatorGroup()
   * @generated
   */
  EAttribute getIndicatorGroup_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup#getDescription()
   * @see #getIndicatorGroup()
   * @generated
   */
  EAttribute getIndicatorGroup_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIsRedesignCategory <em>Is Redesign Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Redesign Category</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIsRedesignCategory()
   * @see #getIndicatorGroup()
   * @generated
   */
  EAttribute getIndicatorGroup_IsRedesignCategory();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIndicators <em>Indicators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Indicators</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IndicatorGroup#getIndicators()
   * @see #getIndicatorGroup()
   * @generated
   */
  EReference getIndicatorGroup_Indicators();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.ImportanceType <em>Importance Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Importance Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @generated
   */
  EEnum getImportanceType();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.DecompositionType <em>Decomposition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Decomposition Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @generated
   */
  EEnum getDecompositionType();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.ContributionType <em>Contribution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Contribution Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @generated
   */
  EEnum getContributionType();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.QualitativeLabel <em>Qualitative Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Qualitative Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @generated
   */
  EEnum getQualitativeLabel();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.Criticality <em>Criticality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Criticality</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @generated
   */
  EEnum getCriticality();

  /**
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Priority</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @generated
   */
  EEnum getPriority();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TGRLFactory getTGRLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ModelImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>GR Lspecs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GR_LSPECS = eINSTANCE.getModel_GRLspecs();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLModelElementImpl <em>GRL Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLModelElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLModelElement()
     * @generated
     */
    EClass GRL_MODEL_ELEMENT = eINSTANCE.getGRLModelElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_MODEL_ELEMENT__ID = eINSTANCE.getGRLModelElement_Id();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLNodeImpl <em>GRL Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLNodeImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLNode()
     * @generated
     */
    EClass GRL_NODE = eINSTANCE.getGRLNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_NODE__NAME = eINSTANCE.getGRLNode_Name();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl <em>GRL Linkable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLLinkableElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLLinkableElement()
     * @generated
     */
    EClass GRL_LINKABLE_ELEMENT = eINSTANCE.getGRLLinkableElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_LINKABLE_ELEMENT__NAME = eINSTANCE.getGRLLinkableElement_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_LINKABLE_ELEMENT__LABEL = eINSTANCE.getGRLLinkableElement_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_LINKABLE_ELEMENT__DESCRIPTION = eINSTANCE.getGRLLinkableElement_Description();

    /**
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_LINKABLE_ELEMENT__IMPORTANCE = eINSTANCE.getGRLLinkableElement_Importance();

    /**
     * The meta object literal for the '<em><b>Importance Quantitative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_LINKABLE_ELEMENT__IMPORTANCE_QUANTITATIVE = eINSTANCE.getGRLLinkableElement_ImportanceQuantitative();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElement()
     * @generated
     */
    EClass INTENTIONAL_ELEMENT = eINSTANCE.getIntentionalElement();

    /**
     * The meta object literal for the '<em><b>Decomposition Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = eINSTANCE.getIntentionalElement_DecompositionType();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENTIONAL_ELEMENT__REFS = eINSTANCE.getIntentionalElement_Refs();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl <em>Element Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getElementLink()
     * @generated
     */
    EClass ELEMENT_LINK = eINSTANCE.getElementLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_LINK__NAME = eINSTANCE.getElementLink_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_LINK__LABEL = eINSTANCE.getElementLink_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_LINK__DESCRIPTION = eINSTANCE.getElementLink_Description();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_LINK__SRC = eINSTANCE.getElementLink_Src();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_LINK__DEST = eINSTANCE.getElementLink_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl <em>KPI Conversion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIConversion()
     * @generated
     */
    EClass KPI_CONVERSION = eINSTANCE.getKPIConversion();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl <em>GR Lspec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLspecImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLspec()
     * @generated
     */
    EClass GR_LSPEC = eINSTANCE.getGRLspec();

    /**
     * The meta object literal for the '<em><b>Impact Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__IMPACT_MODEL = eINSTANCE.getGRLspec_ImpactModel();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__LINKS = eINSTANCE.getGRLspec_Links();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__ACTORS = eINSTANCE.getGRLspec_Actors();

    /**
     * The meta object literal for the '<em><b>Int Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__INT_ELEMENTS = eINSTANCE.getGRLspec_IntElements();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__GROUPS = eINSTANCE.getGRLspec_Groups();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__STRATEGIES = eINSTANCE.getGRLspec_Strategies();

    /**
     * The meta object literal for the '<em><b>Contribution Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__CONTRIBUTION_GROUPS = eINSTANCE.getGRLspec_ContributionGroups();

    /**
     * The meta object literal for the '<em><b>Contribution Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__CONTRIBUTION_CONTEXTS = eINSTANCE.getGRLspec_ContributionContexts();

    /**
     * The meta object literal for the '<em><b>Kpi Conv</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__KPI_CONV = eINSTANCE.getGRLspec_KpiConv();

    /**
     * The meta object literal for the '<em><b>Kpi Information Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__KPI_INFORMATION_ELEMENTS = eINSTANCE.getGRLspec_KpiInformationElements();

    /**
     * The meta object literal for the '<em><b>Kpi Model Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__KPI_MODEL_LINKS = eINSTANCE.getGRLspec_KpiModelLinks();

    /**
     * The meta object literal for the '<em><b>Indicator Group</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GR_LSPEC__INDICATOR_GROUP = eINSTANCE.getGRLspec_IndicatorGroup();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ActorImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Included Actors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__INCLUDED_ACTORS = eINSTANCE.getActor_IncludedActors();

    /**
     * The meta object literal for the '<em><b>Collapsed Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__COLLAPSED_REFS = eINSTANCE.getActor_CollapsedRefs();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl <em>Softgoal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getSoftgoal()
     * @generated
     */
    EClass SOFTGOAL = eINSTANCE.getSoftgoal();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GoalImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Evals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__EVALS = eINSTANCE.getGoal_Evals();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.TaskImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Evals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__EVALS = eINSTANCE.getTask_Evals();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.RessourceImpl <em>Ressource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.RessourceImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getRessource()
     * @generated
     */
    EClass RESSOURCE = eINSTANCE.getRessource();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl <em>Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicator()
     * @generated
     */
    EClass INDICATOR = eINSTANCE.getIndicator();

    /**
     * The meta object literal for the '<em><b>Kpi Model Links Dest</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDICATOR__KPI_MODEL_LINKS_DEST = eINSTANCE.getIndicator_KpiModelLinksDest();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDICATOR__GROUPS = eINSTANCE.getIndicator_Groups();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionImpl <em>Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecomposition()
     * @generated
     */
    EClass DECOMPOSITION = eINSTANCE.getDecomposition();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl <em>Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContribution()
     * @generated
     */
    EClass CONTRIBUTION = eINSTANCE.getContribution();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__CONTRIBUTION = eINSTANCE.getContribution_Contribution();

    /**
     * The meta object literal for the '<em><b>Quantitative Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__QUANTITATIVE_CONTRIBUTION = eINSTANCE.getContribution_QuantitativeContribution();

    /**
     * The meta object literal for the '<em><b>Correlation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION__CORRELATION = eINSTANCE.getContribution_Correlation();

    /**
     * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION__CHANGES = eINSTANCE.getContribution_Changes();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DependencyImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
     * @generated
     */
    EClass BELIEF = eINSTANCE.getBelief();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELIEF__LABEL = eINSTANCE.getBelief_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELIEF__DESCRIPTION = eINSTANCE.getBelief_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl <em>Collapsed Actor Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCollapsedActorRef()
     * @generated
     */
    EClass COLLAPSED_ACTOR_REF = eINSTANCE.getCollapsedActorRef();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLAPSED_ACTOR_REF__LABEL = eINSTANCE.getCollapsedActorRef_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLAPSED_ACTOR_REF__DESCRIPTION = eINSTANCE.getCollapsedActorRef_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl <em>Intentional Element Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElementRef()
     * @generated
     */
    EClass INTENTIONAL_ELEMENT_REF = eINSTANCE.getIntentionalElementRef();

    /**
     * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT_REF__CRITICALITY = eINSTANCE.getIntentionalElementRef_Criticality();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT_REF__PRIORITY = eINSTANCE.getIntentionalElementRef_Priority();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENTIONAL_ELEMENT_REF__DEF = eINSTANCE.getIntentionalElementRef_Def();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl <em>Impact Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImpactModel()
     * @generated
     */
    EClass IMPACT_MODEL = eINSTANCE.getImpactModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPACT_MODEL__NAME = eINSTANCE.getImpactModel_Name();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl <em>Strategies Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getStrategiesGroup()
     * @generated
     */
    EClass STRATEGIES_GROUP = eINSTANCE.getStrategiesGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGIES_GROUP__NAME = eINSTANCE.getStrategiesGroup_Name();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGIES_GROUP__STRATEGIES = eINSTANCE.getStrategiesGroup_Strategies();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationStrategy()
     * @generated
     */
    EClass EVALUATION_STRATEGY = eINSTANCE.getEvaluationStrategy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_STRATEGY__NAME = eINSTANCE.getEvaluationStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__EVALUATIONS = eINSTANCE.getEvaluationStrategy_Evaluations();

    /**
     * The meta object literal for the '<em><b>Included Strategies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__INCLUDED_STRATEGIES = eINSTANCE.getEvaluationStrategy_IncludedStrategies();

    /**
     * The meta object literal for the '<em><b>Kip Infor Config</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__KIP_INFOR_CONFIG = eINSTANCE.getEvaluationStrategy_KipInforConfig();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__NAME = eINSTANCE.getEvaluation_Name();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__EVALUATION = eINSTANCE.getEvaluation_Evaluation();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__QUALITATIVE_EVALUATION = eINSTANCE.getEvaluation_QualitativeEvaluation();

    /**
     * The meta object literal for the '<em><b>Exceeds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__EXCEEDS = eINSTANCE.getEvaluation_Exceeds();

    /**
     * The meta object literal for the '<em><b>Eval Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__EVAL_RANGE = eINSTANCE.getEvaluation_EvalRange();

    /**
     * The meta object literal for the '<em><b>Kpi Eval Value Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__KPI_EVAL_VALUE_SET = eINSTANCE.getEvaluation_KpiEvalValueSet();

    /**
     * The meta object literal for the '<em><b>Kpi New Eval Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__KPI_NEW_EVAL_VALUE = eINSTANCE.getEvaluation_KpiNewEvalValue();

    /**
     * The meta object literal for the '<em><b>In Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__IN_ELEMENT = eINSTANCE.getEvaluation_InElement();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl <em>Evaluation Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationRange()
     * @generated
     */
    EClass EVALUATION_RANGE = eINSTANCE.getEvaluationRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_RANGE__START = eINSTANCE.getEvaluationRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_RANGE__END = eINSTANCE.getEvaluationRange_End();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_RANGE__STEP = eINSTANCE.getEvaluationRange_Step();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextGroupImpl <em>Contribution Context Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextGroupImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContextGroup()
     * @generated
     */
    EClass CONTRIBUTION_CONTEXT_GROUP = eINSTANCE.getContributionContextGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_CONTEXT_GROUP__NAME = eINSTANCE.getContributionContextGroup_Name();

    /**
     * The meta object literal for the '<em><b>Contribs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CONTEXT_GROUP__CONTRIBS = eINSTANCE.getContributionContextGroup_Contribs();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl <em>Contribution Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContext()
     * @generated
     */
    EClass CONTRIBUTION_CONTEXT = eINSTANCE.getContributionContext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_CONTEXT__NAME = eINSTANCE.getContributionContext_Name();

    /**
     * The meta object literal for the '<em><b>Included Contexts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS = eINSTANCE.getContributionContext_IncludedContexts();

    /**
     * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CONTEXT__CHANGES = eINSTANCE.getContributionContext_Changes();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl <em>Contribution Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionChange()
     * @generated
     */
    EClass CONTRIBUTION_CHANGE = eINSTANCE.getContributionChange();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_CHANGE__NAME = eINSTANCE.getContributionChange_Name();

    /**
     * The meta object literal for the '<em><b>New Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_CHANGE__NEW_CONTRIBUTION = eINSTANCE.getContributionChange_NewContribution();

    /**
     * The meta object literal for the '<em><b>New Quantitative Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION = eINSTANCE.getContributionChange_NewQuantitativeContribution();

    /**
     * The meta object literal for the '<em><b>Contrib Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CHANGE__CONTRIB_RANGE = eINSTANCE.getContributionChange_ContribRange();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionRangeImpl <em>Contribution Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionRangeImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionRange()
     * @generated
     */
    EClass CONTRIBUTION_RANGE = eINSTANCE.getContributionRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_RANGE__START = eINSTANCE.getContributionRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_RANGE__END = eINSTANCE.getContributionRange_End();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_RANGE__STEP = eINSTANCE.getContributionRange_Step();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl <em>Qualitative Mappings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingsImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeMappings()
     * @generated
     */
    EClass QUALITATIVE_MAPPINGS = eINSTANCE.getQualitativeMappings();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPINGS__NAME = eINSTANCE.getQualitativeMappings_Name();

    /**
     * The meta object literal for the '<em><b>Kpi Eval Value Set</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_MAPPINGS__KPI_EVAL_VALUE_SET = eINSTANCE.getQualitativeMappings_KpiEvalValueSet();

    /**
     * The meta object literal for the '<em><b>Mappin</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_MAPPINGS__MAPPIN = eINSTANCE.getQualitativeMappings_Mappin();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl <em>KPI Eval Value Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIEvalValueSet()
     * @generated
     */
    EClass KPI_EVAL_VALUE_SET = eINSTANCE.getKPIEvalValueSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__NAME = eINSTANCE.getKPIEvalValueSet_Name();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__TARGET_VALUE = eINSTANCE.getKPIEvalValueSet_TargetValue();

    /**
     * The meta object literal for the '<em><b>Threshold Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__THRESHOLD_VALUE = eINSTANCE.getKPIEvalValueSet_ThresholdValue();

    /**
     * The meta object literal for the '<em><b>Worst Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__WORST_VALUE = eINSTANCE.getKPIEvalValueSet_WorstValue();

    /**
     * The meta object literal for the '<em><b>Evaluation Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__EVALUATION_VALUE = eINSTANCE.getKPIEvalValueSet_EvaluationValue();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__UNIT = eINSTANCE.getKPIEvalValueSet_Unit();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE = eINSTANCE.getKPIEvalValueSet_QualitativeEvaluationValue();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl <em>Qualitative Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeMapping()
     * @generated
     */
    EClass QUALITATIVE_MAPPING = eINSTANCE.getQualitativeMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPING__NAME = eINSTANCE.getQualitativeMapping_Name();

    /**
     * The meta object literal for the '<em><b>Real World Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPING__REAL_WORLD_LABEL = eINSTANCE.getQualitativeMapping_RealWorldLabel();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPING__EVALUATION = eINSTANCE.getQualitativeMapping_Evaluation();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION = eINSTANCE.getQualitativeMapping_QualitativeEvaluation();

    /**
     * The meta object literal for the '<em><b>Exceeds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_MAPPING__EXCEEDS = eINSTANCE.getQualitativeMapping_Exceeds();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPINewEvalValueImpl <em>KPI New Eval Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPINewEvalValueImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPINewEvalValue()
     * @generated
     */
    EClass KPI_NEW_EVAL_VALUE = eINSTANCE.getKPINewEvalValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_NEW_EVAL_VALUE__NAME = eINSTANCE.getKPINewEvalValue_Name();

    /**
     * The meta object literal for the '<em><b>Evaluation Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_NEW_EVAL_VALUE__EVALUATION_VALUE = eINSTANCE.getKPINewEvalValue_EvaluationValue();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl <em>KPI Information Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationConfigImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationConfig()
     * @generated
     */
    EClass KPI_INFORMATION_CONFIG = eINSTANCE.getKPIInformationConfig();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_CONFIG__NAME = eINSTANCE.getKPIInformationConfig_Name();

    /**
     * The meta object literal for the '<em><b>Level Of Dimension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_CONFIG__LEVEL_OF_DIMENSION = eINSTANCE.getKPIInformationConfig_LevelOfDimension();

    /**
     * The meta object literal for the '<em><b>Value Of Dimension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_CONFIG__VALUE_OF_DIMENSION = eINSTANCE.getKPIInformationConfig_ValueOfDimension();

    /**
     * The meta object literal for the '<em><b>Kpi Info Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KPI_INFORMATION_CONFIG__KPI_INFO_ELEMENT = eINSTANCE.getKPIInformationConfig_KpiInfoElement();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl <em>KPI Information Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationElement()
     * @generated
     */
    EClass KPI_INFORMATION_ELEMENT = eINSTANCE.getKPIInformationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT__NAME = eINSTANCE.getKPIInformationElement_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT__LABEL = eINSTANCE.getKPIInformationElement_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT__DESCRIPTION = eINSTANCE.getKPIInformationElement_Description();

    /**
     * The meta object literal for the '<em><b>Kpi Model Links Src</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC = eINSTANCE.getKPIInformationElement_KpiModelLinksSrc();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KPI_INFORMATION_ELEMENT__REFS = eINSTANCE.getKPIInformationElement_Refs();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl <em>KPI Information Element Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationElementRef()
     * @generated
     */
    EClass KPI_INFORMATION_ELEMENT_REF = eINSTANCE.getKPIInformationElementRef();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT_REF__LABEL = eINSTANCE.getKPIInformationElementRef_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT_REF__DESCRIPTION = eINSTANCE.getKPIInformationElementRef_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl <em>KPI Model Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIModelLink()
     * @generated
     */
    EClass KPI_MODEL_LINK = eINSTANCE.getKPIModelLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_MODEL_LINK__NAME = eINSTANCE.getKPIModelLink_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_MODEL_LINK__LABEL = eINSTANCE.getKPIModelLink_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_MODEL_LINK__DESCRIPTION = eINSTANCE.getKPIModelLink_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl <em>Indicator Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicatorGroup()
     * @generated
     */
    EClass INDICATOR_GROUP = eINSTANCE.getIndicatorGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDICATOR_GROUP__NAME = eINSTANCE.getIndicatorGroup_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDICATOR_GROUP__LABEL = eINSTANCE.getIndicatorGroup_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDICATOR_GROUP__DESCRIPTION = eINSTANCE.getIndicatorGroup_Description();

    /**
     * The meta object literal for the '<em><b>Is Redesign Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDICATOR_GROUP__IS_REDESIGN_CATEGORY = eINSTANCE.getIndicatorGroup_IsRedesignCategory();

    /**
     * The meta object literal for the '<em><b>Indicators</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDICATOR_GROUP__INDICATORS = eINSTANCE.getIndicatorGroup_Indicators();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.ImportanceType <em>Importance Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.ImportanceType
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImportanceType()
     * @generated
     */
    EEnum IMPORTANCE_TYPE = eINSTANCE.getImportanceType();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.DecompositionType <em>Decomposition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.DecompositionType
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionType()
     * @generated
     */
    EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.ContributionType <em>Contribution Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.ContributionType
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionType()
     * @generated
     */
    EEnum CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.QualitativeLabel <em>Qualitative Label</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeLabel()
     * @generated
     */
    EEnum QUALITATIVE_LABEL = eINSTANCE.getQualitativeLabel();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.Criticality <em>Criticality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.Criticality
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCriticality()
     * @generated
     */
    EEnum CRITICALITY = eINSTANCE.getCriticality();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.Priority <em>Priority</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.Priority
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getPriority()
     * @generated
     */
    EEnum PRIORITY = eINSTANCE.getPriority();

  }

} //TGRLPackage
