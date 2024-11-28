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
Every RecipeDSL file must start with a Page definition:

```
Page {
    // content
}
```

### 2. Instructions Section
Instructions section is mandatory and requires an order number.

```
Instructions {
    orderNumber 2
}
```

### 3. Ingredients Section
Ingredients section is mandatory and includes:
- Required: orderNumber
- Optional: unittoggle

```
Ingredients {
    orderNumber 1
    UnitOfMeasureToggle    // optional
}
```

### 4. Header Section
Header section is mandatory and contains:
- Required: basicinformation
- Required: recipetitle
- Optional: image

```
Header {
    BasicInformation
    Title
    Image    // optional
}
```

### 5. Nutrients Section (Optional)
The nutrients section is optional and can include:
- Required: orderNumber
- Optional: percentagetoggle
- Optional: vitamins
- Optional: macronutrients

```
Nutrients {
    orderNumber 3
    PercentageAmountToggle
    Vitamins {
        vitamin {
            VITAMIN_A, VITAMIN_B12, VITAMIN_C
        }
    }
    Macronutrients
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
2. The nutrient section has to contain at least 1 of the subsections *Macronutrients* or *Vitamins*
3. The vitamin section has to contain minimum 3 and a maximum 5 vitamins

## Complete Examples

### 1. Minimal Valid Recipe
```
Page {
    Instructions {
        orderNumber 1
    }
    Ingredients {
        orderNumber 2
    }
    Header {
        BasicInformation
        Title
    }
}
```

### 2. Full Featured Recipe
```
Page {
    Instructions {
        orderNumber 2
    }
    Ingredients {
        orderNumber 1
        UnitOfMeasureToggle
    }
    Header {
        BasicInformation
        Title
        Image
    }
    Nutrients {
        orderNumber 3
        PercentageAmountToggle
        Vitamins {
            vitamin {
                VITAMIN_A,
                VITAMIN_B12,
                VITAMIN_C,
                VITAMIN_D
            }
        }
        Macronutrients
    }
}
```

### 3. Vitamin Example
```
Page {
    Instructions {
        orderNumber 1
    }
    Ingredients {
        orderNumber 2
    }
    Header {
        BasicInformation
        Title
    }
    Nutrients {
        orderNumber 3
        Vitamins {
            vitamin {
                VITAMIN_A, VITAMIN_C, VITAMIN_B12
            }
        }
    }
}
```

## Common Mistakes to Avoid

1. Missing Required Elements
   - Every Page must have Instructions, Ingredients, and Header sections
   - Instructions and Ingredients must have orderNumber
   - Header must have BasicInformation and Title

2. Incorrect Ordering
   - While the sections can appear in any order within the Page, each section's internal elements must follow the grammar structure

3. Vitamin Syntax
   - Vitamins must be specified within a vitamin block
   - Use commas to separate multiple vitamins
   - Only use predefined vitamin constants
