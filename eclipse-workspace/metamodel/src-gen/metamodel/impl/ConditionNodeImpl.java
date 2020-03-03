/**
 */
package metamodel.impl;

import metamodel.ConditionNode;
import metamodel.MetamodelPackage;

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
 *   <li>{@link metamodel.impl.ConditionNodeImpl#getConditionName <em>Condition Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionNodeImpl extends MinimalEObjectImpl.Container implements ConditionNode {
	/**
	 * The default value of the '{@link #getConditionName() <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionName() <em>Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionName()
	 * @generated
	 * @ordered
	 */
	protected String conditionName = CONDITION_NAME_EDEFAULT;

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
		return MetamodelPackage.Literals.CONDITION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionName() {
		return conditionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionName(String newConditionName) {
		String oldConditionName = conditionName;
		conditionName = newConditionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CONDITION_NODE__CONDITION_NAME,
					oldConditionName, conditionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.CONDITION_NODE__CONDITION_NAME:
			return getConditionName();
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
		case MetamodelPackage.CONDITION_NODE__CONDITION_NAME:
			setConditionName((String) newValue);
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
		case MetamodelPackage.CONDITION_NODE__CONDITION_NAME:
			setConditionName(CONDITION_NAME_EDEFAULT);
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
		case MetamodelPackage.CONDITION_NODE__CONDITION_NAME:
			return CONDITION_NAME_EDEFAULT == null ? conditionName != null
					: !CONDITION_NAME_EDEFAULT.equals(conditionName);
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
		result.append(" (conditionName: ");
		result.append(conditionName);
		result.append(')');
		return result.toString();
	}

} //ConditionNodeImpl
