package com.example.recipeexplorer.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeexplorer.R
import com.example.recipeexplorer.fragments.DetailedResultFragment
import com.example.recipeexplorer.querying.Recipe

class ResultsAdapter (private val data: List<Recipe>) : RecyclerView.Adapter<ResultsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultsAdapter.ViewHolder {

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
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private val context: Context = itemView.context

        //connect recycler view item with recipe title as button
        var recipeTitle: TextView = itemView.findViewById(R.id.recipe_title)

        init {

            //set on-click logic for an item
            recipeTitle.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {

            //create intent and send recipe id of clicked recipe along
            val intent = Intent(context, DetailedResultFragment::class.java)

            val recipeId: Int = data[adapterPosition].id
            val recipeTitle: Int = data[adapterPosition].id

            val extras = Bundle().apply {
                putString("ID", recipeId.toString())
            }

            // open detailed view of recipe
            intent.putExtras(extras)
            context.startActivity(intent)
        }
    }
}