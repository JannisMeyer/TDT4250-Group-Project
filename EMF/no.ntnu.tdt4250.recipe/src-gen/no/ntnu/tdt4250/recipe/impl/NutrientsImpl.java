/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.Macronutrients;
import no.ntnu.tdt4250.recipe.Nutrients;
import no.ntnu.tdt4250.recipe.PercentageAmountToggle;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Vitamins;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrients</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl#getPercentagetoggle <em>Percentagetoggle</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl#getVitamins <em>Vitamins</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.NutrientsImpl#getMacronutrients <em>Macronutrients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutrientsImpl extends MinimalEObjectImpl.Container implements Nutrients {
	/**
	 * The default value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected int orderNumber = ORDER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPercentagetoggle() <em>Percentagetoggle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentagetoggle()
	 * @generated
	 * @ordered
	 */
	protected PercentageAmountToggle percentagetoggle;

	/**
	 * The cached value of the '{@link #getVitamins() <em>Vitamins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitamins()
	 * @generated
	 * @ordered
	 */
	protected Vitamins vitamins;

	/**
	 * The cached value of the '{@link #getMacronutrients() <em>Macronutrients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacronutrients()
	 * @generated
	 * @ordered
	 */
	protected Macronutrients macronutrients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutrientsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.NUTRIENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumber(int newOrderNumber) {
		int oldOrderNumber = orderNumber;
		orderNumber = newOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.NUTRIENTS__ORDER_NUMBER, oldOrderNumber,
					orderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageAmountToggle getPercentagetoggle() {
		return percentagetoggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentagetoggle(PercentageAmountToggle newPercentagetoggle,
			NotificationChain msgs) {
		PercentageAmountToggle oldPercentagetoggle = percentagetoggle;
		percentagetoggle = newPercentagetoggle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.NUTRIENTS__PERCENTAGETOGGLE, oldPercentagetoggle, newPercentagetoggle);
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
	public void setPercentagetoggle(PercentageAmountToggle newPercentagetoggle) {
		if (newPercentagetoggle != percentagetoggle) {
			NotificationChain msgs = null;
			if (percentagetoggle != null)
				msgs = ((InternalEObject) percentagetoggle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__PERCENTAGETOGGLE, null, msgs);
			if (newPercentagetoggle != null)
				msgs = ((InternalEObject) newPercentagetoggle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__PERCENTAGETOGGLE, null, msgs);
			msgs = basicSetPercentagetoggle(newPercentagetoggle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.NUTRIENTS__PERCENTAGETOGGLE,
					newPercentagetoggle, newPercentagetoggle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vitamins getVitamins() {
		return vitamins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitamins(Vitamins newVitamins, NotificationChain msgs) {
		Vitamins oldVitamins = vitamins;
		vitamins = newVitamins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.NUTRIENTS__VITAMINS, oldVitamins, newVitamins);
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
	public void setVitamins(Vitamins newVitamins) {
		if (newVitamins != vitamins) {
			NotificationChain msgs = null;
			if (vitamins != null)
				msgs = ((InternalEObject) vitamins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__VITAMINS, null, msgs);
			if (newVitamins != null)
				msgs = ((InternalEObject) newVitamins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__VITAMINS, null, msgs);
			msgs = basicSetVitamins(newVitamins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.NUTRIENTS__VITAMINS, newVitamins,
					newVitamins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Macronutrients getMacronutrients() {
		return macronutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacronutrients(Macronutrients newMacronutrients, NotificationChain msgs) {
		Macronutrients oldMacronutrients = macronutrients;
		macronutrients = newMacronutrients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.NUTRIENTS__MACRONUTRIENTS, oldMacronutrients, newMacronutrients);
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
	public void setMacronutrients(Macronutrients newMacronutrients) {
		if (newMacronutrients != macronutrients) {
			NotificationChain msgs = null;
			if (macronutrients != null)
				msgs = ((InternalEObject) macronutrients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__MACRONUTRIENTS, null, msgs);
			if (newMacronutrients != null)
				msgs = ((InternalEObject) newMacronutrients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.NUTRIENTS__MACRONUTRIENTS, null, msgs);
			msgs = basicSetMacronutrients(newMacronutrients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.NUTRIENTS__MACRONUTRIENTS,
					newMacronutrients, newMacronutrients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipePackage.NUTRIENTS__PERCENTAGETOGGLE:
			return basicSetPercentagetoggle(null, msgs);
		case RecipePackage.NUTRIENTS__VITAMINS:
			return basicSetVitamins(null, msgs);
		case RecipePackage.NUTRIENTS__MACRONUTRIENTS:
			return basicSetMacronutrients(null, msgs);
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
		case RecipePackage.NUTRIENTS__ORDER_NUMBER:
			return getOrderNumber();
		case RecipePackage.NUTRIENTS__PERCENTAGETOGGLE:
			return getPercentagetoggle();
		case RecipePackage.NUTRIENTS__VITAMINS:
			return getVitamins();
		case RecipePackage.NUTRIENTS__MACRONUTRIENTS:
			return getMacronutrients();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RecipePackage.NUTRIENTS__ORDER_NUMBER:
			setOrderNumber((Integer) newValue);
			return;
		case RecipePackage.NUTRIENTS__PERCENTAGETOGGLE:
			setPercentagetoggle((PercentageAmountToggle) newValue);
			return;
		case RecipePackage.NUTRIENTS__VITAMINS:
			setVitamins((Vitamins) newValue);
			return;
		case RecipePackage.NUTRIENTS__MACRONUTRIENTS:
			setMacronutrients((Macronutrients) newValue);
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
		case RecipePackage.NUTRIENTS__ORDER_NUMBER:
			setOrderNumber(ORDER_NUMBER_EDEFAULT);
			return;
		case RecipePackage.NUTRIENTS__PERCENTAGETOGGLE:
			setPercentagetoggle((PercentageAmountToggle) null);
			return;
		case RecipePackage.NUTRIENTS__VITAMINS:
			setVitamins((Vitamins) null);
			return;
		case RecipePackage.NUTRIENTS__MACRONUTRIENTS:
			setMacronutrients((Macronutrients) null);
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
		case RecipePackage.NUTRIENTS__ORDER_NUMBER:
			return orderNumber != ORDER_NUMBER_EDEFAULT;
		case RecipePackage.NUTRIENTS__PERCENTAGETOGGLE:
			return percentagetoggle != null;
		case RecipePackage.NUTRIENTS__VITAMINS:
			return vitamins != null;
		case RecipePackage.NUTRIENTS__MACRONUTRIENTS:
			return macronutrients != null;
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
		result.append(" (orderNumber: ");
		result.append(orderNumber);
		result.append(')');
		return result.toString();
	}

} //NutrientsImpl
