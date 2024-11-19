/**
 */
package viewpointModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link viewpointModel.ViewpointModel#getModelelement <em>Modelelement</em>}</li>
 * </ul>
 *
 * @see viewpointModel.ViewpointModelPackage#getViewpointModel()
 * @model
 * @generated
 */
public interface ViewpointModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelelement</b></em>' containment reference list.
	 * The list contents are of type {@link viewpointModel.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelement</em>' containment reference list.
	 * @see viewpointModel.ViewpointModelPackage#getViewpointModel_Modelelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelement();

} // ViewpointModel
