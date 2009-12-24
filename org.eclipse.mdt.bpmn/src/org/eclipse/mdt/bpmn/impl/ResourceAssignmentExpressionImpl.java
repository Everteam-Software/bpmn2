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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Expression;
import org.eclipse.mdt.bpmn.ResourceAssignmentExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ResourceAssignmentExpressionImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ResourceAssignmentExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceAssignmentExpressionImpl extends BaseElementImpl implements
        ResourceAssignmentExpression {
    /**
     * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap expressionGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceAssignmentExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getResourceAssignmentExpression();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getExpressionGroup() {
        if (expressionGroup == null) {
            expressionGroup = new BasicFeatureMap(
                    this,
                    BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP);
        }
        return expressionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        return (Expression) getExpressionGroup().get(
                BpmnPackage.eINSTANCE
                        .getResourceAssignmentExpression_Expression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression,
            NotificationChain msgs) {
        return ((FeatureMap.Internal) getExpressionGroup()).basicAdd(
                BpmnPackage.eINSTANCE
                        .getResourceAssignmentExpression_Expression(),
                newExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        ((FeatureMap.Internal) getExpressionGroup()).set(BpmnPackage.eINSTANCE
                .getResourceAssignmentExpression_Expression(), newExpression);
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
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP:
            return ((InternalEList<?>) getExpressionGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
            return basicSetExpression(null, msgs);
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
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP:
            if (coreType)
                return getExpressionGroup();
            return ((FeatureMap.Internal) getExpressionGroup()).getWrapper();
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
            return getExpression();
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
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP:
            ((FeatureMap.Internal) getExpressionGroup()).set(newValue);
            return;
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
            setExpression((Expression) newValue);
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
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP:
            getExpressionGroup().clear();
            return;
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
            setExpression((Expression) null);
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
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP:
            return expressionGroup != null && !expressionGroup.isEmpty();
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION:
            return getExpression() != null;
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
        result.append(" (expressionGroup: "); //$NON-NLS-1$
        result.append(expressionGroup);
        result.append(')');
        return result.toString();
    }

} //ResourceAssignmentExpressionImpl
