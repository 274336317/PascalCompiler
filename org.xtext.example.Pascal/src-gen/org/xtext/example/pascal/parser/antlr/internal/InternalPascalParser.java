package org.xtext.example.pascal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Procedure", "Function", "Forward", "Program", "Downto", "Packed", "Record", "Repeat", "Array", "Begin", "Const", "False", "Label", "Until", "While", "Case", "Else", "File", "Goto", "Then", "True", "Type", "With", "And", "Div", "End", "For", "Mod", "Nil", "Not", "Set", "Var", "FullStopFullStop", "ColonEqualsSign", "Do", "If", "In", "Of", "Or", "To", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "Semicolon", "EqualsSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_RELATIONAL_OPERATOR", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int End=29;
    public static final int RULE_ID=66;
    public static final int Goto=22;
    public static final int RightParenthesis=45;
    public static final int Array=12;
    public static final int RULE_ANY_OTHER=71;
    public static final int False=15;
    public static final int Forward=6;
    public static final int LeftParenthesis=44;
    public static final int RightSquareBracket=52;
    public static final int RULE_NUMERIC_SUBRANGE=58;
    public static final int While=18;
    public static final int Case=19;
    public static final int RULE_ADDITION_OPERATOR=59;
    public static final int EOF=-1;
    public static final int Set=34;
    public static final int FullStop=47;
    public static final int Program=7;
    public static final int Begin=13;
    public static final int Repeat=11;
    public static final int Nil=32;
    public static final int RULE_REAL_NUMBER=55;
    public static final int To=43;
    public static final int Do=38;
    public static final int RULE_MULTIPLICATION_OPERATOR=60;
    public static final int RULE_INT=67;
    public static final int LeftSquareBracket=51;
    public static final int Or=42;
    public static final int True=24;
    public static final int FullStopFullStop=36;
    public static final int Downto=8;
    public static final int If=39;
    public static final int And=27;
    public static final int Div=28;
    public static final int RULE_RELATIONAL_OPERATOR=61;
    public static final int Mod=31;
    public static final int In=40;
    public static final int Packed=9;
    public static final int Type=25;
    public static final int Then=23;
    public static final int Procedure=4;
    public static final int ColonEqualsSign=37;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=62;
    public static final int Colon=48;
    public static final int Const=14;
    public static final int Semicolon=49;
    public static final int RULE_SL_COMMENT=69;
    public static final int For=30;
    public static final int With=26;
    public static final int RULE_ML_COMMENT=65;
    public static final int RULE_STRING=68;
    public static final int RULE_SIGNED_REAL_NUMBER=57;
    public static final int File=21;
    public static final int Function=5;
    public static final int Not=33;
    public static final int Record=10;
    public static final int RULE_DIGIT_SEQUENCE=63;
    public static final int RULE_WS=70;
    public static final int Else=20;
    public static final int CircumflexAccent=53;
    public static final int RULE_SIGNED_INTEGER_NUMBER=56;
    public static final int RULE_DIGIT=64;
    public static final int Label=16;
    public static final int Comma=46;
    public static final int EqualsSign=50;
    public static final int Of=41;
    public static final int Var=35;
    public static final int Until=17;
    public static final int RULE_INTEGER_NUMBER=54;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g"; }




    	private PascalGrammarAccess grammarAccess;
    	 	
    	public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "pascal";	
    	} 
    	   	   	
    	@Override
    	protected PascalGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRulepascal"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:61:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:62:2: (iv_rulepascal= rulepascal EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:63:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_rulepascal_in_entryRulepascal67);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepascal77); 

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
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:70:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:73:28: ( ( (lv_program_0_0= ruleprogram ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:74:1: ( (lv_program_0_0= ruleprogram ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:74:1: ( (lv_program_0_0= ruleprogram ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:75:1: (lv_program_0_0= ruleprogram )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:75:1: (lv_program_0_0= ruleprogram )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:76:3: lv_program_0_0= ruleprogram
            {
             
            	        newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleprogram_in_rulepascal122);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPascalRule());
            	        }
                   		add(
                   			current, 
                   			"program",
                    		lv_program_0_0, 
                    		"program");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:101:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:102:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram156);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram166); 

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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:109:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:112:28: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:1: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:1: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:2: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:2: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (lv_heading_0_0= ruleprogram_heading_block )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:115:3: lv_heading_0_0= ruleprogram_heading_block
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprogram_heading_block_in_ruleprogram212);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"program_heading_block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:131:2: ( (lv_block_1_0= ruleblock ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:132:1: (lv_block_1_0= ruleblock )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:132:1: (lv_block_1_0= ruleblock )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:133:3: lv_block_1_0= ruleblock
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleblock_in_ruleprogram233);
            lv_block_1_0=ruleblock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleprogram246); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
                

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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:162:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:163:2: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block280);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading_block290); 

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
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:171:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:174:28: ( (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:175:1: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:175:1: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:176:2: otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Program,FOLLOW_Program_in_ruleprogram_heading_block328); 

                	newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:181:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:181:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprogram_heading_block344); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:198:2: (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LeftParenthesis) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:199:2: otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleprogram_heading_block363); 

                        	newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:203:1: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:204:1: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:204:1: (lv_identifiers_3_0= ruleidentifier_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:205:3: lv_identifiers_3_0= ruleidentifier_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block383);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    	        }
                           		set(
                           			current, 
                           			"identifiers",
                            		lv_identifiers_3_0, 
                            		"identifier_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleprogram_heading_block396); 

                        	newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprogram_heading_block410); 

                	newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:239:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:240:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:241:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list444);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list454); 

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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:248:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:251:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:2: ( (lv_names_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:253:1: (lv_names_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:253:1: (lv_names_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:254:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list496); 

            			newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifier_listRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:270:2: (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:271:2: otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleidentifier_list515); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:275:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:276:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:276:1: (lv_names_2_0= RULE_ID )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:277:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list531); 

            	    			newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:301:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:302:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:303:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock573);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock583); 

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:310:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_abstraction_4_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:313:28: ( ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:2: ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:2: ( (lv_label_0_0= rulelabel_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Label) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:315:1: (lv_label_0_0= rulelabel_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:315:1: (lv_label_0_0= rulelabel_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:316:3: lv_label_0_0= rulelabel_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declaration_partParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruleblock629);
                    lv_label_0_0=rulelabel_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_0_0, 
                            		"label_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:332:3: ( (lv_constant_1_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Const) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:333:1: (lv_constant_1_0= ruleconstant_definition_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:333:1: (lv_constant_1_0= ruleconstant_definition_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:334:3: lv_constant_1_0= ruleconstant_definition_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruleblock651);
                    lv_constant_1_0=ruleconstant_definition_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_1_0, 
                            		"constant_definition_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:350:3: ( (lv_type_2_0= ruletype_definition_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Type) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:351:1: (lv_type_2_0= ruletype_definition_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:351:1: (lv_type_2_0= ruletype_definition_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:352:3: lv_type_2_0= ruletype_definition_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruleblock673);
                    lv_type_2_0=ruletype_definition_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"type_definition_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:368:3: ( (lv_variable_3_0= rulevariable_declaration_part ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Var) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:369:1: (lv_variable_3_0= rulevariable_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:369:1: (lv_variable_3_0= rulevariable_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:370:3: lv_variable_3_0= rulevariable_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruleblock695);
                    lv_variable_3_0=rulevariable_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_3_0, 
                            		"variable_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:386:3: ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Procedure && LA7_0<=Function)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:387:1: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:387:1: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:388:3: lv_abstraction_4_0= ruleprocedure_and_function_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleblock717);
                    lv_abstraction_4_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"abstraction",
                            		lv_abstraction_4_0, 
                            		"procedure_and_function_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:404:3: ( (lv_statement_5_0= rulestatement_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:405:1: (lv_statement_5_0= rulestatement_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:405:1: (lv_statement_5_0= rulestatement_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:406:3: lv_statement_5_0= rulestatement_part
            {
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock739);
            lv_statement_5_0=rulestatement_part();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_5_0, 
                    		"statement_part");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:430:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:431:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:432:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part774);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part784); 

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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:439:1: rulestatement_part returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:442:28: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:443:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:443:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:444:2: otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_Begin_in_rulestatement_part822); 

                	newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:448:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:449:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:449:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:450:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part842);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatement_partRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,End,FOLLOW_End_in_rulestatement_part855); 

                	newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
                

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:479:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:480:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:481:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence889);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence899); 

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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:488:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:491:28: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:1: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:1: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:2: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:2: ( (lv_statements_0_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:493:1: (lv_statements_0_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:493:1: (lv_statements_0_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:494:3: lv_statements_0_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence945);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_0_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:510:2: (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Semicolon) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:511:2: otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulestatement_sequence959); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:515:1: ( (lv_statements_2_0= rulestatement ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:516:1: (lv_statements_2_0= rulestatement )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:516:1: (lv_statements_2_0= rulestatement )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:517:3: lv_statements_2_0= rulestatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence979);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:541:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:542:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:543:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1016);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1026); 

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:550:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:553:28: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:1: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:1: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:2: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:2: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER_NUMBER||LA9_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:3: ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:3: ( (lv_label_0_0= rulelabel ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:555:1: (lv_label_0_0= rulelabel )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:555:1: (lv_label_0_0= rulelabel )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:556:3: lv_label_0_0= rulelabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1073);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_0_0, 
                            		"label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulestatement1086); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==Until||LA10_0==Else||LA10_0==Goto||LA10_0==End||LA10_0==Semicolon||LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==Repeat||LA10_0==Begin||(LA10_0>=While && LA10_0<=Case)||LA10_0==With||LA10_0==For||LA10_0==If) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:578:1: (lv_simple_2_0= rulesimple_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:578:1: (lv_simple_2_0= rulesimple_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:579:3: lv_simple_2_0= rulesimple_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1109);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"simple",
                            		lv_simple_2_0, 
                            		"simple_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:596:6: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:596:6: ( (lv_structured_3_0= rulestructured_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:597:1: (lv_structured_3_0= rulestructured_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:597:1: (lv_structured_3_0= rulestructured_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:598:3: lv_structured_3_0= rulestructured_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement1136);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"structured",
                            		lv_structured_3_0, 
                            		"structured_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:622:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:623:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:624:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1172);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1182); 

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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:631:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:634:28: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INTEGER_NUMBER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:636:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:636:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:637:3: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1224); 

                    			newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"SIGNED_INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:654:6: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:654:6: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:655:1: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:655:1: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:656:3: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1252); 

                    			newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"INTEGER_NUMBER");
                    	    

                    }


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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:680:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:681:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:682:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1292);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1302); 

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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:689:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | this_ID_3= RULE_ID )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token this_ID_3=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:692:28: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | this_ID_3= RULE_ID )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | this_ID_3= RULE_ID )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | this_ID_3= RULE_ID )?
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case ColonEqualsSign:
                    case FullStop:
                    case LeftSquareBracket:
                    case CircumflexAccent:
                        {
                        alt12=1;
                        }
                        break;
                    case EOF:
                    case Until:
                    case Else:
                    case End:
                    case Semicolon:
                        {
                        alt12=4;
                        }
                        break;
                    case LeftParenthesis:
                        {
                        alt12=2;
                        }
                        break;
                }

            }
            else if ( (LA12_0==Goto) ) {
                alt12=3;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:2: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:2: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:694:1: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:694:1: (lv_assignment_0_0= ruleassignment_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:695:3: lv_assignment_0_0= ruleassignment_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1348);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"assignment",
                            		lv_assignment_0_0, 
                            		"assignment_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:712:6: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:712:6: ( (lv_function_1_0= rulefunction_designator ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:713:1: (lv_function_1_0= rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:713:1: (lv_function_1_0= rulefunction_designator )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:714:3: lv_function_1_0= rulefunction_designator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_designator_in_rulesimple_statement1375);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_1_0, 
                            		"function_designator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:731:6: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:731:6: ( (lv_goto_2_0= rulegoto_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:732:1: (lv_goto_2_0= rulegoto_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:732:1: (lv_goto_2_0= rulegoto_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:733:3: lv_goto_2_0= rulegoto_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement1402);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"goto",
                            		lv_goto_2_0, 
                            		"goto_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:6: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_statement1419); 
                     
                        newLeafNode(this_ID_3, grammarAccess.getSimple_statementAccess().getIDTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:762:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:763:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:764:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1454);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1464); 

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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:771:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:774:28: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:775:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:775:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:775:2: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:775:2: ( (lv_variable_0_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:776:1: (lv_variable_0_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:776:1: (lv_variable_0_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:777:3: lv_variable_0_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1510);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,ColonEqualsSign,FOLLOW_ColonEqualsSign_in_ruleassignment_statement1523); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:798:1: ( (lv_expression_2_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:799:1: (lv_expression_2_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:799:1: (lv_expression_2_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:800:3: lv_expression_2_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1543);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:824:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:825:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:826:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1578);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1588); 

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:833:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:836:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:837:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:837:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:837:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:837:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:838:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:838:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:839:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable1630); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:855:2: ( (lv_variable_1_0= rulevar_ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:856:1: (lv_variable_1_0= rulevar_ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:856:1: (lv_variable_1_0= rulevar_ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:857:3: lv_variable_1_0= rulevar_
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevar__in_rulevariable1656);
            lv_variable_1_0=rulevar_();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"var_");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:881:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:882:2: (iv_rulevar_= rulevar_ EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:883:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_rulevar__in_entryRulevar_1691);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevar_1701); 

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
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:890:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) ) | (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_variable_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:893:28: ( ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) ) | (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:894:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) ) | (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:894:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) ) | (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) ) )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case LeftSquareBracket:
                    {
                    alt13=1;
                    }
                    break;
                case FullStop:
                    {
                    alt13=2;
                    }
                    break;
                case CircumflexAccent:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:894:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:894:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:2: otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_variable_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulevar_1740); 

                        	newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:899:1: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:900:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:900:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:901:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulevar_1760);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_1_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulevar_1773); 

                        	newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:922:1: ( (lv_variable_3_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:1: (lv_variable_3_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:1: (lv_variable_3_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:924:3: lv_variable_3_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1793);
                    lv_variable_3_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_3_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:6: (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:6: (otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:942:2: otherlv_4= FullStop ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    otherlv_4=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulevar_1814); 

                        	newLeafNode(otherlv_4, grammarAccess.getVar_Access().getFullStopKeyword_1_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:946:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:947:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:947:1: (lv_name_5_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:948:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevar_1830); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVar_Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:964:2: ( (lv_variable_6_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:1: (lv_variable_6_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:1: (lv_variable_6_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:966:3: lv_variable_6_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1856);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_6_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:983:6: (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:983:6: (otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:984:2: otherlv_7= CircumflexAccent ( (lv_variable_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulevar_1877); 

                        	newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:988:1: ( (lv_variable_8_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:989:1: (lv_variable_8_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:989:1: (lv_variable_8_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:990:3: lv_variable_8_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1897);
                    lv_variable_8_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_8_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1015:2: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1016:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list1934);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list1944); 

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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1023:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1026:28: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1027:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1027:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1027:2: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1027:2: ( (lv_expressions_0_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1028:1: (lv_expressions_0_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1028:1: (lv_expressions_0_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1029:3: lv_expressions_0_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list1990);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1045:2: (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1046:2: otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleexpression_list2004); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1050:1: ( (lv_expressions_2_0= ruleexpression ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1051:1: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1051:1: (lv_expressions_2_0= ruleexpression )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:3: lv_expressions_2_0= ruleexpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2024);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1077:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1078:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2061);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2071); 

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1085:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        Token lv_operator_2_0=null;
        Token lv_operator_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1088:28: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1089:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1089:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1089:2: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1089:2: ( (lv_expressions_0_0= rulesimple_expression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1090:1: (lv_expressions_0_0= rulesimple_expression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1090:1: (lv_expressions_0_0= rulesimple_expression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1091:3: lv_expressions_0_0= rulesimple_expression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2117);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"simple_expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1107:2: ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==In||LA16_0==EqualsSign||LA16_0==RULE_RELATIONAL_OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1107:3: ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1107:3: ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt15=1;
                        }
                        break;
                    case In:
                        {
                        alt15=2;
                        }
                        break;
                    case EqualsSign:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1107:4: ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1107:4: ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1108:1: (lv_operator_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1108:1: (lv_operator_1_0= RULE_RELATIONAL_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1109:3: lv_operator_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operator_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2136); 

                            			newLeafNode(lv_operator_1_0, grammarAccess.getExpressionAccess().getOperatorRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"operator",
                                    		lv_operator_1_0, 
                                    		"RELATIONAL_OPERATOR");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1126:6: ( (lv_operator_2_0= In ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1126:6: ( (lv_operator_2_0= In ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1127:1: (lv_operator_2_0= In )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1127:1: (lv_operator_2_0= In )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1128:3: lv_operator_2_0= In
                            {
                            lv_operator_2_0=(Token)match(input,In,FOLLOW_In_in_ruleexpression2166); 

                                    newLeafNode(lv_operator_2_0, grammarAccess.getExpressionAccess().getOperatorInKeyword_1_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_2_0, "in");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1143:6: ( (lv_operator_3_0= EqualsSign ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1143:6: ( (lv_operator_3_0= EqualsSign ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1144:1: (lv_operator_3_0= EqualsSign )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1144:1: (lv_operator_3_0= EqualsSign )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1145:3: lv_operator_3_0= EqualsSign
                            {
                            lv_operator_3_0=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleexpression2202); 

                                    newLeafNode(lv_operator_3_0, grammarAccess.getExpressionAccess().getOperatorEqualsSignKeyword_1_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_3_0, "=");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1159:3: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1160:1: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1160:1: (lv_expressions_4_0= rulesimple_expression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1161:3: lv_expressions_4_0= rulesimple_expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2235);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_4_0, 
                            		"simple_expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1185:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1186:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1187:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2272);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2282); 

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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1194:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_numbers_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1197:28: ( ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1198:1: ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1198:1: ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1198:2: ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1198:2: ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ADDITION_OPERATOR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1199:1: (lv_operators_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1199:1: (lv_operators_0_0= RULE_ADDITION_OPERATOR )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1200:3: lv_operators_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_operators_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2324); 

                    			newLeafNode(lv_operators_0_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_expressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operators",
                            		lv_operators_0_0, 
                            		"ADDITION_OPERATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1216:3: ( (lv_terms_1_0= ruleterm ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1217:1: (lv_terms_1_0= ruleterm )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1217:1: (lv_terms_1_0= ruleterm )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1218:3: lv_terms_1_0= ruleterm
            {
             
            	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2351);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_1_0, 
                    		"term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:2: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Or||LA20_0==RULE_ADDITION_OPERATOR) ) {
                    alt20=1;
                }
                else if ( ((LA20_0>=RULE_SIGNED_INTEGER_NUMBER && LA20_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ADDITION_OPERATOR) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==Or) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==RULE_ADDITION_OPERATOR) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1235:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            	    {
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1235:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1236:3: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            	    {
            	            	    lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2371); 

            	            	    			newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0()); 
            	            	    		

            	            	    	        if (current==null) {
            	            	    	            current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            	    	        }
            	            	           		addWithLastConsumed(
            	            	           			current, 
            	            	           			"operators",
            	            	            		lv_operators_2_0, 
            	            	            		"ADDITION_OPERATOR");
            	            	    	    

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1253:6: ( (lv_operators_3_0= Or ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1253:6: ( (lv_operators_3_0= Or ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1254:1: (lv_operators_3_0= Or )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1254:1: (lv_operators_3_0= Or )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1255:3: lv_operators_3_0= Or
            	            {
            	            lv_operators_3_0=(Token)match(input,Or,FOLLOW_Or_in_rulesimple_expression2402); 

            	                    newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1269:3: ( (lv_terms_4_0= ruleterm ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1270:1: (lv_terms_4_0= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1270:1: (lv_terms_4_0= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1271:3: lv_terms_4_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2435);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_4_0, 
            	            		"term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1288:6: ( (lv_numbers_5_0= rulesigned_number ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1288:6: ( (lv_numbers_5_0= rulesigned_number ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1289:1: (lv_numbers_5_0= rulesigned_number )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1289:1: (lv_numbers_5_0= rulesigned_number )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1290:3: lv_numbers_5_0= rulesigned_number
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getNumbersSigned_numberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigned_number_in_rulesimple_expression2463);
            	    lv_numbers_5_0=rulesigned_number();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"numbers",
            	            		lv_numbers_5_0, 
            	            		"signed_number");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1314:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1315:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1316:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2500);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2510); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1323:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1326:28: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1327:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1327:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1327:2: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1327:2: ( (lv_factors_0_0= rulefactor ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1328:1: (lv_factors_0_0= rulefactor )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1328:1: (lv_factors_0_0= rulefactor )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1329:3: lv_factors_0_0= rulefactor
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefactor_in_ruleterm2556);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		add(
                   			current, 
                   			"factors",
                    		lv_factors_0_0, 
                    		"factor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1345:2: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=And && LA22_0<=Div)||LA22_0==Mod||LA22_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1345:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1345:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case Div:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case Mod:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case And:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1345:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1345:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1346:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1346:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1347:3: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2575); 

            	            			newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"operators",
            	                    		lv_operators_1_0, 
            	                    		"MULTIPLICATION_OPERATOR");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1364:6: ( (lv_operators_2_0= Div ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1364:6: ( (lv_operators_2_0= Div ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1365:1: (lv_operators_2_0= Div )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1365:1: (lv_operators_2_0= Div )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1366:3: lv_operators_2_0= Div
            	            {
            	            lv_operators_2_0=(Token)match(input,Div,FOLLOW_Div_in_ruleterm2605); 

            	                    newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1381:6: ( (lv_operators_3_0= Mod ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1381:6: ( (lv_operators_3_0= Mod ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1382:1: (lv_operators_3_0= Mod )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1382:1: (lv_operators_3_0= Mod )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1383:3: lv_operators_3_0= Mod
            	            {
            	            lv_operators_3_0=(Token)match(input,Mod,FOLLOW_Mod_in_ruleterm2641); 

            	                    newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1398:6: ( (lv_operators_4_0= And ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1398:6: ( (lv_operators_4_0= And ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1399:1: (lv_operators_4_0= And )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1399:1: (lv_operators_4_0= And )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1400:3: lv_operators_4_0= And
            	            {
            	            lv_operators_4_0=(Token)match(input,And,FOLLOW_And_in_ruleterm2677); 

            	                    newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1414:3: ( (lv_factors_5_0= rulefactor ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1415:1: (lv_factors_5_0= rulefactor )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1415:1: (lv_factors_5_0= rulefactor )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1416:3: lv_factors_5_0= rulefactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2710);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factors",
            	            		lv_factors_5_0, 
            	            		"factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1440:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1441:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1442:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2747);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2757); 

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1449:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | otherlv_4= Nil | otherlv_5= True | otherlv_6= False | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis ) | (otherlv_11= Not this_factor_12= rulefactor ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject this_number_1 = null;

        EObject this_set_3 = null;

        EObject lv_function_7_0 = null;

        EObject this_expression_9 = null;

        EObject this_factor_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1452:28: ( ( ( (lv_variable_0_0= rulevariable ) ) | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | otherlv_4= Nil | otherlv_5= True | otherlv_6= False | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis ) | (otherlv_11= Not this_factor_12= rulefactor ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1453:1: ( ( (lv_variable_0_0= rulevariable ) ) | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | otherlv_4= Nil | otherlv_5= True | otherlv_6= False | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis ) | (otherlv_11= Not this_factor_12= rulefactor ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1453:1: ( ( (lv_variable_0_0= rulevariable ) ) | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | otherlv_4= Nil | otherlv_5= True | otherlv_6= False | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis ) | (otherlv_11= Not this_factor_12= rulefactor ) )
            int alt23=10;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1453:2: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1453:2: ( (lv_variable_0_0= rulevariable ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1454:1: (lv_variable_0_0= rulevariable )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1454:1: (lv_variable_0_0= rulevariable )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1455:3: lv_variable_0_0= rulevariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2803);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_0_0, 
                            		"variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1473:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2831);
                    this_number_1=rulenumber();

                    state._fsp--;


                            current = this_number_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1482:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2847); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1488:5: this_set_3= ruleset
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_in_rulefactor2874);
                    this_set_3=ruleset();

                    state._fsp--;


                            current = this_set_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1498:2: otherlv_4= Nil
                    {
                    otherlv_4=(Token)match(input,Nil,FOLLOW_Nil_in_rulefactor2892); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getNilKeyword_4());
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1504:2: otherlv_5= True
                    {
                    otherlv_5=(Token)match(input,True,FOLLOW_True_in_rulefactor2910); 

                        	newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getTrueKeyword_5());
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1510:2: otherlv_6= False
                    {
                    otherlv_6=(Token)match(input,False,FOLLOW_False_in_rulefactor2928); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getFalseKeyword_6());
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1515:6: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1515:6: ( (lv_function_7_0= rulefunction_designator ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1516:1: (lv_function_7_0= rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1516:1: (lv_function_7_0= rulefunction_designator )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1517:3: lv_function_7_0= rulefunction_designator
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor2954);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_7_0, 
                            		"function_designator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1534:6: (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1534:6: (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1535:2: otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis
                    {
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefactor2974); 

                        	newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_8_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor2995);
                    this_expression_9=ruleexpression();

                    state._fsp--;


                            current = this_expression_9;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefactor3007); 

                        	newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1554:6: (otherlv_11= Not this_factor_12= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1554:6: (otherlv_11= Not this_factor_12= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1555:2: otherlv_11= Not this_factor_12= rulefactor
                    {
                    otherlv_11=(Token)match(input,Not,FOLLOW_Not_in_rulefactor3027); 

                        	newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3048);
                    this_factor_12=rulefactor();

                    state._fsp--;


                            current = this_factor_12;
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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1576:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1577:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1578:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3083);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3093); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1585:1: rulenumber returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_number_1_0= rulesigned_number ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;

        EObject lv_number_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1588:28: ( ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_number_1_0= rulesigned_number ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1589:1: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_number_1_0= rulesigned_number ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1589:1: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_number_1_0= rulesigned_number ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INTEGER_NUMBER && LA24_0<=RULE_REAL_NUMBER)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_SIGNED_INTEGER_NUMBER && LA24_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1589:2: ( (lv_number_0_0= ruleunsigned_number ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1589:2: ( (lv_number_0_0= ruleunsigned_number ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1590:1: (lv_number_0_0= ruleunsigned_number )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1590:1: (lv_number_0_0= ruleunsigned_number )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1591:3: lv_number_0_0= ruleunsigned_number
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getNumberUnsigned_numberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleunsigned_number_in_rulenumber3139);
                    lv_number_0_0=ruleunsigned_number();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"unsigned_number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1608:6: ( (lv_number_1_0= rulesigned_number ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1608:6: ( (lv_number_1_0= rulesigned_number ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (lv_number_1_0= rulesigned_number )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (lv_number_1_0= rulesigned_number )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1610:3: lv_number_1_0= rulesigned_number
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getNumberSigned_numberParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulesigned_number_in_rulenumber3166);
                    lv_number_1_0=rulesigned_number();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"signed_number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1634:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1635:2: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1636:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3201);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3211); 

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
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1643:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1646:28: ( ( ( (lv_number_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1647:1: ( ( (lv_number_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1647:1: ( ( (lv_number_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_REAL_NUMBER ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INTEGER_NUMBER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_REAL_NUMBER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1647:2: ( (lv_number_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1647:2: ( (lv_number_0_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1648:1: (lv_number_0_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1648:1: (lv_number_0_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1649:3: lv_number_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3253); 

                    			newLeafNode(lv_number_0_0, grammarAccess.getUnsigned_numberAccess().getNumberINTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1666:6: ( (lv_number_1_0= RULE_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1666:6: ( (lv_number_1_0= RULE_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1667:1: (lv_number_1_0= RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1667:1: (lv_number_1_0= RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1668:3: lv_number_1_0= RULE_REAL_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3281); 

                    			newLeafNode(lv_number_1_0, grammarAccess.getUnsigned_numberAccess().getNumberREAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"REAL_NUMBER");
                    	    

                    }


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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1692:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1693:2: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1694:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3321);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3331); 

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
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1701:1: rulesigned_number returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1704:28: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1705:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1705:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1705:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1705:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1706:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1706:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1707:3: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3373); 

                    			newLeafNode(lv_number_0_0, grammarAccess.getSigned_numberAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"SIGNED_INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1724:6: ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1724:6: ( (lv_number_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1725:1: (lv_number_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1725:1: (lv_number_1_0= RULE_SIGNED_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1726:3: lv_number_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3401); 

                    			newLeafNode(lv_number_1_0, grammarAccess.getSigned_numberAccess().getNumberSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"SIGNED_REAL_NUMBER");
                    	    

                    }


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
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1750:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1751:2: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1752:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3441);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3451); 

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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1759:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1762:28: ( ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1763:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1763:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1763:2: ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1763:2: ( (lv_brackets_0_0= LeftSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1764:1: (lv_brackets_0_0= LeftSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1764:1: (lv_brackets_0_0= LeftSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1765:3: lv_brackets_0_0= LeftSquareBracket
            {
            lv_brackets_0_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleset3495); 

                    newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1779:2: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==False||LA27_0==True||(LA27_0>=Nil && LA27_0<=Not)||LA27_0==LeftParenthesis||LA27_0==LeftSquareBracket||(LA27_0>=RULE_INTEGER_NUMBER && LA27_0<=RULE_SIGNED_REAL_NUMBER)||LA27_0==RULE_ADDITION_OPERATOR||LA27_0==RULE_ID||LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1780:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1780:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1781:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3527);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_1_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1797:3: ( (lv_brackets_2_0= RightSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1798:1: (lv_brackets_2_0= RightSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1798:1: (lv_brackets_2_0= RightSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1799:3: lv_brackets_2_0= RightSquareBracket
            {
            lv_brackets_2_0=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleset3547); 

                    newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            	    

            }


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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1821:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1822:2: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1823:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3593);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3603); 

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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1830:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1833:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1834:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1834:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1834:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1834:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1835:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1835:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1836:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_designator3645); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_designatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefunction_designator3663); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1857:1: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==False||LA28_0==True||(LA28_0>=Nil && LA28_0<=Not)||LA28_0==LeftParenthesis||LA28_0==LeftSquareBracket||(LA28_0>=RULE_INTEGER_NUMBER && LA28_0<=RULE_SIGNED_REAL_NUMBER)||LA28_0==RULE_ADDITION_OPERATOR||LA28_0==RULE_ID||LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1858:1: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1858:1: (lv_expressions_2_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1859:3: lv_expressions_2_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3683);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_2_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefunction_designator3697); 

                	newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1888:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1889:2: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1890:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement3731);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement3741); 

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1897:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_withStmt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1900:28: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case Begin:
                {
                alt29=1;
                }
                break;
            case Repeat:
            case While:
            case For:
                {
                alt29=2;
                }
                break;
            case Case:
            case If:
                {
                alt29=3;
                }
                break;
            case With:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:1: (lv_compound_0_0= rulecompound_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:1: (lv_compound_0_0= rulecompound_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1903:3: lv_compound_0_0= rulecompound_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement3787);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"compound",
                            		lv_compound_0_0, 
                            		"compound_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1920:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1920:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1921:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1921:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1922:3: lv_repetitive_1_0= rulerepetitive_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement3814);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"repetitive",
                            		lv_repetitive_1_0, 
                            		"repetitive_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1939:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1939:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1940:1: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1940:1: (lv_conditional_2_0= ruleconditional_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1941:3: lv_conditional_2_0= ruleconditional_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement3841);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"conditional_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1958:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1958:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1959:1: (lv_withStmt_3_0= rulewith_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1959:1: (lv_withStmt_3_0= rulewith_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1960:3: lv_withStmt_3_0= rulewith_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getWithStmtWith_statementParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement3868);
                    lv_withStmt_3_0=rulewith_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"withStmt",
                            		lv_withStmt_3_0, 
                            		"with_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1984:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1985:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1986:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement3903);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement3913); 

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1993:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1996:28: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1997:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1997:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1998:2: otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_Begin_in_rulecompound_statement3951); 

                	newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2002:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2003:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2003:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2004:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement3971);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,End,FOLLOW_End_in_rulecompound_statement3984); 

                	newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
                

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
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2033:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2034:2: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2035:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4018);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4028); 

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
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2042:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_whileStmt_0_0 = null;

        EObject lv_repeatStmt_1_0 = null;

        EObject lv_forStmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2045:28: ( ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2046:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2046:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case While:
                {
                alt30=1;
                }
                break;
            case Repeat:
                {
                alt30=2;
                }
                break;
            case For:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2046:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2046:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2047:1: (lv_whileStmt_0_0= rulewhile_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2047:1: (lv_whileStmt_0_0= rulewhile_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:3: lv_whileStmt_0_0= rulewhile_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileStmtWhile_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4074);
                    lv_whileStmt_0_0=rulewhile_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"whileStmt",
                            		lv_whileStmt_0_0, 
                            		"while_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2065:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2065:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2066:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2066:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2067:3: lv_repeatStmt_1_0= rulerepeat_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatStmtRepeat_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4101);
                    lv_repeatStmt_1_0=rulerepeat_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"repeatStmt",
                            		lv_repeatStmt_1_0, 
                            		"repeat_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2084:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2084:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2085:1: (lv_forStmt_2_0= rulefor_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2085:1: (lv_forStmt_2_0= rulefor_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2086:3: lv_forStmt_2_0= rulefor_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4128);
                    lv_forStmt_2_0=rulefor_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"forStmt",
                            		lv_forStmt_2_0, 
                            		"for_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2110:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2111:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2112:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4163);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4173); 

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2119:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2122:28: ( (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2123:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2123:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2124:2: otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_While_in_rulewhile_statement4211); 

                	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2128:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2129:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2129:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2130:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4231);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Do,FOLLOW_Do_in_rulewhile_statement4244); 

                	newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2151:1: ( (lv_statement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2152:1: (lv_statement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2152:1: (lv_statement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2153:3: lv_statement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4264);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_3_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2177:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2178:2: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2179:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4299);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4309); 

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
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2186:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2189:28: ( (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2190:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2190:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2191:2: otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,Repeat,FOLLOW_Repeat_in_rulerepeat_statement4347); 

                	newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2195:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2196:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2196:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2197:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4367);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Until,FOLLOW_Until_in_rulerepeat_statement4380); 

                	newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2218:1: ( (lv_expression_3_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2219:1: (lv_expression_3_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2219:1: (lv_expression_3_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2220:3: lv_expression_3_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4400);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2244:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2245:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2246:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4435);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4445); 

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
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2253:1: rulefor_statement returns [EObject current=null] : (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2256:28: ( (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2257:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2257:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2258:2: otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_For_in_rulefor_statement4483); 

                	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2262:1: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2263:1: (lv_assignment_1_0= ruleassignment_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2263:1: (lv_assignment_1_0= ruleassignment_statement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2264:3: lv_assignment_1_0= ruleassignment_statement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4503);
            lv_assignment_1_0=ruleassignment_statement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"assignment",
                    		lv_assignment_1_0, 
                    		"assignment_statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2280:2: (otherlv_2= To | otherlv_3= Downto )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==To) ) {
                alt31=1;
            }
            else if ( (LA31_0==Downto) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2281:2: otherlv_2= To
                    {
                    otherlv_2=(Token)match(input,To,FOLLOW_To_in_rulefor_statement4517); 

                        	newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2287:2: otherlv_3= Downto
                    {
                    otherlv_3=(Token)match(input,Downto,FOLLOW_Downto_in_rulefor_statement4535); 

                        	newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2291:2: ( (lv_expression_4_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2292:1: (lv_expression_4_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2292:1: (lv_expression_4_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2293:3: lv_expression_4_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4556);
            lv_expression_4_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,Do,FOLLOW_Do_in_rulefor_statement4569); 

                	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2314:1: ( (lv_statement_6_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2315:1: (lv_statement_6_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2315:1: (lv_statement_6_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2316:3: lv_statement_6_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4589);
            lv_statement_6_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_6_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2340:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2341:2: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2342:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4624);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement4634); 

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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2349:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2352:28: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2353:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2353:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==If) ) {
                alt32=1;
            }
            else if ( (LA32_0==Case) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2353:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2353:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2354:1: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2354:1: (lv_ifStmt_0_0= ruleif_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2355:3: lv_ifStmt_0_0= ruleif_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement4680);
                    lv_ifStmt_0_0=ruleif_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"ifStmt",
                            		lv_ifStmt_0_0, 
                            		"if_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2372:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2372:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2373:1: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2373:1: (lv_caseStmt_1_0= rulecase_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2374:3: lv_caseStmt_1_0= rulecase_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement4707);
                    lv_caseStmt_1_0=rulecase_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"caseStmt",
                            		lv_caseStmt_1_0, 
                            		"case_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2398:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2399:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2400:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement4742);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement4752); 

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
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2407:1: ruleif_statement returns [EObject current=null] : (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2410:28: ( (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2411:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2411:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2412:2: otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_If_in_ruleif_statement4790); 

                	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2416:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2417:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2417:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2418:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement4810);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Then,FOLLOW_Then_in_ruleif_statement4823); 

                	newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2439:1: ( (lv_ifStatement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2440:1: (lv_ifStatement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2440:1: (lv_ifStatement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2441:3: lv_ifStatement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement4843);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
            	        }
                   		set(
                   			current, 
                   			"ifStatement",
                    		lv_ifStatement_3_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2457:2: (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Else) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2458:2: otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,Else,FOLLOW_Else_in_ruleif_statement4857); 

                        	newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2462:1: ( (lv_elseStatement_5_0= rulestatement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2463:1: (lv_elseStatement_5_0= rulestatement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2463:1: (lv_elseStatement_5_0= rulestatement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2464:3: lv_elseStatement_5_0= rulestatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement4877);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"elseStatement",
                            		lv_elseStatement_5_0, 
                            		"statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2488:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2489:2: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2490:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement4914);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement4924); 

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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2497:1: rulecase_statement returns [EObject current=null] : (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_cases_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2500:28: ( (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2501:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2501:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2502:2: otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulecase_statement4962); 

                	newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2506:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2507:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2507:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2508:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement4982);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Of,FOLLOW_Of_in_rulecase_statement4995); 

                	newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2529:1: ( (lv_cases_3_0= rulecase_limb ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2530:1: (lv_cases_3_0= rulecase_limb )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2530:1: (lv_cases_3_0= rulecase_limb )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2531:3: lv_cases_3_0= rulecase_limb
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5015);
            lv_cases_3_0=rulecase_limb();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_3_0, 
                    		"case_limb");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2547:2: (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Semicolon) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==False||LA34_1==True||LA34_1==Nil||(LA34_1>=RULE_INTEGER_NUMBER && LA34_1<=RULE_SIGNED_REAL_NUMBER)||LA34_1==RULE_ADDITION_OPERATOR||LA34_1==RULE_ID||LA34_1==RULE_STRING) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2548:2: otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5029); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2552:1: ( (lv_cases_5_0= rulecase_limb ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2553:1: (lv_cases_5_0= rulecase_limb )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2553:1: (lv_cases_5_0= rulecase_limb )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2554:3: lv_cases_5_0= rulecase_limb
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5049);
            	    lv_cases_5_0=rulecase_limb();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_5_0, 
            	            		"case_limb");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2570:4: (otherlv_6= Semicolon )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Semicolon) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2571:2: otherlv_6= Semicolon
                    {
                    otherlv_6=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5065); 

                        	newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,End,FOLLOW_End_in_rulecase_statement5079); 

                	newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
                

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
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2588:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2589:2: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2590:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5113);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5123); 

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
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2597:1: rulecase_limb returns [EObject current=null] : ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cases_0_0 = null;

        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2600:28: ( ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:2: ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:2: ( (lv_cases_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:1: (lv_cases_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:1: (lv_cases_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2603:3: lv_cases_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5169);
            lv_cases_0_0=rulecase_label_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
            	        }
                   		set(
                   			current, 
                   			"cases",
                    		lv_cases_0_0, 
                    		"case_label_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulecase_limb5182); 

                	newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2624:1: ( (lv_statement_2_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2625:1: (lv_statement_2_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2625:1: (lv_statement_2_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2626:3: lv_statement_2_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5202);
            lv_statement_2_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_2_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2650:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2651:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2652:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5237);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5247); 

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2659:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2662:28: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2663:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2663:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2663:2: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2663:2: ( (lv_constants_0_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2664:1: (lv_constants_0_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2664:1: (lv_constants_0_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2665:3: lv_constants_0_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5293);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	        }
                   		add(
                   			current, 
                   			"constants",
                    		lv_constants_0_0, 
                    		"constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2681:2: (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2682:2: otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulecase_label_list5307); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2686:1: ( (lv_constants_2_0= ruleconstant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2687:1: (lv_constants_2_0= ruleconstant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2687:1: (lv_constants_2_0= ruleconstant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2688:3: lv_constants_2_0= ruleconstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5327);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constants",
            	            		lv_constants_2_0, 
            	            		"constant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2712:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2713:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2714:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant5364);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant5374); 

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2721:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2724:28: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case RULE_STRING:
                {
                alt39=2;
                }
                break;
            case True:
                {
                alt39=3;
                }
                break;
            case False:
                {
                alt39=4;
                }
                break;
            case Nil:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2725:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ADDITION_OPERATOR) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2726:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2726:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2727:3: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5417); 

                            			newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"opterator",
                                    		lv_opterator_0_0, 
                                    		"ADDITION_OPERATOR");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2743:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=RULE_INTEGER_NUMBER && LA38_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2743:4: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2743:4: ( (lv_name_1_0= RULE_ID ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2744:1: (lv_name_1_0= RULE_ID )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2744:1: (lv_name_1_0= RULE_ID )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2745:3: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant5441); 

                            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_1_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2762:6: ( (lv_number_2_0= rulenumber ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2762:6: ( (lv_number_2_0= rulenumber ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2763:1: (lv_number_2_0= rulenumber )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2763:1: (lv_number_2_0= rulenumber )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2764:3: lv_number_2_0= rulenumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant5473);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConstantRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"number",
                                    		lv_number_2_0, 
                                    		"number");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2781:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2781:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2782:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2782:1: (lv_string_3_0= RULE_STRING )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2783:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant5498); 

                    			newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2800:6: ( (lv_boolLiteral_4_0= True ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2800:6: ( (lv_boolLiteral_4_0= True ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2801:1: (lv_boolLiteral_4_0= True )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2801:1: (lv_boolLiteral_4_0= True )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:3: lv_boolLiteral_4_0= True
                    {
                    lv_boolLiteral_4_0=(Token)match(input,True,FOLLOW_True_in_ruleconstant5528); 

                            newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2817:6: ( (lv_boolLiteral_5_0= False ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2817:6: ( (lv_boolLiteral_5_0= False ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2818:1: (lv_boolLiteral_5_0= False )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2818:1: (lv_boolLiteral_5_0= False )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2819:3: lv_boolLiteral_5_0= False
                    {
                    lv_boolLiteral_5_0=(Token)match(input,False,FOLLOW_False_in_ruleconstant5564); 

                            newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2834:6: ( (lv_nil_6_0= Nil ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2834:6: ( (lv_nil_6_0= Nil ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2835:1: (lv_nil_6_0= Nil )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2835:1: (lv_nil_6_0= Nil )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2836:3: lv_nil_6_0= Nil
                    {
                    lv_nil_6_0=(Token)match(input,Nil,FOLLOW_Nil_in_ruleconstant5600); 

                            newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    	    

                    }


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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulewith_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2858:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2859:2: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2860:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement5646);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement5656); 

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
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2867:1: rulewith_statement returns [EObject current=null] : (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2870:28: ( (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2871:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2871:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2872:2: otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_With_in_rulewith_statement5694); 

                	newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2876:1: ( (lv_variables_1_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2877:1: (lv_variables_1_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2877:1: (lv_variables_1_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2878:3: lv_variables_1_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement5714);
            lv_variables_1_0=rulevariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_1_0, 
                    		"variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2894:2: (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2895:2: otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulewith_statement5728); 

            	        	newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2899:1: ( (lv_variables_3_0= rulevariable ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2900:1: (lv_variables_3_0= rulevariable )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2900:1: (lv_variables_3_0= rulevariable )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2901:3: lv_variables_3_0= rulevariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement5748);
            	    lv_variables_3_0=rulevariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,Do,FOLLOW_Do_in_rulewith_statement5763); 

                	newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2922:1: ( (lv_statement_5_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:1: (lv_statement_5_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:1: (lv_statement_5_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2924:3: lv_statement_5_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement5783);
            lv_statement_5_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_5_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2948:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2949:2: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2950:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement5818);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement5828); 

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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2957:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2960:28: ( (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2961:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2961:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2962:2: otherlv_0= Goto ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,Goto,FOLLOW_Goto_in_rulegoto_statement5866); 

                	newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2966:1: ( (lv_label_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2967:1: (lv_label_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2967:1: (lv_label_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2968:3: lv_label_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement5886);
            lv_label_1_0=rulelabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGoto_statementRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"label");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2992:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2993:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2994:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part5921);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part5931); 

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
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3001:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3004:28: ( (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3005:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3005:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3006:2: otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Label,FOLLOW_Label_in_rulelabel_declaration_part5969); 

                	newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:1: ( (lv_labels_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3011:1: (lv_labels_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3011:1: (lv_labels_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3012:3: lv_labels_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part5989);
            lv_labels_1_0=rulelabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	        }
                   		add(
                   			current, 
                   			"labels",
                    		lv_labels_1_0, 
                    		"label");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3028:2: (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3029:2: otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulelabel_declaration_part6003); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3033:1: ( (lv_labels_3_0= rulelabel ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3034:1: (lv_labels_3_0= rulelabel )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3034:1: (lv_labels_3_0= rulelabel )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3035:3: lv_labels_3_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6023);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labels",
            	            		lv_labels_3_0, 
            	            		"label");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulelabel_declaration_part6038); 

                	newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3064:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3066:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6072);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6082); 

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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3073:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3076:28: ( (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3077:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3077:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3078:2: otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Const,FOLLOW_Const_in_ruleconstant_definition_part6120); 

                	newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3082:1: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3082:2: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3082:2: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3083:1: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3083:1: (lv_consts_1_0= ruleconstant_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3084:3: lv_consts_1_0= ruleconstant_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6141);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"consts",
            	            		lv_consts_1_0, 
            	            		"constant_definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleconstant_definition_part6154); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3113:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3114:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3115:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6190);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition6200); 

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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3122:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3125:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3126:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3126:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3126:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3126:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3127:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3127:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3128:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant_definition6242); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstant_definitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleconstant_definition6260); 

                	newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3149:1: ( (lv_const_2_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3150:1: (lv_const_2_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3150:1: (lv_const_2_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3151:3: lv_const_2_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition6280);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            	        }
                   		set(
                   			current, 
                   			"const",
                    		lv_const_2_0, 
                    		"constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3175:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3176:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3177:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6315);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part6325); 

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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3184:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3187:28: ( (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3188:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3188:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3189:2: otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_Type_in_ruletype_definition_part6363); 

                	newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3193:1: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3193:2: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3193:2: ( (lv_types_1_0= ruletype_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3194:1: (lv_types_1_0= ruletype_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3194:1: (lv_types_1_0= ruletype_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3195:3: lv_types_1_0= ruletype_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part6384);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_1_0, 
            	            		"type_definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruletype_definition_part6397); 

            	        	newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3224:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3225:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3226:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition6433);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition6443); 

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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3233:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3236:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3237:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3237:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3237:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3237:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3238:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3238:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3239:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletype_definition6485); 

            			newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getType_definitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruletype_definition6503); 

                	newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3260:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3261:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3261:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3262:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruletype_definition6523);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getType_definitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3286:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3287:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3288:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype6558);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype6568); 

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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3295:1: ruletype returns [EObject current=null] : ( ( (lv_type_0_0= rulesimple_type ) ) | ( (lv_type_1_0= rulestructured_type ) ) | ( (lv_type_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3298:28: ( ( ( (lv_type_0_0= rulesimple_type ) ) | ( (lv_type_1_0= rulestructured_type ) ) | ( (lv_type_2_0= rulepointer_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:1: ( ( (lv_type_0_0= rulesimple_type ) ) | ( (lv_type_1_0= rulestructured_type ) ) | ( (lv_type_2_0= rulepointer_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:1: ( ( (lv_type_0_0= rulesimple_type ) ) | ( (lv_type_1_0= rulestructured_type ) ) | ( (lv_type_2_0= rulepointer_type ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case Nil:
            case LeftParenthesis:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
            case RULE_STRING:
                {
                alt44=1;
                }
                break;
            case Packed:
            case Record:
            case Array:
            case File:
            case Set:
                {
                alt44=2;
                }
                break;
            case CircumflexAccent:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:2: ( (lv_type_0_0= rulesimple_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:2: ( (lv_type_0_0= rulesimple_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3300:1: (lv_type_0_0= rulesimple_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3300:1: (lv_type_0_0= rulesimple_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3301:3: lv_type_0_0= rulesimple_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSimple_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype6614);
                    lv_type_0_0=rulesimple_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"simple_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3318:6: ( (lv_type_1_0= rulestructured_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3318:6: ( (lv_type_1_0= rulestructured_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3319:1: (lv_type_1_0= rulestructured_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3319:1: (lv_type_1_0= rulestructured_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3320:3: lv_type_1_0= rulestructured_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTypeStructured_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype6641);
                    lv_type_1_0=rulestructured_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"structured_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3337:6: ( (lv_type_2_0= rulepointer_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3337:6: ( (lv_type_2_0= rulepointer_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3338:1: (lv_type_2_0= rulepointer_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3338:1: (lv_type_2_0= rulepointer_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3339:3: lv_type_2_0= rulepointer_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTypePointer_typeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype6668);
                    lv_type_2_0=rulepointer_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"pointer_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3363:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3364:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3365:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type6703);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type6713); 

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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3372:1: rulesimple_type returns [EObject current=null] : ( ( (lv_type_0_0= rulesubrange_type ) ) | ( (lv_type_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3375:28: ( ( ( (lv_type_0_0= rulesubrange_type ) ) | ( (lv_type_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:1: ( ( (lv_type_0_0= rulesubrange_type ) ) | ( (lv_type_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:1: ( ( (lv_type_0_0= rulesubrange_type ) ) | ( (lv_type_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case Nil:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==EOF||LA45_2==End||(LA45_2>=RightParenthesis && LA45_2<=Comma)||LA45_2==Semicolon||LA45_2==RightSquareBracket) ) {
                    alt45=3;
                }
                else if ( (LA45_2==FullStopFullStop) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt45=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:2: ( (lv_type_0_0= rulesubrange_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:2: ( (lv_type_0_0= rulesubrange_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3377:1: (lv_type_0_0= rulesubrange_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3377:1: (lv_type_0_0= rulesubrange_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3378:3: lv_type_0_0= rulesubrange_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getTypeSubrange_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type6759);
                    lv_type_0_0=rulesubrange_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"subrange_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3395:6: ( (lv_type_1_0= ruleenumerated_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3395:6: ( (lv_type_1_0= ruleenumerated_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3396:1: (lv_type_1_0= ruleenumerated_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3396:1: (lv_type_1_0= ruleenumerated_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3397:3: lv_type_1_0= ruleenumerated_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getTypeEnumerated_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type6786);
                    lv_type_1_0=ruleenumerated_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"enumerated_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3414:6: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3414:6: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3415:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3415:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3416:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_type6809); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3440:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3444:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3445:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type6855);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type6865); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3455:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3459:28: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==False||LA46_0==True||LA46_0==Nil||(LA46_0>=RULE_INTEGER_NUMBER && LA46_0<=RULE_SIGNED_REAL_NUMBER)||LA46_0==RULE_ADDITION_OPERATOR||LA46_0==RULE_ID||LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_NUMERIC_SUBRANGE) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:3: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3460:3: ( (lv_initialConst_0_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3461:1: (lv_initialConst_0_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3461:1: (lv_initialConst_0_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3462:3: lv_initialConst_0_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type6916);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"initialConst",
                            		lv_initialConst_0_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulesubrange_type6929); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3483:1: ( (lv_finalConst_2_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3484:1: (lv_finalConst_2_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3484:1: (lv_finalConst_2_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3485:3: lv_finalConst_2_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type6949);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"finalConst",
                            		lv_finalConst_2_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3502:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3502:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3502:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3502:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3503:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3503:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3504:3: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type6974); 

                    			newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubrange_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subrange",
                            		lv_subrange_3_0, 
                            		"NUMERIC_SUBRANGE");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3520:2: ( (lv_const_4_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3521:1: (lv_const_4_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3521:1: (lv_const_4_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3522:3: lv_const_4_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7000);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"const",
                            		lv_const_4_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3549:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3550:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3551:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7040);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7050); 

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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3558:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3561:28: ( (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3562:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3562:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3563:2: otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleenumerated_type7088); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3567:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3568:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3568:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3569:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type7108);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_1_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleenumerated_type7121); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3598:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3600:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type7155);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type7165); 

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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3607:1: rulestructured_type returns [EObject current=null] : ( (otherlv_0= Packed )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3610:28: ( ( (otherlv_0= Packed )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3611:1: ( (otherlv_0= Packed )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3611:1: ( (otherlv_0= Packed )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3611:2: (otherlv_0= Packed )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3611:2: (otherlv_0= Packed )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Packed) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3612:2: otherlv_0= Packed
                    {
                    otherlv_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulestructured_type7204); 

                        	newLeafNode(otherlv_0, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3616:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3617:1: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3617:1: (lv_type_1_0= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3618:3: lv_type_1_0= ruleunpacked_structured_type
            {
             
            	        newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7226);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"unpacked_structured_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3642:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3643:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3644:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7261);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type7271); 

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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:1: ruleunpacked_structured_type returns [EObject current=null] : (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject this_array_type_0 = null;

        EObject this_dynamic_array_type_1 = null;

        EObject this_record_type_2 = null;

        EObject this_set_type_3 = null;

        EObject this_file_type_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3654:28: ( (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3655:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3655:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type )
            int alt48=5;
            switch ( input.LA(1) ) {
            case Array:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==LeftSquareBracket) ) {
                    alt48=1;
                }
                else if ( (LA48_1==Of) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case Record:
                {
                alt48=3;
                }
                break;
            case Set:
                {
                alt48=4;
                }
                break;
            case File:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3656:5: this_array_type_0= rulearray_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type7318);
                    this_array_type_0=rulearray_type();

                    state._fsp--;


                            current = this_array_type_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3666:5: this_dynamic_array_type_1= ruledynamic_array_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamic_array_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7345);
                    this_dynamic_array_type_1=ruledynamic_array_type();

                    state._fsp--;


                            current = this_dynamic_array_type_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3676:5: this_record_type_2= rulerecord_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7372);
                    this_record_type_2=rulerecord_type();

                    state._fsp--;


                            current = this_record_type_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3686:5: this_set_type_3= ruleset_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type7399);
                    this_set_type_3=ruleset_type();

                    state._fsp--;


                            current = this_set_type_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3696:5: this_file_type_4= rulefile_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type7426);
                    this_file_type_4=rulefile_type();

                    state._fsp--;


                            current = this_file_type_4;
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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3712:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3713:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3714:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type7460);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type7470); 

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
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3721:1: rulearray_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3724:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3725:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3725:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3726:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_rulearray_type7508); 

                	newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulearray_type7520); 

                	newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3735:1: ( (lv_indexes_2_0= ruleindex_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3736:1: (lv_indexes_2_0= ruleindex_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3736:1: (lv_indexes_2_0= ruleindex_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3737:3: lv_indexes_2_0= ruleindex_type
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7540);
            lv_indexes_2_0=ruleindex_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	        }
                   		add(
                   			current, 
                   			"indexes",
                    		lv_indexes_2_0, 
                    		"index_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3753:2: (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Comma) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3754:2: otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_rulearray_type7554); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3758:1: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3759:1: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3759:1: (lv_indexes_4_0= ruleindex_type )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3760:3: lv_indexes_4_0= ruleindex_type
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7574);
            	    lv_indexes_4_0=ruleindex_type();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indexes",
            	            		lv_indexes_4_0, 
            	            		"index_type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulearray_type7589); 

                	newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_rulearray_type7601); 

                	newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3786:1: ( (lv_type_7_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3787:1: (lv_type_7_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3787:1: (lv_type_7_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3788:3: lv_type_7_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulearray_type7621);
            lv_type_7_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3812:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3813:2: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3814:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7656);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledynamic_array_type7666); 

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
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3821:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3824:28: ( (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3825:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3825:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3826:2: otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruledynamic_array_type7704); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruledynamic_array_type7716); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3835:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3836:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3836:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3837:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruledynamic_array_type7736);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3861:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3862:2: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3863:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type7771);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type7781); 

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
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3870:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3873:28: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3874:1: ( (lv_type_0_0= rulesimple_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3874:1: ( (lv_type_0_0= rulesimple_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3875:1: (lv_type_0_0= rulesimple_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3875:1: (lv_type_0_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3876:3: lv_type_0_0= rulesimple_type
            {
             
            	        newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type7826);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"simple_type");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulerecord_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3900:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3901:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3902:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type7860);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type7870); 

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
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3909:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3912:28: ( ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3913:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3913:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3913:2: ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3913:2: ( (lv_recordKeyword_0_0= Record ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3914:1: (lv_recordKeyword_0_0= Record )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3914:1: (lv_recordKeyword_0_0= Record )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3915:3: lv_recordKeyword_0_0= Record
            {
            lv_recordKeyword_0_0=(Token)match(input,Record,FOLLOW_Record_in_rulerecord_type7914); 

                    newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecord_typeRule());
            	        }
                   		setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3929:2: ( (lv_fields_1_0= rulefield_list ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Case||LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3930:1: (lv_fields_1_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3930:1: (lv_fields_1_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:3: lv_fields_1_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulerecord_type7946);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"fields",
                            		lv_fields_1_0, 
                            		"field_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3947:3: ( (lv_endKeyword_2_0= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3948:1: (lv_endKeyword_2_0= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3948:1: (lv_endKeyword_2_0= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3949:3: lv_endKeyword_2_0= End
            {
            lv_endKeyword_2_0=(Token)match(input,End,FOLLOW_End_in_rulerecord_type7966); 

                    newLeafNode(lv_endKeyword_2_0, grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecord_typeRule());
            	        }
                   		setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
            	    

            }


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
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3971:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3972:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3973:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list8012);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list8022); 

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
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3980:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3983:28: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==Case) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:4: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3984:4: ( (lv_fixed_0_0= rulefixed_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3985:1: (lv_fixed_0_0= rulefixed_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3985:1: (lv_fixed_0_0= rulefixed_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3986:3: lv_fixed_0_0= rulefixed_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefixed_part_in_rulefield_list8070);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_listRule());
                    	        }
                           		set(
                           			current, 
                           			"fixed",
                            		lv_fixed_0_0, 
                            		"fixed_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4002:2: (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Semicolon) ) {
                        int LA51_1 = input.LA(2);

                        if ( (LA51_1==Case) ) {
                            alt51=1;
                        }
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4003:2: otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8084); 

                                	newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4007:1: ( (lv_variants_2_0= rulevariant_part ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4008:1: (lv_variants_2_0= rulevariant_part )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4008:1: (lv_variants_2_0= rulevariant_part )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4009:3: lv_variants_2_0= rulevariant_part
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8104);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getField_listRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"variants",
                                    		lv_variants_2_0, 
                                    		"variant_part");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4026:6: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4026:6: ( (lv_variants_3_0= rulevariant_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4027:1: (lv_variants_3_0= rulevariant_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4027:1: (lv_variants_3_0= rulevariant_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4028:3: lv_variants_3_0= rulevariant_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8134);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_listRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"variant_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4044:3: (otherlv_4= Semicolon )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Semicolon) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4045:2: otherlv_4= Semicolon
                    {
                    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8149); 

                        	newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                        

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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4057:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4058:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4059:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part8185);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part8195); 

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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4066:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4069:28: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:2: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:2: ( (lv_sections_0_0= rulerecord_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4071:1: (lv_sections_0_0= rulerecord_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4071:1: (lv_sections_0_0= rulerecord_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4072:3: lv_sections_0_0= rulerecord_section
            {
             
            	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8241);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_0_0, 
                    		"record_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4088:2: (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Semicolon) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==RULE_ID) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4089:2: otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefixed_part8255); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4093:1: ( (lv_sections_2_0= rulerecord_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4094:1: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4094:1: (lv_sections_2_0= rulerecord_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4095:3: lv_sections_2_0= rulerecord_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8275);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_2_0, 
            	            		"record_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulevariable_identifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4119:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4120:2: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4121:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8312);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier_list8322); 

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
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4128:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4131:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4132:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4132:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4132:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4132:2: ( (lv_names_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4133:1: (lv_names_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4133:1: (lv_names_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4134:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8364); 

            			newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4150:2: (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==Comma) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4151:2: otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulevariable_identifier_list8383); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4155:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4156:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4156:1: (lv_names_2_0= RULE_ID )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4157:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8399); 

            	    			newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


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
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4181:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4182:2: (iv_rulevariable_section= rulevariable_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4183:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_section_in_entryRulevariable_section8441);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_section8451); 

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
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4190:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4193:28: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4194:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4194:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4194:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4194:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4195:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4195:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4196:3: lv_identifiers_0_0= rulevariable_identifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_identifier_list_in_rulevariable_section8497);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"variable_identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_section8510); 

                	newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4217:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4218:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4218:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4219:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulevariable_section8530);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4243:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4244:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4245:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section8565);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section8575); 

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
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4252:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4255:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4256:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4256:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4256:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4256:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4257:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4257:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4258:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section8621);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulerecord_section8634); 

                	newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4279:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4280:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4280:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4281:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulerecord_section8654);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4305:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4306:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4307:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part8689);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part8699); 

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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4314:1: rulevariant_part returns [EObject current=null] : (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4317:28: ( (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4318:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4318:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4319:2: otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulevariant_part8737); 

                	newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4323:1: ( (lv_tag_1_0= ruletag_field ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==Colon) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4324:1: (lv_tag_1_0= ruletag_field )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4324:1: (lv_tag_1_0= ruletag_field )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4325:3: lv_tag_1_0= ruletag_field
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruletag_field_in_rulevariant_part8757);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
                    	        }
                           		set(
                           			current, 
                           			"tag",
                            		lv_tag_1_0, 
                            		"tag_field");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4341:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4342:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4342:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4343:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariant_part8775); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariant_partRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_rulevariant_part8793); 

                	newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4364:1: ( (lv_variants_4_0= rulevariant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4365:1: (lv_variants_4_0= rulevariant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4365:1: (lv_variants_4_0= rulevariant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4366:3: lv_variants_4_0= rulevariant
            {
             
            	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part8813);
            lv_variants_4_0=rulevariant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	        }
                   		add(
                   			current, 
                   			"variants",
                    		lv_variants_4_0, 
                    		"variant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4382:2: (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Semicolon) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==False||LA57_1==True||LA57_1==Nil||(LA57_1>=RULE_INTEGER_NUMBER && LA57_1<=RULE_SIGNED_REAL_NUMBER)||LA57_1==RULE_ADDITION_OPERATOR||LA57_1==RULE_ID||LA57_1==RULE_STRING) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4383:2: otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariant_part8827); 

            	        	newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4387:1: ( (lv_variants_6_0= rulevariant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4388:1: (lv_variants_6_0= rulevariant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4388:1: (lv_variants_6_0= rulevariant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4389:3: lv_variants_6_0= rulevariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part8847);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variants",
            	            		lv_variants_6_0, 
            	            		"variant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4413:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4414:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4415:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field8884);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field8894); 

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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4422:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4425:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4426:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4426:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4426:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4426:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4427:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4427:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4428:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletag_field8936); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTag_fieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_ruletag_field8954); 

                	newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
                

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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4457:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4458:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4459:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant8988);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant8998); 

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4466:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4469:28: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4470:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4470:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4470:2: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4470:2: ( (lv_labels_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4471:1: (lv_labels_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4471:1: (lv_labels_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4472:3: lv_labels_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9044);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantRule());
            	        }
                   		set(
                   			current, 
                   			"labels",
                    		lv_labels_0_0, 
                    		"case_label_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariant9057); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulevariant9069); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4498:1: ( (lv_fields_3_0= rulefield_list ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Case||LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4499:1: (lv_fields_3_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4499:1: (lv_fields_3_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4500:3: lv_fields_3_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulevariant9089);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		set(
                           			current, 
                           			"fields",
                            		lv_fields_3_0, 
                            		"field_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulevariant9103); 

                	newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuleset_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4529:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4530:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4531:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9137);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9147); 

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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4538:1: ruleset_type returns [EObject current=null] : (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4541:28: ( (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4542:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4542:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4543:2: otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_Set_in_ruleset_type9185); 

                	newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruleset_type9197); 

                	newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4552:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4553:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4553:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4554:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruleset_type9217);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSet_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4578:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4579:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4580:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9252);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9262); 

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
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4587:1: rulefile_type returns [EObject current=null] : (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4590:28: ( (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4591:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4591:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4592:2: otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,File,FOLLOW_File_in_rulefile_type9300); 

                	newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_rulefile_type9312); 

                	newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4601:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4602:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4602:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4603:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulefile_type9332);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFile_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4627:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4628:2: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4629:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type9367);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type9377); 

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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4636:1: rulepointer_type returns [EObject current=null] : (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4639:28: ( (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4640:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4640:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4641:2: otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulepointer_type9415); 

                	newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4645:1: ( (lv_type_1_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4646:1: (lv_type_1_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4646:1: (lv_type_1_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4647:3: lv_type_1_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulepointer_type9435);
            lv_type_1_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4671:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4672:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4673:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9470);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part9480); 

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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4680:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4683:28: ( (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4684:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4684:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4685:2: otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_declaration_part9518); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4689:1: ( (lv_sections_1_0= rulevariable_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4690:1: (lv_sections_1_0= rulevariable_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4690:1: (lv_sections_1_0= rulevariable_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4691:3: lv_sections_1_0= rulevariable_section
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9538);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_1_0, 
                    		"variable_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9551); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4712:1: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4712:2: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4712:2: ( (lv_sections_3_0= rulevariable_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4713:1: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4713:1: (lv_sections_3_0= rulevariable_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4714:3: lv_sections_3_0= rulevariable_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9572);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_3_0, 
            	            		"variable_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9585); 

            	        	newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4743:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4744:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4745:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9621);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9631); 

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
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4752:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4755:28: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=Procedure && LA61_0<=Function)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==Procedure) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==Function) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4756:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4757:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4757:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4758:3: lv_procedures_0_0= ruleprocedure_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9678);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"procedures",
            	                    		lv_procedures_0_0, 
            	                    		"procedure_declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4775:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4775:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4776:1: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4776:1: (lv_functions_1_0= rulefunction_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4777:3: lv_functions_1_0= rulefunction_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9705);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"functions",
            	                    		lv_functions_1_0, 
            	                    		"function_declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9719); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4806:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4807:2: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4808:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9754);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration9764); 

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
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4815:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4818:28: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4819:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4819:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4819:2: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4819:2: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4820:1: (lv_heading_0_0= ruleprocedure_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4820:1: (lv_heading_0_0= ruleprocedure_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4821:3: lv_heading_0_0= ruleprocedure_heading
            {
             
            	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration9810);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"procedure_heading");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_declaration9823); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4842:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=Procedure && LA62_0<=Function)||(LA62_0>=Begin && LA62_0<=Const)||LA62_0==Label||LA62_0==Type||LA62_0==Var) ) {
                alt62=1;
            }
            else if ( (LA62_0==Forward) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4842:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4842:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4843:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4843:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4844:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration9844);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4861:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4861:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4862:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4862:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4863:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_ruleprocedure_declaration9869); 

                            newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "forward", true, "forward");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4885:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4886:2: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4887:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading9916);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading9926); 

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
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4894:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4897:28: ( (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4898:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4898:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4899:2: otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,Procedure,FOLLOW_Procedure_in_ruleprocedure_heading9964); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4903:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4904:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4904:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4905:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprocedure_heading9980); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedure_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4921:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LeftParenthesis) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4922:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4922:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4923:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10006);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"formal_parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4947:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4948:2: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4949:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10042);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list10052); 

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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4956:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4959:28: ( (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4960:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4960:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:2: otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10090); 

                	newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4965:1: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4966:1: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4966:1: (lv_parameters_1_0= ruleformal_parameter_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4967:3: lv_parameters_1_0= ruleformal_parameter_section
            {
             
            	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10110);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_1_0, 
                    		"formal_parameter_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4983:2: (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Semicolon) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4984:2: otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleformal_parameter_list10124); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4988:1: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4989:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4989:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4990:3: lv_parameters_3_0= ruleformal_parameter_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10144);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_3_0, 
            	            		"formal_parameter_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleformal_parameter_list10159); 

                	newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5019:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5020:2: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5021:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10193);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section10203); 

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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5028:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5031:28: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5032:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5032:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case Var:
                {
                alt65=2;
                }
                break;
            case Procedure:
                {
                alt65=3;
                }
                break;
            case Function:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5032:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5032:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5033:1: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5033:1: (lv_value_0_0= rulevalue_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5034:3: lv_value_0_0= rulevalue_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10249);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"value_parameter_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5051:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5051:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5052:1: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5052:1: (lv_variable_1_0= rulevariable_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5053:3: lv_variable_1_0= rulevariable_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10276);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"variable_parameter_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5070:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5070:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5071:1: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5071:1: (lv_procedure_2_0= ruleprocedure_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5072:3: lv_procedure_2_0= ruleprocedure_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10303);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"procedure",
                            		lv_procedure_2_0, 
                            		"procedure_heading");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5089:6: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5089:6: ( (lv_function_3_0= rulefunction_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5090:1: (lv_function_3_0= rulefunction_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5090:1: (lv_function_3_0= rulefunction_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5091:3: lv_function_3_0= rulefunction_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10330);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_3_0, 
                            		"function_heading");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5115:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5116:2: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5117:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10365);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section10375); 

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
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5124:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5127:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5128:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5128:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5128:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5128:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5129:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5129:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5130:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10421);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevalue_parameter_section10434); 

                	newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5151:1: ( (lv_type_2_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5152:1: (lv_type_2_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5152:1: (lv_type_2_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5153:3: lv_type_2_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10454);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"parameter_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5177:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5178:2: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5179:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type10489);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type10499); 

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
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5186:1: ruleparameter_type returns [EObject current=null] : (this_conformant_array_schema_0= ruleconformant_array_schema | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_conformant_array_schema_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5189:28: ( (this_conformant_array_schema_0= ruleconformant_array_schema | ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5190:1: (this_conformant_array_schema_0= ruleconformant_array_schema | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5190:1: (this_conformant_array_schema_0= ruleconformant_array_schema | ( (lv_name_1_0= RULE_ID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Packed||LA66_0==Array) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5191:5: this_conformant_array_schema_0= ruleconformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getParameter_typeAccess().getConformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10546);
                    this_conformant_array_schema_0=ruleconformant_array_schema();

                    state._fsp--;


                            current = this_conformant_array_schema_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5200:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5200:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5201:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5201:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5202:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameter_type10568); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameter_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5226:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5227:2: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5228:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10608);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema10618); 

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
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5235:1: ruleconformant_array_schema returns [EObject current=null] : (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject this_packed_conformant_array_schema_0 = null;

        EObject this_unpacked_conformant_array_schema_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5238:28: ( (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5239:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5239:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Packed) ) {
                alt67=1;
            }
            else if ( (LA67_0==Array) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5240:5: this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPacked_conformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10665);
                    this_packed_conformant_array_schema_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                            current = this_packed_conformant_array_schema_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5250:5: this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpacked_conformant_array_schemaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10692);
                    this_unpacked_conformant_array_schema_1=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                            current = this_unpacked_conformant_array_schema_1;
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
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5266:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5267:2: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5268:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10726);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10736); 

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
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5275:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5278:28: ( (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5279:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5279:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5280:2: otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulepacked_conformant_array_schema10774); 

                	newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
                
            otherlv_1=(Token)match(input,Array,FOLLOW_Array_in_rulepacked_conformant_array_schema10786); 

                	newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
                
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema10798); 

                	newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5294:1: ( (lv_bound_3_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5295:1: (lv_bound_3_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5295:1: (lv_bound_3_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5296:3: lv_bound_3_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema10818);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            	        }
                   		set(
                   			current, 
                   			"bound",
                    		lv_bound_3_0, 
                    		"bound_specification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema10831); 

                	newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,Of,FOLLOW_Of_in_rulepacked_conformant_array_schema10843); 

                	newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5322:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5323:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5323:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5324:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema10859); 

            			newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5348:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5349:2: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5350:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification10899);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification10909); 

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
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5357:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5360:28: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:2: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:2: ( (lv_initial_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5362:1: (lv_initial_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5362:1: (lv_initial_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5363:3: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification10951); 

            			newLeafNode(lv_initial_0_0, grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"initial",
                    		lv_initial_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulebound_specification10969); 

                	newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5384:1: ( (lv_final_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5385:1: (lv_final_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5385:1: (lv_final_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5386:3: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification10985); 

            			newLeafNode(lv_final_2_0, grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"final",
                    		lv_final_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulebound_specification11003); 

                	newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5407:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5408:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5408:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5409:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11019); 

            			newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5433:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5434:2: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5435:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11059);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11069); 

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
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5442:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_8_0=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_array_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5445:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5446:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5446:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5447:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruleunpacked_conformant_array_schema11107); 

                	newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11119); 

                	newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5456:1: ( (lv_bounds_2_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:1: (lv_bounds_2_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:1: (lv_bounds_2_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5458:3: lv_bounds_2_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11139);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	        }
                   		add(
                   			current, 
                   			"bounds",
                    		lv_bounds_2_0, 
                    		"bound_specification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5474:2: (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==Semicolon) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5475:2: otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11153); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5479:1: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5480:1: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5480:1: (lv_bounds_4_0= rulebound_specification )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5481:3: lv_bounds_4_0= rulebound_specification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11173);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bounds",
            	            		lv_bounds_4_0, 
            	            		"bound_specification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11188); 

                	newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_ruleunpacked_conformant_array_schema11200); 

                	newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5507:1: ( ( (lv_array_7_0= ruleconformant_array_schema ) ) | ( (lv_name_8_0= RULE_ID ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Packed||LA69_0==Array) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5507:2: ( (lv_array_7_0= ruleconformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5507:2: ( (lv_array_7_0= ruleconformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5508:1: (lv_array_7_0= ruleconformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5508:1: (lv_array_7_0= ruleconformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5509:3: lv_array_7_0= ruleconformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayConformant_array_schemaParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema11221);
                    lv_array_7_0=ruleconformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_7_0, 
                            		"conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5526:6: ( (lv_name_8_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5526:6: ( (lv_name_8_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5527:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5527:1: (lv_name_8_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5528:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleunpacked_conformant_array_schema11244); 

                    			newLeafNode(lv_name_8_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnpacked_conformant_array_schemaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5552:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5553:2: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5554:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11285);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section11295); 

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
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5561:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5564:28: ( (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5565:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5565:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5566:2: otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_parameter_section11333); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5570:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5571:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5571:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5572:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11353);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_1_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_parameter_section11366); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5593:1: ( (lv_type_3_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5594:1: (lv_type_3_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5594:1: (lv_type_3_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5595:3: lv_type_3_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11386);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"parameter_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5619:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5620:2: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5621:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading11421);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading11431); 

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
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5628:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5631:28: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5632:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5632:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5633:2: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_Function_in_rulefunction_heading11469); 

                	newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5637:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5638:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5638:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5639:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11485); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5655:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LeftParenthesis) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5656:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5656:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5657:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11511);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"formal_parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulefunction_heading11525); 

                	newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5678:1: ( (lv_returnType_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5679:1: (lv_returnType_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5679:1: (lv_returnType_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5680:3: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11541); 

            			newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"returnType",
                    		lv_returnType_4_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5704:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5705:2: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5706:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11581);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration11591); 

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
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5713:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5716:28: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5717:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5717:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5717:2: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5717:2: ( (lv_heading_0_0= rulefunction_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5718:1: (lv_heading_0_0= rulefunction_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5718:1: (lv_heading_0_0= rulefunction_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5719:3: lv_heading_0_0= rulefunction_heading
            {
             
            	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_heading_in_rulefunction_declaration11637);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"function_heading");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefunction_declaration11650); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5740:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=Procedure && LA71_0<=Function)||(LA71_0>=Begin && LA71_0<=Const)||LA71_0==Label||LA71_0==Type||LA71_0==Var) ) {
                alt71=1;
            }
            else if ( (LA71_0==Forward) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5740:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5740:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5741:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5741:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5742:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration11671);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5759:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5759:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5760:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5760:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5761:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_rulefunction_declaration11696); 

                            newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunction_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "forward", true, "forward");
                    	    

                    }


                    }


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
    // $ANTLR end "rulefunction_declaration"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\12\12\uffff";
    static final String DFA23_minS =
        "\1\17\1\10\12\uffff";
    static final String DFA23_maxS =
        "\1\104\1\75\12\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\7\10\uffff\1\6\7\uffff\1\5\1\11\12\uffff\1\10\6\uffff\1"+
            "\4\2\uffff\4\2\10\uffff\1\1\1\uffff\1\3",
            "\1\12\10\uffff\1\12\2\uffff\1\12\2\uffff\1\12\3\uffff\3\12"+
            "\1\uffff\1\12\6\uffff\1\12\1\uffff\4\12\1\13\3\12\1\uffff\5"+
            "\12\2\uffff\2\12\1\uffff\3\12",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1453:1: ( ( (lv_variable_0_0= rulevariable ) ) | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | otherlv_4= Nil | otherlv_5= True | otherlv_6= False | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis this_expression_9= ruleexpression otherlv_10= RightParenthesis ) | (otherlv_11= Not this_factor_12= rulefactor ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram212 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram233 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_FullStop_in_ruleprogram246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Program_in_ruleprogram_heading_block328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprogram_heading_block344 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleprogram_heading_block363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block383 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleprogram_heading_block396 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprogram_heading_block410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list496 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleidentifier_list515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list531 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruleblock629 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruleblock651 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruleblock673 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruleblock695 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleblock717 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulestatement_part822 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part842 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulestatement_part855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence945 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulestatement_sequence959 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence979 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1073 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulestatement1086 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulesimple_statement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_statement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ColonEqualsSign_in_ruleassignment_statement1523 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable1630 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevariable1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar__in_entryRulevar_1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevar_1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulevar_1740 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulevar_1760 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulevar_1773 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rulevar_1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevar_1830 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulevar_1877 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list1990 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleexpression_list2004 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2024 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2117 = new BitSet(new long[]{0x2004010000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2136 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_In_in_ruleexpression2166 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleexpression2202 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2324 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2351 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2371 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Or_in_rulesimple_expression2402 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2435 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulesimple_expression2463 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2556 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2575 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Div_in_ruleterm2605 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Mod_in_ruleterm2641 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_And_in_ruleterm2677 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2710 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_rulefactor2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_rulefactor2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_rulefactor2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefactor2974 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor2995 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefactor3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_rulefactor3027 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rulenumber3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulenumber3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleset3495 = new BitSet(new long[]{0x0BD8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3527 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleset3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_designator3645 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefunction_designator3663 = new BitSet(new long[]{0x0BC8300301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3683 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefunction_designator3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement3731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement3903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulecompound_statement3951 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement3971 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecompound_statement3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_rulewhile_statement4211 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4231 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulewhile_statement4244 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Repeat_in_rulerepeat_statement4347 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4367 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Until_in_rulerepeat_statement4380 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_rulefor_statement4483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4503 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_To_in_rulefor_statement4517 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Downto_in_rulefor_statement4535 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4556 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulefor_statement4569 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement4742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleif_statement4790 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement4810 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Then_in_ruleif_statement4823 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement4843 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Else_in_ruleif_statement4857 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement4914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulecase_statement4962 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement4982 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulecase_statement4995 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5015 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5029 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5049 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5065 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecase_statement5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5169 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulecase_limb5182 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5293 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulecase_label_list5307 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5327 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant5364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5417 = new BitSet(new long[]{0x03C0000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleconstant5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleconstant5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_ruleconstant5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement5646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_rulewith_statement5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5714 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Comma_in_rulewith_statement5728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5748 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Do_in_rulewith_statement5763 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement5818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goto_in_rulegoto_statement5866 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part5921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_rulelabel_declaration_part5969 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part5989 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulelabel_declaration_part6003 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6023 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulelabel_declaration_part6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_ruleconstant_definition_part6120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6141 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleconstant_definition_part6154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant_definition6242 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleconstant_definition6260 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_ruletype_definition_part6363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part6384 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruletype_definition_part6397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletype_definition6485 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruletype_definition6503 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type6703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_type6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type6855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type6916 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulesubrange_type6929 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type6974 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleenumerated_type7088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type7108 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleenumerated_type7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type7155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulestructured_type7204 = new BitSet(new long[]{0x0000000400201600L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type7460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_rulearray_type7508 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulearray_type7520 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7540 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulearray_type7554 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7574 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulearray_type7589 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulearray_type7601 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledynamic_array_type7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruledynamic_array_type7704 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruledynamic_array_type7716 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruledynamic_array_type7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type7771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type7860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Record_in_rulerecord_type7914 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type7946 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulerecord_type7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list8012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list8070 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8084 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8104 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8134 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part8185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8241 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefixed_part8255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8275 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier_list8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8364 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulevariable_identifier_list8383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8399 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rulevariable_section_in_entryRulevariable_section8441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_section8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_rulevariable_section8497 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_section8510 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_section8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section8621 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulerecord_section8634 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part8689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulevariant_part8737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part8757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariant_part8775 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulevariant_part8793 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part8813 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariant_part8827 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part8847 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field8884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletag_field8936 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_ruletag_field8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant8988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9044 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariant9057 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulevariant9069 = new BitSet(new long[]{0x0000200000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant9089 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulevariant9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Set_in_ruleset_type9185 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleset_type9197 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_File_in_rulefile_type9300 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulefile_type9312 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type9367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulepointer_type9415 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulepointer_type9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_declaration_part9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9538 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9572 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9678 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9705 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9719 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration9810 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_declaration9823 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_ruleprocedure_declaration9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading9916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Procedure_in_ruleprocedure_heading9964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprocedure_heading9980 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10090 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10110 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleformal_parameter_list10124 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10144 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleformal_parameter_list10159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10421 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevalue_parameter_section10434 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type10489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameter_type10568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema10618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulepacked_conformant_array_schema10774 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Array_in_rulepacked_conformant_array_schema10786 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema10798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema10818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema10831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulepacked_conformant_array_schema10843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema10859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification10899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification10951 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulebound_specification10969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification10985 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulebound_specification11003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruleunpacked_conformant_array_schema11107 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11139 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11173 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11188 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleunpacked_conformant_array_schema11200 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleunpacked_conformant_array_schema11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_parameter_section11333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11353 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_parameter_section11366 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading11421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading11431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Function_in_rulefunction_heading11469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11485 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11511 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulefunction_heading11525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_rulefunction_declaration11637 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulefunction_declaration11650 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_rulefunction_declaration11696 = new BitSet(new long[]{0x0000000000000002L});

}