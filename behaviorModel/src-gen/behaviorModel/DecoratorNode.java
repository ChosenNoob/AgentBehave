/**
 */
package behaviorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.DecoratorNode#getActionnode <em>Actionnode</em>}</li>
 *   <li>{@link behaviorModel.DecoratorNode#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorModel.DecoratorNode#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getDecoratorNode()
 * @model
 * @generated
 */
public interface DecoratorNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Actionnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionnode</em>' containment reference.
	 * @see #setActionnode(ActionNode)
	 * @see behaviorModel.BehaviorModelPackage#getDecoratorNode_Actionnode()
	 * @model containment="true"
	 * @generated
	 */
	ActionNode getActionnode();

	/**
	 * Sets the value of the '{@link behaviorModel.DecoratorNode#getActionnode <em>Actionnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionnode</em>' containment reference.
	 * @see #getActionnode()
	 * @generated
	 */
	void setActionnode(ActionNode value);

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference.
	 * @see #setSubtree(Subtree)
	 * @see behaviorModel.BehaviorModelPackage#getDecoratorNode_Subtree()
	 * @model containment="true"
	 * @generated
	 */
	Subtree getSubtree();

	/**
	 * Sets the value of the '{@link behaviorModel.DecoratorNode#getSubtree <em>Subtree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtree</em>' containment reference.
	 * @see #getSubtree()
	 * @generated
	 */
	void setSubtree(Subtree value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see behaviorModel.BehaviorModelPackage#getDecoratorNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link behaviorModel.DecoratorNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modify();

} // DecoratorNode
