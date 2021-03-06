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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.FlowElement;
import org.eclipse.mdt.bpmn.SubProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
    /**
     * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroup;

    /**
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

    /**
     * The default value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTriggeredByEvent()
     * @generated
     * @ordered
     */
    protected static final boolean TRIGGERED_BY_EVENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTriggeredByEvent()
     * @generated
     * @ordered
     */
    protected boolean triggeredByEvent = TRIGGERED_BY_EVENT_EDEFAULT;

    /**
     * This is true if the Triggered By Event attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean triggeredByEventESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getSubProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this,
                    BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElements() {
        return getFlowElementGroup().list(
                BpmnPackage.eINSTANCE.getSubProcess_FlowElements());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this,
                    BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifacts() {
        return getArtifactGroup().list(
                BpmnPackage.eINSTANCE.getSubProcess_Artifacts());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTriggeredByEvent() {
        return triggeredByEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggeredByEvent(boolean newTriggeredByEvent) {
        boolean oldTriggeredByEvent = triggeredByEvent;
        triggeredByEvent = newTriggeredByEvent;
        boolean oldTriggeredByEventESet = triggeredByEventESet;
        triggeredByEventESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT,
                    oldTriggeredByEvent, triggeredByEvent,
                    !oldTriggeredByEventESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTriggeredByEvent() {
        boolean oldTriggeredByEvent = triggeredByEvent;
        boolean oldTriggeredByEventESet = triggeredByEventESet;
        triggeredByEvent = TRIGGERED_BY_EVENT_EDEFAULT;
        triggeredByEventESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT,
                    oldTriggeredByEvent, TRIGGERED_BY_EVENT_EDEFAULT,
                    oldTriggeredByEventESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTriggeredByEvent() {
        return triggeredByEventESet;
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
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENTS:
            return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.SUB_PROCESS__ARTIFACTS:
            return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd,
                    msgs);
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
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENTS:
            return getFlowElements();
        case BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.SUB_PROCESS__ARTIFACTS:
            return getArtifacts();
        case BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT:
            return isTriggeredByEvent();
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
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENTS:
            getFlowElements().clear();
            getFlowElements().addAll(
                    (Collection<? extends FlowElement>) newValue);
            return;
        case BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.SUB_PROCESS__ARTIFACTS:
            getArtifacts().clear();
            getArtifacts().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT:
            setTriggeredByEvent((Boolean) newValue);
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
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENTS:
            getFlowElements().clear();
            return;
        case BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.SUB_PROCESS__ARTIFACTS:
            getArtifacts().clear();
            return;
        case BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT:
            unsetTriggeredByEvent();
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
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case BpmnPackage.SUB_PROCESS__FLOW_ELEMENTS:
            return !getFlowElements().isEmpty();
        case BpmnPackage.SUB_PROCESS__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.SUB_PROCESS__ARTIFACTS:
            return !getArtifacts().isEmpty();
        case BpmnPackage.SUB_PROCESS__TRIGGERED_BY_EVENT:
            return isSetTriggeredByEvent();
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
        result.append(" (flowElementGroup: "); //$NON-NLS-1$
        result.append(flowElementGroup);
        result.append(", artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", triggeredByEvent: "); //$NON-NLS-1$
        if (triggeredByEventESet)
            result.append(triggeredByEvent);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //SubProcessImpl
