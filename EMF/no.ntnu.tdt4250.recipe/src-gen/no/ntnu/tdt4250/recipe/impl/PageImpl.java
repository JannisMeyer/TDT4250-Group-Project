/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.Header;
import no.ntnu.tdt4250.recipe.Ingredients;
import no.ntnu.tdt4250.recipe.Instructions;
import no.ntnu.tdt4250.recipe.Nutrients;
import no.ntnu.tdt4250.recipe.Page;
import no.ntnu.tdt4250.recipe.RecipePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getNutrients <em>Nutrients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected Instructions instructions;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected Ingredients ingredients;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNutrients() <em>Nutrients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrients()
	 * @generated
	 * @ordered
	 */
	protected Nutrients nutrients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructions(Instructions newInstructions, NotificationChain msgs) {
		Instructions oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.PAGE__INSTRUCTIONS, oldInstructions, newInstructions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(Instructions newInstructions) {
		if (newInstructions != instructions) {
			NotificationChain msgs = null;
			if (instructions != null)
				msgs = ((InternalEObject) instructions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__INSTRUCTIONS, null, msgs);
			if (newInstructions != null)
				msgs = ((InternalEObject) newInstructions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__INSTRUCTIONS, null, msgs);
			msgs = basicSetInstructions(newInstructions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__INSTRUCTIONS, newInstructions,
					newInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredients getIngredients() {
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngredients(Ingredients newIngredients, NotificationChain msgs) {
		Ingredients oldIngredients = ingredients;
		ingredients = newIngredients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.PAGE__INGREDIENTS, oldIngredients, newIngredients);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIngredients(Ingredients newIngredients) {
		if (newIngredients != ingredients) {
			NotificationChain msgs = null;
			if (ingredients != null)
				msgs = ((InternalEObject) ingredients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__INGREDIENTS, null, msgs);
			if (newIngredients != null)
				msgs = ((InternalEObject) newIngredients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__INGREDIENTS, null, msgs);
			msgs = basicSetIngredients(newIngredients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__INGREDIENTS, newIngredients,
					newIngredients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__HEADER,
					oldHeader, newHeader);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject) header).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject) newHeader).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutrients getNutrients() {
		return nutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutrients(Nutrients newNutrients, NotificationChain msgs) {
		Nutrients oldNutrients = nutrients;
		nutrients = newNutrients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.PAGE__NUTRIENTS, oldNutrients, newNutrients);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNutrients(Nutrients newNutrients) {
		if (newNutrients != nutrients) {
			NotificationChain msgs = null;
			if (nutrients != null)
				msgs = ((InternalEObject) nutrients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__NUTRIENTS, null, msgs);
			if (newNutrients != null)
				msgs = ((InternalEObject) newNutrients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.PAGE__NUTRIENTS, null, msgs);
			msgs = basicSetNutrients(newNutrients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__NUTRIENTS, newNutrients,
					newNutrients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipePackage.PAGE__INSTRUCTIONS:
			return basicSetInstructions(null, msgs);
		case RecipePackage.PAGE__INGREDIENTS:
			return basicSetIngredients(null, msgs);
		case RecipePackage.PAGE__HEADER:
			return basicSetHeader(null, msgs);
		case RecipePackage.PAGE__NUTRIENTS:
			return basicSetNutrients(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipePackage.PAGE__INSTRUCTIONS:
			return getInstructions();
		case RecipePackage.PAGE__INGREDIENTS:
			return getIngredients();
		case RecipePackage.PAGE__HEADER:
			return getHeader();
		case RecipePackage.PAGE__NAME:
			return getName();
		case RecipePackage.PAGE__NUTRIENTS:
			return getNutrients();
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
		case RecipePackage.PAGE__INSTRUCTIONS:
			setInstructions((Instructions) newValue);
			return;
		case RecipePackage.PAGE__INGREDIENTS:
			setIngredients((Ingredients) newValue);
			return;
		case RecipePackage.PAGE__HEADER:
			setHeader((Header) newValue);
			return;
		case RecipePackage.PAGE__NAME:
			setName((String) newValue);
			return;
		case RecipePackage.PAGE__NUTRIENTS:
			setNutrients((Nutrients) newValue);
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
		case RecipePackage.PAGE__INSTRUCTIONS:
			setInstructions((Instructions) null);
			return;
		case RecipePackage.PAGE__INGREDIENTS:
			setIngredients((Ingredients) null);
			return;
		case RecipePackage.PAGE__HEADER:
			setHeader((Header) null);
			return;
		case RecipePackage.PAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RecipePackage.PAGE__NUTRIENTS:
			setNutrients((Nutrients) null);
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
		case RecipePackage.PAGE__INSTRUCTIONS:
			return instructions != null;
		case RecipePackage.PAGE__INGREDIENTS:
			return ingredients != null;
		case RecipePackage.PAGE__HEADER:
			return header != null;
		case RecipePackage.PAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RecipePackage.PAGE__NUTRIENTS:
			return nutrients != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PageImpl
