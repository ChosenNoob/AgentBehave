/**
 */
package behaviortree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviortree.ActionNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see behaviortree.BehaviortreePackage#getActionNode()
 * @model
 * @generated
 */
public interface ActionNode extends ActionNodeChild, ConditionNodeChild, Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference.
	 * @see #setChildren(ActionNodeChild)
	 * @see behaviortree.BehaviortreePackage#getActionNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	ActionNodeChild getChildren();

	/**
	 * Sets the value of the '{@link behaviortree.ActionNode#getChildren <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' containment reference.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(ActionNodeChild value);

} // ActionNode
