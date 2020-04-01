/**
 */
package behaviortree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviortree.ConditionNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see behaviortree.BehaviortreePackage#getConditionNode()
 * @model
 * @generated
 */
public interface ConditionNode extends ConditionNodeChild, Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link behaviortree.ConditionNodeChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see behaviortree.BehaviortreePackage#getConditionNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionNodeChild> getChildren();

} // ConditionNode