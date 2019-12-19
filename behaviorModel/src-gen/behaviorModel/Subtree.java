/**
 */
package behaviorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.Subtree#getSdfhy <em>Sdfhy</em>}</li>
 *   <li>{@link behaviorModel.Subtree#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorModel.Subtree#getCompositenode <em>Compositenode</em>}</li>
 *   <li>{@link behaviorModel.Subtree#getDecoratornode <em>Decoratornode</em>}</li>
 *   <li>{@link behaviorModel.Subtree#getActionnode <em>Actionnode</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getSubtree()
 * @model
 * @generated
 */
public interface Subtree extends EObject {
	/**
	 * Returns the value of the '<em><b>Sdfhy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdfhy</em>' attribute.
	 * @see #setSdfhy(String)
	 * @see behaviorModel.BehaviorModelPackage#getSubtree_Sdfhy()
	 * @model
	 * @generated
	 */
	String getSdfhy();

	/**
	 * Sets the value of the '{@link behaviorModel.Subtree#getSdfhy <em>Sdfhy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdfhy</em>' attribute.
	 * @see #getSdfhy()
	 * @generated
	 */
	void setSdfhy(String value);

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.Subtree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getSubtree_Subtree()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subtree> getSubtree();

	/**
	 * Returns the value of the '<em><b>Compositenode</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositenode</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getSubtree_Compositenode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeNode> getCompositenode();

	/**
	 * Returns the value of the '<em><b>Decoratornode</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.DecoratorNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoratornode</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getSubtree_Decoratornode()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecoratorNode> getDecoratornode();

	/**
	 * Returns the value of the '<em><b>Actionnode</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorModel.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionnode</em>' containment reference list.
	 * @see behaviorModel.BehaviorModelPackage#getSubtree_Actionnode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionNode> getActionnode();

} // Subtree
