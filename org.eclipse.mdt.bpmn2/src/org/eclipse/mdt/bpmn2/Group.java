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
package org.eclipse.mdt.bpmn2;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Group#getCategoryRef <em>Category Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGroup()
 * @model extendedMetaData="name='tGroup' kind='elementOnly'"
 * @generated
 */
public interface Group extends Artifact {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Category Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Ref</em>' attribute.
     * @see #setCategoryRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGroup_CategoryRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='categoryRef'"
     * @generated
     */
    QName getCategoryRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Group#getCategoryRef <em>Category Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category Ref</em>' attribute.
     * @see #getCategoryRef()
     * @generated
     */
    void setCategoryRef(QName value);

} // Group
