/**
 */
package behaviorTreeMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorTreeMetamodel.Tree#getName <em>Name</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.Tree#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.Tree#getCompositeChild <em>Composite Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.Tree#getActionChild <em>Action Child</em>}</li>
 * </ul>
 *
 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getTree_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviorTreeMetamodel.Tree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.Tree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getTree_Subtree()
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
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getTree_CompositeChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeNode> getCompositeChild();

	/**
	 * Returns the value of the '<em><b>Action Child</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Child</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getTree_ActionChild()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionNode> getActionChild();

} // Tree
