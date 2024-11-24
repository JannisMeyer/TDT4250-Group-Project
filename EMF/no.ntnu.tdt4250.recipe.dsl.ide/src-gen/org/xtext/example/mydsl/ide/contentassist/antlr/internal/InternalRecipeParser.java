package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.RecipeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'", "'Page'", "'{'", "'instructions'", "'ingredients'", "'header'", "'}'", "'section'", "','", "'Instructions'", "'orderNumber'", "'Ingredients'", "'unittoggle'", "'Header'", "'basicinformation'", "'recipetitle'", "'image'", "'-'", "'Nutrients'", "'percentagetoggle'", "'vitamins'", "'macronutrients'", "'PercentageAmountToggle'", "'Vitamins'", "'Vitamin'", "'Macronutrients'", "'UnitOfMeasure'", "'BasicInformation'", "'Title'", "'Image'"
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


        public InternalRecipeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecipeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecipeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecipe.g"; }


    	private RecipeGrammarAccess grammarAccess;

    	public void setGrammarAccess(RecipeGrammarAccess grammarAccess) {
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
    // InternalRecipe.g:53:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalRecipe.g:54:1: ( rulePage EOF )
            // InternalRecipe.g:55:1: rulePage EOF
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
    // InternalRecipe.g:62:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:66:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalRecipe.g:67:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalRecipe.g:67:2: ( ( rule__Page__Group__0 ) )
            // InternalRecipe.g:68:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalRecipe.g:69:3: ( rule__Page__Group__0 )
            // InternalRecipe.g:69:4: rule__Page__Group__0
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


    // $ANTLR start "entryRuleSection"
    // InternalRecipe.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalRecipe.g:79:1: ( ruleSection EOF )
            // InternalRecipe.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRecipe.g:87:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:91:2: ( ( ( rule__Section__Alternatives ) ) )
            // InternalRecipe.g:92:2: ( ( rule__Section__Alternatives ) )
            {
            // InternalRecipe.g:92:2: ( ( rule__Section__Alternatives ) )
            // InternalRecipe.g:93:3: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // InternalRecipe.g:94:3: ( rule__Section__Alternatives )
            // InternalRecipe.g:94:4: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipe.g:103:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // InternalRecipe.g:104:1: ( ruleInstructions EOF )
            // InternalRecipe.g:105:1: ruleInstructions EOF
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
    // InternalRecipe.g:112:1: ruleInstructions : ( ( rule__Instructions__Group__0 ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:116:2: ( ( ( rule__Instructions__Group__0 ) ) )
            // InternalRecipe.g:117:2: ( ( rule__Instructions__Group__0 ) )
            {
            // InternalRecipe.g:117:2: ( ( rule__Instructions__Group__0 ) )
            // InternalRecipe.g:118:3: ( rule__Instructions__Group__0 )
            {
             before(grammarAccess.getInstructionsAccess().getGroup()); 
            // InternalRecipe.g:119:3: ( rule__Instructions__Group__0 )
            // InternalRecipe.g:119:4: rule__Instructions__Group__0
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
    // InternalRecipe.g:128:1: entryRuleIngredients : ruleIngredients EOF ;
    public final void entryRuleIngredients() throws RecognitionException {
        try {
            // InternalRecipe.g:129:1: ( ruleIngredients EOF )
            // InternalRecipe.g:130:1: ruleIngredients EOF
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
    // InternalRecipe.g:137:1: ruleIngredients : ( ( rule__Ingredients__Group__0 ) ) ;
    public final void ruleIngredients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:141:2: ( ( ( rule__Ingredients__Group__0 ) ) )
            // InternalRecipe.g:142:2: ( ( rule__Ingredients__Group__0 ) )
            {
            // InternalRecipe.g:142:2: ( ( rule__Ingredients__Group__0 ) )
            // InternalRecipe.g:143:3: ( rule__Ingredients__Group__0 )
            {
             before(grammarAccess.getIngredientsAccess().getGroup()); 
            // InternalRecipe.g:144:3: ( rule__Ingredients__Group__0 )
            // InternalRecipe.g:144:4: rule__Ingredients__Group__0
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
    // InternalRecipe.g:153:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalRecipe.g:154:1: ( ruleHeader EOF )
            // InternalRecipe.g:155:1: ruleHeader EOF
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
    // InternalRecipe.g:162:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:166:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalRecipe.g:167:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalRecipe.g:167:2: ( ( rule__Header__Group__0 ) )
            // InternalRecipe.g:168:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalRecipe.g:169:3: ( rule__Header__Group__0 )
            // InternalRecipe.g:169:4: rule__Header__Group__0
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
    // InternalRecipe.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRecipe.g:179:1: ( ruleEString EOF )
            // InternalRecipe.g:180:1: ruleEString EOF
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
    // InternalRecipe.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRecipe.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRecipe.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalRecipe.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRecipe.g:194:3: ( rule__EString__Alternatives )
            // InternalRecipe.g:194:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEInt"
    // InternalRecipe.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRecipe.g:204:1: ( ruleEInt EOF )
            // InternalRecipe.g:205:1: ruleEInt EOF
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
    // InternalRecipe.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRecipe.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRecipe.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalRecipe.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRecipe.g:219:3: ( rule__EInt__Group__0 )
            // InternalRecipe.g:219:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipe.g:228:1: entryRuleNutrients : ruleNutrients EOF ;
    public final void entryRuleNutrients() throws RecognitionException {
        try {
            // InternalRecipe.g:229:1: ( ruleNutrients EOF )
            // InternalRecipe.g:230:1: ruleNutrients EOF
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
    // InternalRecipe.g:237:1: ruleNutrients : ( ( rule__Nutrients__Group__0 ) ) ;
    public final void ruleNutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:241:2: ( ( ( rule__Nutrients__Group__0 ) ) )
            // InternalRecipe.g:242:2: ( ( rule__Nutrients__Group__0 ) )
            {
            // InternalRecipe.g:242:2: ( ( rule__Nutrients__Group__0 ) )
            // InternalRecipe.g:243:3: ( rule__Nutrients__Group__0 )
            {
             before(grammarAccess.getNutrientsAccess().getGroup()); 
            // InternalRecipe.g:244:3: ( rule__Nutrients__Group__0 )
            // InternalRecipe.g:244:4: rule__Nutrients__Group__0
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


    // $ANTLR start "entryRulePercentageAmountToggle"
    // InternalRecipe.g:253:1: entryRulePercentageAmountToggle : rulePercentageAmountToggle EOF ;
    public final void entryRulePercentageAmountToggle() throws RecognitionException {
        try {
            // InternalRecipe.g:254:1: ( rulePercentageAmountToggle EOF )
            // InternalRecipe.g:255:1: rulePercentageAmountToggle EOF
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
    // InternalRecipe.g:262:1: rulePercentageAmountToggle : ( ( rule__PercentageAmountToggle__Group__0 ) ) ;
    public final void rulePercentageAmountToggle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:266:2: ( ( ( rule__PercentageAmountToggle__Group__0 ) ) )
            // InternalRecipe.g:267:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            {
            // InternalRecipe.g:267:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            // InternalRecipe.g:268:3: ( rule__PercentageAmountToggle__Group__0 )
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getGroup()); 
            // InternalRecipe.g:269:3: ( rule__PercentageAmountToggle__Group__0 )
            // InternalRecipe.g:269:4: rule__PercentageAmountToggle__Group__0
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
    // InternalRecipe.g:278:1: entryRuleVitamins : ruleVitamins EOF ;
    public final void entryRuleVitamins() throws RecognitionException {
        try {
            // InternalRecipe.g:279:1: ( ruleVitamins EOF )
            // InternalRecipe.g:280:1: ruleVitamins EOF
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
    // InternalRecipe.g:287:1: ruleVitamins : ( ( rule__Vitamins__Group__0 ) ) ;
    public final void ruleVitamins() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:291:2: ( ( ( rule__Vitamins__Group__0 ) ) )
            // InternalRecipe.g:292:2: ( ( rule__Vitamins__Group__0 ) )
            {
            // InternalRecipe.g:292:2: ( ( rule__Vitamins__Group__0 ) )
            // InternalRecipe.g:293:3: ( rule__Vitamins__Group__0 )
            {
             before(grammarAccess.getVitaminsAccess().getGroup()); 
            // InternalRecipe.g:294:3: ( rule__Vitamins__Group__0 )
            // InternalRecipe.g:294:4: rule__Vitamins__Group__0
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
    // InternalRecipe.g:303:1: entryRuleMacronutrients : ruleMacronutrients EOF ;
    public final void entryRuleMacronutrients() throws RecognitionException {
        try {
            // InternalRecipe.g:304:1: ( ruleMacronutrients EOF )
            // InternalRecipe.g:305:1: ruleMacronutrients EOF
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
    // InternalRecipe.g:312:1: ruleMacronutrients : ( ( rule__Macronutrients__Group__0 ) ) ;
    public final void ruleMacronutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:316:2: ( ( ( rule__Macronutrients__Group__0 ) ) )
            // InternalRecipe.g:317:2: ( ( rule__Macronutrients__Group__0 ) )
            {
            // InternalRecipe.g:317:2: ( ( rule__Macronutrients__Group__0 ) )
            // InternalRecipe.g:318:3: ( rule__Macronutrients__Group__0 )
            {
             before(grammarAccess.getMacronutrientsAccess().getGroup()); 
            // InternalRecipe.g:319:3: ( rule__Macronutrients__Group__0 )
            // InternalRecipe.g:319:4: rule__Macronutrients__Group__0
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


    // $ANTLR start "entryRuleUnitOfMeasure"
    // InternalRecipe.g:328:1: entryRuleUnitOfMeasure : ruleUnitOfMeasure EOF ;
    public final void entryRuleUnitOfMeasure() throws RecognitionException {
        try {
            // InternalRecipe.g:329:1: ( ruleUnitOfMeasure EOF )
            // InternalRecipe.g:330:1: ruleUnitOfMeasure EOF
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
    // InternalRecipe.g:337:1: ruleUnitOfMeasure : ( ( rule__UnitOfMeasure__Group__0 ) ) ;
    public final void ruleUnitOfMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:341:2: ( ( ( rule__UnitOfMeasure__Group__0 ) ) )
            // InternalRecipe.g:342:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            {
            // InternalRecipe.g:342:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            // InternalRecipe.g:343:3: ( rule__UnitOfMeasure__Group__0 )
            {
             before(grammarAccess.getUnitOfMeasureAccess().getGroup()); 
            // InternalRecipe.g:344:3: ( rule__UnitOfMeasure__Group__0 )
            // InternalRecipe.g:344:4: rule__UnitOfMeasure__Group__0
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
    // InternalRecipe.g:353:1: entryRuleBasicInformation : ruleBasicInformation EOF ;
    public final void entryRuleBasicInformation() throws RecognitionException {
        try {
            // InternalRecipe.g:354:1: ( ruleBasicInformation EOF )
            // InternalRecipe.g:355:1: ruleBasicInformation EOF
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
    // InternalRecipe.g:362:1: ruleBasicInformation : ( ( rule__BasicInformation__Group__0 ) ) ;
    public final void ruleBasicInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:366:2: ( ( ( rule__BasicInformation__Group__0 ) ) )
            // InternalRecipe.g:367:2: ( ( rule__BasicInformation__Group__0 ) )
            {
            // InternalRecipe.g:367:2: ( ( rule__BasicInformation__Group__0 ) )
            // InternalRecipe.g:368:3: ( rule__BasicInformation__Group__0 )
            {
             before(grammarAccess.getBasicInformationAccess().getGroup()); 
            // InternalRecipe.g:369:3: ( rule__BasicInformation__Group__0 )
            // InternalRecipe.g:369:4: rule__BasicInformation__Group__0
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
    // InternalRecipe.g:378:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalRecipe.g:379:1: ( ruleTitle EOF )
            // InternalRecipe.g:380:1: ruleTitle EOF
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
    // InternalRecipe.g:387:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:391:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalRecipe.g:392:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalRecipe.g:392:2: ( ( rule__Title__Group__0 ) )
            // InternalRecipe.g:393:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalRecipe.g:394:3: ( rule__Title__Group__0 )
            // InternalRecipe.g:394:4: rule__Title__Group__0
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
    // InternalRecipe.g:403:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalRecipe.g:404:1: ( ruleImage EOF )
            // InternalRecipe.g:405:1: ruleImage EOF
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
    // InternalRecipe.g:412:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:416:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalRecipe.g:417:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalRecipe.g:417:2: ( ( rule__Image__Group__0 ) )
            // InternalRecipe.g:418:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalRecipe.g:419:3: ( rule__Image__Group__0 )
            // InternalRecipe.g:419:4: rule__Image__Group__0
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


    // $ANTLR start "ruleVitamin"
    // InternalRecipe.g:428:1: ruleVitamin : ( ( rule__Vitamin__Alternatives ) ) ;
    public final void ruleVitamin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:432:1: ( ( ( rule__Vitamin__Alternatives ) ) )
            // InternalRecipe.g:433:2: ( ( rule__Vitamin__Alternatives ) )
            {
            // InternalRecipe.g:433:2: ( ( rule__Vitamin__Alternatives ) )
            // InternalRecipe.g:434:3: ( rule__Vitamin__Alternatives )
            {
             before(grammarAccess.getVitaminAccess().getAlternatives()); 
            // InternalRecipe.g:435:3: ( rule__Vitamin__Alternatives )
            // InternalRecipe.g:435:4: rule__Vitamin__Alternatives
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


    // $ANTLR start "rule__Section__Alternatives"
    // InternalRecipe.g:443:1: rule__Section__Alternatives : ( ( ruleIngredients ) | ( ruleInstructions ) | ( ruleNutrients ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:447:1: ( ( ruleIngredients ) | ( ruleInstructions ) | ( ruleNutrients ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRecipe.g:448:2: ( ruleIngredients )
                    {
                    // InternalRecipe.g:448:2: ( ruleIngredients )
                    // InternalRecipe.g:449:3: ruleIngredients
                    {
                     before(grammarAccess.getSectionAccess().getIngredientsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIngredients();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getIngredientsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:454:2: ( ruleInstructions )
                    {
                    // InternalRecipe.g:454:2: ( ruleInstructions )
                    // InternalRecipe.g:455:3: ruleInstructions
                    {
                     before(grammarAccess.getSectionAccess().getInstructionsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstructions();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getInstructionsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:460:2: ( ruleNutrients )
                    {
                    // InternalRecipe.g:460:2: ( ruleNutrients )
                    // InternalRecipe.g:461:3: ruleNutrients
                    {
                     before(grammarAccess.getSectionAccess().getNutrientsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNutrients();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getNutrientsParserRuleCall_2()); 

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
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRecipe.g:470:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:474:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipe.g:475:2: ( RULE_STRING )
                    {
                    // InternalRecipe.g:475:2: ( RULE_STRING )
                    // InternalRecipe.g:476:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:481:2: ( RULE_ID )
                    {
                    // InternalRecipe.g:481:2: ( RULE_ID )
                    // InternalRecipe.g:482:3: RULE_ID
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
    // InternalRecipe.g:491:1: rule__Vitamin__Alternatives : ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) );
    public final void rule__Vitamin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:495:1: ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRecipe.g:496:2: ( ( 'VITAMIN_A' ) )
                    {
                    // InternalRecipe.g:496:2: ( ( 'VITAMIN_A' ) )
                    // InternalRecipe.g:497:3: ( 'VITAMIN_A' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 
                    // InternalRecipe.g:498:3: ( 'VITAMIN_A' )
                    // InternalRecipe.g:498:4: 'VITAMIN_A'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:502:2: ( ( 'VITAMIN_B1' ) )
                    {
                    // InternalRecipe.g:502:2: ( ( 'VITAMIN_B1' ) )
                    // InternalRecipe.g:503:3: ( 'VITAMIN_B1' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 
                    // InternalRecipe.g:504:3: ( 'VITAMIN_B1' )
                    // InternalRecipe.g:504:4: 'VITAMIN_B1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:508:2: ( ( 'VITAMIN_B2' ) )
                    {
                    // InternalRecipe.g:508:2: ( ( 'VITAMIN_B2' ) )
                    // InternalRecipe.g:509:3: ( 'VITAMIN_B2' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 
                    // InternalRecipe.g:510:3: ( 'VITAMIN_B2' )
                    // InternalRecipe.g:510:4: 'VITAMIN_B2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipe.g:514:2: ( ( 'VITAMIN_B3' ) )
                    {
                    // InternalRecipe.g:514:2: ( ( 'VITAMIN_B3' ) )
                    // InternalRecipe.g:515:3: ( 'VITAMIN_B3' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 
                    // InternalRecipe.g:516:3: ( 'VITAMIN_B3' )
                    // InternalRecipe.g:516:4: 'VITAMIN_B3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipe.g:520:2: ( ( 'VITAMIN_B5' ) )
                    {
                    // InternalRecipe.g:520:2: ( ( 'VITAMIN_B5' ) )
                    // InternalRecipe.g:521:3: ( 'VITAMIN_B5' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 
                    // InternalRecipe.g:522:3: ( 'VITAMIN_B5' )
                    // InternalRecipe.g:522:4: 'VITAMIN_B5'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipe.g:526:2: ( ( 'VITAMIN_B6' ) )
                    {
                    // InternalRecipe.g:526:2: ( ( 'VITAMIN_B6' ) )
                    // InternalRecipe.g:527:3: ( 'VITAMIN_B6' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 
                    // InternalRecipe.g:528:3: ( 'VITAMIN_B6' )
                    // InternalRecipe.g:528:4: 'VITAMIN_B6'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipe.g:532:2: ( ( 'VITAMIN_B12' ) )
                    {
                    // InternalRecipe.g:532:2: ( ( 'VITAMIN_B12' ) )
                    // InternalRecipe.g:533:3: ( 'VITAMIN_B12' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 
                    // InternalRecipe.g:534:3: ( 'VITAMIN_B12' )
                    // InternalRecipe.g:534:4: 'VITAMIN_B12'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipe.g:538:2: ( ( 'VITAMIN_C' ) )
                    {
                    // InternalRecipe.g:538:2: ( ( 'VITAMIN_C' ) )
                    // InternalRecipe.g:539:3: ( 'VITAMIN_C' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 
                    // InternalRecipe.g:540:3: ( 'VITAMIN_C' )
                    // InternalRecipe.g:540:4: 'VITAMIN_C'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipe.g:544:2: ( ( 'VITAMIN_E' ) )
                    {
                    // InternalRecipe.g:544:2: ( ( 'VITAMIN_E' ) )
                    // InternalRecipe.g:545:3: ( 'VITAMIN_E' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 
                    // InternalRecipe.g:546:3: ( 'VITAMIN_E' )
                    // InternalRecipe.g:546:4: 'VITAMIN_E'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipe.g:550:2: ( ( 'VITAMIN_K' ) )
                    {
                    // InternalRecipe.g:550:2: ( ( 'VITAMIN_K' ) )
                    // InternalRecipe.g:551:3: ( 'VITAMIN_K' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9()); 
                    // InternalRecipe.g:552:3: ( 'VITAMIN_K' )
                    // InternalRecipe.g:552:4: 'VITAMIN_K'
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
    // InternalRecipe.g:560:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:564:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalRecipe.g:565:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalRecipe.g:572:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:576:1: ( ( 'Page' ) )
            // InternalRecipe.g:577:1: ( 'Page' )
            {
            // InternalRecipe.g:577:1: ( 'Page' )
            // InternalRecipe.g:578:2: 'Page'
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
    // InternalRecipe.g:587:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:591:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalRecipe.g:592:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalRecipe.g:599:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:603:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalRecipe.g:604:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalRecipe.g:604:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalRecipe.g:605:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalRecipe.g:606:2: ( rule__Page__NameAssignment_1 )
            // InternalRecipe.g:606:3: rule__Page__NameAssignment_1
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
    // InternalRecipe.g:614:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:618:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalRecipe.g:619:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalRecipe.g:626:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:630:1: ( ( '{' ) )
            // InternalRecipe.g:631:1: ( '{' )
            {
            // InternalRecipe.g:631:1: ( '{' )
            // InternalRecipe.g:632:2: '{'
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
    // InternalRecipe.g:641:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:645:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalRecipe.g:646:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipe.g:653:1: rule__Page__Group__3__Impl : ( 'instructions' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:657:1: ( ( 'instructions' ) )
            // InternalRecipe.g:658:1: ( 'instructions' )
            {
            // InternalRecipe.g:658:1: ( 'instructions' )
            // InternalRecipe.g:659:2: 'instructions'
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
    // InternalRecipe.g:668:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:672:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalRecipe.g:673:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalRecipe.g:680:1: rule__Page__Group__4__Impl : ( ( rule__Page__InstructionsAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:684:1: ( ( ( rule__Page__InstructionsAssignment_4 ) ) )
            // InternalRecipe.g:685:1: ( ( rule__Page__InstructionsAssignment_4 ) )
            {
            // InternalRecipe.g:685:1: ( ( rule__Page__InstructionsAssignment_4 ) )
            // InternalRecipe.g:686:2: ( rule__Page__InstructionsAssignment_4 )
            {
             before(grammarAccess.getPageAccess().getInstructionsAssignment_4()); 
            // InternalRecipe.g:687:2: ( rule__Page__InstructionsAssignment_4 )
            // InternalRecipe.g:687:3: rule__Page__InstructionsAssignment_4
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
    // InternalRecipe.g:695:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:699:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalRecipe.g:700:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipe.g:707:1: rule__Page__Group__5__Impl : ( 'ingredients' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:711:1: ( ( 'ingredients' ) )
            // InternalRecipe.g:712:1: ( 'ingredients' )
            {
            // InternalRecipe.g:712:1: ( 'ingredients' )
            // InternalRecipe.g:713:2: 'ingredients'
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
    // InternalRecipe.g:722:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:726:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalRecipe.g:727:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalRecipe.g:734:1: rule__Page__Group__6__Impl : ( ( rule__Page__IngredientsAssignment_6 ) ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:738:1: ( ( ( rule__Page__IngredientsAssignment_6 ) ) )
            // InternalRecipe.g:739:1: ( ( rule__Page__IngredientsAssignment_6 ) )
            {
            // InternalRecipe.g:739:1: ( ( rule__Page__IngredientsAssignment_6 ) )
            // InternalRecipe.g:740:2: ( rule__Page__IngredientsAssignment_6 )
            {
             before(grammarAccess.getPageAccess().getIngredientsAssignment_6()); 
            // InternalRecipe.g:741:2: ( rule__Page__IngredientsAssignment_6 )
            // InternalRecipe.g:741:3: rule__Page__IngredientsAssignment_6
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
    // InternalRecipe.g:749:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:753:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalRecipe.g:754:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalRecipe.g:761:1: rule__Page__Group__7__Impl : ( ( rule__Page__Group_7__0 )? ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:765:1: ( ( ( rule__Page__Group_7__0 )? ) )
            // InternalRecipe.g:766:1: ( ( rule__Page__Group_7__0 )? )
            {
            // InternalRecipe.g:766:1: ( ( rule__Page__Group_7__0 )? )
            // InternalRecipe.g:767:2: ( rule__Page__Group_7__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_7()); 
            // InternalRecipe.g:768:2: ( rule__Page__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipe.g:768:3: rule__Page__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalRecipe.g:776:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:780:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // InternalRecipe.g:781:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecipe.g:788:1: rule__Page__Group__8__Impl : ( 'header' ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:792:1: ( ( 'header' ) )
            // InternalRecipe.g:793:1: ( 'header' )
            {
            // InternalRecipe.g:793:1: ( 'header' )
            // InternalRecipe.g:794:2: 'header'
            {
             before(grammarAccess.getPageAccess().getHeaderKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHeaderKeyword_8()); 

            }


            }

        }
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
    // InternalRecipe.g:803:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:807:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // InternalRecipe.g:808:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecipe.g:815:1: rule__Page__Group__9__Impl : ( ( rule__Page__HeaderAssignment_9 ) ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:819:1: ( ( ( rule__Page__HeaderAssignment_9 ) ) )
            // InternalRecipe.g:820:1: ( ( rule__Page__HeaderAssignment_9 ) )
            {
            // InternalRecipe.g:820:1: ( ( rule__Page__HeaderAssignment_9 ) )
            // InternalRecipe.g:821:2: ( rule__Page__HeaderAssignment_9 )
            {
             before(grammarAccess.getPageAccess().getHeaderAssignment_9()); 
            // InternalRecipe.g:822:2: ( rule__Page__HeaderAssignment_9 )
            // InternalRecipe.g:822:3: rule__Page__HeaderAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Page__HeaderAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getHeaderAssignment_9()); 

            }


            }

        }
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
    // InternalRecipe.g:830:1: rule__Page__Group__10 : rule__Page__Group__10__Impl ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:834:1: ( rule__Page__Group__10__Impl )
            // InternalRecipe.g:835:2: rule__Page__Group__10__Impl
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
    // InternalRecipe.g:841:1: rule__Page__Group__10__Impl : ( '}' ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:845:1: ( ( '}' ) )
            // InternalRecipe.g:846:1: ( '}' )
            {
            // InternalRecipe.g:846:1: ( '}' )
            // InternalRecipe.g:847:2: '}'
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


    // $ANTLR start "rule__Page__Group_7__0"
    // InternalRecipe.g:857:1: rule__Page__Group_7__0 : rule__Page__Group_7__0__Impl rule__Page__Group_7__1 ;
    public final void rule__Page__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:861:1: ( rule__Page__Group_7__0__Impl rule__Page__Group_7__1 )
            // InternalRecipe.g:862:2: rule__Page__Group_7__0__Impl rule__Page__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0"


    // $ANTLR start "rule__Page__Group_7__0__Impl"
    // InternalRecipe.g:869:1: rule__Page__Group_7__0__Impl : ( 'section' ) ;
    public final void rule__Page__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:873:1: ( ( 'section' ) )
            // InternalRecipe.g:874:1: ( 'section' )
            {
            // InternalRecipe.g:874:1: ( 'section' )
            // InternalRecipe.g:875:2: 'section'
            {
             before(grammarAccess.getPageAccess().getSectionKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSectionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__0__Impl"


    // $ANTLR start "rule__Page__Group_7__1"
    // InternalRecipe.g:884:1: rule__Page__Group_7__1 : rule__Page__Group_7__1__Impl rule__Page__Group_7__2 ;
    public final void rule__Page__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:888:1: ( rule__Page__Group_7__1__Impl rule__Page__Group_7__2 )
            // InternalRecipe.g:889:2: rule__Page__Group_7__1__Impl rule__Page__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__Page__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1"


    // $ANTLR start "rule__Page__Group_7__1__Impl"
    // InternalRecipe.g:896:1: rule__Page__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:900:1: ( ( '{' ) )
            // InternalRecipe.g:901:1: ( '{' )
            {
            // InternalRecipe.g:901:1: ( '{' )
            // InternalRecipe.g:902:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__1__Impl"


    // $ANTLR start "rule__Page__Group_7__2"
    // InternalRecipe.g:911:1: rule__Page__Group_7__2 : rule__Page__Group_7__2__Impl rule__Page__Group_7__3 ;
    public final void rule__Page__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:915:1: ( rule__Page__Group_7__2__Impl rule__Page__Group_7__3 )
            // InternalRecipe.g:916:2: rule__Page__Group_7__2__Impl rule__Page__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__2"


    // $ANTLR start "rule__Page__Group_7__2__Impl"
    // InternalRecipe.g:923:1: rule__Page__Group_7__2__Impl : ( ( rule__Page__SectionAssignment_7_2 ) ) ;
    public final void rule__Page__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:927:1: ( ( ( rule__Page__SectionAssignment_7_2 ) ) )
            // InternalRecipe.g:928:1: ( ( rule__Page__SectionAssignment_7_2 ) )
            {
            // InternalRecipe.g:928:1: ( ( rule__Page__SectionAssignment_7_2 ) )
            // InternalRecipe.g:929:2: ( rule__Page__SectionAssignment_7_2 )
            {
             before(grammarAccess.getPageAccess().getSectionAssignment_7_2()); 
            // InternalRecipe.g:930:2: ( rule__Page__SectionAssignment_7_2 )
            // InternalRecipe.g:930:3: rule__Page__SectionAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__SectionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSectionAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__2__Impl"


    // $ANTLR start "rule__Page__Group_7__3"
    // InternalRecipe.g:938:1: rule__Page__Group_7__3 : rule__Page__Group_7__3__Impl rule__Page__Group_7__4 ;
    public final void rule__Page__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:942:1: ( rule__Page__Group_7__3__Impl rule__Page__Group_7__4 )
            // InternalRecipe.g:943:2: rule__Page__Group_7__3__Impl rule__Page__Group_7__4
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__3"


    // $ANTLR start "rule__Page__Group_7__3__Impl"
    // InternalRecipe.g:950:1: rule__Page__Group_7__3__Impl : ( ( rule__Page__Group_7_3__0 )* ) ;
    public final void rule__Page__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:954:1: ( ( ( rule__Page__Group_7_3__0 )* ) )
            // InternalRecipe.g:955:1: ( ( rule__Page__Group_7_3__0 )* )
            {
            // InternalRecipe.g:955:1: ( ( rule__Page__Group_7_3__0 )* )
            // InternalRecipe.g:956:2: ( rule__Page__Group_7_3__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_7_3()); 
            // InternalRecipe.g:957:2: ( rule__Page__Group_7_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipe.g:957:3: rule__Page__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Page__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__3__Impl"


    // $ANTLR start "rule__Page__Group_7__4"
    // InternalRecipe.g:965:1: rule__Page__Group_7__4 : rule__Page__Group_7__4__Impl ;
    public final void rule__Page__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:969:1: ( rule__Page__Group_7__4__Impl )
            // InternalRecipe.g:970:2: rule__Page__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__4"


    // $ANTLR start "rule__Page__Group_7__4__Impl"
    // InternalRecipe.g:976:1: rule__Page__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Page__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:980:1: ( ( '}' ) )
            // InternalRecipe.g:981:1: ( '}' )
            {
            // InternalRecipe.g:981:1: ( '}' )
            // InternalRecipe.g:982:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7__4__Impl"


    // $ANTLR start "rule__Page__Group_7_3__0"
    // InternalRecipe.g:992:1: rule__Page__Group_7_3__0 : rule__Page__Group_7_3__0__Impl rule__Page__Group_7_3__1 ;
    public final void rule__Page__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:996:1: ( rule__Page__Group_7_3__0__Impl rule__Page__Group_7_3__1 )
            // InternalRecipe.g:997:2: rule__Page__Group_7_3__0__Impl rule__Page__Group_7_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Page__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7_3__0"


    // $ANTLR start "rule__Page__Group_7_3__0__Impl"
    // InternalRecipe.g:1004:1: rule__Page__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1008:1: ( ( ',' ) )
            // InternalRecipe.g:1009:1: ( ',' )
            {
            // InternalRecipe.g:1009:1: ( ',' )
            // InternalRecipe.g:1010:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_7_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7_3__0__Impl"


    // $ANTLR start "rule__Page__Group_7_3__1"
    // InternalRecipe.g:1019:1: rule__Page__Group_7_3__1 : rule__Page__Group_7_3__1__Impl ;
    public final void rule__Page__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1023:1: ( rule__Page__Group_7_3__1__Impl )
            // InternalRecipe.g:1024:2: rule__Page__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7_3__1"


    // $ANTLR start "rule__Page__Group_7_3__1__Impl"
    // InternalRecipe.g:1030:1: rule__Page__Group_7_3__1__Impl : ( ( rule__Page__SectionAssignment_7_3_1 ) ) ;
    public final void rule__Page__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1034:1: ( ( ( rule__Page__SectionAssignment_7_3_1 ) ) )
            // InternalRecipe.g:1035:1: ( ( rule__Page__SectionAssignment_7_3_1 ) )
            {
            // InternalRecipe.g:1035:1: ( ( rule__Page__SectionAssignment_7_3_1 ) )
            // InternalRecipe.g:1036:2: ( rule__Page__SectionAssignment_7_3_1 )
            {
             before(grammarAccess.getPageAccess().getSectionAssignment_7_3_1()); 
            // InternalRecipe.g:1037:2: ( rule__Page__SectionAssignment_7_3_1 )
            // InternalRecipe.g:1037:3: rule__Page__SectionAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__SectionAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSectionAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_7_3__1__Impl"


    // $ANTLR start "rule__Instructions__Group__0"
    // InternalRecipe.g:1046:1: rule__Instructions__Group__0 : rule__Instructions__Group__0__Impl rule__Instructions__Group__1 ;
    public final void rule__Instructions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1050:1: ( rule__Instructions__Group__0__Impl rule__Instructions__Group__1 )
            // InternalRecipe.g:1051:2: rule__Instructions__Group__0__Impl rule__Instructions__Group__1
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
    // InternalRecipe.g:1058:1: rule__Instructions__Group__0__Impl : ( 'Instructions' ) ;
    public final void rule__Instructions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1062:1: ( ( 'Instructions' ) )
            // InternalRecipe.g:1063:1: ( 'Instructions' )
            {
            // InternalRecipe.g:1063:1: ( 'Instructions' )
            // InternalRecipe.g:1064:2: 'Instructions'
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRecipe.g:1073:1: rule__Instructions__Group__1 : rule__Instructions__Group__1__Impl rule__Instructions__Group__2 ;
    public final void rule__Instructions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1077:1: ( rule__Instructions__Group__1__Impl rule__Instructions__Group__2 )
            // InternalRecipe.g:1078:2: rule__Instructions__Group__1__Impl rule__Instructions__Group__2
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
    // InternalRecipe.g:1085:1: rule__Instructions__Group__1__Impl : ( '{' ) ;
    public final void rule__Instructions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1089:1: ( ( '{' ) )
            // InternalRecipe.g:1090:1: ( '{' )
            {
            // InternalRecipe.g:1090:1: ( '{' )
            // InternalRecipe.g:1091:2: '{'
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
    // InternalRecipe.g:1100:1: rule__Instructions__Group__2 : rule__Instructions__Group__2__Impl rule__Instructions__Group__3 ;
    public final void rule__Instructions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1104:1: ( rule__Instructions__Group__2__Impl rule__Instructions__Group__3 )
            // InternalRecipe.g:1105:2: rule__Instructions__Group__2__Impl rule__Instructions__Group__3
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
    // InternalRecipe.g:1112:1: rule__Instructions__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Instructions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1116:1: ( ( 'orderNumber' ) )
            // InternalRecipe.g:1117:1: ( 'orderNumber' )
            {
            // InternalRecipe.g:1117:1: ( 'orderNumber' )
            // InternalRecipe.g:1118:2: 'orderNumber'
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRecipe.g:1127:1: rule__Instructions__Group__3 : rule__Instructions__Group__3__Impl rule__Instructions__Group__4 ;
    public final void rule__Instructions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1131:1: ( rule__Instructions__Group__3__Impl rule__Instructions__Group__4 )
            // InternalRecipe.g:1132:2: rule__Instructions__Group__3__Impl rule__Instructions__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecipe.g:1139:1: rule__Instructions__Group__3__Impl : ( ( rule__Instructions__OrderNumberAssignment_3 ) ) ;
    public final void rule__Instructions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1143:1: ( ( ( rule__Instructions__OrderNumberAssignment_3 ) ) )
            // InternalRecipe.g:1144:1: ( ( rule__Instructions__OrderNumberAssignment_3 ) )
            {
            // InternalRecipe.g:1144:1: ( ( rule__Instructions__OrderNumberAssignment_3 ) )
            // InternalRecipe.g:1145:2: ( rule__Instructions__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipe.g:1146:2: ( rule__Instructions__OrderNumberAssignment_3 )
            // InternalRecipe.g:1146:3: rule__Instructions__OrderNumberAssignment_3
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
    // InternalRecipe.g:1154:1: rule__Instructions__Group__4 : rule__Instructions__Group__4__Impl ;
    public final void rule__Instructions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1158:1: ( rule__Instructions__Group__4__Impl )
            // InternalRecipe.g:1159:2: rule__Instructions__Group__4__Impl
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
    // InternalRecipe.g:1165:1: rule__Instructions__Group__4__Impl : ( '}' ) ;
    public final void rule__Instructions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1169:1: ( ( '}' ) )
            // InternalRecipe.g:1170:1: ( '}' )
            {
            // InternalRecipe.g:1170:1: ( '}' )
            // InternalRecipe.g:1171:2: '}'
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
    // InternalRecipe.g:1181:1: rule__Ingredients__Group__0 : rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 ;
    public final void rule__Ingredients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1185:1: ( rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 )
            // InternalRecipe.g:1186:2: rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1
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
    // InternalRecipe.g:1193:1: rule__Ingredients__Group__0__Impl : ( 'Ingredients' ) ;
    public final void rule__Ingredients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1197:1: ( ( 'Ingredients' ) )
            // InternalRecipe.g:1198:1: ( 'Ingredients' )
            {
            // InternalRecipe.g:1198:1: ( 'Ingredients' )
            // InternalRecipe.g:1199:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRecipe.g:1208:1: rule__Ingredients__Group__1 : rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 ;
    public final void rule__Ingredients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1212:1: ( rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 )
            // InternalRecipe.g:1213:2: rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2
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
    // InternalRecipe.g:1220:1: rule__Ingredients__Group__1__Impl : ( '{' ) ;
    public final void rule__Ingredients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1224:1: ( ( '{' ) )
            // InternalRecipe.g:1225:1: ( '{' )
            {
            // InternalRecipe.g:1225:1: ( '{' )
            // InternalRecipe.g:1226:2: '{'
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
    // InternalRecipe.g:1235:1: rule__Ingredients__Group__2 : rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 ;
    public final void rule__Ingredients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1239:1: ( rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 )
            // InternalRecipe.g:1240:2: rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3
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
    // InternalRecipe.g:1247:1: rule__Ingredients__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Ingredients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1251:1: ( ( 'orderNumber' ) )
            // InternalRecipe.g:1252:1: ( 'orderNumber' )
            {
            // InternalRecipe.g:1252:1: ( 'orderNumber' )
            // InternalRecipe.g:1253:2: 'orderNumber'
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRecipe.g:1262:1: rule__Ingredients__Group__3 : rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 ;
    public final void rule__Ingredients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1266:1: ( rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 )
            // InternalRecipe.g:1267:2: rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecipe.g:1274:1: rule__Ingredients__Group__3__Impl : ( ( rule__Ingredients__OrderNumberAssignment_3 ) ) ;
    public final void rule__Ingredients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1278:1: ( ( ( rule__Ingredients__OrderNumberAssignment_3 ) ) )
            // InternalRecipe.g:1279:1: ( ( rule__Ingredients__OrderNumberAssignment_3 ) )
            {
            // InternalRecipe.g:1279:1: ( ( rule__Ingredients__OrderNumberAssignment_3 ) )
            // InternalRecipe.g:1280:2: ( rule__Ingredients__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipe.g:1281:2: ( rule__Ingredients__OrderNumberAssignment_3 )
            // InternalRecipe.g:1281:3: rule__Ingredients__OrderNumberAssignment_3
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
    // InternalRecipe.g:1289:1: rule__Ingredients__Group__4 : rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 ;
    public final void rule__Ingredients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1293:1: ( rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 )
            // InternalRecipe.g:1294:2: rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecipe.g:1301:1: rule__Ingredients__Group__4__Impl : ( ( rule__Ingredients__Group_4__0 )? ) ;
    public final void rule__Ingredients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1305:1: ( ( ( rule__Ingredients__Group_4__0 )? ) )
            // InternalRecipe.g:1306:1: ( ( rule__Ingredients__Group_4__0 )? )
            {
            // InternalRecipe.g:1306:1: ( ( rule__Ingredients__Group_4__0 )? )
            // InternalRecipe.g:1307:2: ( rule__Ingredients__Group_4__0 )?
            {
             before(grammarAccess.getIngredientsAccess().getGroup_4()); 
            // InternalRecipe.g:1308:2: ( rule__Ingredients__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipe.g:1308:3: rule__Ingredients__Group_4__0
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
    // InternalRecipe.g:1316:1: rule__Ingredients__Group__5 : rule__Ingredients__Group__5__Impl ;
    public final void rule__Ingredients__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1320:1: ( rule__Ingredients__Group__5__Impl )
            // InternalRecipe.g:1321:2: rule__Ingredients__Group__5__Impl
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
    // InternalRecipe.g:1327:1: rule__Ingredients__Group__5__Impl : ( '}' ) ;
    public final void rule__Ingredients__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1331:1: ( ( '}' ) )
            // InternalRecipe.g:1332:1: ( '}' )
            {
            // InternalRecipe.g:1332:1: ( '}' )
            // InternalRecipe.g:1333:2: '}'
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
    // InternalRecipe.g:1343:1: rule__Ingredients__Group_4__0 : rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1 ;
    public final void rule__Ingredients__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1347:1: ( rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1 )
            // InternalRecipe.g:1348:2: rule__Ingredients__Group_4__0__Impl rule__Ingredients__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipe.g:1355:1: rule__Ingredients__Group_4__0__Impl : ( 'unittoggle' ) ;
    public final void rule__Ingredients__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1359:1: ( ( 'unittoggle' ) )
            // InternalRecipe.g:1360:1: ( 'unittoggle' )
            {
            // InternalRecipe.g:1360:1: ( 'unittoggle' )
            // InternalRecipe.g:1361:2: 'unittoggle'
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRecipe.g:1370:1: rule__Ingredients__Group_4__1 : rule__Ingredients__Group_4__1__Impl ;
    public final void rule__Ingredients__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1374:1: ( rule__Ingredients__Group_4__1__Impl )
            // InternalRecipe.g:1375:2: rule__Ingredients__Group_4__1__Impl
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
    // InternalRecipe.g:1381:1: rule__Ingredients__Group_4__1__Impl : ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) ) ;
    public final void rule__Ingredients__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1385:1: ( ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) ) )
            // InternalRecipe.g:1386:1: ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) )
            {
            // InternalRecipe.g:1386:1: ( ( rule__Ingredients__UnittoggleAssignment_4_1 ) )
            // InternalRecipe.g:1387:2: ( rule__Ingredients__UnittoggleAssignment_4_1 )
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleAssignment_4_1()); 
            // InternalRecipe.g:1388:2: ( rule__Ingredients__UnittoggleAssignment_4_1 )
            // InternalRecipe.g:1388:3: rule__Ingredients__UnittoggleAssignment_4_1
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
    // InternalRecipe.g:1397:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1401:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRecipe.g:1402:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalRecipe.g:1409:1: rule__Header__Group__0__Impl : ( 'Header' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1413:1: ( ( 'Header' ) )
            // InternalRecipe.g:1414:1: ( 'Header' )
            {
            // InternalRecipe.g:1414:1: ( 'Header' )
            // InternalRecipe.g:1415:2: 'Header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRecipe.g:1424:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1428:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalRecipe.g:1429:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecipe.g:1436:1: rule__Header__Group__1__Impl : ( '{' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1440:1: ( ( '{' ) )
            // InternalRecipe.g:1441:1: ( '{' )
            {
            // InternalRecipe.g:1441:1: ( '{' )
            // InternalRecipe.g:1442:2: '{'
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
    // InternalRecipe.g:1451:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1455:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalRecipe.g:1456:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecipe.g:1463:1: rule__Header__Group__2__Impl : ( 'basicinformation' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1467:1: ( ( 'basicinformation' ) )
            // InternalRecipe.g:1468:1: ( 'basicinformation' )
            {
            // InternalRecipe.g:1468:1: ( 'basicinformation' )
            // InternalRecipe.g:1469:2: 'basicinformation'
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRecipe.g:1478:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1482:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalRecipe.g:1483:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalRecipe.g:1490:1: rule__Header__Group__3__Impl : ( ( rule__Header__BasicinformationAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1494:1: ( ( ( rule__Header__BasicinformationAssignment_3 ) ) )
            // InternalRecipe.g:1495:1: ( ( rule__Header__BasicinformationAssignment_3 ) )
            {
            // InternalRecipe.g:1495:1: ( ( rule__Header__BasicinformationAssignment_3 ) )
            // InternalRecipe.g:1496:2: ( rule__Header__BasicinformationAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationAssignment_3()); 
            // InternalRecipe.g:1497:2: ( rule__Header__BasicinformationAssignment_3 )
            // InternalRecipe.g:1497:3: rule__Header__BasicinformationAssignment_3
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
    // InternalRecipe.g:1505:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1509:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalRecipe.g:1510:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRecipe.g:1517:1: rule__Header__Group__4__Impl : ( 'recipetitle' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1521:1: ( ( 'recipetitle' ) )
            // InternalRecipe.g:1522:1: ( 'recipetitle' )
            {
            // InternalRecipe.g:1522:1: ( 'recipetitle' )
            // InternalRecipe.g:1523:2: 'recipetitle'
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRecipe.g:1532:1: rule__Header__Group__5 : rule__Header__Group__5__Impl rule__Header__Group__6 ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1536:1: ( rule__Header__Group__5__Impl rule__Header__Group__6 )
            // InternalRecipe.g:1537:2: rule__Header__Group__5__Impl rule__Header__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRecipe.g:1544:1: rule__Header__Group__5__Impl : ( ( rule__Header__RecipetitleAssignment_5 ) ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1548:1: ( ( ( rule__Header__RecipetitleAssignment_5 ) ) )
            // InternalRecipe.g:1549:1: ( ( rule__Header__RecipetitleAssignment_5 ) )
            {
            // InternalRecipe.g:1549:1: ( ( rule__Header__RecipetitleAssignment_5 ) )
            // InternalRecipe.g:1550:2: ( rule__Header__RecipetitleAssignment_5 )
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleAssignment_5()); 
            // InternalRecipe.g:1551:2: ( rule__Header__RecipetitleAssignment_5 )
            // InternalRecipe.g:1551:3: rule__Header__RecipetitleAssignment_5
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
    // InternalRecipe.g:1559:1: rule__Header__Group__6 : rule__Header__Group__6__Impl rule__Header__Group__7 ;
    public final void rule__Header__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1563:1: ( rule__Header__Group__6__Impl rule__Header__Group__7 )
            // InternalRecipe.g:1564:2: rule__Header__Group__6__Impl rule__Header__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalRecipe.g:1571:1: rule__Header__Group__6__Impl : ( ( rule__Header__Group_6__0 )? ) ;
    public final void rule__Header__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1575:1: ( ( ( rule__Header__Group_6__0 )? ) )
            // InternalRecipe.g:1576:1: ( ( rule__Header__Group_6__0 )? )
            {
            // InternalRecipe.g:1576:1: ( ( rule__Header__Group_6__0 )? )
            // InternalRecipe.g:1577:2: ( rule__Header__Group_6__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_6()); 
            // InternalRecipe.g:1578:2: ( rule__Header__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipe.g:1578:3: rule__Header__Group_6__0
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
    // InternalRecipe.g:1586:1: rule__Header__Group__7 : rule__Header__Group__7__Impl ;
    public final void rule__Header__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1590:1: ( rule__Header__Group__7__Impl )
            // InternalRecipe.g:1591:2: rule__Header__Group__7__Impl
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
    // InternalRecipe.g:1597:1: rule__Header__Group__7__Impl : ( '}' ) ;
    public final void rule__Header__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1601:1: ( ( '}' ) )
            // InternalRecipe.g:1602:1: ( '}' )
            {
            // InternalRecipe.g:1602:1: ( '}' )
            // InternalRecipe.g:1603:2: '}'
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
    // InternalRecipe.g:1613:1: rule__Header__Group_6__0 : rule__Header__Group_6__0__Impl rule__Header__Group_6__1 ;
    public final void rule__Header__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1617:1: ( rule__Header__Group_6__0__Impl rule__Header__Group_6__1 )
            // InternalRecipe.g:1618:2: rule__Header__Group_6__0__Impl rule__Header__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecipe.g:1625:1: rule__Header__Group_6__0__Impl : ( 'image' ) ;
    public final void rule__Header__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1629:1: ( ( 'image' ) )
            // InternalRecipe.g:1630:1: ( 'image' )
            {
            // InternalRecipe.g:1630:1: ( 'image' )
            // InternalRecipe.g:1631:2: 'image'
            {
             before(grammarAccess.getHeaderAccess().getImageKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRecipe.g:1640:1: rule__Header__Group_6__1 : rule__Header__Group_6__1__Impl ;
    public final void rule__Header__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1644:1: ( rule__Header__Group_6__1__Impl )
            // InternalRecipe.g:1645:2: rule__Header__Group_6__1__Impl
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
    // InternalRecipe.g:1651:1: rule__Header__Group_6__1__Impl : ( ( rule__Header__ImageAssignment_6_1 ) ) ;
    public final void rule__Header__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1655:1: ( ( ( rule__Header__ImageAssignment_6_1 ) ) )
            // InternalRecipe.g:1656:1: ( ( rule__Header__ImageAssignment_6_1 ) )
            {
            // InternalRecipe.g:1656:1: ( ( rule__Header__ImageAssignment_6_1 ) )
            // InternalRecipe.g:1657:2: ( rule__Header__ImageAssignment_6_1 )
            {
             before(grammarAccess.getHeaderAccess().getImageAssignment_6_1()); 
            // InternalRecipe.g:1658:2: ( rule__Header__ImageAssignment_6_1 )
            // InternalRecipe.g:1658:3: rule__Header__ImageAssignment_6_1
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRecipe.g:1667:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1671:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRecipe.g:1672:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalRecipe.g:1679:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1683:1: ( ( ( '-' )? ) )
            // InternalRecipe.g:1684:1: ( ( '-' )? )
            {
            // InternalRecipe.g:1684:1: ( ( '-' )? )
            // InternalRecipe.g:1685:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipe.g:1686:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipe.g:1686:3: '-'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalRecipe.g:1694:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1698:1: ( rule__EInt__Group__1__Impl )
            // InternalRecipe.g:1699:2: rule__EInt__Group__1__Impl
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
    // InternalRecipe.g:1705:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1709:1: ( ( RULE_INT ) )
            // InternalRecipe.g:1710:1: ( RULE_INT )
            {
            // InternalRecipe.g:1710:1: ( RULE_INT )
            // InternalRecipe.g:1711:2: RULE_INT
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


    // $ANTLR start "rule__Nutrients__Group__0"
    // InternalRecipe.g:1721:1: rule__Nutrients__Group__0 : rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 ;
    public final void rule__Nutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1725:1: ( rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 )
            // InternalRecipe.g:1726:2: rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1
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
    // InternalRecipe.g:1733:1: rule__Nutrients__Group__0__Impl : ( 'Nutrients' ) ;
    public final void rule__Nutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1737:1: ( ( 'Nutrients' ) )
            // InternalRecipe.g:1738:1: ( 'Nutrients' )
            {
            // InternalRecipe.g:1738:1: ( 'Nutrients' )
            // InternalRecipe.g:1739:2: 'Nutrients'
            {
             before(grammarAccess.getNutrientsAccess().getNutrientsKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRecipe.g:1748:1: rule__Nutrients__Group__1 : rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 ;
    public final void rule__Nutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1752:1: ( rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 )
            // InternalRecipe.g:1753:2: rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2
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
    // InternalRecipe.g:1760:1: rule__Nutrients__Group__1__Impl : ( '{' ) ;
    public final void rule__Nutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1764:1: ( ( '{' ) )
            // InternalRecipe.g:1765:1: ( '{' )
            {
            // InternalRecipe.g:1765:1: ( '{' )
            // InternalRecipe.g:1766:2: '{'
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
    // InternalRecipe.g:1775:1: rule__Nutrients__Group__2 : rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 ;
    public final void rule__Nutrients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1779:1: ( rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 )
            // InternalRecipe.g:1780:2: rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3
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
    // InternalRecipe.g:1787:1: rule__Nutrients__Group__2__Impl : ( 'orderNumber' ) ;
    public final void rule__Nutrients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1791:1: ( ( 'orderNumber' ) )
            // InternalRecipe.g:1792:1: ( 'orderNumber' )
            {
            // InternalRecipe.g:1792:1: ( 'orderNumber' )
            // InternalRecipe.g:1793:2: 'orderNumber'
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRecipe.g:1802:1: rule__Nutrients__Group__3 : rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 ;
    public final void rule__Nutrients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1806:1: ( rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 )
            // InternalRecipe.g:1807:2: rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecipe.g:1814:1: rule__Nutrients__Group__3__Impl : ( ( rule__Nutrients__OrderNumberAssignment_3 ) ) ;
    public final void rule__Nutrients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1818:1: ( ( ( rule__Nutrients__OrderNumberAssignment_3 ) ) )
            // InternalRecipe.g:1819:1: ( ( rule__Nutrients__OrderNumberAssignment_3 ) )
            {
            // InternalRecipe.g:1819:1: ( ( rule__Nutrients__OrderNumberAssignment_3 ) )
            // InternalRecipe.g:1820:2: ( rule__Nutrients__OrderNumberAssignment_3 )
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberAssignment_3()); 
            // InternalRecipe.g:1821:2: ( rule__Nutrients__OrderNumberAssignment_3 )
            // InternalRecipe.g:1821:3: rule__Nutrients__OrderNumberAssignment_3
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
    // InternalRecipe.g:1829:1: rule__Nutrients__Group__4 : rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5 ;
    public final void rule__Nutrients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1833:1: ( rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5 )
            // InternalRecipe.g:1834:2: rule__Nutrients__Group__4__Impl rule__Nutrients__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecipe.g:1841:1: rule__Nutrients__Group__4__Impl : ( ( rule__Nutrients__Group_4__0 )? ) ;
    public final void rule__Nutrients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1845:1: ( ( ( rule__Nutrients__Group_4__0 )? ) )
            // InternalRecipe.g:1846:1: ( ( rule__Nutrients__Group_4__0 )? )
            {
            // InternalRecipe.g:1846:1: ( ( rule__Nutrients__Group_4__0 )? )
            // InternalRecipe.g:1847:2: ( rule__Nutrients__Group_4__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_4()); 
            // InternalRecipe.g:1848:2: ( rule__Nutrients__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipe.g:1848:3: rule__Nutrients__Group_4__0
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
    // InternalRecipe.g:1856:1: rule__Nutrients__Group__5 : rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6 ;
    public final void rule__Nutrients__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1860:1: ( rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6 )
            // InternalRecipe.g:1861:2: rule__Nutrients__Group__5__Impl rule__Nutrients__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecipe.g:1868:1: rule__Nutrients__Group__5__Impl : ( ( rule__Nutrients__Group_5__0 )? ) ;
    public final void rule__Nutrients__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1872:1: ( ( ( rule__Nutrients__Group_5__0 )? ) )
            // InternalRecipe.g:1873:1: ( ( rule__Nutrients__Group_5__0 )? )
            {
            // InternalRecipe.g:1873:1: ( ( rule__Nutrients__Group_5__0 )? )
            // InternalRecipe.g:1874:2: ( rule__Nutrients__Group_5__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_5()); 
            // InternalRecipe.g:1875:2: ( rule__Nutrients__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRecipe.g:1875:3: rule__Nutrients__Group_5__0
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
    // InternalRecipe.g:1883:1: rule__Nutrients__Group__6 : rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7 ;
    public final void rule__Nutrients__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1887:1: ( rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7 )
            // InternalRecipe.g:1888:2: rule__Nutrients__Group__6__Impl rule__Nutrients__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecipe.g:1895:1: rule__Nutrients__Group__6__Impl : ( ( rule__Nutrients__Group_6__0 )? ) ;
    public final void rule__Nutrients__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1899:1: ( ( ( rule__Nutrients__Group_6__0 )? ) )
            // InternalRecipe.g:1900:1: ( ( rule__Nutrients__Group_6__0 )? )
            {
            // InternalRecipe.g:1900:1: ( ( rule__Nutrients__Group_6__0 )? )
            // InternalRecipe.g:1901:2: ( rule__Nutrients__Group_6__0 )?
            {
             before(grammarAccess.getNutrientsAccess().getGroup_6()); 
            // InternalRecipe.g:1902:2: ( rule__Nutrients__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRecipe.g:1902:3: rule__Nutrients__Group_6__0
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
    // InternalRecipe.g:1910:1: rule__Nutrients__Group__7 : rule__Nutrients__Group__7__Impl ;
    public final void rule__Nutrients__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1914:1: ( rule__Nutrients__Group__7__Impl )
            // InternalRecipe.g:1915:2: rule__Nutrients__Group__7__Impl
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
    // InternalRecipe.g:1921:1: rule__Nutrients__Group__7__Impl : ( '}' ) ;
    public final void rule__Nutrients__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1925:1: ( ( '}' ) )
            // InternalRecipe.g:1926:1: ( '}' )
            {
            // InternalRecipe.g:1926:1: ( '}' )
            // InternalRecipe.g:1927:2: '}'
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
    // InternalRecipe.g:1937:1: rule__Nutrients__Group_4__0 : rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1 ;
    public final void rule__Nutrients__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1941:1: ( rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1 )
            // InternalRecipe.g:1942:2: rule__Nutrients__Group_4__0__Impl rule__Nutrients__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRecipe.g:1949:1: rule__Nutrients__Group_4__0__Impl : ( 'percentagetoggle' ) ;
    public final void rule__Nutrients__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1953:1: ( ( 'percentagetoggle' ) )
            // InternalRecipe.g:1954:1: ( 'percentagetoggle' )
            {
            // InternalRecipe.g:1954:1: ( 'percentagetoggle' )
            // InternalRecipe.g:1955:2: 'percentagetoggle'
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRecipe.g:1964:1: rule__Nutrients__Group_4__1 : rule__Nutrients__Group_4__1__Impl ;
    public final void rule__Nutrients__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1968:1: ( rule__Nutrients__Group_4__1__Impl )
            // InternalRecipe.g:1969:2: rule__Nutrients__Group_4__1__Impl
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
    // InternalRecipe.g:1975:1: rule__Nutrients__Group_4__1__Impl : ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) ) ;
    public final void rule__Nutrients__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1979:1: ( ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) ) )
            // InternalRecipe.g:1980:1: ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) )
            {
            // InternalRecipe.g:1980:1: ( ( rule__Nutrients__PercentagetoggleAssignment_4_1 ) )
            // InternalRecipe.g:1981:2: ( rule__Nutrients__PercentagetoggleAssignment_4_1 )
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetoggleAssignment_4_1()); 
            // InternalRecipe.g:1982:2: ( rule__Nutrients__PercentagetoggleAssignment_4_1 )
            // InternalRecipe.g:1982:3: rule__Nutrients__PercentagetoggleAssignment_4_1
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
    // InternalRecipe.g:1991:1: rule__Nutrients__Group_5__0 : rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1 ;
    public final void rule__Nutrients__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1995:1: ( rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1 )
            // InternalRecipe.g:1996:2: rule__Nutrients__Group_5__0__Impl rule__Nutrients__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecipe.g:2003:1: rule__Nutrients__Group_5__0__Impl : ( 'vitamins' ) ;
    public final void rule__Nutrients__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2007:1: ( ( 'vitamins' ) )
            // InternalRecipe.g:2008:1: ( 'vitamins' )
            {
            // InternalRecipe.g:2008:1: ( 'vitamins' )
            // InternalRecipe.g:2009:2: 'vitamins'
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRecipe.g:2018:1: rule__Nutrients__Group_5__1 : rule__Nutrients__Group_5__1__Impl ;
    public final void rule__Nutrients__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2022:1: ( rule__Nutrients__Group_5__1__Impl )
            // InternalRecipe.g:2023:2: rule__Nutrients__Group_5__1__Impl
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
    // InternalRecipe.g:2029:1: rule__Nutrients__Group_5__1__Impl : ( ( rule__Nutrients__VitaminsAssignment_5_1 ) ) ;
    public final void rule__Nutrients__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2033:1: ( ( ( rule__Nutrients__VitaminsAssignment_5_1 ) ) )
            // InternalRecipe.g:2034:1: ( ( rule__Nutrients__VitaminsAssignment_5_1 ) )
            {
            // InternalRecipe.g:2034:1: ( ( rule__Nutrients__VitaminsAssignment_5_1 ) )
            // InternalRecipe.g:2035:2: ( rule__Nutrients__VitaminsAssignment_5_1 )
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsAssignment_5_1()); 
            // InternalRecipe.g:2036:2: ( rule__Nutrients__VitaminsAssignment_5_1 )
            // InternalRecipe.g:2036:3: rule__Nutrients__VitaminsAssignment_5_1
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
    // InternalRecipe.g:2045:1: rule__Nutrients__Group_6__0 : rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1 ;
    public final void rule__Nutrients__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2049:1: ( rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1 )
            // InternalRecipe.g:2050:2: rule__Nutrients__Group_6__0__Impl rule__Nutrients__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRecipe.g:2057:1: rule__Nutrients__Group_6__0__Impl : ( 'macronutrients' ) ;
    public final void rule__Nutrients__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2061:1: ( ( 'macronutrients' ) )
            // InternalRecipe.g:2062:1: ( 'macronutrients' )
            {
            // InternalRecipe.g:2062:1: ( 'macronutrients' )
            // InternalRecipe.g:2063:2: 'macronutrients'
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRecipe.g:2072:1: rule__Nutrients__Group_6__1 : rule__Nutrients__Group_6__1__Impl ;
    public final void rule__Nutrients__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2076:1: ( rule__Nutrients__Group_6__1__Impl )
            // InternalRecipe.g:2077:2: rule__Nutrients__Group_6__1__Impl
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
    // InternalRecipe.g:2083:1: rule__Nutrients__Group_6__1__Impl : ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) ) ;
    public final void rule__Nutrients__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2087:1: ( ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) ) )
            // InternalRecipe.g:2088:1: ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) )
            {
            // InternalRecipe.g:2088:1: ( ( rule__Nutrients__MacronutrientsAssignment_6_1 ) )
            // InternalRecipe.g:2089:2: ( rule__Nutrients__MacronutrientsAssignment_6_1 )
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsAssignment_6_1()); 
            // InternalRecipe.g:2090:2: ( rule__Nutrients__MacronutrientsAssignment_6_1 )
            // InternalRecipe.g:2090:3: rule__Nutrients__MacronutrientsAssignment_6_1
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


    // $ANTLR start "rule__PercentageAmountToggle__Group__0"
    // InternalRecipe.g:2099:1: rule__PercentageAmountToggle__Group__0 : rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 ;
    public final void rule__PercentageAmountToggle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2103:1: ( rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 )
            // InternalRecipe.g:2104:2: rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRecipe.g:2111:1: rule__PercentageAmountToggle__Group__0__Impl : ( () ) ;
    public final void rule__PercentageAmountToggle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2115:1: ( ( () ) )
            // InternalRecipe.g:2116:1: ( () )
            {
            // InternalRecipe.g:2116:1: ( () )
            // InternalRecipe.g:2117:2: ()
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0()); 
            // InternalRecipe.g:2118:2: ()
            // InternalRecipe.g:2118:3: 
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
    // InternalRecipe.g:2126:1: rule__PercentageAmountToggle__Group__1 : rule__PercentageAmountToggle__Group__1__Impl ;
    public final void rule__PercentageAmountToggle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2130:1: ( rule__PercentageAmountToggle__Group__1__Impl )
            // InternalRecipe.g:2131:2: rule__PercentageAmountToggle__Group__1__Impl
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
    // InternalRecipe.g:2137:1: rule__PercentageAmountToggle__Group__1__Impl : ( 'PercentageAmountToggle' ) ;
    public final void rule__PercentageAmountToggle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2141:1: ( ( 'PercentageAmountToggle' ) )
            // InternalRecipe.g:2142:1: ( 'PercentageAmountToggle' )
            {
            // InternalRecipe.g:2142:1: ( 'PercentageAmountToggle' )
            // InternalRecipe.g:2143:2: 'PercentageAmountToggle'
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRecipe.g:2153:1: rule__Vitamins__Group__0 : rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 ;
    public final void rule__Vitamins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2157:1: ( rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 )
            // InternalRecipe.g:2158:2: rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1
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
    // InternalRecipe.g:2165:1: rule__Vitamins__Group__0__Impl : ( 'Vitamins' ) ;
    public final void rule__Vitamins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2169:1: ( ( 'Vitamins' ) )
            // InternalRecipe.g:2170:1: ( 'Vitamins' )
            {
            // InternalRecipe.g:2170:1: ( 'Vitamins' )
            // InternalRecipe.g:2171:2: 'Vitamins'
            {
             before(grammarAccess.getVitaminsAccess().getVitaminsKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRecipe.g:2180:1: rule__Vitamins__Group__1 : rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 ;
    public final void rule__Vitamins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2184:1: ( rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 )
            // InternalRecipe.g:2185:2: rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRecipe.g:2192:1: rule__Vitamins__Group__1__Impl : ( '{' ) ;
    public final void rule__Vitamins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2196:1: ( ( '{' ) )
            // InternalRecipe.g:2197:1: ( '{' )
            {
            // InternalRecipe.g:2197:1: ( '{' )
            // InternalRecipe.g:2198:2: '{'
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
    // InternalRecipe.g:2207:1: rule__Vitamins__Group__2 : rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 ;
    public final void rule__Vitamins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2211:1: ( rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 )
            // InternalRecipe.g:2212:2: rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3
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
    // InternalRecipe.g:2219:1: rule__Vitamins__Group__2__Impl : ( 'Vitamin' ) ;
    public final void rule__Vitamins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2223:1: ( ( 'Vitamin' ) )
            // InternalRecipe.g:2224:1: ( 'Vitamin' )
            {
            // InternalRecipe.g:2224:1: ( 'Vitamin' )
            // InternalRecipe.g:2225:2: 'Vitamin'
            {
             before(grammarAccess.getVitaminsAccess().getVitaminKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRecipe.g:2234:1: rule__Vitamins__Group__3 : rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 ;
    public final void rule__Vitamins__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2238:1: ( rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 )
            // InternalRecipe.g:2239:2: rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalRecipe.g:2246:1: rule__Vitamins__Group__3__Impl : ( '{' ) ;
    public final void rule__Vitamins__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2250:1: ( ( '{' ) )
            // InternalRecipe.g:2251:1: ( '{' )
            {
            // InternalRecipe.g:2251:1: ( '{' )
            // InternalRecipe.g:2252:2: '{'
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
    // InternalRecipe.g:2261:1: rule__Vitamins__Group__4 : rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 ;
    public final void rule__Vitamins__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2265:1: ( rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 )
            // InternalRecipe.g:2266:2: rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRecipe.g:2273:1: rule__Vitamins__Group__4__Impl : ( ( rule__Vitamins__VitaminAssignment_4 ) ) ;
    public final void rule__Vitamins__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2277:1: ( ( ( rule__Vitamins__VitaminAssignment_4 ) ) )
            // InternalRecipe.g:2278:1: ( ( rule__Vitamins__VitaminAssignment_4 ) )
            {
            // InternalRecipe.g:2278:1: ( ( rule__Vitamins__VitaminAssignment_4 ) )
            // InternalRecipe.g:2279:2: ( rule__Vitamins__VitaminAssignment_4 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_4()); 
            // InternalRecipe.g:2280:2: ( rule__Vitamins__VitaminAssignment_4 )
            // InternalRecipe.g:2280:3: rule__Vitamins__VitaminAssignment_4
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
    // InternalRecipe.g:2288:1: rule__Vitamins__Group__5 : rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6 ;
    public final void rule__Vitamins__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2292:1: ( rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6 )
            // InternalRecipe.g:2293:2: rule__Vitamins__Group__5__Impl rule__Vitamins__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalRecipe.g:2300:1: rule__Vitamins__Group__5__Impl : ( ( rule__Vitamins__Group_5__0 )* ) ;
    public final void rule__Vitamins__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2304:1: ( ( ( rule__Vitamins__Group_5__0 )* ) )
            // InternalRecipe.g:2305:1: ( ( rule__Vitamins__Group_5__0 )* )
            {
            // InternalRecipe.g:2305:1: ( ( rule__Vitamins__Group_5__0 )* )
            // InternalRecipe.g:2306:2: ( rule__Vitamins__Group_5__0 )*
            {
             before(grammarAccess.getVitaminsAccess().getGroup_5()); 
            // InternalRecipe.g:2307:2: ( rule__Vitamins__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRecipe.g:2307:3: rule__Vitamins__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Vitamins__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRecipe.g:2315:1: rule__Vitamins__Group__6 : rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7 ;
    public final void rule__Vitamins__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2319:1: ( rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7 )
            // InternalRecipe.g:2320:2: rule__Vitamins__Group__6__Impl rule__Vitamins__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecipe.g:2327:1: rule__Vitamins__Group__6__Impl : ( '}' ) ;
    public final void rule__Vitamins__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2331:1: ( ( '}' ) )
            // InternalRecipe.g:2332:1: ( '}' )
            {
            // InternalRecipe.g:2332:1: ( '}' )
            // InternalRecipe.g:2333:2: '}'
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
    // InternalRecipe.g:2342:1: rule__Vitamins__Group__7 : rule__Vitamins__Group__7__Impl ;
    public final void rule__Vitamins__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2346:1: ( rule__Vitamins__Group__7__Impl )
            // InternalRecipe.g:2347:2: rule__Vitamins__Group__7__Impl
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
    // InternalRecipe.g:2353:1: rule__Vitamins__Group__7__Impl : ( '}' ) ;
    public final void rule__Vitamins__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2357:1: ( ( '}' ) )
            // InternalRecipe.g:2358:1: ( '}' )
            {
            // InternalRecipe.g:2358:1: ( '}' )
            // InternalRecipe.g:2359:2: '}'
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
    // InternalRecipe.g:2369:1: rule__Vitamins__Group_5__0 : rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1 ;
    public final void rule__Vitamins__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2373:1: ( rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1 )
            // InternalRecipe.g:2374:2: rule__Vitamins__Group_5__0__Impl rule__Vitamins__Group_5__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRecipe.g:2381:1: rule__Vitamins__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Vitamins__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2385:1: ( ( ',' ) )
            // InternalRecipe.g:2386:1: ( ',' )
            {
            // InternalRecipe.g:2386:1: ( ',' )
            // InternalRecipe.g:2387:2: ','
            {
             before(grammarAccess.getVitaminsAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRecipe.g:2396:1: rule__Vitamins__Group_5__1 : rule__Vitamins__Group_5__1__Impl ;
    public final void rule__Vitamins__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2400:1: ( rule__Vitamins__Group_5__1__Impl )
            // InternalRecipe.g:2401:2: rule__Vitamins__Group_5__1__Impl
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
    // InternalRecipe.g:2407:1: rule__Vitamins__Group_5__1__Impl : ( ( rule__Vitamins__VitaminAssignment_5_1 ) ) ;
    public final void rule__Vitamins__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2411:1: ( ( ( rule__Vitamins__VitaminAssignment_5_1 ) ) )
            // InternalRecipe.g:2412:1: ( ( rule__Vitamins__VitaminAssignment_5_1 ) )
            {
            // InternalRecipe.g:2412:1: ( ( rule__Vitamins__VitaminAssignment_5_1 ) )
            // InternalRecipe.g:2413:2: ( rule__Vitamins__VitaminAssignment_5_1 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_5_1()); 
            // InternalRecipe.g:2414:2: ( rule__Vitamins__VitaminAssignment_5_1 )
            // InternalRecipe.g:2414:3: rule__Vitamins__VitaminAssignment_5_1
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
    // InternalRecipe.g:2423:1: rule__Macronutrients__Group__0 : rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 ;
    public final void rule__Macronutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2427:1: ( rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 )
            // InternalRecipe.g:2428:2: rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRecipe.g:2435:1: rule__Macronutrients__Group__0__Impl : ( () ) ;
    public final void rule__Macronutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2439:1: ( ( () ) )
            // InternalRecipe.g:2440:1: ( () )
            {
            // InternalRecipe.g:2440:1: ( () )
            // InternalRecipe.g:2441:2: ()
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0()); 
            // InternalRecipe.g:2442:2: ()
            // InternalRecipe.g:2442:3: 
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
    // InternalRecipe.g:2450:1: rule__Macronutrients__Group__1 : rule__Macronutrients__Group__1__Impl ;
    public final void rule__Macronutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2454:1: ( rule__Macronutrients__Group__1__Impl )
            // InternalRecipe.g:2455:2: rule__Macronutrients__Group__1__Impl
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
    // InternalRecipe.g:2461:1: rule__Macronutrients__Group__1__Impl : ( 'Macronutrients' ) ;
    public final void rule__Macronutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2465:1: ( ( 'Macronutrients' ) )
            // InternalRecipe.g:2466:1: ( 'Macronutrients' )
            {
            // InternalRecipe.g:2466:1: ( 'Macronutrients' )
            // InternalRecipe.g:2467:2: 'Macronutrients'
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__UnitOfMeasure__Group__0"
    // InternalRecipe.g:2477:1: rule__UnitOfMeasure__Group__0 : rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 ;
    public final void rule__UnitOfMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2481:1: ( rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 )
            // InternalRecipe.g:2482:2: rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipe.g:2489:1: rule__UnitOfMeasure__Group__0__Impl : ( () ) ;
    public final void rule__UnitOfMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2493:1: ( ( () ) )
            // InternalRecipe.g:2494:1: ( () )
            {
            // InternalRecipe.g:2494:1: ( () )
            // InternalRecipe.g:2495:2: ()
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureAction_0()); 
            // InternalRecipe.g:2496:2: ()
            // InternalRecipe.g:2496:3: 
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
    // InternalRecipe.g:2504:1: rule__UnitOfMeasure__Group__1 : rule__UnitOfMeasure__Group__1__Impl ;
    public final void rule__UnitOfMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2508:1: ( rule__UnitOfMeasure__Group__1__Impl )
            // InternalRecipe.g:2509:2: rule__UnitOfMeasure__Group__1__Impl
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
    // InternalRecipe.g:2515:1: rule__UnitOfMeasure__Group__1__Impl : ( 'UnitOfMeasure' ) ;
    public final void rule__UnitOfMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2519:1: ( ( 'UnitOfMeasure' ) )
            // InternalRecipe.g:2520:1: ( 'UnitOfMeasure' )
            {
            // InternalRecipe.g:2520:1: ( 'UnitOfMeasure' )
            // InternalRecipe.g:2521:2: 'UnitOfMeasure'
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRecipe.g:2531:1: rule__BasicInformation__Group__0 : rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 ;
    public final void rule__BasicInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2535:1: ( rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 )
            // InternalRecipe.g:2536:2: rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecipe.g:2543:1: rule__BasicInformation__Group__0__Impl : ( () ) ;
    public final void rule__BasicInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2547:1: ( ( () ) )
            // InternalRecipe.g:2548:1: ( () )
            {
            // InternalRecipe.g:2548:1: ( () )
            // InternalRecipe.g:2549:2: ()
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationAction_0()); 
            // InternalRecipe.g:2550:2: ()
            // InternalRecipe.g:2550:3: 
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
    // InternalRecipe.g:2558:1: rule__BasicInformation__Group__1 : rule__BasicInformation__Group__1__Impl ;
    public final void rule__BasicInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2562:1: ( rule__BasicInformation__Group__1__Impl )
            // InternalRecipe.g:2563:2: rule__BasicInformation__Group__1__Impl
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
    // InternalRecipe.g:2569:1: rule__BasicInformation__Group__1__Impl : ( 'BasicInformation' ) ;
    public final void rule__BasicInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2573:1: ( ( 'BasicInformation' ) )
            // InternalRecipe.g:2574:1: ( 'BasicInformation' )
            {
            // InternalRecipe.g:2574:1: ( 'BasicInformation' )
            // InternalRecipe.g:2575:2: 'BasicInformation'
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRecipe.g:2585:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2589:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalRecipe.g:2590:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRecipe.g:2597:1: rule__Title__Group__0__Impl : ( () ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2601:1: ( ( () ) )
            // InternalRecipe.g:2602:1: ( () )
            {
            // InternalRecipe.g:2602:1: ( () )
            // InternalRecipe.g:2603:2: ()
            {
             before(grammarAccess.getTitleAccess().getTitleAction_0()); 
            // InternalRecipe.g:2604:2: ()
            // InternalRecipe.g:2604:3: 
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
    // InternalRecipe.g:2612:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2616:1: ( rule__Title__Group__1__Impl )
            // InternalRecipe.g:2617:2: rule__Title__Group__1__Impl
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
    // InternalRecipe.g:2623:1: rule__Title__Group__1__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2627:1: ( ( 'Title' ) )
            // InternalRecipe.g:2628:1: ( 'Title' )
            {
            // InternalRecipe.g:2628:1: ( 'Title' )
            // InternalRecipe.g:2629:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRecipe.g:2639:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2643:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalRecipe.g:2644:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecipe.g:2651:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2655:1: ( ( () ) )
            // InternalRecipe.g:2656:1: ( () )
            {
            // InternalRecipe.g:2656:1: ( () )
            // InternalRecipe.g:2657:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalRecipe.g:2658:2: ()
            // InternalRecipe.g:2658:3: 
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
    // InternalRecipe.g:2666:1: rule__Image__Group__1 : rule__Image__Group__1__Impl ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2670:1: ( rule__Image__Group__1__Impl )
            // InternalRecipe.g:2671:2: rule__Image__Group__1__Impl
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
    // InternalRecipe.g:2677:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2681:1: ( ( 'Image' ) )
            // InternalRecipe.g:2682:1: ( 'Image' )
            {
            // InternalRecipe.g:2682:1: ( 'Image' )
            // InternalRecipe.g:2683:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalRecipe.g:2693:1: rule__Page__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2697:1: ( ( ruleEString ) )
            // InternalRecipe.g:2698:2: ( ruleEString )
            {
            // InternalRecipe.g:2698:2: ( ruleEString )
            // InternalRecipe.g:2699:3: ruleEString
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
    // InternalRecipe.g:2708:1: rule__Page__InstructionsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Page__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2712:1: ( ( ( ruleEString ) ) )
            // InternalRecipe.g:2713:2: ( ( ruleEString ) )
            {
            // InternalRecipe.g:2713:2: ( ( ruleEString ) )
            // InternalRecipe.g:2714:3: ( ruleEString )
            {
             before(grammarAccess.getPageAccess().getInstructionsInstructionsCrossReference_4_0()); 
            // InternalRecipe.g:2715:3: ( ruleEString )
            // InternalRecipe.g:2716:4: ruleEString
            {
             before(grammarAccess.getPageAccess().getInstructionsInstructionsEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getInstructionsInstructionsEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPageAccess().getInstructionsInstructionsCrossReference_4_0()); 

            }


            }

        }
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
    // InternalRecipe.g:2727:1: rule__Page__IngredientsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Page__IngredientsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2731:1: ( ( ( ruleEString ) ) )
            // InternalRecipe.g:2732:2: ( ( ruleEString ) )
            {
            // InternalRecipe.g:2732:2: ( ( ruleEString ) )
            // InternalRecipe.g:2733:3: ( ruleEString )
            {
             before(grammarAccess.getPageAccess().getIngredientsIngredientsCrossReference_6_0()); 
            // InternalRecipe.g:2734:3: ( ruleEString )
            // InternalRecipe.g:2735:4: ruleEString
            {
             before(grammarAccess.getPageAccess().getIngredientsIngredientsEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getIngredientsIngredientsEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPageAccess().getIngredientsIngredientsCrossReference_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Page__SectionAssignment_7_2"
    // InternalRecipe.g:2746:1: rule__Page__SectionAssignment_7_2 : ( ruleSection ) ;
    public final void rule__Page__SectionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2750:1: ( ( ruleSection ) )
            // InternalRecipe.g:2751:2: ( ruleSection )
            {
            // InternalRecipe.g:2751:2: ( ruleSection )
            // InternalRecipe.g:2752:3: ruleSection
            {
             before(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__SectionAssignment_7_2"


    // $ANTLR start "rule__Page__SectionAssignment_7_3_1"
    // InternalRecipe.g:2761:1: rule__Page__SectionAssignment_7_3_1 : ( ruleSection ) ;
    public final void rule__Page__SectionAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2765:1: ( ( ruleSection ) )
            // InternalRecipe.g:2766:2: ( ruleSection )
            {
            // InternalRecipe.g:2766:2: ( ruleSection )
            // InternalRecipe.g:2767:3: ruleSection
            {
             before(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__SectionAssignment_7_3_1"


    // $ANTLR start "rule__Page__HeaderAssignment_9"
    // InternalRecipe.g:2776:1: rule__Page__HeaderAssignment_9 : ( ruleHeader ) ;
    public final void rule__Page__HeaderAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2780:1: ( ( ruleHeader ) )
            // InternalRecipe.g:2781:2: ( ruleHeader )
            {
            // InternalRecipe.g:2781:2: ( ruleHeader )
            // InternalRecipe.g:2782:3: ruleHeader
            {
             before(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HeaderAssignment_9"


    // $ANTLR start "rule__Instructions__OrderNumberAssignment_3"
    // InternalRecipe.g:2791:1: rule__Instructions__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Instructions__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2795:1: ( ( ruleEInt ) )
            // InternalRecipe.g:2796:2: ( ruleEInt )
            {
            // InternalRecipe.g:2796:2: ( ruleEInt )
            // InternalRecipe.g:2797:3: ruleEInt
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
    // InternalRecipe.g:2806:1: rule__Ingredients__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Ingredients__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2810:1: ( ( ruleEInt ) )
            // InternalRecipe.g:2811:2: ( ruleEInt )
            {
            // InternalRecipe.g:2811:2: ( ruleEInt )
            // InternalRecipe.g:2812:3: ruleEInt
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
    // InternalRecipe.g:2821:1: rule__Ingredients__UnittoggleAssignment_4_1 : ( ruleUnitOfMeasure ) ;
    public final void rule__Ingredients__UnittoggleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2825:1: ( ( ruleUnitOfMeasure ) )
            // InternalRecipe.g:2826:2: ( ruleUnitOfMeasure )
            {
            // InternalRecipe.g:2826:2: ( ruleUnitOfMeasure )
            // InternalRecipe.g:2827:3: ruleUnitOfMeasure
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
    // InternalRecipe.g:2836:1: rule__Header__BasicinformationAssignment_3 : ( ruleBasicInformation ) ;
    public final void rule__Header__BasicinformationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2840:1: ( ( ruleBasicInformation ) )
            // InternalRecipe.g:2841:2: ( ruleBasicInformation )
            {
            // InternalRecipe.g:2841:2: ( ruleBasicInformation )
            // InternalRecipe.g:2842:3: ruleBasicInformation
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
    // InternalRecipe.g:2851:1: rule__Header__RecipetitleAssignment_5 : ( ruleTitle ) ;
    public final void rule__Header__RecipetitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2855:1: ( ( ruleTitle ) )
            // InternalRecipe.g:2856:2: ( ruleTitle )
            {
            // InternalRecipe.g:2856:2: ( ruleTitle )
            // InternalRecipe.g:2857:3: ruleTitle
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
    // InternalRecipe.g:2866:1: rule__Header__ImageAssignment_6_1 : ( ruleImage ) ;
    public final void rule__Header__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2870:1: ( ( ruleImage ) )
            // InternalRecipe.g:2871:2: ( ruleImage )
            {
            // InternalRecipe.g:2871:2: ( ruleImage )
            // InternalRecipe.g:2872:3: ruleImage
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
    // InternalRecipe.g:2881:1: rule__Nutrients__OrderNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Nutrients__OrderNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2885:1: ( ( ruleEInt ) )
            // InternalRecipe.g:2886:2: ( ruleEInt )
            {
            // InternalRecipe.g:2886:2: ( ruleEInt )
            // InternalRecipe.g:2887:3: ruleEInt
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
    // InternalRecipe.g:2896:1: rule__Nutrients__PercentagetoggleAssignment_4_1 : ( rulePercentageAmountToggle ) ;
    public final void rule__Nutrients__PercentagetoggleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2900:1: ( ( rulePercentageAmountToggle ) )
            // InternalRecipe.g:2901:2: ( rulePercentageAmountToggle )
            {
            // InternalRecipe.g:2901:2: ( rulePercentageAmountToggle )
            // InternalRecipe.g:2902:3: rulePercentageAmountToggle
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
    // InternalRecipe.g:2911:1: rule__Nutrients__VitaminsAssignment_5_1 : ( ruleVitamins ) ;
    public final void rule__Nutrients__VitaminsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2915:1: ( ( ruleVitamins ) )
            // InternalRecipe.g:2916:2: ( ruleVitamins )
            {
            // InternalRecipe.g:2916:2: ( ruleVitamins )
            // InternalRecipe.g:2917:3: ruleVitamins
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
    // InternalRecipe.g:2926:1: rule__Nutrients__MacronutrientsAssignment_6_1 : ( ruleMacronutrients ) ;
    public final void rule__Nutrients__MacronutrientsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2930:1: ( ( ruleMacronutrients ) )
            // InternalRecipe.g:2931:2: ( ruleMacronutrients )
            {
            // InternalRecipe.g:2931:2: ( ruleMacronutrients )
            // InternalRecipe.g:2932:3: ruleMacronutrients
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
    // InternalRecipe.g:2941:1: rule__Vitamins__VitaminAssignment_4 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2945:1: ( ( ruleVitamin ) )
            // InternalRecipe.g:2946:2: ( ruleVitamin )
            {
            // InternalRecipe.g:2946:2: ( ruleVitamin )
            // InternalRecipe.g:2947:3: ruleVitamin
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
    // InternalRecipe.g:2956:1: rule__Vitamins__VitaminAssignment_5_1 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2960:1: ( ( ruleVitamin ) )
            // InternalRecipe.g:2961:2: ( ruleVitamin )
            {
            // InternalRecipe.g:2961:2: ( ruleVitamin )
            // InternalRecipe.g:2962:3: ruleVitamin
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000040A0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000038004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001FF800L});

}