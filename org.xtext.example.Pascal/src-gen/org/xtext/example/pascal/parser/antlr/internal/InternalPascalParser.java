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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:159:1: ruleprogram_heading_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Program this_ID_1= RULE_ID (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon ) ;
    public final AntlrDatatypeRuleToken ruleprogram_heading_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_identifier_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:163:6: ( (kw= Program this_ID_1= RULE_ID (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:1: (kw= Program this_ID_1= RULE_ID (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:1: (kw= Program this_ID_1= RULE_ID (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:165:2: kw= Program this_ID_1= RULE_ID (kw= LeftParenthesis this_identifier_list_3= ruleidentifier_list kw= RightParenthesis )? kw= Semicolon
            {
            kw=(Token)match(input,Program,FOLLOW_Program_in_ruleprogram_heading_block349); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprogram_heading_block364); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getProgram_heading_blockAccess().getIDTerminalRuleCall_1()); 
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:223:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= Comma this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:227:6: ( (this_ID_0= RULE_ID (kw= Comma this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:1: (this_ID_0= RULE_ID (kw= Comma this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:1: (this_ID_0= RULE_ID (kw= Comma this_ID_2= RULE_ID )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:228:6: this_ID_0= RULE_ID (kw= Comma this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list529); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIdentifier_listAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:235:1: (kw= Comma this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:236:2: kw= Comma this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_ruleidentifier_list548); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list563); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getIdentifier_listAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:309:1: rulestatement_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End ) ;
    public final AntlrDatatypeRuleToken rulestatement_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:313:6: ( (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:315:2: kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End
            {
            kw=(Token)match(input,Begin,FOLLOW_Begin_in_rulestatement_part789); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part811);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,End,FOLLOW_End_in_rulestatement_part829); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:345:1: entryRulestatement_sequence returns [String current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final String entryRulestatement_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:346:1: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:347:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence869);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence880); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:354:1: rulestatement_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* ) ;
    public final AntlrDatatypeRuleToken rulestatement_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:358:6: ( (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:359:1: (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:359:1: (this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:360:5: this_statement_0= rulestatement (kw= Semicolon this_statement_2= rulestatement )*
            {
             
                    newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence927);
            this_statement_0=rulestatement();

            state._fsp--;


            		current.merge(this_statement_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:370:1: (kw= Semicolon this_statement_2= rulestatement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Semicolon) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:371:2: kw= Semicolon this_statement_2= rulestatement
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulestatement_sequence946); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence968);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:395:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:396:1: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:397:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1015);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement.getText(); 
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:404:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_0 = null;

        AntlrDatatypeRuleToken this_simple_statement_2 = null;

        AntlrDatatypeRuleToken this_structured_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:408:6: ( ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:409:1: ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:409:1: ( (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:409:2: (this_label_0= rulelabel kw= Colon )? (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:409:2: (this_label_0= rulelabel kw= Colon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INTEGER_NUMBER||LA4_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:410:5: this_label_0= rulelabel kw= Colon
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1074);
                    this_label_0=rulelabel();

                    state._fsp--;


                    		current.merge(this_label_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulestatement1092); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:426:3: (this_simple_statement_2= rulesimple_statement | this_structured_statement_3= rulestructured_statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==Until||LA5_0==Else||LA5_0==Goto||LA5_0==End||LA5_0==Semicolon||LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==Repeat||LA5_0==Begin||(LA5_0>=While && LA5_0<=Case)||LA5_0==With||LA5_0==For||LA5_0==If) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:427:5: this_simple_statement_2= rulesimple_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1117);
                    this_simple_statement_2=rulesimple_statement();

                    state._fsp--;


                    		current.merge(this_simple_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:439:5: this_structured_statement_3= rulestructured_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement1150);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:457:1: entryRulelabel returns [String current=null] : iv_rulelabel= rulelabel EOF ;
    public final String entryRulelabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:458:1: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:459:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1196);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1207); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:466:1: rulelabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulelabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_INTEGER_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:470:6: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:471:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:471:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER )
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:471:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1247); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getLabelAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:479:10: this_INTEGER_NUMBER_1= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_1=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1273); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:494:1: entryRulesimple_statement returns [String current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final String entryRulesimple_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:495:1: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:496:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1318);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1329); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:503:1: rulesimple_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_ID_3= RULE_ID )? ;
    public final AntlrDatatypeRuleToken rulesimple_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_assignment_statement_0 = null;

        AntlrDatatypeRuleToken this_function_designator_1 = null;

        AntlrDatatypeRuleToken this_goto_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:507:6: ( (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_ID_3= RULE_ID )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:508:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_ID_3= RULE_ID )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:508:1: (this_assignment_statement_0= ruleassignment_statement | this_function_designator_1= rulefunction_designator | this_goto_statement_2= rulegoto_statement | this_ID_3= RULE_ID )?
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case LeftParenthesis:
                        {
                        alt7=2;
                        }
                        break;
                    case EOF:
                    case Until:
                    case Else:
                    case End:
                    case Semicolon:
                        {
                        alt7=4;
                        }
                        break;
                    case ColonEqualsSign:
                    case FullStop:
                    case LeftSquareBracket:
                    case CircumflexAccent:
                        {
                        alt7=1;
                        }
                        break;
                }

            }
            else if ( (LA7_0==Goto) ) {
                alt7=3;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:509:5: this_assignment_statement_0= ruleassignment_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1376);
                    this_assignment_statement_0=ruleassignment_statement();

                    state._fsp--;


                    		current.merge(this_assignment_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:521:5: this_function_designator_1= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulesimple_statement1409);
                    this_function_designator_1=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:533:5: this_goto_statement_2= rulegoto_statement
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement1442);
                    this_goto_statement_2=rulegoto_statement();

                    state._fsp--;


                    		current.merge(this_goto_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:544:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_statement1468); 

                    		current.merge(this_ID_3);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:559:1: entryRuleassignment_statement returns [String current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final String entryRuleassignment_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:560:1: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:561:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1514);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1525); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:568:1: ruleassignment_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression ) ;
    public final AntlrDatatypeRuleToken ruleassignment_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:572:6: ( (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:573:1: (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:573:1: (this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:574:5: this_variable_0= rulevariable kw= ColonEqualsSign this_expression_2= ruleexpression
            {
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1572);
            this_variable_0=rulevariable();

            state._fsp--;


            		current.merge(this_variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,ColonEqualsSign,FOLLOW_ColonEqualsSign_in_ruleassignment_statement1590); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1612);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:609:1: entryRulevariable returns [String current=null] : iv_rulevariable= rulevariable EOF ;
    public final String entryRulevariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:610:1: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:611:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1657);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1668); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:618:1: rulevariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_variable__1= rulevariable_ ) ;
    public final AntlrDatatypeRuleToken rulevariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_variable__1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:622:6: ( (this_ID_0= RULE_ID this_variable__1= rulevariable_ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:623:1: (this_ID_0= RULE_ID this_variable__1= rulevariable_ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:623:1: (this_ID_0= RULE_ID this_variable__1= rulevariable_ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:623:6: this_ID_0= RULE_ID this_variable__1= rulevariable_
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable1708); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getVariableAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariableAccess().getVariable_ParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable__in_rulevariable1735);
            this_variable__1=rulevariable_();

            state._fsp--;


            		current.merge(this_variable__1);
                
             
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevariable_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:649:1: entryRulevariable_ returns [String current=null] : iv_rulevariable_= rulevariable_ EOF ;
    public final String entryRulevariable_() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_ = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:650:1: (iv_rulevariable_= rulevariable_ EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:651:2: iv_rulevariable_= rulevariable_ EOF
            {
             newCompositeNode(grammarAccess.getVariable_Rule()); 
            pushFollow(FOLLOW_rulevariable__in_entryRulevariable_1780);
            iv_rulevariable_=rulevariable_();

            state._fsp--;

             current =iv_rulevariable_.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_1791); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_"


    // $ANTLR start "rulevariable_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:658:1: rulevariable_ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ ) | (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ ) | (kw= CircumflexAccent this_variable__8= rulevariable_ ) )? ;
    public final AntlrDatatypeRuleToken rulevariable_() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_expression_list_1 = null;

        AntlrDatatypeRuleToken this_variable__3 = null;

        AntlrDatatypeRuleToken this_variable__6 = null;

        AntlrDatatypeRuleToken this_variable__8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:662:6: ( ( (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ ) | (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ ) | (kw= CircumflexAccent this_variable__8= rulevariable_ ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:663:1: ( (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ ) | (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ ) | (kw= CircumflexAccent this_variable__8= rulevariable_ ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:663:1: ( (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ ) | (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ ) | (kw= CircumflexAccent this_variable__8= rulevariable_ ) )?
            int alt8=4;
            switch ( input.LA(1) ) {
                case LeftSquareBracket:
                    {
                    alt8=1;
                    }
                    break;
                case FullStop:
                    {
                    alt8=2;
                    }
                    break;
                case CircumflexAccent:
                    {
                    alt8=3;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:663:2: (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:663:2: (kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:664:2: kw= LeftSquareBracket this_expression_list_1= ruleexpression_list kw= RightSquareBracket this_variable__3= rulevariable_
                    {
                    kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulevariable_1830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_Access().getLeftSquareBracketKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getVariable_Access().getExpression_listParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_rulevariable_1852);
                    this_expression_list_1=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulevariable_1870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_Access().getRightSquareBracketKeyword_0_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getVariable_Access().getVariable_ParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_rulevariable__in_rulevariable_1892);
                    this_variable__3=rulevariable_();

                    state._fsp--;


                    		current.merge(this_variable__3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:698:6: (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:698:6: (kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:699:2: kw= FullStop this_ID_5= RULE_ID this_variable__6= rulevariable_
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulevariable_1918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_Access().getFullStopKeyword_1_0()); 
                        
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_1933); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getVariable_Access().getIDTerminalRuleCall_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getVariable_Access().getVariable_ParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulevariable__in_rulevariable_1960);
                    this_variable__6=rulevariable_();

                    state._fsp--;


                    		current.merge(this_variable__6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:723:6: (kw= CircumflexAccent this_variable__8= rulevariable_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:723:6: (kw= CircumflexAccent this_variable__8= rulevariable_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:724:2: kw= CircumflexAccent this_variable__8= rulevariable_
                    {
                    kw=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulevariable_1986); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariable_Access().getCircumflexAccentKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getVariable_Access().getVariable_ParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_rulevariable__in_rulevariable_2008);
                    this_variable__8=rulevariable_();

                    state._fsp--;


                    		current.merge(this_variable__8);
                        
                     
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
    // $ANTLR end "rulevariable_"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:748:1: entryRuleexpression_list returns [String current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final String entryRuleexpression_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:749:1: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list2055);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list2066); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:757:1: ruleexpression_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpression_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:761:6: ( (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:762:1: (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:762:1: (this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:763:5: this_expression_0= ruleexpression (kw= Comma this_expression_2= ruleexpression )*
            {
             
                    newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2113);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:773:1: (kw= Comma this_expression_2= ruleexpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:774:2: kw= Comma this_expression_2= ruleexpression
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_ruleexpression_list2132); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2154);
            	    this_expression_2=ruleexpression();

            	    state._fsp--;


            	    		current.merge(this_expression_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:798:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:799:1: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:800:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2201);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2212); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:807:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_expression_0= rulesimple_expression ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RELATIONAL_OPERATOR_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_simple_expression_0 = null;

        AntlrDatatypeRuleToken this_simple_expression_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:811:6: ( (this_simple_expression_0= rulesimple_expression ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:812:1: (this_simple_expression_0= rulesimple_expression ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:812:1: (this_simple_expression_0= rulesimple_expression ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:813:5: this_simple_expression_0= rulesimple_expression ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2259);
            this_simple_expression_0=rulesimple_expression();

            state._fsp--;


            		current.merge(this_simple_expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:823:1: ( (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==In||LA11_0==EqualsSign||LA11_0==RULE_RELATIONAL_OPERATOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:823:2: (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign ) this_simple_expression_4= rulesimple_expression
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:823:2: (this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR | kw= In | kw= EqualsSign )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt10=1;
                        }
                        break;
                    case In:
                        {
                        alt10=2;
                        }
                        break;
                    case EqualsSign:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:823:7: this_RELATIONAL_OPERATOR_1= RULE_RELATIONAL_OPERATOR
                            {
                            this_RELATIONAL_OPERATOR_1=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2281); 

                            		current.merge(this_RELATIONAL_OPERATOR_1);
                                
                             
                                newLeafNode(this_RELATIONAL_OPERATOR_1, grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:832:2: kw= In
                            {
                            kw=(Token)match(input,In,FOLLOW_In_in_ruleexpression2305); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getExpressionAccess().getInKeyword_1_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:839:2: kw= EqualsSign
                            {
                            kw=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleexpression2324); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_0_2()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2347);
                    this_simple_expression_4=rulesimple_expression();

                    state._fsp--;


                    		current.merge(this_simple_expression_4);
                        
                     
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:863:1: entryRulesimple_expression returns [String current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final String entryRulesimple_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_expression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:864:1: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:865:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2394);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2405); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:872:1: rulesimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) ;
    public final AntlrDatatypeRuleToken rulesimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_0=null;
        Token this_ADDITION_OPERATOR_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_term_1 = null;

        AntlrDatatypeRuleToken this_term_4 = null;

        AntlrDatatypeRuleToken this_signed_number_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:876:6: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:877:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:877:1: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:877:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? this_term_1= ruleterm ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:877:2: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ADDITION_OPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:877:7: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                    {
                    this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2446); 

                    		current.merge(this_ADDITION_OPERATOR_0);
                        
                     
                        newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2475);
            this_term_1=ruleterm();

            state._fsp--;


            		current.merge(this_term_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:1: ( ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm ) | this_signed_number_5= rulesigned_number )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Or||LA15_0==RULE_ADDITION_OPERATOR) ) {
                    alt15=1;
                }
                else if ( ((LA15_0>=RULE_SIGNED_INTEGER_NUMBER && LA15_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:2: ( ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or ) this_term_4= ruleterm
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:3: ( (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+ | kw= Or )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ADDITION_OPERATOR) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==Or) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:4: (this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR )+
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
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:9: this_ADDITION_OPERATOR_2= RULE_ADDITION_OPERATOR
            	            	    {
            	            	    this_ADDITION_OPERATOR_2=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2499); 

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
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:904:2: kw= Or
            	            {
            	            kw=(Token)match(input,Or,FOLLOW_Or_in_rulesimple_expression2525); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getOrKeyword_2_0_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2548);
            	    this_term_4=ruleterm();

            	    state._fsp--;


            	    		current.merge(this_term_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:922:5: this_signed_number_5= rulesigned_number
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulesigned_number_in_rulesimple_expression2582);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:940:1: entryRuleterm returns [String current=null] : iv_ruleterm= ruleterm EOF ;
    public final String entryRuleterm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleterm = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:941:1: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:942:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2629);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2640); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:949:1: ruleterm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_factor_0= rulefactor ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )* ) ;
    public final AntlrDatatypeRuleToken ruleterm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTIPLICATION_OPERATOR_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_factor_0 = null;

        AntlrDatatypeRuleToken this_factor_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:953:6: ( (this_factor_0= rulefactor ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:954:1: (this_factor_0= rulefactor ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:954:1: (this_factor_0= rulefactor ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:5: this_factor_0= rulefactor ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefactor_in_ruleterm2687);
            this_factor_0=rulefactor();

            state._fsp--;


            		current.merge(this_factor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:1: ( (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=And && LA17_0<=Div)||LA17_0==Mod||LA17_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:2: (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And ) this_factor_5= rulefactor
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:2: (this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR | kw= Div | kw= Mod | kw= And )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case Div:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case Mod:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case And:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:965:7: this_MULTIPLICATION_OPERATOR_1= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            this_MULTIPLICATION_OPERATOR_1=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2709); 

            	            		current.merge(this_MULTIPLICATION_OPERATOR_1);
            	                
            	             
            	                newLeafNode(this_MULTIPLICATION_OPERATOR_1, grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:974:2: kw= Div
            	            {
            	            kw=(Token)match(input,Div,FOLLOW_Div_in_ruleterm2733); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTermAccess().getDivKeyword_1_0_1()); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:981:2: kw= Mod
            	            {
            	            kw=(Token)match(input,Mod,FOLLOW_Mod_in_ruleterm2752); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTermAccess().getModKeyword_1_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:988:2: kw= And
            	            {
            	            kw=(Token)match(input,And,FOLLOW_And_in_ruleterm2771); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTermAccess().getAndKeyword_1_0_3()); 
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2794);
            	    this_factor_5=rulefactor();

            	    state._fsp--;


            	    		current.merge(this_factor_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1012:1: entryRulefactor returns [String current=null] : iv_rulefactor= rulefactor EOF ;
    public final String entryRulefactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1013:1: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2841);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2852); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1021:1: rulefactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | kw= Nil | kw= True | kw= False | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (kw= Not this_factor_12= rulefactor ) ) ;
    public final AntlrDatatypeRuleToken rulefactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_variable_0 = null;

        AntlrDatatypeRuleToken this_number_1 = null;

        AntlrDatatypeRuleToken this_set_3 = null;

        AntlrDatatypeRuleToken this_function_designator_7 = null;

        AntlrDatatypeRuleToken this_expression_9 = null;

        AntlrDatatypeRuleToken this_factor_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1025:6: ( (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | kw= Nil | kw= True | kw= False | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (kw= Not this_factor_12= rulefactor ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1026:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | kw= Nil | kw= True | kw= False | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (kw= Not this_factor_12= rulefactor ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1026:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | kw= Nil | kw= True | kw= False | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (kw= Not this_factor_12= rulefactor ) )
            int alt18=10;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1027:5: this_variable_0= rulevariable
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2899);
                    this_variable_0=rulevariable();

                    state._fsp--;


                    		current.merge(this_variable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1039:5: this_number_1= rulenumber
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2932);
                    this_number_1=rulenumber();

                    state._fsp--;


                    		current.merge(this_number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1050:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2958); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1059:5: this_set_3= ruleset
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleset_in_rulefactor2991);
                    this_set_3=ruleset();

                    state._fsp--;


                    		current.merge(this_set_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1071:2: kw= Nil
                    {
                    kw=(Token)match(input,Nil,FOLLOW_Nil_in_rulefactor3015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getNilKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1078:2: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_True_in_rulefactor3034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getTrueKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1085:2: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_False_in_rulefactor3053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getFalseKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1092:5: this_function_designator_7= rulefunction_designator
                    {
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor3081);
                    this_function_designator_7=rulefunction_designator();

                    state._fsp--;


                    		current.merge(this_function_designator_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1103:6: (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1103:6: (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1104:2: kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis
                    {
                    kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefactor3106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_8_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor3128);
                    this_expression_9=ruleexpression();

                    state._fsp--;


                    		current.merge(this_expression_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefactor3146); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1127:6: (kw= Not this_factor_12= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1127:6: (kw= Not this_factor_12= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1128:2: kw= Not this_factor_12= rulefactor
                    {
                    kw=(Token)match(input,Not,FOLLOW_Not_in_rulefactor3167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3189);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1152:1: entryRulenumber returns [String current=null] : iv_rulenumber= rulenumber EOF ;
    public final String entryRulenumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1153:1: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1154:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3235);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3246); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1161:1: rulenumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final AntlrDatatypeRuleToken rulenumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unsigned_number_0 = null;

        AntlrDatatypeRuleToken this_signed_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1165:6: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1166:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1166:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INTEGER_NUMBER && LA19_0<=RULE_REAL_NUMBER)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_SIGNED_INTEGER_NUMBER && LA19_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1167:5: this_unsigned_number_0= ruleunsigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunsigned_number_in_rulenumber3293);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    		current.merge(this_unsigned_number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1179:5: this_signed_number_1= rulesigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesigned_number_in_rulenumber3326);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1197:1: entryRuleunsigned_number returns [String current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final String entryRuleunsigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1198:1: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1199:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3371);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3382); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1206:1: ruleunsigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleunsigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_NUMBER_0=null;
        Token this_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1210:6: ( (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1211:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1211:1: (this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER | this_REAL_NUMBER_1= RULE_REAL_NUMBER )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INTEGER_NUMBER) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_REAL_NUMBER) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1211:6: this_INTEGER_NUMBER_0= RULE_INTEGER_NUMBER
                    {
                    this_INTEGER_NUMBER_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3422); 

                    		current.merge(this_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_INTEGER_NUMBER_0, grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1219:10: this_REAL_NUMBER_1= RULE_REAL_NUMBER
                    {
                    this_REAL_NUMBER_1=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3448); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1234:1: entryRulesigned_number returns [String current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final String entryRulesigned_number() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1235:1: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1236:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3493);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3504); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1243:1: rulesigned_number returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulesigned_number() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_NUMBER_0=null;
        Token this_SIGNED_REAL_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1247:6: ( (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1248:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1248:1: (this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER | this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1248:6: this_SIGNED_INTEGER_NUMBER_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    this_SIGNED_INTEGER_NUMBER_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3544); 

                    		current.merge(this_SIGNED_INTEGER_NUMBER_0);
                        
                     
                        newLeafNode(this_SIGNED_INTEGER_NUMBER_0, grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1256:10: this_SIGNED_REAL_NUMBER_1= RULE_SIGNED_REAL_NUMBER
                    {
                    this_SIGNED_REAL_NUMBER_1=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3570); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1271:1: entryRuleset returns [String current=null] : iv_ruleset= ruleset EOF ;
    public final String entryRuleset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1272:1: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1273:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3615);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3626); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1280:1: ruleset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1284:6: ( (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:1: (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:1: (kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:2: kw= LeftSquareBracket (this_expression_list_1= ruleexpression_list )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleset3664); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1291:1: (this_expression_list_1= ruleexpression_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==False||LA22_0==True||(LA22_0>=Nil && LA22_0<=Not)||LA22_0==LeftParenthesis||LA22_0==LeftSquareBracket||(LA22_0>=RULE_INTEGER_NUMBER && LA22_0<=RULE_SIGNED_REAL_NUMBER)||LA22_0==RULE_ADDITION_OPERATOR||LA22_0==RULE_ID||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1292:5: this_expression_list_1= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3687);
                    this_expression_list_1=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleset3707); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1316:1: entryRulefunction_designator returns [String current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final String entryRulefunction_designator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1317:1: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1318:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3747);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3758); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1325:1: rulefunction_designator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken rulefunction_designator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1329:6: ( (this_ID_0= RULE_ID kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1330:1: (this_ID_0= RULE_ID kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1330:1: (this_ID_0= RULE_ID kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1330:6: this_ID_0= RULE_ID kw= LeftParenthesis (this_expression_list_2= ruleexpression_list )? kw= RightParenthesis
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_designator3798); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFunction_designatorAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefunction_designator3816); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1343:1: (this_expression_list_2= ruleexpression_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==False||LA23_0==True||(LA23_0>=Nil && LA23_0<=Not)||LA23_0==LeftParenthesis||LA23_0==LeftSquareBracket||(LA23_0>=RULE_INTEGER_NUMBER && LA23_0<=RULE_SIGNED_REAL_NUMBER)||LA23_0==RULE_ADDITION_OPERATOR||LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1344:5: this_expression_list_2= ruleexpression_list
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3839);
                    this_expression_list_2=ruleexpression_list();

                    state._fsp--;


                    		current.merge(this_expression_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefunction_designator3859); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1368:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1369:1: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1370:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement3899);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement3910); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1377:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_compound_statement_0 = null;

        AntlrDatatypeRuleToken this_repetitive_statement_1 = null;

        AntlrDatatypeRuleToken this_conditional_statement_2 = null;

        AntlrDatatypeRuleToken this_with_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1381:6: ( (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1382:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1382:1: (this_compound_statement_0= rulecompound_statement | this_repetitive_statement_1= rulerepetitive_statement | this_conditional_statement_2= ruleconditional_statement | this_with_statement_3= rulewith_statement )
            int alt24=4;
            switch ( input.LA(1) ) {
            case Begin:
                {
                alt24=1;
                }
                break;
            case Repeat:
            case While:
            case For:
                {
                alt24=2;
                }
                break;
            case Case:
            case If:
                {
                alt24=3;
                }
                break;
            case With:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1383:5: this_compound_statement_0= rulecompound_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement3957);
                    this_compound_statement_0=rulecompound_statement();

                    state._fsp--;


                    		current.merge(this_compound_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1395:5: this_repetitive_statement_1= rulerepetitive_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement3990);
                    this_repetitive_statement_1=rulerepetitive_statement();

                    state._fsp--;


                    		current.merge(this_repetitive_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1407:5: this_conditional_statement_2= ruleconditional_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement4023);
                    this_conditional_statement_2=ruleconditional_statement();

                    state._fsp--;


                    		current.merge(this_conditional_statement_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1419:5: this_with_statement_3= rulewith_statement
                    {
                     
                            newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement4056);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1437:1: entryRulecompound_statement returns [String current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final String entryRulecompound_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1438:1: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1439:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement4101);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement4112); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1446:1: rulecompound_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End ) ;
    public final AntlrDatatypeRuleToken rulecompound_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1450:6: ( (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1451:1: (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1451:1: (kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1452:2: kw= Begin this_statement_sequence_1= rulestatement_sequence kw= End
            {
            kw=(Token)match(input,Begin,FOLLOW_Begin_in_rulecompound_statement4150); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4172);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,End,FOLLOW_End_in_rulecompound_statement4190); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
                

            }


            }

             leaveRule();
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1482:1: entryRulerepetitive_statement returns [String current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final String entryRulerepetitive_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1483:1: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1484:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4230);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4241); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1491:1: rulerepetitive_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) ;
    public final AntlrDatatypeRuleToken rulerepetitive_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_while_statement_0 = null;

        AntlrDatatypeRuleToken this_repeat_statement_1 = null;

        AntlrDatatypeRuleToken this_for_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1495:6: ( (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1496:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1496:1: (this_while_statement_0= rulewhile_statement | this_repeat_statement_1= rulerepeat_statement | this_for_statement_2= rulefor_statement )
            int alt25=3;
            switch ( input.LA(1) ) {
            case While:
                {
                alt25=1;
                }
                break;
            case Repeat:
                {
                alt25=2;
                }
                break;
            case For:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1497:5: this_while_statement_0= rulewhile_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4288);
                    this_while_statement_0=rulewhile_statement();

                    state._fsp--;


                    		current.merge(this_while_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1509:5: this_repeat_statement_1= rulerepeat_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4321);
                    this_repeat_statement_1=rulerepeat_statement();

                    state._fsp--;


                    		current.merge(this_repeat_statement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1521:5: this_for_statement_2= rulefor_statement
                    {
                     
                            newCompositeNode(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4354);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1539:1: entryRulewhile_statement returns [String current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final String entryRulewhile_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1540:1: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1541:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4399);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4410); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1548:1: rulewhile_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= While this_expression_1= ruleexpression kw= Do this_statement_3= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewhile_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1552:6: ( (kw= While this_expression_1= ruleexpression kw= Do this_statement_3= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1553:1: (kw= While this_expression_1= ruleexpression kw= Do this_statement_3= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1553:1: (kw= While this_expression_1= ruleexpression kw= Do this_statement_3= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1554:2: kw= While this_expression_1= ruleexpression kw= Do this_statement_3= rulestatement
            {
            kw=(Token)match(input,While,FOLLOW_While_in_rulewhile_statement4448); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4470);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Do,FOLLOW_Do_in_rulewhile_statement4488); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWhile_statementAccess().getDoKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4510);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1595:1: entryRulerepeat_statement returns [String current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final String entryRulerepeat_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1596:1: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1597:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4555);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4566); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1604:1: rulerepeat_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Repeat this_statement_sequence_1= rulestatement_sequence kw= Until this_expression_3= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerepeat_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_sequence_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1608:6: ( (kw= Repeat this_statement_sequence_1= rulestatement_sequence kw= Until this_expression_3= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (kw= Repeat this_statement_sequence_1= rulestatement_sequence kw= Until this_expression_3= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (kw= Repeat this_statement_sequence_1= rulestatement_sequence kw= Until this_expression_3= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1610:2: kw= Repeat this_statement_sequence_1= rulestatement_sequence kw= Until this_expression_3= ruleexpression
            {
            kw=(Token)match(input,Repeat,FOLLOW_Repeat_in_rulerepeat_statement4604); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4626);
            this_statement_sequence_1=rulestatement_sequence();

            state._fsp--;


            		current.merge(this_statement_sequence_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Until,FOLLOW_Until_in_rulerepeat_statement4644); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4666);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1651:1: entryRulefor_statement returns [String current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final String entryRulefor_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1652:1: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1653:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4711);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4722); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1660:1: rulefor_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= For this_assignment_statement_1= ruleassignment_statement (kw= To | kw= Downto ) this_expression_4= ruleexpression kw= Do this_statement_6= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulefor_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assignment_statement_1 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1664:6: ( (kw= For this_assignment_statement_1= ruleassignment_statement (kw= To | kw= Downto ) this_expression_4= ruleexpression kw= Do this_statement_6= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1665:1: (kw= For this_assignment_statement_1= ruleassignment_statement (kw= To | kw= Downto ) this_expression_4= ruleexpression kw= Do this_statement_6= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1665:1: (kw= For this_assignment_statement_1= ruleassignment_statement (kw= To | kw= Downto ) this_expression_4= ruleexpression kw= Do this_statement_6= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1666:2: kw= For this_assignment_statement_1= ruleassignment_statement (kw= To | kw= Downto ) this_expression_4= ruleexpression kw= Do this_statement_6= rulestatement
            {
            kw=(Token)match(input,For,FOLLOW_For_in_rulefor_statement4760); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getForKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4782);
            this_assignment_statement_1=ruleassignment_statement();

            state._fsp--;


            		current.merge(this_assignment_statement_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1682:1: (kw= To | kw= Downto )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==To) ) {
                alt26=1;
            }
            else if ( (LA26_0==Downto) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1683:2: kw= To
                    {
                    kw=(Token)match(input,To,FOLLOW_To_in_rulefor_statement4801); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFor_statementAccess().getToKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1690:2: kw= Downto
                    {
                    kw=(Token)match(input,Downto,FOLLOW_Downto_in_rulefor_statement4820); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4843);
            this_expression_4=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_4);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Do,FOLLOW_Do_in_rulefor_statement4861); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFor_statementAccess().getDoKeyword_4()); 
                
             
                    newCompositeNode(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4883);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1731:1: entryRuleconditional_statement returns [String current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final String entryRuleconditional_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1732:1: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1733:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4928);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement4939); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1740:1: ruleconditional_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) ;
    public final AntlrDatatypeRuleToken ruleconditional_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_if_statement_0 = null;

        AntlrDatatypeRuleToken this_case_statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1744:6: ( (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1745:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1745:1: (this_if_statement_0= ruleif_statement | this_case_statement_1= rulecase_statement )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==If) ) {
                alt27=1;
            }
            else if ( (LA27_0==Case) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1746:5: this_if_statement_0= ruleif_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getIf_statementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement4986);
                    this_if_statement_0=ruleif_statement();

                    state._fsp--;


                    		current.merge(this_if_statement_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1758:5: this_case_statement_1= rulecase_statement
                    {
                     
                            newCompositeNode(grammarAccess.getConditional_statementAccess().getCase_statementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement5019);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1776:1: entryRuleif_statement returns [String current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final String entryRuleif_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1777:1: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1778:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement5064);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement5075); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1785:1: ruleif_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= If this_expression_1= ruleexpression kw= Then this_statement_3= rulestatement (kw= Else this_statement_5= rulestatement )? ) ;
    public final AntlrDatatypeRuleToken ruleif_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_statement_3 = null;

        AntlrDatatypeRuleToken this_statement_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1789:6: ( (kw= If this_expression_1= ruleexpression kw= Then this_statement_3= rulestatement (kw= Else this_statement_5= rulestatement )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1790:1: (kw= If this_expression_1= ruleexpression kw= Then this_statement_3= rulestatement (kw= Else this_statement_5= rulestatement )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1790:1: (kw= If this_expression_1= ruleexpression kw= Then this_statement_3= rulestatement (kw= Else this_statement_5= rulestatement )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1791:2: kw= If this_expression_1= ruleexpression kw= Then this_statement_3= rulestatement (kw= Else this_statement_5= rulestatement )?
            {
            kw=(Token)match(input,If,FOLLOW_If_in_ruleif_statement5113); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5135);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Then,FOLLOW_Then_in_ruleif_statement5153); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIf_statementAccess().getThenKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5175);
            this_statement_3=rulestatement();

            state._fsp--;


            		current.merge(this_statement_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1824:1: (kw= Else this_statement_5= rulestatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Else) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1825:2: kw= Else this_statement_5= rulestatement
                    {
                    kw=(Token)match(input,Else,FOLLOW_Else_in_ruleif_statement5194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_statementAccess().getElseKeyword_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5216);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1849:1: entryRulecase_statement returns [String current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final String entryRulecase_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1850:1: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1851:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5263);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5274); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1858:1: rulecase_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Case this_expression_1= ruleexpression kw= Of this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? kw= End ) ;
    public final AntlrDatatypeRuleToken rulecase_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_case_limb_3 = null;

        AntlrDatatypeRuleToken this_case_limb_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1862:6: ( (kw= Case this_expression_1= ruleexpression kw= Of this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? kw= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1863:1: (kw= Case this_expression_1= ruleexpression kw= Of this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? kw= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1863:1: (kw= Case this_expression_1= ruleexpression kw= Of this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? kw= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1864:2: kw= Case this_expression_1= ruleexpression kw= Of this_case_limb_3= rulecase_limb (kw= Semicolon this_case_limb_5= rulecase_limb )* (kw= Semicolon )? kw= End
            {
            kw=(Token)match(input,Case,FOLLOW_Case_in_rulecase_statement5312); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_statementAccess().getCaseKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement5334);
            this_expression_1=ruleexpression();

            state._fsp--;


            		current.merge(this_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_rulecase_statement5352); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_statementAccess().getOfKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5374);
            this_case_limb_3=rulecase_limb();

            state._fsp--;


            		current.merge(this_case_limb_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1897:1: (kw= Semicolon this_case_limb_5= rulecase_limb )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Semicolon) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==False||LA29_1==True||LA29_1==Nil||(LA29_1>=RULE_INTEGER_NUMBER && LA29_1<=RULE_SIGNED_REAL_NUMBER)||LA29_1==RULE_ADDITION_OPERATOR||LA29_1==RULE_ID||LA29_1==RULE_STRING) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1898:2: kw= Semicolon this_case_limb_5= rulecase_limb
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5393); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_4_1()); 
            	        
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5415);
            	    this_case_limb_5=rulecase_limb();

            	    state._fsp--;


            	    		current.merge(this_case_limb_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1914:3: (kw= Semicolon )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Semicolon) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1915:2: kw= Semicolon
                    {
                    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,End,FOLLOW_End_in_rulecase_statement5451); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_statementAccess().getEndKeyword_6()); 
                

            }


            }

             leaveRule();
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1934:1: entryRulecase_limb returns [String current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final String entryRulecase_limb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1935:1: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1936:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5491);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5502); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1943:1: rulecase_limb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulecase_limb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1947:6: ( (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1948:1: (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1948:1: (this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1949:5: this_case_label_list_0= rulecase_label_list kw= Colon this_statement_2= rulestatement
            {
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5549);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulecase_limb5567); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCase_limbAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getCase_limbAccess().getStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5589);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1984:1: entryRulecase_label_list returns [String current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final String entryRulecase_label_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1985:1: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1986:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5634);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5645); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1993:1: rulecase_label_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* ) ;
    public final AntlrDatatypeRuleToken rulecase_label_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1997:6: ( (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1998:1: (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1998:1: (this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1999:5: this_constant_0= ruleconstant (kw= Comma this_constant_2= ruleconstant )*
            {
             
                    newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5692);
            this_constant_0=ruleconstant();

            state._fsp--;


            		current.merge(this_constant_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2009:1: (kw= Comma this_constant_2= ruleconstant )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2010:2: kw= Comma this_constant_2= ruleconstant
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulecase_label_list5711); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5733);
            	    this_constant_2=ruleconstant();

            	    state._fsp--;


            	    		current.merge(this_constant_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2034:1: entryRuleconstant returns [String current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final String entryRuleconstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2035:1: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2036:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant5780);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant5791); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2043:1: ruleconstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING | kw= True | kw= False | kw= Nil ) ;
    public final AntlrDatatypeRuleToken ruleconstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITION_OPERATOR_0=null;
        Token this_ID_1=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_number_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2047:6: ( ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING | kw= True | kw= False | kw= Nil ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING | kw= True | kw= False | kw= Nil )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:1: ( ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) ) | this_STRING_3= RULE_STRING | kw= True | kw= False | kw= Nil )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
                {
                alt34=1;
                }
                break;
            case RULE_STRING:
                {
                alt34=2;
                }
                break;
            case True:
                {
                alt34=3;
                }
                break;
            case False:
                {
                alt34=4;
                }
                break;
            case Nil:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:2: ( (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )? (this_ID_1= RULE_ID | this_number_2= rulenumber )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:3: (this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ADDITION_OPERATOR) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2048:8: this_ADDITION_OPERATOR_0= RULE_ADDITION_OPERATOR
                            {
                            this_ADDITION_OPERATOR_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5833); 

                            		current.merge(this_ADDITION_OPERATOR_0);
                                
                             
                                newLeafNode(this_ADDITION_OPERATOR_0, grammarAccess.getConstantAccess().getADDITION_OPERATORTerminalRuleCall_0_0()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2055:3: (this_ID_1= RULE_ID | this_number_2= rulenumber )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    else if ( ((LA33_0>=RULE_INTEGER_NUMBER && LA33_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2055:8: this_ID_1= RULE_ID
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant5856); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getConstantAccess().getIDTerminalRuleCall_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2064:5: this_number_2= rulenumber
                            {
                             
                                    newCompositeNode(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant5889);
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2075:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant5917); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2084:2: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_True_in_ruleconstant5941); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstantAccess().getTrueKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2091:2: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_False_in_ruleconstant5960); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstantAccess().getFalseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2098:2: kw= Nil
                    {
                    kw=(Token)match(input,Nil,FOLLOW_Nil_in_ruleconstant5979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstantAccess().getNilKeyword_4()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2111:1: entryRulewith_statement returns [String current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final String entryRulewith_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2112:1: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2113:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement6019);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement6030); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2120:1: rulewith_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= With this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* kw= Do this_statement_5= rulestatement ) ;
    public final AntlrDatatypeRuleToken rulewith_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_variable_1 = null;

        AntlrDatatypeRuleToken this_variable_3 = null;

        AntlrDatatypeRuleToken this_statement_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2124:6: ( (kw= With this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* kw= Do this_statement_5= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2125:1: (kw= With this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* kw= Do this_statement_5= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2125:1: (kw= With this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* kw= Do this_statement_5= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2126:2: kw= With this_variable_1= rulevariable (kw= Comma this_variable_3= rulevariable )* kw= Do this_statement_5= rulestatement
            {
            kw=(Token)match(input,With,FOLLOW_With_in_rulewith_statement6068); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWith_statementAccess().getWithKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement6090);
            this_variable_1=rulevariable();

            state._fsp--;


            		current.merge(this_variable_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2142:1: (kw= Comma this_variable_3= rulevariable )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2143:2: kw= Comma this_variable_3= rulevariable
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulewith_statement6109); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement6131);
            	    this_variable_3=rulevariable();

            	    state._fsp--;


            	    		current.merge(this_variable_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            kw=(Token)match(input,Do,FOLLOW_Do_in_rulewith_statement6151); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWith_statementAccess().getDoKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getWith_statementAccess().getStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement6173);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2184:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2185:1: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2186:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement6218);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement6229); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2193:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goto this_label_1= rulelabel ) ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2197:6: ( (kw= Goto this_label_1= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2198:1: (kw= Goto this_label_1= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2198:1: (kw= Goto this_label_1= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2199:2: kw= Goto this_label_1= rulelabel
            {
            kw=(Token)match(input,Goto,FOLLOW_Goto_in_rulegoto_statement6267); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGoto_statementAccess().getGotoKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement6289);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2223:1: entryRuledeclaration_part returns [String current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final String entryRuledeclaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2224:1: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2225:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6334);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part6345); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2232:1: ruledeclaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_label_declaration_part_0 = null;

        AntlrDatatypeRuleToken this_constant_definition_part_1 = null;

        AntlrDatatypeRuleToken this_type_definition_part_2 = null;

        AntlrDatatypeRuleToken this_variable_declaration_part_3 = null;

        AntlrDatatypeRuleToken this_procedure_and_function_declaration_part_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2236:6: ( ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2237:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2237:1: ( (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2237:2: (this_label_declaration_part_0= rulelabel_declaration_part )? (this_constant_definition_part_1= ruleconstant_definition_part )? (this_type_definition_part_2= ruletype_definition_part )? (this_variable_declaration_part_3= rulevariable_declaration_part )? this_procedure_and_function_declaration_part_4= ruleprocedure_and_function_declaration_part
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2237:2: (this_label_declaration_part_0= rulelabel_declaration_part )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Label) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2238:5: this_label_declaration_part_0= rulelabel_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6393);
                    this_label_declaration_part_0=rulelabel_declaration_part();

                    state._fsp--;


                    		current.merge(this_label_declaration_part_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2248:3: (this_constant_definition_part_1= ruleconstant_definition_part )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Const) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2249:5: this_constant_definition_part_1= ruleconstant_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6423);
                    this_constant_definition_part_1=ruleconstant_definition_part();

                    state._fsp--;


                    		current.merge(this_constant_definition_part_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2259:3: (this_type_definition_part_2= ruletype_definition_part )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Type) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2260:5: this_type_definition_part_2= ruletype_definition_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruledeclaration_part6453);
                    this_type_definition_part_2=ruletype_definition_part();

                    state._fsp--;


                    		current.merge(this_type_definition_part_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2270:3: (this_variable_declaration_part_3= rulevariable_declaration_part )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Var) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2271:5: this_variable_declaration_part_3= rulevariable_declaration_part
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part6483);
                    this_variable_declaration_part_3=rulevariable_declaration_part();

                    state._fsp--;


                    		current.merge(this_variable_declaration_part_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_and_function_declaration_partParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part6512);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2300:1: entryRulelabel_declaration_part returns [String current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final String entryRulelabel_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2301:1: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2302:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6557);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part6568); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2309:1: rulelabel_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Label this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon ) ;
    public final AntlrDatatypeRuleToken rulelabel_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_label_1 = null;

        AntlrDatatypeRuleToken this_label_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2313:6: ( (kw= Label this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2314:1: (kw= Label this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2314:1: (kw= Label this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2315:2: kw= Label this_label_1= rulelabel (kw= Comma this_label_3= rulelabel )* kw= Semicolon
            {
            kw=(Token)match(input,Label,FOLLOW_Label_in_rulelabel_declaration_part6606); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6628);
            this_label_1=rulelabel();

            state._fsp--;


            		current.merge(this_label_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2331:1: (kw= Comma this_label_3= rulelabel )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2332:2: kw= Comma this_label_3= rulelabel
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulelabel_declaration_part6647); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6669);
            	    this_label_3=rulelabel();

            	    state._fsp--;


            	    		current.merge(this_label_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulelabel_declaration_part6689); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2362:1: entryRuleconstant_definition_part returns [String current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final String entryRuleconstant_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2363:1: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2364:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6729);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6740); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2371:1: ruleconstant_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Const (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2375:6: ( (kw= Const (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2376:1: (kw= Const (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2376:1: (kw= Const (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2377:2: kw= Const (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+
            {
            kw=(Token)match(input,Const,FOLLOW_Const_in_ruleconstant_definition_part6778); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2382:1: (this_constant_definition_1= ruleconstant_definition kw= Semicolon )+
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
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2383:5: this_constant_definition_1= ruleconstant_definition kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6801);
            	    this_constant_definition_1=ruleconstant_definition();

            	    state._fsp--;


            	    		current.merge(this_constant_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleconstant_definition_part6819); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2407:1: entryRuleconstant_definition returns [String current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final String entryRuleconstant_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2408:1: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2409:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6861);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition6872); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2416:1: ruleconstant_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= EqualsSign this_constant_2= ruleconstant ) ;
    public final AntlrDatatypeRuleToken ruleconstant_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_constant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2420:6: ( (this_ID_0= RULE_ID kw= EqualsSign this_constant_2= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2421:1: (this_ID_0= RULE_ID kw= EqualsSign this_constant_2= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2421:1: (this_ID_0= RULE_ID kw= EqualsSign this_constant_2= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2421:6: this_ID_0= RULE_ID kw= EqualsSign this_constant_2= ruleconstant
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant_definition6912); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getConstant_definitionAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleconstant_definition6930); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition6952);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2453:1: entryRuletype_definition_part returns [String current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final String entryRuletype_definition_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2454:1: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2455:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6997);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part7008); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2462:1: ruletype_definition_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Type (this_type_definition_1= ruletype_definition kw= Semicolon )+ ) ;
    public final AntlrDatatypeRuleToken ruletype_definition_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_definition_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2466:6: ( (kw= Type (this_type_definition_1= ruletype_definition kw= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2467:1: (kw= Type (this_type_definition_1= ruletype_definition kw= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2467:1: (kw= Type (this_type_definition_1= ruletype_definition kw= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2468:2: kw= Type (this_type_definition_1= ruletype_definition kw= Semicolon )+
            {
            kw=(Token)match(input,Type,FOLLOW_Type_in_ruletype_definition_part7046); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2473:1: (this_type_definition_1= ruletype_definition kw= Semicolon )+
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
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2474:5: this_type_definition_1= ruletype_definition kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part7069);
            	    this_type_definition_1=ruletype_definition();

            	    state._fsp--;


            	    		current.merge(this_type_definition_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruletype_definition_part7087); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            	        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2498:1: entryRuletype_definition returns [String current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final String entryRuletype_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2499:1: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2500:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition7129);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition7140); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2507:1: ruletype_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= EqualsSign this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruletype_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2511:6: ( (this_ID_0= RULE_ID kw= EqualsSign this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2512:1: (this_ID_0= RULE_ID kw= EqualsSign this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2512:1: (this_ID_0= RULE_ID kw= EqualsSign this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2512:6: this_ID_0= RULE_ID kw= EqualsSign this_type_2= ruletype
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletype_definition7180); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getType_definitionAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruletype_definition7198); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getType_definitionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruletype_definition7220);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2544:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2545:1: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2546:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype7265);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype7276); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2553:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_type_0 = null;

        AntlrDatatypeRuleToken this_structured_type_1 = null;

        AntlrDatatypeRuleToken this_pointer_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2557:6: ( (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2558:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2558:1: (this_simple_type_0= rulesimple_type | this_structured_type_1= rulestructured_type | this_pointer_type_2= rulepointer_type )
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2559:5: this_simple_type_0= rulesimple_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimple_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype7323);
                    this_simple_type_0=rulesimple_type();

                    state._fsp--;


                    		current.merge(this_simple_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2571:5: this_structured_type_1= rulestructured_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructured_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype7356);
                    this_structured_type_1=rulestructured_type();

                    state._fsp--;


                    		current.merge(this_structured_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2583:5: this_pointer_type_2= rulepointer_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPointer_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype7389);
                    this_pointer_type_2=rulepointer_type();

                    state._fsp--;


                    		current.merge(this_pointer_type_2);
                        
                     
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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2601:1: entryRulesimple_type returns [String current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final String entryRulesimple_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2602:1: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2603:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type7434);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type7445); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2610:1: rulesimple_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulesimple_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_subrange_type_0 = null;

        AntlrDatatypeRuleToken this_enumerated_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2614:6: ( (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type | this_ID_2= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2615:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type | this_ID_2= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2615:1: (this_subrange_type_0= rulesubrange_type | this_enumerated_type_1= ruleenumerated_type | this_ID_2= RULE_ID )
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

                if ( (LA44_2==EOF||(LA44_2>=RightParenthesis && LA44_2<=Comma)||LA44_2==Semicolon||LA44_2==RightSquareBracket) ) {
                    alt44=3;
                }
                else if ( (LA44_2==FullStopFullStop) ) {
                    alt44=1;
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2616:5: this_subrange_type_0= rulesubrange_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type7492);
                    this_subrange_type_0=rulesubrange_type();

                    state._fsp--;


                    		current.merge(this_subrange_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2628:5: this_enumerated_type_1= ruleenumerated_type
                    {
                     
                            newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumerated_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type7525);
                    this_enumerated_type_1=ruleenumerated_type();

                    state._fsp--;


                    		current.merge(this_enumerated_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2639:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_type7551); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getSimple_typeAccess().getIDTerminalRuleCall_2()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2654:1: entryRulesubrange_type returns [String current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final String entryRulesubrange_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesubrange_type = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2658:1: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2659:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type7602);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type7613); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2669:1: rulesubrange_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant ) ) ;
    public final AntlrDatatypeRuleToken rulesubrange_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMERIC_SUBRANGE_3=null;
        AntlrDatatypeRuleToken this_constant_0 = null;

        AntlrDatatypeRuleToken this_constant_2 = null;

        AntlrDatatypeRuleToken this_constant_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2674:6: ( ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2675:1: ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2675:1: ( (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant ) | (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant ) )
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2675:2: (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2675:2: (this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2676:5: this_constant_0= ruleconstant kw= FullStopFullStop this_constant_2= ruleconstant
                    {
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7665);
                    this_constant_0=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulesubrange_type7683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7705);
                    this_constant_2=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2704:6: (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2704:6: (this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2704:11: this_NUMERIC_SUBRANGE_3= RULE_NUMERIC_SUBRANGE this_constant_4= ruleconstant
                    {
                    this_NUMERIC_SUBRANGE_3=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7733); 

                    		current.merge(this_NUMERIC_SUBRANGE_3);
                        
                     
                        newLeafNode(this_NUMERIC_SUBRANGE_3, grammarAccess.getSubrange_typeAccess().getNUMERIC_SUBRANGETerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7760);
                    this_constant_4=ruleconstant();

                    state._fsp--;


                    		current.merge(this_constant_4);
                        
                     
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2733:1: entryRuleenumerated_type returns [String current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final String entryRuleenumerated_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2734:1: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2735:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7810);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7821); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2742:1: ruleenumerated_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleenumerated_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2746:6: ( (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2747:1: (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2747:1: (kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2748:2: kw= LeftParenthesis this_identifier_list_1= ruleidentifier_list kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleenumerated_type7859); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type7881);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleenumerated_type7899); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2778:1: entryRulestructured_type returns [String current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final String entryRulestructured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2779:1: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2780:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type7939);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type7950); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2787:1: rulestructured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Packed )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) ;
    public final AntlrDatatypeRuleToken rulestructured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unpacked_structured_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2791:6: ( ( (kw= Packed )? this_unpacked_structured_type_1= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2792:1: ( (kw= Packed )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2792:1: ( (kw= Packed )? this_unpacked_structured_type_1= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2792:2: (kw= Packed )? this_unpacked_structured_type_1= ruleunpacked_structured_type
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2792:2: (kw= Packed )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Packed) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2793:2: kw= Packed
                    {
                    kw=(Token)match(input,Packed,FOLLOW_Packed_in_rulestructured_type7989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructured_typeAccess().getPackedKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8013);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2817:1: entryRuleunpacked_structured_type returns [String current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final String entryRuleunpacked_structured_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2818:1: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2819:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8058);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type8069); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2826:1: ruleunpacked_structured_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_structured_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_array_type_0 = null;

        AntlrDatatypeRuleToken this_dynamic_array_type_1 = null;

        AntlrDatatypeRuleToken this_set_type_2 = null;

        AntlrDatatypeRuleToken this_file_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2830:6: ( (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2831:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2831:1: (this_array_type_0= rulearray_type | this_dynamic_array_type_1= ruledynamic_array_type | this_set_type_2= ruleset_type | this_file_type_3= rulefile_type )
            int alt47=4;
            switch ( input.LA(1) ) {
            case Array:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==LeftSquareBracket) ) {
                    alt47=1;
                }
                else if ( (LA47_1==Of) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case Set:
                {
                alt47=3;
                }
                break;
            case File:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2832:5: this_array_type_0= rulearray_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type8116);
                    this_array_type_0=rulearray_type();

                    state._fsp--;


                    		current.merge(this_array_type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2844:5: this_dynamic_array_type_1= ruledynamic_array_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamic_array_typeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type8149);
                    this_dynamic_array_type_1=ruledynamic_array_type();

                    state._fsp--;


                    		current.merge(this_dynamic_array_type_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2856:5: this_set_type_2= ruleset_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type8182);
                    this_set_type_2=ruleset_type();

                    state._fsp--;


                    		current.merge(this_set_type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2868:5: this_file_type_3= rulefile_type
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type8215);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2886:1: entryRulearray_type returns [String current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final String entryRulearray_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2887:1: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2888:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type8260);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type8271); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2895:1: rulearray_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Array kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket kw= Of this_type_7= ruletype ) ;
    public final AntlrDatatypeRuleToken rulearray_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_index_type_2 = null;

        AntlrDatatypeRuleToken this_index_type_4 = null;

        AntlrDatatypeRuleToken this_type_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2899:6: ( (kw= Array kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket kw= Of this_type_7= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2900:1: (kw= Array kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket kw= Of this_type_7= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2900:1: (kw= Array kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket kw= Of this_type_7= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2901:2: kw= Array kw= LeftSquareBracket this_index_type_2= ruleindex_type (kw= Comma this_index_type_4= ruleindex_type )* kw= RightSquareBracket kw= Of this_type_7= ruletype
            {
            kw=(Token)match(input,Array,FOLLOW_Array_in_rulearray_type8309); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulearray_type8322); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8344);
            this_index_type_2=ruleindex_type();

            state._fsp--;


            		current.merge(this_index_type_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2923:1: (kw= Comma this_index_type_4= ruleindex_type )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2924:2: kw= Comma this_index_type_4= ruleindex_type
            	    {
            	    kw=(Token)match(input,Comma,FOLLOW_Comma_in_rulearray_type8363); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type8385);
            	    this_index_type_4=ruleindex_type();

            	    state._fsp--;


            	    		current.merge(this_index_type_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulearray_type8405); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_rulearray_type8418); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getArray_typeAccess().getOfKeyword_5()); 
                
             
                    newCompositeNode(grammarAccess.getArray_typeAccess().getTypeParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruletype_in_rulearray_type8440);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2971:1: entryRuledynamic_array_type returns [String current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final String entryRuledynamic_array_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledynamic_array_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2972:1: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2973:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type8485);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledynamic_array_type8496); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2980:1: ruledynamic_array_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Array kw= Of this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruledynamic_array_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2984:6: ( (kw= Array kw= Of this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2985:1: (kw= Array kw= Of this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2985:1: (kw= Array kw= Of this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2986:2: kw= Array kw= Of this_type_2= ruletype
            {
            kw=(Token)match(input,Array,FOLLOW_Array_in_ruledynamic_array_type8534); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_ruledynamic_array_type8547); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruledynamic_array_type8569);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3016:1: entryRuleindex_type returns [String current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final String entryRuleindex_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3017:1: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3018:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type8614);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type8625); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3025:1: ruleindex_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_simple_type_0= rulesimple_type ;
    public final AntlrDatatypeRuleToken ruleindex_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_simple_type_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3029:6: (this_simple_type_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3031:5: this_simple_type_0= rulesimple_type
            {
             
                    newCompositeNode(grammarAccess.getIndex_typeAccess().getSimple_typeParserRuleCall()); 
                
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type8671);
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


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3051:1: entryRulefield_list returns [String current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final String entryRulefield_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3052:1: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3053:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list8717);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list8728); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3060:1: rulefield_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )? ;
    public final AntlrDatatypeRuleToken rulefield_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_fixed_part_0 = null;

        AntlrDatatypeRuleToken this_variant_part_2 = null;

        AntlrDatatypeRuleToken this_variant_part_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3064:6: ( ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:1: ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:1: ( ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )? )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Case||LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:2: ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part ) (kw= Semicolon )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:2: ( (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? ) | this_variant_part_3= rulevariant_part )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==Case) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:3: (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3065:3: (this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )? )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3066:5: this_fixed_part_0= rulefixed_part (kw= Semicolon this_variant_part_2= rulevariant_part )?
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getFixed_partParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_rulefixed_part_in_rulefield_list8777);
                            this_fixed_part_0=rulefixed_part();

                            state._fsp--;


                            		current.merge(this_fixed_part_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3076:1: (kw= Semicolon this_variant_part_2= rulevariant_part )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==Semicolon) ) {
                                int LA49_1 = input.LA(2);

                                if ( (LA49_1==Case) ) {
                                    alt49=1;
                                }
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3077:2: kw= Semicolon this_variant_part_2= rulevariant_part
                                    {
                                    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8796); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_0_1_1()); 
                                        
                                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8818);
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
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3095:5: this_variant_part_3= rulevariant_part
                            {
                             
                                    newCompositeNode(grammarAccess.getField_listAccess().getVariant_partParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8854);
                            this_variant_part_3=rulevariant_part();

                            state._fsp--;


                            		current.merge(this_variant_part_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3105:2: (kw= Semicolon )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Semicolon) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3106:2: kw= Semicolon
                            {
                            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8874); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3119:1: entryRulefixed_part returns [String current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final String entryRulefixed_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3120:1: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3121:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part8917);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part8928); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3128:1: rulefixed_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* ) ;
    public final AntlrDatatypeRuleToken rulefixed_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_0 = null;

        AntlrDatatypeRuleToken this_record_section_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3132:6: ( (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3133:1: (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3133:1: (this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3134:5: this_record_section_0= rulerecord_section (kw= Semicolon this_record_section_2= rulerecord_section )*
            {
             
                    newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8975);
            this_record_section_0=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3144:1: (kw= Semicolon this_record_section_2= rulerecord_section )*
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
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3145:2: kw= Semicolon this_record_section_2= rulerecord_section
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefixed_part8994); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part9016);
            	    this_record_section_2=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_2);
            	        
            	     
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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3169:1: entryRulerecord_section returns [String current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final String entryRulerecord_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3170:1: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3171:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section9063);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section9074); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3178:1: rulerecord_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulerecord_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3182:6: ( (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3183:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3183:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3184:5: this_identifier_list_0= ruleidentifier_list kw= Colon this_type_2= ruletype
            {
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section9121);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulerecord_section9139); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulerecord_section9161);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3219:1: entryRulevariant_part returns [String current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final String entryRulevariant_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3220:1: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3221:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part9206);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part9217); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3228:1: rulevariant_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Case this_tag_field_1= ruletag_field this_ID_2= RULE_ID kw= Of this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* ) ;
    public final AntlrDatatypeRuleToken rulevariant_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_tag_field_1 = null;

        AntlrDatatypeRuleToken this_variant_4 = null;

        AntlrDatatypeRuleToken this_variant_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3232:6: ( (kw= Case this_tag_field_1= ruletag_field this_ID_2= RULE_ID kw= Of this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3233:1: (kw= Case this_tag_field_1= ruletag_field this_ID_2= RULE_ID kw= Of this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3233:1: (kw= Case this_tag_field_1= ruletag_field this_ID_2= RULE_ID kw= Of this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3234:2: kw= Case this_tag_field_1= ruletag_field this_ID_2= RULE_ID kw= Of this_variant_4= rulevariant (kw= Semicolon this_variant_6= rulevariant )*
            {
            kw=(Token)match(input,Case,FOLLOW_Case_in_rulevariant_part9255); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletag_field_in_rulevariant_part9277);
            this_tag_field_1=ruletag_field();

            state._fsp--;


            		current.merge(this_tag_field_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariant_part9297); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getVariant_partAccess().getIDTerminalRuleCall_2()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_rulevariant_part9315); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part9337);
            this_variant_4=rulevariant();

            state._fsp--;


            		current.merge(this_variant_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3274:1: (kw= Semicolon this_variant_6= rulevariant )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Semicolon) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==False||LA54_1==True||LA54_1==Nil||(LA54_1>=RULE_INTEGER_NUMBER && LA54_1<=RULE_SIGNED_REAL_NUMBER)||LA54_1==RULE_ADDITION_OPERATOR||LA54_1==RULE_ID||LA54_1==RULE_STRING) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3275:2: kw= Semicolon this_variant_6= rulevariant
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariant_part9356); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getVariant_partAccess().getVariantParserRuleCall_5_1()); 
            	        
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part9378);
            	    this_variant_6=rulevariant();

            	    state._fsp--;


            	    		current.merge(this_variant_6);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:1: entryRuletag_field returns [String current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final String entryRuletag_field() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3300:1: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3301:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field9425);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field9436); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3308:1: ruletag_field returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon )? ;
    public final AntlrDatatypeRuleToken ruletag_field() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3312:6: ( (this_ID_0= RULE_ID kw= Colon )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3313:1: (this_ID_0= RULE_ID kw= Colon )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3313:1: (this_ID_0= RULE_ID kw= Colon )?
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3313:6: this_ID_0= RULE_ID kw= Colon
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletag_field9476); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getTag_fieldAccess().getIDTerminalRuleCall_0()); 
                        
                    kw=(Token)match(input,Colon,FOLLOW_Colon_in_ruletag_field9494); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3334:1: entryRulevariant returns [String current=null] : iv_rulevariant= rulevariant EOF ;
    public final String entryRulevariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3335:1: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3336:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant9535);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant9546); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3343:1: rulevariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken rulevariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_case_label_list_0 = null;

        AntlrDatatypeRuleToken this_field_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3347:6: ( (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3348:1: (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3348:1: (this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3349:5: this_case_label_list_0= rulecase_label_list kw= Colon kw= LeftParenthesis this_field_list_3= rulefield_list kw= RightParenthesis
            {
             
                    newCompositeNode(grammarAccess.getVariantAccess().getCase_label_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9593);
            this_case_label_list_0=rulecase_label_list();

            state._fsp--;


            		current.merge(this_case_label_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariant9611); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getColonKeyword_1()); 
                
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulevariant9624); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariantAccess().getField_listParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulefield_list_in_rulevariant9646);
            this_field_list_3=rulefield_list();

            state._fsp--;


            		current.merge(this_field_list_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulevariant9664); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3396:1: entryRuleset_type returns [String current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final String entryRuleset_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3397:1: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3398:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9704);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9715); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3405:1: ruleset_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Set kw= Of this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken ruleset_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3409:6: ( (kw= Set kw= Of this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3410:1: (kw= Set kw= Of this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3410:1: (kw= Set kw= Of this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3411:2: kw= Set kw= Of this_type_2= ruletype
            {
            kw=(Token)match(input,Set,FOLLOW_Set_in_ruleset_type9753); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSet_typeAccess().getSetKeyword_0()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_ruleset_type9766); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSet_typeAccess().getOfKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSet_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_ruleset_type9788);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3441:1: entryRulefile_type returns [String current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final String entryRulefile_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3442:1: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3443:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9833);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9844); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3450:1: rulefile_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= File kw= Of this_type_2= ruletype ) ;
    public final AntlrDatatypeRuleToken rulefile_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3454:6: ( (kw= File kw= Of this_type_2= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3455:1: (kw= File kw= Of this_type_2= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3455:1: (kw= File kw= Of this_type_2= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3456:2: kw= File kw= Of this_type_2= ruletype
            {
            kw=(Token)match(input,File,FOLLOW_File_in_rulefile_type9882); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFile_typeAccess().getFileKeyword_0()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_rulefile_type9895); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFile_typeAccess().getOfKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getFile_typeAccess().getTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruletype_in_rulefile_type9917);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3486:1: entryRulepointer_type returns [String current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final String entryRulepointer_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3487:1: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3488:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type9962);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type9973); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3495:1: rulepointer_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CircumflexAccent this_type_1= ruletype ) ;
    public final AntlrDatatypeRuleToken rulepointer_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3499:6: ( (kw= CircumflexAccent this_type_1= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3500:1: (kw= CircumflexAccent this_type_1= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3500:1: (kw= CircumflexAccent this_type_1= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3501:2: kw= CircumflexAccent this_type_1= ruletype
            {
            kw=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulepointer_type10011); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletype_in_rulepointer_type10033);
            this_type_1=ruletype();

            state._fsp--;


            		current.merge(this_type_1);
                
             
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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3525:1: entryRulevariable_declaration_part returns [String current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final String entryRulevariable_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3526:1: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3527:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part10078);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part10089); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3534:1: rulevariable_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Var this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* ) ;
    public final AntlrDatatypeRuleToken rulevariable_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_record_section_1 = null;

        AntlrDatatypeRuleToken this_record_section_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3538:6: ( (kw= Var this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3539:1: (kw= Var this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3539:1: (kw= Var this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3540:2: kw= Var this_record_section_1= rulerecord_section kw= Semicolon (this_record_section_3= rulerecord_section kw= Semicolon )*
            {
            kw=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_declaration_part10127); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getRecord_sectionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulerecord_section_in_rulevariable_declaration_part10149);
            this_record_section_1=rulerecord_section();

            state._fsp--;


            		current.merge(this_record_section_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part10167); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3562:1: (this_record_section_3= rulerecord_section kw= Semicolon )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3563:5: this_record_section_3= rulerecord_section kw= Semicolon
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getRecord_sectionParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_rulerecord_section_in_rulevariable_declaration_part10190);
            	    this_record_section_3=rulerecord_section();

            	    state._fsp--;


            	    		current.merge(this_record_section_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part10208); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            	        

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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3587:1: entryRuleprocedure_and_function_declaration_part returns [String current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final String entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3588:1: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3589:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part10250);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part10261); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3596:1: ruleprocedure_and_function_declaration_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )* ;
    public final AntlrDatatypeRuleToken ruleprocedure_and_function_declaration_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_procedure_declaration_0 = null;

        AntlrDatatypeRuleToken this_function_declaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3600:6: ( ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:1: ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:1: ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=Procedure && LA58_0<=Function)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) kw= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3601:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==Procedure) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==Function) ) {
            	        alt57=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3602:5: this_procedure_declaration_0= ruleprocedure_declaration
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_declarationParserRuleCall_0_0()); 
            	                
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part10309);
            	            this_procedure_declaration_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            		current.merge(this_procedure_declaration_0);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3614:5: this_function_declaration_1= rulefunction_declaration
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunction_declarationParserRuleCall_0_1()); 
            	                
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part10342);
            	            this_function_declaration_1=rulefunction_declaration();

            	            state._fsp--;


            	            		current.merge(this_function_declaration_1);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part10361); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3638:1: entryRuleprocedure_declaration returns [String current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final String entryRuleprocedure_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3639:1: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3640:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration10402);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration10413); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3647:1: ruleprocedure_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) ) ;
    public final AntlrDatatypeRuleToken ruleprocedure_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_procedure_heading_0 = null;

        AntlrDatatypeRuleToken this_block_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:6: ( (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3652:1: (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3652:1: (this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3653:5: this_procedure_heading_0= ruleprocedure_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward )
            {
             
                    newCompositeNode(grammarAccess.getProcedure_declarationAccess().getProcedure_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10460);
            this_procedure_heading_0=ruleprocedure_heading();

            state._fsp--;


            		current.merge(this_procedure_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_declaration10478); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3669:1: (this_block_2= ruleblock | kw= Forward )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EOF||(LA59_0>=Procedure && LA59_0<=Function)||(LA59_0>=Begin && LA59_0<=Const)||LA59_0==Label||LA59_0==Type||LA59_0==Var) ) {
                alt59=1;
            }
            else if ( (LA59_0==Forward) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3670:5: this_block_2= ruleblock
                    {
                     
                            newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration10501);
                    this_block_2=ruleblock();

                    state._fsp--;


                    		current.merge(this_block_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3682:2: kw= Forward
                    {
                    kw=(Token)match(input,Forward,FOLLOW_Forward_in_ruleprocedure_declaration10525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProcedure_declarationAccess().getForwardKeyword_2_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3695:1: entryRuleprocedure_heading returns [String current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final String entryRuleprocedure_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3696:1: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3697:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10566);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading10577); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3704:1: ruleprocedure_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Procedure this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? ) ;
    public final AntlrDatatypeRuleToken ruleprocedure_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_formal_parameter_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3708:6: ( (kw= Procedure this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3709:1: (kw= Procedure this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3709:1: (kw= Procedure this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3710:2: kw= Procedure this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )?
            {
            kw=(Token)match(input,Procedure,FOLLOW_Procedure_in_ruleprocedure_heading10615); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprocedure_heading10630); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getProcedure_headingAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3722:1: (this_formal_parameter_list_2= ruleformal_parameter_list )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LeftParenthesis) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3723:5: this_formal_parameter_list_2= ruleformal_parameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getProcedure_headingAccess().getFormal_parameter_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10658);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3741:1: entryRuleformal_parameter_list returns [String current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final String entryRuleformal_parameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3742:1: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3743:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10705);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list10716); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3750:1: ruleformal_parameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleformal_parameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_formal_parameter_section_1 = null;

        AntlrDatatypeRuleToken this_formal_parameter_section_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3754:6: ( (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3755:1: (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3755:1: (kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3756:2: kw= LeftParenthesis this_formal_parameter_section_1= ruleformal_parameter_section (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )* kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10754); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10776);
            this_formal_parameter_section_1=ruleformal_parameter_section();

            state._fsp--;


            		current.merge(this_formal_parameter_section_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3772:1: (kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==Semicolon) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3773:2: kw= Semicolon this_formal_parameter_section_3= ruleformal_parameter_section
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleformal_parameter_list10795); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10817);
            	    this_formal_parameter_section_3=ruleformal_parameter_section();

            	    state._fsp--;


            	    		current.merge(this_formal_parameter_section_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            kw=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleformal_parameter_list10837); 

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3803:1: entryRuleformal_parameter_section returns [String current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final String entryRuleformal_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3804:1: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3805:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10877);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section10888); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3812:1: ruleformal_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading ) ;
    public final AntlrDatatypeRuleToken ruleformal_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_value_parameter_section_0 = null;

        AntlrDatatypeRuleToken this_variable_parameter_section_1 = null;

        AntlrDatatypeRuleToken this_procedure_heading_2 = null;

        AntlrDatatypeRuleToken this_function_heading_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3816:6: ( (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3817:1: (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3817:1: (this_value_parameter_section_0= rulevalue_parameter_section | this_variable_parameter_section_1= rulevariable_parameter_section | this_procedure_heading_2= ruleprocedure_heading | this_function_heading_3= rulefunction_heading )
            int alt62=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt62=1;
                }
                break;
            case Var:
                {
                alt62=2;
                }
                break;
            case Procedure:
                {
                alt62=3;
                }
                break;
            case Function:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3818:5: this_value_parameter_section_0= rulevalue_parameter_section
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValue_parameter_sectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10935);
                    this_value_parameter_section_0=rulevalue_parameter_section();

                    state._fsp--;


                    		current.merge(this_value_parameter_section_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3830:5: this_variable_parameter_section_1= rulevariable_parameter_section
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariable_parameter_sectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10968);
                    this_variable_parameter_section_1=rulevariable_parameter_section();

                    state._fsp--;


                    		current.merge(this_variable_parameter_section_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3842:5: this_procedure_heading_2= ruleprocedure_heading
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedure_headingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section11001);
                    this_procedure_heading_2=ruleprocedure_heading();

                    state._fsp--;


                    		current.merge(this_procedure_heading_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3854:5: this_function_heading_3= rulefunction_heading
                    {
                     
                            newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunction_headingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section11034);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3872:1: entryRulevalue_parameter_section returns [String current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final String entryRulevalue_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3873:1: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3874:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section11079);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section11090); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3881:1: rulevalue_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type ) ;
    public final AntlrDatatypeRuleToken rulevalue_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_0 = null;

        AntlrDatatypeRuleToken this_parameter_type_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3885:6: ( (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3886:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3886:1: (this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3887:5: this_identifier_list_0= ruleidentifier_list kw= Colon this_parameter_type_2= ruleparameter_type
            {
             
                    newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifier_listParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section11137);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevalue_parameter_section11155); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getParameter_typeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section11177);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3922:1: entryRuleparameter_type returns [String current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final String entryRuleparameter_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3923:1: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3924:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type11222);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type11233); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:1: ruleparameter_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_conformant_array_schema_0= ruleconformant_array_schema | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleparameter_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_conformant_array_schema_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3935:6: ( (this_conformant_array_schema_0= ruleconformant_array_schema | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3936:1: (this_conformant_array_schema_0= ruleconformant_array_schema | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3936:1: (this_conformant_array_schema_0= ruleconformant_array_schema | this_ID_1= RULE_ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Packed||LA63_0==Array) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3937:5: this_conformant_array_schema_0= ruleconformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getParameter_typeAccess().getConformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type11280);
                    this_conformant_array_schema_0=ruleconformant_array_schema();

                    state._fsp--;


                    		current.merge(this_conformant_array_schema_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3948:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameter_type11306); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getParameter_typeAccess().getIDTerminalRuleCall_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3963:1: entryRuleconformant_array_schema returns [String current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final String entryRuleconformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3964:1: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3965:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema11351);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema11362); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3972:1: ruleconformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) ;
    public final AntlrDatatypeRuleToken ruleconformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_packed_conformant_array_schema_0 = null;

        AntlrDatatypeRuleToken this_unpacked_conformant_array_schema_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3976:6: ( (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3977:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3977:1: (this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema | this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Packed) ) {
                alt64=1;
            }
            else if ( (LA64_0==Array) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3978:5: this_packed_conformant_array_schema_0= rulepacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPacked_conformant_array_schemaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema11409);
                    this_packed_conformant_array_schema_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    		current.merge(this_packed_conformant_array_schema_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3990:5: this_unpacked_conformant_array_schema_1= ruleunpacked_conformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpacked_conformant_array_schemaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema11442);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4008:1: entryRulepacked_conformant_array_schema returns [String current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final String entryRulepacked_conformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4009:1: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4010:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema11487);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema11498); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4017:1: rulepacked_conformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Packed kw= Array kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket kw= Of this_ID_6= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulepacked_conformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_bound_specification_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4021:6: ( (kw= Packed kw= Array kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket kw= Of this_ID_6= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4022:1: (kw= Packed kw= Array kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket kw= Of this_ID_6= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4022:1: (kw= Packed kw= Array kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket kw= Of this_ID_6= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4023:2: kw= Packed kw= Array kw= LeftSquareBracket this_bound_specification_3= rulebound_specification kw= RightSquareBracket kw= Of this_ID_6= RULE_ID
            {
            kw=(Token)match(input,Packed,FOLLOW_Packed_in_rulepacked_conformant_array_schema11536); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0()); 
                
            kw=(Token)match(input,Array,FOLLOW_Array_in_rulepacked_conformant_array_schema11549); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11562); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11584);
            this_bound_specification_3=rulebound_specification();

            state._fsp--;


            		current.merge(this_bound_specification_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11602); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_rulepacked_conformant_array_schema11615); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5()); 
                
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11630); 

            		current.merge(this_ID_6);
                
             
                newLeafNode(this_ID_6, grammarAccess.getPacked_conformant_array_schemaAccess().getIDTerminalRuleCall_6()); 
                

            }


            }

             leaveRule();
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4078:1: entryRulebound_specification returns [String current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final String entryRulebound_specification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4079:1: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4080:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification11675);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification11686); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4087:1: rulebound_specification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= FullStopFullStop this_ID_2= RULE_ID kw= Colon this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulebound_specification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4091:6: ( (this_ID_0= RULE_ID kw= FullStopFullStop this_ID_2= RULE_ID kw= Colon this_ID_4= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4092:1: (this_ID_0= RULE_ID kw= FullStopFullStop this_ID_2= RULE_ID kw= Colon this_ID_4= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4092:1: (this_ID_0= RULE_ID kw= FullStopFullStop this_ID_2= RULE_ID kw= Colon this_ID_4= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4092:6: this_ID_0= RULE_ID kw= FullStopFullStop this_ID_2= RULE_ID kw= Colon this_ID_4= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11726); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getBound_specificationAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulebound_specification11744); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11759); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getBound_specificationAccess().getIDTerminalRuleCall_2()); 
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulebound_specification11777); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBound_specificationAccess().getColonKeyword_3()); 
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11792); 

            		current.merge(this_ID_4);
                
             
                newLeafNode(this_ID_4, grammarAccess.getBound_specificationAccess().getIDTerminalRuleCall_4()); 
                

            }


            }

             leaveRule();
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4133:1: entryRuleunpacked_conformant_array_schema returns [String current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final String entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunpacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4134:1: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4135:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11837);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11848); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4142:1: ruleunpacked_conformant_array_schema returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Array kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket kw= Of (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleunpacked_conformant_array_schema() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_8=null;
        AntlrDatatypeRuleToken this_bound_specification_2 = null;

        AntlrDatatypeRuleToken this_bound_specification_4 = null;

        AntlrDatatypeRuleToken this_conformant_array_schema_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4146:6: ( (kw= Array kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket kw= Of (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4147:1: (kw= Array kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket kw= Of (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4147:1: (kw= Array kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket kw= Of (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4148:2: kw= Array kw= LeftSquareBracket this_bound_specification_2= rulebound_specification (kw= Semicolon this_bound_specification_4= rulebound_specification )* kw= RightSquareBracket kw= Of (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID )
            {
            kw=(Token)match(input,Array,FOLLOW_Array_in_ruleunpacked_conformant_array_schema11886); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0()); 
                
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11899); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11921);
            this_bound_specification_2=rulebound_specification();

            state._fsp--;


            		current.merge(this_bound_specification_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4170:1: (kw= Semicolon this_bound_specification_4= rulebound_specification )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==Semicolon) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4171:2: kw= Semicolon this_bound_specification_4= rulebound_specification
            	    {
            	    kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11940); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11962);
            	    this_bound_specification_4=rulebound_specification();

            	    state._fsp--;


            	    		current.merge(this_bound_specification_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11982); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
                
            kw=(Token)match(input,Of,FOLLOW_Of_in_ruleunpacked_conformant_array_schema11995); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4199:1: (this_conformant_array_schema_7= ruleconformant_array_schema | this_ID_8= RULE_ID )
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
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4200:5: this_conformant_array_schema_7= ruleconformant_array_schema
                    {
                     
                            newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getConformant_array_schemaParserRuleCall_6_0()); 
                        
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema12018);
                    this_conformant_array_schema_7=ruleconformant_array_schema();

                    state._fsp--;


                    		current.merge(this_conformant_array_schema_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4211:10: this_ID_8= RULE_ID
                    {
                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleunpacked_conformant_array_schema12044); 

                    		current.merge(this_ID_8);
                        
                     
                        newLeafNode(this_ID_8, grammarAccess.getUnpacked_conformant_array_schemaAccess().getIDTerminalRuleCall_6_1()); 
                        

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4226:1: entryRulevariable_parameter_section returns [String current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final String entryRulevariable_parameter_section() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4227:1: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4228:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section12090);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section12101); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4235:1: rulevariable_parameter_section returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Var this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type ) ;
    public final AntlrDatatypeRuleToken rulevariable_parameter_section() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_1 = null;

        AntlrDatatypeRuleToken this_parameter_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4239:6: ( (kw= Var this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4240:1: (kw= Var this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4240:1: (kw= Var this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4241:2: kw= Var this_identifier_list_1= ruleidentifier_list kw= Colon this_parameter_type_3= ruleparameter_type
            {
            kw=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_parameter_section12139); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifier_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section12161);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            		current.merge(this_identifier_list_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_parameter_section12179); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getParameter_typeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section12201);
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4282:1: entryRulefunction_heading returns [String current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final String entryRulefunction_heading() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4283:1: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4284:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading12246);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading12257); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4291:1: rulefunction_heading returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Function this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulefunction_heading() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_formal_parameter_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4295:6: ( (kw= Function this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_ID_4= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4296:1: (kw= Function this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_ID_4= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4296:1: (kw= Function this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_ID_4= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4297:2: kw= Function this_ID_1= RULE_ID (this_formal_parameter_list_2= ruleformal_parameter_list )? kw= Colon this_ID_4= RULE_ID
            {
            kw=(Token)match(input,Function,FOLLOW_Function_in_rulefunction_heading12295); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading12310); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getFunction_headingAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4309:1: (this_formal_parameter_list_2= ruleformal_parameter_list )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LeftParenthesis) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4310:5: this_formal_parameter_list_2= ruleformal_parameter_list
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_headingAccess().getFormal_parameter_listParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading12338);
                    this_formal_parameter_list_2=ruleformal_parameter_list();

                    state._fsp--;


                    		current.merge(this_formal_parameter_list_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,Colon,FOLLOW_Colon_in_rulefunction_heading12358); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading12373); 

            		current.merge(this_ID_4);
                
             
                newLeafNode(this_ID_4, grammarAccess.getFunction_headingAccess().getIDTerminalRuleCall_4()); 
                

            }


            }

             leaveRule();
                
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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4341:1: entryRulefunction_declaration returns [String current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final String entryRulefunction_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4342:1: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4343:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration12418);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration12429); 

            }

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
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4350:1: rulefunction_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) ) ;
    public final AntlrDatatypeRuleToken rulefunction_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_function_heading_0 = null;

        AntlrDatatypeRuleToken this_block_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4354:6: ( (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4355:1: (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4355:1: (this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4356:5: this_function_heading_0= rulefunction_heading kw= Semicolon (this_block_2= ruleblock | kw= Forward )
            {
             
                    newCompositeNode(grammarAccess.getFunction_declarationAccess().getFunction_headingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulefunction_heading_in_rulefunction_declaration12476);
            this_function_heading_0=rulefunction_heading();

            state._fsp--;


            		current.merge(this_function_heading_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefunction_declaration12494); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4372:1: (this_block_2= ruleblock | kw= Forward )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==EOF||(LA68_0>=Procedure && LA68_0<=Function)||(LA68_0>=Begin && LA68_0<=Const)||LA68_0==Label||LA68_0==Type||LA68_0==Var) ) {
                alt68=1;
            }
            else if ( (LA68_0==Forward) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4373:5: this_block_2= ruleblock
                    {
                     
                            newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration12517);
                    this_block_2=ruleblock();

                    state._fsp--;


                    		current.merge(this_block_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4385:2: kw= Forward
                    {
                    kw=(Token)match(input,Forward,FOLLOW_Forward_in_rulefunction_declaration12541); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunction_declarationAccess().getForwardKeyword_2_1()); 
                        

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


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\1\uffff\1\12\12\uffff";
    static final String DFA18_minS =
        "\1\17\1\10\12\uffff";
    static final String DFA18_maxS =
        "\1\104\1\75\12\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1026:1: (this_variable_0= rulevariable | this_number_1= rulenumber | this_STRING_2= RULE_STRING | this_set_3= ruleset | kw= Nil | kw= True | kw= False | this_function_designator_7= rulefunction_designator | (kw= LeftParenthesis this_expression_9= ruleexpression kw= RightParenthesis ) | (kw= Not this_factor_12= rulefactor ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram215 = new BitSet(new long[]{0x0000000802014030L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram242 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_FullStop_in_ruleprogram260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Program_in_ruleprogram_heading_block349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprogram_heading_block364 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleprogram_heading_block383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block405 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleprogram_heading_block423 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprogram_heading_block438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list529 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleidentifier_list548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list563 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_ruleblock668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulestatement_part789 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part811 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulestatement_part829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence927 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulestatement_sequence946 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence968 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1074 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulestatement1092 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulesimple_statement1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_statement1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1572 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ColonEqualsSign_in_ruleassignment_statement1590 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable1708 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevariable__in_rulevariable1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable__in_entryRulevariable_1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulevariable_1830 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulevariable_1852 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulevariable_1870 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevariable__in_rulevariable_1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rulevariable_1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_1933 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevariable__in_rulevariable_1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulevariable_1986 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevariable__in_rulevariable_2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2113 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleexpression_list2132 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2154 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2259 = new BitSet(new long[]{0x2004010000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2281 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_In_in_ruleexpression2305 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleexpression2324 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2446 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2475 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2499 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Or_in_rulesimple_expression2525 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2548 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulesimple_expression2582 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2687 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2709 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Div_in_ruleterm2733 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Mod_in_ruleterm2752 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_And_in_ruleterm2771 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2794 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_rulefactor3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_rulefactor3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_rulefactor3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefactor3106 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor3128 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefactor3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_rulefactor3167 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rulenumber3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulenumber3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleset3664 = new BitSet(new long[]{0x0BD8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3687 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleset3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_designator3798 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefunction_designator3816 = new BitSet(new long[]{0x0BC8300301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3839 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefunction_designator3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement4101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulecompound_statement4150 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4172 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecompound_statement4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_rulewhile_statement4448 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4470 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulewhile_statement4488 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Repeat_in_rulerepeat_statement4604 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Until_in_rulerepeat_statement4644 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_rulefor_statement4760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4782 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_To_in_rulefor_statement4801 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Downto_in_rulefor_statement4820 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4843 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulefor_statement4861 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement5064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleif_statement5113 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5135 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Then_in_ruleif_statement5153 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5175 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Else_in_ruleif_statement5194 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulecase_statement5312 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement5334 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulecase_statement5352 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5374 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5393 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5415 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5436 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecase_statement5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5549 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulecase_limb5567 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5692 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulecase_label_list5711 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5733 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5833 = new BitSet(new long[]{0x03C0000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleconstant5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleconstant5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_ruleconstant5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement6019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_rulewith_statement6068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6090 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Comma_in_rulewith_statement6109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement6131 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Do_in_rulewith_statement6151 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement6218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goto_in_rulegoto_statement6267 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part6334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part6393 = new BitSet(new long[]{0x0000000802004030L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruledeclaration_part6423 = new BitSet(new long[]{0x0000000802000030L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruledeclaration_part6453 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruledeclaration_part6483 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruledeclaration_part6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_rulelabel_declaration_part6606 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6628 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulelabel_declaration_part6647 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6669 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulelabel_declaration_part6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_ruleconstant_definition_part6778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6801 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleconstant_definition_part6819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant_definition6912 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleconstant_definition6930 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_ruletype_definition_part7046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part7069 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruletype_definition_part7087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition7129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletype_definition7180 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruletype_definition7198 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype7265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type7434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_type7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type7602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7665 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulesubrange_type7683 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7733 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleenumerated_type7859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type7881 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleenumerated_type7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type7939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulestructured_type7989 = new BitSet(new long[]{0x0000000400201200L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type8058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type8260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_rulearray_type8309 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulearray_type8322 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8344 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulearray_type8363 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type8385 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulearray_type8405 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulearray_type8418 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type8485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledynamic_array_type8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruledynamic_array_type8534 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruledynamic_array_type8547 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruledynamic_array_type8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type8614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list8717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list8777 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8818 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8854 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part8917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8975 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefixed_part8994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part9016 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section9063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section9121 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulerecord_section9139 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part9206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulevariant_part9255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part9277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariant_part9297 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulevariant_part9315 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9337 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariant_part9356 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9378 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field9425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletag_field9476 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_ruletag_field9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant9535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9593 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariant9611 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulevariant9624 = new BitSet(new long[]{0x0000200000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant9646 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulevariant9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Set_in_ruleset_type9753 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleset_type9766 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_File_in_rulefile_type9882 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulefile_type9895 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type9962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulepointer_type10011 = new BitSet(new long[]{0x0FE0100501209200L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulepointer_type10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part10078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_declaration_part10127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulevariable_declaration_part10149 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part10167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulevariable_declaration_part10190 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part10208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part10250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part10309 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part10342 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part10361 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration10402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration10413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10460 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_declaration10478 = new BitSet(new long[]{0x0000000802014070L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_ruleprocedure_declaration10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Procedure_in_ruleprocedure_heading10615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprocedure_heading10630 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list10716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10754 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10776 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleformal_parameter_list10795 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10817 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleformal_parameter_list10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section11079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section11137 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevalue_parameter_section11155 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type11222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type11280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameter_type11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema11351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema11487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulepacked_conformant_array_schema11536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Array_in_rulepacked_conformant_array_schema11549 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11584 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11602 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulepacked_conformant_array_schema11615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification11675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11726 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulebound_specification11744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11759 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulebound_specification11777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruleunpacked_conformant_array_schema11886 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11921 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11962 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11982 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleunpacked_conformant_array_schema11995 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleunpacked_conformant_array_schema12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleunpacked_conformant_array_schema12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section12090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section12101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_parameter_section12139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section12161 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_parameter_section12179 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading12246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Function_in_rulefunction_heading12295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading12310 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading12338 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulefunction_heading12358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration12418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_rulefunction_declaration12476 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulefunction_declaration12494 = new BitSet(new long[]{0x0000000802014070L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration12517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_rulefunction_declaration12541 = new BitSet(new long[]{0x0000000000000002L});

}