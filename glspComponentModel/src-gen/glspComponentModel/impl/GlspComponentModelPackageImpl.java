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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlspComponentModelPackageImpl extends EPackageImpl implements GlspComponentModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverLauncherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolPaletteItemProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceModelStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see glspComponentModel.GlspComponentModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlspComponentModelPackageImpl() {
		super(eNS_URI, GlspComponentModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GlspComponentModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlspComponentModelPackage init() {
		if (isInited)
			return (GlspComponentModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(GlspComponentModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGlspComponentModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GlspComponentModelPackageImpl theGlspComponentModelPackage = registeredGlspComponentModelPackage instanceof GlspComponentModelPackageImpl
				? (GlspComponentModelPackageImpl) registeredGlspComponentModelPackage
				: new GlspComponentModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGlspComponentModelPackage.createPackageContents();

		// Initialize created meta-data
		theGlspComponentModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlspComponentModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlspComponentModelPackage.eNS_URI, theGlspComponentModelPackage);
		return theGlspComponentModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerComponent() {
		return serverComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeafComponent() {
		return leafComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ServerComponents() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagramModule() {
		return diagramModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagramConfiguration() {
		return diagramConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelTypes() {
		return modelTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerLauncher() {
		return serverLauncherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateHandler() {
		return createHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeleteHandler() {
		return deleteHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolPaletteItemProvider() {
		return toolPaletteItemProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceModelStorage() {
		return sourceModelStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClientComponent() {
		return clientComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentModel() {
		return componentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentModel_Components() {
		return (EReference) componentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlspComponentModelFactory getGlspComponentModelFactory() {
		return (GlspComponentModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		serverComponentEClass = createEClass(SERVER_COMPONENT);

		leafComponentEClass = createEClass(LEAF_COMPONENT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__SERVER_COMPONENTS);

		diagramModuleEClass = createEClass(DIAGRAM_MODULE);

		diagramConfigurationEClass = createEClass(DIAGRAM_CONFIGURATION);

		modelTypesEClass = createEClass(MODEL_TYPES);

		serverLauncherEClass = createEClass(SERVER_LAUNCHER);

		createHandlerEClass = createEClass(CREATE_HANDLER);

		deleteHandlerEClass = createEClass(DELETE_HANDLER);

		toolPaletteItemProviderEClass = createEClass(TOOL_PALETTE_ITEM_PROVIDER);

		sourceModelStorageEClass = createEClass(SOURCE_MODEL_STORAGE);

		modelFactoryEClass = createEClass(MODEL_FACTORY);

		clientComponentEClass = createEClass(CLIENT_COMPONENT);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);

		componentModelEClass = createEClass(COMPONENT_MODEL);
		createEReference(componentModelEClass, COMPONENT_MODEL__COMPONENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serverComponentEClass.getESuperTypes().add(this.getComponent());
		leafComponentEClass.getESuperTypes().add(this.getServerComponent());
		packageEClass.getESuperTypes().add(this.getServerComponent());
		diagramModuleEClass.getESuperTypes().add(this.getLeafComponent());
		diagramConfigurationEClass.getESuperTypes().add(this.getLeafComponent());
		modelTypesEClass.getESuperTypes().add(this.getLeafComponent());
		serverLauncherEClass.getESuperTypes().add(this.getLeafComponent());
		createHandlerEClass.getESuperTypes().add(this.getLeafComponent());
		deleteHandlerEClass.getESuperTypes().add(this.getLeafComponent());
		toolPaletteItemProviderEClass.getESuperTypes().add(this.getLeafComponent());
		sourceModelStorageEClass.getESuperTypes().add(this.getLeafComponent());
		modelFactoryEClass.getESuperTypes().add(this.getLeafComponent());
		clientComponentEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(serverComponentEClass, ServerComponent.class, "ServerComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(leafComponentEClass, LeafComponent.class, "LeafComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, glspComponentModel.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_ServerComponents(), this.getServerComponent(), null, "serverComponents", null, 0, -1,
				glspComponentModel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModuleEClass, DiagramModule.class, "DiagramModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramConfigurationEClass, DiagramConfiguration.class, "DiagramConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypesEClass, ModelTypes.class, "ModelTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverLauncherEClass, ServerLauncher.class, "ServerLauncher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(createHandlerEClass, CreateHandler.class, "CreateHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteHandlerEClass, DeleteHandler.class, "DeleteHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolPaletteItemProviderEClass, ToolPaletteItemProvider.class, "ToolPaletteItemProvider",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceModelStorageEClass, SourceModelStorage.class, "SourceModelStorage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientComponentEClass, ClientComponent.class, "ClientComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentModelEClass, ComponentModel.class, "ComponentModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModel_Components(), this.getComponent(), null, "components", null, 0, -1,
				ComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GlspComponentModelPackageImpl
