/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vitamins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.Vitamins#getVitamin <em>Vitamin</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getVitamins()
 * @model
 * @generated
 */
public interface Vitamins extends EObject {
	/**
	 * Returns the value of the '<em><b>Vitamin</b></em>' attribute list.
	 * The list contents are of type {@link no.ntnu.tdt4250.recipe.Vitamin}.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.recipe.Vitamin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitamin</em>' attribute list.
	 * @see no.ntnu.tdt4250.recipe.Vitamin
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getVitamins_Vitamin()
	 * @model lower="3" upper="5"
	 * @generated
	 */
	EList<Vitamin> getVitamin();

} // Vitamins
