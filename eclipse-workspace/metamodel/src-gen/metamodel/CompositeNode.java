/**
 */
package metamodel;

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
 *   <li>{@link metamodel.CompositeNode#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link metamodel.CompositeNode#getCompositeChild <em>Composite Child</em>}</li>
 *   <li>{@link metamodel.CompositeNode#getConditionChild <em>Condition Child</em>}</li>
 *   <li>{@link metamodel.CompositeNode#getActionChild <em>Action Child</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getCompositeNode()
 * @model abstract="true"
 * @generated
 */
public interface CompositeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Tree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getCompositeNode_Subtree()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tree> getSubtree();

	/**
	 * Returns the value of the '<em><b>Composite Child</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Child</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getCompositeNode_CompositeChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeNode> getCompositeChild();

	/**
	 * Returns the value of the '<em><b>Condition Child</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.ConditionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Child</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getCompositeNode_ConditionChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionNode> getConditionChild();

	/**
	 * Returns the value of the '<em><b>Action Child</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Child</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getCompositeNode_ActionChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionNode> getActionChild();

} // CompositeNode
