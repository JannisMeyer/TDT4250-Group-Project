/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.RecipeTitle#isStretch <em>Stretch</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipeTitle()
 * @model
 * @generated
 */
public interface RecipeTitle extends EObject {

	/**
	 * Returns the value of the '<em><b>Stretch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stretch</em>' attribute.
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getRecipeTitle_Stretch()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStretch();
} // RecipeTitle
