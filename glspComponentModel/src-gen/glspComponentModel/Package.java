/**
 */
package glspComponentModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glspComponentModel.Package#getServerComponents <em>Server Components</em>}</li>
 * </ul>
 *
 * @see glspComponentModel.GlspComponentModelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ServerComponent {
	/**
	 * Returns the value of the '<em><b>Server Components</b></em>' containment reference list.
	 * The list contents are of type {@link glspComponentModel.ServerComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Components</em>' containment reference list.
	 * @see glspComponentModel.GlspComponentModelPackage#getPackage_ServerComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerComponent> getServerComponents();

} // Package
