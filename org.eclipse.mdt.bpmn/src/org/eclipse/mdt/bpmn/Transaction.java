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
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Transaction#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getTransaction()
 * @model extendedMetaData="name='tTransaction' kind='elementOnly'"
 * @generated
 */
public interface Transaction extends Activity {
    /**
     * Returns the value of the '<em><b>Method</b></em>' attribute.
     * The default value is <code>"compensate"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.TransactionMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' attribute.
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @see #isSetMethod()
     * @see #unsetMethod()
     * @see #setMethod(TransactionMethod)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getTransaction_Method()
     * @model default="compensate" unsettable="true"
     *        extendedMetaData="kind='attribute' name='method'"
     * @generated
     */
    TransactionMethod getMethod();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Transaction#getMethod <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' attribute.
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @see #isSetMethod()
     * @see #unsetMethod()
     * @see #getMethod()
     * @generated
     */
    void setMethod(TransactionMethod value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Transaction#getMethod <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMethod()
     * @see #getMethod()
     * @see #setMethod(TransactionMethod)
     * @generated
     */
    void unsetMethod();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Transaction#getMethod <em>Method</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Method</em>' attribute is set.
     * @see #unsetMethod()
     * @see #getMethod()
     * @see #setMethod(TransactionMethod)
     * @generated
     */
    boolean isSetMethod();

} // Transaction
