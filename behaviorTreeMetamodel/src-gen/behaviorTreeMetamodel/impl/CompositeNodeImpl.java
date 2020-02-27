/**
 */
package behaviorTreeMetamodel.impl;

import behaviorTreeMetamodel.ActionNode;
import behaviorTreeMetamodel.BehaviorTreeMetamodelPackage;
import behaviorTreeMetamodel.CompositeNode;
import behaviorTreeMetamodel.ConditionNode;
import behaviorTreeMetamodel.Tree;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorTreeMetamodel.impl.CompositeNodeImpl#getActionChild <em>Action Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.CompositeNodeImpl#getConditionChild <em>Condition Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.CompositeNodeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.CompositeNodeImpl#getCompositeChild <em>Composite Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositeNodeImpl extends MinimalEObjectImpl.Container implements CompositeNode {
	/**
	 * The cached value of the '{@link #getActionChild() <em>Action Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionChild()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionNode> actionChild;

	/**
	 * The cached value of the '{@link #getConditionChild() <em>Condition Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionChild()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionNode> conditionChild;

	/**
	 * The cached value of the '{@link #getSubtree() <em>Subtree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtree()
	 * @generated
	 * @ordered
	 */
	protected EList<Tree> subtree;

	/**
	 * The cached value of the '{@link #getCompositeChild() <em>Composite Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeChild()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> compositeChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorTreeMetamodelPackage.Literals.COMPOSITE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionNode> getActionChild() {
		if (actionChild == null) {
			actionChild = new EObjectContainmentEList<ActionNode>(ActionNode.class, this,
					BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD);
		}
		return actionChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionNode> getConditionChild() {
		if (conditionChild == null) {
			conditionChild = new EObjectContainmentEList<ConditionNode>(ConditionNode.class, this,
					BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD);
		}
		return conditionChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tree> getSubtree() {
		if (subtree == null) {
			subtree = new EObjectContainmentEList<Tree>(Tree.class, this,
					BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE);
		}
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getCompositeChild() {
		if (compositeChild == null) {
			compositeChild = new EObjectContainmentEList<CompositeNode>(CompositeNode.class, this,
					BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD);
		}
		return compositeChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD:
			return ((InternalEList<?>) getActionChild()).basicRemove(otherEnd, msgs);
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD:
			return ((InternalEList<?>) getConditionChild()).basicRemove(otherEnd, msgs);
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE:
			return ((InternalEList<?>) getSubtree()).basicRemove(otherEnd, msgs);
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD:
			return ((InternalEList<?>) getCompositeChild()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD:
			return getActionChild();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD:
			return getConditionChild();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE:
			return getSubtree();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD:
			return getCompositeChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD:
			getActionChild().clear();
			getActionChild().addAll((Collection<? extends ActionNode>) newValue);
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD:
			getConditionChild().clear();
			getConditionChild().addAll((Collection<? extends ConditionNode>) newValue);
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE:
			getSubtree().clear();
			getSubtree().addAll((Collection<? extends Tree>) newValue);
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD:
			getCompositeChild().clear();
			getCompositeChild().addAll((Collection<? extends CompositeNode>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD:
			getActionChild().clear();
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD:
			getConditionChild().clear();
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE:
			getSubtree().clear();
			return;
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD:
			getCompositeChild().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__ACTION_CHILD:
			return actionChild != null && !actionChild.isEmpty();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__CONDITION_CHILD:
			return conditionChild != null && !conditionChild.isEmpty();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__SUBTREE:
			return subtree != null && !subtree.isEmpty();
		case BehaviorTreeMetamodelPackage.COMPOSITE_NODE__COMPOSITE_CHILD:
			return compositeChild != null && !compositeChild.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeNodeImpl
