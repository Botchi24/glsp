/**
 */
package glspComponentModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see glspComponentModel.GlspComponentModelPackage
 * @generated
 */
public interface GlspComponentModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlspComponentModelFactory eINSTANCE = glspComponentModel.impl.GlspComponentModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Server Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Component</em>'.
	 * @generated
	 */
	ServerComponent createServerComponent();

	/**
	 * Returns a new object of class '<em>Leaf Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Component</em>'.
	 * @generated
	 */
	LeafComponent createLeafComponent();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Diagram Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Module</em>'.
	 * @generated
	 */
	DiagramModule createDiagramModule();

	/**
	 * Returns a new object of class '<em>Diagram Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Configuration</em>'.
	 * @generated
	 */
	DiagramConfiguration createDiagramConfiguration();

	/**
	 * Returns a new object of class '<em>Model Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Types</em>'.
	 * @generated
	 */
	ModelTypes createModelTypes();

	/**
	 * Returns a new object of class '<em>Server Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Launcher</em>'.
	 * @generated
	 */
	ServerLauncher createServerLauncher();

	/**
	 * Returns a new object of class '<em>Create Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Handler</em>'.
	 * @generated
	 */
	CreateHandler createCreateHandler();

	/**
	 * Returns a new object of class '<em>Delete Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Handler</em>'.
	 * @generated
	 */
	DeleteHandler createDeleteHandler();

	/**
	 * Returns a new object of class '<em>Tool Palette Item Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Palette Item Provider</em>'.
	 * @generated
	 */
	ToolPaletteItemProvider createToolPaletteItemProvider();

	/**
	 * Returns a new object of class '<em>Source Model Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Model Storage</em>'.
	 * @generated
	 */
	SourceModelStorage createSourceModelStorage();

	/**
	 * Returns a new object of class '<em>GModel Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GModel Factory</em>'.
	 * @generated
	 */
	GModelFactory createGModelFactory();

	/**
	 * Returns a new object of class '<em>Client Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Component</em>'.
	 * @generated
	 */
	ClientComponent createClientComponent();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Model</em>'.
	 * @generated
	 */
	ComponentModel createComponentModel();

	/**
	 * Returns a new object of class '<em>EMF Source Model Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Source Model Storage</em>'.
	 * @generated
	 */
	EMFSourceModelStorage createEMFSourceModelStorage();

	/**
	 * Returns a new object of class '<em>GModel Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GModel Storage</em>'.
	 * @generated
	 */
	GModelStorage createGModelStorage();

	/**
	 * Returns a new object of class '<em>Project Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Component</em>'.
	 * @generated
	 */
	ProjectComponent createProjectComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlspComponentModelPackage getGlspComponentModelPackage();

} //GlspComponentModelFactory
