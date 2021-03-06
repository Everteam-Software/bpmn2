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
 * A representation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.TextAnnotation#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getTextAnnotation()
 * @model extendedMetaData="name='tTextAnnotation' kind='elementOnly'"
 * @generated
 */
public interface TextAnnotation extends Artifact {
    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #setText(Text)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getTextAnnotation_Text()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
     * @generated
     */
    Text getText();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.TextAnnotation#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #getText()
     * @generated
     */
    void setText(Text value);

} // TextAnnotation
