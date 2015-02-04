package org.xtext.grl.tgrl.serializer;

import asd.ASDspec;
import asd.AsdPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import grl.Actor;
import grl.Belief;
import grl.CollapsedActorRef;
import grl.Contribution;
import grl.ContributionContext;
import grl.ContributionContextGroup;
import grl.Decomposition;
import grl.Dependency;
import grl.EvaluationStrategy;
import grl.GRLspec;
import grl.GrlPackage;
import grl.ImpactModel;
import grl.IntentionalElement;
import grl.IntentionalElementRef;
import grl.StrategiesGroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;
import urn.URNspec;
import urn.UrnPackage;
import urncore.Metadata;
import urncore.URNdefinition;
import urncore.UrncorePackage;

@SuppressWarnings("all")
public class TGRLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TGRLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AsdPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AsdPackage.AS_DSPEC:
				if(context == grammarAccess.getASDspecRule()) {
					sequence_ASDspec(context, (ASDspec) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GrlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GrlPackage.ACTOR:
				if(context == grammarAccess.getActorRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.BELIEF:
				if(context == grammarAccess.getBeliefRule()) {
					sequence_Belief(context, (Belief) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.COLLAPSED_ACTOR_REF:
				if(context == grammarAccess.getCollapsedActorRefRule()) {
					sequence_CollapsedActorRef(context, (CollapsedActorRef) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.CONTRIBUTION:
				if(context == grammarAccess.getContributionRule() ||
				   context == grammarAccess.getElementLinkRule()) {
					sequence_Contribution(context, (Contribution) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.CONTRIBUTION_CONTEXT:
				if(context == grammarAccess.getContributionContextRule()) {
					sequence_ContributionContext(context, (ContributionContext) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.CONTRIBUTION_CONTEXT_GROUP:
				if(context == grammarAccess.getContributionContextGroupRule()) {
					sequence_ContributionContextGroup(context, (ContributionContextGroup) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.DECOMPOSITION:
				if(context == grammarAccess.getDecompositionRule() ||
				   context == grammarAccess.getElementLinkRule()) {
					sequence_Decomposition(context, (Decomposition) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.DEPENDENCY:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getElementLinkRule()) {
					sequence_Dependency(context, (Dependency) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.EVALUATION_STRATEGY:
				if(context == grammarAccess.getEvaluationStrategyRule()) {
					sequence_EvaluationStrategy(context, (EvaluationStrategy) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.GR_LSPEC:
				if(context == grammarAccess.getGRLspecRule()) {
					sequence_GRLspec(context, (GRLspec) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.IMPACT_MODEL:
				if(context == grammarAccess.getImpactModelRule()) {
					sequence_ImpactModel(context, (ImpactModel) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.INTENTIONAL_ELEMENT:
				if(context == grammarAccess.getIntentionalElementRule()) {
					sequence_IntentionalElement(context, (IntentionalElement) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.INTENTIONAL_ELEMENT_REF:
				if(context == grammarAccess.getIntentionalElementRefRule()) {
					sequence_IntentionalElementRef(context, (IntentionalElementRef) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.STRATEGIES_GROUP:
				if(context == grammarAccess.getStrategiesGroupRule()) {
					sequence_StrategiesGroup(context, (StrategiesGroup) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UrnPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UrnPackage.UR_NSPEC:
				if(context == grammarAccess.getURNspecRule()) {
					sequence_URNspec(context, (URNspec) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UrncorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UrncorePackage.METADATA:
				if(context == grammarAccess.getMetadataRule()) {
					sequence_Metadata(context, (Metadata) semanticObject); 
					return; 
				}
				else break;
			case UrncorePackage.UR_NDEFINITION:
				if(context == grammarAccess.getURNdefinitionRule()) {
					sequence_URNdefinition(context, (URNdefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {ASDspec}
	 */
	protected void sequence_ASDspec(EObject context, ASDspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         importance=ImportanceType? 
	 *         importanceQuantitative=INT? 
	 *         lineColor=STRING? 
	 *         fillColor=STRING? 
	 *         filled=BOOLEAN? 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         (includedActors+=[Actor|ID] includedActors+=[Actor|ID]*)? 
	 *         (collapsedRefs+=[CollapsedActorRef|ID] collapsedRefs+=[CollapsedActorRef|ID]*)? 
	 *         (contRefs+=[IURNContainerRef|ID] contRefs+=[IURNContainerRef|ID]*)?
	 *     )
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         author=STRING? 
	 *         x=INT? 
	 *         y=INT? 
	 *         id=STRING? 
	 *         description=STRING?
	 *     )
	 */
	protected void sequence_Belief(EObject context, Belief semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         x=INT? 
	 *         y=INT? 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         actor=[Actor|ID]?
	 *     )
	 */
	protected void sequence_CollapsedActorRef(EObject context, CollapsedActorRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ContributionContextGroup(EObject context, ContributionContextGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ContributionContext(EObject context, ContributionContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         contribution=ContributionType? 
	 *         quantitativeContribution=INT? 
	 *         correlation=BOOLEAN? 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         (refs+=[LinkRef|ID] refs+=[LinkRef|ID]*)? 
	 *         src=[GRLLinkableElement|ID] 
	 *         dest=[GRLLinkableElement|ID]
	 *     )
	 */
	protected void sequence_Contribution(EObject context, Contribution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         src=[GRLLinkableElement|ID] 
	 *         dest=[GRLLinkableElement|ID] 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         (refs+=[LinkRef|ID] refs+=[LinkRef|ID]*)?
	 *     )
	 */
	protected void sequence_Decomposition(EObject context, Decomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         (refs+=[LinkRef|ID] refs+=[LinkRef|ID]*)? 
	 *         src=[GRLLinkableElement|ID] 
	 *         dest=[GRLLinkableElement|ID]
	 *     )
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EvaluationStrategy(EObject context, EvaluationStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         links+=ElementLink* 
	 *         actors+=Actor* 
	 *         intElements+=IntentionalElement* 
	 *         impactModel=ImpactModel? 
	 *         groups+=StrategiesGroup* 
	 *         contributionContexts+=ContributionContext* 
	 *         contributionGroups+=ContributionContextGroup*
	 *     )
	 */
	protected void sequence_GRLspec(EObject context, GRLspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ImpactModel(EObject context, ImpactModel semanticObject) {
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
	 *         type=IntentionalElementType? 
	 *         decompositionType=DecompositionType? 
	 *         importance=ImportanceType? 
	 *         importanceQuantitative=INT? 
	 *         lineColor=STRING? 
	 *         fillColor=STRING? 
	 *         filled=BOOLEAN? 
	 *         id=STRING? 
	 *         description=STRING? 
	 *         (refs+=[IntentionalElementRef|ID] refs+=[IntentionalElementRef|ID]*)?
	 *     )
	 */
	protected void sequence_IntentionalElement(EObject context, IntentionalElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING?)
	 */
	protected void sequence_Metadata(EObject context, Metadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StrategiesGroup(EObject context, StrategiesGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {URNdefinition}
	 */
	protected void sequence_URNdefinition(EObject context, URNdefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         urndef=URNdefinition 
	 *         grlspec=GRLspec? 
	 *         metadata+=Metadata* 
	 *         ucmspec=UCMspec? 
	 *         urnLinks+=URNlink* 
	 *         asdspec=ASDspec
	 *     )
	 */
	protected void sequence_URNspec(EObject context, URNspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
