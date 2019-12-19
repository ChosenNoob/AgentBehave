/**
 */
package behaviorModel.impl;

import behaviorModel.ActionNode;
import behaviorModel.BehaviorModelFactory;
import behaviorModel.BehaviorModelPackage;
import behaviorModel.CompositeNode;
import behaviorModel.ConditionNode;
import behaviorModel.DecoratorNode;
import behaviorModel.FallbackNode;
import behaviorModel.Root;
import behaviorModel.SequenceNode;
import behaviorModel.Subtree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorModelPackageImpl extends EPackageImpl implements BehaviorModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallbackNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorNodeEClass = null;

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
	 * @see behaviorModel.BehaviorModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorModelPackageImpl() {
		super(eNS_URI, BehaviorModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviorModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorModelPackage init() {
		if (isInited)
			return (BehaviorModelPackage) EPackage.Registry.INSTANCE.getEPackage(BehaviorModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviorModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviorModelPackageImpl theBehaviorModelPackage = registeredBehaviorModelPackage instanceof BehaviorModelPackageImpl
				? (BehaviorModelPackageImpl) registeredBehaviorModelPackage
				: new BehaviorModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBehaviorModelPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorModelPackage.eNS_URI, theBehaviorModelPackage);
		return theBehaviorModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtree() {
		return subtreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtree_Sdfhy() {
		return (EAttribute) subtreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_Subtree() {
		return (EReference) subtreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_Compositenode() {
		return (EReference) subtreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_Decoratornode() {
		return (EReference) subtreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_Actionnode() {
		return (EReference) subtreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Subtree() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionNode() {
		return actionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionNode_ActionName() {
		return (EAttribute) actionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionNode__Operation() {
		return actionNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeNode() {
		return compositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Actionnode() {
		return (EReference) compositeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Conditionnode() {
		return (EReference) compositeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Subtree() {
		return (EReference) compositeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeNode_Id() {
		return (EAttribute) compositeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFallbackNode() {
		return fallbackNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionNode() {
		return conditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionNode_ConditionDefinition() {
		return (EAttribute) conditionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionNode_ConditionResult() {
		return (EAttribute) conditionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecoratorNode() {
		return decoratorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecoratorNode_Actionnode() {
		return (EReference) decoratorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecoratorNode_Subtree() {
		return (EReference) decoratorNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecoratorNode_Id() {
		return (EAttribute) decoratorNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecoratorNode__Modify() {
		return decoratorNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorModelFactory getBehaviorModelFactory() {
		return (BehaviorModelFactory) getEFactoryInstance();
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
		subtreeEClass = createEClass(SUBTREE);
		createEAttribute(subtreeEClass, SUBTREE__SDFHY);
		createEReference(subtreeEClass, SUBTREE__SUBTREE);
		createEReference(subtreeEClass, SUBTREE__COMPOSITENODE);
		createEReference(subtreeEClass, SUBTREE__DECORATORNODE);
		createEReference(subtreeEClass, SUBTREE__ACTIONNODE);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__SUBTREE);

		actionNodeEClass = createEClass(ACTION_NODE);
		createEAttribute(actionNodeEClass, ACTION_NODE__ACTION_NAME);
		createEOperation(actionNodeEClass, ACTION_NODE___OPERATION);

		compositeNodeEClass = createEClass(COMPOSITE_NODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__ACTIONNODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__CONDITIONNODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__SUBTREE);
		createEAttribute(compositeNodeEClass, COMPOSITE_NODE__ID);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);

		fallbackNodeEClass = createEClass(FALLBACK_NODE);

		conditionNodeEClass = createEClass(CONDITION_NODE);
		createEAttribute(conditionNodeEClass, CONDITION_NODE__CONDITION_DEFINITION);
		createEAttribute(conditionNodeEClass, CONDITION_NODE__CONDITION_RESULT);

		decoratorNodeEClass = createEClass(DECORATOR_NODE);
		createEReference(decoratorNodeEClass, DECORATOR_NODE__ACTIONNODE);
		createEReference(decoratorNodeEClass, DECORATOR_NODE__SUBTREE);
		createEAttribute(decoratorNodeEClass, DECORATOR_NODE__ID);
		createEOperation(decoratorNodeEClass, DECORATOR_NODE___MODIFY);
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
		sequenceNodeEClass.getESuperTypes().add(this.getCompositeNode());
		fallbackNodeEClass.getESuperTypes().add(this.getCompositeNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(subtreeEClass, Subtree.class, "Subtree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubtree_Sdfhy(), ecorePackage.getEString(), "sdfhy", null, 0, 1, Subtree.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtree_Subtree(), this.getSubtree(), null, "subtree", null, 0, -1, Subtree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtree_Compositenode(), this.getCompositeNode(), null, "compositenode", null, 0, -1,
				Subtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtree_Decoratornode(), this.getDecoratorNode(), null, "decoratornode", null, 0, -1,
				Subtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtree_Actionnode(), this.getActionNode(), null, "actionnode", null, 0, -1, Subtree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Subtree(), this.getSubtree(), null, "subtree", null, 1, 1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionNodeEClass, ActionNode.class, "ActionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionNode_ActionName(), ecorePackage.getEString(), "actionName", null, 0, 1,
				ActionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getActionNode__Operation(), null, "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeNodeEClass, CompositeNode.class, "CompositeNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNode_Actionnode(), this.getActionNode(), null, "actionnode", null, 1, -1,
				CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeNode_Conditionnode(), this.getConditionNode(), null, "conditionnode", null, 0, -1,
				CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeNode_Subtree(), this.getSubtree(), null, "subtree", null, 0, -1, CompositeNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeNode_Id(), ecorePackage.getEInt(), "Id", null, 0, 1, CompositeNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fallbackNodeEClass, FallbackNode.class, "FallbackNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionNodeEClass, ConditionNode.class, "ConditionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionNode_ConditionDefinition(), ecorePackage.getEString(), "conditionDefinition", null,
				0, 1, ConditionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionNode_ConditionResult(), ecorePackage.getEBoolean(), "conditionResult", null, 0, 1,
				ConditionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(decoratorNodeEClass, DecoratorNode.class, "DecoratorNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecoratorNode_Actionnode(), this.getActionNode(), null, "actionnode", null, 0, 1,
				DecoratorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorNode_Subtree(), this.getSubtree(), null, "subtree", null, 0, 1, DecoratorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecoratorNode_Id(), ecorePackage.getEString(), "Id", null, 0, 1, DecoratorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDecoratorNode__Modify(), null, "modify", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviorModelPackageImpl
