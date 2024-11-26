#!/bin/bash

# move-files.sh

# Path to Android project (adjust this to match your setup)
ANDROID_PROJECT="../../app/RecipeExplorer"

# Path to your generated files
GENERATED_DIR="src/generated"

# Create directories if they don't exist
mkdir -p "$ANDROID_PROJECT/app/src/main/res/layout"
mkdir -p "$ANDROID_PROJECT/app/src/main/java/com/example/recipeexplorer/fragments"

# Copy files
echo "Moving files to Android project..."

# Layout file
if [ -f "$GENERATED_DIR/fragment_detailed_result_generated.xml" ]; then
    cp "$GENERATED_DIR/fragment_detailed_result_generated.xml" \
       "$ANDROID_PROJECT/app/src/main/res/layout/"
    echo "Moved fragment_detailed_result_generated.xml"
else
    echo "Warning: fragment_detailed_result_generated.xml not found"
fi

# Fragment file
if [ -f "$GENERATED_DIR/DetailedResultFragmentGenerated.kt" ]; then
    cp "$GENERATED_DIR/DetailedResultFragmentGenerated.kt" \
       "$ANDROID_PROJECT/app/src/main/java/com/example/recipeexplorer/fragments/"
    echo "Moved DetailedResultFragmentGenerated.kt"
else
    echo "Warning: DetailedResultFragmentGenerated.kt not found"
fi

# API file
if [ -f "$GENERATED_DIR/API_GET_Data_Generated.kt" ]; then
    cp "$GENERATED_DIR/API_GET_Data_Generated.kt" \
       "$ANDROID_PROJECT/app/src/main/java/com/example/recipeexplorer/fragments/"
    echo "Moved API_GET_Data_Generated.kt"
else
    echo "Warning: API_GET_Data_Generated.kt not found"
fi

echo "File moving complete!"