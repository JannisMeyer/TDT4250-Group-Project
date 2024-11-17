package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeexplorer.adapter.ResultsAdapter
import com.example.recipeexplorer.databinding.FragmentResultsBinding

class ResultsFragment : Fragment() {

    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View {

        // bind this fragment to corresponding ui
        _binding = FragmentResultsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.resultsRecyclerView
        recyclerView.adapter?.notifyDataSetChanged()

        showResults()
    }

    private fun showResults() {

        lateinit var recipes:MutableList<Recipe>

        //supply recyclerView with actual recipe data
        val recyclerView = binding.resultsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ResultsAdapter(recipes)
    }
}