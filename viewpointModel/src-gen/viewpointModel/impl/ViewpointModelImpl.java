/**
 */
package viewpointModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import viewpointModel.ModelElement;
import viewpointModel.ViewpointModel;
import viewpointModel.ViewpointModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link viewpointModel.impl.ViewpointModelImpl#getModelelement <em>Modelelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointModelImpl extends MinimalEObjectImpl.Container implements ViewpointModel {
	/**
	 * The cached value of the '{@link #getModelelement() <em>Modelelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointModelPackage.Literals.VIEWPOINT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getModelelement() {
		if (modelelement == null) {
			modelelement = new EObjectContainmentEList<ModelElement>(ModelElement.class, this,
					ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT);
		}
		return modelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT:
			return ((InternalEList<?>) getModelelement()).basicRemove(otherEnd, msgs);
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
		case ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT:
			return getModelelement();
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
		case ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT:
			getModelelement().clear();
			getModelelement().addAll((Collection<? extends ModelElement>) newValue);
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
		case ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT:
			getModelelement().clear();
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
		case ViewpointModelPackage.VIEWPOINT_MODEL__MODELELEMENT:
			return modelelement != null && !modelelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewpointModelImpl
