/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.Ingredients;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.UnitOfMeasureToggle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredients</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.IngredientsImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.IngredientsImpl#getUnittoggle <em>Unittoggle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientsImpl extends MinimalEObjectImpl.Container implements Ingredients {
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
	 * The cached value of the '{@link #getUnittoggle() <em>Unittoggle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnittoggle()
	 * @generated
	 * @ordered
	 */
	protected UnitOfMeasureToggle unittoggle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.INGREDIENTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENTS__ORDER_NUMBER,
					oldOrderNumber, orderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasureToggle getUnittoggle() {
		return unittoggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnittoggle(UnitOfMeasureToggle newUnittoggle, NotificationChain msgs) {
		UnitOfMeasureToggle oldUnittoggle = unittoggle;
		unittoggle = newUnittoggle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.INGREDIENTS__UNITTOGGLE, oldUnittoggle, newUnittoggle);
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
	public void setUnittoggle(UnitOfMeasureToggle newUnittoggle) {
		if (newUnittoggle != unittoggle) {
			NotificationChain msgs = null;
			if (unittoggle != null)
				msgs = ((InternalEObject) unittoggle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.INGREDIENTS__UNITTOGGLE, null, msgs);
			if (newUnittoggle != null)
				msgs = ((InternalEObject) newUnittoggle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.INGREDIENTS__UNITTOGGLE, null, msgs);
			msgs = basicSetUnittoggle(newUnittoggle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.INGREDIENTS__UNITTOGGLE, newUnittoggle,
					newUnittoggle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipePackage.INGREDIENTS__UNITTOGGLE:
			return basicSetUnittoggle(null, msgs);
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
		case RecipePackage.INGREDIENTS__ORDER_NUMBER:
			return getOrderNumber();
		case RecipePackage.INGREDIENTS__UNITTOGGLE:
			return getUnittoggle();
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
		case RecipePackage.INGREDIENTS__ORDER_NUMBER:
			setOrderNumber((Integer) newValue);
			return;
		case RecipePackage.INGREDIENTS__UNITTOGGLE:
			setUnittoggle((UnitOfMeasureToggle) newValue);
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
		case RecipePackage.INGREDIENTS__ORDER_NUMBER:
			setOrderNumber(ORDER_NUMBER_EDEFAULT);
			return;
		case RecipePackage.INGREDIENTS__UNITTOGGLE:
			setUnittoggle((UnitOfMeasureToggle) null);
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
		case RecipePackage.INGREDIENTS__ORDER_NUMBER:
			return orderNumber != ORDER_NUMBER_EDEFAULT;
		case RecipePackage.INGREDIENTS__UNITTOGGLE:
			return unittoggle != null;
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

} //IngredientsImpl
