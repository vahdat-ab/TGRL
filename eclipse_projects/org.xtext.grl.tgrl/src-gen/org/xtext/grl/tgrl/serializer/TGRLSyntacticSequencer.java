package org.xtext.grl.tgrl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;

@SuppressWarnings("all")
public class TGRLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TGRLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Belief_RightCurlyBracketKeyword_4_1_a;
	protected AbstractElementAlias match_Belief_RightCurlyBracketKeyword_4_1_p;
	protected AbstractElementAlias match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_a;
	protected AbstractElementAlias match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_p;
	protected AbstractElementAlias match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_a;
	protected AbstractElementAlias match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TGRLGrammarAccess) access;
		match_Belief_RightCurlyBracketKeyword_4_1_a = new TokenAlias(true, true, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4_1());
		match_Belief_RightCurlyBracketKeyword_4_1_p = new TokenAlias(true, false, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4_1());
		match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_a = new TokenAlias(true, true, grammarAccess.getCollapsedActorRefAccess().getRightCurlyBracketKeyword_3_2());
		match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_p = new TokenAlias(true, false, grammarAccess.getCollapsedActorRefAccess().getRightCurlyBracketKeyword_3_2());
		match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_a = new TokenAlias(true, true, grammarAccess.getIntentionalElementRefAccess().getRightCurlyBracketKeyword_2_1());
		match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_p = new TokenAlias(true, false, grammarAccess.getIntentionalElementRefAccess().getRightCurlyBracketKeyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Belief_RightCurlyBracketKeyword_4_1_a.equals(syntax))
				emit_Belief_RightCurlyBracketKeyword_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Belief_RightCurlyBracketKeyword_4_1_p.equals(syntax))
				emit_Belief_RightCurlyBracketKeyword_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_a.equals(syntax))
				emit_CollapsedActorRef_RightCurlyBracketKeyword_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CollapsedActorRef_RightCurlyBracketKeyword_3_2_p.equals(syntax))
				emit_CollapsedActorRef_RightCurlyBracketKeyword_3_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_a.equals(syntax))
				emit_IntentionalElementRef_RightCurlyBracketKeyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IntentionalElementRef_RightCurlyBracketKeyword_2_1_p.equals(syntax))
				emit_IntentionalElementRef_RightCurlyBracketKeyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_Belief_RightCurlyBracketKeyword_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_Belief_RightCurlyBracketKeyword_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_CollapsedActorRef_RightCurlyBracketKeyword_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_CollapsedActorRef_RightCurlyBracketKeyword_3_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_IntentionalElementRef_RightCurlyBracketKeyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_IntentionalElementRef_RightCurlyBracketKeyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
