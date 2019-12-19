/**
 */
package behaviorModel.impl;

import behaviorModel.ActionNode;
import behaviorModel.BehaviorModelPackage;
import behaviorModel.CompositeNode;
import behaviorModel.ConditionNode;

import behaviorModel.Subtree;
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
 * An implementation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.impl.CompositeNodeImpl#getActionnode <em>Actionnode</em>}</li>
 *   <li>{@link behaviorModel.impl.CompositeNodeImpl#getConditionnode <em>Conditionnode</em>}</li>
 *   <li>{@link behaviorModel.impl.CompositeNodeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorModel.impl.CompositeNodeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeNodeImpl extends MinimalEObjectImpl.Container implements CompositeNode {
	/**
	 * The cached value of the '{@link #getActionnode() <em>Actionnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionnode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionNode> actionnode;

	/**
	 * The cached value of the '{@link #getConditionnode() <em>Conditionnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnode()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionNode> conditionnode;

	/**
	 * The cached value of the '{@link #getSubtree() <em>Subtree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtree()
	 * @generated
	 * @ordered
	 */
	protected EList<Subtree> subtree;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
		return BehaviorModelPackage.Literals.COMPOSITE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionNode> getActionnode() {
		if (actionnode == null) {
			actionnode = new EObjectContainmentEList<ActionNode>(ActionNode.class, this,
					BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE);
		}
		return actionnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionNode> getConditionnode() {
		if (conditionnode == null) {
			conditionnode = new EObjectContainmentEList<ConditionNode>(ConditionNode.class, this,
					BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE);
		}
		return conditionnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtree> getSubtree() {
		if (subtree == null) {
			subtree = new EObjectContainmentEList<Subtree>(Subtree.class, this,
					BehaviorModelPackage.COMPOSITE_NODE__SUBTREE);
		}
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorModelPackage.COMPOSITE_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE:
			return ((InternalEList<?>) getActionnode()).basicRemove(otherEnd, msgs);
		case BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE:
			return ((InternalEList<?>) getConditionnode()).basicRemove(otherEnd, msgs);
		case BehaviorModelPackage.COMPOSITE_NODE__SUBTREE:
			return ((InternalEList<?>) getSubtree()).basicRemove(otherEnd, msgs);
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
		case BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE:
			return getActionnode();
		case BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE:
			return getConditionnode();
		case BehaviorModelPackage.COMPOSITE_NODE__SUBTREE:
			return getSubtree();
		case BehaviorModelPackage.COMPOSITE_NODE__ID:
			return getId();
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
		case BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE:
			getActionnode().clear();
			getActionnode().addAll((Collection<? extends ActionNode>) newValue);
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE:
			getConditionnode().clear();
			getConditionnode().addAll((Collection<? extends ConditionNode>) newValue);
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__SUBTREE:
			getSubtree().clear();
			getSubtree().addAll((Collection<? extends Subtree>) newValue);
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__ID:
			setId((Integer) newValue);
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
		case BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE:
			getActionnode().clear();
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE:
			getConditionnode().clear();
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__SUBTREE:
			getSubtree().clear();
			return;
		case BehaviorModelPackage.COMPOSITE_NODE__ID:
			setId(ID_EDEFAULT);
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
		case BehaviorModelPackage.COMPOSITE_NODE__ACTIONNODE:
			return actionnode != null && !actionnode.isEmpty();
		case BehaviorModelPackage.COMPOSITE_NODE__CONDITIONNODE:
			return conditionnode != null && !conditionnode.isEmpty();
		case BehaviorModelPackage.COMPOSITE_NODE__SUBTREE:
			return subtree != null && !subtree.isEmpty();
		case BehaviorModelPackage.COMPOSITE_NODE__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (Id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CompositeNodeImpl
