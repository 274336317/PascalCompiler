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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Program", "FullStopFullStop", "ColonEqualsSign", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "Semicolon", "EqualsSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_RELATIONAL_OPERATOR", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_NIL_KEYWORD", "RULE_NOT_KEYWORD", "RULE_OR_KEYWORD", "RULE_GOTO_KEYWORD", "RULE_WHILE_KEYWORD", "RULE_DO_KEYWORD", "RULE_REPEAT_KEYWORD", "RULE_UNTIL_KEYWORD", "RULE_FOR_KEYWORD", "RULE_TO_KEYWORD", "RULE_DOWNTO_KEYWORD", "RULE_IF_KEYWORD", "RULE_THEN_KEYWORD", "RULE_ELSE_KEYWORD", "RULE_CASE_KEYWORD", "RULE_OF_KEYWORD", "RULE_WITH_KEYWORD", "RULE_CONST_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_PACKED_KEYWORD", "RULE_ARRAY_KEYWORD", "RULE_RECORD_KEYWORD", "RULE_SET_KEYWORD", "RULE_FILE_KEYWORD", "RULE_VAR_KEYWORD", "RULE_PROCEDURE_KEYWORD", "RULE_FORWARD_KEYWORD", "RULE_FUNCTION_KEYWORD", "RULE_TRUE_KEYWORD", "RULE_FALSE_KEYWORD", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_IDENTIFIER", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=64;
    public static final int RightParenthesis=8;
    public static final int RULE_ANY_OTHER=70;
    public static final int RULE_IF_KEYWORD=39;
    public static final int LeftParenthesis=7;
    public static final int RightSquareBracket=15;
    public static final int RULE_NUMERIC_SUBRANGE=21;
    public static final int RULE_FUNCTION_KEYWORD=55;
    public static final int RULE_FOR_KEYWORD=36;
    public static final int RULE_ADDITION_OPERATOR=22;
    public static final int RULE_TYPE_KEYWORD=46;
    public static final int EOF=-1;
    public static final int RULE_VAR_KEYWORD=52;
    public static final int Program=4;
    public static final int FullStop=10;
    public static final int RULE_FILE_KEYWORD=51;
    public static final int RULE_UNTIL_KEYWORD=35;
    public static final int RULE_END_KEYWORD=26;
    public static final int RULE_THEN_KEYWORD=40;
    public static final int RULE_CASE_KEYWORD=42;
    public static final int RULE_REAL_NUMBER=18;
    public static final int RULE_TRUE_KEYWORD=56;
    public static final int RULE_MULTIPLICATION_OPERATOR=23;
    public static final int RULE_INT=65;
    public static final int RULE_BEGIN_KEYWORD=25;
    public static final int LeftSquareBracket=14;
    public static final int FullStopFullStop=5;
    public static final int RULE_LETTER_EXTENDED=61;
    public static final int RULE_DOWNTO_KEYWORD=38;
    public static final int RULE_TO_KEYWORD=37;
    public static final int RULE_RELATIONAL_OPERATOR=24;
    public static final int RULE_NIL_KEYWORD=28;
    public static final int RULE_GOTO_KEYWORD=31;
    public static final int RULE_LABEL_KEYWORD=27;
    public static final int ColonEqualsSign=6;
    public static final int RULE_FORWARD_KEYWORD=54;
    public static final int RULE_WHILE_KEYWORD=32;
    public static final int RULE_IDENTIFIER=62;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=58;
    public static final int RULE_OF_KEYWORD=43;
    public static final int Colon=11;
    public static final int RULE_DO_KEYWORD=33;
    public static final int RULE_WITH_KEYWORD=44;
    public static final int Semicolon=12;
    public static final int RULE_CONST_KEYWORD=45;
    public static final int RULE_SL_COMMENT=68;
    public static final int RULE_PACKED_KEYWORD=47;
    public static final int RULE_NOT_KEYWORD=29;
    public static final int RULE_SET_KEYWORD=50;
    public static final int RULE_RECORD_KEYWORD=49;
    public static final int RULE_LETTER=63;
    public static final int RULE_ML_COMMENT=67;
    public static final int RULE_STRING=66;
    public static final int RULE_SIGNED_REAL_NUMBER=20;
    public static final int RULE_REPEAT_KEYWORD=34;
    public static final int RULE_ARRAY_KEYWORD=48;
    public static final int RULE_OR_KEYWORD=30;
    public static final int RULE_FALSE_KEYWORD=57;
    public static final int RULE_DIGIT_SEQUENCE=59;
    public static final int RULE_WS=69;
    public static final int RULE_SIGNED_INTEGER_NUMBER=19;
    public static final int CircumflexAccent=16;
    public static final int RULE_DIGIT=60;
    public static final int Comma=9;
    public static final int EqualsSign=13;
    public static final int RULE_PROCEDURE_KEYWORD=53;
    public static final int RULE_ELSE_KEYWORD=41;
    public static final int RULE_INTEGER_NUMBER=17;

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

        AntlrDatatypeRuleToken lv_program_0_0 = null;


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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:100:1: entryRuleprogram returns [String current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final String entryRuleprogram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:101:1: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:102:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram157);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram168); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:109:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= FullStop ) ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_program_heading_block_0 = null;

        AntlrDatatypeRuleToken this_block_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:6: ( (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= FullStop ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= FullStop )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= FullStop )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:115:5: this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= FullStop
            {
             
                    newCompositeNode(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprogram_heading_block_in_ruleprogram215);
            this_program_heading_block_0=ruleprogram_heading_block();

            state._fsp--;


            		current.merge(this_program_heading_block_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleblock_in_ruleprogram242);
            this_block_1=ruleblock();

            state._fsp--;


            		current.merge(this_block_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleprogram260); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:150:1: entryRuleprogram_heading_block returns [String current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final String entryRuleprogram_heading_block() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading_block = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:151:1: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:152:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block300);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading_block311); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:159:1: ruleprogram_heading_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Program this_IDENTIFIER_1= RULE_IDENTIFIER (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:163:6: ( (kw= Program this_IDENTIFIER_1= RULE_IDENTIFIER (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:1: (kw= Program this_IDENTIFIER_1= RULE_IDENTIFIER (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:1: (kw= Program this_IDENTIFIER_1= RULE_IDENTIFIER (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:165:2: kw= Program this_IDENTIFIER_1= RULE_IDENTIFIER (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon
            {
            kw=(Token)match(input,Program,FOLLOW_Program_in_ruleprogram_heading_block349); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block364); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:177:1: (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LeftParenthesis) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:178:2: kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis
                    {
                    kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleprogram_heading_block383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block405);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleprogram_heading_block423); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprogram_heading_block438); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:214:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:215:1: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:216:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list478);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list489); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:223:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:227:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:6: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list529); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:235:1: (kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:236:2: kw= Comma this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_ruleidentifier_list548); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list563); 

            	    		current.merge(this_IDENTIFIER_2);
            	        
            	     
            	        newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            	        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:256:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:257:1: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:258:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock610);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock621); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:265:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:269:6: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:270:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:270:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:271:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock668);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock695);
            this_statement_part_1=rulestatement_part();

            state._fsp--;


            		current.merge(this_statement_part_1);
                
             
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:300:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:301:1: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:302:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part740);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part751); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:309:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEGIN_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:313:6: ( (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:6: this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_BEGIN_KEYWORD_0=(Token)match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part791); 

            		current.merge(this_BEGIN_KEYWORD_0);
                
             
                newLeafNode(this_BEGIN_KEYWORD_0, grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part818);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulestatement_part838); 

            		current.merge(this_END_KEYWORD_2);
                
             
                newLeafNode(this_END_KEYWORD_2, grammarAccess.getStatement_partAccess().getEND_KEYWORDTerminalRuleCall_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:347:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:348:1: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:349:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence883);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence894); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:356:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:360:6: ( (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:361:1: (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:361:1: (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:362:5: this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence941);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:372:1: (kw= Semicolon this_statement_2= rulestatement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Semicolon) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:373:2: kw= Semicolon this_statement_2= rulestatement
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulestatement_sequence960); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence982);
            	    this_statement_2=rulestatement();

            	    state._fsp--;


            	    		current.merge(this_statement_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:397:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:398:1: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:399:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1029);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1040); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:406:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_0 = null;

        AntlrDatatypeRuleToken this_simple_statement_2 = null;

        AntlrDatatypeRuleToken this_structured_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:410:6: ( ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:411:1: ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:411:1: ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:411:2: (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:411:2: (this_label_0= rulelabel kw= Colon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INTEGER_NUMBER||LA4_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:412:5: this_label_0= rulelabel kw= Colon
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1088);
                    this_label_0=rulelabel();

                    state._fsp--;


                    		current.merge(this_label_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulestatement1106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:428:3: (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==Semicolon||LA5_0==RULE_END_KEYWORD||LA5_0==RULE_GOTO_KEYWORD||LA5_0==RULE_UNTIL_KEYWORD||LA5_0==RULE_ELSE_KEYWORD||LA5_0==RULE_IDENTIFIER) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BEGIN_KEYWORD||LA5_0==RULE_WHILE_KEYWORD||LA5_0==RULE_REPEAT_KEYWORD||LA5_0==RULE_FOR_KEYWORD||LA5_0==RULE_IF_KEYWORD||LA5_0==RULE_CASE_KEYWORD||LA5_0==RULE_WITH_KEYWORD) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:429:5: this_simple_statement_2= rulesimple_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1131);
                    this_simple_statement_2=rulesimple_statement();

                    state._fsp--;


                    		current.merge(this_simple_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:441:5: this_structured_statement_3= rulestructured_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement1164);
                    this_structured_statement_3=rulestructured_statement();

                    state._fsp--;


                    		current.merge(this_structured_statement_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:459:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:460:1: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:461:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1210);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1221); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:468:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_INTEGER_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:472:6: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:473:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:473:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INTEGER_NUMBER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:473:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1261); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getLabelAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:481:10: this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_1=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1287); 

                    		current.merge(this_INTEGER_NUMBER_1);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_1, grammarAccess.getLabelAccess().getINTEGER_NUMBERTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:496:1: entryRulesimple_statement returns [String current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final String entryRulesimple_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:497:1: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:498:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1332);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1343); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:505:1: rulesimple_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_IDENTIFIER_3= RULE_IDENTIFIER )? ;
    public final AntlrDatatypeRuleToken rulesimple_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_3=null;
        AntlrDatatypeRuleToken this_assignment_statement_0 = null;

        AntlrDatatypeRuleToken this_function_designator_1 = null;

        AntlrDatatypeRuleToken this_goto_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:509:6: ( (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_IDENTIFIER_3= RULE_IDENTIFIER )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:510:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_IDENTIFIER_3= RULE_IDENTIFIER )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:510:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_IDENTIFIER_3= RULE_IDENTIFIER )?
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                    case LeftParenthesis:
                        {
                        alt7=2;
                        }
                        break;
                    case EOF:
                    case Semicolon:
                    case RULE_END_KEYWORD:
                    case RULE_UNTIL_KEYWORD:
                    case RULE_ELSE_KEYWORD:
                        {
                        alt7=4;
                        }
                        break;
                    case ColonEqualsSign:
                    case LeftSquareBracket:
                        {
                        alt7=1;
                        }
                        break;
                }

            }
            else if ( (LA7_0==RULE_GOTO_KEYWORD) ) {
                alt7=3;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:511:5: this_assignment_statement_0= ruleassignment_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1390);
                    this_assignment_statement_0=ruleassignment_statement();

                    state._fsp--;


                    		current.merge(this_assignment_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:523:5: this_function_designator_1= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulesimple_statement1423);
                    this_function_designator_1=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:535:5: this_goto_statement_2= rulegoto_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement1456);
                    this_goto_statement_2=rulegoto_statement();

                    state._fsp--;


                    		current.merge(this_goto_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:546:10: this_IDENTIFIER_3= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulesimple_statement1482); 

                    		current.merge(this_IDENTIFIER_3);
                        
                     
                        newLeafNode(this_IDENTIFIER_3, grammarAccess.getSimple_statementAccess().getIDENTIFIERTerminalRuleCall_3()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:561:1: entryRuleassignment_statement returns [String current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final String entryRuleassignment_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:562:1: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:563:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1528);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1539); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:570:1: ruleassignment_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruleassignment_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:574:6: ( (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:575:1: (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:575:1: (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:576:5: this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression
            {
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1586);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,ColonEqualsSign,FOLLOW_ColonEqualsSign_in_ruleassignment_statement1604); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1626);
            this_expression_2=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_2);
                
             
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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:611:1: entryRulevariable returns [String current=null] : iv_rulevariable= rulevariable EOF ;
    public final String entryRulevariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:612:1: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:613:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1671);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1682); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:620:1: rulevariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_entire_variable_0= ruleentire_variable | this_component_variable_1= rulecomponent_variable ) ;
    public final AntlrDatatypeRuleToken rulevariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_entire_variable_0 = null;

        AntlrDatatypeRuleToken this_component_variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:624:6: ( (this_entire_variable_0= ruleentire_variable | this_component_variable_1= rulecomponent_variable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:625:1: (this_entire_variable_0= ruleentire_variable | this_component_variable_1= rulecomponent_variable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:625:1: (this_entire_variable_0= ruleentire_variable | this_component_variable_1= rulecomponent_variable )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_IDENTIFIER) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==LeftSquareBracket) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==ColonEqualsSign||(LA8_1>=RightParenthesis && LA8_1<=Comma)||LA8_1==Semicolon||LA8_1==RightSquareBracket||(LA8_1>=RULE_SIGNED_INTEGER_NUMBER && LA8_1<=RULE_SIGNED_REAL_NUMBER)||(LA8_1>=RULE_ADDITION_OPERATOR && LA8_1<=RULE_RELATIONAL_OPERATOR)||LA8_1==RULE_END_KEYWORD||LA8_1==RULE_OR_KEYWORD||LA8_1==RULE_DO_KEYWORD||LA8_1==RULE_UNTIL_KEYWORD||(LA8_1>=RULE_TO_KEYWORD && LA8_1<=RULE_DOWNTO_KEYWORD)||(LA8_1>=RULE_THEN_KEYWORD && LA8_1<=RULE_ELSE_KEYWORD)||LA8_1==RULE_OF_KEYWORD) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:626:5: this_entire_variable_0= ruleentire_variable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleentire_variable_in_rulevariable1729);
                    this_entire_variable_0=ruleentire_variable();

                    state._fsp--;


                    		current.merge(this_entire_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:638:5: this_component_variable_1= rulecomponent_variable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getComponent_variableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomponent_variable_in_rulevariable1762);
                    this_component_variable_1=rulecomponent_variable();

                    state._fsp--;


                    		current.merge(this_component_variable_1);
                        
                     
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleentire_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:656:1: entryRuleentire_variable returns [String current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final String entryRuleentire_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentire_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:657:1: (iv_ruleentire_variable= ruleentire_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:658:2: iv_ruleentire_variable= ruleentire_variable EOF
            {
             newCompositeNode(grammarAccess.getEntire_variableRule()); 
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable1807);
            iv_ruleentire_variable=ruleentire_variable();

            state._fsp--;

             current =iv_ruleentire_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable1818); 

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
    // $ANTLR end "entryRuleentire_variable"


    // $ANTLR start "ruleentire_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:665:1: ruleentire_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleentire_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:669:6: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:670:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable1857); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getEntire_variableAccess().getIDENTIFIERTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleentire_variable"


    // $ANTLR start "entryRulecomponent_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:685:1: entryRulecomponent_variable returns [String current=null] : iv_rulecomponent_variable= rulecomponent_variable EOF ;
    public final String entryRulecomponent_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:686:1: (iv_rulecomponent_variable= rulecomponent_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:687:2: iv_rulecomponent_variable= rulecomponent_variable EOF
            {
             newCompositeNode(grammarAccess.getComponent_variableRule()); 
            pushFollow(FOLLOW_rulecomponent_variable_in_entryRulecomponent_variable1901);
            iv_rulecomponent_variable=rulecomponent_variable();

            state._fsp--;

             current =iv_rulecomponent_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomponent_variable1912); 

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
    // $ANTLR end "entryRulecomponent_variable"


    // $ANTLR start "rulecomponent_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:694:1: rulecomponent_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_entire_variable_0= ruleentire_variable kw= LeftSquareBracket this_expression_list_2= ruleexpression_list kw= RightSquareBracket this_indexed_variable__4= ruleindexed_variable_ ) ;
    public final AntlrDatatypeRuleToken rulecomponent_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_entire_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_list_2 = null;

        AntlrDatatypeRuleToken this_indexed_variable__4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:698:6: ( (this_entire_variable_0= ruleentire_variable kw= LeftSquareBracket this_expression_list_2= ruleexpression_list kw= RightSquareBracket this_indexed_variable__4= ruleindexed_variable_ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:699:1: (this_entire_variable_0= ruleentire_variable kw= LeftSquareBracket this_expression_list_2= ruleexpression_list kw= RightSquareBracket this_indexed_variable__4= ruleindexed_variable_ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:699:1: (this_entire_variable_0= ruleentire_variable kw= LeftSquareBracket this_expression_list_2= ruleexpression_list kw= RightSquareBracket this_indexed_variable__4= ruleindexed_variable_ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:700:5: this_entire_variable_0= ruleentire_variable kw= LeftSquareBracket this_expression_list_2= ruleexpression_list kw= RightSquareBracket this_indexed_variable__4= ruleindexed_variable_
            {
             
                    newCompositeNode(grammarAccess.getComponent_variableAccess().getEntire_variableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleentire_variable_in_rulecomponent_variable1959);
            this_entire_variable_0=ruleentire_variable();

            state._fsp--;


            		current.merge(this_entire_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulecomponent_variable1977); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComponent_variableAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getComponent_variableAccess().getExpression_listParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_list_in_rulecomponent_variable1999);
            this_expression_list_2=ruleexpression_list();

            state._fsp--;


            		current.merge(this_expression_list_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulecomponent_variable2017); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComponent_variableAccess().getRightSquareBracketKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getComponent_variableAccess().getIndexed_variable_ParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleindexed_variable__in_rulecomponent_variable2039);
            this_indexed_variable__4=ruleindexed_variable_();

            state._fsp--;


            		current.merge(this_indexed_variable__4);
                
             
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
    // $ANTLR end "rulecomponent_variable"


    // $ANTLR start "entryRuleindexed_variable_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:752:1: entryRuleindexed_variable_ returns [String current=null] : iv_ruleindexed_variable_= ruleindexed_variable_ EOF ;
    public final String entryRuleindexed_variable_() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindexed_variable_ = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:753:1: (iv_ruleindexed_variable_= ruleindexed_variable_ EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:754:2: iv_ruleindexed_variable_= ruleindexed_variable_ EOF
            {
             newCompositeNode(grammarAccess.getIndexed_variable_Rule()); 
            pushFollow(FOLLOW_ruleindexed_variable__in_entryRuleindexed_variable_2084);
            iv_ruleindexed_variable_=ruleindexed_variable_();

            state._fsp--;

             current =iv_ruleindexed_variable_.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindexed_variable_2095); 

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
    // $ANTLR end "entryRuleindexed_variable_"


    // $ANTLR start "ruleindexed_variable_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:761:1: ruleindexed_variable_ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_indexed_variable__3= ruleindexed_variable_ )? ;
    public final AntlrDatatypeRuleToken ruleindexed_variable_() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_1 = null;

        AntlrDatatypeRuleToken this_indexed_variable__3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:765:6: ( (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_indexed_variable__3= ruleindexed_variable_ )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:766:1: (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_indexed_variable__3= ruleindexed_variable_ )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:766:1: (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_indexed_variable__3= ruleindexed_variable_ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:767:2: kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_indexed_variable__3= ruleindexed_variable_
                    {
                    kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleindexed_variable_2133); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIndexed_variable_Access().getLeftSquareBracketKeyword_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIndexed_variable_Access().getExpression_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleindexed_variable_2155);
                    this_expression_list_1=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleindexed_variable_2173); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIndexed_variable_Access().getRightSquareBracketKeyword_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getIndexed_variable_Access().getIndexed_variable_ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleindexed_variable__in_ruleindexed_variable_2195);
                    this_indexed_variable__3=ruleindexed_variable_();

                    state._fsp--;


                    		current.merge(this_indexed_variable__3);
                        
                     
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
    // $ANTLR end "ruleindexed_variable_"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:808:1: entryRuleexpression_list returns [String current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final String entryRuleexpression_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:809:1: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:810:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list2241);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list2252); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:817:1: ruleexpression_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpression_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:821:6: ( (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:822:1: (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:822:1: (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:823:5: this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )*
            {
             
                    newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2299);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:833:1: (kw= Comma this_expression_2= ruleexpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:834:2: kw= Comma this_expression_2= ruleexpression
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_ruleexpression_list2318); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2340);
            	    this_expression_2=ruleexpression();

            	    state._fsp--;


            	    		current.merge(this_expression_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:858:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:859:1: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:860:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2387);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2398); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:867:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RELATIONAL_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_simple_expression_0 = null;

        AntlrDatatypeRuleToken this_simple_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:871:6: ( (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:872:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:872:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:873:5: this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2445);
            this_simple_expression_0=rulesimple_expression();

            state._fsp--;


            		current.merge(this_simple_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:883:1: (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_RELATIONAL_OPERATOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:883:6: this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression
                    {
                    this_RELATIONAL_OPERATOR_1=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2466); 

                    		current.merge(this_RELATIONAL_OPERATOR_1);
                        
                     
                        newLeafNode(this_RELATIONAL_OPERATOR_1, grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2493);
                    this_simple_expression_2=rulesimple_expression();

                    state._fsp--;


                    		current.merge(this_simple_expression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:909:1: entryRulesimple_expression returns [String current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final String entryRulesimple_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:910:1: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:911:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2540);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2551); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:918:1: rulesimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) ;
    public final AntlrDatatypeRuleToken rulesimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_0=null;
        Token this_ADDITION_OPERATOR_2=null;
        Token this_OR_KEYWORD_3=null;
        AntlrDatatypeRuleToken this_term_1 = null;

        AntlrDatatypeRuleToken this_term_4 = null;

        AntlrDatatypeRuleToken this_signed_number_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:922:6: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ADDITION_OPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:923:7: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                    {
                    this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2592); 

                    		current.merge(this_ADDITION_OPERATOR_0);
                        
                     
                        newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2621);
            this_term_1=ruleterm();

            state._fsp--;


            		current.merge(this_term_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:1: ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ADDITION_OPERATOR||LA15_0==RULE_OR_KEYWORD) ) {
                    alt15=1;
                }
                else if ( ((LA15_0>=RULE_SIGNED_INTEGER_NUMBER && LA15_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ADDITION_OPERATOR) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RULE_OR_KEYWORD) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
            	            int cnt13=0;
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==RULE_ADDITION_OPERATOR) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:9: this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR
            	            	    {
            	            	    this_ADDITION_OPERATOR_2=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2645); 

            	            	    		current.merge(this_ADDITION_OPERATOR_2);
            	            	        
            	            	     
            	            	        newLeafNode(this_ADDITION_OPERATOR_2, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
            	            	        

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
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:949:10: this_OR_KEYWORD_3= RULE_OR_KEYWORD
            	            {
            	            this_OR_KEYWORD_3=(Token)match(input,RULE_OR_KEYWORD,FOLLOW_RULE_OR_KEYWORD_in_rulesimple_expression2673); 

            	            		current.merge(this_OR_KEYWORD_3);
            	                
            	             
            	                newLeafNode(this_OR_KEYWORD_3, grammarAccess.getSimple_expressionAccess().getOR_KEYWORDTerminalRuleCall_2_0_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2701);
            	    this_term_4=ruleterm();

            	    state._fsp--;


            	    		current.merge(this_term_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:969:5: this_signed_number_5= rulesigned_number
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulesigned_number_in_rulesimple_expression2735);
            	    this_signed_number_5=rulesigned_number();

            	    state._fsp--;


            	    		current.merge(this_signed_number_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:987:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:988:1: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:989:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2782);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2793); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:996:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTIPLICATION_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_factor_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1000:6: ( (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1001:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1001:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1002:5: this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefactor_in_ruleterm2840);
            this_factor_0=rulefactor();

            state._fsp--;


            		current.merge(this_factor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1012:1: (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1012:6: this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor
            	    {
            	    this_MULTIPLICATION_OPERATOR_1=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2861); 

            	    		current.merge(this_MULTIPLICATION_OPERATOR_1);
            	        
            	     
            	        newLeafNode(this_MULTIPLICATION_OPERATOR_1, grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2888);
            	    this_factor_2=rulefactor();

            	    state._fsp--;


            	    		current.merge(this_factor_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1038:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1039:1: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1040:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2935);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2946); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1047:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor ) ) ;
    public final AntlrDatatypeRuleToken rulefactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_NIL_KEYWORD_4=null;
        Token this_TRUE_KEYWORD_5=null;
        Token this_FALSE_KEYWORD_6=null;
        Token kw=null;
        Token this_NOT_KEYWORD_11=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_number_1 = null;

        AntlrDatatypeRuleToken this_set_3 = null;

        AntlrDatatypeRuleToken this_function_designator_7 = null;

        AntlrDatatypeRuleToken this_expression_9 = null;

        AntlrDatatypeRuleToken this_factor_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1051:6: ( (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor ) )
            int alt17=10;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1053:5: this_variable_0= rulevariable
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2993);
                    this_variable_0=rulevariable();

                    state._fsp--;


                    		current.merge(this_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1065:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor3026);
                    this_number_1=rulenumber();

                    state._fsp--;


                    		current.merge(this_number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor3052); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1085:5: this_set_3= ruleset
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_in_rulefactor3085);
                    this_set_3=ruleset();

                    state._fsp--;


                    		current.merge(this_set_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1096:10: this_NIL_KEYWORD_4= RULE_NIL_KEYWORD
                    {
                    this_NIL_KEYWORD_4=(Token)match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rulefactor3111); 

                    		current.merge(this_NIL_KEYWORD_4);
                        
                     
                        newLeafNode(this_NIL_KEYWORD_4, grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1104:10: this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD
                    {
                    this_TRUE_KEYWORD_5=(Token)match(input,RULE_TRUE_KEYWORD,FOLLOW_RULE_TRUE_KEYWORD_in_rulefactor3137); 

                    		current.merge(this_TRUE_KEYWORD_5);
                        
                     
                        newLeafNode(this_TRUE_KEYWORD_5, grammarAccess.getFactorAccess().getTRUE_KEYWORDTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1112:10: this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD
                    {
                    this_FALSE_KEYWORD_6=(Token)match(input,RULE_FALSE_KEYWORD,FOLLOW_RULE_FALSE_KEYWORD_in_rulefactor3163); 

                    		current.merge(this_FALSE_KEYWORD_6);
                        
                     
                        newLeafNode(this_FALSE_KEYWORD_6, grammarAccess.getFactorAccess().getFALSE_KEYWORDTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1121:5: this_function_designator_7= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor3196);
                    this_function_designator_7=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:6: (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:6: (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1133:2: kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis
                    {
                    kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefactor3221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_8_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor3243);
                    this_expression_9=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefactor3261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1156:6: (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1156:6: (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1156:11: this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor
                    {
                    this_NOT_KEYWORD_11=(Token)match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rulefactor3284); 

                    		current.merge(this_NOT_KEYWORD_11);
                        
                     
                        newLeafNode(this_NOT_KEYWORD_11, grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_9_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3311);
                    this_factor_12=rulefactor();

                    state._fsp--;


                    		current.merge(this_factor_12);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1182:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1183:1: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1184:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3357);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3368); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1191:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unsigned_number_0 = null;

        AntlrDatatypeRuleToken this_signed_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1195:6: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1196:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1196:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_INTEGER_NUMBER && LA18_0<=RULE_REAL_NUMBER)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_SIGNED_INTEGER_NUMBER && LA18_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1197:5: this_unsigned_number_0= ruleunsigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunsigned_number_in_rulenumber3415);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    		current.merge(this_unsigned_number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1209:5: this_signed_number_1= rulesigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesigned_number_in_rulenumber3448);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    		current.merge(this_signed_number_1);
                        
                     
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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1227:1: entryRuleunsigned_number returns [String current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final String entryRuleunsigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1228:1: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1229:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3493);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3504); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1236:1: ruleunsigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;
        Token this_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1240:6: ( (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1241:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1241:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INTEGER_NUMBER) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_REAL_NUMBER) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1241:6: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3544); 

                    		current.merge(this_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1249:10: this_REAL_NUMBER_1= RULE_REAL_NUMBER
                    {
                    this_REAL_NUMBER_1=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3570); 

                    		current.merge(this_REAL_NUMBER_1);
                        
                     
                        newLeafNode(this_REAL_NUMBER_1, grammarAccess.getUnsigned_numberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1264:1: entryRulesigned_number returns [String current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final String entryRulesigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1265:1: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3615);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3626); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1273:1: rulesigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulesigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_SIGNED_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1277:6: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1278:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1278:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1278:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3666); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:10: this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER
                    {
                    this_SIGNED_REAL_NUMBER_1=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3692); 

                    		current.merge(this_SIGNED_REAL_NUMBER_1);
                        
                     
                        newLeafNode(this_SIGNED_REAL_NUMBER_1, grammarAccess.getSigned_numberAccess().getSIGNED_REAL_NUMBERTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1301:1: entryRuleset returns [String current=null] : iv_ruleset= ruleset EOF ;
    public final String entryRuleset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1302:1: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1303:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3737);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3748); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1310:1: ruleset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1314:6: ( (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1315:1: (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1315:1: (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1316:2: kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleset3786); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1321:1: (this_expression_list_1= ruleexpression_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftParenthesis||LA21_0==LeftSquareBracket||(LA21_0>=RULE_INTEGER_NUMBER && LA21_0<=RULE_SIGNED_REAL_NUMBER)||LA21_0==RULE_ADDITION_OPERATOR||(LA21_0>=RULE_NIL_KEYWORD && LA21_0<=RULE_NOT_KEYWORD)||(LA21_0>=RULE_TRUE_KEYWORD && LA21_0<=RULE_FALSE_KEYWORD)||LA21_0==RULE_IDENTIFIER||LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1322:5: this_expression_list_1= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3809);
                    this_expression_list_1=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleset3829); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSetAccess().getRightSquareBracketKeyword_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1346:1: entryRulefunction_designator returns [String current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final String entryRulefunction_designator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1347:1: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1348:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3869);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3880); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1355:1: rulefunction_designator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken rulefunction_designator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1359:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1360:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1360:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1360:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3920); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefunction_designator3938); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1373:1: (this_expression_list_2= ruleexpression_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftParenthesis||LA22_0==LeftSquareBracket||(LA22_0>=RULE_INTEGER_NUMBER && LA22_0<=RULE_SIGNED_REAL_NUMBER)||LA22_0==RULE_ADDITION_OPERATOR||(LA22_0>=RULE_NIL_KEYWORD && LA22_0<=RULE_NOT_KEYWORD)||(LA22_0>=RULE_TRUE_KEYWORD && LA22_0<=RULE_FALSE_KEYWORD)||LA22_0==RULE_IDENTIFIER||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1374:5: this_expression_list_2= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3961);
                    this_expression_list_2=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefunction_designator3981); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1398:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1399:1: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1400:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement4021);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement4032); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1407:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_statement_0 = null;

        AntlrDatatypeRuleToken this_repetitive_statement_1 = null;

        AntlrDatatypeRuleToken this_conditional_statement_2 = null;

        AntlrDatatypeRuleToken this_with_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1411:6: ( (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1412:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1412:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_BEGIN_KEYWORD:
                {
                alt23=1;
                }
                break;
            case RULE_WHILE_KEYWORD:
            case RULE_REPEAT_KEYWORD:
            case RULE_FOR_KEYWORD:
                {
                alt23=2;
                }
                break;
            case RULE_IF_KEYWORD:
            case RULE_CASE_KEYWORD:
                {
                alt23=3;
                }
                break;
            case RULE_WITH_KEYWORD:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1413:5: this_compound_statement_0= rulecompound_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement4079);
                    this_compound_statement_0=rulecompound_statement();

                    state._fsp--;


                    		current.merge(this_compound_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1425:5: this_repetitive_statement_1= rulerepetitive_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement4112);
                    this_repetitive_statement_1=rulerepetitive_statement();

                    state._fsp--;


                    		current.merge(this_repetitive_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1437:5: this_conditional_statement_2= ruleconditional_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement4145);
                    this_conditional_statement_2=ruleconditional_statement();

                    state._fsp--;


                    		current.merge(this_conditional_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1449:5: this_with_statement_3= rulewith_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement4178);
                    this_with_statement_3=rulewith_statement();

                    state._fsp--;


                    		current.merge(this_with_statement_3);
                        
                     
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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1467:1: entryRulecompound_statement returns [String current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final String entryRulecompound_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1468:1: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1469:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement4223);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement4234); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1476:1: rulecompound_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulecompound_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEGIN_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1480:6: ( (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1481:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1481:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1481:6: this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_BEGIN_KEYWORD_0=(Token)match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rulecompound_statement4274); 

            		current.merge(this_BEGIN_KEYWORD_0);
                
             
                newLeafNode(this_BEGIN_KEYWORD_0, grammarAccess.getCompound_statementAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4301);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulecompound_statement4321); 

            		current.merge(this_END_KEYWORD_2);
                
             
                newLeafNode(this_END_KEYWORD_2, grammarAccess.getCompound_statementAccess().getEND_KEYWORDTerminalRuleCall_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1514:1: entryRulerepetitive_statement returns [String current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final String entryRulerepetitive_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1515:1: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1516:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4366);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4377); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1523:1: rulerepetitive_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) ;
    public final AntlrDatatypeRuleToken rulerepetitive_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_while_statement_0 = null;

        AntlrDatatypeRuleToken this_repeat_statement_1 = null;

        AntlrDatatypeRuleToken this_for_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1527:6: ( (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1528:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1528:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_WHILE_KEYWORD:
                {
                alt24=1;
                }
                break;
            case RULE_REPEAT_KEYWORD:
                {
                alt24=2;
                }
                break;
            case RULE_FOR_KEYWORD:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1529:5: this_while_statement_0= rulewhile_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4424);
                    this_while_statement_0=rulewhile_statement();

                    state._fsp--;


                    		current.merge(this_while_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1541:5: this_repeat_statement_1= rulerepeat_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4457);
                    this_repeat_statement_1=rulerepeat_statement();

                    state._fsp--;


                    		current.merge(this_repeat_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1553:5: this_for_statement_2= rulefor_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4490);
                    this_for_statement_2=rulefor_statement();

                    state._fsp--;


                    		current.merge(this_for_statement_2);
                        
                     
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
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1571:1: entryRulewhile_statement returns [String current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final String entryRulewhile_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1572:1: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1573:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4535);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4546); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1580:1: rulewhile_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewhile_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHILE_KEYWORD_0=null;
        Token this_DO_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1584:6: ( (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1585:1: (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1585:1: (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1585:6: this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement
            {
            this_WHILE_KEYWORD_0=(Token)match(input,RULE_WHILE_KEYWORD,FOLLOW_RULE_WHILE_KEYWORD_in_rulewhile_statement4586); 

            		current.merge(this_WHILE_KEYWORD_0);
                
             
                newLeafNode(this_WHILE_KEYWORD_0, grammarAccess.getWhile_statementAccess().getWHILE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4613);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_DO_KEYWORD_2=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulewhile_statement4633); 

            		current.merge(this_DO_KEYWORD_2);
                
             
                newLeafNode(this_DO_KEYWORD_2, grammarAccess.getWhile_statementAccess().getDO_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4660);
            this_statement_3=rulestatement();

            state._fsp--;


            		current.merge(this_statement_3);
                
             
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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1629:1: entryRulerepeat_statement returns [String current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final String entryRulerepeat_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1630:1: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1631:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4705);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4716); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1638:1: rulerepeat_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerepeat_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REPEAT_KEYWORD_0=null;
        Token this_UNTIL_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1642:6: ( (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1643:1: (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1643:1: (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1643:6: this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression
            {
            this_REPEAT_KEYWORD_0=(Token)match(input,RULE_REPEAT_KEYWORD,FOLLOW_RULE_REPEAT_KEYWORD_in_rulerepeat_statement4756); 

            		current.merge(this_REPEAT_KEYWORD_0);
                
             
                newLeafNode(this_REPEAT_KEYWORD_0, grammarAccess.getRepeat_statementAccess().getREPEAT_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4783);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_UNTIL_KEYWORD_2=(Token)match(input,RULE_UNTIL_KEYWORD,FOLLOW_RULE_UNTIL_KEYWORD_in_rulerepeat_statement4803); 

            		current.merge(this_UNTIL_KEYWORD_2);
                
             
                newLeafNode(this_UNTIL_KEYWORD_2, grammarAccess.getRepeat_statementAccess().getUNTIL_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4830);
            this_expression_3=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_3);
                
             
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
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1687:1: entryRulefor_statement returns [String current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final String entryRulefor_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1688:1: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1689:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4875);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4886); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1696:1: rulefor_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulefor_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FOR_KEYWORD_0=null;
        Token this_TO_KEYWORD_2=null;
        Token this_DOWNTO_KEYWORD_3=null;
        Token this_DO_KEYWORD_5=null;
        AntlrDatatypeRuleToken this_assignment_statement_1 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1700:6: ( (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1701:1: (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1701:1: (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1701:6: this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement
            {
            this_FOR_KEYWORD_0=(Token)match(input,RULE_FOR_KEYWORD,FOLLOW_RULE_FOR_KEYWORD_in_rulefor_statement4926); 

            		current.merge(this_FOR_KEYWORD_0);
                
             
                newLeafNode(this_FOR_KEYWORD_0, grammarAccess.getFor_statementAccess().getFOR_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4953);
            this_assignment_statement_1=ruleassignment_statement();

            state._fsp--;


            		current.merge(this_assignment_statement_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1719:1: (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_TO_KEYWORD) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_DOWNTO_KEYWORD) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1719:6: this_TO_KEYWORD_2= RULE_TO_KEYWORD
                    {
                    this_TO_KEYWORD_2=(Token)match(input,RULE_TO_KEYWORD,FOLLOW_RULE_TO_KEYWORD_in_rulefor_statement4974); 

                    		current.merge(this_TO_KEYWORD_2);
                        
                     
                        newLeafNode(this_TO_KEYWORD_2, grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1727:10: this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD
                    {
                    this_DOWNTO_KEYWORD_3=(Token)match(input,RULE_DOWNTO_KEYWORD,FOLLOW_RULE_DOWNTO_KEYWORD_in_rulefor_statement5000); 

                    		current.merge(this_DOWNTO_KEYWORD_3);
                        
                     
                        newLeafNode(this_DOWNTO_KEYWORD_3, grammarAccess.getFor_statementAccess().getDOWNTO_KEYWORDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement5028);
            this_expression_4=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_4);
                
             
                    afterParserOrEnumRuleCall();
                
            this_DO_KEYWORD_5=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulefor_statement5048); 

            		current.merge(this_DO_KEYWORD_5);
                
             
                newLeafNode(this_DO_KEYWORD_5, grammarAccess.getFor_statementAccess().getDO_KEYWORDTerminalRuleCall_4()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement5075);
            this_statement_6=rulestatement();

            state._fsp--;


            		current.merge(this_statement_6);
                
             
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
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1771:1: entryRuleconditional_statement returns [String current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final String entryRuleconditional_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1772:1: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1773:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement5120);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement5131); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1780:1: ruleconditional_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) ;
    public final AntlrDatatypeRuleToken ruleconditional_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_if_statement_0 = null;

        AntlrDatatypeRuleToken this_case_statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1784:6: ( (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1785:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1785:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IF_KEYWORD) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_CASE_KEYWORD) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1786:5: this_if_statement_0= ruleif_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getIf_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement5178);
                    this_if_statement_0=ruleif_statement();

                    state._fsp--;


                    		current.merge(this_if_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1798:5: this_case_statement_1= rulecase_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getCase_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement5211);
                    this_case_statement_1=rulecase_statement();

                    state._fsp--;


                    		current.merge(this_case_statement_1);
                        
                     
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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1816:1: entryRuleif_statement returns [String current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final String entryRuleif_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1817:1: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1818:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement5256);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement5267); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1825:1: ruleif_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? ) ;
    public final AntlrDatatypeRuleToken ruleif_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IF_KEYWORD_0=null;
        Token this_THEN_KEYWORD_2=null;
        Token this_ELSE_KEYWORD_4=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_3 = null;

        AntlrDatatypeRuleToken this_statement_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1829:6: ( (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1830:1: (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1830:1: (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1830:6: this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )?
            {
            this_IF_KEYWORD_0=(Token)match(input,RULE_IF_KEYWORD,FOLLOW_RULE_IF_KEYWORD_in_ruleif_statement5307); 

            		current.merge(this_IF_KEYWORD_0);
                
             
                newLeafNode(this_IF_KEYWORD_0, grammarAccess.getIf_statementAccess().getIF_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5334);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_THEN_KEYWORD_2=(Token)match(input,RULE_THEN_KEYWORD,FOLLOW_RULE_THEN_KEYWORD_in_ruleif_statement5354); 

            		current.merge(this_THEN_KEYWORD_2);
                
             
                newLeafNode(this_THEN_KEYWORD_2, grammarAccess.getIf_statementAccess().getTHEN_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5381);
            this_statement_3=rulestatement();

            state._fsp--;


            		current.merge(this_statement_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1866:1: (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ELSE_KEYWORD) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1866:6: this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement
                    {
                    this_ELSE_KEYWORD_4=(Token)match(input,RULE_ELSE_KEYWORD,FOLLOW_RULE_ELSE_KEYWORD_in_ruleif_statement5402); 

                    		current.merge(this_ELSE_KEYWORD_4);
                        
                     
                        newLeafNode(this_ELSE_KEYWORD_4, grammarAccess.getIf_statementAccess().getELSE_KEYWORDTerminalRuleCall_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5429);
                    this_statement_5=rulestatement();

                    state._fsp--;


                    		current.merge(this_statement_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1892:1: entryRulecase_statement returns [String current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final String entryRulecase_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1893:1: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1894:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5476);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5487); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:1: rulecase_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? this_END_KEYWORD_7= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulecase_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_KEYWORD_0=null;
        Token this_OF_KEYWORD_2=null;
        Token kw=null;
        Token this_END_KEYWORD_7=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_case_limb_3 = null;

        AntlrDatatypeRuleToken this_case_limb_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1905:6: ( (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? this_END_KEYWORD_7= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1906:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? this_END_KEYWORD_7= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1906:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? this_END_KEYWORD_7= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1906:6: this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? this_END_KEYWORD_7= RULE_END_KEYWORD
            {
            this_CASE_KEYWORD_0=(Token)match(input,RULE_CASE_KEYWORD,FOLLOW_RULE_CASE_KEYWORD_in_rulecase_statement5527); 

            		current.merge(this_CASE_KEYWORD_0);
                
             
                newLeafNode(this_CASE_KEYWORD_0, grammarAccess.getCase_statementAccess().getCASE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement5554);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_OF_KEYWORD_2=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulecase_statement5574); 

            		current.merge(this_OF_KEYWORD_2);
                
             
                newLeafNode(this_OF_KEYWORD_2, grammarAccess.getCase_statementAccess().getOF_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5601);
            this_case_limb_3=rulecase_limb();

            state._fsp--;


            		current.merge(this_case_limb_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1942:1: (kw= Semicolon this_case_limb_5= rulecase_limb )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Semicolon) ) {
                    int LA28_1 = input.LA(2);

                    if ( ((LA28_1>=RULE_INTEGER_NUMBER && LA28_1<=RULE_SIGNED_REAL_NUMBER)||LA28_1==RULE_ADDITION_OPERATOR||LA28_1==RULE_IDENTIFIER||LA28_1==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1943:2: kw= Semicolon this_case_limb_5= rulecase_limb
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5620); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_4_1()); 
            	        
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5642);
            	    this_case_limb_5=rulecase_limb();

            	    state._fsp--;


            	    		current.merge(this_case_limb_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1959:3: (kw= Semicolon )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Semicolon) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1960:2: kw= Semicolon
                    {
                    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 
                        

                    }
                    break;

            }

            this_END_KEYWORD_7=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulecase_statement5680); 

            		current.merge(this_END_KEYWORD_7);
                
             
                newLeafNode(this_END_KEYWORD_7, grammarAccess.getCase_statementAccess().getEND_KEYWORDTerminalRuleCall_6()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1980:1: entryRulecase_limb returns [String current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final String entryRulecase_limb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1981:1: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1982:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5725);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5736); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1989:1: rulecase_limb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulecase_limb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1993:6: ( (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1994:1: (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1994:1: (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1995:5: this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement
            {
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5783);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulecase_limb5801); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_limbAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5823);
            this_statement_2=rulestatement();

            state._fsp--;


            		current.merge(this_statement_2);
                
             
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
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2030:1: entryRulecase_label_list returns [String current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final String entryRulecase_label_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2031:1: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2032:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5868);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5879); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2039:1: rulecase_label_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* ) ;
    public final AntlrDatatypeRuleToken rulecase_label_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2043:6: ( (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2044:1: (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2044:1: (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2045:5: this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )*
            {
             
                    newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5926);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2055:1: (kw= Comma this_constant_2= ruleconstant )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2056:2: kw= Comma this_constant_2= ruleconstant
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulecase_label_list5945); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5967);
            	    this_constant_2=ruleconstant();

            	    state._fsp--;


            	    		current.merge(this_constant_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2080:1: entryRuleconstant returns [String current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final String entryRuleconstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2081:1: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2082:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant6014);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant6025); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2089:1: ruleconstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleconstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_0=null;
        Token this_IDENTIFIER_1=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_number_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2093:6: ( ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_INTEGER_NUMBER && LA33_0<=RULE_SIGNED_REAL_NUMBER)||LA33_0==RULE_ADDITION_OPERATOR||LA33_0==RULE_IDENTIFIER) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ADDITION_OPERATOR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2094:8: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                            {
                            this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant6067); 

                            		current.merge(this_ADDITION_OPERATOR_0);
                                
                             
                                newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getConstantAccess().getADDITION_OPERATORTerminalRuleCall_0_0()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2101:3: (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_IDENTIFIER) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=RULE_INTEGER_NUMBER && LA32_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2101:8: this_IDENTIFIER_1= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant6090); 

                            		current.merge(this_IDENTIFIER_1);
                                
                             
                                newLeafNode(this_IDENTIFIER_1, grammarAccess.getConstantAccess().getIDENTIFIERTerminalRuleCall_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2110:5: this_number_2= rulenumber
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant6123);
                            this_number_2=rulenumber();

                            state._fsp--;


                            		current.merge(this_number_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2121:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant6151); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2136:1: entryRulewith_statement returns [String current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final String entryRulewith_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2137:1: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2138:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement6196);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement6207); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2145:1: rulewith_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewith_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WITH_KEYWORD_0=null;
        Token kw=null;
        Token this_DO_KEYWORD_4=null;
        AntlrDatatypeRuleToken this_variable_1 = null;

        AntlrDatatypeRuleToken this_variable_3 = null;

        AntlrDatatypeRuleToken this_statement_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2149:6: ( (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2150:1: (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2150:1: (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2150:6: this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement
            {
            this_WITH_KEYWORD_0=(Token)match(input,RULE_WITH_KEYWORD,FOLLOW_RULE_WITH_KEYWORD_in_rulewith_statement6247); 

            		current.merge(this_WITH_KEYWORD_0);
                
             
                newLeafNode(this_WITH_KEYWORD_0, grammarAccess.getWith_statementAccess().getWITH_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement6274);
            this_variable_1=rulevariable();

            state._fsp--;


            		current.merge(this_variable_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2168:1: (kw= Comma this_variable_3= rulevariable )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2169:2: kw= Comma this_variable_3= rulevariable
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulewith_statement6293); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement6315);
            	    this_variable_3=rulevariable();

            	    state._fsp--;


            	    		current.merge(this_variable_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            this_DO_KEYWORD_4=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulewith_statement6337); 

            		current.merge(this_DO_KEYWORD_4);
                
             
                newLeafNode(this_DO_KEYWORD_4, grammarAccess.getWith_statementAccess().getDO_KEYWORDTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement6364);
            this_statement_5=rulestatement();

            state._fsp--;


            		current.merge(this_statement_5);
                
             
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
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2211:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2212:1: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2213:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement6409);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement6420); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2220:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel ) ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GOTO_KEYWORD_0=null;
        AntlrDatatypeRuleToken this_label_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2224:6: ( (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2225:1: (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2225:1: (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2225:6: this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel
            {
            this_GOTO_KEYWORD_0=(Token)match(input,RULE_GOTO_KEYWORD,FOLLOW_RULE_GOTO_KEYWORD_in_rulegoto_statement6460); 

            		current.merge(this_GOTO_KEYWORD_0);
                
             
                newLeafNode(this_GOTO_KEYWORD_0, grammarAccess.getGoto_statementAccess().getGOTO_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement6487);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
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
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2251:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2252:1: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2253:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6532);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part6543); 

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
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2260:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_constant_definition_part_1 = null;

        AntlrDatatypeRuleToken this_type_definition_part_2 = null;

        AntlrDatatypeRuleToken this_variable_declaration_part_3 = null;

        AntlrDatatypeRuleToken this_procedure_and_function_declaration_part_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2264:6: ( ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2265:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2265:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2265:2: (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2265:2: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LABEL_KEYWORD) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2266:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6591);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2276:3: (this_constant_definition_part_1= ruleconstant_definition_part )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_CONST_KEYWORD) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2277:5: this_constant_definition_part_1= ruleconstant_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6621);
                    this_constant_definition_part_1=ruleconstant_definition_part();

                    state._fsp--;


                    		current.merge(this_constant_definition_part_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2287:3: (this_type_definition_part_2= ruletype_definition_part )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_TYPE_KEYWORD) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2288:5: this_type_definition_part_2= ruletype_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruledeclaration_part6651);
                    this_type_definition_part_2=ruletype_definition_part();

                    state._fsp--;


                    		current.merge(this_type_definition_part_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2298:3: (this_variable_declaration_part_3= rulevariable_declaration_part )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_VAR_KEYWORD) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2299:5: this_variable_declaration_part_3= rulevariable_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part6681);
                    this_variable_declaration_part_3=rulevariable_declaration_part();

                    state._fsp--;


                    		current.merge(this_variable_declaration_part_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part6710);
            this_procedure_and_function_declaration_part_4=ruleprocedure_and_function_declaration_part();

            state._fsp--;


            		current.merge(this_procedure_and_function_declaration_part_4);
                
             
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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2328:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2329:1: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2330:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6755);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part6766); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2337:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LABEL_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2341:6: ( (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2342:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2342:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2342:6: this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon
            {
            this_LABEL_KEYWORD_0=(Token)match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part6806); 

            		current.merge(this_LABEL_KEYWORD_0);
                
             
                newLeafNode(this_LABEL_KEYWORD_0, grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6833);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2360:1: (kw= Comma this_label_3= rulelabel )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Comma) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2361:2: kw= Comma this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulelabel_declaration_part6852); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6874);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulelabel_declaration_part6894); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2391:1: entryRuleconstant_definition_part returns [String current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final String entryRuleconstant_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2392:1: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2393:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6934);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6945); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2400:1: ruleconstant_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2404:6: ( (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2405:1: (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2405:1: (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2405:6: this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+
            {
            this_CONST_KEYWORD_0=(Token)match(input,RULE_CONST_KEYWORD,FOLLOW_RULE_CONST_KEYWORD_in_ruleconstant_definition_part6985); 

            		current.merge(this_CONST_KEYWORD_0);
                
             
                newLeafNode(this_CONST_KEYWORD_0, grammarAccess.getConstant_definition_partAccess().getCONST_KEYWORDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2412:1: (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_IDENTIFIER) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2413:5: this_constant_definition_1= ruleconstant_definition kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part7013);
            	    this_constant_definition_1=ruleconstant_definition();

            	    state._fsp--;


            	    		current.merge(this_constant_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleconstant_definition_part7031); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2437:1: entryRuleconstant_definition returns [String current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final String entryRuleconstant_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2438:1: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2439:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition7073);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition7084); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2446:1: ruleconstant_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_constant_2= ruleconstant ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2450:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_constant_2= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2451:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2451:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_constant_2= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2451:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_constant_2= ruleconstant
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition7124); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleconstant_definition7142); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition7164);
            this_constant_2=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_2);
                
             
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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2483:1: entryRuletype_definition_part returns [String current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final String entryRuletype_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2484:1: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2485:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part7209);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part7220); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2492:1: ruletype_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= Semicolon )+ ) ;
    public final AntlrDatatypeRuleToken ruletype_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2496:6: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2497:1: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2497:1: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2497:6: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= Semicolon )+
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FOLLOW_RULE_TYPE_KEYWORD_in_ruletype_definition_part7260); 

            		current.merge(this_TYPE_KEYWORD_0);
                
             
                newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getType_definition_partAccess().getTYPE_KEYWORDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2504:1: (this_type_definition_1= ruletype_definition kw= Semicolon )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_IDENTIFIER) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2505:5: this_type_definition_1= ruletype_definition kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part7288);
            	    this_type_definition_1=ruletype_definition();

            	    state._fsp--;


            	    		current.merge(this_type_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruletype_definition_part7306); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2529:1: entryRuletype_definition returns [String current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final String entryRuletype_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2530:1: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2531:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition7348);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition7359); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2538:1: ruletype_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletype_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2542:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2543:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2543:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2543:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= EqualsSign this_type_2= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_definition7399); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruletype_definition7417); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruletype_definition7439);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2575:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2576:1: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2577:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype7484);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype7495); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2584:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_IDENTIFIER_3= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_3=null;
        AntlrDatatypeRuleToken this_simple_type_0 = null;

        AntlrDatatypeRuleToken this_structured_type_1 = null;

        AntlrDatatypeRuleToken this_pointer_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2588:6: ( (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_IDENTIFIER_3= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2589:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_IDENTIFIER_3= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2589:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type | this_IDENTIFIER_3= RULE_IDENTIFIER )
            int alt42=4;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
                {
                alt42=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==EOF||LA42_2==RightParenthesis||LA42_2==Semicolon||LA42_2==RULE_END_KEYWORD) ) {
                    alt42=4;
                }
                else if ( (LA42_2==FullStopFullStop) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PACKED_KEYWORD:
            case RULE_ARRAY_KEYWORD:
            case RULE_RECORD_KEYWORD:
            case RULE_SET_KEYWORD:
            case RULE_FILE_KEYWORD:
                {
                alt42=2;
                }
                break;
            case CircumflexAccent:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2590:5: this_simple_type_0= rulesimple_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype7542);
                    this_simple_type_0=rulesimple_type();

                    state._fsp--;


                    		current.merge(this_simple_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:5: this_structured_type_1= rulestructured_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype7575);
                    this_structured_type_1=rulestructured_type();

                    state._fsp--;


                    		current.merge(this_structured_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2614:5: this_pointer_type_2= rulepointer_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPointer_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype7608);
                    this_pointer_type_2=rulepointer_type();

                    state._fsp--;


                    		current.merge(this_pointer_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2625:10: this_IDENTIFIER_3= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype7634); 

                    		current.merge(this_IDENTIFIER_3);
                        
                     
                        newLeafNode(this_IDENTIFIER_3, grammarAccess.getTypeAccess().getIDENTIFIERTerminalRuleCall_3()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2640:1: entryRulesimple_type returns [String current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final String entryRulesimple_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2641:1: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2642:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type7679);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type7690); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2649:1: rulesimple_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) ;
    public final AntlrDatatypeRuleToken rulesimple_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_subrange_type_0 = null;

        AntlrDatatypeRuleToken this_enumerated_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2653:6: ( (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2654:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2654:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_INTEGER_NUMBER && LA43_0<=RULE_ADDITION_OPERATOR)||LA43_0==RULE_IDENTIFIER||LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            else if ( (LA43_0==LeftParenthesis) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2655:5: this_subrange_type_0= rulesubrange_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type7737);
                    this_subrange_type_0=rulesubrange_type();

                    state._fsp--;


                    		current.merge(this_subrange_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2667:5: this_enumerated_type_1= ruleenumerated_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type7770);
                    this_enumerated_type_1=ruleenumerated_type();

                    state._fsp--;


                    		current.merge(this_enumerated_type_1);
                        
                     
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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2685:1: entryRulesubrange_type returns [String current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final String entryRulesubrange_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesubrange_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2686:1: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2687:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type7815);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type7826); 

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
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2694:1: rulesubrange_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE ) ;
    public final AntlrDatatypeRuleToken rulesubrange_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMERIC_SUBRANGE_3=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2698:6: ( ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2699:1: ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2699:1: ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INTEGER_NUMBER && LA44_0<=RULE_SIGNED_REAL_NUMBER)||LA44_0==RULE_ADDITION_OPERATOR||LA44_0==RULE_IDENTIFIER||LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_NUMERIC_SUBRANGE) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2699:2: (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2699:2: (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2700:5: this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant
                    {
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7874);
                    this_constant_0=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulesubrange_type7892); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7914);
                    this_constant_2=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2728:10: this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE
                    {
                    this_NUMERIC_SUBRANGE_3=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7941); 

                    		current.merge(this_NUMERIC_SUBRANGE_3);
                        
                     
                        newLeafNode(this_NUMERIC_SUBRANGE_3, grammarAccess.getSubrange_typeAccess().getNUMERIC_SUBRANGETerminalRuleCall_1()); 
                        

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
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2743:1: entryRuleenumerated_type returns [String current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final String entryRuleenumerated_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2744:1: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2745:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7986);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7997); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2752:1: ruleenumerated_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleenumerated_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2756:6: ( (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2757:1: (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2757:1: (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2758:2: kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleenumerated_type8035); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type8057);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleenumerated_type8075); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2788:1: entryRulestructured_type returns [String current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final String entryRulestructured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2789:1: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2790:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type8115);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type8126); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2797:1: rulestructured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) ;
    public final AntlrDatatypeRuleToken rulestructured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKED_KEYWORD_0=null;
        AntlrDatatypeRuleToken this_unpacked_structured_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2801:6: ( ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:1: ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:1: ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:2: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:2: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_PACKED_KEYWORD) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2802:7: this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD
                    {
                    this_PACKED_KEYWORD_0=(Token)match(input,RULE_PACKED_KEYWORD,FOLLOW_RULE_PACKED_KEYWORD_in_rulestructured_type8167); 

                    		current.merge(this_PACKED_KEYWORD_0);
                        
                     
                        newLeafNode(this_PACKED_KEYWORD_0, grammarAccess.getStructured_typeAccess().getPACKED_KEYWORDTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8196);
            this_unpacked_structured_type_1=ruleunpacked_structured_type();

            state._fsp--;


            		current.merge(this_unpacked_structured_type_1);
                
             
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2828:1: entryRuleunpacked_structured_type returns [String current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final String entryRuleunpacked_structured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2829:1: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2830:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8241);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type8252); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2837:1: ruleunpacked_structured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_structured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_array_type_0 = null;

        AntlrDatatypeRuleToken this_dynamic_array_type_1 = null;

        AntlrDatatypeRuleToken this_record_type_2 = null;

        AntlrDatatypeRuleToken this_set_type_3 = null;

        AntlrDatatypeRuleToken this_file_type_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2841:6: ( (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2842:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2842:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_record_type_2= rulerecord_type | this_set_type_3= ruleset_type | this_file_type_4= rulefile_type )
            int alt46=5;
            switch ( input.LA(1) ) {
            case RULE_ARRAY_KEYWORD:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_OF_KEYWORD) ) {
                    alt46=2;
                }
                else if ( (LA46_1==LeftSquareBracket) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_RECORD_KEYWORD:
                {
                alt46=3;
                }
                break;
            case RULE_SET_KEYWORD:
                {
                alt46=4;
                }
                break;
            case RULE_FILE_KEYWORD:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2843:5: this_array_type_0= rulearray_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type8299);
                    this_array_type_0=rulearray_type();

                    state._fsp--;


                    		current.merge(this_array_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2855:5: this_dynamic_array_type_1= ruledynamic_array_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamic_array_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type8332);
                    this_dynamic_array_type_1=ruledynamic_array_type();

                    state._fsp--;


                    		current.merge(this_dynamic_array_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2867:5: this_record_type_2= rulerecord_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8365);
                    this_record_type_2=rulerecord_type();

                    state._fsp--;


                    		current.merge(this_record_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2879:5: this_set_type_3= ruleset_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type8398);
                    this_set_type_3=ruleset_type();

                    state._fsp--;


                    		current.merge(this_set_type_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2891:5: this_file_type_4= rulefile_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type8431);
                    this_file_type_4=rulefile_type();

                    state._fsp--;


                    		current.merge(this_file_type_4);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2909:1: entryRulearray_type returns [String current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final String entryRulearray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2910:1: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2911:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type8476);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type8487); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2918:1: rulearray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype ) ;
    public final AntlrDatatypeRuleToken rulearray_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ARRAY_KEYWORD_0=null;
        Token kw=null;
        Token this_OF_KEYWORD_6=null;
        AntlrDatatypeRuleToken this_index_type_2 = null;

        AntlrDatatypeRuleToken this_index_type_4 = null;

        AntlrDatatypeRuleToken this_type_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2922:6: ( (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:6: this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype
            {
            this_ARRAY_KEYWORD_0=(Token)match(input,RULE_ARRAY_KEYWORD,FOLLOW_RULE_ARRAY_KEYWORD_in_rulearray_type8527); 

            		current.merge(this_ARRAY_KEYWORD_0);
                
             
                newLeafNode(this_ARRAY_KEYWORD_0, grammarAccess.getArray_typeAccess().getARRAY_KEYWORDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulearray_type8545); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8567);
            this_index_type_2=ruleindex_type();

            state._fsp--;


            		current.merge(this_index_type_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2947:1: (kw= Comma this_index_type_4= ruleindex_type )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Comma) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2948:2: kw= Comma this_index_type_4= ruleindex_type
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulearray_type8586); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8608);
            	    this_index_type_4=ruleindex_type();

            	    state._fsp--;


            	    		current.merge(this_index_type_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulearray_type8628); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4()); 
                
            this_OF_KEYWORD_6=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulearray_type8643); 

            		current.merge(this_OF_KEYWORD_6);
                
             
                newLeafNode(this_OF_KEYWORD_6, grammarAccess.getArray_typeAccess().getOF_KEYWORDTerminalRuleCall_5()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruletype_in_rulearray_type8670);
            this_type_7=ruletype();

            state._fsp--;


            		current.merge(this_type_7);
                
             
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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2996:1: entryRuledynamic_array_type returns [String current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final String entryRuledynamic_array_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledynamic_array_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2997:1: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2998:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type8715);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledynamic_array_type8726); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3005:1: ruledynamic_array_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruledynamic_array_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ARRAY_KEYWORD_0=null;
        Token this_OF_KEYWORD_1=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3009:6: ( (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3010:6: this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype
            {
            this_ARRAY_KEYWORD_0=(Token)match(input,RULE_ARRAY_KEYWORD,FOLLOW_RULE_ARRAY_KEYWORD_in_ruledynamic_array_type8766); 

            		current.merge(this_ARRAY_KEYWORD_0);
                
             
                newLeafNode(this_ARRAY_KEYWORD_0, grammarAccess.getDynamic_array_typeAccess().getARRAY_KEYWORDTerminalRuleCall_0()); 
                
            this_OF_KEYWORD_1=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_ruledynamic_array_type8786); 

            		current.merge(this_OF_KEYWORD_1);
                
             
                newLeafNode(this_OF_KEYWORD_1, grammarAccess.getDynamic_array_typeAccess().getOF_KEYWORDTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruledynamic_array_type8813);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3043:1: entryRuleindex_type returns [String current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final String entryRuleindex_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3044:1: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3045:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type8858);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type8869); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3052:1: ruleindex_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_simple_type_0= rulesimple_type ;
    public final AntlrDatatypeRuleToken ruleindex_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3056:6: (this_simple_type_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3058:5: this_simple_type_0= rulesimple_type
            {
             
                    newCompositeNode(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 
                
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type8915);
            this_simple_type_0=rulesimple_type();

            state._fsp--;


            		current.merge(this_simple_type_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3076:1: entryRulerecord_type returns [String current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final String entryRulerecord_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3077:1: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3078:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type8959);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type8970); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3085:1: rulerecord_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulerecord_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RECORD_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_field_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3089:6: ( (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3090:1: (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3090:1: (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3090:6: this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_RECORD_KEYWORD_0=(Token)match(input,RULE_RECORD_KEYWORD,FOLLOW_RULE_RECORD_KEYWORD_in_rulerecord_type9010); 

            		current.merge(this_RECORD_KEYWORD_0);
                
             
                newLeafNode(this_RECORD_KEYWORD_0, grammarAccess.getRecord_typeAccess().getRECORD_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_typeAccess().getField_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulerecord_type9037);
            this_field_list_1=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulerecord_type9057); 

            		current.merge(this_END_KEYWORD_2);
                
             
                newLeafNode(this_END_KEYWORD_2, grammarAccess.getRecord_typeAccess().getEND_KEYWORDTerminalRuleCall_2()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3123:1: entryRulefield_list returns [String current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final String entryRulefield_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3124:1: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3125:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list9102);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list9113); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3132:1: rulefield_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )? ;
    public final AntlrDatatypeRuleToken rulefield_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_fixed_part_0 = null;

        AntlrDatatypeRuleToken this_variant_part_2 = null;

        AntlrDatatypeRuleToken this_variant_part_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3136:6: ( ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:1: ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:1: ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_CASE_KEYWORD||LA51_0==RULE_IDENTIFIER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:2: ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:2: ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_IDENTIFIER) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==RULE_CASE_KEYWORD) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:3: (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3137:3: (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3138:5: this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )?
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulefixed_part_in_rulefield_list9162);
                            this_fixed_part_0=rulefixed_part();

                            state._fsp--;


                            		current.merge(this_fixed_part_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3148:1: (kw= Semicolon this_variant_part_2= rulevariant_part )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==Semicolon) ) {
                                int LA48_1 = input.LA(2);

                                if ( (LA48_1==RULE_CASE_KEYWORD) ) {
                                    alt48=1;
                                }
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3149:2: kw= Semicolon this_variant_part_2= rulevariant_part
                                    {
                                    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list9181); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 
                                        
                                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list9203);
                                    this_variant_part_2=rulevariant_part();

                                    state._fsp--;


                                    		current.merge(this_variant_part_2);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3167:5: this_variant_part_3= rulevariant_part
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list9239);
                            this_variant_part_3=rulevariant_part();

                            state._fsp--;


                            		current.merge(this_variant_part_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3177:2: (kw= Semicolon )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Semicolon) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3178:2: kw= Semicolon
                            {
                            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list9259); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
                                

                            }
                            break;

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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3191:1: entryRulefixed_part returns [String current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final String entryRulefixed_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3192:1: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3193:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part9302);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part9313); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3200:1: rulefixed_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* ) ;
    public final AntlrDatatypeRuleToken rulefixed_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_0 = null;

        AntlrDatatypeRuleToken this_record_section_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3204:6: ( (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3205:1: (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3205:1: (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3206:5: this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )*
            {
             
                    newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part9360);
            this_record_section_0=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3216:1: (kw= Semicolon this_record_section_2= rulerecord_section )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==Semicolon) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==RULE_IDENTIFIER) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3217:2: kw= Semicolon this_record_section_2= rulerecord_section
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefixed_part9379); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part9401);
            	    this_record_section_2=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
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


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3241:1: entryRulerecord_section returns [String current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final String entryRulerecord_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3242:1: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3243:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section9448);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section9459); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3250:1: rulerecord_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulerecord_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3254:6: ( (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3255:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3255:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3256:5: this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section9506);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulerecord_section9524); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulerecord_section9546);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3291:1: entryRulevariant_part returns [String current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final String entryRulevariant_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3292:1: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3293:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part9591);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part9602); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3300:1: rulevariant_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* ) ;
    public final AntlrDatatypeRuleToken rulevariant_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_KEYWORD_0=null;
        Token this_IDENTIFIER_2=null;
        Token this_OF_KEYWORD_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_tag_field_1 = null;

        AntlrDatatypeRuleToken this_variant_4 = null;

        AntlrDatatypeRuleToken this_variant_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3304:6: ( (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3305:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3305:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3305:6: this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )*
            {
            this_CASE_KEYWORD_0=(Token)match(input,RULE_CASE_KEYWORD,FOLLOW_RULE_CASE_KEYWORD_in_rulevariant_part9642); 

            		current.merge(this_CASE_KEYWORD_0);
                
             
                newLeafNode(this_CASE_KEYWORD_0, grammarAccess.getVariant_partAccess().getCASE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletag_field_in_rulevariant_part9669);
            this_tag_field_1=ruletag_field();

            state._fsp--;


            		current.merge(this_tag_field_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariant_part9689); 

            		current.merge(this_IDENTIFIER_2);
                
             
                newLeafNode(this_IDENTIFIER_2, grammarAccess.getVariant_partAccess().getIDENTIFIERTerminalRuleCall_2()); 
                
            this_OF_KEYWORD_3=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulevariant_part9709); 

            		current.merge(this_OF_KEYWORD_3);
                
             
                newLeafNode(this_OF_KEYWORD_3, grammarAccess.getVariant_partAccess().getOF_KEYWORDTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part9736);
            this_variant_4=rulevariant();

            state._fsp--;


            		current.merge(this_variant_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3348:1: (kw= Semicolon this_variant_6= rulevariant )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Semicolon) ) {
                    int LA53_1 = input.LA(2);

                    if ( ((LA53_1>=RULE_INTEGER_NUMBER && LA53_1<=RULE_SIGNED_REAL_NUMBER)||LA53_1==RULE_ADDITION_OPERATOR||LA53_1==RULE_IDENTIFIER||LA53_1==RULE_STRING) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3349:2: kw= Semicolon this_variant_6= rulevariant
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariant_part9755); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part9777);
            	    this_variant_6=rulevariant();

            	    state._fsp--;


            	    		current.merge(this_variant_6);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3373:1: entryRuletag_field returns [String current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final String entryRuletag_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3374:1: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3375:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field9824);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field9835); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3382:1: ruletag_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= Colon )? ;
    public final AntlrDatatypeRuleToken ruletag_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3386:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= Colon )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3387:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= Colon )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3387:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= Colon )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_IDENTIFIER) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==Colon) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3387:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= Colon
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletag_field9875); 

                    		current.merge(this_IDENTIFIER_0);
                        
                     
                        newLeafNode(this_IDENTIFIER_0, grammarAccess.getTag_fieldAccess().getIDENTIFIERTerminalRuleCall_0()); 
                        
                    kw=(Token)match(input,Colon,FOLLOW_Colon_in_ruletag_field9893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
                        

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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3408:1: entryRulevariant returns [String current=null] : iv_rulevariant= rulevariant EOF ;
    public final String entryRulevariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3409:1: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3410:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant9934);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant9945); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3417:1: rulevariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken rulevariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_field_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3421:6: ( (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3422:1: (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3422:1: (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3423:5: this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis
            {
             
                    newCompositeNode(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9992);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariant10010); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getColonKeyword_1()); 
                
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulevariant10023); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulevariant10045);
            this_field_list_3=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulevariant10063); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3470:1: entryRuleset_type returns [String current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final String entryRuleset_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3471:1: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3472:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type10103);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type10114); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3479:1: ruleset_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruleset_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SET_KEYWORD_0=null;
        Token this_OF_KEYWORD_1=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3483:6: ( (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3484:1: (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3484:1: (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3484:6: this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype
            {
            this_SET_KEYWORD_0=(Token)match(input,RULE_SET_KEYWORD,FOLLOW_RULE_SET_KEYWORD_in_ruleset_type10154); 

            		current.merge(this_SET_KEYWORD_0);
                
             
                newLeafNode(this_SET_KEYWORD_0, grammarAccess.getSet_typeAccess().getSET_KEYWORDTerminalRuleCall_0()); 
                
            this_OF_KEYWORD_1=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_ruleset_type10174); 

            		current.merge(this_OF_KEYWORD_1);
                
             
                newLeafNode(this_OF_KEYWORD_1, grammarAccess.getSet_typeAccess().getOF_KEYWORDTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getSet_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruleset_type10201);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3517:1: entryRulefile_type returns [String current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final String entryRulefile_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3518:1: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3519:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type10246);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type10257); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3526:1: rulefile_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulefile_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FILE_KEYWORD_0=null;
        Token this_OF_KEYWORD_1=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3530:6: ( (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3531:1: (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3531:1: (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3531:6: this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype
            {
            this_FILE_KEYWORD_0=(Token)match(input,RULE_FILE_KEYWORD,FOLLOW_RULE_FILE_KEYWORD_in_rulefile_type10297); 

            		current.merge(this_FILE_KEYWORD_0);
                
             
                newLeafNode(this_FILE_KEYWORD_0, grammarAccess.getFile_typeAccess().getFILE_KEYWORDTerminalRuleCall_0()); 
                
            this_OF_KEYWORD_1=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulefile_type10317); 

            		current.merge(this_OF_KEYWORD_1);
                
             
                newLeafNode(this_OF_KEYWORD_1, grammarAccess.getFile_typeAccess().getOF_KEYWORDTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getFile_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulefile_type10344);
            this_type_2=ruletype();

            state._fsp--;


            		current.merge(this_type_2);
                
             
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
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3564:1: entryRulepointer_type returns [String current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final String entryRulepointer_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3565:1: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3566:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type10389);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type10400); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3573:1: rulepointer_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CircumflexAccent this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulepointer_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3577:6: ( (kw= CircumflexAccent this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3578:1: (kw= CircumflexAccent this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3578:1: (kw= CircumflexAccent this_IDENTIFIER_1= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3579:2: kw= CircumflexAccent this_IDENTIFIER_1= RULE_IDENTIFIER
            {
            kw=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulepointer_type10438); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepointer_type10453); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getPointer_typeAccess().getIDENTIFIERTerminalRuleCall_1()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3599:1: entryRulevariable_declaration_part returns [String current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final String entryRulevariable_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3600:1: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part10498);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part10509); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3608:1: rulevariable_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_1 = null;

        AntlrDatatypeRuleToken this_record_section_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3612:6: ( (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3613:1: (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3613:1: (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3613:6: this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )*
            {
            this_VAR_KEYWORD_0=(Token)match(input,RULE_VAR_KEYWORD,FOLLOW_RULE_VAR_KEYWORD_in_rulevariable_declaration_part10549); 

            		current.merge(this_VAR_KEYWORD_0);
                
             
                newLeafNode(this_VAR_KEYWORD_0, grammarAccess.getVariable_declaration_partAccess().getVAR_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getRecord_sectionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulevariable_declaration_part10576);
            this_record_section_1=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part10594); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3637:1: (this_record_section_3= rulerecord_section kw= Semicolon )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_IDENTIFIER) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3638:5: this_record_section_3= rulerecord_section kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getRecord_sectionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulevariable_declaration_part10617);
            	    this_record_section_3=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part10635); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            	        

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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3662:1: entryRuleprocedure_and_function_declaration_part returns [String current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final String entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3663:1: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3664:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part10677);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part10688); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3671:1: ruleprocedure_and_function_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )* ;
    public final AntlrDatatypeRuleToken ruleprocedure_and_function_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_procedure_declaration_0 = null;

        AntlrDatatypeRuleToken this_function_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3675:6: ( ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3676:1: ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3676:1: ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_PROCEDURE_KEYWORD||LA57_0==RULE_FUNCTION_KEYWORD) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3676:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3676:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration )
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_PROCEDURE_KEYWORD) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==RULE_FUNCTION_KEYWORD) ) {
            	        alt56=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3677:5: this_procedure_declaration_0= ruleprocedure_declaration
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationParserRuleCall_0_0()); 
            	                
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part10736);
            	            this_procedure_declaration_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            		current.merge(this_procedure_declaration_0);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3689:5: this_function_declaration_1= rulefunction_declaration
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationParserRuleCall_0_1()); 
            	                
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part10769);
            	            this_function_declaration_1=rulefunction_declaration();

            	            state._fsp--;


            	            		current.merge(this_function_declaration_1);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part10788); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3713:1: entryRuleprocedure_declaration returns [String current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final String entryRuleprocedure_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3714:1: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3715:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration10829);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration10840); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3722:1: ruleprocedure_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) ) ;
    public final AntlrDatatypeRuleToken ruleprocedure_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FORWARD_KEYWORD_3=null;
        AntlrDatatypeRuleToken this_procedure_heading_0 = null;

        AntlrDatatypeRuleToken this_block_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3726:6: ( (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3727:1: (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3727:1: (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3728:5: this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD )
            {
             
                    newCompositeNode(grammarAccess.getProcedure_declarationAccess().getProcedure_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10887);
            this_procedure_heading_0=ruleprocedure_heading();

            state._fsp--;


            		current.merge(this_procedure_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_declaration10905); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3744:1: (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EOF||LA58_0==RULE_BEGIN_KEYWORD||LA58_0==RULE_LABEL_KEYWORD||(LA58_0>=RULE_CONST_KEYWORD && LA58_0<=RULE_TYPE_KEYWORD)||(LA58_0>=RULE_VAR_KEYWORD && LA58_0<=RULE_PROCEDURE_KEYWORD)||LA58_0==RULE_FUNCTION_KEYWORD) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_FORWARD_KEYWORD) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3745:5: this_block_2= ruleblock
                    {
                     
                            newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration10928);
                    this_block_2=ruleblock();

                    state._fsp--;


                    		current.merge(this_block_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3756:10: this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD
                    {
                    this_FORWARD_KEYWORD_3=(Token)match(input,RULE_FORWARD_KEYWORD,FOLLOW_RULE_FORWARD_KEYWORD_in_ruleprocedure_declaration10954); 

                    		current.merge(this_FORWARD_KEYWORD_3);
                        
                     
                        newLeafNode(this_FORWARD_KEYWORD_3, grammarAccess.getProcedure_declarationAccess().getFORWARD_KEYWORDTerminalRuleCall_2_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3771:1: entryRuleprocedure_heading returns [String current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final String entryRuleprocedure_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3772:1: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3773:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading11000);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading11011); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3780:1: ruleprocedure_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PROCEDURE_KEYWORD_0= RULE_PROCEDURE_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? ) ;
    public final AntlrDatatypeRuleToken ruleprocedure_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PROCEDURE_KEYWORD_0=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_formal_parameter_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3784:6: ( (this_PROCEDURE_KEYWORD_0= RULE_PROCEDURE_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3785:1: (this_PROCEDURE_KEYWORD_0= RULE_PROCEDURE_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3785:1: (this_PROCEDURE_KEYWORD_0= RULE_PROCEDURE_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3785:6: this_PROCEDURE_KEYWORD_0= RULE_PROCEDURE_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )?
            {
            this_PROCEDURE_KEYWORD_0=(Token)match(input,RULE_PROCEDURE_KEYWORD,FOLLOW_RULE_PROCEDURE_KEYWORD_in_ruleprocedure_heading11051); 

            		current.merge(this_PROCEDURE_KEYWORD_0);
                
             
                newLeafNode(this_PROCEDURE_KEYWORD_0, grammarAccess.getProcedure_headingAccess().getPROCEDURE_KEYWORDTerminalRuleCall_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_heading11071); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProcedure_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3799:1: (this_formal_parameter_list_2= ruleformal_parameter_list )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LeftParenthesis) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3800:5: this_formal_parameter_list_2= ruleformal_parameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getProcedure_headingAccess().getFormal_parameter_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading11099);
                    this_formal_parameter_list_2=ruleformal_parameter_list();

                    state._fsp--;


                    		current.merge(this_formal_parameter_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3818:1: entryRuleformal_parameter_list returns [String current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final String entryRuleformal_parameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3819:1: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3820:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list11146);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list11157); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3827:1: ruleformal_parameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleformal_parameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_formal_parameter_section_1 = null;

        AntlrDatatypeRuleToken this_formal_parameter_section_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3831:6: ( (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3832:1: (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3832:1: (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3833:2: kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleformal_parameter_list11195); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list11217);
            this_formal_parameter_section_1=ruleformal_parameter_section();

            state._fsp--;


            		current.merge(this_formal_parameter_section_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3849:1: (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Semicolon) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3850:2: kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleformal_parameter_list11236); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list11258);
            	    this_formal_parameter_section_3=ruleformal_parameter_section();

            	    state._fsp--;


            	    		current.merge(this_formal_parameter_section_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleformal_parameter_list11278); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3880:1: entryRuleformal_parameter_section returns [String current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final String entryRuleformal_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3881:1: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3882:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section11318);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section11329); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3889:1: ruleformal_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading ) ;
    public final AntlrDatatypeRuleToken ruleformal_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_value_parameter_section_0 = null;

        AntlrDatatypeRuleToken this_variable_parameter_section_1 = null;

        AntlrDatatypeRuleToken this_procedure_heading_2 = null;

        AntlrDatatypeRuleToken this_function_heading_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3893:6: ( (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3894:1: (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3894:1: (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading )
            int alt61=4;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt61=1;
                }
                break;
            case RULE_VAR_KEYWORD:
                {
                alt61=2;
                }
                break;
            case RULE_PROCEDURE_KEYWORD:
                {
                alt61=3;
                }
                break;
            case RULE_FUNCTION_KEYWORD:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3895:5: this_value_parameter_section_0= rulevalue_parameter_section
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValue_parameter_sectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section11376);
                    this_value_parameter_section_0=rulevalue_parameter_section();

                    state._fsp--;


                    		current.merge(this_value_parameter_section_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3907:5: this_variable_parameter_section_1= rulevariable_parameter_section
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariable_parameter_sectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section11409);
                    this_variable_parameter_section_1=rulevariable_parameter_section();

                    state._fsp--;


                    		current.merge(this_variable_parameter_section_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3919:5: this_procedure_heading_2= ruleprocedure_heading
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedure_headingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section11442);
                    this_procedure_heading_2=ruleprocedure_heading();

                    state._fsp--;


                    		current.merge(this_procedure_heading_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:5: this_function_heading_3= rulefunction_heading
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunction_headingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section11475);
                    this_function_heading_3=rulefunction_heading();

                    state._fsp--;


                    		current.merge(this_function_heading_3);
                        
                     
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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3949:1: entryRulevalue_parameter_section returns [String current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final String entryRulevalue_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3950:1: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3951:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section11520);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section11531); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3958:1: rulevalue_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type ) ;
    public final AntlrDatatypeRuleToken rulevalue_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_parameter_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3962:6: ( (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3963:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3963:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3964:5: this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type
            {
             
                    newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section11578);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevalue_parameter_section11596); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getParameter_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section11618);
            this_parameter_type_2=ruleparameter_type();

            state._fsp--;


            		current.merge(this_parameter_type_2);
                
             
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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3999:1: entryRuleparameter_type returns [String current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final String entryRuleparameter_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4000:1: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4001:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type11663);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type11674); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4008:1: ruleparameter_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_conformant_array_schema_0= ruleconformant_array_schema | this_IDENTIFIER_1= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleparameter_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_conformant_array_schema_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4012:6: ( (this_conformant_array_schema_0= ruleconformant_array_schema | this_IDENTIFIER_1= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4013:1: (this_conformant_array_schema_0= ruleconformant_array_schema | this_IDENTIFIER_1= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4013:1: (this_conformant_array_schema_0= ruleconformant_array_schema | this_IDENTIFIER_1= RULE_IDENTIFIER )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_PACKED_KEYWORD && LA62_0<=RULE_ARRAY_KEYWORD)) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_IDENTIFIER) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4014:5: this_conformant_array_schema_0= ruleconformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getParameter_typeAccess().getConformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type11721);
                    this_conformant_array_schema_0=ruleconformant_array_schema();

                    state._fsp--;


                    		current.merge(this_conformant_array_schema_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4025:10: this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleparameter_type11747); 

                    		current.merge(this_IDENTIFIER_1);
                        
                     
                        newLeafNode(this_IDENTIFIER_1, grammarAccess.getParameter_typeAccess().getIDENTIFIERTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4040:1: entryRuleconformant_array_schema returns [String current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final String entryRuleconformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4041:1: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4042:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema11792);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema11803); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4049:1: ruleconformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) ;
    public final AntlrDatatypeRuleToken ruleconformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_packed_conformant_array_schema_0 = null;

        AntlrDatatypeRuleToken this_unpacked_conformant_array_schema_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4053:6: ( (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4054:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4054:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_PACKED_KEYWORD) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ARRAY_KEYWORD) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4055:5: this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPacked_conformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema11850);
                    this_packed_conformant_array_schema_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    		current.merge(this_packed_conformant_array_schema_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4067:5: this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpacked_conformant_array_schemaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema11883);
                    this_unpacked_conformant_array_schema_1=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    		current.merge(this_unpacked_conformant_array_schema_1);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4085:1: entryRulepacked_conformant_array_schema returns [String current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final String entryRulepacked_conformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4086:1: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4087:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema11928);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema11939); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4094:1: rulepacked_conformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD this_ARRAY_KEYWORD_1= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket this_OF_KEYWORD_5= RULE_OF_KEYWORD this_IDENTIFIER_6= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulepacked_conformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKED_KEYWORD_0=null;
        Token this_ARRAY_KEYWORD_1=null;
        Token kw=null;
        Token this_OF_KEYWORD_5=null;
        Token this_IDENTIFIER_6=null;
        AntlrDatatypeRuleToken this_bound_specification_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4098:6: ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD this_ARRAY_KEYWORD_1= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket this_OF_KEYWORD_5= RULE_OF_KEYWORD this_IDENTIFIER_6= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4099:1: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD this_ARRAY_KEYWORD_1= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket this_OF_KEYWORD_5= RULE_OF_KEYWORD this_IDENTIFIER_6= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4099:1: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD this_ARRAY_KEYWORD_1= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket this_OF_KEYWORD_5= RULE_OF_KEYWORD this_IDENTIFIER_6= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4099:6: this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD this_ARRAY_KEYWORD_1= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket this_OF_KEYWORD_5= RULE_OF_KEYWORD this_IDENTIFIER_6= RULE_IDENTIFIER
            {
            this_PACKED_KEYWORD_0=(Token)match(input,RULE_PACKED_KEYWORD,FOLLOW_RULE_PACKED_KEYWORD_in_rulepacked_conformant_array_schema11979); 

            		current.merge(this_PACKED_KEYWORD_0);
                
             
                newLeafNode(this_PACKED_KEYWORD_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPACKED_KEYWORDTerminalRuleCall_0()); 
                
            this_ARRAY_KEYWORD_1=(Token)match(input,RULE_ARRAY_KEYWORD,FOLLOW_RULE_ARRAY_KEYWORD_in_rulepacked_conformant_array_schema11999); 

            		current.merge(this_ARRAY_KEYWORD_1);
                
             
                newLeafNode(this_ARRAY_KEYWORD_1, grammarAccess.getPacked_conformant_array_schemaAccess().getARRAY_KEYWORDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema12017); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema12039);
            this_bound_specification_3=rulebound_specification();

            state._fsp--;


            		current.merge(this_bound_specification_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema12057); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
                
            this_OF_KEYWORD_5=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulepacked_conformant_array_schema12072); 

            		current.merge(this_OF_KEYWORD_5);
                
             
                newLeafNode(this_OF_KEYWORD_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOF_KEYWORDTerminalRuleCall_5()); 
                
            this_IDENTIFIER_6=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepacked_conformant_array_schema12092); 

            		current.merge(this_IDENTIFIER_6);
                
             
                newLeafNode(this_IDENTIFIER_6, grammarAccess.getPacked_conformant_array_schemaAccess().getIDENTIFIERTerminalRuleCall_6()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4158:1: entryRulebound_specification returns [String current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final String entryRulebound_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4159:1: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4160:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification12137);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification12148); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4167:1: rulebound_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= FullStopFullStop this_IDENTIFIER_2= RULE_IDENTIFIER kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulebound_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;
        Token this_IDENTIFIER_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4171:6: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= FullStopFullStop this_IDENTIFIER_2= RULE_IDENTIFIER kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4172:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= FullStopFullStop this_IDENTIFIER_2= RULE_IDENTIFIER kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4172:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= FullStopFullStop this_IDENTIFIER_2= RULE_IDENTIFIER kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4172:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= FullStopFullStop this_IDENTIFIER_2= RULE_IDENTIFIER kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12188); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getBound_specificationAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulebound_specification12206); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1()); 
                
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12221); 

            		current.merge(this_IDENTIFIER_2);
                
             
                newLeafNode(this_IDENTIFIER_2, grammarAccess.getBound_specificationAccess().getIDENTIFIERTerminalRuleCall_2()); 
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulebound_specification12239); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBound_specificationAccess().getColonKeyword_3()); 
                
            this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12254); 

            		current.merge(this_IDENTIFIER_4);
                
             
                newLeafNode(this_IDENTIFIER_4, grammarAccess.getBound_specificationAccess().getIDENTIFIERTerminalRuleCall_4()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4213:1: entryRuleunpacked_conformant_array_schema returns [String current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final String entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4214:1: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4215:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema12299);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema12310); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4222:1: ruleunpacked_conformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER ) ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_conformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ARRAY_KEYWORD_0=null;
        Token kw=null;
        Token this_OF_KEYWORD_6=null;
        Token this_IDENTIFIER_8=null;
        AntlrDatatypeRuleToken this_bound_specification_2 = null;

        AntlrDatatypeRuleToken this_bound_specification_4 = null;

        AntlrDatatypeRuleToken this_conformant_array_schema_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4226:6: ( (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4227:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4227:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4227:6: this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket this_OF_KEYWORD_6= RULE_OF_KEYWORD (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER )
            {
            this_ARRAY_KEYWORD_0=(Token)match(input,RULE_ARRAY_KEYWORD,FOLLOW_RULE_ARRAY_KEYWORD_in_ruleunpacked_conformant_array_schema12350); 

            		current.merge(this_ARRAY_KEYWORD_0);
                
             
                newLeafNode(this_ARRAY_KEYWORD_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getARRAY_KEYWORDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema12368); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema12390);
            this_bound_specification_2=rulebound_specification();

            state._fsp--;


            		current.merge(this_bound_specification_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4251:1: (kw= Semicolon this_bound_specification_4= rulebound_specification )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Semicolon) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4252:2: kw= Semicolon this_bound_specification_4= rulebound_specification
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema12409); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema12431);
            	    this_bound_specification_4=rulebound_specification();

            	    state._fsp--;


            	    		current.merge(this_bound_specification_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema12451); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
                
            this_OF_KEYWORD_6=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_ruleunpacked_conformant_array_schema12466); 

            		current.merge(this_OF_KEYWORD_6);
                
             
                newLeafNode(this_OF_KEYWORD_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOF_KEYWORDTerminalRuleCall_5()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4281:1: (this_conformant_array_schema_7= ruleconformant_array_schema | this_IDENTIFIER_8= RULE_IDENTIFIER )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_PACKED_KEYWORD && LA65_0<=RULE_ARRAY_KEYWORD)) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_IDENTIFIER) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4282:5: this_conformant_array_schema_7= ruleconformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getConformant_array_schemaParserRuleCall_6_0()); 
                        
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema12494);
                    this_conformant_array_schema_7=ruleconformant_array_schema();

                    state._fsp--;


                    		current.merge(this_conformant_array_schema_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4293:10: this_IDENTIFIER_8= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleunpacked_conformant_array_schema12520); 

                    		current.merge(this_IDENTIFIER_8);
                        
                     
                        newLeafNode(this_IDENTIFIER_8, grammarAccess.getUnpacked_conformant_array_schemaAccess().getIDENTIFIERTerminalRuleCall_6_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4308:1: entryRulevariable_parameter_section returns [String current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final String entryRulevariable_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4309:1: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4310:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section12566);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section12577); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4317:1: rulevariable_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type ) ;
    public final AntlrDatatypeRuleToken rulevariable_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;

        AntlrDatatypeRuleToken this_parameter_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4321:6: ( (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4322:1: (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4322:1: (this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4322:6: this_VAR_KEYWORD_0= RULE_VAR_KEYWORD this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type
            {
            this_VAR_KEYWORD_0=(Token)match(input,RULE_VAR_KEYWORD,FOLLOW_RULE_VAR_KEYWORD_in_rulevariable_parameter_section12617); 

            		current.merge(this_VAR_KEYWORD_0);
                
             
                newLeafNode(this_VAR_KEYWORD_0, grammarAccess.getVariable_parameter_sectionAccess().getVAR_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section12644);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_parameter_section12662); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getParameter_typeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section12684);
            this_parameter_type_3=ruleparameter_type();

            state._fsp--;


            		current.merge(this_parameter_type_3);
                
             
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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4365:1: entryRulefunction_heading returns [String current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final String entryRulefunction_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4366:1: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4367:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading12729);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading12740); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4374:1: rulefunction_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNCTION_KEYWORD_0= RULE_FUNCTION_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulefunction_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNCTION_KEYWORD_0=null;
        Token this_IDENTIFIER_1=null;
        Token kw=null;
        Token this_IDENTIFIER_4=null;
        AntlrDatatypeRuleToken this_formal_parameter_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4378:6: ( (this_FUNCTION_KEYWORD_0= RULE_FUNCTION_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4379:1: (this_FUNCTION_KEYWORD_0= RULE_FUNCTION_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4379:1: (this_FUNCTION_KEYWORD_0= RULE_FUNCTION_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4379:6: this_FUNCTION_KEYWORD_0= RULE_FUNCTION_KEYWORD this_IDENTIFIER_1= RULE_IDENTIFIER (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_IDENTIFIER_4= RULE_IDENTIFIER
            {
            this_FUNCTION_KEYWORD_0=(Token)match(input,RULE_FUNCTION_KEYWORD,FOLLOW_RULE_FUNCTION_KEYWORD_in_rulefunction_heading12780); 

            		current.merge(this_FUNCTION_KEYWORD_0);
                
             
                newLeafNode(this_FUNCTION_KEYWORD_0, grammarAccess.getFunction_headingAccess().getFUNCTION_KEYWORDTerminalRuleCall_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading12800); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getFunction_headingAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4393:1: (this_formal_parameter_list_2= ruleformal_parameter_list )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LeftParenthesis) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4394:5: this_formal_parameter_list_2= ruleformal_parameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_headingAccess().getFormal_parameter_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading12828);
                    this_formal_parameter_list_2=ruleformal_parameter_list();

                    state._fsp--;


                    		current.merge(this_formal_parameter_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulefunction_heading12848); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
                
            this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading12863); 

            		current.merge(this_IDENTIFIER_4);
                
             
                newLeafNode(this_IDENTIFIER_4, grammarAccess.getFunction_headingAccess().getIDENTIFIERTerminalRuleCall_4()); 
                

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4425:1: entryRulefunction_declaration returns [String current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final String entryRulefunction_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4426:1: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4427:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration12908);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration12919); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4434:1: rulefunction_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) ) ;
    public final AntlrDatatypeRuleToken rulefunction_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FORWARD_KEYWORD_3=null;
        AntlrDatatypeRuleToken this_function_heading_0 = null;

        AntlrDatatypeRuleToken this_block_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4438:6: ( (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4439:1: (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4439:1: (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4440:5: this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD )
            {
             
                    newCompositeNode(grammarAccess.getFunction_declarationAccess().getFunction_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefunction_heading_in_rulefunction_declaration12966);
            this_function_heading_0=rulefunction_heading();

            state._fsp--;


            		current.merge(this_function_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefunction_declaration12984); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4456:1: (this_block_2= ruleblock | this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EOF||LA67_0==RULE_BEGIN_KEYWORD||LA67_0==RULE_LABEL_KEYWORD||(LA67_0>=RULE_CONST_KEYWORD && LA67_0<=RULE_TYPE_KEYWORD)||(LA67_0>=RULE_VAR_KEYWORD && LA67_0<=RULE_PROCEDURE_KEYWORD)||LA67_0==RULE_FUNCTION_KEYWORD) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_FORWARD_KEYWORD) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4457:5: this_block_2= ruleblock
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration13007);
                    this_block_2=ruleblock();

                    state._fsp--;


                    		current.merge(this_block_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4468:10: this_FORWARD_KEYWORD_3= RULE_FORWARD_KEYWORD
                    {
                    this_FORWARD_KEYWORD_3=(Token)match(input,RULE_FORWARD_KEYWORD,FOLLOW_RULE_FORWARD_KEYWORD_in_rulefunction_declaration13033); 

                    		current.merge(this_FORWARD_KEYWORD_3);
                        
                     
                        newLeafNode(this_FORWARD_KEYWORD_3, grammarAccess.getFunction_declarationAccess().getFORWARD_KEYWORDTerminalRuleCall_2_1()); 
                        

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


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\1\uffff\1\13\12\uffff";
    static final String DFA17_minS =
        "\2\7\12\uffff";
    static final String DFA17_maxS =
        "\1\102\1\53\12\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\10\6\uffff\1\4\2\uffff\4\2\7\uffff\1\5\1\11\32\uffff\1\6"+
            "\1\7\4\uffff\1\1\3\uffff\1\3",
            "\1\12\2\13\2\uffff\1\13\1\uffff\2\13\3\uffff\2\13\1\uffff"+
            "\3\13\1\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\1"+
            "\uffff\2\13\1\uffff\2\13\1\uffff\1\13",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1052:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_TRUE_KEYWORD_5= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_6= RULE_FALSE_KEYWORD | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (this_NOT_KEYWORD_11= RULE_NOT_KEYWORD this_factor_12= rulefactor ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram215 = new BitSet(new long[]{0x00B0600008000000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram242 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FullStop_in_ruleprogram260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Program_in_ruleprogram_heading_block349 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block364 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleprogram_heading_block383 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block405 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleprogram_heading_block423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprogram_heading_block438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list529 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_Comma_in_ruleidentifier_list548 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list563 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock668 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part791 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part818 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulestatement_part838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence941 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Semicolon_in_rulestatement_sequence960 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence982 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1088 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulestatement1106 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulesimple_statement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulesimple_statement1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1586 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ColonEqualsSign_in_ruleassignment_statement1604 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomponent_variable_in_rulevariable1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomponent_variable_in_entryRulecomponent_variable1901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomponent_variable1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulecomponent_variable1959 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulecomponent_variable1977 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulecomponent_variable1999 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulecomponent_variable2017 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleindexed_variable__in_rulecomponent_variable2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindexed_variable__in_entryRuleindexed_variable_2084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindexed_variable_2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleindexed_variable_2133 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleindexed_variable_2155 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleindexed_variable_2173 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleindexed_variable__in_ruleindexed_variable_2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2299 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_Comma_in_ruleexpression_list2318 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2340 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2445 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2466 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2592 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2621 = new BitSet(new long[]{0x00000000405E0002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2645 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_OR_KEYWORD_in_rulesimple_expression2673 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2701 = new BitSet(new long[]{0x00000000405E0002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulesimple_expression2735 = new BitSet(new long[]{0x00000000405E0002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2840 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2861 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2888 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rulefactor3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_KEYWORD_in_rulefactor3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_KEYWORD_in_rulefactor3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefactor3221 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor3243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefactor3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rulefactor3284 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rulenumber3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulenumber3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleset3786 = new BitSet(new long[]{0x43000000305EC080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleset3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefunction_designator3938 = new BitSet(new long[]{0x43000000305E4180L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3961 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefunction_designator3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement4223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rulecompound_statement4274 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4301 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulecompound_statement4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_KEYWORD_in_rulewhile_statement4586 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4613 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulewhile_statement4633 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REPEAT_KEYWORD_in_rulerepeat_statement4756 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4783 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_UNTIL_KEYWORD_in_rulerepeat_statement4803 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_KEYWORD_in_rulefor_statement4926 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4953 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_RULE_TO_KEYWORD_in_rulefor_statement4974 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_DOWNTO_KEYWORD_in_rulefor_statement5000 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement5028 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulefor_statement5048 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement5120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement5256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_KEYWORD_in_ruleif_statement5307 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5334 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_THEN_KEYWORD_in_ruleif_statement5354 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5381 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_KEYWORD_in_ruleif_statement5402 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_KEYWORD_in_rulecase_statement5527 = new BitSet(new long[]{0x43000000305E4080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement5554 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulecase_statement5574 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5601 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5620 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5642 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5663 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulecase_statement5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulecase_limb5801 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5926 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_Comma_in_rulecase_label_list5945 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5967 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant6014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant6067 = new BitSet(new long[]{0x40000000001E0000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement6196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WITH_KEYWORD_in_rulewith_statement6247 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6274 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_Comma_in_rulewith_statement6293 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6315 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulewith_statement6337 = new BitSet(new long[]{0x40001495820A0000L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement6409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GOTO_KEYWORD_in_rulegoto_statement6460 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6591 = new BitSet(new long[]{0x00B0600000000000L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6621 = new BitSet(new long[]{0x00B0400000000000L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruledeclaration_part6651 = new BitSet(new long[]{0x00B0000000000000L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part6681 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part6806 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6833 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_Comma_in_rulelabel_declaration_part6852 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6874 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_Semicolon_in_rulelabel_declaration_part6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONST_KEYWORD_in_ruleconstant_definition_part6985 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part7013 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleconstant_definition_part7031 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition7073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition7124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleconstant_definition7142 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part7209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_KEYWORD_in_ruletype_definition_part7260 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part7288 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_ruletype_definition_part7306 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition7348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_definition7399 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruletype_definition7417 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype7484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type7679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type7815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulesubrange_type7892 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleenumerated_type8035 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type8057 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleenumerated_type8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type8115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKED_KEYWORD_in_rulestructured_type8167 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type8476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_KEYWORD_in_rulearray_type8527 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulearray_type8545 = new BitSet(new long[]{0x40000000007E0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8567 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_Comma_in_rulearray_type8586 = new BitSet(new long[]{0x40000000007E0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8608 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulearray_type8628 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulearray_type8643 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type8715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledynamic_array_type8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_KEYWORD_in_ruledynamic_array_type8766 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_ruledynamic_array_type8786 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_ruledynamic_array_type8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type8858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type8959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RECORD_KEYWORD_in_rulerecord_type9010 = new BitSet(new long[]{0x4000040004000000L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type9037 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulerecord_type9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list9102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list9162 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list9181 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list9203 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list9239 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part9302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part9360 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefixed_part9379 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part9401 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section9448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section9506 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulerecord_section9524 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part9591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_KEYWORD_in_rulevariant_part9642 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part9669 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariant_part9689 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulevariant_part9709 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9736 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariant_part9755 = new BitSet(new long[]{0x40000000005E0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9777 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field9824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletag_field9875 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_ruletag_field9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant9934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9992 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulevariant10010 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulevariant10023 = new BitSet(new long[]{0x4000040000000100L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant10045 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulevariant10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type10103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type10114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SET_KEYWORD_in_ruleset_type10154 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_ruleset_type10174 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type10246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILE_KEYWORD_in_rulefile_type10297 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulefile_type10317 = new BitSet(new long[]{0x400F8000007F0080L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type10389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type10400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulepointer_type10438 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepointer_type10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part10498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_KEYWORD_in_rulevariable_declaration_part10549 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulevariable_declaration_part10576 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part10594 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulevariable_declaration_part10617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part10635 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part10677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part10736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part10769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part10788 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration10829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration10840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10887 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_declaration10905 = new BitSet(new long[]{0x00F0600008000000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORWARD_KEYWORD_in_ruleprocedure_declaration10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading11000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading11011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROCEDURE_KEYWORD_in_ruleprocedure_heading11051 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprocedure_heading11071 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list11146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list11157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleformal_parameter_list11195 = new BitSet(new long[]{0x40B0000000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list11217 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_Semicolon_in_ruleformal_parameter_list11236 = new BitSet(new long[]{0x40B0000000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list11258 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleformal_parameter_list11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section11318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section11329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section11475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section11520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section11578 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulevalue_parameter_section11596 = new BitSet(new long[]{0x4001800000000000L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section11618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type11663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleparameter_type11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema11792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema11928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKED_KEYWORD_in_rulepacked_conformant_array_schema11979 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RULE_ARRAY_KEYWORD_in_rulepacked_conformant_array_schema11999 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema12017 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema12039 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema12057 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulepacked_conformant_array_schema12072 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepacked_conformant_array_schema12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification12137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification12148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulebound_specification12206 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulebound_specification12239 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulebound_specification12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema12299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_KEYWORD_in_ruleunpacked_conformant_array_schema12350 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema12368 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema12390 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema12409 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema12431 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema12451 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_ruleunpacked_conformant_array_schema12466 = new BitSet(new long[]{0x4001800000000000L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleunpacked_conformant_array_schema12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section12566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_KEYWORD_in_rulevariable_parameter_section12617 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section12644 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_parameter_section12662 = new BitSet(new long[]{0x4001800000000000L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading12729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNCTION_KEYWORD_in_rulefunction_heading12780 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading12800 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading12828 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_rulefunction_heading12848 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_heading12863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration12908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_rulefunction_declaration12966 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_rulefunction_declaration12984 = new BitSet(new long[]{0x00F0600008000000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORWARD_KEYWORD_in_rulefunction_declaration13033 = new BitSet(new long[]{0x0000000000000002L});

}