/**
 */
package glspComponentModel.util;

import glspComponentModel.ClientComponent;
import glspComponentModel.Component;
import glspComponentModel.ComponentModel;
import glspComponentModel.CreateHandler;
import glspComponentModel.DeleteHandler;
import glspComponentModel.DiagramConfiguration;
import glspComponentModel.DiagramModule;
import glspComponentModel.GlspComponentModelPackage;
import glspComponentModel.LeafComponent;
import glspComponentModel.ModelFactory;
import glspComponentModel.ModelTypes;
import glspComponentModel.ServerComponent;
import glspComponentModel.ServerLauncher;
import glspComponentModel.SourceModelStorage;
import glspComponentModel.ToolPaletteItemProvider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see glspComponentModel.GlspComponentModelPackage
 * @generated
 */
public class GlspComponentModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GlspComponentModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlspComponentModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GlspComponentModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlspComponentModelSwitch<Adapter> modelSwitch = new GlspComponentModelSwitch<Adapter>() {
		@Override
		public Adapter caseServerComponent(ServerComponent object) {
			return createServerComponentAdapter();
		}

		@Override
		public Adapter caseLeafComponent(LeafComponent object) {
			return createLeafComponentAdapter();
		}

		@Override
		public Adapter casePackage(glspComponentModel.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseDiagramModule(DiagramModule object) {
			return createDiagramModuleAdapter();
		}

		@Override
		public Adapter caseDiagramConfiguration(DiagramConfiguration object) {
			return createDiagramConfigurationAdapter();
		}

		@Override
		public Adapter caseModelTypes(ModelTypes object) {
			return createModelTypesAdapter();
		}

		@Override
		public Adapter caseServerLauncher(ServerLauncher object) {
			return createServerLauncherAdapter();
		}

		@Override
		public Adapter caseCreateHandler(CreateHandler object) {
			return createCreateHandlerAdapter();
		}

		@Override
		public Adapter caseDeleteHandler(DeleteHandler object) {
			return createDeleteHandlerAdapter();
		}

		@Override
		public Adapter caseToolPaletteItemProvider(ToolPaletteItemProvider object) {
			return createToolPaletteItemProviderAdapter();
		}

		@Override
		public Adapter caseSourceModelStorage(SourceModelStorage object) {
			return createSourceModelStorageAdapter();
		}

		@Override
		public Adapter caseModelFactory(ModelFactory object) {
			return createModelFactoryAdapter();
		}

		@Override
		public Adapter caseClientComponent(ClientComponent object) {
			return createClientComponentAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseComponentModel(ComponentModel object) {
			return createComponentModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ServerComponent <em>Server Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ServerComponent
	 * @generated
	 */
	public Adapter createServerComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.LeafComponent <em>Leaf Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.LeafComponent
	 * @generated
	 */
	public Adapter createLeafComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.DiagramModule <em>Diagram Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.DiagramModule
	 * @generated
	 */
	public Adapter createDiagramModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.DiagramConfiguration <em>Diagram Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.DiagramConfiguration
	 * @generated
	 */
	public Adapter createDiagramConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ModelTypes <em>Model Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ModelTypes
	 * @generated
	 */
	public Adapter createModelTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ServerLauncher <em>Server Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ServerLauncher
	 * @generated
	 */
	public Adapter createServerLauncherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.CreateHandler <em>Create Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.CreateHandler
	 * @generated
	 */
	public Adapter createCreateHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.DeleteHandler <em>Delete Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.DeleteHandler
	 * @generated
	 */
	public Adapter createDeleteHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ToolPaletteItemProvider <em>Tool Palette Item Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ToolPaletteItemProvider
	 * @generated
	 */
	public Adapter createToolPaletteItemProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.SourceModelStorage <em>Source Model Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.SourceModelStorage
	 * @generated
	 */
	public Adapter createSourceModelStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ClientComponent <em>Client Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ClientComponent
	 * @generated
	 */
	public Adapter createClientComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link glspComponentModel.ComponentModel <em>Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see glspComponentModel.ComponentModel
	 * @generated
	 */
	public Adapter createComponentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GlspComponentModelAdapterFactory
