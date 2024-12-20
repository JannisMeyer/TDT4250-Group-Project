/*
 * generated by Xtext 2.36.0
 */
package no.ntnu.tdt4250.recipe.dsl.tests

import com.google.inject.Inject
import no.ntnu.tdt4250.recipe.Page
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(RecipeDSLInjectorProvider)
class RecipeDSLParsingTest {
	@Inject
	ParseHelper<Page> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
