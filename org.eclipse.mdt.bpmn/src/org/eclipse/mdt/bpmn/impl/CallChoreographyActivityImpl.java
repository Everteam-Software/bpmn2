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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.CallChoreographyActivity;
import org.eclipse.mdt.bpmn.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallChoreographyActivityImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallChoreographyActivityImpl#getCalledElement <em>Called Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallChoreographyActivityImpl extends ChoreographyActivityImpl
        implements CallChoreographyActivity {
    /**
     * The cached value of the '{@link #getParticipantAssociation() <em>Participant Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantAssociation()
     * @generated
     * @ordered
     */
    protected EList<ParticipantAssociation> participantAssociation;

    /**
     * The default value of the '{@link #getCalledElement() <em>Called Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalledElement()
     * @generated
     * @ordered
     */
    protected static final QName CALLED_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCalledElement() <em>Called Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalledElement()
     * @generated
     * @ordered
     */
    protected QName calledElement = CALLED_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CallChoreographyActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCallChoreographyActivity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParticipantAssociation> getParticipantAssociation() {
        if (participantAssociation == null) {
            participantAssociation = new EObjectContainmentEList<ParticipantAssociation>(
                    ParticipantAssociation.class,
                    this,
                    BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION);
        }
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getCalledElement() {
        return calledElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCalledElement(QName newCalledElement) {
        QName oldCalledElement = calledElement;
        calledElement = newCalledElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT,
                    oldCalledElement, calledElement));
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
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION:
            return ((InternalEList<?>) getParticipantAssociation())
                    .basicRemove(otherEnd, msgs);
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
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION:
            return getParticipantAssociation();
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT:
            return getCalledElement();
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
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            getParticipantAssociation().addAll(
                    (Collection<? extends ParticipantAssociation>) newValue);
            return;
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT:
            setCalledElement((QName) newValue);
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
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            return;
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT:
            setCalledElement(CALLED_ELEMENT_EDEFAULT);
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
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION:
            return participantAssociation != null
                    && !participantAssociation.isEmpty();
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT:
            return CALLED_ELEMENT_EDEFAULT == null ? calledElement != null
                    : !CALLED_ELEMENT_EDEFAULT.equals(calledElement);
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
        result.append(" (calledElement: "); //$NON-NLS-1$
        result.append(calledElement);
        result.append(')');
        return result.toString();
    }

} //CallChoreographyActivityImpl
