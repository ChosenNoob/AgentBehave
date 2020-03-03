/**
 */
package metamodel;

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
 *   <li>{@link metamodel.ConditionNode#getConditionName <em>Condition Name</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getConditionNode()
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
	 * @see metamodel.MetamodelPackage#getConditionNode_ConditionName()
	 * @model
	 * @generated
	 */
	String getConditionName();

	/**
	 * Sets the value of the '{@link metamodel.ConditionNode#getConditionName <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Name</em>' attribute.
	 * @see #getConditionName()
	 * @generated
	 */
	void setConditionName(String value);

} // ConditionNode
