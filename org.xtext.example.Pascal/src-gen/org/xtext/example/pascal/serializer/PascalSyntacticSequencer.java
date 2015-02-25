package org.xtext.example.pascal.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.pascal.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PascalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_case_statement_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_factor_FalseKeyword_6_or_NilKeyword_4_or_STRINGTerminalRuleCall_2_or_TrueKeyword_5;
	protected AbstractElementAlias match_factor_NotKeyword_9_0_a;
	protected AbstractElementAlias match_field_list_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_for_statement_DowntoKeyword_2_1_or_ToKeyword_2_0;
	protected AbstractElementAlias match_simple_statement_IDTerminalRuleCall_3_q;
	protected AbstractElementAlias match_structured_type_PackedKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PascalGrammarAccess) access;
		match_case_statement_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
		match_factor_FalseKeyword_6_or_NilKeyword_4_or_STRINGTerminalRuleCall_2_or_TrueKeyword_5 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFactorAccess().getFalseKeyword_6()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getNilKeyword_4()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getTrueKeyword_5()));
		match_factor_NotKeyword_9_0_a = new TokenAlias(true, true, grammarAccess.getFactorAccess().getNotKeyword_9_0());
		match_field_list_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
		match_for_statement_DowntoKeyword_2_1_or_ToKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getToKeyword_2_0()));
		match_simple_statement_IDTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getSimple_statementAccess().getIDTerminalRuleCall_3());
		match_structured_type_PackedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_case_statement_SemicolonKeyword_5_q.equals(syntax))
				emit_case_statement_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_factor_FalseKeyword_6_or_NilKeyword_4_or_STRINGTerminalRuleCall_2_or_TrueKeyword_5.equals(syntax))
				emit_factor_FalseKeyword_6_or_NilKeyword_4_or_STRINGTerminalRuleCall_2_or_TrueKeyword_5(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_factor_NotKeyword_9_0_a.equals(syntax))
				emit_factor_NotKeyword_9_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_field_list_SemicolonKeyword_1_q.equals(syntax))
				emit_field_list_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_for_statement_DowntoKeyword_2_1_or_ToKeyword_2_0.equals(syntax))
				emit_for_statement_DowntoKeyword_2_1_or_ToKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_simple_statement_IDTerminalRuleCall_3_q.equals(syntax))
				emit_simple_statement_IDTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_structured_type_PackedKeyword_0_q.equals(syntax))
				emit_structured_type_PackedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_case_statement_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     STRING | 'nil' | 'true' | 'false'
	 */
	protected void emit_factor_FalseKeyword_6_or_NilKeyword_4_or_STRINGTerminalRuleCall_2_or_TrueKeyword_5(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not'*
	 */
	protected void emit_factor_NotKeyword_9_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_field_list_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to' | 'downto'
	 */
	protected void emit_for_statement_DowntoKeyword_2_1_or_ToKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ID?
	 */
	protected void emit_simple_statement_IDTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'packed'?
	 */
	protected void emit_structured_type_PackedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
