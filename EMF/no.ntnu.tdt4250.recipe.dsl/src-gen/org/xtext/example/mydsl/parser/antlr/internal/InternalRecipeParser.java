package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.RecipeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'instructions'", "'ingredients'", "'section'", "','", "'}'", "'header'", "'Instructions'", "'orderNumber'", "'Ingredients'", "'unittoggle'", "'Header'", "'basicinformation'", "'recipetitle'", "'image'", "'-'", "'Nutrients'", "'percentagetoggle'", "'vitamins'", "'macronutrients'", "'PercentageAmountToggle'", "'Vitamins'", "'Vitamin'", "'Macronutrients'", "'UnitOfMeasure'", "'BasicInformation'", "'Title'", "'Image'", "'VITAMIN_A'", "'VITAMIN_B1'", "'VITAMIN_B2'", "'VITAMIN_B3'", "'VITAMIN_B5'", "'VITAMIN_B6'", "'VITAMIN_B12'", "'VITAMIN_C'", "'VITAMIN_E'", "'VITAMIN_K'"
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

        public InternalRecipeParser(TokenStream input, RecipeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Page";
       	}

       	@Override
       	protected RecipeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePage"
    // InternalRecipe.g:65:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalRecipe.g:65:45: (iv_rulePage= rulePage EOF )
            // InternalRecipe.g:66:2: iv_rulePage= rulePage EOF
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
    // InternalRecipe.g:72:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( ( ruleEString ) ) otherlv_5= 'ingredients' ( ( ruleEString ) ) (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )? otherlv_13= 'header' ( (lv_header_14_0= ruleHeader ) ) otherlv_15= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_section_9_0 = null;

        EObject lv_section_11_0 = null;

        EObject lv_header_14_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:78:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( ( ruleEString ) ) otherlv_5= 'ingredients' ( ( ruleEString ) ) (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )? otherlv_13= 'header' ( (lv_header_14_0= ruleHeader ) ) otherlv_15= '}' ) )
            // InternalRecipe.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( ( ruleEString ) ) otherlv_5= 'ingredients' ( ( ruleEString ) ) (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )? otherlv_13= 'header' ( (lv_header_14_0= ruleHeader ) ) otherlv_15= '}' )
            {
            // InternalRecipe.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( ( ruleEString ) ) otherlv_5= 'ingredients' ( ( ruleEString ) ) (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )? otherlv_13= 'header' ( (lv_header_14_0= ruleHeader ) ) otherlv_15= '}' )
            // InternalRecipe.g:80:3: otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instructions' ( ( ruleEString ) ) otherlv_5= 'ingredients' ( ( ruleEString ) ) (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )? otherlv_13= 'header' ( (lv_header_14_0= ruleHeader ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalRecipe.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRecipe.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRecipe.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRecipe.g:86:5: lv_name_1_0= ruleEString
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
            						"org.xtext.example.mydsl.Recipe.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getInstructionsKeyword_3());
            		
            // InternalRecipe.g:111:3: ( ( ruleEString ) )
            // InternalRecipe.g:112:4: ( ruleEString )
            {
            // InternalRecipe.g:112:4: ( ruleEString )
            // InternalRecipe.g:113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPageAccess().getInstructionsInstructionsCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPageAccess().getIngredientsKeyword_5());
            		
            // InternalRecipe.g:131:3: ( ( ruleEString ) )
            // InternalRecipe.g:132:4: ( ruleEString )
            {
            // InternalRecipe.g:132:4: ( ruleEString )
            // InternalRecipe.g:133:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPageAccess().getIngredientsIngredientsCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:147:3: (otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipe.g:148:4: otherlv_7= 'section' otherlv_8= '{' ( (lv_section_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getPageAccess().getSectionKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRecipe.g:156:4: ( (lv_section_9_0= ruleSection ) )
                    // InternalRecipe.g:157:5: (lv_section_9_0= ruleSection )
                    {
                    // InternalRecipe.g:157:5: (lv_section_9_0= ruleSection )
                    // InternalRecipe.g:158:6: lv_section_9_0= ruleSection
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_section_9_0=ruleSection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"section",
                    							lv_section_9_0,
                    							"org.xtext.example.mydsl.Recipe.Section");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRecipe.g:175:4: (otherlv_10= ',' ( (lv_section_11_0= ruleSection ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRecipe.g:176:5: otherlv_10= ',' ( (lv_section_11_0= ruleSection ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRecipe.g:180:5: ( (lv_section_11_0= ruleSection ) )
                    	    // InternalRecipe.g:181:6: (lv_section_11_0= ruleSection )
                    	    {
                    	    // InternalRecipe.g:181:6: (lv_section_11_0= ruleSection )
                    	    // InternalRecipe.g:182:7: lv_section_11_0= ruleSection
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getSectionSectionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_section_11_0=ruleSection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"section",
                    	    								lv_section_11_0,
                    	    								"org.xtext.example.mydsl.Recipe.Section");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getPageAccess().getHeaderKeyword_8());
            		
            // InternalRecipe.g:209:3: ( (lv_header_14_0= ruleHeader ) )
            // InternalRecipe.g:210:4: (lv_header_14_0= ruleHeader )
            {
            // InternalRecipe.g:210:4: (lv_header_14_0= ruleHeader )
            // InternalRecipe.g:211:5: lv_header_14_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_header_14_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_14_0,
            						"org.xtext.example.mydsl.Recipe.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleSection"
    // InternalRecipe.g:236:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalRecipe.g:236:48: (iv_ruleSection= ruleSection EOF )
            // InternalRecipe.g:237:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRecipe.g:243:1: ruleSection returns [EObject current=null] : (this_Ingredients_0= ruleIngredients | this_Instructions_1= ruleInstructions | this_Nutrients_2= ruleNutrients ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_Ingredients_0 = null;

        EObject this_Instructions_1 = null;

        EObject this_Nutrients_2 = null;



        	enterRule();

        try {
            // InternalRecipe.g:249:2: ( (this_Ingredients_0= ruleIngredients | this_Instructions_1= ruleInstructions | this_Nutrients_2= ruleNutrients ) )
            // InternalRecipe.g:250:2: (this_Ingredients_0= ruleIngredients | this_Instructions_1= ruleInstructions | this_Nutrients_2= ruleNutrients )
            {
            // InternalRecipe.g:250:2: (this_Ingredients_0= ruleIngredients | this_Instructions_1= ruleInstructions | this_Nutrients_2= ruleNutrients )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRecipe.g:251:3: this_Ingredients_0= ruleIngredients
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getIngredientsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ingredients_0=ruleIngredients();

                    state._fsp--;


                    			current = this_Ingredients_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipe.g:260:3: this_Instructions_1= ruleInstructions
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getInstructionsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instructions_1=ruleInstructions();

                    state._fsp--;


                    			current = this_Instructions_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRecipe.g:269:3: this_Nutrients_2= ruleNutrients
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getNutrientsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nutrients_2=ruleNutrients();

                    state._fsp--;


                    			current = this_Nutrients_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipe.g:281:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalRecipe.g:281:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalRecipe.g:282:2: iv_ruleInstructions= ruleInstructions EOF
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
    // InternalRecipe.g:288:1: ruleInstructions returns [EObject current=null] : (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_orderNumber_3_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:294:2: ( (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalRecipe.g:295:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalRecipe.g:295:2: (otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalRecipe.g:296:3: otherlv_0= 'Instructions' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionsAccess().getInstructionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipe.g:308:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipe.g:309:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipe.g:309:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipe.g:310:5: lv_orderNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_orderNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_3_0,
            						"org.xtext.example.mydsl.Recipe.EInt");
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
    // InternalRecipe.g:335:1: entryRuleIngredients returns [EObject current=null] : iv_ruleIngredients= ruleIngredients EOF ;
    public final EObject entryRuleIngredients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredients = null;


        try {
            // InternalRecipe.g:335:52: (iv_ruleIngredients= ruleIngredients EOF )
            // InternalRecipe.g:336:2: iv_ruleIngredients= ruleIngredients EOF
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
    // InternalRecipe.g:342:1: ruleIngredients returns [EObject current=null] : (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' ) ;
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
            // InternalRecipe.g:348:2: ( (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' ) )
            // InternalRecipe.g:349:2: (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' )
            {
            // InternalRecipe.g:349:2: (otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}' )
            // InternalRecipe.g:350:3: otherlv_0= 'Ingredients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientsAccess().getIngredientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipe.g:362:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipe.g:363:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipe.g:363:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipe.g:364:5: lv_orderNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_orderNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientsRule());
            					}
            					set(
            						current,
            						"orderNumber",
            						lv_orderNumber_3_0,
            						"org.xtext.example.mydsl.Recipe.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:381:3: (otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipe.g:382:4: otherlv_4= 'unittoggle' ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngredientsAccess().getUnittoggleKeyword_4_0());
                    			
                    // InternalRecipe.g:386:4: ( (lv_unittoggle_5_0= ruleUnitOfMeasure ) )
                    // InternalRecipe.g:387:5: (lv_unittoggle_5_0= ruleUnitOfMeasure )
                    {
                    // InternalRecipe.g:387:5: (lv_unittoggle_5_0= ruleUnitOfMeasure )
                    // InternalRecipe.g:388:6: lv_unittoggle_5_0= ruleUnitOfMeasure
                    {

                    						newCompositeNode(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_unittoggle_5_0=ruleUnitOfMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientsRule());
                    						}
                    						set(
                    							current,
                    							"unittoggle",
                    							lv_unittoggle_5_0,
                    							"org.xtext.example.mydsl.Recipe.UnitOfMeasure");
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
    // InternalRecipe.g:414:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRecipe.g:414:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRecipe.g:415:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRecipe.g:421:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' ) ;
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
            // InternalRecipe.g:427:2: ( (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' ) )
            // InternalRecipe.g:428:2: (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' )
            {
            // InternalRecipe.g:428:2: (otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}' )
            // InternalRecipe.g:429:3: otherlv_0= 'Header' otherlv_1= '{' otherlv_2= 'basicinformation' ( (lv_basicinformation_3_0= ruleBasicInformation ) ) otherlv_4= 'recipetitle' ( (lv_recipetitle_5_0= ruleTitle ) ) (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHeaderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getBasicinformationKeyword_2());
            		
            // InternalRecipe.g:441:3: ( (lv_basicinformation_3_0= ruleBasicInformation ) )
            // InternalRecipe.g:442:4: (lv_basicinformation_3_0= ruleBasicInformation )
            {
            // InternalRecipe.g:442:4: (lv_basicinformation_3_0= ruleBasicInformation )
            // InternalRecipe.g:443:5: lv_basicinformation_3_0= ruleBasicInformation
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_basicinformation_3_0=ruleBasicInformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"basicinformation",
            						lv_basicinformation_3_0,
            						"org.xtext.example.mydsl.Recipe.BasicInformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getRecipetitleKeyword_4());
            		
            // InternalRecipe.g:464:3: ( (lv_recipetitle_5_0= ruleTitle ) )
            // InternalRecipe.g:465:4: (lv_recipetitle_5_0= ruleTitle )
            {
            // InternalRecipe.g:465:4: (lv_recipetitle_5_0= ruleTitle )
            // InternalRecipe.g:466:5: lv_recipetitle_5_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_recipetitle_5_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"recipetitle",
            						lv_recipetitle_5_0,
            						"org.xtext.example.mydsl.Recipe.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:483:3: (otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipe.g:484:4: otherlv_6= 'image' ( (lv_image_7_0= ruleImage ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getImageKeyword_6_0());
                    			
                    // InternalRecipe.g:488:4: ( (lv_image_7_0= ruleImage ) )
                    // InternalRecipe.g:489:5: (lv_image_7_0= ruleImage )
                    {
                    // InternalRecipe.g:489:5: (lv_image_7_0= ruleImage )
                    // InternalRecipe.g:490:6: lv_image_7_0= ruleImage
                    {

                    						newCompositeNode(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_image_7_0=ruleImage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHeaderRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_7_0,
                    							"org.xtext.example.mydsl.Recipe.Image");
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
    // InternalRecipe.g:516:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRecipe.g:516:47: (iv_ruleEString= ruleEString EOF )
            // InternalRecipe.g:517:2: iv_ruleEString= ruleEString EOF
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
    // InternalRecipe.g:523:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:529:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRecipe.g:530:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRecipe.g:530:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipe.g:531:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipe.g:539:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalRecipe.g:550:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRecipe.g:550:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRecipe.g:551:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRecipe.g:557:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:563:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRecipe.g:564:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRecipe.g:564:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRecipe.g:565:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRecipe.g:565:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipe.g:566:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_23); 

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


    // $ANTLR start "entryRuleNutrients"
    // InternalRecipe.g:583:1: entryRuleNutrients returns [EObject current=null] : iv_ruleNutrients= ruleNutrients EOF ;
    public final EObject entryRuleNutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutrients = null;


        try {
            // InternalRecipe.g:583:50: (iv_ruleNutrients= ruleNutrients EOF )
            // InternalRecipe.g:584:2: iv_ruleNutrients= ruleNutrients EOF
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
    // InternalRecipe.g:590:1: ruleNutrients returns [EObject current=null] : (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' ) ;
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
            // InternalRecipe.g:596:2: ( (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' ) )
            // InternalRecipe.g:597:2: (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' )
            {
            // InternalRecipe.g:597:2: (otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}' )
            // InternalRecipe.g:598:3: otherlv_0= 'Nutrients' otherlv_1= '{' otherlv_2= 'orderNumber' ( (lv_orderNumber_3_0= ruleEInt ) ) (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )? (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )? (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNutrientsAccess().getNutrientsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNutrientsAccess().getOrderNumberKeyword_2());
            		
            // InternalRecipe.g:610:3: ( (lv_orderNumber_3_0= ruleEInt ) )
            // InternalRecipe.g:611:4: (lv_orderNumber_3_0= ruleEInt )
            {
            // InternalRecipe.g:611:4: (lv_orderNumber_3_0= ruleEInt )
            // InternalRecipe.g:612:5: lv_orderNumber_3_0= ruleEInt
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
            						"org.xtext.example.mydsl.Recipe.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:629:3: (otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipe.g:630:4: otherlv_4= 'percentagetoggle' ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getNutrientsAccess().getPercentagetoggleKeyword_4_0());
                    			
                    // InternalRecipe.g:634:4: ( (lv_percentagetoggle_5_0= rulePercentageAmountToggle ) )
                    // InternalRecipe.g:635:5: (lv_percentagetoggle_5_0= rulePercentageAmountToggle )
                    {
                    // InternalRecipe.g:635:5: (lv_percentagetoggle_5_0= rulePercentageAmountToggle )
                    // InternalRecipe.g:636:6: lv_percentagetoggle_5_0= rulePercentageAmountToggle
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
                    							"org.xtext.example.mydsl.Recipe.PercentageAmountToggle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipe.g:654:3: (otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipe.g:655:4: otherlv_6= 'vitamins' ( (lv_vitamins_7_0= ruleVitamins ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getNutrientsAccess().getVitaminsKeyword_5_0());
                    			
                    // InternalRecipe.g:659:4: ( (lv_vitamins_7_0= ruleVitamins ) )
                    // InternalRecipe.g:660:5: (lv_vitamins_7_0= ruleVitamins )
                    {
                    // InternalRecipe.g:660:5: (lv_vitamins_7_0= ruleVitamins )
                    // InternalRecipe.g:661:6: lv_vitamins_7_0= ruleVitamins
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
                    							"org.xtext.example.mydsl.Recipe.Vitamins");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipe.g:679:3: (otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRecipe.g:680:4: otherlv_8= 'macronutrients' ( (lv_macronutrients_9_0= ruleMacronutrients ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getNutrientsAccess().getMacronutrientsKeyword_6_0());
                    			
                    // InternalRecipe.g:684:4: ( (lv_macronutrients_9_0= ruleMacronutrients ) )
                    // InternalRecipe.g:685:5: (lv_macronutrients_9_0= ruleMacronutrients )
                    {
                    // InternalRecipe.g:685:5: (lv_macronutrients_9_0= ruleMacronutrients )
                    // InternalRecipe.g:686:6: lv_macronutrients_9_0= ruleMacronutrients
                    {

                    						newCompositeNode(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_macronutrients_9_0=ruleMacronutrients();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNutrientsRule());
                    						}
                    						set(
                    							current,
                    							"macronutrients",
                    							lv_macronutrients_9_0,
                    							"org.xtext.example.mydsl.Recipe.Macronutrients");
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


    // $ANTLR start "entryRulePercentageAmountToggle"
    // InternalRecipe.g:712:1: entryRulePercentageAmountToggle returns [EObject current=null] : iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF ;
    public final EObject entryRulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentageAmountToggle = null;


        try {
            // InternalRecipe.g:712:63: (iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF )
            // InternalRecipe.g:713:2: iv_rulePercentageAmountToggle= rulePercentageAmountToggle EOF
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
    // InternalRecipe.g:719:1: rulePercentageAmountToggle returns [EObject current=null] : ( () otherlv_1= 'PercentageAmountToggle' ) ;
    public final EObject rulePercentageAmountToggle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:725:2: ( ( () otherlv_1= 'PercentageAmountToggle' ) )
            // InternalRecipe.g:726:2: ( () otherlv_1= 'PercentageAmountToggle' )
            {
            // InternalRecipe.g:726:2: ( () otherlv_1= 'PercentageAmountToggle' )
            // InternalRecipe.g:727:3: () otherlv_1= 'PercentageAmountToggle'
            {
            // InternalRecipe.g:727:3: ()
            // InternalRecipe.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalRecipe.g:742:1: entryRuleVitamins returns [EObject current=null] : iv_ruleVitamins= ruleVitamins EOF ;
    public final EObject entryRuleVitamins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitamins = null;


        try {
            // InternalRecipe.g:742:49: (iv_ruleVitamins= ruleVitamins EOF )
            // InternalRecipe.g:743:2: iv_ruleVitamins= ruleVitamins EOF
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
    // InternalRecipe.g:749:1: ruleVitamins returns [EObject current=null] : (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalRecipe.g:755:2: ( (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRecipe.g:756:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRecipe.g:756:2: (otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRecipe.g:757:3: otherlv_0= 'Vitamins' otherlv_1= '{' otherlv_2= 'Vitamin' otherlv_3= '{' ( (lv_Vitamin_4_0= ruleVitamin ) ) (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVitaminsAccess().getVitaminsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVitaminsAccess().getVitaminKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipe.g:773:3: ( (lv_Vitamin_4_0= ruleVitamin ) )
            // InternalRecipe.g:774:4: (lv_Vitamin_4_0= ruleVitamin )
            {
            // InternalRecipe.g:774:4: (lv_Vitamin_4_0= ruleVitamin )
            // InternalRecipe.g:775:5: lv_Vitamin_4_0= ruleVitamin
            {

            					newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_Vitamin_4_0=ruleVitamin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVitaminsRule());
            					}
            					add(
            						current,
            						"Vitamin",
            						lv_Vitamin_4_0,
            						"org.xtext.example.mydsl.Recipe.Vitamin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:792:3: (otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipe.g:793:4: otherlv_5= ',' ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVitaminsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRecipe.g:797:4: ( (lv_Vitamin_6_0= ruleVitamin ) )
            	    // InternalRecipe.g:798:5: (lv_Vitamin_6_0= ruleVitamin )
            	    {
            	    // InternalRecipe.g:798:5: (lv_Vitamin_6_0= ruleVitamin )
            	    // InternalRecipe.g:799:6: lv_Vitamin_6_0= ruleVitamin
            	    {

            	    						newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_Vitamin_6_0=ruleVitamin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVitaminsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Vitamin",
            	    							lv_Vitamin_6_0,
            	    							"org.xtext.example.mydsl.Recipe.Vitamin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_12); 

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
    // InternalRecipe.g:829:1: entryRuleMacronutrients returns [EObject current=null] : iv_ruleMacronutrients= ruleMacronutrients EOF ;
    public final EObject entryRuleMacronutrients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacronutrients = null;


        try {
            // InternalRecipe.g:829:55: (iv_ruleMacronutrients= ruleMacronutrients EOF )
            // InternalRecipe.g:830:2: iv_ruleMacronutrients= ruleMacronutrients EOF
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
    // InternalRecipe.g:836:1: ruleMacronutrients returns [EObject current=null] : ( () otherlv_1= 'Macronutrients' ) ;
    public final EObject ruleMacronutrients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:842:2: ( ( () otherlv_1= 'Macronutrients' ) )
            // InternalRecipe.g:843:2: ( () otherlv_1= 'Macronutrients' )
            {
            // InternalRecipe.g:843:2: ( () otherlv_1= 'Macronutrients' )
            // InternalRecipe.g:844:3: () otherlv_1= 'Macronutrients'
            {
            // InternalRecipe.g:844:3: ()
            // InternalRecipe.g:845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUnitOfMeasure"
    // InternalRecipe.g:859:1: entryRuleUnitOfMeasure returns [EObject current=null] : iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF ;
    public final EObject entryRuleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitOfMeasure = null;


        try {
            // InternalRecipe.g:859:54: (iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF )
            // InternalRecipe.g:860:2: iv_ruleUnitOfMeasure= ruleUnitOfMeasure EOF
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
    // InternalRecipe.g:866:1: ruleUnitOfMeasure returns [EObject current=null] : ( () otherlv_1= 'UnitOfMeasure' ) ;
    public final EObject ruleUnitOfMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:872:2: ( ( () otherlv_1= 'UnitOfMeasure' ) )
            // InternalRecipe.g:873:2: ( () otherlv_1= 'UnitOfMeasure' )
            {
            // InternalRecipe.g:873:2: ( () otherlv_1= 'UnitOfMeasure' )
            // InternalRecipe.g:874:3: () otherlv_1= 'UnitOfMeasure'
            {
            // InternalRecipe.g:874:3: ()
            // InternalRecipe.g:875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRecipe.g:889:1: entryRuleBasicInformation returns [EObject current=null] : iv_ruleBasicInformation= ruleBasicInformation EOF ;
    public final EObject entryRuleBasicInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicInformation = null;


        try {
            // InternalRecipe.g:889:57: (iv_ruleBasicInformation= ruleBasicInformation EOF )
            // InternalRecipe.g:890:2: iv_ruleBasicInformation= ruleBasicInformation EOF
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
    // InternalRecipe.g:896:1: ruleBasicInformation returns [EObject current=null] : ( () otherlv_1= 'BasicInformation' ) ;
    public final EObject ruleBasicInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:902:2: ( ( () otherlv_1= 'BasicInformation' ) )
            // InternalRecipe.g:903:2: ( () otherlv_1= 'BasicInformation' )
            {
            // InternalRecipe.g:903:2: ( () otherlv_1= 'BasicInformation' )
            // InternalRecipe.g:904:3: () otherlv_1= 'BasicInformation'
            {
            // InternalRecipe.g:904:3: ()
            // InternalRecipe.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicInformationAccess().getBasicInformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRecipe.g:919:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalRecipe.g:919:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalRecipe.g:920:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalRecipe.g:926:1: ruleTitle returns [EObject current=null] : ( () otherlv_1= 'Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:932:2: ( ( () otherlv_1= 'Title' ) )
            // InternalRecipe.g:933:2: ( () otherlv_1= 'Title' )
            {
            // InternalRecipe.g:933:2: ( () otherlv_1= 'Title' )
            // InternalRecipe.g:934:3: () otherlv_1= 'Title'
            {
            // InternalRecipe.g:934:3: ()
            // InternalRecipe.g:935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTitleAccess().getTitleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalRecipe.g:949:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalRecipe.g:949:46: (iv_ruleImage= ruleImage EOF )
            // InternalRecipe.g:950:2: iv_ruleImage= ruleImage EOF
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
    // InternalRecipe.g:956:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipe.g:962:2: ( ( () otherlv_1= 'Image' ) )
            // InternalRecipe.g:963:2: ( () otherlv_1= 'Image' )
            {
            // InternalRecipe.g:963:2: ( () otherlv_1= 'Image' )
            // InternalRecipe.g:964:3: () otherlv_1= 'Image'
            {
            // InternalRecipe.g:964:3: ()
            // InternalRecipe.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "ruleVitamin"
    // InternalRecipe.g:979:1: ruleVitamin returns [Enumerator current=null] : ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) ;
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
            // InternalRecipe.g:985:2: ( ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) ) )
            // InternalRecipe.g:986:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            {
            // InternalRecipe.g:986:2: ( (enumLiteral_0= 'VITAMIN_A' ) | (enumLiteral_1= 'VITAMIN_B1' ) | (enumLiteral_2= 'VITAMIN_B2' ) | (enumLiteral_3= 'VITAMIN_B3' ) | (enumLiteral_4= 'VITAMIN_B5' ) | (enumLiteral_5= 'VITAMIN_B6' ) | (enumLiteral_6= 'VITAMIN_B12' ) | (enumLiteral_7= 'VITAMIN_C' ) | (enumLiteral_8= 'VITAMIN_E' ) | (enumLiteral_9= 'VITAMIN_K' ) )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            case 43:
                {
                alt12=4;
                }
                break;
            case 44:
                {
                alt12=5;
                }
                break;
            case 45:
                {
                alt12=6;
                }
                break;
            case 46:
                {
                alt12=7;
                }
                break;
            case 47:
                {
                alt12=8;
                }
                break;
            case 48:
                {
                alt12=9;
                }
                break;
            case 49:
                {
                alt12=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRecipe.g:987:3: (enumLiteral_0= 'VITAMIN_A' )
                    {
                    // InternalRecipe.g:987:3: (enumLiteral_0= 'VITAMIN_A' )
                    // InternalRecipe.g:988:4: enumLiteral_0= 'VITAMIN_A'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:995:3: (enumLiteral_1= 'VITAMIN_B1' )
                    {
                    // InternalRecipe.g:995:3: (enumLiteral_1= 'VITAMIN_B1' )
                    // InternalRecipe.g:996:4: enumLiteral_1= 'VITAMIN_B1'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:1003:3: (enumLiteral_2= 'VITAMIN_B2' )
                    {
                    // InternalRecipe.g:1003:3: (enumLiteral_2= 'VITAMIN_B2' )
                    // InternalRecipe.g:1004:4: enumLiteral_2= 'VITAMIN_B2'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipe.g:1011:3: (enumLiteral_3= 'VITAMIN_B3' )
                    {
                    // InternalRecipe.g:1011:3: (enumLiteral_3= 'VITAMIN_B3' )
                    // InternalRecipe.g:1012:4: enumLiteral_3= 'VITAMIN_B3'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipe.g:1019:3: (enumLiteral_4= 'VITAMIN_B5' )
                    {
                    // InternalRecipe.g:1019:3: (enumLiteral_4= 'VITAMIN_B5' )
                    // InternalRecipe.g:1020:4: enumLiteral_4= 'VITAMIN_B5'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipe.g:1027:3: (enumLiteral_5= 'VITAMIN_B6' )
                    {
                    // InternalRecipe.g:1027:3: (enumLiteral_5= 'VITAMIN_B6' )
                    // InternalRecipe.g:1028:4: enumLiteral_5= 'VITAMIN_B6'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRecipe.g:1035:3: (enumLiteral_6= 'VITAMIN_B12' )
                    {
                    // InternalRecipe.g:1035:3: (enumLiteral_6= 'VITAMIN_B12' )
                    // InternalRecipe.g:1036:4: enumLiteral_6= 'VITAMIN_B12'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRecipe.g:1043:3: (enumLiteral_7= 'VITAMIN_C' )
                    {
                    // InternalRecipe.g:1043:3: (enumLiteral_7= 'VITAMIN_C' )
                    // InternalRecipe.g:1044:4: enumLiteral_7= 'VITAMIN_C'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRecipe.g:1051:3: (enumLiteral_8= 'VITAMIN_E' )
                    {
                    // InternalRecipe.g:1051:3: (enumLiteral_8= 'VITAMIN_E' )
                    // InternalRecipe.g:1052:4: enumLiteral_8= 'VITAMIN_E'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRecipe.g:1059:3: (enumLiteral_9= 'VITAMIN_K' )
                    {
                    // InternalRecipe.g:1059:3: (enumLiteral_9= 'VITAMIN_K' )
                    // InternalRecipe.g:1060:4: enumLiteral_9= 'VITAMIN_K'
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010280000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E0020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003FF0000000000L});

}