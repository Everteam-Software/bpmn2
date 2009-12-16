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

import org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiInstanceLoopCharacteristicsItemProvider extends
        LoopCharacteristicsItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceLoopCharacteristicsItemProvider(
            AdapterFactory adapterFactory) {
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

            addBehaviorPropertyDescriptor(object);
            addIsSequentialPropertyDescriptor(object);
            addNoneBehaviorEventRefPropertyDescriptor(object);
            addOneBehaviorEventRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Behavior feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBehaviorPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_MultiInstanceLoopCharacteristics_behavior_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_behavior_feature", "_UI_MultiInstanceLoopCharacteristics_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getMultiInstanceLoopCharacteristics_Behavior(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Sequential feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSequentialPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_MultiInstanceLoopCharacteristics_isSequential_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_isSequential_feature", "_UI_MultiInstanceLoopCharacteristics_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getMultiInstanceLoopCharacteristics_IsSequential(),
                        true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the None Behavior Event Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoneBehaviorEventRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the One Behavior Event Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOneBehaviorEventRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature", "_UI_MultiInstanceLoopCharacteristics_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getMultiInstanceLoopCharacteristics_OneBehaviorEventRef(),
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
                    .getMultiInstanceLoopCharacteristics_LoopCardinality());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getMultiInstanceLoopCharacteristics_LoopDataInput());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getMultiInstanceLoopCharacteristics_LoopDataOutput());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getMultiInstanceLoopCharacteristics_InputDataItem());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getMultiInstanceLoopCharacteristics_OutputDataItem());
            childrenFeatures
                    .add(bpmnPackage.eINSTANCE
                            .getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getMultiInstanceLoopCharacteristics_CompletionCondition());
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
     * This returns MultiInstanceLoopCharacteristics.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/MultiInstanceLoopCharacteristics.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((MultiInstanceLoopCharacteristics) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_MultiInstanceLoopCharacteristics_type") : //$NON-NLS-1$
                getString("_UI_MultiInstanceLoopCharacteristics_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification
                .getFeatureID(MultiInstanceLoopCharacteristics.class)) {
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
        case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
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
                .getMultiInstanceLoopCharacteristics_LoopCardinality(),
                bpmnFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_LoopCardinality(),
                bpmnFactory.eINSTANCE.createFormalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_LoopDataInput(),
                bpmnFactory.eINSTANCE.createDataInput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_LoopDataOutput(),
                bpmnFactory.eINSTANCE.createDataOutput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_InputDataItem(),
                bpmnFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_OutputDataItem(),
                bpmnFactory.eINSTANCE.createProperty()));

        newChildDescriptors
                .add(createChildParameter(
                        bpmnPackage.eINSTANCE
                                .getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition(),
                        bpmnFactory.eINSTANCE.createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_CompletionCondition(),
                bpmnFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getMultiInstanceLoopCharacteristics_CompletionCondition(),
                bpmnFactory.eINSTANCE.createFormalExpression()));
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
                        .getMultiInstanceLoopCharacteristics_LoopCardinality()
                || childFeature == bpmnPackage.eINSTANCE
                        .getMultiInstanceLoopCharacteristics_CompletionCondition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getMultiInstanceLoopCharacteristics_InputDataItem()
                || childFeature == bpmnPackage.eINSTANCE
                        .getMultiInstanceLoopCharacteristics_OutputDataItem();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
