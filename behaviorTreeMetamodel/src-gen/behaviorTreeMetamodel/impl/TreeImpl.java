/**
 */
package behaviorTreeMetamodel.impl;

import behaviorTreeMetamodel.ActionNode;
import behaviorTreeMetamodel.BehaviorTreeMetamodelPackage;
import behaviorTreeMetamodel.CompositeNode;
import behaviorTreeMetamodel.Tree;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorTreeMetamodel.impl.TreeImpl#getName <em>Name</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.TreeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.TreeImpl#getCompositeChild <em>Composite Child</em>}</li>
 *   <li>{@link behaviorTreeMetamodel.impl.TreeImpl#getActionChild <em>Action Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeImpl extends MinimalEObjectImpl.Container implements Tree {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getActionChild() <em>Action Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionChild()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionNode> actionChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorTreeMetamodelPackage.Literals.TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorTreeMetamodelPackage.TREE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tree> getSubtree() {
		if (subtree == null) {
			subtree = new EObjectContainmentEList<Tree>(Tree.class, this, BehaviorTreeMetamodelPackage.TREE__SUBTREE);
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
					BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD);
		}
		return compositeChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionNode> getActionChild() {
		if (actionChild == null) {
			actionChild = new EObjectContainmentEList<ActionNode>(ActionNode.class, this,
					BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD);
		}
		return actionChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorTreeMetamodelPackage.TREE__SUBTREE:
			return ((InternalEList<?>) getSubtree()).basicRemove(otherEnd, msgs);
		case BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD:
			return ((InternalEList<?>) getCompositeChild()).basicRemove(otherEnd, msgs);
		case BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD:
			return ((InternalEList<?>) getActionChild()).basicRemove(otherEnd, msgs);
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
		case BehaviorTreeMetamodelPackage.TREE__NAME:
			return getName();
		case BehaviorTreeMetamodelPackage.TREE__SUBTREE:
			return getSubtree();
		case BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD:
			return getCompositeChild();
		case BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD:
			return getActionChild();
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
		case BehaviorTreeMetamodelPackage.TREE__NAME:
			setName((String) newValue);
			return;
		case BehaviorTreeMetamodelPackage.TREE__SUBTREE:
			getSubtree().clear();
			getSubtree().addAll((Collection<? extends Tree>) newValue);
			return;
		case BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD:
			getCompositeChild().clear();
			getCompositeChild().addAll((Collection<? extends CompositeNode>) newValue);
			return;
		case BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD:
			getActionChild().clear();
			getActionChild().addAll((Collection<? extends ActionNode>) newValue);
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
		case BehaviorTreeMetamodelPackage.TREE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BehaviorTreeMetamodelPackage.TREE__SUBTREE:
			getSubtree().clear();
			return;
		case BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD:
			getCompositeChild().clear();
			return;
		case BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD:
			getActionChild().clear();
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
		case BehaviorTreeMetamodelPackage.TREE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BehaviorTreeMetamodelPackage.TREE__SUBTREE:
			return subtree != null && !subtree.isEmpty();
		case BehaviorTreeMetamodelPackage.TREE__COMPOSITE_CHILD:
			return compositeChild != null && !compositeChild.isEmpty();
		case BehaviorTreeMetamodelPackage.TREE__ACTION_CHILD:
			return actionChild != null && !actionChild.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TreeImpl
