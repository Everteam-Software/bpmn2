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

import org.eclipse.mdt.bpmn.ActivityResource;
import org.eclipse.mdt.bpmn.ResourceAssignmentExpression;
import org.eclipse.mdt.bpmn.ResourceParameterBinding;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityResourceImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityResourceImpl#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityResourceImpl#getResourceRef <em>Resource Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityResourceImpl extends BaseElementImpl implements ActivityResource {
    /**
     * The cached value of the '{@link #getResourceAssignmentExpression() <em>Resource Assignment Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceAssignmentExpression()
     * @generated
     * @ordered
     */
    protected ResourceAssignmentExpression resourceAssignmentExpression;

    /**
     * The cached value of the '{@link #getResourceParameterBinding() <em>Resource Parameter Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceParameterBinding()
     * @generated
     * @ordered
     */
    protected EList<ResourceParameterBinding> resourceParameterBinding;

    /**
     * The default value of the '{@link #getResourceRef() <em>Resource Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceRef()
     * @generated
     * @ordered
     */
    protected static final QName RESOURCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceRef()
     * @generated
     * @ordered
     */
    protected QName resourceRef = RESOURCE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getActivityResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAssignmentExpression getResourceAssignmentExpression() {
        return resourceAssignmentExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
        ResourceAssignmentExpression oldResourceAssignmentExpression = resourceAssignmentExpression;
        resourceAssignmentExpression = newResourceAssignmentExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION, oldResourceAssignmentExpression, newResourceAssignmentExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression) {
        if (newResourceAssignmentExpression != resourceAssignmentExpression) {
            NotificationChain msgs = null;
            if (resourceAssignmentExpression != null)
                msgs = ((InternalEObject)resourceAssignmentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
            if (newResourceAssignmentExpression != null)
                msgs = ((InternalEObject)newResourceAssignmentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
            msgs = basicSetResourceAssignmentExpression(newResourceAssignmentExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION, newResourceAssignmentExpression, newResourceAssignmentExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ResourceParameterBinding> getResourceParameterBinding() {
        if (resourceParameterBinding == null) {
            resourceParameterBinding = new EObjectContainmentEList<ResourceParameterBinding>(ResourceParameterBinding.class, this, bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING);
        }
        return resourceParameterBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getResourceRef() {
        return resourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceRef(QName newResourceRef) {
        QName oldResourceRef = resourceRef;
        resourceRef = newResourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_REF, oldResourceRef, resourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION:
                return basicSetResourceAssignmentExpression(null, msgs);
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING:
                return ((InternalEList<?>)getResourceParameterBinding()).basicRemove(otherEnd, msgs);
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
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION:
                return getResourceAssignmentExpression();
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING:
                return getResourceParameterBinding();
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_REF:
                return getResourceRef();
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
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION:
                setResourceAssignmentExpression((ResourceAssignmentExpression)newValue);
                return;
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING:
                getResourceParameterBinding().clear();
                getResourceParameterBinding().addAll((Collection<? extends ResourceParameterBinding>)newValue);
                return;
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_REF:
                setResourceRef((QName)newValue);
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
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION:
                setResourceAssignmentExpression((ResourceAssignmentExpression)null);
                return;
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING:
                getResourceParameterBinding().clear();
                return;
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_REF:
                setResourceRef(RESOURCE_REF_EDEFAULT);
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
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION:
                return resourceAssignmentExpression != null;
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING:
                return resourceParameterBinding != null && !resourceParameterBinding.isEmpty();
            case bpmnPackage.ACTIVITY_RESOURCE__RESOURCE_REF:
                return RESOURCE_REF_EDEFAULT == null ? resourceRef != null : !RESOURCE_REF_EDEFAULT.equals(resourceRef);
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (resourceRef: "); //$NON-NLS-1$
        result.append(resourceRef);
        result.append(')');
        return result.toString();
    }

} //ActivityResourceImpl
