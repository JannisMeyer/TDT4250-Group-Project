/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeFactoryImpl extends EFactoryImpl implements RecipeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecipeFactory init() {
		try {
			RecipeFactory theRecipeFactory = (RecipeFactory) EPackage.Registry.INSTANCE
					.getEFactory(RecipePackage.eNS_URI);
			if (theRecipeFactory != null) {
				return theRecipeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecipeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RecipePackage.PAGE:
			return createPage();
		case RecipePackage.MACRONUTRIENTS:
			return createMacronutrients();
		case RecipePackage.INGREDIENTS:
			return createIngredients();
		case RecipePackage.INSTRUCTIONS:
			return createInstructions();
		case RecipePackage.IMAGE:
			return createImage();
		case RecipePackage.BASIC_INFORMATION:
			return createBasicInformation();
		case RecipePackage.UNIT_OF_MEASURE:
			return createUnitOfMeasure();
		case RecipePackage.PERCENTAGE_AMOUNT_TOGGLE:
			return createPercentageAmountToggle();
		case RecipePackage.VITAMINS:
			return createVitamins();
		case RecipePackage.NUTRIENTS:
			return createNutrients();
		case RecipePackage.HEADER:
			return createHeader();
		case RecipePackage.TITLE:
			return createTitle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RecipePackage.VITAMIN:
			return createVitaminFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RecipePackage.VITAMIN:
			return convertVitaminToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Macronutrients createMacronutrients() {
		MacronutrientsImpl macronutrients = new MacronutrientsImpl();
		return macronutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredients createIngredients() {
		IngredientsImpl ingredients = new IngredientsImpl();
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions createInstructions() {
		InstructionsImpl instructions = new InstructionsImpl();
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicInformation createBasicInformation() {
		BasicInformationImpl basicInformation = new BasicInformationImpl();
		return basicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasure createUnitOfMeasure() {
		UnitOfMeasureImpl unitOfMeasure = new UnitOfMeasureImpl();
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageAmountToggle createPercentageAmountToggle() {
		PercentageAmountToggleImpl percentageAmountToggle = new PercentageAmountToggleImpl();
		return percentageAmountToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vitamins createVitamins() {
		VitaminsImpl vitamins = new VitaminsImpl();
		return vitamins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutrients createNutrients() {
		NutrientsImpl nutrients = new NutrientsImpl();
		return nutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vitamin createVitaminFromString(EDataType eDataType, String initialValue) {
		Vitamin result = Vitamin.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVitaminToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipePackage getRecipePackage() {
		return (RecipePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecipePackage getPackage() {
		return RecipePackage.eINSTANCE;
	}

} //RecipeFactoryImpl
