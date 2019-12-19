/**
 */
package behaviorModel.impl;

import behaviorModel.ActionNode;
import behaviorModel.BehaviorModelPackage;
import behaviorModel.CompositeNode;
import behaviorModel.DecoratorNode;
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
 * An implementation of the model object '<em><b>Subtree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.impl.SubtreeImpl#getSdfhy <em>Sdfhy</em>}</li>
 *   <li>{@link behaviorModel.impl.SubtreeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link behaviorModel.impl.SubtreeImpl#getCompositenode <em>Compositenode</em>}</li>
 *   <li>{@link behaviorModel.impl.SubtreeImpl#getDecoratornode <em>Decoratornode</em>}</li>
 *   <li>{@link behaviorModel.impl.SubtreeImpl#getActionnode <em>Actionnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtreeImpl extends MinimalEObjectImpl.Container implements Subtree {
	/**
	 * The default value of the '{@link #getSdfhy() <em>Sdfhy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdfhy()
	 * @generated
	 * @ordered
	 */
	protected static final String SDFHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSdfhy() <em>Sdfhy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdfhy()
	 * @generated
	 * @ordered
	 */
	protected String sdfhy = SDFHY_EDEFAULT;

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
	 * The cached value of the '{@link #getCompositenode() <em>Compositenode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositenode()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> compositenode;

	/**
	 * The cached value of the '{@link #getDecoratornode() <em>Decoratornode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratornode()
	 * @generated
	 * @ordered
	 */
	protected EList<DecoratorNode> decoratornode;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorModelPackage.Literals.SUBTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSdfhy() {
		return sdfhy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSdfhy(String newSdfhy) {
		String oldSdfhy = sdfhy;
		sdfhy = newSdfhy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorModelPackage.SUBTREE__SDFHY, oldSdfhy,
					sdfhy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtree> getSubtree() {
		if (subtree == null) {
			subtree = new EObjectContainmentEList<Subtree>(Subtree.class, this, BehaviorModelPackage.SUBTREE__SUBTREE);
		}
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getCompositenode() {
		if (compositenode == null) {
			compositenode = new EObjectContainmentEList<CompositeNode>(CompositeNode.class, this,
					BehaviorModelPackage.SUBTREE__COMPOSITENODE);
		}
		return compositenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecoratorNode> getDecoratornode() {
		if (decoratornode == null) {
			decoratornode = new EObjectContainmentEList<DecoratorNode>(DecoratorNode.class, this,
					BehaviorModelPackage.SUBTREE__DECORATORNODE);
		}
		return decoratornode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionNode> getActionnode() {
		if (actionnode == null) {
			actionnode = new EObjectContainmentEList<ActionNode>(ActionNode.class, this,
					BehaviorModelPackage.SUBTREE__ACTIONNODE);
		}
		return actionnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviorModelPackage.SUBTREE__SUBTREE:
			return ((InternalEList<?>) getSubtree()).basicRemove(otherEnd, msgs);
		case BehaviorModelPackage.SUBTREE__COMPOSITENODE:
			return ((InternalEList<?>) getCompositenode()).basicRemove(otherEnd, msgs);
		case BehaviorModelPackage.SUBTREE__DECORATORNODE:
			return ((InternalEList<?>) getDecoratornode()).basicRemove(otherEnd, msgs);
		case BehaviorModelPackage.SUBTREE__ACTIONNODE:
			return ((InternalEList<?>) getActionnode()).basicRemove(otherEnd, msgs);
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
		case BehaviorModelPackage.SUBTREE__SDFHY:
			return getSdfhy();
		case BehaviorModelPackage.SUBTREE__SUBTREE:
			return getSubtree();
		case BehaviorModelPackage.SUBTREE__COMPOSITENODE:
			return getCompositenode();
		case BehaviorModelPackage.SUBTREE__DECORATORNODE:
			return getDecoratornode();
		case BehaviorModelPackage.SUBTREE__ACTIONNODE:
			return getActionnode();
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
		case BehaviorModelPackage.SUBTREE__SDFHY:
			setSdfhy((String) newValue);
			return;
		case BehaviorModelPackage.SUBTREE__SUBTREE:
			getSubtree().clear();
			getSubtree().addAll((Collection<? extends Subtree>) newValue);
			return;
		case BehaviorModelPackage.SUBTREE__COMPOSITENODE:
			getCompositenode().clear();
			getCompositenode().addAll((Collection<? extends CompositeNode>) newValue);
			return;
		case BehaviorModelPackage.SUBTREE__DECORATORNODE:
			getDecoratornode().clear();
			getDecoratornode().addAll((Collection<? extends DecoratorNode>) newValue);
			return;
		case BehaviorModelPackage.SUBTREE__ACTIONNODE:
			getActionnode().clear();
			getActionnode().addAll((Collection<? extends ActionNode>) newValue);
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
		case BehaviorModelPackage.SUBTREE__SDFHY:
			setSdfhy(SDFHY_EDEFAULT);
			return;
		case BehaviorModelPackage.SUBTREE__SUBTREE:
			getSubtree().clear();
			return;
		case BehaviorModelPackage.SUBTREE__COMPOSITENODE:
			getCompositenode().clear();
			return;
		case BehaviorModelPackage.SUBTREE__DECORATORNODE:
			getDecoratornode().clear();
			return;
		case BehaviorModelPackage.SUBTREE__ACTIONNODE:
			getActionnode().clear();
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
		case BehaviorModelPackage.SUBTREE__SDFHY:
			return SDFHY_EDEFAULT == null ? sdfhy != null : !SDFHY_EDEFAULT.equals(sdfhy);
		case BehaviorModelPackage.SUBTREE__SUBTREE:
			return subtree != null && !subtree.isEmpty();
		case BehaviorModelPackage.SUBTREE__COMPOSITENODE:
			return compositenode != null && !compositenode.isEmpty();
		case BehaviorModelPackage.SUBTREE__DECORATORNODE:
			return decoratornode != null && !decoratornode.isEmpty();
		case BehaviorModelPackage.SUBTREE__ACTIONNODE:
			return actionnode != null && !actionnode.isEmpty();
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
		result.append(" (sdfhy: ");
		result.append(sdfhy);
		result.append(')');
		return result.toString();
	}

} //SubtreeImpl
