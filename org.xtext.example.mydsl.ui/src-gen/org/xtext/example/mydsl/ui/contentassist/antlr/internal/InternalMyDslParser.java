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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'E'", "'e'", "'Hello'", "'!'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DIGIT=4;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==16) ) {
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


    // $ANTLR start "entryRuleSIGNED_REAL_NUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleSIGNED_REAL_NUMBER : ruleSIGNED_REAL_NUMBER EOF ;
    public final void entryRuleSIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleSIGNED_REAL_NUMBER EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleSIGNED_REAL_NUMBER EOF
            {
             before(grammarAccess.getSIGNED_REAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleSIGNED_REAL_NUMBER_in_entryRuleSIGNED_REAL_NUMBER182);
            ruleSIGNED_REAL_NUMBER();

            state._fsp--;

             after(grammarAccess.getSIGNED_REAL_NUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIGNED_REAL_NUMBER189); 

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
    // $ANTLR end "entryRuleSIGNED_REAL_NUMBER"


    // $ANTLR start "ruleSIGNED_REAL_NUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleSIGNED_REAL_NUMBER : ( ( rule__SIGNED_REAL_NUMBER__Group__0 ) ) ;
    public final void ruleSIGNED_REAL_NUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__SIGNED_REAL_NUMBER__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__SIGNED_REAL_NUMBER__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__SIGNED_REAL_NUMBER__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__SIGNED_REAL_NUMBER__Group__0 )
            {
             before(grammarAccess.getSIGNED_REAL_NUMBERAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__SIGNED_REAL_NUMBER__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__SIGNED_REAL_NUMBER__Group__0
            {
            pushFollow(FOLLOW_rule__SIGNED_REAL_NUMBER__Group__0_in_ruleSIGNED_REAL_NUMBER215);
            rule__SIGNED_REAL_NUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_REAL_NUMBERAccess().getGroup()); 

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
    // $ANTLR end "ruleSIGNED_REAL_NUMBER"


    // $ANTLR start "entryRuleREAL_NUMBER"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleREAL_NUMBER : ruleREAL_NUMBER EOF ;
    public final void entryRuleREAL_NUMBER() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleREAL_NUMBER EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleREAL_NUMBER EOF
            {
             before(grammarAccess.getREAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER242);
            ruleREAL_NUMBER();

            state._fsp--;

             after(grammarAccess.getREAL_NUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL_NUMBER249); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleREAL_NUMBER : ( ( rule__REAL_NUMBER__Alternatives ) ) ;
    public final void ruleREAL_NUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__REAL_NUMBER__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__REAL_NUMBER__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__REAL_NUMBER__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__REAL_NUMBER__Alternatives )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__REAL_NUMBER__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__REAL_NUMBER__Alternatives
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_in_ruleREAL_NUMBER275);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleUNSIGNED_DIGIT_SEQUENCE : ruleUNSIGNED_DIGIT_SEQUENCE EOF ;
    public final void entryRuleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleUNSIGNED_DIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleUNSIGNED_DIGIT_SEQUENCE EOF
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE302);
            ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE309); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleUNSIGNED_DIGIT_SEQUENCE : ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) ;
    public final void ruleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( RULE_DIGIT ) ) ( ( RULE_DIGIT )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( RULE_DIGIT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( RULE_DIGIT )
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( RULE_DIGIT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:3: RULE_DIGIT
            {
            match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE338); 

            }

             after(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( ( RULE_DIGIT )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:193:1: ( RULE_DIGIT )*
            {
             before(grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:1: ( RULE_DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DIGIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:3: RULE_DIGIT
            	    {
            	    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE351); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: entryRuleDIGIT_SEQUENCE : ruleDIGIT_SEQUENCE EOF ;
    public final void entryRuleDIGIT_SEQUENCE() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ruleDIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleDIGIT_SEQUENCE EOF
            {
             before(grammarAccess.getDIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE381);
            ruleDIGIT_SEQUENCE();

            state._fsp--;

             after(grammarAccess.getDIGIT_SEQUENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE388); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ruleDIGIT_SEQUENCE : ( ( rule__DIGIT_SEQUENCE__Group__0 ) ) ;
    public final void ruleDIGIT_SEQUENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:220:2: ( ( ( rule__DIGIT_SEQUENCE__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( ( rule__DIGIT_SEQUENCE__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( ( rule__DIGIT_SEQUENCE__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( rule__DIGIT_SEQUENCE__Group__0 )
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( rule__DIGIT_SEQUENCE__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:2: rule__DIGIT_SEQUENCE__Group__0
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__0_in_ruleDIGIT_SEQUENCE414);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:235:1: rule__Greeting__Alternatives : ( ( ( rule__Greeting__Group_0__0 ) ) | ( ruleSIGNED_REAL_NUMBER ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ( ( ( rule__Greeting__Group_0__0 ) ) | ( ruleSIGNED_REAL_NUMBER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ( ( rule__Greeting__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ( ( rule__Greeting__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ( rule__Greeting__Group_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( rule__Greeting__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:2: rule__Greeting__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives450);
                    rule__Greeting__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:6: ( ruleSIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:6: ( ruleSIGNED_REAL_NUMBER )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ruleSIGNED_REAL_NUMBER
                    {
                     before(grammarAccess.getGreetingAccess().getSIGNED_REAL_NUMBERParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSIGNED_REAL_NUMBER_in_rule__Greeting__Alternatives468);
                    ruleSIGNED_REAL_NUMBER();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getSIGNED_REAL_NUMBERParserRuleCall_1()); 

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


    // $ANTLR start "rule__SIGNED_REAL_NUMBER__Alternatives_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: rule__SIGNED_REAL_NUMBER__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__SIGNED_REAL_NUMBER__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: '+'
                    {
                     before(grammarAccess.getSIGNED_REAL_NUMBERAccess().getPlusSignKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__SIGNED_REAL_NUMBER__Alternatives_0501); 
                     after(grammarAccess.getSIGNED_REAL_NUMBERAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: '-'
                    {
                     before(grammarAccess.getSIGNED_REAL_NUMBERAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__SIGNED_REAL_NUMBER__Alternatives_0521); 
                     after(grammarAccess.getSIGNED_REAL_NUMBERAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__SIGNED_REAL_NUMBER__Alternatives_0"


    // $ANTLR start "rule__REAL_NUMBER__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: rule__REAL_NUMBER__Alternatives : ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) );
    public final void rule__REAL_NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ( rule__REAL_NUMBER__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ( rule__REAL_NUMBER__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( rule__REAL_NUMBER__Group_0__0 )
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( rule__REAL_NUMBER__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:2: rule__REAL_NUMBER__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__0_in_rule__REAL_NUMBER__Alternatives555);
                    rule__REAL_NUMBER__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getREAL_NUMBERAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:294:6: ( ( rule__REAL_NUMBER__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:294:6: ( ( rule__REAL_NUMBER__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:295:1: ( rule__REAL_NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ( rule__REAL_NUMBER__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:2: rule__REAL_NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__0_in_rule__REAL_NUMBER__Alternatives573);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: rule__REAL_NUMBER__Alternatives_0_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__REAL_NUMBER__Alternatives_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: 'E'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__REAL_NUMBER__Alternatives_0_3_0607); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: 'e'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__REAL_NUMBER__Alternatives_0_3_0627); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: rule__REAL_NUMBER__Alternatives_1_1 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__REAL_NUMBER__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: 'E'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__REAL_NUMBER__Alternatives_1_1662); 
                     after(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: 'e'
                    {
                     before(grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__REAL_NUMBER__Alternatives_1_1682); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: rule__DIGIT_SEQUENCE__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DIGIT_SEQUENCE__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: ( '+' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: ( '+' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: '+'
                    {
                     before(grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__DIGIT_SEQUENCE__Alternatives_0717); 
                     after(grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:6: ( '-' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:6: ( '-' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: '-'
                    {
                     before(grammarAccess.getDIGIT_SEQUENCEAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__DIGIT_SEQUENCE__Alternatives_0737); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: rule__Greeting__Group_0__0 : rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 ;
    public final void rule__Greeting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:2: rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__0769);
            rule__Greeting__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__0772);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: rule__Greeting__Group_0__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( ( 'Hello' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( 'Hello' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( 'Hello' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Greeting__Group_0__0__Impl800); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: rule__Greeting__Group_0__1 : rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 ;
    public final void rule__Greeting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: ( rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:421:2: rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__1831);
            rule__Greeting__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__1834);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: rule__Greeting__Group_0__1__Impl : ( ( rule__Greeting__NameAssignment_0_1 ) ) ;
    public final void rule__Greeting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( ( rule__Greeting__NameAssignment_0_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( ( rule__Greeting__NameAssignment_0_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( ( rule__Greeting__NameAssignment_0_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( rule__Greeting__NameAssignment_0_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_0_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( rule__Greeting__NameAssignment_0_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:435:2: rule__Greeting__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_0_1_in_rule__Greeting__Group_0__1__Impl861);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: rule__Greeting__Group_0__2 : rule__Greeting__Group_0__2__Impl ;
    public final void rule__Greeting__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( rule__Greeting__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:2: rule__Greeting__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__2891);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: rule__Greeting__Group_0__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( '!' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( '!' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( '!' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__Greeting__Group_0__2__Impl919); 
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


    // $ANTLR start "rule__SIGNED_REAL_NUMBER__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: rule__SIGNED_REAL_NUMBER__Group__0 : rule__SIGNED_REAL_NUMBER__Group__0__Impl rule__SIGNED_REAL_NUMBER__Group__1 ;
    public final void rule__SIGNED_REAL_NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( rule__SIGNED_REAL_NUMBER__Group__0__Impl rule__SIGNED_REAL_NUMBER__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:2: rule__SIGNED_REAL_NUMBER__Group__0__Impl rule__SIGNED_REAL_NUMBER__Group__1
            {
            pushFollow(FOLLOW_rule__SIGNED_REAL_NUMBER__Group__0__Impl_in_rule__SIGNED_REAL_NUMBER__Group__0956);
            rule__SIGNED_REAL_NUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SIGNED_REAL_NUMBER__Group__1_in_rule__SIGNED_REAL_NUMBER__Group__0959);
            rule__SIGNED_REAL_NUMBER__Group__1();

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
    // $ANTLR end "rule__SIGNED_REAL_NUMBER__Group__0"


    // $ANTLR start "rule__SIGNED_REAL_NUMBER__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: rule__SIGNED_REAL_NUMBER__Group__0__Impl : ( ( rule__SIGNED_REAL_NUMBER__Alternatives_0 ) ) ;
    public final void rule__SIGNED_REAL_NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( ( rule__SIGNED_REAL_NUMBER__Alternatives_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( ( rule__SIGNED_REAL_NUMBER__Alternatives_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( ( rule__SIGNED_REAL_NUMBER__Alternatives_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: ( rule__SIGNED_REAL_NUMBER__Alternatives_0 )
            {
             before(grammarAccess.getSIGNED_REAL_NUMBERAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: ( rule__SIGNED_REAL_NUMBER__Alternatives_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:2: rule__SIGNED_REAL_NUMBER__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SIGNED_REAL_NUMBER__Alternatives_0_in_rule__SIGNED_REAL_NUMBER__Group__0__Impl986);
            rule__SIGNED_REAL_NUMBER__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_REAL_NUMBERAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__SIGNED_REAL_NUMBER__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_REAL_NUMBER__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: rule__SIGNED_REAL_NUMBER__Group__1 : rule__SIGNED_REAL_NUMBER__Group__1__Impl ;
    public final void rule__SIGNED_REAL_NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( rule__SIGNED_REAL_NUMBER__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:2: rule__SIGNED_REAL_NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SIGNED_REAL_NUMBER__Group__1__Impl_in_rule__SIGNED_REAL_NUMBER__Group__11016);
            rule__SIGNED_REAL_NUMBER__Group__1__Impl();

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
    // $ANTLR end "rule__SIGNED_REAL_NUMBER__Group__1"


    // $ANTLR start "rule__SIGNED_REAL_NUMBER__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: rule__SIGNED_REAL_NUMBER__Group__1__Impl : ( ruleREAL_NUMBER ) ;
    public final void rule__SIGNED_REAL_NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ruleREAL_NUMBER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ruleREAL_NUMBER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ruleREAL_NUMBER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ruleREAL_NUMBER
            {
             before(grammarAccess.getSIGNED_REAL_NUMBERAccess().getREAL_NUMBERParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_rule__SIGNED_REAL_NUMBER__Group__1__Impl1043);
            ruleREAL_NUMBER();

            state._fsp--;

             after(grammarAccess.getSIGNED_REAL_NUMBERAccess().getREAL_NUMBERParserRuleCall_1()); 

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
    // $ANTLR end "rule__SIGNED_REAL_NUMBER__Group__1__Impl"


    // $ANTLR start "rule__REAL_NUMBER__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: rule__REAL_NUMBER__Group_0__0 : rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1 ;
    public final void rule__REAL_NUMBER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:2: rule__REAL_NUMBER__Group_0__0__Impl rule__REAL_NUMBER__Group_0__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__0__Impl_in_rule__REAL_NUMBER__Group_0__01076);
            rule__REAL_NUMBER__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__1_in_rule__REAL_NUMBER__Group_0__01079);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: rule__REAL_NUMBER__Group_0__0__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__0__Impl1106);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__REAL_NUMBER__Group_0__1 : rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2 ;
    public final void rule__REAL_NUMBER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:2: rule__REAL_NUMBER__Group_0__1__Impl rule__REAL_NUMBER__Group_0__2
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__1__Impl_in_rule__REAL_NUMBER__Group_0__11135);
            rule__REAL_NUMBER__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__2_in_rule__REAL_NUMBER__Group_0__11138);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: rule__REAL_NUMBER__Group_0__1__Impl : ( '.' ) ;
    public final void rule__REAL_NUMBER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: '.'
            {
             before(grammarAccess.getREAL_NUMBERAccess().getFullStopKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__REAL_NUMBER__Group_0__1__Impl1166); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: rule__REAL_NUMBER__Group_0__2 : rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3 ;
    public final void rule__REAL_NUMBER__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: rule__REAL_NUMBER__Group_0__2__Impl rule__REAL_NUMBER__Group_0__3
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__2__Impl_in_rule__REAL_NUMBER__Group_0__21197);
            rule__REAL_NUMBER__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__3_in_rule__REAL_NUMBER__Group_0__21200);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: rule__REAL_NUMBER__Group_0__2__Impl : ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? ) ;
    public final void rule__REAL_NUMBER__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )?
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DIGIT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:3: ruleUNSIGNED_DIGIT_SEQUENCE
                    {
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__2__Impl1228);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__REAL_NUMBER__Group_0__3 : rule__REAL_NUMBER__Group_0__3__Impl ;
    public final void rule__REAL_NUMBER__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__REAL_NUMBER__Group_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__REAL_NUMBER__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0__3__Impl_in_rule__REAL_NUMBER__Group_0__31259);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: rule__REAL_NUMBER__Group_0__3__Impl : ( ( rule__REAL_NUMBER__Group_0_3__0 )? ) ;
    public final void rule__REAL_NUMBER__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( ( rule__REAL_NUMBER__Group_0_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ( rule__REAL_NUMBER__Group_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ( rule__REAL_NUMBER__Group_0_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( rule__REAL_NUMBER__Group_0_3__0 )?
            {
             before(grammarAccess.getREAL_NUMBERAccess().getGroup_0_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( rule__REAL_NUMBER__Group_0_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=14 && LA10_0<=15)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:2: rule__REAL_NUMBER__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__0_in_rule__REAL_NUMBER__Group_0__3__Impl1286);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: rule__REAL_NUMBER__Group_0_3__0 : rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1 ;
    public final void rule__REAL_NUMBER__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:2: rule__REAL_NUMBER__Group_0_3__0__Impl rule__REAL_NUMBER__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__0__Impl_in_rule__REAL_NUMBER__Group_0_3__01325);
            rule__REAL_NUMBER__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__1_in_rule__REAL_NUMBER__Group_0_3__01328);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: rule__REAL_NUMBER__Group_0_3__0__Impl : ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) ) ;
    public final void rule__REAL_NUMBER__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: ( ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: ( ( rule__REAL_NUMBER__Alternatives_0_3_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( rule__REAL_NUMBER__Alternatives_0_3_0 )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives_0_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( rule__REAL_NUMBER__Alternatives_0_3_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:2: rule__REAL_NUMBER__Alternatives_0_3_0
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_0_3_0_in_rule__REAL_NUMBER__Group_0_3__0__Impl1355);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: rule__REAL_NUMBER__Group_0_3__1 : rule__REAL_NUMBER__Group_0_3__1__Impl ;
    public final void rule__REAL_NUMBER__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( rule__REAL_NUMBER__Group_0_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:2: rule__REAL_NUMBER__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_0_3__1__Impl_in_rule__REAL_NUMBER__Group_0_3__11385);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: rule__REAL_NUMBER__Group_0_3__1__Impl : ( ruleDIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( ( ruleDIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ruleDIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ruleDIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ruleDIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_0_3_1()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0_3__1__Impl1412);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: rule__REAL_NUMBER__Group_1__0 : rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1 ;
    public final void rule__REAL_NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:2: rule__REAL_NUMBER__Group_1__0__Impl rule__REAL_NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__0__Impl_in_rule__REAL_NUMBER__Group_1__01445);
            rule__REAL_NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__1_in_rule__REAL_NUMBER__Group_1__01448);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: rule__REAL_NUMBER__Group_1__0__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__0__Impl1475);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: rule__REAL_NUMBER__Group_1__1 : rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2 ;
    public final void rule__REAL_NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:2: rule__REAL_NUMBER__Group_1__1__Impl rule__REAL_NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__1__Impl_in_rule__REAL_NUMBER__Group_1__11504);
            rule__REAL_NUMBER__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__2_in_rule__REAL_NUMBER__Group_1__11507);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: rule__REAL_NUMBER__Group_1__1__Impl : ( ( rule__REAL_NUMBER__Alternatives_1_1 ) ) ;
    public final void rule__REAL_NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( ( rule__REAL_NUMBER__Alternatives_1_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__REAL_NUMBER__Alternatives_1_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__REAL_NUMBER__Alternatives_1_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__REAL_NUMBER__Alternatives_1_1 )
            {
             before(grammarAccess.getREAL_NUMBERAccess().getAlternatives_1_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__REAL_NUMBER__Alternatives_1_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:2: rule__REAL_NUMBER__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Alternatives_1_1_in_rule__REAL_NUMBER__Group_1__1__Impl1534);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__REAL_NUMBER__Group_1__2 : rule__REAL_NUMBER__Group_1__2__Impl ;
    public final void rule__REAL_NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rule__REAL_NUMBER__Group_1__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:2: rule__REAL_NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__REAL_NUMBER__Group_1__2__Impl_in_rule__REAL_NUMBER__Group_1__21564);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: rule__REAL_NUMBER__Group_1__2__Impl : ( ruleDIGIT_SEQUENCE ) ;
    public final void rule__REAL_NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( ruleDIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ruleDIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ruleDIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ruleDIGIT_SEQUENCE
            {
             before(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__2__Impl1591);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: rule__DIGIT_SEQUENCE__Group__0 : rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1 ;
    public final void rule__DIGIT_SEQUENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:2: rule__DIGIT_SEQUENCE__Group__0__Impl rule__DIGIT_SEQUENCE__Group__1
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__0__Impl_in_rule__DIGIT_SEQUENCE__Group__01626);
            rule__DIGIT_SEQUENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__1_in_rule__DIGIT_SEQUENCE__Group__01629);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: rule__DIGIT_SEQUENCE__Group__0__Impl : ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? ) ;
    public final void rule__DIGIT_SEQUENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( ( rule__DIGIT_SEQUENCE__Alternatives_0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( rule__DIGIT_SEQUENCE__Alternatives_0 )?
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getAlternatives_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( rule__DIGIT_SEQUENCE__Alternatives_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:2: rule__DIGIT_SEQUENCE__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Alternatives_0_in_rule__DIGIT_SEQUENCE__Group__0__Impl1656);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: rule__DIGIT_SEQUENCE__Group__1 : rule__DIGIT_SEQUENCE__Group__1__Impl ;
    public final void rule__DIGIT_SEQUENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( rule__DIGIT_SEQUENCE__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:2: rule__DIGIT_SEQUENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DIGIT_SEQUENCE__Group__1__Impl_in_rule__DIGIT_SEQUENCE__Group__11687);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: rule__DIGIT_SEQUENCE__Group__1__Impl : ( ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final void rule__DIGIT_SEQUENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( ( ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ruleUNSIGNED_DIGIT_SEQUENCE
            {
             before(grammarAccess.getDIGIT_SEQUENCEAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__DIGIT_SEQUENCE__Group__1__Impl1714);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( ruleGreeting )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( ruleGreeting )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1752);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: rule__Greeting__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_0_11783); 
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\4\2\uffff";
    static final String DFA5_maxS =
        "\1\4\2\22\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2\11\uffff\2\3\2\uffff\1\4",
            "\1\2\11\uffff\2\3\2\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "283:1: rule__REAL_NUMBER__Alternatives : ( ( ( rule__REAL_NUMBER__Group_0__0 ) ) | ( ( rule__REAL_NUMBER__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000013002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIGNED_REAL_NUMBER_in_entryRuleSIGNED_REAL_NUMBER182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIGNED_REAL_NUMBER189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIGNED_REAL_NUMBER__Group__0_in_ruleSIGNED_REAL_NUMBER215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL_NUMBER249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_in_ruleREAL_NUMBER275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE338 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE351 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__0_in_ruleDIGIT_SEQUENCE414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIGNED_REAL_NUMBER_in_rule__Greeting__Alternatives468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SIGNED_REAL_NUMBER__Alternatives_0501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SIGNED_REAL_NUMBER__Alternatives_0521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__0_in_rule__REAL_NUMBER__Alternatives555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__0_in_rule__REAL_NUMBER__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__REAL_NUMBER__Alternatives_0_3_0607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__REAL_NUMBER__Alternatives_0_3_0627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__REAL_NUMBER__Alternatives_1_1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__REAL_NUMBER__Alternatives_1_1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DIGIT_SEQUENCE__Alternatives_0717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DIGIT_SEQUENCE__Alternatives_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__0769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Greeting__Group_0__0__Impl800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__1831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_0_1_in_rule__Greeting__Group_0__1__Impl861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Greeting__Group_0__2__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIGNED_REAL_NUMBER__Group__0__Impl_in_rule__SIGNED_REAL_NUMBER__Group__0956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SIGNED_REAL_NUMBER__Group__1_in_rule__SIGNED_REAL_NUMBER__Group__0959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIGNED_REAL_NUMBER__Alternatives_0_in_rule__SIGNED_REAL_NUMBER__Group__0__Impl986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIGNED_REAL_NUMBER__Group__1__Impl_in_rule__SIGNED_REAL_NUMBER__Group__11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_rule__SIGNED_REAL_NUMBER__Group__1__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__0__Impl_in_rule__REAL_NUMBER__Group_0__01076 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__1_in_rule__REAL_NUMBER__Group_0__01079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__0__Impl1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__1__Impl_in_rule__REAL_NUMBER__Group_0__11135 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__2_in_rule__REAL_NUMBER__Group_0__11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__REAL_NUMBER__Group_0__1__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__2__Impl_in_rule__REAL_NUMBER__Group_0__21197 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__3_in_rule__REAL_NUMBER__Group_0__21200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0__2__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0__3__Impl_in_rule__REAL_NUMBER__Group_0__31259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__0_in_rule__REAL_NUMBER__Group_0__3__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__0__Impl_in_rule__REAL_NUMBER__Group_0_3__01325 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__1_in_rule__REAL_NUMBER__Group_0_3__01328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_0_3_0_in_rule__REAL_NUMBER__Group_0_3__0__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_0_3__1__Impl_in_rule__REAL_NUMBER__Group_0_3__11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_0_3__1__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__0__Impl_in_rule__REAL_NUMBER__Group_1__01445 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__1_in_rule__REAL_NUMBER__Group_1__01448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__0__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__1__Impl_in_rule__REAL_NUMBER__Group_1__11504 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__2_in_rule__REAL_NUMBER__Group_1__11507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Alternatives_1_1_in_rule__REAL_NUMBER__Group_1__1__Impl1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL_NUMBER__Group_1__2__Impl_in_rule__REAL_NUMBER__Group_1__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_rule__REAL_NUMBER__Group_1__2__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__0__Impl_in_rule__DIGIT_SEQUENCE__Group__01626 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__1_in_rule__DIGIT_SEQUENCE__Group__01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Alternatives_0_in_rule__DIGIT_SEQUENCE__Group__0__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIGIT_SEQUENCE__Group__1__Impl_in_rule__DIGIT_SEQUENCE__Group__11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_rule__DIGIT_SEQUENCE__Group__1__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_0_11783 = new BitSet(new long[]{0x0000000000000002L});

}