/**
 */
package no.ntnu.tdt4250.recipe.impl;

import java.util.Collection;

import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Vitamin;
import no.ntnu.tdt4250.recipe.Vitamins;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vitamins</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.VitaminsImpl#getVitamin <em>Vitamin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VitaminsImpl extends MinimalEObjectImpl.Container implements Vitamins {
	/**
	 * The cached value of the '{@link #getVitamin() <em>Vitamin</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitamin()
	 * @generated
	 * @ordered
	 */
	protected EList<Vitamin> vitamin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitaminsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.VITAMINS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vitamin> getVitamin() {
		if (vitamin == null) {
			vitamin = new EDataTypeUniqueEList<Vitamin>(Vitamin.class, this, RecipePackage.VITAMINS__VITAMIN);
		}
		return vitamin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipePackage.VITAMINS__VITAMIN:
			return getVitamin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RecipePackage.VITAMINS__VITAMIN:
			getVitamin().clear();
			getVitamin().addAll((Collection<? extends Vitamin>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RecipePackage.VITAMINS__VITAMIN:
			getVitamin().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RecipePackage.VITAMINS__VITAMIN:
			return vitamin != null && !vitamin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Vitamin: ");
		result.append(vitamin);
		result.append(')');
		return result.toString();
	}

} //VitaminsImpl
