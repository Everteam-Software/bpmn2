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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.ConversationAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationAssociationImpl#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationAssociationImpl#getConversationRef <em>Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationAssociationImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationAssociationImpl extends BaseElementImpl implements
        ConversationAssociation {
    /**
     * The cached value of the '{@link #getMessageFlowRef() <em>Message Flow Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowRef()
     * @generated
     * @ordered
     */
    protected EList<QName> messageFlowRef;

    /**
     * The default value of the '{@link #getConversationRef() <em>Conversation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationRef()
     * @generated
     * @ordered
     */
    protected static final QName CONVERSATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConversationRef() <em>Conversation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationRef()
     * @generated
     * @ordered
     */
    protected QName conversationRef = CONVERSATION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeyRef()
     * @generated
     * @ordered
     */
    protected static final QName CORRELATION_KEY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeyRef()
     * @generated
     * @ordered
     */
    protected QName correlationKeyRef = CORRELATION_KEY_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationAssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getConversationAssociation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getMessageFlowRef() {
        if (messageFlowRef == null) {
            messageFlowRef = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF);
        }
        return messageFlowRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getConversationRef() {
        return conversationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversationRef(QName newConversationRef) {
        QName oldConversationRef = conversationRef;
        conversationRef = newConversationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CONVERSATION_ASSOCIATION__CONVERSATION_REF,
                    oldConversationRef, conversationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getCorrelationKeyRef() {
        return correlationKeyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationKeyRef(QName newCorrelationKeyRef) {
        QName oldCorrelationKeyRef = correlationKeyRef;
        correlationKeyRef = newCorrelationKeyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF,
                    oldCorrelationKeyRef, correlationKeyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF:
            return getMessageFlowRef();
        case BpmnPackage.CONVERSATION_ASSOCIATION__CONVERSATION_REF:
            return getConversationRef();
        case BpmnPackage.CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF:
            return getCorrelationKeyRef();
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
        case BpmnPackage.CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
            getMessageFlowRef().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.CONVERSATION_ASSOCIATION__CONVERSATION_REF:
            setConversationRef((QName) newValue);
            return;
        case BpmnPackage.CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF:
            setCorrelationKeyRef((QName) newValue);
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
        case BpmnPackage.CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
            return;
        case BpmnPackage.CONVERSATION_ASSOCIATION__CONVERSATION_REF:
            setConversationRef(CONVERSATION_REF_EDEFAULT);
            return;
        case BpmnPackage.CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF:
            setCorrelationKeyRef(CORRELATION_KEY_REF_EDEFAULT);
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
        case BpmnPackage.CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF:
            return messageFlowRef != null && !messageFlowRef.isEmpty();
        case BpmnPackage.CONVERSATION_ASSOCIATION__CONVERSATION_REF:
            return CONVERSATION_REF_EDEFAULT == null ? conversationRef != null
                    : !CONVERSATION_REF_EDEFAULT.equals(conversationRef);
        case BpmnPackage.CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF:
            return CORRELATION_KEY_REF_EDEFAULT == null ? correlationKeyRef != null
                    : !CORRELATION_KEY_REF_EDEFAULT.equals(correlationKeyRef);
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
        result.append(" (messageFlowRef: "); //$NON-NLS-1$
        result.append(messageFlowRef);
        result.append(", conversationRef: "); //$NON-NLS-1$
        result.append(conversationRef);
        result.append(", correlationKeyRef: "); //$NON-NLS-1$
        result.append(correlationKeyRef);
        result.append(')');
        return result.toString();
    }

} //ConversationAssociationImpl
