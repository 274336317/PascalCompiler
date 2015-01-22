package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DIGIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'+'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_DIGIT=5;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ruleGreeting returns [EObject current=null] : ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | ruleSIGNED_REAL_NUMBER ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:28: ( ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | ruleSIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | ruleSIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | ruleSIGNED_REAL_NUMBER )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:4: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleGreeting214); 

                        	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting231); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGreetingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGreeting248); 

                        	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:5: ruleSIGNED_REAL_NUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getSIGNED_REAL_NUMBERParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSIGNED_REAL_NUMBER_in_ruleGreeting271);
                    ruleSIGNED_REAL_NUMBER();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleSIGNED_REAL_NUMBER"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:1: entryRuleSIGNED_REAL_NUMBER returns [String current=null] : iv_ruleSIGNED_REAL_NUMBER= ruleSIGNED_REAL_NUMBER EOF ;
    public final String entryRuleSIGNED_REAL_NUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_REAL_NUMBER = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:2: (iv_ruleSIGNED_REAL_NUMBER= ruleSIGNED_REAL_NUMBER EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:2: iv_ruleSIGNED_REAL_NUMBER= ruleSIGNED_REAL_NUMBER EOF
            {
             newCompositeNode(grammarAccess.getSIGNED_REAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleSIGNED_REAL_NUMBER_in_entryRuleSIGNED_REAL_NUMBER307);
            iv_ruleSIGNED_REAL_NUMBER=ruleSIGNED_REAL_NUMBER();

            state._fsp--;

             current =iv_ruleSIGNED_REAL_NUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIGNED_REAL_NUMBER318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNED_REAL_NUMBER"


    // $ANTLR start "ruleSIGNED_REAL_NUMBER"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: ruleSIGNED_REAL_NUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' ) this_REAL_NUMBER_2= ruleREAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_REAL_NUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_REAL_NUMBER_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:28: ( ( (kw= '+' | kw= '-' ) this_REAL_NUMBER_2= ruleREAL_NUMBER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:1: ( (kw= '+' | kw= '-' ) this_REAL_NUMBER_2= ruleREAL_NUMBER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:1: ( (kw= '+' | kw= '-' ) this_REAL_NUMBER_2= ruleREAL_NUMBER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (kw= '+' | kw= '-' ) this_REAL_NUMBER_2= ruleREAL_NUMBER
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (kw= '+' | kw= '-' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:2: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSIGNED_REAL_NUMBER357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSIGNED_REAL_NUMBERAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:2: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleSIGNED_REAL_NUMBER376); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSIGNED_REAL_NUMBERAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSIGNED_REAL_NUMBERAccess().getREAL_NUMBERParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_ruleSIGNED_REAL_NUMBER399);
            this_REAL_NUMBER_2=ruleREAL_NUMBER();

            state._fsp--;


            		current.merge(this_REAL_NUMBER_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNED_REAL_NUMBER"


    // $ANTLR start "entryRuleREAL_NUMBER"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:1: entryRuleREAL_NUMBER returns [String current=null] : iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF ;
    public final String entryRuleREAL_NUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL_NUMBER = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:2: (iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:2: iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF
            {
             newCompositeNode(grammarAccess.getREAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER445);
            iv_ruleREAL_NUMBER=ruleREAL_NUMBER();

            state._fsp--;

             current =iv_ruleREAL_NUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL_NUMBER456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL_NUMBER"


    // $ANTLR start "ruleREAL_NUMBER"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:1: ruleREAL_NUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) ) ;
    public final AntlrDatatypeRuleToken ruleREAL_NUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UNSIGNED_DIGIT_SEQUENCE_0 = null;

        AntlrDatatypeRuleToken this_UNSIGNED_DIGIT_SEQUENCE_2 = null;

        AntlrDatatypeRuleToken this_DIGIT_SEQUENCE_5 = null;

        AntlrDatatypeRuleToken this_UNSIGNED_DIGIT_SEQUENCE_6 = null;

        AntlrDatatypeRuleToken this_DIGIT_SEQUENCE_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:28: ( ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:2: (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:2: (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:5: this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )?
                    {
                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER504);
                    this_UNSIGNED_DIGIT_SEQUENCE_0=ruleUNSIGNED_DIGIT_SEQUENCE();

                    state._fsp--;


                    		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleREAL_NUMBER522); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getFullStopKeyword_0_1()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_DIGIT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:5: this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE
                            {
                             
                                    newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER545);
                            this_UNSIGNED_DIGIT_SEQUENCE_2=ruleUNSIGNED_DIGIT_SEQUENCE();

                            state._fsp--;


                            		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:3: ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:4: (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:4: (kw= 'E' | kw= 'e' )
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==17) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==18) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,17,FOLLOW_17_in_ruleREAL_NUMBER567); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,18,FOLLOW_18_in_ruleREAL_NUMBER586); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_1()); 
                                        

                                    }
                                    break;

                            }

                             
                                    newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_0_3_1()); 
                                
                            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER609);
                            this_DIGIT_SEQUENCE_5=ruleDIGIT_SEQUENCE();

                            state._fsp--;


                            		current.merge(this_DIGIT_SEQUENCE_5);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:6: (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:6: (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:5: this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE
                    {
                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER646);
                    this_UNSIGNED_DIGIT_SEQUENCE_6=ruleUNSIGNED_DIGIT_SEQUENCE();

                    state._fsp--;


                    		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: (kw= 'E' | kw= 'e' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==18) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:2: kw= 'E'
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_ruleREAL_NUMBER665); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:2: kw= 'e'
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_ruleREAL_NUMBER684); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER707);
                    this_DIGIT_SEQUENCE_9=ruleDIGIT_SEQUENCE();

                    state._fsp--;


                    		current.merge(this_DIGIT_SEQUENCE_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL_NUMBER"


    // $ANTLR start "entryRuleUNSIGNED_DIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:1: entryRuleUNSIGNED_DIGIT_SEQUENCE returns [String current=null] : iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF ;
    public final String entryRuleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNSIGNED_DIGIT_SEQUENCE = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:317:2: (iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:318:2: iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF
            {
             newCompositeNode(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE754);
            iv_ruleUNSIGNED_DIGIT_SEQUENCE=ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             current =iv_ruleUNSIGNED_DIGIT_SEQUENCE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNSIGNED_DIGIT_SEQUENCE"


    // $ANTLR start "ruleUNSIGNED_DIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: ruleUNSIGNED_DIGIT_SEQUENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT )+ ;
    public final AntlrDatatypeRuleToken ruleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:328:28: ( (this_DIGIT_0= RULE_DIGIT )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: (this_DIGIT_0= RULE_DIGIT )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: (this_DIGIT_0= RULE_DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DIGIT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:6: this_DIGIT_0= RULE_DIGIT
            	    {
            	    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE805); 

            	    		current.merge(this_DIGIT_0);
            	        
            	     
            	        newLeafNode(this_DIGIT_0, grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            	        

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNSIGNED_DIGIT_SEQUENCE"


    // $ANTLR start "entryRuleDIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: entryRuleDIGIT_SEQUENCE returns [String current=null] : iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF ;
    public final String entryRuleDIGIT_SEQUENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIGIT_SEQUENCE = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:2: (iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:2: iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF
            {
             newCompositeNode(grammarAccess.getDIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE852);
            iv_ruleDIGIT_SEQUENCE=ruleDIGIT_SEQUENCE();

            state._fsp--;

             current =iv_ruleDIGIT_SEQUENCE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE863); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIGIT_SEQUENCE"


    // $ANTLR start "ruleDIGIT_SEQUENCE"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:1: ruleDIGIT_SEQUENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final AntlrDatatypeRuleToken ruleDIGIT_SEQUENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UNSIGNED_DIGIT_SEQUENCE_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:28: ( ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:2: (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:2: (kw= '+' | kw= '-' )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:2: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleDIGIT_SEQUENCE902); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:2: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleDIGIT_SEQUENCE921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDIGIT_SEQUENCEAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDIGIT_SEQUENCEAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleDIGIT_SEQUENCE945);
            this_UNSIGNED_DIGIT_SEQUENCE_2=ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;


            		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIGIT_SEQUENCE"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\2\5\2\uffff";
    static final String DFA8_maxS =
        "\1\5\1\22\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\1\12\uffff\1\2\2\3",
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
            return "220:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGreeting214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGreeting248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIGNED_REAL_NUMBER_in_ruleGreeting271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIGNED_REAL_NUMBER_in_entryRuleSIGNED_REAL_NUMBER307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIGNED_REAL_NUMBER318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSIGNED_REAL_NUMBER357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15_in_ruleSIGNED_REAL_NUMBER376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_ruleSIGNED_REAL_NUMBER399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL_NUMBER456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleREAL_NUMBER522 = new BitSet(new long[]{0x0000000000060022L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER545 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleREAL_NUMBER567 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_18_in_ruleREAL_NUMBER586 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER646 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleREAL_NUMBER665 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_18_in_ruleREAL_NUMBER684 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE805 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDIGIT_SEQUENCE902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15_in_ruleDIGIT_SEQUENCE921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleDIGIT_SEQUENCE945 = new BitSet(new long[]{0x0000000000000002L});

}