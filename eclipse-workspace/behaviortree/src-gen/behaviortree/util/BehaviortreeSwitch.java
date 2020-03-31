/**
 */
package behaviortree.util;

import behaviortree.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see behaviortree.BehaviortreePackage
 * @generated
 */
public class BehaviortreeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviortreePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreeSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviortreePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BehaviortreePackage.BEHAVIOR_TREE: {
			BehaviorTree behaviorTree = (BehaviorTree) theEObject;
			T result = caseBehaviorTree(behaviorTree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.ACTION_NODE: {
			ActionNode actionNode = (ActionNode) theEObject;
			T result = caseActionNode(actionNode);
			if (result == null)
				result = caseActionNodeChild(actionNode);
			if (result == null)
				result = caseConditionNodeChild(actionNode);
			if (result == null)
				result = caseNode(actionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.ENTRY_POINT: {
			EntryPoint entryPoint = (EntryPoint) theEObject;
			T result = caseEntryPoint(entryPoint);
			if (result == null)
				result = caseNode(entryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.CONDITION_NODE: {
			ConditionNode conditionNode = (ConditionNode) theEObject;
			T result = caseConditionNode(conditionNode);
			if (result == null)
				result = caseConditionNodeChild(conditionNode);
			if (result == null)
				result = caseNode(conditionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.SEQUENCE_NODE: {
			SequenceNode sequenceNode = (SequenceNode) theEObject;
			T result = caseSequenceNode(sequenceNode);
			if (result == null)
				result = caseNode(sequenceNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.FALLBACK_NODE: {
			FallbackNode fallbackNode = (FallbackNode) theEObject;
			T result = caseFallbackNode(fallbackNode);
			if (result == null)
				result = caseNode(fallbackNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.ACTION_NODE_CHILD: {
			ActionNodeChild actionNodeChild = (ActionNodeChild) theEObject;
			T result = caseActionNodeChild(actionNodeChild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.CONDITION_NODE_CHILD: {
			ConditionNodeChild conditionNodeChild = (ConditionNodeChild) theEObject;
			T result = caseConditionNodeChild(conditionNodeChild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.SEQUENCE_NODE_CHILD: {
			SequenceNodeChild sequenceNodeChild = (SequenceNodeChild) theEObject;
			T result = caseSequenceNodeChild(sequenceNodeChild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.FALLBACK_NODE_CHILD: {
			FallbackNodeChild fallbackNodeChild = (FallbackNodeChild) theEObject;
			T result = caseFallbackNodeChild(fallbackNodeChild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviortreePackage.TREE_SKELETON: {
			TreeSkeleton treeSkeleton = (TreeSkeleton) theEObject;
			T result = caseTreeSkeleton(treeSkeleton);
			if (result == null)
				result = caseConditionNodeChild(treeSkeleton);
			if (result == null)
				result = caseNode(treeSkeleton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorTree(BehaviorTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionNode(ActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionNode(ConditionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallbackNode(FallbackNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Node Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Node Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionNodeChild(ActionNodeChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Node Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Node Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionNodeChild(ConditionNodeChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNodeChild(SequenceNodeChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback Node Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback Node Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallbackNodeChild(FallbackNodeChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Skeleton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeSkeleton(TreeSkeleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviortreeSwitch
