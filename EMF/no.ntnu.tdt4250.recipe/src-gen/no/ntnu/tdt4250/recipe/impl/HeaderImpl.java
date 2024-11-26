/**
 */
package no.ntnu.tdt4250.recipe.impl;

import no.ntnu.tdt4250.recipe.BasicInformation;
import no.ntnu.tdt4250.recipe.Header;
import no.ntnu.tdt4250.recipe.Image;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.Title;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.HeaderImpl#getBasicinformation <em>Basicinformation</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.HeaderImpl#getRecipetitle <em>Recipetitle</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.recipe.impl.HeaderImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
	/**
	 * The cached value of the '{@link #getBasicinformation() <em>Basicinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicinformation()
	 * @generated
	 * @ordered
	 */
	protected BasicInformation basicinformation;

	/**
	 * The cached value of the '{@link #getRecipetitle() <em>Recipetitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipetitle()
	 * @generated
	 * @ordered
	 */
	protected Title recipetitle;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicInformation getBasicinformation() {
		return basicinformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicinformation(BasicInformation newBasicinformation, NotificationChain msgs) {
		BasicInformation oldBasicinformation = basicinformation;
		basicinformation = newBasicinformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.HEADER__BASICINFORMATION, oldBasicinformation, newBasicinformation);
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
	public void setBasicinformation(BasicInformation newBasicinformation) {
		if (newBasicinformation != basicinformation) {
			NotificationChain msgs = null;
			if (basicinformation != null)
				msgs = ((InternalEObject) basicinformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__BASICINFORMATION, null, msgs);
			if (newBasicinformation != null)
				msgs = ((InternalEObject) newBasicinformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__BASICINFORMATION, null, msgs);
			msgs = basicSetBasicinformation(newBasicinformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.HEADER__BASICINFORMATION,
					newBasicinformation, newBasicinformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title getRecipetitle() {
		return recipetitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipetitle(Title newRecipetitle, NotificationChain msgs) {
		Title oldRecipetitle = recipetitle;
		recipetitle = newRecipetitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RecipePackage.HEADER__RECIPETITLE, oldRecipetitle, newRecipetitle);
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
	public void setRecipetitle(Title newRecipetitle) {
		if (newRecipetitle != recipetitle) {
			NotificationChain msgs = null;
			if (recipetitle != null)
				msgs = ((InternalEObject) recipetitle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__RECIPETITLE, null, msgs);
			if (newRecipetitle != null)
				msgs = ((InternalEObject) newRecipetitle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__RECIPETITLE, null, msgs);
			msgs = basicSetRecipetitle(newRecipetitle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.HEADER__RECIPETITLE, newRecipetitle,
					newRecipetitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.HEADER__IMAGE,
					oldImage, newImage);
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
	public void setImage(Image newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject) image).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject) newImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RecipePackage.HEADER__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.HEADER__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipePackage.HEADER__BASICINFORMATION:
			return basicSetBasicinformation(null, msgs);
		case RecipePackage.HEADER__RECIPETITLE:
			return basicSetRecipetitle(null, msgs);
		case RecipePackage.HEADER__IMAGE:
			return basicSetImage(null, msgs);
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
		case RecipePackage.HEADER__BASICINFORMATION:
			return getBasicinformation();
		case RecipePackage.HEADER__RECIPETITLE:
			return getRecipetitle();
		case RecipePackage.HEADER__IMAGE:
			return getImage();
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
		case RecipePackage.HEADER__BASICINFORMATION:
			setBasicinformation((BasicInformation) newValue);
			return;
		case RecipePackage.HEADER__RECIPETITLE:
			setRecipetitle((Title) newValue);
			return;
		case RecipePackage.HEADER__IMAGE:
			setImage((Image) newValue);
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
		case RecipePackage.HEADER__BASICINFORMATION:
			setBasicinformation((BasicInformation) null);
			return;
		case RecipePackage.HEADER__RECIPETITLE:
			setRecipetitle((Title) null);
			return;
		case RecipePackage.HEADER__IMAGE:
			setImage((Image) null);
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
		case RecipePackage.HEADER__BASICINFORMATION:
			return basicinformation != null;
		case RecipePackage.HEADER__RECIPETITLE:
			return recipetitle != null;
		case RecipePackage.HEADER__IMAGE:
			return image != null;
		}
		return super.eIsSet(featureID);
	}

} //HeaderImpl
