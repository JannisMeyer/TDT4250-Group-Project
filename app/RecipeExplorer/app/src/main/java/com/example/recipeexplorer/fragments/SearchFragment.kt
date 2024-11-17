package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.recipeexplorer.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

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

        // get search button from binding
        val searchButton = binding.searchButton

        // setup search button logic
        searchButton.setOnClickListener {

        }

        // get spinners from binding
        val typeSpinner = _binding?.typeSpinner
        val dietSpinner = _binding?.dietSpinner

        // setup type spinner
        val typeAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listOf("omnivore", "vegetarian", "vegan")
        )
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        if (typeSpinner != null) {
            typeSpinner.adapter = typeAdapter
        }

        // setup diet spinner
        val dietAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listOf("main dish", "salad", "cake")
        )
        dietAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        if (dietSpinner != null) {
            dietSpinner.adapter = dietAdapter
        }

        // setup type spinner logic
        if (typeSpinner != null) {
            typeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    // handle selection
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // handle no selection
                }
            }
        }

        // setup diet spinner logic
        if (dietSpinner != null) {
            dietSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    // handle selection
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // handle no selection
                }
            }
        }
    }
}