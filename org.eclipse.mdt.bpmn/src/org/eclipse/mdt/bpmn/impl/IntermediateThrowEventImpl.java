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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.IntermediateThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntermediateThrowEventImpl extends ThrowEventImpl implements
        IntermediateThrowEvent {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntermediateThrowEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getIntermediateThrowEvent();
    }

} //IntermediateThrowEventImpl
