package org.xtext.grl.tgrl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;
import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.Belief;
import org.xtext.grl.tgrl.tGRL.Comment;
import org.xtext.grl.tgrl.tGRL.Contribution;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionGroup;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.Decomposition;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.Dependency;
import org.xtext.grl.tgrl.tGRL.DependencyEnd;
import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.Goal;
import org.xtext.grl.tgrl.tGRL.InLineContribution;
import org.xtext.grl.tgrl.tGRL.InLineDecomposition;
import org.xtext.grl.tgrl.tGRL.InLineDependency;
import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.KPIQualitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPIQuantitativeEvalValueSet;
import org.xtext.grl.tgrl.tGRL.Link;
import org.xtext.grl.tgrl.tGRL.LinkType;
import org.xtext.grl.tgrl.tGRL.Mapping;
import org.xtext.grl.tgrl.tGRL.Metadata;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.Resource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategyGroup;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.Task;
import org.xtext.grl.tgrl.tGRL.inLineLink;

@SuppressWarnings("all")
public class TGRLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TGRLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TGRLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TGRLPackage.ACTOR:
				if(context == grammarAccess.getActorRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.BELIEF:
				if(context == grammarAccess.getBeliefRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIntentionalElementRule()) {
					sequence_Belief(context, (Belief) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION:
				if(context == grammarAccess.getContributionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Contribution(context, (Contribution) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_CHANGE:
				if(context == grammarAccess.getContributionChangeRule()) {
					sequence_ContributionChange(context, (ContributionChange) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_CONTEXT:
				if(context == grammarAccess.getContributionContextRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_ContributionContext(context, (ContributionContext) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_END:
				if(context == grammarAccess.getContributionEndRule()) {
					sequence_ContributionEnd(context, (ContributionEnd) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_GROUP:
				if(context == grammarAccess.getContributionGroupRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_ContributionGroup(context, (ContributionGroup) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_RANGE:
				if(context == grammarAccess.getContributionRangeRule()) {
					sequence_ContributionRange(context, (ContributionRange) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DECOMPOSITION:
				if(context == grammarAccess.getDecompositionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Decomposition(context, (Decomposition) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DECOMPOSITION_END:
				if(context == grammarAccess.getDecompositionEndRule()) {
					sequence_DecompositionEnd(context, (DecompositionEnd) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DEPENDENCY:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Dependency(context, (Dependency) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DEPENDENCY_END:
				if(context == grammarAccess.getDependencyEndRule()) {
					sequence_DependencyEnd(context, (DependencyEnd) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.EVALUATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEvaluationRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_Evaluation(context, (Evaluation) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.EVALUATION_RANGE:
				if(context == grammarAccess.getEvaluationRangeRule()) {
					sequence_EvaluationRange(context, (EvaluationRange) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.EVALUATION_STRATEGY:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEvaluationStrategyRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_EvaluationStrategy(context, (EvaluationStrategy) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.GRL_SPECIFICATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLSpecificationRule()) {
					sequence_GRLSpecification(context, (GRLSpecification) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.GOAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getIntentionalElementRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.IN_LINE_CONTRIBUTION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getInLineContributionRule() ||
				   context == grammarAccess.getInLineElementLinkRule()) {
					sequence_InLineContribution(context, (InLineContribution) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.IN_LINE_DECOMPOSITION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getInLineDecompositionRule() ||
				   context == grammarAccess.getInLineElementLinkRule()) {
					sequence_InLineDecomposition(context, (InLineDecomposition) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.IN_LINE_DEPENDENCY:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getInLineDependencyRule() ||
				   context == grammarAccess.getInLineElementLinkRule()) {
					sequence_InLineDependency(context, (InLineDependency) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.INDICATOR:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIndicatorRule() ||
				   context == grammarAccess.getIntentionalElementRule()) {
					sequence_Indicator(context, (Indicator) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.INDICATOR_GROUP:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIndicatorGroupRule()) {
					sequence_IndicatorGroup(context, (IndicatorGroup) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_QUALITATIVE_EVAL_VALUE_SET:
				if(context == grammarAccess.getKPIEvalValueSetRule() ||
				   context == grammarAccess.getKPIQualitativeEvalValueSetRule()) {
					sequence_KPIQualitativeEvalValueSet(context, (KPIQualitativeEvalValueSet) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_QUANTITATIVE_EVAL_VALUE_SET:
				if(context == grammarAccess.getKPIEvalValueSetRule() ||
				   context == grammarAccess.getKPIQuantitativeEvalValueSetRule()) {
					sequence_KPIQuantitativeEvalValueSet(context, (KPIQuantitativeEvalValueSet) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.LINK:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.LINK_TYPE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getLinkTypeRule()) {
					sequence_LinkType(context, (LinkType) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.MAPPING:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.METADATA:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getMetadataRule()) {
					sequence_Metadata(context, (Metadata) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.QUALITATIVE_MAPPING:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getQualitativeMappingRule()) {
					sequence_QualitativeMapping(context, (QualitativeMapping) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.RESOURCE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIntentionalElementRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.SOFTGOAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIntentionalElementRule() ||
				   context == grammarAccess.getSoftgoalRule()) {
					sequence_Softgoal(context, (Softgoal) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.STRATEGY_GROUP:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getStrategyGroupRule()) {
					sequence_StrategyGroup(context, (StrategyGroup) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.TASK:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule() ||
				   context == grammarAccess.getIntentionalElementRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.IN_LINE_LINK:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getInLineElementLinkRule() ||
				   context == grammarAccess.getInLineLinkRule()) {
					sequence_inLineLink(context, (inLineLink) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             metaData+=Metadata* 
	 *             (elemets+=IntentionalElement | elemets+=ElementLink)*
	 *         )?
	 *     )
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (label=STRING? metaData+=Metadata* description=STRING?)?)
	 */
	protected void sequence_Belief(EObject context, Belief semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         contribution=[ContributionEnd|QualifiedName] 
	 *         (newContribution=ContributionType | newQuantitativeContribution=INT) 
	 *         contribRange=ContributionRange?
	 *     )
	 */
	protected void sequence_ContributionChange(EObject context, ContributionChange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superContributionContexts+=[ContributionContext|QualifiedName] superContributionContexts+=[ContributionContext|QualifiedName]*)? 
	 *         metaData+=Metadata* 
	 *         changes+=ContributionChange*
	 *     )
	 */
	protected void sequence_ContributionContext(EObject context, ContributionContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? desname=[IntentionalElement|QualifiedName] (contribution=ContributionType | quantitativeContribution=INT)?)
	 */
	protected void sequence_ContributionEnd(EObject context, ContributionEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID contribs+=[ContributionContext|ID] contribs+=[ContributionContext|ID]*)
	 */
	protected void sequence_ContributionGroup(EObject context, ContributionGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=INT end=INT step=INT?)
	 */
	protected void sequence_ContributionRange(EObject context, ContributionRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest+=ContributionEnd dest+=ContributionEnd*)
	 */
	protected void sequence_Contribution(EObject context, Contribution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[IntentionalElement|QualifiedName] description=STRING?)
	 */
	protected void sequence_DecompositionEnd(EObject context, DecompositionEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest+=DecompositionEnd dest+=DecompositionEnd*)
	 */
	protected void sequence_Decomposition(EObject context, Decomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[IntentionalElement|QualifiedName] description=STRING?)
	 */
	protected void sequence_DependencyEnd(EObject context, DependencyEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest+=DependencyEnd dest+=DependencyEnd*)
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=INT end=INT step=INT)
	 */
	protected void sequence_EvaluationRange(EObject context, EvaluationRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superStrategies+=[EvaluationStrategy|QualifiedName] superStrategies+=[EvaluationStrategy|QualifiedName]*)? 
	 *         metaData+=Metadata* 
	 *         evaluations+=Evaluation*
	 *     )
	 */
	protected void sequence_EvaluationStrategy(EObject context, EvaluationStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         intentionalElement=[IntentionalElement|QualifiedName] 
	 *         (qualitativeEvaluation=QualitativeLabel | evaluation=INT) 
	 *         (exceeds?='exceeds'? evalRange=EvaluationRange? kpiEvalValueSet=KPIEvalValueSet?)?
	 *     )
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? grlElements+=GRLElement*)
	 */
	protected void sequence_GRLSpecification(EObject context, GRLSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             decompositionType=DecompositionType? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             metaData+=Metadata* 
	 *             elementLinks+=InLineElementLink*
	 *         )?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dest+=ContributionEnd dest+=ContributionEnd*)
	 */
	protected void sequence_InLineContribution(EObject context, InLineContribution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dest+=DecompositionEnd dest+=DecompositionEnd*)
	 */
	protected void sequence_InLineDecomposition(EObject context, InLineDecomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dest+=DependencyEnd dest+=DependencyEnd*)
	 */
	protected void sequence_InLineDependency(EObject context, InLineDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID indicators+=[Indicator|QualifiedName] indicators+=[Indicator|QualifiedName]*)
	 */
	protected void sequence_IndicatorGroup(EObject context, IndicatorGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             decompositionType=DecompositionType? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             metaData+=Metadata* 
	 *             elementLinks+=InLineElementLink*
	 *         )?
	 *     )
	 */
	protected void sequence_Indicator(EObject context, Indicator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualitativeEvaluationValue=[Mapping|QualifiedName]
	 */
	protected void sequence_KPIQualitativeEvalValueSet(EObject context, KPIQualitativeEvalValueSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TGRLPackage.Literals.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TGRLPackage.Literals.KPI_QUALITATIVE_EVAL_VALUE_SET__QUALITATIVE_EVALUATION_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingQualifiedNameParserRuleCall_2_0_1(), semanticObject.getQualitativeEvaluationValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (targetValue=DOUBLE thresholdValue=DOUBLE worstValue=DOUBLE evaluationValue=DOUBLE unit=STRING)
	 */
	protected void sequence_KPIQuantitativeEvalValueSet(EObject context, KPIQuantitativeEvalValueSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_LinkType(EObject context, LinkType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[GRLElement|QualifiedName] type=[LinkType|QualifiedName] des+=[GRLElement|QualifiedName] des+=[GRLElement|QualifiedName]*)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING valuation=INT qualitativeEvaluation=QualitativeLabel exceeds=BOOLEAN)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_Metadata(EObject context, Metadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     gRLspecifications+=GRLSpecification*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID metaData+=Metadata* mappin+=Mapping*)
	 */
	protected void sequence_QualitativeMapping(EObject context, QualitativeMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             decompositionType=DecompositionType? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             metaData+=Metadata* 
	 *             elementLinks+=InLineElementLink*
	 *         )?
	 *     )
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             decompositionType=DecompositionType? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             metaData+=Metadata* 
	 *             elementLinks+=InLineElementLink*
	 *         )?
	 *     )
	 */
	protected void sequence_Softgoal(EObject context, Softgoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID strategies+=[EvaluationStrategy|QualifiedName] strategies+=[EvaluationStrategy|QualifiedName]*)
	 */
	protected void sequence_StrategyGroup(EObject context, StrategyGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             label=STRING? 
	 *             description=STRING? 
	 *             fillColor=Color? 
	 *             decompositionType=DecompositionType? 
	 *             (importance=ImportanceType | importanceQuantitative=INT)? 
	 *             metaData+=Metadata* 
	 *             elementLinks+=InLineElementLink*
	 *         )?
	 *     )
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[LinkType|QualifiedName] des+=[GRLElement|QualifiedName] des+=[GRLElement|QualifiedName]*)
	 */
	protected void sequence_inLineLink(EObject context, inLineLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
