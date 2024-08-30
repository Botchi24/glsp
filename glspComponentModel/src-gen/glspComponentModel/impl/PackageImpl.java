/**
 */
package glspComponentModel.impl;

import glspComponentModel.GlspComponentModelPackage;
import glspComponentModel.ServerComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glspComponentModel.impl.PackageImpl#getServerComponents <em>Server Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ServerComponentImpl implements glspComponentModel.Package {
	/**
	 * The cached value of the '{@link #getServerComponents() <em>Server Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerComponent> serverComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlspComponentModelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServerComponent> getServerComponents() {
		if (serverComponents == null) {
			serverComponents = new EObjectContainmentEList<ServerComponent>(ServerComponent.class, this,
					GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS);
		}
		return serverComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS:
			return ((InternalEList<?>) getServerComponents()).basicRemove(otherEnd, msgs);
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
		case GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS:
			return getServerComponents();
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
		case GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS:
			getServerComponents().clear();
			getServerComponents().addAll((Collection<? extends ServerComponent>) newValue);
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
		case GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS:
			getServerComponents().clear();
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
		case GlspComponentModelPackage.PACKAGE__SERVER_COMPONENTS:
			return serverComponents != null && !serverComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
