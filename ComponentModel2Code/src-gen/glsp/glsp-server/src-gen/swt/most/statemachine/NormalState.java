/**
 */
package swt.most.statemachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swt.most.statemachine.NormalState#getDo_ <em>Do </em>}</li>
 *   <li>{@link swt.most.statemachine.NormalState#getExit_ <em>Exit </em>}</li>
 *   <li>{@link swt.most.statemachine.NormalState#getEntry_ <em>Entry </em>}</li>
 * </ul>
 *
 * @see swt.most.statemachine.StatemachinePackage#getNormalState()
 * @model
 * @generated
 */
public interface NormalState extends State {
	/**
	 * Returns the value of the '<em><b>Do </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do </em>' containment reference.
	 * @see #setDo_(Action)
	 * @see swt.most.statemachine.StatemachinePackage#getNormalState_Do_()
	 * @model containment="true"
	 * @generated
	 */
	Action getDo_();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.NormalState#getDo_ <em>Do </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do </em>' containment reference.
	 * @see #getDo_()
	 * @generated
	 */
	void setDo_(Action value);

	/**
	 * Returns the value of the '<em><b>Exit </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit </em>' containment reference.
	 * @see #setExit_(Action)
	 * @see swt.most.statemachine.StatemachinePackage#getNormalState_Exit_()
	 * @model containment="true"
	 * @generated
	 */
	Action getExit_();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.NormalState#getExit_ <em>Exit </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit </em>' containment reference.
	 * @see #getExit_()
	 * @generated
	 */
	void setExit_(Action value);

	/**
	 * Returns the value of the '<em><b>Entry </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry </em>' containment reference.
	 * @see #setEntry_(Action)
	 * @see swt.most.statemachine.StatemachinePackage#getNormalState_Entry_()
	 * @model containment="true"
	 * @generated
	 */
	Action getEntry_();

	/**
	 * Sets the value of the '{@link swt.most.statemachine.NormalState#getEntry_ <em>Entry </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry </em>' containment reference.
	 * @see #getEntry_()
	 * @generated
	 */
	void setEntry_(Action value);

} // NormalState
