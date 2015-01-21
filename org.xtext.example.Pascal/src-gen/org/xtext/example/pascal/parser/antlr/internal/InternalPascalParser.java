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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_NIL_KEYWORD", "RULE_NOT_KEYWORD", "RULE_REAL_NUMBER", "RULE_LABEL_KEYWORD", "RULE_DIGIT_SEQUENCE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "':'", "':='", "'+'", "'-'", "'['", "']'"
    };
    public static final int RULE_ID=21;
    public static final int RULE_RELATIONAL_OPERATOR=8;
    public static final int RULE_NIL_KEYWORD=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_LABEL_KEYWORD=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=17;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_ADDITION_OPERATOR=9;
    public static final int EOF=-1;
    public static final int RULE_NOT_KEYWORD=13;
    public static final int RULE_LETTER=20;
    public static final int RULE_ML_COMMENT=23;
    public static final int T__30=30;
    public static final int RULE_END_KEYWORD=6;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int RULE_REAL_NUMBER=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_MULTIPLICATION_OPERATOR=10;
    public static final int RULE_INT=22;
    public static final int RULE_BEGIN_KEYWORD=5;
    public static final int RULE_DIGIT_SEQUENCE=16;
    public static final int RULE_WS=25;
    public static final int RULE_DIGIT=18;
    public static final int RULE_LETTER_EXTENDED=19;
    public static final int RULE_INTEGER_NUMBER=7;

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
                
            kw=(Token)match(input,27,FOLLOW_27_in_ruleprogram269); 

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
            kw=(Token)match(input,28,FOLLOW_28_in_ruleprogram_heading_block359); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:181:1: (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:182:2: kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleprogram_heading_block393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleprogram_heading_block433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_31_in_ruleprogram_heading_block448); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:227:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )? ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:230:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:231:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:231:1: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
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

                        if ( (LA2_0==32) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:239:2: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,32,FOLLOW_32_in_ruleidentifier_list559); 

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
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock623);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock634); 

            }

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
                
            pushFollow(FOLLOW_ruledeclaration_part_in_ruleblock681);
            this_declaration_part_0=ruledeclaration_part();

            state._fsp--;


            		current.merge(this_declaration_part_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock708);
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
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part754);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part765); 

            }

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
            this_BEGIN_KEYWORD_0=(Token)match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part805); 

            		current.merge(this_BEGIN_KEYWORD_0);
                
             
                newLeafNode(this_BEGIN_KEYWORD_0, grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part832);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_END_KEYWORD_2=(Token)match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rulestatement_part852); 

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
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence898);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence909); 

            }

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
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence956);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:372:1: (kw= ';' this_statement_2= rulestatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:373:2: kw= ';' this_statement_2= rulestatement
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_rulestatement_sequence975); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence997);
            	    this_statement_2=rulestatement();

            	    state._fsp--;


            	    		current.merge(this_statement_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1045);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1056); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:406:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_0 = null;

        AntlrDatatypeRuleToken this_simple_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:409:28: ( ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:1: ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:1: ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:2: (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:410:2: (this_label_0= rulelabel kw= ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INTEGER_NUMBER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:411:5: this_label_0= rulelabel kw= ':'
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1104);
                    this_label_0=rulelabel();

                    state._fsp--;


                    		current.merge(this_label_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,33,FOLLOW_33_in_rulestatement1122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1146);
            this_simple_statement_2=rulesimple_statement();

            state._fsp--;


            		current.merge(this_simple_statement_2);
                
             
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:446:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:447:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:448:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1192);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1203); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:455:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:458:28: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:459:5: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
            {
            this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1242); 

            		current.merge(this_INTEGER_NUMBER_0);
                
             
                newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getLabelAccess().getINTEGER_NUMBERTerminalRuleCall()); 
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:474:1: entryRulesimple_statement returns [String current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final String entryRulesimple_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:475:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:476:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1287);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1298); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:483:1: rulesimple_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_statement_0= ruleassignment_statement )? ;
    public final AntlrDatatypeRuleToken rulesimple_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_assignment_statement_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:486:28: ( (this_assignment_statement_0= ruleassignment_statement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:487:1: (this_assignment_statement_0= ruleassignment_statement )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:487:1: (this_assignment_statement_0= ruleassignment_statement )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:488:5: this_assignment_statement_0= ruleassignment_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall()); 
                        
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1345);
                    this_assignment_statement_0=ruleassignment_statement();

                    state._fsp--;


                    		current.merge(this_assignment_statement_0);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:506:1: entryRuleassignment_statement returns [String current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final String entryRuleassignment_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:507:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:508:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1392);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1403); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:515:1: ruleassignment_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruleassignment_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:518:28: ( (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:519:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:519:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:520:5: this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression
            {
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1450);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleassignment_statement1468); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1490);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:555:1: entryRulevariable returns [String current=null] : iv_rulevariable= rulevariable EOF ;
    public final String entryRulevariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:556:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:557:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1536);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1547); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:564:1: rulevariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_entire_variable_0= ruleentire_variable ;
    public final AntlrDatatypeRuleToken rulevariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_entire_variable_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:567:28: (this_entire_variable_0= ruleentire_variable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:569:5: this_entire_variable_0= ruleentire_variable
            {
             
                    newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleentire_variable_in_rulevariable1593);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:587:1: entryRuleentire_variable returns [String current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final String entryRuleentire_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentire_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:588:2: (iv_ruleentire_variable= ruleentire_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:589:2: iv_ruleentire_variable= ruleentire_variable EOF
            {
             newCompositeNode(grammarAccess.getEntire_variableRule()); 
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable1638);
            iv_ruleentire_variable=ruleentire_variable();

            state._fsp--;

             current =iv_ruleentire_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable1649); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:596:1: ruleentire_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_variable_identifier_0= rulevariable_identifier ;
    public final AntlrDatatypeRuleToken ruleentire_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_variable_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:599:28: (this_variable_identifier_0= rulevariable_identifier )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:601:5: this_variable_identifier_0= rulevariable_identifier
            {
             
                    newCompositeNode(grammarAccess.getEntire_variableAccess().getVariable_identifierParserRuleCall()); 
                
            pushFollow(FOLLOW_rulevariable_identifier_in_ruleentire_variable1695);
            this_variable_identifier_0=rulevariable_identifier();

            state._fsp--;


            		current.merge(this_variable_identifier_0);
                
             
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
    // $ANTLR end "ruleentire_variable"


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:619:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:620:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:621:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1740);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier1751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier"


    // $ANTLR start "rulevariable_identifier"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:628:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:631:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:632:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier1790); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:647:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:648:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:649:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression1835);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression1846); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:656:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RELATIONAL_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_simple_expression_0 = null;

        AntlrDatatypeRuleToken this_simple_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:659:28: ( (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:660:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:660:1: (this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:661:5: this_simple_expression_0= rulesimple_expression (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression1893);
            this_simple_expression_0=rulesimple_expression();

            state._fsp--;


            		current.merge(this_simple_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:671:1: (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_RELATIONAL_OPERATOR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:671:6: this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR this_simple_expression_2= rulesimple_expression
                    {
                    this_RELATIONAL_OPERATOR_1=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression1914); 

                    		current.merge(this_RELATIONAL_OPERATOR_1);
                        
                     
                        newLeafNode(this_RELATIONAL_OPERATOR_1, grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression1941);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:697:1: entryRulesimple_expression returns [String current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final String entryRulesimple_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:698:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:699:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression1989);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2000); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:706:1: rulesimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* ) | ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression ) ) ;
    public final AntlrDatatypeRuleToken rulesimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_term_0 = null;

        AntlrDatatypeRuleToken this_term_2 = null;

        AntlrDatatypeRuleToken this_simple_expression_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:709:28: ( ( (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* ) | ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:710:1: ( (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* ) | ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:710:1: ( (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* ) | ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENTIFIER||LA10_0==RULE_INTEGER_NUMBER||(LA10_0>=RULE_STRING && LA10_0<=RULE_REAL_NUMBER)||LA10_0==29||LA10_0==37) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=35 && LA10_0<=36)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:710:2: (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:710:2: (this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )* )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:711:5: this_term_0= ruleterm (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )*
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2048);
                    this_term_0=ruleterm();

                    state._fsp--;


                    		current.merge(this_term_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:721:1: (this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ADDITION_OPERATOR) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:721:6: this_ADDITION_OPERATOR_1= RULE_ADDITION_OPERATOR this_term_2= ruleterm
                    	    {
                    	    this_ADDITION_OPERATOR_1=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2069); 

                    	    		current.merge(this_ADDITION_OPERATOR_1);
                    	        
                    	     
                    	        newLeafNode(this_ADDITION_OPERATOR_1, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2096);
                    	    this_term_2=ruleterm();

                    	    state._fsp--;


                    	    		current.merge(this_term_2);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:740:6: ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:740:6: ( (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:740:7: (kw= '+' | kw= '-' ) this_simple_expression_5= rulesimple_expression
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:740:7: (kw= '+' | kw= '-' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==35) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==36) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:741:2: kw= '+'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_rulesimple_expression2125); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getPlusSignKeyword_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:748:2: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_rulesimple_expression2144); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getHyphenMinusKeyword_1_0_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getSimple_expressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_rulesimple_expression2167);
                    this_simple_expression_5=rulesimple_expression();

                    state._fsp--;


                    		current.merge(this_simple_expression_5);
                        
                     
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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:772:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:773:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:774:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2214);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2225); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTIPLICATION_OPERATOR_1=null;
        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_factor_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:784:28: ( (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:785:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:785:1: (this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:786:5: this_factor_0= rulefactor (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefactor_in_ruleterm2272);
            this_factor_0=rulefactor();

            state._fsp--;


            		current.merge(this_factor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:796:1: (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:796:6: this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR this_factor_2= rulefactor
            	    {
            	    this_MULTIPLICATION_OPERATOR_1=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2293); 

            	    		current.merge(this_MULTIPLICATION_OPERATOR_1);
            	        
            	     
            	        newLeafNode(this_MULTIPLICATION_OPERATOR_1, grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2320);
            	    this_factor_2=rulefactor();

            	    state._fsp--;


            	    		current.merge(this_factor_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:822:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:823:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:824:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2368);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2379); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:831:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) ) ;
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
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:834:28: ( (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:835:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:835:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:836:5: this_variable_0= rulevariable
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2426);
                    this_variable_0=rulevariable();

                    state._fsp--;


                    		current.merge(this_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:848:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2459);
                    this_number_1=rulenumber();

                    state._fsp--;


                    		current.merge(this_number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:859:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2485); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:868:5: this_set_3= ruleset
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_in_rulefactor2518);
                    this_set_3=ruleset();

                    state._fsp--;


                    		current.merge(this_set_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:879:10: this_NIL_KEYWORD_4= RULE_NIL_KEYWORD
                    {
                    this_NIL_KEYWORD_4=(Token)match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rulefactor2544); 

                    		current.merge(this_NIL_KEYWORD_4);
                        
                     
                        newLeafNode(this_NIL_KEYWORD_4, grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:888:5: this_function_designator_5= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor2577);
                    this_function_designator_5=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:899:6: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:899:6: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:900:2: kw= '(' this_expression_7= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulefactor2602); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor2624);
                    this_expression_7=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_rulefactor2642); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:923:6: (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:923:6: (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:923:11: this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor
                    {
                    this_NOT_KEYWORD_9=(Token)match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rulefactor2665); 

                    		current.merge(this_NOT_KEYWORD_9);
                        
                     
                        newLeafNode(this_NOT_KEYWORD_9, grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_rulefactor_in_rulefactor2692);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:949:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:950:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:951:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber2739);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber2750); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:958:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;
        Token this_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:961:28: ( (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:962:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:962:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INTEGER_NUMBER) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_REAL_NUMBER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:962:6: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber2790); 

                    		current.merge(this_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:970:10: this_REAL_NUMBER_1= RULE_REAL_NUMBER
                    {
                    this_REAL_NUMBER_1=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rulenumber2816); 

                    		current.merge(this_REAL_NUMBER_1);
                        
                     
                        newLeafNode(this_REAL_NUMBER_1, grammarAccess.getNumberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleset"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:985:1: entryRuleset returns [String current=null] : iv_ruleset= ruleset EOF ;
    public final String entryRuleset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:986:2: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:987:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset2862);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset2873); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:994:1: ruleset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )? kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:997:28: ( (kw= '[' (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )? kw= ']' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:998:1: (kw= '[' (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )? kw= ']' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:998:1: (kw= '[' (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )? kw= ']' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:999:2: kw= '[' (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )? kw= ']'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleset2911); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1004:1: (this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER||LA15_0==RULE_INTEGER_NUMBER||(LA15_0>=RULE_STRING && LA15_0<=RULE_REAL_NUMBER)||LA15_0==29||(LA15_0>=35 && LA15_0<=37)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1005:5: this_expression_1= ruleexpression (kw= ',' this_expression_3= ruleexpression )*
                    {
                     
                            newCompositeNode(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_ruleset2934);
                    this_expression_1=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1015:1: (kw= ',' this_expression_3= ruleexpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==32) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1016:2: kw= ',' this_expression_3= ruleexpression
                    	    {
                    	    kw=(Token)match(input,32,FOLLOW_32_in_ruleset2953); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getSetAccess().getCommaKeyword_1_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleexpression_in_ruleset2975);
                    	    this_expression_3=ruleexpression();

                    	    state._fsp--;


                    	    		current.merge(this_expression_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_38_in_ruleset2997); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1046:1: entryRulefunction_designator returns [String current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final String entryRulefunction_designator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1047:2: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1048:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3038);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3049); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1055:1: rulefunction_designator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken rulefunction_designator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1058:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1059:1: (this_IDENTIFIER_0= RULE_IDENTIFIER ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1059:1: (this_IDENTIFIER_0= RULE_IDENTIFIER ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1059:6: this_IDENTIFIER_0= RULE_IDENTIFIER ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) )
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3089); 

            		current.merge(this_IDENTIFIER_0);
                
             
                newLeafNode(this_IDENTIFIER_0, grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1066:1: ( (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' ) | (kw= '(' kw= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==30) ) {
                    alt17=2;
                }
                else if ( (LA17_1==RULE_IDENTIFIER||LA17_1==RULE_INTEGER_NUMBER||(LA17_1>=RULE_STRING && LA17_1<=RULE_REAL_NUMBER)||LA17_1==29||(LA17_1>=35 && LA17_1<=37)) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1066:2: (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1066:2: (kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')' )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1067:2: kw= '(' this_expression_2= ruleexpression (kw= ',' this_expression_4= ruleexpression )* kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulefunction_designator3109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefunction_designator3131);
                    this_expression_2=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1083:1: (kw= ',' this_expression_4= ruleexpression )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==32) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1084:2: kw= ',' this_expression_4= ruleexpression
                    	    {
                    	    kw=(Token)match(input,32,FOLLOW_32_in_rulefunction_designator3150); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getCommaKeyword_1_0_2_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleexpression_in_rulefunction_designator3172);
                    	    this_expression_4=ruleexpression();

                    	    state._fsp--;


                    	    		current.merge(this_expression_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    kw=(Token)match(input,30,FOLLOW_30_in_rulefunction_designator3192); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1107:6: (kw= '(' kw= ')' )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1107:6: (kw= '(' kw= ')' )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1108:2: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulefunction_designator3213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_1_0()); 
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_rulefunction_designator3226); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_1_1()); 
                        

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1127:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1128:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1129:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part3269);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part3280); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1136:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_label_declaration_part_0= rulelabel_declaration_part )? ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1139:28: ( (this_label_declaration_part_0= rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1140:1: (this_label_declaration_part_0= rulelabel_declaration_part )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1140:1: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LABEL_KEYWORD) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1141:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part3327);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1159:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1160:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1161:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part3374);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part3385); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1168:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LABEL_KEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1171:28: ( (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1172:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1172:1: (this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1172:6: this_LABEL_KEYWORD_0= RULE_LABEL_KEYWORD this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';'
            {
            this_LABEL_KEYWORD_0=(Token)match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part3425); 

            		current.merge(this_LABEL_KEYWORD_0);
                
             
                newLeafNode(this_LABEL_KEYWORD_0, grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part3452);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1190:1: (kw= ',' this_label_3= rulelabel )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1191:2: kw= ',' this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_rulelabel_declaration_part3471); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part3493);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            kw=(Token)match(input,31,FOLLOW_31_in_rulelabel_declaration_part3513); 

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

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA12_minS =
        "\1\4\1\6\10\uffff";
    static final String DFA12_maxS =
        "\1\45\1\46\10\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\6\1\1";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\2\uffff\1\2\3\uffff\1\3\1\5\1\7\1\2\16\uffff\1\6\7\uffff"+
            "\1\4",
            "\1\11\1\uffff\3\11\22\uffff\1\10\3\11\5\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "835:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | this_NIL_KEYWORD_4= RULE_NIL_KEYWORD | this_function_designator_5= rulefunction_designator | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (this_NOT_KEYWORD_9= RULE_NOT_KEYWORD this_factor_10= rulefactor ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram224 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram251 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleprogram269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleprogram_heading_block359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_29_in_ruleprogram_heading_block393 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleprogram_heading_block433 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleprogram_heading_block448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list540 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleidentifier_list559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list574 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock681 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rulestatement_part805 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part832 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rulestatement_part852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence956 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulestatement_sequence975 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence997 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1104 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatement1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1450 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleassignment_statement1468 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_ruleentire_variable1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression1835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression1893 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression1914 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2048 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2069 = new BitSet(new long[]{0x0000002020007890L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2096 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_35_in_rulesimple_expression2125 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_36_in_rulesimple_expression2144 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rulesimple_expression2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2272 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2293 = new BitSet(new long[]{0x0000002020007890L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2320 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rulefactor2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulefactor2602 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor2624 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefactor2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rulefactor2665 = new BitSet(new long[]{0x0000002020007890L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rulenumber2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleset2911 = new BitSet(new long[]{0x0000007820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleset2934 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_32_in_ruleset2953 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleset2975 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_38_in_ruleset2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulefunction_designator3089 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulefunction_designator3109 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefunction_designator3131 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_32_in_rulefunction_designator3150 = new BitSet(new long[]{0x0000003820007890L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefunction_designator3172 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_30_in_rulefunction_designator3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulefunction_designator3213 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulefunction_designator3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part3374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rulelabel_declaration_part3425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part3452 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_rulelabel_declaration_part3471 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part3493 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_rulelabel_declaration_part3513 = new BitSet(new long[]{0x0000000000000002L});

}