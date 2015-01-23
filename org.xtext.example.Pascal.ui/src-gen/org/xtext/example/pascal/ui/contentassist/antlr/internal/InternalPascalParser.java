package org.xtext.example.pascal.ui.contentassist.antlr.internal; 

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
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER_NUMBER", "RULE_IDENTIFIER", "RULE_ADDITION_OPERATOR", "RULE_OR_KEYWORD", "RULE_STRING", "RULE_NIL_KEYWORD", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_TO_KEYWORD", "RULE_DOWNTO_KEYWORD", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_RELATIONAL_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_NOT_KEYWORD", "RULE_WHILE_KEYWORD", "RULE_DO_KEYWORD", "RULE_REPEAT_KEYWORD", "RULE_UNTIL_KEYWORD", "RULE_FOR_KEYWORD", "RULE_GOTO_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'('", "')'", "','", "':'", "':='", "'['", "']'"
    };
    public static final int RULE_ID=32;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_ADDITION_OPERATOR=6;
    public static final int EOF=-1;
    public static final int RULE_FOR_KEYWORD=24;
    public static final int RULE_UNTIL_KEYWORD=23;
    public static final int RULE_END_KEYWORD=16;
    public static final int RULE_REAL_NUMBER=10;
    public static final int RULE_MULTIPLICATION_OPERATOR=18;
    public static final int RULE_INT=33;
    public static final int RULE_BEGIN_KEYWORD=15;
    public static final int RULE_LETTER_EXTENDED=30;
    public static final int RULE_DOWNTO_KEYWORD=14;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_TO_KEYWORD=13;
    public static final int T__40=40;
    public static final int RULE_RELATIONAL_OPERATOR=17;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int RULE_NIL_KEYWORD=9;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_GOTO_KEYWORD=25;
    public static final int RULE_LABEL_KEYWORD=26;
    public static final int RULE_WHILE_KEYWORD=20;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=27;
    public static final int RULE_DO_KEYWORD=21;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_NOT_KEYWORD=19;
    public static final int RULE_LETTER=31;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_STRING=8;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int RULE_REPEAT_KEYWORD=22;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OR_KEYWORD=7;
    public static final int RULE_DIGIT_SEQUENCE=28;
    public static final int RULE_WS=36;
    public static final int RULE_SIGNED_INTEGER_NUMBER=11;
    public static final int RULE_DIGIT=29;
    public static final int RULE_INTEGER_NUMBER=4;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g"; }


     
     	private PascalGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulepascal"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:60:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:61:1: ( rulepascal EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:62:1: rulepascal EOF
            {
             before(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_rulepascal_in_entryRulepascal61);
            rulepascal();

            state._fsp--;

             after(grammarAccess.getPascalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepascal68); 

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
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:69:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:73:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:74:1: ( ( rule__Pascal__ProgramAssignment ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:75:1: ( rule__Pascal__ProgramAssignment )
            {
             before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:76:1: ( rule__Pascal__ProgramAssignment )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:76:2: rule__Pascal__ProgramAssignment
            {
            pushFollow(FOLLOW_rule__Pascal__ProgramAssignment_in_rulepascal94);
            rule__Pascal__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getProgramAssignment()); 

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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:88:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:89:1: ( ruleprogram EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:90:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram121);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram128); 

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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:97:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:104:1: ( rule__Program__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleprogram154);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:116:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:117:1: ( ruleprogram_heading_block EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:118:1: ruleprogram_heading_block EOF
            {
             before(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block181);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading_block188); 

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
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:125:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:129:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:130:1: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:130:1: ( ( rule__Program_heading_block__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:131:1: ( rule__Program_heading_block__Group__0 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:132:1: ( rule__Program_heading_block__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:132:2: rule__Program_heading_block__Group__0
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__0_in_ruleprogram_heading_block214);
            rule__Program_heading_block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup()); 

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
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:144:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:145:1: ( ruleidentifier_list EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:146:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list241);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list248); 

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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:153:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:157:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Identifier_list__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Identifier_list__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:159:1: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( rule__Identifier_list__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:160:2: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list274);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:172:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:173:1: ( ruleblock EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:174:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock301);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock308); 

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:181:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:185:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:186:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:186:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:187:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:188:1: ( rule__Block__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:188:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleblock334);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:200:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:201:1: ( rulestatement_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:202:1: rulestatement_part EOF
            {
             before(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part361);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part368); 

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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:209:1: rulestatement_part : ( ( rule__Statement_part__Group__0 ) ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:213:2: ( ( ( rule__Statement_part__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:214:1: ( ( rule__Statement_part__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:214:1: ( ( rule__Statement_part__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:215:1: ( rule__Statement_part__Group__0 )
            {
             before(grammarAccess.getStatement_partAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:216:1: ( rule__Statement_part__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:216:2: rule__Statement_part__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part394);
            rule__Statement_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getGroup()); 

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:228:1: entryRulestatement_sequence : rulestatement_sequence EOF ;
    public final void entryRulestatement_sequence() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:229:1: ( rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:230:1: rulestatement_sequence EOF
            {
             before(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence421);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence428); 

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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:237:1: rulestatement_sequence : ( ( rule__Statement_sequence__Group__0 ) ) ;
    public final void rulestatement_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:241:2: ( ( ( rule__Statement_sequence__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:242:1: ( ( rule__Statement_sequence__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:242:1: ( ( rule__Statement_sequence__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:243:1: ( rule__Statement_sequence__Group__0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:244:1: ( rule__Statement_sequence__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:244:2: rule__Statement_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence454);
            rule__Statement_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:256:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:257:1: ( rulestatement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:258:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement481);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement488); 

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:265:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:269:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:270:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:270:1: ( ( rule__Statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:271:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:272:1: ( rule__Statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:272:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_rulestatement514);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:284:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:285:1: ( rulelabel EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:286:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel541);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel548); 

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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:293:1: rulelabel : ( RULE_INTEGER_NUMBER ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:297:2: ( ( RULE_INTEGER_NUMBER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:298:1: ( RULE_INTEGER_NUMBER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:298:1: ( RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:299:1: RULE_INTEGER_NUMBER
            {
             before(grammarAccess.getLabelAccess().getINTEGER_NUMBERTerminalRuleCall()); 
            match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel574); 
             after(grammarAccess.getLabelAccess().getINTEGER_NUMBERTerminalRuleCall()); 

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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:312:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:313:1: ( rulesimple_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:314:1: rulesimple_statement EOF
            {
             before(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement600);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement607); 

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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:321:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives )? ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:325:2: ( ( ( rule__Simple_statement__Alternatives )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( rule__Simple_statement__Alternatives )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( rule__Simple_statement__Alternatives )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:327:1: ( rule__Simple_statement__Alternatives )?
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:328:1: ( rule__Simple_statement__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IDENTIFIER||LA1_0==RULE_GOTO_KEYWORD) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:328:2: rule__Simple_statement__Alternatives
                    {
                    pushFollow(FOLLOW_rule__Simple_statement__Alternatives_in_rulesimple_statement633);
                    rule__Simple_statement__Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_statementAccess().getAlternatives()); 

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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:340:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:341:1: ( ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:342:1: ruleassignment_statement EOF
            {
             before(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement661);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getAssignment_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement668); 

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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:349:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:353:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:354:1: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:354:1: ( ( rule__Assignment_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:355:1: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:356:1: ( rule__Assignment_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:356:2: rule__Assignment_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0_in_ruleassignment_statement694);
            rule__Assignment_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getGroup()); 

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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:368:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:369:1: ( rulevariable EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:370:1: rulevariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable721);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable728); 

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:377:1: rulevariable : ( ruleentire_variable ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:381:2: ( ( ruleentire_variable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:382:1: ( ruleentire_variable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:382:1: ( ruleentire_variable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:383:1: ruleentire_variable
            {
             before(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall()); 
            pushFollow(FOLLOW_ruleentire_variable_in_rulevariable754);
            ruleentire_variable();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getEntire_variableParserRuleCall()); 

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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleentire_variable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:396:1: entryRuleentire_variable : ruleentire_variable EOF ;
    public final void entryRuleentire_variable() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:397:1: ( ruleentire_variable EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:398:1: ruleentire_variable EOF
            {
             before(grammarAccess.getEntire_variableRule()); 
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable780);
            ruleentire_variable();

            state._fsp--;

             after(grammarAccess.getEntire_variableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable787); 

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
    // $ANTLR end "entryRuleentire_variable"


    // $ANTLR start "ruleentire_variable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:405:1: ruleentire_variable : ( RULE_IDENTIFIER ) ;
    public final void ruleentire_variable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:409:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:411:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getEntire_variableAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable813); 
             after(grammarAccess.getEntire_variableAccess().getIDENTIFIERTerminalRuleCall()); 

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
    // $ANTLR end "ruleentire_variable"


    // $ANTLR start "entryRuleindexed_variable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:426:1: entryRuleindexed_variable : ruleindexed_variable EOF ;
    public final void entryRuleindexed_variable() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:427:1: ( ruleindexed_variable EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:428:1: ruleindexed_variable EOF
            {
             before(grammarAccess.getIndexed_variableRule()); 
            pushFollow(FOLLOW_ruleindexed_variable_in_entryRuleindexed_variable841);
            ruleindexed_variable();

            state._fsp--;

             after(grammarAccess.getIndexed_variableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindexed_variable848); 

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
    // $ANTLR end "entryRuleindexed_variable"


    // $ANTLR start "ruleindexed_variable"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:435:1: ruleindexed_variable : ( ( rule__Indexed_variable__Group__0 ) ) ;
    public final void ruleindexed_variable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:439:2: ( ( ( rule__Indexed_variable__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:440:1: ( ( rule__Indexed_variable__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:440:1: ( ( rule__Indexed_variable__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:441:1: ( rule__Indexed_variable__Group__0 )
            {
             before(grammarAccess.getIndexed_variableAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:442:1: ( rule__Indexed_variable__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:442:2: rule__Indexed_variable__Group__0
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__0_in_ruleindexed_variable874);
            rule__Indexed_variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexed_variableAccess().getGroup()); 

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
    // $ANTLR end "ruleindexed_variable"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:454:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:455:1: ( ruleexpression_list EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:456:1: ruleexpression_list EOF
            {
             before(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list901);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getExpression_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list908); 

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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:463:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:467:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:468:1: ( ( rule__Expression_list__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:468:1: ( ( rule__Expression_list__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:469:1: ( rule__Expression_list__Group__0 )
            {
             before(grammarAccess.getExpression_listAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:470:1: ( rule__Expression_list__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:470:2: rule__Expression_list__Group__0
            {
            pushFollow(FOLLOW_rule__Expression_list__Group__0_in_ruleexpression_list934);
            rule__Expression_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getGroup()); 

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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:482:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:483:1: ( ruleexpression EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:484:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression961);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression968); 

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:491:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:495:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:497:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:498:1: ( rule__Expression__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:498:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleexpression994);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:510:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:511:1: ( rulesimple_expression EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:512:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression1021);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression1028); 

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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:519:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:523:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:1: ( ( rule__Simple_expression__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:1: ( ( rule__Simple_expression__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:525:1: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:526:1: ( rule__Simple_expression__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:526:2: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__0_in_rulesimple_expression1054);
            rule__Simple_expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getGroup()); 

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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:538:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:539:1: ( ruleterm EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:540:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1081);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1088); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:547:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:551:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:1: ( ( rule__Term__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:1: ( ( rule__Term__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:553:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:554:1: ( rule__Term__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:554:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleterm1114);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:566:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:567:1: ( rulefactor EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:568:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor1141);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor1148); 

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:575:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:579:2: ( ( ( rule__Factor__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:1: ( ( rule__Factor__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:1: ( ( rule__Factor__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:581:1: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:582:1: ( rule__Factor__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:582:2: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_rule__Factor__Alternatives_in_rulefactor1174);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:594:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:595:1: ( rulenumber EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:596:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber1201);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber1208); 

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:603:1: rulenumber : ( ( rule__Number__Alternatives ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:607:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:1: ( ( rule__Number__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:609:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:610:1: ( rule__Number__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:610:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_rulenumber1234);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleunsigned_number"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:622:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:623:1: ( ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:624:1: ruleunsigned_number EOF
            {
             before(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number1261);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number1268); 

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
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:631:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:635:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:1: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:1: ( ( rule__Unsigned_number__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:637:1: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:638:1: ( rule__Unsigned_number__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:638:2: rule__Unsigned_number__Alternatives
            {
            pushFollow(FOLLOW_rule__Unsigned_number__Alternatives_in_ruleunsigned_number1294);
            rule__Unsigned_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:650:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:651:1: ( rulesigned_number EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:652:1: rulesigned_number EOF
            {
             before(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number1321);
            rulesigned_number();

            state._fsp--;

             after(grammarAccess.getSigned_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number1328); 

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
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:659:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:663:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:1: ( ( rule__Signed_number__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:1: ( ( rule__Signed_number__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:665:1: ( rule__Signed_number__Alternatives )
            {
             before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:666:1: ( rule__Signed_number__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:666:2: rule__Signed_number__Alternatives
            {
            pushFollow(FOLLOW_rule__Signed_number__Alternatives_in_rulesigned_number1354);
            rule__Signed_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigned_numberAccess().getAlternatives()); 

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
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:678:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:679:1: ( ruleset EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:680:1: ruleset EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset1381);
            ruleset();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset1388); 

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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:687:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:691:2: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:1: ( ( rule__Set__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:693:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:694:1: ( rule__Set__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:694:2: rule__Set__Group__0
            {
            pushFollow(FOLLOW_rule__Set__Group__0_in_ruleset1414);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:706:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:707:1: ( rulefunction_designator EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:708:1: rulefunction_designator EOF
            {
             before(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator1441);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFunction_designatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator1448); 

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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:715:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:719:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:720:1: ( ( rule__Function_designator__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:720:1: ( ( rule__Function_designator__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:721:1: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:722:1: ( rule__Function_designator__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:722:2: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__0_in_rulefunction_designator1474);
            rule__Function_designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getGroup()); 

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:734:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:735:1: ( rulestructured_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:736:1: rulestructured_statement EOF
            {
             before(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement1501);
            rulestructured_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement1508); 

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:743:1: rulestructured_statement : ( ( rule__Structured_statement__Alternatives ) ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:747:2: ( ( ( rule__Structured_statement__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:748:1: ( ( rule__Structured_statement__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:748:1: ( ( rule__Structured_statement__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:749:1: ( rule__Structured_statement__Alternatives )
            {
             before(grammarAccess.getStructured_statementAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:750:1: ( rule__Structured_statement__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:750:2: rule__Structured_statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Structured_statement__Alternatives_in_rulestructured_statement1534);
            rule__Structured_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructured_statementAccess().getAlternatives()); 

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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:762:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:763:1: ( rulecompound_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:764:1: rulecompound_statement EOF
            {
             before(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement1561);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getCompound_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement1568); 

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:771:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:775:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:776:1: ( ( rule__Compound_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:776:1: ( ( rule__Compound_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:777:1: ( rule__Compound_statement__Group__0 )
            {
             before(grammarAccess.getCompound_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:778:1: ( rule__Compound_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:778:2: rule__Compound_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__0_in_rulecompound_statement1594);
            rule__Compound_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompound_statementAccess().getGroup()); 

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
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:790:1: entryRulerepetitive_statement : rulerepetitive_statement EOF ;
    public final void entryRulerepetitive_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:791:1: ( rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:792:1: rulerepetitive_statement EOF
            {
             before(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement1621);
            rulerepetitive_statement();

            state._fsp--;

             after(grammarAccess.getRepetitive_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement1628); 

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
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:799:1: rulerepetitive_statement : ( ( rule__Repetitive_statement__Alternatives ) ) ;
    public final void rulerepetitive_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:803:2: ( ( ( rule__Repetitive_statement__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:804:1: ( ( rule__Repetitive_statement__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:804:1: ( ( rule__Repetitive_statement__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:805:1: ( rule__Repetitive_statement__Alternatives )
            {
             before(grammarAccess.getRepetitive_statementAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:806:1: ( rule__Repetitive_statement__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:806:2: rule__Repetitive_statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Repetitive_statement__Alternatives_in_rulerepetitive_statement1654);
            rule__Repetitive_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepetitive_statementAccess().getAlternatives()); 

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
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:818:1: entryRulewhile_statement : rulewhile_statement EOF ;
    public final void entryRulewhile_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:819:1: ( rulewhile_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:820:1: rulewhile_statement EOF
            {
             before(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement1681);
            rulewhile_statement();

            state._fsp--;

             after(grammarAccess.getWhile_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement1688); 

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:827:1: rulewhile_statement : ( ( rule__While_statement__Group__0 ) ) ;
    public final void rulewhile_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:831:2: ( ( ( rule__While_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:832:1: ( ( rule__While_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:832:1: ( ( rule__While_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:833:1: ( rule__While_statement__Group__0 )
            {
             before(grammarAccess.getWhile_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:834:1: ( rule__While_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:834:2: rule__While_statement__Group__0
            {
            pushFollow(FOLLOW_rule__While_statement__Group__0_in_rulewhile_statement1714);
            rule__While_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhile_statementAccess().getGroup()); 

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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:846:1: entryRulerepeat_statement : rulerepeat_statement EOF ;
    public final void entryRulerepeat_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:847:1: ( rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:848:1: rulerepeat_statement EOF
            {
             before(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement1741);
            rulerepeat_statement();

            state._fsp--;

             after(grammarAccess.getRepeat_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement1748); 

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
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:855:1: rulerepeat_statement : ( ( rule__Repeat_statement__Group__0 ) ) ;
    public final void rulerepeat_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:859:2: ( ( ( rule__Repeat_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:860:1: ( ( rule__Repeat_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:860:1: ( ( rule__Repeat_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:861:1: ( rule__Repeat_statement__Group__0 )
            {
             before(grammarAccess.getRepeat_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:862:1: ( rule__Repeat_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:862:2: rule__Repeat_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__0_in_rulerepeat_statement1774);
            rule__Repeat_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepeat_statementAccess().getGroup()); 

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
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:874:1: entryRulefor_statement : rulefor_statement EOF ;
    public final void entryRulefor_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:875:1: ( rulefor_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:876:1: rulefor_statement EOF
            {
             before(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement1801);
            rulefor_statement();

            state._fsp--;

             after(grammarAccess.getFor_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement1808); 

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
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:883:1: rulefor_statement : ( ( rule__For_statement__Group__0 ) ) ;
    public final void rulefor_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:887:2: ( ( ( rule__For_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:888:1: ( ( rule__For_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:888:1: ( ( rule__For_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:889:1: ( rule__For_statement__Group__0 )
            {
             before(grammarAccess.getFor_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:890:1: ( rule__For_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:890:2: rule__For_statement__Group__0
            {
            pushFollow(FOLLOW_rule__For_statement__Group__0_in_rulefor_statement1834);
            rule__For_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getGroup()); 

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
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:902:1: entryRulegoto_statement : rulegoto_statement EOF ;
    public final void entryRulegoto_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:903:1: ( rulegoto_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:904:1: rulegoto_statement EOF
            {
             before(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement1861);
            rulegoto_statement();

            state._fsp--;

             after(grammarAccess.getGoto_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement1868); 

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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:911:1: rulegoto_statement : ( ( rule__Goto_statement__Group__0 ) ) ;
    public final void rulegoto_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:915:2: ( ( ( rule__Goto_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:916:1: ( ( rule__Goto_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:916:1: ( ( rule__Goto_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:917:1: ( rule__Goto_statement__Group__0 )
            {
             before(grammarAccess.getGoto_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:918:1: ( rule__Goto_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:918:2: rule__Goto_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__0_in_rulegoto_statement1894);
            rule__Goto_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoto_statementAccess().getGroup()); 

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
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:930:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:931:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:932:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1921);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part1928); 

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
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:939:1: ruledeclaration_part : ( ( rulelabel_declaration_part )? ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:943:2: ( ( ( rulelabel_declaration_part )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:944:1: ( ( rulelabel_declaration_part )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:944:1: ( ( rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:945:1: ( rulelabel_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:946:1: ( rulelabel_declaration_part )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LABEL_KEYWORD) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:946:3: rulelabel_declaration_part
                    {
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1955);
                    rulelabel_declaration_part();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 

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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:958:1: entryRulelabel_declaration_part : rulelabel_declaration_part EOF ;
    public final void entryRulelabel_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:959:1: ( rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:960:1: rulelabel_declaration_part EOF
            {
             before(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1983);
            rulelabel_declaration_part();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part1990); 

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
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:967:1: rulelabel_declaration_part : ( ( rule__Label_declaration_part__Group__0 ) ) ;
    public final void rulelabel_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:971:2: ( ( ( rule__Label_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:972:1: ( ( rule__Label_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:972:1: ( ( rule__Label_declaration_part__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:973:1: ( rule__Label_declaration_part__Group__0 )
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:1: ( rule__Label_declaration_part__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:2: rule__Label_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part2016);
            rule__Label_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabel_declaration_partAccess().getGroup()); 

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
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "rule__Statement__Alternatives_1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:986:1: rule__Statement__Alternatives_1 : ( ( rulesimple_statement ) | ( rulestructured_statement ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:990:1: ( ( rulesimple_statement ) | ( rulestructured_statement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_IDENTIFIER||LA3_0==RULE_END_KEYWORD||LA3_0==RULE_UNTIL_KEYWORD||LA3_0==RULE_GOTO_KEYWORD||LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_BEGIN_KEYWORD||LA3_0==RULE_WHILE_KEYWORD||LA3_0==RULE_REPEAT_KEYWORD||LA3_0==RULE_FOR_KEYWORD) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:991:1: ( rulesimple_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:991:1: ( rulesimple_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:992:1: rulesimple_statement
                    {
                     before(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_rulesimple_statement_in_rule__Statement__Alternatives_12052);
                    rulesimple_statement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:997:6: ( rulestructured_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:997:6: ( rulestructured_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:998:1: rulestructured_statement
                    {
                     before(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulestructured_statement_in_rule__Statement__Alternatives_12069);
                    rulestructured_statement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives_1"


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1008:1: rule__Simple_statement__Alternatives : ( ( ruleassignment_statement ) | ( rulefunction_designator ) | ( rulegoto_statement ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1012:1: ( ( ruleassignment_statement ) | ( rulefunction_designator ) | ( rulegoto_statement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENTIFIER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==45) ) {
                    alt4=1;
                }
                else if ( (LA4_1==41) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_GOTO_KEYWORD) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1013:1: ( ruleassignment_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1013:1: ( ruleassignment_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1014:1: ruleassignment_statement
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleassignment_statement_in_rule__Simple_statement__Alternatives2101);
                    ruleassignment_statement();

                    state._fsp--;

                     after(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1019:6: ( rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1019:6: ( rulefunction_designator )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1020:1: rulefunction_designator
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulefunction_designator_in_rule__Simple_statement__Alternatives2118);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1025:6: ( rulegoto_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1025:6: ( rulegoto_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1026:1: rulegoto_statement
                    {
                     before(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulegoto_statement_in_rule__Simple_statement__Alternatives2135);
                    rulegoto_statement();

                    state._fsp--;

                     after(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Simple_statement__Alternatives"


    // $ANTLR start "rule__Simple_expression__Alternatives_2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1036:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( rulesigned_number ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1040:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( rulesigned_number ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ADDITION_OPERATOR && LA5_0<=RULE_OR_KEYWORD)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_SIGNED_INTEGER_NUMBER && LA5_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1041:1: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1041:1: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1042:1: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1043:1: ( rule__Simple_expression__Group_2_0__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1043:2: rule__Simple_expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__0_in_rule__Simple_expression__Alternatives_22167);
                    rule__Simple_expression__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1047:6: ( rulesigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1047:6: ( rulesigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1048:1: rulesigned_number
                    {
                     before(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_rulesigned_number_in_rule__Simple_expression__Alternatives_22185);
                    rulesigned_number();

                    state._fsp--;

                     after(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Simple_expression__Alternatives_2"


    // $ANTLR start "rule__Simple_expression__Alternatives_2_0_0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1058:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) ) | ( RULE_OR_KEYWORD ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1062:1: ( ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) ) | ( RULE_OR_KEYWORD ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ADDITION_OPERATOR) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_OR_KEYWORD) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1063:1: ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1063:1: ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1064:1: ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1064:1: ( ( RULE_ADDITION_OPERATOR ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1065:1: ( RULE_ADDITION_OPERATOR )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1066:1: ( RULE_ADDITION_OPERATOR )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1066:3: RULE_ADDITION_OPERATOR
                    {
                    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02220); 

                    }

                     after(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 

                    }

                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1069:1: ( ( RULE_ADDITION_OPERATOR )* )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1070:1: ( RULE_ADDITION_OPERATOR )*
                    {
                     before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1071:1: ( RULE_ADDITION_OPERATOR )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ADDITION_OPERATOR) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1071:3: RULE_ADDITION_OPERATOR
                    	    {
                    	    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02233); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1076:6: ( RULE_OR_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1076:6: ( RULE_OR_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1077:1: RULE_OR_KEYWORD
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOR_KEYWORDTerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_OR_KEYWORD,FOLLOW_RULE_OR_KEYWORD_in_rule__Simple_expression__Alternatives_2_0_02254); 
                     after(grammarAccess.getSimple_expressionAccess().getOR_KEYWORDTerminalRuleCall_2_0_0_1()); 

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
    // $ANTLR end "rule__Simple_expression__Alternatives_2_0_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1087:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1091:1: ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1092:1: ( rulevariable )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1092:1: ( rulevariable )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1093:1: rulevariable
                    {
                     before(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulevariable_in_rule__Factor__Alternatives2286);
                    rulevariable();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1098:6: ( rulenumber )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1098:6: ( rulenumber )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1099:1: rulenumber
                    {
                     before(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Factor__Alternatives2303);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1104:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1104:6: ( RULE_STRING )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1105:1: RULE_STRING
                    {
                     before(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Factor__Alternatives2320); 
                     after(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1110:6: ( ruleset )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1110:6: ( ruleset )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1111:1: ruleset
                    {
                     before(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleset_in_rule__Factor__Alternatives2337);
                    ruleset();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1116:6: ( RULE_NIL_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1116:6: ( RULE_NIL_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1117:1: RULE_NIL_KEYWORD
                    {
                     before(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                    match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives2354); 
                     after(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1122:6: ( rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1122:6: ( rulefunction_designator )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1123:1: rulefunction_designator
                    {
                     before(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives2371);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1128:6: ( ( rule__Factor__Group_6__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1128:6: ( ( rule__Factor__Group_6__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1129:1: ( rule__Factor__Group_6__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_6()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1130:1: ( rule__Factor__Group_6__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1130:2: rule__Factor__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives2388);
                    rule__Factor__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1134:6: ( ( rule__Factor__Group_7__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1134:6: ( ( rule__Factor__Group_7__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1135:1: ( rule__Factor__Group_7__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_7()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1136:1: ( rule__Factor__Group_7__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1136:2: rule__Factor__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives2406);
                    rule__Factor__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1145:1: rule__Number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1149:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER_NUMBER||LA9_0==RULE_REAL_NUMBER) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_SIGNED_INTEGER_NUMBER && LA9_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1150:1: ( ruleunsigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1150:1: ( ruleunsigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1151:1: ruleunsigned_number
                    {
                     before(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleunsigned_number_in_rule__Number__Alternatives2439);
                    ruleunsigned_number();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1156:6: ( rulesigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1156:6: ( rulesigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1157:1: rulesigned_number
                    {
                     before(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulesigned_number_in_rule__Number__Alternatives2456);
                    rulesigned_number();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Unsigned_number__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1167:1: rule__Unsigned_number__Alternatives : ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1171:1: ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INTEGER_NUMBER) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_REAL_NUMBER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1172:1: ( RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1172:1: ( RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1173:1: RULE_INTEGER_NUMBER
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rule__Unsigned_number__Alternatives2488); 
                     after(grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1178:6: ( RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1178:6: ( RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1179:1: RULE_REAL_NUMBER
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rule__Unsigned_number__Alternatives2505); 
                     after(grammarAccess.getUnsigned_numberAccess().getREAL_NUMBERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Unsigned_number__Alternatives"


    // $ANTLR start "rule__Signed_number__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1189:1: rule__Signed_number__Alternatives : ( ( RULE_SIGNED_INTEGER_NUMBER ) | ( RULE_SIGNED_REAL_NUMBER ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1193:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) | ( RULE_SIGNED_REAL_NUMBER ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1194:1: ( RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1194:1: ( RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1195:1: RULE_SIGNED_INTEGER_NUMBER
                    {
                     before(grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rule__Signed_number__Alternatives2537); 
                     after(grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1200:6: ( RULE_SIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1200:6: ( RULE_SIGNED_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1201:1: RULE_SIGNED_REAL_NUMBER
                    {
                     before(grammarAccess.getSigned_numberAccess().getSIGNED_REAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rule__Signed_number__Alternatives2554); 
                     after(grammarAccess.getSigned_numberAccess().getSIGNED_REAL_NUMBERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Signed_number__Alternatives"


    // $ANTLR start "rule__Structured_statement__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1211:1: rule__Structured_statement__Alternatives : ( ( rulecompound_statement ) | ( rulerepetitive_statement ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1215:1: ( ( rulecompound_statement ) | ( rulerepetitive_statement ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN_KEYWORD) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_WHILE_KEYWORD||LA12_0==RULE_REPEAT_KEYWORD||LA12_0==RULE_FOR_KEYWORD) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1216:1: ( rulecompound_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1216:1: ( rulecompound_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1217:1: rulecompound_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulecompound_statement_in_rule__Structured_statement__Alternatives2586);
                    rulecompound_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1222:6: ( rulerepetitive_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1222:6: ( rulerepetitive_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1223:1: rulerepetitive_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rule__Structured_statement__Alternatives2603);
                    rulerepetitive_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Structured_statement__Alternatives"


    // $ANTLR start "rule__Repetitive_statement__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1233:1: rule__Repetitive_statement__Alternatives : ( ( rulewhile_statement ) | ( rulerepeat_statement ) | ( rulefor_statement ) );
    public final void rule__Repetitive_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1237:1: ( ( rulewhile_statement ) | ( rulerepeat_statement ) | ( rulefor_statement ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_WHILE_KEYWORD:
                {
                alt13=1;
                }
                break;
            case RULE_REPEAT_KEYWORD:
                {
                alt13=2;
                }
                break;
            case RULE_FOR_KEYWORD:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1238:1: ( rulewhile_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1238:1: ( rulewhile_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1239:1: rulewhile_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulewhile_statement_in_rule__Repetitive_statement__Alternatives2635);
                    rulewhile_statement();

                    state._fsp--;

                     after(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1244:6: ( rulerepeat_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1244:6: ( rulerepeat_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1245:1: rulerepeat_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulerepeat_statement_in_rule__Repetitive_statement__Alternatives2652);
                    rulerepeat_statement();

                    state._fsp--;

                     after(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1250:6: ( rulefor_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1250:6: ( rulefor_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1251:1: rulefor_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulefor_statement_in_rule__Repetitive_statement__Alternatives2669);
                    rulefor_statement();

                    state._fsp--;

                     after(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Repetitive_statement__Alternatives"


    // $ANTLR start "rule__For_statement__Alternatives_2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1261:1: rule__For_statement__Alternatives_2 : ( ( RULE_TO_KEYWORD ) | ( RULE_DOWNTO_KEYWORD ) );
    public final void rule__For_statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1265:1: ( ( RULE_TO_KEYWORD ) | ( RULE_DOWNTO_KEYWORD ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_TO_KEYWORD) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_DOWNTO_KEYWORD) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1266:1: ( RULE_TO_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1266:1: ( RULE_TO_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1267:1: RULE_TO_KEYWORD
                    {
                     before(grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 
                    match(input,RULE_TO_KEYWORD,FOLLOW_RULE_TO_KEYWORD_in_rule__For_statement__Alternatives_22701); 
                     after(grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1272:6: ( RULE_DOWNTO_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1272:6: ( RULE_DOWNTO_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1273:1: RULE_DOWNTO_KEYWORD
                    {
                     before(grammarAccess.getFor_statementAccess().getDOWNTO_KEYWORDTerminalRuleCall_2_1()); 
                    match(input,RULE_DOWNTO_KEYWORD,FOLLOW_RULE_DOWNTO_KEYWORD_in_rule__For_statement__Alternatives_22718); 
                     after(grammarAccess.getFor_statementAccess().getDOWNTO_KEYWORDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__For_statement__Alternatives_2"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1285:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1289:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1290:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02748);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02751);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1297:1: rule__Program__Group__0__Impl : ( ruleprogram_heading_block ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1301:1: ( ( ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1302:1: ( ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1302:1: ( ruleprogram_heading_block )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1303:1: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl2778);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1314:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1318:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1319:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12807);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12810);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1326:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1330:1: ( ( ruleblock ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1331:1: ( ruleblock )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1331:1: ( ruleblock )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1332:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2837);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1343:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1347:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1348:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22866);
            rule__Program__Group__2__Impl();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1354:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1358:1: ( ( '.' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1359:1: ( '.' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1359:1: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1360:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Program__Group__2__Impl2894); 
             after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1379:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1383:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1384:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__02931);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__02934);
            rule__Program_heading_block__Group__1();

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
    // $ANTLR end "rule__Program_heading_block__Group__0"


    // $ANTLR start "rule__Program_heading_block__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1391:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1395:1: ( ( 'program' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1396:1: ( 'program' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1396:1: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1397:1: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Program_heading_block__Group__0__Impl2962); 
             after(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1410:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1414:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1415:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12993);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12996);
            rule__Program_heading_block__Group__2();

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
    // $ANTLR end "rule__Program_heading_block__Group__1"


    // $ANTLR start "rule__Program_heading_block__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1422:1: rule__Program_heading_block__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1426:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1427:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1427:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1428:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl3023); 
             after(grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1439:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1443:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1444:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__23052);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__23055);
            rule__Program_heading_block__Group__3();

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
    // $ANTLR end "rule__Program_heading_block__Group__2"


    // $ANTLR start "rule__Program_heading_block__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1451:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1455:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1456:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1456:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1457:1: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1458:1: ( rule__Program_heading_block__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1458:2: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl3082);
                    rule__Program_heading_block__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1468:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1472:1: ( rule__Program_heading_block__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1473:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__33113);
            rule__Program_heading_block__Group__3__Impl();

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
    // $ANTLR end "rule__Program_heading_block__Group__3"


    // $ANTLR start "rule__Program_heading_block__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1479:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1483:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1484:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1484:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1485:1: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Program_heading_block__Group__3__Impl3141); 
             after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__3__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1506:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1510:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1511:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__03180);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__03183);
            rule__Program_heading_block__Group_2__1();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__0"


    // $ANTLR start "rule__Program_heading_block__Group_2__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1518:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1522:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1523:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1523:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1524:1: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Program_heading_block__Group_2__0__Impl3211); 
             after(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Program_heading_block__Group_2__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1537:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1541:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1542:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__13242);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__13245);
            rule__Program_heading_block__Group_2__2();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__1"


    // $ANTLR start "rule__Program_heading_block__Group_2__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1549:1: rule__Program_heading_block__Group_2__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1553:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1554:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1554:1: ( ruleidentifier_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1555:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl3272);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Program_heading_block__Group_2__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1566:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1570:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1571:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__23301);
            rule__Program_heading_block__Group_2__2__Impl();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__2"


    // $ANTLR start "rule__Program_heading_block__Group_2__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1577:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1581:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1582:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1582:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1583:1: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,42,FOLLOW_42_in_rule__Program_heading_block__Group_2__2__Impl3329); 
             after(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Program_heading_block__Group_2__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1602:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1606:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1607:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03366);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03369);
            rule__Identifier_list__Group__1();

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
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1614:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1618:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1619:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1619:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1620:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl3396); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1631:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1635:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1636:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__13425);
            rule__Identifier_list__Group__1__Impl();

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
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1642:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1646:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1647:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1647:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1648:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1649:1: ( rule__Identifier_list__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1649:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl3452);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1663:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1667:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1668:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__03487);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__03490);
            rule__Identifier_list__Group_1__1();

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
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1675:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1679:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1680:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1680:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1681:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Identifier_list__Group_1__0__Impl3518); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1694:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1698:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1699:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__13549);
            rule__Identifier_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1705:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1709:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1710:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1710:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1711:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl3576); 
             after(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1726:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1730:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1731:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03609);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03612);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1738:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1742:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1743:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1743:1: ( ruledeclaration_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1744:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl3639);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 

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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1755:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1759:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1760:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13668);
            rule__Block__Group__1__Impl();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1766:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1770:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1771:1: ( rulestatement_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1771:1: ( rulestatement_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1772:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl3695);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1787:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1791:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1792:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__03728);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__03731);
            rule__Statement_part__Group__1();

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
    // $ANTLR end "rule__Statement_part__Group__0"


    // $ANTLR start "rule__Statement_part__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1799:1: rule__Statement_part__Group__0__Impl : ( RULE_BEGIN_KEYWORD ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1803:1: ( ( RULE_BEGIN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1804:1: ( RULE_BEGIN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1804:1: ( RULE_BEGIN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1805:1: RULE_BEGIN_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl3758); 
             after(grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Statement_part__Group__0__Impl"


    // $ANTLR start "rule__Statement_part__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1816:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1820:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1821:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__13787);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__13790);
            rule__Statement_part__Group__2();

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
    // $ANTLR end "rule__Statement_part__Group__1"


    // $ANTLR start "rule__Statement_part__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1828:1: rule__Statement_part__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1832:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1833:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1833:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1834:1: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl3817);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Statement_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1845:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1849:1: ( rule__Statement_part__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1850:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__23846);
            rule__Statement_part__Group__2__Impl();

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
    // $ANTLR end "rule__Statement_part__Group__2"


    // $ANTLR start "rule__Statement_part__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1856:1: rule__Statement_part__Group__2__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1860:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1861:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1861:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1862:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getEND_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl3873); 
             after(grammarAccess.getStatement_partAccess().getEND_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Statement_part__Group__2__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1879:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1883:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1884:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__03908);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__03911);
            rule__Statement_sequence__Group__1();

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
    // $ANTLR end "rule__Statement_sequence__Group__0"


    // $ANTLR start "rule__Statement_sequence__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1891:1: rule__Statement_sequence__Group__0__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1895:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1896:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1896:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1897:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl3938);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Statement_sequence__Group__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1908:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1912:1: ( rule__Statement_sequence__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1913:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13967);
            rule__Statement_sequence__Group__1__Impl();

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
    // $ANTLR end "rule__Statement_sequence__Group__1"


    // $ANTLR start "rule__Statement_sequence__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1919:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1923:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1924:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1924:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1925:1: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1926:1: ( rule__Statement_sequence__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1926:2: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3994);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement_sequence__Group__1__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1940:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1944:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1945:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__04029);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__04032);
            rule__Statement_sequence__Group_1__1();

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
    // $ANTLR end "rule__Statement_sequence__Group_1__0"


    // $ANTLR start "rule__Statement_sequence__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1952:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1956:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1957:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1957:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1958:1: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Statement_sequence__Group_1__0__Impl4060); 
             after(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 

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
    // $ANTLR end "rule__Statement_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1971:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1975:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1976:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__14091);
            rule__Statement_sequence__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement_sequence__Group_1__1"


    // $ANTLR start "rule__Statement_sequence__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1982:1: rule__Statement_sequence__Group_1__1__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1986:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1987:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1987:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1988:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl4118);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Statement_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2003:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2007:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2008:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__04151);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__04154);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2015:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2019:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2020:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2020:1: ( ( rule__Statement__Group_0__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2021:1: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2022:1: ( rule__Statement__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INTEGER_NUMBER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2022:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl4181);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2032:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2036:1: ( rule__Statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2037:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__14212);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2043:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2047:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2048:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2048:1: ( ( rule__Statement__Alternatives_1 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2049:1: ( rule__Statement__Alternatives_1 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2050:1: ( rule__Statement__Alternatives_1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2050:2: rule__Statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_1_in_rule__Statement__Group__1__Impl4239);
            rule__Statement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2064:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2068:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2069:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__04273);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__04276);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2076:1: rule__Statement__Group_0__0__Impl : ( rulelabel ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2080:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2081:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2081:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2082:1: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl4303);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2093:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2097:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2098:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14332);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2104:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2108:1: ( ( ':' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2109:1: ( ':' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2109:1: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2110:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__Statement__Group_0__1__Impl4360); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2127:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2131:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2132:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__04395);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__04398);
            rule__Assignment_statement__Group__1();

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
    // $ANTLR end "rule__Assignment_statement__Group__0"


    // $ANTLR start "rule__Assignment_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2139:1: rule__Assignment_statement__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2143:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2144:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2144:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2145:1: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl4425);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__0__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2156:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2160:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2161:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__14454);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__14457);
            rule__Assignment_statement__Group__2();

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
    // $ANTLR end "rule__Assignment_statement__Group__1"


    // $ANTLR start "rule__Assignment_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2168:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2172:1: ( ( ':=' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2173:1: ( ':=' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2173:1: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2174:1: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__Assignment_statement__Group__1__Impl4485); 
             after(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2187:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2191:1: ( rule__Assignment_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2192:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__24516);
            rule__Assignment_statement__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment_statement__Group__2"


    // $ANTLR start "rule__Assignment_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2198:1: rule__Assignment_statement__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2202:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2203:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2203:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2204:1: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl4543);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__2__Impl"


    // $ANTLR start "rule__Indexed_variable__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2221:1: rule__Indexed_variable__Group__0 : rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1 ;
    public final void rule__Indexed_variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2225:1: ( rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2226:2: rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__0__Impl_in_rule__Indexed_variable__Group__04578);
            rule__Indexed_variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__1_in_rule__Indexed_variable__Group__04581);
            rule__Indexed_variable__Group__1();

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
    // $ANTLR end "rule__Indexed_variable__Group__0"


    // $ANTLR start "rule__Indexed_variable__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2233:1: rule__Indexed_variable__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Indexed_variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2237:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2238:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2238:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2239:1: rulevariable
            {
             before(grammarAccess.getIndexed_variableAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Indexed_variable__Group__0__Impl4608);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getIndexed_variableAccess().getVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__Indexed_variable__Group__0__Impl"


    // $ANTLR start "rule__Indexed_variable__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2250:1: rule__Indexed_variable__Group__1 : rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2 ;
    public final void rule__Indexed_variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2254:1: ( rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2255:2: rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__1__Impl_in_rule__Indexed_variable__Group__14637);
            rule__Indexed_variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__2_in_rule__Indexed_variable__Group__14640);
            rule__Indexed_variable__Group__2();

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
    // $ANTLR end "rule__Indexed_variable__Group__1"


    // $ANTLR start "rule__Indexed_variable__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2262:1: rule__Indexed_variable__Group__1__Impl : ( '[' ) ;
    public final void rule__Indexed_variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2266:1: ( ( '[' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2267:1: ( '[' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2267:1: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2268:1: '['
            {
             before(grammarAccess.getIndexed_variableAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Indexed_variable__Group__1__Impl4668); 
             after(grammarAccess.getIndexed_variableAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Indexed_variable__Group__1__Impl"


    // $ANTLR start "rule__Indexed_variable__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2281:1: rule__Indexed_variable__Group__2 : rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3 ;
    public final void rule__Indexed_variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2285:1: ( rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2286:2: rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__2__Impl_in_rule__Indexed_variable__Group__24699);
            rule__Indexed_variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__3_in_rule__Indexed_variable__Group__24702);
            rule__Indexed_variable__Group__3();

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
    // $ANTLR end "rule__Indexed_variable__Group__2"


    // $ANTLR start "rule__Indexed_variable__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2293:1: rule__Indexed_variable__Group__2__Impl : ( ruleexpression_list ) ;
    public final void rule__Indexed_variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2297:1: ( ( ruleexpression_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2298:1: ( ruleexpression_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2298:1: ( ruleexpression_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2299:1: ruleexpression_list
            {
             before(grammarAccess.getIndexed_variableAccess().getExpression_listParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_list_in_rule__Indexed_variable__Group__2__Impl4729);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getIndexed_variableAccess().getExpression_listParserRuleCall_2()); 

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
    // $ANTLR end "rule__Indexed_variable__Group__2__Impl"


    // $ANTLR start "rule__Indexed_variable__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2310:1: rule__Indexed_variable__Group__3 : rule__Indexed_variable__Group__3__Impl ;
    public final void rule__Indexed_variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2314:1: ( rule__Indexed_variable__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2315:2: rule__Indexed_variable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__3__Impl_in_rule__Indexed_variable__Group__34758);
            rule__Indexed_variable__Group__3__Impl();

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
    // $ANTLR end "rule__Indexed_variable__Group__3"


    // $ANTLR start "rule__Indexed_variable__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2321:1: rule__Indexed_variable__Group__3__Impl : ( ']' ) ;
    public final void rule__Indexed_variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2325:1: ( ( ']' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2326:1: ( ']' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2326:1: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2327:1: ']'
            {
             before(grammarAccess.getIndexed_variableAccess().getRightSquareBracketKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__Indexed_variable__Group__3__Impl4786); 
             after(grammarAccess.getIndexed_variableAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Indexed_variable__Group__3__Impl"


    // $ANTLR start "rule__Expression_list__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2348:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2352:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2353:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_rule__Expression_list__Group__0__Impl_in_rule__Expression_list__Group__04825);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression_list__Group__1_in_rule__Expression_list__Group__04828);
            rule__Expression_list__Group__1();

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
    // $ANTLR end "rule__Expression_list__Group__0"


    // $ANTLR start "rule__Expression_list__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2360:1: rule__Expression_list__Group__0__Impl : ( ruleexpression ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2364:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2365:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2365:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2366:1: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Expression_list__Group__0__Impl4855);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression_list__Group__0__Impl"


    // $ANTLR start "rule__Expression_list__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2377:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2381:1: ( rule__Expression_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2382:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression_list__Group__1__Impl_in_rule__Expression_list__Group__14884);
            rule__Expression_list__Group__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group__1"


    // $ANTLR start "rule__Expression_list__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2388:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2392:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2393:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2393:1: ( ( rule__Expression_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2394:1: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2395:1: ( rule__Expression_list__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2395:2: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression_list__Group_1__0_in_rule__Expression_list__Group__1__Impl4911);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExpression_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression_list__Group__1__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2409:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2413:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2414:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression_list__Group_1__0__Impl_in_rule__Expression_list__Group_1__04946);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression_list__Group_1__1_in_rule__Expression_list__Group_1__04949);
            rule__Expression_list__Group_1__1();

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
    // $ANTLR end "rule__Expression_list__Group_1__0"


    // $ANTLR start "rule__Expression_list__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2421:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2425:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2426:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2426:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2427:1: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Expression_list__Group_1__0__Impl4977); 
             after(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression_list__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2440:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2444:1: ( rule__Expression_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2445:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression_list__Group_1__1__Impl_in_rule__Expression_list__Group_1__15008);
            rule__Expression_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group_1__1"


    // $ANTLR start "rule__Expression_list__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2451:1: rule__Expression_list__Group_1__1__Impl : ( ruleexpression ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2455:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2456:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2456:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2457:1: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Expression_list__Group_1__1__Impl5035);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Expression_list__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2472:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2476:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2477:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05068);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05071);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2484:1: rule__Expression__Group__0__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2488:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2489:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2489:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2490:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl5098);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2501:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2505:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2506:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15127);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2512:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2516:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2517:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2517:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2518:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2519:1: ( rule__Expression__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_RELATIONAL_OPERATOR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2519:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5154);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2533:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2537:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2538:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05189);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05192);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2545:1: rule__Expression__Group_1__0__Impl : ( RULE_RELATIONAL_OPERATOR ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2549:1: ( ( RULE_RELATIONAL_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2550:1: ( RULE_RELATIONAL_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2550:1: ( RULE_RELATIONAL_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2551:1: RULE_RELATIONAL_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl5219); 
             after(grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2562:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2566:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2567:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15248);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2573:1: rule__Expression__Group_1__1__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2577:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2578:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2578:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2579:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl5275);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2594:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2598:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2599:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__05308);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__05311);
            rule__Simple_expression__Group__1();

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
    // $ANTLR end "rule__Simple_expression__Group__0"


    // $ANTLR start "rule__Simple_expression__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2606:1: rule__Simple_expression__Group__0__Impl : ( ( RULE_ADDITION_OPERATOR )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2610:1: ( ( ( RULE_ADDITION_OPERATOR )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2611:1: ( ( RULE_ADDITION_OPERATOR )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2611:1: ( ( RULE_ADDITION_OPERATOR )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2612:1: ( RULE_ADDITION_OPERATOR )?
            {
             before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2613:1: ( RULE_ADDITION_OPERATOR )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ADDITION_OPERATOR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2613:3: RULE_ADDITION_OPERATOR
                    {
                    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group__0__Impl5339); 

                    }
                    break;

            }

             after(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Simple_expression__Group__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2623:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2627:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2628:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__15370);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__15373);
            rule__Simple_expression__Group__2();

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
    // $ANTLR end "rule__Simple_expression__Group__1"


    // $ANTLR start "rule__Simple_expression__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2635:1: rule__Simple_expression__Group__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2639:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2640:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2640:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2641:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl5400);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 

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
    // $ANTLR end "rule__Simple_expression__Group__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2652:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2656:1: ( rule__Simple_expression__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2657:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__25429);
            rule__Simple_expression__Group__2__Impl();

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
    // $ANTLR end "rule__Simple_expression__Group__2"


    // $ANTLR start "rule__Simple_expression__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2663:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2667:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2668:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2668:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2669:1: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2670:1: ( rule__Simple_expression__Alternatives_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ADDITION_OPERATOR && LA22_0<=RULE_OR_KEYWORD)||(LA22_0>=RULE_SIGNED_INTEGER_NUMBER && LA22_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2670:2: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Simple_expression__Alternatives_2_in_rule__Simple_expression__Group__2__Impl5456);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Simple_expression__Group__2__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2686:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2690:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2691:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__0__Impl_in_rule__Simple_expression__Group_2_0__05493);
            rule__Simple_expression__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__1_in_rule__Simple_expression__Group_2_0__05496);
            rule__Simple_expression__Group_2_0__1();

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__0"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2698:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2702:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2703:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2703:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2704:1: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2705:1: ( rule__Simple_expression__Alternatives_2_0_0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2705:2: rule__Simple_expression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__Simple_expression__Alternatives_2_0_0_in_rule__Simple_expression__Group_2_0__0__Impl5523);
            rule__Simple_expression__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2715:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2719:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2720:2: rule__Simple_expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__1__Impl_in_rule__Simple_expression__Group_2_0__15553);
            rule__Simple_expression__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__1"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2726:1: rule__Simple_expression__Group_2_0__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2730:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2731:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2731:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2732:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group_2_0__1__Impl5580);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2747:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2751:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2752:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05613);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05616);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2759:1: rule__Term__Group__0__Impl : ( rulefactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2763:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2764:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2764:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2765:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group__0__Impl5643);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 

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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2776:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2780:1: ( rule__Term__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2781:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15672);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2787:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2791:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2792:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2792:1: ( ( rule__Term__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2793:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2794:1: ( rule__Term__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2794:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl5699);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2808:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2812:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2813:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__05734);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05737);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2820:1: rule__Term__Group_1__0__Impl : ( RULE_MULTIPLICATION_OPERATOR ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2824:1: ( ( RULE_MULTIPLICATION_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2825:1: ( RULE_MULTIPLICATION_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2825:1: ( RULE_MULTIPLICATION_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2826:1: RULE_MULTIPLICATION_OPERATOR
            {
             before(grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl5764); 
             after(grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2837:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2841:1: ( rule__Term__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2842:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__15793);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2848:1: rule__Term__Group_1__1__Impl : ( rulefactor ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2852:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2853:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2853:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2854:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl5820);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_6__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2869:1: rule__Factor__Group_6__0 : rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 ;
    public final void rule__Factor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2873:1: ( rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2874:2: rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__05853);
            rule__Factor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__05856);
            rule__Factor__Group_6__1();

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
    // $ANTLR end "rule__Factor__Group_6__0"


    // $ANTLR start "rule__Factor__Group_6__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2881:1: rule__Factor__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2885:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2886:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2886:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2887:1: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,41,FOLLOW_41_in_rule__Factor__Group_6__0__Impl5884); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__Factor__Group_6__0__Impl"


    // $ANTLR start "rule__Factor__Group_6__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2900:1: rule__Factor__Group_6__1 : rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 ;
    public final void rule__Factor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2904:1: ( rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2905:2: rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__15915);
            rule__Factor__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__15918);
            rule__Factor__Group_6__2();

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
    // $ANTLR end "rule__Factor__Group_6__1"


    // $ANTLR start "rule__Factor__Group_6__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2912:1: rule__Factor__Group_6__1__Impl : ( ruleexpression ) ;
    public final void rule__Factor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2916:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2917:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2917:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2918:1: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl5945);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Factor__Group_6__1__Impl"


    // $ANTLR start "rule__Factor__Group_6__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2929:1: rule__Factor__Group_6__2 : rule__Factor__Group_6__2__Impl ;
    public final void rule__Factor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2933:1: ( rule__Factor__Group_6__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2934:2: rule__Factor__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__25974);
            rule__Factor__Group_6__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_6__2"


    // $ANTLR start "rule__Factor__Group_6__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2940:1: rule__Factor__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2944:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2945:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2945:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2946:1: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
            match(input,42,FOLLOW_42_in_rule__Factor__Group_6__2__Impl6002); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 

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
    // $ANTLR end "rule__Factor__Group_6__2__Impl"


    // $ANTLR start "rule__Factor__Group_7__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2965:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2969:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2970:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__06039);
            rule__Factor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__06042);
            rule__Factor__Group_7__1();

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
    // $ANTLR end "rule__Factor__Group_7__0"


    // $ANTLR start "rule__Factor__Group_7__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2977:1: rule__Factor__Group_7__0__Impl : ( RULE_NOT_KEYWORD ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2981:1: ( ( RULE_NOT_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2982:1: ( RULE_NOT_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2982:1: ( RULE_NOT_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2983:1: RULE_NOT_KEYWORD
            {
             before(grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 
            match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl6069); 
             after(grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Factor__Group_7__0__Impl"


    // $ANTLR start "rule__Factor__Group_7__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2994:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2998:1: ( rule__Factor__Group_7__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2999:2: rule__Factor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__16098);
            rule__Factor__Group_7__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_7__1"


    // $ANTLR start "rule__Factor__Group_7__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3005:1: rule__Factor__Group_7__1__Impl : ( rulefactor ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3009:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3010:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3010:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3011:1: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl6125);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 

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
    // $ANTLR end "rule__Factor__Group_7__1__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3026:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3030:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3031:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06158);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06161);
            rule__Set__Group__1();

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
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3038:1: rule__Set__Group__0__Impl : ( '[' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3042:1: ( ( '[' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3043:1: ( '[' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3043:1: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3044:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Set__Group__0__Impl6189); 
             after(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3057:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3061:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3062:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16220);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16223);
            rule__Set__Group__2();

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
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3069:1: rule__Set__Group__1__Impl : ( ( ruleexpression_list )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3073:1: ( ( ( ruleexpression_list )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3074:1: ( ( ruleexpression_list )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3074:1: ( ( ruleexpression_list )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3075:1: ( ruleexpression_list )?
            {
             before(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3076:1: ( ruleexpression_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INTEGER_NUMBER && LA24_0<=RULE_ADDITION_OPERATOR)||(LA24_0>=RULE_STRING && LA24_0<=RULE_SIGNED_REAL_NUMBER)||LA24_0==RULE_NOT_KEYWORD||LA24_0==41||LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3076:3: ruleexpression_list
                    {
                    pushFollow(FOLLOW_ruleexpression_list_in_rule__Set__Group__1__Impl6251);
                    ruleexpression_list();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 

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
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3086:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3090:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3091:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26282);
            rule__Set__Group__2__Impl();

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
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3097:1: rule__Set__Group__2__Impl : ( ']' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3101:1: ( ( ']' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3102:1: ( ']' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3102:1: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3103:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Set__Group__2__Impl6310); 
             after(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3122:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3126:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3127:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__06347);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__06350);
            rule__Function_designator__Group__1();

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
    // $ANTLR end "rule__Function_designator__Group__0"


    // $ANTLR start "rule__Function_designator__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3134:1: rule__Function_designator__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3138:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3139:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3139:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3140:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl6377); 
             after(grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Function_designator__Group__0__Impl"


    // $ANTLR start "rule__Function_designator__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3151:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3155:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3156:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__16406);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__2_in_rule__Function_designator__Group__16409);
            rule__Function_designator__Group__2();

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
    // $ANTLR end "rule__Function_designator__Group__1"


    // $ANTLR start "rule__Function_designator__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3163:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3167:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3168:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3168:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3169:1: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Function_designator__Group__1__Impl6437); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Function_designator__Group__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3182:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3186:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3187:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__2__Impl_in_rule__Function_designator__Group__26468);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__3_in_rule__Function_designator__Group__26471);
            rule__Function_designator__Group__3();

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
    // $ANTLR end "rule__Function_designator__Group__2"


    // $ANTLR start "rule__Function_designator__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3194:1: rule__Function_designator__Group__2__Impl : ( ( ruleexpression_list )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3198:1: ( ( ( ruleexpression_list )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3199:1: ( ( ruleexpression_list )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3199:1: ( ( ruleexpression_list )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3200:1: ( ruleexpression_list )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3201:1: ( ruleexpression_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INTEGER_NUMBER && LA25_0<=RULE_ADDITION_OPERATOR)||(LA25_0>=RULE_STRING && LA25_0<=RULE_SIGNED_REAL_NUMBER)||LA25_0==RULE_NOT_KEYWORD||LA25_0==41||LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3201:3: ruleexpression_list
                    {
                    pushFollow(FOLLOW_ruleexpression_list_in_rule__Function_designator__Group__2__Impl6499);
                    ruleexpression_list();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 

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
    // $ANTLR end "rule__Function_designator__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3211:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3215:1: ( rule__Function_designator__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3216:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__3__Impl_in_rule__Function_designator__Group__36530);
            rule__Function_designator__Group__3__Impl();

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
    // $ANTLR end "rule__Function_designator__Group__3"


    // $ANTLR start "rule__Function_designator__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3222:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3226:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3227:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3227:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3228:1: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__Function_designator__Group__3__Impl6558); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Function_designator__Group__3__Impl"


    // $ANTLR start "rule__Compound_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3249:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3253:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3254:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__0__Impl_in_rule__Compound_statement__Group__06597);
            rule__Compound_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compound_statement__Group__1_in_rule__Compound_statement__Group__06600);
            rule__Compound_statement__Group__1();

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
    // $ANTLR end "rule__Compound_statement__Group__0"


    // $ANTLR start "rule__Compound_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3261:1: rule__Compound_statement__Group__0__Impl : ( RULE_BEGIN_KEYWORD ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3265:1: ( ( RULE_BEGIN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3266:1: ( RULE_BEGIN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3266:1: ( RULE_BEGIN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3267:1: RULE_BEGIN_KEYWORD
            {
             before(grammarAccess.getCompound_statementAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Compound_statement__Group__0__Impl6627); 
             after(grammarAccess.getCompound_statementAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Compound_statement__Group__0__Impl"


    // $ANTLR start "rule__Compound_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3278:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3282:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3283:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__1__Impl_in_rule__Compound_statement__Group__16656);
            rule__Compound_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compound_statement__Group__2_in_rule__Compound_statement__Group__16659);
            rule__Compound_statement__Group__2();

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
    // $ANTLR end "rule__Compound_statement__Group__1"


    // $ANTLR start "rule__Compound_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3290:1: rule__Compound_statement__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3294:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3295:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3295:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3296:1: rulestatement_sequence
            {
             before(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Compound_statement__Group__1__Impl6686);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Compound_statement__Group__1__Impl"


    // $ANTLR start "rule__Compound_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3307:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3311:1: ( rule__Compound_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3312:2: rule__Compound_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__2__Impl_in_rule__Compound_statement__Group__26715);
            rule__Compound_statement__Group__2__Impl();

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
    // $ANTLR end "rule__Compound_statement__Group__2"


    // $ANTLR start "rule__Compound_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3318:1: rule__Compound_statement__Group__2__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3322:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3323:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3323:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3324:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getCompound_statementAccess().getEND_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Compound_statement__Group__2__Impl6742); 
             after(grammarAccess.getCompound_statementAccess().getEND_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Compound_statement__Group__2__Impl"


    // $ANTLR start "rule__While_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3341:1: rule__While_statement__Group__0 : rule__While_statement__Group__0__Impl rule__While_statement__Group__1 ;
    public final void rule__While_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3345:1: ( rule__While_statement__Group__0__Impl rule__While_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3346:2: rule__While_statement__Group__0__Impl rule__While_statement__Group__1
            {
            pushFollow(FOLLOW_rule__While_statement__Group__0__Impl_in_rule__While_statement__Group__06777);
            rule__While_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__1_in_rule__While_statement__Group__06780);
            rule__While_statement__Group__1();

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
    // $ANTLR end "rule__While_statement__Group__0"


    // $ANTLR start "rule__While_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3353:1: rule__While_statement__Group__0__Impl : ( RULE_WHILE_KEYWORD ) ;
    public final void rule__While_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3357:1: ( ( RULE_WHILE_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3358:1: ( RULE_WHILE_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3358:1: ( RULE_WHILE_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3359:1: RULE_WHILE_KEYWORD
            {
             before(grammarAccess.getWhile_statementAccess().getWHILE_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_WHILE_KEYWORD,FOLLOW_RULE_WHILE_KEYWORD_in_rule__While_statement__Group__0__Impl6807); 
             after(grammarAccess.getWhile_statementAccess().getWHILE_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__While_statement__Group__0__Impl"


    // $ANTLR start "rule__While_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3370:1: rule__While_statement__Group__1 : rule__While_statement__Group__1__Impl rule__While_statement__Group__2 ;
    public final void rule__While_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3374:1: ( rule__While_statement__Group__1__Impl rule__While_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3375:2: rule__While_statement__Group__1__Impl rule__While_statement__Group__2
            {
            pushFollow(FOLLOW_rule__While_statement__Group__1__Impl_in_rule__While_statement__Group__16836);
            rule__While_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__2_in_rule__While_statement__Group__16839);
            rule__While_statement__Group__2();

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
    // $ANTLR end "rule__While_statement__Group__1"


    // $ANTLR start "rule__While_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3382:1: rule__While_statement__Group__1__Impl : ( ruleexpression ) ;
    public final void rule__While_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3386:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3387:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3387:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3388:1: ruleexpression
            {
             before(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__While_statement__Group__1__Impl6866);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__While_statement__Group__1__Impl"


    // $ANTLR start "rule__While_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3399:1: rule__While_statement__Group__2 : rule__While_statement__Group__2__Impl rule__While_statement__Group__3 ;
    public final void rule__While_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3403:1: ( rule__While_statement__Group__2__Impl rule__While_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3404:2: rule__While_statement__Group__2__Impl rule__While_statement__Group__3
            {
            pushFollow(FOLLOW_rule__While_statement__Group__2__Impl_in_rule__While_statement__Group__26895);
            rule__While_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__3_in_rule__While_statement__Group__26898);
            rule__While_statement__Group__3();

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
    // $ANTLR end "rule__While_statement__Group__2"


    // $ANTLR start "rule__While_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3411:1: rule__While_statement__Group__2__Impl : ( RULE_DO_KEYWORD ) ;
    public final void rule__While_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3415:1: ( ( RULE_DO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3416:1: ( RULE_DO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3416:1: ( RULE_DO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3417:1: RULE_DO_KEYWORD
            {
             before(grammarAccess.getWhile_statementAccess().getDO_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rule__While_statement__Group__2__Impl6925); 
             after(grammarAccess.getWhile_statementAccess().getDO_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__While_statement__Group__2__Impl"


    // $ANTLR start "rule__While_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3428:1: rule__While_statement__Group__3 : rule__While_statement__Group__3__Impl ;
    public final void rule__While_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3432:1: ( rule__While_statement__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3433:2: rule__While_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__While_statement__Group__3__Impl_in_rule__While_statement__Group__36954);
            rule__While_statement__Group__3__Impl();

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
    // $ANTLR end "rule__While_statement__Group__3"


    // $ANTLR start "rule__While_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3439:1: rule__While_statement__Group__3__Impl : ( rulestatement ) ;
    public final void rule__While_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3443:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3444:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3444:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3445:1: rulestatement
            {
             before(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 
            pushFollow(FOLLOW_rulestatement_in_rule__While_statement__Group__3__Impl6981);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 

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
    // $ANTLR end "rule__While_statement__Group__3__Impl"


    // $ANTLR start "rule__Repeat_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3464:1: rule__Repeat_statement__Group__0 : rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1 ;
    public final void rule__Repeat_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3468:1: ( rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3469:2: rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__0__Impl_in_rule__Repeat_statement__Group__07018);
            rule__Repeat_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__1_in_rule__Repeat_statement__Group__07021);
            rule__Repeat_statement__Group__1();

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
    // $ANTLR end "rule__Repeat_statement__Group__0"


    // $ANTLR start "rule__Repeat_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3476:1: rule__Repeat_statement__Group__0__Impl : ( RULE_REPEAT_KEYWORD ) ;
    public final void rule__Repeat_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3480:1: ( ( RULE_REPEAT_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3481:1: ( RULE_REPEAT_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3481:1: ( RULE_REPEAT_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3482:1: RULE_REPEAT_KEYWORD
            {
             before(grammarAccess.getRepeat_statementAccess().getREPEAT_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_REPEAT_KEYWORD,FOLLOW_RULE_REPEAT_KEYWORD_in_rule__Repeat_statement__Group__0__Impl7048); 
             after(grammarAccess.getRepeat_statementAccess().getREPEAT_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Repeat_statement__Group__0__Impl"


    // $ANTLR start "rule__Repeat_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3493:1: rule__Repeat_statement__Group__1 : rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2 ;
    public final void rule__Repeat_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3497:1: ( rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3498:2: rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__1__Impl_in_rule__Repeat_statement__Group__17077);
            rule__Repeat_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__2_in_rule__Repeat_statement__Group__17080);
            rule__Repeat_statement__Group__2();

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
    // $ANTLR end "rule__Repeat_statement__Group__1"


    // $ANTLR start "rule__Repeat_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3505:1: rule__Repeat_statement__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Repeat_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3509:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3510:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3510:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3511:1: rulestatement_sequence
            {
             before(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Repeat_statement__Group__1__Impl7107);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Repeat_statement__Group__1__Impl"


    // $ANTLR start "rule__Repeat_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3522:1: rule__Repeat_statement__Group__2 : rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3 ;
    public final void rule__Repeat_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3526:1: ( rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3527:2: rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__2__Impl_in_rule__Repeat_statement__Group__27136);
            rule__Repeat_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__3_in_rule__Repeat_statement__Group__27139);
            rule__Repeat_statement__Group__3();

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
    // $ANTLR end "rule__Repeat_statement__Group__2"


    // $ANTLR start "rule__Repeat_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3534:1: rule__Repeat_statement__Group__2__Impl : ( RULE_UNTIL_KEYWORD ) ;
    public final void rule__Repeat_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3538:1: ( ( RULE_UNTIL_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3539:1: ( RULE_UNTIL_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3539:1: ( RULE_UNTIL_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3540:1: RULE_UNTIL_KEYWORD
            {
             before(grammarAccess.getRepeat_statementAccess().getUNTIL_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_UNTIL_KEYWORD,FOLLOW_RULE_UNTIL_KEYWORD_in_rule__Repeat_statement__Group__2__Impl7166); 
             after(grammarAccess.getRepeat_statementAccess().getUNTIL_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Repeat_statement__Group__2__Impl"


    // $ANTLR start "rule__Repeat_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3551:1: rule__Repeat_statement__Group__3 : rule__Repeat_statement__Group__3__Impl ;
    public final void rule__Repeat_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3555:1: ( rule__Repeat_statement__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3556:2: rule__Repeat_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__3__Impl_in_rule__Repeat_statement__Group__37195);
            rule__Repeat_statement__Group__3__Impl();

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
    // $ANTLR end "rule__Repeat_statement__Group__3"


    // $ANTLR start "rule__Repeat_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3562:1: rule__Repeat_statement__Group__3__Impl : ( ruleexpression ) ;
    public final void rule__Repeat_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3566:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3567:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3567:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3568:1: ruleexpression
            {
             before(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Repeat_statement__Group__3__Impl7222);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Repeat_statement__Group__3__Impl"


    // $ANTLR start "rule__For_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3587:1: rule__For_statement__Group__0 : rule__For_statement__Group__0__Impl rule__For_statement__Group__1 ;
    public final void rule__For_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3591:1: ( rule__For_statement__Group__0__Impl rule__For_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3592:2: rule__For_statement__Group__0__Impl rule__For_statement__Group__1
            {
            pushFollow(FOLLOW_rule__For_statement__Group__0__Impl_in_rule__For_statement__Group__07259);
            rule__For_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__1_in_rule__For_statement__Group__07262);
            rule__For_statement__Group__1();

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
    // $ANTLR end "rule__For_statement__Group__0"


    // $ANTLR start "rule__For_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3599:1: rule__For_statement__Group__0__Impl : ( RULE_FOR_KEYWORD ) ;
    public final void rule__For_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3603:1: ( ( RULE_FOR_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3604:1: ( RULE_FOR_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3604:1: ( RULE_FOR_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3605:1: RULE_FOR_KEYWORD
            {
             before(grammarAccess.getFor_statementAccess().getFOR_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_FOR_KEYWORD,FOLLOW_RULE_FOR_KEYWORD_in_rule__For_statement__Group__0__Impl7289); 
             after(grammarAccess.getFor_statementAccess().getFOR_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__For_statement__Group__0__Impl"


    // $ANTLR start "rule__For_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3616:1: rule__For_statement__Group__1 : rule__For_statement__Group__1__Impl rule__For_statement__Group__2 ;
    public final void rule__For_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3620:1: ( rule__For_statement__Group__1__Impl rule__For_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3621:2: rule__For_statement__Group__1__Impl rule__For_statement__Group__2
            {
            pushFollow(FOLLOW_rule__For_statement__Group__1__Impl_in_rule__For_statement__Group__17318);
            rule__For_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__2_in_rule__For_statement__Group__17321);
            rule__For_statement__Group__2();

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
    // $ANTLR end "rule__For_statement__Group__1"


    // $ANTLR start "rule__For_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3628:1: rule__For_statement__Group__1__Impl : ( ruleassignment_statement ) ;
    public final void rule__For_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3632:1: ( ( ruleassignment_statement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:1: ( ruleassignment_statement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:1: ( ruleassignment_statement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3634:1: ruleassignment_statement
            {
             before(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_rule__For_statement__Group__1__Impl7348);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 

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
    // $ANTLR end "rule__For_statement__Group__1__Impl"


    // $ANTLR start "rule__For_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3645:1: rule__For_statement__Group__2 : rule__For_statement__Group__2__Impl rule__For_statement__Group__3 ;
    public final void rule__For_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3649:1: ( rule__For_statement__Group__2__Impl rule__For_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3650:2: rule__For_statement__Group__2__Impl rule__For_statement__Group__3
            {
            pushFollow(FOLLOW_rule__For_statement__Group__2__Impl_in_rule__For_statement__Group__27377);
            rule__For_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__3_in_rule__For_statement__Group__27380);
            rule__For_statement__Group__3();

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
    // $ANTLR end "rule__For_statement__Group__2"


    // $ANTLR start "rule__For_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3657:1: rule__For_statement__Group__2__Impl : ( ( rule__For_statement__Alternatives_2 ) ) ;
    public final void rule__For_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3661:1: ( ( ( rule__For_statement__Alternatives_2 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3662:1: ( ( rule__For_statement__Alternatives_2 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3662:1: ( ( rule__For_statement__Alternatives_2 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3663:1: ( rule__For_statement__Alternatives_2 )
            {
             before(grammarAccess.getFor_statementAccess().getAlternatives_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3664:1: ( rule__For_statement__Alternatives_2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3664:2: rule__For_statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__For_statement__Alternatives_2_in_rule__For_statement__Group__2__Impl7407);
            rule__For_statement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__For_statement__Group__2__Impl"


    // $ANTLR start "rule__For_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3674:1: rule__For_statement__Group__3 : rule__For_statement__Group__3__Impl rule__For_statement__Group__4 ;
    public final void rule__For_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3678:1: ( rule__For_statement__Group__3__Impl rule__For_statement__Group__4 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3679:2: rule__For_statement__Group__3__Impl rule__For_statement__Group__4
            {
            pushFollow(FOLLOW_rule__For_statement__Group__3__Impl_in_rule__For_statement__Group__37437);
            rule__For_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__4_in_rule__For_statement__Group__37440);
            rule__For_statement__Group__4();

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
    // $ANTLR end "rule__For_statement__Group__3"


    // $ANTLR start "rule__For_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3686:1: rule__For_statement__Group__3__Impl : ( ruleexpression ) ;
    public final void rule__For_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3690:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3691:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3691:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3692:1: ruleexpression
            {
             before(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__For_statement__Group__3__Impl7467);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__For_statement__Group__3__Impl"


    // $ANTLR start "rule__For_statement__Group__4"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3703:1: rule__For_statement__Group__4 : rule__For_statement__Group__4__Impl rule__For_statement__Group__5 ;
    public final void rule__For_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3707:1: ( rule__For_statement__Group__4__Impl rule__For_statement__Group__5 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3708:2: rule__For_statement__Group__4__Impl rule__For_statement__Group__5
            {
            pushFollow(FOLLOW_rule__For_statement__Group__4__Impl_in_rule__For_statement__Group__47496);
            rule__For_statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__5_in_rule__For_statement__Group__47499);
            rule__For_statement__Group__5();

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
    // $ANTLR end "rule__For_statement__Group__4"


    // $ANTLR start "rule__For_statement__Group__4__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3715:1: rule__For_statement__Group__4__Impl : ( RULE_DO_KEYWORD ) ;
    public final void rule__For_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3719:1: ( ( RULE_DO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3720:1: ( RULE_DO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3720:1: ( RULE_DO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3721:1: RULE_DO_KEYWORD
            {
             before(grammarAccess.getFor_statementAccess().getDO_KEYWORDTerminalRuleCall_4()); 
            match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rule__For_statement__Group__4__Impl7526); 
             after(grammarAccess.getFor_statementAccess().getDO_KEYWORDTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__For_statement__Group__4__Impl"


    // $ANTLR start "rule__For_statement__Group__5"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3732:1: rule__For_statement__Group__5 : rule__For_statement__Group__5__Impl ;
    public final void rule__For_statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3736:1: ( rule__For_statement__Group__5__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3737:2: rule__For_statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__For_statement__Group__5__Impl_in_rule__For_statement__Group__57555);
            rule__For_statement__Group__5__Impl();

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
    // $ANTLR end "rule__For_statement__Group__5"


    // $ANTLR start "rule__For_statement__Group__5__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3743:1: rule__For_statement__Group__5__Impl : ( rulestatement ) ;
    public final void rule__For_statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3747:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3748:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3748:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3749:1: rulestatement
            {
             before(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 
            pushFollow(FOLLOW_rulestatement_in_rule__For_statement__Group__5__Impl7582);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 

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
    // $ANTLR end "rule__For_statement__Group__5__Impl"


    // $ANTLR start "rule__Goto_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3772:1: rule__Goto_statement__Group__0 : rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1 ;
    public final void rule__Goto_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3776:1: ( rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3777:2: rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__0__Impl_in_rule__Goto_statement__Group__07623);
            rule__Goto_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goto_statement__Group__1_in_rule__Goto_statement__Group__07626);
            rule__Goto_statement__Group__1();

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
    // $ANTLR end "rule__Goto_statement__Group__0"


    // $ANTLR start "rule__Goto_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3784:1: rule__Goto_statement__Group__0__Impl : ( RULE_GOTO_KEYWORD ) ;
    public final void rule__Goto_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3788:1: ( ( RULE_GOTO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3789:1: ( RULE_GOTO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3789:1: ( RULE_GOTO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3790:1: RULE_GOTO_KEYWORD
            {
             before(grammarAccess.getGoto_statementAccess().getGOTO_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_GOTO_KEYWORD,FOLLOW_RULE_GOTO_KEYWORD_in_rule__Goto_statement__Group__0__Impl7653); 
             after(grammarAccess.getGoto_statementAccess().getGOTO_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Goto_statement__Group__0__Impl"


    // $ANTLR start "rule__Goto_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3801:1: rule__Goto_statement__Group__1 : rule__Goto_statement__Group__1__Impl ;
    public final void rule__Goto_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3805:1: ( rule__Goto_statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3806:2: rule__Goto_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__1__Impl_in_rule__Goto_statement__Group__17682);
            rule__Goto_statement__Group__1__Impl();

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
    // $ANTLR end "rule__Goto_statement__Group__1"


    // $ANTLR start "rule__Goto_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3812:1: rule__Goto_statement__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Goto_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3816:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3817:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3817:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3818:1: rulelabel
            {
             before(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Goto_statement__Group__1__Impl7709);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 

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
    // $ANTLR end "rule__Goto_statement__Group__1__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3833:1: rule__Label_declaration_part__Group__0 : rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 ;
    public final void rule__Label_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3837:1: ( rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3838:2: rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__07742);
            rule__Label_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__07745);
            rule__Label_declaration_part__Group__1();

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
    // $ANTLR end "rule__Label_declaration_part__Group__0"


    // $ANTLR start "rule__Label_declaration_part__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3845:1: rule__Label_declaration_part__Group__0__Impl : ( RULE_LABEL_KEYWORD ) ;
    public final void rule__Label_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3849:1: ( ( RULE_LABEL_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3850:1: ( RULE_LABEL_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3850:1: ( RULE_LABEL_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3851:1: RULE_LABEL_KEYWORD
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl7772); 
             after(grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3862:1: rule__Label_declaration_part__Group__1 : rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 ;
    public final void rule__Label_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3866:1: ( rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3867:2: rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__17801);
            rule__Label_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__17804);
            rule__Label_declaration_part__Group__2();

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
    // $ANTLR end "rule__Label_declaration_part__Group__1"


    // $ANTLR start "rule__Label_declaration_part__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3874:1: rule__Label_declaration_part__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3878:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3879:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3879:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3880:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl7831);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3891:1: rule__Label_declaration_part__Group__2 : rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 ;
    public final void rule__Label_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3895:1: ( rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3896:2: rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__27860);
            rule__Label_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__27863);
            rule__Label_declaration_part__Group__3();

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
    // $ANTLR end "rule__Label_declaration_part__Group__2"


    // $ANTLR start "rule__Label_declaration_part__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3903:1: rule__Label_declaration_part__Group__2__Impl : ( ( rule__Label_declaration_part__Group_2__0 )* ) ;
    public final void rule__Label_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3907:1: ( ( ( rule__Label_declaration_part__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3908:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3908:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3909:1: ( rule__Label_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3910:1: ( rule__Label_declaration_part__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3910:2: rule__Label_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl7890);
            	    rule__Label_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3920:1: rule__Label_declaration_part__Group__3 : rule__Label_declaration_part__Group__3__Impl ;
    public final void rule__Label_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3924:1: ( rule__Label_declaration_part__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3925:2: rule__Label_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__37921);
            rule__Label_declaration_part__Group__3__Impl();

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
    // $ANTLR end "rule__Label_declaration_part__Group__3"


    // $ANTLR start "rule__Label_declaration_part__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3931:1: rule__Label_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3935:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3936:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3936:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3937:1: ';'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Label_declaration_part__Group__3__Impl7949); 
             after(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group_2__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3958:1: rule__Label_declaration_part__Group_2__0 : rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 ;
    public final void rule__Label_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3962:1: ( rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3963:2: rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__07988);
            rule__Label_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__07991);
            rule__Label_declaration_part__Group_2__1();

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
    // $ANTLR end "rule__Label_declaration_part__Group_2__0"


    // $ANTLR start "rule__Label_declaration_part__Group_2__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3970:1: rule__Label_declaration_part__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3974:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3975:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3975:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3976:1: ','
            {
             before(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__Label_declaration_part__Group_2__0__Impl8019); 
             after(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group_2__0__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group_2__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3989:1: rule__Label_declaration_part__Group_2__1 : rule__Label_declaration_part__Group_2__1__Impl ;
    public final void rule__Label_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3993:1: ( rule__Label_declaration_part__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3994:2: rule__Label_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__18050);
            rule__Label_declaration_part__Group_2__1__Impl();

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
    // $ANTLR end "rule__Label_declaration_part__Group_2__1"


    // $ANTLR start "rule__Label_declaration_part__Group_2__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4000:1: rule__Label_declaration_part__Group_2__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4004:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4005:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4005:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4006:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl8077);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Label_declaration_part__Group_2__1__Impl"


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4022:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4026:1: ( ( ruleprogram ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4027:1: ( ruleprogram )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4027:1: ( ruleprogram )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4028:1: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment8115);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 

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
    // $ANTLR end "rule__Pascal__ProgramAssignment"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA8_minS =
        "\1\4\1\6\10\uffff";
    static final String DFA8_maxS =
        "\1\56\1\57\10\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\1\1\6";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\1\2\uffff\1\3\1\5\3\2\6\uffff\1\7\25\uffff\1\6\4\uffff"+
            "\1\4",
            "\2\10\3\uffff\4\10\1\uffff\3\10\2\uffff\1\10\1\uffff\1\10"+
            "\20\uffff\1\10\1\11\2\10\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1087:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pascal__ProgramAssignment_in_rulepascal94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleprogram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__0_in_ruleprogram_heading_block214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleblock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_rulestatement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_statement__Alternatives_in_rulesimple_statement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0_in_ruleassignment_statement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleentire_variable813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindexed_variable_in_entryRuleindexed_variable841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindexed_variable848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__0_in_ruleindexed_variable874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__0_in_ruleexpression_list934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleexpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__0_in_rulesimple_expression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleterm1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Alternatives_in_rulefactor1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_rulenumber1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unsigned_number__Alternatives_in_ruleunsigned_number1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signed_number__Alternatives_in_rulesigned_number1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleset1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__0_in_rulefunction_designator1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structured_statement__Alternatives_in_rulestructured_statement1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__0_in_rulecompound_statement1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repetitive_statement__Alternatives_in_rulerepetitive_statement1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__0_in_rulewhile_statement1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__0_in_rulerepeat_statement1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__0_in_rulefor_statement1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__0_in_rulegoto_statement1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rule__Statement__Alternatives_12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rule__Statement__Alternatives_12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rule__Simple_statement__Alternatives2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rule__Simple_statement__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rule__Simple_statement__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__0_in_rule__Simple_expression__Alternatives_22167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rule__Simple_expression__Alternatives_22185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02220 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02233 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OR_KEYWORD_in_rule__Simple_expression__Alternatives_2_0_02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Factor__Alternatives2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Factor__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Factor__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rule__Factor__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rule__Number__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rule__Number__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rule__Unsigned_number__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rule__Unsigned_number__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rule__Signed_number__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rule__Signed_number__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rule__Structured_statement__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rule__Structured_statement__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rule__Repetitive_statement__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rule__Repetitive_statement__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rule__Repetitive_statement__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TO_KEYWORD_in_rule__For_statement__Alternatives_22701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOWNTO_KEYWORD_in_rule__For_statement__Alternatives_22718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12807 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Program__Group__2__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__02931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__02934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Program_heading_block__Group__0__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12993 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__23052 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__23055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__33113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Program_heading_block__Group__3__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__03180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Program_heading_block__Group_2__0__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__13242 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__23301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Program_heading_block__Group_2__2__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03366 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl3452 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__03487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Identifier_list__Group_1__0__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03609 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__03728 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__03731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__13787 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__23846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__03908 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3994 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__04029 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__04032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Statement_sequence__Group_1__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__14091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__04151 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__04154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_1_in_rule__Statement__Group__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__04273 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__04276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Statement__Group_0__1__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__04395 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__14454 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Assignment_statement__Group__1__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__24516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__0__Impl_in_rule__Indexed_variable__Group__04578 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__1_in_rule__Indexed_variable__Group__04581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Indexed_variable__Group__0__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__1__Impl_in_rule__Indexed_variable__Group__14637 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__2_in_rule__Indexed_variable__Group__14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Indexed_variable__Group__1__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__2__Impl_in_rule__Indexed_variable__Group__24699 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__3_in_rule__Indexed_variable__Group__24702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Indexed_variable__Group__2__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__3__Impl_in_rule__Indexed_variable__Group__34758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Indexed_variable__Group__3__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__0__Impl_in_rule__Expression_list__Group__04825 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__1_in_rule__Expression_list__Group__04828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Expression_list__Group__0__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__1__Impl_in_rule__Expression_list__Group__14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__0_in_rule__Expression_list__Group__1__Impl4911 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__0__Impl_in_rule__Expression_list__Group_1__04946 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__1_in_rule__Expression_list__Group_1__04949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Expression_list__Group_1__0__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__1__Impl_in_rule__Expression_list__Group_1__15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Expression_list__Group_1__1__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05068 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05189 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__05308 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__05311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group__0__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__15370 = new BitSet(new long[]{0x0000000000001CD0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__15373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__25429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_2_in_rule__Simple_expression__Group__2__Impl5456 = new BitSet(new long[]{0x0000000000001CD2L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__0__Impl_in_rule__Simple_expression__Group_2_0__05493 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__1_in_rule__Simple_expression__Group_2_0__05496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_2_0_0_in_rule__Simple_expression__Group_2_0__0__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__1__Impl_in_rule__Simple_expression__Group_2_0__15553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group_2_0__1__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group__0__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl5699 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__05734 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__15793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__05853 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__05856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Factor__Group_6__0__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__15915 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__15918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__25974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Factor__Group_6__2__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__06039 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__06042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06158 = new BitSet(new long[]{0x0000C20000081F70L});
    public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Set__Group__0__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16220 = new BitSet(new long[]{0x0000C20000081F70L});
    public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Set__Group__1__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Set__Group__2__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__06347 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__06350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__16406 = new BitSet(new long[]{0x0000460000081F70L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__2_in_rule__Function_designator__Group__16409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Function_designator__Group__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__2__Impl_in_rule__Function_designator__Group__26468 = new BitSet(new long[]{0x0000460000081F70L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__3_in_rule__Function_designator__Group__26471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Function_designator__Group__2__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__3__Impl_in_rule__Function_designator__Group__36530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Function_designator__Group__3__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__0__Impl_in_rule__Compound_statement__Group__06597 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__1_in_rule__Compound_statement__Group__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Compound_statement__Group__0__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__1__Impl_in_rule__Compound_statement__Group__16656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__2_in_rule__Compound_statement__Group__16659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Compound_statement__Group__1__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__2__Impl_in_rule__Compound_statement__Group__26715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Compound_statement__Group__2__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__0__Impl_in_rule__While_statement__Group__06777 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__While_statement__Group__1_in_rule__While_statement__Group__06780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_KEYWORD_in_rule__While_statement__Group__0__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__1__Impl_in_rule__While_statement__Group__16836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__While_statement__Group__2_in_rule__While_statement__Group__16839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__While_statement__Group__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__2__Impl_in_rule__While_statement__Group__26895 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__While_statement__Group__3_in_rule__While_statement__Group__26898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rule__While_statement__Group__2__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__3__Impl_in_rule__While_statement__Group__36954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__While_statement__Group__3__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__0__Impl_in_rule__Repeat_statement__Group__07018 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__1_in_rule__Repeat_statement__Group__07021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REPEAT_KEYWORD_in_rule__Repeat_statement__Group__0__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__1__Impl_in_rule__Repeat_statement__Group__17077 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__2_in_rule__Repeat_statement__Group__17080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Repeat_statement__Group__1__Impl7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__2__Impl_in_rule__Repeat_statement__Group__27136 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__3_in_rule__Repeat_statement__Group__27139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_KEYWORD_in_rule__Repeat_statement__Group__2__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__3__Impl_in_rule__Repeat_statement__Group__37195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Repeat_statement__Group__3__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__0__Impl_in_rule__For_statement__Group__07259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__For_statement__Group__1_in_rule__For_statement__Group__07262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_KEYWORD_in_rule__For_statement__Group__0__Impl7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__1__Impl_in_rule__For_statement__Group__17318 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__For_statement__Group__2_in_rule__For_statement__Group__17321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rule__For_statement__Group__1__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__2__Impl_in_rule__For_statement__Group__27377 = new BitSet(new long[]{0x0000420000081F70L});
    public static final BitSet FOLLOW_rule__For_statement__Group__3_in_rule__For_statement__Group__27380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Alternatives_2_in_rule__For_statement__Group__2__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__3__Impl_in_rule__For_statement__Group__37437 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__For_statement__Group__4_in_rule__For_statement__Group__37440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__For_statement__Group__3__Impl7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__4__Impl_in_rule__For_statement__Group__47496 = new BitSet(new long[]{0x0000000003508030L});
    public static final BitSet FOLLOW_rule__For_statement__Group__5_in_rule__For_statement__Group__47499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rule__For_statement__Group__4__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__5__Impl_in_rule__For_statement__Group__57555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__For_statement__Group__5__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__0__Impl_in_rule__Goto_statement__Group__07623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__1_in_rule__Goto_statement__Group__07626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GOTO_KEYWORD_in_rule__Goto_statement__Group__0__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__1__Impl_in_rule__Goto_statement__Group__17682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Goto_statement__Group__1__Impl7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__07742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__07745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__17801 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__27860 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__27863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl7890 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__37921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Label_declaration_part__Group__3__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__07988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__07991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Label_declaration_part__Group_2__0__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment8115 = new BitSet(new long[]{0x0000000000000002L});

}