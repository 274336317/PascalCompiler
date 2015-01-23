package org.xtext.example.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int RULE_ID=49;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ANY_OTHER=54;
    public static final int RULE_IF_KEYWORD=25;
    public static final int RULE_NUMERIC_SUBRANGE=35;
    public static final int T__61=61;
    public static final int RULE_FOR_KEYWORD=22;
    public static final int RULE_ADDITION_OPERATOR=10;
    public static final int T__60=60;
    public static final int RULE_TYPE_KEYWORD=34;
    public static final int EOF=-1;
    public static final int RULE_VAR_KEYWORD=41;
    public static final int RULE_FILE_KEYWORD=40;
    public static final int RULE_UNTIL_KEYWORD=21;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_END_KEYWORD=6;
    public static final int RULE_THEN_KEYWORD=26;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_CASE_KEYWORD=28;
    public static final int RULE_REAL_NUMBER=16;
    public static final int T__59=59;
    public static final int RULE_MULTIPLICATION_OPERATOR=12;
    public static final int RULE_INT=50;
    public static final int RULE_BEGIN_KEYWORD=5;
    public static final int RULE_LETTER_EXTENDED=47;
    public static final int RULE_DOWNTO_KEYWORD=24;
    public static final int RULE_TO_KEYWORD=23;
    public static final int RULE_RELATIONAL_OPERATOR=9;
    public static final int RULE_NIL_KEYWORD=14;
    public static final int RULE_GOTO_KEYWORD=31;
    public static final int RULE_LABEL_KEYWORD=32;
    public static final int RULE_FORWARD_KEYWORD=42;
    public static final int RULE_WHILE_KEYWORD=18;
    public static final int RULE_OF_KEYWORD=29;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=44;
    public static final int RULE_DO_KEYWORD=19;
    public static final int RULE_WITH_KEYWORD=30;
    public static final int RULE_CONST_KEYWORD=33;
    public static final int RULE_SL_COMMENT=52;
    public static final int RULE_PACKED_KEYWORD=36;
    public static final int RULE_NOT_KEYWORD=15;
    public static final int RULE_SET_KEYWORD=39;
    public static final int RULE_RECORD_KEYWORD=38;
    public static final int RULE_LETTER=48;
    public static final int RULE_ML_COMMENT=51;
    public static final int RULE_STRING=13;
    public static final int RULE_SIGNED_REAL_NUMBER=17;
    public static final int RULE_REPEAT_KEYWORD=20;
    public static final int RULE_ARRAY_KEYWORD=37;
    public static final int RULE_OR_KEYWORD=11;
    public static final int RULE_DIGIT_SEQUENCE=45;
    public static final int RULE_WS=53;
    public static final int RULE_SIGNED_INTEGER_NUMBER=7;
    public static final int RULE_DIGIT=46;
    public static final int RULE_PROCEDURE_KEYWORD=43;
    public static final int RULE_ELSE_KEYWORD=27;
    public static final int RULE_INTEGER_NUMBER=8;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g"; }

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:11:7: ( '.' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:12:7: ( 'program' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:12:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:13:7: ( '(' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:14:7: ( ')' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:15:7: ( ';' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:16:7: ( ',' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:17:7: ( ':' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:18:7: ( ':=' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:18:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:19:7: ( '[' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:20:7: ( ']' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:21:7: ( '=' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:22:7: ( '..' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:22:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:23:7: ( '^' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:23:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:90: RULE_SIGNED_REAL_NUMBER
                    {
                    mRULE_SIGNED_REAL_NUMBER(); 

                    }
                    break;

            }

            match(".."); 

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:120: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:121: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:141: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:158: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4032:185: RULE_SIGNED_REAL_NUMBER
                    {
                    mRULE_SIGNED_REAL_NUMBER(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_SUBRANGE"

    // $ANTLR start "RULE_ADDITION_OPERATOR"
    public final void mRULE_ADDITION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4034:24: ( ( '+' | '-' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4034:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITION_OPERATOR"

    // $ANTLR start "RULE_MULTIPLICATION_OPERATOR"
    public final void mRULE_MULTIPLICATION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:30: ( ( '*' | '/' | 'div' | 'mod' | 'and' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt3=1;
                }
                break;
            case '/':
                {
                alt3=2;
                }
                break;
            case 'd':
                {
                alt3=3;
                }
                break;
            case 'm':
                {
                alt3=4;
                }
                break;
            case 'a':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:33: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:37: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:41: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:47: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4036:53: 'and'
                    {
                    match("and"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATION_OPERATOR"

    // $ANTLR start "RULE_RELATIONAL_OPERATOR"
    public final void mRULE_RELATIONAL_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_RELATIONAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:51: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4038:56: 'in'
                    {
                    match("in"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATIONAL_OPERATOR"

    // $ANTLR start "RULE_BEGIN_KEYWORD"
    public final void mRULE_BEGIN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_BEGIN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4040:20: ( 'begin' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4040:22: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN_KEYWORD"

    // $ANTLR start "RULE_END_KEYWORD"
    public final void mRULE_END_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_END_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4042:18: ( 'end' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4042:20: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_KEYWORD"

    // $ANTLR start "RULE_LABEL_KEYWORD"
    public final void mRULE_LABEL_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LABEL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4044:20: ( 'label' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4044:22: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LABEL_KEYWORD"

    // $ANTLR start "RULE_NIL_KEYWORD"
    public final void mRULE_NIL_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_NIL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4046:18: ( 'nil' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4046:20: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NIL_KEYWORD"

    // $ANTLR start "RULE_NOT_KEYWORD"
    public final void mRULE_NOT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_NOT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4048:18: ( 'not' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4048:20: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_KEYWORD"

    // $ANTLR start "RULE_OR_KEYWORD"
    public final void mRULE_OR_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_OR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4050:17: ( 'or' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4050:19: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_KEYWORD"

    // $ANTLR start "RULE_GOTO_KEYWORD"
    public final void mRULE_GOTO_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_GOTO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4052:19: ( 'goto' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4052:21: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOTO_KEYWORD"

    // $ANTLR start "RULE_WHILE_KEYWORD"
    public final void mRULE_WHILE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_WHILE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4054:20: ( 'while' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4054:22: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE_KEYWORD"

    // $ANTLR start "RULE_DO_KEYWORD"
    public final void mRULE_DO_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4056:17: ( 'do' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4056:19: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO_KEYWORD"

    // $ANTLR start "RULE_REPEAT_KEYWORD"
    public final void mRULE_REPEAT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_REPEAT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4058:21: ( 'repeat' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4058:23: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REPEAT_KEYWORD"

    // $ANTLR start "RULE_UNTIL_KEYWORD"
    public final void mRULE_UNTIL_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_UNTIL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4060:20: ( 'until' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4060:22: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNTIL_KEYWORD"

    // $ANTLR start "RULE_FOR_KEYWORD"
    public final void mRULE_FOR_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_FOR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4062:18: ( 'for' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4062:20: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR_KEYWORD"

    // $ANTLR start "RULE_TO_KEYWORD"
    public final void mRULE_TO_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4064:17: ( 'to' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4064:19: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO_KEYWORD"

    // $ANTLR start "RULE_DOWNTO_KEYWORD"
    public final void mRULE_DOWNTO_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DOWNTO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4066:21: ( 'downto' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4066:23: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOWNTO_KEYWORD"

    // $ANTLR start "RULE_IF_KEYWORD"
    public final void mRULE_IF_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_IF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4068:17: ( 'if' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4068:19: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF_KEYWORD"

    // $ANTLR start "RULE_THEN_KEYWORD"
    public final void mRULE_THEN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_THEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4070:19: ( 'then' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4070:21: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_KEYWORD"

    // $ANTLR start "RULE_ELSE_KEYWORD"
    public final void mRULE_ELSE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ELSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4072:19: ( 'else' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4072:21: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE_KEYWORD"

    // $ANTLR start "RULE_CASE_KEYWORD"
    public final void mRULE_CASE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CASE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4074:19: ( 'case' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4074:21: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE_KEYWORD"

    // $ANTLR start "RULE_OF_KEYWORD"
    public final void mRULE_OF_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_OF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4076:17: ( 'of' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4076:19: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OF_KEYWORD"

    // $ANTLR start "RULE_WITH_KEYWORD"
    public final void mRULE_WITH_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_WITH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4078:19: ( 'with' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4078:21: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WITH_KEYWORD"

    // $ANTLR start "RULE_CONST_KEYWORD"
    public final void mRULE_CONST_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONST_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4080:20: ( 'const' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4080:22: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONST_KEYWORD"

    // $ANTLR start "RULE_TYPE_KEYWORD"
    public final void mRULE_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4082:19: ( 'type' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4082:21: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_KEYWORD"

    // $ANTLR start "RULE_PACKED_KEYWORD"
    public final void mRULE_PACKED_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_PACKED_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4084:21: ( 'packed' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4084:23: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKED_KEYWORD"

    // $ANTLR start "RULE_ARRAY_KEYWORD"
    public final void mRULE_ARRAY_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4086:20: ( 'array' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4086:22: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY_KEYWORD"

    // $ANTLR start "RULE_RECORD_KEYWORD"
    public final void mRULE_RECORD_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_RECORD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4088:21: ( 'record' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4088:23: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RECORD_KEYWORD"

    // $ANTLR start "RULE_SET_KEYWORD"
    public final void mRULE_SET_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_SET_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4090:18: ( 'set' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4090:20: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SET_KEYWORD"

    // $ANTLR start "RULE_FILE_KEYWORD"
    public final void mRULE_FILE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_FILE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4092:19: ( 'file' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4092:21: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FILE_KEYWORD"

    // $ANTLR start "RULE_VAR_KEYWORD"
    public final void mRULE_VAR_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_VAR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4094:18: ( 'var' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4094:20: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR_KEYWORD"

    // $ANTLR start "RULE_PROCEDURE_KEYWORD"
    public final void mRULE_PROCEDURE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_PROCEDURE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4096:24: ( 'procedure' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4096:26: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROCEDURE_KEYWORD"

    // $ANTLR start "RULE_FORWARD_KEYWORD"
    public final void mRULE_FORWARD_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_FORWARD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4098:22: ( 'forward' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4098:24: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FORWARD_KEYWORD"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4100:28: ( RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4100:30: RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER
            {
            mRULE_ADDITION_OPERATOR(); 
            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4102:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4102:23: RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_SIGNED_REAL_NUMBER"
    public final void mRULE_SIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4104:25: ( RULE_ADDITION_OPERATOR RULE_REAL_NUMBER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4104:27: RULE_ADDITION_OPERATOR RULE_REAL_NUMBER
            {
            mRULE_ADDITION_OPERATOR(); 
            mRULE_REAL_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_REAL_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:18: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:21: RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:54: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:54: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:84: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:85: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4106:117: RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_DIGIT_SEQUENCE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4108:30: ( ( RULE_DIGIT )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4108:32: ( RULE_DIGIT )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4108:32: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4108:32: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4110:21: ( ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4110:23: ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4110:23: ( RULE_ADDITION_OPERATOR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4110:23: RULE_ADDITION_OPERATOR
                    {
                    mRULE_ADDITION_OPERATOR(); 

                    }
                    break;

            }

            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4112:12: ( '0' .. '9' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4112:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4114:17: ( RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4114:19: RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            {
            mRULE_LETTER_EXTENDED(); 
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4114:40: ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4116:13: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4116:15: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_LETTER_EXTENDED"
    public final void mRULE_LETTER_EXTENDED() throws RecognitionException {
        try {
            int _type = RULE_LETTER_EXTENDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4118:22: ( ( RULE_LETTER | '_' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4118:24: ( RULE_LETTER | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_EXTENDED"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4120:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4120:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4120:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4120:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4120:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4122:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4122:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4122:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4122:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4124:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4126:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4126:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4126:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4126:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4128:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4130:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4132:16: ( . )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:4132:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:8: ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_GOTO_KEYWORD | RULE_WHILE_KEYWORD | RULE_DO_KEYWORD | RULE_REPEAT_KEYWORD | RULE_UNTIL_KEYWORD | RULE_FOR_KEYWORD | RULE_TO_KEYWORD | RULE_DOWNTO_KEYWORD | RULE_IF_KEYWORD | RULE_THEN_KEYWORD | RULE_ELSE_KEYWORD | RULE_CASE_KEYWORD | RULE_OF_KEYWORD | RULE_WITH_KEYWORD | RULE_CONST_KEYWORD | RULE_TYPE_KEYWORD | RULE_PACKED_KEYWORD | RULE_ARRAY_KEYWORD | RULE_RECORD_KEYWORD | RULE_SET_KEYWORD | RULE_FILE_KEYWORD | RULE_VAR_KEYWORD | RULE_PROCEDURE_KEYWORD | RULE_FORWARD_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=64;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:10: T__55
                {
                mT__55(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:16: T__56
                {
                mT__56(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:22: T__57
                {
                mT__57(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:28: T__58
                {
                mT__58(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:34: T__59
                {
                mT__59(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:40: T__60
                {
                mT__60(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:46: T__61
                {
                mT__61(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:52: T__62
                {
                mT__62(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:58: T__63
                {
                mT__63(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:64: T__64
                {
                mT__64(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:70: T__65
                {
                mT__65(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:76: T__66
                {
                mT__66(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:82: T__67
                {
                mT__67(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:88: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:110: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:133: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:162: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:187: RULE_BEGIN_KEYWORD
                {
                mRULE_BEGIN_KEYWORD(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:206: RULE_END_KEYWORD
                {
                mRULE_END_KEYWORD(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:223: RULE_LABEL_KEYWORD
                {
                mRULE_LABEL_KEYWORD(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:242: RULE_NIL_KEYWORD
                {
                mRULE_NIL_KEYWORD(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:259: RULE_NOT_KEYWORD
                {
                mRULE_NOT_KEYWORD(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:276: RULE_OR_KEYWORD
                {
                mRULE_OR_KEYWORD(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:292: RULE_GOTO_KEYWORD
                {
                mRULE_GOTO_KEYWORD(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:310: RULE_WHILE_KEYWORD
                {
                mRULE_WHILE_KEYWORD(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:329: RULE_DO_KEYWORD
                {
                mRULE_DO_KEYWORD(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:345: RULE_REPEAT_KEYWORD
                {
                mRULE_REPEAT_KEYWORD(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:365: RULE_UNTIL_KEYWORD
                {
                mRULE_UNTIL_KEYWORD(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:384: RULE_FOR_KEYWORD
                {
                mRULE_FOR_KEYWORD(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:401: RULE_TO_KEYWORD
                {
                mRULE_TO_KEYWORD(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:417: RULE_DOWNTO_KEYWORD
                {
                mRULE_DOWNTO_KEYWORD(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:437: RULE_IF_KEYWORD
                {
                mRULE_IF_KEYWORD(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:453: RULE_THEN_KEYWORD
                {
                mRULE_THEN_KEYWORD(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:471: RULE_ELSE_KEYWORD
                {
                mRULE_ELSE_KEYWORD(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:489: RULE_CASE_KEYWORD
                {
                mRULE_CASE_KEYWORD(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:507: RULE_OF_KEYWORD
                {
                mRULE_OF_KEYWORD(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:523: RULE_WITH_KEYWORD
                {
                mRULE_WITH_KEYWORD(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:541: RULE_CONST_KEYWORD
                {
                mRULE_CONST_KEYWORD(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:560: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:578: RULE_PACKED_KEYWORD
                {
                mRULE_PACKED_KEYWORD(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:598: RULE_ARRAY_KEYWORD
                {
                mRULE_ARRAY_KEYWORD(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:617: RULE_RECORD_KEYWORD
                {
                mRULE_RECORD_KEYWORD(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:637: RULE_SET_KEYWORD
                {
                mRULE_SET_KEYWORD(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:654: RULE_FILE_KEYWORD
                {
                mRULE_FILE_KEYWORD(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:672: RULE_VAR_KEYWORD
                {
                mRULE_VAR_KEYWORD(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:689: RULE_PROCEDURE_KEYWORD
                {
                mRULE_PROCEDURE_KEYWORD(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:712: RULE_FORWARD_KEYWORD
                {
                mRULE_FORWARD_KEYWORD(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:733: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:760: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:780: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:804: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:821: RULE_UNSIGNED_DIGIT_SEQUENCE
                {
                mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:850: RULE_DIGIT_SEQUENCE
                {
                mRULE_DIGIT_SEQUENCE(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:870: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:881: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:897: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:909: RULE_LETTER_EXTENDED
                {
                mRULE_LETTER_EXTENDED(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:930: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:938: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:947: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:959: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:975: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:991: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:999: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\53\1\56\1\60\1\56\1\uffff\1\56\1\53\1\56\2\uffff\1\53\1\uffff";
    static final String DFA1_maxS =
        "\1\71\1\145\1\71\1\145\1\uffff\1\145\1\71\1\145\2\uffff\1\71\1"+
        "\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\2\3\uffff\1\4\1\1\1\uffff\1\3";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\2\2\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "\12\5",
            "\1\6\1\uffff\12\4\13\uffff\1\4\37\uffff\1\4",
            "",
            "\1\7\1\uffff\12\5\13\uffff\1\10\37\uffff\1\10",
            "\1\11\1\uffff\1\11\1\4\1\uffff\12\11",
            "\1\12\1\uffff\12\10\13\uffff\1\10\37\uffff\1\10",
            "",
            "",
            "\1\13\1\uffff\1\13\1\10\1\uffff\12\13",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "4032:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA2_eotS =
        "\1\uffff\1\3\3\uffff\1\6\2\uffff";
    static final String DFA2_eofS =
        "\10\uffff";
    static final String DFA2_minS =
        "\1\53\1\56\1\60\2\uffff\1\56\2\uffff";
    static final String DFA2_maxS =
        "\1\71\1\145\1\71\2\uffff\1\145\2\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\1\4";
    static final String DFA2_specialS =
        "\10\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\uffff\1\2\2\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "\12\5",
            "",
            "",
            "\1\7\1\uffff\12\5\13\uffff\1\7\37\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "4032:120: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA4_eotS =
        "\2\uffff\1\7\1\11\6\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\74\1\uffff\2\75\6\uffff";
    static final String DFA4_maxS =
        "\1\151\1\uffff\1\76\1\75\6\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\2\1\4\1\3\1\6\1\5";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\1\1\3\52\uffff\1\4",
            "",
            "\1\6\1\5",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "4038:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )";
        }
    }
    static final String DFA7_eotS =
        "\4\uffff";
    static final String DFA7_eofS =
        "\4\uffff";
    static final String DFA7_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA7_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "4106:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\53\1\56\4\uffff\1\65\3\uffff\1\72\1\73\1\77\1\uffff"+
        "\1\101\3\56\2\uffff\21\56\2\51\4\uffff\2\56\1\uffff\1\56\14\uffff"+
        "\1\151\1\73\2\uffff\1\154\3\uffff\1\56\1\161\3\56\1\uffff\1\111"+
        "\1\165\6\56\1\174\1\175\7\56\1\u0086\6\56\2\uffff\2\56\1\uffff\1"+
        "\151\3\uffff\1\151\2\uffff\1\u0096\1\101\1\56\1\uffff\2\101\1\56"+
        "\1\uffff\1\56\1\u009a\2\56\1\u009d\1\u009e\2\uffff\6\56\1\u00a6"+
        "\1\56\1\uffff\4\56\1\u00ac\1\u00ad\3\56\1\uffff\1\151\1\uffff\2"+
        "\u0096\2\uffff\3\56\1\uffff\1\u00b6\1\56\2\uffff\1\u00b8\1\56\1"+
        "\u00ba\4\56\1\uffff\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\56\2\uffff"+
        "\3\56\1\uffff\1\u0096\1\56\1\u00c8\1\u00c9\1\uffff\1\u00ca\1\uffff"+
        "\1\u00cb\1\uffff\2\56\1\u00ce\1\56\4\uffff\1\u00d0\2\56\1\u00d3"+
        "\1\u00d4\4\uffff\1\u00d5\1\u00d6\1\uffff\1\56\1\uffff\1\u00d8\1"+
        "\56\4\uffff\1\u00da\1\uffff\1\56\1\uffff\1\u00dc\1\uffff";
    static final String DFA22_eofS =
        "\u00dd\uffff";
    static final String DFA22_minS =
        "\1\0\1\56\1\60\4\uffff\1\75\3\uffff\1\101\1\56\1\60\1\uffff\1\52"+
        "\3\60\2\uffff\21\60\2\0\4\uffff\2\60\1\uffff\1\60\14\uffff\2\56"+
        "\1\53\1\uffff\1\56\3\uffff\5\60\1\uffff\30\60\2\uffff\2\60\1\uffff"+
        "\1\56\1\53\1\uffff\1\60\1\56\1\uffff\1\53\1\56\2\60\1\uffff\3\60"+
        "\1\uffff\6\60\2\uffff\10\60\1\uffff\12\60\1\56\1\60\2\56\1\53\1"+
        "\uffff\3\60\1\uffff\2\60\2\uffff\7\60\1\uffff\5\60\2\uffff\4\60"+
        "\1\56\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\4\60\4\uffff\5\60\4"+
        "\uffff\2\60\1\uffff\1\60\1\uffff\2\60\4\uffff\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\56\1\172\4\uffff\1\75\3\uffff\1\172\1\145\1\71\1\uffff"+
        "\1\57\3\172\2\uffff\21\172\2\uffff\4\uffff\2\172\1\uffff\1\172\14"+
        "\uffff\2\145\1\71\1\uffff\1\145\3\uffff\5\172\1\uffff\30\172\2\uffff"+
        "\2\172\1\uffff\1\145\1\71\1\uffff\2\71\1\uffff\1\71\1\145\2\172"+
        "\1\uffff\3\172\1\uffff\6\172\2\uffff\10\172\1\uffff\11\172\4\71"+
        "\1\145\1\71\1\uffff\3\172\1\uffff\2\172\2\uffff\7\172\1\uffff\5"+
        "\172\2\uffff\3\172\2\71\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\4\172\4\uffff\5\172\4\uffff\2\172\1\uffff\1\172\1\uffff\2\172\4"+
        "\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\3\uffff\1\20\4"+
        "\uffff\2\21\23\uffff\1\77\1\100\1\14\1\1\2\uffff\1\67\1\uffff\1"+
        "\3\1\4\1\5\1\6\1\10\1\7\1\11\1\12\1\13\1\72\1\15\1\61\3\uffff\1"+
        "\17\1\uffff\1\20\1\75\1\76\5\uffff\1\21\30\uffff\1\74\1\77\2\uffff"+
        "\1\16\2\uffff\1\63\2\uffff\1\60\4\uffff\1\32\3\uffff\1\40\6\uffff"+
        "\1\27\1\44\10\uffff\1\36\17\uffff\1\62\3\uffff\1\23\2\uffff\1\25"+
        "\1\26\7\uffff\1\35\5\uffff\1\53\1\55\10\uffff\1\42\1\uffff\1\30"+
        "\1\uffff\1\45\4\uffff\1\54\1\41\1\47\1\43\5\uffff\1\51\1\22\1\24"+
        "\1\31\2\uffff\1\34\1\uffff\1\46\2\uffff\1\50\1\37\1\33\1\52\1\uffff"+
        "\1\2\1\uffff\1\57\1\uffff\1\56";
    static final String DFA22_specialS =
        "\1\1\45\uffff\1\0\1\2\u00b5\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\46\4\51\1\47\1\3\1"+
            "\4\1\16\1\15\1\6\1\15\1\1\1\17\12\14\1\7\1\5\1\23\1\12\1\24"+
            "\2\51\32\44\1\10\1\51\1\11\1\13\1\45\1\51\1\22\1\26\1\41\1\20"+
            "\1\27\1\37\1\33\1\44\1\25\2\44\1\30\1\21\1\31\1\32\1\2\1\44"+
            "\1\35\1\42\1\40\1\36\1\43\1\34\3\44\uff85\51",
            "\1\52",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\55\20\57\1\54"+
            "\10\57",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\74\1\uffff\12\75\13\uffff\1\76\37\uffff\1\76",
            "\12\100",
            "",
            "\1\102\4\uffff\1\103",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\104\5\57"+
            "\1\105\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\106\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\107\3\57"+
            "\1\110\10\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\113\7\57"+
            "\1\112\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\114\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\116\1\57"+
            "\1\115\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\117\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\120\5\57"+
            "\1\121\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\123\13\57"+
            "\1\122\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\124\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\125\1\126"+
            "\21\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\127\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\130\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\132\5\57"+
            "\1\131\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\134\6\57"+
            "\1\133\11\57\1\135\1\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\136\15\57\1\137"+
            "\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\140\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\141\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\0\142",
            "\0\142",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\144\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\145\27\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146\1\uffff\12\147\13\uffff\1\150\37\uffff\1\150",
            "\1\74\1\uffff\12\75\13\uffff\1\76\37\uffff\1\76",
            "\1\152\1\uffff\1\152\2\uffff\12\153",
            "",
            "\1\156\1\uffff\12\100\13\uffff\1\155\37\uffff\1\155",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\157\4\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\26\57\1\160\3\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\162\26\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\163\26\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\164\10\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\166\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\167\26\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\170\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\171\30\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\172\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\173\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\176\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\177\21\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0080\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0082\14"+
            "\57\1\u0081\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0083\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0084\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0085\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0087\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u0088\12"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0089\7"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u008a\14"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008b\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u008c\10"+
            "\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u008e\3\57"+
            "\1\u008d\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u008f\17"+
            "\57",
            "",
            "\1\146\1\uffff\12\147\13\uffff\1\150\37\uffff\1\150",
            "\1\u0090\1\uffff\1\u0090\2\uffff\12\u0091",
            "",
            "\12\153",
            "\1\146\1\uffff\12\153",
            "",
            "\1\u0092\1\uffff\1\u0092\2\uffff\12\u0093",
            "\1\146\1\uffff\12\u0094\13\uffff\1\u0095\37\uffff\1\u0095",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0097\14"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0098\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0099\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u009b\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u009c\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u009f\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a0\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00a1\22"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a2\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00a3\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00a4\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\26\57\1\u00a5\3"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a7\25"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00a8\14"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a9\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00aa\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00ab\7"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00ae\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00af\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b0\25"+
            "\57",
            "\12\u0091",
            "\1\146\1\uffff\12\u0091",
            "\12\u0093",
            "\1\146\1\uffff\12\u0093",
            "\1\146\1\uffff\12\u0094\13\uffff\1\u0095\37\uffff\1\u0095",
            "\1\u00b1\1\uffff\1\u00b1\2\uffff\12\u00b2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00b3\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u00b4\1"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00b5\14"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00b7\16"+
            "\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b9\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00bb\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00bc\10"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00bd\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00be\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c3\6"+
            "\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c4\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00c5\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00c6\26"+
            "\57",
            "\12\u00b2",
            "\1\146\1\uffff\12\u00b2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00c7\13"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00cc\6"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00cd\26"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00cf\10"+
            "\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00d1\15"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00d2\5"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00d7\26"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00d9\10"+
            "\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00db\25"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_GOTO_KEYWORD | RULE_WHILE_KEYWORD | RULE_DO_KEYWORD | RULE_REPEAT_KEYWORD | RULE_UNTIL_KEYWORD | RULE_FOR_KEYWORD | RULE_TO_KEYWORD | RULE_DOWNTO_KEYWORD | RULE_IF_KEYWORD | RULE_THEN_KEYWORD | RULE_ELSE_KEYWORD | RULE_CASE_KEYWORD | RULE_OF_KEYWORD | RULE_WITH_KEYWORD | RULE_CONST_KEYWORD | RULE_TYPE_KEYWORD | RULE_PACKED_KEYWORD | RULE_ARRAY_KEYWORD | RULE_RECORD_KEYWORD | RULE_SET_KEYWORD | RULE_FILE_KEYWORD | RULE_VAR_KEYWORD | RULE_PROCEDURE_KEYWORD | RULE_FORWARD_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='\u0000' && LA22_38<='\uFFFF')) ) {s = 98;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='.') ) {s = 1;}

                        else if ( (LA22_0=='p') ) {s = 2;}

                        else if ( (LA22_0=='(') ) {s = 3;}

                        else if ( (LA22_0==')') ) {s = 4;}

                        else if ( (LA22_0==';') ) {s = 5;}

                        else if ( (LA22_0==',') ) {s = 6;}

                        else if ( (LA22_0==':') ) {s = 7;}

                        else if ( (LA22_0=='[') ) {s = 8;}

                        else if ( (LA22_0==']') ) {s = 9;}

                        else if ( (LA22_0=='=') ) {s = 10;}

                        else if ( (LA22_0=='^') ) {s = 11;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 12;}

                        else if ( (LA22_0=='+'||LA22_0=='-') ) {s = 13;}

                        else if ( (LA22_0=='*') ) {s = 14;}

                        else if ( (LA22_0=='/') ) {s = 15;}

                        else if ( (LA22_0=='d') ) {s = 16;}

                        else if ( (LA22_0=='m') ) {s = 17;}

                        else if ( (LA22_0=='a') ) {s = 18;}

                        else if ( (LA22_0=='<') ) {s = 19;}

                        else if ( (LA22_0=='>') ) {s = 20;}

                        else if ( (LA22_0=='i') ) {s = 21;}

                        else if ( (LA22_0=='b') ) {s = 22;}

                        else if ( (LA22_0=='e') ) {s = 23;}

                        else if ( (LA22_0=='l') ) {s = 24;}

                        else if ( (LA22_0=='n') ) {s = 25;}

                        else if ( (LA22_0=='o') ) {s = 26;}

                        else if ( (LA22_0=='g') ) {s = 27;}

                        else if ( (LA22_0=='w') ) {s = 28;}

                        else if ( (LA22_0=='r') ) {s = 29;}

                        else if ( (LA22_0=='u') ) {s = 30;}

                        else if ( (LA22_0=='f') ) {s = 31;}

                        else if ( (LA22_0=='t') ) {s = 32;}

                        else if ( (LA22_0=='c') ) {s = 33;}

                        else if ( (LA22_0=='s') ) {s = 34;}

                        else if ( (LA22_0=='v') ) {s = 35;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='h'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='q'||(LA22_0>='x' && LA22_0<='z')) ) {s = 36;}

                        else if ( (LA22_0=='_') ) {s = 37;}

                        else if ( (LA22_0=='\"') ) {s = 38;}

                        else if ( (LA22_0=='\'') ) {s = 39;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 40;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='?' && LA22_0<='@')||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_39 = input.LA(1);

                        s = -1;
                        if ( ((LA22_39>='\u0000' && LA22_39<='\uFFFF')) ) {s = 98;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}