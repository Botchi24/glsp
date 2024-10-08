/**
 */
package swt.most.statemachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import swt.most.statemachine.Action;
import swt.most.statemachine.NormalState;
import swt.most.statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swt.most.statemachine.impl.NormalStateImpl#getDo_ <em>Do </em>}</li>
 *   <li>{@link swt.most.statemachine.impl.NormalStateImpl#getExit_ <em>Exit </em>}</li>
 *   <li>{@link swt.most.statemachine.impl.NormalStateImpl#getEntry_ <em>Entry </em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalStateImpl extends StateImpl implements NormalState {
	/**
	 * The cached value of the '{@link #getDo_() <em>Do </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo_()
	 * @generated
	 * @ordered
	 */
	protected Action do_;

	/**
	 * The cached value of the '{@link #getExit_() <em>Exit </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit_()
	 * @generated
	 * @ordered
	 */
	protected Action exit_;

	/**
	 * The cached value of the '{@link #getEntry_() <em>Entry </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry_()
	 * @generated
	 * @ordered
	 */
	protected Action entry_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.NORMAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getDo_() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDo_(Action newDo_, NotificationChain msgs) {
		Action oldDo_ = do_;
		do_ = newDo_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.NORMAL_STATE__DO_, oldDo_, newDo_);
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
	public void setDo_(Action newDo_) {
		if (newDo_ != do_) {
			NotificationChain msgs = null;
			if (do_ != null)
				msgs = ((InternalEObject) do_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__DO_, null, msgs);
			if (newDo_ != null)
				msgs = ((InternalEObject) newDo_).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__DO_, null, msgs);
			msgs = basicSetDo_(newDo_, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.NORMAL_STATE__DO_, newDo_,
					newDo_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getExit_() {
		return exit_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit_(Action newExit_, NotificationChain msgs) {
		Action oldExit_ = exit_;
		exit_ = newExit_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.NORMAL_STATE__EXIT_, oldExit_, newExit_);
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
	public void setExit_(Action newExit_) {
		if (newExit_ != exit_) {
			NotificationChain msgs = null;
			if (exit_ != null)
				msgs = ((InternalEObject) exit_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__EXIT_, null, msgs);
			if (newExit_ != null)
				msgs = ((InternalEObject) newExit_).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__EXIT_, null, msgs);
			msgs = basicSetExit_(newExit_, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.NORMAL_STATE__EXIT_, newExit_,
					newExit_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getEntry_() {
		return entry_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry_(Action newEntry_, NotificationChain msgs) {
		Action oldEntry_ = entry_;
		entry_ = newEntry_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.NORMAL_STATE__ENTRY_, oldEntry_, newEntry_);
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
	public void setEntry_(Action newEntry_) {
		if (newEntry_ != entry_) {
			NotificationChain msgs = null;
			if (entry_ != null)
				msgs = ((InternalEObject) entry_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__ENTRY_, null, msgs);
			if (newEntry_ != null)
				msgs = ((InternalEObject) newEntry_).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.NORMAL_STATE__ENTRY_, null, msgs);
			msgs = basicSetEntry_(newEntry_, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.NORMAL_STATE__ENTRY_, newEntry_,
					newEntry_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.NORMAL_STATE__DO_:
			return basicSetDo_(null, msgs);
		case StatemachinePackage.NORMAL_STATE__EXIT_:
			return basicSetExit_(null, msgs);
		case StatemachinePackage.NORMAL_STATE__ENTRY_:
			return basicSetEntry_(null, msgs);
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
		case StatemachinePackage.NORMAL_STATE__DO_:
			return getDo_();
		case StatemachinePackage.NORMAL_STATE__EXIT_:
			return getExit_();
		case StatemachinePackage.NORMAL_STATE__ENTRY_:
			return getEntry_();
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
		case StatemachinePackage.NORMAL_STATE__DO_:
			setDo_((Action) newValue);
			return;
		case StatemachinePackage.NORMAL_STATE__EXIT_:
			setExit_((Action) newValue);
			return;
		case StatemachinePackage.NORMAL_STATE__ENTRY_:
			setEntry_((Action) newValue);
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
		case StatemachinePackage.NORMAL_STATE__DO_:
			setDo_((Action) null);
			return;
		case StatemachinePackage.NORMAL_STATE__EXIT_:
			setExit_((Action) null);
			return;
		case StatemachinePackage.NORMAL_STATE__ENTRY_:
			setEntry_((Action) null);
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
		case StatemachinePackage.NORMAL_STATE__DO_:
			return do_ != null;
		case StatemachinePackage.NORMAL_STATE__EXIT_:
			return exit_ != null;
		case StatemachinePackage.NORMAL_STATE__ENTRY_:
			return entry_ != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalStateImpl
