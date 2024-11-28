/**
 */
package no.ntnu.tdt4250.recipe.util;

import no.ntnu.tdt4250.recipe.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.recipe.RecipePackage
 * @generated
 */
public class RecipeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RecipePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RecipePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeSwitch<Adapter> modelSwitch = new RecipeSwitch<Adapter>() {
		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseMacronutrients(Macronutrients object) {
			return createMacronutrientsAdapter();
		}

		@Override
		public Adapter caseIngredients(Ingredients object) {
			return createIngredientsAdapter();
		}

		@Override
		public Adapter caseInstructions(Instructions object) {
			return createInstructionsAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseBasicInformation(BasicInformation object) {
			return createBasicInformationAdapter();
		}

		@Override
		public Adapter caseUnitOfMeasureToggle(UnitOfMeasureToggle object) {
			return createUnitOfMeasureToggleAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseToggleButton(ToggleButton object) {
			return createToggleButtonAdapter();
		}

		@Override
		public Adapter casePercentageAmountToggle(PercentageAmountToggle object) {
			return createPercentageAmountToggleAdapter();
		}

		@Override
		public Adapter caseVitamins(Vitamins object) {
			return createVitaminsAdapter();
		}

		@Override
		public Adapter caseNutrients(Nutrients object) {
			return createNutrientsAdapter();
		}

		@Override
		public Adapter caseHeader(Header object) {
			return createHeaderAdapter();
		}

		@Override
		public Adapter caseTitle(Title object) {
			return createTitleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Macronutrients <em>Macronutrients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Macronutrients
	 * @generated
	 */
	public Adapter createMacronutrientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Ingredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Ingredients
	 * @generated
	 */
	public Adapter createIngredientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Instructions
	 * @generated
	 */
	public Adapter createInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.BasicInformation <em>Basic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.BasicInformation
	 * @generated
	 */
	public Adapter createBasicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.UnitOfMeasureToggle <em>Unit Of Measure Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.UnitOfMeasureToggle
	 * @generated
	 */
	public Adapter createUnitOfMeasureToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.ToggleButton <em>Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.ToggleButton
	 * @generated
	 */
	public Adapter createToggleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.PercentageAmountToggle <em>Percentage Amount Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.PercentageAmountToggle
	 * @generated
	 */
	public Adapter createPercentageAmountToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Vitamins <em>Vitamins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Vitamins
	 * @generated
	 */
	public Adapter createVitaminsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Nutrients <em>Nutrients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Nutrients
	 * @generated
	 */
	public Adapter createNutrientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.recipe.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.recipe.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RecipeAdapterFactory
