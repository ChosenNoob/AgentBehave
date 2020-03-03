/**
 */
package metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metamodel.MetamodelPackage
 * @generated
 */
public interface MetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = metamodel.impl.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fallback Node</em>'.
	 * @generated
	 */
	FallbackNode createFallbackNode();

	/**
	 * Returns a new object of class '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Node</em>'.
	 * @generated
	 */
	SequenceNode createSequenceNode();

	/**
	 * Returns a new object of class '<em>Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Node</em>'.
	 * @generated
	 */
	ConditionNode createConditionNode();

	/**
	 * Returns a new object of class '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Node</em>'.
	 * @generated
	 */
	ActionNode createActionNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

} //MetamodelFactory
