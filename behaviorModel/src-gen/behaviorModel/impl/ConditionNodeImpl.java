/**
 */
package behaviorModel.impl;

import behaviorModel.BehaviorModelPackage;
import behaviorModel.ConditionNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviorModel.impl.ConditionNodeImpl#getConditionDefinition <em>Condition Definition</em>}</li>
 *   <li>{@link behaviorModel.impl.ConditionNodeImpl#isConditionResult <em>Condition Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionNodeImpl extends MinimalEObjectImpl.Container implements ConditionNode {
	/**
	 * The default value of the '{@link #getConditionDefinition() <em>Condition Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionDefinition() <em>Condition Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDefinition()
	 * @generated
	 * @ordered
	 */
	protected String conditionDefinition = CONDITION_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isConditionResult() <em>Condition Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConditionResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONDITION_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConditionResult() <em>Condition Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConditionResult()
	 * @generated
	 * @ordered
	 */
	protected boolean conditionResult = CONDITION_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorModelPackage.Literals.CONDITION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionDefinition() {
		return conditionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionDefinition(String newConditionDefinition) {
		String oldConditionDefinition = conditionDefinition;
		conditionDefinition = newConditionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorModelPackage.CONDITION_NODE__CONDITION_DEFINITION, oldConditionDefinition,
					conditionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConditionResult() {
		return conditionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionResult(boolean newConditionResult) {
		boolean oldConditionResult = conditionResult;
		conditionResult = newConditionResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorModelPackage.CONDITION_NODE__CONDITION_RESULT,
					oldConditionResult, conditionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_DEFINITION:
			return getConditionDefinition();
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_RESULT:
			return isConditionResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_DEFINITION:
			setConditionDefinition((String) newValue);
			return;
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_RESULT:
			setConditionResult((Boolean) newValue);
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
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_DEFINITION:
			setConditionDefinition(CONDITION_DEFINITION_EDEFAULT);
			return;
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_RESULT:
			setConditionResult(CONDITION_RESULT_EDEFAULT);
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
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_DEFINITION:
			return CONDITION_DEFINITION_EDEFAULT == null ? conditionDefinition != null
					: !CONDITION_DEFINITION_EDEFAULT.equals(conditionDefinition);
		case BehaviorModelPackage.CONDITION_NODE__CONDITION_RESULT:
			return conditionResult != CONDITION_RESULT_EDEFAULT;
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
		result.append(" (conditionDefinition: ");
		result.append(conditionDefinition);
		result.append(", conditionResult: ");
		result.append(conditionResult);
		result.append(')');
		return result.toString();
	}

} //ConditionNodeImpl
