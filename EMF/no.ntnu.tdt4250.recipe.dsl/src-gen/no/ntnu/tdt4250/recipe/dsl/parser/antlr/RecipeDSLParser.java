/*
 * generated by Xtext 2.36.0
 */
package no.ntnu.tdt4250.recipe.dsl.parser.antlr;

import com.google.inject.Inject;
import no.ntnu.tdt4250.recipe.dsl.parser.antlr.internal.InternalRecipeDSLParser;
import no.ntnu.tdt4250.recipe.dsl.services.RecipeDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RecipeDSLParser extends AbstractAntlrParser {

	@Inject
	private RecipeDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRecipeDSLParser createParser(XtextTokenStream stream) {
		return new InternalRecipeDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Page";
	}

	public RecipeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RecipeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}