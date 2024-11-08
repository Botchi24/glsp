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
import glspComponentModel.EMFSourceModelStorage;
import glspComponentModel.GModelFactory;
import glspComponentModel.GModelStorage;
import glspComponentModel.GlspComponentModelPackage;
import glspComponentModel.LeafComponent;
import glspComponentModel.ModelTypes;
import glspComponentModel.ProjectComponent;
import glspComponentModel.ServerComponent;
import glspComponentModel.ServerLauncher;
import glspComponentModel.SourceModelStorage;
import glspComponentModel.ToolPaletteItemProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see glspComponentModel.GlspComponentModelPackage
 * @generated
 */
public class GlspComponentModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GlspComponentModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlspComponentModelSwitch() {
		if (modelPackage == null) {
			modelPackage = GlspComponentModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GlspComponentModelPackage.SERVER_COMPONENT: {
			ServerComponent serverComponent = (ServerComponent) theEObject;
			T result = caseServerComponent(serverComponent);
			if (result == null)
				result = caseComponent(serverComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.LEAF_COMPONENT: {
			LeafComponent leafComponent = (LeafComponent) theEObject;
			T result = caseLeafComponent(leafComponent);
			if (result == null)
				result = caseServerComponent(leafComponent);
			if (result == null)
				result = caseComponent(leafComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.PACKAGE: {
			glspComponentModel.Package package_ = (glspComponentModel.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseServerComponent(package_);
			if (result == null)
				result = caseComponent(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.DIAGRAM_MODULE: {
			DiagramModule diagramModule = (DiagramModule) theEObject;
			T result = caseDiagramModule(diagramModule);
			if (result == null)
				result = caseLeafComponent(diagramModule);
			if (result == null)
				result = caseServerComponent(diagramModule);
			if (result == null)
				result = caseComponent(diagramModule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.DIAGRAM_CONFIGURATION: {
			DiagramConfiguration diagramConfiguration = (DiagramConfiguration) theEObject;
			T result = caseDiagramConfiguration(diagramConfiguration);
			if (result == null)
				result = caseLeafComponent(diagramConfiguration);
			if (result == null)
				result = caseServerComponent(diagramConfiguration);
			if (result == null)
				result = caseComponent(diagramConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.MODEL_TYPES: {
			ModelTypes modelTypes = (ModelTypes) theEObject;
			T result = caseModelTypes(modelTypes);
			if (result == null)
				result = caseLeafComponent(modelTypes);
			if (result == null)
				result = caseServerComponent(modelTypes);
			if (result == null)
				result = caseComponent(modelTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.SERVER_LAUNCHER: {
			ServerLauncher serverLauncher = (ServerLauncher) theEObject;
			T result = caseServerLauncher(serverLauncher);
			if (result == null)
				result = caseLeafComponent(serverLauncher);
			if (result == null)
				result = caseServerComponent(serverLauncher);
			if (result == null)
				result = caseComponent(serverLauncher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.CREATE_HANDLER: {
			CreateHandler createHandler = (CreateHandler) theEObject;
			T result = caseCreateHandler(createHandler);
			if (result == null)
				result = caseLeafComponent(createHandler);
			if (result == null)
				result = caseServerComponent(createHandler);
			if (result == null)
				result = caseComponent(createHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.DELETE_HANDLER: {
			DeleteHandler deleteHandler = (DeleteHandler) theEObject;
			T result = caseDeleteHandler(deleteHandler);
			if (result == null)
				result = caseLeafComponent(deleteHandler);
			if (result == null)
				result = caseServerComponent(deleteHandler);
			if (result == null)
				result = caseComponent(deleteHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.TOOL_PALETTE_ITEM_PROVIDER: {
			ToolPaletteItemProvider toolPaletteItemProvider = (ToolPaletteItemProvider) theEObject;
			T result = caseToolPaletteItemProvider(toolPaletteItemProvider);
			if (result == null)
				result = caseLeafComponent(toolPaletteItemProvider);
			if (result == null)
				result = caseServerComponent(toolPaletteItemProvider);
			if (result == null)
				result = caseComponent(toolPaletteItemProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.SOURCE_MODEL_STORAGE: {
			SourceModelStorage sourceModelStorage = (SourceModelStorage) theEObject;
			T result = caseSourceModelStorage(sourceModelStorage);
			if (result == null)
				result = caseLeafComponent(sourceModelStorage);
			if (result == null)
				result = caseServerComponent(sourceModelStorage);
			if (result == null)
				result = caseComponent(sourceModelStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.GMODEL_FACTORY: {
			GModelFactory gModelFactory = (GModelFactory) theEObject;
			T result = caseGModelFactory(gModelFactory);
			if (result == null)
				result = caseLeafComponent(gModelFactory);
			if (result == null)
				result = caseServerComponent(gModelFactory);
			if (result == null)
				result = caseComponent(gModelFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.CLIENT_COMPONENT: {
			ClientComponent clientComponent = (ClientComponent) theEObject;
			T result = caseClientComponent(clientComponent);
			if (result == null)
				result = caseComponent(clientComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.COMPONENT_MODEL: {
			ComponentModel componentModel = (ComponentModel) theEObject;
			T result = caseComponentModel(componentModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.EMF_SOURCE_MODEL_STORAGE: {
			EMFSourceModelStorage emfSourceModelStorage = (EMFSourceModelStorage) theEObject;
			T result = caseEMFSourceModelStorage(emfSourceModelStorage);
			if (result == null)
				result = caseSourceModelStorage(emfSourceModelStorage);
			if (result == null)
				result = caseLeafComponent(emfSourceModelStorage);
			if (result == null)
				result = caseServerComponent(emfSourceModelStorage);
			if (result == null)
				result = caseComponent(emfSourceModelStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.GMODEL_STORAGE: {
			GModelStorage gModelStorage = (GModelStorage) theEObject;
			T result = caseGModelStorage(gModelStorage);
			if (result == null)
				result = caseSourceModelStorage(gModelStorage);
			if (result == null)
				result = caseLeafComponent(gModelStorage);
			if (result == null)
				result = caseServerComponent(gModelStorage);
			if (result == null)
				result = caseComponent(gModelStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GlspComponentModelPackage.PROJECT_COMPONENT: {
			ProjectComponent projectComponent = (ProjectComponent) theEObject;
			T result = caseProjectComponent(projectComponent);
			if (result == null)
				result = caseComponent(projectComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerComponent(ServerComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafComponent(LeafComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(glspComponentModel.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModule(DiagramModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramConfiguration(DiagramConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTypes(ModelTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Launcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerLauncher(ServerLauncher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateHandler(CreateHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteHandler(DeleteHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Palette Item Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Palette Item Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolPaletteItemProvider(ToolPaletteItemProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Model Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Model Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceModelStorage(SourceModelStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GModel Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GModel Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGModelFactory(GModelFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientComponent(ClientComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentModel(ComponentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Source Model Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Source Model Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFSourceModelStorage(EMFSourceModelStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GModel Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GModel Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGModelStorage(GModelStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectComponent(ProjectComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GlspComponentModelSwitch
