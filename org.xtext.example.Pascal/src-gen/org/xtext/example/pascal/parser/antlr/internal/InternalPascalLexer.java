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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_ID=14;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__44=44;
    public static final int T__27=27;
    public static final int RULE_SCALE_FACTOR=10;
    public static final int T__45=45;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=9;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_SIGN=6;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int RULE_LETTER=13;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=16;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int RULE_REAL_NUMBER=7;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=15;
    public static final int RULE_DIGIT_SEQUENCE=8;
    public static final int RULE_WS=19;
    public static final int RULE_DIGIT=12;
    public static final int RULE_LETTER_EXTENDED=11;
    public static final int RULE_INTEGER_NUMBER=5;

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

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:17:7: ( 'begin' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:17:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:18:7: ( 'end' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:18:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:19:7: ( ':' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:20:7: ( ':=' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:22:7: ( '<>' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:22:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:23:7: ( '<' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:24:7: ( '<=' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:25:7: ( '>' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:26:7: ( '>=' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:27:7: ( 'in' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:27:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:28:7: ( '+' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:29:7: ( '-' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:30:7: ( 'or' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:30:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:31:7: ( '*' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:32:7: ( '/' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:33:7: ( 'div' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:33:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:34:7: ( 'mod' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:34:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:35:7: ( 'and' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:35:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:36:7: ( 'label' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:36:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1151:21: ( RULE_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1151:23: RULE_DIGIT_SEQUENCE
            {
            mRULE_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:18: ( ( RULE_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( RULE_SCALE_FACTOR )? | RULE_DIGIT_SEQUENCE RULE_SCALE_FACTOR ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:20: ( RULE_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( RULE_SCALE_FACTOR )? | RULE_DIGIT_SEQUENCE RULE_SCALE_FACTOR )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:20: ( RULE_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( RULE_SCALE_FACTOR )? | RULE_DIGIT_SEQUENCE RULE_SCALE_FACTOR )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:21: RULE_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( RULE_SCALE_FACTOR )?
                    {
                    mRULE_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:45: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:45: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:75: ( RULE_SCALE_FACTOR )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:75: RULE_SCALE_FACTOR
                            {
                            mRULE_SCALE_FACTOR(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1153:94: RULE_DIGIT_SEQUENCE RULE_SCALE_FACTOR
                    {
                    mRULE_DIGIT_SEQUENCE(); 
                    mRULE_SCALE_FACTOR(); 

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

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1155:17: ( RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1155:19: RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            {
            mRULE_LETTER_EXTENDED(); 
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1155:40: ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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

    // $ANTLR start "RULE_SCALE_FACTOR"
    public final void mRULE_SCALE_FACTOR() throws RecognitionException {
        try {
            int _type = RULE_SCALE_FACTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1157:19: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1157:21: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALE_FACTOR"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1159:21: ( ( RULE_SIGN )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1159:23: ( RULE_SIGN )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1159:23: ( RULE_SIGN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1159:23: RULE_SIGN
                    {
                    mRULE_SIGN(); 

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

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:30: ( RULE_DIGIT ( RULE_DIGIT )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:32: RULE_DIGIT ( RULE_DIGIT )*
            {
            mRULE_DIGIT(); 
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:43: ( RULE_DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:43: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1163:12: ( '0' .. '9' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1163:14: '0' .. '9'
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

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1165:13: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1165:15: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1167:22: ( ( RULE_LETTER | '_' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1167:24: ( RULE_LETTER | '_' )
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

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            int _type = RULE_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1169:11: ( ( '+' | '-' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1169:13: ( '+' | '-' )
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
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:11: '^'
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1173:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1173:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1173:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1173:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1175:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1177:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1177:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1177:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1177:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1179:41: '\\r'
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1181:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1181:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1181:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1183:16: ( . )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1183:18: .
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
        // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_IDENTIFIER | RULE_SCALE_FACTOR | RULE_DIGIT_SEQUENCE | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_SIGN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=43;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:166: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:186: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:203: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:219: RULE_SCALE_FACTOR
                {
                mRULE_SCALE_FACTOR(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:237: RULE_DIGIT_SEQUENCE
                {
                mRULE_DIGIT_SEQUENCE(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:257: RULE_UNSIGNED_DIGIT_SEQUENCE
                {
                mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:286: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:297: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:309: RULE_LETTER_EXTENDED
                {
                mRULE_LETTER_EXTENDED(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:330: RULE_SIGN
                {
                mRULE_SIGN(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:340: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:348: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:357: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:369: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:385: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:401: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1:409: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\53\1\60\2\56\2\uffff";
    static final String DFA3_maxS =
        "\2\71\2\145\2\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\12\2",
            "\12\2",
            "\1\5\1\uffff\12\3\13\uffff\1\4\37\uffff\1\4",
            "\1\5\1\uffff\12\3\13\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1153:20: ( RULE_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( RULE_SCALE_FACTOR )? | RULE_DIGIT_SEQUENCE RULE_SCALE_FACTOR )";
        }
    }
    static final String DFA18_eotS =
        "\2\uffff\1\42\4\uffff\2\42\1\55\1\uffff\1\61\1\63\1\42\1\65\1\67"+
        "\1\42\1\uffff\1\74\4\42\1\101\3\42\3\37\3\uffff\1\42\1\uffff\1\42"+
        "\4\uffff\3\42\11\uffff\1\113\1\uffff\1\101\1\uffff\1\115\4\uffff"+
        "\4\42\1\uffff\1\101\4\uffff\2\42\1\124\1\42\1\uffff\1\101\1\uffff"+
        "\1\125\1\126\1\127\3\42\4\uffff\2\42\1\135\1\136\1\42\2\uffff\1"+
        "\140\1\uffff";
    static final String DFA18_eofS =
        "\141\uffff";
    static final String DFA18_minS =
        "\1\0\1\uffff\1\60\4\uffff\1\60\1\53\1\75\1\uffff\2\75\4\60\1\uffff"+
        "\1\52\4\60\1\56\1\53\2\60\1\101\2\0\3\uffff\1\60\1\uffff\1\60\4"+
        "\uffff\3\60\11\uffff\1\60\1\uffff\1\56\1\uffff\1\60\4\uffff\4\60"+
        "\1\uffff\1\56\4\uffff\4\60\1\uffff\1\56\1\uffff\6\60\4\uffff\5\60"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\uffff\1\172\4\uffff\2\172\1\75\1\uffff\1\76\1\75\1\172"+
        "\2\71\1\172\1\uffff\1\57\4\172\1\145\4\172\2\uffff\3\uffff\1\172"+
        "\1\uffff\1\172\4\uffff\3\172\11\uffff\1\172\1\uffff\1\145\1\uffff"+
        "\1\172\4\uffff\4\172\1\uffff\1\145\4\uffff\4\172\1\uffff\1\145\1"+
        "\uffff\6\172\4\uffff\5\172\2\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\3\uffff\1\13\6\uffff\1\25"+
        "\14\uffff\1\52\1\53\1\1\1\uffff\1\35\1\uffff\1\3\1\4\1\5\1\6\3\uffff"+
        "\1\36\1\12\1\11\1\13\1\14\1\16\1\15\1\20\1\17\1\uffff\1\22\1\uffff"+
        "\1\23\1\uffff\1\25\1\50\1\51\1\26\4\uffff\1\33\1\uffff\1\34\1\45"+
        "\1\47\1\52\4\uffff\1\21\1\uffff\1\24\6\uffff\1\10\1\27\1\30\1\31"+
        "\5\uffff\1\7\1\32\1\uffff\1\2";
    static final String DFA18_specialS =
        "\1\1\33\uffff\1\0\1\2\103\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\4\37\1\35\1\3\1"+
            "\4\1\21\1\16\1\6\1\17\1\1\1\22\12\27\1\11\1\5\1\13\1\12\1\14"+
            "\2\37\4\31\1\30\25\31\3\37\1\33\1\32\1\37\1\25\1\7\1\31\1\23"+
            "\1\10\3\31\1\15\2\31\1\26\1\24\1\31\1\20\1\2\12\31\uff85\37",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\41\10\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\50\25\43",
            "\1\53\1\uffff\1\53\2\uffff\12\52\7\uffff\32\43\4\uffff\1\43"+
            "\1\uffff\15\43\1\51\14\43",
            "\1\54",
            "",
            "\1\60\1\57",
            "\1\62",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\64\14\43",
            "\12\66",
            "\12\66",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\70\10\43",
            "",
            "\1\72\4\uffff\1\73",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\75\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\76\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\77\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\100\31\43",
            "\1\103\1\uffff\12\102\13\uffff\1\103\37\uffff\1\103",
            "\1\53\1\uffff\1\53\2\uffff\12\52\7\uffff\32\43\4\uffff\1\43"+
            "\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "\0\105",
            "\0\105",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\107\13\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\110\23\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\111\26\43",
            "\12\112\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\103\1\uffff\12\114\13\uffff\1\103\37\uffff\1\103",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\116\4\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\117\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\120\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\43\1\121\30\43",
            "",
            "\1\103\1\uffff\12\102\13\uffff\1\103\37\uffff\1\103",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\122\23\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\123\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\112\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\103\1\uffff\12\114\13\uffff\1\103\37\uffff\1\103",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\130\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\131\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\132\14\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\133\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\134\31\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\137\15\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_IDENTIFIER | RULE_SCALE_FACTOR | RULE_DIGIT_SEQUENCE | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_SIGN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_28 = input.LA(1);

                        s = -1;
                        if ( ((LA18_28>='\u0000' && LA18_28<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='.') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0=='(') ) {s = 3;}

                        else if ( (LA18_0==')') ) {s = 4;}

                        else if ( (LA18_0==';') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0=='b') ) {s = 7;}

                        else if ( (LA18_0=='e') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0=='=') ) {s = 10;}

                        else if ( (LA18_0=='<') ) {s = 11;}

                        else if ( (LA18_0=='>') ) {s = 12;}

                        else if ( (LA18_0=='i') ) {s = 13;}

                        else if ( (LA18_0=='+') ) {s = 14;}

                        else if ( (LA18_0=='-') ) {s = 15;}

                        else if ( (LA18_0=='o') ) {s = 16;}

                        else if ( (LA18_0=='*') ) {s = 17;}

                        else if ( (LA18_0=='/') ) {s = 18;}

                        else if ( (LA18_0=='d') ) {s = 19;}

                        else if ( (LA18_0=='m') ) {s = 20;}

                        else if ( (LA18_0=='a') ) {s = 21;}

                        else if ( (LA18_0=='l') ) {s = 22;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 23;}

                        else if ( (LA18_0=='E') ) {s = 24;}

                        else if ( ((LA18_0>='A' && LA18_0<='D')||(LA18_0>='F' && LA18_0<='Z')||LA18_0=='c'||(LA18_0>='f' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='n'||(LA18_0>='q' && LA18_0<='z')) ) {s = 25;}

                        else if ( (LA18_0=='_') ) {s = 26;}

                        else if ( (LA18_0=='^') ) {s = 27;}

                        else if ( (LA18_0=='\"') ) {s = 28;}

                        else if ( (LA18_0=='\'') ) {s = 29;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 30;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='?' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_29 = input.LA(1);

                        s = -1;
                        if ( ((LA18_29>='\u0000' && LA18_29<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}