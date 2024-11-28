import kotlinx.coroutines.runBlocking
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import okhttp3.*
import java.io.IOException
import com.example.recipeexplorer.querying.Recipe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// Ensure you have the following dependencies in your build.gradle:
// implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")
// implementation("com.squareup.okhttp3:okhttp:4.9.1")
// implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
// implementation ("org.jetbrains.kotlin:kotlin-reflect:1.9.23")

@Serializable
data class ExtendedIngredient(
    val id: Int,
    val name: String,
    val amountMetric: Double,
    val unitMetric: String,
    val amountUS: Double,
    val unitUS: String
)

@Serializable
data class RecipeResult(
    val id: Int,
    val title: String,
    val image: String
)

@Serializable
data class RecipeInformation(
    val id: Int,
    val title: String,
    val image: String,
    val servings: Int,
    val instructions: String?,
    val readyInMinutes: Int,
    val dishTypes: List<String>,
    val extendedIngredients: List<ExtendedIngredient>,
    val nutrients: List<Nutrient>
)

@Serializable
data class Nutrient(
    val name: String,
    val amount: Double,
    val unit: String,
    val percentOfDailyNeeds: Double
)

// Simulated database
val recipeDatabase = mutableMapOf<Int, RecipeData>()

data class RecipeData(
    val id: Int,
    val title: String,
    val ingredients: List<ExtendedIngredient>,
    val instructions: String?,
    val nutrients: Map<String, Double>,
    val image: String,
    val servings: Int
)

val client = OkHttpClient()
val json = Json { ignoreUnknownKeys = true }

// Replace with your actual API key
//3e4cbd540c674e369b64deff2fcb5d3c
val apiKey = "8b95563fe6c84ce990610ca3e673a9ea"

suspend fun getRecipeIDs(
    maxReadyTime: Int?,
    calories: Int?,
    dietType: String?,
    servings: Int?,
    sortingType: String?,
    number: Int = 2
): List<Int> = withContext(Dispatchers.IO) {
    val urlBuilder = HttpUrl.Builder()
        .scheme("https")
        .host("api.spoonacular.com")
        .addPathSegments("recipes/complexSearch")
        .addQueryParameter("apiKey", apiKey)
        .addQueryParameter("number", number.toString())

    if (maxReadyTime != null) {
        urlBuilder.addQueryParameter("maxReadyTime", maxReadyTime.toString())
    }
    if (calories != null) {
        urlBuilder.addQueryParameter("maxCalories", calories.toString())
    }
    if (dietType != null) {
        urlBuilder.addQueryParameter("diet", dietType)
    }
    if (servings != null) {
        urlBuilder.addQueryParameter("servings", servings.toString())
    }
    if (sortingType != null) {
        urlBuilder.addQueryParameter("sort", sortingType)
    }

    val url = urlBuilder.build().toString()

    val request = Request.Builder()
        .url(url)
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) {
            throw IOException("Unexpected code $response")
        }

        val responseBody = response.body?.string()
        if (responseBody != null) {
            val results = json.decodeFromString<JsonObject>(responseBody)["results"]?.jsonArray
            results?.map { it.jsonObject["id"]!!.jsonPrimitive.int } ?: emptyList()
        } else {
            emptyList()
        }
    }
}

suspend fun getRecipeInformation(recipeId: Int): RecipeInformation? {
    val url = HttpUrl.Builder()
        .scheme("https")
        .host("api.spoonacular.com")
        .addPathSegments("recipes/$recipeId/information")
        .addQueryParameter("apiKey", apiKey)
        .addQueryParameter("includeNutrition", "true")
        .build()
        .toString()

    val request = Request.Builder()
        .url(url)
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) {
            println("Failed to get recipe information for recipe ID: $recipeId")
            return null
        }

        val responseBody = response.body?.string()
        if (responseBody != null) {
            val jsonObject = json.decodeFromString<JsonObject>(responseBody)
            val extendedIngredients = jsonObject["extendedIngredients"]?.jsonArray?.map {
                val ingredient = it.jsonObject
                ExtendedIngredient(
                    id = ingredient["id"]!!.jsonPrimitive.int,
                    name = ingredient["name"]!!.jsonPrimitive.content,
                    amountMetric = ingredient["measures"]!!.jsonObject["metric"]!!.jsonObject["amount"]!!.jsonPrimitive.double,
                    unitMetric = ingredient["measures"]!!.jsonObject["metric"]!!.jsonObject["unitLong"]!!.jsonPrimitive.content,
                    amountUS = ingredient["measures"]!!.jsonObject["us"]!!.jsonObject["amount"]!!.jsonPrimitive.double,
                    unitUS = ingredient["measures"]!!.jsonObject["us"]!!.jsonObject["unitLong"]!!.jsonPrimitive.content
                )
            } ?: emptyList()

            val nutrients = jsonObject["nutrition"]?.jsonObject?.get("nutrients")?.jsonArray?.map {
                val nutrient = it.jsonObject
                Nutrient(
                    name = nutrient["name"]!!.jsonPrimitive.content,
                    amount = nutrient["amount"]!!.jsonPrimitive.double,
                    unit = nutrient["unit"]!!.jsonPrimitive.content,
                    percentOfDailyNeeds = nutrient["percentOfDailyNeeds"]!!.jsonPrimitive.double
                )
            } ?: emptyList()

            val readyInMinutes = jsonObject["readyInMinutes"]!!.jsonPrimitive.int
            val dishTypes = jsonObject["dishTypes"]?.jsonArray?.map { it.jsonPrimitive.content } ?: emptyList()

            return RecipeInformation(
                id = jsonObject["id"]!!.jsonPrimitive.int,
                title = jsonObject["title"]!!.jsonPrimitive.content,
                image = jsonObject["image"]!!.jsonPrimitive.content,
                servings = jsonObject["servings"]!!.jsonPrimitive.int,
                instructions = jsonObject["instructions"]?.jsonPrimitive?.content,
                readyInMinutes = readyInMinutes,
                dishTypes = dishTypes,
                extendedIngredients = extendedIngredients,
                nutrients = nutrients
            )
        } else {
            return null
        }
    }
}

fun extractRecipeData(recipeInfo: RecipeInformation): RecipeData {
    val nutrientsMap = recipeInfo.nutrients.associate { it.name to it.amount }

    val recipeData = RecipeData(
        id = recipeInfo.id,
        title = recipeInfo.title,
        ingredients = recipeInfo.extendedIngredients,
        instructions = recipeInfo.instructions,
        nutrients = nutrientsMap,
        image = recipeInfo.image,
        servings = recipeInfo.servings
    )

    // Store in simulated database
    recipeDatabase[recipeInfo.id] = recipeData

    return recipeData
}

fun get(recipeId: Int, propertyName: String, isMetric: Boolean = true): String {
    val recipeData = recipeDatabase[recipeId]

    return if (recipeData != null) {
        when (propertyName.lowercase()) {
            "ingredients" -> recipeData.ingredients.joinToString(separator = "\n") { ingredient ->
                if (isMetric) {
                    "${ingredient.amountMetric} ${ingredient.unitMetric} ${ingredient.name}"
                } else {
                    "${ingredient.amountUS} ${ingredient.unitUS} ${ingredient.name}"
                }
            }
            else -> recipeData.nutrients[propertyName]?.toString()
                ?: "Property '$propertyName' is null for recipe ID $recipeId."
        }
    } else {
        "Recipe ID $recipeId not found in the database."
    }
}

suspend fun getNewRecipeId(idList: List<Int>): Int {
    var newRecipeId: Int? = null
    while (newRecipeId == null) {
        val randomRecipeIds = getRecipeIDs(null, null, null, null, null)
        newRecipeId = randomRecipeIds.find { it !in idList }
        if (newRecipeId != null) {
            val recipeInfo = getRecipeInformation(newRecipeId)
            if (recipeInfo != null) {
                extractRecipeData(recipeInfo)
            } else {
                newRecipeId = null
            }
        }
    }
    return newRecipeId
}

fun convertToRecipe(recipeInfo: RecipeInformation): Recipe {
    val id = recipeInfo.id
    val type = if (recipeInfo.dishTypes.isNotEmpty()) recipeInfo.dishTypes.first() else "Unknown"
    val title = recipeInfo.title
    val image = recipeInfo.image
    val ingredientsMetric = recipeInfo.extendedIngredients.map {
        "${it.amountMetric} ${it.unitMetric} ${it.name}"
    }
    val ingredientsImperial = recipeInfo.extendedIngredients.map {
        "${it.amountUS} ${it.unitUS} ${it.name}"
    }
    val instructions = recipeInfo.instructions ?: "No instructions provided."
    val portions = recipeInfo.servings
    val preparationTime = recipeInfo.readyInMinutes
    val calories = recipeInfo.nutrients.find { it.name.equals("Calories", ignoreCase = true) }?.amount?.toInt() ?: 0

    val macroNutrientsNames = listOf("Protein", "Fat", "Carbohydrates")
    val vitaminsNames = listOf(
	            "Vitamin A", 
	            "Vitamin B1", 
	            "Vitamin C"
    )

    val macroNutrientsAmount = recipeInfo.nutrients.filter { it.name in macroNutrientsNames }
        .map { "${it.amount}${it.unit} ${it.name}" }
    val vitaminsAmount = if (vitaminsNames.isEmpty()) {
        emptyList()
    } else {
        recipeInfo.nutrients.filter { it.name in vitaminsNames }
            .map { "${it.amount}${it.unit} ${it.name}" }
    }

    val macroNutrientsPercentage = recipeInfo.nutrients.filter { it.name in macroNutrientsNames }
        .map { "${it.percentOfDailyNeeds}% ${it.name}" }
    val vitaminsPercentage = if (vitaminsNames.isEmpty()) {
        emptyList()
    } else {
        recipeInfo.nutrients.filter { it.name in vitaminsNames }
            .map { "${it.percentOfDailyNeeds}% ${it.name}" }
    }

    return Recipe(
        id = id,
        type = type,
        title = title,
        image = image,
        ingredientsMetric = ingredientsMetric,
        ingredientsImperial = ingredientsImperial,
        instructions = instructions,
        portions = portions,
        preparationTime = preparationTime,
        calories = calories,
        macroNutrientsAmount = macroNutrientsAmount,
        vitaminsAmount = vitaminsAmount,
        macroNutrientsPercentage = macroNutrientsPercentage,
        vitaminsPercentage = vitaminsPercentage
    )
}

suspend fun fetchRecipes(
    maxReadyTime: Int?,
    calories: Int?,
    dietType: String?,
    servings: Int?,
    sortingType: String?,
    nr: Int
): List<Recipe> {
    val recipeIds = getRecipeIDs(maxReadyTime, calories, dietType, servings, sortingType, nr)
    val recipes = mutableListOf<Recipe>()

    for (id in recipeIds) {
        val recipeInfo = getRecipeInformation(id)
        if (recipeInfo != null) {
            val recipe = convertToRecipe(recipeInfo)
            recipes.add(recipe)
        }
    }
    return recipes
}

fun mainPLSSS() = runBlocking {
    val maxReadyTime = 30
    val calories = 500
    val dietType = "vegetarian"
    val servings = 4
    val sortingType = "popularity"
    val nr = 5 // Number of recipes to fetch

    try {
        // Fetch recipes
        val fetchedRecipes: MutableList<Recipe> = fetchRecipes(
            maxReadyTime,
            calories,
            dietType,
            servings,
            sortingType,
            nr
        ).toMutableList()

    }catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }
}
