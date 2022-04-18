/*
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.serializer;

import com.google.inject.Inject;
import hvbargen.meth.services.MethGrammarAccess;
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

@SuppressWarnings("all")
public class MethSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MethGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DimensionPrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_DimensionPrimary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_EinheitPrimary_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_EinheitPrimary_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MethGrammarAccess) access;
		match_DimensionPrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getDimensionPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_DimensionPrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getDimensionPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_EinheitPrimary_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getEinheitPrimaryAccess().getLeftParenthesisKeyword_2_0());
		match_EinheitPrimary_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getEinheitPrimaryAccess().getLeftParenthesisKeyword_2_0());
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
			if (match_DimensionPrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_DimensionPrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DimensionPrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_DimensionPrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EinheitPrimary_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_EinheitPrimary_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EinheitPrimary_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_EinheitPrimary_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ref=[Dimension|ID]
	 *     (rule start) (ambiguity) {DimensionMultiplikation.links=}
	 
	 * </pre>
	 */
	protected void emit_DimensionPrimary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {DimensionMultiplikation.links=}
	 
	 * </pre>
	 */
	protected void emit_DimensionPrimary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) fwert=DEZIMAL
	 *     (rule start) (ambiguity) iwert=GANZ
	 *     (rule start) (ambiguity) varref=ID
	 *     (rule start) (ambiguity) {EinheitAddition.links=}
	 *     (rule start) (ambiguity) {EinheitMultiplikation.links=}
	 
	 * </pre>
	 */
	protected void emit_EinheitPrimary_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {EinheitAddition.links=}
	 *     (rule start) (ambiguity) {EinheitMultiplikation.links=}
	 
	 * </pre>
	 */
	protected void emit_EinheitPrimary_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}