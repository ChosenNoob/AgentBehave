/**
 */
package behaviorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.Root#getSubtree <em>Subtree</em>}</li>
 * </ul>
 *
 * @see behaviorModel.BehaviorModelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference.
	 * @see #setSubtree(Subtree)
	 * @see behaviorModel.BehaviorModelPackage#getRoot_Subtree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Subtree getSubtree();

	/**
	 * Sets the value of the '{@link behaviorModel.Root#getSubtree <em>Subtree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtree</em>' containment reference.
	 * @see #getSubtree()
	 * @generated
	 */
	void setSubtree(Subtree value);

} // Root
