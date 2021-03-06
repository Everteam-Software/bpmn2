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
package org.eclipse.mdt.bpmn.di.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.mdt.bpmn.BpmnPackage;

import org.eclipse.mdt.bpmn.di.Bendpoint;
import org.eclipse.mdt.bpmn.di.Connector;
import org.eclipse.mdt.bpmn.di.DIFactory;
import org.eclipse.mdt.bpmn.di.DIPackage;
import org.eclipse.mdt.bpmn.di.Diagram;
import org.eclipse.mdt.bpmn.di.DocumentRoot;
import org.eclipse.mdt.bpmn.di.Node;
import org.eclipse.mdt.bpmn.di.Style;
import org.eclipse.mdt.bpmn.di.View;

import org.eclipse.mdt.bpmn.di.util.DIValidator;

import org.eclipse.mdt.bpmn.impl.BpmnPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DIPackageImpl extends EPackageImpl implements DIPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bendpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass styleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass viewEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType definitionTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType sourceConnectorTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType targetConnectorTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.mdt.bpmn.di.DIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DIPackageImpl() {
        super(eNS_URI, DIFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link DIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DIPackage init() {
        if (isInited)
            return (DIPackage) EPackage.Registry.INSTANCE
                    .getEPackage(DIPackage.eNS_URI);

        // Obtain or create and register package
        DIPackageImpl theDIPackage = (DIPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI)
                : new DIPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BpmnPackageImpl theBpmnPackage = (BpmnPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(BpmnPackage.eNS_URI) instanceof BpmnPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(BpmnPackage.eNS_URI)
                : BpmnPackage.eINSTANCE);

        // Load packages
        theBpmnPackage.loadPackage();

        // Create package meta-data objects
        theDIPackage.createPackageContents();

        // Initialize created meta-data
        theDIPackage.initializePackageContents();

        // Fix loaded packages
        theBpmnPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put(theDIPackage,
                new EValidator.Descriptor() {
                    public EValidator getEValidator() {
                        return DIValidator.INSTANCE;
                    }
                });

        // Mark meta-data to indicate it can't be changed
        theDIPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DIPackage.eNS_URI, theDIPackage);
        return theDIPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBendpoint() {
        return bendpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBendpoint_SourceX() {
        return (EAttribute) bendpointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBendpoint_SourceY() {
        return (EAttribute) bendpointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBendpoint_TargetX() {
        return (EAttribute) bendpointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBendpoint_TargetY() {
        return (EAttribute) bendpointEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnector() {
        return connectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnector_Bendpoint() {
        return (EReference) connectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnector_Source() {
        return (EAttribute) connectorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnector_Target() {
        return (EAttribute) connectorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagram() {
        return diagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagram_Connector() {
        return (EReference) diagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Bendpoint() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Connector() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_View() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Diagram() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Node() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Style() {
        return (EReference) documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNode() {
        return nodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStyle() {
        return styleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_Name() {
        return (EAttribute) styleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_Value() {
        return (EAttribute) styleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getView() {
        return viewEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getView_Style() {
        return (EReference) viewEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getView_Child() {
        return (EReference) viewEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getView_Context() {
        return (EAttribute) viewEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getView_Definition() {
        return (EAttribute) viewEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getView_Id() {
        return (EAttribute) viewEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getView_SourceConnector() {
        return (EAttribute) viewEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getView_TargetConnector() {
        return (EAttribute) viewEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDefinitionType() {
        return definitionTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSourceConnectorType() {
        return sourceConnectorTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTargetConnectorType() {
        return targetConnectorTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIFactory getDIFactory() {
        return (DIFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        bendpointEClass = createEClass(BENDPOINT);
        createEAttribute(bendpointEClass, BENDPOINT__SOURCE_X);
        createEAttribute(bendpointEClass, BENDPOINT__SOURCE_Y);
        createEAttribute(bendpointEClass, BENDPOINT__TARGET_X);
        createEAttribute(bendpointEClass, BENDPOINT__TARGET_Y);

        connectorEClass = createEClass(CONNECTOR);
        createEReference(connectorEClass, CONNECTOR__BENDPOINT);
        createEAttribute(connectorEClass, CONNECTOR__SOURCE);
        createEAttribute(connectorEClass, CONNECTOR__TARGET);

        diagramEClass = createEClass(DIAGRAM);
        createEReference(diagramEClass, DIAGRAM__CONNECTOR);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BENDPOINT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__VIEW);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__NODE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE);

        nodeEClass = createEClass(NODE);

        styleEClass = createEClass(STYLE);
        createEAttribute(styleEClass, STYLE__NAME);
        createEAttribute(styleEClass, STYLE__VALUE);

        viewEClass = createEClass(VIEW);
        createEReference(viewEClass, VIEW__STYLE);
        createEReference(viewEClass, VIEW__CHILD);
        createEAttribute(viewEClass, VIEW__CONTEXT);
        createEAttribute(viewEClass, VIEW__DEFINITION);
        createEAttribute(viewEClass, VIEW__ID);
        createEAttribute(viewEClass, VIEW__SOURCE_CONNECTOR);
        createEAttribute(viewEClass, VIEW__TARGET_CONNECTOR);

        // Create data types
        definitionTypeEDataType = createEDataType(DEFINITION_TYPE);
        sourceConnectorTypeEDataType = createEDataType(SOURCE_CONNECTOR_TYPE);
        targetConnectorTypeEDataType = createEDataType(TARGET_CONNECTOR_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
                .getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        connectorEClass.getESuperTypes().add(this.getView());
        diagramEClass.getESuperTypes().add(this.getView());
        nodeEClass.getESuperTypes().add(this.getView());

        // Initialize classes and features; add operations and parameters
        initEClass(
                bendpointEClass,
                Bendpoint.class,
                "Bendpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(
                getBendpoint_SourceX(),
                theXMLTypePackage.getInt(),
                "sourceX", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getBendpoint_SourceY(),
                theXMLTypePackage.getInt(),
                "sourceY", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getBendpoint_TargetX(),
                theXMLTypePackage.getInt(),
                "targetX", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getBendpoint_TargetY(),
                theXMLTypePackage.getInt(),
                "targetY", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(
                connectorEClass,
                Connector.class,
                "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEReference(
                getConnector_Bendpoint(),
                this.getBendpoint(),
                null,
                "bendpoint", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getConnector_Source(),
                theXMLTypePackage.getAnyURI(),
                "source", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getConnector_Target(),
                theXMLTypePackage.getAnyURI(),
                "target", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(
                diagramEClass,
                Diagram.class,
                "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEReference(
                getDiagram_Connector(),
                this.getConnector(),
                null,
                "connector", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(
                documentRootEClass,
                DocumentRoot.class,
                "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(
                getDocumentRoot_Mixed(),
                ecorePackage.getEFeatureMapEntry(),
                "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_XMLNSPrefixMap(),
                ecorePackage.getEStringToStringMapEntry(),
                null,
                "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_XSISchemaLocation(),
                ecorePackage.getEStringToStringMapEntry(),
                null,
                "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_Bendpoint(),
                this.getBendpoint(),
                null,
                "bendpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_Connector(),
                this.getConnector(),
                null,
                "connector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_View(),
                this.getView(),
                null,
                "view", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_Diagram(),
                this.getDiagram(),
                null,
                "diagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_Node(),
                this.getNode(),
                null,
                "node", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getDocumentRoot_Style(),
                this.getStyle(),
                null,
                "style", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(
                nodeEClass,
                Node.class,
                "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

        initEClass(
                styleEClass,
                Style.class,
                "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEAttribute(
                getStyle_Name(),
                theXMLTypePackage.getNCName(),
                "name", null, 1, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getStyle_Value(),
                theXMLTypePackage.getString(),
                "value", null, 1, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        initEClass(viewEClass, View.class,
                "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEReference(
                getView_Style(),
                this.getStyle(),
                null,
                "style", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEReference(
                getView_Child(),
                this.getNode(),
                null,
                "child", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getView_Context(),
                theXMLTypePackage.getAnyURI(),
                "context", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getView_Definition(),
                this.getDefinitionType(),
                "definition", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getView_Id(),
                theXMLTypePackage.getNCName(),
                "id", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getView_SourceConnector(),
                this.getSourceConnectorType(),
                "sourceConnector", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
        initEAttribute(
                getView_TargetConnector(),
                this.getTargetConnectorType(),
                "targetConnector", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

        // Initialize data types
        initEDataType(definitionTypeEDataType, List.class,
                "DefinitionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEDataType(
                sourceConnectorTypeEDataType,
                List.class,
                "SourceConnectorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
        initEDataType(
                targetConnectorTypeEDataType,
                List.class,
                "TargetConnectorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$		
        addAnnotation(bendpointEClass, source, new String[] {
                "name", "Bendpoint", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getBendpoint_SourceX(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "sourceX" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getBendpoint_SourceY(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "sourceY" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getBendpoint_TargetX(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "targetX" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getBendpoint_TargetY(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "targetY" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(connectorEClass, source, new String[] {
                "name", "Connector", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getConnector_Bendpoint(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "bendpoint", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getConnector_Source(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "source" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getConnector_Target(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "target" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(definitionTypeEDataType, source, new String[] {
                "name", "definition_._type", //$NON-NLS-1$ //$NON-NLS-2$
                "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(diagramEClass, source, new String[] { "name", "Diagram", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDiagram_Connector(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "connector", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(documentRootEClass, source, new String[] { "name", "", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "mixed" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_Mixed(), source, new String[] {
                "kind", "elementWildcard", //$NON-NLS-1$ //$NON-NLS-2$
                "name", ":mixed" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "xmlns:prefix" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
                new String[] { "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                        "name", "xsi:schemaLocation" //$NON-NLS-1$ //$NON-NLS-2$
                });
        addAnnotation(getDocumentRoot_Bendpoint(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "bendpoint", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_Connector(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "connector", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace", //$NON-NLS-1$ //$NON-NLS-2$
                "affiliation", "view" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_View(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "view", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_Diagram(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "diagram", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace", //$NON-NLS-1$ //$NON-NLS-2$
                "affiliation", "view" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_Node(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "node", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace", //$NON-NLS-1$ //$NON-NLS-2$
                "affiliation", "view" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getDocumentRoot_Style(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "style", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(nodeEClass, source, new String[] { "name", "Node", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(sourceConnectorTypeEDataType, source, new String[] {
                "name", "sourceConnector_._type", //$NON-NLS-1$ //$NON-NLS-2$
                "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(styleEClass, source, new String[] { "name", "Style", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getStyle_Name(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "name" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getStyle_Value(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "value" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(targetConnectorTypeEDataType, source, new String[] {
                "name", "targetConnector_._type", //$NON-NLS-1$ //$NON-NLS-2$
                "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(viewEClass, source, new String[] { "name", "View", //$NON-NLS-1$ //$NON-NLS-2$
                "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_Style(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "style", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_Child(), source, new String[] {
                "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "child", //$NON-NLS-1$ //$NON-NLS-2$
                "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_Context(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "context" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_Definition(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "definition" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_Id(), source, new String[] { "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "id" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_SourceConnector(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "sourceConnector" //$NON-NLS-1$ //$NON-NLS-2$
        });
        addAnnotation(getView_TargetConnector(), source, new String[] {
                "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
                "name", "targetConnector" //$NON-NLS-1$ //$NON-NLS-2$
        });
    }

} //DIPackageImpl
