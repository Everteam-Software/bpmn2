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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.Auditing;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.FlowElement;
import org.eclipse.mdt.bpmn.LaneSet;
import org.eclipse.mdt.bpmn.Monitoring;
import org.eclipse.mdt.bpmn.ProcessType;
import org.eclipse.mdt.bpmn.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements
        org.eclipse.mdt.bpmn.Process {
    /**
     * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuditing()
     * @generated
     * @ordered
     */
    protected Auditing auditing;

    /**
     * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitoring()
     * @generated
     * @ordered
     */
    protected Monitoring monitoring;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> property;

    /**
     * The cached value of the '{@link #getLaneSet() <em>Lane Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLaneSet()
     * @generated
     * @ordered
     */
    protected EList<LaneSet> laneSet;

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
     * The cached value of the '{@link #getSupports() <em>Supports</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupports()
     * @generated
     * @ordered
     */
    protected EList<QName> supports;

    /**
     * The default value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinitionalCollaborationRef()
     * @generated
     * @ordered
     */
    protected static final QName DEFINITIONAL_COLLABORATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinitionalCollaborationRef()
     * @generated
     * @ordered
     */
    protected QName definitionalCollaborationRef = DEFINITIONAL_COLLABORATION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CLOSED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected boolean isClosed = IS_CLOSED_EDEFAULT;

    /**
     * This is true if the Is Closed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isClosedESet;

    /**
     * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;

    /**
     * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

    /**
     * This is true if the Process Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean processTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Auditing getAuditing() {
        return auditing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuditing(Auditing newAuditing,
            NotificationChain msgs) {
        Auditing oldAuditing = auditing;
        auditing = newAuditing;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.PROCESS__AUDITING,
                    oldAuditing, newAuditing);
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
    public void setAuditing(Auditing newAuditing) {
        if (newAuditing != auditing) {
            NotificationChain msgs = null;
            if (auditing != null)
                msgs = ((InternalEObject) auditing).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.PROCESS__AUDITING,
                        null, msgs);
            if (newAuditing != null)
                msgs = ((InternalEObject) newAuditing).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - BpmnPackage.PROCESS__AUDITING,
                        null, msgs);
            msgs = basicSetAuditing(newAuditing, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PROCESS__AUDITING, newAuditing, newAuditing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMonitoring(Monitoring newMonitoring,
            NotificationChain msgs) {
        Monitoring oldMonitoring = monitoring;
        monitoring = newMonitoring;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.PROCESS__MONITORING,
                    oldMonitoring, newMonitoring);
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
    public void setMonitoring(Monitoring newMonitoring) {
        if (newMonitoring != monitoring) {
            NotificationChain msgs = null;
            if (monitoring != null)
                msgs = ((InternalEObject) monitoring).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.PROCESS__MONITORING, null, msgs);
            if (newMonitoring != null)
                msgs = ((InternalEObject) newMonitoring).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.PROCESS__MONITORING, null, msgs);
            msgs = basicSetMonitoring(newMonitoring, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PROCESS__MONITORING, newMonitoring,
                    newMonitoring));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class,
                    this, BpmnPackage.PROCESS__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LaneSet> getLaneSet() {
        if (laneSet == null) {
            laneSet = new EObjectContainmentEList<LaneSet>(LaneSet.class, this,
                    BpmnPackage.PROCESS__LANE_SET);
        }
        return laneSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this,
                    BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(
                BpmnPackage.eINSTANCE.getProcess_FlowElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this,
                    BpmnPackage.PROCESS__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifact() {
        return getArtifactGroup().list(
                BpmnPackage.eINSTANCE.getProcess_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getSupports() {
        if (supports == null) {
            supports = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.PROCESS__SUPPORTS);
        }
        return supports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDefinitionalCollaborationRef() {
        return definitionalCollaborationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinitionalCollaborationRef(
            QName newDefinitionalCollaborationRef) {
        QName oldDefinitionalCollaborationRef = definitionalCollaborationRef;
        definitionalCollaborationRef = newDefinitionalCollaborationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF,
                    oldDefinitionalCollaborationRef,
                    definitionalCollaborationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsClosed(boolean newIsClosed) {
        boolean oldIsClosed = isClosed;
        isClosed = newIsClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PROCESS__IS_CLOSED, oldIsClosed, isClosed,
                    !oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsClosed() {
        boolean oldIsClosed = isClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosed = IS_CLOSED_EDEFAULT;
        isClosedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.PROCESS__IS_CLOSED, oldIsClosed,
                    IS_CLOSED_EDEFAULT, oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsClosed() {
        return isClosedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessType(ProcessType newProcessType) {
        ProcessType oldProcessType = processType;
        processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT
                : newProcessType;
        boolean oldProcessTypeESet = processTypeESet;
        processTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.PROCESS__PROCESS_TYPE, oldProcessType,
                    processType, !oldProcessTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProcessType() {
        ProcessType oldProcessType = processType;
        boolean oldProcessTypeESet = processTypeESet;
        processType = PROCESS_TYPE_EDEFAULT;
        processTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.PROCESS__PROCESS_TYPE, oldProcessType,
                    PROCESS_TYPE_EDEFAULT, oldProcessTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProcessType() {
        return processTypeESet;
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
        case BpmnPackage.PROCESS__AUDITING:
            return basicSetAuditing(null, msgs);
        case BpmnPackage.PROCESS__MONITORING:
            return basicSetMonitoring(null, msgs);
        case BpmnPackage.PROCESS__PROPERTY:
            return ((InternalEList<?>) getProperty()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.PROCESS__LANE_SET:
            return ((InternalEList<?>) getLaneSet())
                    .basicRemove(otherEnd, msgs);
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.PROCESS__FLOW_ELEMENT:
            return ((InternalEList<?>) getFlowElement()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.PROCESS__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd,
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
        case BpmnPackage.PROCESS__AUDITING:
            return getAuditing();
        case BpmnPackage.PROCESS__MONITORING:
            return getMonitoring();
        case BpmnPackage.PROCESS__PROPERTY:
            return getProperty();
        case BpmnPackage.PROCESS__LANE_SET:
            return getLaneSet();
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case BpmnPackage.PROCESS__FLOW_ELEMENT:
            return getFlowElement();
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.PROCESS__ARTIFACT:
            return getArtifact();
        case BpmnPackage.PROCESS__SUPPORTS:
            return getSupports();
        case BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
            return getDefinitionalCollaborationRef();
        case BpmnPackage.PROCESS__IS_CLOSED:
            return isIsClosed();
        case BpmnPackage.PROCESS__PROCESS_TYPE:
            return getProcessType();
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
        case BpmnPackage.PROCESS__AUDITING:
            setAuditing((Auditing) newValue);
            return;
        case BpmnPackage.PROCESS__MONITORING:
            setMonitoring((Monitoring) newValue);
            return;
        case BpmnPackage.PROCESS__PROPERTY:
            getProperty().clear();
            getProperty().addAll((Collection<? extends Property>) newValue);
            return;
        case BpmnPackage.PROCESS__LANE_SET:
            getLaneSet().clear();
            getLaneSet().addAll((Collection<? extends LaneSet>) newValue);
            return;
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case BpmnPackage.PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            getFlowElement().addAll(
                    (Collection<? extends FlowElement>) newValue);
            return;
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.PROCESS__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.PROCESS__SUPPORTS:
            getSupports().clear();
            getSupports().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
            setDefinitionalCollaborationRef((QName) newValue);
            return;
        case BpmnPackage.PROCESS__IS_CLOSED:
            setIsClosed((Boolean) newValue);
            return;
        case BpmnPackage.PROCESS__PROCESS_TYPE:
            setProcessType((ProcessType) newValue);
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
        case BpmnPackage.PROCESS__AUDITING:
            setAuditing((Auditing) null);
            return;
        case BpmnPackage.PROCESS__MONITORING:
            setMonitoring((Monitoring) null);
            return;
        case BpmnPackage.PROCESS__PROPERTY:
            getProperty().clear();
            return;
        case BpmnPackage.PROCESS__LANE_SET:
            getLaneSet().clear();
            return;
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case BpmnPackage.PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            return;
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.PROCESS__ARTIFACT:
            getArtifact().clear();
            return;
        case BpmnPackage.PROCESS__SUPPORTS:
            getSupports().clear();
            return;
        case BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
            setDefinitionalCollaborationRef(DEFINITIONAL_COLLABORATION_REF_EDEFAULT);
            return;
        case BpmnPackage.PROCESS__IS_CLOSED:
            unsetIsClosed();
            return;
        case BpmnPackage.PROCESS__PROCESS_TYPE:
            unsetProcessType();
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
        case BpmnPackage.PROCESS__AUDITING:
            return auditing != null;
        case BpmnPackage.PROCESS__MONITORING:
            return monitoring != null;
        case BpmnPackage.PROCESS__PROPERTY:
            return property != null && !property.isEmpty();
        case BpmnPackage.PROCESS__LANE_SET:
            return laneSet != null && !laneSet.isEmpty();
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case BpmnPackage.PROCESS__FLOW_ELEMENT:
            return !getFlowElement().isEmpty();
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.PROCESS__ARTIFACT:
            return !getArtifact().isEmpty();
        case BpmnPackage.PROCESS__SUPPORTS:
            return supports != null && !supports.isEmpty();
        case BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
            return DEFINITIONAL_COLLABORATION_REF_EDEFAULT == null ? definitionalCollaborationRef != null
                    : !DEFINITIONAL_COLLABORATION_REF_EDEFAULT
                            .equals(definitionalCollaborationRef);
        case BpmnPackage.PROCESS__IS_CLOSED:
            return isSetIsClosed();
        case BpmnPackage.PROCESS__PROCESS_TYPE:
            return isSetProcessType();
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
        result.append(", supports: "); //$NON-NLS-1$
        result.append(supports);
        result.append(", definitionalCollaborationRef: "); //$NON-NLS-1$
        result.append(definitionalCollaborationRef);
        result.append(", isClosed: "); //$NON-NLS-1$
        if (isClosedESet)
            result.append(isClosed);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", processType: "); //$NON-NLS-1$
        if (processTypeESet)
            result.append(processType);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ProcessImpl
