/**
 */
package behaviorModel;

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
 *   <li>{@link behaviorModel.ConditionNode#getConditionDefinition <em>Condition Definition</em>}</li>
 *   <li>{@link behaviorModel.ConditionNode#isConditionResult <em>Condition Result</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getConditionNode()
 * @model
 * @generated
 */
public interface ConditionNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Definition</em>' attribute.
	 * @see #setConditionDefinition(String)
	 * @see behaviorModel.BehaviorModelPackage#getConditionNode_ConditionDefinition()
	 * @model
	 * @generated
	 */
	String getConditionDefinition();

	/**
	 * Sets the value of the '{@link behaviorModel.ConditionNode#getConditionDefinition <em>Condition Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Definition</em>' attribute.
	 * @see #getConditionDefinition()
	 * @generated
	 */
	void setConditionDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Condition Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Result</em>' attribute.
	 * @see #setConditionResult(boolean)
	 * @see behaviorModel.BehaviorModelPackage#getConditionNode_ConditionResult()
	 * @model
	 * @generated
	 */
	boolean isConditionResult();

	/**
	 * Sets the value of the '{@link behaviorModel.ConditionNode#isConditionResult <em>Condition Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Result</em>' attribute.
	 * @see #isConditionResult()
	 * @generated
	 */
	void setConditionResult(boolean value);

} // ConditionNode
