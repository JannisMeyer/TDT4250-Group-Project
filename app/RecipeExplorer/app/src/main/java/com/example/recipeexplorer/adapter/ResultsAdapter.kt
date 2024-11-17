package com.example.recipeexplorer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeexplorer.R
import com.example.recipeexplorer.fragments.ResultsFragment
import com.example.recipeexplorer.querying.Recipe

class ResultsAdapter(private val data: List<Recipe>,
                     private val listener: ResultsFragment
) : RecyclerView.Adapter<ResultsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): ResultsAdapter.ViewHolder {

        //create view of list
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.result_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        //return number of items the recycler view has to display
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //display concrete item of recycler view as title of corresponding recipe
        val item: Recipe = data[position]
        holder.recipeTitle.text = item.title

        // set on-click logic,call listener from corresponding fragment
        holder.itemView.setOnClickListener {
            listener.onItemClicked(item)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //connect recycler view item with recipe title as button
        var recipeTitle: TextView = itemView.findViewById(R.id.recipe_title)
    }
}