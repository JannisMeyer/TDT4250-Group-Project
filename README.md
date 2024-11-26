# TDT4250-Group-Project
## Description
This is a modelling project using EMF to model and generate code for an android application. The app is called **RecipeExplorer** and lets you explore recipes based on different filtering-criterea. What is modelled and generated is the detailed recipe page that appears when you click on a search-result. This page contains different information about the recipe. The metamodel and dsl-syntax enables you to customize the appearance of the page with regards to what information is displayed and where.

We have used **ecore** for making the metamodel, **xtext** for defining a concrete syntax, and **xtend** for generating code (both kotlin and xml).

The generated code concists of 3 files:
* `fragment_detailed_result_generated.xml`: UI-file similar to HTML. Defines the UI of the recipe details page.
* `DetailedResultFragmentGenerated.kt`: Logic for the UI-file. 
* `API_GET_Data_Generated.kt`: API-logic. Which vitamins to show is defined here.

## Project structure
The project is divided in two; one folder for the EMF files, and one containing the android application. 
### EMF
The EMF-folder contains a bunch of plugin-projects, most notably
* `no.ntnu.4250.recipe`: holds ecore-model code, defining the metamodel
* `no.ntnu.4250.recipe.dsl`: contains xtext code that defines a syntax for our DSL
* `no.ntnu.4250.recipe.generator`: contains xtend code for code generation and script for moving files
### App

## Walkthrough
### Making a model
1. Open the `EMF`-folder in Eclipse
2. Open the Runtime Workbench (e.g. by right-clicking the `no.ntnu.4250.recipe` project and clicking **Run As** -> **Eclipse Application**)
3. In the new window, open the `no.ntnu.4250.recipe.generator` project
4. Right-click on the project and click **New** -> **File**
5. Name your model and make sure it ends with `.recipedsl`. Click **Finish**
6. The file is probably going to open in the regular **Text Editor**, but we want to open the file in **RecipeDSL Editor**. Close the Text Editor window and right-click on your `.recipedsl`-file. Click **Open With** -> **RecipeDSL Editor**
7. Create a model! The syntax is described in `recipedsl_grammar_guide.md`

**NB**: It is important that your `.recipedsl`-file is saved in the `no.ntnu.4250.recipe.generator` project for code-generation to work. If it isn't, move it here.

### Generating code
1. Go back to the standard version of Eclipse and navigate into `no.ntnu.4250.recipe.generator/src/no.ntnu.4250.recipe.generator`
2. Open `GeneratorRunner.xtend`
3. Edit line 21 (`val model = "standard.recipedsl"`). Replace `standard.recipedsl` with the filename your new model.
4. Right-click `GeneratorRunner.xtend` and click **Run As** -> **Java Application**. This will generate the neceassary files and place them in `generated` folder.
5. Open a terminal in the root directory of the `no.ntnu.4250.recipe.generator` project
6. Run `./move-files.sh`. This will move all the generated files into correct locations in the android project.

### Running the app
1. Open the `RecipeExplorer` project (under `app`) in Android Studio
2. Run the app on a android emulator or locally on your android phone
