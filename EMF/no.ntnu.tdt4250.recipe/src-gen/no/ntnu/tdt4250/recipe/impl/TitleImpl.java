/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.Header;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Title;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.TitleImpl#isStretch <em>Stretch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends MinimalEObjectImpl.Container implements Title {
	/**
	 * The default value of the '{@link #isStretch() <em>Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStretch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRETCH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.TITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isStretch() {
		Header header = (Header) eContainer();
		return header.getImage() == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipePackage.TITLE__STRETCH:
			return isStretch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RecipePackage.TITLE__STRETCH:
			return isStretch() != STRETCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TitleImpl
