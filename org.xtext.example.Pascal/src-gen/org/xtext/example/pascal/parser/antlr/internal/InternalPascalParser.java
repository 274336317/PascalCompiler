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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_INTEGER_NUMBER", "RULE_SIGN", "RULE_REAL_NUMBER", "RULE_DIGIT_SEQUENCE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_SCALE_FACTOR", "RULE_LETTER_EXTENDED", "RULE_DIGIT", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "':='", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'in'", "'+'", "'-'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'label'"
    };
    public static final int RULE_ID=14;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int EOF=-1;
    public static final int RULE_REAL_NUMBER=7;
    public static final int RULE_INT=15;
    public static final int RULE_LETTER_EXTENDED=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SCALE_FACTOR=10;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=9;
    public static final int RULE_SIGN=6;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_LETTER=13;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=16;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DIGIT_SEQUENCE=8;
    public static final int RULE_WS=19;
    public static final int RULE_DIGIT=12;
    public static final int RULE_INTEGER_NUMBER=5;

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
                
            kw=(Token)match(input,21,FOLLOW_21_in_ruleprogram269); 

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
            kw=(Token)match(input,22,FOLLOW_22_in_ruleprogram_heading_block359); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
                
            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374); 

            		current.merge(this_IDENTIFIER_1);
                
             
                newLeafNode(this_IDENTIFIER_1, grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:181:1: (kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:182:2: kw= '(' this_identifier_list_3= ruleidentifier_list kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleprogram_heading_block393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415);
                    this_identifier_list_3=ruleidentifier_list();

                    state._fsp--;


                    		current.merge(this_identifier_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleprogram_heading_block433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_25_in_ruleprogram_heading_block448); 

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

                        if ( (LA2_0==26) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:239:2: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,26,FOLLOW_26_in_ruleidentifier_list559); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:311:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:314:28: ( (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:315:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:315:1: (kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:316:2: kw= 'begin' this_statement_sequence_1= rulestatement_sequence kw= 'end'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_rulestatement_part803); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part825);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,28,FOLLOW_28_in_rulestatement_part843); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:346:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:347:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:348:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence884);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence895); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:355:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:358:28: ( (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:359:1: (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:359:1: (this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:360:5: this_statement_0= rulestatement (kw= ';' this_statement_2= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence942);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:370:1: (kw= ';' this_statement_2= rulestatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:371:2: kw= ';' this_statement_2= rulestatement
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_rulestatement_sequence961); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence983);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:395:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:396:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:397:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1031);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1042); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:404:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_0 = null;

        AntlrDatatypeRuleToken this_simple_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:407:28: ( ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:408:1: ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:408:1: ( (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:408:2: (this_label_0= rulelabel kw= ':' )? this_simple_statement_2= rulesimple_statement
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:408:2: (this_label_0= rulelabel kw= ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INTEGER_NUMBER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:409:5: this_label_0= rulelabel kw= ':'
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1090);
                    this_label_0=rulelabel();

                    state._fsp--;


                    		current.merge(this_label_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,29,FOLLOW_29_in_rulestatement1108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1132);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:444:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:445:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:446:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1178);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1189); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:453:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:456:28: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:457:5: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
            {
            this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1228); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:472:1: entryRulesimple_statement returns [String current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final String entryRulesimple_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:473:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:474:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1273);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1284); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:481:1: rulesimple_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_statement_0= ruleassignment_statement )? ;
    public final AntlrDatatypeRuleToken rulesimple_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_assignment_statement_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:484:28: ( (this_assignment_statement_0= ruleassignment_statement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:485:1: (this_assignment_statement_0= ruleassignment_statement )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:485:1: (this_assignment_statement_0= ruleassignment_statement )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:486:5: this_assignment_statement_0= ruleassignment_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall()); 
                        
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1331);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:504:1: entryRuleassignment_statement returns [String current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final String entryRuleassignment_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:505:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:506:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1378);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1389); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:513:1: ruleassignment_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruleassignment_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:516:28: ( (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:517:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:517:1: (this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:518:5: this_variable_0= rulevariable kw= ':=' this_expression_2= ruleexpression
            {
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1436);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,30,FOLLOW_30_in_ruleassignment_statement1454); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1476);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:553:1: entryRulevariable returns [String current=null] : iv_rulevariable= rulevariable EOF ;
    public final String entryRulevariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:554:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:555:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1522);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1533); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:562:1: rulevariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_entire_variable_0= ruleentire_variable ;
    public final AntlrDatatypeRuleToken rulevariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_entire_variable_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:565:28: (this_entire_variable_0= ruleentire_variable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:567:5: this_entire_variable_0= ruleentire_variable
            {
             
                    newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleentire_variable_in_rulevariable1579);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:585:1: entryRuleentire_variable returns [String current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final String entryRuleentire_variable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentire_variable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:586:2: (iv_ruleentire_variable= ruleentire_variable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:587:2: iv_ruleentire_variable= ruleentire_variable EOF
            {
             newCompositeNode(grammarAccess.getEntire_variableRule()); 
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable1624);
            iv_ruleentire_variable=ruleentire_variable();

            state._fsp--;

             current =iv_ruleentire_variable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable1635); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:594:1: ruleentire_variable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_variable_identifier_0= rulevariable_identifier ;
    public final AntlrDatatypeRuleToken ruleentire_variable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_variable_identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:597:28: (this_variable_identifier_0= rulevariable_identifier )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:599:5: this_variable_identifier_0= rulevariable_identifier
            {
             
                    newCompositeNode(grammarAccess.getEntire_variableAccess().getVariable_identifierParserRuleCall()); 
                
            pushFollow(FOLLOW_rulevariable_identifier_in_ruleentire_variable1681);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:617:1: entryRulevariable_identifier returns [String current=null] : iv_rulevariable_identifier= rulevariable_identifier EOF ;
    public final String entryRulevariable_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_identifier = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:618:2: (iv_rulevariable_identifier= rulevariable_identifier EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:619:2: iv_rulevariable_identifier= rulevariable_identifier EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1726);
            iv_rulevariable_identifier=rulevariable_identifier();

            state._fsp--;

             current =iv_rulevariable_identifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier1737); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:626:1: rulevariable_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulevariable_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:629:28: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:630:5: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier1776); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:645:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:646:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:647:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression1821);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression1832); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:654:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_expression_0= rulesimple_expression (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_expression_0 = null;

        AntlrDatatypeRuleToken this_relation_operator_1 = null;

        AntlrDatatypeRuleToken this_simple_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:657:28: ( (this_simple_expression_0= rulesimple_expression (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:658:1: (this_simple_expression_0= rulesimple_expression (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:658:1: (this_simple_expression_0= rulesimple_expression (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:659:5: this_simple_expression_0= rulesimple_expression (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression1879);
            this_simple_expression_0=rulesimple_expression();

            state._fsp--;


            		current.merge(this_simple_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:669:1: (this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=31 && LA7_0<=37)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:670:5: this_relation_operator_1= rulerelation_operator this_simple_expression_2= rulesimple_expression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getRelation_operatorParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulerelation_operator_in_ruleexpression1907);
                    this_relation_operator_1=rulerelation_operator();

                    state._fsp--;


                    		current.merge(this_relation_operator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression1934);
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


    // $ANTLR start "entryRulerelation_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:699:1: entryRulerelation_operator returns [String current=null] : iv_rulerelation_operator= rulerelation_operator EOF ;
    public final String entryRulerelation_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelation_operator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:700:2: (iv_rulerelation_operator= rulerelation_operator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:701:2: iv_rulerelation_operator= rulerelation_operator EOF
            {
             newCompositeNode(grammarAccess.getRelation_operatorRule()); 
            pushFollow(FOLLOW_rulerelation_operator_in_entryRulerelation_operator1982);
            iv_rulerelation_operator=rulerelation_operator();

            state._fsp--;

             current =iv_rulerelation_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerelation_operator1993); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelation_operator"


    // $ANTLR start "rulerelation_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:708:1: rulerelation_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelation_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:711:28: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:712:1: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:712:1: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            case 37:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:713:2: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulerelation_operator2031); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:720:2: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulerelation_operator2050); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:727:2: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulerelation_operator2069); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:734:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulerelation_operator2088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:741:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulerelation_operator2107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getGreaterThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:748:2: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulerelation_operator2126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:755:2: kw= 'in'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulerelation_operator2145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelation_operatorAccess().getInKeyword_6()); 
                        

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
    // $ANTLR end "rulerelation_operator"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:768:1: entryRulesimple_expression returns [String current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final String entryRulesimple_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:769:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:770:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2186);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2197); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:777:1: rulesimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SIGN_0= RULE_SIGN )? this_term_1= ruleterm (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )* ) ;
    public final AntlrDatatypeRuleToken rulesimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGN_0=null;
        AntlrDatatypeRuleToken this_term_1 = null;

        AntlrDatatypeRuleToken this_addition_operator_2 = null;

        AntlrDatatypeRuleToken this_term_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:780:28: ( ( (this_SIGN_0= RULE_SIGN )? this_term_1= ruleterm (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:1: ( (this_SIGN_0= RULE_SIGN )? this_term_1= ruleterm (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:1: ( (this_SIGN_0= RULE_SIGN )? this_term_1= ruleterm (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:2: (this_SIGN_0= RULE_SIGN )? this_term_1= ruleterm (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:2: (this_SIGN_0= RULE_SIGN )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SIGN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:781:7: this_SIGN_0= RULE_SIGN
                    {
                    this_SIGN_0=(Token)match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rulesimple_expression2238); 

                    		current.merge(this_SIGN_0);
                        
                     
                        newLeafNode(this_SIGN_0, grammarAccess.getSimple_expressionAccess().getSIGNTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2267);
            this_term_1=ruleterm();

            state._fsp--;


            		current.merge(this_term_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:799:1: (this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=38 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:800:5: this_addition_operator_2= ruleaddition_operator this_term_3= ruleterm
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getAddition_operatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleaddition_operator_in_rulesimple_expression2295);
            	    this_addition_operator_2=ruleaddition_operator();

            	    state._fsp--;


            	    		current.merge(this_addition_operator_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2322);
            	    this_term_3=ruleterm();

            	    state._fsp--;


            	    		current.merge(this_term_3);
            	        
            	     
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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleaddition_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:829:1: entryRuleaddition_operator returns [String current=null] : iv_ruleaddition_operator= ruleaddition_operator EOF ;
    public final String entryRuleaddition_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddition_operator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:830:2: (iv_ruleaddition_operator= ruleaddition_operator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:831:2: iv_ruleaddition_operator= ruleaddition_operator EOF
            {
             newCompositeNode(grammarAccess.getAddition_operatorRule()); 
            pushFollow(FOLLOW_ruleaddition_operator_in_entryRuleaddition_operator2370);
            iv_ruleaddition_operator=ruleaddition_operator();

            state._fsp--;

             current =iv_ruleaddition_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddition_operator2381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaddition_operator"


    // $ANTLR start "ruleaddition_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:838:1: ruleaddition_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleaddition_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:841:28: ( (kw= '+' | kw= '-' | kw= 'or' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:842:1: (kw= '+' | kw= '-' | kw= 'or' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:842:1: (kw= '+' | kw= '-' | kw= 'or' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:843:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleaddition_operator2419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAddition_operatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:850:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleaddition_operator2438); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAddition_operatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:857:2: kw= 'or'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleaddition_operator2457); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAddition_operatorAccess().getOrKeyword_2()); 
                        

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
    // $ANTLR end "ruleaddition_operator"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:870:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:871:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:872:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2498);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2509); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:879:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_multiplication_operator_1 = null;

        AntlrDatatypeRuleToken this_factor_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:882:28: ( (this_factor_0= rulefactor (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:883:1: (this_factor_0= rulefactor (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:883:1: (this_factor_0= rulefactor (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:884:5: this_factor_0= rulefactor (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefactor_in_ruleterm2556);
            this_factor_0=rulefactor();

            state._fsp--;


            		current.merge(this_factor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:894:1: (this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=41 && LA12_0<=45)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:895:5: this_multiplication_operator_1= rulemultiplication_operator this_factor_2= rulefactor
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getMultiplication_operatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_rulemultiplication_operator_in_ruleterm2584);
            	    this_multiplication_operator_1=rulemultiplication_operator();

            	    state._fsp--;


            	    		current.merge(this_multiplication_operator_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2611);
            	    this_factor_2=rulefactor();

            	    state._fsp--;


            	    		current.merge(this_factor_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRulemultiplication_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:924:1: entryRulemultiplication_operator returns [String current=null] : iv_rulemultiplication_operator= rulemultiplication_operator EOF ;
    public final String entryRulemultiplication_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplication_operator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:925:2: (iv_rulemultiplication_operator= rulemultiplication_operator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:926:2: iv_rulemultiplication_operator= rulemultiplication_operator EOF
            {
             newCompositeNode(grammarAccess.getMultiplication_operatorRule()); 
            pushFollow(FOLLOW_rulemultiplication_operator_in_entryRulemultiplication_operator2659);
            iv_rulemultiplication_operator=rulemultiplication_operator();

            state._fsp--;

             current =iv_rulemultiplication_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplication_operator2670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplication_operator"


    // $ANTLR start "rulemultiplication_operator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:933:1: rulemultiplication_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplication_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:936:28: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:937:1: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:937:1: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            case 44:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:938:2: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_rulemultiplication_operator2708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:945:2: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rulemultiplication_operator2727); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:952:2: kw= 'div'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulemultiplication_operator2746); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:959:2: kw= 'mod'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulemultiplication_operator2765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getModKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:966:2: kw= 'and'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulemultiplication_operator2784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAndKeyword_4()); 
                        

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
    // $ANTLR end "rulemultiplication_operator"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:979:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:980:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:981:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2825);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2836); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:988:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable | this_number_1= rulenumber ) ;
    public final AntlrDatatypeRuleToken rulefactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:991:28: ( (this_variable_0= rulevariable | this_number_1= rulenumber ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:992:1: (this_variable_0= rulevariable | this_number_1= rulenumber )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:992:1: (this_variable_0= rulevariable | this_number_1= rulenumber )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENTIFIER) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INTEGER_NUMBER||LA14_0==RULE_REAL_NUMBER) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:993:5: this_variable_0= rulevariable
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2883);
                    this_variable_0=rulevariable();

                    state._fsp--;


                    		current.merge(this_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1005:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2916);
                    this_number_1=rulenumber();

                    state._fsp--;


                    		current.merge(this_number_1);
                        
                     
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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1023:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1024:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1025:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber2962);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber2973); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1032:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;
        Token this_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1035:28: ( (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1036:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1036:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INTEGER_NUMBER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_REAL_NUMBER) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1036:6: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber3013); 

                    		current.merge(this_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1044:10: this_REAL_NUMBER_1= RULE_REAL_NUMBER
                    {
                    this_REAL_NUMBER_1=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rulenumber3039); 

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


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1059:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1060:2: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1061:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part3085);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part3096); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1068:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_label_declaration_part_0= rulelabel_declaration_part )? ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1071:28: ( (this_label_declaration_part_0= rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1072:1: (this_label_declaration_part_0= rulelabel_declaration_part )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1072:1: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1073:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part3143);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1091:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1092:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1093:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part3190);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part3201); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1100:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1103:28: ( (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1104:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1104:1: (kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';' )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1105:2: kw= 'label' this_label_1= rulelabel (kw= ',' this_label_3= rulelabel )* kw= ';'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_rulelabel_declaration_part3239); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part3261);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1121:1: (kw= ',' this_label_3= rulelabel )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascal.g:1122:2: kw= ',' this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_rulelabel_declaration_part3280); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part3302);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            kw=(Token)match(input,25,FOLLOW_25_in_rulelabel_declaration_part3322); 

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


 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram224 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleprogram269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleprogram_heading_block359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleprogram_heading_block374 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleprogram_heading_block393 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block415 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleprogram_heading_block433 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleprogram_heading_block448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list540 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleidentifier_list559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleidentifier_list574 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock681 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulestatement_part803 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part825 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulestatement_part843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence942 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rulestatement_sequence961 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence983 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1090 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulestatement1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1436 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleassignment_statement1454 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_ruleentire_variable1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression1879 = new BitSet(new long[]{0x0000003F80000002L});
    public static final BitSet FOLLOW_rulerelation_operator_in_ruleexpression1907 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelation_operator_in_entryRulerelation_operator1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelation_operator1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulerelation_operator2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulerelation_operator2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulerelation_operator2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulerelation_operator2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulerelation_operator2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulerelation_operator2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulerelation_operator2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rulesimple_expression2238 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2267 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleaddition_operator_in_rulesimple_expression2295 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2322 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleaddition_operator_in_entryRuleaddition_operator2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddition_operator2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleaddition_operator2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleaddition_operator2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleaddition_operator2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2556 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_rulemultiplication_operator_in_ruleterm2584 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2611 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_rulemultiplication_operator_in_entryRulemultiplication_operator2659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplication_operator2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulemultiplication_operator2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulemultiplication_operator2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulemultiplication_operator2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulemultiplication_operator2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulemultiplication_operator2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulenumber3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rulenumber3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulelabel_declaration_part3239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part3261 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_rulelabel_declaration_part3280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part3302 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_rulelabel_declaration_part3322 = new BitSet(new long[]{0x0000000000000002L});

}