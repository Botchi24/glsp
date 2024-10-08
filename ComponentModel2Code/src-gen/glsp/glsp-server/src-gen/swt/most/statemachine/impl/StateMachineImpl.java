/**
 */
package swt.most.statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swt.most.statemachine.FinalState;
import swt.most.statemachine.InitialState;
import swt.most.statemachine.NormalState;
import swt.most.statemachine.StateMachine;
import swt.most.statemachine.StatemachinePackage;
import swt.most.statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swt.most.statemachine.impl.StateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link swt.most.statemachine.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link swt.most.statemachine.impl.StateMachineImpl#getFinalstates <em>Finalstates</em>}</li>
 *   <li>{@link swt.most.statemachine.impl.StateMachineImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link swt.most.statemachine.impl.StateMachineImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalState> states;

	/**
	 * The cached value of the '{@link #getFinalstates() <em>Finalstates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalstates()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalState> finalstates;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NormalState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<NormalState>(NormalState.class, this,
					StatemachinePackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalState> getFinalstates() {
		if (finalstates == null) {
			finalstates = new EObjectContainmentEList<FinalState>(FinalState.class, this,
					StatemachinePackage.STATE_MACHINE__FINALSTATES);
		}
		return finalstates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialstate(InitialState newInitialstate, NotificationChain msgs) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatemachinePackage.STATE_MACHINE__INITIALSTATE, oldInitialstate, newInitialstate);
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
	public void setInitialstate(InitialState newInitialstate) {
		if (newInitialstate != initialstate) {
			NotificationChain msgs = null;
			if (initialstate != null)
				msgs = ((InternalEObject) initialstate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE_MACHINE__INITIALSTATE, null, msgs);
			if (newInitialstate != null)
				msgs = ((InternalEObject) newInitialstate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatemachinePackage.STATE_MACHINE__INITIALSTATE, null, msgs);
			msgs = basicSetInitialstate(newInitialstate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__INITIALSTATE,
					newInitialstate, newInitialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					StatemachinePackage.STATE_MACHINE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.STATE_MACHINE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__FINALSTATES:
			return ((InternalEList<?>) getFinalstates()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__INITIALSTATE:
			return basicSetInitialstate(null, msgs);
		case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			return getName();
		case StatemachinePackage.STATE_MACHINE__STATES:
			return getStates();
		case StatemachinePackage.STATE_MACHINE__FINALSTATES:
			return getFinalstates();
		case StatemachinePackage.STATE_MACHINE__INITIALSTATE:
			return getInitialstate();
		case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
			return getTransitions();
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			setName((String) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends NormalState>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__FINALSTATES:
			getFinalstates().clear();
			getFinalstates().addAll((Collection<? extends FinalState>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__INITIALSTATE:
			setInitialstate((InitialState) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatemachinePackage.STATE_MACHINE__STATES:
			getStates().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__FINALSTATES:
			getFinalstates().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__INITIALSTATE:
			setInitialstate((InitialState) null);
			return;
		case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
			getTransitions().clear();
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatemachinePackage.STATE_MACHINE__STATES:
			return states != null && !states.isEmpty();
		case StatemachinePackage.STATE_MACHINE__FINALSTATES:
			return finalstates != null && !finalstates.isEmpty();
		case StatemachinePackage.STATE_MACHINE__INITIALSTATE:
			return initialstate != null;
		case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
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

} //StateMachineImpl
