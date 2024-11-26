package no.ntnu.tdt4250.recipe.generator

import no.ntnu.tdt4250.recipe.Page
import no.ntnu.tdt4250.recipe.Header
import no.ntnu.tdt4250.recipe.Ingredients
import no.ntnu.tdt4250.recipe.Instructions
import no.ntnu.tdt4250.recipe.Nutrients
import no.ntnu.tdt4250.recipe.Section

class RecipeFragmentGenerator {
    
    def generateFragment(Page page) '''
		package com.example.recipeexplorer.fragments
		
		import android.os.Bundle
		import android.text.Html
		import android.text.Spanned
		import android.view.LayoutInflater
		import android.view.View
		import android.view.ViewGroup
		import androidx.fragment.app.Fragment
		import com.example.recipeexplorer.databinding.FragmentDetailedResultGeneratedBinding
		import com.example.recipeexplorer.querying.FetchedRecipes
		import com.example.recipeexplorer.querying.Recipe
		import coil.load
		import com.example.recipeexplorer.R
		
		class DetailedResultFragmentGenerated : Fragment() {
		
		    private var _binding: FragmentDetailedResultGeneratedBinding? = null
		    private val binding get() = _binding!!
		
		    private var fetchedRecipes = FetchedRecipes.getInstance()
		    private var shownRecipe: Recipe? = null
		
		    override fun onCreateView(
		    inflater: LayoutInflater,
		    container: ViewGroup?,
		    savedInstanceState: Bundle?
		    ): View {
		        _binding = FragmentDetailedResultGeneratedBinding.inflate(inflater, container, false)
		        return binding.root
		    }
		
		    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		    	super.onViewCreated(view, savedInstanceState)
		
		        val id = arguments?.getString("ID")
		
		        for (recipe in fetchedRecipes?.recipes!!) {
				    if (id != null) {
				        if (recipe.id == id.toInt()) {
				            shownRecipe = recipe
				        }
				    }
			    }
		
		        if (shownRecipe != null) {
				    setupUI()
			    «IF hasAnySwitches(page)»
			    	setupSwitches()
			    «ENDIF»
			    }
		    }
		
		    private fun setupUI() {
		    «generateBindings(page)»
		    }
		
		    private fun formatInstructions(htmlInstructions: String): Spanned {
		    val cleanedHtml = htmlInstructions
		        .replace("<span>", "")
		        .replace("</span>", "")
		    return Html.fromHtml(cleanedHtml, Html.FROM_HTML_MODE_COMPACT)
		    }
		
		    «generateOverrideOnDestroyView»
		
		    «IF hasAnySwitches(page)»
			«generateSetupSwitches(page)»
			«ENDIF»
			}
	'''

    def hasAnySwitches(Page page) {
        for (child : page.eContents) {
            switch child {
                Ingredients: if (child.unittoggle !== null) return true
                Nutrients: if (child.percentagetoggle !== null) return true
            }
        }
        return false
    }

    def generateBindings(Page page) '''
		«generateHeaderBindings(page.header)»
		«FOR child : page.eContents.filter(Section).sortBy[orderNumber]»
			«generateSectionBindings(child)»
		«ENDFOR»
	'''

    def generateHeaderBindings(Header header) '''
		binding.recipeTitle.text = shownRecipe?.title
		«IF header.image !== null»
			binding.recipeImage.load(shownRecipe?.image) {
			    placeholder(R.drawable.loading_animation)
			    error(R.drawable.error_image)
			    crossfade(true)
			}
		«ENDIF»
		binding.recipePreparationTime.text = "${shownRecipe?.preparationTime} min"
		binding.calories.text = "${shownRecipe?.calories} kcal"
	'''

    def dispatch generateSectionBindings(Ingredients ingredients) '''
		binding.textViewIngredients.text = shownRecipe?.ingredientsMetric?.joinToString(separator = "\n")
	'''

    def dispatch generateSectionBindings(Instructions instructions) '''
		binding.instructions.text = shownRecipe?.instructions?.let { formatInstructions(it) }
	'''
	
    def dispatch generateSectionBindings(Nutrients nutrients) '''
		«IF nutrients.macronutrients !== null»
			binding.macroNutrients.text = shownRecipe?.macroNutrientsAmount?.joinToString(separator = "\n")
		«ENDIF»
		«IF nutrients.vitamins !== null»
			binding.vitamins.text = shownRecipe?.vitaminsAmount?.joinToString(separator = "\n")
		«ENDIF»
	'''

    def generateSetupSwitches(Page page) '''
		private fun setupSwitches() {
		   «FOR child : page.eContents.filter(Section).filter[s | hasSwitches(s)]»
		   	«generateSwitchSetup(child)»
		   «ENDFOR»
		}
	'''

    def hasSwitches(Object section) {
        switch section {
            Ingredients: return section.unittoggle !== null
            Nutrients: return section.percentagetoggle !== null
            default: return false
        }
    }

    def dispatch generateSwitchSetup(Ingredients ingredients) '''
		«IF ingredients.unittoggle !== null»
			binding.unitSwitch.setOnCheckedChangeListener { _, isChecked ->
			    if (isChecked) {
			        binding.unitSwitch.text = getString(R.string.ingredients_switch_text_imperial)
			        binding.textViewIngredients.text = shownRecipe?.ingredientsImperial?.joinToString(separator = "\n")
			    }
			    else {
			        binding.unitSwitch.text = getString(R.string.ingredients_switch_text_metric)
			        binding.textViewIngredients.text = shownRecipe?.ingredientsMetric?.joinToString(separator = "\n")
			    }
			}
		«ENDIF»
	'''

    def dispatch generateSwitchSetup(Nutrients nutrients) '''
		«IF nutrients.percentagetoggle !== null»
			binding.nutrientSwitch.setOnCheckedChangeListener { _, isChecked ->
			    if (isChecked) {
			        binding.nutrientSwitch.text = getString(R.string.nutrient_switch_text_percentage)
			        binding.macroNutrients.text = shownRecipe?.macroNutrientsPercentage?.joinToString(separator = "\n")
			        binding.vitamins.text = shownRecipe?.vitaminsPercentage?.joinToString(separator = "\n")
			    }
			    else {
			        binding.nutrientSwitch.text = getString(R.string.nutrient_switch_text_amount)
			        binding.macroNutrients.text = shownRecipe?.macroNutrientsAmount?.joinToString(separator = "\n")
			        binding.vitamins.text = shownRecipe?.vitaminsAmount?.joinToString(separator = "\n")
			    }
			}
		«ENDIF»
	'''

    def dispatch generateSwitchSetup(Instructions instructions) '''
	'''

    def generateOverrideOnDestroyView() '''
		override fun onDestroyView() {
		    super.onDestroyView()
		    _binding = null
		}
	'''
}
