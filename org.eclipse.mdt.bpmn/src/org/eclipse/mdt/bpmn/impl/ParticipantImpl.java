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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.ParticipantMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getEndPointRef <em>End Point Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getPartnerEntityRef <em>Partner Entity Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getPartnerRoleRef <em>Partner Role Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends BaseElementImpl implements Participant {
    /**
     * The cached value of the '{@link #getInterfaceRef() <em>Interface Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceRef()
     * @generated
     * @ordered
     */
    protected EList<QName> interfaceRef;

    /**
     * The cached value of the '{@link #getEndPointRef() <em>End Point Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndPointRef()
     * @generated
     * @ordered
     */
    protected EList<QName> endPointRef;

    /**
     * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantMultiplicity()
     * @generated
     * @ordered
     */
    protected ParticipantMultiplicity participantMultiplicity;

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
     * The default value of the '{@link #getPartnerEntityRef() <em>Partner Entity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartnerEntityRef()
     * @generated
     * @ordered
     */
    protected static final QName PARTNER_ENTITY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPartnerEntityRef() <em>Partner Entity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartnerEntityRef()
     * @generated
     * @ordered
     */
    protected QName partnerEntityRef = PARTNER_ENTITY_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getPartnerRoleRef() <em>Partner Role Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartnerRoleRef()
     * @generated
     * @ordered
     */
    protected static final QName PARTNER_ROLE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPartnerRoleRef() <em>Partner Role Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartnerRoleRef()
     * @generated
     * @ordered
     */
    protected QName partnerRoleRef = PARTNER_ROLE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessRef()
     * @generated
     * @ordered
     */
    protected static final QName PROCESS_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessRef()
     * @generated
     * @ordered
     */
    protected QName processRef = PROCESS_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParticipantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getParticipant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getInterfaceRef() {
        if (interfaceRef == null) {
            interfaceRef = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.PARTICIPANT__INTERFACE_REF);
        }
        return interfaceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEndPointRef() {
        if (endPointRef == null) {
            endPointRef = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.PARTICIPANT__END_POINT_REF);
        }
        return endPointRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicity getParticipantMultiplicity() {
        return participantMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantMultiplicity(
            ParticipantMultiplicity newParticipantMultiplicity,
            NotificationChain msgs) {
        ParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
        participantMultiplicity = newParticipantMultiplicity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                    oldParticipantMultiplicity, newParticipantMultiplicity);
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
    public void setParticipantMultiplicity(
            ParticipantMultiplicity newParticipantMultiplicity) {
        if (newParticipantMultiplicity != participantMultiplicity) {
            NotificationChain msgs = null;
            if (participantMultiplicity != null)
                msgs = ((InternalEObject) participantMultiplicity)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                                null, msgs);
            if (newParticipantMultiplicity != null)
                msgs = ((InternalEObject) newParticipantMultiplicity)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                                null, msgs);
            msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity,
                    msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                    newParticipantMultiplicity, newParticipantMultiplicity));
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PARTICIPANT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getPartnerEntityRef() {
        return partnerEntityRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartnerEntityRef(QName newPartnerEntityRef) {
        QName oldPartnerEntityRef = partnerEntityRef;
        partnerEntityRef = newPartnerEntityRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PARTICIPANT__PARTNER_ENTITY_REF,
                    oldPartnerEntityRef, partnerEntityRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getPartnerRoleRef() {
        return partnerRoleRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartnerRoleRef(QName newPartnerRoleRef) {
        QName oldPartnerRoleRef = partnerRoleRef;
        partnerRoleRef = newPartnerRoleRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PARTICIPANT__PARTNER_ROLE_REF,
                    oldPartnerRoleRef, partnerRoleRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getProcessRef() {
        return processRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessRef(QName newProcessRef) {
        QName oldProcessRef = processRef;
        processRef = newProcessRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PARTICIPANT__PROCESS_REF, oldProcessRef,
                    processRef));
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
        case BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return basicSetParticipantMultiplicity(null, msgs);
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
        case BpmnPackage.PARTICIPANT__INTERFACE_REF:
            return getInterfaceRef();
        case BpmnPackage.PARTICIPANT__END_POINT_REF:
            return getEndPointRef();
        case BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return getParticipantMultiplicity();
        case BpmnPackage.PARTICIPANT__NAME:
            return getName();
        case BpmnPackage.PARTICIPANT__PARTNER_ENTITY_REF:
            return getPartnerEntityRef();
        case BpmnPackage.PARTICIPANT__PARTNER_ROLE_REF:
            return getPartnerRoleRef();
        case BpmnPackage.PARTICIPANT__PROCESS_REF:
            return getProcessRef();
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
        case BpmnPackage.PARTICIPANT__INTERFACE_REF:
            getInterfaceRef().clear();
            getInterfaceRef().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.PARTICIPANT__END_POINT_REF:
            getEndPointRef().clear();
            getEndPointRef().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) newValue);
            return;
        case BpmnPackage.PARTICIPANT__NAME:
            setName((String) newValue);
            return;
        case BpmnPackage.PARTICIPANT__PARTNER_ENTITY_REF:
            setPartnerEntityRef((QName) newValue);
            return;
        case BpmnPackage.PARTICIPANT__PARTNER_ROLE_REF:
            setPartnerRoleRef((QName) newValue);
            return;
        case BpmnPackage.PARTICIPANT__PROCESS_REF:
            setProcessRef((QName) newValue);
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
        case BpmnPackage.PARTICIPANT__INTERFACE_REF:
            getInterfaceRef().clear();
            return;
        case BpmnPackage.PARTICIPANT__END_POINT_REF:
            getEndPointRef().clear();
            return;
        case BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) null);
            return;
        case BpmnPackage.PARTICIPANT__NAME:
            setName(NAME_EDEFAULT);
            return;
        case BpmnPackage.PARTICIPANT__PARTNER_ENTITY_REF:
            setPartnerEntityRef(PARTNER_ENTITY_REF_EDEFAULT);
            return;
        case BpmnPackage.PARTICIPANT__PARTNER_ROLE_REF:
            setPartnerRoleRef(PARTNER_ROLE_REF_EDEFAULT);
            return;
        case BpmnPackage.PARTICIPANT__PROCESS_REF:
            setProcessRef(PROCESS_REF_EDEFAULT);
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
        case BpmnPackage.PARTICIPANT__INTERFACE_REF:
            return interfaceRef != null && !interfaceRef.isEmpty();
        case BpmnPackage.PARTICIPANT__END_POINT_REF:
            return endPointRef != null && !endPointRef.isEmpty();
        case BpmnPackage.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return participantMultiplicity != null;
        case BpmnPackage.PARTICIPANT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case BpmnPackage.PARTICIPANT__PARTNER_ENTITY_REF:
            return PARTNER_ENTITY_REF_EDEFAULT == null ? partnerEntityRef != null
                    : !PARTNER_ENTITY_REF_EDEFAULT.equals(partnerEntityRef);
        case BpmnPackage.PARTICIPANT__PARTNER_ROLE_REF:
            return PARTNER_ROLE_REF_EDEFAULT == null ? partnerRoleRef != null
                    : !PARTNER_ROLE_REF_EDEFAULT.equals(partnerRoleRef);
        case BpmnPackage.PARTICIPANT__PROCESS_REF:
            return PROCESS_REF_EDEFAULT == null ? processRef != null
                    : !PROCESS_REF_EDEFAULT.equals(processRef);
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
        result.append(" (interfaceRef: "); //$NON-NLS-1$
        result.append(interfaceRef);
        result.append(", endPointRef: "); //$NON-NLS-1$
        result.append(endPointRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(", partnerEntityRef: "); //$NON-NLS-1$
        result.append(partnerEntityRef);
        result.append(", partnerRoleRef: "); //$NON-NLS-1$
        result.append(partnerRoleRef);
        result.append(", processRef: "); //$NON-NLS-1$
        result.append(processRef);
        result.append(')');
        return result.toString();
    }

} //ParticipantImpl
