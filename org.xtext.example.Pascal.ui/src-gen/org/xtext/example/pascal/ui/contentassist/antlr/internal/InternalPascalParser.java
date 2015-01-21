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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER_NUMBER", "RULE_IDENTIFIER", "RULE_STRING", "RULE_NIL_KEYWORD", "RULE_REAL_NUMBER", "RULE_BEGIN_KEYWORD", "RULE_END_KEYWORD", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_NOT_KEYWORD", "RULE_LABEL_KEYWORD", "RULE_DIGIT_SEQUENCE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_LETTER_EXTENDED", "RULE_LETTER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'.'", "'program'", "';'", "'('", "')'", "','", "':'", "':='", "'['", "']'"
    };
    public static final int RULE_ID=21;
    public static final int RULE_RELATIONAL_OPERATOR=11;
    public static final int RULE_NIL_KEYWORD=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_LABEL_KEYWORD=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=17;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_ADDITION_OPERATOR=12;
    public static final int EOF=-1;
    public static final int RULE_NOT_KEYWORD=14;
    public static final int RULE_LETTER=20;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_END_KEYWORD=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int RULE_REAL_NUMBER=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_MULTIPLICATION_OPERATOR=13;
    public static final int RULE_INT=22;
    public static final int RULE_BEGIN_KEYWORD=9;
    public static final int RULE_DIGIT_SEQUENCE=16;
    public static final int RULE_WS=25;
    public static final int RULE_DIGIT=18;
    public static final int RULE_LETTER_EXTENDED=19;
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


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:480:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:481:1: ( rulesimple_expression EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:482:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression960);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression967); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:489:1: rulesimple_expression : ( ( rule__Simple_expression__Alternatives ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:493:2: ( ( ( rule__Simple_expression__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Simple_expression__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:494:1: ( ( rule__Simple_expression__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:495:1: ( rule__Simple_expression__Alternatives )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:1: ( rule__Simple_expression__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:496:2: rule__Simple_expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_expression__Alternatives_in_rulesimple_expression993);
            rule__Simple_expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:508:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:509:1: ( ruleterm EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:510:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1020);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1027); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:517:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:521:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Term__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:522:1: ( ( rule__Term__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:523:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:1: ( rule__Term__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:524:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleterm1053);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:536:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:537:1: ( rulefactor EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:538:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor1080);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor1087); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:545:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:549:2: ( ( ( rule__Factor__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:550:1: ( ( rule__Factor__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:550:1: ( ( rule__Factor__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:551:1: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:1: ( rule__Factor__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:552:2: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_rule__Factor__Alternatives_in_rulefactor1113);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:564:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:565:1: ( rulenumber EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:566:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber1140);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber1147); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:573:1: rulenumber : ( ( rule__Number__Alternatives ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:577:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:578:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:578:1: ( ( rule__Number__Alternatives ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:579:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:1: ( rule__Number__Alternatives )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:580:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_rulenumber1173);
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


    // $ANTLR start "entryRuleset"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:592:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:593:1: ( ruleset EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:594:1: ruleset EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset1200);
            ruleset();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset1207); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:601:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:605:2: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:606:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:606:1: ( ( rule__Set__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:607:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:1: ( rule__Set__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:608:2: rule__Set__Group__0
            {
            pushFollow(FOLLOW_rule__Set__Group__0_in_ruleset1233);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:620:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:621:1: ( rulefunction_designator EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:622:1: rulefunction_designator EOF
            {
             before(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator1260);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFunction_designatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator1267); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:629:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:633:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:634:1: ( ( rule__Function_designator__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:634:1: ( ( rule__Function_designator__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:635:1: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:1: ( rule__Function_designator__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:636:2: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__0_in_rulefunction_designator1293);
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


    // $ANTLR start "entryRuledeclaration_part"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:648:1: entryRuledeclaration_part : ruledeclaration_part EOF ;
    public final void entryRuledeclaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:649:1: ( ruledeclaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:650:1: ruledeclaration_part EOF
            {
             before(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1320);
            ruledeclaration_part();

            state._fsp--;

             after(grammarAccess.getDeclaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration_part1327); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:657:1: ruledeclaration_part : ( ( rulelabel_declaration_part )? ) ;
    public final void ruledeclaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:661:2: ( ( ( rulelabel_declaration_part )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:662:1: ( ( rulelabel_declaration_part )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:662:1: ( ( rulelabel_declaration_part )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:663:1: ( rulelabel_declaration_part )?
            {
             before(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partParserRuleCall()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:1: ( rulelabel_declaration_part )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LABEL_KEYWORD) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:664:3: rulelabel_declaration_part
                    {
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1354);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:676:1: entryRulelabel_declaration_part : rulelabel_declaration_part EOF ;
    public final void entryRulelabel_declaration_part() throws RecognitionException {
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:677:1: ( rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:678:1: rulelabel_declaration_part EOF
            {
             before(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1382);
            rulelabel_declaration_part();

            state._fsp--;

             after(grammarAccess.getLabel_declaration_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part1389); 

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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:685:1: rulelabel_declaration_part : ( ( rule__Label_declaration_part__Group__0 ) ) ;
    public final void rulelabel_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:689:2: ( ( ( rule__Label_declaration_part__Group__0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:690:1: ( ( rule__Label_declaration_part__Group__0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:690:1: ( ( rule__Label_declaration_part__Group__0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:691:1: ( rule__Label_declaration_part__Group__0 )
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:1: ( rule__Label_declaration_part__Group__0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:692:2: rule__Label_declaration_part__Group__0
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part1415);
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


    // $ANTLR start "rule__Simple_expression__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:704:1: rule__Simple_expression__Alternatives : ( ( ( rule__Simple_expression__Group_0__0 ) ) | ( ( rule__Simple_expression__Group_1__0 ) ) );
    public final void rule__Simple_expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:708:1: ( ( ( rule__Simple_expression__Group_0__0 ) ) | ( ( rule__Simple_expression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INTEGER_NUMBER && LA4_0<=RULE_REAL_NUMBER)||LA4_0==RULE_NOT_KEYWORD||LA4_0==32||LA4_0==37) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=27 && LA4_0<=28)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:709:1: ( ( rule__Simple_expression__Group_0__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:709:1: ( ( rule__Simple_expression__Group_0__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:710:1: ( rule__Simple_expression__Group_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:711:1: ( rule__Simple_expression__Group_0__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:711:2: rule__Simple_expression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_expression__Group_0__0_in_rule__Simple_expression__Alternatives1451);
                    rule__Simple_expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:715:6: ( ( rule__Simple_expression__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:715:6: ( ( rule__Simple_expression__Group_1__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:716:1: ( rule__Simple_expression__Group_1__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_1()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:717:1: ( rule__Simple_expression__Group_1__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:717:2: rule__Simple_expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Simple_expression__Group_1__0_in_rule__Simple_expression__Alternatives1469);
                    rule__Simple_expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Simple_expression__Alternatives"


    // $ANTLR start "rule__Simple_expression__Alternatives_1_0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:726:1: rule__Simple_expression__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Simple_expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:730:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:731:1: ( '+' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:731:1: ( '+' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:732:1: '+'
                    {
                     before(grammarAccess.getSimple_expressionAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,27,FOLLOW_27_in_rule__Simple_expression__Alternatives_1_01503); 
                     after(grammarAccess.getSimple_expressionAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:739:6: ( '-' )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:739:6: ( '-' )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:740:1: '-'
                    {
                     before(grammarAccess.getSimple_expressionAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,28,FOLLOW_28_in_rule__Simple_expression__Alternatives_1_01523); 
                     after(grammarAccess.getSimple_expressionAccess().getHyphenMinusKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Simple_expression__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:752:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:756:1: ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:757:1: ( rulevariable )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:757:1: ( rulevariable )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:758:1: rulevariable
                    {
                     before(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulevariable_in_rule__Factor__Alternatives1557);
                    rulevariable();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:763:6: ( rulenumber )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:763:6: ( rulenumber )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:764:1: rulenumber
                    {
                     before(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulenumber_in_rule__Factor__Alternatives1574);
                    rulenumber();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:769:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:769:6: ( RULE_STRING )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:770:1: RULE_STRING
                    {
                     before(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Factor__Alternatives1591); 
                     after(grammarAccess.getFactorAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:775:6: ( ruleset )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:775:6: ( ruleset )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:776:1: ruleset
                    {
                     before(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleset_in_rule__Factor__Alternatives1608);
                    ruleset();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:781:6: ( RULE_NIL_KEYWORD )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:781:6: ( RULE_NIL_KEYWORD )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:782:1: RULE_NIL_KEYWORD
                    {
                     before(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 
                    match(input,RULE_NIL_KEYWORD,FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives1625); 
                     after(grammarAccess.getFactorAccess().getNIL_KEYWORDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:787:6: ( rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:787:6: ( rulefunction_designator )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:788:1: rulefunction_designator
                    {
                     before(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives1642);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:793:6: ( ( rule__Factor__Group_6__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:793:6: ( ( rule__Factor__Group_6__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:794:1: ( rule__Factor__Group_6__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_6()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:795:1: ( rule__Factor__Group_6__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:795:2: rule__Factor__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives1659);
                    rule__Factor__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:799:6: ( ( rule__Factor__Group_7__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:799:6: ( ( rule__Factor__Group_7__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:800:1: ( rule__Factor__Group_7__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_7()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:801:1: ( rule__Factor__Group_7__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:801:2: rule__Factor__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives1677);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:810:1: rule__Number__Alternatives : ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:814:1: ( ( RULE_INTEGER_NUMBER ) | ( RULE_REAL_NUMBER ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INTEGER_NUMBER) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_REAL_NUMBER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:815:1: ( RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:815:1: ( RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:816:1: RULE_INTEGER_NUMBER
                    {
                     before(grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rule__Number__Alternatives1710); 
                     after(grammarAccess.getNumberAccess().getINTEGER_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:821:6: ( RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:821:6: ( RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:822:1: RULE_REAL_NUMBER
                    {
                     before(grammarAccess.getNumberAccess().getREAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_rule__Number__Alternatives1727); 
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


    // $ANTLR start "rule__Function_designator__Alternatives_1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:832:1: rule__Function_designator__Alternatives_1 : ( ( ( rule__Function_designator__Group_1_0__0 ) ) | ( ( rule__Function_designator__Group_1_1__0 ) ) );
    public final void rule__Function_designator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:836:1: ( ( ( rule__Function_designator__Group_1_0__0 ) ) | ( ( rule__Function_designator__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_INTEGER_NUMBER && LA8_1<=RULE_REAL_NUMBER)||LA8_1==RULE_NOT_KEYWORD||(LA8_1>=27 && LA8_1<=28)||LA8_1==32||LA8_1==37) ) {
                    alt8=1;
                }
                else if ( (LA8_1==33) ) {
                    alt8=2;
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
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:837:1: ( ( rule__Function_designator__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:837:1: ( ( rule__Function_designator__Group_1_0__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:838:1: ( rule__Function_designator__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunction_designatorAccess().getGroup_1_0()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:839:1: ( rule__Function_designator__Group_1_0__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:839:2: rule__Function_designator__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Function_designator__Group_1_0__0_in_rule__Function_designator__Alternatives_11759);
                    rule__Function_designator__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_designatorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:843:6: ( ( rule__Function_designator__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:843:6: ( ( rule__Function_designator__Group_1_1__0 ) )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:844:1: ( rule__Function_designator__Group_1_1__0 )
                    {
                     before(grammarAccess.getFunction_designatorAccess().getGroup_1_1()); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:845:1: ( rule__Function_designator__Group_1_1__0 )
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:845:2: rule__Function_designator__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Function_designator__Group_1_1__0_in_rule__Function_designator__Alternatives_11777);
                    rule__Function_designator__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_designatorAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Function_designator__Alternatives_1"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:856:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:860:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:861:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01808);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01811);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:868:1: rule__Program__Group__0__Impl : ( ruleprogram_heading_block ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:872:1: ( ( ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:873:1: ( ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:873:1: ( ruleprogram_heading_block )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:874:1: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getProgram_heading_blockParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl1838);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:885:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:889:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:890:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11867);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11870);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:897:1: rule__Program__Group__1__Impl : ( ruleblock ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:901:1: ( ( ruleblock ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:902:1: ( ruleblock )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:902:1: ( ruleblock )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:903:1: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleblock_in_rule__Program__Group__1__Impl1897);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:914:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:918:1: ( rule__Program__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:919:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21926);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:925:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:929:1: ( ( '.' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:930:1: ( '.' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:930:1: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:931:1: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Program__Group__2__Impl1954); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:950:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:954:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:955:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__01991);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__01994);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:962:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:966:1: ( ( 'program' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:967:1: ( 'program' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:967:1: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:968:1: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Program_heading_block__Group__0__Impl2022); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:981:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:985:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:986:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12053);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12056);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:993:1: rule__Program_heading_block__Group__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:997:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:998:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:998:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:999:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIDENTIFIERTerminalRuleCall_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl2083); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1010:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1014:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1015:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__22112);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__22115);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1022:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1026:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1027:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1027:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1028:1: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1029:1: ( rule__Program_heading_block__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1029:2: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl2142);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1039:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1043:1: ( rule__Program_heading_block__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1044:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__32173);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1050:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1054:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1055:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1055:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1056:1: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Program_heading_block__Group__3__Impl2201); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1077:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1081:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1082:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__02240);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__02243);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1089:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1093:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1094:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1094:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1095:1: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Program_heading_block__Group_2__0__Impl2271); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1108:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1112:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1113:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__12302);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__12305);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1120:1: rule__Program_heading_block__Group_2__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1124:1: ( ( ruleidentifier_list ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1125:1: ( ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1125:1: ( ruleidentifier_list )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1126:1: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifier_listParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl2332);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1137:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1141:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1142:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__22361);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1148:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1152:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1153:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1153:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1154:1: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,33,FOLLOW_33_in_rule__Program_heading_block__Group_2__2__Impl2389); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1173:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1177:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1178:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__02426);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__02429);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1185:1: rule__Identifier_list__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1189:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1190:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1190:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1191:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl2456); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1202:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1206:1: ( rule__Identifier_list__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1207:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__12485);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1213:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1217:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1218:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1218:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1219:1: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1220:1: ( rule__Identifier_list__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1220:2: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl2512);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1234:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1238:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1239:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__02547);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__02550);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1246:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1250:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1251:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1251:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1252:1: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Identifier_list__Group_1__0__Impl2578); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1265:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1269:1: ( rule__Identifier_list__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1270:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__12609);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1276:1: rule__Identifier_list__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1280:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1281:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1281:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1282:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIdentifier_listAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl2636); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1297:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1301:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1302:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02669);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02672);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1309:1: rule__Block__Group__0__Impl : ( ruledeclaration_part ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1313:1: ( ( ruledeclaration_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1314:1: ( ruledeclaration_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1314:1: ( ruledeclaration_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1315:1: ruledeclaration_part
            {
             before(grammarAccess.getBlockAccess().getDeclaration_partParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl2699);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1326:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1330:1: ( rule__Block__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1331:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12728);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1337:1: rule__Block__Group__1__Impl : ( rulestatement_part ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1341:1: ( ( rulestatement_part ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1342:1: ( rulestatement_part )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1342:1: ( rulestatement_part )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1343:1: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatement_partParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl2755);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1358:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1362:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1363:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__02788);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__02791);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1370:1: rule__Statement_part__Group__0__Impl : ( RULE_BEGIN_KEYWORD ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1374:1: ( ( RULE_BEGIN_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1375:1: ( RULE_BEGIN_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1375:1: ( RULE_BEGIN_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1376:1: RULE_BEGIN_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getBEGIN_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_BEGIN_KEYWORD,FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl2818); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1387:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1391:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1392:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__12847);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__12850);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1399:1: rule__Statement_part__Group__1__Impl : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1403:1: ( ( rulestatement_sequence ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1404:1: ( rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1404:1: ( rulestatement_sequence )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1405:1: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getStatement_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl2877);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1416:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1420:1: ( rule__Statement_part__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1421:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__22906);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1427:1: rule__Statement_part__Group__2__Impl : ( RULE_END_KEYWORD ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1431:1: ( ( RULE_END_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1432:1: ( RULE_END_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1432:1: ( RULE_END_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1433:1: RULE_END_KEYWORD
            {
             before(grammarAccess.getStatement_partAccess().getEND_KEYWORDTerminalRuleCall_2()); 
            match(input,RULE_END_KEYWORD,FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl2933); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1450:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1454:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1455:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__02968);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__02971);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1462:1: rule__Statement_sequence__Group__0__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1466:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1467:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1467:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1468:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl2998);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1479:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1483:1: ( rule__Statement_sequence__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1484:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13027);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1490:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1494:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1495:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1495:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1496:1: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1497:1: ( rule__Statement_sequence__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1497:2: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3054);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1511:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1515:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1516:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__03089);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__03092);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1523:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1527:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1528:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1528:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1529:1: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Statement_sequence__Group_1__0__Impl3120); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1542:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1546:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1547:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__13151);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1553:1: rule__Statement_sequence__Group_1__1__Impl : ( rulestatement ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1557:1: ( ( rulestatement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1558:1: ( rulestatement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1558:1: ( rulestatement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1559:1: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl3178);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1574:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1578:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1579:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__03211);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__03214);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1586:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1590:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1591:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1591:1: ( ( rule__Statement__Group_0__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1592:1: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1593:1: ( rule__Statement__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INTEGER_NUMBER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1593:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl3241);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1603:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1607:1: ( rule__Statement__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1608:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__13272);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1614:1: rule__Statement__Group__1__Impl : ( rulesimple_statement ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1618:1: ( ( rulesimple_statement ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1619:1: ( rulesimple_statement )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1619:1: ( rulesimple_statement )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1620:1: rulesimple_statement
            {
             before(grammarAccess.getStatementAccess().getSimple_statementParserRuleCall_1()); 
            pushFollow(FOLLOW_rulesimple_statement_in_rule__Statement__Group__1__Impl3299);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1635:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1639:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1640:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03332);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03335);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1647:1: rule__Statement__Group_0__0__Impl : ( rulelabel ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1651:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1652:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1652:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1653:1: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl3362);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1664:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1668:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1669:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13391);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1675:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1679:1: ( ( ':' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1680:1: ( ':' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1680:1: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1681:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_0__1__Impl3419); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1698:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1702:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1703:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__03454);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__03457);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1710:1: rule__Assignment_statement__Group__0__Impl : ( rulevariable ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1714:1: ( ( rulevariable ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1715:1: ( rulevariable )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1715:1: ( rulevariable )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1716:1: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl3484);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1727:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1731:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1732:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__13513);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__13516);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1739:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1743:1: ( ( ':=' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1744:1: ( ':=' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1744:1: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1745:1: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Assignment_statement__Group__1__Impl3544); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1758:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1762:1: ( rule__Assignment_statement__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1763:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__23575);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1769:1: rule__Assignment_statement__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1773:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1774:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1774:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1775:1: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl3602);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1792:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1796:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1797:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03637);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03640);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1804:1: rule__Expression__Group__0__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1808:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1809:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1809:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1810:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl3667);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1821:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1825:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1826:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13696);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1832:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1836:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1837:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1837:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1838:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1839:1: ( rule__Expression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_RELATIONAL_OPERATOR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1839:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3723);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1853:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1857:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1858:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03758);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03761);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1865:1: rule__Expression__Group_1__0__Impl : ( RULE_RELATIONAL_OPERATOR ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1869:1: ( ( RULE_RELATIONAL_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1870:1: ( RULE_RELATIONAL_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1870:1: ( RULE_RELATIONAL_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1871:1: RULE_RELATIONAL_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getRELATIONAL_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl3788); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1882:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1886:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1887:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13817);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1893:1: rule__Expression__Group_1__1__Impl : ( rulesimple_expression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1897:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1898:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1898:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1899:1: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl3844);
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


    // $ANTLR start "rule__Simple_expression__Group_0__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1914:1: rule__Simple_expression__Group_0__0 : rule__Simple_expression__Group_0__0__Impl rule__Simple_expression__Group_0__1 ;
    public final void rule__Simple_expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1918:1: ( rule__Simple_expression__Group_0__0__Impl rule__Simple_expression__Group_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1919:2: rule__Simple_expression__Group_0__0__Impl rule__Simple_expression__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_0__0__Impl_in_rule__Simple_expression__Group_0__03877);
            rule__Simple_expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_0__1_in_rule__Simple_expression__Group_0__03880);
            rule__Simple_expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0__0"


    // $ANTLR start "rule__Simple_expression__Group_0__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1926:1: rule__Simple_expression__Group_0__0__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1930:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1931:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1931:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1932:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group_0__0__Impl3907);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_0__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1943:1: rule__Simple_expression__Group_0__1 : rule__Simple_expression__Group_0__1__Impl ;
    public final void rule__Simple_expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1947:1: ( rule__Simple_expression__Group_0__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1948:2: rule__Simple_expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_0__1__Impl_in_rule__Simple_expression__Group_0__13936);
            rule__Simple_expression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0__1"


    // $ANTLR start "rule__Simple_expression__Group_0__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1954:1: rule__Simple_expression__Group_0__1__Impl : ( ( rule__Simple_expression__Group_0_1__0 )* ) ;
    public final void rule__Simple_expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1958:1: ( ( ( rule__Simple_expression__Group_0_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1959:1: ( ( rule__Simple_expression__Group_0_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1959:1: ( ( rule__Simple_expression__Group_0_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1960:1: ( rule__Simple_expression__Group_0_1__0 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_0_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1961:1: ( rule__Simple_expression__Group_0_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ADDITION_OPERATOR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1961:2: rule__Simple_expression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Simple_expression__Group_0_1__0_in_rule__Simple_expression__Group_0__1__Impl3963);
            	    rule__Simple_expression__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSimple_expressionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group_0_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1975:1: rule__Simple_expression__Group_0_1__0 : rule__Simple_expression__Group_0_1__0__Impl rule__Simple_expression__Group_0_1__1 ;
    public final void rule__Simple_expression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1979:1: ( rule__Simple_expression__Group_0_1__0__Impl rule__Simple_expression__Group_0_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1980:2: rule__Simple_expression__Group_0_1__0__Impl rule__Simple_expression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_0_1__0__Impl_in_rule__Simple_expression__Group_0_1__03998);
            rule__Simple_expression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_0_1__1_in_rule__Simple_expression__Group_0_1__04001);
            rule__Simple_expression__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0_1__0"


    // $ANTLR start "rule__Simple_expression__Group_0_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1987:1: rule__Simple_expression__Group_0_1__0__Impl : ( RULE_ADDITION_OPERATOR ) ;
    public final void rule__Simple_expression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1991:1: ( ( RULE_ADDITION_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1992:1: ( RULE_ADDITION_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1992:1: ( RULE_ADDITION_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1993:1: RULE_ADDITION_OPERATOR
            {
             before(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0_1_0()); 
            match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group_0_1__0__Impl4028); 
             after(grammarAccess.getSimple_expressionAccess().getADDITION_OPERATORTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0_1__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_0_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2004:1: rule__Simple_expression__Group_0_1__1 : rule__Simple_expression__Group_0_1__1__Impl ;
    public final void rule__Simple_expression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2008:1: ( rule__Simple_expression__Group_0_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2009:2: rule__Simple_expression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_0_1__1__Impl_in_rule__Simple_expression__Group_0_1__14057);
            rule__Simple_expression__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0_1__1"


    // $ANTLR start "rule__Simple_expression__Group_0_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2015:1: rule__Simple_expression__Group_0_1__1__Impl : ( ruleterm ) ;
    public final void rule__Simple_expression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2019:1: ( ( ruleterm ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2020:1: ( ruleterm )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2020:1: ( ruleterm )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2021:1: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleterm_in_rule__Simple_expression__Group_0_1__1__Impl4084);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermParserRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_0_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2036:1: rule__Simple_expression__Group_1__0 : rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 ;
    public final void rule__Simple_expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2040:1: ( rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2041:2: rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_1__0__Impl_in_rule__Simple_expression__Group_1__04117);
            rule__Simple_expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_expression__Group_1__1_in_rule__Simple_expression__Group_1__04120);
            rule__Simple_expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__0"


    // $ANTLR start "rule__Simple_expression__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2048:1: rule__Simple_expression__Group_1__0__Impl : ( ( rule__Simple_expression__Alternatives_1_0 ) ) ;
    public final void rule__Simple_expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2052:1: ( ( ( rule__Simple_expression__Alternatives_1_0 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2053:1: ( ( rule__Simple_expression__Alternatives_1_0 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2053:1: ( ( rule__Simple_expression__Alternatives_1_0 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2054:1: ( rule__Simple_expression__Alternatives_1_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_1_0()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2055:1: ( rule__Simple_expression__Alternatives_1_0 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2055:2: rule__Simple_expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Simple_expression__Alternatives_1_0_in_rule__Simple_expression__Group_1__0__Impl4147);
            rule__Simple_expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2065:1: rule__Simple_expression__Group_1__1 : rule__Simple_expression__Group_1__1__Impl ;
    public final void rule__Simple_expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2069:1: ( rule__Simple_expression__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2070:2: rule__Simple_expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_expression__Group_1__1__Impl_in_rule__Simple_expression__Group_1__14177);
            rule__Simple_expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__1"


    // $ANTLR start "rule__Simple_expression__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2076:1: rule__Simple_expression__Group_1__1__Impl : ( rulesimple_expression ) ;
    public final void rule__Simple_expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2080:1: ( ( rulesimple_expression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2081:1: ( rulesimple_expression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2081:1: ( rulesimple_expression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2082:1: rulesimple_expression
            {
             before(grammarAccess.getSimple_expressionAccess().getSimple_expressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulesimple_expression_in_rule__Simple_expression__Group_1__1__Impl4204);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getSimple_expressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2097:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2101:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2102:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04237);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04240);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2109:1: rule__Term__Group__0__Impl : ( rulefactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2113:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2114:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2114:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2115:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group__0__Impl4267);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2126:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2130:1: ( rule__Term__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2131:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14296);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2137:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2141:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2142:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2142:1: ( ( rule__Term__Group_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2143:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2144:1: ( rule__Term__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2144:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4323);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2158:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2162:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2163:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04358);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04361);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2170:1: rule__Term__Group_1__0__Impl : ( RULE_MULTIPLICATION_OPERATOR ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2174:1: ( ( RULE_MULTIPLICATION_OPERATOR ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2175:1: ( RULE_MULTIPLICATION_OPERATOR )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2175:1: ( RULE_MULTIPLICATION_OPERATOR )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2176:1: RULE_MULTIPLICATION_OPERATOR
            {
             before(grammarAccess.getTermAccess().getMULTIPLICATION_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl4388); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2187:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2191:1: ( rule__Term__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2192:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14417);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2198:1: rule__Term__Group_1__1__Impl : ( rulefactor ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2202:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2203:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2203:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2204:1: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl4444);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2219:1: rule__Factor__Group_6__0 : rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 ;
    public final void rule__Factor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2223:1: ( rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2224:2: rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__04477);
            rule__Factor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__04480);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2231:1: rule__Factor__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2235:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2236:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2236:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2237:1: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,32,FOLLOW_32_in_rule__Factor__Group_6__0__Impl4508); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2250:1: rule__Factor__Group_6__1 : rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 ;
    public final void rule__Factor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2254:1: ( rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2255:2: rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__14539);
            rule__Factor__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__14542);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2262:1: rule__Factor__Group_6__1__Impl : ( ruleexpression ) ;
    public final void rule__Factor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2266:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2267:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2267:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2268:1: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl4569);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2279:1: rule__Factor__Group_6__2 : rule__Factor__Group_6__2__Impl ;
    public final void rule__Factor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2283:1: ( rule__Factor__Group_6__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2284:2: rule__Factor__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__24598);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2290:1: rule__Factor__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2294:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2295:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2295:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2296:1: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
            match(input,33,FOLLOW_33_in_rule__Factor__Group_6__2__Impl4626); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2315:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2319:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2320:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__04663);
            rule__Factor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__04666);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2327:1: rule__Factor__Group_7__0__Impl : ( RULE_NOT_KEYWORD ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2331:1: ( ( RULE_NOT_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2332:1: ( RULE_NOT_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2332:1: ( RULE_NOT_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2333:1: RULE_NOT_KEYWORD
            {
             before(grammarAccess.getFactorAccess().getNOT_KEYWORDTerminalRuleCall_7_0()); 
            match(input,RULE_NOT_KEYWORD,FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl4693); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2344:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2348:1: ( rule__Factor__Group_7__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2349:2: rule__Factor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__14722);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2355:1: rule__Factor__Group_7__1__Impl : ( rulefactor ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2359:1: ( ( rulefactor ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2360:1: ( rulefactor )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2360:1: ( rulefactor )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2361:1: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorParserRuleCall_7_1()); 
            pushFollow(FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl4749);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2376:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2380:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2381:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04782);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04785);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2388:1: rule__Set__Group__0__Impl : ( '[' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2392:1: ( ( '[' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2393:1: ( '[' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2393:1: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2394:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Set__Group__0__Impl4813); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2407:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2411:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2412:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14844);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14847);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2419:1: rule__Set__Group__1__Impl : ( ( rule__Set__Group_1__0 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2423:1: ( ( ( rule__Set__Group_1__0 )? ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2424:1: ( ( rule__Set__Group_1__0 )? )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2424:1: ( ( rule__Set__Group_1__0 )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2425:1: ( rule__Set__Group_1__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2426:1: ( rule__Set__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INTEGER_NUMBER && LA16_0<=RULE_REAL_NUMBER)||LA16_0==RULE_NOT_KEYWORD||(LA16_0>=27 && LA16_0<=28)||LA16_0==32||LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2426:2: rule__Set__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Set__Group_1__0_in_rule__Set__Group__1__Impl4874);
                    rule__Set__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2436:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2440:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2441:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24905);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2447:1: rule__Set__Group__2__Impl : ( ']' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2451:1: ( ( ']' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2452:1: ( ']' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2452:1: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2453:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Set__Group__2__Impl4933); 
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


    // $ANTLR start "rule__Set__Group_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2472:1: rule__Set__Group_1__0 : rule__Set__Group_1__0__Impl rule__Set__Group_1__1 ;
    public final void rule__Set__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2476:1: ( rule__Set__Group_1__0__Impl rule__Set__Group_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2477:2: rule__Set__Group_1__0__Impl rule__Set__Group_1__1
            {
            pushFollow(FOLLOW_rule__Set__Group_1__0__Impl_in_rule__Set__Group_1__04970);
            rule__Set__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group_1__1_in_rule__Set__Group_1__04973);
            rule__Set__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__0"


    // $ANTLR start "rule__Set__Group_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2484:1: rule__Set__Group_1__0__Impl : ( ruleexpression ) ;
    public final void rule__Set__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2488:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2489:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2489:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2490:1: ruleexpression
            {
             before(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Set__Group_1__0__Impl5000);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__0__Impl"


    // $ANTLR start "rule__Set__Group_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2501:1: rule__Set__Group_1__1 : rule__Set__Group_1__1__Impl ;
    public final void rule__Set__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2505:1: ( rule__Set__Group_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2506:2: rule__Set__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group_1__1__Impl_in_rule__Set__Group_1__15029);
            rule__Set__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__1"


    // $ANTLR start "rule__Set__Group_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2512:1: rule__Set__Group_1__1__Impl : ( ( rule__Set__Group_1_1__0 )* ) ;
    public final void rule__Set__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2516:1: ( ( ( rule__Set__Group_1_1__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2517:1: ( ( rule__Set__Group_1_1__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2517:1: ( ( rule__Set__Group_1_1__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2518:1: ( rule__Set__Group_1_1__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_1_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2519:1: ( rule__Set__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2519:2: rule__Set__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Set__Group_1_1__0_in_rule__Set__Group_1__1__Impl5056);
            	    rule__Set__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__1__Impl"


    // $ANTLR start "rule__Set__Group_1_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2533:1: rule__Set__Group_1_1__0 : rule__Set__Group_1_1__0__Impl rule__Set__Group_1_1__1 ;
    public final void rule__Set__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2537:1: ( rule__Set__Group_1_1__0__Impl rule__Set__Group_1_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2538:2: rule__Set__Group_1_1__0__Impl rule__Set__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Set__Group_1_1__0__Impl_in_rule__Set__Group_1_1__05091);
            rule__Set__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group_1_1__1_in_rule__Set__Group_1_1__05094);
            rule__Set__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1_1__0"


    // $ANTLR start "rule__Set__Group_1_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2545:1: rule__Set__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2549:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2550:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2550:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2551:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_1_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Set__Group_1_1__0__Impl5122); 
             after(grammarAccess.getSetAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1_1__0__Impl"


    // $ANTLR start "rule__Set__Group_1_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2564:1: rule__Set__Group_1_1__1 : rule__Set__Group_1_1__1__Impl ;
    public final void rule__Set__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2568:1: ( rule__Set__Group_1_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2569:2: rule__Set__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group_1_1__1__Impl_in_rule__Set__Group_1_1__15153);
            rule__Set__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1_1__1"


    // $ANTLR start "rule__Set__Group_1_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2575:1: rule__Set__Group_1_1__1__Impl : ( ruleexpression ) ;
    public final void rule__Set__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2579:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2580:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2580:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2581:1: ruleexpression
            {
             before(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Set__Group_1_1__1__Impl5180);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getSetAccess().getExpressionParserRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1_1__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2596:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2600:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2601:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__05213);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__05216);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2608:1: rule__Function_designator__Group__0__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2612:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2613:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2613:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2614:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getFunction_designatorAccess().getIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl5243); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2625:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2629:1: ( rule__Function_designator__Group__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2630:2: rule__Function_designator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__15272);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2636:1: rule__Function_designator__Group__1__Impl : ( ( rule__Function_designator__Alternatives_1 ) ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2640:1: ( ( ( rule__Function_designator__Alternatives_1 ) ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2641:1: ( ( rule__Function_designator__Alternatives_1 ) )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2641:1: ( ( rule__Function_designator__Alternatives_1 ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2642:1: ( rule__Function_designator__Alternatives_1 )
            {
             before(grammarAccess.getFunction_designatorAccess().getAlternatives_1()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2643:1: ( rule__Function_designator__Alternatives_1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2643:2: rule__Function_designator__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Function_designator__Alternatives_1_in_rule__Function_designator__Group__1__Impl5299);
            rule__Function_designator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function_designator__Group_1_0__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2657:1: rule__Function_designator__Group_1_0__0 : rule__Function_designator__Group_1_0__0__Impl rule__Function_designator__Group_1_0__1 ;
    public final void rule__Function_designator__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2661:1: ( rule__Function_designator__Group_1_0__0__Impl rule__Function_designator__Group_1_0__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2662:2: rule__Function_designator__Group_1_0__0__Impl rule__Function_designator__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__0__Impl_in_rule__Function_designator__Group_1_0__05333);
            rule__Function_designator__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__1_in_rule__Function_designator__Group_1_0__05336);
            rule__Function_designator__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__0"


    // $ANTLR start "rule__Function_designator__Group_1_0__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2669:1: rule__Function_designator__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2673:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2674:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2674:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2675:1: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Function_designator__Group_1_0__0__Impl5364); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__0__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_0__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2688:1: rule__Function_designator__Group_1_0__1 : rule__Function_designator__Group_1_0__1__Impl rule__Function_designator__Group_1_0__2 ;
    public final void rule__Function_designator__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2692:1: ( rule__Function_designator__Group_1_0__1__Impl rule__Function_designator__Group_1_0__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2693:2: rule__Function_designator__Group_1_0__1__Impl rule__Function_designator__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__1__Impl_in_rule__Function_designator__Group_1_0__15395);
            rule__Function_designator__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__2_in_rule__Function_designator__Group_1_0__15398);
            rule__Function_designator__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__1"


    // $ANTLR start "rule__Function_designator__Group_1_0__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2700:1: rule__Function_designator__Group_1_0__1__Impl : ( ruleexpression ) ;
    public final void rule__Function_designator__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2704:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2705:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2705:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2706:1: ruleexpression
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Function_designator__Group_1_0__1__Impl5425);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__1__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_0__2"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2717:1: rule__Function_designator__Group_1_0__2 : rule__Function_designator__Group_1_0__2__Impl rule__Function_designator__Group_1_0__3 ;
    public final void rule__Function_designator__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2721:1: ( rule__Function_designator__Group_1_0__2__Impl rule__Function_designator__Group_1_0__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2722:2: rule__Function_designator__Group_1_0__2__Impl rule__Function_designator__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__2__Impl_in_rule__Function_designator__Group_1_0__25454);
            rule__Function_designator__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__3_in_rule__Function_designator__Group_1_0__25457);
            rule__Function_designator__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__2"


    // $ANTLR start "rule__Function_designator__Group_1_0__2__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2729:1: rule__Function_designator__Group_1_0__2__Impl : ( ( rule__Function_designator__Group_1_0_2__0 )* ) ;
    public final void rule__Function_designator__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2733:1: ( ( ( rule__Function_designator__Group_1_0_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2734:1: ( ( rule__Function_designator__Group_1_0_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2734:1: ( ( rule__Function_designator__Group_1_0_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2735:1: ( rule__Function_designator__Group_1_0_2__0 )*
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup_1_0_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2736:1: ( rule__Function_designator__Group_1_0_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2736:2: rule__Function_designator__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Function_designator__Group_1_0_2__0_in_rule__Function_designator__Group_1_0__2__Impl5484);
            	    rule__Function_designator__Group_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFunction_designatorAccess().getGroup_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__2__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_0__3"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2746:1: rule__Function_designator__Group_1_0__3 : rule__Function_designator__Group_1_0__3__Impl ;
    public final void rule__Function_designator__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2750:1: ( rule__Function_designator__Group_1_0__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2751:2: rule__Function_designator__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0__3__Impl_in_rule__Function_designator__Group_1_0__35515);
            rule__Function_designator__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__3"


    // $ANTLR start "rule__Function_designator__Group_1_0__3__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2757:1: rule__Function_designator__Group_1_0__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2761:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2762:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2762:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2763:1: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_0_3()); 
            match(input,33,FOLLOW_33_in_rule__Function_designator__Group_1_0__3__Impl5543); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0__3__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_0_2__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2784:1: rule__Function_designator__Group_1_0_2__0 : rule__Function_designator__Group_1_0_2__0__Impl rule__Function_designator__Group_1_0_2__1 ;
    public final void rule__Function_designator__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2788:1: ( rule__Function_designator__Group_1_0_2__0__Impl rule__Function_designator__Group_1_0_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2789:2: rule__Function_designator__Group_1_0_2__0__Impl rule__Function_designator__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0_2__0__Impl_in_rule__Function_designator__Group_1_0_2__05582);
            rule__Function_designator__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group_1_0_2__1_in_rule__Function_designator__Group_1_0_2__05585);
            rule__Function_designator__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0_2__0"


    // $ANTLR start "rule__Function_designator__Group_1_0_2__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2796:1: rule__Function_designator__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__Function_designator__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2800:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2801:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2801:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2802:1: ','
            {
             before(grammarAccess.getFunction_designatorAccess().getCommaKeyword_1_0_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Function_designator__Group_1_0_2__0__Impl5613); 
             after(grammarAccess.getFunction_designatorAccess().getCommaKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_0_2__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2815:1: rule__Function_designator__Group_1_0_2__1 : rule__Function_designator__Group_1_0_2__1__Impl ;
    public final void rule__Function_designator__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2819:1: ( rule__Function_designator__Group_1_0_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2820:2: rule__Function_designator__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_0_2__1__Impl_in_rule__Function_designator__Group_1_0_2__15644);
            rule__Function_designator__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0_2__1"


    // $ANTLR start "rule__Function_designator__Group_1_0_2__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2826:1: rule__Function_designator__Group_1_0_2__1__Impl : ( ruleexpression ) ;
    public final void rule__Function_designator__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2830:1: ( ( ruleexpression ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2831:1: ( ruleexpression )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2831:1: ( ruleexpression )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2832:1: ruleexpression
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_2_1()); 
            pushFollow(FOLLOW_ruleexpression_in_rule__Function_designator__Group_1_0_2__1__Impl5671);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getExpressionParserRuleCall_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_1__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2847:1: rule__Function_designator__Group_1_1__0 : rule__Function_designator__Group_1_1__0__Impl rule__Function_designator__Group_1_1__1 ;
    public final void rule__Function_designator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2851:1: ( rule__Function_designator__Group_1_1__0__Impl rule__Function_designator__Group_1_1__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2852:2: rule__Function_designator__Group_1_1__0__Impl rule__Function_designator__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_1__0__Impl_in_rule__Function_designator__Group_1_1__05704);
            rule__Function_designator__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function_designator__Group_1_1__1_in_rule__Function_designator__Group_1_1__05707);
            rule__Function_designator__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_1__0"


    // $ANTLR start "rule__Function_designator__Group_1_1__0__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2859:1: rule__Function_designator__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2863:1: ( ( '(' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2864:1: ( '(' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2864:1: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2865:1: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Function_designator__Group_1_1__0__Impl5735); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_1__0__Impl"


    // $ANTLR start "rule__Function_designator__Group_1_1__1"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2878:1: rule__Function_designator__Group_1_1__1 : rule__Function_designator__Group_1_1__1__Impl ;
    public final void rule__Function_designator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2882:1: ( rule__Function_designator__Group_1_1__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2883:2: rule__Function_designator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Function_designator__Group_1_1__1__Impl_in_rule__Function_designator__Group_1_1__15766);
            rule__Function_designator__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_1__1"


    // $ANTLR start "rule__Function_designator__Group_1_1__1__Impl"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2889:1: rule__Function_designator__Group_1_1__1__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2893:1: ( ( ')' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2894:1: ( ')' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2894:1: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2895:1: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_1_1()); 
            match(input,33,FOLLOW_33_in_rule__Function_designator__Group_1_1__1__Impl5794); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group_1_1__1__Impl"


    // $ANTLR start "rule__Label_declaration_part__Group__0"
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2912:1: rule__Label_declaration_part__Group__0 : rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 ;
    public final void rule__Label_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2916:1: ( rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2917:2: rule__Label_declaration_part__Group__0__Impl rule__Label_declaration_part__Group__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__05829);
            rule__Label_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__05832);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2924:1: rule__Label_declaration_part__Group__0__Impl : ( RULE_LABEL_KEYWORD ) ;
    public final void rule__Label_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2928:1: ( ( RULE_LABEL_KEYWORD ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2929:1: ( RULE_LABEL_KEYWORD )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2929:1: ( RULE_LABEL_KEYWORD )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2930:1: RULE_LABEL_KEYWORD
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLABEL_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_LABEL_KEYWORD,FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl5859); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2941:1: rule__Label_declaration_part__Group__1 : rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 ;
    public final void rule__Label_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2945:1: ( rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2946:2: rule__Label_declaration_part__Group__1__Impl rule__Label_declaration_part__Group__2
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__15888);
            rule__Label_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__15891);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2953:1: rule__Label_declaration_part__Group__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2957:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2958:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2958:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2959:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl5918);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2970:1: rule__Label_declaration_part__Group__2 : rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 ;
    public final void rule__Label_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2974:1: ( rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2975:2: rule__Label_declaration_part__Group__2__Impl rule__Label_declaration_part__Group__3
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__25947);
            rule__Label_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__25950);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2982:1: rule__Label_declaration_part__Group__2__Impl : ( ( rule__Label_declaration_part__Group_2__0 )* ) ;
    public final void rule__Label_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2986:1: ( ( ( rule__Label_declaration_part__Group_2__0 )* ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2987:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2987:1: ( ( rule__Label_declaration_part__Group_2__0 )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2988:1: ( rule__Label_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declaration_partAccess().getGroup_2()); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2989:1: ( rule__Label_declaration_part__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2989:2: rule__Label_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl5977);
            	    rule__Label_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:2999:1: rule__Label_declaration_part__Group__3 : rule__Label_declaration_part__Group__3__Impl ;
    public final void rule__Label_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3003:1: ( rule__Label_declaration_part__Group__3__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3004:2: rule__Label_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__36008);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3010:1: rule__Label_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3014:1: ( ( ';' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3015:1: ( ';' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3015:1: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3016:1: ';'
            {
             before(grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Label_declaration_part__Group__3__Impl6036); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3037:1: rule__Label_declaration_part__Group_2__0 : rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 ;
    public final void rule__Label_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3041:1: ( rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1 )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3042:2: rule__Label_declaration_part__Group_2__0__Impl rule__Label_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__06075);
            rule__Label_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__06078);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3049:1: rule__Label_declaration_part__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3053:1: ( ( ',' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3054:1: ( ',' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3054:1: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3055:1: ','
            {
             before(grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Label_declaration_part__Group_2__0__Impl6106); 
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3068:1: rule__Label_declaration_part__Group_2__1 : rule__Label_declaration_part__Group_2__1__Impl ;
    public final void rule__Label_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3072:1: ( rule__Label_declaration_part__Group_2__1__Impl )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3073:2: rule__Label_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__16137);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3079:1: rule__Label_declaration_part__Group_2__1__Impl : ( rulelabel ) ;
    public final void rule__Label_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3083:1: ( ( rulelabel ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3084:1: ( rulelabel )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3084:1: ( rulelabel )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3085:1: rulelabel
            {
             before(grammarAccess.getLabel_declaration_partAccess().getLabelParserRuleCall_2_1()); 
            pushFollow(FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl6164);
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
    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3101:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3105:1: ( ( ruleprogram ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3106:1: ( ruleprogram )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3106:1: ( ruleprogram )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3107:1: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment6202);
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA6_minS =
        "\1\4\1\12\10\uffff";
    static final String DFA6_maxS =
        "\1\45\1\46\10\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\1\1\6";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\1\1\3\1\5\1\2\5\uffff\1\7\21\uffff\1\6\4\uffff\1\4",
            "\4\10\21\uffff\1\10\1\11\2\10\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "752:1: rule__Factor__Alternatives : ( ( rulevariable ) | ( rulenumber ) | ( RULE_STRING ) | ( ruleset ) | ( RULE_NIL_KEYWORD ) | ( rulefunction_designator ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) );";
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
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_in_rulesimple_expression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleterm1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Alternatives_in_rulefactor1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_rulenumber1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleset1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__0_in_rulefunction_designator1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_entryRuledeclaration_part1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration_part1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruledeclaration_part1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0_in_rulelabel_declaration_part1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0__0_in_rule__Simple_expression__Alternatives1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_1__0_in_rule__Simple_expression__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Simple_expression__Alternatives_1_01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Simple_expression__Alternatives_1_01523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Factor__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Factor__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Factor__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rule__Factor__Alternatives1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NIL_KEYWORD_in_rule__Factor__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rule__Factor__Alternatives1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0_in_rule__Factor__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0_in_rule__Factor__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rule__Number__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_rule__Number__Alternatives1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__0_in_rule__Function_designator__Alternatives_11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_1__0_in_rule__Function_designator__Alternatives_11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01808 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_rule__Program__Group__0__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11867 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Program__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Program__Group__2__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__0__Impl_in_rule__Program_heading_block__Group__01991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1_in_rule__Program_heading_block__Group__01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Program_heading_block__Group__0__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__1__Impl_in_rule__Program_heading_block__Group__12053 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2_in_rule__Program_heading_block__Group__12056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Program_heading_block__Group__1__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__2__Impl_in_rule__Program_heading_block__Group__22112 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3_in_rule__Program_heading_block__Group__22115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0_in_rule__Program_heading_block__Group__2__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group__3__Impl_in_rule__Program_heading_block__Group__32173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Program_heading_block__Group__3__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__0__Impl_in_rule__Program_heading_block__Group_2__02240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1_in_rule__Program_heading_block__Group_2__02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Program_heading_block__Group_2__0__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__1__Impl_in_rule__Program_heading_block__Group_2__12302 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2_in_rule__Program_heading_block__Group_2__12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rule__Program_heading_block__Group_2__1__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program_heading_block__Group_2__2__Impl_in_rule__Program_heading_block__Group_2__22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Program_heading_block__Group_2__2__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__0__Impl_in_rule__Identifier_list__Group__02426 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1_in_rule__Identifier_list__Group__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group__1__Impl_in_rule__Identifier_list__Group__12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0_in_rule__Identifier_list__Group__1__Impl2512 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__0__Impl_in_rule__Identifier_list__Group_1__02547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1_in_rule__Identifier_list__Group_1__02550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Identifier_list__Group_1__0__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier_list__Group_1__1__Impl_in_rule__Identifier_list__Group_1__12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Identifier_list__Group_1__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02669 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_part_in_rule__Block__Group__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_rule__Block__Group__1__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__0__Impl_in_rule__Statement_part__Group__02788 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1_in_rule__Statement_part__Group__02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_KEYWORD_in_rule__Statement_part__Group__0__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__1__Impl_in_rule__Statement_part__Group__12847 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2_in_rule__Statement_part__Group__12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rule__Statement_part__Group__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_part__Group__2__Impl_in_rule__Statement_part__Group__22906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_KEYWORD_in_rule__Statement_part__Group__2__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__0__Impl_in_rule__Statement_sequence__Group__02968 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1_in_rule__Statement_sequence__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group__1__Impl_in_rule__Statement_sequence__Group__13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0_in_rule__Statement_sequence__Group__1__Impl3054 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__0__Impl_in_rule__Statement_sequence__Group_1__03089 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1_in_rule__Statement_sequence__Group_1__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement_sequence__Group_1__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_sequence__Group_1__1__Impl_in_rule__Statement_sequence__Group_1__13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement_sequence__Group_1__1__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__03211 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Group__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__13272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rule__Statement__Group__1__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03332 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Statement__Group_0__0__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_0__1__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__0__Impl_in_rule__Assignment_statement__Group__03454 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1_in_rule__Assignment_statement__Group__03457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rule__Assignment_statement__Group__0__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__1__Impl_in_rule__Assignment_statement__Group__13513 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2_in_rule__Assignment_statement__Group__13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Assignment_statement__Group__1__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment_statement__Group__2__Impl_in_rule__Assignment_statement__Group__23575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Assignment_statement__Group__2__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03637 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group__0__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03758 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_rule__Expression__Group_1__0__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Expression__Group_1__1__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0__0__Impl_in_rule__Simple_expression__Group_0__03877 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0__1_in_rule__Simple_expression__Group_0__03880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group_0__0__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0__1__Impl_in_rule__Simple_expression__Group_0__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0_1__0_in_rule__Simple_expression__Group_0__1__Impl3963 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0_1__0__Impl_in_rule__Simple_expression__Group_0_1__03998 = new BitSet(new long[]{0x00000021000041F0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0_1__1_in_rule__Simple_expression__Group_0_1__04001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rule__Simple_expression__Group_0_1__0__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_0_1__1__Impl_in_rule__Simple_expression__Group_0_1__14057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__Simple_expression__Group_0_1__1__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_1__0__Impl_in_rule__Simple_expression__Group_1__04117 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_1__1_in_rule__Simple_expression__Group_1__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Alternatives_1_0_in_rule__Simple_expression__Group_1__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_expression__Group_1__1__Impl_in_rule__Simple_expression__Group_1__14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_rule__Simple_expression__Group_1__1__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group__0__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4323 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04358 = new BitSet(new long[]{0x00000021000041F0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_rule__Term__Group_1__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Term__Group_1__1__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__0__Impl_in_rule__Factor__Group_6__04477 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1_in_rule__Factor__Group_6__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Factor__Group_6__0__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__1__Impl_in_rule__Factor__Group_6__14539 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2_in_rule__Factor__Group_6__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Factor__Group_6__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_6__2__Impl_in_rule__Factor__Group_6__24598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Factor__Group_6__2__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__0__Impl_in_rule__Factor__Group_7__04663 = new BitSet(new long[]{0x00000021000041F0L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1_in_rule__Factor__Group_7__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_KEYWORD_in_rule__Factor__Group_7__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_7__1__Impl_in_rule__Factor__Group_7__14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_rule__Factor__Group_7__1__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04782 = new BitSet(new long[]{0x00000061180041F0L});
    public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Set__Group__0__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14844 = new BitSet(new long[]{0x00000061180041F0L});
    public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1__0_in_rule__Set__Group__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Set__Group__2__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1__0__Impl_in_rule__Set__Group_1__04970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Set__Group_1__1_in_rule__Set__Group_1__04973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Set__Group_1__0__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1__1__Impl_in_rule__Set__Group_1__15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1_1__0_in_rule__Set__Group_1__1__Impl5056 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1_1__0__Impl_in_rule__Set__Group_1_1__05091 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Set__Group_1_1__1_in_rule__Set__Group_1_1__05094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Set__Group_1_1__0__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_1_1__1__Impl_in_rule__Set__Group_1_1__15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Set__Group_1_1__1__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__0__Impl_in_rule__Function_designator__Group__05213 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1_in_rule__Function_designator__Group__05216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Function_designator__Group__0__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group__1__Impl_in_rule__Function_designator__Group__15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Alternatives_1_in_rule__Function_designator__Group__1__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__0__Impl_in_rule__Function_designator__Group_1_0__05333 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__1_in_rule__Function_designator__Group_1_0__05336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Function_designator__Group_1_0__0__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__1__Impl_in_rule__Function_designator__Group_1_0__15395 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__2_in_rule__Function_designator__Group_1_0__15398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Function_designator__Group_1_0__1__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__2__Impl_in_rule__Function_designator__Group_1_0__25454 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__3_in_rule__Function_designator__Group_1_0__25457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0_2__0_in_rule__Function_designator__Group_1_0__2__Impl5484 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0__3__Impl_in_rule__Function_designator__Group_1_0__35515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function_designator__Group_1_0__3__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0_2__0__Impl_in_rule__Function_designator__Group_1_0_2__05582 = new BitSet(new long[]{0x00000021180041F0L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0_2__1_in_rule__Function_designator__Group_1_0_2__05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function_designator__Group_1_0_2__0__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_0_2__1__Impl_in_rule__Function_designator__Group_1_0_2__15644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_rule__Function_designator__Group_1_0_2__1__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_1__0__Impl_in_rule__Function_designator__Group_1_1__05704 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_1__1_in_rule__Function_designator__Group_1_1__05707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Function_designator__Group_1_1__0__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function_designator__Group_1_1__1__Impl_in_rule__Function_designator__Group_1_1__15766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function_designator__Group_1_1__1__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__0__Impl_in_rule__Label_declaration_part__Group__05829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1_in_rule__Label_declaration_part__Group__05832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABEL_KEYWORD_in_rule__Label_declaration_part__Group__0__Impl5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__1__Impl_in_rule__Label_declaration_part__Group__15888 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2_in_rule__Label_declaration_part__Group__15891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group__1__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__2__Impl_in_rule__Label_declaration_part__Group__25947 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3_in_rule__Label_declaration_part__Group__25950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0_in_rule__Label_declaration_part__Group__2__Impl5977 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group__3__Impl_in_rule__Label_declaration_part__Group__36008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Label_declaration_part__Group__3__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__0__Impl_in_rule__Label_declaration_part__Group_2__06075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1_in_rule__Label_declaration_part__Group_2__06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Label_declaration_part__Group_2__0__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label_declaration_part__Group_2__1__Impl_in_rule__Label_declaration_part__Group_2__16137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rule__Label_declaration_part__Group_2__1__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rule__Pascal__ProgramAssignment6202 = new BitSet(new long[]{0x0000000000000002L});

}