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
package org.eclipse.mdt.bpmn.di.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdt.bpmn.di.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdt.bpmn.di.DIPackage
 * @generated
 */
public class DIAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DIPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DIPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DISwitch<Adapter> modelSwitch = new DISwitch<Adapter>() {
        @Override
        public Adapter caseBendpoint(Bendpoint object) {
            return createBendpointAdapter();
        }

        @Override
        public Adapter caseConnector(Connector object) {
            return createConnectorAdapter();
        }

        @Override
        public Adapter caseDiagram(Diagram object) {
            return createDiagramAdapter();
        }

        @Override
        public Adapter caseDocumentRoot(DocumentRoot object) {
            return createDocumentRootAdapter();
        }

        @Override
        public Adapter caseNode(Node object) {
            return createNodeAdapter();
        }

        @Override
        public Adapter caseStyle(Style object) {
            return createStyleAdapter();
        }

        @Override
        public Adapter caseView(View object) {
            return createViewAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.Bendpoint <em>Bendpoint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint
     * @generated
     */
    public Adapter createBendpointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.Node
     * @generated
     */
    public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.Style
     * @generated
     */
    public Adapter createStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.di.View <em>View</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.di.View
     * @generated
     */
    public Adapter createViewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DIAdapterFactory
