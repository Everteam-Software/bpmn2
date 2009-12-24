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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.DataState;
import org.eclipse.mdt.bpmn.DataStoreReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreReferenceImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreReferenceImpl#getDataStoreRef <em>Data Store Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreReferenceImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataStoreReferenceImpl extends FlowElementImpl implements
        DataStoreReference {
    /**
     * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataState()
     * @generated
     * @ordered
     */
    protected DataState dataState;

    /**
     * The default value of the '{@link #getDataStoreRef() <em>Data Store Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataStoreRef()
     * @generated
     * @ordered
     */
    protected static final QName DATA_STORE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataStoreRef() <em>Data Store Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataStoreRef()
     * @generated
     * @ordered
     */
    protected QName dataStoreRef = DATA_STORE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemSubjectRef()
     * @generated
     * @ordered
     */
    protected static final QName ITEM_SUBJECT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemSubjectRef()
     * @generated
     * @ordered
     */
    protected QName itemSubjectRef = ITEM_SUBJECT_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataStoreReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getDataStoreReference();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataState getDataState() {
        return dataState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataState(DataState newDataState,
            NotificationChain msgs) {
        DataState oldDataState = dataState;
        dataState = newDataState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE, oldDataState,
                    newDataState);
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
    public void setDataState(DataState newDataState) {
        if (newDataState != dataState) {
            NotificationChain msgs = null;
            if (dataState != null)
                msgs = ((InternalEObject) dataState).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE,
                        null, msgs);
            if (newDataState != null)
                msgs = ((InternalEObject) newDataState).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE,
                        null, msgs);
            msgs = basicSetDataState(newDataState, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE, newDataState,
                    newDataState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDataStoreRef() {
        return dataStoreRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataStoreRef(QName newDataStoreRef) {
        QName oldDataStoreRef = dataStoreRef;
        dataStoreRef = newDataStoreRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE_REFERENCE__DATA_STORE_REF,
                    oldDataStoreRef, dataStoreRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getItemSubjectRef() {
        return itemSubjectRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemSubjectRef(QName newItemSubjectRef) {
        QName oldItemSubjectRef = itemSubjectRef;
        itemSubjectRef = newItemSubjectRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF,
                    oldItemSubjectRef, itemSubjectRef));
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
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE:
            return basicSetDataState(null, msgs);
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
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE:
            return getDataState();
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STORE_REF:
            return getDataStoreRef();
        case BpmnPackage.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
            return getItemSubjectRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE:
            setDataState((DataState) newValue);
            return;
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STORE_REF:
            setDataStoreRef((QName) newValue);
            return;
        case BpmnPackage.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
            setItemSubjectRef((QName) newValue);
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
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE:
            setDataState((DataState) null);
            return;
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STORE_REF:
            setDataStoreRef(DATA_STORE_REF_EDEFAULT);
            return;
        case BpmnPackage.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
            setItemSubjectRef(ITEM_SUBJECT_REF_EDEFAULT);
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
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STATE:
            return dataState != null;
        case BpmnPackage.DATA_STORE_REFERENCE__DATA_STORE_REF:
            return DATA_STORE_REF_EDEFAULT == null ? dataStoreRef != null
                    : !DATA_STORE_REF_EDEFAULT.equals(dataStoreRef);
        case BpmnPackage.DATA_STORE_REFERENCE__ITEM_SUBJECT_REF:
            return ITEM_SUBJECT_REF_EDEFAULT == null ? itemSubjectRef != null
                    : !ITEM_SUBJECT_REF_EDEFAULT.equals(itemSubjectRef);
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
        result.append(" (dataStoreRef: "); //$NON-NLS-1$
        result.append(dataStoreRef);
        result.append(", itemSubjectRef: "); //$NON-NLS-1$
        result.append(itemSubjectRef);
        result.append(')');
        return result.toString();
    }

} //DataStoreReferenceImpl
