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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Choreography;
import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.ConversationAssociation;
import org.eclipse.mdt.bpmn.FlowElement;
import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.MessageFlowAssociation;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl#isIsClosed <em>Is Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographyImpl extends CallableElementImpl implements
        Choreography {
    /**
     * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroup;

    /**
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

    /**
     * The cached value of the '{@link #getMessageFlow() <em>Message Flow</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlow()
     * @generated
     * @ordered
     */
    protected EList<MessageFlow> messageFlow;

    /**
     * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipant()
     * @generated
     * @ordered
     */
    protected EList<Participant> participant;

    /**
     * The cached value of the '{@link #getConversation() <em>Conversation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversation()
     * @generated
     * @ordered
     */
    protected EList<Conversation> conversation;

    /**
     * The cached value of the '{@link #getConversationAssociation() <em>Conversation Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationAssociation()
     * @generated
     * @ordered
     */
    protected EList<ConversationAssociation> conversationAssociation;

    /**
     * The cached value of the '{@link #getMessageFlowAssociation() <em>Message Flow Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowAssociation()
     * @generated
     * @ordered
     */
    protected EList<MessageFlowAssociation> messageFlowAssociation;

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
     * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CLOSED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected boolean isClosed = IS_CLOSED_EDEFAULT;

    /**
     * This is true if the Is Closed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isClosedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChoreographyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getChoreography();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this,
                    BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(
                BpmnPackage.eINSTANCE.getChoreography_FlowElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this,
                    BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifact() {
        return getArtifactGroup().list(
                BpmnPackage.eINSTANCE.getChoreography_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlow> getMessageFlow() {
        if (messageFlow == null) {
            messageFlow = new EObjectContainmentEList<MessageFlow>(
                    MessageFlow.class, this,
                    BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(
                    Participant.class, this,
                    BpmnPackage.CHOREOGRAPHY__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Conversation> getConversation() {
        if (conversation == null) {
            conversation = new EObjectContainmentEList<Conversation>(
                    Conversation.class, this,
                    BpmnPackage.CHOREOGRAPHY__CONVERSATION);
        }
        return conversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationAssociation> getConversationAssociation() {
        if (conversationAssociation == null) {
            conversationAssociation = new EObjectContainmentEList<ConversationAssociation>(
                    ConversationAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION);
        }
        return conversationAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlowAssociation> getMessageFlowAssociation() {
        if (messageFlowAssociation == null) {
            messageFlowAssociation = new EObjectContainmentEList<MessageFlowAssociation>(
                    MessageFlowAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION);
        }
        return messageFlowAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParticipantAssociation> getParticipantAssociation() {
        if (participantAssociation == null) {
            participantAssociation = new EObjectContainmentEList<ParticipantAssociation>(
                    ParticipantAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION);
        }
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsClosed(boolean newIsClosed) {
        boolean oldIsClosed = isClosed;
        isClosed = newIsClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CHOREOGRAPHY__IS_CLOSED, oldIsClosed, isClosed,
                    !oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsClosed() {
        boolean oldIsClosed = isClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosed = IS_CLOSED_EDEFAULT;
        isClosedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.CHOREOGRAPHY__IS_CLOSED, oldIsClosed,
                    IS_CLOSED_EDEFAULT, oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsClosed() {
        return isClosedESet;
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT:
            return ((InternalEList<?>) getFlowElement()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW:
            return ((InternalEList<?>) getMessageFlow()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT:
            return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION:
            return ((InternalEList<?>) getConversation()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION:
            return ((InternalEList<?>) getConversationAssociation())
                    .basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION:
            return ((InternalEList<?>) getMessageFlowAssociation())
                    .basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION:
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT:
            return getFlowElement();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT:
            return getArtifact();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW:
            return getMessageFlow();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT:
            return getParticipant();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION:
            return getConversation();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION:
            return getConversationAssociation();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION:
            return getMessageFlowAssociation();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION:
            return getParticipantAssociation();
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            return isIsClosed();
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT:
            getFlowElement().clear();
            getFlowElement().addAll(
                    (Collection<? extends FlowElement>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW:
            getMessageFlow().clear();
            getMessageFlow().addAll(
                    (Collection<? extends MessageFlow>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT:
            getParticipant().clear();
            getParticipant().addAll(
                    (Collection<? extends Participant>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION:
            getConversation().clear();
            getConversation().addAll(
                    (Collection<? extends Conversation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION:
            getConversationAssociation().clear();
            getConversationAssociation().addAll(
                    (Collection<? extends ConversationAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION:
            getMessageFlowAssociation().clear();
            getMessageFlowAssociation().addAll(
                    (Collection<? extends MessageFlowAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            getParticipantAssociation().addAll(
                    (Collection<? extends ParticipantAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            setIsClosed((Boolean) newValue);
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT:
            getFlowElement().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT:
            getArtifact().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW:
            getMessageFlow().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT:
            getParticipant().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION:
            getConversation().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION:
            getConversationAssociation().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION:
            getMessageFlowAssociation().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            unsetIsClosed();
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT:
            return !getFlowElement().isEmpty();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT:
            return !getArtifact().isEmpty();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW:
            return messageFlow != null && !messageFlow.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT:
            return participant != null && !participant.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION:
            return conversation != null && !conversation.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATION:
            return conversationAssociation != null
                    && !conversationAssociation.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION:
            return messageFlowAssociation != null
                    && !messageFlowAssociation.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATION:
            return participantAssociation != null
                    && !participantAssociation.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            return isSetIsClosed();
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
        result.append(" (flowElementGroup: "); //$NON-NLS-1$
        result.append(flowElementGroup);
        result.append(", artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", isClosed: "); //$NON-NLS-1$
        if (isClosedESet)
            result.append(isClosed);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ChoreographyImpl
