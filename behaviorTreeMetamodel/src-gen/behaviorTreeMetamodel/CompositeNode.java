/**
 */
package behaviorTreeMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorTreeMetamodel.CompositeNode#getActionChild <em>Action Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.CompositeNode#getConditionChild <em>Condition Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.CompositeNode#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.CompositeNode#getCompositeChild <em>Composite Child</em>}</li>
 * </ul>
 *
 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getCompositeNode()
 * @model abstract="true"
 * @generated
 */
public interface CompositeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Child</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Child</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getCompositeNode_ActionChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionNode> getActionChild();

	/**
	 * Returns the value of the '<em><b>Condition Child</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.ConditionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Child</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getCompositeNode_ConditionChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionNode> getConditionChild();

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.Tree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getCompositeNode_Subtree()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tree> getSubtree();

	/**
	 * Returns the value of the '<em><b>Composite Child</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Child</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getCompositeNode_CompositeChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeNode> getCompositeChild();

} // CompositeNode
