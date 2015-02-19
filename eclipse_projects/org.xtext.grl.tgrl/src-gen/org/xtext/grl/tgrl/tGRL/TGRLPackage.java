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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT__NAME = GRL_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT__LABEL = GRL_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT__DESCRIPTION = GRL_BASE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT__FILL_COLOR = GRL_BASE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>GRL Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRL_ELEMENT_FEATURE_COUNT = GRL_BASE_ELEMENT_FEATURE_COUNT + 4;

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
  int INTENTIONAL_ELEMENT__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__NAME = GRL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__LABEL = GRL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DESCRIPTION = GRL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__FILL_COLOR = GRL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 3;

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
  int ELEMENT_LINK__ID = GRL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__NAME = GRL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__LABEL = GRL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__DESCRIPTION = GRL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK__FILL_COLOR = GRL_ELEMENT__FILL_COLOR;

  /**
   * The number of structural features of the '<em>Element Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LINK_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 0;

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
  int ACTOR__NAME = GRL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__LABEL = GRL_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = GRL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__FILL_COLOR = GRL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE = GRL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPORTANCE_QUANTITATIVE = GRL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elemets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ELEMETS = GRL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = GRL_ELEMENT_FEATURE_COUNT + 3;

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
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

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
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

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
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

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
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

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
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__FILL_COLOR = INTENTIONAL_ELEMENT__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__IMPORTANCE = INTENTIONAL_ELEMENT__IMPORTANCE;

  /**
   * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__DECOMPOSITION_TYPE = INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

  /**
   * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__IMPORTANCE_QUANTITATIVE = INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__REFS = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kpi Model Links Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__KPI_MODEL_LINKS_DEST = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR__GROUPS = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__ID = GRL_BASE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SRC = GRL_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__DEST = GRL_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = GRL_BASE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionLinkImpl <em>Decomposition Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionLink()
   * @generated
   */
  int DECOMPOSITION_LINK = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__FILL_COLOR = ELEMENT_LINK__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK__CONNECTIONS = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decomposition Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_LINK_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionEndsImpl <em>Decomposition Ends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionEndsImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionEnds()
   * @generated
   */
  int DECOMPOSITION_ENDS = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_ENDS__ID = CONNECTION__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_ENDS__SRC = CONNECTION__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_ENDS__DEST = CONNECTION__DEST;

  /**
   * The number of structural features of the '<em>Decomposition Ends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_ENDS_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionLink()
   * @generated
   */
  int CONTRIBUTION_LINK = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__FILL_COLOR = ELEMENT_LINK__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Correlation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__CORRELATION = ELEMENT_LINK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Changes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__CHANGES = ELEMENT_LINK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK__CONNECTIONS = ELEMENT_LINK_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Contribution Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_LINK_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndsImpl <em>Contribution Ends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionEndsImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionEnds()
   * @generated
   */
  int CONTRIBUTION_ENDS = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_ENDS__ID = CONNECTION__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_ENDS__SRC = CONNECTION__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_ENDS__DEST = CONNECTION__DEST;

  /**
   * The number of structural features of the '<em>Contribution Ends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_ENDS_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DependencyLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyLink()
   * @generated
   */
  int DEPENDENCY_LINK = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__ID = ELEMENT_LINK__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__NAME = ELEMENT_LINK__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__LABEL = ELEMENT_LINK__LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__DESCRIPTION = ELEMENT_LINK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fill Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__FILL_COLOR = ELEMENT_LINK__FILL_COLOR;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK__CONNECTIONS = ELEMENT_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dependency Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_LINK_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyEndsImpl <em>Dependency Ends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.DependencyEndsImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyEnds()
   * @generated
   */
  int DEPENDENCY_ENDS = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_ENDS__ID = CONNECTION__ID;

  /**
   * The feature id for the '<em><b>Src</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_ENDS__SRC = CONNECTION__SRC;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_ENDS__DEST = CONNECTION__DEST;

  /**
   * The number of structural features of the '<em>Dependency Ends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_ENDS_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl <em>KPI Conversion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIConversionImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIConversion()
   * @generated
   */
  int KPI_CONVERSION = 20;

  /**
   * The number of structural features of the '<em>KPI Conversion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_CONVERSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
   * @generated
   */
  int BELIEF = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Belief</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl <em>Collapsed Actor Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.CollapsedActorRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCollapsedActorRef()
   * @generated
   */
  int COLLAPSED_ACTOR_REF = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Collapsed Actor Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLAPSED_ACTOR_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl <em>Intentional Element Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIntentionalElementRef()
   * @generated
   */
  int INTENTIONAL_ELEMENT_REF = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__NAME = 0;

  /**
   * The feature id for the '<em><b>Criticality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__CRITICALITY = 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__PRIORITY = 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF__DEF = 3;

  /**
   * The number of structural features of the '<em>Intentional Element Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_REF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl <em>Impact Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ImpactModelImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImpactModel()
   * @generated
   */
  int IMPACT_MODEL = 24;

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
  int STRATEGIES_GROUP = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP__STRATEGIES = 1;

  /**
   * The number of structural features of the '<em>Strategies Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGIES_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationStrategyImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluationStrategy()
   * @generated
   */
  int EVALUATION_STRATEGY = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__EVALUATIONS = 1;

  /**
   * The feature id for the '<em><b>Included Strategies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__INCLUDED_STRATEGIES = 2;

  /**
   * The feature id for the '<em><b>Kip Infor Config</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY__KIP_INFOR_CONFIG = 3;

  /**
   * The number of structural features of the '<em>Evaluation Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_STRATEGY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 27;

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
  int EVALUATION_RANGE = 28;

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
  int CONTRIBUTION_CONTEXT_GROUP = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Contribs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP__CONTRIBS = 1;

  /**
   * The number of structural features of the '<em>Contribution Context Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl <em>Contribution Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionContext()
   * @generated
   */
  int CONTRIBUTION_CONTEXT = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__NAME = 0;

  /**
   * The feature id for the '<em><b>Included Contexts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS = 1;

  /**
   * The feature id for the '<em><b>Changes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT__CHANGES = 2;

  /**
   * The number of structural features of the '<em>Contribution Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTION_CONTEXT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl <em>Contribution Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionChange()
   * @generated
   */
  int CONTRIBUTION_CHANGE = 31;

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
  int CONTRIBUTION_RANGE = 32;

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
  int QUALITATIVE_MAPPINGS = 33;

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
  int KPI_EVAL_VALUE_SET = 34;

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
  int QUALITATIVE_MAPPING = 35;

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
  int KPI_NEW_EVAL_VALUE = 36;

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
  int KPI_INFORMATION_CONFIG = 37;

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
  int KPI_INFORMATION_ELEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Kpi Model Links Src</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC = 3;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT__REFS = 4;

  /**
   * The number of structural features of the '<em>KPI Information Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl <em>KPI Information Element Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementRefImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIInformationElementRef()
   * @generated
   */
  int KPI_INFORMATION_ELEMENT_REF = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>KPI Information Element Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_INFORMATION_ELEMENT_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl <em>KPI Model Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.KPIModelLinkImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getKPIModelLink()
   * @generated
   */
  int KPI_MODEL_LINK = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>KPI Model Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KPI_MODEL_LINK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl <em>Indicator Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.impl.IndicatorGroupImpl
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getIndicatorGroup()
   * @generated
   */
  int INDICATOR_GROUP = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__LABEL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Is Redesign Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__IS_REDESIGN_CATEGORY = 3;

  /**
   * The feature id for the '<em><b>Indicators</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP__INDICATORS = 4;

  /**
   * The number of structural features of the '<em>Indicator Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICATOR_GROUP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ImportanceType <em>Importance Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ImportanceType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getImportanceType()
   * @generated
   */
  int IMPORTANCE_TYPE = 42;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.DecompositionType <em>Decomposition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.DecompositionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionType()
   * @generated
   */
  int DECOMPOSITION_TYPE = 43;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.ContributionType <em>Contribution Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.ContributionType
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionType()
   * @generated
   */
  int CONTRIBUTION_TYPE = 44;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.QualitativeLabel <em>Qualitative Label</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.QualitativeLabel
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getQualitativeLabel()
   * @generated
   */
  int QUALITATIVE_LABEL = 45;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Color
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 46;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Criticality <em>Criticality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Criticality
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getCriticality()
   * @generated
   */
  int CRITICALITY = 47;

  /**
   * The meta object id for the '{@link org.xtext.grl.tgrl.tGRL.Priority <em>Priority</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.grl.tgrl.tGRL.Priority
   * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 48;


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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement#getName()
   * @see #getGRLElement()
   * @generated
   */
  EAttribute getGRLElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement#getLabel()
   * @see #getGRLElement()
   * @generated
   */
  EAttribute getGRLElement_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement#getDescription()
   * @see #getGRLElement()
   * @generated
   */
  EAttribute getGRLElement_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.GRLElement#getFillColor <em>Fill Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fill Color</em>'.
   * @see org.xtext.grl.tgrl.tGRL.GRLElement#getFillColor()
   * @see #getGRLElement()
   * @generated
   */
  EAttribute getGRLElement_FillColor();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ElementLink <em>Element Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ElementLink
   * @generated
   */
  EClass getElementLink();

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
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.Indicator#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Indicator#getRefs()
   * @see #getIndicator()
   * @generated
   */
  EReference getIndicator_Refs();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Connection
   * @generated
   */
  EClass getConnection();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.Connection#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Connection#getSrc()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Src();

  /**
   * Returns the meta object for the reference '{@link org.xtext.grl.tgrl.tGRL.Connection#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Connection#getDest()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DecompositionLink <em>Decomposition Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionLink
   * @generated
   */
  EClass getDecompositionLink();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.DecompositionLink#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionLink#getConnections()
   * @see #getDecompositionLink()
   * @generated
   */
  EReference getDecompositionLink_Connections();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DecompositionEnds <em>Decomposition Ends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition Ends</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DecompositionEnds
   * @generated
   */
  EClass getDecompositionEnds();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionLink <em>Contribution Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink
   * @generated
   */
  EClass getContributionLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getContribution <em>Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink#getContribution()
   * @see #getContributionLink()
   * @generated
   */
  EAttribute getContributionLink_Contribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getQuantitativeContribution <em>Quantitative Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantitative Contribution</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink#getQuantitativeContribution()
   * @see #getContributionLink()
   * @generated
   */
  EAttribute getContributionLink_QuantitativeContribution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getCorrelation <em>Correlation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Correlation</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink#getCorrelation()
   * @see #getContributionLink()
   * @generated
   */
  EAttribute getContributionLink_Correlation();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getChanges <em>Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Changes</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink#getChanges()
   * @see #getContributionLink()
   * @generated
   */
  EReference getContributionLink_Changes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.ContributionLink#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionLink#getConnections()
   * @see #getContributionLink()
   * @generated
   */
  EReference getContributionLink_Connections();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.ContributionEnds <em>Contribution Ends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contribution Ends</em>'.
   * @see org.xtext.grl.tgrl.tGRL.ContributionEnds
   * @generated
   */
  EClass getContributionEnds();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DependencyLink <em>Dependency Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Link</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DependencyLink
   * @generated
   */
  EClass getDependencyLink();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.grl.tgrl.tGRL.DependencyLink#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DependencyLink#getConnections()
   * @see #getDependencyLink()
   * @generated
   */
  EReference getDependencyLink_Connections();

  /**
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.DependencyEnds <em>Dependency Ends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Ends</em>'.
   * @see org.xtext.grl.tgrl.tGRL.DependencyEnds
   * @generated
   */
  EClass getDependencyEnds();

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
   * Returns the meta object for class '{@link org.xtext.grl.tgrl.tGRL.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief
   * @generated
   */
  EClass getBelief();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.Belief#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.Belief#getName()
   * @see #getBelief()
   * @generated
   */
  EAttribute getBelief_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.CollapsedActorRef#getName()
   * @see #getCollapsedActorRef()
   * @generated
   */
  EAttribute getCollapsedActorRef_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.IntentionalElementRef#getName()
   * @see #getIntentionalElementRef()
   * @generated
   */
  EAttribute getIntentionalElementRef_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.grl.tgrl.tGRL.KPIInformationElementRef#getName()
   * @see #getKPIInformationElementRef()
   * @generated
   */
  EAttribute getKPIInformationElementRef_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_ELEMENT__NAME = eINSTANCE.getGRLElement_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_ELEMENT__LABEL = eINSTANCE.getGRLElement_Label();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_ELEMENT__DESCRIPTION = eINSTANCE.getGRLElement_Description();

    /**
     * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRL_ELEMENT__FILL_COLOR = eINSTANCE.getGRLElement_FillColor();

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
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__IMPORTANCE = eINSTANCE.getIntentionalElement_Importance();

    /**
     * The meta object literal for the '<em><b>Decomposition Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = eINSTANCE.getIntentionalElement_DecompositionType();

    /**
     * The meta object literal for the '<em><b>Importance Quantitative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = eINSTANCE.getIntentionalElement_ImportanceQuantitative();

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
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDICATOR__REFS = eINSTANCE.getIndicator_Refs();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getConnection()
     * @generated
     */
    EClass CONNECTION = eINSTANCE.getConnection();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__SRC = eINSTANCE.getConnection_Src();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__DEST = eINSTANCE.getConnection_Dest();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionLinkImpl <em>Decomposition Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionLink()
     * @generated
     */
    EClass DECOMPOSITION_LINK = eINSTANCE.getDecompositionLink();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION_LINK__CONNECTIONS = eINSTANCE.getDecompositionLink_Connections();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DecompositionEndsImpl <em>Decomposition Ends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DecompositionEndsImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDecompositionEnds()
     * @generated
     */
    EClass DECOMPOSITION_ENDS = eINSTANCE.getDecompositionEnds();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionLink()
     * @generated
     */
    EClass CONTRIBUTION_LINK = eINSTANCE.getContributionLink();

    /**
     * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_LINK__CONTRIBUTION = eINSTANCE.getContributionLink_Contribution();

    /**
     * The meta object literal for the '<em><b>Quantitative Contribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION = eINSTANCE.getContributionLink_QuantitativeContribution();

    /**
     * The meta object literal for the '<em><b>Correlation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTION_LINK__CORRELATION = eINSTANCE.getContributionLink_Correlation();

    /**
     * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_LINK__CHANGES = eINSTANCE.getContributionLink_Changes();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTION_LINK__CONNECTIONS = eINSTANCE.getContributionLink_Connections();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndsImpl <em>Contribution Ends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.ContributionEndsImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getContributionEnds()
     * @generated
     */
    EClass CONTRIBUTION_ENDS = eINSTANCE.getContributionEnds();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DependencyLinkImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyLink()
     * @generated
     */
    EClass DEPENDENCY_LINK = eINSTANCE.getDependencyLink();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_LINK__CONNECTIONS = eINSTANCE.getDependencyLink_Connections();

    /**
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.DependencyEndsImpl <em>Dependency Ends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.DependencyEndsImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getDependencyEnds()
     * @generated
     */
    EClass DEPENDENCY_ENDS = eINSTANCE.getDependencyEnds();

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
     * The meta object literal for the '{@link org.xtext.grl.tgrl.tGRL.impl.BeliefImpl <em>Belief</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.grl.tgrl.tGRL.impl.BeliefImpl
     * @see org.xtext.grl.tgrl.tGRL.impl.TGRLPackageImpl#getBelief()
     * @generated
     */
    EClass BELIEF = eINSTANCE.getBelief();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELIEF__NAME = eINSTANCE.getBelief_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLAPSED_ACTOR_REF__NAME = eINSTANCE.getCollapsedActorRef_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT_REF__NAME = eINSTANCE.getIntentionalElementRef_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KPI_INFORMATION_ELEMENT_REF__NAME = eINSTANCE.getKPIInformationElementRef_Name();

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

  }

} //TGRLPackage
