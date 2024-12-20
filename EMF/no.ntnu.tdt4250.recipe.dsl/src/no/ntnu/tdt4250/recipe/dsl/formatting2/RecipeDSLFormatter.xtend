/*
 * generated by Xtext 2.36.0
 */
package no.ntnu.tdt4250.recipe.dsl.formatting2

import com.google.inject.Inject
import no.ntnu.tdt4250.recipe.Ingredients
import no.ntnu.tdt4250.recipe.Page
import no.ntnu.tdt4250.recipe.dsl.services.RecipeDSLGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class RecipeDSLFormatter extends AbstractFormatter2 {
	
	@Inject extension RecipeDSLGrammarAccess

	def dispatch void format(Page page, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		page.instructions.format
		page.ingredients.format
		page.header.format
		page.nutrients.format
	}

	def dispatch void format(Ingredients ingredients, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		ingredients.unittoggle.format
	}
	
	// TODO: implement for Header, Nutrients
}
