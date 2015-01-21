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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER_NUMBER", "RULE_IDENTIFIER", "RULE_REAL_NUMBER", "RULE_SIGN", "RULE_DIGIT_SEQUENCE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_SCALE_FACTOR", "RULE_LETTER_EXTENDED", "RULE_DIGIT", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'in'", "'+'", "'-'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'.'", "'program'", "';'", "'('", "')'", "','", "'begin'", "'end'", "':'", "':='", "'label'"
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
    public static final int RULE_REAL_NUMBER=6;
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
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=9;
    public static final int RULE_SIGN=7;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:153:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 )? ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:157:2: ( ( ( rule__Identifier_list__Group__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Identifier_list__Group__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:158:1: ( ( rule__Identifier_list__Group__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:159:1: ( rule__Identifier_list__Group__0 )?
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:160:1: ( rule__Identifier_list__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_IDENTIFIER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:160:2: rule__Identifier_list__Group__0
                    {
                    pushFollow(FOLLOW_rule__Identifier_list__Group__0_in_ruleidentifier_list274);
                    rule__Identifier_list__Group__0();

                    state._fsp--;


                    }
                    break;

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
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock302);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock309); 

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
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleblock335);
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
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part362);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part369); 

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
            pushFollow(FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part395);
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
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence422);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence429); 

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
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence455);
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
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement482);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement489); 

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
            pushFollow(FOLLOW_rule__Statement__Group__0_in_rulestatement515);
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
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel542);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel549); 

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
            match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel575); 
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
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement601);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement608); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:321:1: rulesimple_statement : ( ( ruleassignment_statement )? ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:325:2: ( ( ( ruleassignment_statement )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( ruleassignment_statement )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:326:1: ( ( ruleassignment_statement )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:327:1: ( ruleassignment_statement )?
            {
             before(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:328:1: ( ruleassignment_statement )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:328:3: ruleassignment_statement
                    {
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement635);
                    ruleassignment_statement();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_statementAccess().getAssignment_statementParserRuleCall()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement663);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getAssignment_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement670); 

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
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0_in_ruleassignment_statement696);
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
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable723);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable730); 

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
            pushFollow(FOLLOW_ruleentire_variable_in_rulevariable756);
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
            pushFollow(FOLLOW_ruleentire_variable_in_entryRuleentire_variable782);
            ruleentire_variable();

            state._fsp--;

             after(grammarAccess.getEntire_variableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentire_variable789); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:405:1: ruleentire_variable : ( rulevariable_identifier ) ;
    public final void ruleentire_variable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:409:2: ( ( rulevariable_identifier ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( rulevariable_identifier )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:410:1: ( rulevariable_identifier )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:411:1: rulevariable_identifier
            {
             before(grammarAccess.getEntire_variableAccess().getVariable_identifierParserRuleCall()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_ruleentire_variable815);
            rulevariable_identifier();

            state._fsp--;

             after(grammarAccess.getEntire_variableAccess().getVariable_identifierParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRulevariable_identifier"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:424:1: entryRulevariable_identifier : rulevariable_identifier EOF ;
    public final void entryRulevariable_identifier() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:425:1: ( rulevariable_identifier EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:426:1: rulevariable_identifier EOF
            {
             before(grammarAccess.getVariable_identifierRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier841);
            rulevariable_identifier();

            state._fsp--;

             after(grammarAccess.getVariable_identifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier848); 

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
    // $ANTLR end "entryRulevariable_identifier"


    // $ANTLR start "rulevariable_identifier"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:433:1: rulevariable_identifier : ( RULE_IDENTIFIER ) ;
    public final void rulevariable_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:437:2: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:438:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:438:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:439:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier874); 
             after(grammarAccess.getVariable_identifierAccess().getIDENTIFIERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_identifier"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:452:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:453:1: ( ruleexpression EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:454:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression900);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression907); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:461:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:465:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:466:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:466:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:467:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:468:1: ( rule__Expression__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:468:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleexpression933);
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


    // $ANTLR start "entryRulerelation_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:480:1: entryRulerelation_operator : rulerelation_operator EOF ;
    public final void entryRulerelation_operator() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:481:1: ( rulerelation_operator EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:482:1: rulerelation_operator EOF
            {
             before(grammarAccess.getRelation_operatorRule()); 
            pushFollow(FOLLOW_rulerelation_operator_in_entryRulerelation_operator960);
            rulerelation_operator();

            state._fsp--;

             after(grammarAccess.getRelation_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerelation_operator967); 

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
    // $ANTLR end "entryRulerelation_operator"


    // $ANTLR start "rulerelation_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:489:1: rulerelation_operator : ( ( rule__Relation_operator__Alternatives ) ) ;
    public final void rulerelation_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:493:2: ( ( ( rule__Relation_operator__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Relation_operator__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Relation_operator__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:495:1: ( rule__Relation_operator__Alternatives )
            {
             before(grammarAccess.getRelation_operatorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:1: ( rule__Relation_operator__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:2: rule__Relation_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Relation_operator__Alternatives_in_rulerelation_operator993);
            rule__Relation_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelation_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerelation_operator"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:508:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:509:1: ( rulesimple_expression EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:510:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression1020);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression1027); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:517:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:521:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Simple_expression__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Simple_expression__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:523:1: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:1: ( rule__Simple_expression__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:2: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__0_in_rulesimple_expression1053);
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


    // $ANTLR start "entryRuleaddition_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:536:1: entryRuleaddition_operator : ruleaddition_operator EOF ;
    public final void entryRuleaddition_operator() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:537:1: ( ruleaddition_operator EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:538:1: ruleaddition_operator EOF
            {
             before(grammarAccess.getAddition_operatorRule()); 
            pushFollow(FOLLOW_ruleaddition_operator_in_entryRuleaddition_operator1080);
            ruleaddition_operator();

            state._fsp--;

             after(grammarAccess.getAddition_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddition_operator1087); 

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
    // $ANTLR end "entryRuleaddition_operator"


    // $ANTLR start "ruleaddition_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:545:1: ruleaddition_operator : ( ( rule__Addition_operator__Alternatives ) ) ;
    public final void ruleaddition_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:549:2: ( ( ( rule__Addition_operator__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:550:1: ( ( rule__Addition_operator__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:550:1: ( ( rule__Addition_operator__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:551:1: ( rule__Addition_operator__Alternatives )
            {
             before(grammarAccess.getAddition_operatorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:1: ( rule__Addition_operator__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:2: rule__Addition_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Addition_operator__Alternatives_in_ruleaddition_operator1113);
            rule__Addition_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddition_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleaddition_operator"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:564:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:565:1: ( ruleterm EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:566:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1140);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1147); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:573:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:577:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:578:1: ( ( rule__Term__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:578:1: ( ( rule__Term__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:579:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:1: ( rule__Term__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleterm1173);
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


    // $ANTLR start "entryRulemultiplication_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:592:1: entryRulemultiplication_operator : rulemultiplication_operator EOF ;
    public final void entryRulemultiplication_operator() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:593:1: ( rulemultiplication_operator EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:594:1: rulemultiplication_operator EOF
            {
             before(grammarAccess.getMultiplication_operatorRule()); 
            pushFollow(FOLLOW_rulemultiplication_operator_in_entryRulemultiplication_operator1200);
            rulemultiplication_operator();

            state._fsp--;

             after(grammarAccess.getMultiplication_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemultiplication_operator1207); 

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
    // $ANTLR end "entryRulemultiplication_operator"


    // $ANTLR start "rulemultiplication_operator"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:601:1: rulemultiplication_operator : ( ( rule__Multiplication_operator__Alternatives ) ) ;
    public final void rulemultiplication_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:605:2: ( ( ( rule__Multiplication_operator__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:606:1: ( ( rule__Multiplication_operator__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:606:1: ( ( rule__Multiplication_operator__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:607:1: ( rule__Multiplication_operator__Alternatives )
            {
             before(grammarAccess.getMultiplication_operatorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:1: ( rule__Multiplication_operator__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:2: rule__Multiplication_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplication_operator__Alternatives_in_rulemultiplication_operator1233);
            rule__Multiplication_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplication_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemultiplication_operator"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:620:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:621:1: ( rulefactor EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:622:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor1260);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor1267); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:629:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:633:2: ( ( ( rule__Factor__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:634:1: ( ( rule__Factor__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:634:1: ( ( rule__Factor__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:635:1: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:1: ( rule__Factor__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:2: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_rule__Factor__Alternatives_in_rulefactor1293);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:648:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:649:1: ( rulenumber EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:650:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber1320);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber1327); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:657:1: rulenumber : ( ( rule__Number__Alternatives ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:661:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:662:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:662:1: ( ( rule__Number__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:663:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:1: ( rule__Number__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_rulenumber1353);
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


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:676:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:677:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:678:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1380);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part1387); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:685:1: ruledeclaration_part : ( ( rulelabel_declaration_part )? ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:689:2: ( ( ( rulelabel_declaration_part )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:690:1: ( ( rulelabel_declaration_part )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:690:1: ( ( rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:691:1: ( rulelabel_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:1: ( rulelabel_declaration_part )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:3: rulelabel_declaration_part
                    {
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1414);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:704:1: entryRulelabel_declaration_part : rulelabel_declaration_part EOF ;
    public final void entryRulelabel_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:705:1: ( rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:706:1: rulelabel_declaration_part EOF
            {
             before(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1442);
            rulelabel_declaration_part();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part1449); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:713:1: rulelabel_declaration_part : ( ( rule__Label_declaration_part__Group__0 ) ) ;
    public final void rulelabel_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:717:2: ( ( ( rule__Label_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:718:1: ( ( rule__Label_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:718:1: ( ( rule__Label_declaration_part__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:719:1: ( rule__Label_declaration_part__Group__0 )
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:720:1: ( rule__Label_declaration_part__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:720:2: rule__Label_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part1475);
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


    // $ANTLR start "rule__Relation_operator__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:732:1: rule__Relation_operator__Alternatives : ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'in' ) );
    public final void rule__Relation_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:736:1: ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'in' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
                {
                alt4=6;
                }
                break;
            case 27:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:737:1: ( '=' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:737:1: ( '=' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:738:1: '='
                    {
                     before(grammarAccess.getRelation_operatorAccess().getEqualsSignKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__Relation_operator__Alternatives1512); 
                     after(grammarAccess.getRelation_operatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:745:6: ( '<>' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:745:6: ( '<>' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:746:1: '<>'
                    {
                     before(grammarAccess.getRelation_operatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                    match(input,22,FOLLOW_22_in_rule__Relation_operator__Alternatives1532); 
                     after(grammarAccess.getRelation_operatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:753:6: ( '<' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:753:6: ( '<' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:754:1: '<'
                    {
                     before(grammarAccess.getRelation_operatorAccess().getLessThanSignKeyword_2()); 
                    match(input,23,FOLLOW_23_in_rule__Relation_operator__Alternatives1552); 
                     after(grammarAccess.getRelation_operatorAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:761:6: ( '<=' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:761:6: ( '<=' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:762:1: '<='
                    {
                     before(grammarAccess.getRelation_operatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,24,FOLLOW_24_in_rule__Relation_operator__Alternatives1572); 
                     after(grammarAccess.getRelation_operatorAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:769:6: ( '>' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:769:6: ( '>' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:770:1: '>'
                    {
                     before(grammarAccess.getRelation_operatorAccess().getGreaterThanSignKeyword_4()); 
                    match(input,25,FOLLOW_25_in_rule__Relation_operator__Alternatives1592); 
                     after(grammarAccess.getRelation_operatorAccess().getGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:777:6: ( '>=' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:777:6: ( '>=' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:778:1: '>='
                    {
                     before(grammarAccess.getRelation_operatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    match(input,26,FOLLOW_26_in_rule__Relation_operator__Alternatives1612); 
                     after(grammarAccess.getRelation_operatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:785:6: ( 'in' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:785:6: ( 'in' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:786:1: 'in'
                    {
                     before(grammarAccess.getRelation_operatorAccess().getInKeyword_6()); 
                    match(input,27,FOLLOW_27_in_rule__Relation_operator__Alternatives1632); 
                     after(grammarAccess.getRelation_operatorAccess().getInKeyword_6()); 

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
    // $ANTLR end "rule__Relation_operator__Alternatives"


    // $ANTLR start "rule__Addition_operator__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:798:1: rule__Addition_operator__Alternatives : ( ( '+' ) | ( '-' ) | ( 'or' ) );
    public final void rule__Addition_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:802:1: ( ( '+' ) | ( '-' ) | ( 'or' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:803:1: ( '+' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:803:1: ( '+' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:804:1: '+'
                    {
                     before(grammarAccess.getAddition_operatorAccess().getPlusSignKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Addition_operator__Alternatives1667); 
                     after(grammarAccess.getAddition_operatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:811:6: ( '-' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:811:6: ( '-' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:812:1: '-'
                    {
                     before(grammarAccess.getAddition_operatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Addition_operator__Alternatives1687); 
                     after(grammarAccess.getAddition_operatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:819:6: ( 'or' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:819:6: ( 'or' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:820:1: 'or'
                    {
                     before(grammarAccess.getAddition_operatorAccess().getOrKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Addition_operator__Alternatives1707); 
                     after(grammarAccess.getAddition_operatorAccess().getOrKeyword_2()); 

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
    // $ANTLR end "rule__Addition_operator__Alternatives"


    // $ANTLR start "rule__Multiplication_operator__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:832:1: rule__Multiplication_operator__Alternatives : ( ( '*' ) | ( '/' ) | ( 'div' ) | ( 'mod' ) | ( 'and' ) );
    public final void rule__Multiplication_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:836:1: ( ( '*' ) | ( '/' ) | ( 'div' ) | ( 'mod' ) | ( 'and' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:837:1: ( '*' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:837:1: ( '*' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:838:1: '*'
                    {
                     before(grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0()); 
                    match(input,31,FOLLOW_31_in_rule__Multiplication_operator__Alternatives1742); 
                     after(grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:845:6: ( '/' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:845:6: ( '/' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:846:1: '/'
                    {
                     before(grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1()); 
                    match(input,32,FOLLOW_32_in_rule__Multiplication_operator__Alternatives1762); 
                     after(grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:853:6: ( 'div' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:853:6: ( 'div' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:854:1: 'div'
                    {
                     before(grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2()); 
                    match(input,33,FOLLOW_33_in_rule__Multiplication_operator__Alternatives1782); 
                     after(grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:861:6: ( 'mod' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:861:6: ( 'mod' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:862:1: 'mod'
                    {
                     before(grammarAccess.getMultiplication_operatorAccess().getModKeyword_3()); 
                    match(input,34,FOLLOW_34_in_rule__Multiplication_operator__Alternatives1802); 
                     after(grammarAccess.getMultiplication_operatorAccess().getModKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:869:6: ( 'and' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:869:6: ( 'and' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:870:1: 'and'
                    {
                     before(grammarAccess.getMultiplication_operatorAccess().getAndKeyword_4()); 
                    match(input,35,FOLLOW_35_in_rule__Multiplication_operator__Alternatives1822); 
                     after(grammarAccess.getMultiplication_operatorAccess().getAndKeyword_4()); 

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
    // $ANTLR end "rule__Multiplication_operator__Alternatives"


    // $ANTLR start "rule__Factor__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:882:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:886:1: ( ( rulevariable ) | ( rulenumber ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INTEGER_NUMBER||LA7_0==RULE_REAL_NUMBER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:887:1: ( rulevariable )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:887:1: ( rulevariable )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:888:1: rulevariable
                    {
                     before(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulevariable_in_rule__Factor__Alternatives1856);
                    rulevariable();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:893:6: ( rulenumber )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:893:6: ( rulenumber )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:894:1: rulenumber
                    {
                     before(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Factor__Alternatives1873);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:904:1: rule__Number__Alternatives : ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:908:1: ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INTEGER_NUMBER) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_REAL_NUMBER) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:909:1: ( RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:909:1: ( RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:910:1: RULE_INTEGER_NUMBER
                    {
                     before(grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rule__Number__Alternatives1905); 
                     after(grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:915:6: ( RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:915:6: ( RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:916:1: RULE_REAL_NUMBER
                    {
                     before(grammarAccess.getNumberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rule__Number__Alternatives1922); 
                     after(grammarAccess.getNumberAccess().getREAL_NUMBERTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:928:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:932:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:933:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01952);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01955);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:940:1: rule__Program__Group__0__Impl : ( ruleprogram_heading_block ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:944:1: ( ( ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:945:1: ( ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:945:1: ( ruleprogram_heading_block )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:946:1: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl1982);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:957:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:961:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:962:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12011);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12014);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:969:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:973:1: ( ( ruleblock ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:1: ( ruleblock )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:974:1: ( ruleblock )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:975:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2041);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:986:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:990:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:991:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22070);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:997:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1001:1: ( ( '.' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1002:1: ( '.' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1002:1: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1003:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Program__Group__2__Impl2098); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1022:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1026:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1027:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__02135);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__02138);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1034:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1038:1: ( ( 'program' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1039:1: ( 'program' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1039:1: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1040:1: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Program_heading_block__Group__0__Impl2166); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1053:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1057:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1058:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12197);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12200);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1065:1: rule__Program_heading_block__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1069:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1070:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1070:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1071:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl2227); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1082:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1086:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1087:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__22256);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__22259);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1094:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1098:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1099:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1099:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1100:1: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1101:1: ( rule__Program_heading_block__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1101:2: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl2286);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1111:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1115:1: ( rule__Program_heading_block__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1116:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__32317);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1122:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1126:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1127:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1127:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1128:1: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Program_heading_block__Group__3__Impl2345); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1149:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1153:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1154:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__02384);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__02387);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1161:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1165:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1166:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1166:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1167:1: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__Program_heading_block__Group_2__0__Impl2415); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1180:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1184:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1185:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__12446);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__12449);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1192:1: rule__Program_heading_block__Group_2__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1196:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1197:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1197:1: ( ruleidentifier_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1198:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl2476);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1209:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1213:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1214:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__22505);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1220:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1224:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1225:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1225:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1226:1: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,40,FOLLOW_40_in_rule__Program_heading_block__Group_2__2__Impl2533); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1245:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1249:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1250:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__02570);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__02573);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1257:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1261:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1262:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1262:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1263:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl2600); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1274:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1278:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1279:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__12629);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1285:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1289:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1290:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1290:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1291:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1292:1: ( rule__Identifier_list__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1292:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl2656);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1306:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1310:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1311:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__02691);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__02694);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1318:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1322:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1323:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1323:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1324:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Identifier_list__Group_1__0__Impl2722); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1337:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1341:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1342:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__12753);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1348:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1352:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1353:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1353:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1354:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl2780); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1369:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1373:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1374:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02813);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02816);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1381:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1385:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1386:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1386:1: ( ruledeclaration_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1387:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl2843);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1398:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1402:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1403:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12872);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1409:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1413:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1414:1: ( rulestatement_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1414:1: ( rulestatement_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1415:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl2899);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1430:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1434:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1435:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__02932);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__02935);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1442:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1446:1: ( ( 'begin' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1447:1: ( 'begin' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1447:1: ( 'begin' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1448:1: 'begin'
            {
             before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Statement_part__Group__0__Impl2963); 
             after(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1461:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1465:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1466:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__12994);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__12997);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1473:1: rule__Statement_part__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1477:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1478:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1478:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1479:1: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl3024);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1490:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1494:1: ( rule__Statement_part__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1495:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__23053);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1501:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1505:1: ( ( 'end' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1506:1: ( 'end' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1506:1: ( 'end' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1507:1: 'end'
            {
             before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__Statement_part__Group__2__Impl3081); 
             after(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1526:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1530:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1531:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__03118);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__03121);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1538:1: rule__Statement_sequence__Group__0__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1542:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1543:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1543:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1544:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl3148);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1555:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1559:1: ( rule__Statement_sequence__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1560:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13177);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1566:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1570:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1571:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1571:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1572:1: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1573:1: ( rule__Statement_sequence__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1573:2: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3204);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1587:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1591:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1592:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__03239);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__03242);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1599:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1603:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1604:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1604:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1605:1: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Statement_sequence__Group_1__0__Impl3270); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1618:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1622:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1623:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__13301);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1629:1: rule__Statement_sequence__Group_1__1__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1633:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1634:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1634:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1635:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl3328);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1650:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1654:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1655:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__03361);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__03364);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1662:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1666:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1667:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1667:1: ( ( rule__Statement__Group_0__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1668:1: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1669:1: ( rule__Statement__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INTEGER_NUMBER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1669:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl3391);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1679:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1683:1: ( rule__Statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1684:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__13422);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1690:1: rule__Statement__Group__1__Impl : ( rulesimple_statement ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1694:1: ( ( rulesimple_statement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1695:1: ( rulesimple_statement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1695:1: ( rulesimple_statement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1696:1: rulesimple_statement
            {
             before(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1()); 
            pushFollow(FOLLOW_rulesimple_statement_in_rule__Statement__Group__1__Impl3449);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1711:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1715:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1716:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03482);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03485);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1723:1: rule__Statement__Group_0__0__Impl : ( rulelabel ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1727:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1728:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1728:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1729:1: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl3512);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1740:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1744:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1745:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13541);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1751:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1755:1: ( ( ':' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1756:1: ( ':' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1756:1: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1757:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__Statement__Group_0__1__Impl3569); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1774:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1778:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1779:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__03604);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__03607);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1786:1: rule__Assignment_statement__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1790:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1791:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1791:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1792:1: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl3634);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1803:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1807:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1808:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__13663);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__13666);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1815:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1819:1: ( ( ':=' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1820:1: ( ':=' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1820:1: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1821:1: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__Assignment_statement__Group__1__Impl3694); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1834:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1838:1: ( rule__Assignment_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1839:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__23725);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1845:1: rule__Assignment_statement__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1849:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1850:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1850:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1851:1: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl3752);
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


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1868:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1872:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1873:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03787);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03790);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1880:1: rule__Expression__Group__0__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1884:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1885:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1885:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1886:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl3817);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1897:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1901:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1902:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13846);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1908:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1912:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1913:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1913:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1914:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1915:1: ( rule__Expression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=27)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1915:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3873);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1929:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1933:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1934:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03908);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03911);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1941:1: rule__Expression__Group_1__0__Impl : ( rulerelation_operator ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1945:1: ( ( rulerelation_operator ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1946:1: ( rulerelation_operator )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1946:1: ( rulerelation_operator )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1947:1: rulerelation_operator
            {
             before(grammarAccess.getExpressionAccess().getRelation_operatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulerelation_operator_in_rule__Expression__Group_1__0__Impl3938);
            rulerelation_operator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRelation_operatorParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1958:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1962:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1963:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13967);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1969:1: rule__Expression__Group_1__1__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1973:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1974:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1974:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1975:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl3994);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1990:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1994:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1995:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__04027);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__04030);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2002:1: rule__Simple_expression__Group__0__Impl : ( ( RULE_SIGN )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2006:1: ( ( ( RULE_SIGN )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2007:1: ( ( RULE_SIGN )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2007:1: ( ( RULE_SIGN )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2008:1: ( RULE_SIGN )?
            {
             before(grammarAccess.getSimple_expressionAccess().getSIGNTerminalRuleCall_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2009:1: ( RULE_SIGN )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SIGN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2009:3: RULE_SIGN
                    {
                    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__Simple_expression__Group__0__Impl4058); 

                    }
                    break;

            }

             after(grammarAccess.getSimple_expressionAccess().getSIGNTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2019:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2023:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2024:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__14089);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__14092);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2031:1: rule__Simple_expression__Group__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2035:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2036:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2036:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2037:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl4119);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2048:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2052:1: ( rule__Simple_expression__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2053:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__24148);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2059:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Group_2__0 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2063:1: ( ( ( rule__Simple_expression__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2064:1: ( ( rule__Simple_expression__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2064:1: ( ( rule__Simple_expression__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2065:1: ( rule__Simple_expression__Group_2__0 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2066:1: ( rule__Simple_expression__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=28 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2066:2: rule__Simple_expression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Simple_expression__Group_2__0_in_rule__Simple_expression__Group__2__Impl4175);
            	    rule__Simple_expression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSimple_expressionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Simple_expression__Group_2__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2082:1: rule__Simple_expression__Group_2__0 : rule__Simple_expression__Group_2__0__Impl rule__Simple_expression__Group_2__1 ;
    public final void rule__Simple_expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2086:1: ( rule__Simple_expression__Group_2__0__Impl rule__Simple_expression__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2087:2: rule__Simple_expression__Group_2__0__Impl rule__Simple_expression__Group_2__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2__0__Impl_in_rule__Simple_expression__Group_2__04212);
            rule__Simple_expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_2__1_in_rule__Simple_expression__Group_2__04215);
            rule__Simple_expression__Group_2__1();

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
    // $ANTLR end "rule__Simple_expression__Group_2__0"


    // $ANTLR start "rule__Simple_expression__Group_2__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2094:1: rule__Simple_expression__Group_2__0__Impl : ( ruleaddition_operator ) ;
    public final void rule__Simple_expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2098:1: ( ( ruleaddition_operator ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2099:1: ( ruleaddition_operator )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2099:1: ( ruleaddition_operator )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2100:1: ruleaddition_operator
            {
             before(grammarAccess.getSimple_expressionAccess().getAddition_operatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleaddition_operator_in_rule__Simple_expression__Group_2__0__Impl4242);
            ruleaddition_operator();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getAddition_operatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2111:1: rule__Simple_expression__Group_2__1 : rule__Simple_expression__Group_2__1__Impl ;
    public final void rule__Simple_expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2115:1: ( rule__Simple_expression__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2116:2: rule__Simple_expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_2__1__Impl_in_rule__Simple_expression__Group_2__14271);
            rule__Simple_expression__Group_2__1__Impl();

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
    // $ANTLR end "rule__Simple_expression__Group_2__1"


    // $ANTLR start "rule__Simple_expression__Group_2__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2122:1: rule__Simple_expression__Group_2__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2126:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2127:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2127:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2128:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group_2__1__Impl4298);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2143:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2147:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2148:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04331);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04334);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2155:1: rule__Term__Group__0__Impl : ( rulefactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2159:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2160:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2160:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2161:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group__0__Impl4361);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2172:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2176:1: ( rule__Term__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2177:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14390);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2183:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2187:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2188:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2188:1: ( ( rule__Term__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2189:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2190:1: ( rule__Term__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2190:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4417);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2204:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2208:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2209:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04452);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04455);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2216:1: rule__Term__Group_1__0__Impl : ( rulemultiplication_operator ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2220:1: ( ( rulemultiplication_operator ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2221:1: ( rulemultiplication_operator )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2221:1: ( rulemultiplication_operator )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2222:1: rulemultiplication_operator
            {
             before(grammarAccess.getTermAccess().getMultiplication_operatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulemultiplication_operator_in_rule__Term__Group_1__0__Impl4482);
            rulemultiplication_operator();

            state._fsp--;

             after(grammarAccess.getTermAccess().getMultiplication_operatorParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2233:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2237:1: ( rule__Term__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2238:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14511);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2244:1: rule__Term__Group_1__1__Impl : ( rulefactor ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2248:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2249:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2249:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2250:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl4538);
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


    // $ANTLR start "rule__Label_declaration_part__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2265:1: rule__Label_declaration_part__Group__0 : rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 ;
    public final void rule__Label_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2269:1: ( rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2270:2: rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__04571);
            rule__Label_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__04574);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2277:1: rule__Label_declaration_part__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2281:1: ( ( 'label' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2282:1: ( 'label' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2282:1: ( 'label' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2283:1: 'label'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Label_declaration_part__Group__0__Impl4602); 
             after(grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2296:1: rule__Label_declaration_part__Group__1 : rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 ;
    public final void rule__Label_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2300:1: ( rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2301:2: rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__14633);
            rule__Label_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__14636);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2308:1: rule__Label_declaration_part__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2312:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2313:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2313:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2314:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl4663);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2325:1: rule__Label_declaration_part__Group__2 : rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 ;
    public final void rule__Label_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2329:1: ( rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2330:2: rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__24692);
            rule__Label_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__24695);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2337:1: rule__Label_declaration_part__Group__2__Impl : ( ( rule__Label_declaration_part__Group_2__0 )* ) ;
    public final void rule__Label_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2341:1: ( ( ( rule__Label_declaration_part__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2342:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2342:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2343:1: ( rule__Label_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2344:1: ( rule__Label_declaration_part__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2344:2: rule__Label_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl4722);
            	    rule__Label_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2354:1: rule__Label_declaration_part__Group__3 : rule__Label_declaration_part__Group__3__Impl ;
    public final void rule__Label_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2358:1: ( rule__Label_declaration_part__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2359:2: rule__Label_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__34753);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2365:1: rule__Label_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2369:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2370:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2370:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2371:1: ';'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__Label_declaration_part__Group__3__Impl4781); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2392:1: rule__Label_declaration_part__Group_2__0 : rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 ;
    public final void rule__Label_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2396:1: ( rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2397:2: rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__04820);
            rule__Label_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__04823);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2404:1: rule__Label_declaration_part__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2408:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2409:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2409:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2410:1: ','
            {
             before(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Label_declaration_part__Group_2__0__Impl4851); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2423:1: rule__Label_declaration_part__Group_2__1 : rule__Label_declaration_part__Group_2__1__Impl ;
    public final void rule__Label_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2427:1: ( rule__Label_declaration_part__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2428:2: rule__Label_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__14882);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2434:1: rule__Label_declaration_part__Group_2__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2438:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2439:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2439:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2440:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl4909);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2456:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2460:1: ( ( ruleprogram ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2461:1: ( ruleprogram )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2461:1: ( ruleprogram )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2462:1: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment4947);
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
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleblock335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0_in_rulestatement_part395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0_in_rulestatement_sequence455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_rulestatement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0_in_ruleassignment_statement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_rulevariable756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentire_variable_in_entryRuleentire_variable782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentire_variable789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_ruleentire_variable815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_in_entryRulevariable_identifier841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulevariable_identifier874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleexpression933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelation_operator_in_entryRulerelation_operator960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelation_operator967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation_operator__Alternatives_in_rulerelation_operator993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__0_in_rulesimple_expression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddition_operator_in_entryRuleaddition_operator1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddition_operator1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition_operator__Alternatives_in_ruleaddition_operator1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleterm1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplication_operator_in_entryRulemultiplication_operator1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemultiplication_operator1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication_operator__Alternatives_in_rulemultiplication_operator1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Alternatives_in_rulefactor1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_rulenumber1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Relation_operator__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Relation_operator__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Relation_operator__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Relation_operator__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Relation_operator__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation_operator__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation_operator__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Addition_operator__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Addition_operator__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Addition_operator__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplication_operator__Alternatives1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Multiplication_operator__Alternatives1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Multiplication_operator__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Multiplication_operator__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Multiplication_operator__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Factor__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Factor__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rule__Number__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rule__Number__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01952 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12011 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Program__Group__2__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__02135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__02138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Program_heading_block__Group__0__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12197 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__22256 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__22259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__32317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Program_heading_block__Group__3__Impl2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__02384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__02387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Program_heading_block__Group_2__0__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__12446 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__12449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__22505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Program_heading_block__Group_2__2__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__02570 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl2656 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__02691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__02694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Identifier_list__Group_1__0__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__12753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02813 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__02932 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__02935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Statement_part__Group__0__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__12994 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__23053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Statement_part__Group__2__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__03118 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__03121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3204 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__03239 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Statement_sequence__Group_1__0__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__03361 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__03364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rule__Statement__Group__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03482 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Statement__Group_0__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__03604 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__03607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__13663 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Assignment_statement__Group__1__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__23725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03787 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03908 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelation_operator_in_rule__Expression__Group_1__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__0__Impl_in_rule__Simple_expression__Group__04027 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1_in_rule__Simple_expression__Group__04030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__Simple_expression__Group__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__1__Impl_in_rule__Simple_expression__Group__14089 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2_in_rule__Simple_expression__Group__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group__2__Impl_in_rule__Simple_expression__Group__24148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2__0_in_rule__Simple_expression__Group__2__Impl4175 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2__0__Impl_in_rule__Simple_expression__Group_2__04212 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2__1_in_rule__Simple_expression__Group_2__04215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddition_operator_in_rule__Simple_expression__Group_2__0__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_2__1__Impl_in_rule__Simple_expression__Group_2__14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group_2__1__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04331 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group__0__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4417 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04452 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemultiplication_operator_in_rule__Term__Group_1__0__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__04571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__04574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Label_declaration_part__Group__0__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__14633 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__24692 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__24695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl4722 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__34753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Label_declaration_part__Group__3__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__04820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Label_declaration_part__Group_2__0__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment4947 = new BitSet(new long[]{0x0000000000000002L});

}