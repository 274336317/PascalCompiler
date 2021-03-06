
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




Procedure : ('P'|'p')('R'|'r')('O'|'o')('C'|'c')('E'|'e')('D'|'d')('U'|'u')('R'|'r')('E'|'e');

Function : ('F'|'f')('U'|'u')('N'|'n')('C'|'c')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Forward : ('F'|'f')('O'|'o')('R'|'r')('W'|'w')('A'|'a')('R'|'r')('D'|'d');

Program : ('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('A'|'a')('M'|'m');

Downto : ('D'|'d')('O'|'o')('W'|'w')('N'|'n')('T'|'t')('O'|'o');

Packed : ('P'|'p')('A'|'a')('C'|'c')('K'|'k')('E'|'e')('D'|'d');

Record : ('R'|'r')('E'|'e')('C'|'c')('O'|'o')('R'|'r')('D'|'d');

Repeat : ('R'|'r')('E'|'e')('P'|'p')('E'|'e')('A'|'a')('T'|'t');

Array : ('A'|'a')('R'|'r')('R'|'r')('A'|'a')('Y'|'y');

Begin : ('B'|'b')('E'|'e')('G'|'g')('I'|'i')('N'|'n');

Const : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Label : ('L'|'l')('A'|'a')('B'|'b')('E'|'e')('L'|'l');

Until : ('U'|'u')('N'|'n')('T'|'t')('I'|'i')('L'|'l');

While : ('W'|'w')('H'|'h')('I'|'i')('L'|'l')('E'|'e');

Case : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');

Else : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

File : ('F'|'f')('I'|'i')('L'|'l')('E'|'e');

Goto : ('G'|'g')('O'|'o')('T'|'t')('O'|'o');

Then : ('T'|'t')('H'|'h')('E'|'e')('N'|'n');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

Type : ('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

With : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

And : ('A'|'a')('N'|'n')('D'|'d');

Div : ('D'|'d')('I'|'i')('V'|'v');

End : ('E'|'e')('N'|'n')('D'|'d');

For : ('F'|'f')('O'|'o')('R'|'r');

Mod : ('M'|'m')('O'|'o')('D'|'d');

Nil : ('N'|'n')('I'|'i')('L'|'l');

Not : ('N'|'n')('O'|'o')('T'|'t');

Set : ('S'|'s')('E'|'e')('T'|'t');

Var : ('V'|'v')('A'|'a')('R'|'r');

FullStopFullStop : '.''.';

ColonEqualsSign : ':''=';

Do : ('D'|'d')('O'|'o');

If : ('I'|'i')('F'|'f');

In : ('I'|'i')('N'|'n');

Of : ('O'|'o')('F'|'f');

Or : ('O'|'o')('R'|'r');

To : ('T'|'t')('O'|'o');

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



RULE_NUMERIC_SUBRANGE : (RULE_INTEGER_NUMBER|RULE_REAL_NUMBER|RULE_SIGNED_INTEGER_NUMBER|RULE_SIGNED_REAL_NUMBER) '..';

RULE_ADDITION_OPERATOR : ('+'|'-');

RULE_MULTIPLICATION_OPERATOR : ('*'|'/');

RULE_RELATIONAL_OPERATOR : ('='|'<>'|'<'|'<='|'>'|'>=');

RULE_SIGNED_INTEGER_NUMBER : RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER;

RULE_INTEGER_NUMBER : RULE_UNSIGNED_DIGIT_SEQUENCE;

RULE_SIGNED_REAL_NUMBER : RULE_ADDITION_OPERATOR RULE_REAL_NUMBER;

RULE_REAL_NUMBER : (RULE_UNSIGNED_DIGIT_SEQUENCE '.' RULE_UNSIGNED_DIGIT_SEQUENCE? (('E'|'e') RULE_DIGIT_SEQUENCE)?|RULE_UNSIGNED_DIGIT_SEQUENCE ('E'|'e') RULE_DIGIT_SEQUENCE);

RULE_UNSIGNED_DIGIT_SEQUENCE : RULE_DIGIT+;

RULE_DIGIT_SEQUENCE : RULE_ADDITION_OPERATOR? RULE_UNSIGNED_DIGIT_SEQUENCE;

RULE_DIGIT : '0'..'9';

RULE_ML_COMMENT : ('(*' ( options {greedy=false;} : . )*'*)'|'{' ( options {greedy=false;} : . )*'}');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



