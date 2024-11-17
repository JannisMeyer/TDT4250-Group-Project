package com.example.recipeexplorer.querying

class Recipe (

    // base information
    var id: Int = 0,
    var type: String,
    var title: String,
    var image: Int,
    var ingredientsMetric: List<String>,
    var ingredientsImperial: List<String>,
    var instructions: String,
    var portions: Int,
    var preparationTime: Int,
    var healthScore: Int,
    var calories: Int,

    // extra information
    var macroNutrientsAmount: List<String>,
    var microNutrientsAmount: List<String>,
    var macroNutrientsPercentage: List<String>,
    var microNutrientsPercentage: List<String>
)