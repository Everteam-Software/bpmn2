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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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

import org.eclipse.mdt.bpmn2.BaseElementWithMixedContent;
import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseElementWithMixedContentItemProvider extends
        ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
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
    public BaseElementWithMixedContentItemProvider(AdapterFactory adapterFactory) {
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

            addIdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_BaseElementWithMixedContent_id_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_BaseElementWithMixedContent_id_feature",
                        "_UI_BaseElementWithMixedContent_type"),
                Bpmn2Package.eINSTANCE.getBaseElementWithMixedContent_Id(),
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getBaseElementWithMixedContent_Mixed());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getBaseElementWithMixedContent_AnyAttribute());
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
        String label = ((BaseElementWithMixedContent) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_BaseElementWithMixedContent_type")
                : getString("_UI_BaseElementWithMixedContent_type") + " "
                        + label;
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

        switch (notification.getFeatureID(BaseElementWithMixedContent.class)) {
        case Bpmn2Package.BASE_ELEMENT_WITH_MIXED_CONTENT__ID:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case Bpmn2Package.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
        case Bpmn2Package.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.eINSTANCE
                                .getBaseElementWithMixedContent_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
                                        "")));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getBaseElementWithMixedContent_Mixed(), FeatureMapUtil
                .createEntry(
                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
                        "")));

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.eINSTANCE
                                .getBaseElementWithMixedContent_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
                                        XMLTypeFactory.eINSTANCE
                                                .createProcessingInstruction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getBaseElementWithMixedContent_Mixed(), FeatureMapUtil
                .createEntry(
                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
                        "")));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getBaseElementWithMixedContent_Mixed(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getBaseElementWithMixedContent_Documentation(),
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getBaseElementWithMixedContent_Mixed(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getBaseElementWithMixedContent_Category(),
                        Bpmn2Factory.eINSTANCE.createCategory())));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return BPMN20EditPlugin.INSTANCE;
    }

}
