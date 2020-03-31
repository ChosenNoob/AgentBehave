/**
 */
package behaviortree;

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
 * @see behaviortree.BehaviortreeFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviortreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviortree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/behaviortree";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviortree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviortreePackage eINSTANCE = behaviortree.impl.BehaviortreePackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviortree.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.BehaviorTreeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getBehaviorTree()
	 * @generated
	 */
	int BEHAVIOR_TREE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__ENTRY_POINT = 1;

	/**
	 * The number of structural features of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.NodeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.ActionNodeChild <em>Action Node Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.ActionNodeChild
	 * @see behaviortree.impl.BehaviortreePackageImpl#getActionNodeChild()
	 * @generated
	 */
	int ACTION_NODE_CHILD = 7;

	/**
	 * The number of structural features of the '<em>Action Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_CHILD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_CHILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.ActionNodeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__NAME = ACTION_NODE_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__CHILDREN = ACTION_NODE_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = ACTION_NODE_CHILD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_OPERATION_COUNT = ACTION_NODE_CHILD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.EntryPointImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviortree.ConditionNodeChild <em>Condition Node Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.ConditionNodeChild
	 * @see behaviortree.impl.BehaviortreePackageImpl#getConditionNodeChild()
	 * @generated
	 */
	int CONDITION_NODE_CHILD = 8;

	/**
	 * The number of structural features of the '<em>Condition Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_CHILD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_CHILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.ConditionNodeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__NAME = CONDITION_NODE_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__CHILDREN = CONDITION_NODE_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_FEATURE_COUNT = CONDITION_NODE_CHILD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_OPERATION_COUNT = CONDITION_NODE_CHILD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.SequenceNodeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.FallbackNodeImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getFallbackNode()
	 * @generated
	 */
	int FALLBACK_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviortree.SequenceNodeChild <em>Sequence Node Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.SequenceNodeChild
	 * @see behaviortree.impl.BehaviortreePackageImpl#getSequenceNodeChild()
	 * @generated
	 */
	int SEQUENCE_NODE_CHILD = 9;

	/**
	 * The number of structural features of the '<em>Sequence Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_CHILD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sequence Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_CHILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.FallbackNodeChild <em>Fallback Node Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.FallbackNodeChild
	 * @see behaviortree.impl.BehaviortreePackageImpl#getFallbackNodeChild()
	 * @generated
	 */
	int FALLBACK_NODE_CHILD = 10;

	/**
	 * The number of structural features of the '<em>Fallback Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_CHILD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fallback Node Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_CHILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviortree.impl.TreeSkeletonImpl <em>Tree Skeleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviortree.impl.TreeSkeletonImpl
	 * @see behaviortree.impl.BehaviortreePackageImpl#getTreeSkeleton()
	 * @generated
	 */
	int TREE_SKELETON = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_SKELETON__NAME = CONDITION_NODE_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_SKELETON__CHILDREN = CONDITION_NODE_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tree Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_SKELETON_FEATURE_COUNT = CONDITION_NODE_CHILD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tree Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_SKELETON_OPERATION_COUNT = CONDITION_NODE_CHILD_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link behaviortree.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree</em>'.
	 * @see behaviortree.BehaviorTree
	 * @generated
	 */
	EClass getBehaviorTree();

	/**
	 * Returns the meta object for the attribute '{@link behaviortree.BehaviorTree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviortree.BehaviorTree#getName()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EAttribute getBehaviorTree_Name();

	/**
	 * Returns the meta object for the containment reference '{@link behaviortree.BehaviorTree#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see behaviortree.BehaviorTree#getEntryPoint()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EReference getBehaviorTree_EntryPoint();

	/**
	 * Returns the meta object for class '{@link behaviortree.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see behaviortree.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link behaviortree.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviortree.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link behaviortree.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see behaviortree.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for the containment reference '{@link behaviortree.ActionNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see behaviortree.ActionNode#getChildren()
	 * @see #getActionNode()
	 * @generated
	 */
	EReference getActionNode_Children();

	/**
	 * Returns the meta object for class '{@link behaviortree.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see behaviortree.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviortree.EntryPoint#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see behaviortree.EntryPoint#getChildren()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Children();

	/**
	 * Returns the meta object for class '{@link behaviortree.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node</em>'.
	 * @see behaviortree.ConditionNode
	 * @generated
	 */
	EClass getConditionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviortree.ConditionNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see behaviortree.ConditionNode#getChildren()
	 * @see #getConditionNode()
	 * @generated
	 */
	EReference getConditionNode_Children();

	/**
	 * Returns the meta object for class '{@link behaviortree.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see behaviortree.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviortree.SequenceNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see behaviortree.SequenceNode#getChildren()
	 * @see #getSequenceNode()
	 * @generated
	 */
	EReference getSequenceNode_Children();

	/**
	 * Returns the meta object for class '{@link behaviortree.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node</em>'.
	 * @see behaviortree.FallbackNode
	 * @generated
	 */
	EClass getFallbackNode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviortree.FallbackNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see behaviortree.FallbackNode#getChildren()
	 * @see #getFallbackNode()
	 * @generated
	 */
	EReference getFallbackNode_Children();

	/**
	 * Returns the meta object for class '{@link behaviortree.ActionNodeChild <em>Action Node Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node Child</em>'.
	 * @see behaviortree.ActionNodeChild
	 * @generated
	 */
	EClass getActionNodeChild();

	/**
	 * Returns the meta object for class '{@link behaviortree.ConditionNodeChild <em>Condition Node Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node Child</em>'.
	 * @see behaviortree.ConditionNodeChild
	 * @generated
	 */
	EClass getConditionNodeChild();

	/**
	 * Returns the meta object for class '{@link behaviortree.SequenceNodeChild <em>Sequence Node Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node Child</em>'.
	 * @see behaviortree.SequenceNodeChild
	 * @generated
	 */
	EClass getSequenceNodeChild();

	/**
	 * Returns the meta object for class '{@link behaviortree.FallbackNodeChild <em>Fallback Node Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node Child</em>'.
	 * @see behaviortree.FallbackNodeChild
	 * @generated
	 */
	EClass getFallbackNodeChild();

	/**
	 * Returns the meta object for class '{@link behaviortree.TreeSkeleton <em>Tree Skeleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Skeleton</em>'.
	 * @see behaviortree.TreeSkeleton
	 * @generated
	 */
	EClass getTreeSkeleton();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviortree.TreeSkeleton#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see behaviortree.TreeSkeleton#getChildren()
	 * @see #getTreeSkeleton()
	 * @generated
	 */
	EReference getTreeSkeleton_Children();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviortreeFactory getBehaviortreeFactory();

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
		 * The meta object literal for the '{@link behaviortree.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.BehaviorTreeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getBehaviorTree()
		 * @generated
		 */
		EClass BEHAVIOR_TREE = eINSTANCE.getBehaviorTree();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TREE__NAME = eINSTANCE.getBehaviorTree_Name();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE__ENTRY_POINT = eINSTANCE.getBehaviorTree_EntryPoint();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.NodeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.ActionNodeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getActionNode()
		 * @generated
		 */
		EClass ACTION_NODE = eINSTANCE.getActionNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_NODE__CHILDREN = eINSTANCE.getActionNode_Children();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.EntryPointImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__CHILDREN = eINSTANCE.getEntryPoint_Children();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.ConditionNodeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getConditionNode()
		 * @generated
		 */
		EClass CONDITION_NODE = eINSTANCE.getConditionNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_NODE__CHILDREN = eINSTANCE.getConditionNode_Children();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.SequenceNodeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_NODE__CHILDREN = eINSTANCE.getSequenceNode_Children();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.FallbackNodeImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getFallbackNode()
		 * @generated
		 */
		EClass FALLBACK_NODE = eINSTANCE.getFallbackNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_NODE__CHILDREN = eINSTANCE.getFallbackNode_Children();

		/**
		 * The meta object literal for the '{@link behaviortree.ActionNodeChild <em>Action Node Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.ActionNodeChild
		 * @see behaviortree.impl.BehaviortreePackageImpl#getActionNodeChild()
		 * @generated
		 */
		EClass ACTION_NODE_CHILD = eINSTANCE.getActionNodeChild();

		/**
		 * The meta object literal for the '{@link behaviortree.ConditionNodeChild <em>Condition Node Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.ConditionNodeChild
		 * @see behaviortree.impl.BehaviortreePackageImpl#getConditionNodeChild()
		 * @generated
		 */
		EClass CONDITION_NODE_CHILD = eINSTANCE.getConditionNodeChild();

		/**
		 * The meta object literal for the '{@link behaviortree.SequenceNodeChild <em>Sequence Node Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.SequenceNodeChild
		 * @see behaviortree.impl.BehaviortreePackageImpl#getSequenceNodeChild()
		 * @generated
		 */
		EClass SEQUENCE_NODE_CHILD = eINSTANCE.getSequenceNodeChild();

		/**
		 * The meta object literal for the '{@link behaviortree.FallbackNodeChild <em>Fallback Node Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.FallbackNodeChild
		 * @see behaviortree.impl.BehaviortreePackageImpl#getFallbackNodeChild()
		 * @generated
		 */
		EClass FALLBACK_NODE_CHILD = eINSTANCE.getFallbackNodeChild();

		/**
		 * The meta object literal for the '{@link behaviortree.impl.TreeSkeletonImpl <em>Tree Skeleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviortree.impl.TreeSkeletonImpl
		 * @see behaviortree.impl.BehaviortreePackageImpl#getTreeSkeleton()
		 * @generated
		 */
		EClass TREE_SKELETON = eINSTANCE.getTreeSkeleton();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_SKELETON__CHILDREN = eINSTANCE.getTreeSkeleton_Children();

	}

} //BehaviortreePackage
