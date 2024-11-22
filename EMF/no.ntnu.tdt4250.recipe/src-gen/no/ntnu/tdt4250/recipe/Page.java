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
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getSection <em>Section</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getHeader <em>Header</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Page#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueOrderNumbers ExactlyOneIngredients ExactlyOneInstructions MaxOneNutrients'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.recipe.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' reference.
	 * @see #setInstructions(Instructions)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Instructions()
	 * @model required="true"
	 * @generated
	 */
	Instructions getInstructions();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getInstructions <em>Instructions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' reference.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(Instructions value);

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' reference.
	 * @see #setIngredients(Ingredients)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Ingredients()
	 * @model required="true"
	 * @generated
	 */
	Ingredients getIngredients();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getIngredients <em>Ingredients</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingredients</em>' reference.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
