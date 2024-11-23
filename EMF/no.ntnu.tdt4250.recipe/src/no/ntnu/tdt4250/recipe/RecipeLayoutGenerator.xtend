package no.ntnu.tdt4250.recipe

import no.ntnu.tdt4250.recipe.Page
import no.ntnu.tdt4250.recipe.Header
import no.ntnu.tdt4250.recipe.Ingredients
import no.ntnu.tdt4250.recipe.Instructions
import no.ntnu.tdt4250.recipe.Nutrients

class RecipeLayoutGenerator {
    
    def generateLayout(Page page) '''
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">
            
            «generateHeader(page.header)»
            
            <ScrollView
                android:layout_width="match_parent"
                android:layout_height="match_parent">
                
                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">
                    
                    «FOR section : page.section.sortBy[orderNumber]»
                        «generateSection(section)»
                    «ENDFOR»
                    
                </LinearLayout>
            </ScrollView>
        </LinearLayout>
    '''
    
    def generateHeader(Header header) '''
        <!-- Header Section -->
        <LinearLayout
            android:id="@+id/headerSection"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            
            <!-- Image and Title -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="16dp">
                
                «IF header.image !== null»
                <ImageView
                    android:id="@+id/recipeImage"
                    android:layout_width="150dp"
                    android:layout_height="150dp"
                    android:src="@drawable/ic_launcher_foreground"/>
                «ENDIF»
                <TextView
                    android:id="@+id/recipeTitle"
                    android:layout_width="0dp"
                    android:layout_height="150dp"
                    android:layout_weight="1"
                    «IF !header.recipetitle.stretch»
                    android:layout_marginStart="16dp"
					«ENDIF»
                    android:gravity="center"
                    android:autoSizeTextType="uniform"
                    android:autoSizeMinTextSize="12sp"
                    android:autoSizeMaxTextSize="30sp"
                    android:autoSizeStepGranularity="2sp"
                    android:padding="10dp"
                    android:background="@color/green"
                    android:text="@string/default_title"/>
            </LinearLayout>
            
            «IF header.basicinformation !== null»
            <!-- Time and Calories -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="16dp">
                
                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:orientation="horizontal">
                    
                    <ImageView
                        android:id="@+id/preparationTimeIcon"
                        android:layout_width="30dp"
                        android:layout_height="30dp"
                        android:src="@drawable/ic_prep_time"/>
                        
                    <TextView
                        android:id="@+id/recipePreparationTime"
                        android:layout_width="120dp"
                        android:layout_height="30dp"
                        android:layout_marginStart="16dp"
                        android:gravity="center"
                        android:textSize="16sp"
                        android:text="@string/default_preparation_time"/>
                </LinearLayout>
                
                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal">
                    
                    <ImageView
                        android:id="@+id/caloriesIcon"
                        android:layout_width="30dp"
                        android:layout_height="30dp"
                        android:src="@drawable/ic_calories"/>
                        
                    <TextView
                        android:id="@+id/calories"
                        android:layout_width="120dp"
                        android:layout_height="30dp"
                        android:layout_marginStart="16dp"
                        android:gravity="center"
                        android:textSize="16sp"
                        android:text="@string/default_calories"/>
                </LinearLayout>
            </LinearLayout>
            
            <View
                android:id="@+id/divider"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="?android:attr/listDivider"/>
            «ENDIF»
        </LinearLayout>
    '''
    
    def dispatch generateSection(Ingredients ingredients) '''
        <!-- Ingredients Section -->
        <LinearLayout
            android:id="@+id/ingredientsSection"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="16dp">
            
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal">
                
                <TextView
                    android:id="@+id/ingredientsHeadline"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:text="@string/ingredients_headline"/>
                
                «IF ingredients.unittoggle !== null»
                <androidx.appcompat.widget.SwitchCompat
                    android:id="@+id/unitSwitch"
                    android:layout_width="wrap_content"
                    android:layout_height="48dp"
                    android:checked="false"
                    android:text="@string/ingredients_switch_text_imperial"/>
                «ENDIF»
            </LinearLayout>
            
            <TextView
                android:id="@+id/textViewIngredients"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:textSize="16sp"
                android:text="@string/default_ingredients"/>
        </LinearLayout>
    '''
    
    def dispatch generateSection(Instructions instructions) '''
        <!-- Instructions Section -->
        <LinearLayout
            android:id="@+id/instructionsSection"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="16dp">
            
            <TextView
                android:id="@+id/instructionsHeadline"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textSize="18sp"
                android:textStyle="bold"
                android:text="@string/instructions_headline"/>
            
            <TextView
                android:id="@+id/instructions"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:textSize="16sp"
                android:text="@string/default_instructions"/>
        </LinearLayout>
    '''
    
    def dispatch generateSection(Nutrients nutrients) '''
    <!-- Nutrients Section -->
    <LinearLayout
        android:id="@+id/nutrientsSection"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp">

        <!-- Header row with Nutrients title and toggle -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center_vertical">

            <TextView
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:textSize="20sp"
                android:textStyle="bold"
                android:text="Nutrients"/>

            «IF nutrients.percentagetoggle !== null»
                <androidx.appcompat.widget.SwitchCompat
                    android:id="@+id/nutrientSwitch"
                    android:layout_width="wrap_content"
                    android:layout_height="48dp"
                    android:checked="false"
                    android:text="@string/nutrient_switch_text_amount"/>
            «ENDIF»
        </LinearLayout>

        «IF nutrients.macronutrients !== null»
            <!-- Macros Section -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_marginTop="16dp">

                <TextView
                    android:id="@+id/macroNutrientsHeadline"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:text="@string/macro_nutrients_headline"/>

                <TextView
                    android:id="@+id/macroNutrients"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:textSize="16sp"
                    android:text="@string/default_macro_nutrients"/>
            </LinearLayout>
        «ENDIF»

        «IF nutrients.vitamins !== null»
            <!-- Vitamins Section -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_marginTop="16dp">

                <TextView
                    android:id="@+id/vitaminsHeadline"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:text="@string/vitamins_headline"/>

                <TextView
                    android:id="@+id/vitamins"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:textSize="16sp"
                    android:text="@string/default_vitamins"/>
            </LinearLayout>
        «ENDIF»
    </LinearLayout>
'''
}