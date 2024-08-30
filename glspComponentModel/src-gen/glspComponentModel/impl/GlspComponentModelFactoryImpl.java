/**
 */
package glspComponentModel.impl;

import glspComponentModel.ClientComponent;
import glspComponentModel.Component;
import glspComponentModel.ComponentModel;
import glspComponentModel.CreateHandler;
import glspComponentModel.DeleteHandler;
import glspComponentModel.DiagramConfiguration;
import glspComponentModel.DiagramModule;
import glspComponentModel.GlspComponentModelFactory;
import glspComponentModel.GlspComponentModelPackage;
import glspComponentModel.LeafComponent;
import glspComponentModel.ModelFactory;
import glspComponentModel.ModelTypes;
import glspComponentModel.ServerComponent;
import glspComponentModel.ServerLauncher;
import glspComponentModel.SourceModelStorage;
import glspComponentModel.ToolPaletteItemProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlspComponentModelFactoryImpl extends EFactoryImpl implements GlspComponentModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlspComponentModelFactory init() {
		try {
			GlspComponentModelFactory theGlspComponentModelFactory = (GlspComponentModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GlspComponentModelPackage.eNS_URI);
			if (theGlspComponentModelFactory != null) {
				return theGlspComponentModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlspComponentModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlspComponentModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GlspComponentModelPackage.SERVER_COMPONENT:
			return createServerComponent();
		case GlspComponentModelPackage.LEAF_COMPONENT:
			return createLeafComponent();
		case GlspComponentModelPackage.PACKAGE:
			return createPackage();
		case GlspComponentModelPackage.DIAGRAM_MODULE:
			return createDiagramModule();
		case GlspComponentModelPackage.DIAGRAM_CONFIGURATION:
			return createDiagramConfiguration();
		case GlspComponentModelPackage.MODEL_TYPES:
			return createModelTypes();
		case GlspComponentModelPackage.SERVER_LAUNCHER:
			return createServerLauncher();
		case GlspComponentModelPackage.CREATE_HANDLER:
			return createCreateHandler();
		case GlspComponentModelPackage.DELETE_HANDLER:
			return createDeleteHandler();
		case GlspComponentModelPackage.TOOL_PALETTE_ITEM_PROVIDER:
			return createToolPaletteItemProvider();
		case GlspComponentModelPackage.SOURCE_MODEL_STORAGE:
			return createSourceModelStorage();
		case GlspComponentModelPackage.MODEL_FACTORY:
			return createModelFactory();
		case GlspComponentModelPackage.CLIENT_COMPONENT:
			return createClientComponent();
		case GlspComponentModelPackage.COMPONENT:
			return createComponent();
		case GlspComponentModelPackage.COMPONENT_MODEL:
			return createComponentModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerComponent createServerComponent() {
		ServerComponentImpl serverComponent = new ServerComponentImpl();
		return serverComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeafComponent createLeafComponent() {
		LeafComponentImpl leafComponent = new LeafComponentImpl();
		return leafComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public glspComponentModel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramModule createDiagramModule() {
		DiagramModuleImpl diagramModule = new DiagramModuleImpl();
		return diagramModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramConfiguration createDiagramConfiguration() {
		DiagramConfigurationImpl diagramConfiguration = new DiagramConfigurationImpl();
		return diagramConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelTypes createModelTypes() {
		ModelTypesImpl modelTypes = new ModelTypesImpl();
		return modelTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerLauncher createServerLauncher() {
		ServerLauncherImpl serverLauncher = new ServerLauncherImpl();
		return serverLauncher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateHandler createCreateHandler() {
		CreateHandlerImpl createHandler = new CreateHandlerImpl();
		return createHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteHandler createDeleteHandler() {
		DeleteHandlerImpl deleteHandler = new DeleteHandlerImpl();
		return deleteHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolPaletteItemProvider createToolPaletteItemProvider() {
		ToolPaletteItemProviderImpl toolPaletteItemProvider = new ToolPaletteItemProviderImpl();
		return toolPaletteItemProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModelStorage createSourceModelStorage() {
		SourceModelStorageImpl sourceModelStorage = new SourceModelStorageImpl();
		return sourceModelStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClientComponent createClientComponent() {
		ClientComponentImpl clientComponent = new ClientComponentImpl();
		return clientComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModel createComponentModel() {
		ComponentModelImpl componentModel = new ComponentModelImpl();
		return componentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlspComponentModelPackage getGlspComponentModelPackage() {
		return (GlspComponentModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlspComponentModelPackage getPackage() {
		return GlspComponentModelPackage.eINSTANCE;
	}

} //GlspComponentModelFactoryImpl
