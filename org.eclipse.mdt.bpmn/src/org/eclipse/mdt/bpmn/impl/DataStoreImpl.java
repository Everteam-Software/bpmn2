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

import java.math.BigInteger;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.DataState;
import org.eclipse.mdt.bpmn.DataStore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl#isIsUnlimited <em>Is Unlimited</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataStoreImpl extends RootElementImpl implements DataStore {
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
     * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected static final BigInteger CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected BigInteger capacity = CAPACITY_EDEFAULT;

    /**
     * The default value of the '{@link #isIsUnlimited() <em>Is Unlimited</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnlimited()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNLIMITED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsUnlimited() <em>Is Unlimited</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnlimited()
     * @generated
     * @ordered
     */
    protected boolean isUnlimited = IS_UNLIMITED_EDEFAULT;

    /**
     * This is true if the Is Unlimited attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isUnlimitedESet;

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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataStoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getDataStore();
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
                    Notification.SET, BpmnPackage.DATA_STORE__DATA_STATE,
                    oldDataState, newDataState);
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
                                - BpmnPackage.DATA_STORE__DATA_STATE, null,
                        msgs);
            if (newDataState != null)
                msgs = ((InternalEObject) newDataState).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.DATA_STORE__DATA_STATE, null,
                        msgs);
            msgs = basicSetDataState(newDataState, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE__DATA_STATE, newDataState,
                    newDataState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapacity(BigInteger newCapacity) {
        BigInteger oldCapacity = capacity;
        capacity = newCapacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE__CAPACITY, oldCapacity, capacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnlimited() {
        return isUnlimited;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnlimited(boolean newIsUnlimited) {
        boolean oldIsUnlimited = isUnlimited;
        isUnlimited = newIsUnlimited;
        boolean oldIsUnlimitedESet = isUnlimitedESet;
        isUnlimitedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE__IS_UNLIMITED, oldIsUnlimited,
                    isUnlimited, !oldIsUnlimitedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsUnlimited() {
        boolean oldIsUnlimited = isUnlimited;
        boolean oldIsUnlimitedESet = isUnlimitedESet;
        isUnlimited = IS_UNLIMITED_EDEFAULT;
        isUnlimitedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.DATA_STORE__IS_UNLIMITED, oldIsUnlimited,
                    IS_UNLIMITED_EDEFAULT, oldIsUnlimitedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsUnlimited() {
        return isUnlimitedESet;
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
                    BpmnPackage.DATA_STORE__ITEM_SUBJECT_REF,
                    oldItemSubjectRef, itemSubjectRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.DATA_STORE__NAME, oldName, name));
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
        case BpmnPackage.DATA_STORE__DATA_STATE:
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
        case BpmnPackage.DATA_STORE__DATA_STATE:
            return getDataState();
        case BpmnPackage.DATA_STORE__CAPACITY:
            return getCapacity();
        case BpmnPackage.DATA_STORE__IS_UNLIMITED:
            return isIsUnlimited();
        case BpmnPackage.DATA_STORE__ITEM_SUBJECT_REF:
            return getItemSubjectRef();
        case BpmnPackage.DATA_STORE__NAME:
            return getName();
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
        case BpmnPackage.DATA_STORE__DATA_STATE:
            setDataState((DataState) newValue);
            return;
        case BpmnPackage.DATA_STORE__CAPACITY:
            setCapacity((BigInteger) newValue);
            return;
        case BpmnPackage.DATA_STORE__IS_UNLIMITED:
            setIsUnlimited((Boolean) newValue);
            return;
        case BpmnPackage.DATA_STORE__ITEM_SUBJECT_REF:
            setItemSubjectRef((QName) newValue);
            return;
        case BpmnPackage.DATA_STORE__NAME:
            setName((String) newValue);
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
        case BpmnPackage.DATA_STORE__DATA_STATE:
            setDataState((DataState) null);
            return;
        case BpmnPackage.DATA_STORE__CAPACITY:
            setCapacity(CAPACITY_EDEFAULT);
            return;
        case BpmnPackage.DATA_STORE__IS_UNLIMITED:
            unsetIsUnlimited();
            return;
        case BpmnPackage.DATA_STORE__ITEM_SUBJECT_REF:
            setItemSubjectRef(ITEM_SUBJECT_REF_EDEFAULT);
            return;
        case BpmnPackage.DATA_STORE__NAME:
            setName(NAME_EDEFAULT);
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
        case BpmnPackage.DATA_STORE__DATA_STATE:
            return dataState != null;
        case BpmnPackage.DATA_STORE__CAPACITY:
            return CAPACITY_EDEFAULT == null ? capacity != null
                    : !CAPACITY_EDEFAULT.equals(capacity);
        case BpmnPackage.DATA_STORE__IS_UNLIMITED:
            return isSetIsUnlimited();
        case BpmnPackage.DATA_STORE__ITEM_SUBJECT_REF:
            return ITEM_SUBJECT_REF_EDEFAULT == null ? itemSubjectRef != null
                    : !ITEM_SUBJECT_REF_EDEFAULT.equals(itemSubjectRef);
        case BpmnPackage.DATA_STORE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
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
        result.append(" (capacity: "); //$NON-NLS-1$
        result.append(capacity);
        result.append(", isUnlimited: "); //$NON-NLS-1$
        if (isUnlimitedESet)
            result.append(isUnlimited);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", itemSubjectRef: "); //$NON-NLS-1$
        result.append(itemSubjectRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DataStoreImpl
