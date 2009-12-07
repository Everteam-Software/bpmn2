/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2.provider;

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

import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ThrowEvent;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.ThrowEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrowEventItemProvider extends EventItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThrowEventItemProvider(AdapterFactory adapterFactory) {
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

            addEventDefinitionRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Event Definition Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventDefinitionRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_ThrowEvent_eventDefinitionRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ThrowEvent_eventDefinitionRef_feature",
                        "_UI_ThrowEvent_type"), Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinitionRef(), true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getThrowEvent_InputSet());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getThrowEvent_DataInput());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getThrowEvent_DataInputAssociation());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getThrowEvent_EventDefinitionGroup());
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ThrowEvent) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_ThrowEvent_type")
                : getString("_UI_ThrowEvent_type") + " " + label;
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

        switch (notification.getFeatureID(ThrowEvent.class)) {
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
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

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_InputSet(), Bpmn2Factory.eINSTANCE
                .createInputSet()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_DataInput(), Bpmn2Factory.eINSTANCE
                .createDataInput()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_DataInputAssociation(), Bpmn2Factory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getThrowEvent_EventDefinition(),
                                Bpmn2Factory.eINSTANCE
                                        .createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(),
                FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getThrowEvent_EventDefinition(),
                                Bpmn2Factory.eINSTANCE
                                        .createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinition(),
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                        Bpmn2Factory.eINSTANCE
                                .createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_MessageEventDefinition(),
                                Bpmn2Factory.eINSTANCE
                                        .createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(),
                FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_TerminateEventDefinition(),
                                Bpmn2Factory.eINSTANCE
                                        .createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));
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

        boolean qualify = childFeature == Bpmn2Package.eINSTANCE
                .getThrowEvent_EventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition();

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] {
                    getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
