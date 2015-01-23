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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DIGIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'.'", "'E'", "'e'", "'+'", "'-'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_DIGIT=5;

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

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=23)) ) {
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ruleGreeting returns [EObject current=null] : ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | rulenumber ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:28: ( ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | rulenumber ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | rulenumber )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | rulenumber )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=23)) ) {
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:5: rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_ruleGreeting271);
                    rulenumber();

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


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber307);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber318); 

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ kw= '.' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:28: ( ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ kw= '.' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:1: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ kw= '.' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:1: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ kw= '.' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ kw= '.' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=11;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                    {
                    alt3=2;
                    }
                    break;
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case 17:
                    {
                    alt3=4;
                    }
                    break;
                case 18:
                    {
                    alt3=5;
                    }
                    break;
                case 19:
                    {
                    alt3=6;
                    }
                    break;
                case 20:
                    {
                    alt3=7;
                    }
                    break;
                case 21:
                    {
                    alt3=8;
                    }
                    break;
                case 22:
                    {
                    alt3=9;
                    }
                    break;
                case 23:
                    {
                    alt3=10;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:2: kw= '0'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_rulenumber357); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitZeroKeyword_0_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:2: kw= '1'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_rulenumber376); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitOneKeyword_0_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:2: kw= '2'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_rulenumber395); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitTwoKeyword_0_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:2: kw= '3'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_rulenumber414); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitThreeKeyword_0_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:2: kw= '4'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_rulenumber433); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFourKeyword_0_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:2: kw= '5'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_rulenumber452); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFiveKeyword_0_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:2: kw= '6'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulenumber471); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSixKeyword_0_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:2: kw= '7'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulenumber490); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSevenKeyword_0_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:2: kw= '8'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_rulenumber509); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitEightKeyword_0_8()); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:2: kw= '9'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_rulenumber528); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitNineKeyword_0_9()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            kw=(Token)match(input,24,FOLLOW_24_in_rulenumber543); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=11;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:2: kw= '0'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_rulenumber557); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitZeroKeyword_2_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:2: kw= '1'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_rulenumber576); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitOneKeyword_2_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:265:2: kw= '2'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_rulenumber595); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitTwoKeyword_2_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:2: kw= '3'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_rulenumber614); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitThreeKeyword_2_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:2: kw= '4'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_rulenumber633); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFourKeyword_2_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:2: kw= '5'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_rulenumber652); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFiveKeyword_2_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:293:2: kw= '6'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulenumber671); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSixKeyword_2_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:2: kw= '7'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulenumber690); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSevenKeyword_2_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:307:2: kw= '8'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_rulenumber709); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitEightKeyword_2_8()); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:2: kw= '9'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_rulenumber728); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitNineKeyword_2_9()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:3: ( (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:4: (kw= 'E' | kw= 'e' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:4: (kw= 'E' | kw= 'e' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==25) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==26) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:2: kw= 'E'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_rulenumber745); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:2: kw= 'e'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_rulenumber764); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=11;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:2: kw= '0'
                    	    {
                    	    kw=(Token)match(input,14,FOLLOW_14_in_rulenumber779); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitZeroKeyword_3_1_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:2: kw= '1'
                    	    {
                    	    kw=(Token)match(input,15,FOLLOW_15_in_rulenumber798); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitOneKeyword_3_1_1()); 
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:2: kw= '2'
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_16_in_rulenumber817); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitTwoKeyword_3_1_2()); 
                    	        

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: kw= '3'
                    	    {
                    	    kw=(Token)match(input,17,FOLLOW_17_in_rulenumber836); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitThreeKeyword_3_1_3()); 
                    	        

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:2: kw= '4'
                    	    {
                    	    kw=(Token)match(input,18,FOLLOW_18_in_rulenumber855); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFourKeyword_3_1_4()); 
                    	        

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:2: kw= '5'
                    	    {
                    	    kw=(Token)match(input,19,FOLLOW_19_in_rulenumber874); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFiveKeyword_3_1_5()); 
                    	        

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:2: kw= '6'
                    	    {
                    	    kw=(Token)match(input,20,FOLLOW_20_in_rulenumber893); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSixKeyword_3_1_6()); 
                    	        

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:2: kw= '7'
                    	    {
                    	    kw=(Token)match(input,21,FOLLOW_21_in_rulenumber912); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSevenKeyword_3_1_7()); 
                    	        

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:2: kw= '8'
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_22_in_rulenumber931); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitEightKeyword_3_1_8()); 
                    	        

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: kw= '9'
                    	    {
                    	    kw=(Token)match(input,23,FOLLOW_23_in_rulenumber950); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitNineKeyword_3_1_9()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleREAL_NUMBER"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:1: entryRuleREAL_NUMBER returns [String current=null] : iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF ;
    public final String entryRuleREAL_NUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL_NUMBER = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:412:2: (iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:2: iv_ruleREAL_NUMBER= ruleREAL_NUMBER EOF
            {
             newCompositeNode(grammarAccess.getREAL_NUMBERRule()); 
            pushFollow(FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER997);
            iv_ruleREAL_NUMBER=ruleREAL_NUMBER();

            state._fsp--;

             current =iv_ruleREAL_NUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL_NUMBER1008); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ruleREAL_NUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:28: ( ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:2: (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:2: (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:5: this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )?
                    {
                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1056);
                    this_UNSIGNED_DIGIT_SEQUENCE_0=ruleUNSIGNED_DIGIT_SEQUENCE();

                    state._fsp--;


                    		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleREAL_NUMBER1074); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getFullStopKeyword_0_1()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:441:1: (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_DIGIT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:442:5: this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE
                            {
                             
                                    newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1097);
                            this_UNSIGNED_DIGIT_SEQUENCE_2=ruleUNSIGNED_DIGIT_SEQUENCE();

                            state._fsp--;


                            		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:3: ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:4: (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:4: (kw= 'E' | kw= 'e' )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==25) ) {
                                alt9=1;
                            }
                            else if ( (LA9_0==26) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,25,FOLLOW_25_in_ruleREAL_NUMBER1119); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,26,FOLLOW_26_in_ruleREAL_NUMBER1138); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_0_3_0_1()); 
                                        

                                    }
                                    break;

                            }

                             
                                    newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_0_3_1()); 
                                
                            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER1161);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:6: (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:6: (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:5: this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE
                    {
                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1198);
                    this_UNSIGNED_DIGIT_SEQUENCE_6=ruleUNSIGNED_DIGIT_SEQUENCE();

                    state._fsp--;


                    		current.merge(this_UNSIGNED_DIGIT_SEQUENCE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==26) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:2: kw= 'E'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleREAL_NUMBER1217); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:2: kw= 'e'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleREAL_NUMBER1236); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getREAL_NUMBERAccess().getEKeyword_1_1_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getREAL_NUMBERAccess().getDIGIT_SEQUENCEParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER1259);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: entryRuleUNSIGNED_DIGIT_SEQUENCE returns [String current=null] : iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF ;
    public final String entryRuleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNSIGNED_DIGIT_SEQUENCE = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: (iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: iv_ruleUNSIGNED_DIGIT_SEQUENCE= ruleUNSIGNED_DIGIT_SEQUENCE EOF
            {
             newCompositeNode(grammarAccess.getUNSIGNED_DIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE1306);
            iv_ruleUNSIGNED_DIGIT_SEQUENCE=ruleUNSIGNED_DIGIT_SEQUENCE();

            state._fsp--;

             current =iv_ruleUNSIGNED_DIGIT_SEQUENCE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE1317); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:529:1: ruleUNSIGNED_DIGIT_SEQUENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT )+ ;
    public final AntlrDatatypeRuleToken ruleUNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:28: ( (this_DIGIT_0= RULE_DIGIT )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (this_DIGIT_0= RULE_DIGIT )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (this_DIGIT_0= RULE_DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DIGIT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:6: this_DIGIT_0= RULE_DIGIT
            	    {
            	    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE1357); 

            	    		current.merge(this_DIGIT_0);
            	        
            	     
            	        newLeafNode(this_DIGIT_0, grammarAccess.getUNSIGNED_DIGIT_SEQUENCEAccess().getDIGITTerminalRuleCall()); 
            	        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:1: entryRuleDIGIT_SEQUENCE returns [String current=null] : iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF ;
    public final String entryRuleDIGIT_SEQUENCE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIGIT_SEQUENCE = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:2: (iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:2: iv_ruleDIGIT_SEQUENCE= ruleDIGIT_SEQUENCE EOF
            {
             newCompositeNode(grammarAccess.getDIGIT_SEQUENCERule()); 
            pushFollow(FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE1404);
            iv_ruleDIGIT_SEQUENCE=ruleDIGIT_SEQUENCE();

            state._fsp--;

             current =iv_ruleDIGIT_SEQUENCE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE1415); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: ruleDIGIT_SEQUENCE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE ) ;
    public final AntlrDatatypeRuleToken ruleDIGIT_SEQUENCE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UNSIGNED_DIGIT_SEQUENCE_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:560:28: ( ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ( (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:2: (kw= '+' | kw= '-' )? this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:2: (kw= '+' | kw= '-' )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:2: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDIGIT_SEQUENCE1454); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDIGIT_SEQUENCEAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleDIGIT_SEQUENCE1473); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDIGIT_SEQUENCEAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDIGIT_SEQUENCEAccess().getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleDIGIT_SEQUENCE1497);
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\1\1\13\uffff";
    static final String DFA4_minS =
        "\1\14\13\uffff";
    static final String DFA4_maxS =
        "\1\32\13\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\uffff\2\1",
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
            return "()+ loopback of 250:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+";
        }
    }
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\1\1\13\uffff";
    static final String DFA6_minS =
        "\1\14\13\uffff";
    static final String DFA6_maxS =
        "\1\27\13\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()+ loopback of 332:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+";
        }
    }
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\2\5\2\uffff";
    static final String DFA12_maxS =
        "\1\5\1\32\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\1\22\uffff\1\3\2\2",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "424:1: ( (this_UNSIGNED_DIGIT_SEQUENCE_0= ruleUNSIGNED_DIGIT_SEQUENCE kw= '.' (this_UNSIGNED_DIGIT_SEQUENCE_2= ruleUNSIGNED_DIGIT_SEQUENCE )? ( (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_5= ruleDIGIT_SEQUENCE )? ) | (this_UNSIGNED_DIGIT_SEQUENCE_6= ruleUNSIGNED_DIGIT_SEQUENCE (kw= 'E' | kw= 'e' ) this_DIGIT_SEQUENCE_9= ruleDIGIT_SEQUENCE ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000FFD002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGreeting214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGreeting248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleGreeting271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulenumber357 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_15_in_rulenumber376 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_16_in_rulenumber395 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_17_in_rulenumber414 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_18_in_rulenumber433 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_19_in_rulenumber452 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_20_in_rulenumber471 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_21_in_rulenumber490 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_22_in_rulenumber509 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_23_in_rulenumber528 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_24_in_rulenumber543 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_14_in_rulenumber557 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_15_in_rulenumber576 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_16_in_rulenumber595 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_17_in_rulenumber614 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_18_in_rulenumber633 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_19_in_rulenumber652 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_20_in_rulenumber671 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_21_in_rulenumber690 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_22_in_rulenumber709 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_23_in_rulenumber728 = new BitSet(new long[]{0x0000000006FFC002L});
    public static final BitSet FOLLOW_25_in_rulenumber745 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_26_in_rulenumber764 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_14_in_rulenumber779 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_15_in_rulenumber798 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_16_in_rulenumber817 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_17_in_rulenumber836 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_18_in_rulenumber855 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_19_in_rulenumber874 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_20_in_rulenumber893 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_21_in_rulenumber912 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_22_in_rulenumber931 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_23_in_rulenumber950 = new BitSet(new long[]{0x0000000000FFC002L});
    public static final BitSet FOLLOW_ruleREAL_NUMBER_in_entryRuleREAL_NUMBER997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL_NUMBER1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1056 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleREAL_NUMBER1074 = new BitSet(new long[]{0x0000000006000022L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1097 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleREAL_NUMBER1119 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_26_in_ruleREAL_NUMBER1138 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleREAL_NUMBER1198 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleREAL_NUMBER1217 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_26_in_ruleREAL_NUMBER1236 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_ruleREAL_NUMBER1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_entryRuleUNSIGNED_DIGIT_SEQUENCE1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNSIGNED_DIGIT_SEQUENCE1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleUNSIGNED_DIGIT_SEQUENCE1357 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDIGIT_SEQUENCE_in_entryRuleDIGIT_SEQUENCE1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIGIT_SEQUENCE1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDIGIT_SEQUENCE1454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28_in_ruleDIGIT_SEQUENCE1473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUNSIGNED_DIGIT_SEQUENCE_in_ruleDIGIT_SEQUENCE1497 = new BitSet(new long[]{0x0000000000000002L});

}