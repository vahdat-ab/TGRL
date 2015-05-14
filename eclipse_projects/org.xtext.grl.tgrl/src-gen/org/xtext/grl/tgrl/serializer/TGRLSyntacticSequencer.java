package org.xtext.grl.tgrl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;

@SuppressWarnings("all")
public class TGRLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TGRLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Actor_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Belief_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ContributionEnd___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_DecompositionEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_DependencyEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Evaluation_SemicolonKeyword_3_1_or___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_0_2__;
	protected AbstractElementAlias match_Goal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Indicator_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Resource_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Softgoal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Task_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TGRLGrammarAccess) access;
		match_Actor_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getActorAccess().getSemicolonKeyword_2_0()));
		match_Belief_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_0()));
		match_ContributionEnd___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getContributionEndAccess().getRightCurlyBracketKeyword_3_2()));
		match_DecompositionEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDecompositionEndAccess().getRightCurlyBracketKeyword_2_2()));
		match_DependencyEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDependencyEndAccess().getRightCurlyBracketKeyword_2_2()));
		match_Evaluation_SemicolonKeyword_3_1_or___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2())), new TokenAlias(false, false, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_1()));
		match_Goal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getGoalAccess().getSemicolonKeyword_2_0()));
		match_Indicator_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_0()));
		match_Resource_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getResourceAccess().getSemicolonKeyword_2_0()));
		match_Softgoal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_0()));
		match_Task_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getTaskAccess().getSemicolonKeyword_2_0()));
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
			if(match_Actor_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Actor_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Belief_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Belief_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ContributionEnd___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ContributionEnd___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecompositionEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_DecompositionEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DependencyEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_DependencyEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Evaluation_SemicolonKeyword_3_1_or___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_0_2__.equals(syntax))
				emit_Evaluation_SemicolonKeyword_3_1_or___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Goal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Indicator_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Indicator_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Resource_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Resource_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Softgoal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Softgoal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Task_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Actor_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Belief_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ContributionEnd___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_DecompositionEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_DependencyEnd___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Evaluation_SemicolonKeyword_3_1_or___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Goal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Indicator_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Resource_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Softgoal_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Task_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
