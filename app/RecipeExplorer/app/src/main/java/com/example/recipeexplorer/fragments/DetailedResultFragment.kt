package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeexplorer.databinding.FragmentDetailedResultBinding
import com.example.recipeexplorer.querying.FetchedRecipes
import com.example.recipeexplorer.querying.Recipe

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

        if (shownRecipe != null) {

            // pass recipe data to UI
            binding.recipeTitle.text = shownRecipe.title
            binding.recipeImage.imageAlpha = shownRecipe.image
            binding.recipePreparationTime.text = shownRecipe.preparationTime.toString()
            binding.calories.text = shownRecipe.calories.toString()
            binding.textViewIngredients.text = shownRecipe.ingredientsMetric.toString()
            binding.instructions.text = shownRecipe.instructions
            binding.macroNutrients.text = shownRecipe.macroNutrientsAmount.toString()
            binding.microNutrients.text = shownRecipe.microNutrientsAmount.toString()

            // bind and set on-click logic for unit switch
            binding.unitSwitch.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    binding.textViewIngredients.text = shownRecipe.ingredientsImperial.toString()
                }
                else {
                    binding.textViewIngredients.text = shownRecipe.ingredientsMetric.toString()
                }
            }

            // bind and set on-click logic for nutrient switch
            binding.nutrientSwitch.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    binding.macroNutrients.text = shownRecipe.macroNutrientsPercentage.toString()
                    binding.microNutrients.text = shownRecipe.microNutrientsPercentage.toString()
                }
                else {
                    binding.macroNutrients.text = shownRecipe.macroNutrientsAmount.toString()
                    binding.microNutrients.text = shownRecipe.microNutrientsAmount.toString()
                }
            }
        }
    }
}