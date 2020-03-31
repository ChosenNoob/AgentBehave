/**
 */
package behaviortree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fallback Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviortree.FallbackNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see behaviortree.BehaviortreePackage#getFallbackNode()
 * @model
 * @generated
 */
public interface FallbackNode extends Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link behaviortree.FallbackNodeChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see behaviortree.BehaviortreePackage#getFallbackNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<FallbackNodeChild> getChildren();

} // FallbackNode
