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
package org.eclipse.mdt.bpmn.di.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.di.View;
import org.eclipse.mdt.bpmn.di.diFactory;
import org.eclipse.mdt.bpmn.di.diPackage;

import org.eclipse.mdt.bpmn.provider.bpmnEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.di.View} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ViewItemProvider(AdapterFactory adapterFactory) {
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

            addContextPropertyDescriptor(object);
            addDefinitionPropertyDescriptor(object);
            addIdPropertyDescriptor(object);
            addSourceConnectorPropertyDescriptor(object);
            addTargetConnectorPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Context feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_View_context_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_View_context_feature", "_UI_View_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        diPackage.Literals.VIEW__CONTEXT, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Definition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_View_definition_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_View_definition_feature", "_UI_View_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        diPackage.Literals.VIEW__DEFINITION, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_View_id_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_View_id_feature", "_UI_View_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        diPackage.Literals.VIEW__ID, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Source Connector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceConnectorPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_View_sourceConnector_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_View_sourceConnector_feature", "_UI_View_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        diPackage.Literals.VIEW__SOURCE_CONNECTOR, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Target Connector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetConnectorPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_View_targetConnector_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_View_targetConnector_feature", "_UI_View_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        diPackage.Literals.VIEW__TARGET_CONNECTOR, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null));
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
            childrenFeatures.add(diPackage.Literals.VIEW__STYLE);
            childrenFeatures.add(diPackage.Literals.VIEW__CHILD);
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
        String label = ((View) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_View_type") : //$NON-NLS-1$
                getString("_UI_View_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(View.class)) {
        case diPackage.VIEW__CONTEXT:
        case diPackage.VIEW__DEFINITION:
        case diPackage.VIEW__ID:
        case diPackage.VIEW__SOURCE_CONNECTOR:
        case diPackage.VIEW__TARGET_CONNECTOR:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case diPackage.VIEW__STYLE:
        case diPackage.VIEW__CHILD:
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

        newChildDescriptors.add(createChildParameter(
                diPackage.Literals.VIEW__STYLE, diFactory.eINSTANCE
                        .createStyle()));

        newChildDescriptors.add(createChildParameter(
                diPackage.Literals.VIEW__CHILD, diFactory.eINSTANCE
                        .createNode()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return bpmnEditPlugin.INSTANCE;
    }

}