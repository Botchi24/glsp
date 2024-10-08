/**
 */
package swt.most.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swt.most.statemachine.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link swt.most.statemachine.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link swt.most.statemachine.StateMachine#getFinalstates <em>Finalstates</em>}</li>
 *   <li>{@link swt.most.statemachine.StateMachine#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link swt.most.statemachine.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see swt.most.statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see swt.most.statemachine.StatemachinePackage#getStateMachine_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link swt.most.statemachine.NormalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see swt.most.statemachine.StatemachinePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalState> getStates();

	/**
	 * Returns the value of the '<em><b>Finalstates</b></em>' containment reference list.
	 * The list contents are of type {@link swt.most.statemachine.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalstates</em>' containment reference list.
	 * @see swt.most.statemachine.StatemachinePackage#getStateMachine_Finalstates()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinalState> getFinalstates();

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' containment reference.
	 * @see #setInitialstate(InitialState)
	 * @see swt.most.statemachine.StatemachinePackage#getStateMachine_Initialstate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.StateMachine#getInitialstate <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' containment reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link swt.most.statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see swt.most.statemachine.StatemachinePackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
