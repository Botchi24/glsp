/**
 */
package glspComponentModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see glspComponentModel.GlspComponentModelFactory
 * @model kind="package"
 * @generated
 */
public interface GlspComponentModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "glspComponentModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/glspComponentModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "glspComponentModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlspComponentModelPackage eINSTANCE = glspComponentModel.impl.GlspComponentModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ComponentImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ServerComponentImpl <em>Server Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ServerComponentImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getServerComponent()
	 * @generated
	 */
	int SERVER_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Server Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.LeafComponentImpl <em>Leaf Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.LeafComponentImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getLeafComponent()
	 * @generated
	 */
	int LEAF_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Leaf Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_COMPONENT_FEATURE_COUNT = SERVER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_COMPONENT_OPERATION_COUNT = SERVER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.PackageImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Server Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SERVER_COMPONENTS = SERVER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = SERVER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = SERVER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.DiagramModuleImpl <em>Diagram Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.DiagramModuleImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDiagramModule()
	 * @generated
	 */
	int DIAGRAM_MODULE = 3;

	/**
	 * The number of structural features of the '<em>Diagram Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODULE_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODULE_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.DiagramConfigurationImpl <em>Diagram Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.DiagramConfigurationImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDiagramConfiguration()
	 * @generated
	 */
	int DIAGRAM_CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Diagram Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CONFIGURATION_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CONFIGURATION_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ModelTypesImpl <em>Model Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ModelTypesImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getModelTypes()
	 * @generated
	 */
	int MODEL_TYPES = 5;

	/**
	 * The number of structural features of the '<em>Model Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPES_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPES_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ServerLauncherImpl <em>Server Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ServerLauncherImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getServerLauncher()
	 * @generated
	 */
	int SERVER_LAUNCHER = 6;

	/**
	 * The number of structural features of the '<em>Server Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_LAUNCHER_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_LAUNCHER_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.CreateHandlerImpl <em>Create Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.CreateHandlerImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getCreateHandler()
	 * @generated
	 */
	int CREATE_HANDLER = 7;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HANDLER__ELEMENT_NAME = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HANDLER__REFERENCE_NAME = LEAF_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HANDLER_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HANDLER_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.DeleteHandlerImpl <em>Delete Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.DeleteHandlerImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDeleteHandler()
	 * @generated
	 */
	int DELETE_HANDLER = 8;

	/**
	 * The number of structural features of the '<em>Delete Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_HANDLER_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_HANDLER_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ToolPaletteItemProviderImpl <em>Tool Palette Item Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ToolPaletteItemProviderImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getToolPaletteItemProvider()
	 * @generated
	 */
	int TOOL_PALETTE_ITEM_PROVIDER = 9;

	/**
	 * The number of structural features of the '<em>Tool Palette Item Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_PALETTE_ITEM_PROVIDER_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tool Palette Item Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_PALETTE_ITEM_PROVIDER_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.SourceModelStorageImpl <em>Source Model Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.SourceModelStorageImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getSourceModelStorage()
	 * @generated
	 */
	int SOURCE_MODEL_STORAGE = 10;

	/**
	 * The number of structural features of the '<em>Source Model Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_STORAGE_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Model Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_STORAGE_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.GModelFactoryImpl <em>GModel Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.GModelFactoryImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getGModelFactory()
	 * @generated
	 */
	int GMODEL_FACTORY = 11;

	/**
	 * The number of structural features of the '<em>GModel Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_FACTORY_FEATURE_COUNT = LEAF_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GModel Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_FACTORY_OPERATION_COUNT = LEAF_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ClientComponentImpl <em>Client Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ClientComponentImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getClientComponent()
	 * @generated
	 */
	int CLIENT_COMPONENT = 12;

	/**
	 * The number of structural features of the '<em>Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ComponentModelImpl <em>Component Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ComponentModelImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getComponentModel()
	 * @generated
	 */
	int COMPONENT_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.EMFSourceModelStorageImpl <em>EMF Source Model Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.EMFSourceModelStorageImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getEMFSourceModelStorage()
	 * @generated
	 */
	int EMF_SOURCE_MODEL_STORAGE = 15;

	/**
	 * The number of structural features of the '<em>EMF Source Model Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SOURCE_MODEL_STORAGE_FEATURE_COUNT = SOURCE_MODEL_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EMF Source Model Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SOURCE_MODEL_STORAGE_OPERATION_COUNT = SOURCE_MODEL_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.GModelStorageImpl <em>GModel Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.GModelStorageImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getGModelStorage()
	 * @generated
	 */
	int GMODEL_STORAGE = 16;

	/**
	 * The number of structural features of the '<em>GModel Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_STORAGE_FEATURE_COUNT = SOURCE_MODEL_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GModel Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_STORAGE_OPERATION_COUNT = SOURCE_MODEL_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link glspComponentModel.impl.ProjectComponentImpl <em>Project Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glspComponentModel.impl.ProjectComponentImpl
	 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getProjectComponent()
	 * @generated
	 */
	int PROJECT_COMPONENT = 17;

	/**
	 * The number of structural features of the '<em>Project Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ServerComponent <em>Server Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Component</em>'.
	 * @see glspComponentModel.ServerComponent
	 * @generated
	 */
	EClass getServerComponent();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.LeafComponent <em>Leaf Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Component</em>'.
	 * @see glspComponentModel.LeafComponent
	 * @generated
	 */
	EClass getLeafComponent();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see glspComponentModel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link glspComponentModel.Package#getServerComponents <em>Server Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server Components</em>'.
	 * @see glspComponentModel.Package#getServerComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ServerComponents();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.DiagramModule <em>Diagram Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Module</em>'.
	 * @see glspComponentModel.DiagramModule
	 * @generated
	 */
	EClass getDiagramModule();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.DiagramConfiguration <em>Diagram Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Configuration</em>'.
	 * @see glspComponentModel.DiagramConfiguration
	 * @generated
	 */
	EClass getDiagramConfiguration();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ModelTypes <em>Model Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Types</em>'.
	 * @see glspComponentModel.ModelTypes
	 * @generated
	 */
	EClass getModelTypes();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ServerLauncher <em>Server Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Launcher</em>'.
	 * @see glspComponentModel.ServerLauncher
	 * @generated
	 */
	EClass getServerLauncher();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.CreateHandler <em>Create Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Handler</em>'.
	 * @see glspComponentModel.CreateHandler
	 * @generated
	 */
	EClass getCreateHandler();

	/**
	 * Returns the meta object for the attribute '{@link glspComponentModel.CreateHandler#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see glspComponentModel.CreateHandler#getElementName()
	 * @see #getCreateHandler()
	 * @generated
	 */
	EAttribute getCreateHandler_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link glspComponentModel.CreateHandler#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see glspComponentModel.CreateHandler#getReferenceName()
	 * @see #getCreateHandler()
	 * @generated
	 */
	EAttribute getCreateHandler_ReferenceName();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.DeleteHandler <em>Delete Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Handler</em>'.
	 * @see glspComponentModel.DeleteHandler
	 * @generated
	 */
	EClass getDeleteHandler();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ToolPaletteItemProvider <em>Tool Palette Item Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Palette Item Provider</em>'.
	 * @see glspComponentModel.ToolPaletteItemProvider
	 * @generated
	 */
	EClass getToolPaletteItemProvider();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.SourceModelStorage <em>Source Model Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model Storage</em>'.
	 * @see glspComponentModel.SourceModelStorage
	 * @generated
	 */
	EClass getSourceModelStorage();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.GModelFactory <em>GModel Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GModel Factory</em>'.
	 * @see glspComponentModel.GModelFactory
	 * @generated
	 */
	EClass getGModelFactory();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ClientComponent <em>Client Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Component</em>'.
	 * @see glspComponentModel.ClientComponent
	 * @generated
	 */
	EClass getClientComponent();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see glspComponentModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ComponentModel <em>Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Model</em>'.
	 * @see glspComponentModel.ComponentModel
	 * @generated
	 */
	EClass getComponentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link glspComponentModel.ComponentModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see glspComponentModel.ComponentModel#getComponents()
	 * @see #getComponentModel()
	 * @generated
	 */
	EReference getComponentModel_Components();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.EMFSourceModelStorage <em>EMF Source Model Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Source Model Storage</em>'.
	 * @see glspComponentModel.EMFSourceModelStorage
	 * @generated
	 */
	EClass getEMFSourceModelStorage();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.GModelStorage <em>GModel Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GModel Storage</em>'.
	 * @see glspComponentModel.GModelStorage
	 * @generated
	 */
	EClass getGModelStorage();

	/**
	 * Returns the meta object for class '{@link glspComponentModel.ProjectComponent <em>Project Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Component</em>'.
	 * @see glspComponentModel.ProjectComponent
	 * @generated
	 */
	EClass getProjectComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlspComponentModelFactory getGlspComponentModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ServerComponentImpl <em>Server Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ServerComponentImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getServerComponent()
		 * @generated
		 */
		EClass SERVER_COMPONENT = eINSTANCE.getServerComponent();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.LeafComponentImpl <em>Leaf Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.LeafComponentImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getLeafComponent()
		 * @generated
		 */
		EClass LEAF_COMPONENT = eINSTANCE.getLeafComponent();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.PackageImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Server Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SERVER_COMPONENTS = eINSTANCE.getPackage_ServerComponents();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.DiagramModuleImpl <em>Diagram Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.DiagramModuleImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDiagramModule()
		 * @generated
		 */
		EClass DIAGRAM_MODULE = eINSTANCE.getDiagramModule();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.DiagramConfigurationImpl <em>Diagram Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.DiagramConfigurationImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDiagramConfiguration()
		 * @generated
		 */
		EClass DIAGRAM_CONFIGURATION = eINSTANCE.getDiagramConfiguration();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ModelTypesImpl <em>Model Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ModelTypesImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getModelTypes()
		 * @generated
		 */
		EClass MODEL_TYPES = eINSTANCE.getModelTypes();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ServerLauncherImpl <em>Server Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ServerLauncherImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getServerLauncher()
		 * @generated
		 */
		EClass SERVER_LAUNCHER = eINSTANCE.getServerLauncher();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.CreateHandlerImpl <em>Create Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.CreateHandlerImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getCreateHandler()
		 * @generated
		 */
		EClass CREATE_HANDLER = eINSTANCE.getCreateHandler();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_HANDLER__ELEMENT_NAME = eINSTANCE.getCreateHandler_ElementName();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_HANDLER__REFERENCE_NAME = eINSTANCE.getCreateHandler_ReferenceName();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.DeleteHandlerImpl <em>Delete Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.DeleteHandlerImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getDeleteHandler()
		 * @generated
		 */
		EClass DELETE_HANDLER = eINSTANCE.getDeleteHandler();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ToolPaletteItemProviderImpl <em>Tool Palette Item Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ToolPaletteItemProviderImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getToolPaletteItemProvider()
		 * @generated
		 */
		EClass TOOL_PALETTE_ITEM_PROVIDER = eINSTANCE.getToolPaletteItemProvider();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.SourceModelStorageImpl <em>Source Model Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.SourceModelStorageImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getSourceModelStorage()
		 * @generated
		 */
		EClass SOURCE_MODEL_STORAGE = eINSTANCE.getSourceModelStorage();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.GModelFactoryImpl <em>GModel Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.GModelFactoryImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getGModelFactory()
		 * @generated
		 */
		EClass GMODEL_FACTORY = eINSTANCE.getGModelFactory();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ClientComponentImpl <em>Client Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ClientComponentImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getClientComponent()
		 * @generated
		 */
		EClass CLIENT_COMPONENT = eINSTANCE.getClientComponent();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ComponentImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ComponentModelImpl <em>Component Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ComponentModelImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getComponentModel()
		 * @generated
		 */
		EClass COMPONENT_MODEL = eINSTANCE.getComponentModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL__COMPONENTS = eINSTANCE.getComponentModel_Components();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.EMFSourceModelStorageImpl <em>EMF Source Model Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.EMFSourceModelStorageImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getEMFSourceModelStorage()
		 * @generated
		 */
		EClass EMF_SOURCE_MODEL_STORAGE = eINSTANCE.getEMFSourceModelStorage();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.GModelStorageImpl <em>GModel Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.GModelStorageImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getGModelStorage()
		 * @generated
		 */
		EClass GMODEL_STORAGE = eINSTANCE.getGModelStorage();

		/**
		 * The meta object literal for the '{@link glspComponentModel.impl.ProjectComponentImpl <em>Project Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glspComponentModel.impl.ProjectComponentImpl
		 * @see glspComponentModel.impl.GlspComponentModelPackageImpl#getProjectComponent()
		 * @generated
		 */
		EClass PROJECT_COMPONENT = eINSTANCE.getProjectComponent();

	}

} //GlspComponentModelPackage
