/**
 */
package behaviortree.impl;

import behaviortree.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviortreeFactoryImpl extends EFactoryImpl implements BehaviortreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviortreeFactory init() {
		try {
			BehaviortreeFactory theBehaviortreeFactory = (BehaviortreeFactory) EPackage.Registry.INSTANCE
					.getEFactory(BehaviortreePackage.eNS_URI);
			if (theBehaviortreeFactory != null) {
				return theBehaviortreeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviortreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BehaviortreePackage.BEHAVIOR_TREE:
			return createBehaviorTree();
		case BehaviortreePackage.ACTION_NODE:
			return createActionNode();
		case BehaviortreePackage.ENTRY_POINT:
			return createEntryPoint();
		case BehaviortreePackage.CONDITION_NODE:
			return createConditionNode();
		case BehaviortreePackage.SEQUENCE_NODE:
			return createSequenceNode();
		case BehaviortreePackage.FALLBACK_NODE:
			return createFallbackNode();
		case BehaviortreePackage.TREE_SKELETON:
			return createTreeSkeleton();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTree createBehaviorTree() {
		BehaviorTreeImpl behaviorTree = new BehaviorTreeImpl();
		return behaviorTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionNode createActionNode() {
		ActionNodeImpl actionNode = new ActionNodeImpl();
		return actionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionNode createConditionNode() {
		ConditionNodeImpl conditionNode = new ConditionNodeImpl();
		return conditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FallbackNode createFallbackNode() {
		FallbackNodeImpl fallbackNode = new FallbackNodeImpl();
		return fallbackNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeSkeleton createTreeSkeleton() {
		TreeSkeletonImpl treeSkeleton = new TreeSkeletonImpl();
		return treeSkeleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreePackage getBehaviortreePackage() {
		return (BehaviortreePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviortreePackage getPackage() {
		return BehaviortreePackage.eINSTANCE;
	}

} //BehaviortreeFactoryImpl
