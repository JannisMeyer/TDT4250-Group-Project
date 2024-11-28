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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'", "'Page'", "'{'", "'}'", "'Instructions'", "'orderNumber'", "'Ingredients'", "'Header'", "'Nutrients'", "'-'", "'UnitOfMeasureToggle'", "'BasicInformation'", "'Title'", "'Image'", "'PercentageAmountToggle'", "'Vitamins'", "','", "'Macronutrients'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipeDSL.g:153:1: entryRuleNutrients : ruleNutrients EOF ;
    public final void entryRuleNutrients() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:154:1: ( ruleNutrients EOF )
            // InternalRecipeDSL.g:155:1: ruleNutrients EOF
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
    // InternalRecipeDSL.g:162:1: ruleNutrients : ( ( rule__Nutrients__Group__0 ) ) ;
    public final void ruleNutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:166:2: ( ( ( rule__Nutrients__Group__0 ) ) )
            // InternalRecipeDSL.g:167:2: ( ( rule__Nutrients__Group__0 ) )
            {
            // InternalRecipeDSL.g:167:2: ( ( rule__Nutrients__Group__0 ) )
            // InternalRecipeDSL.g:168:3: ( rule__Nutrients__Group__0 )
            {
             before(grammarAccess.getNutrientsAccess().getGroup()); 
            // InternalRecipeDSL.g:169:3: ( rule__Nutrients__Group__0 )
            // InternalRecipeDSL.g:169:4: rule__Nutrients__Group__0
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
    // InternalRecipeDSL.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:179:1: ( ruleEInt EOF )
            // InternalRecipeDSL.g:180:1: ruleEInt EOF
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
    // InternalRecipeDSL.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRecipeDSL.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRecipeDSL.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalRecipeDSL.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRecipeDSL.g:194:3: ( rule__EInt__Group__0 )
            // InternalRecipeDSL.g:194:4: rule__EInt__Group__0
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
    // InternalRecipeDSL.g:203:1: entryRuleUnitOfMeasure : ruleUnitOfMeasure EOF ;
    public final void entryRuleUnitOfMeasure() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:204:1: ( ruleUnitOfMeasure EOF )
            // InternalRecipeDSL.g:205:1: ruleUnitOfMeasure EOF
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
    // InternalRecipeDSL.g:212:1: ruleUnitOfMeasure : ( ( rule__UnitOfMeasure__Group__0 ) ) ;
    public final void ruleUnitOfMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:216:2: ( ( ( rule__UnitOfMeasure__Group__0 ) ) )
            // InternalRecipeDSL.g:217:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            {
            // InternalRecipeDSL.g:217:2: ( ( rule__UnitOfMeasure__Group__0 ) )
            // InternalRecipeDSL.g:218:3: ( rule__UnitOfMeasure__Group__0 )
            {
             before(grammarAccess.getUnitOfMeasureAccess().getGroup()); 
            // InternalRecipeDSL.g:219:3: ( rule__UnitOfMeasure__Group__0 )
            // InternalRecipeDSL.g:219:4: rule__UnitOfMeasure__Group__0
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
    // InternalRecipeDSL.g:228:1: entryRuleBasicInformation : ruleBasicInformation EOF ;
    public final void entryRuleBasicInformation() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:229:1: ( ruleBasicInformation EOF )
            // InternalRecipeDSL.g:230:1: ruleBasicInformation EOF
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
    // InternalRecipeDSL.g:237:1: ruleBasicInformation : ( ( rule__BasicInformation__Group__0 ) ) ;
    public final void ruleBasicInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:241:2: ( ( ( rule__BasicInformation__Group__0 ) ) )
            // InternalRecipeDSL.g:242:2: ( ( rule__BasicInformation__Group__0 ) )
            {
            // InternalRecipeDSL.g:242:2: ( ( rule__BasicInformation__Group__0 ) )
            // InternalRecipeDSL.g:243:3: ( rule__BasicInformation__Group__0 )
            {
             before(grammarAccess.getBasicInformationAccess().getGroup()); 
            // InternalRecipeDSL.g:244:3: ( rule__BasicInformation__Group__0 )
            // InternalRecipeDSL.g:244:4: rule__BasicInformation__Group__0
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
    // InternalRecipeDSL.g:253:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:254:1: ( ruleTitle EOF )
            // InternalRecipeDSL.g:255:1: ruleTitle EOF
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
    // InternalRecipeDSL.g:262:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:266:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalRecipeDSL.g:267:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalRecipeDSL.g:267:2: ( ( rule__Title__Group__0 ) )
            // InternalRecipeDSL.g:268:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalRecipeDSL.g:269:3: ( rule__Title__Group__0 )
            // InternalRecipeDSL.g:269:4: rule__Title__Group__0
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
    // InternalRecipeDSL.g:278:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:279:1: ( ruleImage EOF )
            // InternalRecipeDSL.g:280:1: ruleImage EOF
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
    // InternalRecipeDSL.g:287:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:291:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalRecipeDSL.g:292:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalRecipeDSL.g:292:2: ( ( rule__Image__Group__0 ) )
            // InternalRecipeDSL.g:293:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalRecipeDSL.g:294:3: ( rule__Image__Group__0 )
            // InternalRecipeDSL.g:294:4: rule__Image__Group__0
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
    // InternalRecipeDSL.g:303:1: entryRulePercentageAmountToggle : rulePercentageAmountToggle EOF ;
    public final void entryRulePercentageAmountToggle() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:304:1: ( rulePercentageAmountToggle EOF )
            // InternalRecipeDSL.g:305:1: rulePercentageAmountToggle EOF
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
    // InternalRecipeDSL.g:312:1: rulePercentageAmountToggle : ( ( rule__PercentageAmountToggle__Group__0 ) ) ;
    public final void rulePercentageAmountToggle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:316:2: ( ( ( rule__PercentageAmountToggle__Group__0 ) ) )
            // InternalRecipeDSL.g:317:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            {
            // InternalRecipeDSL.g:317:2: ( ( rule__PercentageAmountToggle__Group__0 ) )
            // InternalRecipeDSL.g:318:3: ( rule__PercentageAmountToggle__Group__0 )
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getGroup()); 
            // InternalRecipeDSL.g:319:3: ( rule__PercentageAmountToggle__Group__0 )
            // InternalRecipeDSL.g:319:4: rule__PercentageAmountToggle__Group__0
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
    // InternalRecipeDSL.g:328:1: entryRuleVitamins : ruleVitamins EOF ;
    public final void entryRuleVitamins() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:329:1: ( ruleVitamins EOF )
            // InternalRecipeDSL.g:330:1: ruleVitamins EOF
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
    // InternalRecipeDSL.g:337:1: ruleVitamins : ( ( rule__Vitamins__Group__0 ) ) ;
    public final void ruleVitamins() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:341:2: ( ( ( rule__Vitamins__Group__0 ) ) )
            // InternalRecipeDSL.g:342:2: ( ( rule__Vitamins__Group__0 ) )
            {
            // InternalRecipeDSL.g:342:2: ( ( rule__Vitamins__Group__0 ) )
            // InternalRecipeDSL.g:343:3: ( rule__Vitamins__Group__0 )
            {
             before(grammarAccess.getVitaminsAccess().getGroup()); 
            // InternalRecipeDSL.g:344:3: ( rule__Vitamins__Group__0 )
            // InternalRecipeDSL.g:344:4: rule__Vitamins__Group__0
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
    // InternalRecipeDSL.g:353:1: entryRuleMacronutrients : ruleMacronutrients EOF ;
    public final void entryRuleMacronutrients() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:354:1: ( ruleMacronutrients EOF )
            // InternalRecipeDSL.g:355:1: ruleMacronutrients EOF
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
    // InternalRecipeDSL.g:362:1: ruleMacronutrients : ( ( rule__Macronutrients__Group__0 ) ) ;
    public final void ruleMacronutrients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:366:2: ( ( ( rule__Macronutrients__Group__0 ) ) )
            // InternalRecipeDSL.g:367:2: ( ( rule__Macronutrients__Group__0 ) )
            {
            // InternalRecipeDSL.g:367:2: ( ( rule__Macronutrients__Group__0 ) )
            // InternalRecipeDSL.g:368:3: ( rule__Macronutrients__Group__0 )
            {
             before(grammarAccess.getMacronutrientsAccess().getGroup()); 
            // InternalRecipeDSL.g:369:3: ( rule__Macronutrients__Group__0 )
            // InternalRecipeDSL.g:369:4: rule__Macronutrients__Group__0
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
    // InternalRecipeDSL.g:378:1: ruleVitamin : ( ( rule__Vitamin__Alternatives ) ) ;
    public final void ruleVitamin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:382:1: ( ( ( rule__Vitamin__Alternatives ) ) )
            // InternalRecipeDSL.g:383:2: ( ( rule__Vitamin__Alternatives ) )
            {
            // InternalRecipeDSL.g:383:2: ( ( rule__Vitamin__Alternatives ) )
            // InternalRecipeDSL.g:384:3: ( rule__Vitamin__Alternatives )
            {
             before(grammarAccess.getVitaminAccess().getAlternatives()); 
            // InternalRecipeDSL.g:385:3: ( rule__Vitamin__Alternatives )
            // InternalRecipeDSL.g:385:4: rule__Vitamin__Alternatives
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


    // $ANTLR start "rule__Vitamin__Alternatives"
    // InternalRecipeDSL.g:393:1: rule__Vitamin__Alternatives : ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) );
    public final void rule__Vitamin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:397:1: ( ( ( 'VITAMIN_A' ) ) | ( ( 'VITAMIN_B1' ) ) | ( ( 'VITAMIN_B2' ) ) | ( ( 'VITAMIN_B3' ) ) | ( ( 'VITAMIN_B5' ) ) | ( ( 'VITAMIN_B6' ) ) | ( ( 'VITAMIN_B12' ) ) | ( ( 'VITAMIN_C' ) ) | ( ( 'VITAMIN_E' ) ) | ( ( 'VITAMIN_K' ) ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRecipeDSL.g:398:2: ( ( 'VITAMIN_A' ) )
                    {
                    // InternalRecipeDSL.g:398:2: ( ( 'VITAMIN_A' ) )
                    // InternalRecipeDSL.g:399:3: ( 'VITAMIN_A' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 
                    // InternalRecipeDSL.g:400:3: ( 'VITAMIN_A' )
                    // InternalRecipeDSL.g:400:4: 'VITAMIN_A'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:404:2: ( ( 'VITAMIN_B1' ) )
                    {
                    // InternalRecipeDSL.g:404:2: ( ( 'VITAMIN_B1' ) )
                    // InternalRecipeDSL.g:405:3: ( 'VITAMIN_B1' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 
                    // InternalRecipeDSL.g:406:3: ( 'VITAMIN_B1' )
                    // InternalRecipeDSL.g:406:4: 'VITAMIN_B1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:410:2: ( ( 'VITAMIN_B2' ) )
                    {
                    // InternalRecipeDSL.g:410:2: ( ( 'VITAMIN_B2' ) )
                    // InternalRecipeDSL.g:411:3: ( 'VITAMIN_B2' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 
                    // InternalRecipeDSL.g:412:3: ( 'VITAMIN_B2' )
                    // InternalRecipeDSL.g:412:4: 'VITAMIN_B2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:416:2: ( ( 'VITAMIN_B3' ) )
                    {
                    // InternalRecipeDSL.g:416:2: ( ( 'VITAMIN_B3' ) )
                    // InternalRecipeDSL.g:417:3: ( 'VITAMIN_B3' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 
                    // InternalRecipeDSL.g:418:3: ( 'VITAMIN_B3' )
                    // InternalRecipeDSL.g:418:4: 'VITAMIN_B3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:422:2: ( ( 'VITAMIN_B5' ) )
                    {
                    // InternalRecipeDSL.g:422:2: ( ( 'VITAMIN_B5' ) )
                    // InternalRecipeDSL.g:423:3: ( 'VITAMIN_B5' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 
                    // InternalRecipeDSL.g:424:3: ( 'VITAMIN_B5' )
                    // InternalRecipeDSL.g:424:4: 'VITAMIN_B5'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipeDSL.g:428:2: ( ( 'VITAMIN_B6' ) )
                    {
                    // InternalRecipeDSL.g:428:2: ( ( 'VITAMIN_B6' ) )
                    // InternalRecipeDSL.g:429:3: ( 'VITAMIN_B6' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 
                    // InternalRecipeDSL.g:430:3: ( 'VITAMIN_B6' )
                    // InternalRecipeDSL.g:430:4: 'VITAMIN_B6'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipeDSL.g:434:2: ( ( 'VITAMIN_B12' ) )
                    {
                    // InternalRecipeDSL.g:434:2: ( ( 'VITAMIN_B12' ) )
                    // InternalRecipeDSL.g:435:3: ( 'VITAMIN_B12' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 
                    // InternalRecipeDSL.g:436:3: ( 'VITAMIN_B12' )
                    // InternalRecipeDSL.g:436:4: 'VITAMIN_B12'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipeDSL.g:440:2: ( ( 'VITAMIN_C' ) )
                    {
                    // InternalRecipeDSL.g:440:2: ( ( 'VITAMIN_C' ) )
                    // InternalRecipeDSL.g:441:3: ( 'VITAMIN_C' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 
                    // InternalRecipeDSL.g:442:3: ( 'VITAMIN_C' )
                    // InternalRecipeDSL.g:442:4: 'VITAMIN_C'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipeDSL.g:446:2: ( ( 'VITAMIN_E' ) )
                    {
                    // InternalRecipeDSL.g:446:2: ( ( 'VITAMIN_E' ) )
                    // InternalRecipeDSL.g:447:3: ( 'VITAMIN_E' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 
                    // InternalRecipeDSL.g:448:3: ( 'VITAMIN_E' )
                    // InternalRecipeDSL.g:448:4: 'VITAMIN_E'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipeDSL.g:452:2: ( ( 'VITAMIN_K' ) )
                    {
                    // InternalRecipeDSL.g:452:2: ( ( 'VITAMIN_K' ) )
                    // InternalRecipeDSL.g:453:3: ( 'VITAMIN_K' )
                    {
                     before(grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9()); 
                    // InternalRecipeDSL.g:454:3: ( 'VITAMIN_K' )
                    // InternalRecipeDSL.g:454:4: 'VITAMIN_K'
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
    // InternalRecipeDSL.g:462:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:466:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalRecipeDSL.g:467:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalRecipeDSL.g:474:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:478:1: ( ( 'Page' ) )
            // InternalRecipeDSL.g:479:1: ( 'Page' )
            {
            // InternalRecipeDSL.g:479:1: ( 'Page' )
            // InternalRecipeDSL.g:480:2: 'Page'
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
    // InternalRecipeDSL.g:489:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:493:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalRecipeDSL.g:494:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalRecipeDSL.g:501:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:505:1: ( ( '{' ) )
            // InternalRecipeDSL.g:506:1: ( '{' )
            {
            // InternalRecipeDSL.g:506:1: ( '{' )
            // InternalRecipeDSL.g:507:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:516:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:520:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalRecipeDSL.g:521:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalRecipeDSL.g:528:1: rule__Page__Group__2__Impl : ( ( rule__Page__UnorderedGroup_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:532:1: ( ( ( rule__Page__UnorderedGroup_2 ) ) )
            // InternalRecipeDSL.g:533:1: ( ( rule__Page__UnorderedGroup_2 ) )
            {
            // InternalRecipeDSL.g:533:1: ( ( rule__Page__UnorderedGroup_2 ) )
            // InternalRecipeDSL.g:534:2: ( rule__Page__UnorderedGroup_2 )
            {
             before(grammarAccess.getPageAccess().getUnorderedGroup_2()); 
            // InternalRecipeDSL.g:535:2: ( rule__Page__UnorderedGroup_2 )
            // InternalRecipeDSL.g:535:3: rule__Page__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getUnorderedGroup_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:543:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:547:1: ( rule__Page__Group__3__Impl )
            // InternalRecipeDSL.g:548:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:554:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:558:1: ( ( '}' ) )
            // InternalRecipeDSL.g:559:1: ( '}' )
            {
            // InternalRecipeDSL.g:559:1: ( '}' )
            // InternalRecipeDSL.g:560:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instructions__Group__0"
    // InternalRecipeDSL.g:570:1: rule__Instructions__Group__0 : rule__Instructions__Group__0__Impl rule__Instructions__Group__1 ;
    public final void rule__Instructions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:574:1: ( rule__Instructions__Group__0__Impl rule__Instructions__Group__1 )
            // InternalRecipeDSL.g:575:2: rule__Instructions__Group__0__Impl rule__Instructions__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRecipeDSL.g:582:1: rule__Instructions__Group__0__Impl : ( () ) ;
    public final void rule__Instructions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:586:1: ( ( () ) )
            // InternalRecipeDSL.g:587:1: ( () )
            {
            // InternalRecipeDSL.g:587:1: ( () )
            // InternalRecipeDSL.g:588:2: ()
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsAction_0()); 
            // InternalRecipeDSL.g:589:2: ()
            // InternalRecipeDSL.g:589:3: 
            {
            }

             after(grammarAccess.getInstructionsAccess().getInstructionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__0__Impl"


    // $ANTLR start "rule__Instructions__Group__1"
    // InternalRecipeDSL.g:597:1: rule__Instructions__Group__1 : rule__Instructions__Group__1__Impl rule__Instructions__Group__2 ;
    public final void rule__Instructions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:601:1: ( rule__Instructions__Group__1__Impl rule__Instructions__Group__2 )
            // InternalRecipeDSL.g:602:2: rule__Instructions__Group__1__Impl rule__Instructions__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:609:1: rule__Instructions__Group__1__Impl : ( 'Instructions' ) ;
    public final void rule__Instructions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:613:1: ( ( 'Instructions' ) )
            // InternalRecipeDSL.g:614:1: ( 'Instructions' )
            {
            // InternalRecipeDSL.g:614:1: ( 'Instructions' )
            // InternalRecipeDSL.g:615:2: 'Instructions'
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getInstructionsKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:624:1: rule__Instructions__Group__2 : rule__Instructions__Group__2__Impl rule__Instructions__Group__3 ;
    public final void rule__Instructions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:628:1: ( rule__Instructions__Group__2__Impl rule__Instructions__Group__3 )
            // InternalRecipeDSL.g:629:2: rule__Instructions__Group__2__Impl rule__Instructions__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRecipeDSL.g:636:1: rule__Instructions__Group__2__Impl : ( '{' ) ;
    public final void rule__Instructions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:640:1: ( ( '{' ) )
            // InternalRecipeDSL.g:641:1: ( '{' )
            {
            // InternalRecipeDSL.g:641:1: ( '{' )
            // InternalRecipeDSL.g:642:2: '{'
            {
             before(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:651:1: rule__Instructions__Group__3 : rule__Instructions__Group__3__Impl rule__Instructions__Group__4 ;
    public final void rule__Instructions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:655:1: ( rule__Instructions__Group__3__Impl rule__Instructions__Group__4 )
            // InternalRecipeDSL.g:656:2: rule__Instructions__Group__3__Impl rule__Instructions__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecipeDSL.g:663:1: rule__Instructions__Group__3__Impl : ( 'orderNumber' ) ;
    public final void rule__Instructions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:667:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:668:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:668:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:669:2: 'orderNumber'
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getOrderNumberKeyword_3()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:678:1: rule__Instructions__Group__4 : rule__Instructions__Group__4__Impl rule__Instructions__Group__5 ;
    public final void rule__Instructions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:682:1: ( rule__Instructions__Group__4__Impl rule__Instructions__Group__5 )
            // InternalRecipeDSL.g:683:2: rule__Instructions__Group__4__Impl rule__Instructions__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Instructions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__5();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:690:1: rule__Instructions__Group__4__Impl : ( ( rule__Instructions__OrderNumberAssignment_4 ) ) ;
    public final void rule__Instructions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:694:1: ( ( ( rule__Instructions__OrderNumberAssignment_4 ) ) )
            // InternalRecipeDSL.g:695:1: ( ( rule__Instructions__OrderNumberAssignment_4 ) )
            {
            // InternalRecipeDSL.g:695:1: ( ( rule__Instructions__OrderNumberAssignment_4 ) )
            // InternalRecipeDSL.g:696:2: ( rule__Instructions__OrderNumberAssignment_4 )
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberAssignment_4()); 
            // InternalRecipeDSL.g:697:2: ( rule__Instructions__OrderNumberAssignment_4 )
            // InternalRecipeDSL.g:697:3: rule__Instructions__OrderNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__OrderNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getOrderNumberAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instructions__Group__5"
    // InternalRecipeDSL.g:705:1: rule__Instructions__Group__5 : rule__Instructions__Group__5__Impl ;
    public final void rule__Instructions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:709:1: ( rule__Instructions__Group__5__Impl )
            // InternalRecipeDSL.g:710:2: rule__Instructions__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__5"


    // $ANTLR start "rule__Instructions__Group__5__Impl"
    // InternalRecipeDSL.g:716:1: rule__Instructions__Group__5__Impl : ( '}' ) ;
    public final void rule__Instructions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:720:1: ( ( '}' ) )
            // InternalRecipeDSL.g:721:1: ( '}' )
            {
            // InternalRecipeDSL.g:721:1: ( '}' )
            // InternalRecipeDSL.g:722:2: '}'
            {
             before(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__5__Impl"


    // $ANTLR start "rule__Ingredients__Group__0"
    // InternalRecipeDSL.g:732:1: rule__Ingredients__Group__0 : rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 ;
    public final void rule__Ingredients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:736:1: ( rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 )
            // InternalRecipeDSL.g:737:2: rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecipeDSL.g:744:1: rule__Ingredients__Group__0__Impl : ( () ) ;
    public final void rule__Ingredients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:748:1: ( ( () ) )
            // InternalRecipeDSL.g:749:1: ( () )
            {
            // InternalRecipeDSL.g:749:1: ( () )
            // InternalRecipeDSL.g:750:2: ()
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsAction_0()); 
            // InternalRecipeDSL.g:751:2: ()
            // InternalRecipeDSL.g:751:3: 
            {
            }

             after(grammarAccess.getIngredientsAccess().getIngredientsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__0__Impl"


    // $ANTLR start "rule__Ingredients__Group__1"
    // InternalRecipeDSL.g:759:1: rule__Ingredients__Group__1 : rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 ;
    public final void rule__Ingredients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:763:1: ( rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 )
            // InternalRecipeDSL.g:764:2: rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:771:1: rule__Ingredients__Group__1__Impl : ( 'Ingredients' ) ;
    public final void rule__Ingredients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:775:1: ( ( 'Ingredients' ) )
            // InternalRecipeDSL.g:776:1: ( 'Ingredients' )
            {
            // InternalRecipeDSL.g:776:1: ( 'Ingredients' )
            // InternalRecipeDSL.g:777:2: 'Ingredients'
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getIngredientsKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:786:1: rule__Ingredients__Group__2 : rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 ;
    public final void rule__Ingredients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:790:1: ( rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 )
            // InternalRecipeDSL.g:791:2: rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRecipeDSL.g:798:1: rule__Ingredients__Group__2__Impl : ( '{' ) ;
    public final void rule__Ingredients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:802:1: ( ( '{' ) )
            // InternalRecipeDSL.g:803:1: ( '{' )
            {
            // InternalRecipeDSL.g:803:1: ( '{' )
            // InternalRecipeDSL.g:804:2: '{'
            {
             before(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:813:1: rule__Ingredients__Group__3 : rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 ;
    public final void rule__Ingredients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:817:1: ( rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 )
            // InternalRecipeDSL.g:818:2: rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalRecipeDSL.g:825:1: rule__Ingredients__Group__3__Impl : ( ( rule__Ingredients__UnorderedGroup_3 ) ) ;
    public final void rule__Ingredients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:829:1: ( ( ( rule__Ingredients__UnorderedGroup_3 ) ) )
            // InternalRecipeDSL.g:830:1: ( ( rule__Ingredients__UnorderedGroup_3 ) )
            {
            // InternalRecipeDSL.g:830:1: ( ( rule__Ingredients__UnorderedGroup_3 ) )
            // InternalRecipeDSL.g:831:2: ( rule__Ingredients__UnorderedGroup_3 )
            {
             before(grammarAccess.getIngredientsAccess().getUnorderedGroup_3()); 
            // InternalRecipeDSL.g:832:2: ( rule__Ingredients__UnorderedGroup_3 )
            // InternalRecipeDSL.g:832:3: rule__Ingredients__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getUnorderedGroup_3()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:840:1: rule__Ingredients__Group__4 : rule__Ingredients__Group__4__Impl ;
    public final void rule__Ingredients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:844:1: ( rule__Ingredients__Group__4__Impl )
            // InternalRecipeDSL.g:845:2: rule__Ingredients__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:851:1: rule__Ingredients__Group__4__Impl : ( '}' ) ;
    public final void rule__Ingredients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:855:1: ( ( '}' ) )
            // InternalRecipeDSL.g:856:1: ( '}' )
            {
            // InternalRecipeDSL.g:856:1: ( '}' )
            // InternalRecipeDSL.g:857:2: '}'
            {
             before(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ingredients__Group_3_0__0"
    // InternalRecipeDSL.g:867:1: rule__Ingredients__Group_3_0__0 : rule__Ingredients__Group_3_0__0__Impl rule__Ingredients__Group_3_0__1 ;
    public final void rule__Ingredients__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:871:1: ( rule__Ingredients__Group_3_0__0__Impl rule__Ingredients__Group_3_0__1 )
            // InternalRecipeDSL.g:872:2: rule__Ingredients__Group_3_0__0__Impl rule__Ingredients__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Ingredients__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_3_0__0"


    // $ANTLR start "rule__Ingredients__Group_3_0__0__Impl"
    // InternalRecipeDSL.g:879:1: rule__Ingredients__Group_3_0__0__Impl : ( 'orderNumber' ) ;
    public final void rule__Ingredients__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:883:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:884:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:884:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:885:2: 'orderNumber'
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberKeyword_3_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getOrderNumberKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_3_0__0__Impl"


    // $ANTLR start "rule__Ingredients__Group_3_0__1"
    // InternalRecipeDSL.g:894:1: rule__Ingredients__Group_3_0__1 : rule__Ingredients__Group_3_0__1__Impl ;
    public final void rule__Ingredients__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:898:1: ( rule__Ingredients__Group_3_0__1__Impl )
            // InternalRecipeDSL.g:899:2: rule__Ingredients__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_3_0__1"


    // $ANTLR start "rule__Ingredients__Group_3_0__1__Impl"
    // InternalRecipeDSL.g:905:1: rule__Ingredients__Group_3_0__1__Impl : ( ( rule__Ingredients__OrderNumberAssignment_3_0_1 ) ) ;
    public final void rule__Ingredients__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:909:1: ( ( ( rule__Ingredients__OrderNumberAssignment_3_0_1 ) ) )
            // InternalRecipeDSL.g:910:1: ( ( rule__Ingredients__OrderNumberAssignment_3_0_1 ) )
            {
            // InternalRecipeDSL.g:910:1: ( ( rule__Ingredients__OrderNumberAssignment_3_0_1 ) )
            // InternalRecipeDSL.g:911:2: ( rule__Ingredients__OrderNumberAssignment_3_0_1 )
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberAssignment_3_0_1()); 
            // InternalRecipeDSL.g:912:2: ( rule__Ingredients__OrderNumberAssignment_3_0_1 )
            // InternalRecipeDSL.g:912:3: rule__Ingredients__OrderNumberAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__OrderNumberAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getOrderNumberAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group_3_0__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalRecipeDSL.g:921:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:925:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRecipeDSL.g:926:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRecipeDSL.g:933:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:937:1: ( ( () ) )
            // InternalRecipeDSL.g:938:1: ( () )
            {
            // InternalRecipeDSL.g:938:1: ( () )
            // InternalRecipeDSL.g:939:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalRecipeDSL.g:940:2: ()
            // InternalRecipeDSL.g:940:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalRecipeDSL.g:948:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:952:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalRecipeDSL.g:953:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:960:1: rule__Header__Group__1__Impl : ( 'Header' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:964:1: ( ( 'Header' ) )
            // InternalRecipeDSL.g:965:1: ( 'Header' )
            {
            // InternalRecipeDSL.g:965:1: ( 'Header' )
            // InternalRecipeDSL.g:966:2: 'Header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:975:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:979:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalRecipeDSL.g:980:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalRecipeDSL.g:987:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:991:1: ( ( '{' ) )
            // InternalRecipeDSL.g:992:1: ( '{' )
            {
            // InternalRecipeDSL.g:992:1: ( '{' )
            // InternalRecipeDSL.g:993:2: '{'
            {
             before(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1002:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1006:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalRecipeDSL.g:1007:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalRecipeDSL.g:1014:1: rule__Header__Group__3__Impl : ( ( rule__Header__UnorderedGroup_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1018:1: ( ( ( rule__Header__UnorderedGroup_3 ) ) )
            // InternalRecipeDSL.g:1019:1: ( ( rule__Header__UnorderedGroup_3 ) )
            {
            // InternalRecipeDSL.g:1019:1: ( ( rule__Header__UnorderedGroup_3 ) )
            // InternalRecipeDSL.g:1020:2: ( rule__Header__UnorderedGroup_3 )
            {
             before(grammarAccess.getHeaderAccess().getUnorderedGroup_3()); 
            // InternalRecipeDSL.g:1021:2: ( rule__Header__UnorderedGroup_3 )
            // InternalRecipeDSL.g:1021:3: rule__Header__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Header__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getUnorderedGroup_3()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1029:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1033:1: ( rule__Header__Group__4__Impl )
            // InternalRecipeDSL.g:1034:2: rule__Header__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:1040:1: rule__Header__Group__4__Impl : ( '}' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1044:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1045:1: ( '}' )
            {
            // InternalRecipeDSL.g:1045:1: ( '}' )
            // InternalRecipeDSL.g:1046:2: '}'
            {
             before(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Nutrients__Group__0"
    // InternalRecipeDSL.g:1056:1: rule__Nutrients__Group__0 : rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 ;
    public final void rule__Nutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1060:1: ( rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1 )
            // InternalRecipeDSL.g:1061:2: rule__Nutrients__Group__0__Impl rule__Nutrients__Group__1
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
    // InternalRecipeDSL.g:1068:1: rule__Nutrients__Group__0__Impl : ( () ) ;
    public final void rule__Nutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1072:1: ( ( () ) )
            // InternalRecipeDSL.g:1073:1: ( () )
            {
            // InternalRecipeDSL.g:1073:1: ( () )
            // InternalRecipeDSL.g:1074:2: ()
            {
             before(grammarAccess.getNutrientsAccess().getNutrientsAction_0()); 
            // InternalRecipeDSL.g:1075:2: ()
            // InternalRecipeDSL.g:1075:3: 
            {
            }

             after(grammarAccess.getNutrientsAccess().getNutrientsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group__0__Impl"


    // $ANTLR start "rule__Nutrients__Group__1"
    // InternalRecipeDSL.g:1083:1: rule__Nutrients__Group__1 : rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 ;
    public final void rule__Nutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1087:1: ( rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2 )
            // InternalRecipeDSL.g:1088:2: rule__Nutrients__Group__1__Impl rule__Nutrients__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:1095:1: rule__Nutrients__Group__1__Impl : ( 'Nutrients' ) ;
    public final void rule__Nutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1099:1: ( ( 'Nutrients' ) )
            // InternalRecipeDSL.g:1100:1: ( 'Nutrients' )
            {
            // InternalRecipeDSL.g:1100:1: ( 'Nutrients' )
            // InternalRecipeDSL.g:1101:2: 'Nutrients'
            {
             before(grammarAccess.getNutrientsAccess().getNutrientsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getNutrientsKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1110:1: rule__Nutrients__Group__2 : rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 ;
    public final void rule__Nutrients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1114:1: ( rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3 )
            // InternalRecipeDSL.g:1115:2: rule__Nutrients__Group__2__Impl rule__Nutrients__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRecipeDSL.g:1122:1: rule__Nutrients__Group__2__Impl : ( '{' ) ;
    public final void rule__Nutrients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1126:1: ( ( '{' ) )
            // InternalRecipeDSL.g:1127:1: ( '{' )
            {
            // InternalRecipeDSL.g:1127:1: ( '{' )
            // InternalRecipeDSL.g:1128:2: '{'
            {
             before(grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1137:1: rule__Nutrients__Group__3 : rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 ;
    public final void rule__Nutrients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1141:1: ( rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4 )
            // InternalRecipeDSL.g:1142:2: rule__Nutrients__Group__3__Impl rule__Nutrients__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalRecipeDSL.g:1149:1: rule__Nutrients__Group__3__Impl : ( ( rule__Nutrients__UnorderedGroup_3 ) ) ;
    public final void rule__Nutrients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1153:1: ( ( ( rule__Nutrients__UnorderedGroup_3 ) ) )
            // InternalRecipeDSL.g:1154:1: ( ( rule__Nutrients__UnorderedGroup_3 ) )
            {
            // InternalRecipeDSL.g:1154:1: ( ( rule__Nutrients__UnorderedGroup_3 ) )
            // InternalRecipeDSL.g:1155:2: ( rule__Nutrients__UnorderedGroup_3 )
            {
             before(grammarAccess.getNutrientsAccess().getUnorderedGroup_3()); 
            // InternalRecipeDSL.g:1156:2: ( rule__Nutrients__UnorderedGroup_3 )
            // InternalRecipeDSL.g:1156:3: rule__Nutrients__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getUnorderedGroup_3()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1164:1: rule__Nutrients__Group__4 : rule__Nutrients__Group__4__Impl ;
    public final void rule__Nutrients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1168:1: ( rule__Nutrients__Group__4__Impl )
            // InternalRecipeDSL.g:1169:2: rule__Nutrients__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:1175:1: rule__Nutrients__Group__4__Impl : ( '}' ) ;
    public final void rule__Nutrients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1179:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1180:1: ( '}' )
            {
            // InternalRecipeDSL.g:1180:1: ( '}' )
            // InternalRecipeDSL.g:1181:2: '}'
            {
             before(grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Nutrients__Group_3_0__0"
    // InternalRecipeDSL.g:1191:1: rule__Nutrients__Group_3_0__0 : rule__Nutrients__Group_3_0__0__Impl rule__Nutrients__Group_3_0__1 ;
    public final void rule__Nutrients__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1195:1: ( rule__Nutrients__Group_3_0__0__Impl rule__Nutrients__Group_3_0__1 )
            // InternalRecipeDSL.g:1196:2: rule__Nutrients__Group_3_0__0__Impl rule__Nutrients__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Nutrients__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_3_0__0"


    // $ANTLR start "rule__Nutrients__Group_3_0__0__Impl"
    // InternalRecipeDSL.g:1203:1: rule__Nutrients__Group_3_0__0__Impl : ( 'orderNumber' ) ;
    public final void rule__Nutrients__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1207:1: ( ( 'orderNumber' ) )
            // InternalRecipeDSL.g:1208:1: ( 'orderNumber' )
            {
            // InternalRecipeDSL.g:1208:1: ( 'orderNumber' )
            // InternalRecipeDSL.g:1209:2: 'orderNumber'
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberKeyword_3_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNutrientsAccess().getOrderNumberKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_3_0__0__Impl"


    // $ANTLR start "rule__Nutrients__Group_3_0__1"
    // InternalRecipeDSL.g:1218:1: rule__Nutrients__Group_3_0__1 : rule__Nutrients__Group_3_0__1__Impl ;
    public final void rule__Nutrients__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1222:1: ( rule__Nutrients__Group_3_0__1__Impl )
            // InternalRecipeDSL.g:1223:2: rule__Nutrients__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_3_0__1"


    // $ANTLR start "rule__Nutrients__Group_3_0__1__Impl"
    // InternalRecipeDSL.g:1229:1: rule__Nutrients__Group_3_0__1__Impl : ( ( rule__Nutrients__OrderNumberAssignment_3_0_1 ) ) ;
    public final void rule__Nutrients__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1233:1: ( ( ( rule__Nutrients__OrderNumberAssignment_3_0_1 ) ) )
            // InternalRecipeDSL.g:1234:1: ( ( rule__Nutrients__OrderNumberAssignment_3_0_1 ) )
            {
            // InternalRecipeDSL.g:1234:1: ( ( rule__Nutrients__OrderNumberAssignment_3_0_1 ) )
            // InternalRecipeDSL.g:1235:2: ( rule__Nutrients__OrderNumberAssignment_3_0_1 )
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberAssignment_3_0_1()); 
            // InternalRecipeDSL.g:1236:2: ( rule__Nutrients__OrderNumberAssignment_3_0_1 )
            // InternalRecipeDSL.g:1236:3: rule__Nutrients__OrderNumberAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__OrderNumberAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNutrientsAccess().getOrderNumberAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__Group_3_0__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRecipeDSL.g:1245:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1249:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRecipeDSL.g:1250:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecipeDSL.g:1257:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1261:1: ( ( ( '-' )? ) )
            // InternalRecipeDSL.g:1262:1: ( ( '-' )? )
            {
            // InternalRecipeDSL.g:1262:1: ( ( '-' )? )
            // InternalRecipeDSL.g:1263:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipeDSL.g:1264:2: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:1264:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalRecipeDSL.g:1272:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1276:1: ( rule__EInt__Group__1__Impl )
            // InternalRecipeDSL.g:1277:2: rule__EInt__Group__1__Impl
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
    // InternalRecipeDSL.g:1283:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1287:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1288:1: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1288:1: ( RULE_INT )
            // InternalRecipeDSL.g:1289:2: RULE_INT
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
    // InternalRecipeDSL.g:1299:1: rule__UnitOfMeasure__Group__0 : rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 ;
    public final void rule__UnitOfMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1303:1: ( rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1 )
            // InternalRecipeDSL.g:1304:2: rule__UnitOfMeasure__Group__0__Impl rule__UnitOfMeasure__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRecipeDSL.g:1311:1: rule__UnitOfMeasure__Group__0__Impl : ( () ) ;
    public final void rule__UnitOfMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1315:1: ( ( () ) )
            // InternalRecipeDSL.g:1316:1: ( () )
            {
            // InternalRecipeDSL.g:1316:1: ( () )
            // InternalRecipeDSL.g:1317:2: ()
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleAction_0()); 
            // InternalRecipeDSL.g:1318:2: ()
            // InternalRecipeDSL.g:1318:3: 
            {
            }

             after(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleAction_0()); 

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
    // InternalRecipeDSL.g:1326:1: rule__UnitOfMeasure__Group__1 : rule__UnitOfMeasure__Group__1__Impl ;
    public final void rule__UnitOfMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1330:1: ( rule__UnitOfMeasure__Group__1__Impl )
            // InternalRecipeDSL.g:1331:2: rule__UnitOfMeasure__Group__1__Impl
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
    // InternalRecipeDSL.g:1337:1: rule__UnitOfMeasure__Group__1__Impl : ( 'UnitOfMeasureToggle' ) ;
    public final void rule__UnitOfMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1341:1: ( ( 'UnitOfMeasureToggle' ) )
            // InternalRecipeDSL.g:1342:1: ( 'UnitOfMeasureToggle' )
            {
            // InternalRecipeDSL.g:1342:1: ( 'UnitOfMeasureToggle' )
            // InternalRecipeDSL.g:1343:2: 'UnitOfMeasureToggle'
            {
             before(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1353:1: rule__BasicInformation__Group__0 : rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 ;
    public final void rule__BasicInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1357:1: ( rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1 )
            // InternalRecipeDSL.g:1358:2: rule__BasicInformation__Group__0__Impl rule__BasicInformation__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRecipeDSL.g:1365:1: rule__BasicInformation__Group__0__Impl : ( () ) ;
    public final void rule__BasicInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1369:1: ( ( () ) )
            // InternalRecipeDSL.g:1370:1: ( () )
            {
            // InternalRecipeDSL.g:1370:1: ( () )
            // InternalRecipeDSL.g:1371:2: ()
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationAction_0()); 
            // InternalRecipeDSL.g:1372:2: ()
            // InternalRecipeDSL.g:1372:3: 
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
    // InternalRecipeDSL.g:1380:1: rule__BasicInformation__Group__1 : rule__BasicInformation__Group__1__Impl ;
    public final void rule__BasicInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1384:1: ( rule__BasicInformation__Group__1__Impl )
            // InternalRecipeDSL.g:1385:2: rule__BasicInformation__Group__1__Impl
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
    // InternalRecipeDSL.g:1391:1: rule__BasicInformation__Group__1__Impl : ( 'BasicInformation' ) ;
    public final void rule__BasicInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1395:1: ( ( 'BasicInformation' ) )
            // InternalRecipeDSL.g:1396:1: ( 'BasicInformation' )
            {
            // InternalRecipeDSL.g:1396:1: ( 'BasicInformation' )
            // InternalRecipeDSL.g:1397:2: 'BasicInformation'
            {
             before(grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1407:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1411:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalRecipeDSL.g:1412:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecipeDSL.g:1419:1: rule__Title__Group__0__Impl : ( () ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1423:1: ( ( () ) )
            // InternalRecipeDSL.g:1424:1: ( () )
            {
            // InternalRecipeDSL.g:1424:1: ( () )
            // InternalRecipeDSL.g:1425:2: ()
            {
             before(grammarAccess.getTitleAccess().getTitleAction_0()); 
            // InternalRecipeDSL.g:1426:2: ()
            // InternalRecipeDSL.g:1426:3: 
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
    // InternalRecipeDSL.g:1434:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1438:1: ( rule__Title__Group__1__Impl )
            // InternalRecipeDSL.g:1439:2: rule__Title__Group__1__Impl
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
    // InternalRecipeDSL.g:1445:1: rule__Title__Group__1__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1449:1: ( ( 'Title' ) )
            // InternalRecipeDSL.g:1450:1: ( 'Title' )
            {
            // InternalRecipeDSL.g:1450:1: ( 'Title' )
            // InternalRecipeDSL.g:1451:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1461:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1465:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalRecipeDSL.g:1466:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRecipeDSL.g:1473:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1477:1: ( ( () ) )
            // InternalRecipeDSL.g:1478:1: ( () )
            {
            // InternalRecipeDSL.g:1478:1: ( () )
            // InternalRecipeDSL.g:1479:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalRecipeDSL.g:1480:2: ()
            // InternalRecipeDSL.g:1480:3: 
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
    // InternalRecipeDSL.g:1488:1: rule__Image__Group__1 : rule__Image__Group__1__Impl ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1492:1: ( rule__Image__Group__1__Impl )
            // InternalRecipeDSL.g:1493:2: rule__Image__Group__1__Impl
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
    // InternalRecipeDSL.g:1499:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1503:1: ( ( 'Image' ) )
            // InternalRecipeDSL.g:1504:1: ( 'Image' )
            {
            // InternalRecipeDSL.g:1504:1: ( 'Image' )
            // InternalRecipeDSL.g:1505:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1515:1: rule__PercentageAmountToggle__Group__0 : rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 ;
    public final void rule__PercentageAmountToggle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1519:1: ( rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1 )
            // InternalRecipeDSL.g:1520:2: rule__PercentageAmountToggle__Group__0__Impl rule__PercentageAmountToggle__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipeDSL.g:1527:1: rule__PercentageAmountToggle__Group__0__Impl : ( () ) ;
    public final void rule__PercentageAmountToggle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1531:1: ( ( () ) )
            // InternalRecipeDSL.g:1532:1: ( () )
            {
            // InternalRecipeDSL.g:1532:1: ( () )
            // InternalRecipeDSL.g:1533:2: ()
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0()); 
            // InternalRecipeDSL.g:1534:2: ()
            // InternalRecipeDSL.g:1534:3: 
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
    // InternalRecipeDSL.g:1542:1: rule__PercentageAmountToggle__Group__1 : rule__PercentageAmountToggle__Group__1__Impl ;
    public final void rule__PercentageAmountToggle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1546:1: ( rule__PercentageAmountToggle__Group__1__Impl )
            // InternalRecipeDSL.g:1547:2: rule__PercentageAmountToggle__Group__1__Impl
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
    // InternalRecipeDSL.g:1553:1: rule__PercentageAmountToggle__Group__1__Impl : ( 'PercentageAmountToggle' ) ;
    public final void rule__PercentageAmountToggle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1557:1: ( ( 'PercentageAmountToggle' ) )
            // InternalRecipeDSL.g:1558:1: ( 'PercentageAmountToggle' )
            {
            // InternalRecipeDSL.g:1558:1: ( 'PercentageAmountToggle' )
            // InternalRecipeDSL.g:1559:2: 'PercentageAmountToggle'
            {
             before(grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1569:1: rule__Vitamins__Group__0 : rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 ;
    public final void rule__Vitamins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1573:1: ( rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1 )
            // InternalRecipeDSL.g:1574:2: rule__Vitamins__Group__0__Impl rule__Vitamins__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecipeDSL.g:1581:1: rule__Vitamins__Group__0__Impl : ( () ) ;
    public final void rule__Vitamins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1585:1: ( ( () ) )
            // InternalRecipeDSL.g:1586:1: ( () )
            {
            // InternalRecipeDSL.g:1586:1: ( () )
            // InternalRecipeDSL.g:1587:2: ()
            {
             before(grammarAccess.getVitaminsAccess().getVitaminsAction_0()); 
            // InternalRecipeDSL.g:1588:2: ()
            // InternalRecipeDSL.g:1588:3: 
            {
            }

             after(grammarAccess.getVitaminsAccess().getVitaminsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group__0__Impl"


    // $ANTLR start "rule__Vitamins__Group__1"
    // InternalRecipeDSL.g:1596:1: rule__Vitamins__Group__1 : rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 ;
    public final void rule__Vitamins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1600:1: ( rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2 )
            // InternalRecipeDSL.g:1601:2: rule__Vitamins__Group__1__Impl rule__Vitamins__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:1608:1: rule__Vitamins__Group__1__Impl : ( 'Vitamins' ) ;
    public final void rule__Vitamins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1612:1: ( ( 'Vitamins' ) )
            // InternalRecipeDSL.g:1613:1: ( 'Vitamins' )
            {
            // InternalRecipeDSL.g:1613:1: ( 'Vitamins' )
            // InternalRecipeDSL.g:1614:2: 'Vitamins'
            {
             before(grammarAccess.getVitaminsAccess().getVitaminsKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getVitaminsKeyword_1()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1623:1: rule__Vitamins__Group__2 : rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 ;
    public final void rule__Vitamins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1627:1: ( rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3 )
            // InternalRecipeDSL.g:1628:2: rule__Vitamins__Group__2__Impl rule__Vitamins__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecipeDSL.g:1635:1: rule__Vitamins__Group__2__Impl : ( '{' ) ;
    public final void rule__Vitamins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1639:1: ( ( '{' ) )
            // InternalRecipeDSL.g:1640:1: ( '{' )
            {
            // InternalRecipeDSL.g:1640:1: ( '{' )
            // InternalRecipeDSL.g:1641:2: '{'
            {
             before(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1650:1: rule__Vitamins__Group__3 : rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 ;
    public final void rule__Vitamins__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1654:1: ( rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4 )
            // InternalRecipeDSL.g:1655:2: rule__Vitamins__Group__3__Impl rule__Vitamins__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalRecipeDSL.g:1662:1: rule__Vitamins__Group__3__Impl : ( ( rule__Vitamins__VitaminAssignment_3 ) ) ;
    public final void rule__Vitamins__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1666:1: ( ( ( rule__Vitamins__VitaminAssignment_3 ) ) )
            // InternalRecipeDSL.g:1667:1: ( ( rule__Vitamins__VitaminAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1667:1: ( ( rule__Vitamins__VitaminAssignment_3 ) )
            // InternalRecipeDSL.g:1668:2: ( rule__Vitamins__VitaminAssignment_3 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_3()); 
            // InternalRecipeDSL.g:1669:2: ( rule__Vitamins__VitaminAssignment_3 )
            // InternalRecipeDSL.g:1669:3: rule__Vitamins__VitaminAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__VitaminAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVitaminsAccess().getVitaminAssignment_3()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1677:1: rule__Vitamins__Group__4 : rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 ;
    public final void rule__Vitamins__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1681:1: ( rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5 )
            // InternalRecipeDSL.g:1682:2: rule__Vitamins__Group__4__Impl rule__Vitamins__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalRecipeDSL.g:1689:1: rule__Vitamins__Group__4__Impl : ( ( rule__Vitamins__Group_4__0 )* ) ;
    public final void rule__Vitamins__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1693:1: ( ( ( rule__Vitamins__Group_4__0 )* ) )
            // InternalRecipeDSL.g:1694:1: ( ( rule__Vitamins__Group_4__0 )* )
            {
            // InternalRecipeDSL.g:1694:1: ( ( rule__Vitamins__Group_4__0 )* )
            // InternalRecipeDSL.g:1695:2: ( rule__Vitamins__Group_4__0 )*
            {
             before(grammarAccess.getVitaminsAccess().getGroup_4()); 
            // InternalRecipeDSL.g:1696:2: ( rule__Vitamins__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:1696:3: rule__Vitamins__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Vitamins__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getVitaminsAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalRecipeDSL.g:1704:1: rule__Vitamins__Group__5 : rule__Vitamins__Group__5__Impl ;
    public final void rule__Vitamins__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1708:1: ( rule__Vitamins__Group__5__Impl )
            // InternalRecipeDSL.g:1709:2: rule__Vitamins__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalRecipeDSL.g:1715:1: rule__Vitamins__Group__5__Impl : ( '}' ) ;
    public final void rule__Vitamins__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1719:1: ( ( '}' ) )
            // InternalRecipeDSL.g:1720:1: ( '}' )
            {
            // InternalRecipeDSL.g:1720:1: ( '}' )
            // InternalRecipeDSL.g:1721:2: '}'
            {
             before(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Vitamins__Group_4__0"
    // InternalRecipeDSL.g:1731:1: rule__Vitamins__Group_4__0 : rule__Vitamins__Group_4__0__Impl rule__Vitamins__Group_4__1 ;
    public final void rule__Vitamins__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1735:1: ( rule__Vitamins__Group_4__0__Impl rule__Vitamins__Group_4__1 )
            // InternalRecipeDSL.g:1736:2: rule__Vitamins__Group_4__0__Impl rule__Vitamins__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Vitamins__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vitamins__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_4__0"


    // $ANTLR start "rule__Vitamins__Group_4__0__Impl"
    // InternalRecipeDSL.g:1743:1: rule__Vitamins__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Vitamins__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1747:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1748:1: ( ',' )
            {
            // InternalRecipeDSL.g:1748:1: ( ',' )
            // InternalRecipeDSL.g:1749:2: ','
            {
             before(grammarAccess.getVitaminsAccess().getCommaKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVitaminsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_4__0__Impl"


    // $ANTLR start "rule__Vitamins__Group_4__1"
    // InternalRecipeDSL.g:1758:1: rule__Vitamins__Group_4__1 : rule__Vitamins__Group_4__1__Impl ;
    public final void rule__Vitamins__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1762:1: ( rule__Vitamins__Group_4__1__Impl )
            // InternalRecipeDSL.g:1763:2: rule__Vitamins__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_4__1"


    // $ANTLR start "rule__Vitamins__Group_4__1__Impl"
    // InternalRecipeDSL.g:1769:1: rule__Vitamins__Group_4__1__Impl : ( ( rule__Vitamins__VitaminAssignment_4_1 ) ) ;
    public final void rule__Vitamins__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1773:1: ( ( ( rule__Vitamins__VitaminAssignment_4_1 ) ) )
            // InternalRecipeDSL.g:1774:1: ( ( rule__Vitamins__VitaminAssignment_4_1 ) )
            {
            // InternalRecipeDSL.g:1774:1: ( ( rule__Vitamins__VitaminAssignment_4_1 ) )
            // InternalRecipeDSL.g:1775:2: ( rule__Vitamins__VitaminAssignment_4_1 )
            {
             before(grammarAccess.getVitaminsAccess().getVitaminAssignment_4_1()); 
            // InternalRecipeDSL.g:1776:2: ( rule__Vitamins__VitaminAssignment_4_1 )
            // InternalRecipeDSL.g:1776:3: rule__Vitamins__VitaminAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Vitamins__VitaminAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVitaminsAccess().getVitaminAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__Group_4__1__Impl"


    // $ANTLR start "rule__Macronutrients__Group__0"
    // InternalRecipeDSL.g:1785:1: rule__Macronutrients__Group__0 : rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 ;
    public final void rule__Macronutrients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1789:1: ( rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1 )
            // InternalRecipeDSL.g:1790:2: rule__Macronutrients__Group__0__Impl rule__Macronutrients__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRecipeDSL.g:1797:1: rule__Macronutrients__Group__0__Impl : ( () ) ;
    public final void rule__Macronutrients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1801:1: ( ( () ) )
            // InternalRecipeDSL.g:1802:1: ( () )
            {
            // InternalRecipeDSL.g:1802:1: ( () )
            // InternalRecipeDSL.g:1803:2: ()
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0()); 
            // InternalRecipeDSL.g:1804:2: ()
            // InternalRecipeDSL.g:1804:3: 
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
    // InternalRecipeDSL.g:1812:1: rule__Macronutrients__Group__1 : rule__Macronutrients__Group__1__Impl ;
    public final void rule__Macronutrients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1816:1: ( rule__Macronutrients__Group__1__Impl )
            // InternalRecipeDSL.g:1817:2: rule__Macronutrients__Group__1__Impl
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
    // InternalRecipeDSL.g:1823:1: rule__Macronutrients__Group__1__Impl : ( 'Macronutrients' ) ;
    public final void rule__Macronutrients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1827:1: ( ( 'Macronutrients' ) )
            // InternalRecipeDSL.g:1828:1: ( 'Macronutrients' )
            {
            // InternalRecipeDSL.g:1828:1: ( 'Macronutrients' )
            // InternalRecipeDSL.g:1829:2: 'Macronutrients'
            {
             before(grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Page__UnorderedGroup_2"
    // InternalRecipeDSL.g:1839:1: rule__Page__UnorderedGroup_2 : rule__Page__UnorderedGroup_2__0 {...}?;
    public final void rule__Page__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_2());
        	
        try {
            // InternalRecipeDSL.g:1844:1: ( rule__Page__UnorderedGroup_2__0 {...}?)
            // InternalRecipeDSL.g:1845:2: rule__Page__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Page__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2"


    // $ANTLR start "rule__Page__UnorderedGroup_2__Impl"
    // InternalRecipeDSL.g:1853:1: rule__Page__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) ) ) ;
    public final void rule__Page__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRecipeDSL.g:1858:1: ( ( ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) ) ) )
            // InternalRecipeDSL.g:1859:3: ( ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) ) )
            {
            // InternalRecipeDSL.g:1859:3: ( ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                alt4=2;
            }
            else if ( LA4_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                alt4=3;
            }
            else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipeDSL.g:1860:3: ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) )
                    {
                    // InternalRecipeDSL.g:1860:3: ({...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) ) )
                    // InternalRecipeDSL.g:1861:4: {...}? => ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalRecipeDSL.g:1861:100: ( ( ( rule__Page__InstructionsAssignment_2_0 ) ) )
                    // InternalRecipeDSL.g:1862:5: ( ( rule__Page__InstructionsAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:1868:5: ( ( rule__Page__InstructionsAssignment_2_0 ) )
                    // InternalRecipeDSL.g:1869:6: ( rule__Page__InstructionsAssignment_2_0 )
                    {
                     before(grammarAccess.getPageAccess().getInstructionsAssignment_2_0()); 
                    // InternalRecipeDSL.g:1870:6: ( rule__Page__InstructionsAssignment_2_0 )
                    // InternalRecipeDSL.g:1870:7: rule__Page__InstructionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__InstructionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getInstructionsAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:1875:3: ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) )
                    {
                    // InternalRecipeDSL.g:1875:3: ({...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) ) )
                    // InternalRecipeDSL.g:1876:4: {...}? => ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalRecipeDSL.g:1876:100: ( ( ( rule__Page__IngredientsAssignment_2_1 ) ) )
                    // InternalRecipeDSL.g:1877:5: ( ( rule__Page__IngredientsAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:1883:5: ( ( rule__Page__IngredientsAssignment_2_1 ) )
                    // InternalRecipeDSL.g:1884:6: ( rule__Page__IngredientsAssignment_2_1 )
                    {
                     before(grammarAccess.getPageAccess().getIngredientsAssignment_2_1()); 
                    // InternalRecipeDSL.g:1885:6: ( rule__Page__IngredientsAssignment_2_1 )
                    // InternalRecipeDSL.g:1885:7: rule__Page__IngredientsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__IngredientsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getIngredientsAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:1890:3: ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) )
                    {
                    // InternalRecipeDSL.g:1890:3: ({...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) ) )
                    // InternalRecipeDSL.g:1891:4: {...}? => ( ( ( rule__Page__HeaderAssignment_2_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalRecipeDSL.g:1891:100: ( ( ( rule__Page__HeaderAssignment_2_2 ) ) )
                    // InternalRecipeDSL.g:1892:5: ( ( rule__Page__HeaderAssignment_2_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:1898:5: ( ( rule__Page__HeaderAssignment_2_2 ) )
                    // InternalRecipeDSL.g:1899:6: ( rule__Page__HeaderAssignment_2_2 )
                    {
                     before(grammarAccess.getPageAccess().getHeaderAssignment_2_2()); 
                    // InternalRecipeDSL.g:1900:6: ( rule__Page__HeaderAssignment_2_2 )
                    // InternalRecipeDSL.g:1900:7: rule__Page__HeaderAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__HeaderAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getHeaderAssignment_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:1905:3: ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) )
                    {
                    // InternalRecipeDSL.g:1905:3: ({...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) ) )
                    // InternalRecipeDSL.g:1906:4: {...}? => ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalRecipeDSL.g:1906:100: ( ( ( rule__Page__NutrientsAssignment_2_3 ) ) )
                    // InternalRecipeDSL.g:1907:5: ( ( rule__Page__NutrientsAssignment_2_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:1913:5: ( ( rule__Page__NutrientsAssignment_2_3 ) )
                    // InternalRecipeDSL.g:1914:6: ( rule__Page__NutrientsAssignment_2_3 )
                    {
                     before(grammarAccess.getPageAccess().getNutrientsAssignment_2_3()); 
                    // InternalRecipeDSL.g:1915:6: ( rule__Page__NutrientsAssignment_2_3 )
                    // InternalRecipeDSL.g:1915:7: rule__Page__NutrientsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__NutrientsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getNutrientsAssignment_2_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Page__UnorderedGroup_2__0"
    // InternalRecipeDSL.g:1928:1: rule__Page__UnorderedGroup_2__0 : rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__1 )? ;
    public final void rule__Page__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1932:1: ( rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__1 )? )
            // InternalRecipeDSL.g:1933:2: rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_21);
            rule__Page__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:1934:2: ( rule__Page__UnorderedGroup_2__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                alt5=1;
            }
            else if ( LA5_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeDSL.g:1934:2: rule__Page__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2__0"


    // $ANTLR start "rule__Page__UnorderedGroup_2__1"
    // InternalRecipeDSL.g:1940:1: rule__Page__UnorderedGroup_2__1 : rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__2 )? ;
    public final void rule__Page__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1944:1: ( rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__2 )? )
            // InternalRecipeDSL.g:1945:2: rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_21);
            rule__Page__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:1946:2: ( rule__Page__UnorderedGroup_2__2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                alt6=1;
            }
            else if ( LA6_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeDSL.g:1946:2: rule__Page__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2__1"


    // $ANTLR start "rule__Page__UnorderedGroup_2__2"
    // InternalRecipeDSL.g:1952:1: rule__Page__UnorderedGroup_2__2 : rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__3 )? ;
    public final void rule__Page__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1956:1: ( rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__3 )? )
            // InternalRecipeDSL.g:1957:2: rule__Page__UnorderedGroup_2__Impl ( rule__Page__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_21);
            rule__Page__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:1958:2: ( rule__Page__UnorderedGroup_2__3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                alt7=1;
            }
            else if ( LA7_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipeDSL.g:1958:2: rule__Page__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__UnorderedGroup_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2__2"


    // $ANTLR start "rule__Page__UnorderedGroup_2__3"
    // InternalRecipeDSL.g:1964:1: rule__Page__UnorderedGroup_2__3 : rule__Page__UnorderedGroup_2__Impl ;
    public final void rule__Page__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1968:1: ( rule__Page__UnorderedGroup_2__Impl )
            // InternalRecipeDSL.g:1969:2: rule__Page__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_2__3"


    // $ANTLR start "rule__Ingredients__UnorderedGroup_3"
    // InternalRecipeDSL.g:1976:1: rule__Ingredients__UnorderedGroup_3 : rule__Ingredients__UnorderedGroup_3__0 {...}?;
    public final void rule__Ingredients__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRecipeDSL.g:1981:1: ( rule__Ingredients__UnorderedGroup_3__0 {...}?)
            // InternalRecipeDSL.g:1982:2: rule__Ingredients__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Ingredients__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnorderedGroup_3"


    // $ANTLR start "rule__Ingredients__UnorderedGroup_3__Impl"
    // InternalRecipeDSL.g:1990:1: rule__Ingredients__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) ) ) ;
    public final void rule__Ingredients__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRecipeDSL.g:1995:1: ( ( ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) ) ) )
            // InternalRecipeDSL.g:1996:3: ( ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) ) )
            {
            // InternalRecipeDSL.g:1996:3: ( ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipeDSL.g:1997:3: ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) )
                    {
                    // InternalRecipeDSL.g:1997:3: ({...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) ) )
                    // InternalRecipeDSL.g:1998:4: {...}? => ( ( ( rule__Ingredients__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Ingredients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRecipeDSL.g:1998:107: ( ( ( rule__Ingredients__Group_3_0__0 ) ) )
                    // InternalRecipeDSL.g:1999:5: ( ( rule__Ingredients__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2005:5: ( ( rule__Ingredients__Group_3_0__0 ) )
                    // InternalRecipeDSL.g:2006:6: ( rule__Ingredients__Group_3_0__0 )
                    {
                     before(grammarAccess.getIngredientsAccess().getGroup_3_0()); 
                    // InternalRecipeDSL.g:2007:6: ( rule__Ingredients__Group_3_0__0 )
                    // InternalRecipeDSL.g:2007:7: rule__Ingredients__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredients__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientsAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:2012:3: ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2012:3: ({...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) ) )
                    // InternalRecipeDSL.g:2013:4: {...}? => ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Ingredients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRecipeDSL.g:2013:107: ( ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) ) )
                    // InternalRecipeDSL.g:2014:5: ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2020:5: ( ( rule__Ingredients__UnittoggleAssignment_3_1 ) )
                    // InternalRecipeDSL.g:2021:6: ( rule__Ingredients__UnittoggleAssignment_3_1 )
                    {
                     before(grammarAccess.getIngredientsAccess().getUnittoggleAssignment_3_1()); 
                    // InternalRecipeDSL.g:2022:6: ( rule__Ingredients__UnittoggleAssignment_3_1 )
                    // InternalRecipeDSL.g:2022:7: rule__Ingredients__UnittoggleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredients__UnittoggleAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientsAccess().getUnittoggleAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Ingredients__UnorderedGroup_3__0"
    // InternalRecipeDSL.g:2035:1: rule__Ingredients__UnorderedGroup_3__0 : rule__Ingredients__UnorderedGroup_3__Impl ( rule__Ingredients__UnorderedGroup_3__1 )? ;
    public final void rule__Ingredients__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2039:1: ( rule__Ingredients__UnorderedGroup_3__Impl ( rule__Ingredients__UnorderedGroup_3__1 )? )
            // InternalRecipeDSL.g:2040:2: rule__Ingredients__UnorderedGroup_3__Impl ( rule__Ingredients__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__Ingredients__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2041:2: ( rule__Ingredients__UnorderedGroup_3__1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipeDSL.g:2041:2: rule__Ingredients__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredients__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnorderedGroup_3__0"


    // $ANTLR start "rule__Ingredients__UnorderedGroup_3__1"
    // InternalRecipeDSL.g:2047:1: rule__Ingredients__UnorderedGroup_3__1 : rule__Ingredients__UnorderedGroup_3__Impl ;
    public final void rule__Ingredients__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2051:1: ( rule__Ingredients__UnorderedGroup_3__Impl )
            // InternalRecipeDSL.g:2052:2: rule__Ingredients__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnorderedGroup_3__1"


    // $ANTLR start "rule__Header__UnorderedGroup_3"
    // InternalRecipeDSL.g:2059:1: rule__Header__UnorderedGroup_3 : rule__Header__UnorderedGroup_3__0 {...}?;
    public final void rule__Header__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRecipeDSL.g:2064:1: ( rule__Header__UnorderedGroup_3__0 {...}?)
            // InternalRecipeDSL.g:2065:2: rule__Header__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Header__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Header__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__UnorderedGroup_3"


    // $ANTLR start "rule__Header__UnorderedGroup_3__Impl"
    // InternalRecipeDSL.g:2073:1: rule__Header__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) ) ) ;
    public final void rule__Header__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRecipeDSL.g:2078:1: ( ( ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) ) ) )
            // InternalRecipeDSL.g:2079:3: ( ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) ) )
            {
            // InternalRecipeDSL.g:2079:3: ( ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else if ( LA10_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRecipeDSL.g:2080:3: ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2080:3: ({...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) ) )
                    // InternalRecipeDSL.g:2081:4: {...}? => ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Header__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRecipeDSL.g:2081:102: ( ( ( rule__Header__BasicinformationAssignment_3_0 ) ) )
                    // InternalRecipeDSL.g:2082:5: ( ( rule__Header__BasicinformationAssignment_3_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2088:5: ( ( rule__Header__BasicinformationAssignment_3_0 ) )
                    // InternalRecipeDSL.g:2089:6: ( rule__Header__BasicinformationAssignment_3_0 )
                    {
                     before(grammarAccess.getHeaderAccess().getBasicinformationAssignment_3_0()); 
                    // InternalRecipeDSL.g:2090:6: ( rule__Header__BasicinformationAssignment_3_0 )
                    // InternalRecipeDSL.g:2090:7: rule__Header__BasicinformationAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__BasicinformationAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderAccess().getBasicinformationAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:2095:3: ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2095:3: ({...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) ) )
                    // InternalRecipeDSL.g:2096:4: {...}? => ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Header__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRecipeDSL.g:2096:102: ( ( ( rule__Header__RecipetitleAssignment_3_1 ) ) )
                    // InternalRecipeDSL.g:2097:5: ( ( rule__Header__RecipetitleAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2103:5: ( ( rule__Header__RecipetitleAssignment_3_1 ) )
                    // InternalRecipeDSL.g:2104:6: ( rule__Header__RecipetitleAssignment_3_1 )
                    {
                     before(grammarAccess.getHeaderAccess().getRecipetitleAssignment_3_1()); 
                    // InternalRecipeDSL.g:2105:6: ( rule__Header__RecipetitleAssignment_3_1 )
                    // InternalRecipeDSL.g:2105:7: rule__Header__RecipetitleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__RecipetitleAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderAccess().getRecipetitleAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:2110:3: ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2110:3: ({...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) ) )
                    // InternalRecipeDSL.g:2111:4: {...}? => ( ( ( rule__Header__ImageAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Header__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRecipeDSL.g:2111:102: ( ( ( rule__Header__ImageAssignment_3_2 ) ) )
                    // InternalRecipeDSL.g:2112:5: ( ( rule__Header__ImageAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2118:5: ( ( rule__Header__ImageAssignment_3_2 ) )
                    // InternalRecipeDSL.g:2119:6: ( rule__Header__ImageAssignment_3_2 )
                    {
                     before(grammarAccess.getHeaderAccess().getImageAssignment_3_2()); 
                    // InternalRecipeDSL.g:2120:6: ( rule__Header__ImageAssignment_3_2 )
                    // InternalRecipeDSL.g:2120:7: rule__Header__ImageAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__ImageAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderAccess().getImageAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Header__UnorderedGroup_3__0"
    // InternalRecipeDSL.g:2133:1: rule__Header__UnorderedGroup_3__0 : rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__1 )? ;
    public final void rule__Header__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2137:1: ( rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__1 )? )
            // InternalRecipeDSL.g:2138:2: rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_23);
            rule__Header__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2139:2: ( rule__Header__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRecipeDSL.g:2139:2: rule__Header__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__UnorderedGroup_3__0"


    // $ANTLR start "rule__Header__UnorderedGroup_3__1"
    // InternalRecipeDSL.g:2145:1: rule__Header__UnorderedGroup_3__1 : rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__2 )? ;
    public final void rule__Header__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2149:1: ( rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__2 )? )
            // InternalRecipeDSL.g:2150:2: rule__Header__UnorderedGroup_3__Impl ( rule__Header__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_23);
            rule__Header__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2151:2: ( rule__Header__UnorderedGroup_3__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecipeDSL.g:2151:2: rule__Header__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Header__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__UnorderedGroup_3__1"


    // $ANTLR start "rule__Header__UnorderedGroup_3__2"
    // InternalRecipeDSL.g:2157:1: rule__Header__UnorderedGroup_3__2 : rule__Header__UnorderedGroup_3__Impl ;
    public final void rule__Header__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2161:1: ( rule__Header__UnorderedGroup_3__Impl )
            // InternalRecipeDSL.g:2162:2: rule__Header__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__UnorderedGroup_3__2"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3"
    // InternalRecipeDSL.g:2169:1: rule__Nutrients__UnorderedGroup_3 : rule__Nutrients__UnorderedGroup_3__0 {...}?;
    public final void rule__Nutrients__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRecipeDSL.g:2174:1: ( rule__Nutrients__UnorderedGroup_3__0 {...}?)
            // InternalRecipeDSL.g:2175:2: rule__Nutrients__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Nutrients__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3__Impl"
    // InternalRecipeDSL.g:2183:1: rule__Nutrients__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) ) ) ;
    public final void rule__Nutrients__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRecipeDSL.g:2188:1: ( ( ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) ) ) )
            // InternalRecipeDSL.g:2189:3: ( ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) ) )
            {
            // InternalRecipeDSL.g:2189:3: ( ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                alt13=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecipeDSL.g:2190:3: ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2190:3: ({...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) ) )
                    // InternalRecipeDSL.g:2191:4: {...}? => ( ( ( rule__Nutrients__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Nutrients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRecipeDSL.g:2191:105: ( ( ( rule__Nutrients__Group_3_0__0 ) ) )
                    // InternalRecipeDSL.g:2192:5: ( ( rule__Nutrients__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2198:5: ( ( rule__Nutrients__Group_3_0__0 ) )
                    // InternalRecipeDSL.g:2199:6: ( rule__Nutrients__Group_3_0__0 )
                    {
                     before(grammarAccess.getNutrientsAccess().getGroup_3_0()); 
                    // InternalRecipeDSL.g:2200:6: ( rule__Nutrients__Group_3_0__0 )
                    // InternalRecipeDSL.g:2200:7: rule__Nutrients__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNutrientsAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:2205:3: ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2205:3: ({...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) ) )
                    // InternalRecipeDSL.g:2206:4: {...}? => ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Nutrients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRecipeDSL.g:2206:105: ( ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) ) )
                    // InternalRecipeDSL.g:2207:5: ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2213:5: ( ( rule__Nutrients__PercentagetoggleAssignment_3_1 ) )
                    // InternalRecipeDSL.g:2214:6: ( rule__Nutrients__PercentagetoggleAssignment_3_1 )
                    {
                     before(grammarAccess.getNutrientsAccess().getPercentagetoggleAssignment_3_1()); 
                    // InternalRecipeDSL.g:2215:6: ( rule__Nutrients__PercentagetoggleAssignment_3_1 )
                    // InternalRecipeDSL.g:2215:7: rule__Nutrients__PercentagetoggleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__PercentagetoggleAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNutrientsAccess().getPercentagetoggleAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:2220:3: ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2220:3: ({...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) ) )
                    // InternalRecipeDSL.g:2221:4: {...}? => ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Nutrients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRecipeDSL.g:2221:105: ( ( ( rule__Nutrients__VitaminsAssignment_3_2 ) ) )
                    // InternalRecipeDSL.g:2222:5: ( ( rule__Nutrients__VitaminsAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2228:5: ( ( rule__Nutrients__VitaminsAssignment_3_2 ) )
                    // InternalRecipeDSL.g:2229:6: ( rule__Nutrients__VitaminsAssignment_3_2 )
                    {
                     before(grammarAccess.getNutrientsAccess().getVitaminsAssignment_3_2()); 
                    // InternalRecipeDSL.g:2230:6: ( rule__Nutrients__VitaminsAssignment_3_2 )
                    // InternalRecipeDSL.g:2230:7: rule__Nutrients__VitaminsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__VitaminsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNutrientsAccess().getVitaminsAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:2235:3: ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) )
                    {
                    // InternalRecipeDSL.g:2235:3: ({...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) ) )
                    // InternalRecipeDSL.g:2236:4: {...}? => ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Nutrients__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRecipeDSL.g:2236:105: ( ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) ) )
                    // InternalRecipeDSL.g:2237:5: ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRecipeDSL.g:2243:5: ( ( rule__Nutrients__MacronutrientsAssignment_3_3 ) )
                    // InternalRecipeDSL.g:2244:6: ( rule__Nutrients__MacronutrientsAssignment_3_3 )
                    {
                     before(grammarAccess.getNutrientsAccess().getMacronutrientsAssignment_3_3()); 
                    // InternalRecipeDSL.g:2245:6: ( rule__Nutrients__MacronutrientsAssignment_3_3 )
                    // InternalRecipeDSL.g:2245:7: rule__Nutrients__MacronutrientsAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__MacronutrientsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNutrientsAccess().getMacronutrientsAssignment_3_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3__0"
    // InternalRecipeDSL.g:2258:1: rule__Nutrients__UnorderedGroup_3__0 : rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__1 )? ;
    public final void rule__Nutrients__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2262:1: ( rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__1 )? )
            // InternalRecipeDSL.g:2263:2: rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2264:2: ( rule__Nutrients__UnorderedGroup_3__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRecipeDSL.g:2264:2: rule__Nutrients__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3__0"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3__1"
    // InternalRecipeDSL.g:2270:1: rule__Nutrients__UnorderedGroup_3__1 : rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__2 )? ;
    public final void rule__Nutrients__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2274:1: ( rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__2 )? )
            // InternalRecipeDSL.g:2275:2: rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2276:2: ( rule__Nutrients__UnorderedGroup_3__2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecipeDSL.g:2276:2: rule__Nutrients__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3__1"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3__2"
    // InternalRecipeDSL.g:2282:1: rule__Nutrients__UnorderedGroup_3__2 : rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__3 )? ;
    public final void rule__Nutrients__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2286:1: ( rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__3 )? )
            // InternalRecipeDSL.g:2287:2: rule__Nutrients__UnorderedGroup_3__Impl ( rule__Nutrients__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_24);
            rule__Nutrients__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRecipeDSL.g:2288:2: ( rule__Nutrients__UnorderedGroup_3__3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRecipeDSL.g:2288:2: rule__Nutrients__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutrients__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3__2"


    // $ANTLR start "rule__Nutrients__UnorderedGroup_3__3"
    // InternalRecipeDSL.g:2294:1: rule__Nutrients__UnorderedGroup_3__3 : rule__Nutrients__UnorderedGroup_3__Impl ;
    public final void rule__Nutrients__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2298:1: ( rule__Nutrients__UnorderedGroup_3__Impl )
            // InternalRecipeDSL.g:2299:2: rule__Nutrients__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutrients__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__UnorderedGroup_3__3"


    // $ANTLR start "rule__Page__InstructionsAssignment_2_0"
    // InternalRecipeDSL.g:2306:1: rule__Page__InstructionsAssignment_2_0 : ( ruleInstructions ) ;
    public final void rule__Page__InstructionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2310:1: ( ( ruleInstructions ) )
            // InternalRecipeDSL.g:2311:2: ( ruleInstructions )
            {
            // InternalRecipeDSL.g:2311:2: ( ruleInstructions )
            // InternalRecipeDSL.g:2312:3: ruleInstructions
            {
             before(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__InstructionsAssignment_2_0"


    // $ANTLR start "rule__Page__IngredientsAssignment_2_1"
    // InternalRecipeDSL.g:2321:1: rule__Page__IngredientsAssignment_2_1 : ( ruleIngredients ) ;
    public final void rule__Page__IngredientsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2325:1: ( ( ruleIngredients ) )
            // InternalRecipeDSL.g:2326:2: ( ruleIngredients )
            {
            // InternalRecipeDSL.g:2326:2: ( ruleIngredients )
            // InternalRecipeDSL.g:2327:3: ruleIngredients
            {
             before(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredients();

            state._fsp--;

             after(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__IngredientsAssignment_2_1"


    // $ANTLR start "rule__Page__HeaderAssignment_2_2"
    // InternalRecipeDSL.g:2336:1: rule__Page__HeaderAssignment_2_2 : ( ruleHeader ) ;
    public final void rule__Page__HeaderAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2340:1: ( ( ruleHeader ) )
            // InternalRecipeDSL.g:2341:2: ( ruleHeader )
            {
            // InternalRecipeDSL.g:2341:2: ( ruleHeader )
            // InternalRecipeDSL.g:2342:3: ruleHeader
            {
             before(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HeaderAssignment_2_2"


    // $ANTLR start "rule__Page__NutrientsAssignment_2_3"
    // InternalRecipeDSL.g:2351:1: rule__Page__NutrientsAssignment_2_3 : ( ruleNutrients ) ;
    public final void rule__Page__NutrientsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2355:1: ( ( ruleNutrients ) )
            // InternalRecipeDSL.g:2356:2: ( ruleNutrients )
            {
            // InternalRecipeDSL.g:2356:2: ( ruleNutrients )
            // InternalRecipeDSL.g:2357:3: ruleNutrients
            {
             before(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNutrients();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NutrientsAssignment_2_3"


    // $ANTLR start "rule__Instructions__OrderNumberAssignment_4"
    // InternalRecipeDSL.g:2366:1: rule__Instructions__OrderNumberAssignment_4 : ( ruleEInt ) ;
    public final void rule__Instructions__OrderNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2370:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2371:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2371:2: ( ruleEInt )
            // InternalRecipeDSL.g:2372:3: ruleEInt
            {
             before(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__OrderNumberAssignment_4"


    // $ANTLR start "rule__Ingredients__OrderNumberAssignment_3_0_1"
    // InternalRecipeDSL.g:2381:1: rule__Ingredients__OrderNumberAssignment_3_0_1 : ( ruleEInt ) ;
    public final void rule__Ingredients__OrderNumberAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2385:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2386:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2386:2: ( ruleEInt )
            // InternalRecipeDSL.g:2387:3: ruleEInt
            {
             before(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__OrderNumberAssignment_3_0_1"


    // $ANTLR start "rule__Ingredients__UnittoggleAssignment_3_1"
    // InternalRecipeDSL.g:2396:1: rule__Ingredients__UnittoggleAssignment_3_1 : ( ruleUnitOfMeasure ) ;
    public final void rule__Ingredients__UnittoggleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2400:1: ( ( ruleUnitOfMeasure ) )
            // InternalRecipeDSL.g:2401:2: ( ruleUnitOfMeasure )
            {
            // InternalRecipeDSL.g:2401:2: ( ruleUnitOfMeasure )
            // InternalRecipeDSL.g:2402:3: ruleUnitOfMeasure
            {
             before(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitOfMeasure();

            state._fsp--;

             after(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__UnittoggleAssignment_3_1"


    // $ANTLR start "rule__Header__BasicinformationAssignment_3_0"
    // InternalRecipeDSL.g:2411:1: rule__Header__BasicinformationAssignment_3_0 : ( ruleBasicInformation ) ;
    public final void rule__Header__BasicinformationAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2415:1: ( ( ruleBasicInformation ) )
            // InternalRecipeDSL.g:2416:2: ( ruleBasicInformation )
            {
            // InternalRecipeDSL.g:2416:2: ( ruleBasicInformation )
            // InternalRecipeDSL.g:2417:3: ruleBasicInformation
            {
             before(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicInformation();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__BasicinformationAssignment_3_0"


    // $ANTLR start "rule__Header__RecipetitleAssignment_3_1"
    // InternalRecipeDSL.g:2426:1: rule__Header__RecipetitleAssignment_3_1 : ( ruleTitle ) ;
    public final void rule__Header__RecipetitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2430:1: ( ( ruleTitle ) )
            // InternalRecipeDSL.g:2431:2: ( ruleTitle )
            {
            // InternalRecipeDSL.g:2431:2: ( ruleTitle )
            // InternalRecipeDSL.g:2432:3: ruleTitle
            {
             before(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__RecipetitleAssignment_3_1"


    // $ANTLR start "rule__Header__ImageAssignment_3_2"
    // InternalRecipeDSL.g:2441:1: rule__Header__ImageAssignment_3_2 : ( ruleImage ) ;
    public final void rule__Header__ImageAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2445:1: ( ( ruleImage ) )
            // InternalRecipeDSL.g:2446:2: ( ruleImage )
            {
            // InternalRecipeDSL.g:2446:2: ( ruleImage )
            // InternalRecipeDSL.g:2447:3: ruleImage
            {
             before(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__ImageAssignment_3_2"


    // $ANTLR start "rule__Nutrients__OrderNumberAssignment_3_0_1"
    // InternalRecipeDSL.g:2456:1: rule__Nutrients__OrderNumberAssignment_3_0_1 : ( ruleEInt ) ;
    public final void rule__Nutrients__OrderNumberAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2460:1: ( ( ruleEInt ) )
            // InternalRecipeDSL.g:2461:2: ( ruleEInt )
            {
            // InternalRecipeDSL.g:2461:2: ( ruleEInt )
            // InternalRecipeDSL.g:2462:3: ruleEInt
            {
             before(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__OrderNumberAssignment_3_0_1"


    // $ANTLR start "rule__Nutrients__PercentagetoggleAssignment_3_1"
    // InternalRecipeDSL.g:2471:1: rule__Nutrients__PercentagetoggleAssignment_3_1 : ( rulePercentageAmountToggle ) ;
    public final void rule__Nutrients__PercentagetoggleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2475:1: ( ( rulePercentageAmountToggle ) )
            // InternalRecipeDSL.g:2476:2: ( rulePercentageAmountToggle )
            {
            // InternalRecipeDSL.g:2476:2: ( rulePercentageAmountToggle )
            // InternalRecipeDSL.g:2477:3: rulePercentageAmountToggle
            {
             before(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePercentageAmountToggle();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__PercentagetoggleAssignment_3_1"


    // $ANTLR start "rule__Nutrients__VitaminsAssignment_3_2"
    // InternalRecipeDSL.g:2486:1: rule__Nutrients__VitaminsAssignment_3_2 : ( ruleVitamins ) ;
    public final void rule__Nutrients__VitaminsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2490:1: ( ( ruleVitamins ) )
            // InternalRecipeDSL.g:2491:2: ( ruleVitamins )
            {
            // InternalRecipeDSL.g:2491:2: ( ruleVitamins )
            // InternalRecipeDSL.g:2492:3: ruleVitamins
            {
             before(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamins();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__VitaminsAssignment_3_2"


    // $ANTLR start "rule__Nutrients__MacronutrientsAssignment_3_3"
    // InternalRecipeDSL.g:2501:1: rule__Nutrients__MacronutrientsAssignment_3_3 : ( ruleMacronutrients ) ;
    public final void rule__Nutrients__MacronutrientsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2505:1: ( ( ruleMacronutrients ) )
            // InternalRecipeDSL.g:2506:2: ( ruleMacronutrients )
            {
            // InternalRecipeDSL.g:2506:2: ( ruleMacronutrients )
            // InternalRecipeDSL.g:2507:3: ruleMacronutrients
            {
             before(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMacronutrients();

            state._fsp--;

             after(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutrients__MacronutrientsAssignment_3_3"


    // $ANTLR start "rule__Vitamins__VitaminAssignment_3"
    // InternalRecipeDSL.g:2516:1: rule__Vitamins__VitaminAssignment_3 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2520:1: ( ( ruleVitamin ) )
            // InternalRecipeDSL.g:2521:2: ( ruleVitamin )
            {
            // InternalRecipeDSL.g:2521:2: ( ruleVitamin )
            // InternalRecipeDSL.g:2522:3: ruleVitamin
            {
             before(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamin();

            state._fsp--;

             after(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__VitaminAssignment_3"


    // $ANTLR start "rule__Vitamins__VitaminAssignment_4_1"
    // InternalRecipeDSL.g:2531:1: rule__Vitamins__VitaminAssignment_4_1 : ( ruleVitamin ) ;
    public final void rule__Vitamins__VitaminAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2535:1: ( ( ruleVitamin ) )
            // InternalRecipeDSL.g:2536:2: ( ruleVitamin )
            {
            // InternalRecipeDSL.g:2536:2: ( ruleVitamin )
            // InternalRecipeDSL.g:2537:3: ruleVitamin
            {
             before(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVitamin();

            state._fsp--;

             after(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vitamins__VitaminAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001D000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002C02000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001D000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002C02000002L});

}
