package no.ntnu.tdt4250.recipe;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class RecipeFragmentGenerator {
  public CharSequence generateFragment(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.example.recipeexplorer.fragments");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import android.os.Bundle");
    _builder.newLine();
    _builder.append("import android.text.Html");
    _builder.newLine();
    _builder.append("import android.text.Spanned");
    _builder.newLine();
    _builder.append("import android.view.LayoutInflater");
    _builder.newLine();
    _builder.append("import android.view.View");
    _builder.newLine();
    _builder.append("import android.view.ViewGroup");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.Fragment");
    _builder.newLine();
    _builder.append("import com.example.recipeexplorer.databinding.FragmentDetailedResultGeneratedBinding");
    _builder.newLine();
    _builder.append("import com.example.recipeexplorer.querying.FetchedRecipes");
    _builder.newLine();
    _builder.append("import com.example.recipeexplorer.querying.Recipe");
    _builder.newLine();
    _builder.append("import coil.load");
    _builder.newLine();
    _builder.append("import com.example.recipeexplorer.R");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class DetailedResultFragmentGenerated : Fragment() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private var _binding: FragmentDetailedResultGeneratedBinding? = null");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private val binding get() = _binding!!");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private var fetchedRecipes = FetchedRecipes.getInstance()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private var shownRecipe: Recipe? = null");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override fun onCreateView(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("inflater: LayoutInflater,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("container: ViewGroup?,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("savedInstanceState: Bundle?");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("): View {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("_binding = FragmentDetailedResultGeneratedBinding.inflate(inflater, container, false)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return binding.root");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override fun onViewCreated(view: View, savedInstanceState: Bundle?) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("super.onViewCreated(view, savedInstanceState)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("val id = arguments?.getString(\"ID\")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (recipe in fetchedRecipes?.recipes!!) {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("if (id != null) {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (recipe.id == id.toInt()) {");
    _builder.newLine();
    _builder.append("\t\t            ");
    _builder.append("shownRecipe = recipe");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (shownRecipe != null) {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("setupUI()");
    _builder.newLine();
    {
      boolean _hasAnySwitches = this.hasAnySwitches(page);
      if (_hasAnySwitches) {
        _builder.append("\t    ");
        _builder.append("setupSwitches()");
        _builder.newLine();
      }
    }
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private fun setupUI() {");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateBindings = this.generateBindings(page);
    _builder.append(_generateBindings, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private fun formatInstructions(htmlInstructions: String): Spanned {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val cleanedHtml = htmlInstructions");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".replace(\"<span>\", \"\")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".replace(\"</span>\", \"\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return Html.fromHtml(cleanedHtml, Html.FROM_HTML_MODE_COMPACT)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateOverrideOnDestroyView = this.generateOverrideOnDestroyView();
    _builder.append(_generateOverrideOnDestroyView, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _hasAnySwitches_1 = this.hasAnySwitches(page);
      if (_hasAnySwitches_1) {
        CharSequence _generateSetupSwitches = this.generateSetupSwitches(page);
        _builder.append(_generateSetupSwitches);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public boolean hasAnySwitches(final Page page) {
    EList<Section> _section = page.getSection();
    for (final Section section : _section) {
      boolean _matched = false;
      if (section instanceof Ingredients) {
        _matched=true;
        UnitOfMeasure _unittoggle = ((Ingredients)section).getUnittoggle();
        boolean _tripleNotEquals = (_unittoggle != null);
        if (_tripleNotEquals) {
          return true;
        }
      }
      if (!_matched) {
        if (section instanceof Nutrients) {
          _matched=true;
          PercentageAmountToggle _percentagetoggle = ((Nutrients)section).getPercentagetoggle();
          boolean _tripleNotEquals = (_percentagetoggle != null);
          if (_tripleNotEquals) {
            return true;
          }
        }
      }
    }
    return false;
  }

  public CharSequence generateBindings(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    CharSequence _generateHeaderBindings = this.generateHeaderBindings(page.getHeader());
    _builder.append(_generateHeaderBindings, "\t");
    _builder.newLineIfNotEmpty();
    {
      final Function1<Section, Integer> _function = (Section it) -> {
        return Integer.valueOf(it.getOrderNumber());
      };
      List<Section> _sortBy = IterableExtensions.<Section, Integer>sortBy(page.getSection(), _function);
      for(final Section section : _sortBy) {
        CharSequence _generateSectionBindings = this.generateSectionBindings(section);
        _builder.append(_generateSectionBindings);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence generateHeaderBindings(final Header header) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("binding.recipeTitle.text = shownRecipe?.title");
    _builder.newLine();
    {
      Image _image = header.getImage();
      boolean _tripleNotEquals = (_image != null);
      if (_tripleNotEquals) {
        _builder.append("binding.recipeImage.load(shownRecipe?.image) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("placeholder(R.drawable.loading_animation)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("error(R.drawable.error_image)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("crossfade(true)");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("binding.recipePreparationTime.text = \"${shownRecipe?.preparationTime} min\"");
    _builder.newLine();
    _builder.append("binding.calories.text = \"${shownRecipe?.calories} kcal\"");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSectionBindings(final Ingredients ingredients) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("binding.textViewIngredients.text = shownRecipe?.ingredientsMetric?.joinToString(separator = \"\\n\")");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSectionBindings(final Instructions instructions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("binding.instructions.text = shownRecipe?.instructions?.let { formatInstructions(it) }");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateSectionBindings(final Nutrients nutrients) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Macronutrients _macronutrients = nutrients.getMacronutrients();
      boolean _tripleNotEquals = (_macronutrients != null);
      if (_tripleNotEquals) {
        _builder.append("binding.macroNutrients.text = shownRecipe?.macroNutrientsAmount?.joinToString(separator = \"\\n\")");
        _builder.newLine();
      }
    }
    {
      Vitamins _vitamins = nutrients.getVitamins();
      boolean _tripleNotEquals_1 = (_vitamins != null);
      if (_tripleNotEquals_1) {
        _builder.append("binding.vitamins.text = shownRecipe?.vitaminsAmount?.joinToString(separator = \"\\n\")");
        _builder.newLine();
      }
    }
    return _builder;
  }

  public CharSequence generateSetupSwitches(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private fun setupSwitches() {");
    _builder.newLine();
    {
      final Function1<Section, Boolean> _function = (Section s) -> {
        return Boolean.valueOf(this.hasSwitches(s));
      };
      Iterable<Section> _filter = IterableExtensions.<Section>filter(page.getSection(), _function);
      for(final Section section : _filter) {
        _builder.append("   ");
        CharSequence _generateSwitchSetup = this.generateSwitchSetup(section);
        _builder.append(_generateSwitchSetup, "   ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public boolean hasSwitches(final Object section) {
    boolean _matched = false;
    if (section instanceof Ingredients) {
      _matched=true;
      UnitOfMeasure _unittoggle = ((Ingredients)section).getUnittoggle();
      return (_unittoggle != null);
    }
    if (!_matched) {
      if (section instanceof Nutrients) {
        _matched=true;
        PercentageAmountToggle _percentagetoggle = ((Nutrients)section).getPercentagetoggle();
        return (_percentagetoggle != null);
      }
    }
    return false;
  }

  protected CharSequence _generateSwitchSetup(final Ingredients ingredients) {
    StringConcatenation _builder = new StringConcatenation();
    {
      UnitOfMeasure _unittoggle = ingredients.getUnittoggle();
      boolean _tripleNotEquals = (_unittoggle != null);
      if (_tripleNotEquals) {
        _builder.append("binding.unitSwitch.setOnCheckedChangeListener { _, isChecked ->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (isChecked) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.unitSwitch.text = getString(R.string.ingredients_switch_text_imperial)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.textViewIngredients.text = shownRecipe?.ingredientsImperial?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.unitSwitch.text = getString(R.string.ingredients_switch_text_metric)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.textViewIngredients.text = shownRecipe?.ingredientsMetric?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _generateSwitchSetup(final Nutrients nutrients) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PercentageAmountToggle _percentagetoggle = nutrients.getPercentagetoggle();
      boolean _tripleNotEquals = (_percentagetoggle != null);
      if (_tripleNotEquals) {
        _builder.append("binding.nutrientSwitch.setOnCheckedChangeListener { _, isChecked ->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (isChecked) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.nutrientSwitch.text = getString(R.string.nutrient_switch_text_percentage)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.macroNutrients.text = shownRecipe?.macroNutrientsPercentage?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.vitamins.text = shownRecipe?.vitaminsPercentage?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.nutrientSwitch.text = getString(R.string.nutrient_switch_text_amount)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.macroNutrients.text = shownRecipe?.macroNutrientsAmount?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("binding.vitamins.text = shownRecipe?.vitaminsAmount?.joinToString(separator = \"\\n\")");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _generateSwitchSetup(final Instructions instructions) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }

  public CharSequence generateOverrideOnDestroyView() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("override fun onDestroyView() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("super.onDestroyView()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("_binding = null");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  @XbaseGenerated
  public CharSequence generateSectionBindings(final Section ingredients) {
    if (ingredients instanceof Ingredients) {
      return _generateSectionBindings((Ingredients)ingredients);
    } else if (ingredients instanceof Instructions) {
      return _generateSectionBindings((Instructions)ingredients);
    } else if (ingredients instanceof Nutrients) {
      return _generateSectionBindings((Nutrients)ingredients);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ingredients).toString());
    }
  }

  @XbaseGenerated
  public CharSequence generateSwitchSetup(final Section ingredients) {
    if (ingredients instanceof Ingredients) {
      return _generateSwitchSetup((Ingredients)ingredients);
    } else if (ingredients instanceof Instructions) {
      return _generateSwitchSetup((Instructions)ingredients);
    } else if (ingredients instanceof Nutrients) {
      return _generateSwitchSetup((Nutrients)ingredients);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ingredients).toString());
    }
  }
}
