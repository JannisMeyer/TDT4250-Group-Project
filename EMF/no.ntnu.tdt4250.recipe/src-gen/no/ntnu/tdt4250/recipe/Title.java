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
 *   <li>{@link no.ntnu.tdt4250.recipe.Title#isStretch <em>Stretch</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject {
	/**
	 * Returns the value of the '<em><b>Stretch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stretch</em>' attribute.
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getTitle_Stretch()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStretch();

} // Title
