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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.FormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.FormalExpressionImpl#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.FormalExpressionImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalExpressionImpl extends ExpressionImpl implements
        FormalExpression {
    /**
     * The default value of the '{@link #getEvaluatesToTypeRef() <em>Evaluates To Type Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvaluatesToTypeRef()
     * @generated
     * @ordered
     */
    protected static final QName EVALUATES_TO_TYPE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEvaluatesToTypeRef() <em>Evaluates To Type Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvaluatesToTypeRef()
     * @generated
     * @ordered
     */
    protected QName evaluatesToTypeRef = EVALUATES_TO_TYPE_REF_EDEFAULT;

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
    protected FormalExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getFormalExpression();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getEvaluatesToTypeRef() {
        return evaluatesToTypeRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEvaluatesToTypeRef(QName newEvaluatesToTypeRef) {
        QName oldEvaluatesToTypeRef = evaluatesToTypeRef;
        evaluatesToTypeRef = newEvaluatesToTypeRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
                    oldEvaluatesToTypeRef, evaluatesToTypeRef));
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
                    BpmnPackage.FORMAL_EXPRESSION__LANGUAGE, oldLanguage,
                    language));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
            return getEvaluatesToTypeRef();
        case BpmnPackage.FORMAL_EXPRESSION__LANGUAGE:
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
        case BpmnPackage.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
            setEvaluatesToTypeRef((QName) newValue);
            return;
        case BpmnPackage.FORMAL_EXPRESSION__LANGUAGE:
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
        case BpmnPackage.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
            setEvaluatesToTypeRef(EVALUATES_TO_TYPE_REF_EDEFAULT);
            return;
        case BpmnPackage.FORMAL_EXPRESSION__LANGUAGE:
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
        case BpmnPackage.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
            return EVALUATES_TO_TYPE_REF_EDEFAULT == null ? evaluatesToTypeRef != null
                    : !EVALUATES_TO_TYPE_REF_EDEFAULT
                            .equals(evaluatesToTypeRef);
        case BpmnPackage.FORMAL_EXPRESSION__LANGUAGE:
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
        result.append(" (evaluatesToTypeRef: "); //$NON-NLS-1$
        result.append(evaluatesToTypeRef);
        result.append(", language: "); //$NON-NLS-1$
        result.append(language);
        result.append(')');
        return result.toString();
    }

} //FormalExpressionImpl
