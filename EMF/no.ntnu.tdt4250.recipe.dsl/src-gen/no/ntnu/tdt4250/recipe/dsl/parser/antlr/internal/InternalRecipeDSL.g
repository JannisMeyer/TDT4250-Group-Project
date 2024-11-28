/*
 * generated by Xtext 2.36.0
 */
grammar InternalRecipeDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package no.ntnu.tdt4250.recipe.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePage
entryRulePage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	iv_rulePage=rulePage
	{ $current=$iv_rulePage.current; }
	EOF;

// Rule Page
rulePage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Page'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getPageAccess().getInstructionsInstructionsParserRuleCall_2_0_0());
									}
									lv_instructions_3_0=ruleInstructions
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPageRule());
										}
										set(
											$current,
											"instructions",
											lv_instructions_3_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Instructions");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getPageAccess().getIngredientsIngredientsParserRuleCall_2_1_0());
									}
									lv_ingredients_4_0=ruleIngredients
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPageRule());
										}
										set(
											$current,
											"ingredients",
											lv_ingredients_4_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Ingredients");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getPageAccess().getHeaderHeaderParserRuleCall_2_2_0());
									}
									lv_header_5_0=ruleHeader
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPageRule());
										}
										set(
											$current,
											"header",
											lv_header_5_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Header");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_2(), 3);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getPageAccess().getNutrientsNutrientsParserRuleCall_2_3_0());
									}
									lv_nutrients_6_0=ruleNutrients
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPageRule());
										}
										set(
											$current,
											"nutrients",
											lv_nutrients_6_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Nutrients");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_2());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getPageAccess().getUnorderedGroup_2())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_2());
				}
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleInstructions
entryRuleInstructions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionsRule()); }
	iv_ruleInstructions=ruleInstructions
	{ $current=$iv_ruleInstructions.current; }
	EOF;

// Rule Instructions
ruleInstructions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInstructionsAccess().getInstructionsAction_0(),
					$current);
			}
		)
		otherlv_1='Instructions'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getInstructionsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='orderNumber'
		{
			newLeafNode(otherlv_3, grammarAccess.getInstructionsAccess().getOrderNumberKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionsAccess().getOrderNumberEIntParserRuleCall_4_0());
				}
				lv_orderNumber_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionsRule());
					}
					set(
						$current,
						"orderNumber",
						lv_orderNumber_4_0,
						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleIngredients
entryRuleIngredients returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIngredientsRule()); }
	iv_ruleIngredients=ruleIngredients
	{ $current=$iv_ruleIngredients.current; }
	EOF;

// Rule Ingredients
ruleIngredients returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIngredientsAccess().getIngredientsAction_0(),
					$current);
			}
		)
		otherlv_1='Ingredients'
		{
			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getIngredientsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='orderNumber'
								{
									newLeafNode(otherlv_4, grammarAccess.getIngredientsAccess().getOrderNumberKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getIngredientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0());
										}
										lv_orderNumber_5_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getIngredientsRule());
											}
											set(
												$current,
												"orderNumber",
												lv_orderNumber_5_0,
												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getIngredientsAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getIngredientsAccess().getUnittoggleUnitOfMeasureParserRuleCall_3_1_0());
									}
									lv_unittoggle_6_0=ruleUnitOfMeasure
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getIngredientsRule());
										}
										set(
											$current,
											"unittoggle",
											lv_unittoggle_6_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.UnitOfMeasure");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getIngredientsAccess().getUnorderedGroup_3());
				}
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHeaderAccess().getHeaderAction_0(),
					$current);
			}
		)
		otherlv_1='Header'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getHeaderAccess().getBasicinformationBasicInformationParserRuleCall_3_0_0());
									}
									lv_basicinformation_4_0=ruleBasicInformation
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getHeaderRule());
										}
										set(
											$current,
											"basicinformation",
											lv_basicinformation_4_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.BasicInformation");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getHeaderAccess().getRecipetitleTitleParserRuleCall_3_1_0());
									}
									lv_recipetitle_5_0=ruleTitle
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getHeaderRule());
										}
										set(
											$current,
											"recipetitle",
											lv_recipetitle_5_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Title");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getHeaderAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getHeaderAccess().getImageImageParserRuleCall_3_2_0());
									}
									lv_image_6_0=ruleImage
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getHeaderRule());
										}
										set(
											$current,
											"image",
											lv_image_6_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Image");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getHeaderAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getHeaderAccess().getUnorderedGroup_3());
				}
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleNutrients
entryRuleNutrients returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNutrientsRule()); }
	iv_ruleNutrients=ruleNutrients
	{ $current=$iv_ruleNutrients.current; }
	EOF;

// Rule Nutrients
ruleNutrients returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNutrientsAccess().getNutrientsAction_0(),
					$current);
			}
		)
		otherlv_1='Nutrients'
		{
			newLeafNode(otherlv_1, grammarAccess.getNutrientsAccess().getNutrientsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNutrientsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='orderNumber'
								{
									newLeafNode(otherlv_4, grammarAccess.getNutrientsAccess().getOrderNumberKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getNutrientsAccess().getOrderNumberEIntParserRuleCall_3_0_1_0());
										}
										lv_orderNumber_5_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getNutrientsRule());
											}
											set(
												$current,
												"orderNumber",
												lv_orderNumber_5_0,
												"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getNutrientsAccess().getPercentagetogglePercentageAmountToggleParserRuleCall_3_1_0());
									}
									lv_percentagetoggle_6_0=rulePercentageAmountToggle
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getNutrientsRule());
										}
										set(
											$current,
											"percentagetoggle",
											lv_percentagetoggle_6_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.PercentageAmountToggle");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getNutrientsAccess().getVitaminsVitaminsParserRuleCall_3_2_0());
									}
									lv_vitamins_7_0=ruleVitamins
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getNutrientsRule());
										}
										set(
											$current,
											"vitamins",
											lv_vitamins_7_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamins");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNutrientsAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getNutrientsAccess().getMacronutrientsMacronutrientsParserRuleCall_3_3_0());
									}
									lv_macronutrients_8_0=ruleMacronutrients
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getNutrientsRule());
										}
										set(
											$current,
											"macronutrients",
											lv_macronutrients_8_0,
											"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Macronutrients");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getNutrientsAccess().getUnorderedGroup_3());
				}
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getNutrientsAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleUnitOfMeasure
entryRuleUnitOfMeasure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitOfMeasureRule()); }
	iv_ruleUnitOfMeasure=ruleUnitOfMeasure
	{ $current=$iv_ruleUnitOfMeasure.current; }
	EOF;

// Rule UnitOfMeasure
ruleUnitOfMeasure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleAction_0(),
					$current);
			}
		)
		otherlv_1='UnitOfMeasureToggle'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnitOfMeasureAccess().getUnitOfMeasureToggleKeyword_1());
		}
	)
;

// Entry rule entryRuleBasicInformation
entryRuleBasicInformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasicInformationRule()); }
	iv_ruleBasicInformation=ruleBasicInformation
	{ $current=$iv_ruleBasicInformation.current; }
	EOF;

// Rule BasicInformation
ruleBasicInformation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBasicInformationAccess().getBasicInformationAction_0(),
					$current);
			}
		)
		otherlv_1='BasicInformation'
		{
			newLeafNode(otherlv_1, grammarAccess.getBasicInformationAccess().getBasicInformationKeyword_1());
		}
	)
;

// Entry rule entryRuleTitle
entryRuleTitle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTitleRule()); }
	iv_ruleTitle=ruleTitle
	{ $current=$iv_ruleTitle.current; }
	EOF;

// Rule Title
ruleTitle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTitleAccess().getTitleAction_0(),
					$current);
			}
		)
		otherlv_1='Title'
		{
			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getTitleKeyword_1());
		}
	)
;

// Entry rule entryRuleImage
entryRuleImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageRule()); }
	iv_ruleImage=ruleImage
	{ $current=$iv_ruleImage.current; }
	EOF;

// Rule Image
ruleImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getImageAccess().getImageAction_0(),
					$current);
			}
		)
		otherlv_1='Image'
		{
			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
		}
	)
;

// Entry rule entryRulePercentageAmountToggle
entryRulePercentageAmountToggle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPercentageAmountToggleRule()); }
	iv_rulePercentageAmountToggle=rulePercentageAmountToggle
	{ $current=$iv_rulePercentageAmountToggle.current; }
	EOF;

// Rule PercentageAmountToggle
rulePercentageAmountToggle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleAction_0(),
					$current);
			}
		)
		otherlv_1='PercentageAmountToggle'
		{
			newLeafNode(otherlv_1, grammarAccess.getPercentageAmountToggleAccess().getPercentageAmountToggleKeyword_1());
		}
	)
;

// Entry rule entryRuleVitamins
entryRuleVitamins returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVitaminsRule()); }
	iv_ruleVitamins=ruleVitamins
	{ $current=$iv_ruleVitamins.current; }
	EOF;

// Rule Vitamins
ruleVitamins returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVitaminsAccess().getVitaminsAction_0(),
					$current);
			}
		)
		otherlv_1='Vitamins'
		{
			newLeafNode(otherlv_1, grammarAccess.getVitaminsAccess().getVitaminsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='vitamin'
		{
			newLeafNode(otherlv_3, grammarAccess.getVitaminsAccess().getVitaminKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getVitaminsAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_5_0());
				}
				lv_Vitamin_5_0=ruleVitamin
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVitaminsRule());
					}
					add(
						$current,
						"Vitamin",
						lv_Vitamin_5_0,
						"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getVitaminsAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVitaminsAccess().getVitaminVitaminEnumRuleCall_6_1_0());
					}
					lv_Vitamin_7_0=ruleVitamin
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVitaminsRule());
						}
						add(
							$current,
							"Vitamin",
							lv_Vitamin_7_0,
							"no.ntnu.tdt4250.recipe.dsl.RecipeDSL.Vitamin");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getVitaminsAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleMacronutrients
entryRuleMacronutrients returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMacronutrientsRule()); }
	iv_ruleMacronutrients=ruleMacronutrients
	{ $current=$iv_ruleMacronutrients.current; }
	EOF;

// Rule Macronutrients
ruleMacronutrients returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMacronutrientsAccess().getMacronutrientsAction_0(),
					$current);
			}
		)
		otherlv_1='Macronutrients'
		{
			newLeafNode(otherlv_1, grammarAccess.getMacronutrientsAccess().getMacronutrientsKeyword_1());
		}
	)
;

// Rule Vitamin
ruleVitamin returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='VITAMIN_A'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVitaminAccess().getVITAMIN_AEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='VITAMIN_B1'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVitaminAccess().getVITAMIN_B1EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='VITAMIN_B2'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVitaminAccess().getVITAMIN_B2EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='VITAMIN_B3'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVitaminAccess().getVITAMIN_B3EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='VITAMIN_B5'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVitaminAccess().getVITAMIN_B5EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='VITAMIN_B6'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVitaminAccess().getVITAMIN_B6EnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='VITAMIN_B12'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVitaminAccess().getVITAMIN_B12EnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='VITAMIN_C'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getVitaminAccess().getVITAMIN_CEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='VITAMIN_E'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getVitaminAccess().getVITAMIN_EEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='VITAMIN_K'
			{
				$current = grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getVitaminAccess().getVITAMIN_KEnumLiteralDeclaration_9());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
