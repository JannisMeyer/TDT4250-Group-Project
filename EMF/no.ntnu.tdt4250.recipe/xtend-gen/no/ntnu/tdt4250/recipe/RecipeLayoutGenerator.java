package no.ntnu.tdt4250.recipe;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class RecipeLayoutGenerator {
  public CharSequence generateLayout(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:orientation=\"vertical\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateHeader = this.generateHeader(page.getHeader());
    _builder.append(_generateHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<ScrollView");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"match_parent\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:orientation=\"vertical\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    {
      final Function1<Section, Integer> _function = (Section it) -> {
        return Integer.valueOf(it.getOrderNumber());
      };
      List<Section> _sortBy = IterableExtensions.<Section, Integer>sortBy(page.getSection(), _function);
      for(final Section section : _sortBy) {
        _builder.append("            ");
        CharSequence _generateSection = this.generateSection(section);
        _builder.append(_generateSection, "            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</LinearLayout>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</ScrollView>");
    _builder.newLine();
    _builder.append("</LinearLayout>");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateHeader(final Header header) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Header Section -->");
    _builder.newLine();
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/headerSection\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:orientation=\"vertical\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- Image and Title -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:orientation=\"horizontal\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:padding=\"16dp\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    {
      Image _image = header.getImage();
      boolean _tripleNotEquals = (_image != null);
      if (_tripleNotEquals) {
        _builder.append("        ");
        _builder.append("<ImageView");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:id=\"@+id/recipeImage\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"150dp\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"150dp\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:src=\"@drawable/ic_launcher_foreground\"/>");
        _builder.newLine();
      }
    }
    _builder.append("        ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:id=\"@+id/recipeTitle\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"0dp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"150dp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_weight=\"1\"");
    _builder.newLine();
    {
      boolean _isStretch = header.getRecipetitle().isStretch();
      boolean _not = (!_isStretch);
      if (_not) {
        _builder.append("            ");
        _builder.append("android:layout_marginStart=\"16dp\"");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    _builder.append("android:gravity=\"center\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:autoSizeTextType=\"uniform\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:autoSizeMinTextSize=\"12sp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:autoSizeMaxTextSize=\"30sp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:autoSizeStepGranularity=\"2sp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:padding=\"10dp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:background=\"@color/green\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:text=\"@string/default_title\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</LinearLayout>");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      BasicInformation _basicinformation = header.getBasicinformation();
      boolean _tripleNotEquals_1 = (_basicinformation != null);
      if (_tripleNotEquals_1) {
        _builder.append("    ");
        _builder.append("<!-- Time and Calories -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<LinearLayout");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:orientation=\"horizontal\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:padding=\"16dp\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<LinearLayout");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"0dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_weight=\"1\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:orientation=\"horizontal\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("<ImageView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:id=\"@+id/preparationTimeIcon\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_width=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_height=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:src=\"@drawable/ic_prep_time\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:id=\"@+id/recipePreparationTime\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_width=\"120dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_height=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_marginStart=\"16dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:gravity=\"center\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:textSize=\"16sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:text=\"@string/default_preparation_time\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("</LinearLayout>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<LinearLayout");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:orientation=\"horizontal\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("<ImageView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:id=\"@+id/caloriesIcon\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_width=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_height=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:src=\"@drawable/ic_calories\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:id=\"@+id/calories\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_width=\"120dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_height=\"30dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:layout_marginStart=\"16dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:gravity=\"center\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:textSize=\"16sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("android:text=\"@string/default_calories\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("</LinearLayout>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("</LinearLayout>");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<View");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:id=\"@+id/divider\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"1dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:background=\"?android:attr/listDivider\"/>");
        _builder.newLine();
      }
    }
    _builder.append("</LinearLayout>");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSection(final Ingredients ingredients) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Ingredients Section -->");
    _builder.newLine();
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/ingredientsSection\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:orientation=\"vertical\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:padding=\"16dp\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:orientation=\"horizontal\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:id=\"@+id/ingredientsHeadline\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"0dp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_weight=\"1\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:textSize=\"18sp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:textStyle=\"bold\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:text=\"@string/ingredients_headline\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    {
      UnitOfMeasure _unittoggle = ingredients.getUnittoggle();
      boolean _tripleNotEquals = (_unittoggle != null);
      if (_tripleNotEquals) {
        _builder.append("        ");
        _builder.append("<androidx.appcompat.widget.SwitchCompat");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:id=\"@+id/unitSwitch\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"wrap_content\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"48dp\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:checked=\"false\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:text=\"@string/ingredients_switch_text_imperial\"/>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</LinearLayout>");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/textViewIngredients\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_marginTop=\"8dp\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:textSize=\"16sp\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:text=\"@string/default_ingredients\"/>");
    _builder.newLine();
    _builder.append("</LinearLayout>");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSection(final Instructions instructions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Instructions Section -->");
    _builder.newLine();
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/instructionsSection\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:orientation=\"vertical\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:padding=\"16dp\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/instructionsHeadline\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:textSize=\"18sp\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:textStyle=\"bold\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:text=\"@string/instructions_headline\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/instructions\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_marginTop=\"8dp\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:textSize=\"16sp\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:text=\"@string/default_instructions\"/>");
    _builder.newLine();
    _builder.append("</LinearLayout>");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSection(final Nutrients nutrients) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Nutrients Section -->");
    _builder.newLine();
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:id=\"@+id/nutrientsSection\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:orientation=\"vertical\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:padding=\"16dp\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- Header row with Nutrients title and toggle -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<LinearLayout");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:orientation=\"horizontal\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:gravity=\"center_vertical\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<TextView");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_width=\"0dp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:layout_weight=\"1\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:textSize=\"20sp\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:textStyle=\"bold\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("android:text=\"Nutrients\"/>");
    _builder.newLine();
    _builder.newLine();
    {
      PercentageAmountToggle _percentagetoggle = nutrients.getPercentagetoggle();
      boolean _tripleNotEquals = (_percentagetoggle != null);
      if (_tripleNotEquals) {
        _builder.append("        ");
        _builder.append("<androidx.appcompat.widget.SwitchCompat");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:id=\"@+id/nutrientSwitch\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"wrap_content\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"48dp\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:checked=\"false\"");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("android:text=\"@string/nutrient_switch_text_amount\"/>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</LinearLayout>");
    _builder.newLine();
    _builder.newLine();
    {
      Macronutrients _macronutrients = nutrients.getMacronutrients();
      boolean _tripleNotEquals_1 = (_macronutrients != null);
      if (_tripleNotEquals_1) {
        _builder.append("    ");
        _builder.append("<!-- Macros Section -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<LinearLayout");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:orientation=\"vertical\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_marginTop=\"16dp\">");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:id=\"@+id/macroNutrientsHeadline\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textSize=\"18sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textStyle=\"bold\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:text=\"@string/macro_nutrients_headline\"/>");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:id=\"@+id/macroNutrients\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_marginTop=\"8dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textSize=\"16sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:text=\"@string/default_macro_nutrients\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("</LinearLayout>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Vitamins _vitamins = nutrients.getVitamins();
      boolean _tripleNotEquals_2 = (_vitamins != null);
      if (_tripleNotEquals_2) {
        _builder.append("    ");
        _builder.append("<!-- Vitamins Section -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<LinearLayout");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:orientation=\"vertical\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("android:layout_marginTop=\"16dp\">");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:id=\"@+id/vitaminsHeadline\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textSize=\"18sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textStyle=\"bold\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:text=\"@string/vitamins_headline\"/>");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<TextView");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:id=\"@+id/vitamins\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_width=\"match_parent\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_height=\"wrap_content\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:layout_marginTop=\"8dp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:textSize=\"16sp\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("android:text=\"@string/default_vitamins\"/>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("</LinearLayout>");
        _builder.newLine();
      }
    }
    _builder.append("</LinearLayout>");
    _builder.newLine();
    return _builder;
  }

  @XbaseGenerated
  public CharSequence generateSection(final Section ingredients) {
    if (ingredients instanceof Ingredients) {
      return _generateSection((Ingredients)ingredients);
    } else if (ingredients instanceof Instructions) {
      return _generateSection((Instructions)ingredients);
    } else if (ingredients instanceof Nutrients) {
      return _generateSection((Nutrients)ingredients);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ingredients).toString());
    }
  }
}
