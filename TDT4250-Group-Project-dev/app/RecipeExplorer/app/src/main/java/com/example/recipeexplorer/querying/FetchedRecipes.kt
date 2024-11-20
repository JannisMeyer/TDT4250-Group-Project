package com.example.recipeexplorer.querying

class FetchedRecipes {

    companion object {
        @Volatile
        private var instance : FetchedRecipes? = null

        // infer singleton behaviour
        fun getInstance(): FetchedRecipes? {

            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = FetchedRecipes()
                    }
                }
            }
            return instance
        }
    }

    var recipes = mutableListOf<Recipe>()
}