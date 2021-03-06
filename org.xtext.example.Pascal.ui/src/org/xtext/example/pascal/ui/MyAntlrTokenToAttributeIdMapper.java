package org.xtext.example.pascal.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class MyAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		/*
		String[] layouts = new String[]{ "RULE_IDENTIFIER" };
		String[] keywords = new String[]{ "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_GOTO_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_WHILE_KEYWORD", "RULE_DO_KEYWORD", "RULE_REPEAT_KEYWORD", "RULE_UNTIL_KEYWORD", "RULE_FOR_KEYWORD", "RULE_TO_KEYWORD", "RULE_DOWNTO_KEYWORD", "RULE_IF_KEYWORD", "RULE_THEN_KEYWORD", "RULE_ELSE_KEYWORD", "RULE_CASE_KEYWORD", "RULE_OF_KEYWORD", "RULE_WITH_KEYWORD", "RULE_CONST_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_PACKED_KEYWORD", "RULE_ARRAY_KEYWORD", "RULE_RECORD_KEYWORD", "RULE_SET_KEYWORD", "RULE_FILE_KEYWORD", "RULE_VAR_KEYWORD", "RULE_PROCEDURE_KEYWORD", "RULE_FORWARD_KEYWORD", "RULE_FUNCTION_KEYWORD", "RULE_PROGRAM_KEYWORD" };
		String[] numbers = new String[]{ "RULE_INTEGER_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_SIGNED_REAL_NUMBER" };
		String[] punctuation = new String[]{ "'['", "']'", "':'", "','", "'('", "')'", "';'" };
		String[] operators = new String[]{ "RULE_OR_KEYWORD", "RULE_MULTIPLICATION_OPERATOR", "RULE_RELATIONAL_OPERATOR", "RULE_NOT_KEYWORD" };
		for (String s : layouts) {  
			if (s.equals(tokenName)) return MyHighLightingConfiguration.LAYOUT_ID;  
		}
		for (String s : keywords) {
			if (s.equals(tokenName)) return MyHighLightingConfiguration.KEYWORD_ID;
		}
		for (String s : numbers) {
			if (s.equals(tokenName)) return MyHighLightingConfiguration.NUMBER_ID;
		}
		for (String s : punctuation) {
			if (s.equals(tokenName)) return MyHighLightingConfiguration.PUNCTUATION_ID;
		}
		for (String s : operators) {
			if (s.equals(tokenName)) return MyHighLightingConfiguration.OPERATOR_ID;
		}
		*/
		return super.calculateId(tokenName, tokenType);
	}
	
}