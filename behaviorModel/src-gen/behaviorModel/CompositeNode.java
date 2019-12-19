/**
 */
package behaviorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.CompositeNode#getActionnode <em>Actionnode</em>}</li>
 *   <li>{@link behaviorModel.CompositeNode#getConditionnode <em>Conditionnode</em>}</li>
 *   <li>{@link behaviorModel.CompositeNode#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorModel.CompositeNode#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getCompositeNode()
 * @model
 * @generated
 */
public interface CompositeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Actionnode</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionnode</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getCompositeNode_Actionnode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionNode> getActionnode();

	/**
	 * Returns the value of the '<em><b>Conditionnode</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.ConditionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnode</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getCompositeNode_Conditionnode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionNode> getConditionnode();

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.Subtree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getCompositeNode_Subtree()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subtree> getSubtree();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see behaviorModel.BehaviorModelPackage#getCompositeNode_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link behaviorModel.CompositeNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // CompositeNode
