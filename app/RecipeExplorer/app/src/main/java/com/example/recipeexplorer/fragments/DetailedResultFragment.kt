package com.example.recipeexplorer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeexplorer.databinding.FragmentDetailedResultBinding
import com.example.recipeexplorer.databinding.FragmentResultsBinding

class DetailedResultFragment : Fragment() {

    private var _binding: FragmentDetailedResultBinding? = null
    private val binding get() = _binding!!

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


    }
}