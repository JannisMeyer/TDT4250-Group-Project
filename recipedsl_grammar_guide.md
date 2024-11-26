# RecipeDSL Grammar Guide

## Overview
RecipeDSL is a domain-specific language for defining recipe pages with structured information including instructions, ingredients, header information, and nutritional data.

## Basic Structure
A RecipeDSL file consists of a single `Page` element that contains four main sections:
- Instructions
- Ingredients
- Header
- Nutrients (optional)

The `orderNumber` attribute controls in which order sections appear on screen.

## Syntax Guide

### 1. Page Definition
Every RecipeDSL file must start with a Page definition. The page name can be either a string (in quotes) or an identifier.

```
Page "recipe-name" {
    // content
}
```
or
```
Page simple_recipe {
    // content
}
```

### 2. Instructions Section
Instructions section is mandatory and requires an order number.

```
instructions Instructions {
    orderNumber 2
}
```

### 3. Ingredients Section
Ingredients section is mandatory and includes:
- Required: orderNumber
- Optional: unittoggle

```
ingredients Ingredients {
    orderNumber 1
    unittoggle UnitOfMeasure    // optional
}
```

### 4. Header Section
Header section is mandatory and contains:
- Required: basicinformation
- Required: recipetitle
- Optional: image

```
header Header {
    basicinformation BasicInformation
    recipetitle Title
    image Image    // optional
}
```

### 5. Nutrients Section (Optional)
The nutrients section is optional and can include:
- Required: orderNumber
- Optional: percentagetoggle
- Optional: vitamins
- Optional: macronutrients

```
nutrients Nutrients {
    orderNumber 3
    percentagetoggle PercentageAmountToggle
    vitamins Vitamins {
        Vitamin {
            VITAMIN_A, VITAMIN_B12, VITAMIN_C
        }
    }
    macronutrients Macronutrients
}
```

### Vitamins
Available vitamin options:
- VITAMIN_A
- VITAMIN_B1
- VITAMIN_B2
- VITAMIN_B3
- VITAMIN_B5
- VITAMIN_B6
- VITAMIN_B12
- VITAMIN_C
- VITAMIN_E
- VITAMIN_K

## Constraints
1. OrderNumbers are between 1 and 3, and have to be unique
2. The nutrient section has to contain at least 1 of the subsections *MacroNutrients* or *Vitamins*
3. The vitamin section has to contain minimum 3 and a maximum 5 vitamins


## Complete Examples

### 1. Minimal Valid Recipe
```
Page "minimal" {
    instructions Instructions {
        orderNumber 1
    }
    ingredients Ingredients {
        orderNumber 2
    }
    header Header {
        basicinformation BasicInformation
        recipetitle Title
    }
}
```

### 2. Full Featured Recipe
```
Page "complete_recipe" {
    instructions Instructions {
        orderNumber 2
    }
    ingredients Ingredients {
        orderNumber 1
        unittoggle UnitOfMeasure
    }
    header Header {
        basicinformation BasicInformation
        recipetitle Title
        image Image
    }
    nutrients Nutrients {
        orderNumber 3
        percentagetoggle PercentageAmountToggle
        vitamins Vitamins {
            Vitamin {
                VITAMIN_A,
                VITAMIN_B12,
                VITAMIN_C,
                VITAMIN_D
            }
        }
        macronutrients Macronutrients
    }
}
```

### 3. Multiple Vitamin Groups
```
Page "vitamin_heavy" {
    instructions Instructions {
        orderNumber 1
    }
    ingredients Ingredients {
        orderNumber 2
    }
    header Header {
        basicinformation BasicInformation
        recipetitle Title
    }
    nutrients Nutrients {
        orderNumber 3
        vitamins Vitamins {
            Vitamin {
                VITAMIN_A, VITAMIN_C
            }
        }
    }
}
```

## Common Mistakes to Avoid

1. Missing Required Elements
   - Every Page must have instructions, ingredients, and header sections
   - Instructions and Ingredients must have orderNumber
   - Header must have basicinformation and recipetitle

2. Incorrect Ordering
   - While the sections can appear in any order within the Page, each section's internal elements must follow the grammar structure

3. Vitamin Syntax
   - Vitamins must be specified within a Vitamin block
   - Use commas to separate multiple vitamins
   - Only use predefined vitamin constants
