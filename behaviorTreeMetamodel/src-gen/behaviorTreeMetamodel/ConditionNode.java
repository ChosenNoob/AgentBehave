/**
 */
package behaviorTreeMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorTreeMetamodel.ConditionNode#getConditionName <em>Condition Name</em>}</li>
 * </ul>
 *
 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getConditionNode()
 * @model
 * @generated
 */
public interface ConditionNode extends EObject {

	/**
	 * Returns the value of the '<em><b>Condition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Name</em>' attribute.
	 * @see #setConditionName(String)
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getConditionNode_ConditionName()
	 * @model
	 * @generated
	 */
	String getConditionName();

	/**
	 * Sets the value of the '{@link behaviorTreeMetamodel.ConditionNode#getConditionName <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Name</em>' attribute.
	 * @see #getConditionName()
	 * @generated
	 */
	void setConditionName(String value);
} // ConditionNode
