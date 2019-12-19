/**
 */
package behaviorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.ActionNode#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getActionNode()
 * @model
 * @generated
 */
public interface ActionNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see behaviorModel.BehaviorModelPackage#getActionNode_ActionName()
	 * @model
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link behaviorModel.ActionNode#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void operation();

} // ActionNode
