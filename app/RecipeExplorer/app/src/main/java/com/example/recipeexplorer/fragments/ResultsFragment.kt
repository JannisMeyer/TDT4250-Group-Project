package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeexplorer.R
import com.example.recipeexplorer.adapter.ResultsAdapter
import com.example.recipeexplorer.databinding.FragmentResultsBinding
import com.example.recipeexplorer.querying.FetchedRecipes
import com.example.recipeexplorer.querying.Recipe

interface OnItemClickListener {
    fun onItemClicked(item: Recipe)
}

class ResultsFragment : Fragment(), OnItemClickListener {

    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!

    private var fetchedRecipes = FetchedRecipes.getInstance()

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

        //supply recyclerView with actual recipe data
        val recyclerView = binding.resultsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = fetchedRecipes?.recipes?.let { ResultsAdapter(it, this) }
    }

    override fun onItemClicked(item: Recipe) {

        Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()

        // pass id of clicked recipe and launch detailed view fragment
        val targetFragment = DetailedResultFragment().apply {
            arguments = Bundle().apply {
                putString("ID", item.id.toString())
            }
        }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, targetFragment)
            .addToBackStack(null)
            .commit()
    }
}