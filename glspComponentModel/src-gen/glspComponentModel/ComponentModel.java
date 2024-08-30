/**
 */
package glspComponentModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glspComponentModel.ComponentModel#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see glspComponentModel.GlspComponentModelPackage#getComponentModel()
 * @model
 * @generated
 */
public interface ComponentModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link glspComponentModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see glspComponentModel.GlspComponentModelPackage#getComponentModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // ComponentModel
