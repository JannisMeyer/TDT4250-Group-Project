# TDT4250-Group-Project
## Description
## Project structure
The project is divided in two; one folder for the EMF files, and one containing the android application. 
### EMF
The EMF-folder contains a bunch of plugin-projects, most notably
* **no.ntnu.4250.recipe**: holds ecore-model code, defining the metamodel
* **no.ntnu.4250.recipe.dsl**: contains xtext code that defines a syntax for our DSL
* **no.ntnu.4250.recipe.generator**: contains xtend code for code generation and script for moving files
### App

## Walkthrough
### Instantiating a model
1. Open the "EMF"-folder in Eclipse
2. Open the Runtime Workbench (e.g. by right-clicking the **no.ntnu.4250.recipe** project and clicking **Run As** -> **Eclipse Application**)
3. In the new window, open the **no.ntnu.4250.recipe.generator** project
4. Right-click on the project and click **New** -> **File**
5. Name your model and make sure it ends with **_.recipedsl_**. Click **Finish**
6. The file is probably going to open in the regular **Text Editor**, but we want to open the file in **RecipeDSL Editor**. Close the Text Editor window and right-click on your **_.recipedsl_**-file. Click **Open With** -> **RecipeDSL Editor**
