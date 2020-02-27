/**
 */
package behaviorTreeMetamodel;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link behaviorTreeMetamodel.Root#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Tree</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorTreeMetamodel.Tree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' containment reference list.
	 * @see behaviorTreeMetamodel.BehaviorTreeMetamodelPackage#getRoot_Tree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tree> getTree();

} // Root
