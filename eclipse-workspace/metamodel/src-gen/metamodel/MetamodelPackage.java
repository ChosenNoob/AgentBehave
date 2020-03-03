/**
 */
package metamodel;

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
 * @see metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.RootImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TREE = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.TreeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 1;

	/**
	 * The feature id for the '<em><b>Composite Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__COMPOSITE_CHILD = 0;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SUBTREE = 1;

	/**
	 * The feature id for the '<em><b>Action Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ACTION_CHILD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.CompositeNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getCompositeNode()
	 * @generated
	 */
	int COMPOSITE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__SUBTREE = 0;

	/**
	 * The feature id for the '<em><b>Composite Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__COMPOSITE_CHILD = 1;

	/**
	 * The feature id for the '<em><b>Condition Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__CONDITION_CHILD = 2;

	/**
	 * The feature id for the '<em><b>Action Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__ACTION_CHILD = 3;

	/**
	 * The number of structural features of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.FallbackNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getFallbackNode()
	 * @generated
	 */
	int FALLBACK_NODE = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__SUBTREE = COMPOSITE_NODE__SUBTREE;

	/**
	 * The feature id for the '<em><b>Composite Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__COMPOSITE_CHILD = COMPOSITE_NODE__COMPOSITE_CHILD;

	/**
	 * The feature id for the '<em><b>Condition Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__CONDITION_CHILD = COMPOSITE_NODE__CONDITION_CHILD;

	/**
	 * The feature id for the '<em><b>Action Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__ACTION_CHILD = COMPOSITE_NODE__ACTION_CHILD;

	/**
	 * The number of structural features of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_FEATURE_COUNT = COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_OPERATION_COUNT = COMPOSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.SequenceNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUBTREE = COMPOSITE_NODE__SUBTREE;

	/**
	 * The feature id for the '<em><b>Composite Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__COMPOSITE_CHILD = COMPOSITE_NODE__COMPOSITE_CHILD;

	/**
	 * The feature id for the '<em><b>Condition Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONDITION_CHILD = COMPOSITE_NODE__CONDITION_CHILD;

	/**
	 * The feature id for the '<em><b>Action Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ACTION_CHILD = COMPOSITE_NODE__ACTION_CHILD;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_OPERATION_COUNT = COMPOSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ConditionNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 5;

	/**
	 * The feature id for the '<em><b>Condition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__CONDITION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.impl.ActionNodeImpl
	 * @see metamodel.impl.MetamodelPackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__ACTION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link metamodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see metamodel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.Root#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tree</em>'.
	 * @see metamodel.Root#getTree()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Tree();

	/**
	 * Returns the meta object for class '{@link metamodel.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see metamodel.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.Tree#getCompositeChild <em>Composite Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Child</em>'.
	 * @see metamodel.Tree#getCompositeChild()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_CompositeChild();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.Tree#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see metamodel.Tree#getSubtree()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.Tree#getActionChild <em>Action Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Child</em>'.
	 * @see metamodel.Tree#getActionChild()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_ActionChild();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.Tree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.Tree#getName()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_Name();

	/**
	 * Returns the meta object for class '{@link metamodel.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Node</em>'.
	 * @see metamodel.CompositeNode
	 * @generated
	 */
	EClass getCompositeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.CompositeNode#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see metamodel.CompositeNode#getSubtree()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.CompositeNode#getCompositeChild <em>Composite Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Child</em>'.
	 * @see metamodel.CompositeNode#getCompositeChild()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_CompositeChild();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.CompositeNode#getConditionChild <em>Condition Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Child</em>'.
	 * @see metamodel.CompositeNode#getConditionChild()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_ConditionChild();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.CompositeNode#getActionChild <em>Action Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Child</em>'.
	 * @see metamodel.CompositeNode#getActionChild()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_ActionChild();

	/**
	 * Returns the meta object for class '{@link metamodel.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node</em>'.
	 * @see metamodel.FallbackNode
	 * @generated
	 */
	EClass getFallbackNode();

	/**
	 * Returns the meta object for class '{@link metamodel.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see metamodel.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for class '{@link metamodel.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node</em>'.
	 * @see metamodel.ConditionNode
	 * @generated
	 */
	EClass getConditionNode();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.ConditionNode#getConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Name</em>'.
	 * @see metamodel.ConditionNode#getConditionName()
	 * @see #getConditionNode()
	 * @generated
	 */
	EAttribute getConditionNode_ConditionName();

	/**
	 * Returns the meta object for class '{@link metamodel.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see metamodel.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.ActionNode#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see metamodel.ActionNode#getActionName()
	 * @see #getActionNode()
	 * @generated
	 */
	EAttribute getActionNode_ActionName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link metamodel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.RootImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TREE = eINSTANCE.getRoot_Tree();

		/**
		 * The meta object literal for the '{@link metamodel.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.TreeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Composite Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__COMPOSITE_CHILD = eINSTANCE.getTree_CompositeChild();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__SUBTREE = eINSTANCE.getTree_Subtree();

		/**
		 * The meta object literal for the '<em><b>Action Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__ACTION_CHILD = eINSTANCE.getTree_ActionChild();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__NAME = eINSTANCE.getTree_Name();

		/**
		 * The meta object literal for the '{@link metamodel.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.CompositeNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getCompositeNode()
		 * @generated
		 */
		EClass COMPOSITE_NODE = eINSTANCE.getCompositeNode();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__SUBTREE = eINSTANCE.getCompositeNode_Subtree();

		/**
		 * The meta object literal for the '<em><b>Composite Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__COMPOSITE_CHILD = eINSTANCE.getCompositeNode_CompositeChild();

		/**
		 * The meta object literal for the '<em><b>Condition Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__CONDITION_CHILD = eINSTANCE.getCompositeNode_ConditionChild();

		/**
		 * The meta object literal for the '<em><b>Action Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__ACTION_CHILD = eINSTANCE.getCompositeNode_ActionChild();

		/**
		 * The meta object literal for the '{@link metamodel.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.FallbackNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getFallbackNode()
		 * @generated
		 */
		EClass FALLBACK_NODE = eINSTANCE.getFallbackNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.SequenceNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ConditionNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getConditionNode()
		 * @generated
		 */
		EClass CONDITION_NODE = eINSTANCE.getConditionNode();

		/**
		 * The meta object literal for the '<em><b>Condition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_NODE__CONDITION_NAME = eINSTANCE.getConditionNode_ConditionName();

		/**
		 * The meta object literal for the '{@link metamodel.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.impl.ActionNodeImpl
		 * @see metamodel.impl.MetamodelPackageImpl#getActionNode()
		 * @generated
		 */
		EClass ACTION_NODE = eINSTANCE.getActionNode();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_NODE__ACTION_NAME = eINSTANCE.getActionNode_ActionName();

	}

} //MetamodelPackage
