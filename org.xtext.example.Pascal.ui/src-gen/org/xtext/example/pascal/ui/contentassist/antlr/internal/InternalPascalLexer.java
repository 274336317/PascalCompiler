package org.xtext.example.pascal.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int RULE_ID=46;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ANY_OTHER=51;
    public static final int RULE_IF_KEYWORD=26;
    public static final int RULE_NUMERIC_SUBRANGE=15;
    public static final int T__61=61;
    public static final int RULE_FOR_KEYWORD=25;
    public static final int RULE_ADDITION_OPERATOR=7;
    public static final int T__60=60;
    public static final int RULE_TYPE_KEYWORD=35;
    public static final int EOF=-1;
    public static final int RULE_FILE_KEYWORD=40;
    public static final int RULE_UNTIL_KEYWORD=24;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_END_KEYWORD=17;
    public static final int RULE_THEN_KEYWORD=27;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_CASE_KEYWORD=29;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_MULTIPLICATION_OPERATOR=19;
    public static final int RULE_INT=47;
    public static final int RULE_BEGIN_KEYWORD=16;
    public static final int RULE_LETTER_EXTENDED=44;
    public static final int RULE_DOWNTO_KEYWORD=14;
    public static final int RULE_TO_KEYWORD=13;
    public static final int RULE_RELATIONAL_OPERATOR=18;
    public static final int RULE_NIL_KEYWORD=10;
    public static final int RULE_GOTO_KEYWORD=32;
    public static final int RULE_LABEL_KEYWORD=33;
    public static final int RULE_WHILE_KEYWORD=21;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=41;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_OF_KEYWORD=30;
    public static final int RULE_DO_KEYWORD=22;
    public static final int RULE_WITH_KEYWORD=31;
    public static final int RULE_CONST_KEYWORD=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_PACKED_KEYWORD=36;
    public static final int RULE_NOT_KEYWORD=20;
    public static final int RULE_SET_KEYWORD=39;
    public static final int RULE_RECORD_KEYWORD=38;
    public static final int RULE_LETTER=45;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_STRING=9;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int RULE_REPEAT_KEYWORD=23;
    public static final int RULE_ARRAY_KEYWORD=37;
    public static final int RULE_OR_KEYWORD=8;
    public static final int RULE_DIGIT_SEQUENCE=42;
    public static final int RULE_WS=50;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int RULE_DIGIT=43;
    public static final int RULE_ELSE_KEYWORD=28;
    public static final int RULE_INTEGER_NUMBER=6;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g"; }

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:11:7: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:12:7: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:12:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:13:7: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:14:7: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:14:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:15:7: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:15:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:16:7: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:16:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:17:7: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:17:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:18:7: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:18:9: ':='
            {
            match(":="); 


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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:19:7: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:19:9: '['
            {
            match('['); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:20:7: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:20:9: ']'
            {
            match(']'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:21:7: ( '=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:21:9: '='
            {
            match('='); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:22:7: ( '..' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:22:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:90: RULE_SIGNED_REAL_NUMBER
                    {
                    mRULE_SIGNED_REAL_NUMBER(); 

                    }
                    break;

            }

            match(".."); 

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:120: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:121: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:141: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:158: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8270:185: RULE_SIGNED_REAL_NUMBER
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8272:24: ( ( '+' | '-' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8272:26: ( '+' | '-' )
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:30: ( ( '*' | '/' | 'div' | 'mod' | 'and' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:33: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:37: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:41: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:47: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8274:53: 'and'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:51: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8276:56: 'in'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8278:20: ( 'begin' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8278:22: 'begin'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8280:18: ( 'end' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8280:20: 'end'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8282:20: ( 'label' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8282:22: 'label'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8284:18: ( 'nil' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8284:20: 'nil'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8286:18: ( 'not' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8286:20: 'not'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8288:17: ( 'or' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8288:19: 'or'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8290:19: ( 'goto' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8290:21: 'goto'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8292:20: ( 'while' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8292:22: 'while'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8294:17: ( 'do' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8294:19: 'do'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8296:21: ( 'repeat' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8296:23: 'repeat'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8298:20: ( 'until' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8298:22: 'until'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8300:18: ( 'for' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8300:20: 'for'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8302:17: ( 'to' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8302:19: 'to'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8304:21: ( 'downto' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8304:23: 'downto'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8306:17: ( 'if' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8306:19: 'if'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8308:19: ( 'then' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8308:21: 'then'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8310:19: ( 'else' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8310:21: 'else'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8312:19: ( 'case' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8312:21: 'case'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8314:17: ( 'of' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8314:19: 'of'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8316:19: ( 'with' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8316:21: 'with'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8318:20: ( 'const' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8318:22: 'const'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8320:19: ( 'type' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8320:21: 'type'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8322:21: ( 'packed' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8322:23: 'packed'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8324:20: ( 'array' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8324:22: 'array'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8326:21: ( 'record' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8326:23: 'record'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8328:18: ( 'set' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8328:20: 'set'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8330:19: ( 'file' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8330:21: 'file'
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

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8332:28: ( RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8332:30: RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8334:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8334:23: RULE_UNSIGNED_DIGIT_SEQUENCE
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8336:25: ( RULE_ADDITION_OPERATOR RULE_REAL_NUMBER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8336:27: RULE_ADDITION_OPERATOR RULE_REAL_NUMBER
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:18: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:21: RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:54: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:54: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:84: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:85: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8338:117: RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8340:30: ( ( RULE_DIGIT )+ )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8340:32: ( RULE_DIGIT )+
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8340:32: ( RULE_DIGIT )+
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
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8340:32: RULE_DIGIT
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8342:21: ( ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8342:23: ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8342:23: ( RULE_ADDITION_OPERATOR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8342:23: RULE_ADDITION_OPERATOR
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8344:12: ( '0' .. '9' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8344:14: '0' .. '9'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8346:17: ( RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8346:19: RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            {
            mRULE_LETTER_EXTENDED(); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8346:40: ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8348:13: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8348:15: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8350:22: ( ( RULE_LETTER | '_' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8350:24: ( RULE_LETTER | '_' )
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8352:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8352:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8352:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8352:11: '^'
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

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8352:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8354:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8354:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8354:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8354:13: '0' .. '9'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8356:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8358:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8358:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8358:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8358:52: .
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8360:41: '\\r'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8362:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8362:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8362:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8364:16: ( . )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:8364:18: .
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
        // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:8: ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_GOTO_KEYWORD | RULE_WHILE_KEYWORD | RULE_DO_KEYWORD | RULE_REPEAT_KEYWORD | RULE_UNTIL_KEYWORD | RULE_FOR_KEYWORD | RULE_TO_KEYWORD | RULE_DOWNTO_KEYWORD | RULE_IF_KEYWORD | RULE_THEN_KEYWORD | RULE_ELSE_KEYWORD | RULE_CASE_KEYWORD | RULE_OF_KEYWORD | RULE_WITH_KEYWORD | RULE_CONST_KEYWORD | RULE_TYPE_KEYWORD | RULE_PACKED_KEYWORD | RULE_ARRAY_KEYWORD | RULE_RECORD_KEYWORD | RULE_SET_KEYWORD | RULE_FILE_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=60;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:10: T__52
                {
                mT__52(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:16: T__53
                {
                mT__53(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:22: T__54
                {
                mT__54(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:28: T__55
                {
                mT__55(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:34: T__56
                {
                mT__56(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:40: T__57
                {
                mT__57(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:46: T__58
                {
                mT__58(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:52: T__59
                {
                mT__59(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:58: T__60
                {
                mT__60(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:64: T__61
                {
                mT__61(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:70: T__62
                {
                mT__62(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:76: T__63
                {
                mT__63(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:82: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:104: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:127: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:156: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:181: RULE_BEGIN_KEYWORD
                {
                mRULE_BEGIN_KEYWORD(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:200: RULE_END_KEYWORD
                {
                mRULE_END_KEYWORD(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:217: RULE_LABEL_KEYWORD
                {
                mRULE_LABEL_KEYWORD(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:236: RULE_NIL_KEYWORD
                {
                mRULE_NIL_KEYWORD(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:253: RULE_NOT_KEYWORD
                {
                mRULE_NOT_KEYWORD(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:270: RULE_OR_KEYWORD
                {
                mRULE_OR_KEYWORD(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:286: RULE_GOTO_KEYWORD
                {
                mRULE_GOTO_KEYWORD(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:304: RULE_WHILE_KEYWORD
                {
                mRULE_WHILE_KEYWORD(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:323: RULE_DO_KEYWORD
                {
                mRULE_DO_KEYWORD(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:339: RULE_REPEAT_KEYWORD
                {
                mRULE_REPEAT_KEYWORD(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:359: RULE_UNTIL_KEYWORD
                {
                mRULE_UNTIL_KEYWORD(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:378: RULE_FOR_KEYWORD
                {
                mRULE_FOR_KEYWORD(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:395: RULE_TO_KEYWORD
                {
                mRULE_TO_KEYWORD(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:411: RULE_DOWNTO_KEYWORD
                {
                mRULE_DOWNTO_KEYWORD(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:431: RULE_IF_KEYWORD
                {
                mRULE_IF_KEYWORD(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:447: RULE_THEN_KEYWORD
                {
                mRULE_THEN_KEYWORD(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:465: RULE_ELSE_KEYWORD
                {
                mRULE_ELSE_KEYWORD(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:483: RULE_CASE_KEYWORD
                {
                mRULE_CASE_KEYWORD(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:501: RULE_OF_KEYWORD
                {
                mRULE_OF_KEYWORD(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:517: RULE_WITH_KEYWORD
                {
                mRULE_WITH_KEYWORD(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:535: RULE_CONST_KEYWORD
                {
                mRULE_CONST_KEYWORD(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:554: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:572: RULE_PACKED_KEYWORD
                {
                mRULE_PACKED_KEYWORD(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:592: RULE_ARRAY_KEYWORD
                {
                mRULE_ARRAY_KEYWORD(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:611: RULE_RECORD_KEYWORD
                {
                mRULE_RECORD_KEYWORD(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:631: RULE_SET_KEYWORD
                {
                mRULE_SET_KEYWORD(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:648: RULE_FILE_KEYWORD
                {
                mRULE_FILE_KEYWORD(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:666: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:693: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:713: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:737: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:754: RULE_UNSIGNED_DIGIT_SEQUENCE
                {
                mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:783: RULE_DIGIT_SEQUENCE
                {
                mRULE_DIGIT_SEQUENCE(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:803: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:814: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:830: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:842: RULE_LETTER_EXTENDED
                {
                mRULE_LETTER_EXTENDED(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:863: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:871: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:880: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:892: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:908: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:924: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:932: RULE_ANY_OTHER
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
            return "8270:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
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
            return "8270:120: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
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
            return "8276:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )";
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
            return "8338:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\52\1\55\4\uffff\1\64\3\uffff\1\70\1\74\1\uffff\1\76"+
        "\3\55\2\uffff\20\55\3\50\4\uffff\2\55\1\uffff\1\55\12\uffff\1\146"+
        "\1\70\2\uffff\1\151\3\uffff\1\55\1\156\3\55\1\uffff\1\106\1\162"+
        "\6\55\1\171\1\172\7\55\1\u0083\5\55\3\uffff\2\55\1\uffff\1\146\3"+
        "\uffff\1\146\1\uffff\1\u008f\1\uffff\1\76\1\55\1\uffff\2\76\1\55"+
        "\1\uffff\1\55\1\u0095\2\55\1\u0098\1\u0099\2\uffff\6\55\1\u00a0"+
        "\1\55\1\uffff\4\55\1\u00a6\2\55\1\uffff\1\146\1\u008f\3\uffff\1"+
        "\u008f\3\55\1\uffff\1\u00ae\1\55\2\uffff\1\u00b0\1\55\1\u00b2\3"+
        "\55\1\uffff\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\55\1\uffff\2\55\1"+
        "\uffff\1\u008f\1\55\1\u00be\1\u00bf\1\uffff\1\u00c0\1\uffff\1\u00c1"+
        "\1\uffff\2\55\1\u00c4\4\uffff\1\u00c5\1\55\1\u00c7\1\u00c8\4\uffff"+
        "\1\u00c9\1\u00ca\2\uffff\1\u00cb\5\uffff";
    static final String DFA22_eofS =
        "\u00cc\uffff";
    static final String DFA22_minS =
        "\1\0\1\56\1\60\4\uffff\1\75\3\uffff\1\56\1\60\1\uffff\1\52\3\60"+
        "\2\uffff\20\60\1\101\2\0\4\uffff\2\60\1\uffff\1\60\12\uffff\2\56"+
        "\1\53\1\uffff\1\56\3\uffff\5\60\1\uffff\27\60\3\uffff\2\60\1\uffff"+
        "\1\56\1\53\1\uffff\1\60\1\56\1\uffff\1\56\1\53\2\60\1\uffff\3\60"+
        "\1\uffff\6\60\2\uffff\10\60\1\uffff\10\60\2\56\1\53\1\uffff\1\60"+
        "\1\56\3\60\1\uffff\2\60\2\uffff\6\60\1\uffff\5\60\1\uffff\3\60\1"+
        "\56\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\4\uffff\4\60\4\uffff"+
        "\2\60\2\uffff\1\60\5\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\56\1\172\4\uffff\1\75\3\uffff\1\145\1\71\1\uffff\1\57"+
        "\3\172\2\uffff\21\172\2\uffff\4\uffff\2\172\1\uffff\1\172\12\uffff"+
        "\2\145\1\71\1\uffff\1\145\3\uffff\5\172\1\uffff\27\172\3\uffff\2"+
        "\172\1\uffff\1\145\1\71\1\uffff\2\71\1\uffff\1\145\1\71\2\172\1"+
        "\uffff\3\172\1\uffff\6\172\2\uffff\10\172\1\uffff\7\172\2\71\1\145"+
        "\1\71\1\uffff\2\71\3\172\1\uffff\2\172\2\uffff\6\172\1\uffff\5\172"+
        "\1\uffff\2\172\2\71\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3"+
        "\172\4\uffff\4\172\4\uffff\2\172\2\uffff\1\172\5\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\2\uffff\1\17\4"+
        "\uffff\2\20\23\uffff\1\73\1\74\1\14\1\1\2\uffff\1\63\1\uffff\1\3"+
        "\1\4\1\5\1\6\1\10\1\7\1\11\1\12\1\13\1\55\3\uffff\1\16\1\uffff\1"+
        "\17\1\71\1\72\5\uffff\1\20\27\uffff\1\66\1\70\1\73\2\uffff\1\15"+
        "\2\uffff\1\57\2\uffff\1\54\4\uffff\1\31\3\uffff\1\37\6\uffff\1\26"+
        "\1\43\10\uffff\1\35\13\uffff\1\56\5\uffff\1\22\2\uffff\1\24\1\25"+
        "\6\uffff\1\34\5\uffff\1\52\7\uffff\1\41\1\uffff\1\27\1\uffff\1\44"+
        "\3\uffff\1\53\1\40\1\46\1\42\4\uffff\1\50\1\21\1\23\1\30\2\uffff"+
        "\1\33\1\45\1\uffff\1\47\1\36\1\32\1\51\1\2";
    static final String DFA22_specialS =
        "\1\0\44\uffff\1\1\1\2\u00a5\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\45\4\50\1\46\1\4\1"+
            "\5\1\15\1\14\1\6\1\14\1\1\1\16\12\13\1\7\1\3\1\22\1\12\1\23"+
            "\2\50\32\42\1\10\1\50\1\11\1\44\1\43\1\50\1\21\1\25\1\40\1\17"+
            "\1\26\1\36\1\32\1\42\1\24\2\42\1\27\1\20\1\30\1\31\1\2\1\42"+
            "\1\34\1\41\1\37\1\35\1\42\1\33\3\42\uff85\50",
            "\1\51",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\54\20\56\1\53"+
            "\10\56",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "\1\71\1\uffff\12\72\13\uffff\1\73\37\uffff\1\73",
            "\12\75",
            "",
            "\1\77\4\uffff\1\100",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\101\5\56"+
            "\1\102\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\103\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\104\3\56"+
            "\1\105\10\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\110\7\56"+
            "\1\107\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\111\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\113\1\56"+
            "\1\112\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\114\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\115\5\56"+
            "\1\116\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\120\13\56"+
            "\1\117\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\121\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\122\1\123"+
            "\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\124\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\125\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\127\5\56"+
            "\1\126\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\131\6\56"+
            "\1\130\11\56\1\132\1\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\133\15\56\1\134"+
            "\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\135\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\32\136\4\uffff\1\136\1\uffff\32\136",
            "\0\137",
            "\0\137",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\141\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\142\27\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\143\1\uffff\12\144\13\uffff\1\145\37\uffff\1\145",
            "\1\71\1\uffff\12\72\13\uffff\1\73\37\uffff\1\73",
            "\1\147\1\uffff\1\147\2\uffff\12\150",
            "",
            "\1\152\1\uffff\12\75\13\uffff\1\153\37\uffff\1\153",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\154\4\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\26\56\1\155\3\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\157\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\160\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\161\10\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\163\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\164\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\165\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\166\30\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\167\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\170\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\173\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\174\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\175\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\177\14\56"+
            "\1\176\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0080\6"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0081\10"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0082\16"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0084\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0085\12"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0086\7"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0087\14"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0088\6"+
            "\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0089\23"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u008a\17"+
            "\56",
            "",
            "\1\143\1\uffff\12\144\13\uffff\1\145\37\uffff\1\145",
            "\1\u008b\1\uffff\1\u008b\2\uffff\12\u008c",
            "",
            "\12\150",
            "\1\143\1\uffff\12\150",
            "",
            "\1\143\1\uffff\12\u008d\13\uffff\1\u008e\37\uffff\1\u008e",
            "\1\u0090\1\uffff\1\u0090\2\uffff\12\u0091",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0092\14"+
            "\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0093\31\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0094\21"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0096\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0097\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u009a\13"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u009b\16"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u009c\22"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u009d\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u009e\13"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u009f\21"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a1\25"+
            "\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00a2\14"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a3\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a4\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00a5\7"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00a7\10"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a8\25"+
            "\56",
            "\12\u008c",
            "\1\143\1\uffff\12\u008c",
            "\1\143\1\uffff\12\u008d\13\uffff\1\u008e\37\uffff\1\u008e",
            "\1\u00a9\1\uffff\1\u00a9\2\uffff\12\u00aa",
            "",
            "\12\u0091",
            "\1\143\1\uffff\12\u0091",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ab\6"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00ac\1"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00ad\14"+
            "\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00af\16"+
            "\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b1\25"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b3\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00b4\10"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00b5\16"+
            "\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ba\6"+
            "\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00bb\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00bc\26"+
            "\56",
            "\12\u00aa",
            "\1\143\1\uffff\12\u00aa",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00bd\13"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00c2\6"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00c3\26"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00c6\15"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_GOTO_KEYWORD | RULE_WHILE_KEYWORD | RULE_DO_KEYWORD | RULE_REPEAT_KEYWORD | RULE_UNTIL_KEYWORD | RULE_FOR_KEYWORD | RULE_TO_KEYWORD | RULE_DOWNTO_KEYWORD | RULE_IF_KEYWORD | RULE_THEN_KEYWORD | RULE_ELSE_KEYWORD | RULE_CASE_KEYWORD | RULE_OF_KEYWORD | RULE_WITH_KEYWORD | RULE_CONST_KEYWORD | RULE_TYPE_KEYWORD | RULE_PACKED_KEYWORD | RULE_ARRAY_KEYWORD | RULE_RECORD_KEYWORD | RULE_SET_KEYWORD | RULE_FILE_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='.') ) {s = 1;}

                        else if ( (LA22_0=='p') ) {s = 2;}

                        else if ( (LA22_0==';') ) {s = 3;}

                        else if ( (LA22_0=='(') ) {s = 4;}

                        else if ( (LA22_0==')') ) {s = 5;}

                        else if ( (LA22_0==',') ) {s = 6;}

                        else if ( (LA22_0==':') ) {s = 7;}

                        else if ( (LA22_0=='[') ) {s = 8;}

                        else if ( (LA22_0==']') ) {s = 9;}

                        else if ( (LA22_0=='=') ) {s = 10;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 11;}

                        else if ( (LA22_0=='+'||LA22_0=='-') ) {s = 12;}

                        else if ( (LA22_0=='*') ) {s = 13;}

                        else if ( (LA22_0=='/') ) {s = 14;}

                        else if ( (LA22_0=='d') ) {s = 15;}

                        else if ( (LA22_0=='m') ) {s = 16;}

                        else if ( (LA22_0=='a') ) {s = 17;}

                        else if ( (LA22_0=='<') ) {s = 18;}

                        else if ( (LA22_0=='>') ) {s = 19;}

                        else if ( (LA22_0=='i') ) {s = 20;}

                        else if ( (LA22_0=='b') ) {s = 21;}

                        else if ( (LA22_0=='e') ) {s = 22;}

                        else if ( (LA22_0=='l') ) {s = 23;}

                        else if ( (LA22_0=='n') ) {s = 24;}

                        else if ( (LA22_0=='o') ) {s = 25;}

                        else if ( (LA22_0=='g') ) {s = 26;}

                        else if ( (LA22_0=='w') ) {s = 27;}

                        else if ( (LA22_0=='r') ) {s = 28;}

                        else if ( (LA22_0=='u') ) {s = 29;}

                        else if ( (LA22_0=='f') ) {s = 30;}

                        else if ( (LA22_0=='t') ) {s = 31;}

                        else if ( (LA22_0=='c') ) {s = 32;}

                        else if ( (LA22_0=='s') ) {s = 33;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='h'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='q'||LA22_0=='v'||(LA22_0>='x' && LA22_0<='z')) ) {s = 34;}

                        else if ( (LA22_0=='_') ) {s = 35;}

                        else if ( (LA22_0=='^') ) {s = 36;}

                        else if ( (LA22_0=='\"') ) {s = 37;}

                        else if ( (LA22_0=='\'') ) {s = 38;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 39;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='?' && LA22_0<='@')||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_37 = input.LA(1);

                        s = -1;
                        if ( ((LA22_37>='\u0000' && LA22_37<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='\u0000' && LA22_38<='\uFFFF')) ) {s = 95;}

                        else s = 40;

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