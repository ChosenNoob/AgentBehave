/**
 */
package behaviorModel.impl;

import behaviorModel.*;

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
public class BehaviorModelFactoryImpl extends EFactoryImpl implements BehaviorModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorModelFactory init() {
		try {
			BehaviorModelFactory theBehaviorModelFactory = (BehaviorModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BehaviorModelPackage.eNS_URI);
			if (theBehaviorModelFactory != null) {
				return theBehaviorModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorModelFactoryImpl() {
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
		case BehaviorModelPackage.SUBTREE:
			return createSubtree();
		case BehaviorModelPackage.ROOT:
			return createRoot();
		case BehaviorModelPackage.ACTION_NODE:
			return createActionNode();
		case BehaviorModelPackage.COMPOSITE_NODE:
			return createCompositeNode();
		case BehaviorModelPackage.SEQUENCE_NODE:
			return createSequenceNode();
		case BehaviorModelPackage.FALLBACK_NODE:
			return createFallbackNode();
		case BehaviorModelPackage.CONDITION_NODE:
			return createConditionNode();
		case BehaviorModelPackage.DECORATOR_NODE:
			return createDecoratorNode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtree createSubtree() {
		SubtreeImpl subtree = new SubtreeImpl();
		return subtree;
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
	public ActionNode createActionNode() {
		ActionNodeImpl actionNode = new ActionNodeImpl();
		return actionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode createCompositeNode() {
		CompositeNodeImpl compositeNode = new CompositeNodeImpl();
		return compositeNode;
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
	public DecoratorNode createDecoratorNode() {
		DecoratorNodeImpl decoratorNode = new DecoratorNodeImpl();
		return decoratorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorModelPackage getBehaviorModelPackage() {
		return (BehaviorModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorModelPackage getPackage() {
		return BehaviorModelPackage.eINSTANCE;
	}

} //BehaviorModelFactoryImpl
