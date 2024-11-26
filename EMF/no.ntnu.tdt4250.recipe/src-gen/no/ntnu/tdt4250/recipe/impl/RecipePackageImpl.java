/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.BasicInformation;
import no.ntnu.tdt4250.recipe.Header;
import no.ntnu.tdt4250.recipe.Image;
import no.ntnu.tdt4250.recipe.Ingredients;
import no.ntnu.tdt4250.recipe.Instructions;
import no.ntnu.tdt4250.recipe.Macronutrients;
import no.ntnu.tdt4250.recipe.Nutrients;
import no.ntnu.tdt4250.recipe.Page;
import no.ntnu.tdt4250.recipe.PercentageAmountToggle;
import no.ntnu.tdt4250.recipe.RecipeFactory;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Section;
import no.ntnu.tdt4250.recipe.Title;
import no.ntnu.tdt4250.recipe.ToggleButton;
import no.ntnu.tdt4250.recipe.UnitOfMeasure;
import no.ntnu.tdt4250.recipe.Vitamin;
import no.ntnu.tdt4250.recipe.Vitamins;
import no.ntnu.tdt4250.recipe.util.RecipeValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipePackageImpl extends EPackageImpl implements RecipePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macronutrientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageAmountToggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitaminsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutrientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vitaminEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.ntnu.tdt4250.recipe.RecipePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecipePackageImpl() {
		super(eNS_URI, RecipeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RecipePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecipePackage init() {
		if (isInited)
			return (RecipePackage) EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRecipePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RecipePackageImpl theRecipePackage = registeredRecipePackage instanceof RecipePackageImpl
				? (RecipePackageImpl) registeredRecipePackage
				: new RecipePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRecipePackage.createPackageContents();

		// Initialize created meta-data
		theRecipePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theRecipePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return RecipeValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theRecipePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecipePackage.eNS_URI, theRecipePackage);
		return theRecipePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Instructions() {
		return (EReference) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Ingredients() {
		return (EReference) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Header() {
		return (EReference) pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Name() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Nutrients() {
		return (EReference) pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacronutrients() {
		return macronutrientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngredients() {
		return ingredientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIngredients_Unittoggle() {
		return (EReference) ingredientsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstructions() {
		return instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicInformation() {
		return basicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitOfMeasure() {
		return unitOfMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_OrderNumber() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToggleButton() {
		return toggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPercentageAmountToggle() {
		return percentageAmountToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitamins() {
		return vitaminsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVitamins_Vitamin() {
		return (EAttribute) vitaminsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutrients() {
		return nutrientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutrients_Percentagetoggle() {
		return (EReference) nutrientsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutrients_Vitamins() {
		return (EReference) nutrientsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutrients_Macronutrients() {
		return (EReference) nutrientsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeader_Basicinformation() {
		return (EReference) headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeader_Recipetitle() {
		return (EReference) headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeader_Image() {
		return (EReference) headerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Stretch() {
		return (EAttribute) titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVitamin() {
		return vitaminEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipeFactory getRecipeFactory() {
		return (RecipeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__INSTRUCTIONS);
		createEReference(pageEClass, PAGE__INGREDIENTS);
		createEReference(pageEClass, PAGE__HEADER);
		createEAttribute(pageEClass, PAGE__NAME);
		createEReference(pageEClass, PAGE__NUTRIENTS);

		macronutrientsEClass = createEClass(MACRONUTRIENTS);

		ingredientsEClass = createEClass(INGREDIENTS);
		createEReference(ingredientsEClass, INGREDIENTS__UNITTOGGLE);

		instructionsEClass = createEClass(INSTRUCTIONS);

		imageEClass = createEClass(IMAGE);

		basicInformationEClass = createEClass(BASIC_INFORMATION);

		unitOfMeasureEClass = createEClass(UNIT_OF_MEASURE);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__ORDER_NUMBER);

		toggleButtonEClass = createEClass(TOGGLE_BUTTON);

		percentageAmountToggleEClass = createEClass(PERCENTAGE_AMOUNT_TOGGLE);

		vitaminsEClass = createEClass(VITAMINS);
		createEAttribute(vitaminsEClass, VITAMINS__VITAMIN);

		nutrientsEClass = createEClass(NUTRIENTS);
		createEReference(nutrientsEClass, NUTRIENTS__PERCENTAGETOGGLE);
		createEReference(nutrientsEClass, NUTRIENTS__VITAMINS);
		createEReference(nutrientsEClass, NUTRIENTS__MACRONUTRIENTS);

		headerEClass = createEClass(HEADER);
		createEReference(headerEClass, HEADER__BASICINFORMATION);
		createEReference(headerEClass, HEADER__RECIPETITLE);
		createEReference(headerEClass, HEADER__IMAGE);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__STRETCH);

		// Create enums
		vitaminEEnum = createEEnum(VITAMIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ingredientsEClass.getESuperTypes().add(this.getSection());
		instructionsEClass.getESuperTypes().add(this.getSection());
		unitOfMeasureEClass.getESuperTypes().add(this.getToggleButton());
		percentageAmountToggleEClass.getESuperTypes().add(this.getToggleButton());
		nutrientsEClass.getESuperTypes().add(this.getSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Instructions(), this.getInstructions(), null, "instructions", null, 1, 1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Ingredients(), this.getIngredients(), null, "ingredients", null, 1, 1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Header(), this.getHeader(), null, "header", null, 1, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Nutrients(), this.getNutrients(), null, "nutrients", null, 0, 1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macronutrientsEClass, Macronutrients.class, "Macronutrients", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ingredientsEClass, Ingredients.class, "Ingredients", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIngredients_Unittoggle(), this.getUnitOfMeasure(), null, "unittoggle", null, 0, 1,
				Ingredients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionsEClass, Instructions.class, "Instructions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicInformationEClass, BasicInformation.class, "BasicInformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitOfMeasureEClass, UnitOfMeasure.class, "UnitOfMeasure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_OrderNumber(), ecorePackage.getEInt(), "orderNumber", null, 1, 1, Section.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleButtonEClass, ToggleButton.class, "ToggleButton", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(percentageAmountToggleEClass, PercentageAmountToggle.class, "PercentageAmountToggle", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vitaminsEClass, Vitamins.class, "Vitamins", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVitamins_Vitamin(), this.getVitamin(), "Vitamin", null, 3, 5, Vitamins.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutrientsEClass, Nutrients.class, "Nutrients", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNutrients_Percentagetoggle(), this.getPercentageAmountToggle(), null, "percentagetoggle",
				null, 0, 1, Nutrients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutrients_Vitamins(), this.getVitamins(), null, "vitamins", null, 0, 1, Nutrients.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutrients_Macronutrients(), this.getMacronutrients(), null, "macronutrients", null, 0, 1,
				Nutrients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeader_Basicinformation(), this.getBasicInformation(), null, "basicinformation", null, 1, 1,
				Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_Recipetitle(), this.getTitle(), null, "recipetitle", null, 1, 1, Header.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_Image(), this.getImage(), null, "image", null, 0, 1, Header.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Stretch(), ecorePackage.getEBoolean(), "stretch", "false", 1, 1, Title.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(vitaminEEnum, Vitamin.class, "Vitamin");
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_A);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B1);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B2);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B3);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B5);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B6);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_B12);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_C);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_E);
		addEEnumLiteral(vitaminEEnum, Vitamin.VITAMIN_K);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(pageEClass, source, new String[] { "constraints",
				"UniqueOrderNumbers ExactlyOneIngredients ExactlyOneInstructions MaxOneNutrients" });
		addAnnotation(sectionEClass, source, new String[] { "constraints", "ValidOrderNumberRange" });
		addAnnotation(nutrientsEClass, source, new String[] { "constraints", "MustContainAtLeastOne" });
	}

} //RecipePackageImpl
