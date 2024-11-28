/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.recipe.RecipePackage
 * @generated
 */
public interface RecipeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipeFactory eINSTANCE = no.ntnu.tdt4250.recipe.impl.RecipeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Macronutrients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macronutrients</em>'.
	 * @generated
	 */
	Macronutrients createMacronutrients();

	/**
	 * Returns a new object of class '<em>Ingredients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredients</em>'.
	 * @generated
	 */
	Ingredients createIngredients();

	/**
	 * Returns a new object of class '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions</em>'.
	 * @generated
	 */
	Instructions createInstructions();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Basic Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Information</em>'.
	 * @generated
	 */
	BasicInformation createBasicInformation();

	/**
	 * Returns a new object of class '<em>Unit Of Measure Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Of Measure Toggle</em>'.
	 * @generated
	 */
	UnitOfMeasureToggle createUnitOfMeasureToggle();

	/**
	 * Returns a new object of class '<em>Percentage Amount Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Amount Toggle</em>'.
	 * @generated
	 */
	PercentageAmountToggle createPercentageAmountToggle();

	/**
	 * Returns a new object of class '<em>Vitamins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vitamins</em>'.
	 * @generated
	 */
	Vitamins createVitamins();

	/**
	 * Returns a new object of class '<em>Nutrients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrients</em>'.
	 * @generated
	 */
	Nutrients createNutrients();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecipePackage getRecipePackage();

} //RecipeFactory
