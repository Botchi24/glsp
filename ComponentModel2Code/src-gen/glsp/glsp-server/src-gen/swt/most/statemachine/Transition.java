/**
 */
package swt.most.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swt.most.statemachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link swt.most.statemachine.Transition#getTo <em>To</em>}</li>
 *   <li>{@link swt.most.statemachine.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link swt.most.statemachine.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link swt.most.statemachine.Transition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see swt.most.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see swt.most.statemachine.StatemachinePackage#getTransition_From()
	 * @model required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see swt.most.statemachine.StatemachinePackage#getTransition_To()
	 * @model required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Trigger)
	 * @see swt.most.statemachine.StatemachinePackage#getTransition_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.Transition#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see swt.most.statemachine.StatemachinePackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see swt.most.statemachine.StatemachinePackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.Transition#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Transition
