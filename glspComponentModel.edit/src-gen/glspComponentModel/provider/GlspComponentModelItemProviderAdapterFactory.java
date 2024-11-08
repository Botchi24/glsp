/**
 */
package glspComponentModel.provider;

import glspComponentModel.util.GlspComponentModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlspComponentModelItemProviderAdapterFactory extends GlspComponentModelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlspComponentModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ServerComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerComponentItemProvider serverComponentItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ServerComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerComponentAdapter() {
		if (serverComponentItemProvider == null) {
			serverComponentItemProvider = new ServerComponentItemProvider(this);
		}

		return serverComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.LeafComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafComponentItemProvider leafComponentItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.LeafComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeafComponentAdapter() {
		if (leafComponentItemProvider == null) {
			leafComponentItemProvider = new LeafComponentItemProvider(this);
		}

		return leafComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.DiagramModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModuleItemProvider diagramModuleItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.DiagramModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramModuleAdapter() {
		if (diagramModuleItemProvider == null) {
			diagramModuleItemProvider = new DiagramModuleItemProvider(this);
		}

		return diagramModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.DiagramConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramConfigurationItemProvider diagramConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.DiagramConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramConfigurationAdapter() {
		if (diagramConfigurationItemProvider == null) {
			diagramConfigurationItemProvider = new DiagramConfigurationItemProvider(this);
		}

		return diagramConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ModelTypes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypesItemProvider modelTypesItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ModelTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelTypesAdapter() {
		if (modelTypesItemProvider == null) {
			modelTypesItemProvider = new ModelTypesItemProvider(this);
		}

		return modelTypesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ServerLauncher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerLauncherItemProvider serverLauncherItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ServerLauncher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerLauncherAdapter() {
		if (serverLauncherItemProvider == null) {
			serverLauncherItemProvider = new ServerLauncherItemProvider(this);
		}

		return serverLauncherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.CreateHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateHandlerItemProvider createHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.CreateHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateHandlerAdapter() {
		if (createHandlerItemProvider == null) {
			createHandlerItemProvider = new CreateHandlerItemProvider(this);
		}

		return createHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.DeleteHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteHandlerItemProvider deleteHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.DeleteHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteHandlerAdapter() {
		if (deleteHandlerItemProvider == null) {
			deleteHandlerItemProvider = new DeleteHandlerItemProvider(this);
		}

		return deleteHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ToolPaletteItemProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolPaletteItemProviderItemProvider toolPaletteItemProviderItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ToolPaletteItemProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolPaletteItemProviderAdapter() {
		if (toolPaletteItemProviderItemProvider == null) {
			toolPaletteItemProviderItemProvider = new ToolPaletteItemProviderItemProvider(this);
		}

		return toolPaletteItemProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.SourceModelStorage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceModelStorageItemProvider sourceModelStorageItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.SourceModelStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceModelStorageAdapter() {
		if (sourceModelStorageItemProvider == null) {
			sourceModelStorageItemProvider = new SourceModelStorageItemProvider(this);
		}

		return sourceModelStorageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.GModelFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GModelFactoryItemProvider gModelFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.GModelFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGModelFactoryAdapter() {
		if (gModelFactoryItemProvider == null) {
			gModelFactoryItemProvider = new GModelFactoryItemProvider(this);
		}

		return gModelFactoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ClientComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientComponentItemProvider clientComponentItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ClientComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClientComponentAdapter() {
		if (clientComponentItemProvider == null) {
			clientComponentItemProvider = new ClientComponentItemProvider(this);
		}

		return clientComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ComponentModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModelItemProvider componentModelItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ComponentModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentModelAdapter() {
		if (componentModelItemProvider == null) {
			componentModelItemProvider = new ComponentModelItemProvider(this);
		}

		return componentModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.EMFSourceModelStorage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFSourceModelStorageItemProvider emfSourceModelStorageItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.EMFSourceModelStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEMFSourceModelStorageAdapter() {
		if (emfSourceModelStorageItemProvider == null) {
			emfSourceModelStorageItemProvider = new EMFSourceModelStorageItemProvider(this);
		}

		return emfSourceModelStorageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.GModelStorage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GModelStorageItemProvider gModelStorageItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.GModelStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGModelStorageAdapter() {
		if (gModelStorageItemProvider == null) {
			gModelStorageItemProvider = new GModelStorageItemProvider(this);
		}

		return gModelStorageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link glspComponentModel.ProjectComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectComponentItemProvider projectComponentItemProvider;

	/**
	 * This creates an adapter for a {@link glspComponentModel.ProjectComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectComponentAdapter() {
		if (projectComponentItemProvider == null) {
			projectComponentItemProvider = new ProjectComponentItemProvider(this);
		}

		return projectComponentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (serverComponentItemProvider != null)
			serverComponentItemProvider.dispose();
		if (leafComponentItemProvider != null)
			leafComponentItemProvider.dispose();
		if (packageItemProvider != null)
			packageItemProvider.dispose();
		if (diagramModuleItemProvider != null)
			diagramModuleItemProvider.dispose();
		if (diagramConfigurationItemProvider != null)
			diagramConfigurationItemProvider.dispose();
		if (modelTypesItemProvider != null)
			modelTypesItemProvider.dispose();
		if (serverLauncherItemProvider != null)
			serverLauncherItemProvider.dispose();
		if (createHandlerItemProvider != null)
			createHandlerItemProvider.dispose();
		if (deleteHandlerItemProvider != null)
			deleteHandlerItemProvider.dispose();
		if (toolPaletteItemProviderItemProvider != null)
			toolPaletteItemProviderItemProvider.dispose();
		if (sourceModelStorageItemProvider != null)
			sourceModelStorageItemProvider.dispose();
		if (gModelFactoryItemProvider != null)
			gModelFactoryItemProvider.dispose();
		if (clientComponentItemProvider != null)
			clientComponentItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (componentModelItemProvider != null)
			componentModelItemProvider.dispose();
		if (emfSourceModelStorageItemProvider != null)
			emfSourceModelStorageItemProvider.dispose();
		if (gModelStorageItemProvider != null)
			gModelStorageItemProvider.dispose();
		if (projectComponentItemProvider != null)
			projectComponentItemProvider.dispose();
	}

}
