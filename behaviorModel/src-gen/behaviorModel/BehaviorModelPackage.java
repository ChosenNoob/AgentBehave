/**
 */
package behaviorModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see behaviorModel.BehaviorModelFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviorModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/behaviorModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviorModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorModelPackage eINSTANCE = behaviorModel.impl.BehaviorModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviorModel.impl.SubtreeImpl <em>Subtree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.SubtreeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getSubtree()
	 * @generated
	 */
	int SUBTREE = 0;

	/**
	 * The feature id for the '<em><b>Sdfhy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__SDFHY = 0;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__SUBTREE = 1;

	/**
	 * The feature id for the '<em><b>Compositenode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__COMPOSITENODE = 2;

	/**
	 * The feature id for the '<em><b>Decoratornode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__DECORATORNODE = 3;

	/**
	 * The feature id for the '<em><b>Actionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__ACTIONNODE = 4;

	/**
	 * The number of structural features of the '<em>Subtree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Subtree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorModel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.RootImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SUBTREE = 0;

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
	 * The meta object id for the '{@link behaviorModel.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.ActionNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 2;

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
	 * The operation id for the '<em>Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE___OPERATION = 0;

	/**
	 * The number of operations of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link behaviorModel.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.CompositeNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getCompositeNode()
	 * @generated
	 */
	int COMPOSITE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Actionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__ACTIONNODE = 0;

	/**
	 * The feature id for the '<em><b>Conditionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__CONDITIONNODE = 1;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__SUBTREE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__ID = 3;

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
	 * The meta object id for the '{@link behaviorModel.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.SequenceNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Actionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ACTIONNODE = COMPOSITE_NODE__ACTIONNODE;

	/**
	 * The feature id for the '<em><b>Conditionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONDITIONNODE = COMPOSITE_NODE__CONDITIONNODE;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUBTREE = COMPOSITE_NODE__SUBTREE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ID = COMPOSITE_NODE__ID;

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
	 * The meta object id for the '{@link behaviorModel.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.FallbackNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getFallbackNode()
	 * @generated
	 */
	int FALLBACK_NODE = 5;

	/**
	 * The feature id for the '<em><b>Actionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__ACTIONNODE = COMPOSITE_NODE__ACTIONNODE;

	/**
	 * The feature id for the '<em><b>Conditionnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__CONDITIONNODE = COMPOSITE_NODE__CONDITIONNODE;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__SUBTREE = COMPOSITE_NODE__SUBTREE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__ID = COMPOSITE_NODE__ID;

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
	 * The meta object id for the '{@link behaviorModel.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.ConditionNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Condition Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__CONDITION_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Condition Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__CONDITION_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorModel.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorModel.impl.DecoratorNodeImpl
	 * @see behaviorModel.impl.BehaviorModelPackageImpl#getDecoratorNode()
	 * @generated
	 */
	int DECORATOR_NODE = 7;

	/**
	 * The feature id for the '<em><b>Actionnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__ACTIONNODE = 0;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__SUBTREE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__ID = 2;

	/**
	 * The number of structural features of the '<em>Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Modify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE___MODIFY = 0;

	/**
	 * The number of operations of the '<em>Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link behaviorModel.Subtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree</em>'.
	 * @see behaviorModel.Subtree
	 * @generated
	 */
	EClass getSubtree();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.Subtree#getSdfhy <em>Sdfhy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdfhy</em>'.
	 * @see behaviorModel.Subtree#getSdfhy()
	 * @see #getSubtree()
	 * @generated
	 */
	EAttribute getSubtree_Sdfhy();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.Subtree#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see behaviorModel.Subtree#getSubtree()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.Subtree#getCompositenode <em>Compositenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compositenode</em>'.
	 * @see behaviorModel.Subtree#getCompositenode()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_Compositenode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.Subtree#getDecoratornode <em>Decoratornode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decoratornode</em>'.
	 * @see behaviorModel.Subtree#getDecoratornode()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_Decoratornode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.Subtree#getActionnode <em>Actionnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionnode</em>'.
	 * @see behaviorModel.Subtree#getActionnode()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_Actionnode();

	/**
	 * Returns the meta object for class '{@link behaviorModel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see behaviorModel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorModel.Root#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see behaviorModel.Root#getSubtree()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Subtree();

	/**
	 * Returns the meta object for class '{@link behaviorModel.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see behaviorModel.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.ActionNode#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see behaviorModel.ActionNode#getActionName()
	 * @see #getActionNode()
	 * @generated
	 */
	EAttribute getActionNode_ActionName();

	/**
	 * Returns the meta object for the '{@link behaviorModel.ActionNode#operation() <em>Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation</em>' operation.
	 * @see behaviorModel.ActionNode#operation()
	 * @generated
	 */
	EOperation getActionNode__Operation();

	/**
	 * Returns the meta object for class '{@link behaviorModel.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Node</em>'.
	 * @see behaviorModel.CompositeNode
	 * @generated
	 */
	EClass getCompositeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.CompositeNode#getActionnode <em>Actionnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionnode</em>'.
	 * @see behaviorModel.CompositeNode#getActionnode()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Actionnode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.CompositeNode#getConditionnode <em>Conditionnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditionnode</em>'.
	 * @see behaviorModel.CompositeNode#getConditionnode()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Conditionnode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviorModel.CompositeNode#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see behaviorModel.CompositeNode#getSubtree()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Subtree();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.CompositeNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see behaviorModel.CompositeNode#getId()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EAttribute getCompositeNode_Id();

	/**
	 * Returns the meta object for class '{@link behaviorModel.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see behaviorModel.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for class '{@link behaviorModel.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node</em>'.
	 * @see behaviorModel.FallbackNode
	 * @generated
	 */
	EClass getFallbackNode();

	/**
	 * Returns the meta object for class '{@link behaviorModel.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node</em>'.
	 * @see behaviorModel.ConditionNode
	 * @generated
	 */
	EClass getConditionNode();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.ConditionNode#getConditionDefinition <em>Condition Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Definition</em>'.
	 * @see behaviorModel.ConditionNode#getConditionDefinition()
	 * @see #getConditionNode()
	 * @generated
	 */
	EAttribute getConditionNode_ConditionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.ConditionNode#isConditionResult <em>Condition Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Result</em>'.
	 * @see behaviorModel.ConditionNode#isConditionResult()
	 * @see #getConditionNode()
	 * @generated
	 */
	EAttribute getConditionNode_ConditionResult();

	/**
	 * Returns the meta object for class '{@link behaviorModel.DecoratorNode <em>Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator Node</em>'.
	 * @see behaviorModel.DecoratorNode
	 * @generated
	 */
	EClass getDecoratorNode();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorModel.DecoratorNode#getActionnode <em>Actionnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actionnode</em>'.
	 * @see behaviorModel.DecoratorNode#getActionnode()
	 * @see #getDecoratorNode()
	 * @generated
	 */
	EReference getDecoratorNode_Actionnode();

	/**
	 * Returns the meta object for the containment reference '{@link behaviorModel.DecoratorNode#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see behaviorModel.DecoratorNode#getSubtree()
	 * @see #getDecoratorNode()
	 * @generated
	 */
	EReference getDecoratorNode_Subtree();

	/**
	 * Returns the meta object for the attribute '{@link behaviorModel.DecoratorNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see behaviorModel.DecoratorNode#getId()
	 * @see #getDecoratorNode()
	 * @generated
	 */
	EAttribute getDecoratorNode_Id();

	/**
	 * Returns the meta object for the '{@link behaviorModel.DecoratorNode#modify() <em>Modify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify</em>' operation.
	 * @see behaviorModel.DecoratorNode#modify()
	 * @generated
	 */
	EOperation getDecoratorNode__Modify();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorModelFactory getBehaviorModelFactory();

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
		 * The meta object literal for the '{@link behaviorModel.impl.SubtreeImpl <em>Subtree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.SubtreeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getSubtree()
		 * @generated
		 */
		EClass SUBTREE = eINSTANCE.getSubtree();

		/**
		 * The meta object literal for the '<em><b>Sdfhy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTREE__SDFHY = eINSTANCE.getSubtree_Sdfhy();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__SUBTREE = eINSTANCE.getSubtree_Subtree();

		/**
		 * The meta object literal for the '<em><b>Compositenode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__COMPOSITENODE = eINSTANCE.getSubtree_Compositenode();

		/**
		 * The meta object literal for the '<em><b>Decoratornode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__DECORATORNODE = eINSTANCE.getSubtree_Decoratornode();

		/**
		 * The meta object literal for the '<em><b>Actionnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__ACTIONNODE = eINSTANCE.getSubtree_Actionnode();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.RootImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SUBTREE = eINSTANCE.getRoot_Subtree();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.ActionNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getActionNode()
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

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_NODE___OPERATION = eINSTANCE.getActionNode__Operation();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.CompositeNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getCompositeNode()
		 * @generated
		 */
		EClass COMPOSITE_NODE = eINSTANCE.getCompositeNode();

		/**
		 * The meta object literal for the '<em><b>Actionnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__ACTIONNODE = eINSTANCE.getCompositeNode_Actionnode();

		/**
		 * The meta object literal for the '<em><b>Conditionnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__CONDITIONNODE = eINSTANCE.getCompositeNode_Conditionnode();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__SUBTREE = eINSTANCE.getCompositeNode_Subtree();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_NODE__ID = eINSTANCE.getCompositeNode_Id();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.SequenceNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.FallbackNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getFallbackNode()
		 * @generated
		 */
		EClass FALLBACK_NODE = eINSTANCE.getFallbackNode();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.ConditionNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getConditionNode()
		 * @generated
		 */
		EClass CONDITION_NODE = eINSTANCE.getConditionNode();

		/**
		 * The meta object literal for the '<em><b>Condition Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_NODE__CONDITION_DEFINITION = eINSTANCE.getConditionNode_ConditionDefinition();

		/**
		 * The meta object literal for the '<em><b>Condition Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_NODE__CONDITION_RESULT = eINSTANCE.getConditionNode_ConditionResult();

		/**
		 * The meta object literal for the '{@link behaviorModel.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorModel.impl.DecoratorNodeImpl
		 * @see behaviorModel.impl.BehaviorModelPackageImpl#getDecoratorNode()
		 * @generated
		 */
		EClass DECORATOR_NODE = eINSTANCE.getDecoratorNode();

		/**
		 * The meta object literal for the '<em><b>Actionnode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_NODE__ACTIONNODE = eINSTANCE.getDecoratorNode_Actionnode();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_NODE__SUBTREE = eINSTANCE.getDecoratorNode_Subtree();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR_NODE__ID = eINSTANCE.getDecoratorNode_Id();

		/**
		 * The meta object literal for the '<em><b>Modify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECORATOR_NODE___MODIFY = eINSTANCE.getDecoratorNode__Modify();

	}

} //BehaviorModelPackage
