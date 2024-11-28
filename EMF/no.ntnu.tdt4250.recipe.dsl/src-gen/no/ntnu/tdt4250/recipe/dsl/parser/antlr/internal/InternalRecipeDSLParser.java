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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Instructions'", "'orderNumber'", "'Ingredients'", "'Header'", "'Nutrients'", "'-'", "'UnitOfMeasureToggle'", "'BasicInformation'", "'Title'", "'Image'", "'PercentageAmountToggle'", "'Vitamins'", "'vitamin'", "','", "'Macronutrients'", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
    // InternalRecipeDSL.g:72:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        EObject lv_instructions_3_0 = null;

        EObject lv_ingredients_4_0 = null;

        EObject lv_header_5_0 = null;

        EObject lv_nutrients_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:78:2: ( (otherlv_0= 'Page' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) )
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            {
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            // InternalRecipeDSL.g:80:3: otherlv_0= 'Page' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRecipeDSL.g:88:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:89:4: ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:89:4: ( ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:90:5: ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_2());
            				
            // InternalRecipeDSL.g:93:5: ( ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:94:6: ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:94:6: ( ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipeDSL.g:95:4: ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:95:4: ({...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) ) )
            	    // InternalRecipeDSL.g:96:5: {...}? => ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalRecipeDSL.g:96:101: ( ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) ) )
            	    // InternalRecipeDSL.g:97:6: ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalRecipeDSL.g:100:9: ({...}? => ( (lv_instructions_3_0= ruleInstructions ) ) )
            	    // InternalRecipeDSL.g:100:10: {...}? => ( (lv_instructions_3_0= ruleInstructions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:100:19: ( (lv_instructions_3_0= ruleInstructions ) )
            	    // InternalRecipeDSL.g:100:20: (lv_instructions_3_0= ruleInstructions )
            	    {
            	    // InternalRecipeDSL.g:100:20: (lv_instructions_3_0= ruleInstructions )
            	    // InternalRecipeDSL.g:101:10: lv_instructions_3_0= ruleInstructions
            	    {

            	    										newCompositeNode(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_instructions_3_0=ruleInstructions();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPageRule());
            	    										}
            	    										set(
            	    											current,
            	    											"instructions",
            	    											lv_instructions_3_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Instructions");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:123:4: ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:123:4: ({...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) ) )
            	    // InternalRecipeDSL.g:124:5: {...}? => ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalRecipeDSL.g:124:101: ( ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) ) )
            	    // InternalRecipeDSL.g:125:6: ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalRecipeDSL.g:128:9: ({...}? => ( (lv_ingredients_4_0= ruleIngredients ) ) )
            	    // InternalRecipeDSL.g:128:10: {...}? => ( (lv_ingredients_4_0= ruleIngredients ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:128:19: ( (lv_ingredients_4_0= ruleIngredients ) )
            	    // InternalRecipeDSL.g:128:20: (lv_ingredients_4_0= ruleIngredients )
            	    {
            	    // InternalRecipeDSL.g:128:20: (lv_ingredients_4_0= ruleIngredients )
            	    // InternalRecipeDSL.g:129:10: lv_ingredients_4_0= ruleIngredients
            	    {

            	    										newCompositeNode(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_ingredients_4_0=ruleIngredients();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPageRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ingredients",
            	    											lv_ingredients_4_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Ingredients");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:151:4: ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:151:4: ({...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) ) )
            	    // InternalRecipeDSL.g:152:5: {...}? => ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalRecipeDSL.g:152:101: ( ({...}? => ( (lv_header_5_0= ruleHeader ) ) ) )
            	    // InternalRecipeDSL.g:153:6: ({...}? => ( (lv_header_5_0= ruleHeader ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalRecipeDSL.g:156:9: ({...}? => ( (lv_header_5_0= ruleHeader ) ) )
            	    // InternalRecipeDSL.g:156:10: {...}? => ( (lv_header_5_0= ruleHeader ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:156:19: ( (lv_header_5_0= ruleHeader ) )
            	    // InternalRecipeDSL.g:156:20: (lv_header_5_0= ruleHeader )
            	    {
            	    // InternalRecipeDSL.g:156:20: (lv_header_5_0= ruleHeader )
            	    // InternalRecipeDSL.g:157:10: lv_header_5_0= ruleHeader
            	    {

            	    										newCompositeNode(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_header_5_0=ruleHeader();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPageRule());
            	    										}
            	    										set(
            	    											current,
            	    											"header",
            	    											lv_header_5_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Header");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRecipeDSL.g:179:4: ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:179:4: ({...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) ) )
            	    // InternalRecipeDSL.g:180:5: {...}? => ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalRecipeDSL.g:180:101: ( ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) ) )
            	    // InternalRecipeDSL.g:181:6: ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalRecipeDSL.g:184:9: ({...}? => ( (lv_nutrients_6_0= ruleNutrients ) ) )
            	    // InternalRecipeDSL.g:184:10: {...}? => ( (lv_nutrients_6_0= ruleNutrients ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // InternalRecipeDSL.g:184:19: ( (lv_nutrients_6_0= ruleNutrients ) )
            	    // InternalRecipeDSL.g:184:20: (lv_nutrients_6_0= ruleNutrients )
            	    {
            	    // InternalRecipeDSL.g:184:20: (lv_nutrients_6_0= ruleNutrients )
            	    // InternalRecipeDSL.g:185:10: lv_nutrients_6_0= ruleNutrients
            	    {

            	    										newCompositeNode(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_nutrients_6_0=ruleNutrients();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPageRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nutrients",
            	    											lv_nutrients_6_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Nutrients");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalRecipeDSL.g:223:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalRecipeDSL.g:223:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalRecipeDSL.g:224:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalRecipeDSL.g:230:1: ruleInstructions returns [EObject current=null] : ( () otherlv_1= 'Instructions' otherlv_2= '{' otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_orderNumber_4_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:236:2: ( ( () otherlv_1= 'Instructions' otherlv_2= '{' otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalRecipeDSL.g:237:2: ( () otherlv_1= 'Instructions' otherlv_2= '{' otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalRecipeDSL.g:237:2: ( () otherlv_1= 'Instructions' otherlv_2= '{' otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalRecipeDSL.g:238:3: () otherlv_1= 'Instructions' otherlv_2= '{' otherlv_3= 'orderNumber' ( (lv_orderNumber_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            // InternalRecipeDSL.g:238:3: ()
            // InternalRecipeDSL.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstructionsAccess().getInstructionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getInstructionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getInstructionsAccess().getOrderNumberKeyword_3());
            		
            // InternalRecipeDSL.g:257:3: ( (lv_orderNumber_4_0= ruleEInt ) )
            // InternalRecipeDSL.g:258:4: (lv_orderNumber_4_0= ruleEInt )
            {
            // InternalRecipeDSL.g:258:4: (lv_orderNumber_4_0= ruleEInt )
            // InternalRecipeDSL.g:259:5: lv_orderNumber_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_orderNumber_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_4_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRecipeDSL.g:284:1: entryRuleIngredients returns [EObject current=null] : iv_ruleIngredients= ruleIngredients EOF ;
    public final EObject entryRuleIngredients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredients = null;


        try {
            // InternalRecipeDSL.g:284:52: (iv_ruleIngredients= ruleIngredients EOF )
            // InternalRecipeDSL.g:285:2: iv_ruleIngredients= ruleIngredients EOF
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
    // InternalRecipeDSL.g:291:1: ruleIngredients returns [EObject current=null] : ( () otherlv_1= 'Ingredients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) ;
    public final EObject ruleIngredients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_orderNumber_5_0 = null;

        EObject lv_unittoggle_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:297:2: ( ( () otherlv_1= 'Ingredients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) )
            // InternalRecipeDSL.g:298:2: ( () otherlv_1= 'Ingredients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            {
            // InternalRecipeDSL.g:298:2: ( () otherlv_1= 'Ingredients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            // InternalRecipeDSL.g:299:3: () otherlv_1= 'Ingredients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}'
            {
            // InternalRecipeDSL.g:299:3: ()
            // InternalRecipeDSL.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIngredientsAccess().getIngredientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getIngredientsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRecipeDSL.g:314:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:315:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:315:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:316:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            				
            // InternalRecipeDSL.g:319:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:320:6: ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:320:6: ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipeDSL.g:321:4: ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:321:4: ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) )
            	    // InternalRecipeDSL.g:322:5: {...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRecipeDSL.g:322:108: ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) )
            	    // InternalRecipeDSL.g:323:6: ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRecipeDSL.g:326:9: ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) )
            	    // InternalRecipeDSL.g:326:10: {...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "true");
            	    }
            	    // InternalRecipeDSL.g:326:19: (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) )
            	    // InternalRecipeDSL.g:326:20: otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIngredientsAccess().getOrderNumberKeyword_3_0_0());
            	    								
            	    // InternalRecipeDSL.g:330:9: ( (lv_orderNumber_5_0= ruleEInt ) )
            	    // InternalRecipeDSL.g:331:10: (lv_orderNumber_5_0= ruleEInt )
            	    {
            	    // InternalRecipeDSL.g:331:10: (lv_orderNumber_5_0= ruleEInt )
            	    // InternalRecipeDSL.g:332:11: lv_orderNumber_5_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_orderNumber_5_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIngredientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"orderNumber",
            	    												lv_orderNumber_5_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:355:4: ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:355:4: ({...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) ) )
            	    // InternalRecipeDSL.g:356:5: {...}? => ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRecipeDSL.g:356:108: ( ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) ) )
            	    // InternalRecipeDSL.g:357:6: ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRecipeDSL.g:360:9: ({...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) ) )
            	    // InternalRecipeDSL.g:360:10: {...}? => ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIngredients", "true");
            	    }
            	    // InternalRecipeDSL.g:360:19: ( (lv_unittoggle_6_0= ruleUnitOfMeasure ) )
            	    // InternalRecipeDSL.g:360:20: (lv_unittoggle_6_0= ruleUnitOfMeasure )
            	    {
            	    // InternalRecipeDSL.g:360:20: (lv_unittoggle_6_0= ruleUnitOfMeasure )
            	    // InternalRecipeDSL.g:361:10: lv_unittoggle_6_0= ruleUnitOfMeasure
            	    {

            	    										newCompositeNode(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_10);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleIngredients", "getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
            				

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRecipeDSL.g:399:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRecipeDSL.g:399:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRecipeDSL.g:400:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRecipeDSL.g:406:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_basicinformation_4_0 = null;

        EObject lv_recipetitle_5_0 = null;

        EObject lv_image_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:412:2: ( ( () otherlv_1= 'Header' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' ) )
            // InternalRecipeDSL.g:413:2: ( () otherlv_1= 'Header' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            {
            // InternalRecipeDSL.g:413:2: ( () otherlv_1= 'Header' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}' )
            // InternalRecipeDSL.g:414:3: () otherlv_1= 'Header' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) ) otherlv_7= '}'
            {
            // InternalRecipeDSL.g:414:3: ()
            // InternalRecipeDSL.g:415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRecipeDSL.g:429:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:430:4: ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:430:4: ( ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:431:5: ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            				
            // InternalRecipeDSL.g:434:5: ( ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:435:6: ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:435:6: ( ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:436:4: ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:436:4: ({...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) ) )
            	    // InternalRecipeDSL.g:437:5: {...}? => ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRecipeDSL.g:437:103: ( ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) ) )
            	    // InternalRecipeDSL.g:438:6: ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRecipeDSL.g:441:9: ({...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) ) )
            	    // InternalRecipeDSL.g:441:10: {...}? => ( (lv_basicinformation_4_0= ruleBasicInformation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:441:19: ( (lv_basicinformation_4_0= ruleBasicInformation ) )
            	    // InternalRecipeDSL.g:441:20: (lv_basicinformation_4_0= ruleBasicInformation )
            	    {
            	    // InternalRecipeDSL.g:441:20: (lv_basicinformation_4_0= ruleBasicInformation )
            	    // InternalRecipeDSL.g:442:10: lv_basicinformation_4_0= ruleBasicInformation
            	    {

            	    										newCompositeNode(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0_0());
            	    									
            	    pushFollow(FOLLOW_12);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:464:4: ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:464:4: ({...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) ) )
            	    // InternalRecipeDSL.g:465:5: {...}? => ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRecipeDSL.g:465:103: ( ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) ) )
            	    // InternalRecipeDSL.g:466:6: ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRecipeDSL.g:469:9: ({...}? => ( (lv_recipetitle_5_0= ruleTitle ) ) )
            	    // InternalRecipeDSL.g:469:10: {...}? => ( (lv_recipetitle_5_0= ruleTitle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:469:19: ( (lv_recipetitle_5_0= ruleTitle ) )
            	    // InternalRecipeDSL.g:469:20: (lv_recipetitle_5_0= ruleTitle )
            	    {
            	    // InternalRecipeDSL.g:469:20: (lv_recipetitle_5_0= ruleTitle )
            	    // InternalRecipeDSL.g:470:10: lv_recipetitle_5_0= ruleTitle
            	    {

            	    										newCompositeNode(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_recipetitle_5_0=ruleTitle();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    										}
            	    										set(
            	    											current,
            	    											"recipetitle",
            	    											lv_recipetitle_5_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Title");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:492:4: ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:492:4: ({...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) ) )
            	    // InternalRecipeDSL.g:493:5: {...}? => ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRecipeDSL.g:493:103: ( ({...}? => ( (lv_image_6_0= ruleImage ) ) ) )
            	    // InternalRecipeDSL.g:494:6: ({...}? => ( (lv_image_6_0= ruleImage ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRecipeDSL.g:497:9: ({...}? => ( (lv_image_6_0= ruleImage ) ) )
            	    // InternalRecipeDSL.g:497:10: {...}? => ( (lv_image_6_0= ruleImage ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHeader", "true");
            	    }
            	    // InternalRecipeDSL.g:497:19: ( (lv_image_6_0= ruleImage ) )
            	    // InternalRecipeDSL.g:497:20: (lv_image_6_0= ruleImage )
            	    {
            	    // InternalRecipeDSL.g:497:20: (lv_image_6_0= ruleImage )
            	    // InternalRecipeDSL.g:498:10: lv_image_6_0= ruleImage
            	    {

            	    										newCompositeNode(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_image_6_0=ruleImage();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    										}
            	    										set(
            	    											current,
            	    											"image",
            	    											lv_image_6_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Image");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleHeader", "getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
            				

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipeDSL.g:536:1: entryRuleNutrients returns [EObject current=null] : iv_ruleNutrients= ruleNutrients EOF ;
    public final EObject entryRuleNutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutrients = null;


        try {
            // InternalRecipeDSL.g:536:50: (iv_ruleNutrients= ruleNutrients EOF )
            // InternalRecipeDSL.g:537:2: iv_ruleNutrients= ruleNutrients EOF
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
    // InternalRecipeDSL.g:543:1: ruleNutrients returns [EObject current=null] : ( () otherlv_1= 'Nutrients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' ) ;
    public final EObject ruleNutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_orderNumber_5_0 = null;

        EObject lv_percentagetoggle_6_0 = null;

        EObject lv_vitamins_7_0 = null;

        EObject lv_macronutrients_8_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:549:2: ( ( () otherlv_1= 'Nutrients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' ) )
            // InternalRecipeDSL.g:550:2: ( () otherlv_1= 'Nutrients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' )
            {
            // InternalRecipeDSL.g:550:2: ( () otherlv_1= 'Nutrients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}' )
            // InternalRecipeDSL.g:551:3: () otherlv_1= 'Nutrients' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) ) otherlv_9= '}'
            {
            // InternalRecipeDSL.g:551:3: ()
            // InternalRecipeDSL.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNutrientsAccess().getNutrientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNutrientsAccess().getNutrientsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRecipeDSL.g:566:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) ) )
            // InternalRecipeDSL.g:567:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) )
            {
            // InternalRecipeDSL.g:567:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?) )
            // InternalRecipeDSL.g:568:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            				
            // InternalRecipeDSL.g:571:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?)
            // InternalRecipeDSL.g:572:6: ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+ {...}?
            {
            // InternalRecipeDSL.g:572:6: ( ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=5;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
                    alt4=4;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRecipeDSL.g:573:4: ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:573:4: ({...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) ) )
            	    // InternalRecipeDSL.g:574:5: {...}? => ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRecipeDSL.g:574:106: ( ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) ) )
            	    // InternalRecipeDSL.g:575:6: ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRecipeDSL.g:578:9: ({...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) ) )
            	    // InternalRecipeDSL.g:578:10: {...}? => (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:578:19: (otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) ) )
            	    // InternalRecipeDSL.g:578:20: otherlv_4= 'orderNumber' ( (lv_orderNumber_5_0= ruleEInt ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNutrientsAccess().getOrderNumberKeyword_3_0_0());
            	    								
            	    // InternalRecipeDSL.g:582:9: ( (lv_orderNumber_5_0= ruleEInt ) )
            	    // InternalRecipeDSL.g:583:10: (lv_orderNumber_5_0= ruleEInt )
            	    {
            	    // InternalRecipeDSL.g:583:10: (lv_orderNumber_5_0= ruleEInt )
            	    // InternalRecipeDSL.g:584:11: lv_orderNumber_5_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_orderNumber_5_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"orderNumber",
            	    												lv_orderNumber_5_0,
            	    												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipeDSL.g:607:4: ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:607:4: ({...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) ) )
            	    // InternalRecipeDSL.g:608:5: {...}? => ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRecipeDSL.g:608:106: ( ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) ) )
            	    // InternalRecipeDSL.g:609:6: ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRecipeDSL.g:612:9: ({...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) ) )
            	    // InternalRecipeDSL.g:612:10: {...}? => ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:612:19: ( (lv_percentagetoggle_6_0= rulePercentageAmountToggle ) )
            	    // InternalRecipeDSL.g:612:20: (lv_percentagetoggle_6_0= rulePercentageAmountToggle )
            	    {
            	    // InternalRecipeDSL.g:612:20: (lv_percentagetoggle_6_0= rulePercentageAmountToggle )
            	    // InternalRecipeDSL.g:613:10: lv_percentagetoggle_6_0= rulePercentageAmountToggle
            	    {

            	    										newCompositeNode(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipeDSL.g:635:4: ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:635:4: ({...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) ) )
            	    // InternalRecipeDSL.g:636:5: {...}? => ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRecipeDSL.g:636:106: ( ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) ) )
            	    // InternalRecipeDSL.g:637:6: ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRecipeDSL.g:640:9: ({...}? => ( (lv_vitamins_7_0= ruleVitamins ) ) )
            	    // InternalRecipeDSL.g:640:10: {...}? => ( (lv_vitamins_7_0= ruleVitamins ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:640:19: ( (lv_vitamins_7_0= ruleVitamins ) )
            	    // InternalRecipeDSL.g:640:20: (lv_vitamins_7_0= ruleVitamins )
            	    {
            	    // InternalRecipeDSL.g:640:20: (lv_vitamins_7_0= ruleVitamins )
            	    // InternalRecipeDSL.g:641:10: lv_vitamins_7_0= ruleVitamins
            	    {

            	    										newCompositeNode(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_vitamins_7_0=ruleVitamins();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vitamins",
            	    											lv_vitamins_7_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamins");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRecipeDSL.g:663:4: ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) )
            	    {
            	    // InternalRecipeDSL.g:663:4: ({...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) ) )
            	    // InternalRecipeDSL.g:664:5: {...}? => ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRecipeDSL.g:664:106: ( ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) ) )
            	    // InternalRecipeDSL.g:665:6: ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRecipeDSL.g:668:9: ({...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) ) )
            	    // InternalRecipeDSL.g:668:10: {...}? => ( (lv_macronutrients_8_0= ruleMacronutrients ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNutrients", "true");
            	    }
            	    // InternalRecipeDSL.g:668:19: ( (lv_macronutrients_8_0= ruleMacronutrients ) )
            	    // InternalRecipeDSL.g:668:20: (lv_macronutrients_8_0= ruleMacronutrients )
            	    {
            	    // InternalRecipeDSL.g:668:20: (lv_macronutrients_8_0= ruleMacronutrients )
            	    // InternalRecipeDSL.g:669:10: lv_macronutrients_8_0= ruleMacronutrients
            	    {

            	    										newCompositeNode(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_macronutrients_8_0=ruleMacronutrients();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNutrientsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"macronutrients",
            	    											lv_macronutrients_8_0,
            	    											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Macronutrients");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleNutrients", "getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
            				

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRecipeDSL.g:707:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRecipeDSL.g:707:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRecipeDSL.g:708:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRecipeDSL.g:714:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:720:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRecipeDSL.g:721:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRecipeDSL.g:721:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRecipeDSL.g:722:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRecipeDSL.g:722:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeDSL.g:723:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_15); 

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
    // InternalRecipeDSL.g:740:1: entryRuleUnitOfMeasure returns [EObject current=null] : iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF ;
    public final EObject entryRuleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitOfMeasure = null;


        try {
            // InternalRecipeDSL.g:740:54: (iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF )
            // InternalRecipeDSL.g:741:2: iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF
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
    // InternalRecipeDSL.g:747:1: ruleUnitOfMeasure returns [EObject current=null] : ( () otherlv_1= 'UnitOfMeasureToggle' ) ;
    public final EObject ruleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:753:2: ( ( () otherlv_1= 'UnitOfMeasureToggle' ) )
            // InternalRecipeDSL.g:754:2: ( () otherlv_1= 'UnitOfMeasureToggle' )
            {
            // InternalRecipeDSL.g:754:2: ( () otherlv_1= 'UnitOfMeasureToggle' )
            // InternalRecipeDSL.g:755:3: () otherlv_1= 'UnitOfMeasureToggle'
            {
            // InternalRecipeDSL.g:755:3: ()
            // InternalRecipeDSL.g:756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleKeyword_1());
            		

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
    // InternalRecipeDSL.g:770:1: entryRuleBasicInformation returns [EObject current=null] : iv_ruleBasicInformation= ruleBasicInformation EOF ;
    public final EObject entryRuleBasicInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicInformation = null;


        try {
            // InternalRecipeDSL.g:770:57: (iv_ruleBasicInformation= ruleBasicInformation EOF )
            // InternalRecipeDSL.g:771:2: iv_ruleBasicInformation= ruleBasicInformation EOF
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
    // InternalRecipeDSL.g:777:1: ruleBasicInformation returns [EObject current=null] : ( () otherlv_1= 'BasicInformation' ) ;
    public final EObject ruleBasicInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:783:2: ( ( () otherlv_1= 'BasicInformation' ) )
            // InternalRecipeDSL.g:784:2: ( () otherlv_1= 'BasicInformation' )
            {
            // InternalRecipeDSL.g:784:2: ( () otherlv_1= 'BasicInformation' )
            // InternalRecipeDSL.g:785:3: () otherlv_1= 'BasicInformation'
            {
            // InternalRecipeDSL.g:785:3: ()
            // InternalRecipeDSL.g:786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicInformationAccess().getBasicInformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRecipeDSL.g:800:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalRecipeDSL.g:800:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalRecipeDSL.g:801:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalRecipeDSL.g:807:1: ruleTitle returns [EObject current=null] : ( () otherlv_1= 'Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:813:2: ( ( () otherlv_1= 'Title' ) )
            // InternalRecipeDSL.g:814:2: ( () otherlv_1= 'Title' )
            {
            // InternalRecipeDSL.g:814:2: ( () otherlv_1= 'Title' )
            // InternalRecipeDSL.g:815:3: () otherlv_1= 'Title'
            {
            // InternalRecipeDSL.g:815:3: ()
            // InternalRecipeDSL.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTitleAccess().getTitleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalRecipeDSL.g:830:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalRecipeDSL.g:830:46: (iv_ruleImage= ruleImage EOF )
            // InternalRecipeDSL.g:831:2: iv_ruleImage= ruleImage EOF
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
    // InternalRecipeDSL.g:837:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:843:2: ( ( () otherlv_1= 'Image' ) )
            // InternalRecipeDSL.g:844:2: ( () otherlv_1= 'Image' )
            {
            // InternalRecipeDSL.g:844:2: ( () otherlv_1= 'Image' )
            // InternalRecipeDSL.g:845:3: () otherlv_1= 'Image'
            {
            // InternalRecipeDSL.g:845:3: ()
            // InternalRecipeDSL.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

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
    // InternalRecipeDSL.g:860:1: entryRulePercentageAmountToggle returns [EObject current=null] : iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF ;
    public final EObject entryRulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentageAmountToggle = null;


        try {
            // InternalRecipeDSL.g:860:63: (iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF )
            // InternalRecipeDSL.g:861:2: iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF
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
    // InternalRecipeDSL.g:867:1: rulePercentageAmountToggle returns [EObject current=null] : ( () otherlv_1= 'PercentageAmountToggle' ) ;
    public final EObject rulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:873:2: ( ( () otherlv_1= 'PercentageAmountToggle' ) )
            // InternalRecipeDSL.g:874:2: ( () otherlv_1= 'PercentageAmountToggle' )
            {
            // InternalRecipeDSL.g:874:2: ( () otherlv_1= 'PercentageAmountToggle' )
            // InternalRecipeDSL.g:875:3: () otherlv_1= 'PercentageAmountToggle'
            {
            // InternalRecipeDSL.g:875:3: ()
            // InternalRecipeDSL.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

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
    // InternalRecipeDSL.g:890:1: entryRuleVitamins returns [EObject current=null] : iv_ruleVitamins= ruleVitamins EOF ;
    public final EObject entryRuleVitamins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitamins = null;


        try {
            // InternalRecipeDSL.g:890:49: (iv_ruleVitamins= ruleVitamins EOF )
            // InternalRecipeDSL.g:891:2: iv_ruleVitamins= ruleVitamins EOF
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
    // InternalRecipeDSL.g:897:1: ruleVitamins returns [EObject current=null] : ( () otherlv_1= 'Vitamins' otherlv_2= '{' otherlv_3= 'vitamin' otherlv_4= '{' ( (lv_Vitamin_5_0= ruleVitamin ) ) (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleVitamins() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_Vitamin_5_0 = null;

        Enumerator lv_Vitamin_7_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:903:2: ( ( () otherlv_1= 'Vitamins' otherlv_2= '{' otherlv_3= 'vitamin' otherlv_4= '{' ( (lv_Vitamin_5_0= ruleVitamin ) ) (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalRecipeDSL.g:904:2: ( () otherlv_1= 'Vitamins' otherlv_2= '{' otherlv_3= 'vitamin' otherlv_4= '{' ( (lv_Vitamin_5_0= ruleVitamin ) ) (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalRecipeDSL.g:904:2: ( () otherlv_1= 'Vitamins' otherlv_2= '{' otherlv_3= 'vitamin' otherlv_4= '{' ( (lv_Vitamin_5_0= ruleVitamin ) ) (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalRecipeDSL.g:905:3: () otherlv_1= 'Vitamins' otherlv_2= '{' otherlv_3= 'vitamin' otherlv_4= '{' ( (lv_Vitamin_5_0= ruleVitamin ) ) (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            // InternalRecipeDSL.g:905:3: ()
            // InternalRecipeDSL.g:906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVitaminsAccess().getVitaminsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVitaminsAccess().getVitaminsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVitaminsAccess().getVitaminKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRecipeDSL.g:928:3: ( (lv_Vitamin_5_0= ruleVitamin ) )
            // InternalRecipeDSL.g:929:4: (lv_Vitamin_5_0= ruleVitamin )
            {
            // InternalRecipeDSL.g:929:4: (lv_Vitamin_5_0= ruleVitamin )
            // InternalRecipeDSL.g:930:5: lv_Vitamin_5_0= ruleVitamin
            {

            					newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_Vitamin_5_0=ruleVitamin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVitaminsRule());
            					}
            					add(
            						current,
            						"Vitamin",
            						lv_Vitamin_5_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:947:3: (otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRecipeDSL.g:948:4: otherlv_6= ',' ( (lv_Vitamin_7_0= ruleVitamin ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_6, grammarAccess.getVitaminsAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRecipeDSL.g:952:4: ( (lv_Vitamin_7_0= ruleVitamin ) )
            	    // InternalRecipeDSL.g:953:5: (lv_Vitamin_7_0= ruleVitamin )
            	    {
            	    // InternalRecipeDSL.g:953:5: (lv_Vitamin_7_0= ruleVitamin )
            	    // InternalRecipeDSL.g:954:6: lv_Vitamin_7_0= ruleVitamin
            	    {

            	    						newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_Vitamin_7_0=ruleVitamin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVitaminsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Vitamin",
            	    							lv_Vitamin_7_0,
            	    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRecipeDSL.g:984:1: entryRuleMacronutrients returns [EObject current=null] : iv_ruleMacronutrients= ruleMacronutrients EOF ;
    public final EObject entryRuleMacronutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacronutrients = null;


        try {
            // InternalRecipeDSL.g:984:55: (iv_ruleMacronutrients= ruleMacronutrients EOF )
            // InternalRecipeDSL.g:985:2: iv_ruleMacronutrients= ruleMacronutrients EOF
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
    // InternalRecipeDSL.g:991:1: ruleMacronutrients returns [EObject current=null] : ( () otherlv_1= 'Macronutrients' ) ;
    public final EObject ruleMacronutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:997:2: ( ( () otherlv_1= 'Macronutrients' ) )
            // InternalRecipeDSL.g:998:2: ( () otherlv_1= 'Macronutrients' )
            {
            // InternalRecipeDSL.g:998:2: ( () otherlv_1= 'Macronutrients' )
            // InternalRecipeDSL.g:999:3: () otherlv_1= 'Macronutrients'
            {
            // InternalRecipeDSL.g:999:3: ()
            // InternalRecipeDSL.g:1000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalRecipeDSL.g:1014:1: ruleVitamin returns [Enumerator current=null] : ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) ;
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
            // InternalRecipeDSL.g:1020:2: ( ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) )
            // InternalRecipeDSL.g:1021:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            {
            // InternalRecipeDSL.g:1021:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            case 34:
                {
                alt7=6;
                }
                break;
            case 35:
                {
                alt7=7;
                }
                break;
            case 36:
                {
                alt7=8;
                }
                break;
            case 37:
                {
                alt7=9;
                }
                break;
            case 38:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRecipeDSL.g:1022:3: (enumLiteral_0= 'VITAMIN_A' )
                    {
                    // InternalRecipeDSL.g:1022:3: (enumLiteral_0= 'VITAMIN_A' )
                    // InternalRecipeDSL.g:1023:4: enumLiteral_0= 'VITAMIN_A'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:1030:3: (enumLiteral_1= 'VITAMIN_B1' )
                    {
                    // InternalRecipeDSL.g:1030:3: (enumLiteral_1= 'VITAMIN_B1' )
                    // InternalRecipeDSL.g:1031:4: enumLiteral_1= 'VITAMIN_B1'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:1038:3: (enumLiteral_2= 'VITAMIN_B2' )
                    {
                    // InternalRecipeDSL.g:1038:3: (enumLiteral_2= 'VITAMIN_B2' )
                    // InternalRecipeDSL.g:1039:4: enumLiteral_2= 'VITAMIN_B2'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:1046:3: (enumLiteral_3= 'VITAMIN_B3' )
                    {
                    // InternalRecipeDSL.g:1046:3: (enumLiteral_3= 'VITAMIN_B3' )
                    // InternalRecipeDSL.g:1047:4: enumLiteral_3= 'VITAMIN_B3'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:1054:3: (enumLiteral_4= 'VITAMIN_B5' )
                    {
                    // InternalRecipeDSL.g:1054:3: (enumLiteral_4= 'VITAMIN_B5' )
                    // InternalRecipeDSL.g:1055:4: enumLiteral_4= 'VITAMIN_B5'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipeDSL.g:1062:3: (enumLiteral_5= 'VITAMIN_B6' )
                    {
                    // InternalRecipeDSL.g:1062:3: (enumLiteral_5= 'VITAMIN_B6' )
                    // InternalRecipeDSL.g:1063:4: enumLiteral_5= 'VITAMIN_B6'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipeDSL.g:1070:3: (enumLiteral_6= 'VITAMIN_B12' )
                    {
                    // InternalRecipeDSL.g:1070:3: (enumLiteral_6= 'VITAMIN_B12' )
                    // InternalRecipeDSL.g:1071:4: enumLiteral_6= 'VITAMIN_B12'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipeDSL.g:1078:3: (enumLiteral_7= 'VITAMIN_C' )
                    {
                    // InternalRecipeDSL.g:1078:3: (enumLiteral_7= 'VITAMIN_C' )
                    // InternalRecipeDSL.g:1079:4: enumLiteral_7= 'VITAMIN_C'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipeDSL.g:1086:3: (enumLiteral_8= 'VITAMIN_E' )
                    {
                    // InternalRecipeDSL.g:1086:3: (enumLiteral_8= 'VITAMIN_E' )
                    // InternalRecipeDSL.g:1087:4: enumLiteral_8= 'VITAMIN_E'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipeDSL.g:1094:3: (enumLiteral_9= 'VITAMIN_K' )
                    {
                    // InternalRecipeDSL.g:1094:3: (enumLiteral_9= 'VITAMIN_K' )
                    // InternalRecipeDSL.g:1095:4: enumLiteral_9= 'VITAMIN_K'
                    {
                    enumLiteral_9=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000010A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E02000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000013008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001300A000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007FE0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008002000L});

}
