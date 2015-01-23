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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_OR_KEYWORD", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_NIL_KEYWORD", "RULE_NOT_KEYWORD", "RULE_REAL_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_WHILE_KEYWORD", "RULE_DO_KEYWORD", "RULE_REPEAT_KEYWORD", "RULE_UNTIL_KEYWORD", "RULE_FOR_KEYWORD", "RULE_TO_KEYWORD", "RULE_DOWNTO_KEYWORD", "RULE_IF_KEYWORD", "RULE_THEN_KEYWORD", "RULE_ELSE_KEYWORD", "RULE_CASE_KEYWORD", "RULE_OF_KEYWORD", "RULE_WITH_KEYWORD", "RULE_GOTO_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_CONST_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_NUMERIC_SUBRANGE", "RULE_PACKED_KEYWORD", "RULE_ARRAY_KEYWORD", "RULE_RECORD_KEYWORD", "RULE_SET_KEYWORD", "RULE_FILE_KEYWORD", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "':'", "':='", "'['", "']'", "'='", "'..'"
    };
    public static final int RULE_ID=46;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ANY_OTHER=51;
    public static final int RULE_IF_KEYWORD=25;
    public static final int RULE_NUMERIC_SUBRANGE=35;
    public static final int T__61=61;
    public static final int RULE_TYPE_KEYWORD=34;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_ADDITION_OPERATOR=10;
    public static final int RULE_FOR_KEYWORD=22;
    public static final int RULE_FILE_KEYWORD=40;
    public static final int RULE_UNTIL_KEYWORD=21;
    public static final int T__55=55;
    public static final int RULE_END_KEYWORD=6;
    public static final int T__56=56;
    public static final int RULE_THEN_KEYWORD=26;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_CASE_KEYWORD=28;
    public static final int RULE_REAL_NUMBER=16;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_MULTIPLICATION_OPERATOR=12;
    public static final int RULE_INT=47;
    public static final int RULE_BEGIN_KEYWORD=5;
    public static final int RULE_LETTER_EXTENDED=44;
    public static final int RULE_DOWNTO_KEYWORD=24;
    public static final int RULE_TO_KEYWORD=23;
    public static final int RULE_RELATIONAL_OPERATOR=9;
    public static final int RULE_NIL_KEYWORD=14;
    public static final int RULE_GOTO_KEYWORD=31;
    public static final int RULE_LABEL_KEYWORD=32;
    public static final int RULE_WHILE_KEYWORD=18;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=41;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_OF_KEYWORD=29;
    public static final int RULE_DO_KEYWORD=19;
    public static final int RULE_WITH_KEYWORD=30;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_CONST_KEYWORD=33;
    public static final int RULE_PACKED_KEYWORD=36;
    public static final int RULE_SET_KEYWORD=39;
    public static final int RULE_NOT_KEYWORD=15;
    public static final int RULE_LETTER=45;
    public static final int RULE_RECORD_KEYWORD=38;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_STRING=13;
    public static final int RULE_SIGNED_REAL_NUMBER=17;
    public static final int RULE_REPEAT_KEYWORD=20;
    public static final int RULE_ARRAY_KEYWORD=37;
    public static final int RULE_OR_KEYWORD=11;
    public static final int RULE_DIGIT_SEQUENCE=42;
    public static final int RULE_WS=50;
    public static final int RULE_DIGIT=43;
    public static final int RULE_SIGNED_INTEGER_NUMBER=7;
    public static final int RULE_ELSE_KEYWORD=27;
    public static final int RULE_INTEGER_NUMBER=8;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g"; }



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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:67:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:68:2: (iv_rulepascal= rulepascal EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:69:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_rulepascal_in_entryRulepascal75);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepascal85); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:76:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_program_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:79:28: ( ( (lv_program_0_0= ruleprogram ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_program_0_0= ruleprogram ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:80:1: ( (lv_program_0_0= ruleprogram ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:81:1: (lv_program_0_0= ruleprogram )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:81:1: (lv_program_0_0= ruleprogram )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:82:3: lv_program_0_0= ruleprogram
            {
             
            	        newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleprogram_in_rulepascal130);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:106:1: entryRuleprogram returns [String current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final String entryRuleprogram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:107:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:108:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram166);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram177); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:115:1: ruleprogram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleprogram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_program_heading_block_0 = null;

        AntlrDatatypeRuleToken this_block_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:118:28: ( (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= '.' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:119:1: (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= '.' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:119:1: (this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= '.' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:120:5: this_program_heading_block_0= ruleprogram_heading_block this_block_1= ruleblock kw= '.'
            {
             
                    newCompositeNode(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprogram_heading_block_in_ruleprogram224);
            this_program_heading_block_0=ruleprogram_heading_block();

            state._fsp--;


            		current.merge(this_program_heading_block_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleblock_in_ruleprogram251);
            this_block_1=ruleblock();

            state._fsp--;


            		current.merge(this_block_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,52,FOLLOW_52_in_ruleprogram269); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:155:1: entryRuleprogram_heading_block returns [String current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final String entryRuleprogram_heading_block() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprogram_heading_block = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:156:2: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:157:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block310);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading_block321); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:164:1: ruleprogram_heading_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:167:28: ( (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:168:1: (kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:169:2: kw= 'program' this_IDENTIFIER_1= RULE_IDENTIFIER (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )? kw= ';'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleprogram_heading_block359); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:181:1: (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==54) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:182:2: kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleprogram_heading_block393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleprogram_heading_block433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,56,FOLLOW_56_in_ruleprogram_heading_block448); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:218:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:219:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:220:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list489);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list500); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:227:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:230:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:231:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:231:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:231:6: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list540); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:238:1: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:239:2: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleidentifier_list559); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list574); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:259:1: entryRuleblock returns [String current=null] : iv_ruleblock= ruleblock EOF ;
    public final String entryRuleblock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblock = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:260:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:261:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock622);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock633); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:268:1: ruleblock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) ;
    public final AntlrDatatypeRuleToken ruleblock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_statement_part_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:271:28: ( (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:272:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:272:1: (this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:273:5: this_declaration_part_0= ruledeclaration_part this_statement_part_1= rulestatement_part
            {
             
                    newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock680);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock707);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:302:1: entryRulestatement_part returns [String current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final String entryRulestatement_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:303:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:304:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part753);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part764); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:311:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEGIN_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:314:28: ( (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:315:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:315:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:315:6: this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_BEGIN_KEYWORD_0=(Token)match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part804); 

            		current.merge(this_BEGIN_KEYWORD_0);
                
             
                newLeafNode(this_BEGIN_KEYWORD_0, grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part831);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulestatement_part851); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:348:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:349:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:350:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence897);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence908); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:357:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:360:28: ( (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:361:1: (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:361:1: (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:362:5: this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence955);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:372:1: (kw= ';' this_statement_2= rulestatement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==56) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:373:2: kw= ';' this_statement_2= rulestatement
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_rulestatement_sequence974); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence996);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:397:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:398:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:399:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1044);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1055); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:406:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_0= rulelabel kw= ':' )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_0 = null;

        AntlrDatatypeRuleToken this_simple_statement_2 = null;

        AntlrDatatypeRuleToken this_structured_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:409:28: ( ( (this_label_0= rulelabel kw= ':' )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:1: ( (this_label_0= rulelabel kw= ':' )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:1: ( (this_label_0= rulelabel kw= ':' )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:2: (this_label_0= rulelabel kw= ':' )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:2: (this_label_0= rulelabel kw= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_SIGNED_INTEGER_NUMBER && LA4_0<=RULE_INTEGER_NUMBER)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:411:5: this_label_0= rulelabel kw= ':'
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1103);
                    this_label_0=rulelabel();

                    state._fsp--;


                    		current.merge(this_label_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,58,FOLLOW_58_in_rulestatement1121); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:427:3: (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==RULE_IDENTIFIER||LA5_0==RULE_END_KEYWORD||LA5_0==RULE_UNTIL_KEYWORD||LA5_0==RULE_ELSE_KEYWORD||LA5_0==RULE_GOTO_KEYWORD||LA5_0==56) ) {
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:428:5: this_simple_statement_2= rulesimple_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1146);
                    this_simple_statement_2=rulesimple_statement();

                    state._fsp--;


                    		current.merge(this_simple_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:440:5: this_structured_statement_3= rulestructured_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement1179);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:458:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:459:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:460:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1226);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1237); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:467:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_INTEGER_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:470:28: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:471:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:471:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:471:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1277); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getLabelAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:479:10: this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_1=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1303); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:494:1: entryRulesimple_statement returns [String current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final String entryRulesimple_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:495:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:496:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1349);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1360); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:503:1: rulesimple_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement )? ;
    public final AntlrDatatypeRuleToken rulesimple_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_assignment_statement_0 = null;

        AntlrDatatypeRuleToken this_function_designator_1 = null;

        AntlrDatatypeRuleToken this_goto_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:506:28: ( (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:507:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:507:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement )?
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENTIFIER) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==54) ) {
                    alt7=2;
                }
                else if ( (LA7_1==59) ) {
                    alt7=1;
                }
            }
            else if ( (LA7_0==RULE_GOTO_KEYWORD) ) {
                alt7=3;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:508:5: this_assignment_statement_0= ruleassignment_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1407);
                    this_assignment_statement_0=ruleassignment_statement();

                    state._fsp--;


                    		current.merge(this_assignment_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:520:5: this_function_designator_1= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulesimple_statement1440);
                    this_function_designator_1=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:532:5: this_goto_statement_2= rulegoto_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement1473);
                    this_goto_statement_2=rulegoto_statement();

                    state._fsp--;


                    		current.merge(this_goto_statement_2);
                        
                     
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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:550:1: entryRuleassignment_statement returns [String current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final String entryRuleassignment_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:551:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:552:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1520);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1531); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:559:1: ruleassignment_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruleassignment_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:562:28: ( (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:563:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:563:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:564:5: this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression
            {
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1578);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,59,FOLLOW_59_in_ruleassignment_statement1596); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1618);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:599:1: entryRulevariable returns [String current=null] : iv_rulevariable= rulevariable EOF ;
    public final String entryRulevariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:600:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:601:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1664);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1675); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:608:1: rulevariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_entire_variable_0= ruleentire_variable ;
    public final AntlrDatatypeRuleToken rulevariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_entire_variable_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:611:28: (this_entire_variable_0= ruleentire_variable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:613:5: this_entire_variable_0= ruleentire_variable
            {
             
                    newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleentire_variable_in_rulevariable1721);
            this_entire_variable_0=ruleentire_variable();

            state._fsp--;


            		current.merge(this_entire_variable_0);
                
             
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleentire_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:631:1: entryRuleentire_variable returns [String current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final String entryRuleentire_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentire_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:632:2: (iv_ruleentire_variable= ruleentire_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:633:2: iv_ruleentire_variable= ruleentire_variable EOF
            {
             newCompositeNode(grammarAccess.getEntire_variableRule()); 
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable1766);
            iv_ruleentire_variable=ruleentire_variable();

            state._fsp--;

             current =iv_ruleentire_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable1777); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:640:1: ruleentire_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleentire_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:643:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:644:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable1816); 

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


    // $ANTLR start "entryRuleindexed_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:661:1: entryRuleindexed_variable returns [String current=null] : iv_ruleindexed_variable= ruleindexed_variable EOF ;
    public final String entryRuleindexed_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindexed_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:662:2: (iv_ruleindexed_variable= ruleindexed_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:663:2: iv_ruleindexed_variable= ruleindexed_variable EOF
            {
             newCompositeNode(grammarAccess.getIndexed_variableRule()); 
            pushFollow(FOLLOW_ruleindexed_variable_in_entryRuleindexed_variable1863);
            iv_ruleindexed_variable=ruleindexed_variable();

            state._fsp--;

             current =iv_ruleindexed_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindexed_variable1874); 

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
    // $ANTLR end "entryRuleindexed_variable"


    // $ANTLR start "ruleindexed_variable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:670:1: ruleindexed_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= '[' this_expression_list_2= ruleexpression_list kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleindexed_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:673:28: ( (this_variable_0= rulevariable kw= '[' this_expression_list_2= ruleexpression_list kw= ']' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:674:1: (this_variable_0= rulevariable kw= '[' this_expression_list_2= ruleexpression_list kw= ']' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:674:1: (this_variable_0= rulevariable kw= '[' this_expression_list_2= ruleexpression_list kw= ']' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:675:5: this_variable_0= rulevariable kw= '[' this_expression_list_2= ruleexpression_list kw= ']'
            {
             
                    newCompositeNode(grammarAccess.getIndexed_variableAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleindexed_variable1921);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,60,FOLLOW_60_in_ruleindexed_variable1939); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIndexed_variableAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getIndexed_variableAccess().getExpression_listParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_list_in_ruleindexed_variable1961);
            this_expression_list_2=ruleexpression_list();

            state._fsp--;


            		current.merge(this_expression_list_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,61,FOLLOW_61_in_ruleindexed_variable1979); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIndexed_variableAccess().getRightSquareBracketKeyword_3()); 
                

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
    // $ANTLR end "ruleindexed_variable"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:716:1: entryRuleexpression_list returns [String current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final String entryRuleexpression_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:717:2: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:718:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list2020);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list2031); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:725:1: ruleexpression_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpression_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:728:28: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:729:1: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:729:1: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:730:5: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )*
            {
             
                    newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2078);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:740:1: (kw= ',' this_expression_2= ruleexpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==57) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:741:2: kw= ',' this_expression_2= ruleexpression
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleexpression_list2097); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2119);
            	    this_expression_2=ruleexpression();

            	    state._fsp--;


            	    		current.merge(this_expression_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:765:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:766:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:767:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2167);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2178); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:774:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RELATIONAL_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_simple_expression_0 = null;

        AntlrDatatypeRuleToken this_simple_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:777:28: ( (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:778:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:778:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:779:5: this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2225);
            this_simple_expression_0=rulesimple_expression();

            state._fsp--;


            		current.merge(this_simple_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:789:1: (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_RELATIONAL_OPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:789:6: this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression
                    {
                    this_RELATIONAL_OPERATOR_1=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2246); 

                    		current.merge(this_RELATIONAL_OPERATOR_1);
                        
                     
                        newLeafNode(this_RELATIONAL_OPERATOR_1, grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2273);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:815:1: entryRulesimple_expression returns [String current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final String entryRulesimple_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:816:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:817:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2321);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2332); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:824:1: rulesimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:827:28: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:828:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:828:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:828:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:828:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ADDITION_OPERATOR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:828:7: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                    {
                    this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2373); 

                    		current.merge(this_ADDITION_OPERATOR_0);
                        
                     
                        newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2402);
            this_term_1=ruleterm();

            state._fsp--;


            		current.merge(this_term_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:1: ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ADDITION_OPERATOR && LA13_0<=RULE_OR_KEYWORD)) ) {
                    alt13=1;
                }
                else if ( (LA13_0==RULE_SIGNED_INTEGER_NUMBER||LA13_0==RULE_SIGNED_REAL_NUMBER) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD ) this_term_4= ruleterm
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | this_OR_KEYWORD_3= RULE_OR_KEYWORD )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_ADDITION_OPERATOR) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==RULE_OR_KEYWORD) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
            	            int cnt11=0;
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==RULE_ADDITION_OPERATOR) ) {
            	                    alt11=1;
            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:846:9: this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR
            	            	    {
            	            	    this_ADDITION_OPERATOR_2=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2426); 

            	            	    		current.merge(this_ADDITION_OPERATOR_2);
            	            	        
            	            	     
            	            	        newLeafNode(this_ADDITION_OPERATOR_2, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
            	            	        

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt11 >= 1 ) break loop11;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(11, input);
            	                        throw eee;
            	                }
            	                cnt11++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:854:10: this_OR_KEYWORD_3= RULE_OR_KEYWORD
            	            {
            	            this_OR_KEYWORD_3=(Token)match(input,RULE_OR_KEYWORD,FOLLOW_RULE_OR_KEYWORD_in_rulesimple_expression2454); 

            	            		current.merge(this_OR_KEYWORD_3);
            	                
            	             
            	                newLeafNode(this_OR_KEYWORD_3, grammarAccess.getSimple_expressionAccess().getOR_KEYWORDTerminalRuleCall_2_0_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2482);
            	    this_term_4=ruleterm();

            	    state._fsp--;


            	    		current.merge(this_term_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:874:5: this_signed_number_5= rulesigned_number
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulesigned_number_in_rulesimple_expression2516);
            	    this_signed_number_5=rulesigned_number();

            	    state._fsp--;


            	    		current.merge(this_signed_number_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:892:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:893:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:894:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2564);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2575); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:901:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTIPLICATION_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_factor_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:904:28: ( (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:905:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:905:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:906:5: this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefactor_in_ruleterm2622);
            this_factor_0=rulefactor();

            state._fsp--;


            		current.merge(this_factor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:916:1: (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:916:6: this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor
            	    {
            	    this_MULTIPLICATION_OPERATOR_1=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2643); 

            	    		current.merge(this_MULTIPLICATION_OPERATOR_1);
            	        
            	     
            	        newLeafNode(this_MULTIPLICATION_OPERATOR_1, grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2670);
            	    this_factor_2=rulefactor();

            	    state._fsp--;


            	    		current.merge(this_factor_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:942:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:943:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:944:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2718);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2729); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:951:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) ) ;
    public final AntlrDatatypeRuleToken rulefactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_NIL_KEYWORD_4=null;
        Token kw=null;
        Token this_NOT_KEYWORD_9=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_number_1 = null;

        AntlrDatatypeRuleToken this_set_3 = null;

        AntlrDatatypeRuleToken this_function_designator_5 = null;

        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_factor_10 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:954:28: ( (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:955:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:955:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )
            int alt15=8;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:956:5: this_variable_0= rulevariable
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2776);
                    this_variable_0=rulevariable();

                    state._fsp--;


                    		current.merge(this_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:968:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2809);
                    this_number_1=rulenumber();

                    state._fsp--;


                    		current.merge(this_number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:979:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2835); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:988:5: this_set_3= ruleset
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_in_rulefactor2868);
                    this_set_3=ruleset();

                    state._fsp--;


                    		current.merge(this_set_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:999:10: this_NIL_KEYWORD_4= RULE_NIL_KEYWORD
                    {
                    this_NIL_KEYWORD_4=(Token)match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rulefactor2894); 

                    		current.merge(this_NIL_KEYWORD_4);
                        
                     
                        newLeafNode(this_NIL_KEYWORD_4, grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1008:5: this_function_designator_5= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor2927);
                    this_function_designator_5=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1019:6: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1019:6: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1020:2: kw= '(' this_expression_7= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulefactor2952); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor2974);
                    this_expression_7=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,55,FOLLOW_55_in_rulefactor2992); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1043:6: (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1043:6: (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1043:11: this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor
                    {
                    this_NOT_KEYWORD_9=(Token)match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rulefactor3015); 

                    		current.merge(this_NOT_KEYWORD_9);
                        
                     
                        newLeafNode(this_NOT_KEYWORD_9, grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3042);
                    this_factor_10=rulefactor();

                    state._fsp--;


                    		current.merge(this_factor_10);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1069:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1070:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1071:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3089);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3100); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1078:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unsigned_number_0 = null;

        AntlrDatatypeRuleToken this_signed_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1081:28: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1082:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1082:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INTEGER_NUMBER||LA16_0==RULE_REAL_NUMBER) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SIGNED_INTEGER_NUMBER||LA16_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1083:5: this_unsigned_number_0= ruleunsigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunsigned_number_in_rulenumber3147);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    		current.merge(this_unsigned_number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1095:5: this_signed_number_1= rulesigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesigned_number_in_rulenumber3180);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1113:1: entryRuleunsigned_number returns [String current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final String entryRuleunsigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1114:2: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1115:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3226);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3237); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1122:1: ruleunsigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;
        Token this_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1125:28: ( (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1126:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1126:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INTEGER_NUMBER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_REAL_NUMBER) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1126:6: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3277); 

                    		current.merge(this_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1134:10: this_REAL_NUMBER_1= RULE_REAL_NUMBER
                    {
                    this_REAL_NUMBER_1=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3303); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1149:1: entryRulesigned_number returns [String current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final String entryRulesigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1150:2: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1151:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3349);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3360); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1158:1: rulesigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulesigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_SIGNED_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:28: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1162:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1162:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1162:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3400); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1170:10: this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER
                    {
                    this_SIGNED_REAL_NUMBER_1=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3426); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1185:1: entryRuleset returns [String current=null] : iv_ruleset= ruleset EOF ;
    public final String entryRuleset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1186:2: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1187:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3472);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3483); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1194:1: ruleset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_expression_list_1= ruleexpression_list )? kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1197:28: ( (kw= '[' (this_expression_list_1= ruleexpression_list )? kw= ']' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1198:1: (kw= '[' (this_expression_list_1= ruleexpression_list )? kw= ']' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1198:1: (kw= '[' (this_expression_list_1= ruleexpression_list )? kw= ']' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1199:2: kw= '[' (this_expression_list_1= ruleexpression_list )? kw= ']'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleset3521); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1204:1: (this_expression_list_1= ruleexpression_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER||(LA19_0>=RULE_SIGNED_INTEGER_NUMBER && LA19_0<=RULE_INTEGER_NUMBER)||LA19_0==RULE_ADDITION_OPERATOR||(LA19_0>=RULE_STRING && LA19_0<=RULE_SIGNED_REAL_NUMBER)||LA19_0==54||LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1205:5: this_expression_list_1= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3544);
                    this_expression_list_1=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,61,FOLLOW_61_in_ruleset3564); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1229:1: entryRulefunction_designator returns [String current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final String entryRulefunction_designator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1230:2: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1231:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3605);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3616); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1238:1: rulefunction_designator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '(' (this_expression_list_2= ruleexpression_list )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulefunction_designator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1241:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '(' (this_expression_list_2= ruleexpression_list )? kw= ')' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1242:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '(' (this_expression_list_2= ruleexpression_list )? kw= ')' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1242:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '(' (this_expression_list_2= ruleexpression_list )? kw= ')' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1242:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '(' (this_expression_list_2= ruleexpression_list )? kw= ')'
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3656); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,54,FOLLOW_54_in_rulefunction_designator3674); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1255:1: (this_expression_list_2= ruleexpression_list )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER||(LA20_0>=RULE_SIGNED_INTEGER_NUMBER && LA20_0<=RULE_INTEGER_NUMBER)||LA20_0==RULE_ADDITION_OPERATOR||(LA20_0>=RULE_STRING && LA20_0<=RULE_SIGNED_REAL_NUMBER)||LA20_0==54||LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1256:5: this_expression_list_2= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3697);
                    this_expression_list_2=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,55,FOLLOW_55_in_rulefunction_designator3717); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1280:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1281:2: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1282:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement3758);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement3769); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1289:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_statement_0 = null;

        AntlrDatatypeRuleToken this_repetitive_statement_1 = null;

        AntlrDatatypeRuleToken this_conditional_statement_2 = null;

        AntlrDatatypeRuleToken this_with_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1292:28: ( (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1293:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1293:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_BEGIN_KEYWORD:
                {
                alt21=1;
                }
                break;
            case RULE_WHILE_KEYWORD:
            case RULE_REPEAT_KEYWORD:
            case RULE_FOR_KEYWORD:
                {
                alt21=2;
                }
                break;
            case RULE_IF_KEYWORD:
            case RULE_CASE_KEYWORD:
                {
                alt21=3;
                }
                break;
            case RULE_WITH_KEYWORD:
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1294:5: this_compound_statement_0= rulecompound_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement3816);
                    this_compound_statement_0=rulecompound_statement();

                    state._fsp--;


                    		current.merge(this_compound_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1306:5: this_repetitive_statement_1= rulerepetitive_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement3849);
                    this_repetitive_statement_1=rulerepetitive_statement();

                    state._fsp--;


                    		current.merge(this_repetitive_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1318:5: this_conditional_statement_2= ruleconditional_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement3882);
                    this_conditional_statement_2=ruleconditional_statement();

                    state._fsp--;


                    		current.merge(this_conditional_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1330:5: this_with_statement_3= rulewith_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement3915);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1348:1: entryRulecompound_statement returns [String current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final String entryRulecompound_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1349:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1350:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement3961);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement3972); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1357:1: rulecompound_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulecompound_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEGIN_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1360:28: ( (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1361:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1361:1: (this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1361:6: this_BEGIN_KEYWORD_0= RULE_BEGIN_KEYWORD this_statement_sequence_1= rulestatement_sequence this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_BEGIN_KEYWORD_0=(Token)match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rulecompound_statement4012); 

            		current.merge(this_BEGIN_KEYWORD_0);
                
             
                newLeafNode(this_BEGIN_KEYWORD_0, grammarAccess.getCompound_statementAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4039);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulecompound_statement4059); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1394:1: entryRulerepetitive_statement returns [String current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final String entryRulerepetitive_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1395:2: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1396:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4105);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4116); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1403:1: rulerepetitive_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) ;
    public final AntlrDatatypeRuleToken rulerepetitive_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_while_statement_0 = null;

        AntlrDatatypeRuleToken this_repeat_statement_1 = null;

        AntlrDatatypeRuleToken this_for_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1406:28: ( (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1407:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1407:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_WHILE_KEYWORD:
                {
                alt22=1;
                }
                break;
            case RULE_REPEAT_KEYWORD:
                {
                alt22=2;
                }
                break;
            case RULE_FOR_KEYWORD:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1408:5: this_while_statement_0= rulewhile_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4163);
                    this_while_statement_0=rulewhile_statement();

                    state._fsp--;


                    		current.merge(this_while_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1420:5: this_repeat_statement_1= rulerepeat_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4196);
                    this_repeat_statement_1=rulerepeat_statement();

                    state._fsp--;


                    		current.merge(this_repeat_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1432:5: this_for_statement_2= rulefor_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4229);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1450:1: entryRulewhile_statement returns [String current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final String entryRulewhile_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1451:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1452:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4275);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4286); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1459:1: rulewhile_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewhile_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHILE_KEYWORD_0=null;
        Token this_DO_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1462:28: ( (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1463:1: (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1463:1: (this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1463:6: this_WHILE_KEYWORD_0= RULE_WHILE_KEYWORD this_expression_1= ruleexpression this_DO_KEYWORD_2= RULE_DO_KEYWORD this_statement_3= rulestatement
            {
            this_WHILE_KEYWORD_0=(Token)match(input,RULE_WHILE_KEYWORD,FOLLOW_RULE_WHILE_KEYWORD_in_rulewhile_statement4326); 

            		current.merge(this_WHILE_KEYWORD_0);
                
             
                newLeafNode(this_WHILE_KEYWORD_0, grammarAccess.getWhile_statementAccess().getWHILE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4353);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_DO_KEYWORD_2=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulewhile_statement4373); 

            		current.merge(this_DO_KEYWORD_2);
                
             
                newLeafNode(this_DO_KEYWORD_2, grammarAccess.getWhile_statementAccess().getDO_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4400);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1507:1: entryRulerepeat_statement returns [String current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final String entryRulerepeat_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1508:2: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1509:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4446);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4457); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1516:1: rulerepeat_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerepeat_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REPEAT_KEYWORD_0=null;
        Token this_UNTIL_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1519:28: ( (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1520:1: (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1520:1: (this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1520:6: this_REPEAT_KEYWORD_0= RULE_REPEAT_KEYWORD this_statement_sequence_1= rulestatement_sequence this_UNTIL_KEYWORD_2= RULE_UNTIL_KEYWORD this_expression_3= ruleexpression
            {
            this_REPEAT_KEYWORD_0=(Token)match(input,RULE_REPEAT_KEYWORD,FOLLOW_RULE_REPEAT_KEYWORD_in_rulerepeat_statement4497); 

            		current.merge(this_REPEAT_KEYWORD_0);
                
             
                newLeafNode(this_REPEAT_KEYWORD_0, grammarAccess.getRepeat_statementAccess().getREPEAT_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4524);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_UNTIL_KEYWORD_2=(Token)match(input,RULE_UNTIL_KEYWORD,FOLLOW_RULE_UNTIL_KEYWORD_in_rulerepeat_statement4544); 

            		current.merge(this_UNTIL_KEYWORD_2);
                
             
                newLeafNode(this_UNTIL_KEYWORD_2, grammarAccess.getRepeat_statementAccess().getUNTIL_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4571);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1564:1: entryRulefor_statement returns [String current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final String entryRulefor_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1565:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1566:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4617);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4628); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1573:1: rulefor_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1576:28: ( (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1577:1: (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1577:1: (this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1577:6: this_FOR_KEYWORD_0= RULE_FOR_KEYWORD this_assignment_statement_1= ruleassignment_statement (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD ) this_expression_4= ruleexpression this_DO_KEYWORD_5= RULE_DO_KEYWORD this_statement_6= rulestatement
            {
            this_FOR_KEYWORD_0=(Token)match(input,RULE_FOR_KEYWORD,FOLLOW_RULE_FOR_KEYWORD_in_rulefor_statement4668); 

            		current.merge(this_FOR_KEYWORD_0);
                
             
                newLeafNode(this_FOR_KEYWORD_0, grammarAccess.getFor_statementAccess().getFOR_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4695);
            this_assignment_statement_1=ruleassignment_statement();

            state._fsp--;


            		current.merge(this_assignment_statement_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1595:1: (this_TO_KEYWORD_2= RULE_TO_KEYWORD | this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_TO_KEYWORD) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_DOWNTO_KEYWORD) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1595:6: this_TO_KEYWORD_2= RULE_TO_KEYWORD
                    {
                    this_TO_KEYWORD_2=(Token)match(input,RULE_TO_KEYWORD,FOLLOW_RULE_TO_KEYWORD_in_rulefor_statement4716); 

                    		current.merge(this_TO_KEYWORD_2);
                        
                     
                        newLeafNode(this_TO_KEYWORD_2, grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1603:10: this_DOWNTO_KEYWORD_3= RULE_DOWNTO_KEYWORD
                    {
                    this_DOWNTO_KEYWORD_3=(Token)match(input,RULE_DOWNTO_KEYWORD,FOLLOW_RULE_DOWNTO_KEYWORD_in_rulefor_statement4742); 

                    		current.merge(this_DOWNTO_KEYWORD_3);
                        
                     
                        newLeafNode(this_DOWNTO_KEYWORD_3, grammarAccess.getFor_statementAccess().getDOWNTO_KEYWORDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4770);
            this_expression_4=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_4);
                
             
                    afterParserOrEnumRuleCall();
                
            this_DO_KEYWORD_5=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulefor_statement4790); 

            		current.merge(this_DO_KEYWORD_5);
                
             
                newLeafNode(this_DO_KEYWORD_5, grammarAccess.getFor_statementAccess().getDO_KEYWORDTerminalRuleCall_4()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4817);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1647:1: entryRuleconditional_statement returns [String current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final String entryRuleconditional_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1648:2: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1649:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4863);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement4874); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1656:1: ruleconditional_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) ;
    public final AntlrDatatypeRuleToken ruleconditional_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_if_statement_0 = null;

        AntlrDatatypeRuleToken this_case_statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1659:28: ( (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1660:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1660:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IF_KEYWORD) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_CASE_KEYWORD) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1661:5: this_if_statement_0= ruleif_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getIf_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement4921);
                    this_if_statement_0=ruleif_statement();

                    state._fsp--;


                    		current.merge(this_if_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1673:5: this_case_statement_1= rulecase_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getCase_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement4954);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1691:1: entryRuleif_statement returns [String current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final String entryRuleif_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1692:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1693:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement5000);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement5011); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1700:1: ruleif_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1703:28: ( (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1704:1: (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1704:1: (this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1704:6: this_IF_KEYWORD_0= RULE_IF_KEYWORD this_expression_1= ruleexpression this_THEN_KEYWORD_2= RULE_THEN_KEYWORD this_statement_3= rulestatement (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )?
            {
            this_IF_KEYWORD_0=(Token)match(input,RULE_IF_KEYWORD,FOLLOW_RULE_IF_KEYWORD_in_ruleif_statement5051); 

            		current.merge(this_IF_KEYWORD_0);
                
             
                newLeafNode(this_IF_KEYWORD_0, grammarAccess.getIf_statementAccess().getIF_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5078);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_THEN_KEYWORD_2=(Token)match(input,RULE_THEN_KEYWORD,FOLLOW_RULE_THEN_KEYWORD_in_ruleif_statement5098); 

            		current.merge(this_THEN_KEYWORD_2);
                
             
                newLeafNode(this_THEN_KEYWORD_2, grammarAccess.getIf_statementAccess().getTHEN_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5125);
            this_statement_3=rulestatement();

            state._fsp--;


            		current.merge(this_statement_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1740:1: (this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ELSE_KEYWORD) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1740:6: this_ELSE_KEYWORD_4= RULE_ELSE_KEYWORD this_statement_5= rulestatement
                    {
                    this_ELSE_KEYWORD_4=(Token)match(input,RULE_ELSE_KEYWORD,FOLLOW_RULE_ELSE_KEYWORD_in_ruleif_statement5146); 

                    		current.merge(this_ELSE_KEYWORD_4);
                        
                     
                        newLeafNode(this_ELSE_KEYWORD_4, grammarAccess.getIf_statementAccess().getELSE_KEYWORDTerminalRuleCall_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5173);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1766:1: entryRulecase_statement returns [String current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final String entryRulecase_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1767:2: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1768:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5221);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5232); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1775:1: rulecase_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= ';' this_case_limb_5= rulecase_limb )* (kw= ';' )? this_END_KEYWORD_7= RULE_END_KEYWORD ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1778:28: ( (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= ';' this_case_limb_5= rulecase_limb )* (kw= ';' )? this_END_KEYWORD_7= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1779:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= ';' this_case_limb_5= rulecase_limb )* (kw= ';' )? this_END_KEYWORD_7= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1779:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= ';' this_case_limb_5= rulecase_limb )* (kw= ';' )? this_END_KEYWORD_7= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1779:6: this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_expression_1= ruleexpression this_OF_KEYWORD_2= RULE_OF_KEYWORD this_case_limb_3= rulecase_limb (kw= ';' this_case_limb_5= rulecase_limb )* (kw= ';' )? this_END_KEYWORD_7= RULE_END_KEYWORD
            {
            this_CASE_KEYWORD_0=(Token)match(input,RULE_CASE_KEYWORD,FOLLOW_RULE_CASE_KEYWORD_in_rulecase_statement5272); 

            		current.merge(this_CASE_KEYWORD_0);
                
             
                newLeafNode(this_CASE_KEYWORD_0, grammarAccess.getCase_statementAccess().getCASE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement5299);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_OF_KEYWORD_2=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulecase_statement5319); 

            		current.merge(this_OF_KEYWORD_2);
                
             
                newLeafNode(this_OF_KEYWORD_2, grammarAccess.getCase_statementAccess().getOF_KEYWORDTerminalRuleCall_2()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5346);
            this_case_limb_3=rulecase_limb();

            state._fsp--;


            		current.merge(this_case_limb_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1815:1: (kw= ';' this_case_limb_5= rulecase_limb )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==56) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_IDENTIFIER||(LA26_1>=RULE_SIGNED_INTEGER_NUMBER && LA26_1<=RULE_INTEGER_NUMBER)||LA26_1==RULE_ADDITION_OPERATOR||LA26_1==RULE_STRING||(LA26_1>=RULE_REAL_NUMBER && LA26_1<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1816:2: kw= ';' this_case_limb_5= rulecase_limb
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_rulecase_statement5365); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_4_1()); 
            	        
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5387);
            	    this_case_limb_5=rulecase_limb();

            	    state._fsp--;


            	    		current.merge(this_case_limb_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1832:3: (kw= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1833:2: kw= ';'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_rulecase_statement5408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 
                        

                    }
                    break;

            }

            this_END_KEYWORD_7=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulecase_statement5425); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1853:1: entryRulecase_limb returns [String current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final String entryRulecase_limb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1854:2: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1855:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5471);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5482); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1862:1: rulecase_limb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= ':' this_statement_2= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulecase_limb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1865:28: ( (this_case_label_list_0= rulecase_label_list kw= ':' this_statement_2= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1866:1: (this_case_label_list_0= rulecase_label_list kw= ':' this_statement_2= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1866:1: (this_case_label_list_0= rulecase_label_list kw= ':' this_statement_2= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1867:5: this_case_label_list_0= rulecase_label_list kw= ':' this_statement_2= rulestatement
            {
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5529);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,58,FOLLOW_58_in_rulecase_limb5547); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_limbAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5569);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1902:1: entryRulecase_label_list returns [String current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final String entryRulecase_label_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1903:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1904:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5615);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5626); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1911:1: rulecase_label_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* ) ;
    public final AntlrDatatypeRuleToken rulecase_label_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1914:28: ( (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1915:1: (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1915:1: (this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1916:5: this_constant_0= ruleconstant (kw= ',' this_constant_2= ruleconstant )*
            {
             
                    newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5673);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1926:1: (kw= ',' this_constant_2= ruleconstant )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==57) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1927:2: kw= ',' this_constant_2= ruleconstant
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_rulecase_label_list5692); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5714);
            	    this_constant_2=ruleconstant();

            	    state._fsp--;


            	    		current.merge(this_constant_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1951:1: entryRuleconstant returns [String current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final String entryRuleconstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1952:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1953:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant5762);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant5773); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1960:1: ruleconstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleconstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_0=null;
        Token this_IDENTIFIER_1=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_number_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1963:28: ( ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_IDENTIFIER||(LA31_0>=RULE_SIGNED_INTEGER_NUMBER && LA31_0<=RULE_INTEGER_NUMBER)||LA31_0==RULE_ADDITION_OPERATOR||(LA31_0>=RULE_REAL_NUMBER && LA31_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ADDITION_OPERATOR) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1964:8: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                            {
                            this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5815); 

                            		current.merge(this_ADDITION_OPERATOR_0);
                                
                             
                                newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getConstantAccess().getADDITION_OPERATORTerminalRuleCall_0_0()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1971:3: (this_IDENTIFIER_1= RULE_IDENTIFIER | this_number_2= rulenumber )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_IDENTIFIER) ) {
                        alt30=1;
                    }
                    else if ( ((LA30_0>=RULE_SIGNED_INTEGER_NUMBER && LA30_0<=RULE_INTEGER_NUMBER)||(LA30_0>=RULE_REAL_NUMBER && LA30_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1971:8: this_IDENTIFIER_1= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant5838); 

                            		current.merge(this_IDENTIFIER_1);
                                
                             
                                newLeafNode(this_IDENTIFIER_1, grammarAccess.getConstantAccess().getIDENTIFIERTerminalRuleCall_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1980:5: this_number_2= rulenumber
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant5871);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1991:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant5899); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2006:1: entryRulewith_statement returns [String current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final String entryRulewith_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2007:2: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2008:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement5945);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement5956); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2015:1: rulewith_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= ',' this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2018:28: ( (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= ',' this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2019:1: (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= ',' this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2019:1: (this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= ',' this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2019:6: this_WITH_KEYWORD_0= RULE_WITH_KEYWORD this_variable_1= rulevariable (kw= ',' this_variable_3= rulevariable )* this_DO_KEYWORD_4= RULE_DO_KEYWORD this_statement_5= rulestatement
            {
            this_WITH_KEYWORD_0=(Token)match(input,RULE_WITH_KEYWORD,FOLLOW_RULE_WITH_KEYWORD_in_rulewith_statement5996); 

            		current.merge(this_WITH_KEYWORD_0);
                
             
                newLeafNode(this_WITH_KEYWORD_0, grammarAccess.getWith_statementAccess().getWITH_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement6023);
            this_variable_1=rulevariable();

            state._fsp--;


            		current.merge(this_variable_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2037:1: (kw= ',' this_variable_3= rulevariable )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==57) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2038:2: kw= ',' this_variable_3= rulevariable
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_rulewith_statement6042); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement6064);
            	    this_variable_3=rulevariable();

            	    state._fsp--;


            	    		current.merge(this_variable_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            this_DO_KEYWORD_4=(Token)match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rulewith_statement6086); 

            		current.merge(this_DO_KEYWORD_4);
                
             
                newLeafNode(this_DO_KEYWORD_4, grammarAccess.getWith_statementAccess().getDO_KEYWORDTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement6113);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2080:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2081:2: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2082:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement6159);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement6170); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2089:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel ) ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GOTO_KEYWORD_0=null;
        AntlrDatatypeRuleToken this_label_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2092:28: ( (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2093:1: (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2093:1: (this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2093:6: this_GOTO_KEYWORD_0= RULE_GOTO_KEYWORD this_label_1= rulelabel
            {
            this_GOTO_KEYWORD_0=(Token)match(input,RULE_GOTO_KEYWORD,FOLLOW_RULE_GOTO_KEYWORD_in_rulegoto_statement6210); 

            		current.merge(this_GOTO_KEYWORD_0);
                
             
                newLeafNode(this_GOTO_KEYWORD_0, grammarAccess.getGoto_statementAccess().getGOTO_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement6237);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2119:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2120:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2121:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6283);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part6294); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2128:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_constant_definition_part_1 = null;

        AntlrDatatypeRuleToken this_type_definition_part_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2131:28: ( ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2132:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2132:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2132:2: (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2132:2: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LABEL_KEYWORD) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2133:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6342);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2143:3: (this_constant_definition_part_1= ruleconstant_definition_part )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_CONST_KEYWORD) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2144:5: this_constant_definition_part_1= ruleconstant_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6372);
                    this_constant_definition_part_1=ruleconstant_definition_part();

                    state._fsp--;


                    		current.merge(this_constant_definition_part_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2154:3: (this_type_definition_part_2= ruletype_definition_part )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_TYPE_KEYWORD) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2155:5: this_type_definition_part_2= ruletype_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruledeclaration_part6402);
                    this_type_definition_part_2=ruletype_definition_part();

                    state._fsp--;


                    		current.merge(this_type_definition_part_2);
                        
                     
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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2173:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2174:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2175:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6450);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part6461); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2182:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LABEL_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2185:28: ( (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2186:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2186:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2186:6: this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';'
            {
            this_LABEL_KEYWORD_0=(Token)match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part6501); 

            		current.merge(this_LABEL_KEYWORD_0);
                
             
                newLeafNode(this_LABEL_KEYWORD_0, grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6528);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2204:1: (kw= ',' this_label_3= rulelabel )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==57) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2205:2: kw= ',' this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_rulelabel_declaration_part6547); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6569);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            kw=(Token)match(input,56,FOLLOW_56_in_rulelabel_declaration_part6589); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2235:1: entryRuleconstant_definition_part returns [String current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final String entryRuleconstant_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2236:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2237:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6630);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6641); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2244:1: ruleconstant_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= ';' )+ ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2247:28: ( (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= ';' )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2248:1: (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= ';' )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2248:1: (this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= ';' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2248:6: this_CONST_KEYWORD_0= RULE_CONST_KEYWORD (this_constant_definition_1= ruleconstant_definition kw= ';' )+
            {
            this_CONST_KEYWORD_0=(Token)match(input,RULE_CONST_KEYWORD,FOLLOW_RULE_CONST_KEYWORD_in_ruleconstant_definition_part6681); 

            		current.merge(this_CONST_KEYWORD_0);
                
             
                newLeafNode(this_CONST_KEYWORD_0, grammarAccess.getConstant_definition_partAccess().getCONST_KEYWORDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2255:1: (this_constant_definition_1= ruleconstant_definition kw= ';' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_IDENTIFIER) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2256:5: this_constant_definition_1= ruleconstant_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6709);
            	    this_constant_definition_1=ruleconstant_definition();

            	    state._fsp--;


            	    		current.merge(this_constant_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleconstant_definition_part6727); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2280:1: entryRuleconstant_definition returns [String current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final String entryRuleconstant_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2281:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2282:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6770);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition6781); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2289:1: ruleconstant_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2292:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2293:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2293:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2293:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_constant_2= ruleconstant
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition6821); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getConstant_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,62,FOLLOW_62_in_ruleconstant_definition6839); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition6861);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2325:1: entryRuletype_definition_part returns [String current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final String entryRuletype_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2326:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2327:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6907);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part6918); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2334:1: ruletype_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= ';' )+ ) ;
    public final AntlrDatatypeRuleToken ruletype_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2337:28: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= ';' )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2338:1: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= ';' )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2338:1: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= ';' )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2338:6: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD (this_type_definition_1= ruletype_definition kw= ';' )+
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FOLLOW_RULE_TYPE_KEYWORD_in_ruletype_definition_part6958); 

            		current.merge(this_TYPE_KEYWORD_0);
                
             
                newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getType_definition_partAccess().getTYPE_KEYWORDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2345:1: (this_type_definition_1= ruletype_definition kw= ';' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_IDENTIFIER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2346:5: this_type_definition_1= ruletype_definition kw= ';'
            	    {
            	     
            	            newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part6986);
            	    this_type_definition_1=ruletype_definition();

            	    state._fsp--;


            	    		current.merge(this_type_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruletype_definition_part7004); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2370:1: entryRuletype_definition returns [String current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final String entryRuletype_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2371:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2372:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition7047);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition7058); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2379:1: ruletype_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletype_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2382:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2383:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2383:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2383:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_type_2= ruletype
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype_definition7098); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getType_definitionAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            kw=(Token)match(input,62,FOLLOW_62_in_ruletype_definition7116); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruletype_definition7138);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2415:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2416:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2417:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype7184);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype7195); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2424:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_2=null;
        AntlrDatatypeRuleToken this_simple_type_0 = null;

        AntlrDatatypeRuleToken this_structured_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2427:28: ( (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2428:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2428:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_IDENTIFIER_2= RULE_IDENTIFIER )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 54:
                {
                alt39=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==EOF||LA39_2==RULE_END_KEYWORD||(LA39_2>=55 && LA39_2<=56)) ) {
                    alt39=3;
                }
                else if ( (LA39_2==63) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

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
                alt39=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2429:5: this_simple_type_0= rulesimple_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype7242);
                    this_simple_type_0=rulesimple_type();

                    state._fsp--;


                    		current.merge(this_simple_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2441:5: this_structured_type_1= rulestructured_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype7275);
                    this_structured_type_1=rulestructured_type();

                    state._fsp--;


                    		current.merge(this_structured_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2452:10: this_IDENTIFIER_2= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletype7301); 

                    		current.merge(this_IDENTIFIER_2);
                        
                     
                        newLeafNode(this_IDENTIFIER_2, grammarAccess.getTypeAccess().getIDENTIFIERTerminalRuleCall_2()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2467:1: entryRulesimple_type returns [String current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final String entryRulesimple_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2468:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2469:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type7347);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type7358); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2476:1: rulesimple_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) ;
    public final AntlrDatatypeRuleToken rulesimple_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_subrange_type_0 = null;

        AntlrDatatypeRuleToken this_enumerated_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2479:28: ( (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2480:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2480:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IDENTIFIER||(LA40_0>=RULE_SIGNED_INTEGER_NUMBER && LA40_0<=RULE_INTEGER_NUMBER)||LA40_0==RULE_ADDITION_OPERATOR||LA40_0==RULE_STRING||(LA40_0>=RULE_REAL_NUMBER && LA40_0<=RULE_SIGNED_REAL_NUMBER)||LA40_0==RULE_NUMERIC_SUBRANGE) ) {
                alt40=1;
            }
            else if ( (LA40_0==54) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2481:5: this_subrange_type_0= rulesubrange_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type7405);
                    this_subrange_type_0=rulesubrange_type();

                    state._fsp--;


                    		current.merge(this_subrange_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2493:5: this_enumerated_type_1= ruleenumerated_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type7438);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2511:1: entryRulesubrange_type returns [String current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final String entryRulesubrange_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesubrange_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2512:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2513:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type7484);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type7495); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2520:1: rulesubrange_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE ) ;
    public final AntlrDatatypeRuleToken rulesubrange_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMERIC_SUBRANGE_3=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2523:28: ( ( (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2524:1: ( (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2524:1: ( (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant ) | this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_IDENTIFIER||(LA41_0>=RULE_SIGNED_INTEGER_NUMBER && LA41_0<=RULE_INTEGER_NUMBER)||LA41_0==RULE_ADDITION_OPERATOR||LA41_0==RULE_STRING||(LA41_0>=RULE_REAL_NUMBER && LA41_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_NUMERIC_SUBRANGE) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2524:2: (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2524:2: (this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2525:5: this_constant_0= ruleconstant kw= '..' this_constant_2= ruleconstant
                    {
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7543);
                    this_constant_0=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,63,FOLLOW_63_in_rulesubrange_type7561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7583);
                    this_constant_2=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2553:10: this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE
                    {
                    this_NUMERIC_SUBRANGE_3=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7610); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2568:1: entryRuleenumerated_type returns [String current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final String entryRuleenumerated_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2569:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2570:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7656);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7667); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2577:1: ruleenumerated_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleenumerated_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2580:28: ( (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2581:1: (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2581:1: (kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2582:2: kw= '(' this_identifier_list_1= ruleidentifier_list kw= ')'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleenumerated_type7705); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type7727);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,55,FOLLOW_55_in_ruleenumerated_type7745); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2612:1: entryRulestructured_type returns [String current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final String entryRulestructured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2613:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2614:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type7786);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type7797); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2621:1: rulestructured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) ;
    public final AntlrDatatypeRuleToken rulestructured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKED_KEYWORD_0=null;
        AntlrDatatypeRuleToken this_unpacked_structured_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2624:28: ( ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2625:1: ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2625:1: ( (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2625:2: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )? this_unpacked_structured_type_1= ruleunpacked_structured_type
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2625:2: (this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_PACKED_KEYWORD) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2625:7: this_PACKED_KEYWORD_0= RULE_PACKED_KEYWORD
                    {
                    this_PACKED_KEYWORD_0=(Token)match(input,RULE_PACKED_KEYWORD,FOLLOW_RULE_PACKED_KEYWORD_in_rulestructured_type7838); 

                    		current.merge(this_PACKED_KEYWORD_0);
                        
                     
                        newLeafNode(this_PACKED_KEYWORD_0, grammarAccess.getStructured_typeAccess().getPACKED_KEYWORDTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7867);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2651:1: entryRuleunpacked_structured_type returns [String current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final String entryRuleunpacked_structured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2652:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2653:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7913);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type7924); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2660:1: ruleunpacked_structured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_structured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_array_type_0 = null;

        AntlrDatatypeRuleToken this_record_type_1 = null;

        AntlrDatatypeRuleToken this_set_type_2 = null;

        AntlrDatatypeRuleToken this_file_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2663:28: ( (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2664:1: (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2664:1: (this_array_type_0= rulearray_type | this_record_type_1= rulerecord_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_ARRAY_KEYWORD:
                {
                alt43=1;
                }
                break;
            case RULE_RECORD_KEYWORD:
                {
                alt43=2;
                }
                break;
            case RULE_SET_KEYWORD:
                {
                alt43=3;
                }
                break;
            case RULE_FILE_KEYWORD:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2665:5: this_array_type_0= rulearray_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type7971);
                    this_array_type_0=rulearray_type();

                    state._fsp--;


                    		current.merge(this_array_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2677:5: this_record_type_1= rulerecord_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8004);
                    this_record_type_1=rulerecord_type();

                    state._fsp--;


                    		current.merge(this_record_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2689:5: this_set_type_2= ruleset_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type8037);
                    this_set_type_2=ruleset_type();

                    state._fsp--;


                    		current.merge(this_set_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2701:5: this_file_type_3= rulefile_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type8070);
                    this_file_type_3=rulefile_type();

                    state._fsp--;


                    		current.merge(this_file_type_3);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2719:1: entryRulearray_type returns [String current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final String entryRulearray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2720:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2721:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type8116);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type8127); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2728:1: rulearray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= '[' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ']' this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2731:28: ( (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= '[' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ']' this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2732:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= '[' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ']' this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2732:1: (this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= '[' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ']' this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2732:6: this_ARRAY_KEYWORD_0= RULE_ARRAY_KEYWORD kw= '[' this_index_type_2= ruleindex_type (kw= ',' this_index_type_4= ruleindex_type )* kw= ']' this_OF_KEYWORD_6= RULE_OF_KEYWORD this_type_7= ruletype
            {
            this_ARRAY_KEYWORD_0=(Token)match(input,RULE_ARRAY_KEYWORD,FOLLOW_RULE_ARRAY_KEYWORD_in_rulearray_type8167); 

            		current.merge(this_ARRAY_KEYWORD_0);
                
             
                newLeafNode(this_ARRAY_KEYWORD_0, grammarAccess.getArray_typeAccess().getARRAY_KEYWORDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,60,FOLLOW_60_in_rulearray_type8185); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8207);
            this_index_type_2=ruleindex_type();

            state._fsp--;


            		current.merge(this_index_type_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2756:1: (kw= ',' this_index_type_4= ruleindex_type )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==57) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2757:2: kw= ',' this_index_type_4= ruleindex_type
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_rulearray_type8226); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8248);
            	    this_index_type_4=ruleindex_type();

            	    state._fsp--;


            	    		current.merge(this_index_type_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            kw=(Token)match(input,61,FOLLOW_61_in_rulearray_type8268); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4()); 
                
            this_OF_KEYWORD_6=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulearray_type8283); 

            		current.merge(this_OF_KEYWORD_6);
                
             
                newLeafNode(this_OF_KEYWORD_6, grammarAccess.getArray_typeAccess().getOF_KEYWORDTerminalRuleCall_5()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruletype_in_rulearray_type8310);
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


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2805:1: entryRuleindex_type returns [String current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final String entryRuleindex_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2806:2: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2807:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type8356);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type8367); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2814:1: ruleindex_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_simple_type_0= rulesimple_type ;
    public final AntlrDatatypeRuleToken ruleindex_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2817:28: (this_simple_type_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2819:5: this_simple_type_0= rulesimple_type
            {
             
                    newCompositeNode(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 
                
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type8413);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2837:1: entryRulerecord_type returns [String current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final String entryRulerecord_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2838:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2839:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type8458);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type8469); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2846:1: rulerecord_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD ) ;
    public final AntlrDatatypeRuleToken rulerecord_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RECORD_KEYWORD_0=null;
        Token this_END_KEYWORD_2=null;
        AntlrDatatypeRuleToken this_field_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2849:28: ( (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2850:1: (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2850:1: (this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2850:6: this_RECORD_KEYWORD_0= RULE_RECORD_KEYWORD this_field_list_1= rulefield_list this_END_KEYWORD_2= RULE_END_KEYWORD
            {
            this_RECORD_KEYWORD_0=(Token)match(input,RULE_RECORD_KEYWORD,FOLLOW_RULE_RECORD_KEYWORD_in_rulerecord_type8509); 

            		current.merge(this_RECORD_KEYWORD_0);
                
             
                newLeafNode(this_RECORD_KEYWORD_0, grammarAccess.getRecord_typeAccess().getRECORD_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_typeAccess().getField_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulerecord_type8536);
            this_field_list_1=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulerecord_type8556); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2883:1: entryRulefield_list returns [String current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final String entryRulefield_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2884:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2885:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list8602);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list8613); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2892:1: rulefield_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )? ;
    public final AntlrDatatypeRuleToken rulefield_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_fixed_part_0 = null;

        AntlrDatatypeRuleToken this_variant_part_2 = null;

        AntlrDatatypeRuleToken this_variant_part_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2895:28: ( ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:1: ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:1: ( ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_IDENTIFIER||LA48_0==RULE_CASE_KEYWORD) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:2: ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= ';' )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:2: ( (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_IDENTIFIER) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_CASE_KEYWORD) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:3: (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2896:3: (this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )? )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2897:5: this_fixed_part_0= rulefixed_part (kw= ';' this_variant_part_2= rulevariant_part )?
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulefixed_part_in_rulefield_list8662);
                            this_fixed_part_0=rulefixed_part();

                            state._fsp--;


                            		current.merge(this_fixed_part_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2907:1: (kw= ';' this_variant_part_2= rulevariant_part )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==56) ) {
                                int LA45_1 = input.LA(2);

                                if ( (LA45_1==RULE_CASE_KEYWORD) ) {
                                    alt45=1;
                                }
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2908:2: kw= ';' this_variant_part_2= rulevariant_part
                                    {
                                    kw=(Token)match(input,56,FOLLOW_56_in_rulefield_list8681); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 
                                        
                                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8703);
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
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2926:5: this_variant_part_3= rulevariant_part
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8739);
                            this_variant_part_3=rulevariant_part();

                            state._fsp--;


                            		current.merge(this_variant_part_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2936:2: (kw= ';' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==56) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2937:2: kw= ';'
                            {
                            kw=(Token)match(input,56,FOLLOW_56_in_rulefield_list8759); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2950:1: entryRulefixed_part returns [String current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final String entryRulefixed_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2951:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2952:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part8803);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part8814); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2959:1: rulefixed_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* ) ;
    public final AntlrDatatypeRuleToken rulefixed_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_0 = null;

        AntlrDatatypeRuleToken this_record_section_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2962:28: ( (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2963:1: (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2963:1: (this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2964:5: this_record_section_0= rulerecord_section (kw= ';' this_record_section_2= rulerecord_section )*
            {
             
                    newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8861);
            this_record_section_0=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2974:1: (kw= ';' this_record_section_2= rulerecord_section )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==56) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==RULE_IDENTIFIER) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2975:2: kw= ';' this_record_section_2= rulerecord_section
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_rulefixed_part8880); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8902);
            	    this_record_section_2=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:2999:1: entryRulerecord_section returns [String current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final String entryRulerecord_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3000:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3001:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section8950);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section8961); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3008:1: rulerecord_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulerecord_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3011:28: ( (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3012:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3012:1: (this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3013:5: this_identifier_list_0= ruleidentifier_list kw= ':' this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section9008);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,58,FOLLOW_58_in_rulerecord_section9026); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulerecord_section9048);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3048:1: entryRulevariant_part returns [String current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final String entryRulevariant_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3049:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3050:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part9094);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part9105); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3057:1: rulevariant_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3060:28: ( (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3061:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3061:1: (this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3061:6: this_CASE_KEYWORD_0= RULE_CASE_KEYWORD this_tag_field_1= ruletag_field this_IDENTIFIER_2= RULE_IDENTIFIER this_OF_KEYWORD_3= RULE_OF_KEYWORD this_variant_4= rulevariant (kw= ';' this_variant_6= rulevariant )*
            {
            this_CASE_KEYWORD_0=(Token)match(input,RULE_CASE_KEYWORD,FOLLOW_RULE_CASE_KEYWORD_in_rulevariant_part9145); 

            		current.merge(this_CASE_KEYWORD_0);
                
             
                newLeafNode(this_CASE_KEYWORD_0, grammarAccess.getVariant_partAccess().getCASE_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletag_field_in_rulevariant_part9172);
            this_tag_field_1=ruletag_field();

            state._fsp--;


            		current.merge(this_tag_field_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariant_part9192); 

            		current.merge(this_IDENTIFIER_2);
                
             
                newLeafNode(this_IDENTIFIER_2, grammarAccess.getVariant_partAccess().getIDENTIFIERTerminalRuleCall_2()); 
                
            this_OF_KEYWORD_3=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulevariant_part9212); 

            		current.merge(this_OF_KEYWORD_3);
                
             
                newLeafNode(this_OF_KEYWORD_3, grammarAccess.getVariant_partAccess().getOF_KEYWORDTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part9239);
            this_variant_4=rulevariant();

            state._fsp--;


            		current.merge(this_variant_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3104:1: (kw= ';' this_variant_6= rulevariant )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==56) ) {
                    int LA50_1 = input.LA(2);

                    if ( (LA50_1==RULE_IDENTIFIER||(LA50_1>=RULE_SIGNED_INTEGER_NUMBER && LA50_1<=RULE_INTEGER_NUMBER)||LA50_1==RULE_ADDITION_OPERATOR||LA50_1==RULE_STRING||(LA50_1>=RULE_REAL_NUMBER && LA50_1<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3105:2: kw= ';' this_variant_6= rulevariant
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_rulevariant_part9258); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part9280);
            	    this_variant_6=rulevariant();

            	    state._fsp--;


            	    		current.merge(this_variant_6);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3129:1: entryRuletag_field returns [String current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final String entryRuletag_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3130:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3131:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field9328);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field9339); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3138:1: ruletag_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )? ;
    public final AntlrDatatypeRuleToken ruletag_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3141:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3142:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3142:1: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_IDENTIFIER) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==58) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3142:6: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':'
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruletag_field9379); 

                    		current.merge(this_IDENTIFIER_0);
                        
                     
                        newLeafNode(this_IDENTIFIER_0, grammarAccess.getTag_fieldAccess().getIDENTIFIERTerminalRuleCall_0()); 
                        
                    kw=(Token)match(input,58,FOLLOW_58_in_ruletag_field9397); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3163:1: entryRulevariant returns [String current=null] : iv_rulevariant= rulevariant EOF ;
    public final String entryRulevariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3164:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3165:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant9439);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant9450); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3172:1: rulevariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulevariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_field_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3175:28: ( (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3176:1: (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3176:1: (this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3177:5: this_case_label_list_0= rulecase_label_list kw= ':' kw= '(' this_field_list_3= rulefield_list kw= ')'
            {
             
                    newCompositeNode(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9497);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,58,FOLLOW_58_in_rulevariant9515); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getColonKeyword_1()); 
                
            kw=(Token)match(input,54,FOLLOW_54_in_rulevariant9528); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulevariant9550);
            this_field_list_3=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,55,FOLLOW_55_in_rulevariant9568); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3224:1: entryRuleset_type returns [String current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final String entryRuleset_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3225:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3226:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9609);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9620); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3233:1: ruleset_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruleset_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SET_KEYWORD_0=null;
        Token this_OF_KEYWORD_1=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3236:28: ( (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3237:1: (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3237:1: (this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3237:6: this_SET_KEYWORD_0= RULE_SET_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype
            {
            this_SET_KEYWORD_0=(Token)match(input,RULE_SET_KEYWORD,FOLLOW_RULE_SET_KEYWORD_in_ruleset_type9660); 

            		current.merge(this_SET_KEYWORD_0);
                
             
                newLeafNode(this_SET_KEYWORD_0, grammarAccess.getSet_typeAccess().getSET_KEYWORDTerminalRuleCall_0()); 
                
            this_OF_KEYWORD_1=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_ruleset_type9680); 

            		current.merge(this_OF_KEYWORD_1);
                
             
                newLeafNode(this_OF_KEYWORD_1, grammarAccess.getSet_typeAccess().getOF_KEYWORDTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getSet_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruleset_type9707);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3270:1: entryRulefile_type returns [String current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final String entryRulefile_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3271:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3272:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9753);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9764); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3279:1: rulefile_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulefile_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FILE_KEYWORD_0=null;
        Token this_OF_KEYWORD_1=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3282:28: ( (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3283:1: (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3283:1: (this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:3283:6: this_FILE_KEYWORD_0= RULE_FILE_KEYWORD this_OF_KEYWORD_1= RULE_OF_KEYWORD this_type_2= ruletype
            {
            this_FILE_KEYWORD_0=(Token)match(input,RULE_FILE_KEYWORD,FOLLOW_RULE_FILE_KEYWORD_in_rulefile_type9804); 

            		current.merge(this_FILE_KEYWORD_0);
                
             
                newLeafNode(this_FILE_KEYWORD_0, grammarAccess.getFile_typeAccess().getFILE_KEYWORDTerminalRuleCall_0()); 
                
            this_OF_KEYWORD_1=(Token)match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rulefile_type9824); 

            		current.merge(this_OF_KEYWORD_1);
                
             
                newLeafNode(this_OF_KEYWORD_1, grammarAccess.getFile_typeAccess().getOF_KEYWORDTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getFile_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulefile_type9851);
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

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA15_minS =
        "\1\4\1\6\10\uffff";
    static final String DFA15_maxS =
        "\1\74\1\75\10\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\6\1\1";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\2\uffff\2\2\4\uffff\1\3\1\5\1\7\2\2\44\uffff\1\6\5\uffff"+
            "\1\4",
            "\2\11\1\uffff\4\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11"+
            "\1\uffff\2\11\1\uffff\2\11\1\uffff\1\11\30\uffff\1\10\3\11\3"+
            "\uffff\1\11",
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
            return "955:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram224 = new BitSet(new long[]{0x0000000700000020L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram251 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleprogram269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleprogram_heading_block359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_54_in_ruleprogram_heading_block393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleprogram_heading_block433 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleprogram_heading_block448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list540 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleidentifier_list559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list574 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock680 = new BitSet(new long[]{0x0000000700000020L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part804 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part831 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulestatement_part851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence955 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulestatement_sequence974 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence996 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1103 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulestatement1121 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulesimple_statement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1578 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleassignment_statement1596 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindexed_variable_in_entryRuleindexed_variable1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindexed_variable1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleindexed_variable1921 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleindexed_variable1939 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleindexed_variable1961 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleindexed_variable1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2078 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleexpression_list2097 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2119 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2225 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2246 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2373 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2402 = new BitSet(new long[]{0x0000000000030D82L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2426 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_RULE_OR_KEYWORD_in_rulesimple_expression2454 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2482 = new BitSet(new long[]{0x0000000000030D82L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulesimple_expression2516 = new BitSet(new long[]{0x0000000000030D82L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2622 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2643 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2670 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rulefactor2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulefactor2952 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor2974 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulefactor2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rulefactor3015 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rulenumber3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulenumber3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleset3521 = new BitSet(new long[]{0x304000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3544 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleset3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3656 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulefunction_designator3674 = new BitSet(new long[]{0x10C000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3697 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulefunction_designator3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rulecompound_statement4012 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulecompound_statement4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_KEYWORD_in_rulewhile_statement4326 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4353 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulewhile_statement4373 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REPEAT_KEYWORD_in_rulerepeat_statement4497 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_UNTIL_KEYWORD_in_rulerepeat_statement4544 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_KEYWORD_in_rulefor_statement4668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4695 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_RULE_TO_KEYWORD_in_rulefor_statement4716 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_RULE_DOWNTO_KEYWORD_in_rulefor_statement4742 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4770 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulefor_statement4790 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement5000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_KEYWORD_in_ruleif_statement5051 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5078 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_THEN_KEYWORD_in_ruleif_statement5098 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5125 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_ELSE_KEYWORD_in_ruleif_statement5146 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_KEYWORD_in_rulecase_statement5272 = new BitSet(new long[]{0x104000000003E590L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement5299 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulecase_statement5319 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5346 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_56_in_rulecase_statement5365 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5387 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_56_in_rulecase_statement5408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulecase_statement5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5529 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulecase_limb5547 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5673 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_rulecase_label_list5692 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5714 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant5762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5815 = new BitSet(new long[]{0x0000000000030190L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement5945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WITH_KEYWORD_in_rulewith_statement5996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6023 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_57_in_rulewith_statement6042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6064 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rulewith_statement6086 = new BitSet(new long[]{0x00000000D25401B0L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement6159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GOTO_KEYWORD_in_rulegoto_statement6210 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6342 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6372 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruledeclaration_part6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part6501 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6528 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_57_in_rulelabel_declaration_part6547 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6569 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_56_in_rulelabel_declaration_part6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONST_KEYWORD_in_ruleconstant_definition_part6681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6709 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleconstant_definition_part6727 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleconstant_definition6821 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleconstant_definition6839 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_KEYWORD_in_ruletype_definition_part6958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part6986 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruletype_definition_part7004 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition7047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype_definition7098 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruletype_definition7116 = new BitSet(new long[]{0x004001F800032590L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype7184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletype7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type7347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type7484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7543 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_rulesubrange_type7561 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleenumerated_type7705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type7727 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleenumerated_type7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type7786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKED_KEYWORD_in_rulestructured_type7838 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type8116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_KEYWORD_in_rulearray_type8167 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulearray_type8185 = new BitSet(new long[]{0x0040000800032590L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8207 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_57_in_rulearray_type8226 = new BitSet(new long[]{0x0040000800032590L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8248 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_61_in_rulearray_type8268 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulearray_type8283 = new BitSet(new long[]{0x004001F800032590L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type8356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type8458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RECORD_KEYWORD_in_rulerecord_type8509 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type8536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulerecord_type8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list8602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list8662 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulefield_list8681 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8703 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8739 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulefield_list8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part8803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8861 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulefixed_part8880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8902 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section8950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section9008 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulerecord_section9026 = new BitSet(new long[]{0x004001F800032590L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part9094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_KEYWORD_in_rulevariant_part9145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part9172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariant_part9192 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulevariant_part9212 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9239 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulevariant_part9258 = new BitSet(new long[]{0x0000000000032590L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9280 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field9328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruletag_field9379 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruletag_field9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant9439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9497 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulevariant9515 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulevariant9528 = new BitSet(new long[]{0x0080000010000010L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant9550 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulevariant9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SET_KEYWORD_in_ruleset_type9660 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_ruleset_type9680 = new BitSet(new long[]{0x004001F800032590L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILE_KEYWORD_in_rulefile_type9804 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rulefile_type9824 = new BitSet(new long[]{0x004001F800032590L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9851 = new BitSet(new long[]{0x0000000000000002L});

}