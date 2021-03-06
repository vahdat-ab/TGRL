/**
 */
package org.xtext.grl.tgrl.tGRL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage
 * @generated
 */
public interface TGRLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TGRLFactory eINSTANCE = org.xtext.grl.tgrl.tGRL.impl.TGRLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>GRL Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GRL Base Element</em>'.
   * @generated
   */
  GRLBaseElement createGRLBaseElement();

  /**
   * Returns a new object of class '<em>GRL Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GRL Element</em>'.
   * @generated
   */
  GRLElement createGRLElement();

  /**
   * Returns a new object of class '<em>Super Intentional Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super Intentional Element</em>'.
   * @generated
   */
  SuperIntentionalElement createSuperIntentionalElement();

  /**
   * Returns a new object of class '<em>Intentional Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intentional Element</em>'.
   * @generated
   */
  IntentionalElement createIntentionalElement();

  /**
   * Returns a new object of class '<em>GRL Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GRL Specification</em>'.
   * @generated
   */
  GRLSpecification createGRLSpecification();

  /**
   * Returns a new object of class '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor</em>'.
   * @generated
   */
  Actor createActor();

  /**
   * Returns a new object of class '<em>Softgoal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Softgoal</em>'.
   * @generated
   */
  Softgoal createSoftgoal();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Indicator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indicator</em>'.
   * @generated
   */
  Indicator createIndicator();

  /**
   * Returns a new object of class '<em>Belief</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belief</em>'.
   * @generated
   */
  Belief createBelief();

  /**
   * Returns a new object of class '<em>Element Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Link</em>'.
   * @generated
   */
  ElementLink createElementLink();

  /**
   * Returns a new object of class '<em>End Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Link</em>'.
   * @generated
   */
  EndLink createEndLink();

  /**
   * Returns a new object of class '<em>Normal Element Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Element Link</em>'.
   * @generated
   */
  NormalElementLink createNormalElementLink();

  /**
   * Returns a new object of class '<em>Normal Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Link</em>'.
   * @generated
   */
  NormalLink createNormalLink();

  /**
   * Returns a new object of class '<em>Normal Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Dependency</em>'.
   * @generated
   */
  NormalDependency createNormalDependency();

  /**
   * Returns a new object of class '<em>Normal Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Contribution</em>'.
   * @generated
   */
  NormalContribution createNormalContribution();

  /**
   * Returns a new object of class '<em>Normal Decomposition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Decomposition</em>'.
   * @generated
   */
  NormalDecomposition createNormalDecomposition();

  /**
   * Returns a new object of class '<em>In Line Element Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Line Element Link</em>'.
   * @generated
   */
  InLineElementLink createInLineElementLink();

  /**
   * Returns a new object of class '<em>In Line Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Line Link</em>'.
   * @generated
   */
  InLineLink createInLineLink();

  /**
   * Returns a new object of class '<em>In Line Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Line Dependency</em>'.
   * @generated
   */
  InLineDependency createInLineDependency();

  /**
   * Returns a new object of class '<em>In Line Contribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Line Contribution</em>'.
   * @generated
   */
  InLineContribution createInLineContribution();

  /**
   * Returns a new object of class '<em>In Line Decomposition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Line Decomposition</em>'.
   * @generated
   */
  InLineDecomposition createInLineDecomposition();

  /**
   * Returns a new object of class '<em>Decomposition End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decomposition End</em>'.
   * @generated
   */
  DecompositionEnd createDecompositionEnd();

  /**
   * Returns a new object of class '<em>Contribution End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution End</em>'.
   * @generated
   */
  ContributionEnd createContributionEnd();

  /**
   * Returns a new object of class '<em>Dependency End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency End</em>'.
   * @generated
   */
  DependencyEnd createDependencyEnd();

  /**
   * Returns a new object of class '<em>Link Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Type</em>'.
   * @generated
   */
  LinkType createLinkType();

  /**
   * Returns a new object of class '<em>Strategy Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strategy Group</em>'.
   * @generated
   */
  StrategyGroup createStrategyGroup();

  /**
   * Returns a new object of class '<em>Evaluation Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Strategy</em>'.
   * @generated
   */
  EvaluationStrategy createEvaluationStrategy();

  /**
   * Returns a new object of class '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation</em>'.
   * @generated
   */
  Evaluation createEvaluation();

  /**
   * Returns a new object of class '<em>Evaluation Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Range</em>'.
   * @generated
   */
  EvaluationRange createEvaluationRange();

  /**
   * Returns a new object of class '<em>KPI Eval Value Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KPI Eval Value Set</em>'.
   * @generated
   */
  KPIEvalValueSet createKPIEvalValueSet();

  /**
   * Returns a new object of class '<em>KPI Quantitative Eval Value Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KPI Quantitative Eval Value Set</em>'.
   * @generated
   */
  KPIQuantitativeEvalValueSet createKPIQuantitativeEvalValueSet();

  /**
   * Returns a new object of class '<em>KPI Qualitative Eval Value Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KPI Qualitative Eval Value Set</em>'.
   * @generated
   */
  KPIQualitativeEvalValueSet createKPIQualitativeEvalValueSet();

  /**
   * Returns a new object of class '<em>Qualitative Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualitative Mapping</em>'.
   * @generated
   */
  QualitativeMapping createQualitativeMapping();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Contribution Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution Group</em>'.
   * @generated
   */
  ContributionGroup createContributionGroup();

  /**
   * Returns a new object of class '<em>Contribution Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution Context</em>'.
   * @generated
   */
  ContributionContext createContributionContext();

  /**
   * Returns a new object of class '<em>Contribution Change</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution Change</em>'.
   * @generated
   */
  ContributionChange createContributionChange();

  /**
   * Returns a new object of class '<em>Contribution Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contribution Range</em>'.
   * @generated
   */
  ContributionRange createContributionRange();

  /**
   * Returns a new object of class '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata</em>'.
   * @generated
   */
  Metadata createMetadata();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Indicator Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indicator Group</em>'.
   * @generated
   */
  IndicatorGroup createIndicatorGroup();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TGRLPackage getTGRLPackage();

} //TGRLFactory
