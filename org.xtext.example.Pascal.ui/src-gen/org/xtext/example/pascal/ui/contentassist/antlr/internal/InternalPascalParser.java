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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER_NUMBER", "RULE_IDENTIFIER", "RULE_ADDITION_OPERATOR", "RULE_OR_KEYWORD", "RULE_STRING", "RULE_NIL_KEYWORD", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_TO_KEYWORD", "RULE_DOWNTO_KEYWORD", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_RELATIONAL_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_NOT_KEYWORD", "RULE_WHILE_KEYWORD", "RULE_DO_KEYWORD", "RULE_REPEAT_KEYWORD", "RULE_UNTIL_KEYWORD", "RULE_FOR_KEYWORD", "RULE_IF_KEYWORD", "RULE_THEN_KEYWORD", "RULE_ELSE_KEYWORD", "RULE_CASE_KEYWORD", "RULE_OF_KEYWORD", "RULE_WITH_KEYWORD", "RULE_GOTO_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'('", "')'", "','", "':'", "':='", "'['", "']'"
    };
    public static final int RULE_ID=38;
    public static final int RULE_ANY_OTHER=43;
    public static final int RULE_IF_KEYWORD=25;
    public static final int RULE_ADDITION_OPERATOR=6;
    public static final int EOF=-1;
    public static final int RULE_FOR_KEYWORD=24;
    public static final int RULE_UNTIL_KEYWORD=23;
    public static final int RULE_END_KEYWORD=16;
    public static final int RULE_THEN_KEYWORD=26;
    public static final int RULE_CASE_KEYWORD=28;
    public static final int T__51=51;
    public static final int RULE_REAL_NUMBER=10;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_MULTIPLICATION_OPERATOR=18;
    public static final int RULE_INT=39;
    public static final int RULE_BEGIN_KEYWORD=15;
    public static final int RULE_LETTER_EXTENDED=36;
    public static final int T__50=50;
    public static final int RULE_DOWNTO_KEYWORD=14;
    public static final int RULE_TO_KEYWORD=13;
    public static final int RULE_RELATIONAL_OPERATOR=17;
    public static final int T__46=46;
    public static final int RULE_NIL_KEYWORD=9;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_GOTO_KEYWORD=31;
    public static final int T__48=48;
    public static final int RULE_LABEL_KEYWORD=32;
    public static final int T__49=49;
    public static final int RULE_WHILE_KEYWORD=20;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=33;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_OF_KEYWORD=29;
    public static final int RULE_DO_KEYWORD=21;
    public static final int RULE_WITH_KEYWORD=30;
    public static final int RULE_SL_COMMENT=41;
    public static final int RULE_NOT_KEYWORD=19;
    public static final int RULE_LETTER=37;
    public static final int RULE_ML_COMMENT=40;
    public static final int RULE_STRING=8;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int RULE_REPEAT_KEYWORD=22;
    public static final int RULE_OR_KEYWORD=7;
    public static final int RULE_DIGIT_SEQUENCE=34;
    public static final int RULE_WS=42;
    public static final int RULE_DIGIT=35;
    public static final int RULE_SIGNED_INTEGER_NUMBER=11;
    public static final int RULE_ELSE_KEYWORD=27;
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


    // $ANTLR start "entryRuleconditional_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:902:1: entryRuleconditional_statement : ruleconditional_statement EOF ;
    public final void entryRuleconditional_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:903:1: ( ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:904:1: ruleconditional_statement EOF
            {
             before(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement1861);
            ruleconditional_statement();

            state._fsp--;

             after(grammarAccess.getConditional_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement1868); 

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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:911:1: ruleconditional_statement : ( ( rule__Conditional_statement__Alternatives ) ) ;
    public final void ruleconditional_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:915:2: ( ( ( rule__Conditional_statement__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:916:1: ( ( rule__Conditional_statement__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:916:1: ( ( rule__Conditional_statement__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:917:1: ( rule__Conditional_statement__Alternatives )
            {
             before(grammarAccess.getConditional_statementAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:918:1: ( rule__Conditional_statement__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:918:2: rule__Conditional_statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Conditional_statement__Alternatives_in_ruleconditional_statement1894);
            rule__Conditional_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditional_statementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:930:1: entryRuleif_statement : ruleif_statement EOF ;
    public final void entryRuleif_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:931:1: ( ruleif_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:932:1: ruleif_statement EOF
            {
             before(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement1921);
            ruleif_statement();

            state._fsp--;

             after(grammarAccess.getIf_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement1928); 

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
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:939:1: ruleif_statement : ( ( rule__If_statement__Group__0 ) ) ;
    public final void ruleif_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:943:2: ( ( ( rule__If_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:944:1: ( ( rule__If_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:944:1: ( ( rule__If_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:945:1: ( rule__If_statement__Group__0 )
            {
             before(grammarAccess.getIf_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:946:1: ( rule__If_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:946:2: rule__If_statement__Group__0
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0_in_ruleif_statement1954);
            rule__If_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIf_statementAccess().getGroup()); 

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
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:958:1: entryRulecase_statement : rulecase_statement EOF ;
    public final void entryRulecase_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:959:1: ( rulecase_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:960:1: rulecase_statement EOF
            {
             before(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement1981);
            rulecase_statement();

            state._fsp--;

             after(grammarAccess.getCase_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement1988); 

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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:967:1: rulecase_statement : ( ( rule__Case_statement__Group__0 ) ) ;
    public final void rulecase_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:971:2: ( ( ( rule__Case_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:972:1: ( ( rule__Case_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:972:1: ( ( rule__Case_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:973:1: ( rule__Case_statement__Group__0 )
            {
             before(grammarAccess.getCase_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:1: ( rule__Case_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:2: rule__Case_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__0_in_rulecase_statement2014);
            rule__Case_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getGroup()); 

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
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:986:1: entryRulecase_limb : rulecase_limb EOF ;
    public final void entryRulecase_limb() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:987:1: ( rulecase_limb EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:988:1: rulecase_limb EOF
            {
             before(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb2041);
            rulecase_limb();

            state._fsp--;

             after(grammarAccess.getCase_limbRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb2048); 

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
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:995:1: rulecase_limb : ( ( rule__Case_limb__Group__0 ) ) ;
    public final void rulecase_limb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:999:2: ( ( ( rule__Case_limb__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1000:1: ( ( rule__Case_limb__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1000:1: ( ( rule__Case_limb__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1001:1: ( rule__Case_limb__Group__0 )
            {
             before(grammarAccess.getCase_limbAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1002:1: ( rule__Case_limb__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1002:2: rule__Case_limb__Group__0
            {
            pushFollow(FOLLOW_rule__Case_limb__Group__0_in_rulecase_limb2074);
            rule__Case_limb__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_limbAccess().getGroup()); 

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
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1014:1: entryRulecase_label_list : rulecase_label_list EOF ;
    public final void entryRulecase_label_list() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1015:1: ( rulecase_label_list EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1016:1: rulecase_label_list EOF
            {
             before(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list2101);
            rulecase_label_list();

            state._fsp--;

             after(grammarAccess.getCase_label_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list2108); 

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1023:1: rulecase_label_list : ( ( rule__Case_label_list__Group__0 ) ) ;
    public final void rulecase_label_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1027:2: ( ( ( rule__Case_label_list__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1028:1: ( ( rule__Case_label_list__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1028:1: ( ( rule__Case_label_list__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1029:1: ( rule__Case_label_list__Group__0 )
            {
             before(grammarAccess.getCase_label_listAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1030:1: ( rule__Case_label_list__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1030:2: rule__Case_label_list__Group__0
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__0_in_rulecase_label_list2134);
            rule__Case_label_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_label_listAccess().getGroup()); 

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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1042:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1043:1: ( ruleconstant EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1044:1: ruleconstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant2161);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant2168); 

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1051:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1055:2: ( ( ( rule__Constant__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1056:1: ( ( rule__Constant__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1056:1: ( ( rule__Constant__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1057:1: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1058:1: ( rule__Constant__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1058:2: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_in_ruleconstant2194);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulewith_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1070:1: entryRulewith_statement : rulewith_statement EOF ;
    public final void entryRulewith_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1071:1: ( rulewith_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1072:1: rulewith_statement EOF
            {
             before(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement2221);
            rulewith_statement();

            state._fsp--;

             after(grammarAccess.getWith_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement2228); 

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
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1079:1: rulewith_statement : ( ( rule__With_statement__Group__0 ) ) ;
    public final void rulewith_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1083:2: ( ( ( rule__With_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1084:1: ( ( rule__With_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1084:1: ( ( rule__With_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1085:1: ( rule__With_statement__Group__0 )
            {
             before(grammarAccess.getWith_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1086:1: ( rule__With_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1086:2: rule__With_statement__Group__0
            {
            pushFollow(FOLLOW_rule__With_statement__Group__0_in_rulewith_statement2254);
            rule__With_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWith_statementAccess().getGroup()); 

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
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1098:1: entryRulegoto_statement : rulegoto_statement EOF ;
    public final void entryRulegoto_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1099:1: ( rulegoto_statement EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1100:1: rulegoto_statement EOF
            {
             before(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement2281);
            rulegoto_statement();

            state._fsp--;

             after(grammarAccess.getGoto_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement2288); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1107:1: rulegoto_statement : ( ( rule__Goto_statement__Group__0 ) ) ;
    public final void rulegoto_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1111:2: ( ( ( rule__Goto_statement__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1112:1: ( ( rule__Goto_statement__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1112:1: ( ( rule__Goto_statement__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1113:1: ( rule__Goto_statement__Group__0 )
            {
             before(grammarAccess.getGoto_statementAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1114:1: ( rule__Goto_statement__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1114:2: rule__Goto_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__0_in_rulegoto_statement2314);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1126:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1127:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1128:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part2341);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part2348); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1135:1: ruledeclaration_part : ( ( rulelabel_declaration_part )? ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1139:2: ( ( ( rulelabel_declaration_part )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1140:1: ( ( rulelabel_declaration_part )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1140:1: ( ( rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1141:1: ( rulelabel_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1142:1: ( rulelabel_declaration_part )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LABEL_KEYWORD) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1142:3: rulelabel_declaration_part
                    {
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part2375);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1154:1: entryRulelabel_declaration_part : rulelabel_declaration_part EOF ;
    public final void entryRulelabel_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1155:1: ( rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1156:1: rulelabel_declaration_part EOF
            {
             before(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part2403);
            rulelabel_declaration_part();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part2410); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1163:1: rulelabel_declaration_part : ( ( rule__Label_declaration_part__Group__0 ) ) ;
    public final void rulelabel_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1167:2: ( ( ( rule__Label_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1168:1: ( ( rule__Label_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1168:1: ( ( rule__Label_declaration_part__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1169:1: ( rule__Label_declaration_part__Group__0 )
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1170:1: ( rule__Label_declaration_part__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1170:2: rule__Label_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part2436);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1182:1: rule__Statement__Alternatives_1 : ( ( rulesimple_statement ) | ( rulestructured_statement ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1186:1: ( ( rulesimple_statement ) | ( rulestructured_statement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_IDENTIFIER||LA3_0==RULE_END_KEYWORD||LA3_0==RULE_UNTIL_KEYWORD||LA3_0==RULE_ELSE_KEYWORD||LA3_0==RULE_GOTO_KEYWORD||LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_BEGIN_KEYWORD||LA3_0==RULE_WHILE_KEYWORD||LA3_0==RULE_REPEAT_KEYWORD||(LA3_0>=RULE_FOR_KEYWORD && LA3_0<=RULE_IF_KEYWORD)||LA3_0==RULE_CASE_KEYWORD||LA3_0==RULE_WITH_KEYWORD) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1187:1: ( rulesimple_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1187:1: ( rulesimple_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1188:1: rulesimple_statement
                    {
                     before(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_rulesimple_statement_in_rule__Statement__Alternatives_12472);
                    rulesimple_statement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1193:6: ( rulestructured_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1193:6: ( rulestructured_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1194:1: rulestructured_statement
                    {
                     before(grammarAccess.getStatementAccess().getStructured_statementParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulestructured_statement_in_rule__Statement__Alternatives_12489);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1204:1: rule__Simple_statement__Alternatives : ( ( ruleassignment_statement ) | ( rulefunction_designator ) | ( rulegoto_statement ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1208:1: ( ( ruleassignment_statement ) | ( rulefunction_designator ) | ( rulegoto_statement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENTIFIER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==47) ) {
                    alt4=2;
                }
                else if ( (LA4_1==51) ) {
                    alt4=1;
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1209:1: ( ruleassignment_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1209:1: ( ruleassignment_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1210:1: ruleassignment_statement
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleassignment_statement_in_rule__Simple_statement__Alternatives2521);
                    ruleassignment_statement();

                    state._fsp--;

                     after(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1215:6: ( rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1215:6: ( rulefunction_designator )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1216:1: rulefunction_designator
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulefunction_designator_in_rule__Simple_statement__Alternatives2538);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getSimple_statementAccess().getFunction_designatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1221:6: ( rulegoto_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1221:6: ( rulegoto_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1222:1: rulegoto_statement
                    {
                     before(grammarAccess.getSimple_statementAccess().getGoto_statementParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulegoto_statement_in_rule__Simple_statement__Alternatives2555);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1232:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( rulesigned_number ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1236:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( rulesigned_number ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1237:1: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1237:1: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1238:1: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1239:1: ( rule__Simple_expression__Group_2_0__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1239:2: rule__Simple_expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__0_in_rule__Simple_expression__Alternatives_22587);
                    rule__Simple_expression__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1243:6: ( rulesigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1243:6: ( rulesigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1244:1: rulesigned_number
                    {
                     before(grammarAccess.getSimple_expressionAccess().getSigned_numberParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_rulesigned_number_in_rule__Simple_expression__Alternatives_22605);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1254:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) ) | ( RULE_OR_KEYWORD ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1258:1: ( ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) ) | ( RULE_OR_KEYWORD ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1259:1: ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1259:1: ( ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1260:1: ( ( RULE_ADDITION_OPERATOR ) ) ( ( RULE_ADDITION_OPERATOR )* )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1260:1: ( ( RULE_ADDITION_OPERATOR ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1261:1: ( RULE_ADDITION_OPERATOR )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1262:1: ( RULE_ADDITION_OPERATOR )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1262:3: RULE_ADDITION_OPERATOR
                    {
                    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02640); 

                    }

                     after(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 

                    }

                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1265:1: ( ( RULE_ADDITION_OPERATOR )* )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1266:1: ( RULE_ADDITION_OPERATOR )*
                    {
                     before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_2_0_0_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1267:1: ( RULE_ADDITION_OPERATOR )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ADDITION_OPERATOR) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1267:3: RULE_ADDITION_OPERATOR
                    	    {
                    	    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02653); 

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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1272:6: ( RULE_OR_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1272:6: ( RULE_OR_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1273:1: RULE_OR_KEYWORD
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOR_KEYWORDTerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_OR_KEYWORD,FOLLOW_RULE_OR_KEYWORD_in_rule__Simple_expression__Alternatives_2_0_02674); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1283:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1287:1: ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1288:1: ( rulevariable )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1288:1: ( rulevariable )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1289:1: rulevariable
                    {
                     before(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulevariable_in_rule__Factor__Alternatives2706);
                    rulevariable();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1294:6: ( rulenumber )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1294:6: ( rulenumber )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1295:1: rulenumber
                    {
                     before(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Factor__Alternatives2723);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1300:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1300:6: ( RULE_STRING )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1301:1: RULE_STRING
                    {
                     before(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Factor__Alternatives2740); 
                     after(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1306:6: ( ruleset )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1306:6: ( ruleset )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1307:1: ruleset
                    {
                     before(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleset_in_rule__Factor__Alternatives2757);
                    ruleset();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1312:6: ( RULE_NIL_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1312:6: ( RULE_NIL_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1313:1: RULE_NIL_KEYWORD
                    {
                     before(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                    match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives2774); 
                     after(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1318:6: ( rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1318:6: ( rulefunction_designator )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1319:1: rulefunction_designator
                    {
                     before(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives2791);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1324:6: ( ( rule__Factor__Group_6__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1324:6: ( ( rule__Factor__Group_6__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1325:1: ( rule__Factor__Group_6__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_6()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1326:1: ( rule__Factor__Group_6__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1326:2: rule__Factor__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives2808);
                    rule__Factor__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1330:6: ( ( rule__Factor__Group_7__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1330:6: ( ( rule__Factor__Group_7__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1331:1: ( rule__Factor__Group_7__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_7()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1332:1: ( rule__Factor__Group_7__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1332:2: rule__Factor__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives2826);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1341:1: rule__Number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1345:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1346:1: ( ruleunsigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1346:1: ( ruleunsigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1347:1: ruleunsigned_number
                    {
                     before(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleunsigned_number_in_rule__Number__Alternatives2859);
                    ruleunsigned_number();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getUnsigned_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1352:6: ( rulesigned_number )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1352:6: ( rulesigned_number )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1353:1: rulesigned_number
                    {
                     before(grammarAccess.getNumberAccess().getSigned_numberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulesigned_number_in_rule__Number__Alternatives2876);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1363:1: rule__Unsigned_number__Alternatives : ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1367:1: ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1368:1: ( RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1368:1: ( RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1369:1: RULE_INTEGER_NUMBER
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rule__Unsigned_number__Alternatives2908); 
                     after(grammarAccess.getUnsigned_numberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1374:6: ( RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1374:6: ( RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1375:1: RULE_REAL_NUMBER
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rule__Unsigned_number__Alternatives2925); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1385:1: rule__Signed_number__Alternatives : ( ( RULE_SIGNED_INTEGER_NUMBER ) | ( RULE_SIGNED_REAL_NUMBER ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1389:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) | ( RULE_SIGNED_REAL_NUMBER ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1390:1: ( RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1390:1: ( RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1391:1: RULE_SIGNED_INTEGER_NUMBER
                    {
                     before(grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rule__Signed_number__Alternatives2957); 
                     after(grammarAccess.getSigned_numberAccess().getSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1396:6: ( RULE_SIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1396:6: ( RULE_SIGNED_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1397:1: RULE_SIGNED_REAL_NUMBER
                    {
                     before(grammarAccess.getSigned_numberAccess().getSIGNED_REAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rule__Signed_number__Alternatives2974); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1407:1: rule__Structured_statement__Alternatives : ( ( rulecompound_statement ) | ( rulerepetitive_statement ) | ( ruleconditional_statement ) | ( rulewith_statement ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1411:1: ( ( rulecompound_statement ) | ( rulerepetitive_statement ) | ( ruleconditional_statement ) | ( rulewith_statement ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_BEGIN_KEYWORD:
                {
                alt12=1;
                }
                break;
            case RULE_WHILE_KEYWORD:
            case RULE_REPEAT_KEYWORD:
            case RULE_FOR_KEYWORD:
                {
                alt12=2;
                }
                break;
            case RULE_IF_KEYWORD:
            case RULE_CASE_KEYWORD:
                {
                alt12=3;
                }
                break;
            case RULE_WITH_KEYWORD:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1412:1: ( rulecompound_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1412:1: ( rulecompound_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1413:1: rulecompound_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulecompound_statement_in_rule__Structured_statement__Alternatives3006);
                    rulecompound_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getCompound_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1418:6: ( rulerepetitive_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1418:6: ( rulerepetitive_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1419:1: rulerepetitive_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rule__Structured_statement__Alternatives3023);
                    rulerepetitive_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getRepetitive_statementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1424:6: ( ruleconditional_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1424:6: ( ruleconditional_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1425:1: ruleconditional_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleconditional_statement_in_rule__Structured_statement__Alternatives3040);
                    ruleconditional_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getConditional_statementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1430:6: ( rulewith_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1430:6: ( rulewith_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1431:1: rulewith_statement
                    {
                     before(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulewith_statement_in_rule__Structured_statement__Alternatives3057);
                    rulewith_statement();

                    state._fsp--;

                     after(grammarAccess.getStructured_statementAccess().getWith_statementParserRuleCall_3()); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1441:1: rule__Repetitive_statement__Alternatives : ( ( rulewhile_statement ) | ( rulerepeat_statement ) | ( rulefor_statement ) );
    public final void rule__Repetitive_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1445:1: ( ( rulewhile_statement ) | ( rulerepeat_statement ) | ( rulefor_statement ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1446:1: ( rulewhile_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1446:1: ( rulewhile_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1447:1: rulewhile_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulewhile_statement_in_rule__Repetitive_statement__Alternatives3089);
                    rulewhile_statement();

                    state._fsp--;

                     after(grammarAccess.getRepetitive_statementAccess().getWhile_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1452:6: ( rulerepeat_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1452:6: ( rulerepeat_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1453:1: rulerepeat_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulerepeat_statement_in_rule__Repetitive_statement__Alternatives3106);
                    rulerepeat_statement();

                    state._fsp--;

                     after(grammarAccess.getRepetitive_statementAccess().getRepeat_statementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1458:6: ( rulefor_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1458:6: ( rulefor_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1459:1: rulefor_statement
                    {
                     before(grammarAccess.getRepetitive_statementAccess().getFor_statementParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulefor_statement_in_rule__Repetitive_statement__Alternatives3123);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1469:1: rule__For_statement__Alternatives_2 : ( ( RULE_TO_KEYWORD ) | ( RULE_DOWNTO_KEYWORD ) );
    public final void rule__For_statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1473:1: ( ( RULE_TO_KEYWORD ) | ( RULE_DOWNTO_KEYWORD ) )
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1474:1: ( RULE_TO_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1474:1: ( RULE_TO_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1475:1: RULE_TO_KEYWORD
                    {
                     before(grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 
                    match(input,RULE_TO_KEYWORD,FOLLOW_RULE_TO_KEYWORD_in_rule__For_statement__Alternatives_23155); 
                     after(grammarAccess.getFor_statementAccess().getTO_KEYWORDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1480:6: ( RULE_DOWNTO_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1480:6: ( RULE_DOWNTO_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1481:1: RULE_DOWNTO_KEYWORD
                    {
                     before(grammarAccess.getFor_statementAccess().getDOWNTO_KEYWORDTerminalRuleCall_2_1()); 
                    match(input,RULE_DOWNTO_KEYWORD,FOLLOW_RULE_DOWNTO_KEYWORD_in_rule__For_statement__Alternatives_23172); 
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


    // $ANTLR start "rule__Conditional_statement__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1491:1: rule__Conditional_statement__Alternatives : ( ( ruleif_statement ) | ( rulecase_statement ) );
    public final void rule__Conditional_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1495:1: ( ( ruleif_statement ) | ( rulecase_statement ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IF_KEYWORD) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_CASE_KEYWORD) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1496:1: ( ruleif_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1496:1: ( ruleif_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1497:1: ruleif_statement
                    {
                     before(grammarAccess.getConditional_statementAccess().getIf_statementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleif_statement_in_rule__Conditional_statement__Alternatives3204);
                    ruleif_statement();

                    state._fsp--;

                     after(grammarAccess.getConditional_statementAccess().getIf_statementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1502:6: ( rulecase_statement )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1502:6: ( rulecase_statement )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1503:1: rulecase_statement
                    {
                     before(grammarAccess.getConditional_statementAccess().getCase_statementParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulecase_statement_in_rule__Conditional_statement__Alternatives3221);
                    rulecase_statement();

                    state._fsp--;

                     after(grammarAccess.getConditional_statementAccess().getCase_statementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Conditional_statement__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1513:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( RULE_STRING ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1517:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( RULE_STRING ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INTEGER_NUMBER && LA16_0<=RULE_ADDITION_OPERATOR)||(LA16_0>=RULE_REAL_NUMBER && LA16_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1518:1: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1518:1: ( ( rule__Constant__Group_0__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1519:1: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1520:1: ( rule__Constant__Group_0__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1520:2: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives3253);
                    rule__Constant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1524:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1524:6: ( RULE_STRING )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1525:1: RULE_STRING
                    {
                     before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__Alternatives3271); 
                     after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives_0_1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1535:1: rule__Constant__Alternatives_0_1 : ( ( RULE_IDENTIFIER ) | ( rulenumber ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1539:1: ( ( RULE_IDENTIFIER ) | ( rulenumber ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INTEGER_NUMBER||(LA17_0>=RULE_REAL_NUMBER && LA17_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1540:1: ( RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1540:1: ( RULE_IDENTIFIER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1541:1: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getConstantAccess().getIDENTIFIERTerminalRuleCall_0_1_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Constant__Alternatives_0_13303); 
                     after(grammarAccess.getConstantAccess().getIDENTIFIERTerminalRuleCall_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1546:6: ( rulenumber )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1546:6: ( rulenumber )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1547:1: rulenumber
                    {
                     before(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Constant__Alternatives_0_13320);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getNumberParserRuleCall_0_1_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives_0_1"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1559:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1563:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1564:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03350);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03353);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1571:1: rule__Program__Group__0__Impl : ( ruleprogram_heading_block ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1575:1: ( ( ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1576:1: ( ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1576:1: ( ruleprogram_heading_block )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1577:1: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl3380);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1588:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1592:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1593:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13409);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13412);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1600:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1604:1: ( ( ruleblock ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1605:1: ( ruleblock )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1605:1: ( ruleblock )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1606:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl3439);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1617:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1621:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1622:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__23468);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1628:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1632:1: ( ( '.' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1633:1: ( '.' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1633:1: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1634:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__Program__Group__2__Impl3496); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1653:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1657:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1658:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__03533);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__03536);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1665:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1669:1: ( ( 'program' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1670:1: ( 'program' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1670:1: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1671:1: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Program_heading_block__Group__0__Impl3564); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1684:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1688:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1689:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__13595);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__13598);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1696:1: rule__Program_heading_block__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1700:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1701:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1701:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1702:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl3625); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1713:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1717:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1718:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__23654);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__23657);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1725:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1729:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1730:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1730:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1731:1: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1732:1: ( rule__Program_heading_block__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1732:2: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl3684);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1742:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1746:1: ( rule__Program_heading_block__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1747:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__33715);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1753:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1757:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1758:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1758:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1759:1: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__Program_heading_block__Group__3__Impl3743); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1780:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1784:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1785:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__03782);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__03785);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1792:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1796:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1797:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1797:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1798:1: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__Program_heading_block__Group_2__0__Impl3813); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1811:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1815:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1816:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__13844);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__13847);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1823:1: rule__Program_heading_block__Group_2__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1827:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1828:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1828:1: ( ruleidentifier_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1829:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl3874);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1840:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1844:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1845:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__23903);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1851:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1855:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1856:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1856:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1857:1: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,48,FOLLOW_48_in_rule__Program_heading_block__Group_2__2__Impl3931); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1876:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1880:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1881:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03968);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03971);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1888:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1892:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1893:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1893:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1894:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl3998); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1905:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1909:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1910:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__14027);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1916:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1920:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1921:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1921:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1922:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1923:1: ( rule__Identifier_list__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1923:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl4054);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1937:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1941:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1942:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__04089);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__04092);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1949:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1953:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1954:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1954:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1955:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Identifier_list__Group_1__0__Impl4120); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1968:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1972:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1973:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__14151);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1979:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1983:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1984:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1984:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1985:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl4178); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2000:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2004:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2005:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04211);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04214);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2012:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2016:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2017:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2017:1: ( ruledeclaration_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2018:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl4241);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2029:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2033:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2034:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14270);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2040:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2044:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2045:1: ( rulestatement_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2045:1: ( rulestatement_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2046:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl4297);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2061:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2065:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2066:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__04330);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__04333);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2073:1: rule__Statement_part__Group__0__Impl : ( RULE_BEGIN_KEYWORD ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2077:1: ( ( RULE_BEGIN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2078:1: ( RULE_BEGIN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2078:1: ( RULE_BEGIN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2079:1: RULE_BEGIN_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl4360); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2090:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2094:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2095:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__14389);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__14392);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2102:1: rule__Statement_part__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2106:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2107:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2107:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2108:1: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl4419);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2119:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2123:1: ( rule__Statement_part__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2124:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__24448);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2130:1: rule__Statement_part__Group__2__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2134:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2135:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2135:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2136:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getEND_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl4475); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2153:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2157:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2158:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__04510);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__04513);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2165:1: rule__Statement_sequence__Group__0__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2169:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2170:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2170:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2171:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl4540);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2182:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2186:1: ( rule__Statement_sequence__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2187:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__14569);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2193:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2197:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2198:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2198:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2199:1: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2200:1: ( rule__Statement_sequence__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2200:2: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl4596);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2214:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2218:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2219:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__04631);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__04634);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2226:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2230:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2231:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2231:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2232:1: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Statement_sequence__Group_1__0__Impl4662); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2245:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2249:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2250:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__14693);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2256:1: rule__Statement_sequence__Group_1__1__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2260:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2261:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2261:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2262:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl4720);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2277:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2281:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2282:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__04753);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__04756);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2289:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2293:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2294:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2294:1: ( ( rule__Statement__Group_0__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2295:1: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2296:1: ( rule__Statement__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INTEGER_NUMBER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2296:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl4783);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2306:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2310:1: ( rule__Statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2311:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__14814);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2317:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2321:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2322:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2322:1: ( ( rule__Statement__Alternatives_1 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2323:1: ( rule__Statement__Alternatives_1 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2324:1: ( rule__Statement__Alternatives_1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2324:2: rule__Statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_1_in_rule__Statement__Group__1__Impl4841);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2338:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2342:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2343:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__04875);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__04878);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2350:1: rule__Statement__Group_0__0__Impl : ( rulelabel ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2354:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2355:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2355:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2356:1: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl4905);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2367:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2371:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2372:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14934);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2378:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2382:1: ( ( ':' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2383:1: ( ':' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2383:1: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2384:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,50,FOLLOW_50_in_rule__Statement__Group_0__1__Impl4962); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2401:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2405:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2406:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__04997);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__05000);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2413:1: rule__Assignment_statement__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2417:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2418:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2418:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2419:1: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl5027);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2430:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2434:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2435:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__15056);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__15059);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2442:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2446:1: ( ( ':=' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2447:1: ( ':=' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2447:1: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2448:1: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__Assignment_statement__Group__1__Impl5087); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2461:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2465:1: ( rule__Assignment_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2466:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__25118);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2472:1: rule__Assignment_statement__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2476:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2477:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2477:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2478:1: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl5145);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2495:1: rule__Indexed_variable__Group__0 : rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1 ;
    public final void rule__Indexed_variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2499:1: ( rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2500:2: rule__Indexed_variable__Group__0__Impl rule__Indexed_variable__Group__1
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__0__Impl_in_rule__Indexed_variable__Group__05180);
            rule__Indexed_variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__1_in_rule__Indexed_variable__Group__05183);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2507:1: rule__Indexed_variable__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Indexed_variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2511:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2512:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2512:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2513:1: rulevariable
            {
             before(grammarAccess.getIndexed_variableAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Indexed_variable__Group__0__Impl5210);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2524:1: rule__Indexed_variable__Group__1 : rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2 ;
    public final void rule__Indexed_variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2528:1: ( rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2529:2: rule__Indexed_variable__Group__1__Impl rule__Indexed_variable__Group__2
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__1__Impl_in_rule__Indexed_variable__Group__15239);
            rule__Indexed_variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__2_in_rule__Indexed_variable__Group__15242);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2536:1: rule__Indexed_variable__Group__1__Impl : ( '[' ) ;
    public final void rule__Indexed_variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2540:1: ( ( '[' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2541:1: ( '[' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2541:1: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2542:1: '['
            {
             before(grammarAccess.getIndexed_variableAccess().getLeftSquareBracketKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__Indexed_variable__Group__1__Impl5270); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2555:1: rule__Indexed_variable__Group__2 : rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3 ;
    public final void rule__Indexed_variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2559:1: ( rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2560:2: rule__Indexed_variable__Group__2__Impl rule__Indexed_variable__Group__3
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__2__Impl_in_rule__Indexed_variable__Group__25301);
            rule__Indexed_variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Indexed_variable__Group__3_in_rule__Indexed_variable__Group__25304);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2567:1: rule__Indexed_variable__Group__2__Impl : ( ruleexpression_list ) ;
    public final void rule__Indexed_variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2571:1: ( ( ruleexpression_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2572:1: ( ruleexpression_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2572:1: ( ruleexpression_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2573:1: ruleexpression_list
            {
             before(grammarAccess.getIndexed_variableAccess().getExpression_listParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_list_in_rule__Indexed_variable__Group__2__Impl5331);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2584:1: rule__Indexed_variable__Group__3 : rule__Indexed_variable__Group__3__Impl ;
    public final void rule__Indexed_variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2588:1: ( rule__Indexed_variable__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2589:2: rule__Indexed_variable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Indexed_variable__Group__3__Impl_in_rule__Indexed_variable__Group__35360);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2595:1: rule__Indexed_variable__Group__3__Impl : ( ']' ) ;
    public final void rule__Indexed_variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2599:1: ( ( ']' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2600:1: ( ']' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2600:1: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2601:1: ']'
            {
             before(grammarAccess.getIndexed_variableAccess().getRightSquareBracketKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__Indexed_variable__Group__3__Impl5388); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2622:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2626:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2627:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_rule__Expression_list__Group__0__Impl_in_rule__Expression_list__Group__05427);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression_list__Group__1_in_rule__Expression_list__Group__05430);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2634:1: rule__Expression_list__Group__0__Impl : ( ruleexpression ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2638:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2639:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2639:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2640:1: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Expression_list__Group__0__Impl5457);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2651:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2655:1: ( rule__Expression_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2656:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression_list__Group__1__Impl_in_rule__Expression_list__Group__15486);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2662:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2666:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2667:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2667:1: ( ( rule__Expression_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2668:1: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2669:1: ( rule__Expression_list__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2669:2: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression_list__Group_1__0_in_rule__Expression_list__Group__1__Impl5513);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2683:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2687:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2688:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression_list__Group_1__0__Impl_in_rule__Expression_list__Group_1__05548);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression_list__Group_1__1_in_rule__Expression_list__Group_1__05551);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2695:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2699:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2700:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2700:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2701:1: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Expression_list__Group_1__0__Impl5579); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2714:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2718:1: ( rule__Expression_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2719:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression_list__Group_1__1__Impl_in_rule__Expression_list__Group_1__15610);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2725:1: rule__Expression_list__Group_1__1__Impl : ( ruleexpression ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2729:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2730:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2730:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2731:1: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Expression_list__Group_1__1__Impl5637);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2746:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2750:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2751:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05670);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05673);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2758:1: rule__Expression__Group__0__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2762:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2763:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2763:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2764:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl5700);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2775:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2779:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2780:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15729);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2786:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2790:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2791:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2791:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2792:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2793:1: ( rule__Expression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_RELATIONAL_OPERATOR) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2793:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5756);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2807:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2811:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2812:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05791);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05794);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2819:1: rule__Expression__Group_1__0__Impl : ( RULE_RELATIONAL_OPERATOR ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2823:1: ( ( RULE_RELATIONAL_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2824:1: ( RULE_RELATIONAL_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2824:1: ( RULE_RELATIONAL_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2825:1: RULE_RELATIONAL_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl5821); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2836:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2840:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2841:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15850);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2847:1: rule__Expression__Group_1__1__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2851:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2852:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2852:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2853:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl5877);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2868:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2872:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2873:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__05910);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__05913);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2880:1: rule__Simple_expression__Group__0__Impl : ( ( RULE_ADDITION_OPERATOR )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2884:1: ( ( ( RULE_ADDITION_OPERATOR )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2885:1: ( ( RULE_ADDITION_OPERATOR )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2885:1: ( ( RULE_ADDITION_OPERATOR )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2886:1: ( RULE_ADDITION_OPERATOR )?
            {
             before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2887:1: ( RULE_ADDITION_OPERATOR )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ADDITION_OPERATOR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2887:3: RULE_ADDITION_OPERATOR
                    {
                    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group__0__Impl5941); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2897:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2901:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2902:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__15972);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__15975);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2909:1: rule__Simple_expression__Group__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2913:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2914:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2914:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2915:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl6002);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2926:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2930:1: ( rule__Simple_expression__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2931:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__26031);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2937:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2941:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2942:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2942:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2943:1: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2944:1: ( rule__Simple_expression__Alternatives_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ADDITION_OPERATOR && LA25_0<=RULE_OR_KEYWORD)||(LA25_0>=RULE_SIGNED_INTEGER_NUMBER && LA25_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2944:2: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Simple_expression__Alternatives_2_in_rule__Simple_expression__Group__2__Impl6058);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2960:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2964:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2965:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__0__Impl_in_rule__Simple_expression__Group_2_0__06095);
            rule__Simple_expression__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__1_in_rule__Simple_expression__Group_2_0__06098);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2972:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2976:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2977:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2977:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2978:1: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2979:1: ( rule__Simple_expression__Alternatives_2_0_0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2979:2: rule__Simple_expression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__Simple_expression__Alternatives_2_0_0_in_rule__Simple_expression__Group_2_0__0__Impl6125);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2989:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2993:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2994:2: rule__Simple_expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2_0__1__Impl_in_rule__Simple_expression__Group_2_0__16155);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3000:1: rule__Simple_expression__Group_2_0__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3004:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3005:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3005:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3006:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group_2_0__1__Impl6182);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3021:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3025:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3026:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__06215);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__06218);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3033:1: rule__Term__Group__0__Impl : ( rulefactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3037:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3038:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3038:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3039:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group__0__Impl6245);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3050:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3054:1: ( rule__Term__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3055:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16274);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3061:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3065:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3066:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3066:1: ( ( rule__Term__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3067:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3068:1: ( rule__Term__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3068:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl6301);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3082:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3086:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3087:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__06336);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__06339);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3094:1: rule__Term__Group_1__0__Impl : ( RULE_MULTIPLICATION_OPERATOR ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3098:1: ( ( RULE_MULTIPLICATION_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3099:1: ( RULE_MULTIPLICATION_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3099:1: ( RULE_MULTIPLICATION_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3100:1: RULE_MULTIPLICATION_OPERATOR
            {
             before(grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl6366); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3111:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3115:1: ( rule__Term__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3116:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__16395);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3122:1: rule__Term__Group_1__1__Impl : ( rulefactor ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3126:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3127:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3127:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3128:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl6422);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3143:1: rule__Factor__Group_6__0 : rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 ;
    public final void rule__Factor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3147:1: ( rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3148:2: rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__06455);
            rule__Factor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__06458);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3155:1: rule__Factor__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3159:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3160:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3160:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3161:1: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,47,FOLLOW_47_in_rule__Factor__Group_6__0__Impl6486); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3174:1: rule__Factor__Group_6__1 : rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 ;
    public final void rule__Factor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3178:1: ( rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3179:2: rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__16517);
            rule__Factor__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__16520);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3186:1: rule__Factor__Group_6__1__Impl : ( ruleexpression ) ;
    public final void rule__Factor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3190:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3191:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3191:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3192:1: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl6547);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3203:1: rule__Factor__Group_6__2 : rule__Factor__Group_6__2__Impl ;
    public final void rule__Factor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3207:1: ( rule__Factor__Group_6__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3208:2: rule__Factor__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__26576);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3214:1: rule__Factor__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3218:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3219:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3219:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3220:1: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
            match(input,48,FOLLOW_48_in_rule__Factor__Group_6__2__Impl6604); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3239:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3243:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3244:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__06641);
            rule__Factor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__06644);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3251:1: rule__Factor__Group_7__0__Impl : ( RULE_NOT_KEYWORD ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3255:1: ( ( RULE_NOT_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3256:1: ( RULE_NOT_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3256:1: ( RULE_NOT_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3257:1: RULE_NOT_KEYWORD
            {
             before(grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 
            match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl6671); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3268:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3272:1: ( rule__Factor__Group_7__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3273:2: rule__Factor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__16700);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3279:1: rule__Factor__Group_7__1__Impl : ( rulefactor ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3283:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3284:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3284:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3285:1: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl6727);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3300:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3304:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3305:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06760);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06763);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3312:1: rule__Set__Group__0__Impl : ( '[' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3316:1: ( ( '[' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3317:1: ( '[' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3317:1: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3318:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Set__Group__0__Impl6791); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3331:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3335:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3336:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16822);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16825);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3343:1: rule__Set__Group__1__Impl : ( ( ruleexpression_list )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3347:1: ( ( ( ruleexpression_list )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3348:1: ( ( ruleexpression_list )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3348:1: ( ( ruleexpression_list )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3349:1: ( ruleexpression_list )?
            {
             before(grammarAccess.getSetAccess().getExpression_listParserRuleCall_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3350:1: ( ruleexpression_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_INTEGER_NUMBER && LA27_0<=RULE_ADDITION_OPERATOR)||(LA27_0>=RULE_STRING && LA27_0<=RULE_SIGNED_REAL_NUMBER)||LA27_0==RULE_NOT_KEYWORD||LA27_0==47||LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3350:3: ruleexpression_list
                    {
                    pushFollow(FOLLOW_ruleexpression_list_in_rule__Set__Group__1__Impl6853);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3360:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3364:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3365:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26884);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3371:1: rule__Set__Group__2__Impl : ( ']' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3375:1: ( ( ']' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3376:1: ( ']' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3376:1: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3377:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Set__Group__2__Impl6912); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3396:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3400:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3401:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__06949);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__06952);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3408:1: rule__Function_designator__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3412:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3413:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3413:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3414:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl6979); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3425:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3429:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3430:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__17008);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__2_in_rule__Function_designator__Group__17011);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3437:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3441:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3442:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3442:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3443:1: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__Function_designator__Group__1__Impl7039); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3456:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3460:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3461:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__2__Impl_in_rule__Function_designator__Group__27070);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__3_in_rule__Function_designator__Group__27073);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3468:1: rule__Function_designator__Group__2__Impl : ( ( ruleexpression_list )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3472:1: ( ( ( ruleexpression_list )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3473:1: ( ( ruleexpression_list )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3473:1: ( ( ruleexpression_list )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3474:1: ( ruleexpression_list )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpression_listParserRuleCall_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3475:1: ( ruleexpression_list )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_INTEGER_NUMBER && LA28_0<=RULE_ADDITION_OPERATOR)||(LA28_0>=RULE_STRING && LA28_0<=RULE_SIGNED_REAL_NUMBER)||LA28_0==RULE_NOT_KEYWORD||LA28_0==47||LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3475:3: ruleexpression_list
                    {
                    pushFollow(FOLLOW_ruleexpression_list_in_rule__Function_designator__Group__2__Impl7101);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3485:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3489:1: ( rule__Function_designator__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3490:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__3__Impl_in_rule__Function_designator__Group__37132);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3496:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3500:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3501:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3501:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3502:1: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__Function_designator__Group__3__Impl7160); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3523:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3527:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3528:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__0__Impl_in_rule__Compound_statement__Group__07199);
            rule__Compound_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compound_statement__Group__1_in_rule__Compound_statement__Group__07202);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3535:1: rule__Compound_statement__Group__0__Impl : ( RULE_BEGIN_KEYWORD ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3539:1: ( ( RULE_BEGIN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3540:1: ( RULE_BEGIN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3540:1: ( RULE_BEGIN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3541:1: RULE_BEGIN_KEYWORD
            {
             before(grammarAccess.getCompound_statementAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Compound_statement__Group__0__Impl7229); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3552:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3556:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3557:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__1__Impl_in_rule__Compound_statement__Group__17258);
            rule__Compound_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compound_statement__Group__2_in_rule__Compound_statement__Group__17261);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3564:1: rule__Compound_statement__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3568:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3569:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3569:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3570:1: rulestatement_sequence
            {
             before(grammarAccess.getCompound_statementAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Compound_statement__Group__1__Impl7288);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3581:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3585:1: ( rule__Compound_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3586:2: rule__Compound_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compound_statement__Group__2__Impl_in_rule__Compound_statement__Group__27317);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3592:1: rule__Compound_statement__Group__2__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3596:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3597:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3597:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3598:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getCompound_statementAccess().getEND_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Compound_statement__Group__2__Impl7344); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3615:1: rule__While_statement__Group__0 : rule__While_statement__Group__0__Impl rule__While_statement__Group__1 ;
    public final void rule__While_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3619:1: ( rule__While_statement__Group__0__Impl rule__While_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3620:2: rule__While_statement__Group__0__Impl rule__While_statement__Group__1
            {
            pushFollow(FOLLOW_rule__While_statement__Group__0__Impl_in_rule__While_statement__Group__07379);
            rule__While_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__1_in_rule__While_statement__Group__07382);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3627:1: rule__While_statement__Group__0__Impl : ( RULE_WHILE_KEYWORD ) ;
    public final void rule__While_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3631:1: ( ( RULE_WHILE_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3632:1: ( RULE_WHILE_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3632:1: ( RULE_WHILE_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:1: RULE_WHILE_KEYWORD
            {
             before(grammarAccess.getWhile_statementAccess().getWHILE_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_WHILE_KEYWORD,FOLLOW_RULE_WHILE_KEYWORD_in_rule__While_statement__Group__0__Impl7409); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3644:1: rule__While_statement__Group__1 : rule__While_statement__Group__1__Impl rule__While_statement__Group__2 ;
    public final void rule__While_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3648:1: ( rule__While_statement__Group__1__Impl rule__While_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3649:2: rule__While_statement__Group__1__Impl rule__While_statement__Group__2
            {
            pushFollow(FOLLOW_rule__While_statement__Group__1__Impl_in_rule__While_statement__Group__17438);
            rule__While_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__2_in_rule__While_statement__Group__17441);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3656:1: rule__While_statement__Group__1__Impl : ( ruleexpression ) ;
    public final void rule__While_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3660:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3661:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3661:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3662:1: ruleexpression
            {
             before(grammarAccess.getWhile_statementAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__While_statement__Group__1__Impl7468);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:1: rule__While_statement__Group__2 : rule__While_statement__Group__2__Impl rule__While_statement__Group__3 ;
    public final void rule__While_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:1: ( rule__While_statement__Group__2__Impl rule__While_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3678:2: rule__While_statement__Group__2__Impl rule__While_statement__Group__3
            {
            pushFollow(FOLLOW_rule__While_statement__Group__2__Impl_in_rule__While_statement__Group__27497);
            rule__While_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While_statement__Group__3_in_rule__While_statement__Group__27500);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3685:1: rule__While_statement__Group__2__Impl : ( RULE_DO_KEYWORD ) ;
    public final void rule__While_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3689:1: ( ( RULE_DO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3690:1: ( RULE_DO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3690:1: ( RULE_DO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3691:1: RULE_DO_KEYWORD
            {
             before(grammarAccess.getWhile_statementAccess().getDO_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rule__While_statement__Group__2__Impl7527); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3702:1: rule__While_statement__Group__3 : rule__While_statement__Group__3__Impl ;
    public final void rule__While_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3706:1: ( rule__While_statement__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3707:2: rule__While_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__While_statement__Group__3__Impl_in_rule__While_statement__Group__37556);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3713:1: rule__While_statement__Group__3__Impl : ( rulestatement ) ;
    public final void rule__While_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3717:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3718:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3718:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3719:1: rulestatement
            {
             before(grammarAccess.getWhile_statementAccess().getStatementParserRuleCall_3()); 
            pushFollow(FOLLOW_rulestatement_in_rule__While_statement__Group__3__Impl7583);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3738:1: rule__Repeat_statement__Group__0 : rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1 ;
    public final void rule__Repeat_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3742:1: ( rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3743:2: rule__Repeat_statement__Group__0__Impl rule__Repeat_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__0__Impl_in_rule__Repeat_statement__Group__07620);
            rule__Repeat_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__1_in_rule__Repeat_statement__Group__07623);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3750:1: rule__Repeat_statement__Group__0__Impl : ( RULE_REPEAT_KEYWORD ) ;
    public final void rule__Repeat_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3754:1: ( ( RULE_REPEAT_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3755:1: ( RULE_REPEAT_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3755:1: ( RULE_REPEAT_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3756:1: RULE_REPEAT_KEYWORD
            {
             before(grammarAccess.getRepeat_statementAccess().getREPEAT_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_REPEAT_KEYWORD,FOLLOW_RULE_REPEAT_KEYWORD_in_rule__Repeat_statement__Group__0__Impl7650); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3767:1: rule__Repeat_statement__Group__1 : rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2 ;
    public final void rule__Repeat_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3771:1: ( rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3772:2: rule__Repeat_statement__Group__1__Impl rule__Repeat_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__1__Impl_in_rule__Repeat_statement__Group__17679);
            rule__Repeat_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__2_in_rule__Repeat_statement__Group__17682);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3779:1: rule__Repeat_statement__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Repeat_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3783:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3784:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3784:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3785:1: rulestatement_sequence
            {
             before(grammarAccess.getRepeat_statementAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Repeat_statement__Group__1__Impl7709);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3796:1: rule__Repeat_statement__Group__2 : rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3 ;
    public final void rule__Repeat_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3800:1: ( rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3801:2: rule__Repeat_statement__Group__2__Impl rule__Repeat_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__2__Impl_in_rule__Repeat_statement__Group__27738);
            rule__Repeat_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repeat_statement__Group__3_in_rule__Repeat_statement__Group__27741);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3808:1: rule__Repeat_statement__Group__2__Impl : ( RULE_UNTIL_KEYWORD ) ;
    public final void rule__Repeat_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3812:1: ( ( RULE_UNTIL_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3813:1: ( RULE_UNTIL_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3813:1: ( RULE_UNTIL_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3814:1: RULE_UNTIL_KEYWORD
            {
             before(grammarAccess.getRepeat_statementAccess().getUNTIL_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_UNTIL_KEYWORD,FOLLOW_RULE_UNTIL_KEYWORD_in_rule__Repeat_statement__Group__2__Impl7768); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3825:1: rule__Repeat_statement__Group__3 : rule__Repeat_statement__Group__3__Impl ;
    public final void rule__Repeat_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3829:1: ( rule__Repeat_statement__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3830:2: rule__Repeat_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Repeat_statement__Group__3__Impl_in_rule__Repeat_statement__Group__37797);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3836:1: rule__Repeat_statement__Group__3__Impl : ( ruleexpression ) ;
    public final void rule__Repeat_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3840:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3841:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3841:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3842:1: ruleexpression
            {
             before(grammarAccess.getRepeat_statementAccess().getExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Repeat_statement__Group__3__Impl7824);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3861:1: rule__For_statement__Group__0 : rule__For_statement__Group__0__Impl rule__For_statement__Group__1 ;
    public final void rule__For_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3865:1: ( rule__For_statement__Group__0__Impl rule__For_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3866:2: rule__For_statement__Group__0__Impl rule__For_statement__Group__1
            {
            pushFollow(FOLLOW_rule__For_statement__Group__0__Impl_in_rule__For_statement__Group__07861);
            rule__For_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__1_in_rule__For_statement__Group__07864);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3873:1: rule__For_statement__Group__0__Impl : ( RULE_FOR_KEYWORD ) ;
    public final void rule__For_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3877:1: ( ( RULE_FOR_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3878:1: ( RULE_FOR_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3878:1: ( RULE_FOR_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3879:1: RULE_FOR_KEYWORD
            {
             before(grammarAccess.getFor_statementAccess().getFOR_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_FOR_KEYWORD,FOLLOW_RULE_FOR_KEYWORD_in_rule__For_statement__Group__0__Impl7891); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3890:1: rule__For_statement__Group__1 : rule__For_statement__Group__1__Impl rule__For_statement__Group__2 ;
    public final void rule__For_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3894:1: ( rule__For_statement__Group__1__Impl rule__For_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3895:2: rule__For_statement__Group__1__Impl rule__For_statement__Group__2
            {
            pushFollow(FOLLOW_rule__For_statement__Group__1__Impl_in_rule__For_statement__Group__17920);
            rule__For_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__2_in_rule__For_statement__Group__17923);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3902:1: rule__For_statement__Group__1__Impl : ( ruleassignment_statement ) ;
    public final void rule__For_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3906:1: ( ( ruleassignment_statement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3907:1: ( ruleassignment_statement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3907:1: ( ruleassignment_statement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3908:1: ruleassignment_statement
            {
             before(grammarAccess.getFor_statementAccess().getAssignment_statementParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_rule__For_statement__Group__1__Impl7950);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3919:1: rule__For_statement__Group__2 : rule__For_statement__Group__2__Impl rule__For_statement__Group__3 ;
    public final void rule__For_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3923:1: ( rule__For_statement__Group__2__Impl rule__For_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3924:2: rule__For_statement__Group__2__Impl rule__For_statement__Group__3
            {
            pushFollow(FOLLOW_rule__For_statement__Group__2__Impl_in_rule__For_statement__Group__27979);
            rule__For_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__3_in_rule__For_statement__Group__27982);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3931:1: rule__For_statement__Group__2__Impl : ( ( rule__For_statement__Alternatives_2 ) ) ;
    public final void rule__For_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3935:1: ( ( ( rule__For_statement__Alternatives_2 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3936:1: ( ( rule__For_statement__Alternatives_2 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3936:1: ( ( rule__For_statement__Alternatives_2 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3937:1: ( rule__For_statement__Alternatives_2 )
            {
             before(grammarAccess.getFor_statementAccess().getAlternatives_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3938:1: ( rule__For_statement__Alternatives_2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3938:2: rule__For_statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__For_statement__Alternatives_2_in_rule__For_statement__Group__2__Impl8009);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3948:1: rule__For_statement__Group__3 : rule__For_statement__Group__3__Impl rule__For_statement__Group__4 ;
    public final void rule__For_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3952:1: ( rule__For_statement__Group__3__Impl rule__For_statement__Group__4 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3953:2: rule__For_statement__Group__3__Impl rule__For_statement__Group__4
            {
            pushFollow(FOLLOW_rule__For_statement__Group__3__Impl_in_rule__For_statement__Group__38039);
            rule__For_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__4_in_rule__For_statement__Group__38042);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3960:1: rule__For_statement__Group__3__Impl : ( ruleexpression ) ;
    public final void rule__For_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3964:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3965:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3965:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3966:1: ruleexpression
            {
             before(grammarAccess.getFor_statementAccess().getExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__For_statement__Group__3__Impl8069);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3977:1: rule__For_statement__Group__4 : rule__For_statement__Group__4__Impl rule__For_statement__Group__5 ;
    public final void rule__For_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3981:1: ( rule__For_statement__Group__4__Impl rule__For_statement__Group__5 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3982:2: rule__For_statement__Group__4__Impl rule__For_statement__Group__5
            {
            pushFollow(FOLLOW_rule__For_statement__Group__4__Impl_in_rule__For_statement__Group__48098);
            rule__For_statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For_statement__Group__5_in_rule__For_statement__Group__48101);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3989:1: rule__For_statement__Group__4__Impl : ( RULE_DO_KEYWORD ) ;
    public final void rule__For_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3993:1: ( ( RULE_DO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3994:1: ( RULE_DO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3994:1: ( RULE_DO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3995:1: RULE_DO_KEYWORD
            {
             before(grammarAccess.getFor_statementAccess().getDO_KEYWORDTerminalRuleCall_4()); 
            match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rule__For_statement__Group__4__Impl8128); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4006:1: rule__For_statement__Group__5 : rule__For_statement__Group__5__Impl ;
    public final void rule__For_statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4010:1: ( rule__For_statement__Group__5__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4011:2: rule__For_statement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__For_statement__Group__5__Impl_in_rule__For_statement__Group__58157);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4017:1: rule__For_statement__Group__5__Impl : ( rulestatement ) ;
    public final void rule__For_statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4021:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4022:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4022:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4023:1: rulestatement
            {
             before(grammarAccess.getFor_statementAccess().getStatementParserRuleCall_5()); 
            pushFollow(FOLLOW_rulestatement_in_rule__For_statement__Group__5__Impl8184);
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


    // $ANTLR start "rule__If_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4046:1: rule__If_statement__Group__0 : rule__If_statement__Group__0__Impl rule__If_statement__Group__1 ;
    public final void rule__If_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4050:1: ( rule__If_statement__Group__0__Impl rule__If_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4051:2: rule__If_statement__Group__0__Impl rule__If_statement__Group__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08225);
            rule__If_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08228);
            rule__If_statement__Group__1();

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
    // $ANTLR end "rule__If_statement__Group__0"


    // $ANTLR start "rule__If_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4058:1: rule__If_statement__Group__0__Impl : ( RULE_IF_KEYWORD ) ;
    public final void rule__If_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4062:1: ( ( RULE_IF_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4063:1: ( RULE_IF_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4063:1: ( RULE_IF_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4064:1: RULE_IF_KEYWORD
            {
             before(grammarAccess.getIf_statementAccess().getIF_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_IF_KEYWORD,FOLLOW_RULE_IF_KEYWORD_in_rule__If_statement__Group__0__Impl8255); 
             after(grammarAccess.getIf_statementAccess().getIF_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__If_statement__Group__0__Impl"


    // $ANTLR start "rule__If_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4075:1: rule__If_statement__Group__1 : rule__If_statement__Group__1__Impl rule__If_statement__Group__2 ;
    public final void rule__If_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4079:1: ( rule__If_statement__Group__1__Impl rule__If_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4080:2: rule__If_statement__Group__1__Impl rule__If_statement__Group__2
            {
            pushFollow(FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__18284);
            rule__If_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__18287);
            rule__If_statement__Group__2();

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
    // $ANTLR end "rule__If_statement__Group__1"


    // $ANTLR start "rule__If_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4087:1: rule__If_statement__Group__1__Impl : ( ruleexpression ) ;
    public final void rule__If_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4091:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4092:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4092:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4093:1: ruleexpression
            {
             before(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__If_statement__Group__1__Impl8314);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__If_statement__Group__1__Impl"


    // $ANTLR start "rule__If_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4104:1: rule__If_statement__Group__2 : rule__If_statement__Group__2__Impl rule__If_statement__Group__3 ;
    public final void rule__If_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4108:1: ( rule__If_statement__Group__2__Impl rule__If_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4109:2: rule__If_statement__Group__2__Impl rule__If_statement__Group__3
            {
            pushFollow(FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__28343);
            rule__If_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__28346);
            rule__If_statement__Group__3();

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
    // $ANTLR end "rule__If_statement__Group__2"


    // $ANTLR start "rule__If_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4116:1: rule__If_statement__Group__2__Impl : ( RULE_THEN_KEYWORD ) ;
    public final void rule__If_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4120:1: ( ( RULE_THEN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4121:1: ( RULE_THEN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4121:1: ( RULE_THEN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4122:1: RULE_THEN_KEYWORD
            {
             before(grammarAccess.getIf_statementAccess().getTHEN_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_THEN_KEYWORD,FOLLOW_RULE_THEN_KEYWORD_in_rule__If_statement__Group__2__Impl8373); 
             after(grammarAccess.getIf_statementAccess().getTHEN_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__If_statement__Group__2__Impl"


    // $ANTLR start "rule__If_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4133:1: rule__If_statement__Group__3 : rule__If_statement__Group__3__Impl rule__If_statement__Group__4 ;
    public final void rule__If_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4137:1: ( rule__If_statement__Group__3__Impl rule__If_statement__Group__4 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4138:2: rule__If_statement__Group__3__Impl rule__If_statement__Group__4
            {
            pushFollow(FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__38402);
            rule__If_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_statement__Group__4_in_rule__If_statement__Group__38405);
            rule__If_statement__Group__4();

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
    // $ANTLR end "rule__If_statement__Group__3"


    // $ANTLR start "rule__If_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4145:1: rule__If_statement__Group__3__Impl : ( rulestatement ) ;
    public final void rule__If_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4149:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4150:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4150:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4151:1: rulestatement
            {
             before(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_3()); 
            pushFollow(FOLLOW_rulestatement_in_rule__If_statement__Group__3__Impl8432);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_3()); 

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
    // $ANTLR end "rule__If_statement__Group__3__Impl"


    // $ANTLR start "rule__If_statement__Group__4"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4162:1: rule__If_statement__Group__4 : rule__If_statement__Group__4__Impl ;
    public final void rule__If_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4166:1: ( rule__If_statement__Group__4__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4167:2: rule__If_statement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group__4__Impl_in_rule__If_statement__Group__48461);
            rule__If_statement__Group__4__Impl();

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
    // $ANTLR end "rule__If_statement__Group__4"


    // $ANTLR start "rule__If_statement__Group__4__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4173:1: rule__If_statement__Group__4__Impl : ( ( rule__If_statement__Group_4__0 )? ) ;
    public final void rule__If_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4177:1: ( ( ( rule__If_statement__Group_4__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4178:1: ( ( rule__If_statement__Group_4__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4178:1: ( ( rule__If_statement__Group_4__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4179:1: ( rule__If_statement__Group_4__0 )?
            {
             before(grammarAccess.getIf_statementAccess().getGroup_4()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4180:1: ( rule__If_statement__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ELSE_KEYWORD) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4180:2: rule__If_statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__If_statement__Group_4__0_in_rule__If_statement__Group__4__Impl8488);
                    rule__If_statement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_statementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__If_statement__Group__4__Impl"


    // $ANTLR start "rule__If_statement__Group_4__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4200:1: rule__If_statement__Group_4__0 : rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1 ;
    public final void rule__If_statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4204:1: ( rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4205:2: rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group_4__0__Impl_in_rule__If_statement__Group_4__08529);
            rule__If_statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_statement__Group_4__1_in_rule__If_statement__Group_4__08532);
            rule__If_statement__Group_4__1();

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
    // $ANTLR end "rule__If_statement__Group_4__0"


    // $ANTLR start "rule__If_statement__Group_4__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4212:1: rule__If_statement__Group_4__0__Impl : ( RULE_ELSE_KEYWORD ) ;
    public final void rule__If_statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4216:1: ( ( RULE_ELSE_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4217:1: ( RULE_ELSE_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4217:1: ( RULE_ELSE_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4218:1: RULE_ELSE_KEYWORD
            {
             before(grammarAccess.getIf_statementAccess().getELSE_KEYWORDTerminalRuleCall_4_0()); 
            match(input,RULE_ELSE_KEYWORD,FOLLOW_RULE_ELSE_KEYWORD_in_rule__If_statement__Group_4__0__Impl8559); 
             after(grammarAccess.getIf_statementAccess().getELSE_KEYWORDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__If_statement__Group_4__0__Impl"


    // $ANTLR start "rule__If_statement__Group_4__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4229:1: rule__If_statement__Group_4__1 : rule__If_statement__Group_4__1__Impl ;
    public final void rule__If_statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4233:1: ( rule__If_statement__Group_4__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4234:2: rule__If_statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group_4__1__Impl_in_rule__If_statement__Group_4__18588);
            rule__If_statement__Group_4__1__Impl();

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
    // $ANTLR end "rule__If_statement__Group_4__1"


    // $ANTLR start "rule__If_statement__Group_4__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4240:1: rule__If_statement__Group_4__1__Impl : ( rulestatement ) ;
    public final void rule__If_statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4244:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4245:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4245:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4246:1: rulestatement
            {
             before(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4_1()); 
            pushFollow(FOLLOW_rulestatement_in_rule__If_statement__Group_4__1__Impl8615);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__If_statement__Group_4__1__Impl"


    // $ANTLR start "rule__Case_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4261:1: rule__Case_statement__Group__0 : rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1 ;
    public final void rule__Case_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4265:1: ( rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4266:2: rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__0__Impl_in_rule__Case_statement__Group__08648);
            rule__Case_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__1_in_rule__Case_statement__Group__08651);
            rule__Case_statement__Group__1();

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
    // $ANTLR end "rule__Case_statement__Group__0"


    // $ANTLR start "rule__Case_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4273:1: rule__Case_statement__Group__0__Impl : ( RULE_CASE_KEYWORD ) ;
    public final void rule__Case_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4277:1: ( ( RULE_CASE_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4278:1: ( RULE_CASE_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4278:1: ( RULE_CASE_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4279:1: RULE_CASE_KEYWORD
            {
             before(grammarAccess.getCase_statementAccess().getCASE_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_CASE_KEYWORD,FOLLOW_RULE_CASE_KEYWORD_in_rule__Case_statement__Group__0__Impl8678); 
             after(grammarAccess.getCase_statementAccess().getCASE_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Case_statement__Group__0__Impl"


    // $ANTLR start "rule__Case_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4290:1: rule__Case_statement__Group__1 : rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2 ;
    public final void rule__Case_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4294:1: ( rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4295:2: rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__1__Impl_in_rule__Case_statement__Group__18707);
            rule__Case_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__2_in_rule__Case_statement__Group__18710);
            rule__Case_statement__Group__2();

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
    // $ANTLR end "rule__Case_statement__Group__1"


    // $ANTLR start "rule__Case_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4302:1: rule__Case_statement__Group__1__Impl : ( ruleexpression ) ;
    public final void rule__Case_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4306:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4307:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4307:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4308:1: ruleexpression
            {
             before(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Case_statement__Group__1__Impl8737);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Case_statement__Group__1__Impl"


    // $ANTLR start "rule__Case_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4319:1: rule__Case_statement__Group__2 : rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3 ;
    public final void rule__Case_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4323:1: ( rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4324:2: rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__2__Impl_in_rule__Case_statement__Group__28766);
            rule__Case_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__3_in_rule__Case_statement__Group__28769);
            rule__Case_statement__Group__3();

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
    // $ANTLR end "rule__Case_statement__Group__2"


    // $ANTLR start "rule__Case_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4331:1: rule__Case_statement__Group__2__Impl : ( RULE_OF_KEYWORD ) ;
    public final void rule__Case_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4335:1: ( ( RULE_OF_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4336:1: ( RULE_OF_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4336:1: ( RULE_OF_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4337:1: RULE_OF_KEYWORD
            {
             before(grammarAccess.getCase_statementAccess().getOF_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_OF_KEYWORD,FOLLOW_RULE_OF_KEYWORD_in_rule__Case_statement__Group__2__Impl8796); 
             after(grammarAccess.getCase_statementAccess().getOF_KEYWORDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Case_statement__Group__2__Impl"


    // $ANTLR start "rule__Case_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4348:1: rule__Case_statement__Group__3 : rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4 ;
    public final void rule__Case_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4352:1: ( rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4353:2: rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__3__Impl_in_rule__Case_statement__Group__38825);
            rule__Case_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__4_in_rule__Case_statement__Group__38828);
            rule__Case_statement__Group__4();

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
    // $ANTLR end "rule__Case_statement__Group__3"


    // $ANTLR start "rule__Case_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4360:1: rule__Case_statement__Group__3__Impl : ( rulecase_limb ) ;
    public final void rule__Case_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4364:1: ( ( rulecase_limb ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4365:1: ( rulecase_limb )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4365:1: ( rulecase_limb )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4366:1: rulecase_limb
            {
             before(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_3()); 
            pushFollow(FOLLOW_rulecase_limb_in_rule__Case_statement__Group__3__Impl8855);
            rulecase_limb();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_3()); 

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
    // $ANTLR end "rule__Case_statement__Group__3__Impl"


    // $ANTLR start "rule__Case_statement__Group__4"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4377:1: rule__Case_statement__Group__4 : rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5 ;
    public final void rule__Case_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4381:1: ( rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4382:2: rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__4__Impl_in_rule__Case_statement__Group__48884);
            rule__Case_statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__5_in_rule__Case_statement__Group__48887);
            rule__Case_statement__Group__5();

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
    // $ANTLR end "rule__Case_statement__Group__4"


    // $ANTLR start "rule__Case_statement__Group__4__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4389:1: rule__Case_statement__Group__4__Impl : ( ( rule__Case_statement__Group_4__0 )* ) ;
    public final void rule__Case_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4393:1: ( ( ( rule__Case_statement__Group_4__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4394:1: ( ( rule__Case_statement__Group_4__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4394:1: ( ( rule__Case_statement__Group_4__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4395:1: ( rule__Case_statement__Group_4__0 )*
            {
             before(grammarAccess.getCase_statementAccess().getGroup_4()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4396:1: ( rule__Case_statement__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=RULE_INTEGER_NUMBER && LA30_1<=RULE_ADDITION_OPERATOR)||LA30_1==RULE_STRING||(LA30_1>=RULE_REAL_NUMBER && LA30_1<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4396:2: rule__Case_statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Case_statement__Group_4__0_in_rule__Case_statement__Group__4__Impl8914);
            	    rule__Case_statement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCase_statementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Case_statement__Group__4__Impl"


    // $ANTLR start "rule__Case_statement__Group__5"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4406:1: rule__Case_statement__Group__5 : rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6 ;
    public final void rule__Case_statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4410:1: ( rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4411:2: rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__5__Impl_in_rule__Case_statement__Group__58945);
            rule__Case_statement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group__6_in_rule__Case_statement__Group__58948);
            rule__Case_statement__Group__6();

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
    // $ANTLR end "rule__Case_statement__Group__5"


    // $ANTLR start "rule__Case_statement__Group__5__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4418:1: rule__Case_statement__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Case_statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4422:1: ( ( ( ';' )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4423:1: ( ( ';' )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4423:1: ( ( ';' )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4424:1: ( ';' )?
            {
             before(grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4425:1: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4426:2: ';'
                    {
                    match(input,46,FOLLOW_46_in_rule__Case_statement__Group__5__Impl8977); 

                    }
                    break;

            }

             after(grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Case_statement__Group__5__Impl"


    // $ANTLR start "rule__Case_statement__Group__6"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4437:1: rule__Case_statement__Group__6 : rule__Case_statement__Group__6__Impl ;
    public final void rule__Case_statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4441:1: ( rule__Case_statement__Group__6__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4442:2: rule__Case_statement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Case_statement__Group__6__Impl_in_rule__Case_statement__Group__69010);
            rule__Case_statement__Group__6__Impl();

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
    // $ANTLR end "rule__Case_statement__Group__6"


    // $ANTLR start "rule__Case_statement__Group__6__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4448:1: rule__Case_statement__Group__6__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Case_statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4452:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4453:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4453:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4454:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getCase_statementAccess().getEND_KEYWORDTerminalRuleCall_6()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Case_statement__Group__6__Impl9037); 
             after(grammarAccess.getCase_statementAccess().getEND_KEYWORDTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Case_statement__Group__6__Impl"


    // $ANTLR start "rule__Case_statement__Group_4__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4479:1: rule__Case_statement__Group_4__0 : rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1 ;
    public final void rule__Case_statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4483:1: ( rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4484:2: rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Case_statement__Group_4__0__Impl_in_rule__Case_statement__Group_4__09080);
            rule__Case_statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_statement__Group_4__1_in_rule__Case_statement__Group_4__09083);
            rule__Case_statement__Group_4__1();

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
    // $ANTLR end "rule__Case_statement__Group_4__0"


    // $ANTLR start "rule__Case_statement__Group_4__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4491:1: rule__Case_statement__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Case_statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4495:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4496:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4496:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4497:1: ';'
            {
             before(grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 
            match(input,46,FOLLOW_46_in_rule__Case_statement__Group_4__0__Impl9111); 
             after(grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 

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
    // $ANTLR end "rule__Case_statement__Group_4__0__Impl"


    // $ANTLR start "rule__Case_statement__Group_4__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4510:1: rule__Case_statement__Group_4__1 : rule__Case_statement__Group_4__1__Impl ;
    public final void rule__Case_statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4514:1: ( rule__Case_statement__Group_4__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4515:2: rule__Case_statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Case_statement__Group_4__1__Impl_in_rule__Case_statement__Group_4__19142);
            rule__Case_statement__Group_4__1__Impl();

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
    // $ANTLR end "rule__Case_statement__Group_4__1"


    // $ANTLR start "rule__Case_statement__Group_4__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4521:1: rule__Case_statement__Group_4__1__Impl : ( rulecase_limb ) ;
    public final void rule__Case_statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4525:1: ( ( rulecase_limb ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4526:1: ( rulecase_limb )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4526:1: ( rulecase_limb )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4527:1: rulecase_limb
            {
             before(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_4_1()); 
            pushFollow(FOLLOW_rulecase_limb_in_rule__Case_statement__Group_4__1__Impl9169);
            rulecase_limb();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getCase_limbParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Case_statement__Group_4__1__Impl"


    // $ANTLR start "rule__Case_limb__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4542:1: rule__Case_limb__Group__0 : rule__Case_limb__Group__0__Impl rule__Case_limb__Group__1 ;
    public final void rule__Case_limb__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4546:1: ( rule__Case_limb__Group__0__Impl rule__Case_limb__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4547:2: rule__Case_limb__Group__0__Impl rule__Case_limb__Group__1
            {
            pushFollow(FOLLOW_rule__Case_limb__Group__0__Impl_in_rule__Case_limb__Group__09202);
            rule__Case_limb__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_limb__Group__1_in_rule__Case_limb__Group__09205);
            rule__Case_limb__Group__1();

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
    // $ANTLR end "rule__Case_limb__Group__0"


    // $ANTLR start "rule__Case_limb__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4554:1: rule__Case_limb__Group__0__Impl : ( rulecase_label_list ) ;
    public final void rule__Case_limb__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4558:1: ( ( rulecase_label_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4559:1: ( rulecase_label_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4559:1: ( rulecase_label_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4560:1: rulecase_label_list
            {
             before(grammarAccess.getCase_limbAccess().getCase_label_listParserRuleCall_0()); 
            pushFollow(FOLLOW_rulecase_label_list_in_rule__Case_limb__Group__0__Impl9232);
            rulecase_label_list();

            state._fsp--;

             after(grammarAccess.getCase_limbAccess().getCase_label_listParserRuleCall_0()); 

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
    // $ANTLR end "rule__Case_limb__Group__0__Impl"


    // $ANTLR start "rule__Case_limb__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4571:1: rule__Case_limb__Group__1 : rule__Case_limb__Group__1__Impl rule__Case_limb__Group__2 ;
    public final void rule__Case_limb__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4575:1: ( rule__Case_limb__Group__1__Impl rule__Case_limb__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4576:2: rule__Case_limb__Group__1__Impl rule__Case_limb__Group__2
            {
            pushFollow(FOLLOW_rule__Case_limb__Group__1__Impl_in_rule__Case_limb__Group__19261);
            rule__Case_limb__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_limb__Group__2_in_rule__Case_limb__Group__19264);
            rule__Case_limb__Group__2();

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
    // $ANTLR end "rule__Case_limb__Group__1"


    // $ANTLR start "rule__Case_limb__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4583:1: rule__Case_limb__Group__1__Impl : ( ':' ) ;
    public final void rule__Case_limb__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4587:1: ( ( ':' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4588:1: ( ':' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4588:1: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4589:1: ':'
            {
             before(grammarAccess.getCase_limbAccess().getColonKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__Case_limb__Group__1__Impl9292); 
             after(grammarAccess.getCase_limbAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Case_limb__Group__1__Impl"


    // $ANTLR start "rule__Case_limb__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4602:1: rule__Case_limb__Group__2 : rule__Case_limb__Group__2__Impl ;
    public final void rule__Case_limb__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4606:1: ( rule__Case_limb__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4607:2: rule__Case_limb__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Case_limb__Group__2__Impl_in_rule__Case_limb__Group__29323);
            rule__Case_limb__Group__2__Impl();

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
    // $ANTLR end "rule__Case_limb__Group__2"


    // $ANTLR start "rule__Case_limb__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4613:1: rule__Case_limb__Group__2__Impl : ( rulestatement ) ;
    public final void rule__Case_limb__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4617:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4618:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4618:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4619:1: rulestatement
            {
             before(grammarAccess.getCase_limbAccess().getStatementParserRuleCall_2()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Case_limb__Group__2__Impl9350);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getCase_limbAccess().getStatementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Case_limb__Group__2__Impl"


    // $ANTLR start "rule__Case_label_list__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4636:1: rule__Case_label_list__Group__0 : rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 ;
    public final void rule__Case_label_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4640:1: ( rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4641:2: rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__0__Impl_in_rule__Case_label_list__Group__09385);
            rule__Case_label_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_label_list__Group__1_in_rule__Case_label_list__Group__09388);
            rule__Case_label_list__Group__1();

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
    // $ANTLR end "rule__Case_label_list__Group__0"


    // $ANTLR start "rule__Case_label_list__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4648:1: rule__Case_label_list__Group__0__Impl : ( ruleconstant ) ;
    public final void rule__Case_label_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4652:1: ( ( ruleconstant ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4653:1: ( ruleconstant )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4653:1: ( ruleconstant )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4654:1: ruleconstant
            {
             before(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleconstant_in_rule__Case_label_list__Group__0__Impl9415);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_0()); 

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
    // $ANTLR end "rule__Case_label_list__Group__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4665:1: rule__Case_label_list__Group__1 : rule__Case_label_list__Group__1__Impl ;
    public final void rule__Case_label_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4669:1: ( rule__Case_label_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4670:2: rule__Case_label_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group__1__Impl_in_rule__Case_label_list__Group__19444);
            rule__Case_label_list__Group__1__Impl();

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
    // $ANTLR end "rule__Case_label_list__Group__1"


    // $ANTLR start "rule__Case_label_list__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4676:1: rule__Case_label_list__Group__1__Impl : ( ( rule__Case_label_list__Group_1__0 )* ) ;
    public final void rule__Case_label_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4680:1: ( ( ( rule__Case_label_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4681:1: ( ( rule__Case_label_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4681:1: ( ( rule__Case_label_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4682:1: ( rule__Case_label_list__Group_1__0 )*
            {
             before(grammarAccess.getCase_label_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4683:1: ( rule__Case_label_list__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4683:2: rule__Case_label_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Case_label_list__Group_1__0_in_rule__Case_label_list__Group__1__Impl9471);
            	    rule__Case_label_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCase_label_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Case_label_list__Group__1__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4697:1: rule__Case_label_list__Group_1__0 : rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 ;
    public final void rule__Case_label_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4701:1: ( rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4702:2: rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group_1__0__Impl_in_rule__Case_label_list__Group_1__09506);
            rule__Case_label_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case_label_list__Group_1__1_in_rule__Case_label_list__Group_1__09509);
            rule__Case_label_list__Group_1__1();

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
    // $ANTLR end "rule__Case_label_list__Group_1__0"


    // $ANTLR start "rule__Case_label_list__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4709:1: rule__Case_label_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Case_label_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4713:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4714:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4714:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4715:1: ','
            {
             before(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Case_label_list__Group_1__0__Impl9537); 
             after(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Case_label_list__Group_1__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4728:1: rule__Case_label_list__Group_1__1 : rule__Case_label_list__Group_1__1__Impl ;
    public final void rule__Case_label_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4732:1: ( rule__Case_label_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4733:2: rule__Case_label_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Case_label_list__Group_1__1__Impl_in_rule__Case_label_list__Group_1__19568);
            rule__Case_label_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Case_label_list__Group_1__1"


    // $ANTLR start "rule__Case_label_list__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4739:1: rule__Case_label_list__Group_1__1__Impl : ( ruleconstant ) ;
    public final void rule__Case_label_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4743:1: ( ( ruleconstant ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4744:1: ( ruleconstant )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4744:1: ( ruleconstant )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4745:1: ruleconstant
            {
             before(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleconstant_in_rule__Case_label_list__Group_1__1__Impl9595);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getCase_label_listAccess().getConstantParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Case_label_list__Group_1__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4760:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4764:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4765:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09628);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09631);
            rule__Constant__Group_0__1();

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
    // $ANTLR end "rule__Constant__Group_0__0"


    // $ANTLR start "rule__Constant__Group_0__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4772:1: rule__Constant__Group_0__0__Impl : ( ( RULE_ADDITION_OPERATOR )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4776:1: ( ( ( RULE_ADDITION_OPERATOR )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4777:1: ( ( RULE_ADDITION_OPERATOR )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4777:1: ( ( RULE_ADDITION_OPERATOR )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4778:1: ( RULE_ADDITION_OPERATOR )?
            {
             before(grammarAccess.getConstantAccess().getADDITION_OPERATORTerminalRuleCall_0_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4779:1: ( RULE_ADDITION_OPERATOR )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ADDITION_OPERATOR) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4779:3: RULE_ADDITION_OPERATOR
                    {
                    match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Constant__Group_0__0__Impl9659); 

                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getADDITION_OPERATORTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4789:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4793:1: ( rule__Constant__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4794:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19690);
            rule__Constant__Group_0__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_0__1"


    // $ANTLR start "rule__Constant__Group_0__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4800:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4804:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4805:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4805:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4806:1: ( rule__Constant__Alternatives_0_1 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4807:1: ( rule__Constant__Alternatives_0_1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4807:2: rule__Constant__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_0_1_in_rule__Constant__Group_0__1__Impl9717);
            rule__Constant__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__With_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4821:1: rule__With_statement__Group__0 : rule__With_statement__Group__0__Impl rule__With_statement__Group__1 ;
    public final void rule__With_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4825:1: ( rule__With_statement__Group__0__Impl rule__With_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4826:2: rule__With_statement__Group__0__Impl rule__With_statement__Group__1
            {
            pushFollow(FOLLOW_rule__With_statement__Group__0__Impl_in_rule__With_statement__Group__09751);
            rule__With_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__With_statement__Group__1_in_rule__With_statement__Group__09754);
            rule__With_statement__Group__1();

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
    // $ANTLR end "rule__With_statement__Group__0"


    // $ANTLR start "rule__With_statement__Group__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4833:1: rule__With_statement__Group__0__Impl : ( RULE_WITH_KEYWORD ) ;
    public final void rule__With_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4837:1: ( ( RULE_WITH_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4838:1: ( RULE_WITH_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4838:1: ( RULE_WITH_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4839:1: RULE_WITH_KEYWORD
            {
             before(grammarAccess.getWith_statementAccess().getWITH_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_WITH_KEYWORD,FOLLOW_RULE_WITH_KEYWORD_in_rule__With_statement__Group__0__Impl9781); 
             after(grammarAccess.getWith_statementAccess().getWITH_KEYWORDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__With_statement__Group__0__Impl"


    // $ANTLR start "rule__With_statement__Group__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4850:1: rule__With_statement__Group__1 : rule__With_statement__Group__1__Impl rule__With_statement__Group__2 ;
    public final void rule__With_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4854:1: ( rule__With_statement__Group__1__Impl rule__With_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4855:2: rule__With_statement__Group__1__Impl rule__With_statement__Group__2
            {
            pushFollow(FOLLOW_rule__With_statement__Group__1__Impl_in_rule__With_statement__Group__19810);
            rule__With_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__With_statement__Group__2_in_rule__With_statement__Group__19813);
            rule__With_statement__Group__2();

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
    // $ANTLR end "rule__With_statement__Group__1"


    // $ANTLR start "rule__With_statement__Group__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4862:1: rule__With_statement__Group__1__Impl : ( rulevariable ) ;
    public final void rule__With_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4866:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4867:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4867:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4868:1: rulevariable
            {
             before(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_1()); 
            pushFollow(FOLLOW_rulevariable_in_rule__With_statement__Group__1__Impl9840);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__With_statement__Group__1__Impl"


    // $ANTLR start "rule__With_statement__Group__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4879:1: rule__With_statement__Group__2 : rule__With_statement__Group__2__Impl rule__With_statement__Group__3 ;
    public final void rule__With_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4883:1: ( rule__With_statement__Group__2__Impl rule__With_statement__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4884:2: rule__With_statement__Group__2__Impl rule__With_statement__Group__3
            {
            pushFollow(FOLLOW_rule__With_statement__Group__2__Impl_in_rule__With_statement__Group__29869);
            rule__With_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__With_statement__Group__3_in_rule__With_statement__Group__29872);
            rule__With_statement__Group__3();

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
    // $ANTLR end "rule__With_statement__Group__2"


    // $ANTLR start "rule__With_statement__Group__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4891:1: rule__With_statement__Group__2__Impl : ( ( rule__With_statement__Group_2__0 )* ) ;
    public final void rule__With_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4895:1: ( ( ( rule__With_statement__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4896:1: ( ( rule__With_statement__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4896:1: ( ( rule__With_statement__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4897:1: ( rule__With_statement__Group_2__0 )*
            {
             before(grammarAccess.getWith_statementAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4898:1: ( rule__With_statement__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4898:2: rule__With_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__With_statement__Group_2__0_in_rule__With_statement__Group__2__Impl9899);
            	    rule__With_statement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getWith_statementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__With_statement__Group__2__Impl"


    // $ANTLR start "rule__With_statement__Group__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4908:1: rule__With_statement__Group__3 : rule__With_statement__Group__3__Impl rule__With_statement__Group__4 ;
    public final void rule__With_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4912:1: ( rule__With_statement__Group__3__Impl rule__With_statement__Group__4 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4913:2: rule__With_statement__Group__3__Impl rule__With_statement__Group__4
            {
            pushFollow(FOLLOW_rule__With_statement__Group__3__Impl_in_rule__With_statement__Group__39930);
            rule__With_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__With_statement__Group__4_in_rule__With_statement__Group__39933);
            rule__With_statement__Group__4();

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
    // $ANTLR end "rule__With_statement__Group__3"


    // $ANTLR start "rule__With_statement__Group__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4920:1: rule__With_statement__Group__3__Impl : ( RULE_DO_KEYWORD ) ;
    public final void rule__With_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4924:1: ( ( RULE_DO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4925:1: ( RULE_DO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4925:1: ( RULE_DO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4926:1: RULE_DO_KEYWORD
            {
             before(grammarAccess.getWith_statementAccess().getDO_KEYWORDTerminalRuleCall_3()); 
            match(input,RULE_DO_KEYWORD,FOLLOW_RULE_DO_KEYWORD_in_rule__With_statement__Group__3__Impl9960); 
             after(grammarAccess.getWith_statementAccess().getDO_KEYWORDTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__With_statement__Group__3__Impl"


    // $ANTLR start "rule__With_statement__Group__4"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4937:1: rule__With_statement__Group__4 : rule__With_statement__Group__4__Impl ;
    public final void rule__With_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4941:1: ( rule__With_statement__Group__4__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4942:2: rule__With_statement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__With_statement__Group__4__Impl_in_rule__With_statement__Group__49989);
            rule__With_statement__Group__4__Impl();

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
    // $ANTLR end "rule__With_statement__Group__4"


    // $ANTLR start "rule__With_statement__Group__4__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4948:1: rule__With_statement__Group__4__Impl : ( rulestatement ) ;
    public final void rule__With_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4952:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4953:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4953:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4954:1: rulestatement
            {
             before(grammarAccess.getWith_statementAccess().getStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_rulestatement_in_rule__With_statement__Group__4__Impl10016);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getWith_statementAccess().getStatementParserRuleCall_4()); 

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
    // $ANTLR end "rule__With_statement__Group__4__Impl"


    // $ANTLR start "rule__With_statement__Group_2__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4975:1: rule__With_statement__Group_2__0 : rule__With_statement__Group_2__0__Impl rule__With_statement__Group_2__1 ;
    public final void rule__With_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4979:1: ( rule__With_statement__Group_2__0__Impl rule__With_statement__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4980:2: rule__With_statement__Group_2__0__Impl rule__With_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__With_statement__Group_2__0__Impl_in_rule__With_statement__Group_2__010055);
            rule__With_statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__With_statement__Group_2__1_in_rule__With_statement__Group_2__010058);
            rule__With_statement__Group_2__1();

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
    // $ANTLR end "rule__With_statement__Group_2__0"


    // $ANTLR start "rule__With_statement__Group_2__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4987:1: rule__With_statement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__With_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4991:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4992:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4992:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:4993:1: ','
            {
             before(grammarAccess.getWith_statementAccess().getCommaKeyword_2_0()); 
            match(input,49,FOLLOW_49_in_rule__With_statement__Group_2__0__Impl10086); 
             after(grammarAccess.getWith_statementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__With_statement__Group_2__0__Impl"


    // $ANTLR start "rule__With_statement__Group_2__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5006:1: rule__With_statement__Group_2__1 : rule__With_statement__Group_2__1__Impl ;
    public final void rule__With_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5010:1: ( rule__With_statement__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5011:2: rule__With_statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__With_statement__Group_2__1__Impl_in_rule__With_statement__Group_2__110117);
            rule__With_statement__Group_2__1__Impl();

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
    // $ANTLR end "rule__With_statement__Group_2__1"


    // $ANTLR start "rule__With_statement__Group_2__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5017:1: rule__With_statement__Group_2__1__Impl : ( rulevariable ) ;
    public final void rule__With_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5021:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5022:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5022:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5023:1: rulevariable
            {
             before(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulevariable_in_rule__With_statement__Group_2__1__Impl10144);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getWith_statementAccess().getVariableParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__With_statement__Group_2__1__Impl"


    // $ANTLR start "rule__Goto_statement__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5038:1: rule__Goto_statement__Group__0 : rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1 ;
    public final void rule__Goto_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5042:1: ( rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5043:2: rule__Goto_statement__Group__0__Impl rule__Goto_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__0__Impl_in_rule__Goto_statement__Group__010177);
            rule__Goto_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goto_statement__Group__1_in_rule__Goto_statement__Group__010180);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5050:1: rule__Goto_statement__Group__0__Impl : ( RULE_GOTO_KEYWORD ) ;
    public final void rule__Goto_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5054:1: ( ( RULE_GOTO_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5055:1: ( RULE_GOTO_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5055:1: ( RULE_GOTO_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5056:1: RULE_GOTO_KEYWORD
            {
             before(grammarAccess.getGoto_statementAccess().getGOTO_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_GOTO_KEYWORD,FOLLOW_RULE_GOTO_KEYWORD_in_rule__Goto_statement__Group__0__Impl10207); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5067:1: rule__Goto_statement__Group__1 : rule__Goto_statement__Group__1__Impl ;
    public final void rule__Goto_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5071:1: ( rule__Goto_statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5072:2: rule__Goto_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Goto_statement__Group__1__Impl_in_rule__Goto_statement__Group__110236);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5078:1: rule__Goto_statement__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Goto_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5082:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5083:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5083:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5084:1: rulelabel
            {
             before(grammarAccess.getGoto_statementAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Goto_statement__Group__1__Impl10263);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5099:1: rule__Label_declaration_part__Group__0 : rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 ;
    public final void rule__Label_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5103:1: ( rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5104:2: rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__010296);
            rule__Label_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__010299);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5111:1: rule__Label_declaration_part__Group__0__Impl : ( RULE_LABEL_KEYWORD ) ;
    public final void rule__Label_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5115:1: ( ( RULE_LABEL_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5116:1: ( RULE_LABEL_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5116:1: ( RULE_LABEL_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5117:1: RULE_LABEL_KEYWORD
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl10326); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5128:1: rule__Label_declaration_part__Group__1 : rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 ;
    public final void rule__Label_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5132:1: ( rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5133:2: rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__110355);
            rule__Label_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__110358);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5140:1: rule__Label_declaration_part__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5144:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5145:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5145:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5146:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl10385);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5157:1: rule__Label_declaration_part__Group__2 : rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 ;
    public final void rule__Label_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5161:1: ( rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5162:2: rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__210414);
            rule__Label_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__210417);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5169:1: rule__Label_declaration_part__Group__2__Impl : ( ( rule__Label_declaration_part__Group_2__0 )* ) ;
    public final void rule__Label_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5173:1: ( ( ( rule__Label_declaration_part__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5174:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5174:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5175:1: ( rule__Label_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5176:1: ( rule__Label_declaration_part__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==49) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5176:2: rule__Label_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl10444);
            	    rule__Label_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5186:1: rule__Label_declaration_part__Group__3 : rule__Label_declaration_part__Group__3__Impl ;
    public final void rule__Label_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5190:1: ( rule__Label_declaration_part__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5191:2: rule__Label_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__310475);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5197:1: rule__Label_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5201:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5202:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5202:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5203:1: ';'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__Label_declaration_part__Group__3__Impl10503); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5224:1: rule__Label_declaration_part__Group_2__0 : rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 ;
    public final void rule__Label_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5228:1: ( rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5229:2: rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__010542);
            rule__Label_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__010545);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5236:1: rule__Label_declaration_part__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5240:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5241:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5241:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5242:1: ','
            {
             before(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            match(input,49,FOLLOW_49_in_rule__Label_declaration_part__Group_2__0__Impl10573); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5255:1: rule__Label_declaration_part__Group_2__1 : rule__Label_declaration_part__Group_2__1__Impl ;
    public final void rule__Label_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5259:1: ( rule__Label_declaration_part__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5260:2: rule__Label_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__110604);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5266:1: rule__Label_declaration_part__Group_2__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5270:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5271:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5271:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5272:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl10631);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5288:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5292:1: ( ( ruleprogram ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5293:1: ( ruleprogram )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5293:1: ( ruleprogram )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:5294:1: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment10669);
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
        "\1\64\1\65\10\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\1\1\6";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\1\2\uffff\1\3\1\5\3\2\6\uffff\1\7\33\uffff\1\6\4\uffff"+
            "\1\4",
            "\2\10\3\uffff\4\10\1\uffff\3\10\2\uffff\1\10\1\uffff\1\10"+
            "\2\uffff\2\10\1\uffff\1\10\20\uffff\1\10\1\11\2\10\3\uffff\1"+
            "\10",
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
            return "1283:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional_statement__Alternatives_in_ruleconditional_statement1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0_in_ruleif_statement1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__0_in_rulecase_statement2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__0_in_rulecase_limb2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__0_in_rulecase_label_list2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_in_ruleconstant2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__0_in_rulewith_statement2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__0_in_rulegoto_statement2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rule__Statement__Alternatives_12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rule__Statement__Alternatives_12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rule__Simple_statement__Alternatives2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rule__Simple_statement__Alternatives2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rule__Simple_statement__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__0_in_rule__Simple_expression__Alternatives_22587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rule__Simple_expression__Alternatives_22605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02640 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Alternatives_2_0_02653 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OR_KEYWORD_in_rule__Simple_expression__Alternatives_2_0_02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Factor__Alternatives2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Factor__Alternatives2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Factor__Alternatives2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rule__Factor__Alternatives2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_rule__Number__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rule__Number__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rule__Unsigned_number__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rule__Unsigned_number__Alternatives2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rule__Signed_number__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rule__Signed_number__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rule__Structured_statement__Alternatives3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rule__Structured_statement__Alternatives3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rule__Structured_statement__Alternatives3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rule__Structured_statement__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rule__Repetitive_statement__Alternatives3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rule__Repetitive_statement__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rule__Repetitive_statement__Alternatives3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TO_KEYWORD_in_rule__For_statement__Alternatives_23155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOWNTO_KEYWORD_in_rule__For_statement__Alternatives_23172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_rule__Conditional_statement__Alternatives3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_rule__Conditional_statement__Alternatives3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__Alternatives3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Constant__Alternatives_0_13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Constant__Alternatives_0_13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__03350 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__03353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__13409 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__23468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Program__Group__2__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__03533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__03536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Program_heading_block__Group__0__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__13595 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__13598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__23654 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__23657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__33715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Program_heading_block__Group__3__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__03782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Program_heading_block__Group_2__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__13844 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__23903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Program_heading_block__Group_2__2__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__03968 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__03971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__14027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl4054 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__04089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__04092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Identifier_list__Group_1__0__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__14151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04211 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__04330 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__14389 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__14392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__04510 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__04513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__14569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl4596 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__04631 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__04634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Statement_sequence__Group_1__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__14693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__04753 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__04756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__14814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_1_in_rule__Statement__Group__1__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__04875 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Statement__Group_0__1__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__04997 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__05000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__15056 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__15059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Assignment_statement__Group__1__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__25118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__0__Impl_in_rule__Indexed_variable__Group__05180 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__1_in_rule__Indexed_variable__Group__05183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Indexed_variable__Group__0__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__1__Impl_in_rule__Indexed_variable__Group__15239 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__2_in_rule__Indexed_variable__Group__15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Indexed_variable__Group__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__2__Impl_in_rule__Indexed_variable__Group__25301 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__3_in_rule__Indexed_variable__Group__25304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Indexed_variable__Group__2__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Indexed_variable__Group__3__Impl_in_rule__Indexed_variable__Group__35360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Indexed_variable__Group__3__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__0__Impl_in_rule__Expression_list__Group__05427 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__1_in_rule__Expression_list__Group__05430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Expression_list__Group__0__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group__1__Impl_in_rule__Expression_list__Group__15486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__0_in_rule__Expression_list__Group__1__Impl5513 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__0__Impl_in_rule__Expression_list__Group_1__05548 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__1_in_rule__Expression_list__Group_1__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Expression_list__Group_1__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression_list__Group_1__1__Impl_in_rule__Expression_list__Group_1__15610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Expression_list__Group_1__1__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05670 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05791 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__05910 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__05913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group__0__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__15972 = new BitSet(new long[]{0x0000000000001CD0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__15975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__26031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_2_in_rule__Simple_expression__Group__2__Impl6058 = new BitSet(new long[]{0x0000000000001CD2L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__0__Impl_in_rule__Simple_expression__Group_2_0__06095 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__1_in_rule__Simple_expression__Group_2_0__06098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_2_0_0_in_rule__Simple_expression__Group_2_0__0__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2_0__1__Impl_in_rule__Simple_expression__Group_2_0__16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group_2_0__1__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__06215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group__0__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl6301 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__06336 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__06339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__06455 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__06458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Factor__Group_6__0__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__16517 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__16520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__26576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Factor__Group_6__2__Impl6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__06641 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__16700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06760 = new BitSet(new long[]{0x0030800000081F70L});
    public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Set__Group__0__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16822 = new BitSet(new long[]{0x0030800000081F70L});
    public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Set__Group__1__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Set__Group__2__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__06949 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__06952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__17008 = new BitSet(new long[]{0x0011800000081F70L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__2_in_rule__Function_designator__Group__17011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Function_designator__Group__1__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__2__Impl_in_rule__Function_designator__Group__27070 = new BitSet(new long[]{0x0011800000081F70L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__3_in_rule__Function_designator__Group__27073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rule__Function_designator__Group__2__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__3__Impl_in_rule__Function_designator__Group__37132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Function_designator__Group__3__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__0__Impl_in_rule__Compound_statement__Group__07199 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__1_in_rule__Compound_statement__Group__07202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Compound_statement__Group__0__Impl7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__1__Impl_in_rule__Compound_statement__Group__17258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__2_in_rule__Compound_statement__Group__17261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Compound_statement__Group__1__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compound_statement__Group__2__Impl_in_rule__Compound_statement__Group__27317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Compound_statement__Group__2__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__0__Impl_in_rule__While_statement__Group__07379 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__While_statement__Group__1_in_rule__While_statement__Group__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_KEYWORD_in_rule__While_statement__Group__0__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__1__Impl_in_rule__While_statement__Group__17438 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__While_statement__Group__2_in_rule__While_statement__Group__17441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__While_statement__Group__1__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__2__Impl_in_rule__While_statement__Group__27497 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__While_statement__Group__3_in_rule__While_statement__Group__27500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rule__While_statement__Group__2__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_statement__Group__3__Impl_in_rule__While_statement__Group__37556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__While_statement__Group__3__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__0__Impl_in_rule__Repeat_statement__Group__07620 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__1_in_rule__Repeat_statement__Group__07623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REPEAT_KEYWORD_in_rule__Repeat_statement__Group__0__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__1__Impl_in_rule__Repeat_statement__Group__17679 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__2_in_rule__Repeat_statement__Group__17682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Repeat_statement__Group__1__Impl7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__2__Impl_in_rule__Repeat_statement__Group__27738 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__3_in_rule__Repeat_statement__Group__27741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_KEYWORD_in_rule__Repeat_statement__Group__2__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat_statement__Group__3__Impl_in_rule__Repeat_statement__Group__37797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Repeat_statement__Group__3__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__0__Impl_in_rule__For_statement__Group__07861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__For_statement__Group__1_in_rule__For_statement__Group__07864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_KEYWORD_in_rule__For_statement__Group__0__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__1__Impl_in_rule__For_statement__Group__17920 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__For_statement__Group__2_in_rule__For_statement__Group__17923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rule__For_statement__Group__1__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__2__Impl_in_rule__For_statement__Group__27979 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__For_statement__Group__3_in_rule__For_statement__Group__27982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Alternatives_2_in_rule__For_statement__Group__2__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__3__Impl_in_rule__For_statement__Group__38039 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__For_statement__Group__4_in_rule__For_statement__Group__38042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__For_statement__Group__3__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__4__Impl_in_rule__For_statement__Group__48098 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__For_statement__Group__5_in_rule__For_statement__Group__48101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rule__For_statement__Group__4__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For_statement__Group__5__Impl_in_rule__For_statement__Group__58157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__For_statement__Group__5__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08225 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_KEYWORD_in_rule__If_statement__Group__0__Impl8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__18284 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__18287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__If_statement__Group__1__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__28343 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__28346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_KEYWORD_in_rule__If_statement__Group__2__Impl8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__38402 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__4_in_rule__If_statement__Group__38405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__If_statement__Group__3__Impl8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__4__Impl_in_rule__If_statement__Group__48461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_4__0_in_rule__If_statement__Group__4__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_4__0__Impl_in_rule__If_statement__Group_4__08529 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__If_statement__Group_4__1_in_rule__If_statement__Group_4__08532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_KEYWORD_in_rule__If_statement__Group_4__0__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_4__1__Impl_in_rule__If_statement__Group_4__18588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__If_statement__Group_4__1__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__0__Impl_in_rule__Case_statement__Group__08648 = new BitSet(new long[]{0x0010800000081F70L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__1_in_rule__Case_statement__Group__08651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_KEYWORD_in_rule__Case_statement__Group__0__Impl8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__1__Impl_in_rule__Case_statement__Group__18707 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__2_in_rule__Case_statement__Group__18710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Case_statement__Group__1__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__2__Impl_in_rule__Case_statement__Group__28766 = new BitSet(new long[]{0x0000000000001D70L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__3_in_rule__Case_statement__Group__28769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OF_KEYWORD_in_rule__Case_statement__Group__2__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__3__Impl_in_rule__Case_statement__Group__38825 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__4_in_rule__Case_statement__Group__38828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_rule__Case_statement__Group__3__Impl8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__4__Impl_in_rule__Case_statement__Group__48884 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__5_in_rule__Case_statement__Group__48887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group_4__0_in_rule__Case_statement__Group__4__Impl8914 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__5__Impl_in_rule__Case_statement__Group__58945 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__6_in_rule__Case_statement__Group__58948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Case_statement__Group__5__Impl8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group__6__Impl_in_rule__Case_statement__Group__69010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Case_statement__Group__6__Impl9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group_4__0__Impl_in_rule__Case_statement__Group_4__09080 = new BitSet(new long[]{0x0000000000001D70L});
    public static final BitSet FOLLOW_rule__Case_statement__Group_4__1_in_rule__Case_statement__Group_4__09083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Case_statement__Group_4__0__Impl9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_statement__Group_4__1__Impl_in_rule__Case_statement__Group_4__19142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_rule__Case_statement__Group_4__1__Impl9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__0__Impl_in_rule__Case_limb__Group__09202 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__1_in_rule__Case_limb__Group__09205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rule__Case_limb__Group__0__Impl9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__1__Impl_in_rule__Case_limb__Group__19261 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__2_in_rule__Case_limb__Group__19264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Case_limb__Group__1__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_limb__Group__2__Impl_in_rule__Case_limb__Group__29323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Case_limb__Group__2__Impl9350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__0__Impl_in_rule__Case_label_list__Group__09385 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__1_in_rule__Case_label_list__Group__09388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Case_label_list__Group__0__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group__1__Impl_in_rule__Case_label_list__Group__19444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__0_in_rule__Case_label_list__Group__1__Impl9471 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__0__Impl_in_rule__Case_label_list__Group_1__09506 = new BitSet(new long[]{0x0000000000001D70L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__1_in_rule__Case_label_list__Group_1__09509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Case_label_list__Group_1__0__Impl9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case_label_list__Group_1__1__Impl_in_rule__Case_label_list__Group_1__19568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Case_label_list__Group_1__1__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09628 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Constant__Group_0__0__Impl9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_0_1_in_rule__Constant__Group_0__1__Impl9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__0__Impl_in_rule__With_statement__Group__09751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__With_statement__Group__1_in_rule__With_statement__Group__09754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WITH_KEYWORD_in_rule__With_statement__Group__0__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__1__Impl_in_rule__With_statement__Group__19810 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_rule__With_statement__Group__2_in_rule__With_statement__Group__19813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__With_statement__Group__1__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__2__Impl_in_rule__With_statement__Group__29869 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_rule__With_statement__Group__3_in_rule__With_statement__Group__29872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group_2__0_in_rule__With_statement__Group__2__Impl9899 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__3__Impl_in_rule__With_statement__Group__39930 = new BitSet(new long[]{0x00000000D3508030L});
    public static final BitSet FOLLOW_rule__With_statement__Group__4_in_rule__With_statement__Group__39933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_KEYWORD_in_rule__With_statement__Group__3__Impl9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group__4__Impl_in_rule__With_statement__Group__49989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__With_statement__Group__4__Impl10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group_2__0__Impl_in_rule__With_statement__Group_2__010055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__With_statement__Group_2__1_in_rule__With_statement__Group_2__010058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__With_statement__Group_2__0__Impl10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__With_statement__Group_2__1__Impl_in_rule__With_statement__Group_2__110117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__With_statement__Group_2__1__Impl10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__0__Impl_in_rule__Goto_statement__Group__010177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__1_in_rule__Goto_statement__Group__010180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GOTO_KEYWORD_in_rule__Goto_statement__Group__0__Impl10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto_statement__Group__1__Impl_in_rule__Goto_statement__Group__110236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Goto_statement__Group__1__Impl10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__010296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__010299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__110355 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__110358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl10385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__210414 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__210417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl10444 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__310475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Label_declaration_part__Group__3__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__010542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__010545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Label_declaration_part__Group_2__0__Impl10573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__110604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl10631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment10669 = new BitSet(new long[]{0x0000000000000002L});

}