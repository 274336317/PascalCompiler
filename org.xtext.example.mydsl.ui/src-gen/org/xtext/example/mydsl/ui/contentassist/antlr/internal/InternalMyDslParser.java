package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'E'", "'e'", "'+'", "'-'", "'Hello'", "'!'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=4;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=21)||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Greeting__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Greeting__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Greeting__Alternatives )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Greeting__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting155);
            rule__Greeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( rulenumber EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber182);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: rulenumber : ( ( rule__Number__Group__0 ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Number__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Number__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Number__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Number__Group__0
            {
            pushFollow(FOLLOW_rule__Number__Group__0_in_rulenumber215);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleREAL_NUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleREAL_NUMBER : ruleREAL_NUMBER EOF ;
    public final void entryRuleREAL_NUMBER() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleREAL_NUMBER EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleREAL_NUMBER EOF
            {
             before(grammarAccess.getREAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER244);
            ruleREAL_NUMBER();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL_NUMBER251); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREAL_NUMBER"


    // $ANTLR start "ruleREAL_NUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleREAL_NUMBER : ( ( rule__REAL_NUMBER__Alternatives ) ) ;
    public final void ruleREAL_NUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__REAL_NUMBER__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__REAL_NUMBER__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__REAL_NUMBER__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__REAL_NUMBER__Alternatives )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__REAL_NUMBER__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__REAL_NUMBER__Alternatives
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_in_ruleREAL_NUMBER277);
            rule__REAL_NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getREAL_NUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAL_NUMBER"


    // $ANTLR start "entryRuleUNSIGNED_DIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleUNSIGNED_DIGIT_SEQUENCE : ruleUNSIGNED_DIGIT_SEQUENCE EOF ;
    public final void entryRuleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleUNSIGNED_DIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleUNSIGNED_DIGIT_SEQUENCE EOF
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE304);
            ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUNSIGNED_DIGIT_SEQUENCE"


    // $ANTLR start "ruleUNSIGNED_DIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleUNSIGNED_DIGIT_SEQUENCE : ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) ;
    public final void ruleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( RULE_DIGIT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( RULE_DIGIT )
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: ( RULE_DIGIT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:3: RULE_DIGIT
            {
            match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE340); 

            }

             after(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:1: ( ( RULE_DIGIT )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:195:1: ( RULE_DIGIT )*
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:1: ( RULE_DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DIGIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:3: RULE_DIGIT
            	    {
            	    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE353); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNSIGNED_DIGIT_SEQUENCE"


    // $ANTLR start "entryRuleDIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: entryRuleDIGIT_SEQUENCE : ruleDIGIT_SEQUENCE EOF ;
    public final void entryRuleDIGIT_SEQUENCE() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ( ruleDIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleDIGIT_SEQUENCE EOF
            {
             before(grammarAccess.getDIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE383);
            ruleDIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getDIGIT_SEQUENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDIGIT_SEQUENCE"


    // $ANTLR start "ruleDIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ruleDIGIT_SEQUENCE : ( ( rule__DIGIT_SEQUENCE__Group__0 ) ) ;
    public final void ruleDIGIT_SEQUENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:222:2: ( ( ( rule__DIGIT_SEQUENCE__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( ( rule__DIGIT_SEQUENCE__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( ( rule__DIGIT_SEQUENCE__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:224:1: ( rule__DIGIT_SEQUENCE__Group__0 )
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:1: ( rule__DIGIT_SEQUENCE__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:2: rule__DIGIT_SEQUENCE__Group__0
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__0_in_ruleDIGIT_SEQUENCE416);
            rule__DIGIT_SEQUENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDIGIT_SEQUENCEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDIGIT_SEQUENCE"


    // $ANTLR start "rule__Greeting__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: rule__Greeting__Alternatives : ( ( ( rule__Greeting__Group_0__0 ) ) | ( rulenumber ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ( ( ( rule__Greeting__Group_0__0 ) ) | ( rulenumber ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Greeting__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Greeting__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Greeting__Group_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Greeting__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Greeting__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives452);
                    rule__Greeting__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:248:6: ( rulenumber )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:248:6: ( rulenumber )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: rulenumber
                    {
                     before(grammarAccess.getGreetingAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Greeting__Alternatives470);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Alternatives"


    // $ANTLR start "rule__Number__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: rule__Number__Alternatives_0 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Number__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            case 20:
                {
                alt4=9;
                }
                break;
            case 21:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( '0' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ( '0' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: '0'
                    {
                     before(grammarAccess.getNumberAccess().getDigitZeroKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Number__Alternatives_0503); 
                     after(grammarAccess.getNumberAccess().getDigitZeroKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:6: ( '1' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:6: ( '1' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: '1'
                    {
                     before(grammarAccess.getNumberAccess().getDigitOneKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Number__Alternatives_0523); 
                     after(grammarAccess.getNumberAccess().getDigitOneKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:6: ( '2' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:6: ( '2' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: '2'
                    {
                     before(grammarAccess.getNumberAccess().getDigitTwoKeyword_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__Number__Alternatives_0543); 
                     after(grammarAccess.getNumberAccess().getDigitTwoKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:6: ( '3' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:6: ( '3' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: '3'
                    {
                     before(grammarAccess.getNumberAccess().getDigitThreeKeyword_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__Number__Alternatives_0563); 
                     after(grammarAccess.getNumberAccess().getDigitThreeKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:6: ( '4' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:6: ( '4' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: '4'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFourKeyword_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__Number__Alternatives_0583); 
                     after(grammarAccess.getNumberAccess().getDigitFourKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:6: ( '5' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:6: ( '5' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: '5'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFiveKeyword_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__Number__Alternatives_0603); 
                     after(grammarAccess.getNumberAccess().getDigitFiveKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:6: ( '6' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:6: ( '6' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: '6'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSixKeyword_0_6()); 
                    match(input,18,FOLLOW_18_in_rule__Number__Alternatives_0623); 
                     after(grammarAccess.getNumberAccess().getDigitSixKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:320:6: ( '7' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:320:6: ( '7' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: '7'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSevenKeyword_0_7()); 
                    match(input,19,FOLLOW_19_in_rule__Number__Alternatives_0643); 
                     after(grammarAccess.getNumberAccess().getDigitSevenKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:6: ( '8' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:6: ( '8' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: '8'
                    {
                     before(grammarAccess.getNumberAccess().getDigitEightKeyword_0_8()); 
                    match(input,20,FOLLOW_20_in_rule__Number__Alternatives_0663); 
                     after(grammarAccess.getNumberAccess().getDigitEightKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:336:6: ( '9' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:336:6: ( '9' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: '9'
                    {
                     before(grammarAccess.getNumberAccess().getDigitNineKeyword_0_9()); 
                    match(input,21,FOLLOW_21_in_rule__Number__Alternatives_0683); 
                     after(grammarAccess.getNumberAccess().getDigitNineKeyword_0_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_0"


    // $ANTLR start "rule__Number__Alternatives_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: rule__Number__Alternatives_2 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Number__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            case 20:
                {
                alt5=9;
                }
                break;
            case 21:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( '0' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( '0' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: '0'
                    {
                     before(grammarAccess.getNumberAccess().getDigitZeroKeyword_2_0()); 
                    match(input,12,FOLLOW_12_in_rule__Number__Alternatives_2718); 
                     after(grammarAccess.getNumberAccess().getDigitZeroKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:6: ( '1' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:6: ( '1' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: '1'
                    {
                     before(grammarAccess.getNumberAccess().getDigitOneKeyword_2_1()); 
                    match(input,13,FOLLOW_13_in_rule__Number__Alternatives_2738); 
                     after(grammarAccess.getNumberAccess().getDigitOneKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:6: ( '2' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:6: ( '2' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: '2'
                    {
                     before(grammarAccess.getNumberAccess().getDigitTwoKeyword_2_2()); 
                    match(input,14,FOLLOW_14_in_rule__Number__Alternatives_2758); 
                     after(grammarAccess.getNumberAccess().getDigitTwoKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:6: ( '3' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:6: ( '3' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: '3'
                    {
                     before(grammarAccess.getNumberAccess().getDigitThreeKeyword_2_3()); 
                    match(input,15,FOLLOW_15_in_rule__Number__Alternatives_2778); 
                     after(grammarAccess.getNumberAccess().getDigitThreeKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:6: ( '4' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:6: ( '4' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: '4'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFourKeyword_2_4()); 
                    match(input,16,FOLLOW_16_in_rule__Number__Alternatives_2798); 
                     after(grammarAccess.getNumberAccess().getDigitFourKeyword_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:394:6: ( '5' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:394:6: ( '5' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: '5'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFiveKeyword_2_5()); 
                    match(input,17,FOLLOW_17_in_rule__Number__Alternatives_2818); 
                     after(grammarAccess.getNumberAccess().getDigitFiveKeyword_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:6: ( '6' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:6: ( '6' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: '6'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSixKeyword_2_6()); 
                    match(input,18,FOLLOW_18_in_rule__Number__Alternatives_2838); 
                     after(grammarAccess.getNumberAccess().getDigitSixKeyword_2_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:6: ( '7' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:6: ( '7' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: '7'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSevenKeyword_2_7()); 
                    match(input,19,FOLLOW_19_in_rule__Number__Alternatives_2858); 
                     after(grammarAccess.getNumberAccess().getDigitSevenKeyword_2_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:6: ( '8' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:6: ( '8' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: '8'
                    {
                     before(grammarAccess.getNumberAccess().getDigitEightKeyword_2_8()); 
                    match(input,20,FOLLOW_20_in_rule__Number__Alternatives_2878); 
                     after(grammarAccess.getNumberAccess().getDigitEightKeyword_2_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:6: ( '9' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:6: ( '9' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: '9'
                    {
                     before(grammarAccess.getNumberAccess().getDigitNineKeyword_2_9()); 
                    match(input,21,FOLLOW_21_in_rule__Number__Alternatives_2898); 
                     after(grammarAccess.getNumberAccess().getDigitNineKeyword_2_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_2"


    // $ANTLR start "rule__Number__Alternatives_3_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: rule__Number__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Number__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: 'E'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Number__Alternatives_3_0933); 
                     after(grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: 'e'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Number__Alternatives_3_0953); 
                     after(grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_3_0"


    // $ANTLR start "rule__Number__Alternatives_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: rule__Number__Alternatives_3_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Number__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            case 19:
                {
                alt7=8;
                }
                break;
            case 20:
                {
                alt7=9;
                }
                break;
            case 21:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( '0' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( '0' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: '0'
                    {
                     before(grammarAccess.getNumberAccess().getDigitZeroKeyword_3_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__Number__Alternatives_3_1988); 
                     after(grammarAccess.getNumberAccess().getDigitZeroKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:6: ( '1' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:6: ( '1' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: '1'
                    {
                     before(grammarAccess.getNumberAccess().getDigitOneKeyword_3_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__Number__Alternatives_3_11008); 
                     after(grammarAccess.getNumberAccess().getDigitOneKeyword_3_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:6: ( '2' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:6: ( '2' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: '2'
                    {
                     before(grammarAccess.getNumberAccess().getDigitTwoKeyword_3_1_2()); 
                    match(input,14,FOLLOW_14_in_rule__Number__Alternatives_3_11028); 
                     after(grammarAccess.getNumberAccess().getDigitTwoKeyword_3_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:6: ( '3' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:6: ( '3' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: '3'
                    {
                     before(grammarAccess.getNumberAccess().getDigitThreeKeyword_3_1_3()); 
                    match(input,15,FOLLOW_15_in_rule__Number__Alternatives_3_11048); 
                     after(grammarAccess.getNumberAccess().getDigitThreeKeyword_3_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:6: ( '4' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:6: ( '4' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:503:1: '4'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFourKeyword_3_1_4()); 
                    match(input,16,FOLLOW_16_in_rule__Number__Alternatives_3_11068); 
                     after(grammarAccess.getNumberAccess().getDigitFourKeyword_3_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:6: ( '5' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:6: ( '5' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: '5'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFiveKeyword_3_1_5()); 
                    match(input,17,FOLLOW_17_in_rule__Number__Alternatives_3_11088); 
                     after(grammarAccess.getNumberAccess().getDigitFiveKeyword_3_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:6: ( '6' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:6: ( '6' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: '6'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSixKeyword_3_1_6()); 
                    match(input,18,FOLLOW_18_in_rule__Number__Alternatives_3_11108); 
                     after(grammarAccess.getNumberAccess().getDigitSixKeyword_3_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:6: ( '7' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:6: ( '7' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: '7'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSevenKeyword_3_1_7()); 
                    match(input,19,FOLLOW_19_in_rule__Number__Alternatives_3_11128); 
                     after(grammarAccess.getNumberAccess().getDigitSevenKeyword_3_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:6: ( '8' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:6: ( '8' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: '8'
                    {
                     before(grammarAccess.getNumberAccess().getDigitEightKeyword_3_1_8()); 
                    match(input,20,FOLLOW_20_in_rule__Number__Alternatives_3_11148); 
                     after(grammarAccess.getNumberAccess().getDigitEightKeyword_3_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:6: ( '9' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:6: ( '9' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: '9'
                    {
                     before(grammarAccess.getNumberAccess().getDigitNineKeyword_3_1_9()); 
                    match(input,21,FOLLOW_21_in_rule__Number__Alternatives_3_11168); 
                     after(grammarAccess.getNumberAccess().getDigitNineKeyword_3_1_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_3_1"


    // $ANTLR start "rule__REAL_NUMBER__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: rule__REAL_NUMBER__Alternatives : ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) );
    public final void rule__REAL_NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( ( rule__REAL_NUMBER__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( ( rule__REAL_NUMBER__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:562:1: ( rule__REAL_NUMBER__Group_0__0 )
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( rule__REAL_NUMBER__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:2: rule__REAL_NUMBER__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__0_in_rule__REAL_NUMBER__Alternatives1203);
                    rule__REAL_NUMBER__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getREAL_NUMBERAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:6: ( ( rule__REAL_NUMBER__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:6: ( ( rule__REAL_NUMBER__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( rule__REAL_NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( rule__REAL_NUMBER__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:2: rule__REAL_NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__0_in_rule__REAL_NUMBER__Alternatives1221);
                    rule__REAL_NUMBER__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getREAL_NUMBERAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Alternatives"


    // $ANTLR start "rule__REAL_NUMBER__Alternatives_0_3_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: rule__REAL_NUMBER__Alternatives_0_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__REAL_NUMBER__Alternatives_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( 'E' ) | ( 'e' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: 'E'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__REAL_NUMBER__Alternatives_0_3_01255); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: 'e'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__REAL_NUMBER__Alternatives_0_3_01275); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Alternatives_0_3_0"


    // $ANTLR start "rule__REAL_NUMBER__Alternatives_1_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: rule__REAL_NUMBER__Alternatives_1_1 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__REAL_NUMBER__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( 'E' ) | ( 'e' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: 'E'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 
                    match(input,22,FOLLOW_22_in_rule__REAL_NUMBER__Alternatives_1_11310); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: 'e'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_1()); 
                    match(input,23,FOLLOW_23_in_rule__REAL_NUMBER__Alternatives_1_11330); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Alternatives_1_1"


    // $ANTLR start "rule__DIGIT_SEQUENCE__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: rule__DIGIT_SEQUENCE__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DIGIT_SEQUENCE__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( '+' ) | ( '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: '+'
                    {
                     before(grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__DIGIT_SEQUENCE__Alternatives_01365); 
                     after(grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: '-'
                    {
                     before(grammarAccess.getDIGIT_SEQUENCEAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__DIGIT_SEQUENCE__Alternatives_01385); 
                     after(grammarAccess.getDIGIT_SEQUENCEAccess().getHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIGIT_SEQUENCE__Alternatives_0"


    // $ANTLR start "rule__Greeting__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: rule__Greeting__Group_0__0 : rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 ;
    public final void rule__Greeting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:2: rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__01417);
            rule__Greeting__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__01420);
            rule__Greeting__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__0"


    // $ANTLR start "rule__Greeting__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: rule__Greeting__Group_0__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( ( 'Hello' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( 'Hello' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( 'Hello' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Greeting__Group_0__0__Impl1448); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__0__Impl"


    // $ANTLR start "rule__Greeting__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: rule__Greeting__Group_0__1 : rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 ;
    public final void rule__Greeting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__11479);
            rule__Greeting__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__11482);
            rule__Greeting__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__1"


    // $ANTLR start "rule__Greeting__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: rule__Greeting__Group_0__1__Impl : ( ( rule__Greeting__NameAssignment_0_1 ) ) ;
    public final void rule__Greeting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ( ( rule__Greeting__NameAssignment_0_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ( rule__Greeting__NameAssignment_0_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ( rule__Greeting__NameAssignment_0_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( rule__Greeting__NameAssignment_0_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rule__Greeting__NameAssignment_0_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:2: rule__Greeting__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_0_1_in_rule__Greeting__Group_0__1__Impl1509);
            rule__Greeting__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__1__Impl"


    // $ANTLR start "rule__Greeting__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: rule__Greeting__Group_0__2 : rule__Greeting__Group_0__2__Impl ;
    public final void rule__Greeting__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( rule__Greeting__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:2: rule__Greeting__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__21539);
            rule__Greeting__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__2"


    // $ANTLR start "rule__Greeting__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: rule__Greeting__Group_0__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( '!' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( '!' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( '!' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Greeting__Group_0__2__Impl1567); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:759:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__01604);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__01607);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__Number__Group__0__Impl : ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( ( rule__Number__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( rule__Number__Alternatives_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__Number__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:2: rule__Number__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_0_in_rule__Number__Group__0__Impl1636);
            rule__Number__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_0()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( ( rule__Number__Alternatives_0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( rule__Number__Alternatives_0 )*
            {
             before(grammarAccess.getNumberAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( rule__Number__Alternatives_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:2: rule__Number__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_rule__Number__Alternatives_0_in_rule__Number__Group__0__Impl1648);
            	    rule__Number__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNumberAccess().getAlternatives_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:795:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__11681);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__2_in_rule__Number__Group__11684);
            rule__Number__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: rule__Number__Group__1__Impl : ( '.' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Number__Group__1__Impl1712); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__21743);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__3_in_rule__Number__Group__21746);
            rule__Number__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: rule__Number__Group__2__Impl : ( ( ( rule__Number__Alternatives_2 ) ) ( ( rule__Number__Alternatives_2 )* ) ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( ( ( ( rule__Number__Alternatives_2 ) ) ( ( rule__Number__Alternatives_2 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( ( rule__Number__Alternatives_2 ) ) ( ( rule__Number__Alternatives_2 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( ( rule__Number__Alternatives_2 ) ) ( ( rule__Number__Alternatives_2 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__Number__Alternatives_2 ) ) ( ( rule__Number__Alternatives_2 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__Number__Alternatives_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__Number__Alternatives_2 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( rule__Number__Alternatives_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:2: rule__Number__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_2_in_rule__Number__Group__2__Impl1775);
            rule__Number__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_2()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( ( rule__Number__Alternatives_2 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( rule__Number__Alternatives_2 )*
            {
             before(grammarAccess.getNumberAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__Number__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:2: rule__Number__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Number__Alternatives_2_in_rule__Number__Group__2__Impl1787);
            	    rule__Number__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNumberAccess().getAlternatives_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__Number__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:2: rule__Number__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__31820);
            rule__Number__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: rule__Number__Group__3__Impl : ( ( rule__Number__Group_3__0 )? ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( ( ( rule__Number__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__Number__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__Number__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( rule__Number__Group_3__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__Number__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=23)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:2: rule__Number__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl1847);
                    rule__Number__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Number__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: rule__Number__Group_3__0 : rule__Number__Group_3__0__Impl rule__Number__Group_3__1 ;
    public final void rule__Number__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__Number__Group_3__0__Impl rule__Number__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:2: rule__Number__Group_3__0__Impl rule__Number__Group_3__1
            {
            pushFollow(FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__01886);
            rule__Number__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__01889);
            rule__Number__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__0"


    // $ANTLR start "rule__Number__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__Number__Group_3__0__Impl : ( ( rule__Number__Alternatives_3_0 ) ) ;
    public final void rule__Number__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( ( rule__Number__Alternatives_3_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( rule__Number__Alternatives_3_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( rule__Number__Alternatives_3_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( rule__Number__Alternatives_3_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__Number__Alternatives_3_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:2: rule__Number__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_3_0_in_rule__Number__Group_3__0__Impl1916);
            rule__Number__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__0__Impl"


    // $ANTLR start "rule__Number__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: rule__Number__Group_3__1 : rule__Number__Group_3__1__Impl ;
    public final void rule__Number__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( rule__Number__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:2: rule__Number__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__11946);
            rule__Number__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__1"


    // $ANTLR start "rule__Number__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: rule__Number__Group_3__1__Impl : ( ( ( rule__Number__Alternatives_3_1 ) ) ( ( rule__Number__Alternatives_3_1 )* ) ) ;
    public final void rule__Number__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( ( ( ( rule__Number__Alternatives_3_1 ) ) ( ( rule__Number__Alternatives_3_1 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( ( ( rule__Number__Alternatives_3_1 ) ) ( ( rule__Number__Alternatives_3_1 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( ( ( rule__Number__Alternatives_3_1 ) ) ( ( rule__Number__Alternatives_3_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( rule__Number__Alternatives_3_1 ) ) ( ( rule__Number__Alternatives_3_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( rule__Number__Alternatives_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__Number__Alternatives_3_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__Number__Alternatives_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__Number__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1975);
            rule__Number__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_3_1()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( rule__Number__Alternatives_3_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__Number__Alternatives_3_1 )*
            {
             before(grammarAccess.getNumberAccess().getAlternatives_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__Number__Alternatives_3_1 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:2: rule__Number__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1987);
            	    rule__Number__Alternatives_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNumberAccess().getAlternatives_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__1__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__REAL_NUMBER__Group_0__0 : rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1 ;
    public final void rule__REAL_NUMBER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:2: rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__0__Impl_in_rule__REAL_NUMBER__Group_0__02025);
            rule__REAL_NUMBER__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__1_in_rule__REAL_NUMBER__Group_0__02028);
            rule__REAL_NUMBER__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__0"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: rule__REAL_NUMBER__Group_0__0__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__0__Impl2055);
            ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__0__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: rule__REAL_NUMBER__Group_0__1 : rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2 ;
    public final void rule__REAL_NUMBER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__1__Impl_in_rule__REAL_NUMBER__Group_0__12084);
            rule__REAL_NUMBER__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__2_in_rule__REAL_NUMBER__Group_0__12087);
            rule__REAL_NUMBER__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__1"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: rule__REAL_NUMBER__Group_0__1__Impl : ( '.' ) ;
    public final void rule__REAL_NUMBER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: '.'
            {
             before(grammarAccess.getREAL_NUMBERAccess().getFullStopKeyword_0_1()); 
            match(input,28,FOLLOW_28_in_rule__REAL_NUMBER__Group_0__1__Impl2115); 
             after(grammarAccess.getREAL_NUMBERAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__1__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: rule__REAL_NUMBER__Group_0__2 : rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3 ;
    public final void rule__REAL_NUMBER__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:2: rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__2__Impl_in_rule__REAL_NUMBER__Group_0__22146);
            rule__REAL_NUMBER__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__3_in_rule__REAL_NUMBER__Group_0__22149);
            rule__REAL_NUMBER__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__2"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: rule__REAL_NUMBER__Group_0__2__Impl : ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? ) ;
    public final void rule__REAL_NUMBER__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )?
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DIGIT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:3: ruleUNSIGNED_DIGIT_SEQUENCE
                    {
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__2__Impl2177);
                    ruleUNSIGNED_DIGIT_SEQUENCE();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__2__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: rule__REAL_NUMBER__Group_0__3 : rule__REAL_NUMBER__Group_0__3__Impl ;
    public final void rule__REAL_NUMBER__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__REAL_NUMBER__Group_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__REAL_NUMBER__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__3__Impl_in_rule__REAL_NUMBER__Group_0__32208);
            rule__REAL_NUMBER__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__3"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: rule__REAL_NUMBER__Group_0__3__Impl : ( ( rule__REAL_NUMBER__Group_0_3__0 )? ) ;
    public final void rule__REAL_NUMBER__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( ( ( rule__REAL_NUMBER__Group_0_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ( rule__REAL_NUMBER__Group_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ( rule__REAL_NUMBER__Group_0_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( rule__REAL_NUMBER__Group_0_3__0 )?
            {
             before(grammarAccess.getREAL_NUMBERAccess().getGroup_0_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( rule__REAL_NUMBER__Group_0_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=22 && LA17_0<=23)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:2: rule__REAL_NUMBER__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__0_in_rule__REAL_NUMBER__Group_0__3__Impl2235);
                    rule__REAL_NUMBER__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getREAL_NUMBERAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0__3__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: rule__REAL_NUMBER__Group_0_3__0 : rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1 ;
    public final void rule__REAL_NUMBER__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:2: rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__0__Impl_in_rule__REAL_NUMBER__Group_0_3__02274);
            rule__REAL_NUMBER__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__1_in_rule__REAL_NUMBER__Group_0_3__02277);
            rule__REAL_NUMBER__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0_3__0"


    // $ANTLR start "rule__REAL_NUMBER__Group_0_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: rule__REAL_NUMBER__Group_0_3__0__Impl : ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) ) ;
    public final void rule__REAL_NUMBER__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( rule__REAL_NUMBER__Alternatives_0_3_0 )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives_0_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__REAL_NUMBER__Alternatives_0_3_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:2: rule__REAL_NUMBER__Alternatives_0_3_0
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_0_3_0_in_rule__REAL_NUMBER__Group_0_3__0__Impl2304);
            rule__REAL_NUMBER__Alternatives_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getREAL_NUMBERAccess().getAlternatives_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0_3__0__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: rule__REAL_NUMBER__Group_0_3__1 : rule__REAL_NUMBER__Group_0_3__1__Impl ;
    public final void rule__REAL_NUMBER__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__REAL_NUMBER__Group_0_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: rule__REAL_NUMBER__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__1__Impl_in_rule__REAL_NUMBER__Group_0_3__12334);
            rule__REAL_NUMBER__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0_3__1"


    // $ANTLR start "rule__REAL_NUMBER__Group_0_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__REAL_NUMBER__Group_0_3__1__Impl : ( ruleDIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( ruleDIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ruleDIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ruleDIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ruleDIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_0_3_1()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0_3__1__Impl2361);
            ruleDIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_0_3__1__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: rule__REAL_NUMBER__Group_1__0 : rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1 ;
    public final void rule__REAL_NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:2: rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__0__Impl_in_rule__REAL_NUMBER__Group_1__02394);
            rule__REAL_NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__1_in_rule__REAL_NUMBER__Group_1__02397);
            rule__REAL_NUMBER__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__0"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: rule__REAL_NUMBER__Group_1__0__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__0__Impl2424);
            ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: rule__REAL_NUMBER__Group_1__1 : rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2 ;
    public final void rule__REAL_NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:2: rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__1__Impl_in_rule__REAL_NUMBER__Group_1__12453);
            rule__REAL_NUMBER__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__2_in_rule__REAL_NUMBER__Group_1__12456);
            rule__REAL_NUMBER__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__1"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: rule__REAL_NUMBER__Group_1__1__Impl : ( ( rule__REAL_NUMBER__Alternatives_1_1 ) ) ;
    public final void rule__REAL_NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: ( ( ( rule__REAL_NUMBER__Alternatives_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( rule__REAL_NUMBER__Alternatives_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( rule__REAL_NUMBER__Alternatives_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( rule__REAL_NUMBER__Alternatives_1_1 )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( rule__REAL_NUMBER__Alternatives_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:2: rule__REAL_NUMBER__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_1_1_in_rule__REAL_NUMBER__Group_1__1__Impl2483);
            rule__REAL_NUMBER__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getREAL_NUMBERAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: rule__REAL_NUMBER__Group_1__2 : rule__REAL_NUMBER__Group_1__2__Impl ;
    public final void rule__REAL_NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( rule__REAL_NUMBER__Group_1__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: rule__REAL_NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__2__Impl_in_rule__REAL_NUMBER__Group_1__22513);
            rule__REAL_NUMBER__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__2"


    // $ANTLR start "rule__REAL_NUMBER__Group_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__REAL_NUMBER__Group_1__2__Impl : ( ruleDIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ( ruleDIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ruleDIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ruleDIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ruleDIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__2__Impl2540);
            ruleDIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL_NUMBER__Group_1__2__Impl"


    // $ANTLR start "rule__DIGIT_SEQUENCE__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__DIGIT_SEQUENCE__Group__0 : rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1 ;
    public final void rule__DIGIT_SEQUENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:2: rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__0__Impl_in_rule__DIGIT_SEQUENCE__Group__02575);
            rule__DIGIT_SEQUENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__1_in_rule__DIGIT_SEQUENCE__Group__02578);
            rule__DIGIT_SEQUENCE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIGIT_SEQUENCE__Group__0"


    // $ANTLR start "rule__DIGIT_SEQUENCE__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__DIGIT_SEQUENCE__Group__0__Impl : ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? ) ;
    public final void rule__DIGIT_SEQUENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( rule__DIGIT_SEQUENCE__Alternatives_0 )?
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( rule__DIGIT_SEQUENCE__Alternatives_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=24 && LA18_0<=25)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: rule__DIGIT_SEQUENCE__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Alternatives_0_in_rule__DIGIT_SEQUENCE__Group__0__Impl2605);
                    rule__DIGIT_SEQUENCE__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDIGIT_SEQUENCEAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIGIT_SEQUENCE__Group__0__Impl"


    // $ANTLR start "rule__DIGIT_SEQUENCE__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__DIGIT_SEQUENCE__Group__1 : rule__DIGIT_SEQUENCE__Group__1__Impl ;
    public final void rule__DIGIT_SEQUENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__DIGIT_SEQUENCE__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:2: rule__DIGIT_SEQUENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__1__Impl_in_rule__DIGIT_SEQUENCE__Group__12636);
            rule__DIGIT_SEQUENCE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIGIT_SEQUENCE__Group__1"


    // $ANTLR start "rule__DIGIT_SEQUENCE__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__DIGIT_SEQUENCE__Group__1__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__DIGIT_SEQUENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__DIGIT_SEQUENCE__Group__1__Impl2663);
            ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getDIGIT_SEQUENCEAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIGIT_SEQUENCE__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ruleGreeting )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ruleGreeting )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment2701);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_0_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__Greeting__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_0_12732); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_0_1"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA8_eotS =
        "\5\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\3\4\2\uffff";
    static final String DFA8_maxS =
        "\1\4\2\34\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2\21\uffff\2\4\4\uffff\1\3",
            "\1\2\21\uffff\2\4\4\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "556:1: rule__REAL_NUMBER__Alternatives : ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) );";
        }
    }
    static final String DFA13_eotS =
        "\26\uffff";
    static final String DFA13_eofS =
        "\1\1\1\uffff\12\25\12\uffff";
    static final String DFA13_minS =
        "\1\14\1\uffff\12\14\12\uffff";
    static final String DFA13_maxS =
        "\1\32\1\uffff\12\34\12\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\12\uffff\12\1";
    static final String DFA13_specialS =
        "\26\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\1\2\uffff\1"+
            "\1",
            "",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\25\2\uffff"+
            "\1\25\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 846:1: ( rule__Number__Alternatives_2 )*";
        }
    }
    static final String DFA15_eotS =
        "\27\uffff";
    static final String DFA15_eofS =
        "\1\1\1\uffff\12\14\13\uffff";
    static final String DFA15_minS =
        "\1\14\1\uffff\12\14\13\uffff";
    static final String DFA15_maxS =
        "\1\32\1\uffff\12\34\13\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\12\uffff\13\1";
    static final String DFA15_specialS =
        "\27\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff\1\1",
            "",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\14\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff"+
            "\1\26\1\uffff\1\1",
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
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 946:1: ( rule__Number__Alternatives_3_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x00000000043FF002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0_in_rulenumber215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL_NUMBER251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_in_ruleREAL_NUMBER277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE340 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE353 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__0_in_ruleDIGIT_SEQUENCE416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Greeting__Alternatives470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Number__Alternatives_0503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Number__Alternatives_0523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Number__Alternatives_0543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Number__Alternatives_0563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Number__Alternatives_0583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Number__Alternatives_0603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Number__Alternatives_0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Number__Alternatives_0643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Number__Alternatives_0663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Number__Alternatives_0683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Number__Alternatives_2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Number__Alternatives_2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Number__Alternatives_2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Number__Alternatives_2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Number__Alternatives_2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Number__Alternatives_2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Number__Alternatives_2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Number__Alternatives_2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Number__Alternatives_2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Number__Alternatives_2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Number__Alternatives_3_0933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Number__Alternatives_3_0953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Number__Alternatives_3_1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Number__Alternatives_3_11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Number__Alternatives_3_11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Number__Alternatives_3_11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Number__Alternatives_3_11068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Number__Alternatives_3_11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Number__Alternatives_3_11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Number__Alternatives_3_11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Number__Alternatives_3_11148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Number__Alternatives_3_11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__0_in_rule__REAL_NUMBER__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__0_in_rule__REAL_NUMBER__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__REAL_NUMBER__Alternatives_0_3_01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__REAL_NUMBER__Alternatives_0_3_01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__REAL_NUMBER__Alternatives_1_11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__REAL_NUMBER__Alternatives_1_11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DIGIT_SEQUENCE__Alternatives_01365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DIGIT_SEQUENCE__Alternatives_01385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__01417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__01420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Greeting__Group_0__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__11479 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_0_1_in_rule__Greeting__Group_0__1__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__21539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Greeting__Group_0__2__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__01604 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_0_in_rule__Number__Group__0__Impl1636 = new BitSet(new long[]{0x00000000043FF000L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_0_in_rule__Number__Group__0__Impl1648 = new BitSet(new long[]{0x00000000043FF002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__11681 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_rule__Number__Group__2_in_rule__Number__Group__11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Number__Group__1__Impl1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__2__Impl_in_rule__Number__Group__21743 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Number__Group__3_in_rule__Number__Group__21746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_2_in_rule__Number__Group__2__Impl1775 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_2_in_rule__Number__Group__2__Impl1787 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_rule__Number__Group__3__Impl_in_rule__Number__Group__31820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0_in_rule__Number__Group__3__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__0__Impl_in_rule__Number__Group_3__01886 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1_in_rule__Number__Group_3__01889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_3_0_in_rule__Number__Group_3__0__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_3__1__Impl_in_rule__Number__Group_3__11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1975 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_3_1_in_rule__Number__Group_3__1__Impl1987 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__0__Impl_in_rule__REAL_NUMBER__Group_0__02025 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__1_in_rule__REAL_NUMBER__Group_0__02028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__0__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__1__Impl_in_rule__REAL_NUMBER__Group_0__12084 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__2_in_rule__REAL_NUMBER__Group_0__12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__REAL_NUMBER__Group_0__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__2__Impl_in_rule__REAL_NUMBER__Group_0__22146 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__3_in_rule__REAL_NUMBER__Group_0__22149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__2__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__3__Impl_in_rule__REAL_NUMBER__Group_0__32208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__0_in_rule__REAL_NUMBER__Group_0__3__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__0__Impl_in_rule__REAL_NUMBER__Group_0_3__02274 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__1_in_rule__REAL_NUMBER__Group_0_3__02277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_0_3_0_in_rule__REAL_NUMBER__Group_0_3__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__1__Impl_in_rule__REAL_NUMBER__Group_0_3__12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0_3__1__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__0__Impl_in_rule__REAL_NUMBER__Group_1__02394 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__1_in_rule__REAL_NUMBER__Group_1__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__1__Impl_in_rule__REAL_NUMBER__Group_1__12453 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__2_in_rule__REAL_NUMBER__Group_1__12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_1_1_in_rule__REAL_NUMBER__Group_1__1__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__2__Impl_in_rule__REAL_NUMBER__Group_1__22513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__2__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__0__Impl_in_rule__DIGIT_SEQUENCE__Group__02575 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__1_in_rule__DIGIT_SEQUENCE__Group__02578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Alternatives_0_in_rule__DIGIT_SEQUENCE__Group__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__1__Impl_in_rule__DIGIT_SEQUENCE__Group__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__DIGIT_SEQUENCE__Group__1__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_0_12732 = new BitSet(new long[]{0x0000000000000002L});

}