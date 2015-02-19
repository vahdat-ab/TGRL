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
import org.xtext.grl.tgrl.tGRL.CollapsedActorRef;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.ContributionContextGroup;
import org.xtext.grl.tgrl.tGRL.ContributionEnds;
import org.xtext.grl.tgrl.tGRL.ContributionLink;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.DecompositionEnds;
import org.xtext.grl.tgrl.tGRL.DecompositionLink;
import org.xtext.grl.tgrl.tGRL.DependencyEnds;
import org.xtext.grl.tgrl.tGRL.DependencyLink;
import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.Goal;
import org.xtext.grl.tgrl.tGRL.ImpactModel;
import org.xtext.grl.tgrl.tGRL.Indicator;
import org.xtext.grl.tgrl.tGRL.IndicatorGroup;
import org.xtext.grl.tgrl.tGRL.IntentionalElementRef;
import org.xtext.grl.tgrl.tGRL.KPIEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPIInformationConfig;
import org.xtext.grl.tgrl.tGRL.KPIInformationElement;
import org.xtext.grl.tgrl.tGRL.KPIInformationElementRef;
import org.xtext.grl.tgrl.tGRL.KPIModelLink;
import org.xtext.grl.tgrl.tGRL.KPINewEvalValue;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.QualitativeMappings;
import org.xtext.grl.tgrl.tGRL.Resource;
import org.xtext.grl.tgrl.tGRL.Softgoal;
import org.xtext.grl.tgrl.tGRL.StrategiesGroup;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.Task;

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
				if(context == grammarAccess.getBeliefRule()) {
					sequence_Belief(context, (Belief) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.COLLAPSED_ACTOR_REF:
				if(context == grammarAccess.getCollapsedActorRefRule()) {
					sequence_CollapsedActorRef(context, (CollapsedActorRef) semanticObject); 
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
				if(context == grammarAccess.getContributionContextRule()) {
					sequence_ContributionContext(context, (ContributionContext) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_CONTEXT_GROUP:
				if(context == grammarAccess.getContributionContextGroupRule()) {
					sequence_ContributionContextGroup(context, (ContributionContextGroup) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_ENDS:
				if(context == grammarAccess.getConnectionRule() ||
				   context == grammarAccess.getContributionEndsRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule()) {
					sequence_ContributionEnds(context, (ContributionEnds) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_LINK:
				if(context == grammarAccess.getContributionLinkRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_ContributionLink(context, (ContributionLink) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.CONTRIBUTION_RANGE:
				if(context == grammarAccess.getContributionRangeRule()) {
					sequence_ContributionRange(context, (ContributionRange) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DECOMPOSITION_ENDS:
				if(context == grammarAccess.getConnectionRule() ||
				   context == grammarAccess.getDecompositionEndsRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule()) {
					sequence_DecompositionEnds(context, (DecompositionEnds) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DECOMPOSITION_LINK:
				if(context == grammarAccess.getDecompositionLinkRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_DecompositionLink(context, (DecompositionLink) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DEPENDENCY_ENDS:
				if(context == grammarAccess.getConnectionRule() ||
				   context == grammarAccess.getDependencyEndsRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGRLBaseElementRule()) {
					sequence_DependencyEnds(context, (DependencyEnds) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.DEPENDENCY_LINK:
				if(context == grammarAccess.getDependencyLinkRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getElementLinkRule() ||
				   context == grammarAccess.getGRLBaseElementRule() ||
				   context == grammarAccess.getGRLElementRule()) {
					sequence_DependencyLink(context, (DependencyLink) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.EVALUATION:
				if(context == grammarAccess.getEvaluationRule()) {
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
				if(context == grammarAccess.getEvaluationStrategyRule()) {
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
			case TGRLPackage.IMPACT_MODEL:
				if(context == grammarAccess.getImpactModelRule()) {
					sequence_ImpactModel(context, (ImpactModel) semanticObject); 
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
				if(context == grammarAccess.getIndicatorGroupRule()) {
					sequence_IndicatorGroup(context, (IndicatorGroup) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.INTENTIONAL_ELEMENT_REF:
				if(context == grammarAccess.getIntentionalElementRefRule()) {
					sequence_IntentionalElementRef(context, (IntentionalElementRef) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_EVAL_VALUE_SET:
				if(context == grammarAccess.getKPIEvalValueSetRule()) {
					sequence_KPIEvalValueSet(context, (KPIEvalValueSet) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_INFORMATION_CONFIG:
				if(context == grammarAccess.getKPIInformationConfigRule()) {
					sequence_KPIInformationConfig(context, (KPIInformationConfig) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_INFORMATION_ELEMENT:
				if(context == grammarAccess.getKPIInformationElementRule()) {
					sequence_KPIInformationElement(context, (KPIInformationElement) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_INFORMATION_ELEMENT_REF:
				if(context == grammarAccess.getKPIInformationElementRefRule()) {
					sequence_KPIInformationElementRef(context, (KPIInformationElementRef) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_MODEL_LINK:
				if(context == grammarAccess.getKPIModelLinkRule()) {
					sequence_KPIModelLink(context, (KPIModelLink) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.KPI_NEW_EVAL_VALUE:
				if(context == grammarAccess.getKPINewEvalValueRule()) {
					sequence_KPINewEvalValue(context, (KPINewEvalValue) semanticObject); 
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
				if(context == grammarAccess.getQualitativeMappingRule()) {
					sequence_QualitativeMapping(context, (QualitativeMapping) semanticObject); 
					return; 
				}
				else break;
			case TGRLPackage.QUALITATIVE_MAPPINGS:
				if(context == grammarAccess.getKPIConversionRule() ||
				   context == grammarAccess.getQualitativeMappingsRule()) {
					sequence_QualitativeMappings(context, (QualitativeMappings) semanticObject); 
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
			case TGRLPackage.STRATEGIES_GROUP:
				if(context == grammarAccess.getStrategiesGroupRule()) {
					sequence_StrategiesGroup(context, (StrategiesGroup) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         importance=ImportanceType? 
	 *         importanceQuantitative=INT? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         (elemets+=IntentionalElement | elemets+=ElementLink)*
	 *     )
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? description=STRING?)
	 */
	protected void sequence_Belief(EObject context, Belief semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? description=STRING?)
	 */
	protected void sequence_CollapsedActorRef(EObject context, CollapsedActorRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID newContribution=ContributionType? newQuantitativeContribution=INT? contribRange=ContributionRange?)
	 */
	protected void sequence_ContributionChange(EObject context, ContributionChange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID contribs+=[ContributionContext|ID] contribs+=[ContributionContext|ID]*)
	 */
	protected void sequence_ContributionContextGroup(EObject context, ContributionContextGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (includedContexts+=[ContributionContext|ID] includedContexts+=[ContributionContext|ID]*)? changes+=ContributionChange*)
	 */
	protected void sequence_ContributionContext(EObject context, ContributionContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest=[IntentionalElement|QualifiedName])
	 */
	protected void sequence_ContributionEnds(EObject context, ContributionEnds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         label=STRING? 
	 *         contribution=ContributionType? 
	 *         quantitativeContribution=INT? 
	 *         correlation=BOOLEAN? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         (changes+=[ContributionChange|ID] changes+=[ContributionChange|ID]*)? 
	 *         connections+=ContributionEnds+
	 *     )
	 */
	protected void sequence_ContributionLink(EObject context, ContributionLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=INT? end=INT? step=INT?)
	 */
	protected void sequence_ContributionRange(EObject context, ContributionRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest=[IntentionalElement|QualifiedName])
	 */
	protected void sequence_DecompositionEnds(EObject context, DecompositionEnds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? label=STRING? description=STRING? fillColor=Color? connections+=DecompositionEnds+)
	 */
	protected void sequence_DecompositionLink(EObject context, DecompositionLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[IntentionalElement|QualifiedName] dest=[IntentionalElement|QualifiedName])
	 */
	protected void sequence_DependencyEnds(EObject context, DependencyEnds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? label=STRING? description=STRING? fillColor=Color? connections+=DependencyEnds+)
	 */
	protected void sequence_DependencyLink(EObject context, DependencyLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=INT? end=INT? step=INT?)
	 */
	protected void sequence_EvaluationRange(EObject context, EvaluationRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             evaluations+=Evaluation | 
	 *             (includedStrategies+=[EvaluationStrategy|ID] includedStrategies+=[EvaluationStrategy|ID]*) | 
	 *             kipInforConfig+=KPIInformationConfig
	 *         )*
	 *     )
	 */
	protected void sequence_EvaluationStrategy(EObject context, EvaluationStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         evaluation=INT? 
	 *         qualitativeEvaluation=QualitativeLabel? 
	 *         exceeds=BOOLEAN? 
	 *         evalRange=EvaluationRange? 
	 *         kpiEvalValueSet=KPIEvalValueSet? 
	 *         kpiNewEvalValue=KPINewEvalValue? 
	 *         inElement=[IntentionalElement|ID]
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
	 *         label=STRING? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         importance=ImportanceType? 
	 *         decompositionType=DecompositionType? 
	 *         importanceQuantitative=INT?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ImpactModel(EObject context, ImpactModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TGRLPackage.Literals.IMPACT_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TGRLPackage.Literals.IMPACT_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImpactModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? description=STRING? isRedesignCategory=BOOLEAN? (indicators+=[Indicator|ID] indicators+=[Indicator|ID]*)?)
	 */
	protected void sequence_IndicatorGroup(EObject context, IndicatorGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         importance=ImportanceType? 
	 *         decompositionType=DecompositionType? 
	 *         importanceQuantitative=INT? 
	 *         (refs+=[IntentionalElementRef|ID] refs+=[IntentionalElementRef|ID]*)? 
	 *         (kpiModelLinksDest+=[KPIModelLink|ID] kpiModelLinksDest+=[KPIModelLink|ID]*)? 
	 *         (groups+=[IndicatorGroup|ID] groups+=[IndicatorGroup|ID]*)?
	 *     )
	 */
	protected void sequence_Indicator(EObject context, Indicator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID criticality=Criticality? priority=Priority? def=[IntentionalElement|ID]?)
	 */
	protected void sequence_IntentionalElementRef(EObject context, IntentionalElementRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         targetValue=DOUBLE? 
	 *         thresholdValue=DOUBLE? 
	 *         worstValue=DOUBLE? 
	 *         evaluationValue=DOUBLE? 
	 *         unit=STRING? 
	 *         qualitativeEvaluationValue=STRING?
	 *     )
	 */
	protected void sequence_KPIEvalValueSet(EObject context, KPIEvalValueSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID levelOfDimension=STRING? valueOfDimension=STRING? kpiInfoElement=[KPIInformationElement|ID])
	 */
	protected void sequence_KPIInformationConfig(EObject context, KPIInformationConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? description=STRING?)
	 */
	protected void sequence_KPIInformationElementRef(EObject context, KPIInformationElementRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         description=STRING? 
	 *         (kpiModelLinksSrc+=[KPIModelLink|ID] kpiModelLinksSrc+=[KPIModelLink|ID]*)? 
	 *         (refs+=[KPIInformationElementRef|ID] refs+=[KPIInformationElementRef|ID]*)?
	 *     )
	 */
	protected void sequence_KPIInformationElement(EObject context, KPIInformationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? description=STRING?)
	 */
	protected void sequence_KPIModelLink(EObject context, KPIModelLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID evaluationValue=DOUBLE)
	 */
	protected void sequence_KPINewEvalValue(EObject context, KPINewEvalValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TGRLPackage.Literals.KPI_NEW_EVAL_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TGRLPackage.Literals.KPI_NEW_EVAL_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, TGRLPackage.Literals.KPI_NEW_EVAL_VALUE__EVALUATION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TGRLPackage.Literals.KPI_NEW_EVAL_VALUE__EVALUATION_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKPINewEvalValueAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKPINewEvalValueAccess().getEvaluationValueDOUBLETerminalRuleCall_5_0(), semanticObject.getEvaluationValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     gRLspecs+=GRLSpecification*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID realWorldLabel=STRING? evaluation=INT? qualitativeEvaluation=QualitativeLabel? exceeds=BOOLEAN?)
	 */
	protected void sequence_QualitativeMapping(EObject context, QualitativeMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (kpiEvalValueSet+=[KPIEvalValueSet|ID] kpiEvalValueSet+=[KPIEvalValueSet|ID]*)* mappin+=QualitativeMapping*)
	 */
	protected void sequence_QualitativeMappings(EObject context, QualitativeMappings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         importance=ImportanceType? 
	 *         decompositionType=DecompositionType? 
	 *         importanceQuantitative=INT?
	 *     )
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         importance=ImportanceType? 
	 *         decompositionType=DecompositionType? 
	 *         importanceQuantitative=INT?
	 *     )
	 */
	protected void sequence_Softgoal(EObject context, Softgoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (strategies+=[EvaluationStrategy|ID] strategies+=[EvaluationStrategy|ID]*)*)
	 */
	protected void sequence_StrategiesGroup(EObject context, StrategiesGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         description=STRING? 
	 *         fillColor=Color? 
	 *         importance=ImportanceType? 
	 *         decompositionType=DecompositionType? 
	 *         importanceQuantitative=INT?
	 *     )
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
