/**
 */
package no.ntnu.tdt4250.recipe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.Ingredients#getUnittoggle <em>Unittoggle</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getIngredients()
 * @model
 * @generated
 */
public interface Ingredients extends Section {
	/**
	 * Returns the value of the '<em><b>Unittoggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unittoggle</em>' containment reference.
	 * @see #setUnittoggle(UnitOfMeasure)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getIngredients_Unittoggle()
	 * @model containment="true"
	 * @generated
	 */
	UnitOfMeasure getUnittoggle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Ingredients#getUnittoggle <em>Unittoggle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unittoggle</em>' containment reference.
	 * @see #getUnittoggle()
	 * @generated
	 */
	void setUnittoggle(UnitOfMeasure value);

} // Ingredients
