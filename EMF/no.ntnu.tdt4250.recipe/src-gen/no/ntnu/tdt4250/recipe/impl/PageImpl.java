/**
 */
package no.ntnu.tdt4250.recipe.impl;

import java.util.Collection;

import no.ntnu.tdt4250.recipe.Header;
import no.ntnu.tdt4250.recipe.Ingredients;
import no.ntnu.tdt4250.recipe.Instructions;
import no.ntnu.tdt4250.recipe.Page;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Section;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.PageImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected Instructions instructions;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' reference.
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
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, RecipePackage.PAGE__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions getInstructions() {
		if (instructions != null && instructions.eIsProxy()) {
			InternalEObject oldInstructions = (InternalEObject) instructions;
			instructions = (Instructions) eResolveProxy(oldInstructions);
			if (instructions != oldInstructions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.PAGE__INSTRUCTIONS,
							oldInstructions, instructions));
			}
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions basicGetInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(Instructions newInstructions) {
		Instructions oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__INSTRUCTIONS, oldInstructions,
					instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredients getIngredients() {
		if (ingredients != null && ingredients.eIsProxy()) {
			InternalEObject oldIngredients = (InternalEObject) ingredients;
			ingredients = (Ingredients) eResolveProxy(oldIngredients);
			if (ingredients != oldIngredients) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.PAGE__INGREDIENTS,
							oldIngredients, ingredients));
			}
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredients basicGetIngredients() {
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIngredients(Ingredients newIngredients) {
		Ingredients oldIngredients = ingredients;
		ingredients = newIngredients;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.PAGE__INGREDIENTS, oldIngredients,
					ingredients));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipePackage.PAGE__SECTION:
			return ((InternalEList<?>) getSection()).basicRemove(otherEnd, msgs);
		case RecipePackage.PAGE__HEADER:
			return basicSetHeader(null, msgs);
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
		case RecipePackage.PAGE__SECTION:
			return getSection();
		case RecipePackage.PAGE__INSTRUCTIONS:
			if (resolve)
				return getInstructions();
			return basicGetInstructions();
		case RecipePackage.PAGE__INGREDIENTS:
			if (resolve)
				return getIngredients();
			return basicGetIngredients();
		case RecipePackage.PAGE__HEADER:
			return getHeader();
		case RecipePackage.PAGE__NAME:
			return getName();
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
		case RecipePackage.PAGE__SECTION:
			getSection().clear();
			getSection().addAll((Collection<? extends Section>) newValue);
			return;
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
		case RecipePackage.PAGE__SECTION:
			getSection().clear();
			return;
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
		case RecipePackage.PAGE__SECTION:
			return section != null && !section.isEmpty();
		case RecipePackage.PAGE__INSTRUCTIONS:
			return instructions != null;
		case RecipePackage.PAGE__INGREDIENTS:
			return ingredients != null;
		case RecipePackage.PAGE__HEADER:
			return header != null;
		case RecipePackage.PAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
