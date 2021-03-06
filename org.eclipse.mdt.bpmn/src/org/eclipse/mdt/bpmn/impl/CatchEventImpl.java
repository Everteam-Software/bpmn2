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

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.CatchEvent;
import org.eclipse.mdt.bpmn.DataOutput;
import org.eclipse.mdt.bpmn.DataOutputAssociation;
import org.eclipse.mdt.bpmn.EventDefinition;
import org.eclipse.mdt.bpmn.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
    /**
     * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutput()
     * @generated
     * @ordered
     */
    protected EList<DataOutput> dataOutput;

    /**
     * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputAssociation()
     * @generated
     * @ordered
     */
    protected EList<DataOutputAssociation> dataOutputAssociation;

    /**
     * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputSet()
     * @generated
     * @ordered
     */
    protected OutputSet outputSet;

    /**
     * The cached value of the '{@link #getEventDefinitionGroup() <em>Event Definition Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap eventDefinitionGroup;

    /**
     * The cached value of the '{@link #getEventDefinitionRef() <em>Event Definition Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionRef()
     * @generated
     * @ordered
     */
    protected EList<QName> eventDefinitionRef;

    /**
     * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isParallelMultiple()
     * @generated
     * @ordered
     */
    protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isParallelMultiple()
     * @generated
     * @ordered
     */
    protected boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

    /**
     * This is true if the Parallel Multiple attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parallelMultipleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CatchEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCatchEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutput> getDataOutput() {
        if (dataOutput == null) {
            dataOutput = new EObjectContainmentEList<DataOutput>(
                    DataOutput.class, this,
                    BpmnPackage.CATCH_EVENT__DATA_OUTPUT);
        }
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutputAssociation> getDataOutputAssociation() {
        if (dataOutputAssociation == null) {
            dataOutputAssociation = new EObjectContainmentEList<DataOutputAssociation>(
                    DataOutputAssociation.class, this,
                    BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION);
        }
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet getOutputSet() {
        return outputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputSet(OutputSet newOutputSet,
            NotificationChain msgs) {
        OutputSet oldOutputSet = outputSet;
        outputSet = newOutputSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.CATCH_EVENT__OUTPUT_SET,
                    oldOutputSet, newOutputSet);
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
    public void setOutputSet(OutputSet newOutputSet) {
        if (newOutputSet != outputSet) {
            NotificationChain msgs = null;
            if (outputSet != null)
                msgs = ((InternalEObject) outputSet).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            if (newOutputSet != null)
                msgs = ((InternalEObject) newOutputSet).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            msgs = basicSetOutputSet(newOutputSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CATCH_EVENT__OUTPUT_SET, newOutputSet,
                    newOutputSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEventDefinitionGroup() {
        if (eventDefinitionGroup == null) {
            eventDefinitionGroup = new BasicFeatureMap(this,
                    BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP);
        }
        return eventDefinitionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventDefinition> getEventDefinition() {
        return getEventDefinitionGroup().list(
                BpmnPackage.eINSTANCE.getCatchEvent_EventDefinition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEventDefinitionRef() {
        if (eventDefinitionRef == null) {
            eventDefinitionRef = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REF);
        }
        return eventDefinitionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isParallelMultiple() {
        return parallelMultiple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParallelMultiple(boolean newParallelMultiple) {
        boolean oldParallelMultiple = parallelMultiple;
        parallelMultiple = newParallelMultiple;
        boolean oldParallelMultipleESet = parallelMultipleESet;
        parallelMultipleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE,
                    oldParallelMultiple, parallelMultiple,
                    !oldParallelMultipleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetParallelMultiple() {
        boolean oldParallelMultiple = parallelMultiple;
        boolean oldParallelMultipleESet = parallelMultipleESet;
        parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;
        parallelMultipleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE,
                    oldParallelMultiple, PARALLEL_MULTIPLE_EDEFAULT,
                    oldParallelMultipleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetParallelMultiple() {
        return parallelMultipleESet;
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT:
            return ((InternalEList<?>) getDataOutput()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return ((InternalEList<?>) getDataOutputAssociation()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return basicSetOutputSet(null, msgs);
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            return ((InternalEList<?>) getEventDefinitionGroup()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION:
            return ((InternalEList<?>) getEventDefinition()).basicRemove(
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT:
            return getDataOutput();
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return getDataOutputAssociation();
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return getOutputSet();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            if (coreType)
                return getEventDefinitionGroup();
            return ((FeatureMap.Internal) getEventDefinitionGroup())
                    .getWrapper();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION:
            return getEventDefinition();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REF:
            return getEventDefinitionRef();
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            return isParallelMultiple();
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT:
            getDataOutput().clear();
            getDataOutput().addAll((Collection<? extends DataOutput>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            getDataOutputAssociation().clear();
            getDataOutputAssociation().addAll(
                    (Collection<? extends DataOutputAssociation>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            ((FeatureMap.Internal) getEventDefinitionGroup()).set(newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            getEventDefinition().addAll(
                    (Collection<? extends EventDefinition>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REF:
            getEventDefinitionRef().clear();
            getEventDefinitionRef().addAll(
                    (Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            setParallelMultiple((Boolean) newValue);
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT:
            getDataOutput().clear();
            return;
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            getDataOutputAssociation().clear();
            return;
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) null);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            getEventDefinitionGroup().clear();
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REF:
            getEventDefinitionRef().clear();
            return;
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            unsetParallelMultiple();
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT:
            return dataOutput != null && !dataOutput.isEmpty();
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return dataOutputAssociation != null
                    && !dataOutputAssociation.isEmpty();
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return outputSet != null;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            return eventDefinitionGroup != null
                    && !eventDefinitionGroup.isEmpty();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION:
            return !getEventDefinition().isEmpty();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REF:
            return eventDefinitionRef != null && !eventDefinitionRef.isEmpty();
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            return isSetParallelMultiple();
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
        result.append(" (eventDefinitionGroup: "); //$NON-NLS-1$
        result.append(eventDefinitionGroup);
        result.append(", eventDefinitionRef: "); //$NON-NLS-1$
        result.append(eventDefinitionRef);
        result.append(", parallelMultiple: "); //$NON-NLS-1$
        if (parallelMultipleESet)
            result.append(parallelMultiple);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //CatchEventImpl
