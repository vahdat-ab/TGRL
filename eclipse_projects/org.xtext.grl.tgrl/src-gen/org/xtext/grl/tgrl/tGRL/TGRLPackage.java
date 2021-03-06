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
   * The feature id for the '<em><b>GR Lspecifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GR_LSPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ID = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLBaseElementImpl <em>GRL Base Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLBaseElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLBaseElement()
   * @generated
   */
  int GRL_BASE_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_BASE_ELEMENT__ID = ELEMENT__ID;

  /**
   * The number of structural features of the '<em>GRL Base Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_BASE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl <em>GRL Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLElement()
   * @generated
   */
  int GRL_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT__ID = GRL_BASE_ELEMENT__ID;

  /**
   * The number of structural features of the '<em>GRL Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT_FEATURE_COUNT = GRL_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.SuperIntentionalElementImpl <em>Super Intentional Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.SuperIntentionalElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getSuperIntentionalElement()
   * @generated
   */
  int SUPER_INTENTIONAL_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__LABEL = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__DESCRIPTION = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__META_DATA = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT__FILL_COLOR = GRL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Super Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElement()
   * @generated
   */
  int INTENTIONAL_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__ID = SUPER_INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__NAME = SUPER_INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__LABEL = SUPER_INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DESCRIPTION = SUPER_INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__META_DATA = SUPER_INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__FILL_COLOR = SUPER_INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__ELEMENT_LINKS = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_FEATURE_COUNT = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLSpecificationImpl <em>GRL Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.GRLSpecificationImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLSpecification()
   * @generated
   */
  int GRL_SPECIFICATION = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_SPECIFICATION__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_SPECIFICATION__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Grl Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_SPECIFICATION__GRL_ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>GRL Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_SPECIFICATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ActorImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__LABEL = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE_QUANTITATIVE = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = GRL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__META_DATA = GRL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__FILL_COLOR = GRL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Elemets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ELEMETS = GRL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl <em>Softgoal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.SoftgoalImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getSoftgoal()
   * @generated
   */
  int SOFTGOAL = 8;

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
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__META_DATA = INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

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
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__ELEMENT_LINKS = INTENTIONAL_ELEMENT__ELEMENT_LINKS;

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
  int GOAL = 9;

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
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__META_DATA = INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

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
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ELEMENT_LINKS = INTENTIONAL_ELEMENT__ELEMENT_LINKS;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.TaskImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getTask()
   * @generated
   */
  int TASK = 10;

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
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__META_DATA = INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

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
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ELEMENT_LINKS = INTENTIONAL_ELEMENT__ELEMENT_LINKS;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ResourceImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ID = INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__LABEL = INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__META_DATA = INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ELEMENT_LINKS = INTENTIONAL_ELEMENT__ELEMENT_LINKS;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl <em>Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicator()
   * @generated
   */
  int INDICATOR = 12;

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
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__META_DATA = INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

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
   * The feature id for the '<em><b>Element Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__ELEMENT_LINKS = INTENTIONAL_ELEMENT__ELEMENT_LINKS;

  /**
   * The number of structural features of the '<em>Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
   * @generated
   */
  int BELIEF = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__ID = SUPER_INTENTIONAL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__NAME = SUPER_INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__LABEL = SUPER_INTENTIONAL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__DESCRIPTION = SUPER_INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__META_DATA = SUPER_INTENTIONAL_ELEMENT__META_DATA;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__FILL_COLOR = SUPER_INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The number of structural features of the '<em>Belief</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_FEATURE_COUNT = SUPER_INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl <em>Element Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ElementLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getElementLink()
   * @generated
   */
  int ELEMENT_LINK = 14;

  /**
   * The number of structural features of the '<em>Element Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EndLinkImpl <em>End Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EndLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEndLink()
   * @generated
   */
  int END_LINK = 15;

  /**
   * The feature id for the '<em><b>Dest Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_LINK__DEST_NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_LINK__ID = 1;

  /**
   * The number of structural features of the '<em>End Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalElementLinkImpl <em>Normal Element Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.NormalElementLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalElementLink()
   * @generated
   */
  int NORMAL_ELEMENT_LINK = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_ELEMENT_LINK__ID = GRL_ELEMENT__ID;

  /**
   * The number of structural features of the '<em>Normal Element Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_ELEMENT_LINK_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalLinkImpl <em>Normal Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.NormalLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalLink()
   * @generated
   */
  int NORMAL_LINK = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_LINK__ID = NORMAL_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_LINK__SRC = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_LINK__TYPE = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_LINK__DEST = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Normal Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_LINK_FEATURE_COUNT = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalDependencyImpl <em>Normal Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.NormalDependencyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalDependency()
   * @generated
   */
  int NORMAL_DEPENDENCY = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DEPENDENCY__ID = NORMAL_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DEPENDENCY__SRC = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DEPENDENCY__DEST = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Normal Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DEPENDENCY_FEATURE_COUNT = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalContributionImpl <em>Normal Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.NormalContributionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalContribution()
   * @generated
   */
  int NORMAL_CONTRIBUTION = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CONTRIBUTION__ID = NORMAL_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CONTRIBUTION__SRC = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CONTRIBUTION__DEST = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Normal Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_CONTRIBUTION_FEATURE_COUNT = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalDecompositionImpl <em>Normal Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.NormalDecompositionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalDecomposition()
   * @generated
   */
  int NORMAL_DECOMPOSITION = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DECOMPOSITION__ID = NORMAL_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DECOMPOSITION__SRC = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DECOMPOSITION__DEST = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Normal Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DECOMPOSITION_FEATURE_COUNT = NORMAL_ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineElementLinkImpl <em>In Line Element Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.InLineElementLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineElementLink()
   * @generated
   */
  int IN_LINE_ELEMENT_LINK = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_ELEMENT_LINK__ID = GRL_BASE_ELEMENT__ID;

  /**
   * The number of structural features of the '<em>In Line Element Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_ELEMENT_LINK_FEATURE_COUNT = GRL_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineLinkImpl <em>In Line Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.InLineLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineLink()
   * @generated
   */
  int IN_LINE_LINK = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_LINK__ID = IN_LINE_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_LINK__TYPE = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_LINK__DEST = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>In Line Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_LINK_FEATURE_COUNT = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineDependencyImpl <em>In Line Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.InLineDependencyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineDependency()
   * @generated
   */
  int IN_LINE_DEPENDENCY = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DEPENDENCY__ID = IN_LINE_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DEPENDENCY__DEST = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Line Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DEPENDENCY_FEATURE_COUNT = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineContributionImpl <em>In Line Contribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.InLineContributionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineContribution()
   * @generated
   */
  int IN_LINE_CONTRIBUTION = 24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_CONTRIBUTION__ID = IN_LINE_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_CONTRIBUTION__DEST = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Line Contribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_CONTRIBUTION_FEATURE_COUNT = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineDecompositionImpl <em>In Line Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.InLineDecompositionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineDecomposition()
   * @generated
   */
  int IN_LINE_DECOMPOSITION = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DECOMPOSITION__ID = IN_LINE_ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Dest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DECOMPOSITION__DEST = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Line Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_DECOMPOSITION_FEATURE_COUNT = IN_LINE_ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionEndImpl <em>Decomposition End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionEndImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionEnd()
   * @generated
   */
  int DECOMPOSITION_END = 26;

  /**
   * The feature id for the '<em><b>Dest Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_END__DEST_NAME = END_LINK__DEST_NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_END__ID = END_LINK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_END__DESCRIPTION = END_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decomposition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_END_FEATURE_COUNT = END_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl <em>Contribution End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionEnd()
   * @generated
   */
  int CONTRIBUTION_END = 27;

  /**
   * The feature id for the '<em><b>Dest Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END__DEST_NAME = END_LINK__DEST_NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END__ID = END_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END__NAME = END_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END__CONTRIBUTION = END_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION = END_LINK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Contribution End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_END_FEATURE_COUNT = END_LINK_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyEndImpl <em>Dependency End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DependencyEndImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyEnd()
   * @generated
   */
  int DEPENDENCY_END = 28;

  /**
   * The feature id for the '<em><b>Dest Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_END__DEST_NAME = END_LINK__DEST_NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_END__ID = END_LINK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_END__DESCRIPTION = END_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dependency End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_END_FEATURE_COUNT = END_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.LinkTypeImpl <em>Link Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.LinkTypeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getLinkType()
   * @generated
   */
  int LINK_TYPE = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_TYPE__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_TYPE__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Link Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_TYPE_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.StrategyGroupImpl <em>Strategy Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.StrategyGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getStrategyGroup()
   * @generated
   */
  int STRATEGY_GROUP = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_GROUP__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_GROUP__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_GROUP__STRATEGIES = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strategy Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_GROUP_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationStrategy()
   * @generated
   */
  int EVALUATION_STRATEGY = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__SUPER_STRATEGIES = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__META_DATA = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__EVALUATIONS = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Evaluation Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Intentional Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__INTENTIONAL_ELEMENT = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__QUALITATIVE_EVALUATION = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EVALUATION = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXCEEDS = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Eval Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EVAL_RANGE = GRL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Kpi Eval Value Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__KPI_EVAL_VALUE_SET = GRL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl <em>Evaluation Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationRange()
   * @generated
   */
  int EVALUATION_RANGE = 33;

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
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl <em>KPI Eval Value Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIEvalValueSet()
   * @generated
   */
  int KPI_EVAL_VALUE_SET = 34;

  /**
   * The number of structural features of the '<em>KPI Eval Value Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_EVAL_VALUE_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl <em>KPI Quantitative Eval Value Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIQuantitativeEvalValueSet()
   * @generated
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET = 35;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Worst Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Evaluation Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>KPI Quantitative Eval Value Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUANTITATIVE_EVAL_VALUE_SET_FEATURE_COUNT = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIQualitativeEvalValueSetImpl <em>KPI Qualitative Eval Value Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIQualitativeEvalValueSetImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIQualitativeEvalValueSet()
   * @generated
   */
  int KPI_QUALITATIVE_EVAL_VALUE_SET = 36;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>KPI Qualitative Eval Value Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_QUALITATIVE_EVAL_VALUE_SET_FEATURE_COUNT = KPI_EVAL_VALUE_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl <em>Qualitative Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeMapping()
   * @generated
   */
  int QUALITATIVE_MAPPING = 37;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__META_DATA = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING__MAPPINGS = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualitative Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_MAPPING_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.MappingImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 38;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ID = GRL_BASE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = GRL_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__EVALUATION = GRL_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__QUALITATIVE_EVALUATION = GRL_BASE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__EXCEEDS = GRL_BASE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = GRL_BASE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionGroupImpl <em>Contribution Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionGroup()
   * @generated
   */
  int CONTRIBUTION_GROUP = 39;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_GROUP__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_GROUP__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contribs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_GROUP__CONTRIBS = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Contribution Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_GROUP_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl <em>Contribution Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContext()
   * @generated
   */
  int CONTRIBUTION_CONTEXT = 40;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Contribution Contexts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__META_DATA = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Changes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__CHANGES = GRL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Contribution Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl <em>Contribution Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionChange()
   * @generated
   */
  int CONTRIBUTION_CHANGE = 41;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CHANGE__CONTRIBUTION = 0;

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
  int CONTRIBUTION_RANGE = 42;

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
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.MetadataImpl <em>Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.MetadataImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getMetadata()
   * @generated
   */
  int METADATA = 43;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__VALUE = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.CommentImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 44;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__CONTENT = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl <em>Indicator Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicatorGroup()
   * @generated
   */
  int INDICATOR_GROUP = 45;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__NAME = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indicators</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__INDICATORS = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indicator Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ImportanceType <em>Importance Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImportanceType()
   * @generated
   */
  int IMPORTANCE_TYPE = 46;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.DecompositionType <em>Decomposition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionType()
   * @generated
   */
  int DECOMPOSITION_TYPE = 47;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ContributionType <em>Contribution Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionType()
   * @generated
   */
  int CONTRIBUTION_TYPE = 48;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.QualitativeLabel <em>Qualitative Label</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeLabel()
   * @generated
   */
  int QUALITATIVE_LABEL = 49;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 50;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Criticality <em>Criticality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCriticality()
   * @generated
   */
  int CRITICALITY = 51;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Priority <em>Priority</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 52;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Boolean <em>Boolean</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Boolean
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 53;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.Model#getGRLspecifications <em>GR Lspecifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>GR Lspecifications</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Model#getGRLspecifications()
   * @see #getModel()
   * @generated
   */
  EReference getModel_GRLspecifications();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Element#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Element#getId()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLBaseElement <em>GRL Base Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Base Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLBaseElement
   * @generated
   */
  EClass getGRLBaseElement();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLElement <em>GRL Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement
   * @generated
   */
  EClass getGRLElement();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement <em>Super Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Intentional Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement
   * @generated
   */
  EClass getSuperIntentionalElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getName()
   * @see #getSuperIntentionalElement()
   * @generated
   */
  EAttribute getSuperIntentionalElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getLabel()
   * @see #getSuperIntentionalElement()
   * @generated
   */
  EAttribute getSuperIntentionalElement_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getDescription()
   * @see #getSuperIntentionalElement()
   * @generated
   */
  EAttribute getSuperIntentionalElement_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getMetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Data</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getMetaData()
   * @see #getSuperIntentionalElement()
   * @generated
   */
  EReference getSuperIntentionalElement_MetaData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getFillColor <em>Fill Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fill Color</em>'.
   * @see org.xtext.grl.tgrl.tGRL.SuperIntentionalElement#getFillColor()
   * @see #getSuperIntentionalElement()
   * @generated
   */
  EAttribute getSuperIntentionalElement_FillColor();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportance()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Importance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance Quantitative</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement#getImportanceQuantitative()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_ImportanceQuantitative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.IntentionalElement#getElementLinks <em>Element Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Links</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElement#getElementLinks()
   * @see #getIntentionalElement()
   * @generated
   */
  EReference getIntentionalElement_ElementLinks();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.GRLSpecification <em>GRL Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GRL Specification</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLSpecification
   * @generated
   */
  EClass getGRLSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLSpecification#getName()
   * @see #getGRLSpecification()
   * @generated
   */
  EAttribute getGRLSpecification_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.GRLSpecification#getGrlElements <em>Grl Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grl Elements</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLSpecification#getGrlElements()
   * @see #getGRLSpecification()
   * @generated
   */
  EReference getGRLSpecification_GrlElements();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getLabel()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getImportance()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Importance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getImportanceQuantitative <em>Importance Quantitative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance Quantitative</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getImportanceQuantitative()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_ImportanceQuantitative();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getDescription()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.Actor#getMetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Data</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getMetaData()
   * @see #getActor()
   * @generated
   */
  EReference getActor_MetaData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Actor#getFillColor <em>Fill Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fill Color</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getFillColor()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_FillColor();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.Actor#getElemets <em>Elemets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elemets</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Actor#getElemets()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Elemets();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Resource
   * @generated
   */
  EClass getResource();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief
   * @generated
   */
  EClass getBelief();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.EndLink <em>End Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EndLink
   * @generated
   */
  EClass getEndLink();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.EndLink#getDestName <em>Dest Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EndLink#getDestName()
   * @see #getEndLink()
   * @generated
   */
  EReference getEndLink_DestName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.EndLink#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EndLink#getId()
   * @see #getEndLink()
   * @generated
   */
  EAttribute getEndLink_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.NormalElementLink <em>Normal Element Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Element Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalElementLink
   * @generated
   */
  EClass getNormalElementLink();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.NormalLink <em>Normal Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalLink
   * @generated
   */
  EClass getNormalLink();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.NormalLink#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalLink#getSrc()
   * @see #getNormalLink()
   * @generated
   */
  EReference getNormalLink_Src();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.NormalLink#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalLink#getType()
   * @see #getNormalLink()
   * @generated
   */
  EReference getNormalLink_Type();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.NormalLink#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalLink#getDest()
   * @see #getNormalLink()
   * @generated
   */
  EReference getNormalLink_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.NormalDependency <em>Normal Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Dependency</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDependency
   * @generated
   */
  EClass getNormalDependency();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.NormalDependency#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDependency#getSrc()
   * @see #getNormalDependency()
   * @generated
   */
  EReference getNormalDependency_Src();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.NormalDependency#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDependency#getDest()
   * @see #getNormalDependency()
   * @generated
   */
  EReference getNormalDependency_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.NormalContribution <em>Normal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalContribution
   * @generated
   */
  EClass getNormalContribution();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.NormalContribution#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalContribution#getSrc()
   * @see #getNormalContribution()
   * @generated
   */
  EReference getNormalContribution_Src();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.NormalContribution#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalContribution#getDest()
   * @see #getNormalContribution()
   * @generated
   */
  EReference getNormalContribution_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.NormalDecomposition <em>Normal Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Decomposition</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDecomposition
   * @generated
   */
  EClass getNormalDecomposition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.NormalDecomposition#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDecomposition#getSrc()
   * @see #getNormalDecomposition()
   * @generated
   */
  EReference getNormalDecomposition_Src();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.NormalDecomposition#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.NormalDecomposition#getDest()
   * @see #getNormalDecomposition()
   * @generated
   */
  EReference getNormalDecomposition_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.InLineElementLink <em>In Line Element Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Element Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineElementLink
   * @generated
   */
  EClass getInLineElementLink();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.InLineLink <em>In Line Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineLink
   * @generated
   */
  EClass getInLineLink();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.InLineLink#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineLink#getType()
   * @see #getInLineLink()
   * @generated
   */
  EReference getInLineLink_Type();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.InLineLink#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineLink#getDest()
   * @see #getInLineLink()
   * @generated
   */
  EReference getInLineLink_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.InLineDependency <em>In Line Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Dependency</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineDependency
   * @generated
   */
  EClass getInLineDependency();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.InLineDependency#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineDependency#getDest()
   * @see #getInLineDependency()
   * @generated
   */
  EReference getInLineDependency_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.InLineContribution <em>In Line Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineContribution
   * @generated
   */
  EClass getInLineContribution();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.InLineContribution#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineContribution#getDest()
   * @see #getInLineContribution()
   * @generated
   */
  EReference getInLineContribution_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.InLineDecomposition <em>In Line Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Decomposition</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineDecomposition
   * @generated
   */
  EClass getInLineDecomposition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.InLineDecomposition#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.InLineDecomposition#getDest()
   * @see #getInLineDecomposition()
   * @generated
   */
  EReference getInLineDecomposition_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DecompositionEnd <em>Decomposition End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition End</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionEnd
   * @generated
   */
  EClass getDecompositionEnd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.DecompositionEnd#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionEnd#getDescription()
   * @see #getDecompositionEnd()
   * @generated
   */
  EAttribute getDecompositionEnd_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd <em>Contribution End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution End</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnd
   * @generated
   */
  EClass getContributionEnd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnd#getName()
   * @see #getContributionEnd()
   * @generated
   */
  EAttribute getContributionEnd_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnd#getContribution()
   * @see #getContributionEnd()
   * @generated
   */
  EAttribute getContributionEnd_Contribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionEnd#getQuantitativeContribution <em>Quantitative Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantitative Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnd#getQuantitativeContribution()
   * @see #getContributionEnd()
   * @generated
   */
  EAttribute getContributionEnd_QuantitativeContribution();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DependencyEnd <em>Dependency End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency End</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DependencyEnd
   * @generated
   */
  EClass getDependencyEnd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.DependencyEnd#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DependencyEnd#getDescription()
   * @see #getDependencyEnd()
   * @generated
   */
  EAttribute getDependencyEnd_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.LinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Type</em>'.
   * @see org.xtext.grl.tgrl.tGRL.LinkType
   * @generated
   */
  EClass getLinkType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.LinkType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.LinkType#getName()
   * @see #getLinkType()
   * @generated
   */
  EAttribute getLinkType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.StrategyGroup <em>Strategy Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategyGroup
   * @generated
   */
  EClass getStrategyGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.StrategyGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategyGroup#getName()
   * @see #getStrategyGroup()
   * @generated
   */
  EAttribute getStrategyGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.StrategyGroup#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Strategies</em>'.
   * @see org.xtext.grl.tgrl.tGRL.StrategyGroup#getStrategies()
   * @see #getStrategyGroup()
   * @generated
   */
  EReference getStrategyGroup_Strategies();

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
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getSuperStrategies <em>Super Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Strategies</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getSuperStrategies()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_SuperStrategies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getMetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Data</em>'.
   * @see org.xtext.grl.tgrl.tGRL.EvaluationStrategy#getMetaData()
   * @see #getEvaluationStrategy()
   * @generated
   */
  EReference getEvaluationStrategy_MetaData();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.Evaluation#getIntentionalElement <em>Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Intentional Element</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#getIntentionalElement()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_IntentionalElement();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Evaluation#isExceeds <em>Exceeds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exceeds</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Evaluation#isExceeds()
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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIEvalValueSet <em>KPI Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIEvalValueSet
   * @generated
   */
  EClass getKPIEvalValueSet();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet <em>KPI Quantitative Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Quantitative Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet
   * @generated
   */
  EClass getKPIQuantitativeEvalValueSet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getTargetValue()
   * @see #getKPIQuantitativeEvalValueSet()
   * @generated
   */
  EAttribute getKPIQuantitativeEvalValueSet_TargetValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getThresholdValue <em>Threshold Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getThresholdValue()
   * @see #getKPIQuantitativeEvalValueSet()
   * @generated
   */
  EAttribute getKPIQuantitativeEvalValueSet_ThresholdValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getWorstValue <em>Worst Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Worst Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getWorstValue()
   * @see #getKPIQuantitativeEvalValueSet()
   * @generated
   */
  EAttribute getKPIQuantitativeEvalValueSet_WorstValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getEvaluationValue <em>Evaluation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getEvaluationValue()
   * @see #getKPIQuantitativeEvalValueSet()
   * @generated
   */
  EAttribute getKPIQuantitativeEvalValueSet_EvaluationValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet#getUnit()
   * @see #getKPIQuantitativeEvalValueSet()
   * @generated
   */
  EAttribute getKPIQuantitativeEvalValueSet_Unit();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet <em>KPI Qualitative Eval Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KPI Qualitative Eval Value Set</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet
   * @generated
   */
  EClass getKPIQualitativeEvalValueSet();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet#getQualitativeEvaluationValue <em>Qualitative Evaluation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualitative Evaluation Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet#getQualitativeEvaluationValue()
   * @see #getKPIQualitativeEvalValueSet()
   * @generated
   */
  EReference getKPIQualitativeEvalValueSet_QualitativeEvaluationValue();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getMetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Data</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getMetaData()
   * @see #getQualitativeMapping()
   * @generated
   */
  EReference getQualitativeMapping_MetaData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.QualitativeMapping#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.xtext.grl.tgrl.tGRL.QualitativeMapping#getMappings()
   * @see #getQualitativeMapping()
   * @generated
   */
  EReference getQualitativeMapping_Mappings();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Mapping#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Mapping#getEvaluation()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Evaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Mapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualitative Evaluation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Mapping#getQualitativeEvaluation()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_QualitativeEvaluation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Mapping#getExceeds <em>Exceeds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exceeds</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Mapping#getExceeds()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Exceeds();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionGroup <em>Contribution Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Group</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionGroup
   * @generated
   */
  EClass getContributionGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionGroup#getName()
   * @see #getContributionGroup()
   * @generated
   */
  EAttribute getContributionGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionGroup#getContribs <em>Contribs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contribs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionGroup#getContribs()
   * @see #getContributionGroup()
   * @generated
   */
  EReference getContributionGroup_Contribs();

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
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getSuperContributionContexts <em>Super Contribution Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Contribution Contexts</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext#getSuperContributionContexts()
   * @see #getContributionContext()
   * @generated
   */
  EReference getContributionContext_SuperContributionContexts();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionContext#getMetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Data</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionContext#getMetaData()
   * @see #getContributionContext()
   * @generated
   */
  EReference getContributionContext_MetaData();

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
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.ContributionChange#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionChange#getContribution()
   * @see #getContributionChange()
   * @generated
   */
  EReference getContributionChange_Contribution();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Metadata
   * @generated
   */
  EClass getMetadata();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Metadata#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Metadata#getName()
   * @see #getMetadata()
   * @generated
   */
  EAttribute getMetadata_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Metadata#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Metadata#getValue()
   * @see #getMetadata()
   * @generated
   */
  EAttribute getMetadata_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Comment#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Comment#getContent()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Content();

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
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @generated
   */
  EEnum getColor();

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
   * Returns the meta object for enum '{@link org.xtext.grl.tgrl.tGRL.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Boolean
   * @generated
   */
  EEnum getBoolean();

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
     * The meta object literal for the '<em><b>GR Lspecifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GR_LSPECIFICATIONS = eINSTANCE.getModel_GRLspecifications();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLBaseElementImpl <em>GRL Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLBaseElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLBaseElement()
     * @generated
     */
    EClass GRL_BASE_ELEMENT = eINSTANCE.getGRLBaseElement();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl <em>GRL Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLElement()
     * @generated
     */
    EClass GRL_ELEMENT = eINSTANCE.getGRLElement();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.SuperIntentionalElementImpl <em>Super Intentional Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.SuperIntentionalElementImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getSuperIntentionalElement()
     * @generated
     */
    EClass SUPER_INTENTIONAL_ELEMENT = eINSTANCE.getSuperIntentionalElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_INTENTIONAL_ELEMENT__NAME = eINSTANCE.getSuperIntentionalElement_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_INTENTIONAL_ELEMENT__LABEL = eINSTANCE.getSuperIntentionalElement_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_INTENTIONAL_ELEMENT__DESCRIPTION = eINSTANCE.getSuperIntentionalElement_Description();

    /**
     * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_INTENTIONAL_ELEMENT__META_DATA = eINSTANCE.getSuperIntentionalElement_MetaData();

    /**
     * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_INTENTIONAL_ELEMENT__FILL_COLOR = eINSTANCE.getSuperIntentionalElement_FillColor();

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
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__IMPORTANCE = eINSTANCE.getIntentionalElement_Importance();

    /**
     * The meta object literal for the '<em><b>Importance Quantitative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = eINSTANCE.getIntentionalElement_ImportanceQuantitative();

    /**
     * The meta object literal for the '<em><b>Element Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENTIONAL_ELEMENT__ELEMENT_LINKS = eINSTANCE.getIntentionalElement_ElementLinks();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.GRLSpecificationImpl <em>GRL Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.GRLSpecificationImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getGRLSpecification()
     * @generated
     */
    EClass GRL_SPECIFICATION = eINSTANCE.getGRLSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_SPECIFICATION__NAME = eINSTANCE.getGRLSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Grl Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRL_SPECIFICATION__GRL_ELEMENTS = eINSTANCE.getGRLSpecification_GrlElements();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__LABEL = eINSTANCE.getActor_Label();

    /**
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__IMPORTANCE = eINSTANCE.getActor_Importance();

    /**
     * The meta object literal for the '<em><b>Importance Quantitative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__IMPORTANCE_QUANTITATIVE = eINSTANCE.getActor_ImportanceQuantitative();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

    /**
     * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__META_DATA = eINSTANCE.getActor_MetaData();

    /**
     * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__FILL_COLOR = eINSTANCE.getActor_FillColor();

    /**
     * The meta object literal for the '<em><b>Elemets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__ELEMETS = eINSTANCE.getActor_Elemets();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.TaskImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ResourceImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
     * @generated
     */
    EClass BELIEF = eINSTANCE.getBelief();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.EndLinkImpl <em>End Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.EndLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEndLink()
     * @generated
     */
    EClass END_LINK = eINSTANCE.getEndLink();

    /**
     * The meta object literal for the '<em><b>Dest Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference END_LINK__DEST_NAME = eINSTANCE.getEndLink_DestName();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_LINK__ID = eINSTANCE.getEndLink_Id();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalElementLinkImpl <em>Normal Element Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.NormalElementLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalElementLink()
     * @generated
     */
    EClass NORMAL_ELEMENT_LINK = eINSTANCE.getNormalElementLink();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalLinkImpl <em>Normal Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.NormalLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalLink()
     * @generated
     */
    EClass NORMAL_LINK = eINSTANCE.getNormalLink();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_LINK__SRC = eINSTANCE.getNormalLink_Src();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_LINK__TYPE = eINSTANCE.getNormalLink_Type();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_LINK__DEST = eINSTANCE.getNormalLink_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalDependencyImpl <em>Normal Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.NormalDependencyImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalDependency()
     * @generated
     */
    EClass NORMAL_DEPENDENCY = eINSTANCE.getNormalDependency();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_DEPENDENCY__SRC = eINSTANCE.getNormalDependency_Src();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_DEPENDENCY__DEST = eINSTANCE.getNormalDependency_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalContributionImpl <em>Normal Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.NormalContributionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalContribution()
     * @generated
     */
    EClass NORMAL_CONTRIBUTION = eINSTANCE.getNormalContribution();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_CONTRIBUTION__SRC = eINSTANCE.getNormalContribution_Src();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_CONTRIBUTION__DEST = eINSTANCE.getNormalContribution_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.NormalDecompositionImpl <em>Normal Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.NormalDecompositionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getNormalDecomposition()
     * @generated
     */
    EClass NORMAL_DECOMPOSITION = eINSTANCE.getNormalDecomposition();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_DECOMPOSITION__SRC = eINSTANCE.getNormalDecomposition_Src();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_DECOMPOSITION__DEST = eINSTANCE.getNormalDecomposition_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineElementLinkImpl <em>In Line Element Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.InLineElementLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineElementLink()
     * @generated
     */
    EClass IN_LINE_ELEMENT_LINK = eINSTANCE.getInLineElementLink();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineLinkImpl <em>In Line Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.InLineLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineLink()
     * @generated
     */
    EClass IN_LINE_LINK = eINSTANCE.getInLineLink();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_LINE_LINK__TYPE = eINSTANCE.getInLineLink_Type();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_LINE_LINK__DEST = eINSTANCE.getInLineLink_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineDependencyImpl <em>In Line Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.InLineDependencyImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineDependency()
     * @generated
     */
    EClass IN_LINE_DEPENDENCY = eINSTANCE.getInLineDependency();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_LINE_DEPENDENCY__DEST = eINSTANCE.getInLineDependency_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineContributionImpl <em>In Line Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.InLineContributionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineContribution()
     * @generated
     */
    EClass IN_LINE_CONTRIBUTION = eINSTANCE.getInLineContribution();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_LINE_CONTRIBUTION__DEST = eINSTANCE.getInLineContribution_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.InLineDecompositionImpl <em>In Line Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.InLineDecompositionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getInLineDecomposition()
     * @generated
     */
    EClass IN_LINE_DECOMPOSITION = eINSTANCE.getInLineDecomposition();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_LINE_DECOMPOSITION__DEST = eINSTANCE.getInLineDecomposition_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionEndImpl <em>Decomposition End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionEndImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionEnd()
     * @generated
     */
    EClass DECOMPOSITION_END = eINSTANCE.getDecompositionEnd();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECOMPOSITION_END__DESCRIPTION = eINSTANCE.getDecompositionEnd_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl <em>Contribution End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionEnd()
     * @generated
     */
    EClass CONTRIBUTION_END = eINSTANCE.getContributionEnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_END__NAME = eINSTANCE.getContributionEnd_Name();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_END__CONTRIBUTION = eINSTANCE.getContributionEnd_Contribution();

    /**
     * The meta object literal for the '<em><b>Quantitative Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION = eINSTANCE.getContributionEnd_QuantitativeContribution();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyEndImpl <em>Dependency End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DependencyEndImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyEnd()
     * @generated
     */
    EClass DEPENDENCY_END = eINSTANCE.getDependencyEnd();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY_END__DESCRIPTION = eINSTANCE.getDependencyEnd_Description();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.LinkTypeImpl <em>Link Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.LinkTypeImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getLinkType()
     * @generated
     */
    EClass LINK_TYPE = eINSTANCE.getLinkType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_TYPE__NAME = eINSTANCE.getLinkType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.StrategyGroupImpl <em>Strategy Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.StrategyGroupImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getStrategyGroup()
     * @generated
     */
    EClass STRATEGY_GROUP = eINSTANCE.getStrategyGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGY_GROUP__NAME = eINSTANCE.getStrategyGroup_Name();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_GROUP__STRATEGIES = eINSTANCE.getStrategyGroup_Strategies();

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
     * The meta object literal for the '<em><b>Super Strategies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__SUPER_STRATEGIES = eINSTANCE.getEvaluationStrategy_SuperStrategies();

    /**
     * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__META_DATA = eINSTANCE.getEvaluationStrategy_MetaData();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_STRATEGY__EVALUATIONS = eINSTANCE.getEvaluationStrategy_Evaluations();

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
     * The meta object literal for the '<em><b>Intentional Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__INTENTIONAL_ELEMENT = eINSTANCE.getEvaluation_IntentionalElement();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__QUALITATIVE_EVALUATION = eINSTANCE.getEvaluation_QualitativeEvaluation();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION__EVALUATION = eINSTANCE.getEvaluation_Evaluation();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl <em>KPI Eval Value Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIEvalValueSetImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIEvalValueSet()
     * @generated
     */
    EClass KPI_EVAL_VALUE_SET = eINSTANCE.getKPIEvalValueSet();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl <em>KPI Quantitative Eval Value Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIQuantitativeEvalValueSetImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIQuantitativeEvalValueSet()
     * @generated
     */
    EClass KPI_QUANTITATIVE_EVAL_VALUE_SET = eINSTANCE.getKPIQuantitativeEvalValueSet();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_QUANTITATIVE_EVAL_VALUE_SET__TARGET_VALUE = eINSTANCE.getKPIQuantitativeEvalValueSet_TargetValue();

    /**
     * The meta object literal for the '<em><b>Threshold Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_QUANTITATIVE_EVAL_VALUE_SET__THRESHOLD_VALUE = eINSTANCE.getKPIQuantitativeEvalValueSet_ThresholdValue();

    /**
     * The meta object literal for the '<em><b>Worst Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_QUANTITATIVE_EVAL_VALUE_SET__WORST_VALUE = eINSTANCE.getKPIQuantitativeEvalValueSet_WorstValue();

    /**
     * The meta object literal for the '<em><b>Evaluation Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_QUANTITATIVE_EVAL_VALUE_SET__EVALUATION_VALUE = eINSTANCE.getKPIQuantitativeEvalValueSet_EvaluationValue();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_QUANTITATIVE_EVAL_VALUE_SET__UNIT = eINSTANCE.getKPIQuantitativeEvalValueSet_Unit();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIQualitativeEvalValueSetImpl <em>KPI Qualitative Eval Value Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.KPIQualitativeEvalValueSetImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIQualitativeEvalValueSet()
     * @generated
     */
    EClass KPI_QUALITATIVE_EVAL_VALUE_SET = eINSTANCE.getKPIQualitativeEvalValueSet();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE = eINSTANCE.getKPIQualitativeEvalValueSet_QualitativeEvaluationValue();

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
     * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_MAPPING__META_DATA = eINSTANCE.getQualitativeMapping_MetaData();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_MAPPING__MAPPINGS = eINSTANCE.getQualitativeMapping_Mappings();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.MappingImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__EVALUATION = eINSTANCE.getMapping_Evaluation();

    /**
     * The meta object literal for the '<em><b>Qualitative Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__QUALITATIVE_EVALUATION = eINSTANCE.getMapping_QualitativeEvaluation();

    /**
     * The meta object literal for the '<em><b>Exceeds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__EXCEEDS = eINSTANCE.getMapping_Exceeds();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionGroupImpl <em>Contribution Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionGroupImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionGroup()
     * @generated
     */
    EClass CONTRIBUTION_GROUP = eINSTANCE.getContributionGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_GROUP__NAME = eINSTANCE.getContributionGroup_Name();

    /**
     * The meta object literal for the '<em><b>Contribs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_GROUP__CONTRIBS = eINSTANCE.getContributionGroup_Contribs();

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
     * The meta object literal for the '<em><b>Super Contribution Contexts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS = eINSTANCE.getContributionContext_SuperContributionContexts();

    /**
     * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CONTEXT__META_DATA = eINSTANCE.getContributionContext_MetaData();

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
     * The meta object literal for the '<em><b>Contribution</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_CHANGE__CONTRIBUTION = eINSTANCE.getContributionChange_Contribution();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.MetadataImpl <em>Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.MetadataImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getMetadata()
     * @generated
     */
    EClass METADATA = eINSTANCE.getMetadata();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA__NAME = eINSTANCE.getMetadata_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.CommentImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.Color
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

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

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.Boolean <em>Boolean</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.Boolean
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBoolean()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBoolean();

  }

} //TGRLPackage
