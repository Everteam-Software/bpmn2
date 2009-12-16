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
 * $Id$
 */
package org.eclipse.mdt.bpmn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Conversation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversationItemProvider extends CallableElementItemProvider
        implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addMessageFlowRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Message Flow Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMessageFlowRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Conversation_messageFlowRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Conversation_messageFlowRef_feature", "_UI_Conversation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getConversation_MessageFlowRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(
            Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getConversation_ConversationNodeGroup());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getConversation_Participant());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getConversation_ArtifactGroup());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getConversation_MessageFlow());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getConversation_CorrelationKey());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Conversation.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Conversation.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Conversation) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Conversation_type") : //$NON-NLS-1$
                getString("_UI_Conversation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Conversation.class)) {
        case bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
        case bpmnPackage.CONVERSATION__PARTICIPANT:
        case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
        case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
        case bpmnPackage.CONVERSATION__CORRELATION_KEY:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(
            Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getConversation_ConversationNode(),
                        bpmnFactory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getConversation_ConversationNode(),
                        bpmnFactory.eINSTANCE.createCommunication())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getConversation_ConversationNode(),
                        bpmnFactory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallConversation(),
                        bpmnFactory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Communication(), bpmnFactory.eINSTANCE
                        .createCommunication())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ConversationNodeGroup(), FeatureMapUtil
                .createEntry(bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubConversation(),
                        bpmnFactory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_Participant(), bpmnFactory.eINSTANCE
                .createParticipant()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getConversation_Artifact(),
                bpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getConversation_Artifact(),
                bpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getConversation_Artifact(),
                bpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Association(),
                bpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Group(),
                bpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
                bpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_MessageFlow(), bpmnFactory.eINSTANCE
                .createMessageFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getConversation_CorrelationKey(), bpmnFactory.eINSTANCE
                .createCorrelationKey()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature,
            Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature
                && FeatureMapUtil
                        .isFeatureMap((EStructuralFeature) childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == diPackage.Literals.DOCUMENT_ROOT__CONNECTOR
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__VIEW
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__DIAGRAM
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == bpmnPackage.eINSTANCE
                        .getConversation_ConversationNode()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallConversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Communication()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubConversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getConversation_Artifact()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
