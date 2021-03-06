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
import org.eclipse.mdt.bpmn.DataOutputAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Output Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataOutputAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataOutputAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataOutputAssociationImpl extends DataAssociationImpl implements
        DataOutputAssociation {
    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected EList<QName> sourceRef;

    /**
     * The default value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected static final QName TARGET_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected QName targetRef = TARGET_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataOutputAssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getDataOutputAssociation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getSourceRef() {
        if (sourceRef == null) {
            sourceRef = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.DATA_OUTPUT_ASSOCIATION__SOURCE_REF);
        }
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRef(QName newTargetRef) {
        QName oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_OUTPUT_ASSOCIATION__TARGET_REF,
                    oldTargetRef, targetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
            return getSourceRef();
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
            return getTargetRef();
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
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
            getSourceRef().clear();
            getSourceRef().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
            setTargetRef((QName) newValue);
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
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
            getSourceRef().clear();
            return;
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
            setTargetRef(TARGET_REF_EDEFAULT);
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
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__SOURCE_REF:
            return sourceRef != null && !sourceRef.isEmpty();
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION__TARGET_REF:
            return TARGET_REF_EDEFAULT == null ? targetRef != null
                    : !TARGET_REF_EDEFAULT.equals(targetRef);
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
        result.append(" (sourceRef: "); //$NON-NLS-1$
        result.append(sourceRef);
        result.append(", targetRef: "); //$NON-NLS-1$
        result.append(targetRef);
        result.append(')');
        return result.toString();
    }

} //DataOutputAssociationImpl
