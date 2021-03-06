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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:689:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_3_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:692:28: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case LeftParenthesis:
                        {
                        alt12=2;
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
                    case ColonEqualsSign:
                    case FullStop:
                    case LeftSquareBracket:
                    case CircumflexAccent:
                        {
                        alt12=1;
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:6: ( (lv_function_noargs_3_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:6: ( (lv_function_noargs_3_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:751:1: (lv_function_noargs_3_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:751:1: (lv_function_noargs_3_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:752:3: lv_function_noargs_3_0= RULE_ID
                    {
                    lv_function_noargs_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_statement1425); 

                    			newLeafNode(lv_function_noargs_3_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_statementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"function_noargs",
                            		lv_function_noargs_3_0, 
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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:776:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:777:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:778:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1466);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1476); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:785:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:788:28: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:2: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:2: ( (lv_variable_0_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:790:1: (lv_variable_0_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:790:1: (lv_variable_0_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:791:3: lv_variable_0_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1522);
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

            otherlv_1=(Token)match(input,ColonEqualsSign,FOLLOW_ColonEqualsSign_in_ruleassignment_statement1535); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:812:1: ( (lv_expression_2_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:813:1: (lv_expression_2_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:813:1: (lv_expression_2_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:814:3: lv_expression_2_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1555);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:838:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:839:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:840:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1590);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1600); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:847:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:850:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:852:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:852:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:853:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable1642); 

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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:869:2: ( (lv_variable_1_0= rulevar_ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:870:1: (lv_variable_1_0= rulevar_ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:870:1: (lv_variable_1_0= rulevar_ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:871:3: lv_variable_1_0= rulevar_
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevar__in_rulevariable1668);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:896:2: (iv_rulevar_= rulevar_ EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:897:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_rulevar__in_entryRulevar_1703);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevar_1713); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:904:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:907:28: ( ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )?
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:909:2: otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulevar_1752); 

                        	newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:913:1: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:914:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:914:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:915:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulevar_1772);
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

                    otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulevar_1785); 

                        	newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:936:1: ( (lv_array_3_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:937:1: (lv_array_3_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:937:1: (lv_array_3_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:938:3: lv_array_3_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1805);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_3_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:6: ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:6: ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:7: ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:7: ( (lv_accessor_4_0= FullStop ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:956:1: (lv_accessor_4_0= FullStop )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:956:1: (lv_accessor_4_0= FullStop )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:957:3: lv_accessor_4_0= FullStop
                    {
                    lv_accessor_4_0=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulevar_1832); 

                            newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVar_Rule());
                    	        }
                           		setWithLastConsumed(current, "accessor", true, ".");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:971:2: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:972:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:972:1: (lv_name_5_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:973:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevar_1860); 

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

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:989:2: ( (lv_variable_6_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:990:1: (lv_variable_6_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:990:1: (lv_variable_6_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:991:3: lv_variable_6_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1886);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1008:6: (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1008:6: (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1009:2: otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulevar_1907); 

                        	newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1013:1: ( (lv_pointer_8_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:1: (lv_pointer_8_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:1: (lv_pointer_8_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1015:3: lv_pointer_8_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1927);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"pointer",
                            		lv_pointer_8_0, 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1039:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1040:2: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1041:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list1964);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list1974); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1048:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1051:28: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:2: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:2: ( (lv_expressions_0_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1053:1: (lv_expressions_0_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1053:1: (lv_expressions_0_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1054:3: lv_expressions_0_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2020);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1070:2: (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1071:2: otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleexpression_list2034); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1075:1: ( (lv_expressions_2_0= ruleexpression ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:1: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:1: (lv_expressions_2_0= ruleexpression )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1077:3: lv_expressions_2_0= ruleexpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2054);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1101:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1102:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1103:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2091);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2101); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1110:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1113:28: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:2: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:2: ( (lv_expressions_0_0= rulesimple_expression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1115:1: (lv_expressions_0_0= rulesimple_expression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1115:1: (lv_expressions_0_0= rulesimple_expression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1116:3: lv_expressions_0_0= rulesimple_expression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2147);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:2: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==In||LA16_0==EqualsSign||LA16_0==RULE_RELATIONAL_OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:3: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:3: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= In ) ) | ( (lv_operators_3_0= EqualsSign ) ) )
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
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:4: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:4: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1133:1: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1133:1: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1134:3: lv_operators_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2166); 

                            			newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"operators",
                                    		lv_operators_1_0, 
                                    		"RELATIONAL_OPERATOR");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1151:6: ( (lv_operators_2_0= In ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1151:6: ( (lv_operators_2_0= In ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1152:1: (lv_operators_2_0= In )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1152:1: (lv_operators_2_0= In )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1153:3: lv_operators_2_0= In
                            {
                            lv_operators_2_0=(Token)match(input,In,FOLLOW_In_in_ruleexpression2196); 

                                    newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1168:6: ( (lv_operators_3_0= EqualsSign ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1168:6: ( (lv_operators_3_0= EqualsSign ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1169:1: (lv_operators_3_0= EqualsSign )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1169:1: (lv_operators_3_0= EqualsSign )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1170:3: lv_operators_3_0= EqualsSign
                            {
                            lv_operators_3_0=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleexpression2232); 

                                    newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1184:3: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1185:1: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1185:1: (lv_expressions_4_0= rulesimple_expression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1186:3: lv_expressions_4_0= rulesimple_expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2265);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1210:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1214:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1215:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2308);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2318); 

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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1225:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1229:28: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:1: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:1: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:2: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:2: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ADDITION_OPERATOR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1231:1: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1231:1: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1232:3: lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2364); 

                    			newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_expressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prefixOperator",
                            		lv_prefixOperator_0_0, 
                            		"ADDITION_OPERATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1248:3: ( (lv_terms_1_0= ruleterm ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1249:1: (lv_terms_1_0= ruleterm )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1249:1: (lv_terms_1_0= ruleterm )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1250:3: lv_terms_1_0= ruleterm
            {
             
            	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2391);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:2: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Or||LA19_0==RULE_ADDITION_OPERATOR) ) {
                    alt19=1;
                }
                else if ( ((LA19_0>=RULE_INTEGER_NUMBER && LA19_0<=RULE_REAL_NUMBER)) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= Or ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_ADDITION_OPERATOR) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==Or) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1267:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1267:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1268:3: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2411); 

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


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:6: ( (lv_operators_3_0= Or ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:6: ( (lv_operators_3_0= Or ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:1: (lv_operators_3_0= Or )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:1: (lv_operators_3_0= Or )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1287:3: lv_operators_3_0= Or
            	            {
            	            lv_operators_3_0=(Token)match(input,Or,FOLLOW_Or_in_rulesimple_expression2441); 

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

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1301:3: ( (lv_terms_4_0= ruleterm ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1302:1: (lv_terms_4_0= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1302:1: (lv_terms_4_0= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1303:3: lv_terms_4_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2474);
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
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1320:6: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1320:6: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1321:1: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1321:1: (lv_terms_5_0= ruleunsigned_number )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1322:3: lv_terms_5_0= ruleunsigned_number
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleunsigned_number_in_rulesimple_expression2502);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_5_0, 
            	            		"unsigned_number");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1349:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1350:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1351:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2543);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2553); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1358:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1361:28: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1362:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1362:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1362:2: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1362:2: ( (lv_factors_0_0= rulefactor ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1363:1: (lv_factors_0_0= rulefactor )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1363:1: (lv_factors_0_0= rulefactor )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1364:3: lv_factors_0_0= rulefactor
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefactor_in_ruleterm2599);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1380:2: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=And && LA21_0<=Div)||LA21_0==Mod||LA21_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1380:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1380:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case Div:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case Mod:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case And:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1380:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1380:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1381:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1381:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1382:3: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2618); 

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
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1399:6: ( (lv_operators_2_0= Div ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1399:6: ( (lv_operators_2_0= Div ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1400:1: (lv_operators_2_0= Div )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1400:1: (lv_operators_2_0= Div )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1401:3: lv_operators_2_0= Div
            	            {
            	            lv_operators_2_0=(Token)match(input,Div,FOLLOW_Div_in_ruleterm2648); 

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
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1416:6: ( (lv_operators_3_0= Mod ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1416:6: ( (lv_operators_3_0= Mod ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1417:1: (lv_operators_3_0= Mod )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1417:1: (lv_operators_3_0= Mod )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1418:3: lv_operators_3_0= Mod
            	            {
            	            lv_operators_3_0=(Token)match(input,Mod,FOLLOW_Mod_in_ruleterm2684); 

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
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1433:6: ( (lv_operators_4_0= And ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1433:6: ( (lv_operators_4_0= And ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1434:1: (lv_operators_4_0= And )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1434:1: (lv_operators_4_0= And )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1435:3: lv_operators_4_0= And
            	            {
            	            lv_operators_4_0=(Token)match(input,And,FOLLOW_And_in_ruleterm2720); 

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

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1449:3: ( (lv_factors_5_0= rulefactor ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1450:1: (lv_factors_5_0= rulefactor )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1450:1: (lv_factors_5_0= rulefactor )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1451:3: lv_factors_5_0= rulefactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2753);
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
            	    break loop21;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1475:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1476:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1477:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2790);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2800); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1484:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1487:28: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1488:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1488:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )
            int alt22=10;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1488:2: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1488:2: ( (lv_variable_0_0= rulevariable ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1489:1: (lv_variable_0_0= rulevariable )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1489:1: (lv_variable_0_0= rulevariable )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1490:3: lv_variable_0_0= rulevariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2846);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1507:6: ( (lv_number_1_0= rulenumber ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1507:6: ( (lv_number_1_0= rulenumber ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1508:1: (lv_number_1_0= rulenumber )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1508:1: (lv_number_1_0= rulenumber )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1509:3: lv_number_1_0= rulenumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2873);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1526:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1526:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1527:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1527:1: (lv_string_2_0= RULE_STRING )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1528:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2896); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1545:6: ( (lv_set_3_0= ruleset ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1545:6: ( (lv_set_3_0= ruleset ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1546:1: (lv_set_3_0= ruleset )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1546:1: (lv_set_3_0= ruleset )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1547:3: lv_set_3_0= ruleset
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleset_in_rulefactor2928);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"set",
                            		lv_set_3_0, 
                            		"set");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1564:6: ( (lv_nil_4_0= Nil ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1564:6: ( (lv_nil_4_0= Nil ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1565:1: (lv_nil_4_0= Nil )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1565:1: (lv_nil_4_0= Nil )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1566:3: lv_nil_4_0= Nil
                    {
                    lv_nil_4_0=(Token)match(input,Nil,FOLLOW_Nil_in_rulefactor2953); 

                            newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "nil", true, "nil");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1581:6: ( (lv_boolean_5_0= True ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1581:6: ( (lv_boolean_5_0= True ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1582:1: (lv_boolean_5_0= True )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1582:1: (lv_boolean_5_0= True )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1583:3: lv_boolean_5_0= True
                    {
                    lv_boolean_5_0=(Token)match(input,True,FOLLOW_True_in_rulefactor2989); 

                            newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1598:6: ( (lv_boolean_6_0= False ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1598:6: ( (lv_boolean_6_0= False ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1599:1: (lv_boolean_6_0= False )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1599:1: (lv_boolean_6_0= False )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1600:3: lv_boolean_6_0= False
                    {
                    lv_boolean_6_0=(Token)match(input,False,FOLLOW_False_in_rulefactor3025); 

                            newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1615:6: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1615:6: ( (lv_function_7_0= rulefunction_designator ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1616:1: (lv_function_7_0= rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1616:1: (lv_function_7_0= rulefunction_designator )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1617:3: lv_function_7_0= rulefunction_designator
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor3063);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1634:6: (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1634:6: (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1635:2: otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis
                    {
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefactor3083); 

                        	newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1639:1: ( (lv_expression_9_0= ruleexpression ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1640:1: (lv_expression_9_0= ruleexpression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1640:1: (lv_expression_9_0= ruleexpression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1641:3: lv_expression_9_0= ruleexpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor3103);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_9_0, 
                            		"expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefactor3116); 

                        	newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1663:6: (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1663:6: (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1664:2: otherlv_11= Not ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,Not,FOLLOW_Not_in_rulefactor3136); 

                        	newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1668:1: ( (lv_not_12_0= rulefactor ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1669:1: (lv_not_12_0= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1669:1: (lv_not_12_0= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1670:3: lv_not_12_0= rulefactor
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3156);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"not",
                            		lv_not_12_0, 
                            		"factor");
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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1694:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1695:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1696:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3192);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3202); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1703:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1706:28: ( ( (lv_number_0_0= ruleany_number ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1707:1: ( (lv_number_0_0= ruleany_number ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1707:1: ( (lv_number_0_0= ruleany_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1708:1: (lv_number_0_0= ruleany_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1708:1: (lv_number_0_0= ruleany_number )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1709:3: lv_number_0_0= ruleany_number
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleany_number_in_rulenumber3247);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_0_0, 
                    		"any_number");
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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1733:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1734:2: (iv_ruleany_number= ruleany_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1735:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_ruleany_number_in_entryRuleany_number3281);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleany_number3291); 

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
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1742:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1745:28: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1746:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1746:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_INTEGER_NUMBER && LA23_0<=RULE_REAL_NUMBER)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_SIGNED_INTEGER_NUMBER && LA23_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1747:5: this_unsigned_number_0= ruleunsigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunsigned_number_in_ruleany_number3338);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                            current = this_unsigned_number_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1757:5: this_signed_number_1= rulesigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesigned_number_in_ruleany_number3365);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                            current = this_signed_number_1;
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
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1773:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1774:2: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1775:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3399);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3409); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1782:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1785:28: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1786:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1786:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INTEGER_NUMBER) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_REAL_NUMBER) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1786:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1786:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1787:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1787:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1788:3: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3451); 

                    			newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_0_0, 
                            		"INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1805:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1805:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1806:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1806:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1807:3: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3479); 

                    			newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1831:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1832:2: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1833:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3519);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3529); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1840:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1843:28: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1844:1: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1844:1: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1844:2: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1844:2: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1845:1: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1845:1: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1846:3: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3571); 

                    			newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_0_0, 
                            		"SIGNED_INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1863:6: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1863:6: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1864:1: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1864:1: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1865:3: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3599); 

                    			newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1889:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1890:2: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1891:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3639);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3649); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1898:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:28: ( ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:2: ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1902:2: ( (lv_brackets_0_0= LeftSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1903:1: (lv_brackets_0_0= LeftSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1903:1: (lv_brackets_0_0= LeftSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1904:3: lv_brackets_0_0= LeftSquareBracket
            {
            lv_brackets_0_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleset3693); 

                    newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1918:2: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==False||LA26_0==True||(LA26_0>=Nil && LA26_0<=Not)||LA26_0==LeftParenthesis||LA26_0==LeftSquareBracket||(LA26_0>=RULE_INTEGER_NUMBER && LA26_0<=RULE_SIGNED_REAL_NUMBER)||LA26_0==RULE_ADDITION_OPERATOR||LA26_0==RULE_ID||LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1919:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1919:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1920:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3725);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1936:3: ( (lv_brackets_2_0= RightSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1937:1: (lv_brackets_2_0= RightSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1937:1: (lv_brackets_2_0= RightSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1938:3: lv_brackets_2_0= RightSquareBracket
            {
            lv_brackets_2_0=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleset3745); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1960:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1961:2: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1962:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3791);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3801); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1969:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1972:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1973:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1973:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1973:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1973:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1974:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1974:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1975:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_designator3843); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefunction_designator3861); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1996:1: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==False||LA27_0==True||(LA27_0>=Nil && LA27_0<=Not)||LA27_0==LeftParenthesis||LA27_0==LeftSquareBracket||(LA27_0>=RULE_INTEGER_NUMBER && LA27_0<=RULE_SIGNED_REAL_NUMBER)||LA27_0==RULE_ADDITION_OPERATOR||LA27_0==RULE_ID||LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1997:1: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1997:1: (lv_expressions_2_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1998:3: lv_expressions_2_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3881);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefunction_designator3895); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2027:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2028:2: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2029:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement3929);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement3939); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2036:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_withStmt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2039:28: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2040:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2040:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case Begin:
                {
                alt28=1;
                }
                break;
            case Repeat:
            case While:
            case For:
                {
                alt28=2;
                }
                break;
            case Case:
            case If:
                {
                alt28=3;
                }
                break;
            case With:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2040:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2040:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2041:1: (lv_compound_0_0= rulecompound_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2041:1: (lv_compound_0_0= rulecompound_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2042:3: lv_compound_0_0= rulecompound_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement3985);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2059:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2059:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2060:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2060:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2061:3: lv_repetitive_1_0= rulerepetitive_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement4012);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2078:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2078:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2079:1: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2079:1: (lv_conditional_2_0= ruleconditional_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2080:3: lv_conditional_2_0= ruleconditional_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement4039);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2097:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2097:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2098:1: (lv_withStmt_3_0= rulewith_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2098:1: (lv_withStmt_3_0= rulewith_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2099:3: lv_withStmt_3_0= rulewith_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getWithStmtWith_statementParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement4066);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2123:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2124:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2125:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement4101);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement4111); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2132:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2135:28: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2136:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2136:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2137:2: otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_Begin_in_rulecompound_statement4149); 

                	newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2141:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2142:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2142:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2143:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4169);
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

            otherlv_2=(Token)match(input,End,FOLLOW_End_in_rulecompound_statement4182); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2172:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2173:2: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2174:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4216);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4226); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2181:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_whileStmt_0_0 = null;

        EObject lv_repeatStmt_1_0 = null;

        EObject lv_forStmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2184:28: ( ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2185:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2185:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case While:
                {
                alt29=1;
                }
                break;
            case Repeat:
                {
                alt29=2;
                }
                break;
            case For:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2185:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2185:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2186:1: (lv_whileStmt_0_0= rulewhile_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2186:1: (lv_whileStmt_0_0= rulewhile_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2187:3: lv_whileStmt_0_0= rulewhile_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileStmtWhile_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4272);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2204:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2204:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2205:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2205:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2206:3: lv_repeatStmt_1_0= rulerepeat_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatStmtRepeat_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4299);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2223:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2223:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2224:1: (lv_forStmt_2_0= rulefor_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2224:1: (lv_forStmt_2_0= rulefor_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2225:3: lv_forStmt_2_0= rulefor_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4326);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2249:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2250:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2251:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4361);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4371); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2258:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2261:28: ( (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2262:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2262:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2263:2: otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_While_in_rulewhile_statement4409); 

                	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2267:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2268:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2268:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2269:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4429);
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

            otherlv_2=(Token)match(input,Do,FOLLOW_Do_in_rulewhile_statement4442); 

                	newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2290:1: ( (lv_statement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2291:1: (lv_statement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2291:1: (lv_statement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2292:3: lv_statement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4462);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2316:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2317:2: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2318:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4497);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4507); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2325:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2328:28: ( (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2329:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2329:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2330:2: otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,Repeat,FOLLOW_Repeat_in_rulerepeat_statement4545); 

                	newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2334:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2335:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2335:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2336:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4565);
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

            otherlv_2=(Token)match(input,Until,FOLLOW_Until_in_rulerepeat_statement4578); 

                	newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2357:1: ( (lv_expression_3_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2358:1: (lv_expression_3_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2358:1: (lv_expression_3_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2359:3: lv_expression_3_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4598);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2383:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2384:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2385:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4633);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4643); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2392:1: rulefor_statement returns [EObject current=null] : (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2395:28: ( (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2396:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2396:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2397:2: otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_For_in_rulefor_statement4681); 

                	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2401:1: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2402:1: (lv_assignment_1_0= ruleassignment_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2402:1: (lv_assignment_1_0= ruleassignment_statement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2403:3: lv_assignment_1_0= ruleassignment_statement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4701);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2419:2: (otherlv_2= To | otherlv_3= Downto )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==To) ) {
                alt30=1;
            }
            else if ( (LA30_0==Downto) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2420:2: otherlv_2= To
                    {
                    otherlv_2=(Token)match(input,To,FOLLOW_To_in_rulefor_statement4715); 

                        	newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2426:2: otherlv_3= Downto
                    {
                    otherlv_3=(Token)match(input,Downto,FOLLOW_Downto_in_rulefor_statement4733); 

                        	newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2430:2: ( (lv_expression_4_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2431:1: (lv_expression_4_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2431:1: (lv_expression_4_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2432:3: lv_expression_4_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4754);
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

            otherlv_5=(Token)match(input,Do,FOLLOW_Do_in_rulefor_statement4767); 

                	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2453:1: ( (lv_statement_6_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2454:1: (lv_statement_6_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2454:1: (lv_statement_6_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2455:3: lv_statement_6_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4787);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2479:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2480:2: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2481:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4822);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement4832); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2488:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2491:28: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2492:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2492:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==If) ) {
                alt31=1;
            }
            else if ( (LA31_0==Case) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2492:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2492:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2493:1: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2493:1: (lv_ifStmt_0_0= ruleif_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2494:3: lv_ifStmt_0_0= ruleif_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement4878);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2511:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2511:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2512:1: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2512:1: (lv_caseStmt_1_0= rulecase_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2513:3: lv_caseStmt_1_0= rulecase_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement4905);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2537:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2538:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2539:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement4940);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement4950); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2546:1: ruleif_statement returns [EObject current=null] : (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2549:28: ( (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2550:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2550:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2551:2: otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_If_in_ruleif_statement4988); 

                	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2555:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2556:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2556:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2557:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5008);
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

            otherlv_2=(Token)match(input,Then,FOLLOW_Then_in_ruleif_statement5021); 

                	newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2578:1: ( (lv_ifStatement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2579:1: (lv_ifStatement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2579:1: (lv_ifStatement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2580:3: lv_ifStatement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5041);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2596:2: (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Else) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2597:2: otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,Else,FOLLOW_Else_in_ruleif_statement5055); 

                        	newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:1: ( (lv_elseStatement_5_0= rulestatement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:1: (lv_elseStatement_5_0= rulestatement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:1: (lv_elseStatement_5_0= rulestatement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2603:3: lv_elseStatement_5_0= rulestatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5075);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2627:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2628:2: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2629:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5112);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5122); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2636:1: rulecase_statement returns [EObject current=null] : (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2639:28: ( (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2640:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2640:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2641:2: otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulecase_statement5160); 

                	newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2645:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2646:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2646:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2647:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement5180);
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

            otherlv_2=(Token)match(input,Of,FOLLOW_Of_in_rulecase_statement5193); 

                	newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2668:1: ( (lv_cases_3_0= rulecase_limb ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2669:1: (lv_cases_3_0= rulecase_limb )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2669:1: (lv_cases_3_0= rulecase_limb )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2670:3: lv_cases_3_0= rulecase_limb
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5213);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2686:2: (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Semicolon) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==False||LA33_1==True||LA33_1==Nil||(LA33_1>=RULE_INTEGER_NUMBER && LA33_1<=RULE_SIGNED_REAL_NUMBER)||LA33_1==RULE_ADDITION_OPERATOR||LA33_1==RULE_ID||LA33_1==RULE_STRING) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2687:2: otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5227); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2691:1: ( (lv_cases_5_0= rulecase_limb ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2692:1: (lv_cases_5_0= rulecase_limb )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2692:1: (lv_cases_5_0= rulecase_limb )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2693:3: lv_cases_5_0= rulecase_limb
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5247);
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
            	    break loop33;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2709:4: (otherlv_6= Semicolon )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Semicolon) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2710:2: otherlv_6= Semicolon
                    {
                    otherlv_6=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5263); 

                        	newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,End,FOLLOW_End_in_rulecase_statement5277); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2727:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2728:2: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2729:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5311);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5321); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2736:1: rulecase_limb returns [EObject current=null] : ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cases_0_0 = null;

        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2739:28: ( ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2740:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2740:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2740:2: ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2740:2: ( (lv_cases_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2741:1: (lv_cases_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2741:1: (lv_cases_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2742:3: lv_cases_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5367);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulecase_limb5380); 

                	newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2763:1: ( (lv_statement_2_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2764:1: (lv_statement_2_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2764:1: (lv_statement_2_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2765:3: lv_statement_2_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5400);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2789:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2790:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2791:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5435);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5445); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2798:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2801:28: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:2: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:2: ( (lv_constants_0_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2803:1: (lv_constants_0_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2803:1: (lv_constants_0_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2804:3: lv_constants_0_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5491);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2820:2: (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2821:2: otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulecase_label_list5505); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2825:1: ( (lv_constants_2_0= ruleconstant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2826:1: (lv_constants_2_0= ruleconstant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2826:1: (lv_constants_2_0= ruleconstant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2827:3: lv_constants_2_0= ruleconstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5525);
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
            	    break loop35;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2851:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2852:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2853:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant5562);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant5572); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2860:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2863:28: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
                {
                alt38=1;
                }
                break;
            case RULE_STRING:
                {
                alt38=2;
                }
                break;
            case True:
                {
                alt38=3;
                }
                break;
            case False:
                {
                alt38=4;
                }
                break;
            case Nil:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2864:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ADDITION_OPERATOR) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2865:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2865:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2866:3: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5615); 

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

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2882:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_INTEGER_NUMBER && LA37_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2882:4: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2882:4: ( (lv_name_1_0= RULE_ID ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2883:1: (lv_name_1_0= RULE_ID )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2883:1: (lv_name_1_0= RULE_ID )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2884:3: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant5639); 

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
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2901:6: ( (lv_number_2_0= rulenumber ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2901:6: ( (lv_number_2_0= rulenumber ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2902:1: (lv_number_2_0= rulenumber )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2902:1: (lv_number_2_0= rulenumber )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2903:3: lv_number_2_0= rulenumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant5671);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2920:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2920:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2921:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2921:1: (lv_string_3_0= RULE_STRING )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2922:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant5696); 

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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2939:6: ( (lv_boolLiteral_4_0= True ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2939:6: ( (lv_boolLiteral_4_0= True ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2940:1: (lv_boolLiteral_4_0= True )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2940:1: (lv_boolLiteral_4_0= True )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2941:3: lv_boolLiteral_4_0= True
                    {
                    lv_boolLiteral_4_0=(Token)match(input,True,FOLLOW_True_in_ruleconstant5726); 

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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2956:6: ( (lv_boolLiteral_5_0= False ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2956:6: ( (lv_boolLiteral_5_0= False ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2957:1: (lv_boolLiteral_5_0= False )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2957:1: (lv_boolLiteral_5_0= False )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2958:3: lv_boolLiteral_5_0= False
                    {
                    lv_boolLiteral_5_0=(Token)match(input,False,FOLLOW_False_in_ruleconstant5762); 

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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2973:6: ( (lv_nil_6_0= Nil ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2973:6: ( (lv_nil_6_0= Nil ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2974:1: (lv_nil_6_0= Nil )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2974:1: (lv_nil_6_0= Nil )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2975:3: lv_nil_6_0= Nil
                    {
                    lv_nil_6_0=(Token)match(input,Nil,FOLLOW_Nil_in_ruleconstant5798); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2997:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2998:2: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2999:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement5844);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement5854); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3006:1: rulewith_statement returns [EObject current=null] : (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3009:28: ( (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3011:2: otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_With_in_rulewith_statement5892); 

                	newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3015:1: ( (lv_variables_1_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3016:1: (lv_variables_1_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3016:1: (lv_variables_1_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3017:3: lv_variables_1_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement5912);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3033:2: (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Comma) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3034:2: otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulewith_statement5926); 

            	        	newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3038:1: ( (lv_variables_3_0= rulevariable ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3039:1: (lv_variables_3_0= rulevariable )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3039:1: (lv_variables_3_0= rulevariable )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3040:3: lv_variables_3_0= rulevariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement5946);
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
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,Do,FOLLOW_Do_in_rulewith_statement5961); 

                	newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3061:1: ( (lv_statement_5_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3062:1: (lv_statement_5_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3062:1: (lv_statement_5_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3063:3: lv_statement_5_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement5981);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3087:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3088:2: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3089:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement6016);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement6026); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3096:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3099:28: ( (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3100:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3100:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3101:2: otherlv_0= Goto ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,Goto,FOLLOW_Goto_in_rulegoto_statement6064); 

                	newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3105:1: ( (lv_label_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3106:1: (lv_label_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3106:1: (lv_label_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3107:3: lv_label_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement6084);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3131:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3132:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3133:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6119);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part6129); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3140:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3143:28: ( (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3144:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3144:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3145:2: otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Label,FOLLOW_Label_in_rulelabel_declaration_part6167); 

                	newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3149:1: ( (lv_labels_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3150:1: (lv_labels_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3150:1: (lv_labels_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3151:3: lv_labels_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6187);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3167:2: (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3168:2: otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulelabel_declaration_part6201); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3172:1: ( (lv_labels_3_0= rulelabel ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3173:1: (lv_labels_3_0= rulelabel )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3173:1: (lv_labels_3_0= rulelabel )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3174:3: lv_labels_3_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6221);
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
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulelabel_declaration_part6236); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3203:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3204:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3205:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6270);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6280); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3212:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3215:28: ( (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3216:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3216:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3217:2: otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Const,FOLLOW_Const_in_ruleconstant_definition_part6318); 

                	newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3221:1: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3221:2: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3221:2: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3222:1: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3222:1: (lv_consts_1_0= ruleconstant_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3223:3: lv_consts_1_0= ruleconstant_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6339);
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

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleconstant_definition_part6352); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3252:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3253:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3254:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6388);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition6398); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3261:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3264:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3265:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3265:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3265:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3265:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3266:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3266:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3267:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant_definition6440); 

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

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleconstant_definition6458); 

                	newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3288:1: ( (lv_const_2_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3289:1: (lv_const_2_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3289:1: (lv_const_2_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3290:3: lv_const_2_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition6478);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3314:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3315:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3316:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6513);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part6523); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3323:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3326:28: ( (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3327:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3327:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3328:2: otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_Type_in_ruletype_definition_part6561); 

                	newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3332:1: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
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
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3332:2: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3332:2: ( (lv_types_1_0= ruletype_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3333:1: (lv_types_1_0= ruletype_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3333:1: (lv_types_1_0= ruletype_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3334:3: lv_types_1_0= ruletype_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part6582);
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

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruletype_definition_part6595); 

            	        	newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	        

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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3363:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3364:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3365:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition6631);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition6641); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3372:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3375:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3376:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3377:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3377:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3378:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletype_definition6683); 

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

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruletype_definition6701); 

                	newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3399:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3400:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3400:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3401:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruletype_definition6721);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3425:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3426:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3427:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype6756);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype6766); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3434:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3437:28: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3438:1: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3438:1: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt43=3;
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
                alt43=1;
                }
                break;
            case Packed:
            case Record:
            case Array:
            case File:
            case Set:
                {
                alt43=2;
                }
                break;
            case CircumflexAccent:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3438:2: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3438:2: ( (lv_simple_0_0= rulesimple_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3439:1: (lv_simple_0_0= rulesimple_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3439:1: (lv_simple_0_0= rulesimple_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3440:3: lv_simple_0_0= rulesimple_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype6812);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"simple_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3457:6: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3457:6: ( (lv_structured_1_0= rulestructured_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3458:1: (lv_structured_1_0= rulestructured_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3458:1: (lv_structured_1_0= rulestructured_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3459:3: lv_structured_1_0= rulestructured_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype6839);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"structured",
                            		lv_structured_1_0, 
                            		"structured_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3476:6: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3476:6: ( (lv_pointer_2_0= rulepointer_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3477:1: (lv_pointer_2_0= rulepointer_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3477:1: (lv_pointer_2_0= rulepointer_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3478:3: lv_pointer_2_0= rulepointer_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype6866);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"pointer",
                            		lv_pointer_2_0, 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3502:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3503:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3504:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type6901);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type6911); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3511:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3514:28: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3515:1: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3515:1: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt44=3;
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
                alt44=1;
                }
                break;
            case RULE_ID:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==FullStopFullStop) ) {
                    alt44=1;
                }
                else if ( (LA44_2==EOF||LA44_2==End||(LA44_2>=RightParenthesis && LA44_2<=Comma)||LA44_2==Semicolon||LA44_2==RightSquareBracket) ) {
                    alt44=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt44=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3515:2: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3515:2: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3516:1: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3516:1: (lv_subrange_0_0= rulesubrange_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3517:3: lv_subrange_0_0= rulesubrange_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type6957);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"subrange",
                            		lv_subrange_0_0, 
                            		"subrange_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3534:6: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3534:6: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3535:1: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3535:1: (lv_enumerated_1_0= ruleenumerated_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3536:3: lv_enumerated_1_0= ruleenumerated_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type6984);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"enumerated",
                            		lv_enumerated_1_0, 
                            		"enumerated_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3553:6: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3553:6: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3554:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3554:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3555:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_type7007); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3579:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3583:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3584:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type7053);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type7063); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3594:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3598:28: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==False||LA45_0==True||LA45_0==Nil||(LA45_0>=RULE_INTEGER_NUMBER && LA45_0<=RULE_SIGNED_REAL_NUMBER)||LA45_0==RULE_ADDITION_OPERATOR||LA45_0==RULE_ID||LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_NUMERIC_SUBRANGE) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:3: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:3: ( (lv_initialConst_0_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3600:1: (lv_initialConst_0_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3600:1: (lv_initialConst_0_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:3: lv_initialConst_0_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7114);
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

                    otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulesubrange_type7127); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3622:1: ( (lv_finalConst_2_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3623:1: (lv_finalConst_2_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3623:1: (lv_finalConst_2_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3624:3: lv_finalConst_2_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7147);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3641:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3641:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3641:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3641:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3642:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3642:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3643:3: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7172); 

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

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3659:2: ( (lv_const_4_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3660:1: (lv_const_4_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3660:1: (lv_const_4_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3661:3: lv_const_4_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7198);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3688:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3689:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3690:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7238);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7248); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3697:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3700:28: ( (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3701:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3701:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3702:2: otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleenumerated_type7286); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3706:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3707:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3707:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3708:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type7306);
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

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleenumerated_type7319); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3737:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3738:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3739:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type7353);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type7363); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3746:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3749:28: ( ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3750:1: ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3750:1: ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3750:2: ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3750:2: ( (lv_packed_0_0= Packed ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Packed) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3751:1: (lv_packed_0_0= Packed )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3751:1: (lv_packed_0_0= Packed )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3752:3: lv_packed_0_0= Packed
                    {
                    lv_packed_0_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulestructured_type7407); 

                            newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructured_typeRule());
                    	        }
                           		setWithLastConsumed(current, "packed", true, "packed");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3766:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3767:1: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3767:1: (lv_type_1_0= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3768:3: lv_type_1_0= ruleunpacked_structured_type
            {
             
            	        newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7440);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3792:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3793:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3794:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7475);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type7485); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3801:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;

        EObject lv_record_2_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_file_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3804:28: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3805:1: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3805:1: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case Array:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==Of) ) {
                    alt47=2;
                }
                else if ( (LA47_1==LeftSquareBracket) ) {
                    alt47=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case Record:
                {
                alt47=3;
                }
                break;
            case Set:
                {
                alt47=4;
                }
                break;
            case File:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3805:2: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3805:2: ( (lv_array_0_0= rulearray_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3806:1: (lv_array_0_0= rulearray_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3806:1: (lv_array_0_0= rulearray_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3807:3: lv_array_0_0= rulearray_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type7531);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_0_0, 
                            		"array_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3824:6: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3824:6: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3825:1: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3825:1: (lv_dynamic_1_0= ruledynamic_array_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3826:3: lv_dynamic_1_0= ruledynamic_array_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7558);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"dynamic",
                            		lv_dynamic_1_0, 
                            		"dynamic_array_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3843:6: ( (lv_record_2_0= rulerecord_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3843:6: ( (lv_record_2_0= rulerecord_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3844:1: (lv_record_2_0= rulerecord_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3844:1: (lv_record_2_0= rulerecord_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3845:3: lv_record_2_0= rulerecord_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7585);
                    lv_record_2_0=rulerecord_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_2_0, 
                            		"record_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3862:6: ( (lv_set_3_0= ruleset_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3862:6: ( (lv_set_3_0= ruleset_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3863:1: (lv_set_3_0= ruleset_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3863:1: (lv_set_3_0= ruleset_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3864:3: lv_set_3_0= ruleset_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type7612);
                    lv_set_3_0=ruleset_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"set",
                            		lv_set_3_0, 
                            		"set_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3881:6: ( (lv_file_4_0= rulefile_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3881:6: ( (lv_file_4_0= rulefile_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3882:1: (lv_file_4_0= rulefile_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3882:1: (lv_file_4_0= rulefile_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3883:3: lv_file_4_0= rulefile_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileFile_typeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type7639);
                    lv_file_4_0=rulefile_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_0, 
                            		"file_type");
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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3907:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3908:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3909:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type7674);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type7684); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3916:1: rulearray_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3919:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3920:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3920:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3921:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_rulearray_type7722); 

                	newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulearray_type7734); 

                	newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3930:1: ( (lv_indexes_2_0= ruleindex_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:1: (lv_indexes_2_0= ruleindex_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:1: (lv_indexes_2_0= ruleindex_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3932:3: lv_indexes_2_0= ruleindex_type
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7754);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3948:2: (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3949:2: otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_rulearray_type7768); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3953:1: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3954:1: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3954:1: (lv_indexes_4_0= ruleindex_type )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3955:3: lv_indexes_4_0= ruleindex_type
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7788);
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
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulearray_type7803); 

                	newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_rulearray_type7815); 

                	newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3981:1: ( (lv_type_7_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3982:1: (lv_type_7_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3982:1: (lv_type_7_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3983:3: lv_type_7_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulearray_type7835);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4007:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4008:2: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4009:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7870);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledynamic_array_type7880); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4016:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4019:28: ( (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4020:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4020:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4021:2: otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruledynamic_array_type7918); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruledynamic_array_type7930); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4030:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4031:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4031:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4032:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruledynamic_array_type7950);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4056:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4057:2: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4058:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type7985);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type7995); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4065:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4068:28: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4069:1: ( (lv_type_0_0= rulesimple_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4069:1: ( (lv_type_0_0= rulesimple_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:1: (lv_type_0_0= rulesimple_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4070:1: (lv_type_0_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4071:3: lv_type_0_0= rulesimple_type
            {
             
            	        newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type8040);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4095:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4096:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4097:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type8074);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type8084); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4104:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4107:28: ( ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4108:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4108:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4108:2: ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4108:2: ( (lv_recordKeyword_0_0= Record ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4109:1: (lv_recordKeyword_0_0= Record )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4109:1: (lv_recordKeyword_0_0= Record )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4110:3: lv_recordKeyword_0_0= Record
            {
            lv_recordKeyword_0_0=(Token)match(input,Record,FOLLOW_Record_in_rulerecord_type8128); 

                    newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecord_typeRule());
            	        }
                   		setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4124:2: ( (lv_fields_1_0= rulefield_list ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Case||LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4125:1: (lv_fields_1_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4125:1: (lv_fields_1_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4126:3: lv_fields_1_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulerecord_type8160);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4142:3: ( (lv_endKeyword_2_0= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4143:1: (lv_endKeyword_2_0= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4143:1: (lv_endKeyword_2_0= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4144:3: lv_endKeyword_2_0= End
            {
            lv_endKeyword_2_0=(Token)match(input,End,FOLLOW_End_in_rulerecord_type8180); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4166:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4167:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4168:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list8226);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list8236); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4175:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4178:28: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==Case) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:4: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4179:4: ( (lv_fixed_0_0= rulefixed_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4180:1: (lv_fixed_0_0= rulefixed_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4180:1: (lv_fixed_0_0= rulefixed_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4181:3: lv_fixed_0_0= rulefixed_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefixed_part_in_rulefield_list8284);
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

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4197:2: (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Semicolon) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==Case) ) {
                            alt50=1;
                        }
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4198:2: otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8298); 

                                	newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4202:1: ( (lv_variants_2_0= rulevariant_part ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4203:1: (lv_variants_2_0= rulevariant_part )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4203:1: (lv_variants_2_0= rulevariant_part )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4204:3: lv_variants_2_0= rulevariant_part
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8318);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4221:6: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4221:6: ( (lv_variants_3_0= rulevariant_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4222:1: (lv_variants_3_0= rulevariant_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4222:1: (lv_variants_3_0= rulevariant_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4223:3: lv_variants_3_0= rulevariant_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8348);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4239:3: (otherlv_4= Semicolon )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Semicolon) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4240:2: otherlv_4= Semicolon
                    {
                    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8363); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4252:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4253:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4254:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part8399);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part8409); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4261:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4264:28: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4265:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4265:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4265:2: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4265:2: ( (lv_sections_0_0= rulerecord_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4266:1: (lv_sections_0_0= rulerecord_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4266:1: (lv_sections_0_0= rulerecord_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4267:3: lv_sections_0_0= rulerecord_section
            {
             
            	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8455);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4283:2: (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Semicolon) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==RULE_ID) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4284:2: otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefixed_part8469); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4288:1: ( (lv_sections_2_0= rulerecord_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4289:1: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4289:1: (lv_sections_2_0= rulerecord_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4290:3: lv_sections_2_0= rulerecord_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8489);
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
            	    break loop53;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4314:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4315:2: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4316:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8526);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier_list8536); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4323:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4326:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4327:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4327:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4327:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4327:2: ( (lv_names_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4328:1: (lv_names_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4328:1: (lv_names_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4329:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8578); 

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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4345:2: (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Comma) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4346:2: otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulevariable_identifier_list8597); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4350:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4351:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4351:1: (lv_names_2_0= RULE_ID )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4352:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8613); 

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
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4376:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4377:2: (iv_rulevariable_section= rulevariable_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4378:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_section_in_entryRulevariable_section8655);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_section8665); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4385:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4388:28: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4389:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4389:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4389:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4389:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4390:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4390:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4391:3: lv_identifiers_0_0= rulevariable_identifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_identifier_list_in_rulevariable_section8711);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_section8724); 

                	newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4412:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4413:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4413:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4414:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulevariable_section8744);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4438:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4439:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4440:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section8779);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section8789); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4447:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4450:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4451:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4451:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4451:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4451:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4452:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4452:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4453:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section8835);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulerecord_section8848); 

                	newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4474:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4475:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4475:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4476:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulerecord_section8868);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4500:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4501:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4502:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part8903);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part8913); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4509:1: rulevariant_part returns [EObject current=null] : (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4512:28: ( (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4513:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4513:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4514:2: otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulevariant_part8951); 

                	newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4518:1: ( (lv_tag_1_0= ruletag_field ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==Colon) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4519:1: (lv_tag_1_0= ruletag_field )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4519:1: (lv_tag_1_0= ruletag_field )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4520:3: lv_tag_1_0= ruletag_field
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruletag_field_in_rulevariant_part8971);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4536:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4537:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4537:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4538:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariant_part8989); 

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

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_rulevariant_part9007); 

                	newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4559:1: ( (lv_variants_4_0= rulevariant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4560:1: (lv_variants_4_0= rulevariant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4560:1: (lv_variants_4_0= rulevariant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4561:3: lv_variants_4_0= rulevariant
            {
             
            	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part9027);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4577:2: (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==Semicolon) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==False||LA56_1==True||LA56_1==Nil||(LA56_1>=RULE_INTEGER_NUMBER && LA56_1<=RULE_SIGNED_REAL_NUMBER)||LA56_1==RULE_ADDITION_OPERATOR||LA56_1==RULE_ID||LA56_1==RULE_STRING) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4578:2: otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariant_part9041); 

            	        	newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4582:1: ( (lv_variants_6_0= rulevariant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4583:1: (lv_variants_6_0= rulevariant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4583:1: (lv_variants_6_0= rulevariant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4584:3: lv_variants_6_0= rulevariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part9061);
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
            	    break loop56;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4608:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4609:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4610:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field9098);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field9108); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4617:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4620:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4621:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4621:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4621:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4621:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4622:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4622:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4623:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletag_field9150); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_ruletag_field9168); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4652:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4653:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4654:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant9202);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant9212); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4661:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4664:28: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4665:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4665:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4665:2: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4665:2: ( (lv_labels_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4666:1: (lv_labels_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4666:1: (lv_labels_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4667:3: lv_labels_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9258);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariant9271); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulevariant9283); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4693:1: ( (lv_fields_3_0= rulefield_list ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Case||LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4694:1: (lv_fields_3_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4694:1: (lv_fields_3_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4695:3: lv_fields_3_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulevariant9303);
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulevariant9317); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4724:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4725:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4726:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9351);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9361); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4733:1: ruleset_type returns [EObject current=null] : (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4736:28: ( (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4737:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4737:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4738:2: otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_Set_in_ruleset_type9399); 

                	newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruleset_type9411); 

                	newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4747:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4748:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4748:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4749:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruleset_type9431);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4773:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4774:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4775:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9466);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9476); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4782:1: rulefile_type returns [EObject current=null] : (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4785:28: ( (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4786:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4786:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4787:2: otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,File,FOLLOW_File_in_rulefile_type9514); 

                	newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_rulefile_type9526); 

                	newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4796:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4797:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4797:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4798:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulefile_type9546);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4822:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4823:2: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4824:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type9581);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type9591); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4831:1: rulepointer_type returns [EObject current=null] : (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4834:28: ( (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4835:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4835:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4836:2: otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulepointer_type9629); 

                	newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4840:1: ( (lv_type_1_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4841:1: (lv_type_1_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4841:1: (lv_type_1_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4842:3: lv_type_1_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulepointer_type9649);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4866:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4867:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4868:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9684);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part9694); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4875:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4878:28: ( (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4879:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4879:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4880:2: otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_declaration_part9732); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4884:1: ( (lv_sections_1_0= rulevariable_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4885:1: (lv_sections_1_0= rulevariable_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4885:1: (lv_sections_1_0= rulevariable_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4886:3: lv_sections_1_0= rulevariable_section
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9752);
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

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9765); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4907:1: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4907:2: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4907:2: ( (lv_sections_3_0= rulevariable_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4908:1: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4908:1: (lv_sections_3_0= rulevariable_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4909:3: lv_sections_3_0= rulevariable_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9786);
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

            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9799); 

            	        	newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4938:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4939:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4940:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9835);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9845); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4947:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4950:28: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=Procedure && LA60_0<=Function)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==Procedure) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==Function) ) {
            	        alt59=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4951:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4952:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4952:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4953:3: lv_procedures_0_0= ruleprocedure_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9892);
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
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4970:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4970:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4971:1: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4971:1: (lv_functions_1_0= rulefunction_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4972:3: lv_functions_1_0= rulefunction_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9919);
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

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9933); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5005:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5006:2: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5007:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9972);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration9982); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5014:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5017:28: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5018:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5018:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5018:2: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5018:2: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5019:1: (lv_heading_0_0= ruleprocedure_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5019:1: (lv_heading_0_0= ruleprocedure_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5020:3: lv_heading_0_0= ruleprocedure_heading
            {
             
            	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10028);
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

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_declaration10041); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5041:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=Procedure && LA61_0<=Function)||(LA61_0>=Begin && LA61_0<=Const)||LA61_0==Label||LA61_0==Type||LA61_0==Var) ) {
                alt61=1;
            }
            else if ( (LA61_0==Forward) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5041:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5041:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5042:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5042:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5043:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration10062);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5060:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5060:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5061:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5061:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5062:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_ruleprocedure_declaration10087); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5084:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5085:2: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5086:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10134);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading10144); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5093:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5096:28: ( (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5097:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5097:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5098:2: otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,Procedure,FOLLOW_Procedure_in_ruleprocedure_heading10182); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5102:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5103:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5103:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5104:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprocedure_heading10198); 

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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5120:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LeftParenthesis) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5121:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5121:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5122:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10224);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5146:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5147:2: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5148:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10260);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list10270); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5155:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5158:28: ( (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5159:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5159:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5160:2: otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10308); 

                	newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5164:1: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5165:1: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5165:1: (lv_parameters_1_0= ruleformal_parameter_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5166:3: lv_parameters_1_0= ruleformal_parameter_section
            {
             
            	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10328);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5182:2: (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==Semicolon) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5183:2: otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleformal_parameter_list10342); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5187:1: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5188:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5188:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5189:3: lv_parameters_3_0= ruleformal_parameter_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10362);
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
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleformal_parameter_list10377); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5218:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5219:2: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5220:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10411);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section10421); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5227:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5230:28: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5231:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5231:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt64=1;
                }
                break;
            case Var:
                {
                alt64=2;
                }
                break;
            case Procedure:
                {
                alt64=3;
                }
                break;
            case Function:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5231:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5231:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5232:1: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5232:1: (lv_value_0_0= rulevalue_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5233:3: lv_value_0_0= rulevalue_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10467);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5250:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5250:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5251:1: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5251:1: (lv_variable_1_0= rulevariable_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5252:3: lv_variable_1_0= rulevariable_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10494);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5269:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5269:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5270:1: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5270:1: (lv_procedure_2_0= ruleprocedure_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5271:3: lv_procedure_2_0= ruleprocedure_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10521);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5288:6: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5288:6: ( (lv_function_3_0= rulefunction_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5289:1: (lv_function_3_0= rulefunction_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5289:1: (lv_function_3_0= rulefunction_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5290:3: lv_function_3_0= rulefunction_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10548);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5314:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5315:2: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5316:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10583);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section10593); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5323:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5326:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5327:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5327:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5327:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5327:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5328:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5328:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5329:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10639);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevalue_parameter_section10652); 

                	newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5350:1: ( (lv_type_2_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5351:1: (lv_type_2_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5351:1: (lv_type_2_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5352:3: lv_type_2_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10672);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5376:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5377:2: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5378:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type10707);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type10717); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5385:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_array_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5388:28: ( ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5389:1: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5389:1: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Packed||LA65_0==Array) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5389:2: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5389:2: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5390:1: (lv_array_0_0= ruleconformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5390:1: (lv_array_0_0= ruleconformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5391:3: lv_array_0_0= ruleconformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10763);
                    lv_array_0_0=ruleconformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_0_0, 
                            		"conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5408:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5408:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5409:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5409:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5410:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameter_type10786); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5434:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5435:2: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5436:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10826);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema10836); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5443:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5446:28: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5447:1: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5447:1: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Packed) ) {
                alt66=1;
            }
            else if ( (LA66_0==Array) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5447:2: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5447:2: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5448:1: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5448:1: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5449:3: lv_packed_0_0= rulepacked_conformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10882);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    	        }
                           		set(
                           			current, 
                           			"packed",
                            		lv_packed_0_0, 
                            		"packed_conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5466:6: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5466:6: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5467:1: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5467:1: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5468:3: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10909);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    	        }
                           		set(
                           			current, 
                           			"unpacked",
                            		lv_unpacked_1_0, 
                            		"unpacked_conformant_array_schema");
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
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5492:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5493:2: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5494:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10944);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10954); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5501:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5504:28: ( (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5505:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5505:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5506:2: otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulepacked_conformant_array_schema10992); 

                	newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
                
            otherlv_1=(Token)match(input,Array,FOLLOW_Array_in_rulepacked_conformant_array_schema11004); 

                	newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
                
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11016); 

                	newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5520:1: ( (lv_bound_3_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5521:1: (lv_bound_3_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5521:1: (lv_bound_3_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5522:3: lv_bound_3_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11036);
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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11049); 

                	newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,Of,FOLLOW_Of_in_rulepacked_conformant_array_schema11061); 

                	newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5548:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5549:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5549:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5550:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11077); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5574:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5575:2: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5576:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification11117);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification11127); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5583:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5586:28: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5587:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5587:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5587:2: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5587:2: ( (lv_initial_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5588:1: (lv_initial_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5588:1: (lv_initial_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5589:3: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11169); 

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

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulebound_specification11187); 

                	newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5610:1: ( (lv_final_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5611:1: (lv_final_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5611:1: (lv_final_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5612:3: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11203); 

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

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulebound_specification11221); 

                	newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5633:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5634:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5634:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5635:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11237); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5659:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5660:2: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5661:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11277);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11287); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5668:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5671:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5672:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5672:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5673:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruleunpacked_conformant_array_schema11325); 

                	newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11337); 

                	newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5682:1: ( (lv_bounds_2_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5683:1: (lv_bounds_2_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5683:1: (lv_bounds_2_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5684:3: lv_bounds_2_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11357);
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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5700:2: (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==Semicolon) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5701:2: otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11371); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5705:1: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5706:1: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5706:1: (lv_bounds_4_0= rulebound_specification )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5707:3: lv_bounds_4_0= rulebound_specification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11391);
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
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11406); 

                	newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_ruleunpacked_conformant_array_schema11418); 

                	newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5733:1: ( (lv_type_7_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5734:1: (lv_type_7_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5734:1: (lv_type_7_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5735:3: lv_type_7_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_ruleunpacked_conformant_array_schema11438);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
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
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5759:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5760:2: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5761:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11473);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section11483); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5768:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5771:28: ( (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5772:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5772:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5773:2: otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_parameter_section11521); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5777:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5778:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5778:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5779:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11541);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_parameter_section11554); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5800:1: ( (lv_type_3_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5801:1: (lv_type_3_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5801:1: (lv_type_3_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5802:3: lv_type_3_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11574);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5826:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5827:2: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5828:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading11609);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading11619); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5835:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5838:28: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5839:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5839:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5840:2: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_Function_in_rulefunction_heading11657); 

                	newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5844:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5845:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5845:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5846:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11673); 

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

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5862:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LeftParenthesis) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5863:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5863:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5864:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11699);
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

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulefunction_heading11713); 

                	newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5885:1: ( (lv_returnType_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5886:1: (lv_returnType_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5886:1: (lv_returnType_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5887:3: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11729); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5911:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5912:2: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5913:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11769);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration11779); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5920:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5923:28: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5924:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5924:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5924:2: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5924:2: ( (lv_heading_0_0= rulefunction_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5925:1: (lv_heading_0_0= rulefunction_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5925:1: (lv_heading_0_0= rulefunction_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5926:3: lv_heading_0_0= rulefunction_heading
            {
             
            	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_heading_in_rulefunction_declaration11825);
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

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefunction_declaration11838); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5947:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=Procedure && LA69_0<=Function)||(LA69_0>=Begin && LA69_0<=Const)||LA69_0==Label||LA69_0==Type||LA69_0==Var) ) {
                alt69=1;
            }
            else if ( (LA69_0==Forward) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5947:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5947:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5948:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5948:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5949:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration11859);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5966:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5966:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5967:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5967:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5968:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_rulefunction_declaration11884); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\1\uffff\1\13\12\uffff";
    static final String DFA22_minS =
        "\1\17\1\10\12\uffff";
    static final String DFA22_maxS =
        "\1\104\1\75\12\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\7\10\uffff\1\6\7\uffff\1\5\1\11\12\uffff\1\10\6\uffff\1"+
            "\4\2\uffff\4\2\10\uffff\1\1\1\uffff\1\3",
            "\1\13\10\uffff\1\13\2\uffff\1\13\2\uffff\1\13\3\uffff\3\13"+
            "\1\uffff\1\13\6\uffff\1\13\1\uffff\4\13\1\12\3\13\1\uffff\7"+
            "\13\3\uffff\3\13",
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
            return "1488:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )";
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
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_statement1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1522 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ColonEqualsSign_in_ruleassignment_statement1535 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable1642 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevariable1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar__in_entryRulevar_1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevar_1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulevar_1752 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulevar_1772 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulevar_1785 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rulevar_1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevar_1860 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulevar_1907 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list1964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2020 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleexpression_list2034 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2054 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2147 = new BitSet(new long[]{0x2004010000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2166 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_In_in_ruleexpression2196 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleexpression2232 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2364 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2391 = new BitSet(new long[]{0x08C0040000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2411 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Or_in_rulesimple_expression2441 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2474 = new BitSet(new long[]{0x08C0040000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rulesimple_expression2502 = new BitSet(new long[]{0x08C0040000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2599 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2618 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Div_in_ruleterm2648 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Mod_in_ruleterm2684 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_And_in_ruleterm2720 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2753 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_rulefactor2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_rulefactor2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_rulefactor3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefactor3083 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor3103 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefactor3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_rulefactor3136 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleany_number_in_rulenumber3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleany_number_in_entryRuleany_number3281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleany_number3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_ruleany_number3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_ruleany_number3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleset3693 = new BitSet(new long[]{0x0BD8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3725 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleset3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_designator3843 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefunction_designator3861 = new BitSet(new long[]{0x0BC8300301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3881 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefunction_designator3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement3929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement4101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulecompound_statement4149 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4169 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecompound_statement4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_rulewhile_statement4409 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4429 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulewhile_statement4442 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Repeat_in_rulerepeat_statement4545 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4565 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Until_in_rulerepeat_statement4578 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_rulefor_statement4681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4701 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_To_in_rulefor_statement4715 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Downto_in_rulefor_statement4733 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4754 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulefor_statement4767 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement4940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleif_statement4988 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5008 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Then_in_ruleif_statement5021 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5041 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Else_in_ruleif_statement5055 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulecase_statement5160 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement5180 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulecase_statement5193 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5213 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5227 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5247 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5263 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecase_statement5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5367 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulecase_limb5380 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5491 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulecase_label_list5505 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5525 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant5562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5615 = new BitSet(new long[]{0x03C0000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleconstant5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleconstant5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_ruleconstant5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement5844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_rulewith_statement5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5912 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Comma_in_rulewith_statement5926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5946 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Do_in_rulewith_statement5961 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement6016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goto_in_rulegoto_statement6064 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_rulelabel_declaration_part6167 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6187 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulelabel_declaration_part6201 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6221 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulelabel_declaration_part6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_ruleconstant_definition_part6318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6339 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleconstant_definition_part6352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant_definition6440 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleconstant_definition6458 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_ruletype_definition_part6561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part6582 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruletype_definition_part6595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition6631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletype_definition6683 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruletype_definition6701 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype6756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type6901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_type7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type7053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7114 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulesubrange_type7127 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7172 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleenumerated_type7286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type7306 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleenumerated_type7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulestructured_type7407 = new BitSet(new long[]{0x0000000400201600L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type7674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_rulearray_type7722 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulearray_type7734 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7754 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulearray_type7768 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7788 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulearray_type7803 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulearray_type7815 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledynamic_array_type7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruledynamic_array_type7918 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruledynamic_array_type7930 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruledynamic_array_type7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type7985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type8074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Record_in_rulerecord_type8128 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type8160 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulerecord_type8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list8226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list8284 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8298 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8318 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8348 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part8399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8455 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefixed_part8469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8489 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier_list8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8578 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulevariable_identifier_list8597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8613 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rulevariable_section_in_entryRulevariable_section8655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_section8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_rulevariable_section8711 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_section8724 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_section8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section8779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section8835 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulerecord_section8848 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part8903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulevariant_part8951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part8971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariant_part8989 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulevariant_part9007 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9027 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariant_part9041 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9061 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field9098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletag_field9150 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_ruletag_field9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant9202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9258 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariant9271 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulevariant9283 = new BitSet(new long[]{0x0000200000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant9303 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulevariant9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Set_in_ruleset_type9399 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleset_type9411 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_File_in_rulefile_type9514 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulefile_type9526 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type9581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulepointer_type9629 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulepointer_type9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_declaration_part9732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9752 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9786 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9892 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9919 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9933 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10028 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_declaration10041 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_ruleprocedure_declaration10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Procedure_in_ruleprocedure_heading10182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprocedure_heading10198 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10308 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10328 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleformal_parameter_list10342 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10362 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleformal_parameter_list10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10639 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevalue_parameter_section10652 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type10707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameter_type10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulepacked_conformant_array_schema10992 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Array_in_rulepacked_conformant_array_schema11004 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11036 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11049 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulepacked_conformant_array_schema11061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification11117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11169 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulebound_specification11187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11203 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulebound_specification11221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruleunpacked_conformant_array_schema11325 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11357 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11391 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11406 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleunpacked_conformant_array_schema11418 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_ruleunpacked_conformant_array_schema11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_parameter_section11521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11541 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_parameter_section11554 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading11609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Function_in_rulefunction_heading11657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11673 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11699 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulefunction_heading11713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_rulefunction_declaration11825 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulefunction_declaration11838 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_rulefunction_declaration11884 = new BitSet(new long[]{0x0000000000000002L});

}