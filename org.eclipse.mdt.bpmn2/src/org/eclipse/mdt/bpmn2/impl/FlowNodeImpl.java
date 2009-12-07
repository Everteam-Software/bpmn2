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
package org.eclipse.mdt.bpmn2.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.FlowNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncoming()
     * @generated
     * @ordered
     */
    protected EList<QName> incoming;

    /**
     * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoing()
     * @generated
     * @ordered
     */
    protected EList<QName> outgoing;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getFlowNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getIncoming() {
        if (incoming == null) {
            incoming = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.FLOW_NODE__INCOMING);
        }
        return incoming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getOutgoing() {
        if (outgoing == null) {
            outgoing = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.FLOW_NODE__OUTGOING);
        }
        return outgoing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.FLOW_NODE__INCOMING:
            return getIncoming();
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            return getOutgoing();
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
        case Bpmn2Package.FLOW_NODE__INCOMING:
            getIncoming().clear();
            getIncoming().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            getOutgoing().clear();
            getOutgoing().addAll((Collection<? extends QName>) newValue);
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
        case Bpmn2Package.FLOW_NODE__INCOMING:
            getIncoming().clear();
            return;
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            getOutgoing().clear();
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
        case Bpmn2Package.FLOW_NODE__INCOMING:
            return incoming != null && !incoming.isEmpty();
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            return outgoing != null && !outgoing.isEmpty();
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
        result.append(" (incoming: ");
        result.append(incoming);
        result.append(", outgoing: ");
        result.append(outgoing);
        result.append(')');
        return result.toString();
    }

} //FlowNodeImpl
