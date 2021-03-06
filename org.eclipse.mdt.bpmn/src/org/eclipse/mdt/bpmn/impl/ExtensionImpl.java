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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Documentation;
import org.eclipse.mdt.bpmn.Extension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ExtensionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ExtensionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ExtensionImpl#isMustUnderstand <em>Must Understand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends EObjectImpl implements Extension {
    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected EList<Documentation> documentation;

    /**
     * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected static final QName DEFINITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected QName definition = DEFINITION_EDEFAULT;

    /**
     * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustUnderstand()
     * @generated
     * @ordered
     */
    protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustUnderstand()
     * @generated
     * @ordered
     */
    protected boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

    /**
     * This is true if the Must Understand attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mustUnderstandESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getExtension();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new EObjectContainmentEList<Documentation>(
                    Documentation.class, this,
                    BpmnPackage.EXTENSION__DOCUMENTATION);
        }
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDefinition() {
        return definition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinition(QName newDefinition) {
        QName oldDefinition = definition;
        definition = newDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.EXTENSION__DEFINITION, oldDefinition,
                    definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMustUnderstand(boolean newMustUnderstand) {
        boolean oldMustUnderstand = mustUnderstand;
        mustUnderstand = newMustUnderstand;
        boolean oldMustUnderstandESet = mustUnderstandESet;
        mustUnderstandESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand,
                    mustUnderstand, !oldMustUnderstandESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMustUnderstand() {
        boolean oldMustUnderstand = mustUnderstand;
        boolean oldMustUnderstandESet = mustUnderstandESet;
        mustUnderstand = MUST_UNDERSTAND_EDEFAULT;
        mustUnderstandESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand,
                    MUST_UNDERSTAND_EDEFAULT, oldMustUnderstandESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMustUnderstand() {
        return mustUnderstandESet;
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
        case BpmnPackage.EXTENSION__DOCUMENTATION:
            return ((InternalEList<?>) getDocumentation()).basicRemove(
                    otherEnd, msgs);
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
        case BpmnPackage.EXTENSION__DOCUMENTATION:
            return getDocumentation();
        case BpmnPackage.EXTENSION__DEFINITION:
            return getDefinition();
        case BpmnPackage.EXTENSION__MUST_UNDERSTAND:
            return isMustUnderstand();
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
        case BpmnPackage.EXTENSION__DOCUMENTATION:
            getDocumentation().clear();
            getDocumentation().addAll(
                    (Collection<? extends Documentation>) newValue);
            return;
        case BpmnPackage.EXTENSION__DEFINITION:
            setDefinition((QName) newValue);
            return;
        case BpmnPackage.EXTENSION__MUST_UNDERSTAND:
            setMustUnderstand((Boolean) newValue);
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
        case BpmnPackage.EXTENSION__DOCUMENTATION:
            getDocumentation().clear();
            return;
        case BpmnPackage.EXTENSION__DEFINITION:
            setDefinition(DEFINITION_EDEFAULT);
            return;
        case BpmnPackage.EXTENSION__MUST_UNDERSTAND:
            unsetMustUnderstand();
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
        case BpmnPackage.EXTENSION__DOCUMENTATION:
            return documentation != null && !documentation.isEmpty();
        case BpmnPackage.EXTENSION__DEFINITION:
            return DEFINITION_EDEFAULT == null ? definition != null
                    : !DEFINITION_EDEFAULT.equals(definition);
        case BpmnPackage.EXTENSION__MUST_UNDERSTAND:
            return isSetMustUnderstand();
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
        result.append(" (definition: "); //$NON-NLS-1$
        result.append(definition);
        result.append(", mustUnderstand: "); //$NON-NLS-1$
        if (mustUnderstandESet)
            result.append(mustUnderstand);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ExtensionImpl
