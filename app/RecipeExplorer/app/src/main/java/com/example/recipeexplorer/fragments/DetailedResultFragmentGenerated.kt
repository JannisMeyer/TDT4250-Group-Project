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
	    setupSwitches()
	    }
    }

    private fun setupUI() {
    binding.recipeTitle.text = shownRecipe?.title
    binding.recipeImage.load(shownRecipe?.image) {
        placeholder(R.drawable.loading_animation)
        error(R.drawable.error_image)
        crossfade(true)
    }
    binding.recipePreparationTime.text = "${shownRecipe?.preparationTime} min"
    binding.calories.text = "${shownRecipe?.calories} kcal"
    binding.instructions.text = shownRecipe?.instructions?.let { formatInstructions(it) }
    binding.textViewIngredients.text = shownRecipe?.ingredientsMetric?.joinToString(separator = "\n")
    binding.macroNutrients.text = shownRecipe?.macroNutrientsAmount?.joinToString(separator = "\n")
    binding.vitamins.text = shownRecipe?.vitaminsAmount?.joinToString(separator = "\n")
    }

    private fun formatInstructions(htmlInstructions: String): Spanned {
    val cleanedHtml = htmlInstructions
        .replace("<span>", "")
        .replace("</span>", "")
    return Html.fromHtml(cleanedHtml, Html.FROM_HTML_MODE_COMPACT)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

private fun setupSwitches() {
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
}
	}
