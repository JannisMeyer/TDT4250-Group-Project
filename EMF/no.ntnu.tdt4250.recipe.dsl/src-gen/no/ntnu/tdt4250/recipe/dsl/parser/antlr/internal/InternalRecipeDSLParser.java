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
    // InternalRecipeDSL.g:72:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( (lv_instructions_4_0= ruleInstructions ) ) otherlv_5= 'ingredients' ( (lv_ingredients_6_0= ruleIngredients ) ) otherlv_7= 'header' ( (lv_header_8_0= ruleHeader ) ) (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )? otherlv_11= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_ingredients_6_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_nutrients_10_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:78:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( (lv_instructions_4_0= ruleInstructions ) ) otherlv_5= 'ingredients' ( (lv_ingredients_6_0= ruleIngredients ) ) otherlv_7= 'header' ( (lv_header_8_0= ruleHeader ) ) (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )? otherlv_11= '}' ) )
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( (lv_instructions_4_0= ruleInstructions ) ) otherlv_5= 'ingredients' ( (lv_ingredients_6_0= ruleIngredients ) ) otherlv_7= 'header' ( (lv_header_8_0= ruleHeader ) ) (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )? otherlv_11= '}' )
            {
            // InternalRecipeDSL.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( (lv_instructions_4_0= ruleInstructions ) ) otherlv_5= 'ingredients' ( (lv_ingredients_6_0= ruleIngredients ) ) otherlv_7= 'header' ( (lv_header_8_0= ruleHeader ) ) (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )? otherlv_11= '}' )
            // InternalRecipeDSL.g:80:3: otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( (lv_instructions_4_0= ruleInstructions ) ) otherlv_5= 'ingredients' ( (lv_ingredients_6_0= ruleIngredients ) ) otherlv_7= 'header' ( (lv_header_8_0= ruleHeader ) ) (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )? otherlv_11= '}'
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getInstructionsKeyword_3());
            		
            // InternalRecipeDSL.g:111:3: ( (lv_instructions_4_0= ruleInstructions ) )
            // InternalRecipeDSL.g:112:4: (lv_instructions_4_0= ruleInstructions )
            {
            // InternalRecipeDSL.g:112:4: (lv_instructions_4_0= ruleInstructions )
            // InternalRecipeDSL.g:113:5: lv_instructions_4_0= ruleInstructions
            {

            					newCompositeNode(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_instructions_4_0=ruleInstructions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"instructions",
            						lv_instructions_4_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Instructions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPageAccess().getIngredientsKeyword_5());
            		
            // InternalRecipeDSL.g:134:3: ( (lv_ingredients_6_0= ruleIngredients ) )
            // InternalRecipeDSL.g:135:4: (lv_ingredients_6_0= ruleIngredients )
            {
            // InternalRecipeDSL.g:135:4: (lv_ingredients_6_0= ruleIngredients )
            // InternalRecipeDSL.g:136:5: lv_ingredients_6_0= ruleIngredients
            {

            					newCompositeNode(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_ingredients_6_0=ruleIngredients();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"ingredients",
            						lv_ingredients_6_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Ingredients");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getHeaderKeyword_7());
            		
            // InternalRecipeDSL.g:157:3: ( (lv_header_8_0= ruleHeader ) )
            // InternalRecipeDSL.g:158:4: (lv_header_8_0= ruleHeader )
            {
            // InternalRecipeDSL.g:158:4: (lv_header_8_0= ruleHeader )
            // InternalRecipeDSL.g:159:5: lv_header_8_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_header_8_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_8_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:176:3: (otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRecipeDSL.g:177:4: otherlv_9= 'nutrients' ( (lv_nutrients_10_0= ruleNutrients ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getPageAccess().getNutrientsKeyword_9_0());
                    			
                    // InternalRecipeDSL.g:181:4: ( (lv_nutrients_10_0= ruleNutrients ) )
                    // InternalRecipeDSL.g:182:5: (lv_nutrients_10_0= ruleNutrients )
                    {
                    // InternalRecipeDSL.g:182:5: (lv_nutrients_10_0= ruleNutrients )
                    // InternalRecipeDSL.g:183:6: lv_nutrients_10_0= ruleNutrients
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nutrients_10_0=ruleNutrients();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"nutrients",
                    							lv_nutrients_10_0,
                    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Nutrients");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalRecipeDSL.g:209:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalRecipeDSL.g:209:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalRecipeDSL.g:210:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalRecipeDSL.g:216:1: ruleInstructions returns [EObject current=null] : (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_orderNumber_3_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:222:2: ( (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalRecipeDSL.g:223:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalRecipeDSL.g:223:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalRecipeDSL.g:224:3: otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionsAccess().getInstructionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipeDSL.g:236:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipeDSL.g:237:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipeDSL.g:237:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipeDSL.g:238:5: lv_orderNumber_3_0= ruleEInt
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
    // InternalRecipeDSL.g:263:1: entryRuleIngredients returns [EObject current=null] : iv_ruleIngredients= ruleIngredients EOF ;
    public final EObject entryRuleIngredients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredients = null;


        try {
            // InternalRecipeDSL.g:263:52: (iv_ruleIngredients= ruleIngredients EOF )
            // InternalRecipeDSL.g:264:2: iv_ruleIngredients= ruleIngredients EOF
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
    // InternalRecipeDSL.g:270:1: ruleIngredients returns [EObject current=null] : (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleIngredients() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_orderNumber_3_0 = null;

        EObject lv_unittoggle_5_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:276:2: ( (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' ) )
            // InternalRecipeDSL.g:277:2: (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' )
            {
            // InternalRecipeDSL.g:277:2: (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' )
            // InternalRecipeDSL.g:278:3: otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientsAccess().getIngredientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipeDSL.g:290:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipeDSL.g:291:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipeDSL.g:291:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipeDSL.g:292:5: lv_orderNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_orderNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_3_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:309:3: (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:310:4: otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngredientsAccess().getUnittoggleKeyword_4_0());
                    			
                    // InternalRecipeDSL.g:314:4: ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) )
                    // InternalRecipeDSL.g:315:5: (lv_unittoggle_5_0= ruleUnitOfMeasure )
                    {
                    // InternalRecipeDSL.g:315:5: (lv_unittoggle_5_0= ruleUnitOfMeasure )
                    // InternalRecipeDSL.g:316:6: lv_unittoggle_5_0= ruleUnitOfMeasure
                    {

                    						newCompositeNode(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_unittoggle_5_0=ruleUnitOfMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientsRule());
                    						}
                    						set(
                    							current,
                    							"unittoggle",
                    							lv_unittoggle_5_0,
                    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.UnitOfMeasure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRecipeDSL.g:342:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRecipeDSL.g:342:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRecipeDSL.g:343:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRecipeDSL.g:349:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_basicinformation_3_0 = null;

        EObject lv_recipetitle_5_0 = null;

        EObject lv_image_7_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:355:2: ( (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' ) )
            // InternalRecipeDSL.g:356:2: (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' )
            {
            // InternalRecipeDSL.g:356:2: (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' )
            // InternalRecipeDSL.g:357:3: otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHeaderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getBasicinformationKeyword_2());
            		
            // InternalRecipeDSL.g:369:3: ( (lv_basicinformation_3_0= ruleBasicInformation ) )
            // InternalRecipeDSL.g:370:4: (lv_basicinformation_3_0= ruleBasicInformation )
            {
            // InternalRecipeDSL.g:370:4: (lv_basicinformation_3_0= ruleBasicInformation )
            // InternalRecipeDSL.g:371:5: lv_basicinformation_3_0= ruleBasicInformation
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_basicinformation_3_0=ruleBasicInformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"basicinformation",
            						lv_basicinformation_3_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.BasicInformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getRecipetitleKeyword_4());
            		
            // InternalRecipeDSL.g:392:3: ( (lv_recipetitle_5_0= ruleTitle ) )
            // InternalRecipeDSL.g:393:4: (lv_recipetitle_5_0= ruleTitle )
            {
            // InternalRecipeDSL.g:393:4: (lv_recipetitle_5_0= ruleTitle )
            // InternalRecipeDSL.g:394:5: lv_recipetitle_5_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalRecipeDSL.g:411:3: (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRecipeDSL.g:412:4: otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getImageKeyword_6_0());
                    			
                    // InternalRecipeDSL.g:416:4: ( (lv_image_7_0= ruleImage ) )
                    // InternalRecipeDSL.g:417:5: (lv_image_7_0= ruleImage )
                    {
                    // InternalRecipeDSL.g:417:5: (lv_image_7_0= ruleImage )
                    // InternalRecipeDSL.g:418:6: lv_image_7_0= ruleImage
                    {

                    						newCompositeNode(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_image_7_0=ruleImage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHeaderRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_7_0,
                    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Image");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRecipeDSL.g:444:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRecipeDSL.g:444:47: (iv_ruleEString= ruleEString EOF )
            // InternalRecipeDSL.g:445:2: iv_ruleEString= ruleEString EOF
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
    // InternalRecipeDSL.g:451:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:457:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRecipeDSL.g:458:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRecipeDSL.g:458:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRecipeDSL.g:459:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:467:3: this_ID_1= RULE_ID
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
    // InternalRecipeDSL.g:478:1: entryRuleNutrients returns [EObject current=null] : iv_ruleNutrients= ruleNutrients EOF ;
    public final EObject entryRuleNutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutrients = null;


        try {
            // InternalRecipeDSL.g:478:50: (iv_ruleNutrients= ruleNutrients EOF )
            // InternalRecipeDSL.g:479:2: iv_ruleNutrients= ruleNutrients EOF
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
    // InternalRecipeDSL.g:485:1: ruleNutrients returns [EObject current=null] : (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleNutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_orderNumber_3_0 = null;

        EObject lv_percentagetoggle_5_0 = null;

        EObject lv_vitamins_7_0 = null;

        EObject lv_macronutrients_9_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:491:2: ( (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' ) )
            // InternalRecipeDSL.g:492:2: (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' )
            {
            // InternalRecipeDSL.g:492:2: (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' )
            // InternalRecipeDSL.g:493:3: otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNutrientsAccess().getNutrientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipeDSL.g:505:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipeDSL.g:506:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipeDSL.g:506:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipeDSL.g:507:5: lv_orderNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_orderNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutrientsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_3_0,
            						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:524:3: (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeDSL.g:525:4: otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_4_0());
                    			
                    // InternalRecipeDSL.g:529:4: ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) )
                    // InternalRecipeDSL.g:530:5: (lv_percentagetoggle_5_0= rulePercentageAmountToggle )
                    {
                    // InternalRecipeDSL.g:530:5: (lv_percentagetoggle_5_0= rulePercentageAmountToggle )
                    // InternalRecipeDSL.g:531:6: lv_percentagetoggle_5_0= rulePercentageAmountToggle
                    {

                    						newCompositeNode(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_percentagetoggle_5_0=rulePercentageAmountToggle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNutrientsRule());
                    						}
                    						set(
                    							current,
                    							"percentagetoggle",
                    							lv_percentagetoggle_5_0,
                    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.PercentageAmountToggle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipeDSL.g:549:3: (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeDSL.g:550:4: otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getNutrientsAccess().getVitaminsKeyword_5_0());
                    			
                    // InternalRecipeDSL.g:554:4: ( (lv_vitamins_7_0= ruleVitamins ) )
                    // InternalRecipeDSL.g:555:5: (lv_vitamins_7_0= ruleVitamins )
                    {
                    // InternalRecipeDSL.g:555:5: (lv_vitamins_7_0= ruleVitamins )
                    // InternalRecipeDSL.g:556:6: lv_vitamins_7_0= ruleVitamins
                    {

                    						newCompositeNode(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    break;

            }

            // InternalRecipeDSL.g:574:3: (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipeDSL.g:575:4: otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_6_0());
                    			
                    // InternalRecipeDSL.g:579:4: ( (lv_macronutrients_9_0= ruleMacronutrients ) )
                    // InternalRecipeDSL.g:580:5: (lv_macronutrients_9_0= ruleMacronutrients )
                    {
                    // InternalRecipeDSL.g:580:5: (lv_macronutrients_9_0= ruleMacronutrients )
                    // InternalRecipeDSL.g:581:6: lv_macronutrients_9_0= ruleMacronutrients
                    {

                    						newCompositeNode(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_macronutrients_9_0=ruleMacronutrients();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNutrientsRule());
                    						}
                    						set(
                    							current,
                    							"macronutrients",
                    							lv_macronutrients_9_0,
                    							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Macronutrients");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRecipeDSL.g:607:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRecipeDSL.g:607:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRecipeDSL.g:608:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRecipeDSL.g:614:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:620:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRecipeDSL.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRecipeDSL.g:621:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRecipeDSL.g:622:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRecipeDSL.g:622:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipeDSL.g:623:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30); 

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
    // InternalRecipeDSL.g:640:1: entryRuleUnitOfMeasure returns [EObject current=null] : iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF ;
    public final EObject entryRuleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitOfMeasure = null;


        try {
            // InternalRecipeDSL.g:640:54: (iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF )
            // InternalRecipeDSL.g:641:2: iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF
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
    // InternalRecipeDSL.g:647:1: ruleUnitOfMeasure returns [EObject current=null] : ( () otherlv_1= 'UnitOfMeasure' ) ;
    public final EObject ruleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:653:2: ( ( () otherlv_1= 'UnitOfMeasure' ) )
            // InternalRecipeDSL.g:654:2: ( () otherlv_1= 'UnitOfMeasure' )
            {
            // InternalRecipeDSL.g:654:2: ( () otherlv_1= 'UnitOfMeasure' )
            // InternalRecipeDSL.g:655:3: () otherlv_1= 'UnitOfMeasure'
            {
            // InternalRecipeDSL.g:655:3: ()
            // InternalRecipeDSL.g:656:4: 
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
    // InternalRecipeDSL.g:670:1: entryRuleBasicInformation returns [EObject current=null] : iv_ruleBasicInformation= ruleBasicInformation EOF ;
    public final EObject entryRuleBasicInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicInformation = null;


        try {
            // InternalRecipeDSL.g:670:57: (iv_ruleBasicInformation= ruleBasicInformation EOF )
            // InternalRecipeDSL.g:671:2: iv_ruleBasicInformation= ruleBasicInformation EOF
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
    // InternalRecipeDSL.g:677:1: ruleBasicInformation returns [EObject current=null] : ( () otherlv_1= 'BasicInformation' ) ;
    public final EObject ruleBasicInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:683:2: ( ( () otherlv_1= 'BasicInformation' ) )
            // InternalRecipeDSL.g:684:2: ( () otherlv_1= 'BasicInformation' )
            {
            // InternalRecipeDSL.g:684:2: ( () otherlv_1= 'BasicInformation' )
            // InternalRecipeDSL.g:685:3: () otherlv_1= 'BasicInformation'
            {
            // InternalRecipeDSL.g:685:3: ()
            // InternalRecipeDSL.g:686:4: 
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
    // InternalRecipeDSL.g:700:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalRecipeDSL.g:700:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalRecipeDSL.g:701:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalRecipeDSL.g:707:1: ruleTitle returns [EObject current=null] : ( () otherlv_1= 'Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:713:2: ( ( () otherlv_1= 'Title' ) )
            // InternalRecipeDSL.g:714:2: ( () otherlv_1= 'Title' )
            {
            // InternalRecipeDSL.g:714:2: ( () otherlv_1= 'Title' )
            // InternalRecipeDSL.g:715:3: () otherlv_1= 'Title'
            {
            // InternalRecipeDSL.g:715:3: ()
            // InternalRecipeDSL.g:716:4: 
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
    // InternalRecipeDSL.g:730:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalRecipeDSL.g:730:46: (iv_ruleImage= ruleImage EOF )
            // InternalRecipeDSL.g:731:2: iv_ruleImage= ruleImage EOF
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
    // InternalRecipeDSL.g:737:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:743:2: ( ( () otherlv_1= 'Image' ) )
            // InternalRecipeDSL.g:744:2: ( () otherlv_1= 'Image' )
            {
            // InternalRecipeDSL.g:744:2: ( () otherlv_1= 'Image' )
            // InternalRecipeDSL.g:745:3: () otherlv_1= 'Image'
            {
            // InternalRecipeDSL.g:745:3: ()
            // InternalRecipeDSL.g:746:4: 
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
    // InternalRecipeDSL.g:760:1: entryRulePercentageAmountToggle returns [EObject current=null] : iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF ;
    public final EObject entryRulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentageAmountToggle = null;


        try {
            // InternalRecipeDSL.g:760:63: (iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF )
            // InternalRecipeDSL.g:761:2: iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF
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
    // InternalRecipeDSL.g:767:1: rulePercentageAmountToggle returns [EObject current=null] : ( () otherlv_1= 'PercentageAmountToggle' ) ;
    public final EObject rulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:773:2: ( ( () otherlv_1= 'PercentageAmountToggle' ) )
            // InternalRecipeDSL.g:774:2: ( () otherlv_1= 'PercentageAmountToggle' )
            {
            // InternalRecipeDSL.g:774:2: ( () otherlv_1= 'PercentageAmountToggle' )
            // InternalRecipeDSL.g:775:3: () otherlv_1= 'PercentageAmountToggle'
            {
            // InternalRecipeDSL.g:775:3: ()
            // InternalRecipeDSL.g:776:4: 
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
    // InternalRecipeDSL.g:790:1: entryRuleVitamins returns [EObject current=null] : iv_ruleVitamins= ruleVitamins EOF ;
    public final EObject entryRuleVitamins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitamins = null;


        try {
            // InternalRecipeDSL.g:790:49: (iv_ruleVitamins= ruleVitamins EOF )
            // InternalRecipeDSL.g:791:2: iv_ruleVitamins= ruleVitamins EOF
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
    // InternalRecipeDSL.g:797:1: ruleVitamins returns [EObject current=null] : (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalRecipeDSL.g:803:2: ( (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRecipeDSL.g:804:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRecipeDSL.g:804:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRecipeDSL.g:805:3: otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVitaminsAccess().getVitaminsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVitaminsAccess().getVitaminKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipeDSL.g:821:3: ( (lv_Vitamin_4_0= ruleVitamin ) )
            // InternalRecipeDSL.g:822:4: (lv_Vitamin_4_0= ruleVitamin )
            {
            // InternalRecipeDSL.g:822:4: (lv_Vitamin_4_0= ruleVitamin )
            // InternalRecipeDSL.g:823:5: lv_Vitamin_4_0= ruleVitamin
            {

            					newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalRecipeDSL.g:840:3: (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRecipeDSL.g:841:4: otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    {
            	    otherlv_5=(Token)match(input,38,FOLLOW_32); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVitaminsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRecipeDSL.g:845:4: ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    // InternalRecipeDSL.g:846:5: (lv_Vitamin_6_0= ruleVitamin )
            	    {
            	    // InternalRecipeDSL.g:846:5: (lv_Vitamin_6_0= ruleVitamin )
            	    // InternalRecipeDSL.g:847:6: lv_Vitamin_6_0= ruleVitamin
            	    {

            	    						newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop9;
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
    // InternalRecipeDSL.g:877:1: entryRuleMacronutrients returns [EObject current=null] : iv_ruleMacronutrients= ruleMacronutrients EOF ;
    public final EObject entryRuleMacronutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacronutrients = null;


        try {
            // InternalRecipeDSL.g:877:55: (iv_ruleMacronutrients= ruleMacronutrients EOF )
            // InternalRecipeDSL.g:878:2: iv_ruleMacronutrients= ruleMacronutrients EOF
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
    // InternalRecipeDSL.g:884:1: ruleMacronutrients returns [EObject current=null] : ( () otherlv_1= 'Macronutrients' ) ;
    public final EObject ruleMacronutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:890:2: ( ( () otherlv_1= 'Macronutrients' ) )
            // InternalRecipeDSL.g:891:2: ( () otherlv_1= 'Macronutrients' )
            {
            // InternalRecipeDSL.g:891:2: ( () otherlv_1= 'Macronutrients' )
            // InternalRecipeDSL.g:892:3: () otherlv_1= 'Macronutrients'
            {
            // InternalRecipeDSL.g:892:3: ()
            // InternalRecipeDSL.g:893:4: 
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
    // InternalRecipeDSL.g:907:1: ruleVitamin returns [Enumerator current=null] : ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) ;
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
            // InternalRecipeDSL.g:913:2: ( ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) )
            // InternalRecipeDSL.g:914:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            {
            // InternalRecipeDSL.g:914:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 45:
                {
                alt10=6;
                }
                break;
            case 46:
                {
                alt10=7;
                }
                break;
            case 47:
                {
                alt10=8;
                }
                break;
            case 48:
                {
                alt10=9;
                }
                break;
            case 49:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRecipeDSL.g:915:3: (enumLiteral_0= 'VITAMIN_A' )
                    {
                    // InternalRecipeDSL.g:915:3: (enumLiteral_0= 'VITAMIN_A' )
                    // InternalRecipeDSL.g:916:4: enumLiteral_0= 'VITAMIN_A'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:923:3: (enumLiteral_1= 'VITAMIN_B1' )
                    {
                    // InternalRecipeDSL.g:923:3: (enumLiteral_1= 'VITAMIN_B1' )
                    // InternalRecipeDSL.g:924:4: enumLiteral_1= 'VITAMIN_B1'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:931:3: (enumLiteral_2= 'VITAMIN_B2' )
                    {
                    // InternalRecipeDSL.g:931:3: (enumLiteral_2= 'VITAMIN_B2' )
                    // InternalRecipeDSL.g:932:4: enumLiteral_2= 'VITAMIN_B2'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:939:3: (enumLiteral_3= 'VITAMIN_B3' )
                    {
                    // InternalRecipeDSL.g:939:3: (enumLiteral_3= 'VITAMIN_B3' )
                    // InternalRecipeDSL.g:940:4: enumLiteral_3= 'VITAMIN_B3'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:947:3: (enumLiteral_4= 'VITAMIN_B5' )
                    {
                    // InternalRecipeDSL.g:947:3: (enumLiteral_4= 'VITAMIN_B5' )
                    // InternalRecipeDSL.g:948:4: enumLiteral_4= 'VITAMIN_B5'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipeDSL.g:955:3: (enumLiteral_5= 'VITAMIN_B6' )
                    {
                    // InternalRecipeDSL.g:955:3: (enumLiteral_5= 'VITAMIN_B6' )
                    // InternalRecipeDSL.g:956:4: enumLiteral_5= 'VITAMIN_B6'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipeDSL.g:963:3: (enumLiteral_6= 'VITAMIN_B12' )
                    {
                    // InternalRecipeDSL.g:963:3: (enumLiteral_6= 'VITAMIN_B12' )
                    // InternalRecipeDSL.g:964:4: enumLiteral_6= 'VITAMIN_B12'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipeDSL.g:971:3: (enumLiteral_7= 'VITAMIN_C' )
                    {
                    // InternalRecipeDSL.g:971:3: (enumLiteral_7= 'VITAMIN_C' )
                    // InternalRecipeDSL.g:972:4: enumLiteral_7= 'VITAMIN_C'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipeDSL.g:979:3: (enumLiteral_8= 'VITAMIN_E' )
                    {
                    // InternalRecipeDSL.g:979:3: (enumLiteral_8= 'VITAMIN_E' )
                    // InternalRecipeDSL.g:980:4: enumLiteral_8= 'VITAMIN_E'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipeDSL.g:987:3: (enumLiteral_9= 'VITAMIN_K' )
                    {
                    // InternalRecipeDSL.g:987:3: (enumLiteral_9= 'VITAMIN_K' )
                    // InternalRecipeDSL.g:988:4: enumLiteral_9= 'VITAMIN_K'
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000038020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003FF0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000020000L});

}