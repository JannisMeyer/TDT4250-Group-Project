/**
 */
package no.ntnu.tdt4250.recipe.util;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import no.ntnu.tdt4250.recipe.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.recipe.RecipePackage
 * @generated
 */
public class RecipeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RecipeValidator INSTANCE = new RecipeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.recipe";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return RecipePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case RecipePackage.PAGE:
			return validatePage((Page) value, diagnostics, context);
		case RecipePackage.MACRONUTRIENTS:
			return validateMacronutrients((Macronutrients) value, diagnostics, context);
		case RecipePackage.INGREDIENTS:
			return validateIngredients((Ingredients) value, diagnostics, context);
		case RecipePackage.INSTRUCTIONS:
			return validateInstructions((Instructions) value, diagnostics, context);
		case RecipePackage.IMAGE:
			return validateImage((Image) value, diagnostics, context);
		case RecipePackage.BASIC_INFORMATION:
			return validateBasicInformation((BasicInformation) value, diagnostics, context);
		case RecipePackage.UNIT_OF_MEASURE_TOGGLE:
			return validateUnitOfMeasureToggle((UnitOfMeasureToggle) value, diagnostics, context);
		case RecipePackage.SECTION:
			return validateSection((Section) value, diagnostics, context);
		case RecipePackage.TOGGLE_BUTTON:
			return validateToggleButton((ToggleButton) value, diagnostics, context);
		case RecipePackage.PERCENTAGE_AMOUNT_TOGGLE:
			return validatePercentageAmountToggle((PercentageAmountToggle) value, diagnostics, context);
		case RecipePackage.VITAMINS:
			return validateVitamins((Vitamins) value, diagnostics, context);
		case RecipePackage.NUTRIENTS:
			return validateNutrients((Nutrients) value, diagnostics, context);
		case RecipePackage.HEADER:
			return validateHeader((Header) value, diagnostics, context);
		case RecipePackage.TITLE:
			return validateTitle((Title) value, diagnostics, context);
		case RecipePackage.VITAMIN:
			return validateVitamin((Vitamin) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePage_UniqueOrderNumbers(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePage_ExactlyOneIngredients(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePage_ExactlyOneInstructions(page, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePage_MaxOneNutrients(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueOrderNumbers constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePage_UniqueOrderNumbers(Page page, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		Set<Integer> seen = new HashSet<>();

		// Get all EObjects that are direct children of page
		for (EObject child : page.eContents()) {
			// Check if it's a Section
			if (child instanceof Section) {
				Section section = (Section) child;
				if (!seen.add(section.getOrderNumber())) {
					valid = false;
					break;
				}
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "UniqueOrderNumbers", getObjectLabel(page, context) },
								new Object[] { page }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ExactlyOneIngredients constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePage_ExactlyOneIngredients(Page page, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = page.eContents().stream().filter(content -> content instanceof Ingredients).count() == 1;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ExactlyOneIngredients", getObjectLabel(page, context) },
								new Object[] { page }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ExactlyOneInstructions constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePage_ExactlyOneInstructions(Page page, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = page.eContents().stream().filter(content -> content instanceof Instructions).count() == 1;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ExactlyOneInstructions", getObjectLabel(page, context) },
								new Object[] { page }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MaxOneNutrients constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePage_MaxOneNutrients(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = page.eContents().stream().filter(content -> content instanceof Ingredients).count() <= 1;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "MaxOneNutrients", getObjectLabel(page, context) },
								new Object[] { page }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacronutrients(Macronutrients macronutrients, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macronutrients, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredients(Ingredients ingredients, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ingredients, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ingredients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSection_ValidOrderNumberRange(ingredients, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructions(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instructions, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(instructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSection_ValidOrderNumberRange(instructions, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicInformation(BasicInformation basicInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasureToggle(UnitOfMeasureToggle unitOfMeasureToggle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitOfMeasureToggle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSection_ValidOrderNumberRange(section, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidOrderNumberRange constraint of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSection_ValidOrderNumberRange(Section section, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int numberOfSections = section.eContainer().eContents().size();
		boolean valid = section.getOrderNumber() >= 1 && section.getOrderNumber() <= numberOfSections;
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValidOrderNumberRange", getObjectLabel(section, context) },
								new Object[] { section }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToggleButton(ToggleButton toggleButton, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toggleButton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageAmountToggle(PercentageAmountToggle percentageAmountToggle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(percentageAmountToggle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitamins(Vitamins vitamins, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vitamins, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutrients(Nutrients nutrients, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nutrients, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSection_ValidOrderNumberRange(nutrients, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNutrients_MustContainAtLeastOne(nutrients, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustContainAtLeastOne constraint of '<em>Nutrients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNutrients_MustContainAtLeastOne(Nutrients nutrients, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = nutrients.getMacronutrients() != null || nutrients.getVitamins() != null;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "MustContainAtLeastOne", getObjectLabel(nutrients, context) },
								new Object[] { nutrients }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitle(Title title, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(title, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitamin(Vitamin vitamin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RecipeValidator
