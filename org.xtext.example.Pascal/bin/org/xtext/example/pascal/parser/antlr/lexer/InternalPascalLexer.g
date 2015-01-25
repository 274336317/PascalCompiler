
/*
* generated by Xtext
*/
lexer grammar InternalPascalLexer;


@header {
package org.xtext.example.pascal.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




Program : ('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('A'|'a')('M'|'m');

FullStopFullStop : '.''.';

ColonEqualsSign : ':''=';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

FullStop : '.';

Colon : ':';

Semicolon : ';';

EqualsSign : '=';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';



RULE_NUMERIC_SUBRANGE : (RULE_INTEGER_NUMBER|RULE_REAL_NUMBER|RULE_SIGNED_INTEGER_NUMBER|RULE_SIGNED_REAL_NUMBER) '..' (RULE_INTEGER_NUMBER|RULE_REAL_NUMBER|RULE_SIGNED_INTEGER_NUMBER|RULE_SIGNED_REAL_NUMBER);

RULE_ADDITION_OPERATOR : ('+'|'-');

RULE_MULTIPLICATION_OPERATOR : ('*'|'/'|'div'|'mod'|'and');

RULE_RELATIONAL_OPERATOR : ('='|'<>'|'<'|'<='|'>'|'>='|'in');

RULE_BEGIN_KEYWORD : 'begin';

RULE_END_KEYWORD : 'end';

RULE_LABEL_KEYWORD : 'label';

RULE_NIL_KEYWORD : 'nil';

RULE_NOT_KEYWORD : 'not';

RULE_OR_KEYWORD : 'or';

RULE_GOTO_KEYWORD : 'goto';

RULE_WHILE_KEYWORD : 'while';

RULE_DO_KEYWORD : 'do';

RULE_REPEAT_KEYWORD : 'repeat';

RULE_UNTIL_KEYWORD : 'until';

RULE_FOR_KEYWORD : 'for';

RULE_TO_KEYWORD : 'to';

RULE_DOWNTO_KEYWORD : 'downto';

RULE_IF_KEYWORD : 'if';

RULE_THEN_KEYWORD : 'then';

RULE_ELSE_KEYWORD : 'else';

RULE_CASE_KEYWORD : 'case';

RULE_OF_KEYWORD : 'of';

RULE_WITH_KEYWORD : 'with';

RULE_CONST_KEYWORD : 'const';

RULE_TYPE_KEYWORD : 'type';

RULE_PACKED_KEYWORD : 'packed';

RULE_ARRAY_KEYWORD : 'array';

RULE_RECORD_KEYWORD : 'record';

RULE_SET_KEYWORD : 'set';

RULE_FILE_KEYWORD : 'file';

RULE_VAR_KEYWORD : 'var';

RULE_PROCEDURE_KEYWORD : 'procedure';

RULE_FORWARD_KEYWORD : 'forward';

RULE_FUNCTION_KEYWORD : 'function';

RULE_TRUE_KEYWORD : 'true';

RULE_FALSE_KEYWORD : 'false';

RULE_SIGNED_INTEGER_NUMBER : RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER;

RULE_INTEGER_NUMBER : RULE_UNSIGNED_DIGIT_SEQUENCE;

RULE_SIGNED_REAL_NUMBER : RULE_ADDITION_OPERATOR RULE_REAL_NUMBER;

RULE_REAL_NUMBER : (RULE_UNSIGNED_DIGIT_SEQUENCE '.' RULE_UNSIGNED_DIGIT_SEQUENCE? (('E'|'e') RULE_DIGIT_SEQUENCE)?|RULE_UNSIGNED_DIGIT_SEQUENCE ('E'|'e') RULE_DIGIT_SEQUENCE);

RULE_UNSIGNED_DIGIT_SEQUENCE : RULE_DIGIT+;

RULE_DIGIT_SEQUENCE : RULE_ADDITION_OPERATOR? RULE_UNSIGNED_DIGIT_SEQUENCE;

RULE_DIGIT : '0'..'9';

RULE_IDENTIFIER : RULE_LETTER_EXTENDED (RULE_LETTER_EXTENDED|RULE_DIGIT)*;

RULE_LETTER : ('A'..'Z'|'a'..'z');

RULE_LETTER_EXTENDED : (RULE_LETTER|'_');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



