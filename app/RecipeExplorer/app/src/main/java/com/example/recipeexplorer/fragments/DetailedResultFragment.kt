package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeexplorer.databinding.FragmentDetailedResultBinding
import com.example.recipeexplorer.querying.FetchedRecipes
import com.example.recipeexplorer.querying.Recipe
import coil.load
import com.example.recipeexplorer.R

class DetailedResultFragment : Fragment() {

    private var _binding: FragmentDetailedResultBinding? = null
    private val binding get() = _binding!!

    private var fetchedRecipes = FetchedRecipes.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // bind this fragment to corresponding ui
        _binding = FragmentDetailedResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // get id from intent
        val id = arguments?.getString("ID")
        var shownRecipe : Recipe? = null

        // get recipe corresponding to id
        for (recipe in fetchedRecipes?.recipes!!) {
            if (id != null) {
                if (recipe.id == id.toInt()) {
                    shownRecipe = recipe
                }
            }
        }

        // helper-function to translate from html to kotlin
        fun formatInstructions(htmlInstructions: String): Spanned {
            // First, remove all span tags while keeping their content
            val cleanedHtml = htmlInstructions
                .replace("<span>", "")
                .replace("</span>", "")

            // Convert HTML to displayable text while preserving ordered list formatting
            return Html.fromHtml(cleanedHtml, Html.FROM_HTML_MODE_COMPACT)
        }


        if (shownRecipe != null) {

            // pass recipe data to UI
            binding.recipeTitle.text = shownRecipe.title
            binding.recipeImage.load(shownRecipe.image) {
                placeholder(R.drawable.loading_animation)
                error(R.drawable.error_image)
                crossfade(true)  // Animate the loading
            }
            binding.recipePreparationTime.text = shownRecipe.preparationTime.toString()
            binding.calories.text = shownRecipe.calories.toString()
            binding.textViewIngredients.text = shownRecipe.ingredientsMetric.joinToString(separator = "\n")
            binding.instructions.text = formatInstructions(shownRecipe.instructions)
            binding.macroNutrients.text = shownRecipe.macroNutrientsAmount.joinToString(separator = "\n")
            binding.vitamins.text = shownRecipe.vitaminsAmount.joinToString(separator = "\n")

            // bind and set on-click logic for unit switch
            binding.unitSwitch.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    binding.textViewIngredients.text = shownRecipe.ingredientsImperial.joinToString(separator = "\n")
                }
                else {
                    binding.textViewIngredients.text = shownRecipe.ingredientsMetric.joinToString(separator = "\n")
                }
            }

            // bind and set on-click logic for nutrient switch
            binding.nutrientSwitch.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    binding.macroNutrients.text = shownRecipe.macroNutrientsPercentage.joinToString(separator = "\n")
                    binding.vitamins.text = shownRecipe.vitaminsPercentage.joinToString(separator = "\n")
                }
                else {
                    binding.macroNutrients.text = shownRecipe.macroNutrientsAmount.joinToString(separator = "\n")
                    binding.vitamins.text = shownRecipe.vitaminsAmount.joinToString(separator = "\n")
                }
            }
        }
    }
}