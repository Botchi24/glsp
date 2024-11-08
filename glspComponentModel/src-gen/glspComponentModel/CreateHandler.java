/**
 */
package glspComponentModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glspComponentModel.CreateHandler#getElementName <em>Element Name</em>}</li>
 *   <li>{@link glspComponentModel.CreateHandler#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @see glspComponentModel.GlspComponentModelPackage#getCreateHandler()
 * @model
 * @generated
 */
public interface CreateHandler extends LeafComponent {

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see glspComponentModel.GlspComponentModelPackage#getCreateHandler_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link glspComponentModel.CreateHandler#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see glspComponentModel.GlspComponentModelPackage#getCreateHandler_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link glspComponentModel.CreateHandler#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);
} // CreateHandler
