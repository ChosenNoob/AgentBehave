/**
 */
package behaviorTreeMetamodel;

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
 *   <li>{@link behaviorTreeMetamodel.ActionNode#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getActionNode()
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
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getActionNode_ActionName()
	 * @model
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link behaviorTreeMetamodel.ActionNode#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

} // ActionNode
