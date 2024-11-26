/**
 */
package no.ntnu.tdt4250.recipe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.Nutrients#getPercentagetoggle <em>Percentagetoggle</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Nutrients#getVitamins <em>Vitamins</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Nutrients#getMacronutrients <em>Macronutrients</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getNutrients()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustContainAtLeastOne'"
 * @generated
 */
public interface Nutrients extends Section {
	/**
	 * Returns the value of the '<em><b>Percentagetoggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentagetoggle</em>' containment reference.
	 * @see #setPercentagetoggle(PercentageAmountToggle)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getNutrients_Percentagetoggle()
	 * @model containment="true"
	 * @generated
	 */
	PercentageAmountToggle getPercentagetoggle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Nutrients#getPercentagetoggle <em>Percentagetoggle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentagetoggle</em>' containment reference.
	 * @see #getPercentagetoggle()
	 * @generated
	 */
	void setPercentagetoggle(PercentageAmountToggle value);

	/**
	 * Returns the value of the '<em><b>Vitamins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitamins</em>' containment reference.
	 * @see #setVitamins(Vitamins)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getNutrients_Vitamins()
	 * @model containment="true"
	 * @generated
	 */
	Vitamins getVitamins();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Nutrients#getVitamins <em>Vitamins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitamins</em>' containment reference.
	 * @see #getVitamins()
	 * @generated
	 */
	void setVitamins(Vitamins value);

	/**
	 * Returns the value of the '<em><b>Macronutrients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macronutrients</em>' containment reference.
	 * @see #setMacronutrients(Macronutrients)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getNutrients_Macronutrients()
	 * @model containment="true"
	 * @generated
	 */
	Macronutrients getMacronutrients();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Nutrients#getMacronutrients <em>Macronutrients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macronutrients</em>' containment reference.
	 * @see #getMacronutrients()
	 * @generated
	 */
	void setMacronutrients(Macronutrients value);

} // Nutrients
