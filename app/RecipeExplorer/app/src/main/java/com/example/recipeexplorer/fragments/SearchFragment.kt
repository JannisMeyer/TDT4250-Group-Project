package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.recipeexplorer.R
import com.example.recipeexplorer.databinding.FragmentSearchBinding
import com.example.recipeexplorer.querying.FetchedRecipes
import fetchRecipes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

//import com.example.recipeexplorer.fragments.A

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private var searchParameters : MutableList<String>? = mutableListOf()
    private lateinit var diet : String
    private lateinit var type : String
    private var fetchedRecipes = FetchedRecipes.getInstance()


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ) : View {

        // bind this fragment to corresponding ui
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

        // setup search button logic
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            // setup search button logic
            binding.searchButton.setOnClickListener { button ->

                // show loading animation
                binding.progressBar.visibility = View.VISIBLE
                val thisButton = button as Button
                thisButton.text = ""
                thisButton.isEnabled = false

                lifecycleScope.launch {
                    val maxReadyTime = 30
                    val calories = 500
                    var dietType = "vegetarian"
                    val servings = 4
                    val sortingType = "popularity"
                    val nr = 2 // Number of recipes to fetch
                    dietType = diet

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

        // get spinners from binding
        val typeSpinner = _binding?.typeSpinner
        val dietSpinner = _binding?.dietSpinner

        // setup type spinner
        val typeAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listOf("main dish", "salad", "cake")
        )
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        if (typeSpinner != null) {
            typeSpinner.adapter = typeAdapter
        }

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

        // setup type spinner logic
        typeSpinner?.setSelection(0)
        if (typeSpinner != null) {
            typeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
                    type = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // handle no selection
                }
            }
        }
    }
}