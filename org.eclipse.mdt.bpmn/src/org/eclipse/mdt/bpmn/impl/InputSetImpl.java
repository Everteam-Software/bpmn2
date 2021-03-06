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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.InputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.InputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.InputSetImpl#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.InputSetImpl#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.InputSetImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.InputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSetImpl extends BaseElementImpl implements InputSet {
    /**
     * The cached value of the '{@link #getDataInputRefs() <em>Data Input Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> dataInputRefs;

    /**
     * The cached value of the '{@link #getOptionalInputRefs() <em>Optional Input Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptionalInputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> optionalInputRefs;

    /**
     * The cached value of the '{@link #getWhileExecutingInputRefs() <em>While Executing Input Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhileExecutingInputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> whileExecutingInputRefs;

    /**
     * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputSetRefs()
     * @generated
     * @ordered
     */
    protected EList<String> outputSetRefs;

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
    protected InputSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getInputSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getDataInputRefs() {
        if (dataInputRefs == null) {
            dataInputRefs = new EDataTypeEList<String>(String.class, this,
                    BpmnPackage.INPUT_SET__DATA_INPUT_REFS);
        }
        return dataInputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getOptionalInputRefs() {
        if (optionalInputRefs == null) {
            optionalInputRefs = new EDataTypeEList<String>(String.class, this,
                    BpmnPackage.INPUT_SET__OPTIONAL_INPUT_REFS);
        }
        return optionalInputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getWhileExecutingInputRefs() {
        if (whileExecutingInputRefs == null) {
            whileExecutingInputRefs = new EDataTypeEList<String>(String.class,
                    this, BpmnPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS);
        }
        return whileExecutingInputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getOutputSetRefs() {
        if (outputSetRefs == null) {
            outputSetRefs = new EDataTypeEList<String>(String.class, this,
                    BpmnPackage.INPUT_SET__OUTPUT_SET_REFS);
        }
        return outputSetRefs;
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
                    BpmnPackage.INPUT_SET__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.INPUT_SET__DATA_INPUT_REFS:
            return getDataInputRefs();
        case BpmnPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
            return getOptionalInputRefs();
        case BpmnPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
            return getWhileExecutingInputRefs();
        case BpmnPackage.INPUT_SET__OUTPUT_SET_REFS:
            return getOutputSetRefs();
        case BpmnPackage.INPUT_SET__NAME:
            return getName();
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
        case BpmnPackage.INPUT_SET__DATA_INPUT_REFS:
            getDataInputRefs().clear();
            getDataInputRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
            getOptionalInputRefs().clear();
            getOptionalInputRefs().addAll(
                    (Collection<? extends String>) newValue);
            return;
        case BpmnPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
            getWhileExecutingInputRefs().clear();
            getWhileExecutingInputRefs().addAll(
                    (Collection<? extends String>) newValue);
            return;
        case BpmnPackage.INPUT_SET__OUTPUT_SET_REFS:
            getOutputSetRefs().clear();
            getOutputSetRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.INPUT_SET__NAME:
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
        case BpmnPackage.INPUT_SET__DATA_INPUT_REFS:
            getDataInputRefs().clear();
            return;
        case BpmnPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
            getOptionalInputRefs().clear();
            return;
        case BpmnPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
            getWhileExecutingInputRefs().clear();
            return;
        case BpmnPackage.INPUT_SET__OUTPUT_SET_REFS:
            getOutputSetRefs().clear();
            return;
        case BpmnPackage.INPUT_SET__NAME:
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
        case BpmnPackage.INPUT_SET__DATA_INPUT_REFS:
            return dataInputRefs != null && !dataInputRefs.isEmpty();
        case BpmnPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
            return optionalInputRefs != null && !optionalInputRefs.isEmpty();
        case BpmnPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
            return whileExecutingInputRefs != null
                    && !whileExecutingInputRefs.isEmpty();
        case BpmnPackage.INPUT_SET__OUTPUT_SET_REFS:
            return outputSetRefs != null && !outputSetRefs.isEmpty();
        case BpmnPackage.INPUT_SET__NAME:
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
        result.append(" (dataInputRefs: "); //$NON-NLS-1$
        result.append(dataInputRefs);
        result.append(", optionalInputRefs: "); //$NON-NLS-1$
        result.append(optionalInputRefs);
        result.append(", whileExecutingInputRefs: "); //$NON-NLS-1$
        result.append(whileExecutingInputRefs);
        result.append(", outputSetRefs: "); //$NON-NLS-1$
        result.append(outputSetRefs);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //InputSetImpl
