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
 * A representation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getTimerEventDefinition()
 * @model extendedMetaData="name='tTimerEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface TimerEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Date</em>' containment reference.
     * @see #setTimeDate(Expression)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getTimerEventDefinition_TimeDate()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='timeDate' namespace='##targetNamespace'"
     * @generated
     */
    Expression getTimeDate();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Date</em>' containment reference.
     * @see #getTimeDate()
     * @generated
     */
    void setTimeDate(Expression value);

    /**
     * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Cycle</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Cycle</em>' containment reference.
     * @see #setTimeCycle(Expression)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getTimerEventDefinition_TimeCycle()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='timeCycle' namespace='##targetNamespace'"
     * @generated
     */
    Expression getTimeCycle();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Cycle</em>' containment reference.
     * @see #getTimeCycle()
     * @generated
     */
    void setTimeCycle(Expression value);

} // TimerEventDefinition
