/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getHeader <em>Header</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getNutrients <em>Nutrients</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueOrderNumbers ExactlyOneIngredients ExactlyOneInstructions MaxOneNutrients'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference.
	 * @see #setInstructions(Instructions)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Instructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instructions getInstructions();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getInstructions <em>Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' containment reference.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(Instructions value);

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference.
	 * @see #setIngredients(Ingredients)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Ingredients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ingredients getIngredients();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getIngredients <em>Ingredients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingredients</em>' containment reference.
	 * @see #getIngredients()
	 * @generated
	 */
	void setIngredients(Ingredients value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Nutrients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrients</em>' containment reference.
	 * @see #setNutrients(Nutrients)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Nutrients()
	 * @model containment="true"
	 * @generated
	 */
	Nutrients getNutrients();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getNutrients <em>Nutrients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrients</em>' containment reference.
	 * @see #getNutrients()
	 * @generated
	 */
	void setNutrients(Nutrients value);

} // Page
