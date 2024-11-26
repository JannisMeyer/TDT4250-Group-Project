package no.ntnu.tdt4250.recipe.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.ntnu.tdt4250.recipe.dsl.services.RecipeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'instructions'", "'ingredients'", "'header'", "'nutrients'", "'}'", "'Instructions'", "'orderNumber'", "'Ingredients'", "'unittoggle'", "'Header'", "'basicinformation'", "'recipetitle'", "'image'", "'Nutrients'", "'percentagetoggle'", "'vitamins'", "'macronutrients'", "'-'", "'UnitOfMeasure'", "'BasicInformation'", "'Title'", "'Image'", "'PercentageAmountToggle'", "'Vitamins'", "'Vitamin'", "','", "'Macronutrients'", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'"
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

        public InternalRecipeDSLParser(TokenStream input, RecipeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Page";
       	}

       	@Override
       	protected RecipeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePage"
    // InternalRecipeDSL.g:65:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalRecipeDSL.g:65:45: (iv_rulePage= rulePage EOF )
            // InternalRecipeDSL.g:66:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalRecipeDSL.g:72:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instructions_5_0 = null;

        EObject lv_ingredients_7_0 = null;

        EObject lv_header_9_0 = null;

        EObject lv_nutrients_11_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:78:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalRecipeDSL.g:80:3: otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalRecipeDSL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRecipeDSL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRecipeDSL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRecipeDSL.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRecipeDSL.g:107:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:108:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:108:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:109:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_3());
            				
            // InternalRecipeDSL.g:112:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:113:6: ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:113:6: ( ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipeDSL.g:114:4: ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:114:4: ({...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) ) )
            	    // InternalRecipeDSL.g:115:5: {...}? => ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRecipeDSL.g:115:101: ( ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) ) )
            	    // InternalRecipeDSL.g:116:6: ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRecipeDSL.g:119:9: ({...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) ) )
            	    // InternalRecipeDSL.g:119:10: {...}? => (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:119:19: (otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) ) )
            	    // InternalRecipeDSL.g:119:20: otherlv_4= 'instructions' ( (lv_instructions_5_0= ruleInstructions ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPageAccess().getInstructionsKeyword_3_0_0());
            	    								
            	    // InternalRecipeDSL.g:123:9: ( (lv_instructions_5_0= ruleInstructions ) )
            	    // InternalRecipeDSL.g:124:10: (lv_instructions_5_0= ruleInstructions )
            	    {
            	    // InternalRecipeDSL.g:124:10: (lv_instructions_5_0= ruleInstructions )
            	    // InternalRecipeDSL.g:125:11: lv_instructions_5_0= ruleInstructions
            	    {

            	    											newCompositeNode(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_instructions_5_0=ruleInstructions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"instructions",
            	    												lv_instructions_5_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Instructions");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:148:4: ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:148:4: ({...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) ) )
            	    // InternalRecipeDSL.g:149:5: {...}? => ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRecipeDSL.g:149:101: ( ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) ) )
            	    // InternalRecipeDSL.g:150:6: ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRecipeDSL.g:153:9: ({...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) ) )
            	    // InternalRecipeDSL.g:153:10: {...}? => (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:153:19: (otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) ) )
            	    // InternalRecipeDSL.g:153:20: otherlv_6= 'ingredients' ( (lv_ingredients_7_0= ruleIngredients ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPageAccess().getIngredientsKeyword_3_1_0());
            	    								
            	    // InternalRecipeDSL.g:157:9: ( (lv_ingredients_7_0= ruleIngredients ) )
            	    // InternalRecipeDSL.g:158:10: (lv_ingredients_7_0= ruleIngredients )
            	    {
            	    // InternalRecipeDSL.g:158:10: (lv_ingredients_7_0= ruleIngredients )
            	    // InternalRecipeDSL.g:159:11: lv_ingredients_7_0= ruleIngredients
            	    {

            	    											newCompositeNode(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_ingredients_7_0=ruleIngredients();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"ingredients",
            	    												lv_ingredients_7_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Ingredients");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:182:4: ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:182:4: ({...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) ) )
            	    // InternalRecipeDSL.g:183:5: {...}? => ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRecipeDSL.g:183:101: ( ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) ) )
            	    // InternalRecipeDSL.g:184:6: ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRecipeDSL.g:187:9: ({...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) ) )
            	    // InternalRecipeDSL.g:187:10: {...}? => (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:187:19: (otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) ) )
            	    // InternalRecipeDSL.g:187:20: otherlv_8= 'header' ( (lv_header_9_0= ruleHeader ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPageAccess().getHeaderKeyword_3_2_0());
            	    								
            	    // InternalRecipeDSL.g:191:9: ( (lv_header_9_0= ruleHeader ) )
            	    // InternalRecipeDSL.g:192:10: (lv_header_9_0= ruleHeader )
            	    {
            	    // InternalRecipeDSL.g:192:10: (lv_header_9_0= ruleHeader )
            	    // InternalRecipeDSL.g:193:11: lv_header_9_0= ruleHeader
            	    {

            	    											newCompositeNode(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_header_9_0=ruleHeader();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"header",
            	    												lv_header_9_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Header");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRecipeDSL.g:216:4: ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:216:4: ({...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) ) )
            	    // InternalRecipeDSL.g:217:5: {...}? => ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRecipeDSL.g:217:101: ( ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) ) )
            	    // InternalRecipeDSL.g:218:6: ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRecipeDSL.g:221:9: ({...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) ) )
            	    // InternalRecipeDSL.g:221:10: {...}? => (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:221:19: (otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) ) )
            	    // InternalRecipeDSL.g:221:20: otherlv_10= 'nutrients' ( (lv_nutrients_11_0= ruleNutrients ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPageAccess().getNutrientsKeyword_3_3_0());
            	    								
            	    // InternalRecipeDSL.g:225:9: ( (lv_nutrients_11_0= ruleNutrients ) )
            	    // InternalRecipeDSL.g:226:10: (lv_nutrients_11_0= ruleNutrients )
            	    {
            	    // InternalRecipeDSL.g:226:10: (lv_nutrients_11_0= ruleNutrients )
            	    // InternalRecipeDSL.g:227:11: lv_nutrients_11_0= ruleNutrients
            	    {

            	    											newCompositeNode(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_nutrients_11_0=ruleNutrients();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"nutrients",
            	    												lv_nutrients_11_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Nutrients");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_3());
            				

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipeDSL.g:266:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalRecipeDSL.g:266:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalRecipeDSL.g:267:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalRecipeDSL.g:273:1: ruleInstructions returns [EObject current=null] : (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_orderNumber_3_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:279:2: ( (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalRecipeDSL.g:280:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalRecipeDSL.g:280:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalRecipeDSL.g:281:3: otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionsAccess().getInstructionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipeDSL.g:293:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipeDSL.g:294:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipeDSL.g:294:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipeDSL.g:295:5: lv_orderNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_orderNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_3_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleIngredients"
    // InternalRecipeDSL.g:320:1: entryRuleIngredients returns [EObject current=null] : iv_ruleIngredients= ruleIngredients EOF ;
    public final EObject entryRuleIngredients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredients = null;


        try {
            // InternalRecipeDSL.g:320:52: (iv_ruleIngredients= ruleIngredients EOF )
            // InternalRecipeDSL.g:321:2: iv_ruleIngredients= ruleIngredients EOF
            {
             newCompositeNode(grammarAccess.getIngredientsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredients=ruleIngredients();

            state._fsp--;

             current =iv_ruleIngredients; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngredients"


    // $ANTLR start "ruleIngredients"
    // InternalRecipeDSL.g:327:1: ruleIngredients returns [EObject current=null] : (otherlv_0= 'Ingredients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) ;
    public final EObject ruleIngredients() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_orderNumber_4_0 = null;

        EObject lv_unittoggle_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:333:2: ( (otherlv_0= 'Ingredients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) )
            // InternalRecipeDSL.g:334:2: (otherlv_0= 'Ingredients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            {
            // InternalRecipeDSL.g:334:2: (otherlv_0= 'Ingredients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            // InternalRecipeDSL.g:335:3: otherlv_0= 'Ingredients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientsAccess().getIngredientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRecipeDSL.g:343:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:345:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIngredientsAccess().getUnorderedGroup_2());
            				
            // InternalRecipeDSL.g:348:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:349:6: ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:349:6: ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipeDSL.g:350:4: ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:350:4: ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) )
            	    // InternalRecipeDSL.g:351:5: {...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalRecipeDSL.g:351:108: ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) )
            	    // InternalRecipeDSL.g:352:6: ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalRecipeDSL.g:355:9: ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) )
            	    // InternalRecipeDSL.g:355:10: {...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "true");
            	    }
            	    // InternalRecipeDSL.g:355:19: (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) )
            	    // InternalRecipeDSL.g:355:20: otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_3, grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2_0_0());
            	    								
            	    // InternalRecipeDSL.g:359:9: ( (lv_orderNumber_4_0= ruleEInt ) )
            	    // InternalRecipeDSL.g:360:10: (lv_orderNumber_4_0= ruleEInt )
            	    {
            	    // InternalRecipeDSL.g:360:10: (lv_orderNumber_4_0= ruleEInt )
            	    // InternalRecipeDSL.g:361:11: lv_orderNumber_4_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_orderNumber_4_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIngredientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"orderNumber",
            	    												lv_orderNumber_4_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:384:4: ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:384:4: ({...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )
            	    // InternalRecipeDSL.g:385:5: {...}? => ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalRecipeDSL.g:385:108: ( ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) )
            	    // InternalRecipeDSL.g:386:6: ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalRecipeDSL.g:389:9: ({...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) )
            	    // InternalRecipeDSL.g:389:10: {...}? => (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "true");
            	    }
            	    // InternalRecipeDSL.g:389:19: (otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) )
            	    // InternalRecipeDSL.g:389:20: otherlv_5= 'unittoggle' ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_16); 

            	    									newLeafNode(otherlv_5, grammarAccess.getIngredientsAccess().getUnittoggleKeyword_2_1_0());
            	    								
            	    // InternalRecipeDSL.g:393:9: ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) )
            	    // InternalRecipeDSL.g:394:10: (lv_unittoggle_6_0= ruleUnitOfMeasure )
            	    {
            	    // InternalRecipeDSL.g:394:10: (lv_unittoggle_6_0= ruleUnitOfMeasure )
            	    // InternalRecipeDSL.g:395:11: lv_unittoggle_6_0= ruleUnitOfMeasure
            	    {

            	    											newCompositeNode(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_unittoggle_6_0=ruleUnitOfMeasure();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIngredientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"unittoggle",
            	    												lv_unittoggle_6_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.UnitOfMeasure");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIngredientsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleIngredients"


    // $ANTLR start "entryRuleHeader"
    // InternalRecipeDSL.g:434:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRecipeDSL.g:434:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRecipeDSL.g:435:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalRecipeDSL.g:441:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'Header' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_basicinformation_4_0 = null;

        EObject lv_recipetitle_6_0 = null;

        EObject lv_image_8_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:447:2: ( (otherlv_0= 'Header' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' ) )
            // InternalRecipeDSL.g:448:2: (otherlv_0= 'Header' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' )
            {
            // InternalRecipeDSL.g:448:2: (otherlv_0= 'Header' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' )
            // InternalRecipeDSL.g:449:3: otherlv_0= 'Header' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHeaderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRecipeDSL.g:457:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:458:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:458:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:459:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHeaderAccess().getUnorderedGroup_2());
            				
            // InternalRecipeDSL.g:462:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:463:6: ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:463:6: ( ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:464:4: ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:464:4: ({...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) )
            	    // InternalRecipeDSL.g:465:5: {...}? => ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalRecipeDSL.g:465:103: ( ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) )
            	    // InternalRecipeDSL.g:466:6: ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalRecipeDSL.g:469:9: ({...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) )
            	    // InternalRecipeDSL.g:469:10: {...}? => (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:469:19: (otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) ) )
            	    // InternalRecipeDSL.g:469:20: otherlv_3= 'basicinformation' ( (lv_basicinformation_4_0= ruleBasicInformation ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_18); 

            	    									newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getBasicinformationKeyword_2_0_0());
            	    								
            	    // InternalRecipeDSL.g:473:9: ( (lv_basicinformation_4_0= ruleBasicInformation ) )
            	    // InternalRecipeDSL.g:474:10: (lv_basicinformation_4_0= ruleBasicInformation )
            	    {
            	    // InternalRecipeDSL.g:474:10: (lv_basicinformation_4_0= ruleBasicInformation )
            	    // InternalRecipeDSL.g:475:11: lv_basicinformation_4_0= ruleBasicInformation
            	    {

            	    											newCompositeNode(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_basicinformation_4_0=ruleBasicInformation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    											}
            	    											set(
            	    												current,
            	    												"basicinformation",
            	    												lv_basicinformation_4_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.BasicInformation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:498:4: ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:498:4: ({...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) ) )
            	    // InternalRecipeDSL.g:499:5: {...}? => ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalRecipeDSL.g:499:103: ( ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) ) )
            	    // InternalRecipeDSL.g:500:6: ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalRecipeDSL.g:503:9: ({...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) ) )
            	    // InternalRecipeDSL.g:503:10: {...}? => (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:503:19: (otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) ) )
            	    // InternalRecipeDSL.g:503:20: otherlv_5= 'recipetitle' ( (lv_recipetitle_6_0= ruleTitle ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_20); 

            	    									newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getRecipetitleKeyword_2_1_0());
            	    								
            	    // InternalRecipeDSL.g:507:9: ( (lv_recipetitle_6_0= ruleTitle ) )
            	    // InternalRecipeDSL.g:508:10: (lv_recipetitle_6_0= ruleTitle )
            	    {
            	    // InternalRecipeDSL.g:508:10: (lv_recipetitle_6_0= ruleTitle )
            	    // InternalRecipeDSL.g:509:11: lv_recipetitle_6_0= ruleTitle
            	    {

            	    											newCompositeNode(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_recipetitle_6_0=ruleTitle();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    											}
            	    											set(
            	    												current,
            	    												"recipetitle",
            	    												lv_recipetitle_6_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Title");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:532:4: ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:532:4: ({...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) ) )
            	    // InternalRecipeDSL.g:533:5: {...}? => ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalRecipeDSL.g:533:103: ( ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) ) )
            	    // InternalRecipeDSL.g:534:6: ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalRecipeDSL.g:537:9: ({...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) ) )
            	    // InternalRecipeDSL.g:537:10: {...}? => (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:537:19: (otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) ) )
            	    // InternalRecipeDSL.g:537:20: otherlv_7= 'image' ( (lv_image_8_0= ruleImage ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getImageKeyword_2_2_0());
            	    								
            	    // InternalRecipeDSL.g:541:9: ( (lv_image_8_0= ruleImage ) )
            	    // InternalRecipeDSL.g:542:10: (lv_image_8_0= ruleImage )
            	    {
            	    // InternalRecipeDSL.g:542:10: (lv_image_8_0= ruleImage )
            	    // InternalRecipeDSL.g:543:11: lv_image_8_0= ruleImage
            	    {

            	    											newCompositeNode(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_image_8_0=ruleImage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    											}
            	    											set(
            	    												current,
            	    												"image",
            	    												lv_image_8_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Image");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHeaderAccess().getUnorderedGroup_2());
            				

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEString"
    // InternalRecipeDSL.g:582:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRecipeDSL.g:582:47: (iv_ruleEString= ruleEString EOF )
            // InternalRecipeDSL.g:583:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRecipeDSL.g:589:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:595:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRecipeDSL.g:596:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRecipeDSL.g:596:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipeDSL.g:597:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:605:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipeDSL.g:616:1: entryRuleNutrients returns [EObject current=null] : iv_ruleNutrients= ruleNutrients EOF ;
    public final EObject entryRuleNutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutrients = null;


        try {
            // InternalRecipeDSL.g:616:50: (iv_ruleNutrients= ruleNutrients EOF )
            // InternalRecipeDSL.g:617:2: iv_ruleNutrients= ruleNutrients EOF
            {
             newCompositeNode(grammarAccess.getNutrientsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutrients=ruleNutrients();

            state._fsp--;

             current =iv_ruleNutrients; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNutrients"


    // $ANTLR start "ruleNutrients"
    // InternalRecipeDSL.g:623:1: ruleNutrients returns [EObject current=null] : (otherlv_0= 'Nutrients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleNutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_orderNumber_4_0 = null;

        EObject lv_percentagetoggle_6_0 = null;

        EObject lv_vitamins_8_0 = null;

        EObject lv_macronutrients_10_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:629:2: ( (otherlv_0= 'Nutrients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalRecipeDSL.g:630:2: (otherlv_0= 'Nutrients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalRecipeDSL.g:630:2: (otherlv_0= 'Nutrients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalRecipeDSL.g:631:3: otherlv_0= 'Nutrients' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNutrientsAccess().getNutrientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRecipeDSL.g:639:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:641:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            				
            // InternalRecipeDSL.g:644:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:645:6: ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:645:6: ( ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeDSL.g:646:4: ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:646:4: ({...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) ) )
            	    // InternalRecipeDSL.g:647:5: {...}? => ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalRecipeDSL.g:647:106: ( ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) ) )
            	    // InternalRecipeDSL.g:648:6: ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalRecipeDSL.g:651:9: ({...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) ) )
            	    // InternalRecipeDSL.g:651:10: {...}? => (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:651:19: (otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) )
            	    // InternalRecipeDSL.g:651:20: otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_3, grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2_0_0());
            	    								
            	    // InternalRecipeDSL.g:655:9: ( (lv_orderNumber_4_0= ruleEInt ) )
            	    // InternalRecipeDSL.g:656:10: (lv_orderNumber_4_0= ruleEInt )
            	    {
            	    // InternalRecipeDSL.g:656:10: (lv_orderNumber_4_0= ruleEInt )
            	    // InternalRecipeDSL.g:657:11: lv_orderNumber_4_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_orderNumber_4_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"orderNumber",
            	    												lv_orderNumber_4_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:680:4: ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:680:4: ({...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) )
            	    // InternalRecipeDSL.g:681:5: {...}? => ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalRecipeDSL.g:681:106: ( ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) )
            	    // InternalRecipeDSL.g:682:6: ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalRecipeDSL.g:685:9: ({...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) )
            	    // InternalRecipeDSL.g:685:10: {...}? => (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:685:19: (otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) )
            	    // InternalRecipeDSL.g:685:20: otherlv_5= 'percentagetoggle' ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_24); 

            	    									newLeafNode(otherlv_5, grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_2_1_0());
            	    								
            	    // InternalRecipeDSL.g:689:9: ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) )
            	    // InternalRecipeDSL.g:690:10: (lv_percentagetoggle_6_0= rulePercentageAmountToggle )
            	    {
            	    // InternalRecipeDSL.g:690:10: (lv_percentagetoggle_6_0= rulePercentageAmountToggle )
            	    // InternalRecipeDSL.g:691:11: lv_percentagetoggle_6_0= rulePercentageAmountToggle
            	    {

            	    											newCompositeNode(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_percentagetoggle_6_0=rulePercentageAmountToggle();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"percentagetoggle",
            	    												lv_percentagetoggle_6_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.PercentageAmountToggle");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:714:4: ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:714:4: ({...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) ) )
            	    // InternalRecipeDSL.g:715:5: {...}? => ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalRecipeDSL.g:715:106: ( ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) ) )
            	    // InternalRecipeDSL.g:716:6: ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalRecipeDSL.g:719:9: ({...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) ) )
            	    // InternalRecipeDSL.g:719:10: {...}? => (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:719:19: (otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) ) )
            	    // InternalRecipeDSL.g:719:20: otherlv_7= 'vitamins' ( (lv_vitamins_8_0= ruleVitamins ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_25); 

            	    									newLeafNode(otherlv_7, grammarAccess.getNutrientsAccess().getVitaminsKeyword_2_2_0());
            	    								
            	    // InternalRecipeDSL.g:723:9: ( (lv_vitamins_8_0= ruleVitamins ) )
            	    // InternalRecipeDSL.g:724:10: (lv_vitamins_8_0= ruleVitamins )
            	    {
            	    // InternalRecipeDSL.g:724:10: (lv_vitamins_8_0= ruleVitamins )
            	    // InternalRecipeDSL.g:725:11: lv_vitamins_8_0= ruleVitamins
            	    {

            	    											newCompositeNode(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_vitamins_8_0=ruleVitamins();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"vitamins",
            	    												lv_vitamins_8_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamins");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRecipeDSL.g:748:4: ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:748:4: ({...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) ) )
            	    // InternalRecipeDSL.g:749:5: {...}? => ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalRecipeDSL.g:749:106: ( ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) ) )
            	    // InternalRecipeDSL.g:750:6: ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalRecipeDSL.g:753:9: ({...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) ) )
            	    // InternalRecipeDSL.g:753:10: {...}? => (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:753:19: (otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) ) )
            	    // InternalRecipeDSL.g:753:20: otherlv_9= 'macronutrients' ( (lv_macronutrients_10_0= ruleMacronutrients ) )
            	    {
            	    otherlv_9=(Token)match(input,29,FOLLOW_26); 

            	    									newLeafNode(otherlv_9, grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_2_3_0());
            	    								
            	    // InternalRecipeDSL.g:757:9: ( (lv_macronutrients_10_0= ruleMacronutrients ) )
            	    // InternalRecipeDSL.g:758:10: (lv_macronutrients_10_0= ruleMacronutrients )
            	    {
            	    // InternalRecipeDSL.g:758:10: (lv_macronutrients_10_0= ruleMacronutrients )
            	    // InternalRecipeDSL.g:759:11: lv_macronutrients_10_0= ruleMacronutrients
            	    {

            	    											newCompositeNode(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_2_3_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_macronutrients_10_0=ruleMacronutrients();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"macronutrients",
            	    												lv_macronutrients_10_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Macronutrients");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNutrientsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNutrients"


    // $ANTLR start "entryRuleEInt"
    // InternalRecipeDSL.g:798:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRecipeDSL.g:798:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRecipeDSL.g:799:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRecipeDSL.g:805:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:811:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRecipeDSL.g:812:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRecipeDSL.g:812:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRecipeDSL.g:813:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRecipeDSL.g:813:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeDSL.g:814:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleUnitOfMeasure"
    // InternalRecipeDSL.g:831:1: entryRuleUnitOfMeasure returns [EObject current=null] : iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF ;
    public final EObject entryRuleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitOfMeasure = null;


        try {
            // InternalRecipeDSL.g:831:54: (iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF )
            // InternalRecipeDSL.g:832:2: iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF
            {
             newCompositeNode(grammarAccess.getUnitOfMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitOfMeasure=ruleUnitOfMeasure();

            state._fsp--;

             current =iv_ruleUnitOfMeasure; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnitOfMeasure"


    // $ANTLR start "ruleUnitOfMeasure"
    // InternalRecipeDSL.g:838:1: ruleUnitOfMeasure returns [EObject current=null] : ( () otherlv_1= 'UnitOfMeasure' ) ;
    public final EObject ruleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:844:2: ( ( () otherlv_1= 'UnitOfMeasure' ) )
            // InternalRecipeDSL.g:845:2: ( () otherlv_1= 'UnitOfMeasure' )
            {
            // InternalRecipeDSL.g:845:2: ( () otherlv_1= 'UnitOfMeasure' )
            // InternalRecipeDSL.g:846:3: () otherlv_1= 'UnitOfMeasure'
            {
            // InternalRecipeDSL.g:846:3: ()
            // InternalRecipeDSL.g:847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureKeyword_1());
            		

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
    // $ANTLR end "ruleUnitOfMeasure"


    // $ANTLR start "entryRuleBasicInformation"
    // InternalRecipeDSL.g:861:1: entryRuleBasicInformation returns [EObject current=null] : iv_ruleBasicInformation= ruleBasicInformation EOF ;
    public final EObject entryRuleBasicInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicInformation = null;


        try {
            // InternalRecipeDSL.g:861:57: (iv_ruleBasicInformation= ruleBasicInformation EOF )
            // InternalRecipeDSL.g:862:2: iv_ruleBasicInformation= ruleBasicInformation EOF
            {
             newCompositeNode(grammarAccess.getBasicInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicInformation=ruleBasicInformation();

            state._fsp--;

             current =iv_ruleBasicInformation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicInformation"


    // $ANTLR start "ruleBasicInformation"
    // InternalRecipeDSL.g:868:1: ruleBasicInformation returns [EObject current=null] : ( () otherlv_1= 'BasicInformation' ) ;
    public final EObject ruleBasicInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:874:2: ( ( () otherlv_1= 'BasicInformation' ) )
            // InternalRecipeDSL.g:875:2: ( () otherlv_1= 'BasicInformation' )
            {
            // InternalRecipeDSL.g:875:2: ( () otherlv_1= 'BasicInformation' )
            // InternalRecipeDSL.g:876:3: () otherlv_1= 'BasicInformation'
            {
            // InternalRecipeDSL.g:876:3: ()
            // InternalRecipeDSL.g:877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicInformationAccess().getBasicInformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1());
            		

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
    // $ANTLR end "ruleBasicInformation"


    // $ANTLR start "entryRuleTitle"
    // InternalRecipeDSL.g:891:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalRecipeDSL.g:891:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalRecipeDSL.g:892:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalRecipeDSL.g:898:1: ruleTitle returns [EObject current=null] : ( () otherlv_1= 'Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:904:2: ( ( () otherlv_1= 'Title' ) )
            // InternalRecipeDSL.g:905:2: ( () otherlv_1= 'Title' )
            {
            // InternalRecipeDSL.g:905:2: ( () otherlv_1= 'Title' )
            // InternalRecipeDSL.g:906:3: () otherlv_1= 'Title'
            {
            // InternalRecipeDSL.g:906:3: ()
            // InternalRecipeDSL.g:907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTitleAccess().getTitleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getTitleKeyword_1());
            		

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleImage"
    // InternalRecipeDSL.g:921:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalRecipeDSL.g:921:46: (iv_ruleImage= ruleImage EOF )
            // InternalRecipeDSL.g:922:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalRecipeDSL.g:928:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:934:2: ( ( () otherlv_1= 'Image' ) )
            // InternalRecipeDSL.g:935:2: ( () otherlv_1= 'Image' )
            {
            // InternalRecipeDSL.g:935:2: ( () otherlv_1= 'Image' )
            // InternalRecipeDSL.g:936:3: () otherlv_1= 'Image'
            {
            // InternalRecipeDSL.g:936:3: ()
            // InternalRecipeDSL.g:937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRulePercentageAmountToggle"
    // InternalRecipeDSL.g:951:1: entryRulePercentageAmountToggle returns [EObject current=null] : iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF ;
    public final EObject entryRulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentageAmountToggle = null;


        try {
            // InternalRecipeDSL.g:951:63: (iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF )
            // InternalRecipeDSL.g:952:2: iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF
            {
             newCompositeNode(grammarAccess.getPercentageAmountToggleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePercentageAmountToggle=rulePercentageAmountToggle();

            state._fsp--;

             current =iv_rulePercentageAmountToggle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePercentageAmountToggle"


    // $ANTLR start "rulePercentageAmountToggle"
    // InternalRecipeDSL.g:958:1: rulePercentageAmountToggle returns [EObject current=null] : ( () otherlv_1= 'PercentageAmountToggle' ) ;
    public final EObject rulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:964:2: ( ( () otherlv_1= 'PercentageAmountToggle' ) )
            // InternalRecipeDSL.g:965:2: ( () otherlv_1= 'PercentageAmountToggle' )
            {
            // InternalRecipeDSL.g:965:2: ( () otherlv_1= 'PercentageAmountToggle' )
            // InternalRecipeDSL.g:966:3: () otherlv_1= 'PercentageAmountToggle'
            {
            // InternalRecipeDSL.g:966:3: ()
            // InternalRecipeDSL.g:967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1());
            		

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
    // $ANTLR end "rulePercentageAmountToggle"


    // $ANTLR start "entryRuleVitamins"
    // InternalRecipeDSL.g:981:1: entryRuleVitamins returns [EObject current=null] : iv_ruleVitamins= ruleVitamins EOF ;
    public final EObject entryRuleVitamins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitamins = null;


        try {
            // InternalRecipeDSL.g:981:49: (iv_ruleVitamins= ruleVitamins EOF )
            // InternalRecipeDSL.g:982:2: iv_ruleVitamins= ruleVitamins EOF
            {
             newCompositeNode(grammarAccess.getVitaminsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVitamins=ruleVitamins();

            state._fsp--;

             current =iv_ruleVitamins; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVitamins"


    // $ANTLR start "ruleVitamins"
    // InternalRecipeDSL.g:988:1: ruleVitamins returns [EObject current=null] : (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleVitamins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_Vitamin_4_0 = null;

        Enumerator lv_Vitamin_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:994:2: ( (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRecipeDSL.g:995:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRecipeDSL.g:995:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRecipeDSL.g:996:3: otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVitaminsAccess().getVitaminsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVitaminsAccess().getVitaminKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipeDSL.g:1012:3: ( (lv_Vitamin_4_0= ruleVitamin ) )
            // InternalRecipeDSL.g:1013:4: (lv_Vitamin_4_0= ruleVitamin )
            {
            // InternalRecipeDSL.g:1013:4: (lv_Vitamin_4_0= ruleVitamin )
            // InternalRecipeDSL.g:1014:5: lv_Vitamin_4_0= ruleVitamin
            {

            					newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_Vitamin_4_0=ruleVitamin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVitaminsRule());
            					}
            					add(
            						current,
            						"Vitamin",
            						lv_Vitamin_4_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:1031:3: (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRecipeDSL.g:1032:4: otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    {
            	    otherlv_5=(Token)match(input,38,FOLLOW_29); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVitaminsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRecipeDSL.g:1036:4: ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    // InternalRecipeDSL.g:1037:5: (lv_Vitamin_6_0= ruleVitamin )
            	    {
            	    // InternalRecipeDSL.g:1037:5: (lv_Vitamin_6_0= ruleVitamin )
            	    // InternalRecipeDSL.g:1038:6: lv_Vitamin_6_0= ruleVitamin
            	    {

            	    						newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_Vitamin_6_0=ruleVitamin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVitaminsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Vitamin",
            	    							lv_Vitamin_6_0,
            	    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVitamins"


    // $ANTLR start "entryRuleMacronutrients"
    // InternalRecipeDSL.g:1068:1: entryRuleMacronutrients returns [EObject current=null] : iv_ruleMacronutrients= ruleMacronutrients EOF ;
    public final EObject entryRuleMacronutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacronutrients = null;


        try {
            // InternalRecipeDSL.g:1068:55: (iv_ruleMacronutrients= ruleMacronutrients EOF )
            // InternalRecipeDSL.g:1069:2: iv_ruleMacronutrients= ruleMacronutrients EOF
            {
             newCompositeNode(grammarAccess.getMacronutrientsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacronutrients=ruleMacronutrients();

            state._fsp--;

             current =iv_ruleMacronutrients; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMacronutrients"


    // $ANTLR start "ruleMacronutrients"
    // InternalRecipeDSL.g:1075:1: ruleMacronutrients returns [EObject current=null] : ( () otherlv_1= 'Macronutrients' ) ;
    public final EObject ruleMacronutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:1081:2: ( ( () otherlv_1= 'Macronutrients' ) )
            // InternalRecipeDSL.g:1082:2: ( () otherlv_1= 'Macronutrients' )
            {
            // InternalRecipeDSL.g:1082:2: ( () otherlv_1= 'Macronutrients' )
            // InternalRecipeDSL.g:1083:3: () otherlv_1= 'Macronutrients'
            {
            // InternalRecipeDSL.g:1083:3: ()
            // InternalRecipeDSL.g:1084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1());
            		

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
    // $ANTLR end "ruleMacronutrients"


    // $ANTLR start "ruleVitamin"
    // InternalRecipeDSL.g:1098:1: ruleVitamin returns [Enumerator current=null] : ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) ;
    public final Enumerator ruleVitamin() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:1104:2: ( ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) )
            // InternalRecipeDSL.g:1105:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            {
            // InternalRecipeDSL.g:1105:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            case 43:
                {
                alt8=4;
                }
                break;
            case 44:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            case 46:
                {
                alt8=7;
                }
                break;
            case 47:
                {
                alt8=8;
                }
                break;
            case 48:
                {
                alt8=9;
                }
                break;
            case 49:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRecipeDSL.g:1106:3: (enumLiteral_0= 'VITAMIN_A' )
                    {
                    // InternalRecipeDSL.g:1106:3: (enumLiteral_0= 'VITAMIN_A' )
                    // InternalRecipeDSL.g:1107:4: enumLiteral_0= 'VITAMIN_A'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:1114:3: (enumLiteral_1= 'VITAMIN_B1' )
                    {
                    // InternalRecipeDSL.g:1114:3: (enumLiteral_1= 'VITAMIN_B1' )
                    // InternalRecipeDSL.g:1115:4: enumLiteral_1= 'VITAMIN_B1'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:1122:3: (enumLiteral_2= 'VITAMIN_B2' )
                    {
                    // InternalRecipeDSL.g:1122:3: (enumLiteral_2= 'VITAMIN_B2' )
                    // InternalRecipeDSL.g:1123:4: enumLiteral_2= 'VITAMIN_B2'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:1130:3: (enumLiteral_3= 'VITAMIN_B3' )
                    {
                    // InternalRecipeDSL.g:1130:3: (enumLiteral_3= 'VITAMIN_B3' )
                    // InternalRecipeDSL.g:1131:4: enumLiteral_3= 'VITAMIN_B3'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:1138:3: (enumLiteral_4= 'VITAMIN_B5' )
                    {
                    // InternalRecipeDSL.g:1138:3: (enumLiteral_4= 'VITAMIN_B5' )
                    // InternalRecipeDSL.g:1139:4: enumLiteral_4= 'VITAMIN_B5'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipeDSL.g:1146:3: (enumLiteral_5= 'VITAMIN_B6' )
                    {
                    // InternalRecipeDSL.g:1146:3: (enumLiteral_5= 'VITAMIN_B6' )
                    // InternalRecipeDSL.g:1147:4: enumLiteral_5= 'VITAMIN_B6'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipeDSL.g:1154:3: (enumLiteral_6= 'VITAMIN_B12' )
                    {
                    // InternalRecipeDSL.g:1154:3: (enumLiteral_6= 'VITAMIN_B12' )
                    // InternalRecipeDSL.g:1155:4: enumLiteral_6= 'VITAMIN_B12'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipeDSL.g:1162:3: (enumLiteral_7= 'VITAMIN_C' )
                    {
                    // InternalRecipeDSL.g:1162:3: (enumLiteral_7= 'VITAMIN_C' )
                    // InternalRecipeDSL.g:1163:4: enumLiteral_7= 'VITAMIN_C'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipeDSL.g:1170:3: (enumLiteral_8= 'VITAMIN_E' )
                    {
                    // InternalRecipeDSL.g:1170:3: (enumLiteral_8= 'VITAMIN_E' )
                    // InternalRecipeDSL.g:1171:4: enumLiteral_8= 'VITAMIN_E'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipeDSL.g:1178:3: (enumLiteral_9= 'VITAMIN_K' )
                    {
                    // InternalRecipeDSL.g:1178:3: (enumLiteral_9= 'VITAMIN_K' )
                    // InternalRecipeDSL.g:1179:4: enumLiteral_9= 'VITAMIN_K'
                    {
                    enumLiteral_9=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleVitamin"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000038080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000380A0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0003FF0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000020000L});

}
