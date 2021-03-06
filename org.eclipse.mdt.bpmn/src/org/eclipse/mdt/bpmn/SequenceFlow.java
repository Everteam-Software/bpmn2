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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.SequenceFlow#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getSequenceFlow()
 * @model extendedMetaData="name='tSequenceFlow' kind='elementOnly'"
 * @generated
 */
public interface SequenceFlow extends FlowElement {
    /**
     * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition Expression</em>' containment reference.
     * @see #setConditionExpression(Expression)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSequenceFlow_ConditionExpression()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conditionExpression' namespace='##targetNamespace'"
     * @generated
     */
    Expression getConditionExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#getConditionExpression <em>Condition Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition Expression</em>' containment reference.
     * @see #getConditionExpression()
     * @generated
     */
    void setConditionExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Immediate</em>' attribute.
     * @see #isSetIsImmediate()
     * @see #unsetIsImmediate()
     * @see #setIsImmediate(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSequenceFlow_IsImmediate()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isImmediate'"
     * @generated
     */
    boolean isIsImmediate();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Immediate</em>' attribute.
     * @see #isSetIsImmediate()
     * @see #unsetIsImmediate()
     * @see #isIsImmediate()
     * @generated
     */
    void setIsImmediate(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsImmediate()
     * @see #isIsImmediate()
     * @see #setIsImmediate(boolean)
     * @generated
     */
    void unsetIsImmediate();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate <em>Is Immediate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Immediate</em>' attribute is set.
     * @see #unsetIsImmediate()
     * @see #isIsImmediate()
     * @see #setIsImmediate(boolean)
     * @generated
     */
    boolean isSetIsImmediate();

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' attribute.
     * @see #setSourceRef(String)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSequenceFlow_SourceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='sourceRef'"
     * @generated
     */
    String getSourceRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#getSourceRef <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' attribute.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(String value);

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' attribute.
     * @see #setTargetRef(String)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getSequenceFlow_TargetRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='targetRef'"
     * @generated
     */
    String getTargetRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.SequenceFlow#getTargetRef <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' attribute.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(String value);

} // SequenceFlow
