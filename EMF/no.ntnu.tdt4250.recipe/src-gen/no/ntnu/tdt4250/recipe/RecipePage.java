/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipePage#getSection <em>Section</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipePage#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipePage#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipePage#getHeader <em>Header</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipePage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueOrderNumbers'"
 * @generated
 */
public interface RecipePage extends EObject {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.recipe.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference.
	 * @see #setInstructions(Instructions)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage_Instructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instructions getInstructions();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.RecipePage#getInstructions <em>Instructions</em>}' containment reference.
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
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage_Ingredients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ingredients getIngredients();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.RecipePage#getIngredients <em>Ingredients</em>}' containment reference.
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
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.RecipePage#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipePage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.RecipePage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RecipePage
