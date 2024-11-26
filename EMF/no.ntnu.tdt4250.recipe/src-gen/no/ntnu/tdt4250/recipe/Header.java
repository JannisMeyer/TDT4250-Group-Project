/**
 */
package no.ntnu.tdt4250.recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.Header#getBasicinformation <em>Basicinformation</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Header#getRecipetitle <em>Recipetitle</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.Header#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.recipe.RecipePackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Basicinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basicinformation</em>' containment reference.
	 * @see #setBasicinformation(BasicInformation)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getHeader_Basicinformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BasicInformation getBasicinformation();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Header#getBasicinformation <em>Basicinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basicinformation</em>' containment reference.
	 * @see #getBasicinformation()
	 * @generated
	 */
	void setBasicinformation(BasicInformation value);

	/**
	 * Returns the value of the '<em><b>Recipetitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipetitle</em>' containment reference.
	 * @see #setRecipetitle(Title)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getHeader_Recipetitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Title getRecipetitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Header#getRecipetitle <em>Recipetitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipetitle</em>' containment reference.
	 * @see #getRecipetitle()
	 * @generated
	 */
	void setRecipetitle(Title value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#getHeader_Image()
	 * @model containment="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.recipe.Header#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

} // Header
