/**
 */
package behaviorTreeMetamodel.impl;

import behaviorTreeMetamodel.*;

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
public class BehaviorTreeMetamodelFactoryImpl extends EFactoryImpl implements BehaviorTreeMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorTreeMetamodelFactory init() {
		try {
			BehaviorTreeMetamodelFactory theBehaviorTreeMetamodelFactory = (BehaviorTreeMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BehaviorTreeMetamodelPackage.eNS_URI);
			if (theBehaviorTreeMetamodelFactory != null) {
				return theBehaviorTreeMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorTreeMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTreeMetamodelFactoryImpl() {
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
		case BehaviorTreeMetamodelPackage.TREE:
			return createTree();
		case BehaviorTreeMetamodelPackage.ACTION_NODE:
			return createActionNode();
		case BehaviorTreeMetamodelPackage.SEQUENCE_NODE:
			return createSequenceNode();
		case BehaviorTreeMetamodelPackage.FALLBACK_NODE:
			return createFallbackNode();
		case BehaviorTreeMetamodelPackage.CONDITION_NODE:
			return createConditionNode();
		case BehaviorTreeMetamodelPackage.ROOT:
			return createRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
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
	public ConditionNode createConditionNode() {
		ConditionNodeImpl conditionNode = new ConditionNodeImpl();
		return conditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTreeMetamodelPackage getBehaviorTreeMetamodelPackage() {
		return (BehaviorTreeMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorTreeMetamodelPackage getPackage() {
		return BehaviorTreeMetamodelPackage.eINSTANCE;
	}

} //BehaviorTreeMetamodelFactoryImpl
