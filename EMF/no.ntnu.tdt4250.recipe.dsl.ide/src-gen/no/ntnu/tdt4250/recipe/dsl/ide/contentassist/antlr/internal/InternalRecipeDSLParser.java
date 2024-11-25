package no.ntnu.tdt4250.recipe.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import no.ntnu.tdt4250.recipe.dsl.services.RecipeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'", "'Page'", "'{'", "'instructions'", "'ingredients'", "'header'", "'}'", "'nutrients'", "'Instructions'", "'orderNumber'", "'Ingredients'", "'unittoggle'", "'Header'", "'basicinformation'", "'recipetitle'", "'image'", "'Nutrients'", "'percentagetoggle'", "'vitamins'", "'macronutrients'", "'-'", "'UnitOfMeasure'", "'BasicInformation'", "'Title'", "'Image'", "'PercentageAmountToggle'", "'Vitamins'", "'Vitamin'", "','", "'Macronutrients'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRecipeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecipeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecipeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecipeDSL.g"; }


    	private RecipeDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(RecipeDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePage"
    // InternalRecipeDSL.g:53:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:54:1: ( rulePage EOF )
            // InternalRecipeDSL.g:55:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalRecipeDSL.g:62:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:66:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalRecipeDSL.g:67:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalRecipeDSL.g:67:2: ( ( rule__Page__Group__0 ) )
            // InternalRecipeDSL.g:68:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalRecipeDSL.g:69:3: ( rule__Page__Group__0 )
            // InternalRecipeDSL.g:69:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipeDSL.g:78:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:79:1: ( ruleInstructions EOF )
            // InternalRecipeDSL.g:80:1: ruleInstructions EOF
            {
             before(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getInstructionsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalRecipeDSL.g:87:1: ruleInstructions : ( ( rule__Instructions__Group__0 ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:91:2: ( ( ( rule__Instructions__Group__0 ) ) )
            // InternalRecipeDSL.g:92:2: ( ( rule__Instructions__Group__0 ) )
            {
            // InternalRecipeDSL.g:92:2: ( ( rule__Instructions__Group__0 ) )
            // InternalRecipeDSL.g:93:3: ( rule__Instructions__Group__0 )
            {
             before(grammarAccess.getInstructionsAccess().getGroup()); 
            // InternalRecipeDSL.g:94:3: ( rule__Instructions__Group__0 )
            // InternalRecipeDSL.g:94:4: rule__Instructions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleIngredients"
    // InternalRecipeDSL.g:103:1: entryRuleIngredients : ruleIngredients EOF ;
    public final void entryRuleIngredients() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:104:1: ( ruleIngredients EOF )
            // InternalRecipeDSL.g:105:1: ruleIngredients EOF
            {
             before(grammarAccess.getIngredientsRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredients();

            state._fsp--;

             after(grammarAccess.getIngredientsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngredients"


    // $ANTLR start "ruleIngredients"
    // InternalRecipeDSL.g:112:1: ruleIngredients : ( ( rule__Ingredients__Group__0 ) ) ;
    public final void ruleIngredients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:116:2: ( ( ( rule__Ingredients__Group__0 ) ) )
            // InternalRecipeDSL.g:117:2: ( ( rule__Ingredients__Group__0 ) )
            {
            // InternalRecipeDSL.g:117:2: ( ( rule__Ingredients__Group__0 ) )
            // InternalRecipeDSL.g:118:3: ( rule__Ingredients__Group__0 )
            {
             before(grammarAccess.getIngredientsAccess().getGroup()); 
            // InternalRecipeDSL.g:119:3: ( rule__Ingredients__Group__0 )
            // InternalRecipeDSL.g:119:4: rule__Ingredients__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredients"


    // $ANTLR start "entryRuleHeader"
    // InternalRecipeDSL.g:128:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:129:1: ( ruleHeader EOF )
            // InternalRecipeDSL.g:130:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalRecipeDSL.g:137:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:141:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalRecipeDSL.g:142:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalRecipeDSL.g:142:2: ( ( rule__Header__Group__0 ) )
            // InternalRecipeDSL.g:143:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalRecipeDSL.g:144:3: ( rule__Header__Group__0 )
            // InternalRecipeDSL.g:144:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEString"
    // InternalRecipeDSL.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:154:1: ( ruleEString EOF )
            // InternalRecipeDSL.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRecipeDSL.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRecipeDSL.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRecipeDSL.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalRecipeDSL.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRecipeDSL.g:169:3: ( rule__EString__Alternatives )
            // InternalRecipeDSL.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipeDSL.g:178:1: entryRuleNutrients : ruleNutrients EOF ;
    public final void entryRuleNutrients() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:179:1: ( ruleNutrients EOF )
            // InternalRecipeDSL.g:180:1: ruleNutrients EOF
            {
             before(grammarAccess.getNutrientsRule()); 
            pushFollow(FOLLOW_1);
            ruleNutrients();

            state._fsp--;

             after(grammarAccess.getNutrientsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNutrients"


    // $ANTLR start "ruleNutrients"
    // InternalRecipeDSL.g:187:1: ruleNutrients : ( ( rule__Nutrients__Group__0 ) ) ;
    public final void ruleNutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:191:2: ( ( ( rule__Nutrients__Group__0 ) ) )
            // InternalRecipeDSL.g:192:2: ( ( rule__Nutrients__Group__0 ) )
            {
            // InternalRecipeDSL.g:192:2: ( ( rule__Nutrients__Group__0 ) )
            // InternalRecipeDSL.g:193:3: ( rule__Nutrients__Group__0 )
            {
             before(grammarAccess.getNutrientsAccess().getGroup()); 
            // InternalRecipeDSL.g:194:3: ( rule__Nutrients__Group__0 )
            // InternalRecipeDSL.g:194:4: rule__Nutrients__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutrients"


    // $ANTLR start "entryRuleEInt"
    // InternalRecipeDSL.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:204:1: ( ruleEInt EOF )
            // InternalRecipeDSL.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRecipeDSL.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRecipeDSL.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRecipeDSL.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalRecipeDSL.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRecipeDSL.g:219:3: ( rule__EInt__Group__0 )
            // InternalRecipeDSL.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleUnitOfMeasure"
    // InternalRecipeDSL.g:228:1: entryRuleUnitOfMeasure : ruleUnitOfMeasure EOF ;
    public final void entryRuleUnitOfMeasure() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:229:1: ( ruleUnitOfMeasure EOF )
            // InternalRecipeDSL.g:230:1: ruleUnitOfMeasure EOF
            {
             before(grammarAccess.getUnitOfMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitOfMeasure();

            state._fsp--;

             after(grammarAccess.getUnitOfMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnitOfMeasure"


    // $ANTLR start "ruleUnitOfMeasure"
    // InternalRecipeDSL.g:237:1: ruleUnitOfMeasure : ( ( rule__UnitOfMeasure__Group__0 ) ) ;
    public final void ruleUnitOfMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:241:2: ( ( ( rule__UnitOfMeasure__Group__0 ) ) )
            // InternalRecipeDSL.g:242:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            {
            // InternalRecipeDSL.g:242:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            // InternalRecipeDSL.g:243:3: ( rule__UnitOfMeasure__Group__0 )
            {
             before(grammarAccess.getUnitOfMeasureAccess().getGroup()); 
            // InternalRecipeDSL.g:244:3: ( rule__UnitOfMeasure__Group__0 )
            // InternalRecipeDSL.g:244:4: rule__UnitOfMeasure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitOfMeasure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitOfMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitOfMeasure"


    // $ANTLR start "entryRuleBasicInformation"
    // InternalRecipeDSL.g:253:1: entryRuleBasicInformation : ruleBasicInformation EOF ;
    public final void entryRuleBasicInformation() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:254:1: ( ruleBasicInformation EOF )
            // InternalRecipeDSL.g:255:1: ruleBasicInformation EOF
            {
             before(grammarAccess.getBasicInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicInformation();

            state._fsp--;

             after(grammarAccess.getBasicInformationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicInformation"


    // $ANTLR start "ruleBasicInformation"
    // InternalRecipeDSL.g:262:1: ruleBasicInformation : ( ( rule__BasicInformation__Group__0 ) ) ;
    public final void ruleBasicInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:266:2: ( ( ( rule__BasicInformation__Group__0 ) ) )
            // InternalRecipeDSL.g:267:2: ( ( rule__BasicInformation__Group__0 ) )
            {
            // InternalRecipeDSL.g:267:2: ( ( rule__BasicInformation__Group__0 ) )
            // InternalRecipeDSL.g:268:3: ( rule__BasicInformation__Group__0 )
            {
             before(grammarAccess.getBasicInformationAccess().getGroup()); 
            // InternalRecipeDSL.g:269:3: ( rule__BasicInformation__Group__0 )
            // InternalRecipeDSL.g:269:4: rule__BasicInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicInformation"


    // $ANTLR start "entryRuleTitle"
    // InternalRecipeDSL.g:278:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:279:1: ( ruleTitle EOF )
            // InternalRecipeDSL.g:280:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalRecipeDSL.g:287:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:291:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalRecipeDSL.g:292:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalRecipeDSL.g:292:2: ( ( rule__Title__Group__0 ) )
            // InternalRecipeDSL.g:293:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalRecipeDSL.g:294:3: ( rule__Title__Group__0 )
            // InternalRecipeDSL.g:294:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleImage"
    // InternalRecipeDSL.g:303:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:304:1: ( ruleImage EOF )
            // InternalRecipeDSL.g:305:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalRecipeDSL.g:312:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:316:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalRecipeDSL.g:317:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalRecipeDSL.g:317:2: ( ( rule__Image__Group__0 ) )
            // InternalRecipeDSL.g:318:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalRecipeDSL.g:319:3: ( rule__Image__Group__0 )
            // InternalRecipeDSL.g:319:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRulePercentageAmountToggle"
    // InternalRecipeDSL.g:328:1: entryRulePercentageAmountToggle : rulePercentageAmountToggle EOF ;
    public final void entryRulePercentageAmountToggle() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:329:1: ( rulePercentageAmountToggle EOF )
            // InternalRecipeDSL.g:330:1: rulePercentageAmountToggle EOF
            {
             before(grammarAccess.getPercentageAmountToggleRule()); 
            pushFollow(FOLLOW_1);
            rulePercentageAmountToggle();

            state._fsp--;

             after(grammarAccess.getPercentageAmountToggleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePercentageAmountToggle"


    // $ANTLR start "rulePercentageAmountToggle"
    // InternalRecipeDSL.g:337:1: rulePercentageAmountToggle : ( ( rule__PercentageAmountToggle__Group__0 ) ) ;
    public final void rulePercentageAmountToggle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:341:2: ( ( ( rule__PercentageAmountToggle__Group__0 ) ) )
            // InternalRecipeDSL.g:342:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            {
            // InternalRecipeDSL.g:342:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            // InternalRecipeDSL.g:343:3: ( rule__PercentageAmountToggle__Group__0 )
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getGroup()); 
            // InternalRecipeDSL.g:344:3: ( rule__PercentageAmountToggle__Group__0 )
            // InternalRecipeDSL.g:344:4: rule__PercentageAmountToggle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PercentageAmountToggle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPercentageAmountToggleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePercentageAmountToggle"


    // $ANTLR start "entryRuleVitamins"
    // InternalRecipeDSL.g:353:1: entryRuleVitamins : ruleVitamins EOF ;
    public final void entryRuleVitamins() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:354:1: ( ruleVitamins EOF )
            // InternalRecipeDSL.g:355:1: ruleVitamins EOF
            {
             before(grammarAccess.getVitaminsRule()); 
            pushFollow(FOLLOW_1);
            ruleVitamins();

            state._fsp--;

             after(grammarAccess.getVitaminsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVitamins"


    // $ANTLR start "ruleVitamins"
    // InternalRecipeDSL.g:362:1: ruleVitamins : ( ( rule__Vitamins__Group__0 ) ) ;
    public final void ruleVitamins() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:366:2: ( ( ( rule__Vitamins__Group__0 ) ) )
            // InternalRecipeDSL.g:367:2: ( ( rule__Vitamins__Group__0 ) )
            {
            // InternalRecipeDSL.g:367:2: ( ( rule__Vitamins__Group__0 ) )
            // InternalRecipeDSL.g:368:3: ( rule__Vitamins__Group__0 )
            {
             before(grammarAccess.getVitaminsAccess().getGroup()); 
            // InternalRecipeDSL.g:369:3: ( rule__Vitamins__Group__0 )
            // InternalRecipeDSL.g:369:4: rule__Vitamins__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVitaminsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVitamins"


    // $ANTLR start "entryRuleMacronutrients"
    // InternalRecipeDSL.g:378:1: entryRuleMacronutrients : ruleMacronutrients EOF ;
    public final void entryRuleMacronutrients() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:379:1: ( ruleMacronutrients EOF )
            // InternalRecipeDSL.g:380:1: ruleMacronutrients EOF
            {
             before(grammarAccess.getMacronutrientsRule()); 
            pushFollow(FOLLOW_1);
            ruleMacronutrients();

            state._fsp--;

             after(grammarAccess.getMacronutrientsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMacronutrients"


    // $ANTLR start "ruleMacronutrients"
    // InternalRecipeDSL.g:387:1: ruleMacronutrients : ( ( rule__Macronutrients__Group__0 ) ) ;
    public final void ruleMacronutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:391:2: ( ( ( rule__Macronutrients__Group__0 ) ) )
            // InternalRecipeDSL.g:392:2: ( ( rule__Macronutrients__Group__0 ) )
            {
            // InternalRecipeDSL.g:392:2: ( ( rule__Macronutrients__Group__0 ) )
            // InternalRecipeDSL.g:393:3: ( rule__Macronutrients__Group__0 )
            {
             before(grammarAccess.getMacronutrientsAccess().getGroup()); 
            // InternalRecipeDSL.g:394:3: ( rule__Macronutrients__Group__0 )
            // InternalRecipeDSL.g:394:4: rule__Macronutrients__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Macronutrients__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacronutrientsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacronutrients"


    // $ANTLR start "ruleVitamin"
    // InternalRecipeDSL.g:403:1: ruleVitamin : ( ( rule__Vitamin__Alternatives ) ) ;
    public final void ruleVitamin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:407:1: ( ( ( rule__Vitamin__Alternatives ) ) )
            // InternalRecipeDSL.g:408:2: ( ( rule__Vitamin__Alternatives ) )
            {
            // InternalRecipeDSL.g:408:2: ( ( rule__Vitamin__Alternatives ) )
            // InternalRecipeDSL.g:409:3: ( rule__Vitamin__Alternatives )
            {
             before(grammarAccess.getVitaminAccess().getAlternatives()); 
            // InternalRecipeDSL.g:410:3: ( rule__Vitamin__Alternatives )
            // InternalRecipeDSL.g:410:4: rule__Vitamin__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Vitamin__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVitaminAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVitamin"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRecipeDSL.g:418:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:422:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRecipeDSL.g:423:2: ( RULE_STRING )
                    {
                    // InternalRecipeDSL.g:423:2: ( RULE_STRING )
                    // InternalRecipeDSL.g:424:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:429:2: ( RULE_ID )
                    {
                    // InternalRecipeDSL.g:429:2: ( RULE_ID )
                    // InternalRecipeDSL.g:430:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Vitamin__Alternatives"
    // InternalRecipeDSL.g:439:1: rule__Vitamin__Alternatives : ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) );
    public final void rule__Vitamin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:443:1: ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:444:2: ( ( 'VITAMIN_A' ) )
                    {
                    // InternalRecipeDSL.g:444:2: ( ( 'VITAMIN_A' ) )
                    // InternalRecipeDSL.g:445:3: ( 'VITAMIN_A' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 
                    // InternalRecipeDSL.g:446:3: ( 'VITAMIN_A' )
                    // InternalRecipeDSL.g:446:4: 'VITAMIN_A'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:450:2: ( ( 'VITAMIN_B1' ) )
                    {
                    // InternalRecipeDSL.g:450:2: ( ( 'VITAMIN_B1' ) )
                    // InternalRecipeDSL.g:451:3: ( 'VITAMIN_B1' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 
                    // InternalRecipeDSL.g:452:3: ( 'VITAMIN_B1' )
                    // InternalRecipeDSL.g:452:4: 'VITAMIN_B1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:456:2: ( ( 'VITAMIN_B2' ) )
                    {
                    // InternalRecipeDSL.g:456:2: ( ( 'VITAMIN_B2' ) )
                    // InternalRecipeDSL.g:457:3: ( 'VITAMIN_B2' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 
                    // InternalRecipeDSL.g:458:3: ( 'VITAMIN_B2' )
                    // InternalRecipeDSL.g:458:4: 'VITAMIN_B2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:462:2: ( ( 'VITAMIN_B3' ) )
                    {
                    // InternalRecipeDSL.g:462:2: ( ( 'VITAMIN_B3' ) )
                    // InternalRecipeDSL.g:463:3: ( 'VITAMIN_B3' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 
                    // InternalRecipeDSL.g:464:3: ( 'VITAMIN_B3' )
                    // InternalRecipeDSL.g:464:4: 'VITAMIN_B3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:468:2: ( ( 'VITAMIN_B5' ) )
                    {
                    // InternalRecipeDSL.g:468:2: ( ( 'VITAMIN_B5' ) )
                    // InternalRecipeDSL.g:469:3: ( 'VITAMIN_B5' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 
                    // InternalRecipeDSL.g:470:3: ( 'VITAMIN_B5' )
                    // InternalRecipeDSL.g:470:4: 'VITAMIN_B5'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipeDSL.g:474:2: ( ( 'VITAMIN_B6' ) )
                    {
                    // InternalRecipeDSL.g:474:2: ( ( 'VITAMIN_B6' ) )
                    // InternalRecipeDSL.g:475:3: ( 'VITAMIN_B6' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 
                    // InternalRecipeDSL.g:476:3: ( 'VITAMIN_B6' )
                    // InternalRecipeDSL.g:476:4: 'VITAMIN_B6'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipeDSL.g:480:2: ( ( 'VITAMIN_B12' ) )
                    {
                    // InternalRecipeDSL.g:480:2: ( ( 'VITAMIN_B12' ) )
                    // InternalRecipeDSL.g:481:3: ( 'VITAMIN_B12' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 
                    // InternalRecipeDSL.g:482:3: ( 'VITAMIN_B12' )
                    // InternalRecipeDSL.g:482:4: 'VITAMIN_B12'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipeDSL.g:486:2: ( ( 'VITAMIN_C' ) )
                    {
                    // InternalRecipeDSL.g:486:2: ( ( 'VITAMIN_C' ) )
                    // InternalRecipeDSL.g:487:3: ( 'VITAMIN_C' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 
                    // InternalRecipeDSL.g:488:3: ( 'VITAMIN_C' )
                    // InternalRecipeDSL.g:488:4: 'VITAMIN_C'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipeDSL.g:492:2: ( ( 'VITAMIN_E' ) )
                    {
                    // InternalRecipeDSL.g:492:2: ( ( 'VITAMIN_E' ) )
                    // InternalRecipeDSL.g:493:3: ( 'VITAMIN_E' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 
                    // InternalRecipeDSL.g:494:3: ( 'VITAMIN_E' )
                    // InternalRecipeDSL.g:494:4: 'VITAMIN_E'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipeDSL.g:498:2: ( ( 'VITAMIN_K' ) )
                    {
                    // InternalRecipeDSL.g:498:2: ( ( 'VITAMIN_K' ) )
                    // InternalRecipeDSL.g:499:3: ( 'VITAMIN_K' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9()); 
                    // InternalRecipeDSL.g:500:3: ( 'VITAMIN_K' )
                    // InternalRecipeDSL.g:500:4: 'VITAMIN_K'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__Vitamin__Alternatives"


    // $ANTLR start "rule__Page__Group__0"
    // InternalRecipeDSL.g:508:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:512:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalRecipeDSL.g:513:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalRecipeDSL.g:520:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:524:1: ( ( 'Page' ) )
            // InternalRecipeDSL.g:525:1: ( 'Page' )
            {
            // InternalRecipeDSL.g:525:1: ( 'Page' )
            // InternalRecipeDSL.g:526:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalRecipeDSL.g:535:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:539:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalRecipeDSL.g:540:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalRecipeDSL.g:547:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:551:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:552:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:552:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalRecipeDSL.g:553:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:554:2: ( rule__Page__NameAssignment_1 )
            // InternalRecipeDSL.g:554:3: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalRecipeDSL.g:562:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:566:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalRecipeDSL.g:567:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalRecipeDSL.g:574:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:578:1: ( ( '{' ) )
            // InternalRecipeDSL.g:579:1: ( '{' )
            {
            // InternalRecipeDSL.g:579:1: ( '{' )
            // InternalRecipeDSL.g:580:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalRecipeDSL.g:589:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:593:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalRecipeDSL.g:594:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalRecipeDSL.g:601:1: rule__Page__Group__3__Impl : ( 'instructions' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:605:1: ( ( 'instructions' ) )
            // InternalRecipeDSL.g:606:1: ( 'instructions' )
            {
            // InternalRecipeDSL.g:606:1: ( 'instructions' )
            // InternalRecipeDSL.g:607:2: 'instructions'
            {
             before(grammarAccess.getPageAccess().getInstructionsKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getInstructionsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalRecipeDSL.g:616:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:620:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalRecipeDSL.g:621:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalRecipeDSL.g:628:1: rule__Page__Group__4__Impl : ( ( rule__Page__InstructionsAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:632:1: ( ( ( rule__Page__InstructionsAssignment_4 ) ) )
            // InternalRecipeDSL.g:633:1: ( ( rule__Page__InstructionsAssignment_4 ) )
            {
            // InternalRecipeDSL.g:633:1: ( ( rule__Page__InstructionsAssignment_4 ) )
            // InternalRecipeDSL.g:634:2: ( rule__Page__InstructionsAssignment_4 )
            {
             before(grammarAccess.getPageAccess().getInstructionsAssignment_4()); 
            // InternalRecipeDSL.g:635:2: ( rule__Page__InstructionsAssignment_4 )
            // InternalRecipeDSL.g:635:3: rule__Page__InstructionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Page__InstructionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getInstructionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // InternalRecipeDSL.g:643:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:647:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalRecipeDSL.g:648:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // InternalRecipeDSL.g:655:1: rule__Page__Group__5__Impl : ( 'ingredients' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:659:1: ( ( 'ingredients' ) )
            // InternalRecipeDSL.g:660:1: ( 'ingredients' )
            {
            // InternalRecipeDSL.g:660:1: ( 'ingredients' )
            // InternalRecipeDSL.g:661:2: 'ingredients'
            {
             before(grammarAccess.getPageAccess().getIngredientsKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getIngredientsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // InternalRecipeDSL.g:670:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:674:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalRecipeDSL.g:675:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // InternalRecipeDSL.g:682:1: rule__Page__Group__6__Impl : ( ( rule__Page__IngredientsAssignment_6 ) ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:686:1: ( ( ( rule__Page__IngredientsAssignment_6 ) ) )
            // InternalRecipeDSL.g:687:1: ( ( rule__Page__IngredientsAssignment_6 ) )
            {
            // InternalRecipeDSL.g:687:1: ( ( rule__Page__IngredientsAssignment_6 ) )
            // InternalRecipeDSL.g:688:2: ( rule__Page__IngredientsAssignment_6 )
            {
             before(grammarAccess.getPageAccess().getIngredientsAssignment_6()); 
            // InternalRecipeDSL.g:689:2: ( rule__Page__IngredientsAssignment_6 )
            // InternalRecipeDSL.g:689:3: rule__Page__IngredientsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Page__IngredientsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getIngredientsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group__7"
    // InternalRecipeDSL.g:697:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:701:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalRecipeDSL.g:702:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Page__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7"


    // $ANTLR start "rule__Page__Group__7__Impl"
    // InternalRecipeDSL.g:709:1: rule__Page__Group__7__Impl : ( 'header' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:713:1: ( ( 'header' ) )
            // InternalRecipeDSL.g:714:1: ( 'header' )
            {
            // InternalRecipeDSL.g:714:1: ( 'header' )
            // InternalRecipeDSL.g:715:2: 'header'
            {
             before(grammarAccess.getPageAccess().getHeaderKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHeaderKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7__Impl"


    // $ANTLR start "rule__Page__Group__8"
    // InternalRecipeDSL.g:724:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:728:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // InternalRecipeDSL.g:729:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8"


    // $ANTLR start "rule__Page__Group__8__Impl"
    // InternalRecipeDSL.g:736:1: rule__Page__Group__8__Impl : ( ( rule__Page__HeaderAssignment_8 ) ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:740:1: ( ( ( rule__Page__HeaderAssignment_8 ) ) )
            // InternalRecipeDSL.g:741:1: ( ( rule__Page__HeaderAssignment_8 ) )
            {
            // InternalRecipeDSL.g:741:1: ( ( rule__Page__HeaderAssignment_8 ) )
            // InternalRecipeDSL.g:742:2: ( rule__Page__HeaderAssignment_8 )
            {
             before(grammarAccess.getPageAccess().getHeaderAssignment_8()); 
            // InternalRecipeDSL.g:743:2: ( rule__Page__HeaderAssignment_8 )
            // InternalRecipeDSL.g:743:3: rule__Page__HeaderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Page__HeaderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getHeaderAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__8__Impl"


    // $ANTLR start "rule__Page__Group__9"
    // InternalRecipeDSL.g:751:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:755:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // InternalRecipeDSL.g:756:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__9"


    // $ANTLR start "rule__Page__Group__9__Impl"
    // InternalRecipeDSL.g:763:1: rule__Page__Group__9__Impl : ( ( rule__Page__Group_9__0 )? ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:767:1: ( ( ( rule__Page__Group_9__0 )? ) )
            // InternalRecipeDSL.g:768:1: ( ( rule__Page__Group_9__0 )? )
            {
            // InternalRecipeDSL.g:768:1: ( ( rule__Page__Group_9__0 )? )
            // InternalRecipeDSL.g:769:2: ( rule__Page__Group_9__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_9()); 
            // InternalRecipeDSL.g:770:2: ( rule__Page__Group_9__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRecipeDSL.g:770:3: rule__Page__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__9__Impl"


    // $ANTLR start "rule__Page__Group__10"
    // InternalRecipeDSL.g:778:1: rule__Page__Group__10 : rule__Page__Group__10__Impl ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:782:1: ( rule__Page__Group__10__Impl )
            // InternalRecipeDSL.g:783:2: rule__Page__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__10"


    // $ANTLR start "rule__Page__Group__10__Impl"
    // InternalRecipeDSL.g:789:1: rule__Page__Group__10__Impl : ( '}' ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:793:1: ( ( '}' ) )
            // InternalRecipeDSL.g:794:1: ( '}' )
            {
            // InternalRecipeDSL.g:794:1: ( '}' )
            // InternalRecipeDSL.g:795:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__10__Impl"


    // $ANTLR start "rule__Page__Group_9__0"
    // InternalRecipeDSL.g:805:1: rule__Page__Group_9__0 : rule__Page__Group_9__0__Impl rule__Page__Group_9__1 ;
    public final void rule__Page__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:809:1: ( rule__Page__Group_9__0__Impl rule__Page__Group_9__1 )
            // InternalRecipeDSL.g:810:2: rule__Page__Group_9__0__Impl rule__Page__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__0"


    // $ANTLR start "rule__Page__Group_9__0__Impl"
    // InternalRecipeDSL.g:817:1: rule__Page__Group_9__0__Impl : ( 'nutrients' ) ;
    public final void rule__Page__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:821:1: ( ( 'nutrients' ) )
            // InternalRecipeDSL.g:822:1: ( 'nutrients' )
            {
            // InternalRecipeDSL.g:822:1: ( 'nutrients' )
            // InternalRecipeDSL.g:823:2: 'nutrients'
            {
             before(grammarAccess.getPageAccess().getNutrientsKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getNutrientsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__0__Impl"


    // $ANTLR start "rule__Page__Group_9__1"
    // InternalRecipeDSL.g:832:1: rule__Page__Group_9__1 : rule__Page__Group_9__1__Impl ;
    public final void rule__Page__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:836:1: ( rule__Page__Group_9__1__Impl )
            // InternalRecipeDSL.g:837:2: rule__Page__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__1"


    // $ANTLR start "rule__Page__Group_9__1__Impl"
    // InternalRecipeDSL.g:843:1: rule__Page__Group_9__1__Impl : ( ( rule__Page__NutrientsAssignment_9_1 ) ) ;
    public final void rule__Page__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:847:1: ( ( ( rule__Page__NutrientsAssignment_9_1 ) ) )
            // InternalRecipeDSL.g:848:1: ( ( rule__Page__NutrientsAssignment_9_1 ) )
            {
            // InternalRecipeDSL.g:848:1: ( ( rule__Page__NutrientsAssignment_9_1 ) )
            // InternalRecipeDSL.g:849:2: ( rule__Page__NutrientsAssignment_9_1 )
            {
             before(grammarAccess.getPageAccess().getNutrientsAssignment_9_1()); 
            // InternalRecipeDSL.g:850:2: ( rule__Page__NutrientsAssignment_9_1 )
            // InternalRecipeDSL.g:850:3: rule__Page__NutrientsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NutrientsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNutrientsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_9__1__Impl"


    // $ANTLR start "rule__Instructions__Group__0"
    // InternalRecipeDSL.g:859:1: rule__Instructions__Group__0 : rule__Instructions__Group__0__Impl rule__Instructions__Group__1 ;
    public final void rule__Instructions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:863:1: ( rule__Instructions__Group__0__Impl rule__Instructions__Group__1 )
            // InternalRecipeDSL.g:864:2: rule__Instructions__Group__0__Impl rule__Instructions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Instructions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__0"


    // $ANTLR start "rule__Instructions__Group__0__Impl"
    // InternalRecipeDSL.g:871:1: rule__Instructions__Group__0__Impl : ( 'Instructions' ) ;
    public final void rule__Instructions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:875:1: ( ( 'Instructions' ) )
            // InternalRecipeDSL.g:876:1: ( 'Instructions' )
            {
            // InternalRecipeDSL.g:876:1: ( 'Instructions' )
            // InternalRecipeDSL.g:877:2: 'Instructions'
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getInstructionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__0__Impl"


    // $ANTLR start "rule__Instructions__Group__1"
    // InternalRecipeDSL.g:886:1: rule__Instructions__Group__1 : rule__Instructions__Group__1__Impl rule__Instructions__Group__2 ;
    public final void rule__Instructions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:890:1: ( rule__Instructions__Group__1__Impl rule__Instructions__Group__2 )
            // InternalRecipeDSL.g:891:2: rule__Instructions__Group__1__Impl rule__Instructions__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Instructions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__1"


    // $ANTLR start "rule__Instructions__Group__1__Impl"
    // InternalRecipeDSL.g:898:1: rule__Instructions__Group__1__Impl : ( '{' ) ;
    public final void rule__Instructions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:902:1: ( ( '{' ) )
            // InternalRecipeDSL.g:903:1: ( '{' )
            {
            // InternalRecipeDSL.g:903:1: ( '{' )
            // InternalRecipeDSL.g:904:2: '{'
            {
             before(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__1__Impl"


    // $ANTLR start "rule__Instructions__Group__2"
    // InternalRecipeDSL.g:913:1: rule__Instructions__Group__2 : rule__Instructions__Group__2__Impl rule__Instructions__Group__3 ;
    public final void rule__Instructions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:917:1: ( rule__Instructions__Group__2__Impl rule__Instructions__Group__3 )
            // InternalRecipeDSL.g:918:2: rule__Instructions__Group__2__Impl rule__Instructions__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Instructions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__2"


    // $ANTLR start "rule__Instructions__Group__2__Impl"
    // InternalRecipeDSL.g:925:1: rule__Instructions__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Instructions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:929:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:930:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:930:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:931:2: 'orderNumber'
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__2__Impl"


    // $ANTLR start "rule__Instructions__Group__3"
    // InternalRecipeDSL.g:940:1: rule__Instructions__Group__3 : rule__Instructions__Group__3__Impl rule__Instructions__Group__4 ;
    public final void rule__Instructions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:944:1: ( rule__Instructions__Group__3__Impl rule__Instructions__Group__4 )
            // InternalRecipeDSL.g:945:2: rule__Instructions__Group__3__Impl rule__Instructions__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Instructions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__3"


    // $ANTLR start "rule__Instructions__Group__3__Impl"
    // InternalRecipeDSL.g:952:1: rule__Instructions__Group__3__Impl : ( ( rule__Instructions__OrderNumberAssignment_3 ) ) ;
    public final void rule__Instructions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:956:1: ( ( ( rule__Instructions__OrderNumberAssignment_3 ) ) )
            // InternalRecipeDSL.g:957:1: ( ( rule__Instructions__OrderNumberAssignment_3 ) )
            {
            // InternalRecipeDSL.g:957:1: ( ( rule__Instructions__OrderNumberAssignment_3 ) )
            // InternalRecipeDSL.g:958:2: ( rule__Instructions__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipeDSL.g:959:2: ( rule__Instructions__OrderNumberAssignment_3 )
            // InternalRecipeDSL.g:959:3: rule__Instructions__OrderNumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__OrderNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getOrderNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__3__Impl"


    // $ANTLR start "rule__Instructions__Group__4"
    // InternalRecipeDSL.g:967:1: rule__Instructions__Group__4 : rule__Instructions__Group__4__Impl ;
    public final void rule__Instructions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:971:1: ( rule__Instructions__Group__4__Impl )
            // InternalRecipeDSL.g:972:2: rule__Instructions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__4"


    // $ANTLR start "rule__Instructions__Group__4__Impl"
    // InternalRecipeDSL.g:978:1: rule__Instructions__Group__4__Impl : ( '}' ) ;
    public final void rule__Instructions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:982:1: ( ( '}' ) )
            // InternalRecipeDSL.g:983:1: ( '}' )
            {
            // InternalRecipeDSL.g:983:1: ( '}' )
            // InternalRecipeDSL.g:984:2: '}'
            {
             before(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__4__Impl"


    // $ANTLR start "rule__Ingredients__Group__0"
    // InternalRecipeDSL.g:994:1: rule__Ingredients__Group__0 : rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 ;
    public final void rule__Ingredients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:998:1: ( rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 )
            // InternalRecipeDSL.g:999:2: rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ingredients__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__0"


    // $ANTLR start "rule__Ingredients__Group__0__Impl"
    // InternalRecipeDSL.g:1006:1: rule__Ingredients__Group__0__Impl : ( 'Ingredients' ) ;
    public final void rule__Ingredients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1010:1: ( ( 'Ingredients' ) )
            // InternalRecipeDSL.g:1011:1: ( 'Ingredients' )
            {
            // InternalRecipeDSL.g:1011:1: ( 'Ingredients' )
            // InternalRecipeDSL.g:1012:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getIngredientsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__0__Impl"


    // $ANTLR start "rule__Ingredients__Group__1"
    // InternalRecipeDSL.g:1021:1: rule__Ingredients__Group__1 : rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 ;
    public final void rule__Ingredients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1025:1: ( rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 )
            // InternalRecipeDSL.g:1026:2: rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Ingredients__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__1"


    // $ANTLR start "rule__Ingredients__Group__1__Impl"
    // InternalRecipeDSL.g:1033:1: rule__Ingredients__Group__1__Impl : ( '{' ) ;
    public final void rule__Ingredients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1037:1: ( ( '{' ) )
            // InternalRecipeDSL.g:1038:1: ( '{' )
            {
            // InternalRecipeDSL.g:1038:1: ( '{' )
            // InternalRecipeDSL.g:1039:2: '{'
            {
             before(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__1__Impl"


    // $ANTLR start "rule__Ingredients__Group__2"
    // InternalRecipeDSL.g:1048:1: rule__Ingredients__Group__2 : rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 ;
    public final void rule__Ingredients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1052:1: ( rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 )
            // InternalRecipeDSL.g:1053:2: rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ingredients__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__2"


    // $ANTLR start "rule__Ingredients__Group__2__Impl"
    // InternalRecipeDSL.g:1060:1: rule__Ingredients__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Ingredients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1064:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:1065:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:1065:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:1066:2: 'orderNumber'
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__2__Impl"


    // $ANTLR start "rule__Ingredients__Group__3"
    // InternalRecipeDSL.g:1075:1: rule__Ingredients__Group__3 : rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 ;
    public final void rule__Ingredients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1079:1: ( rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 )
            // InternalRecipeDSL.g:1080:2: rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Ingredients__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__3"


    // $ANTLR start "rule__Ingredients__Group__3__Impl"
    // InternalRecipeDSL.g:1087:1: rule__Ingredients__Group__3__Impl : ( ( rule__Ingredients__OrderNumberAssignment_3 ) ) ;
    public final void rule__Ingredients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1091:1: ( ( ( rule__Ingredients__OrderNumberAssignment_3 ) ) )
            // InternalRecipeDSL.g:1092:1: ( ( rule__Ingredients__OrderNumberAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1092:1: ( ( rule__Ingredients__OrderNumberAssignment_3 ) )
            // InternalRecipeDSL.g:1093:2: ( rule__Ingredients__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipeDSL.g:1094:2: ( rule__Ingredients__OrderNumberAssignment_3 )
            // InternalRecipeDSL.g:1094:3: rule__Ingredients__OrderNumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__OrderNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getOrderNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__3__Impl"


    // $ANTLR start "rule__Ingredients__Group__4"
    // InternalRecipeDSL.g:1102:1: rule__Ingredients__Group__4 : rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 ;
    public final void rule__Ingredients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1106:1: ( rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 )
            // InternalRecipeDSL.g:1107:2: rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Ingredients__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__4"


    // $ANTLR start "rule__Ingredients__Group__4__Impl"
    // InternalRecipeDSL.g:1114:1: rule__Ingredients__Group__4__Impl : ( ( rule__Ingredients__Group_4__0 )? ) ;
    public final void rule__Ingredients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1118:1: ( ( ( rule__Ingredients__Group_4__0 )? ) )
            // InternalRecipeDSL.g:1119:1: ( ( rule__Ingredients__Group_4__0 )? )
            {
            // InternalRecipeDSL.g:1119:1: ( ( rule__Ingredients__Group_4__0 )? )
            // InternalRecipeDSL.g:1120:2: ( rule__Ingredients__Group_4__0 )?
            {
             before(grammarAccess.getIngredientsAccess().getGroup_4()); 
            // InternalRecipeDSL.g:1121:2: ( rule__Ingredients__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipeDSL.g:1121:3: rule__Ingredients__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredients__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__4__Impl"


    // $ANTLR start "rule__Ingredients__Group__5"
    // InternalRecipeDSL.g:1129:1: rule__Ingredients__Group__5 : rule__Ingredients__Group__5__Impl ;
    public final void rule__Ingredients__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1133:1: ( rule__Ingredients__Group__5__Impl )
            // InternalRecipeDSL.g:1134:2: rule__Ingredients__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__5"


    // $ANTLR start "rule__Ingredients__Group__5__Impl"
    // InternalRecipeDSL.g:1140:1: rule__Ingredients__Group__5__Impl : ( '}' ) ;
    public final void rule__Ingredients__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1144:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1145:1: ( '}' )
            {
            // InternalRecipeDSL.g:1145:1: ( '}' )
            // InternalRecipeDSL.g:1146:2: '}'
            {
             before(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__5__Impl"


    // $ANTLR start "rule__Ingredients__Group_4__0"
    // InternalRecipeDSL.g:1156:1: rule__Ingredients__Group_4__0 : rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1 ;
    public final void rule__Ingredients__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1160:1: ( rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1 )
            // InternalRecipeDSL.g:1161:2: rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Ingredients__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_4__0"


    // $ANTLR start "rule__Ingredients__Group_4__0__Impl"
    // InternalRecipeDSL.g:1168:1: rule__Ingredients__Group_4__0__Impl : ( 'unittoggle' ) ;
    public final void rule__Ingredients__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1172:1: ( ( 'unittoggle' ) )
            // InternalRecipeDSL.g:1173:1: ( 'unittoggle' )
            {
            // InternalRecipeDSL.g:1173:1: ( 'unittoggle' )
            // InternalRecipeDSL.g:1174:2: 'unittoggle'
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getUnittoggleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_4__0__Impl"


    // $ANTLR start "rule__Ingredients__Group_4__1"
    // InternalRecipeDSL.g:1183:1: rule__Ingredients__Group_4__1 : rule__Ingredients__Group_4__1__Impl ;
    public final void rule__Ingredients__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1187:1: ( rule__Ingredients__Group_4__1__Impl )
            // InternalRecipeDSL.g:1188:2: rule__Ingredients__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_4__1"


    // $ANTLR start "rule__Ingredients__Group_4__1__Impl"
    // InternalRecipeDSL.g:1194:1: rule__Ingredients__Group_4__1__Impl : ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) ) ;
    public final void rule__Ingredients__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1198:1: ( ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) ) )
            // InternalRecipeDSL.g:1199:1: ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) )
            {
            // InternalRecipeDSL.g:1199:1: ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) )
            // InternalRecipeDSL.g:1200:2: ( rule__Ingredients__UnittoggleAssignment_4_1 )
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleAssignment_4_1()); 
            // InternalRecipeDSL.g:1201:2: ( rule__Ingredients__UnittoggleAssignment_4_1 )
            // InternalRecipeDSL.g:1201:3: rule__Ingredients__UnittoggleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__UnittoggleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getUnittoggleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_4__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalRecipeDSL.g:1210:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1214:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRecipeDSL.g:1215:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalRecipeDSL.g:1222:1: rule__Header__Group__0__Impl : ( 'Header' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1226:1: ( ( 'Header' ) )
            // InternalRecipeDSL.g:1227:1: ( 'Header' )
            {
            // InternalRecipeDSL.g:1227:1: ( 'Header' )
            // InternalRecipeDSL.g:1228:2: 'Header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalRecipeDSL.g:1237:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1241:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalRecipeDSL.g:1242:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalRecipeDSL.g:1249:1: rule__Header__Group__1__Impl : ( '{' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1253:1: ( ( '{' ) )
            // InternalRecipeDSL.g:1254:1: ( '{' )
            {
            // InternalRecipeDSL.g:1254:1: ( '{' )
            // InternalRecipeDSL.g:1255:2: '{'
            {
             before(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalRecipeDSL.g:1264:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1268:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalRecipeDSL.g:1269:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalRecipeDSL.g:1276:1: rule__Header__Group__2__Impl : ( 'basicinformation' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1280:1: ( ( 'basicinformation' ) )
            // InternalRecipeDSL.g:1281:1: ( 'basicinformation' )
            {
            // InternalRecipeDSL.g:1281:1: ( 'basicinformation' )
            // InternalRecipeDSL.g:1282:2: 'basicinformation'
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getBasicinformationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalRecipeDSL.g:1291:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1295:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalRecipeDSL.g:1296:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalRecipeDSL.g:1303:1: rule__Header__Group__3__Impl : ( ( rule__Header__BasicinformationAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1307:1: ( ( ( rule__Header__BasicinformationAssignment_3 ) ) )
            // InternalRecipeDSL.g:1308:1: ( ( rule__Header__BasicinformationAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1308:1: ( ( rule__Header__BasicinformationAssignment_3 ) )
            // InternalRecipeDSL.g:1309:2: ( rule__Header__BasicinformationAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationAssignment_3()); 
            // InternalRecipeDSL.g:1310:2: ( rule__Header__BasicinformationAssignment_3 )
            // InternalRecipeDSL.g:1310:3: rule__Header__BasicinformationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Header__BasicinformationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getBasicinformationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalRecipeDSL.g:1318:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1322:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalRecipeDSL.g:1323:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Header__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalRecipeDSL.g:1330:1: rule__Header__Group__4__Impl : ( 'recipetitle' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1334:1: ( ( 'recipetitle' ) )
            // InternalRecipeDSL.g:1335:1: ( 'recipetitle' )
            {
            // InternalRecipeDSL.g:1335:1: ( 'recipetitle' )
            // InternalRecipeDSL.g:1336:2: 'recipetitle'
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRecipetitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Header__Group__5"
    // InternalRecipeDSL.g:1345:1: rule__Header__Group__5 : rule__Header__Group__5__Impl rule__Header__Group__6 ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1349:1: ( rule__Header__Group__5__Impl rule__Header__Group__6 )
            // InternalRecipeDSL.g:1350:2: rule__Header__Group__5__Impl rule__Header__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Header__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__5"


    // $ANTLR start "rule__Header__Group__5__Impl"
    // InternalRecipeDSL.g:1357:1: rule__Header__Group__5__Impl : ( ( rule__Header__RecipetitleAssignment_5 ) ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1361:1: ( ( ( rule__Header__RecipetitleAssignment_5 ) ) )
            // InternalRecipeDSL.g:1362:1: ( ( rule__Header__RecipetitleAssignment_5 ) )
            {
            // InternalRecipeDSL.g:1362:1: ( ( rule__Header__RecipetitleAssignment_5 ) )
            // InternalRecipeDSL.g:1363:2: ( rule__Header__RecipetitleAssignment_5 )
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleAssignment_5()); 
            // InternalRecipeDSL.g:1364:2: ( rule__Header__RecipetitleAssignment_5 )
            // InternalRecipeDSL.g:1364:3: rule__Header__RecipetitleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Header__RecipetitleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getRecipetitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__5__Impl"


    // $ANTLR start "rule__Header__Group__6"
    // InternalRecipeDSL.g:1372:1: rule__Header__Group__6 : rule__Header__Group__6__Impl rule__Header__Group__7 ;
    public final void rule__Header__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1376:1: ( rule__Header__Group__6__Impl rule__Header__Group__7 )
            // InternalRecipeDSL.g:1377:2: rule__Header__Group__6__Impl rule__Header__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Header__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__6"


    // $ANTLR start "rule__Header__Group__6__Impl"
    // InternalRecipeDSL.g:1384:1: rule__Header__Group__6__Impl : ( ( rule__Header__Group_6__0 )? ) ;
    public final void rule__Header__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1388:1: ( ( ( rule__Header__Group_6__0 )? ) )
            // InternalRecipeDSL.g:1389:1: ( ( rule__Header__Group_6__0 )? )
            {
            // InternalRecipeDSL.g:1389:1: ( ( rule__Header__Group_6__0 )? )
            // InternalRecipeDSL.g:1390:2: ( rule__Header__Group_6__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_6()); 
            // InternalRecipeDSL.g:1391:2: ( rule__Header__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeDSL.g:1391:3: rule__Header__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeaderAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__6__Impl"


    // $ANTLR start "rule__Header__Group__7"
    // InternalRecipeDSL.g:1399:1: rule__Header__Group__7 : rule__Header__Group__7__Impl ;
    public final void rule__Header__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1403:1: ( rule__Header__Group__7__Impl )
            // InternalRecipeDSL.g:1404:2: rule__Header__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__7"


    // $ANTLR start "rule__Header__Group__7__Impl"
    // InternalRecipeDSL.g:1410:1: rule__Header__Group__7__Impl : ( '}' ) ;
    public final void rule__Header__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1414:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1415:1: ( '}' )
            {
            // InternalRecipeDSL.g:1415:1: ( '}' )
            // InternalRecipeDSL.g:1416:2: '}'
            {
             before(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__7__Impl"


    // $ANTLR start "rule__Header__Group_6__0"
    // InternalRecipeDSL.g:1426:1: rule__Header__Group_6__0 : rule__Header__Group_6__0__Impl rule__Header__Group_6__1 ;
    public final void rule__Header__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1430:1: ( rule__Header__Group_6__0__Impl rule__Header__Group_6__1 )
            // InternalRecipeDSL.g:1431:2: rule__Header__Group_6__0__Impl rule__Header__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Header__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_6__0"


    // $ANTLR start "rule__Header__Group_6__0__Impl"
    // InternalRecipeDSL.g:1438:1: rule__Header__Group_6__0__Impl : ( 'image' ) ;
    public final void rule__Header__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1442:1: ( ( 'image' ) )
            // InternalRecipeDSL.g:1443:1: ( 'image' )
            {
            // InternalRecipeDSL.g:1443:1: ( 'image' )
            // InternalRecipeDSL.g:1444:2: 'image'
            {
             before(grammarAccess.getHeaderAccess().getImageKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getImageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_6__0__Impl"


    // $ANTLR start "rule__Header__Group_6__1"
    // InternalRecipeDSL.g:1453:1: rule__Header__Group_6__1 : rule__Header__Group_6__1__Impl ;
    public final void rule__Header__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1457:1: ( rule__Header__Group_6__1__Impl )
            // InternalRecipeDSL.g:1458:2: rule__Header__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_6__1"


    // $ANTLR start "rule__Header__Group_6__1__Impl"
    // InternalRecipeDSL.g:1464:1: rule__Header__Group_6__1__Impl : ( ( rule__Header__ImageAssignment_6_1 ) ) ;
    public final void rule__Header__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1468:1: ( ( ( rule__Header__ImageAssignment_6_1 ) ) )
            // InternalRecipeDSL.g:1469:1: ( ( rule__Header__ImageAssignment_6_1 ) )
            {
            // InternalRecipeDSL.g:1469:1: ( ( rule__Header__ImageAssignment_6_1 ) )
            // InternalRecipeDSL.g:1470:2: ( rule__Header__ImageAssignment_6_1 )
            {
             before(grammarAccess.getHeaderAccess().getImageAssignment_6_1()); 
            // InternalRecipeDSL.g:1471:2: ( rule__Header__ImageAssignment_6_1 )
            // InternalRecipeDSL.g:1471:3: rule__Header__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Header__ImageAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getImageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_6__1__Impl"


    // $ANTLR start "rule__Nutrients__Group__0"
    // InternalRecipeDSL.g:1480:1: rule__Nutrients__Group__0 : rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 ;
    public final void rule__Nutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1484:1: ( rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 )
            // InternalRecipeDSL.g:1485:2: rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Nutrients__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__0"


    // $ANTLR start "rule__Nutrients__Group__0__Impl"
    // InternalRecipeDSL.g:1492:1: rule__Nutrients__Group__0__Impl : ( 'Nutrients' ) ;
    public final void rule__Nutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1496:1: ( ( 'Nutrients' ) )
            // InternalRecipeDSL.g:1497:1: ( 'Nutrients' )
            {
            // InternalRecipeDSL.g:1497:1: ( 'Nutrients' )
            // InternalRecipeDSL.g:1498:2: 'Nutrients'
            {
             before(grammarAccess.getNutrientsAccess().getNutrientsKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getNutrientsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__0__Impl"


    // $ANTLR start "rule__Nutrients__Group__1"
    // InternalRecipeDSL.g:1507:1: rule__Nutrients__Group__1 : rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 ;
    public final void rule__Nutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1511:1: ( rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 )
            // InternalRecipeDSL.g:1512:2: rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Nutrients__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__1"


    // $ANTLR start "rule__Nutrients__Group__1__Impl"
    // InternalRecipeDSL.g:1519:1: rule__Nutrients__Group__1__Impl : ( '{' ) ;
    public final void rule__Nutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1523:1: ( ( '{' ) )
            // InternalRecipeDSL.g:1524:1: ( '{' )
            {
            // InternalRecipeDSL.g:1524:1: ( '{' )
            // InternalRecipeDSL.g:1525:2: '{'
            {
             before(grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__1__Impl"


    // $ANTLR start "rule__Nutrients__Group__2"
    // InternalRecipeDSL.g:1534:1: rule__Nutrients__Group__2 : rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 ;
    public final void rule__Nutrients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1538:1: ( rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 )
            // InternalRecipeDSL.g:1539:2: rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Nutrients__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__2"


    // $ANTLR start "rule__Nutrients__Group__2__Impl"
    // InternalRecipeDSL.g:1546:1: rule__Nutrients__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Nutrients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1550:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:1551:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:1551:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:1552:2: 'orderNumber'
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__2__Impl"


    // $ANTLR start "rule__Nutrients__Group__3"
    // InternalRecipeDSL.g:1561:1: rule__Nutrients__Group__3 : rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 ;
    public final void rule__Nutrients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1565:1: ( rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 )
            // InternalRecipeDSL.g:1566:2: rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__3"


    // $ANTLR start "rule__Nutrients__Group__3__Impl"
    // InternalRecipeDSL.g:1573:1: rule__Nutrients__Group__3__Impl : ( ( rule__Nutrients__OrderNumberAssignment_3 ) ) ;
    public final void rule__Nutrients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1577:1: ( ( ( rule__Nutrients__OrderNumberAssignment_3 ) ) )
            // InternalRecipeDSL.g:1578:1: ( ( rule__Nutrients__OrderNumberAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1578:1: ( ( rule__Nutrients__OrderNumberAssignment_3 ) )
            // InternalRecipeDSL.g:1579:2: ( rule__Nutrients__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipeDSL.g:1580:2: ( rule__Nutrients__OrderNumberAssignment_3 )
            // InternalRecipeDSL.g:1580:3: rule__Nutrients__OrderNumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__OrderNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getOrderNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__3__Impl"


    // $ANTLR start "rule__Nutrients__Group__4"
    // InternalRecipeDSL.g:1588:1: rule__Nutrients__Group__4 : rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5 ;
    public final void rule__Nutrients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1592:1: ( rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5 )
            // InternalRecipeDSL.g:1593:2: rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__4"


    // $ANTLR start "rule__Nutrients__Group__4__Impl"
    // InternalRecipeDSL.g:1600:1: rule__Nutrients__Group__4__Impl : ( ( rule__Nutrients__Group_4__0 )? ) ;
    public final void rule__Nutrients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1604:1: ( ( ( rule__Nutrients__Group_4__0 )? ) )
            // InternalRecipeDSL.g:1605:1: ( ( rule__Nutrients__Group_4__0 )? )
            {
            // InternalRecipeDSL.g:1605:1: ( ( rule__Nutrients__Group_4__0 )? )
            // InternalRecipeDSL.g:1606:2: ( rule__Nutrients__Group_4__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_4()); 
            // InternalRecipeDSL.g:1607:2: ( rule__Nutrients__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeDSL.g:1607:3: rule__Nutrients__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNutrientsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__4__Impl"


    // $ANTLR start "rule__Nutrients__Group__5"
    // InternalRecipeDSL.g:1615:1: rule__Nutrients__Group__5 : rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6 ;
    public final void rule__Nutrients__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1619:1: ( rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6 )
            // InternalRecipeDSL.g:1620:2: rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__5"


    // $ANTLR start "rule__Nutrients__Group__5__Impl"
    // InternalRecipeDSL.g:1627:1: rule__Nutrients__Group__5__Impl : ( ( rule__Nutrients__Group_5__0 )? ) ;
    public final void rule__Nutrients__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1631:1: ( ( ( rule__Nutrients__Group_5__0 )? ) )
            // InternalRecipeDSL.g:1632:1: ( ( rule__Nutrients__Group_5__0 )? )
            {
            // InternalRecipeDSL.g:1632:1: ( ( rule__Nutrients__Group_5__0 )? )
            // InternalRecipeDSL.g:1633:2: ( rule__Nutrients__Group_5__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_5()); 
            // InternalRecipeDSL.g:1634:2: ( rule__Nutrients__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipeDSL.g:1634:3: rule__Nutrients__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNutrientsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__5__Impl"


    // $ANTLR start "rule__Nutrients__Group__6"
    // InternalRecipeDSL.g:1642:1: rule__Nutrients__Group__6 : rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7 ;
    public final void rule__Nutrients__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1646:1: ( rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7 )
            // InternalRecipeDSL.g:1647:2: rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__6"


    // $ANTLR start "rule__Nutrients__Group__6__Impl"
    // InternalRecipeDSL.g:1654:1: rule__Nutrients__Group__6__Impl : ( ( rule__Nutrients__Group_6__0 )? ) ;
    public final void rule__Nutrients__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1658:1: ( ( ( rule__Nutrients__Group_6__0 )? ) )
            // InternalRecipeDSL.g:1659:1: ( ( rule__Nutrients__Group_6__0 )? )
            {
            // InternalRecipeDSL.g:1659:1: ( ( rule__Nutrients__Group_6__0 )? )
            // InternalRecipeDSL.g:1660:2: ( rule__Nutrients__Group_6__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_6()); 
            // InternalRecipeDSL.g:1661:2: ( rule__Nutrients__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipeDSL.g:1661:3: rule__Nutrients__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNutrientsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__6__Impl"


    // $ANTLR start "rule__Nutrients__Group__7"
    // InternalRecipeDSL.g:1669:1: rule__Nutrients__Group__7 : rule__Nutrients__Group__7__Impl ;
    public final void rule__Nutrients__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1673:1: ( rule__Nutrients__Group__7__Impl )
            // InternalRecipeDSL.g:1674:2: rule__Nutrients__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__7"


    // $ANTLR start "rule__Nutrients__Group__7__Impl"
    // InternalRecipeDSL.g:1680:1: rule__Nutrients__Group__7__Impl : ( '}' ) ;
    public final void rule__Nutrients__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1684:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1685:1: ( '}' )
            {
            // InternalRecipeDSL.g:1685:1: ( '}' )
            // InternalRecipeDSL.g:1686:2: '}'
            {
             before(grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__7__Impl"


    // $ANTLR start "rule__Nutrients__Group_4__0"
    // InternalRecipeDSL.g:1696:1: rule__Nutrients__Group_4__0 : rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1 ;
    public final void rule__Nutrients__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1700:1: ( rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1 )
            // InternalRecipeDSL.g:1701:2: rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Nutrients__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_4__0"


    // $ANTLR start "rule__Nutrients__Group_4__0__Impl"
    // InternalRecipeDSL.g:1708:1: rule__Nutrients__Group_4__0__Impl : ( 'percentagetoggle' ) ;
    public final void rule__Nutrients__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1712:1: ( ( 'percentagetoggle' ) )
            // InternalRecipeDSL.g:1713:1: ( 'percentagetoggle' )
            {
            // InternalRecipeDSL.g:1713:1: ( 'percentagetoggle' )
            // InternalRecipeDSL.g:1714:2: 'percentagetoggle'
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_4__0__Impl"


    // $ANTLR start "rule__Nutrients__Group_4__1"
    // InternalRecipeDSL.g:1723:1: rule__Nutrients__Group_4__1 : rule__Nutrients__Group_4__1__Impl ;
    public final void rule__Nutrients__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1727:1: ( rule__Nutrients__Group_4__1__Impl )
            // InternalRecipeDSL.g:1728:2: rule__Nutrients__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_4__1"


    // $ANTLR start "rule__Nutrients__Group_4__1__Impl"
    // InternalRecipeDSL.g:1734:1: rule__Nutrients__Group_4__1__Impl : ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) ) ;
    public final void rule__Nutrients__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1738:1: ( ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) ) )
            // InternalRecipeDSL.g:1739:1: ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) )
            {
            // InternalRecipeDSL.g:1739:1: ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) )
            // InternalRecipeDSL.g:1740:2: ( rule__Nutrients__PercentagetoggleAssignment_4_1 )
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetoggleAssignment_4_1()); 
            // InternalRecipeDSL.g:1741:2: ( rule__Nutrients__PercentagetoggleAssignment_4_1 )
            // InternalRecipeDSL.g:1741:3: rule__Nutrients__PercentagetoggleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__PercentagetoggleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getPercentagetoggleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_4__1__Impl"


    // $ANTLR start "rule__Nutrients__Group_5__0"
    // InternalRecipeDSL.g:1750:1: rule__Nutrients__Group_5__0 : rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1 ;
    public final void rule__Nutrients__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1754:1: ( rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1 )
            // InternalRecipeDSL.g:1755:2: rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__Nutrients__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_5__0"


    // $ANTLR start "rule__Nutrients__Group_5__0__Impl"
    // InternalRecipeDSL.g:1762:1: rule__Nutrients__Group_5__0__Impl : ( 'vitamins' ) ;
    public final void rule__Nutrients__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1766:1: ( ( 'vitamins' ) )
            // InternalRecipeDSL.g:1767:1: ( 'vitamins' )
            {
            // InternalRecipeDSL.g:1767:1: ( 'vitamins' )
            // InternalRecipeDSL.g:1768:2: 'vitamins'
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getVitaminsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_5__0__Impl"


    // $ANTLR start "rule__Nutrients__Group_5__1"
    // InternalRecipeDSL.g:1777:1: rule__Nutrients__Group_5__1 : rule__Nutrients__Group_5__1__Impl ;
    public final void rule__Nutrients__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1781:1: ( rule__Nutrients__Group_5__1__Impl )
            // InternalRecipeDSL.g:1782:2: rule__Nutrients__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_5__1"


    // $ANTLR start "rule__Nutrients__Group_5__1__Impl"
    // InternalRecipeDSL.g:1788:1: rule__Nutrients__Group_5__1__Impl : ( ( rule__Nutrients__VitaminsAssignment_5_1 ) ) ;
    public final void rule__Nutrients__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1792:1: ( ( ( rule__Nutrients__VitaminsAssignment_5_1 ) ) )
            // InternalRecipeDSL.g:1793:1: ( ( rule__Nutrients__VitaminsAssignment_5_1 ) )
            {
            // InternalRecipeDSL.g:1793:1: ( ( rule__Nutrients__VitaminsAssignment_5_1 ) )
            // InternalRecipeDSL.g:1794:2: ( rule__Nutrients__VitaminsAssignment_5_1 )
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsAssignment_5_1()); 
            // InternalRecipeDSL.g:1795:2: ( rule__Nutrients__VitaminsAssignment_5_1 )
            // InternalRecipeDSL.g:1795:3: rule__Nutrients__VitaminsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__VitaminsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getVitaminsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_5__1__Impl"


    // $ANTLR start "rule__Nutrients__Group_6__0"
    // InternalRecipeDSL.g:1804:1: rule__Nutrients__Group_6__0 : rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1 ;
    public final void rule__Nutrients__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1808:1: ( rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1 )
            // InternalRecipeDSL.g:1809:2: rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__Nutrients__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_6__0"


    // $ANTLR start "rule__Nutrients__Group_6__0__Impl"
    // InternalRecipeDSL.g:1816:1: rule__Nutrients__Group_6__0__Impl : ( 'macronutrients' ) ;
    public final void rule__Nutrients__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1820:1: ( ( 'macronutrients' ) )
            // InternalRecipeDSL.g:1821:1: ( 'macronutrients' )
            {
            // InternalRecipeDSL.g:1821:1: ( 'macronutrients' )
            // InternalRecipeDSL.g:1822:2: 'macronutrients'
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_6__0__Impl"


    // $ANTLR start "rule__Nutrients__Group_6__1"
    // InternalRecipeDSL.g:1831:1: rule__Nutrients__Group_6__1 : rule__Nutrients__Group_6__1__Impl ;
    public final void rule__Nutrients__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1835:1: ( rule__Nutrients__Group_6__1__Impl )
            // InternalRecipeDSL.g:1836:2: rule__Nutrients__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_6__1"


    // $ANTLR start "rule__Nutrients__Group_6__1__Impl"
    // InternalRecipeDSL.g:1842:1: rule__Nutrients__Group_6__1__Impl : ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) ) ;
    public final void rule__Nutrients__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1846:1: ( ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) ) )
            // InternalRecipeDSL.g:1847:1: ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) )
            {
            // InternalRecipeDSL.g:1847:1: ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) )
            // InternalRecipeDSL.g:1848:2: ( rule__Nutrients__MacronutrientsAssignment_6_1 )
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsAssignment_6_1()); 
            // InternalRecipeDSL.g:1849:2: ( rule__Nutrients__MacronutrientsAssignment_6_1 )
            // InternalRecipeDSL.g:1849:3: rule__Nutrients__MacronutrientsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__MacronutrientsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getMacronutrientsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRecipeDSL.g:1858:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1862:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRecipeDSL.g:1863:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalRecipeDSL.g:1870:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1874:1: ( ( ( '-' )? ) )
            // InternalRecipeDSL.g:1875:1: ( ( '-' )? )
            {
            // InternalRecipeDSL.g:1875:1: ( ( '-' )? )
            // InternalRecipeDSL.g:1876:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipeDSL.g:1877:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipeDSL.g:1877:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalRecipeDSL.g:1885:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1889:1: ( rule__EInt__Group__1__Impl )
            // InternalRecipeDSL.g:1890:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalRecipeDSL.g:1896:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1900:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1901:1: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1901:1: ( RULE_INT )
            // InternalRecipeDSL.g:1902:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__UnitOfMeasure__Group__0"
    // InternalRecipeDSL.g:1912:1: rule__UnitOfMeasure__Group__0 : rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 ;
    public final void rule__UnitOfMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1916:1: ( rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 )
            // InternalRecipeDSL.g:1917:2: rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__UnitOfMeasure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitOfMeasure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitOfMeasure__Group__0"


    // $ANTLR start "rule__UnitOfMeasure__Group__0__Impl"
    // InternalRecipeDSL.g:1924:1: rule__UnitOfMeasure__Group__0__Impl : ( () ) ;
    public final void rule__UnitOfMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1928:1: ( ( () ) )
            // InternalRecipeDSL.g:1929:1: ( () )
            {
            // InternalRecipeDSL.g:1929:1: ( () )
            // InternalRecipeDSL.g:1930:2: ()
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureAction_0()); 
            // InternalRecipeDSL.g:1931:2: ()
            // InternalRecipeDSL.g:1931:3: 
            {
            }

             after(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitOfMeasure__Group__0__Impl"


    // $ANTLR start "rule__UnitOfMeasure__Group__1"
    // InternalRecipeDSL.g:1939:1: rule__UnitOfMeasure__Group__1 : rule__UnitOfMeasure__Group__1__Impl ;
    public final void rule__UnitOfMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1943:1: ( rule__UnitOfMeasure__Group__1__Impl )
            // InternalRecipeDSL.g:1944:2: rule__UnitOfMeasure__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitOfMeasure__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitOfMeasure__Group__1"


    // $ANTLR start "rule__UnitOfMeasure__Group__1__Impl"
    // InternalRecipeDSL.g:1950:1: rule__UnitOfMeasure__Group__1__Impl : ( 'UnitOfMeasure' ) ;
    public final void rule__UnitOfMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1954:1: ( ( 'UnitOfMeasure' ) )
            // InternalRecipeDSL.g:1955:1: ( 'UnitOfMeasure' )
            {
            // InternalRecipeDSL.g:1955:1: ( 'UnitOfMeasure' )
            // InternalRecipeDSL.g:1956:2: 'UnitOfMeasure'
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitOfMeasure__Group__1__Impl"


    // $ANTLR start "rule__BasicInformation__Group__0"
    // InternalRecipeDSL.g:1966:1: rule__BasicInformation__Group__0 : rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 ;
    public final void rule__BasicInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1970:1: ( rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 )
            // InternalRecipeDSL.g:1971:2: rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BasicInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInformation__Group__0"


    // $ANTLR start "rule__BasicInformation__Group__0__Impl"
    // InternalRecipeDSL.g:1978:1: rule__BasicInformation__Group__0__Impl : ( () ) ;
    public final void rule__BasicInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1982:1: ( ( () ) )
            // InternalRecipeDSL.g:1983:1: ( () )
            {
            // InternalRecipeDSL.g:1983:1: ( () )
            // InternalRecipeDSL.g:1984:2: ()
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationAction_0()); 
            // InternalRecipeDSL.g:1985:2: ()
            // InternalRecipeDSL.g:1985:3: 
            {
            }

             after(grammarAccess.getBasicInformationAccess().getBasicInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInformation__Group__0__Impl"


    // $ANTLR start "rule__BasicInformation__Group__1"
    // InternalRecipeDSL.g:1993:1: rule__BasicInformation__Group__1 : rule__BasicInformation__Group__1__Impl ;
    public final void rule__BasicInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1997:1: ( rule__BasicInformation__Group__1__Impl )
            // InternalRecipeDSL.g:1998:2: rule__BasicInformation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInformation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInformation__Group__1"


    // $ANTLR start "rule__BasicInformation__Group__1__Impl"
    // InternalRecipeDSL.g:2004:1: rule__BasicInformation__Group__1__Impl : ( 'BasicInformation' ) ;
    public final void rule__BasicInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2008:1: ( ( 'BasicInformation' ) )
            // InternalRecipeDSL.g:2009:1: ( 'BasicInformation' )
            {
            // InternalRecipeDSL.g:2009:1: ( 'BasicInformation' )
            // InternalRecipeDSL.g:2010:2: 'BasicInformation'
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInformation__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalRecipeDSL.g:2020:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2024:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalRecipeDSL.g:2025:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalRecipeDSL.g:2032:1: rule__Title__Group__0__Impl : ( () ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2036:1: ( ( () ) )
            // InternalRecipeDSL.g:2037:1: ( () )
            {
            // InternalRecipeDSL.g:2037:1: ( () )
            // InternalRecipeDSL.g:2038:2: ()
            {
             before(grammarAccess.getTitleAccess().getTitleAction_0()); 
            // InternalRecipeDSL.g:2039:2: ()
            // InternalRecipeDSL.g:2039:3: 
            {
            }

             after(grammarAccess.getTitleAccess().getTitleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalRecipeDSL.g:2047:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2051:1: ( rule__Title__Group__1__Impl )
            // InternalRecipeDSL.g:2052:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalRecipeDSL.g:2058:1: rule__Title__Group__1__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2062:1: ( ( 'Title' ) )
            // InternalRecipeDSL.g:2063:1: ( 'Title' )
            {
            // InternalRecipeDSL.g:2063:1: ( 'Title' )
            // InternalRecipeDSL.g:2064:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalRecipeDSL.g:2074:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2078:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalRecipeDSL.g:2079:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalRecipeDSL.g:2086:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2090:1: ( ( () ) )
            // InternalRecipeDSL.g:2091:1: ( () )
            {
            // InternalRecipeDSL.g:2091:1: ( () )
            // InternalRecipeDSL.g:2092:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalRecipeDSL.g:2093:2: ()
            // InternalRecipeDSL.g:2093:3: 
            {
            }

             after(grammarAccess.getImageAccess().getImageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalRecipeDSL.g:2101:1: rule__Image__Group__1 : rule__Image__Group__1__Impl ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2105:1: ( rule__Image__Group__1__Impl )
            // InternalRecipeDSL.g:2106:2: rule__Image__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalRecipeDSL.g:2112:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2116:1: ( ( 'Image' ) )
            // InternalRecipeDSL.g:2117:1: ( 'Image' )
            {
            // InternalRecipeDSL.g:2117:1: ( 'Image' )
            // InternalRecipeDSL.g:2118:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__PercentageAmountToggle__Group__0"
    // InternalRecipeDSL.g:2128:1: rule__PercentageAmountToggle__Group__0 : rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 ;
    public final void rule__PercentageAmountToggle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2132:1: ( rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 )
            // InternalRecipeDSL.g:2133:2: rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__PercentageAmountToggle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PercentageAmountToggle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentageAmountToggle__Group__0"


    // $ANTLR start "rule__PercentageAmountToggle__Group__0__Impl"
    // InternalRecipeDSL.g:2140:1: rule__PercentageAmountToggle__Group__0__Impl : ( () ) ;
    public final void rule__PercentageAmountToggle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2144:1: ( ( () ) )
            // InternalRecipeDSL.g:2145:1: ( () )
            {
            // InternalRecipeDSL.g:2145:1: ( () )
            // InternalRecipeDSL.g:2146:2: ()
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0()); 
            // InternalRecipeDSL.g:2147:2: ()
            // InternalRecipeDSL.g:2147:3: 
            {
            }

             after(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentageAmountToggle__Group__0__Impl"


    // $ANTLR start "rule__PercentageAmountToggle__Group__1"
    // InternalRecipeDSL.g:2155:1: rule__PercentageAmountToggle__Group__1 : rule__PercentageAmountToggle__Group__1__Impl ;
    public final void rule__PercentageAmountToggle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2159:1: ( rule__PercentageAmountToggle__Group__1__Impl )
            // InternalRecipeDSL.g:2160:2: rule__PercentageAmountToggle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PercentageAmountToggle__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentageAmountToggle__Group__1"


    // $ANTLR start "rule__PercentageAmountToggle__Group__1__Impl"
    // InternalRecipeDSL.g:2166:1: rule__PercentageAmountToggle__Group__1__Impl : ( 'PercentageAmountToggle' ) ;
    public final void rule__PercentageAmountToggle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2170:1: ( ( 'PercentageAmountToggle' ) )
            // InternalRecipeDSL.g:2171:1: ( 'PercentageAmountToggle' )
            {
            // InternalRecipeDSL.g:2171:1: ( 'PercentageAmountToggle' )
            // InternalRecipeDSL.g:2172:2: 'PercentageAmountToggle'
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentageAmountToggle__Group__1__Impl"


    // $ANTLR start "rule__Vitamins__Group__0"
    // InternalRecipeDSL.g:2182:1: rule__Vitamins__Group__0 : rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 ;
    public final void rule__Vitamins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2186:1: ( rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 )
            // InternalRecipeDSL.g:2187:2: rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Vitamins__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__0"


    // $ANTLR start "rule__Vitamins__Group__0__Impl"
    // InternalRecipeDSL.g:2194:1: rule__Vitamins__Group__0__Impl : ( 'Vitamins' ) ;
    public final void rule__Vitamins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2198:1: ( ( 'Vitamins' ) )
            // InternalRecipeDSL.g:2199:1: ( 'Vitamins' )
            {
            // InternalRecipeDSL.g:2199:1: ( 'Vitamins' )
            // InternalRecipeDSL.g:2200:2: 'Vitamins'
            {
             before(grammarAccess.getVitaminsAccess().getVitaminsKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getVitaminsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__0__Impl"


    // $ANTLR start "rule__Vitamins__Group__1"
    // InternalRecipeDSL.g:2209:1: rule__Vitamins__Group__1 : rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 ;
    public final void rule__Vitamins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2213:1: ( rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 )
            // InternalRecipeDSL.g:2214:2: rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Vitamins__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__1"


    // $ANTLR start "rule__Vitamins__Group__1__Impl"
    // InternalRecipeDSL.g:2221:1: rule__Vitamins__Group__1__Impl : ( '{' ) ;
    public final void rule__Vitamins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2225:1: ( ( '{' ) )
            // InternalRecipeDSL.g:2226:1: ( '{' )
            {
            // InternalRecipeDSL.g:2226:1: ( '{' )
            // InternalRecipeDSL.g:2227:2: '{'
            {
             before(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__1__Impl"


    // $ANTLR start "rule__Vitamins__Group__2"
    // InternalRecipeDSL.g:2236:1: rule__Vitamins__Group__2 : rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 ;
    public final void rule__Vitamins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2240:1: ( rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 )
            // InternalRecipeDSL.g:2241:2: rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Vitamins__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__2"


    // $ANTLR start "rule__Vitamins__Group__2__Impl"
    // InternalRecipeDSL.g:2248:1: rule__Vitamins__Group__2__Impl : ( 'Vitamin' ) ;
    public final void rule__Vitamins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2252:1: ( ( 'Vitamin' ) )
            // InternalRecipeDSL.g:2253:1: ( 'Vitamin' )
            {
            // InternalRecipeDSL.g:2253:1: ( 'Vitamin' )
            // InternalRecipeDSL.g:2254:2: 'Vitamin'
            {
             before(grammarAccess.getVitaminsAccess().getVitaminKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getVitaminKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__2__Impl"


    // $ANTLR start "rule__Vitamins__Group__3"
    // InternalRecipeDSL.g:2263:1: rule__Vitamins__Group__3 : rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 ;
    public final void rule__Vitamins__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2267:1: ( rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 )
            // InternalRecipeDSL.g:2268:2: rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Vitamins__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__3"


    // $ANTLR start "rule__Vitamins__Group__3__Impl"
    // InternalRecipeDSL.g:2275:1: rule__Vitamins__Group__3__Impl : ( '{' ) ;
    public final void rule__Vitamins__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2279:1: ( ( '{' ) )
            // InternalRecipeDSL.g:2280:1: ( '{' )
            {
            // InternalRecipeDSL.g:2280:1: ( '{' )
            // InternalRecipeDSL.g:2281:2: '{'
            {
             before(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__3__Impl"


    // $ANTLR start "rule__Vitamins__Group__4"
    // InternalRecipeDSL.g:2290:1: rule__Vitamins__Group__4 : rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 ;
    public final void rule__Vitamins__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2294:1: ( rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 )
            // InternalRecipeDSL.g:2295:2: rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Vitamins__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__4"


    // $ANTLR start "rule__Vitamins__Group__4__Impl"
    // InternalRecipeDSL.g:2302:1: rule__Vitamins__Group__4__Impl : ( ( rule__Vitamins__VitaminAssignment_4 ) ) ;
    public final void rule__Vitamins__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2306:1: ( ( ( rule__Vitamins__VitaminAssignment_4 ) ) )
            // InternalRecipeDSL.g:2307:1: ( ( rule__Vitamins__VitaminAssignment_4 ) )
            {
            // InternalRecipeDSL.g:2307:1: ( ( rule__Vitamins__VitaminAssignment_4 ) )
            // InternalRecipeDSL.g:2308:2: ( rule__Vitamins__VitaminAssignment_4 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_4()); 
            // InternalRecipeDSL.g:2309:2: ( rule__Vitamins__VitaminAssignment_4 )
            // InternalRecipeDSL.g:2309:3: rule__Vitamins__VitaminAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__VitaminAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVitaminsAccess().getVitaminAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__4__Impl"


    // $ANTLR start "rule__Vitamins__Group__5"
    // InternalRecipeDSL.g:2317:1: rule__Vitamins__Group__5 : rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6 ;
    public final void rule__Vitamins__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2321:1: ( rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6 )
            // InternalRecipeDSL.g:2322:2: rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Vitamins__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__5"


    // $ANTLR start "rule__Vitamins__Group__5__Impl"
    // InternalRecipeDSL.g:2329:1: rule__Vitamins__Group__5__Impl : ( ( rule__Vitamins__Group_5__0 )* ) ;
    public final void rule__Vitamins__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2333:1: ( ( ( rule__Vitamins__Group_5__0 )* ) )
            // InternalRecipeDSL.g:2334:1: ( ( rule__Vitamins__Group_5__0 )* )
            {
            // InternalRecipeDSL.g:2334:1: ( ( rule__Vitamins__Group_5__0 )* )
            // InternalRecipeDSL.g:2335:2: ( rule__Vitamins__Group_5__0 )*
            {
             before(grammarAccess.getVitaminsAccess().getGroup_5()); 
            // InternalRecipeDSL.g:2336:2: ( rule__Vitamins__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipeDSL.g:2336:3: rule__Vitamins__Group_5__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Vitamins__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVitaminsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__5__Impl"


    // $ANTLR start "rule__Vitamins__Group__6"
    // InternalRecipeDSL.g:2344:1: rule__Vitamins__Group__6 : rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7 ;
    public final void rule__Vitamins__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2348:1: ( rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7 )
            // InternalRecipeDSL.g:2349:2: rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Vitamins__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__6"


    // $ANTLR start "rule__Vitamins__Group__6__Impl"
    // InternalRecipeDSL.g:2356:1: rule__Vitamins__Group__6__Impl : ( '}' ) ;
    public final void rule__Vitamins__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2360:1: ( ( '}' ) )
            // InternalRecipeDSL.g:2361:1: ( '}' )
            {
            // InternalRecipeDSL.g:2361:1: ( '}' )
            // InternalRecipeDSL.g:2362:2: '}'
            {
             before(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__6__Impl"


    // $ANTLR start "rule__Vitamins__Group__7"
    // InternalRecipeDSL.g:2371:1: rule__Vitamins__Group__7 : rule__Vitamins__Group__7__Impl ;
    public final void rule__Vitamins__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2375:1: ( rule__Vitamins__Group__7__Impl )
            // InternalRecipeDSL.g:2376:2: rule__Vitamins__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__7"


    // $ANTLR start "rule__Vitamins__Group__7__Impl"
    // InternalRecipeDSL.g:2382:1: rule__Vitamins__Group__7__Impl : ( '}' ) ;
    public final void rule__Vitamins__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2386:1: ( ( '}' ) )
            // InternalRecipeDSL.g:2387:1: ( '}' )
            {
            // InternalRecipeDSL.g:2387:1: ( '}' )
            // InternalRecipeDSL.g:2388:2: '}'
            {
             before(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__7__Impl"


    // $ANTLR start "rule__Vitamins__Group_5__0"
    // InternalRecipeDSL.g:2398:1: rule__Vitamins__Group_5__0 : rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1 ;
    public final void rule__Vitamins__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2402:1: ( rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1 )
            // InternalRecipeDSL.g:2403:2: rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Vitamins__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_5__0"


    // $ANTLR start "rule__Vitamins__Group_5__0__Impl"
    // InternalRecipeDSL.g:2410:1: rule__Vitamins__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Vitamins__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2414:1: ( ( ',' ) )
            // InternalRecipeDSL.g:2415:1: ( ',' )
            {
            // InternalRecipeDSL.g:2415:1: ( ',' )
            // InternalRecipeDSL.g:2416:2: ','
            {
             before(grammarAccess.getVitaminsAccess().getCommaKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_5__0__Impl"


    // $ANTLR start "rule__Vitamins__Group_5__1"
    // InternalRecipeDSL.g:2425:1: rule__Vitamins__Group_5__1 : rule__Vitamins__Group_5__1__Impl ;
    public final void rule__Vitamins__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2429:1: ( rule__Vitamins__Group_5__1__Impl )
            // InternalRecipeDSL.g:2430:2: rule__Vitamins__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_5__1"


    // $ANTLR start "rule__Vitamins__Group_5__1__Impl"
    // InternalRecipeDSL.g:2436:1: rule__Vitamins__Group_5__1__Impl : ( ( rule__Vitamins__VitaminAssignment_5_1 ) ) ;
    public final void rule__Vitamins__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2440:1: ( ( ( rule__Vitamins__VitaminAssignment_5_1 ) ) )
            // InternalRecipeDSL.g:2441:1: ( ( rule__Vitamins__VitaminAssignment_5_1 ) )
            {
            // InternalRecipeDSL.g:2441:1: ( ( rule__Vitamins__VitaminAssignment_5_1 ) )
            // InternalRecipeDSL.g:2442:2: ( rule__Vitamins__VitaminAssignment_5_1 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_5_1()); 
            // InternalRecipeDSL.g:2443:2: ( rule__Vitamins__VitaminAssignment_5_1 )
            // InternalRecipeDSL.g:2443:3: rule__Vitamins__VitaminAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__VitaminAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVitaminsAccess().getVitaminAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_5__1__Impl"


    // $ANTLR start "rule__Macronutrients__Group__0"
    // InternalRecipeDSL.g:2452:1: rule__Macronutrients__Group__0 : rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 ;
    public final void rule__Macronutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2456:1: ( rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 )
            // InternalRecipeDSL.g:2457:2: rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Macronutrients__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macronutrients__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macronutrients__Group__0"


    // $ANTLR start "rule__Macronutrients__Group__0__Impl"
    // InternalRecipeDSL.g:2464:1: rule__Macronutrients__Group__0__Impl : ( () ) ;
    public final void rule__Macronutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2468:1: ( ( () ) )
            // InternalRecipeDSL.g:2469:1: ( () )
            {
            // InternalRecipeDSL.g:2469:1: ( () )
            // InternalRecipeDSL.g:2470:2: ()
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0()); 
            // InternalRecipeDSL.g:2471:2: ()
            // InternalRecipeDSL.g:2471:3: 
            {
            }

             after(grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macronutrients__Group__0__Impl"


    // $ANTLR start "rule__Macronutrients__Group__1"
    // InternalRecipeDSL.g:2479:1: rule__Macronutrients__Group__1 : rule__Macronutrients__Group__1__Impl ;
    public final void rule__Macronutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2483:1: ( rule__Macronutrients__Group__1__Impl )
            // InternalRecipeDSL.g:2484:2: rule__Macronutrients__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macronutrients__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macronutrients__Group__1"


    // $ANTLR start "rule__Macronutrients__Group__1__Impl"
    // InternalRecipeDSL.g:2490:1: rule__Macronutrients__Group__1__Impl : ( 'Macronutrients' ) ;
    public final void rule__Macronutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2494:1: ( ( 'Macronutrients' ) )
            // InternalRecipeDSL.g:2495:1: ( 'Macronutrients' )
            {
            // InternalRecipeDSL.g:2495:1: ( 'Macronutrients' )
            // InternalRecipeDSL.g:2496:2: 'Macronutrients'
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macronutrients__Group__1__Impl"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalRecipeDSL.g:2506:1: rule__Page__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2510:1: ( ( ruleEString ) )
            // InternalRecipeDSL.g:2511:2: ( ruleEString )
            {
            // InternalRecipeDSL.g:2511:2: ( ruleEString )
            // InternalRecipeDSL.g:2512:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__InstructionsAssignment_4"
    // InternalRecipeDSL.g:2521:1: rule__Page__InstructionsAssignment_4 : ( ruleInstructions ) ;
    public final void rule__Page__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2525:1: ( ( ruleInstructions ) )
            // InternalRecipeDSL.g:2526:2: ( ruleInstructions )
            {
            // InternalRecipeDSL.g:2526:2: ( ruleInstructions )
            // InternalRecipeDSL.g:2527:3: ruleInstructions
            {
             before(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__InstructionsAssignment_4"


    // $ANTLR start "rule__Page__IngredientsAssignment_6"
    // InternalRecipeDSL.g:2536:1: rule__Page__IngredientsAssignment_6 : ( ruleIngredients ) ;
    public final void rule__Page__IngredientsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2540:1: ( ( ruleIngredients ) )
            // InternalRecipeDSL.g:2541:2: ( ruleIngredients )
            {
            // InternalRecipeDSL.g:2541:2: ( ruleIngredients )
            // InternalRecipeDSL.g:2542:3: ruleIngredients
            {
             before(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredients();

            state._fsp--;

             after(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__IngredientsAssignment_6"


    // $ANTLR start "rule__Page__HeaderAssignment_8"
    // InternalRecipeDSL.g:2551:1: rule__Page__HeaderAssignment_8 : ( ruleHeader ) ;
    public final void rule__Page__HeaderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2555:1: ( ( ruleHeader ) )
            // InternalRecipeDSL.g:2556:2: ( ruleHeader )
            {
            // InternalRecipeDSL.g:2556:2: ( ruleHeader )
            // InternalRecipeDSL.g:2557:3: ruleHeader
            {
             before(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HeaderAssignment_8"


    // $ANTLR start "rule__Page__NutrientsAssignment_9_1"
    // InternalRecipeDSL.g:2566:1: rule__Page__NutrientsAssignment_9_1 : ( ruleNutrients ) ;
    public final void rule__Page__NutrientsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2570:1: ( ( ruleNutrients ) )
            // InternalRecipeDSL.g:2571:2: ( ruleNutrients )
            {
            // InternalRecipeDSL.g:2571:2: ( ruleNutrients )
            // InternalRecipeDSL.g:2572:3: ruleNutrients
            {
             before(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutrients();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NutrientsAssignment_9_1"


    // $ANTLR start "rule__Instructions__OrderNumberAssignment_3"
    // InternalRecipeDSL.g:2581:1: rule__Instructions__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Instructions__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2585:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2586:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2586:2: ( ruleEInt )
            // InternalRecipeDSL.g:2587:3: ruleEInt
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__OrderNumberAssignment_3"


    // $ANTLR start "rule__Ingredients__OrderNumberAssignment_3"
    // InternalRecipeDSL.g:2596:1: rule__Ingredients__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Ingredients__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2600:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2601:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2601:2: ( ruleEInt )
            // InternalRecipeDSL.g:2602:3: ruleEInt
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__OrderNumberAssignment_3"


    // $ANTLR start "rule__Ingredients__UnittoggleAssignment_4_1"
    // InternalRecipeDSL.g:2611:1: rule__Ingredients__UnittoggleAssignment_4_1 : ( ruleUnitOfMeasure ) ;
    public final void rule__Ingredients__UnittoggleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2615:1: ( ( ruleUnitOfMeasure ) )
            // InternalRecipeDSL.g:2616:2: ( ruleUnitOfMeasure )
            {
            // InternalRecipeDSL.g:2616:2: ( ruleUnitOfMeasure )
            // InternalRecipeDSL.g:2617:3: ruleUnitOfMeasure
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitOfMeasure();

            state._fsp--;

             after(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnittoggleAssignment_4_1"


    // $ANTLR start "rule__Header__BasicinformationAssignment_3"
    // InternalRecipeDSL.g:2626:1: rule__Header__BasicinformationAssignment_3 : ( ruleBasicInformation ) ;
    public final void rule__Header__BasicinformationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2630:1: ( ( ruleBasicInformation ) )
            // InternalRecipeDSL.g:2631:2: ( ruleBasicInformation )
            {
            // InternalRecipeDSL.g:2631:2: ( ruleBasicInformation )
            // InternalRecipeDSL.g:2632:3: ruleBasicInformation
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicInformation();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__BasicinformationAssignment_3"


    // $ANTLR start "rule__Header__RecipetitleAssignment_5"
    // InternalRecipeDSL.g:2641:1: rule__Header__RecipetitleAssignment_5 : ( ruleTitle ) ;
    public final void rule__Header__RecipetitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2645:1: ( ( ruleTitle ) )
            // InternalRecipeDSL.g:2646:2: ( ruleTitle )
            {
            // InternalRecipeDSL.g:2646:2: ( ruleTitle )
            // InternalRecipeDSL.g:2647:3: ruleTitle
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__RecipetitleAssignment_5"


    // $ANTLR start "rule__Header__ImageAssignment_6_1"
    // InternalRecipeDSL.g:2656:1: rule__Header__ImageAssignment_6_1 : ( ruleImage ) ;
    public final void rule__Header__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2660:1: ( ( ruleImage ) )
            // InternalRecipeDSL.g:2661:2: ( ruleImage )
            {
            // InternalRecipeDSL.g:2661:2: ( ruleImage )
            // InternalRecipeDSL.g:2662:3: ruleImage
            {
             before(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__ImageAssignment_6_1"


    // $ANTLR start "rule__Nutrients__OrderNumberAssignment_3"
    // InternalRecipeDSL.g:2671:1: rule__Nutrients__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Nutrients__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2675:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2676:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2676:2: ( ruleEInt )
            // InternalRecipeDSL.g:2677:3: ruleEInt
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__OrderNumberAssignment_3"


    // $ANTLR start "rule__Nutrients__PercentagetoggleAssignment_4_1"
    // InternalRecipeDSL.g:2686:1: rule__Nutrients__PercentagetoggleAssignment_4_1 : ( rulePercentageAmountToggle ) ;
    public final void rule__Nutrients__PercentagetoggleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2690:1: ( ( rulePercentageAmountToggle ) )
            // InternalRecipeDSL.g:2691:2: ( rulePercentageAmountToggle )
            {
            // InternalRecipeDSL.g:2691:2: ( rulePercentageAmountToggle )
            // InternalRecipeDSL.g:2692:3: rulePercentageAmountToggle
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePercentageAmountToggle();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__PercentagetoggleAssignment_4_1"


    // $ANTLR start "rule__Nutrients__VitaminsAssignment_5_1"
    // InternalRecipeDSL.g:2701:1: rule__Nutrients__VitaminsAssignment_5_1 : ( ruleVitamins ) ;
    public final void rule__Nutrients__VitaminsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2705:1: ( ( ruleVitamins ) )
            // InternalRecipeDSL.g:2706:2: ( ruleVitamins )
            {
            // InternalRecipeDSL.g:2706:2: ( ruleVitamins )
            // InternalRecipeDSL.g:2707:3: ruleVitamins
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamins();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__VitaminsAssignment_5_1"


    // $ANTLR start "rule__Nutrients__MacronutrientsAssignment_6_1"
    // InternalRecipeDSL.g:2716:1: rule__Nutrients__MacronutrientsAssignment_6_1 : ( ruleMacronutrients ) ;
    public final void rule__Nutrients__MacronutrientsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2720:1: ( ( ruleMacronutrients ) )
            // InternalRecipeDSL.g:2721:2: ( ruleMacronutrients )
            {
            // InternalRecipeDSL.g:2721:2: ( ruleMacronutrients )
            // InternalRecipeDSL.g:2722:3: ruleMacronutrients
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacronutrients();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__MacronutrientsAssignment_6_1"


    // $ANTLR start "rule__Vitamins__VitaminAssignment_4"
    // InternalRecipeDSL.g:2731:1: rule__Vitamins__VitaminAssignment_4 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2735:1: ( ( ruleVitamin ) )
            // InternalRecipeDSL.g:2736:2: ( ruleVitamin )
            {
            // InternalRecipeDSL.g:2736:2: ( ruleVitamin )
            // InternalRecipeDSL.g:2737:3: ruleVitamin
            {
             before(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamin();

            state._fsp--;

             after(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__VitaminAssignment_4"


    // $ANTLR start "rule__Vitamins__VitaminAssignment_5_1"
    // InternalRecipeDSL.g:2746:1: rule__Vitamins__VitaminAssignment_5_1 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2750:1: ( ( ruleVitamin ) )
            // InternalRecipeDSL.g:2751:2: ( ruleVitamin )
            {
            // InternalRecipeDSL.g:2751:2: ( ruleVitamin )
            // InternalRecipeDSL.g:2752:3: ruleVitamin
            {
             before(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamin();

            state._fsp--;

             after(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__VitaminAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000E004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000002L});

}