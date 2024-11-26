package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.recipeexplorer.R
import com.example.recipeexplorer.databinding.FragmentSearchBinding
import com.example.recipeexplorer.querying.FetchedRecipes
import fetchRecipes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private var searchParameters : MutableList<String>? = mutableListOf()
    private lateinit var diet : String
    private var fetchedRecipes = FetchedRecipes.getInstance()


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ) : View {

        // bind this fragment to corresponding ui
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // setup search button logic
        binding.searchButton.setOnClickListener { button ->

            val maxReadyTime = _binding?.inputPreparationTime?.text.toString().toIntOrNull()
            val calories = _binding?.inputCalories?.text.toString().toIntOrNull()
            val dietType = diet
            val servings = _binding?.inputServings?.text.toString().toIntOrNull()
            val sortingType = "popularity"
            val nr = _binding?.inputNumberOfRecipes?.text.toString()
                .toIntOrNull() // Number of recipes to fetch

            var validInput = true

            if (maxReadyTime != null) {
                if (maxReadyTime > 250 || maxReadyTime < 5) {
                    validInput = false
                    Toast.makeText(context, "Invalid Preparation Time!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            if (calories != null) {
                if (calories > 4000 || calories < 5) {
                    validInput = false
                    Toast.makeText(context, "Invalid Calories!", Toast.LENGTH_SHORT).show()
                }
            }
            if (servings != null) {
                if (servings > 20 || servings < 1) {
                    validInput = false
                    Toast.makeText(context, "Invalid Number of Servings!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            if (nr == null || nr > 20 || nr < 1) {
                validInput = false
                Toast.makeText(context, "Invalid Number of Recipes!", Toast.LENGTH_SHORT)
                    .show()
            }

            if (validInput && nr != null) {

                // show loading animation
                binding.progressBar.visibility = View.VISIBLE
                val thisButton = button as Button
                thisButton.text = ""
                thisButton.isEnabled = false

                lifecycleScope.launch {

                    // Fetch recipes on the IO dispatcher
                    fetchedRecipes?.recipes = withContext(Dispatchers.IO) {
                        fetchRecipes(
                            maxReadyTime,
                            calories,
                            dietType,
                            servings,
                            sortingType,
                            nr
                        )
                    }.toMutableList()
                    Log.d("t", "Fetched Recipes: ${fetchedRecipes?.recipes?.get(0)?.title}")

                    // After fetching, navigate to ResultsFragment
                    val newFragment = ResultsFragment()

                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, newFragment)
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        // get diet spinner
        val dietSpinner = _binding?.dietSpinner

        // setup diet spinner
        val dietAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listOf("omnivore", "vegetarian", "vegan")
        )
        dietAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        if (dietSpinner != null) {
            dietSpinner.adapter = dietAdapter
        }

        // setup diet spinner logic
        dietSpinner?.setSelection(0)
        if (dietSpinner != null) {
            dietSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    // add selected option to search parameters
                    searchParameters?.add(parent?.getItemAtPosition(position).toString())
                    diet = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // handle no selection
                }
            }
        }
    }
}

