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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.Assignment;
import org.eclipse.mdt.bpmn.BaseElementWithMixedContent;
import org.eclipse.mdt.bpmn.BpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssignmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssignmentImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssignmentImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends BaseElementImpl implements Assignment {
    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected BaseElementWithMixedContent from;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected BaseElementWithMixedContent to;

    /**
     * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected static final String LANGUAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected String language = LANGUAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getAssignment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElementWithMixedContent getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFrom(BaseElementWithMixedContent newFrom,
            NotificationChain msgs) {
        BaseElementWithMixedContent oldFrom = from;
        from = newFrom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.ASSIGNMENT__FROM, oldFrom,
                    newFrom);
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
    public void setFrom(BaseElementWithMixedContent newFrom) {
        if (newFrom != from) {
            NotificationChain msgs = null;
            if (from != null)
                msgs = ((InternalEObject) from).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.ASSIGNMENT__FROM,
                        null, msgs);
            if (newFrom != null)
                msgs = ((InternalEObject) newFrom).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.ASSIGNMENT__FROM,
                        null, msgs);
            msgs = basicSetFrom(newFrom, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSIGNMENT__FROM, newFrom, newFrom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElementWithMixedContent getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTo(BaseElementWithMixedContent newTo,
            NotificationChain msgs) {
        BaseElementWithMixedContent oldTo = to;
        to = newTo;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.ASSIGNMENT__TO, oldTo, newTo);
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
    public void setTo(BaseElementWithMixedContent newTo) {
        if (newTo != to) {
            NotificationChain msgs = null;
            if (to != null)
                msgs = ((InternalEObject) to).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.ASSIGNMENT__TO,
                        null, msgs);
            if (newTo != null)
                msgs = ((InternalEObject) newTo).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.ASSIGNMENT__TO,
                        null, msgs);
            msgs = basicSetTo(newTo, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSIGNMENT__TO, newTo, newTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLanguage(String newLanguage) {
        String oldLanguage = language;
        language = newLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSIGNMENT__LANGUAGE, oldLanguage, language));
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
        case BpmnPackage.ASSIGNMENT__FROM:
            return basicSetFrom(null, msgs);
        case BpmnPackage.ASSIGNMENT__TO:
            return basicSetTo(null, msgs);
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
        case BpmnPackage.ASSIGNMENT__FROM:
            return getFrom();
        case BpmnPackage.ASSIGNMENT__TO:
            return getTo();
        case BpmnPackage.ASSIGNMENT__LANGUAGE:
            return getLanguage();
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
        case BpmnPackage.ASSIGNMENT__FROM:
            setFrom((BaseElementWithMixedContent) newValue);
            return;
        case BpmnPackage.ASSIGNMENT__TO:
            setTo((BaseElementWithMixedContent) newValue);
            return;
        case BpmnPackage.ASSIGNMENT__LANGUAGE:
            setLanguage((String) newValue);
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
        case BpmnPackage.ASSIGNMENT__FROM:
            setFrom((BaseElementWithMixedContent) null);
            return;
        case BpmnPackage.ASSIGNMENT__TO:
            setTo((BaseElementWithMixedContent) null);
            return;
        case BpmnPackage.ASSIGNMENT__LANGUAGE:
            setLanguage(LANGUAGE_EDEFAULT);
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
        case BpmnPackage.ASSIGNMENT__FROM:
            return from != null;
        case BpmnPackage.ASSIGNMENT__TO:
            return to != null;
        case BpmnPackage.ASSIGNMENT__LANGUAGE:
            return LANGUAGE_EDEFAULT == null ? language != null
                    : !LANGUAGE_EDEFAULT.equals(language);
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
        result.append(" (language: "); //$NON-NLS-1$
        result.append(language);
        result.append(')');
        return result.toString();
    }

} //AssignmentImpl
