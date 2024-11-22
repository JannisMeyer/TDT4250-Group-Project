/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.recipe.RecipeFactory
 * @model kind="package"
 * @generated
 */
public interface RecipePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recipe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/recipe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "recipe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipePackage eINSTANCE = no.ntnu.tdt4250.recipe.impl.RecipePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.PageImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SECTION = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Ingredients</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INGREDIENTS = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEADER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.MacronutrientsImpl <em>Macronutrients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.MacronutrientsImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getMacronutrients()
	 * @generated
	 */
	int MACRONUTRIENTS = 1;

	/**
	 * The number of structural features of the '<em>Macronutrients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRONUTRIENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Macronutrients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRONUTRIENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.Section <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.Section
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 7;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ORDER_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.IngredientsImpl <em>Ingredients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.IngredientsImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getIngredients()
	 * @generated
	 */
	int INGREDIENTS = 2;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTS__ORDER_NUMBER = SECTION__ORDER_NUMBER;

	/**
	 * The feature id for the '<em><b>Unittoggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTS__UNITTOGGLE = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ingredients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ingredients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTS_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.InstructionsImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__ORDER_NUMBER = SECTION__ORDER_NUMBER;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.ImageImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 4;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.BasicInformationImpl <em>Basic Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.BasicInformationImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getBasicInformation()
	 * @generated
	 */
	int BASIC_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Basic Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Basic Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.ToggleButton <em>Toggle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.ToggleButton
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getToggleButton()
	 * @generated
	 */
	int TOGGLE_BUTTON = 8;

	/**
	 * The number of structural features of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_BUTTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.UnitOfMeasureImpl <em>Unit Of Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.UnitOfMeasureImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getUnitOfMeasure()
	 * @generated
	 */
	int UNIT_OF_MEASURE = 6;

	/**
	 * The number of structural features of the '<em>Unit Of Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_FEATURE_COUNT = TOGGLE_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit Of Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_OPERATION_COUNT = TOGGLE_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.PercentageAmountToggleImpl <em>Percentage Amount Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.PercentageAmountToggleImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getPercentageAmountToggle()
	 * @generated
	 */
	int PERCENTAGE_AMOUNT_TOGGLE = 9;

	/**
	 * The number of structural features of the '<em>Percentage Amount Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_AMOUNT_TOGGLE_FEATURE_COUNT = TOGGLE_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Percentage Amount Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_AMOUNT_TOGGLE_OPERATION_COUNT = TOGGLE_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.VitaminsImpl <em>Vitamins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.VitaminsImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getVitamins()
	 * @generated
	 */
	int VITAMINS = 10;

	/**
	 * The feature id for the '<em><b>Vitamin</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAMINS__VITAMIN = 0;

	/**
	 * The number of structural features of the '<em>Vitamins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAMINS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vitamins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAMINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl <em>Nutrients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.NutrientsImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getNutrients()
	 * @generated
	 */
	int NUTRIENTS = 11;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS__ORDER_NUMBER = SECTION__ORDER_NUMBER;

	/**
	 * The feature id for the '<em><b>Percentagetoggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS__PERCENTAGETOGGLE = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vitamins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS__VITAMINS = SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Macronutrients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS__MACRONUTRIENTS = SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nutrients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Nutrients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRIENTS_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.HeaderImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 12;

	/**
	 * The feature id for the '<em><b>Basicinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__BASICINFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Recipetitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__RECIPETITLE = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__IMAGE = 2;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.impl.TitleImpl
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 13;

	/**
	 * The feature id for the '<em><b>Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__STRETCH = 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.recipe.Vitamin <em>Vitamin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.recipe.Vitamin
	 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getVitamin()
	 * @generated
	 */
	int VITAMIN = 14;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.recipe.Page#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page#getSection()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Section();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.recipe.Page#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instructions</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page#getInstructions()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Instructions();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.recipe.Page#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ingredients</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page#getIngredients()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Ingredients();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Page#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page#getHeader()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Header();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.recipe.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.recipe.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Macronutrients <em>Macronutrients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macronutrients</em>'.
	 * @see no.ntnu.tdt4250.recipe.Macronutrients
	 * @generated
	 */
	EClass getMacronutrients();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Ingredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredients</em>'.
	 * @see no.ntnu.tdt4250.recipe.Ingredients
	 * @generated
	 */
	EClass getIngredients();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Ingredients#getUnittoggle <em>Unittoggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unittoggle</em>'.
	 * @see no.ntnu.tdt4250.recipe.Ingredients#getUnittoggle()
	 * @see #getIngredients()
	 * @generated
	 */
	EReference getIngredients_Unittoggle();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see no.ntnu.tdt4250.recipe.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see no.ntnu.tdt4250.recipe.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.BasicInformation <em>Basic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Information</em>'.
	 * @see no.ntnu.tdt4250.recipe.BasicInformation
	 * @generated
	 */
	EClass getBasicInformation();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.UnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Measure</em>'.
	 * @see no.ntnu.tdt4250.recipe.UnitOfMeasure
	 * @generated
	 */
	EClass getUnitOfMeasure();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see no.ntnu.tdt4250.recipe.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.recipe.Section#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number</em>'.
	 * @see no.ntnu.tdt4250.recipe.Section#getOrderNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_OrderNumber();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.ToggleButton <em>Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Button</em>'.
	 * @see no.ntnu.tdt4250.recipe.ToggleButton
	 * @generated
	 */
	EClass getToggleButton();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.PercentageAmountToggle <em>Percentage Amount Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Amount Toggle</em>'.
	 * @see no.ntnu.tdt4250.recipe.PercentageAmountToggle
	 * @generated
	 */
	EClass getPercentageAmountToggle();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Vitamins <em>Vitamins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitamins</em>'.
	 * @see no.ntnu.tdt4250.recipe.Vitamins
	 * @generated
	 */
	EClass getVitamins();

	/**
	 * Returns the meta object for the attribute list '{@link no.ntnu.tdt4250.recipe.Vitamins#getVitamin <em>Vitamin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vitamin</em>'.
	 * @see no.ntnu.tdt4250.recipe.Vitamins#getVitamin()
	 * @see #getVitamins()
	 * @generated
	 */
	EAttribute getVitamins_Vitamin();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Nutrients <em>Nutrients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutrients</em>'.
	 * @see no.ntnu.tdt4250.recipe.Nutrients
	 * @generated
	 */
	EClass getNutrients();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Nutrients#getPercentagetoggle <em>Percentagetoggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentagetoggle</em>'.
	 * @see no.ntnu.tdt4250.recipe.Nutrients#getPercentagetoggle()
	 * @see #getNutrients()
	 * @generated
	 */
	EReference getNutrients_Percentagetoggle();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Nutrients#getVitamins <em>Vitamins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vitamins</em>'.
	 * @see no.ntnu.tdt4250.recipe.Nutrients#getVitamins()
	 * @see #getNutrients()
	 * @generated
	 */
	EReference getNutrients_Vitamins();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Nutrients#getMacronutrients <em>Macronutrients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Macronutrients</em>'.
	 * @see no.ntnu.tdt4250.recipe.Nutrients#getMacronutrients()
	 * @see #getNutrients()
	 * @generated
	 */
	EReference getNutrients_Macronutrients();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see no.ntnu.tdt4250.recipe.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Header#getBasicinformation <em>Basicinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basicinformation</em>'.
	 * @see no.ntnu.tdt4250.recipe.Header#getBasicinformation()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Basicinformation();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Header#getRecipetitle <em>Recipetitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipetitle</em>'.
	 * @see no.ntnu.tdt4250.recipe.Header#getRecipetitle()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Recipetitle();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.recipe.Header#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see no.ntnu.tdt4250.recipe.Header#getImage()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Image();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.recipe.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.recipe.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.recipe.Title#isStretch <em>Stretch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stretch</em>'.
	 * @see no.ntnu.tdt4250.recipe.Title#isStretch()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Stretch();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.recipe.Vitamin <em>Vitamin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vitamin</em>'.
	 * @see no.ntnu.tdt4250.recipe.Vitamin
	 * @generated
	 */
	EEnum getVitamin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecipeFactory getRecipeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.PageImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SECTION = eINSTANCE.getPage_Section();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INSTRUCTIONS = eINSTANCE.getPage_Instructions();

		/**
		 * The meta object literal for the '<em><b>Ingredients</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INGREDIENTS = eINSTANCE.getPage_Ingredients();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__HEADER = eINSTANCE.getPage_Header();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.MacronutrientsImpl <em>Macronutrients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.MacronutrientsImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getMacronutrients()
		 * @generated
		 */
		EClass MACRONUTRIENTS = eINSTANCE.getMacronutrients();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.IngredientsImpl <em>Ingredients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.IngredientsImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getIngredients()
		 * @generated
		 */
		EClass INGREDIENTS = eINSTANCE.getIngredients();

		/**
		 * The meta object literal for the '<em><b>Unittoggle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENTS__UNITTOGGLE = eINSTANCE.getIngredients_Unittoggle();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.InstructionsImpl <em>Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.InstructionsImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getInstructions()
		 * @generated
		 */
		EClass INSTRUCTIONS = eINSTANCE.getInstructions();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.ImageImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.BasicInformationImpl <em>Basic Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.BasicInformationImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getBasicInformation()
		 * @generated
		 */
		EClass BASIC_INFORMATION = eINSTANCE.getBasicInformation();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.UnitOfMeasureImpl <em>Unit Of Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.UnitOfMeasureImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getUnitOfMeasure()
		 * @generated
		 */
		EClass UNIT_OF_MEASURE = eINSTANCE.getUnitOfMeasure();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.Section <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.Section
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ORDER_NUMBER = eINSTANCE.getSection_OrderNumber();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.ToggleButton <em>Toggle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.ToggleButton
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getToggleButton()
		 * @generated
		 */
		EClass TOGGLE_BUTTON = eINSTANCE.getToggleButton();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.PercentageAmountToggleImpl <em>Percentage Amount Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.PercentageAmountToggleImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getPercentageAmountToggle()
		 * @generated
		 */
		EClass PERCENTAGE_AMOUNT_TOGGLE = eINSTANCE.getPercentageAmountToggle();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.VitaminsImpl <em>Vitamins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.VitaminsImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getVitamins()
		 * @generated
		 */
		EClass VITAMINS = eINSTANCE.getVitamins();

		/**
		 * The meta object literal for the '<em><b>Vitamin</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VITAMINS__VITAMIN = eINSTANCE.getVitamins_Vitamin();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl <em>Nutrients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.NutrientsImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getNutrients()
		 * @generated
		 */
		EClass NUTRIENTS = eINSTANCE.getNutrients();

		/**
		 * The meta object literal for the '<em><b>Percentagetoggle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRIENTS__PERCENTAGETOGGLE = eINSTANCE.getNutrients_Percentagetoggle();

		/**
		 * The meta object literal for the '<em><b>Vitamins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRIENTS__VITAMINS = eINSTANCE.getNutrients_Vitamins();

		/**
		 * The meta object literal for the '<em><b>Macronutrients</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRIENTS__MACRONUTRIENTS = eINSTANCE.getNutrients_Macronutrients();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.HeaderImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Basicinformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__BASICINFORMATION = eINSTANCE.getHeader_Basicinformation();

		/**
		 * The meta object literal for the '<em><b>Recipetitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__RECIPETITLE = eINSTANCE.getHeader_Recipetitle();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__IMAGE = eINSTANCE.getHeader_Image();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.impl.TitleImpl
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Stretch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__STRETCH = eINSTANCE.getTitle_Stretch();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.recipe.Vitamin <em>Vitamin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.recipe.Vitamin
		 * @see no.ntnu.tdt4250.recipe.impl.RecipePackageImpl#getVitamin()
		 * @generated
		 */
		EEnum VITAMIN = eINSTANCE.getVitamin();

	}

} //RecipePackage
