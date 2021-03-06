/**
 *  Copyright (c) 2000-2009, Intalio Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Intalio Inc. - initial API and implementation
 *
 */
package org.eclipse.mdt.bpmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.AdHocOrdering;
import org.eclipse.mdt.bpmn.AdHocSubProcess;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AdHocSubProcessImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AdHocSubProcessImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AdHocSubProcessImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocSubProcessImpl extends SubProcessImpl implements
        AdHocSubProcess {
    /**
     * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletionCondition()
     * @generated
     * @ordered
     */
    protected Expression completionCondition;

    /**
     * The default value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelRemainingInstances()
     * @generated
     * @ordered
     */
    protected static final boolean CANCEL_REMAINING_INSTANCES_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelRemainingInstances()
     * @generated
     * @ordered
     */
    protected boolean cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;

    /**
     * This is true if the Cancel Remaining Instances attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelRemainingInstancesESet;

    /**
     * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdering()
     * @generated
     * @ordered
     */
    protected static final AdHocOrdering ORDERING_EDEFAULT = AdHocOrdering.PARALLEL;

    /**
     * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdering()
     * @generated
     * @ordered
     */
    protected AdHocOrdering ordering = ORDERING_EDEFAULT;

    /**
     * This is true if the Ordering attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean orderingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AdHocSubProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getAdHocSubProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompletionCondition(
            Expression newCompletionCondition, NotificationChain msgs) {
        Expression oldCompletionCondition = completionCondition;
        completionCondition = newCompletionCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
                    oldCompletionCondition, newCompletionCondition);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompletionCondition(Expression newCompletionCondition) {
        if (newCompletionCondition != completionCondition) {
            NotificationChain msgs = null;
            if (completionCondition != null)
                msgs = ((InternalEObject) completionCondition)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
                                null, msgs);
            if (newCompletionCondition != null)
                msgs = ((InternalEObject) newCompletionCondition)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
                                null, msgs);
            msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
                    newCompletionCondition, newCompletionCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCancelRemainingInstances() {
        return cancelRemainingInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCancelRemainingInstances(boolean newCancelRemainingInstances) {
        boolean oldCancelRemainingInstances = cancelRemainingInstances;
        cancelRemainingInstances = newCancelRemainingInstances;
        boolean oldCancelRemainingInstancesESet = cancelRemainingInstancesESet;
        cancelRemainingInstancesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES,
                    oldCancelRemainingInstances, cancelRemainingInstances,
                    !oldCancelRemainingInstancesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCancelRemainingInstances() {
        boolean oldCancelRemainingInstances = cancelRemainingInstances;
        boolean oldCancelRemainingInstancesESet = cancelRemainingInstancesESet;
        cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;
        cancelRemainingInstancesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES,
                    oldCancelRemainingInstances,
                    CANCEL_REMAINING_INSTANCES_EDEFAULT,
                    oldCancelRemainingInstancesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCancelRemainingInstances() {
        return cancelRemainingInstancesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering getOrdering() {
        return ordering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrdering(AdHocOrdering newOrdering) {
        AdHocOrdering oldOrdering = ordering;
        ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
        boolean oldOrderingESet = orderingESet;
        orderingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING, oldOrdering,
                    ordering, !oldOrderingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOrdering() {
        AdHocOrdering oldOrdering = ordering;
        boolean oldOrderingESet = orderingESet;
        ordering = ORDERING_EDEFAULT;
        orderingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING, oldOrdering,
                    ORDERING_EDEFAULT, oldOrderingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOrdering() {
        return orderingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return basicSetCompletionCondition(null, msgs);
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
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return getCompletionCondition();
        case BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            return isCancelRemainingInstances();
        case BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            return getOrdering();
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
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) newValue);
            return;
        case BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            setCancelRemainingInstances((Boolean) newValue);
            return;
        case BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            setOrdering((AdHocOrdering) newValue);
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
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) null);
            return;
        case BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            unsetCancelRemainingInstances();
            return;
        case BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            unsetOrdering();
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
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return completionCondition != null;
        case BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            return isSetCancelRemainingInstances();
        case BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            return isSetOrdering();
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (cancelRemainingInstances: "); //$NON-NLS-1$
        if (cancelRemainingInstancesESet)
            result.append(cancelRemainingInstances);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", ordering: "); //$NON-NLS-1$
        if (orderingESet)
            result.append(ordering);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //AdHocSubProcessImpl
