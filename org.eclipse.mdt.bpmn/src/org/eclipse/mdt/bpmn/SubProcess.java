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
package org.eclipse.mdt.bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.SubProcess#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SubProcess#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SubProcess#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SubProcess#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess()
 * @model extendedMetaData="name='tSubProcess' kind='elementOnly'"
 * @generated
 */
public interface SubProcess extends Activity {
    /**
     * Returns the value of the '<em><b>Flow Element Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess_FlowElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='flowElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getFlowElementGroup();

    /**
     * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Elements</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess_FlowElements()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace' group='flowElement:group'"
     * @generated
     */
    EList<FlowElement> getFlowElements();

    /**
     * Returns the value of the '<em><b>Artifact Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess_ArtifactGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getArtifactGroup();

    /**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess_Artifacts()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    EList<Artifact> getArtifacts();

    /**
     * Returns the value of the '<em><b>Triggered By Event</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggered By Event</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggered By Event</em>' attribute.
     * @see #isSetTriggeredByEvent()
     * @see #unsetTriggeredByEvent()
     * @see #setTriggeredByEvent(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSubProcess_TriggeredByEvent()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='triggeredByEvent'"
     * @generated
     */
    boolean isTriggeredByEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triggered By Event</em>' attribute.
     * @see #isSetTriggeredByEvent()
     * @see #unsetTriggeredByEvent()
     * @see #isTriggeredByEvent()
     * @generated
     */
    void setTriggeredByEvent(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTriggeredByEvent()
     * @see #isTriggeredByEvent()
     * @see #setTriggeredByEvent(boolean)
     * @generated
     */
    void unsetTriggeredByEvent();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Triggered By Event</em>' attribute is set.
     * @see #unsetTriggeredByEvent()
     * @see #isTriggeredByEvent()
     * @see #setTriggeredByEvent(boolean)
     * @generated
     */
    boolean isSetTriggeredByEvent();

} // SubProcess
